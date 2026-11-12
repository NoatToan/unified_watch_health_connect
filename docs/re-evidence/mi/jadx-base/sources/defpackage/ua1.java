package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class ua1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hfl f35556a = j5l.d(new a());

    public static class a implements Callable<hfl> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hfl call() throws Exception {
            return b.f35557a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final hfl f35557a = new rkb(new Handler(Looper.getMainLooper()), false);
    }

    public static hfl a(Looper looper) {
        return b(looper, false);
    }

    @SuppressLint({"NewApi"})
    public static hfl b(Looper looper, boolean z) {
        if (looper != null) {
            return new rkb(new Handler(looper), z);
        }
        throw new NullPointerException("looper == null");
    }

    public static hfl c() {
        return j5l.e(f35556a);
    }
}
