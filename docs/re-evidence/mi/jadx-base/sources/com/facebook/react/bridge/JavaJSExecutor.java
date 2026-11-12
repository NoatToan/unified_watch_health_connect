package com.facebook.react.bridge;

import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public interface JavaJSExecutor {

    public interface Factory {
        JavaJSExecutor create() throws Exception;
    }

    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }

    void close();

    @v07
    String executeJSCall(String str, String str2) throws ProxyExecutorException;

    @v07
    void loadApplicationScript(String str) throws ProxyExecutorException;

    @v07
    void setGlobalVariable(String str, String str2);
}
