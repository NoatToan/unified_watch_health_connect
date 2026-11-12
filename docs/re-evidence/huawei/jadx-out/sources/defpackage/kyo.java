package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.IHealthDataOpenInterface;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class kyo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f39630a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f39631c = SecurityConstant.f5920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICommonCallback f39632b;
    private IHealthDataOpenInterface d;
    private IBinder e;
    private boolean f;
    private IBinder.DeathRecipient h;
    private ExecutorService i;

    private kyo() {
        this.f = false;
        LogUtil.a("HlthDevApi", "HealthDeveloperApi construct");
        this.i = Executors.newSingleThreadExecutor();
        this.h = new IBinder.DeathRecipient() { // from class: kyo.3
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                ReleaseLogUtil.d("HiH_HlthDevApi", "binderDied setBinder(null)");
                kyo.this.c((IBinder) null);
            }
        };
    }

    static class d {
        private static final kyo d = new kyo();
    }

    public static kyo b(Context context) {
        LogUtil.a("HlthDevApi", "HealthDeveloperApi getInstance");
        f39630a = context;
        return d.d;
    }

    public void c(final IBinder iBinder) {
        this.i.execute(new Runnable() { // from class: kyo.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.d("HlthDevApi", "setBinder enter, mApiAidl = ", iBinder);
                if (kyo.this.e != null) {
                    kyo.this.e.unlinkToDeath(kyo.this.h, 0);
                }
                IBinder iBinder2 = iBinder;
                if (iBinder2 != null) {
                    try {
                        iBinder2.linkToDeath(kyo.this.h, 0);
                    } catch (RemoteException e) {
                        ReleaseLogUtil.a("HiH_HlthDevApi", "setBinder RemoteException = ", e.getMessage());
                    }
                    kyo.this.e = iBinder;
                    kyo.this.d = IHealthDataOpenInterface.Stub.asInterface(iBinder);
                    if (kyo.this.f39632b != null && !kyo.this.f) {
                        try {
                            kyo.this.f39632b.onResult(0, lcr.b(0));
                        } catch (RemoteException e2) {
                            ReleaseLogUtil.a("HiH_HlthDevApi", "aidl callback remote Exception", LogAnonymous.b(e2));
                        }
                    }
                } else {
                    kyo.this.d = null;
                    kyo.this.e = null;
                    kyo.this.f39632b = null;
                    kyo.this.f = false;
                }
                LogUtil.d("HlthDevApi", "mApiAidl = ", kyo.this.d);
            }
        });
    }

    public void a(final long j, final long j2, final IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("HiH_HlthDevApi", "enter getHealthData");
        this.i.execute(new Runnable() { // from class: kyo.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (kyo.this.d != null) {
                        kyo.this.d.getHealthData(j, j2, iBaseCommonCallback);
                        return;
                    }
                    kyo.this.f39632b = new ICommonCallback.Stub() { // from class: kyo.5.5
                        @Override // com.huawei.hihealth.ICommonCallback
                        public void onResult(int i, String str) throws RemoteException {
                            kyo.this.d.getHealthData(j, j2, iBaseCommonCallback);
                            kyo.this.f = true;
                        }
                    };
                    kyo.this.e(iBaseCommonCallback);
                } catch (Exception e) {
                    ReleaseLogUtil.a("HiH_HlthDevApi", "getHealthData unknown Exception", LogAnonymous.b(e));
                    kyo.this.e(iBaseCommonCallback, 4, lcr.b(4));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(IBaseCommonCallback iBaseCommonCallback) {
        Context context = f39630a;
        if (context == null) {
            LogUtil.j("HlthDevApi", "context is null");
            e(iBaseCommonCallback, 4, lcr.b(4));
            return;
        }
        String packageName = context.getPackageName();
        LogUtil.a("HlthDevApi", "sendBroadcast() ", " action == ", "com.huawei.health.open.healthModel.broadcast");
        Intent intent = new Intent();
        intent.setPackage(packageName);
        intent.setAction("com.huawei.health.open.healthModel.broadcast");
        f39630a.sendBroadcast(intent, f39631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(IBaseCommonCallback iBaseCommonCallback, int i, String str) {
        if (iBaseCommonCallback != null) {
            try {
                iBaseCommonCallback.onResponse(i, str);
            } catch (RemoteException e) {
                ReleaseLogUtil.a("HiH_HlthDevApi", "notifyCallback RemoteException: ", e.getMessage());
            }
        }
    }
}
