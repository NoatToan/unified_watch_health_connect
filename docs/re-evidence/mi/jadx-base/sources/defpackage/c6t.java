package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class c6t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference<z5t> f5001a;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f5003b;

        public a(String str, Context context) {
            this.f5002a = str;
            this.f5003b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (c6t.class) {
                try {
                    String strB = m0t.b(p0t.n(this.f5002a));
                    z5t z5tVarE = h6t.e(c6t.f5001a);
                    h6t.f(this.f5003b, z5tVarE, k2t.g, 50, 102400, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
                    if (z5tVarE.e == null) {
                        z5tVarE.e = new l4t(new o4t(new n4t()));
                    }
                    b6t.b(strB, p0t.n(" \"timestamp\":\"" + p0t.c(System.currentTimeMillis(), "yyyyMMdd HH:mm:ss") + "\",\"details\":" + this.f5002a), z5tVarE);
                } catch (Throwable th) {
                    m2t.r(th, "mam", "ap");
                }
            }
        }
    }

    public static void a(String str, Context context) {
        m2t.s().submit(new a(str, context));
    }
}
