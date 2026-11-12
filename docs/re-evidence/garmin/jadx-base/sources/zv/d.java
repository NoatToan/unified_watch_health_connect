package zv;

import android.content.Context;
import android.os.RemoteException;
import bs2.id;
import bs2.q00;
import c22.u1;
import com.google.common.primitives.UnsignedBytes;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static d f207139f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q00 f207140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q00 f207141b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f207142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference<Context> f207143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public id f207144e;

    private d(Context context, long j8) {
        this.f207143d = new WeakReference<>(context);
        this.f207142c = j8;
    }

    public static d a(Context context, long j8) {
        d dVar = f207139f;
        if (dVar == null) {
            f207139f = new d(context, j8);
        } else {
            dVar.f207142c = j8;
            dVar.f207143d = new WeakReference<>(context);
        }
        return f207139f;
    }

    public static void b() {
        xv.b bVar = new xv.b();
        oi2.a.f132270a.getClass();
        l73.c.b().e(bVar);
    }

    public final void c(String str, byte b14) {
        try {
            hk0.d.h().g(u1.a(this.f207142c), 25, str, "settings.fit", UnsignedBytes.MAX_POWER_OF_TWO, b14, 0L, new c(this));
        } catch (RemoteException unused) {
            xv.d dVar = new xv.d(4, 647);
            oi2.a.f132270a.getClass();
            l73.c.b().e(dVar);
            b();
        }
    }
}
