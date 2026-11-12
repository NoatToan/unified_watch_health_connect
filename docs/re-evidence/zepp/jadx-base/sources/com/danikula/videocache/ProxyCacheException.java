package com.danikula.videocache;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyCacheException extends Exception {
    private static final String a = ". Version: 2.7.1";

    public ProxyCacheException(String str) {
        super(str + a);
    }

    public ProxyCacheException(String str, Throwable th) {
        super(str + a, th);
    }

    public ProxyCacheException(Throwable th) {
        super("No explanation error. Version: 2.7.1", th);
    }
}
