package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.q;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8899a = new a();

    public class a implements c {
        @Override // androidx.media3.exoplayer.drm.c
        public final int a(q qVar) {
            return qVar.f8390r != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.c
        public final DrmSession b(androidx.media3.exoplayer.drm.b.a aVar, q qVar) {
            if (qVar.f8390r == null) {
                return null;
            }
            return new f(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // androidx.media3.exoplayer.drm.c
        public final void d(Looper looper, ja.q qVar) {
        }
    }

    public interface b {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final kg.f f8900s = new kg.f(21);

        void release();
    }

    int a(q qVar);

    DrmSession b(androidx.media3.exoplayer.drm.b.a aVar, q qVar);

    default b c(androidx.media3.exoplayer.drm.b.a aVar, q qVar) {
        return b.f8900s;
    }

    void d(Looper looper, ja.q qVar);

    default void prepare() {
    }

    default void release() {
    }
}
