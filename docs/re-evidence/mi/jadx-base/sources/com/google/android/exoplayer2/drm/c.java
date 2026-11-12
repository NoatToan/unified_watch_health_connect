package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.c;
import defpackage.obq;
import defpackage.oh8;

/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final c f7897b;

    public class a implements c {
        @Override // com.google.android.exoplayer2.drm.c
        public DrmSession a(Looper looper, com.google.android.exoplayer2.drm.b.a aVar, Format format) {
            if (format.o == null) {
                return null;
            }
            return new e(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
        }

        @Override // com.google.android.exoplayer2.drm.c
        public Class<obq> c(Format format) {
            if (format.o != null) {
                return obq.class;
            }
            return null;
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7898a = new b() { // from class: x57
            @Override // com.google.android.exoplayer2.drm.c.b
            public final void release() {
                c.b.a();
            }
        };

        static /* synthetic */ void a() {
        }

        void release();
    }

    static {
        a aVar = new a();
        f7896a = aVar;
        f7897b = aVar;
    }

    DrmSession a(Looper looper, com.google.android.exoplayer2.drm.b.a aVar, Format format);

    default b b(Looper looper, com.google.android.exoplayer2.drm.b.a aVar, Format format) {
        return b.f7898a;
    }

    Class<? extends oh8> c(Format format);

    default void prepare() {
    }

    default void release() {
    }
}
