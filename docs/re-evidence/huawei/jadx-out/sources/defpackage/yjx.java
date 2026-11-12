package defpackage;

import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import com.huawei.wearengine.notify.NotificationParcel;
import com.huawei.wearengine.notify.NotifySendCallback;
import health.compact.a.CommonUtil;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yjx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f53537b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f53538c;
    private final Object e;

    static class b {
        private static final yjx d = new yjx();
    }

    private yjx() {
        this.e = new Object();
        this.f53538c = new e(100);
        LogUtil.a("NotificationHandlerManager", "enter NotificationHandlerManager");
    }

    public static yjx a() {
        return b.d;
    }

    public String e() {
        long jElapsedRealtime;
        synchronized (f53537b) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        return String.valueOf(jElapsedRealtime);
    }

    public void e(String str, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) {
        if (notifySendCallback == null) {
            LogUtil.d("NotificationHandlerManager", "registerNotificationListener callback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (notificationParcel == null) {
            LogUtil.d("NotificationHandlerManager", "registerNotificationListener notificationParcel is null");
            try {
                notifySendCallback.onError(null, 5);
            } catch (RemoteException unused) {
                LogUtil.c("NotificationHandlerManager", "generateErrorResult remoteException");
            } catch (Exception unused2) {
                LogUtil.c("NotificationHandlerManager", "registerNotificationListener onError has exception");
            }
            throw new IllegalStateException(String.valueOf(5));
        }
        LogUtil.a("NotificationHandlerManager", "registerNotificationListener callback ok");
        synchronized (this.e) {
            this.f53538c.put(str, new a(notifySendCallback, notificationParcel));
        }
    }

    public void d(byte[] bArr) {
        List<eew> listB = ykx.b(bArr);
        if (listB == null || listB.size() <= 0) {
            return;
        }
        String strD = "";
        int iA = -1;
        for (eew eewVar : listB) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 4) {
                strD = eeq.d(eewVar.b());
            } else if (iV == 9) {
                iA = ykx.a(eewVar);
            }
        }
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        synchronized (this.e) {
            b(strD, iA);
        }
    }

    private void b(String str, int i) {
        a aVar = this.f53538c.get(str);
        if (aVar == null) {
            LogUtil.a("NotificationHandlerManager", "notification {} has bean cleared.", str);
            return;
        }
        NotifySendCallback notifySendCallbackA = aVar.a();
        NotificationParcel notificationParcelC = aVar.c();
        try {
            try {
                if (ylf.b(i)) {
                    notifySendCallbackA.onError(notificationParcelC, ylf.d(i));
                } else {
                    notifySendCallbackA.onResult(notificationParcelC, i);
                }
                if (i != 0) {
                    this.f53538c.remove(str);
                }
            } catch (RemoteException unused) {
                LogUtil.c("NotificationHandlerManager", "handleNotifyCallback RemoteException");
                if (i == 0) {
                    return;
                }
                this.f53538c.remove(str);
            } catch (Exception unused2) {
                LogUtil.c("NotificationHandlerManager", "handleNotifyCallback notifySendCallback has exception");
                if (i != 0) {
                    this.f53538c.remove(str);
                }
            }
        } catch (Throwable th) {
            if (i != 0) {
                this.f53538c.remove(str);
            }
            throw th;
        }
    }

    static class e extends LruCache<String, a> {
        public e(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z, String str, a aVar, a aVar2) {
            if (!z || aVar == null) {
                return;
            }
            NotifySendCallback notifySendCallbackA = aVar.a();
            NotificationParcel notificationParcelC = aVar.c();
            if (notifySendCallbackA == null || notificationParcelC == null) {
                return;
            }
            try {
                notifySendCallbackA.onResult(notificationParcelC, 0);
            } catch (RemoteException unused) {
                LogUtil.c("NotificationHandlerManager", "handleNotifyCallback RemoteException");
            }
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        NotificationParcel f53539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        NotifySendCallback f53540b;

        public a(NotifySendCallback notifySendCallback, NotificationParcel notificationParcel) {
            this.f53540b = notifySendCallback;
            this.f53539a = notificationParcel;
        }

        public NotifySendCallback a() {
            return this.f53540b;
        }

        public NotificationParcel c() {
            return this.f53539a;
        }
    }
}
