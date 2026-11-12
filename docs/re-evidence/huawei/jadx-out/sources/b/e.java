package b;

import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b.e;
import com.huawei.android.os.ServiceManagerEx;
import defpackage.cr;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c.c f868a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f869b = false;

    public static c.c a() {
        c.c crVar;
        synchronized (e.class) {
            c.c cVar = f868a;
            if (cVar != null) {
                return cVar;
            }
            IBinder service = ServiceManagerEx.getService("hwservicebusmanager");
            a(service);
            int i = c.b.f1383a;
            if (service == null) {
                crVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface("com.huawei.systemserver.servicebus.DefAccessInterface");
                crVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c.c)) ? new cr(service) : (c.c) iInterfaceQueryLocalInterface;
            }
            f868a = crVar;
            Log.d("DefKitLib_Helper", "def access service binder: " + service);
            if (!f869b) {
                Handler handler = new Handler(Looper.getMainLooper());
                a.e = handler;
                com.huawei.harmonyos.interwork.abilitykit.a.f6099a = handler;
                f869b = true;
            }
            return f868a;
        }
    }

    public static /* synthetic */ void b() {
        Log.w("DefKitLib_Helper", "DefAccessService died.");
        synchronized (e.class) {
            f868a = null;
        }
    }

    public static void a(IBinder iBinder) {
        if (iBinder == null) {
            Log.e("DefKitLib_Helper", "DefAccessService is null.");
            return;
        }
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: cu
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    e.b();
                }
            }, 0);
        } catch (RemoteException unused) {
            Log.e("DefKitLib_Helper", "Loader linkToDeath failed with RemoteException.");
        }
    }
}
