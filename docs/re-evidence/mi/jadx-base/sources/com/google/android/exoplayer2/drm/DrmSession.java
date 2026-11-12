package com.google.android.exoplayer2.drm;

import defpackage.oh8;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    static void d(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.f(null);
        }
        if (drmSession != null) {
            drmSession.a(null);
        }
    }

    void a(b.a aVar);

    default boolean b() {
        return false;
    }

    DrmSessionException c();

    Map<String, String> e();

    void f(b.a aVar);

    UUID g();

    int getState();

    oh8 h();
}
