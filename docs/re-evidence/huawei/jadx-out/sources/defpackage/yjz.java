package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.wearengine.NotifyManager;
import com.huawei.wearengine.WearEngineBinderClient;
import com.huawei.wearengine.WearEngineClientInner;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.notify.NotificationParcel;
import com.huawei.wearengine.notify.NotifySendCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes20.dex */
public class yjz implements NotifyManager, WearEngineBinderClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f53543a = new Object();
    private IBinder.DeathRecipient d = new IBinder.DeathRecipient() { // from class: yjz.2
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yis.b("NotifyServiceProxy", "binderDied enter");
            if (yjz.this.f53544c != null) {
                yjz.this.f53544c.asBinder().unlinkToDeath(yjz.this.d, 0);
                yjz.this.f53544c = null;
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NotifyManager f53544c = null;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    public yjz() {
        a();
    }

    private void b() throws RemoteException {
        synchronized (this.f53543a) {
            if (this.f53544c == null) {
                WearEngineClientInner.c().e();
                IBinder iBinderB = WearEngineClientInner.c().b(4);
                if (iBinderB == null) {
                    throw new yib(2);
                }
                NotifyManager notifyManagerAsInterface = NotifyManager.Stub.asInterface(iBinderB);
                this.f53544c = notifyManagerAsInterface;
                notifyManagerAsInterface.asBinder().linkToDeath(this.d, 0);
            }
        }
    }

    @Override // com.huawei.wearengine.NotifyManager
    public int notify(Device device, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) {
        try {
            b();
            if (this.f53544c == null) {
                return 6;
            }
            if (!ylk.d("notify_notify")) {
                yis.c("NotifyServiceProxy", "notify Health version is low");
                throw new yib(14);
            }
            return this.f53544c.notify(device, notificationParcel, notifySendCallback);
        } catch (RemoteException unused) {
            yis.c("NotifyServiceProxy", "notify RemoteException");
            return 12;
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.WearEngineBinderClient
    public void clearBinderProxy() {
        this.f53544c = null;
        yis.b("NotifyServiceProxy", "clearBinderProxy");
    }

    private void a() {
        WearEngineClientInner.c().a(new yhv(new WeakReference(this)));
    }
}
