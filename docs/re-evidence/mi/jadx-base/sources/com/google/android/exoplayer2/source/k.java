package com.google.android.exoplayer2.source;

import android.os.Handler;
import defpackage.fxp;
import defpackage.njf;
import defpackage.r61;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface k {

    public static final class a extends njf {
        public a(Object obj) {
            super(obj);
        }

        public a c(Object obj) {
            return new a(super.a(obj));
        }

        public a(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public a(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public a(njf njfVar) {
            super(njfVar);
        }
    }

    public interface b {
        void a(k kVar, com.google.android.exoplayer2.v vVar);
    }

    void a(b bVar);

    void b(l lVar);

    com.google.android.exoplayer2.m c();

    j d(a aVar, r61 r61Var, long j);

    void e(b bVar, fxp fxpVar);

    void f() throws IOException;

    default com.google.android.exoplayer2.v g() {
        return null;
    }

    void i(Handler handler, l lVar);

    void j(j jVar);

    void k(b bVar);

    void l(b bVar);

    void n(Handler handler, com.google.android.exoplayer2.drm.b bVar);

    void p(com.google.android.exoplayer2.drm.b bVar);

    default boolean r() {
        return true;
    }
}
