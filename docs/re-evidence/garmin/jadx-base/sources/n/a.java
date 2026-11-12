package n;

import android.os.Handler;
import android.os.Looper;
import bv2.g;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f122010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f122011c = new g(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f122012d = new g(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f122013a = new b();

    private a() {
    }

    public static a a() {
        if (f122010b != null) {
            return f122010b;
        }
        synchronized (a.class) {
            try {
                if (f122010b == null) {
                    f122010b = new a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f122010b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f122013a;
        if (bVar.f122016c == null) {
            synchronized (bVar.f122014a) {
                try {
                    if (bVar.f122016c == null) {
                        bVar.f122016c = Handler.createAsync(Looper.getMainLooper());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        bVar.f122016c.post(runnable);
    }
}
