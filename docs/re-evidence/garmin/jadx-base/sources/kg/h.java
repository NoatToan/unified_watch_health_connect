package kg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j20.x;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class h implements ig.a {

    public static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f104680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f104681b;

        public b() {
            this.f104680a = false;
            this.f104681b = new LinkedBlockingQueue<>();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f104681b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // ig.a
    public final String a(Context context) {
        IBinder iBinderPoll;
        xg.a c3551a;
        b bVar = new b();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, bVar, 1)) {
            try {
                if (bVar.f104680a) {
                    x.h();
                    iBinderPoll = null;
                } else {
                    bVar.f104680a = true;
                    iBinderPoll = bVar.f104681b.poll(5L, TimeUnit.SECONDS);
                }
                int i14 = xg.a.AbstractBinderC3550a.f190717a;
                if (iBinderPoll == null) {
                    c3551a = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderPoll.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                    c3551a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xg.a)) ? new xg.a.AbstractBinderC3550a.C3551a(iBinderPoll) : (xg.a) iInterfaceQueryLocalInterface;
                }
                return c3551a.a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }
}
