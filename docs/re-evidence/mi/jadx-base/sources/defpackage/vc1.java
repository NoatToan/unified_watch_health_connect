package defpackage;

import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes3.dex */
public class vc1 extends AnimationUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ThreadLocal<b> f36729a = new a();

    public class a extends ThreadLocal<b> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b initialValue() {
            return new b(null);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f36730a;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static long a() {
        b bVar = f36729a.get();
        long jNanoTime = System.nanoTime();
        bVar.f36730a = jNanoTime;
        return jNanoTime;
    }
}
