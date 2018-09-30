## Btrace test


### dependency 

```
git clone git@github.com:btraceio/btrace.git

cd btrace 

gradle clean build 

gradle publishToMavenLocal

```

### btrace run 

example: 

```

# jps -ml 

3902 com.intellij.idea.Main

# btrace 3902 HomeControllerBtrace.java

```

