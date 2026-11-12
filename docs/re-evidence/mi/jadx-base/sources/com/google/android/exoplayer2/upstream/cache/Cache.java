package com.google.android.exoplayer2.upstream.cache;

import defpackage.di4;
import defpackage.ei4;
import defpackage.i93;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th) {
            super(th);
        }

        public CacheException(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface a {
        void a(Cache cache, i93 i93Var, i93 i93Var2);

        void e(Cache cache, i93 i93Var);

        void f(Cache cache, i93 i93Var);
    }

    di4 a(String str);

    void b(i93 i93Var);

    i93 c(String str, long j, long j2) throws InterruptedException, CacheException;

    File d(String str, long j, long j2) throws CacheException;

    void e(i93 i93Var);

    i93 f(String str, long j, long j2) throws CacheException;

    void g(File file, long j) throws CacheException;

    void h(String str, ei4 ei4Var) throws CacheException;
}
