package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.ITrackDataForDeveloper;
import com.huawei.health.ITrackManagerForDeveloper;
import com.huawei.hihealth.CharacteristicConstant;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class lbg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39801b = SecurityConstant.f5920a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f39802c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ICommonCallback f39803a;
    private IBinder d;
    private ITrackManagerForDeveloper e;
    private boolean f;
    private IBinder.DeathRecipient g;
    private ArrayList<ITrackDataForDeveloper> h;
    private ExecutorService i;

    private lbg() {
        this.h = new ArrayList<>();
        this.f = false;
        LogUtil.a("KitSportApi", "HiHealthKitAPI construct");
        this.i = Executors.newSingleThreadExecutor();
        this.g = new IBinder.DeathRecipient() { // from class: lbg.5
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                ReleaseLogUtil.d("R_KitSportApi", "setBinder(null)");
                lbg.this.e((IBinder) null);
            }
        };
    }

    static class a {
        private static final lbg d = new lbg();
    }

    public static lbg b(Context context) {
        LogUtil.a("KitSportApi", "HiHealthKitAPI getInstance");
        f39802c = context;
        return a.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return this.e == null;
    }

    public void e(final IBinder iBinder) {
        this.i.execute(new Runnable() { // from class: lbg.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.d("KitSportApi", "setBinder enter, mApiAidl = ", iBinder);
                if (lbg.this.d != null) {
                    lbg.this.d.unlinkToDeath(lbg.this.g, 0);
                }
                IBinder iBinder2 = iBinder;
                if (iBinder2 != null) {
                    try {
                        iBinder2.linkToDeath(lbg.this.g, 0);
                    } catch (RemoteException e) {
                        ReleaseLogUtil.a("R_KitSportApi", "linkToDeath RemoteException = ", e.getMessage());
                    }
                    lbg.this.d = iBinder;
                    lbg.this.e = ITrackManagerForDeveloper.Stub.asInterface(iBinder);
                    if (lbg.this.f39803a != null && !lbg.this.f) {
                        try {
                            lbg.this.f39803a.onResult(0, lcr.b(0));
                        } catch (RemoteException e2) {
                            ReleaseLogUtil.a("R_KitSportApi", "setBinder callback RemoteException: ", e2.getMessage());
                        }
                    }
                    int size = lbg.this.h.size();
                    LogUtil.a("KitSportApi", "setBinder listSize = ", Integer.valueOf(size));
                    if (size != 0) {
                        for (int i = 0; i < size; i++) {
                            lbg lbgVar = lbg.this;
                            lbgVar.c((ITrackDataForDeveloper) lbgVar.h.get(i), false);
                        }
                    }
                } else {
                    lbg.this.e = null;
                    lbg.this.d = null;
                    lbg.this.f39803a = null;
                    lbg.this.f = false;
                }
                LogUtil.d("KitSportApi", "mApiAidl = ", lbg.this.e);
            }
        });
    }

    public void e(ITrackDataForDeveloper iTrackDataForDeveloper) {
        if (iTrackDataForDeveloper != null) {
            c(iTrackDataForDeveloper, c());
        } else {
            ReleaseLogUtil.e("R_KitSportApi", "registerRealTimeSportCallback callback is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final ITrackDataForDeveloper iTrackDataForDeveloper, final boolean z) {
        this.i.execute(new Runnable() { // from class: lbg.2
            @Override // java.lang.Runnable
            public void run() {
                if (!lbg.this.h.contains(iTrackDataForDeveloper)) {
                    lbg.this.h.add(iTrackDataForDeveloper);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    if (!z) {
                        lbg.this.e.registerRealtimeSportCallback(iTrackDataForDeveloper);
                        LogUtil.a("KitSportApi", "registerRealTimeSportCallback cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    } else {
                        ReleaseLogUtil.a("R_KitSportApi", "registerCallback AIDL isNull");
                    }
                } catch (RemoteException e) {
                    ReleaseLogUtil.a("R_KitSportApi", "registerRealTimeSportCallback remoteException = ", e.getMessage());
                } catch (Exception unused) {
                    ReleaseLogUtil.a("R_KitSportApi", "registerRealTimeSportCallback exception");
                }
            }
        });
    }

    public void d(final ITrackDataForDeveloper iTrackDataForDeveloper, final ICommonCallback iCommonCallback) {
        if (iTrackDataForDeveloper != null && iCommonCallback != null) {
            LogUtil.a("KitSportApi", "unregisterRealTimeSportCallback setBinder listSize = ", Integer.valueOf(this.h.size()));
            this.i.execute(new Runnable() { // from class: lbg.9
                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    boolean zRemove = lbg.this.h.remove(iTrackDataForDeveloper);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        if (!lbg.this.c()) {
                            int i2 = !lbg.this.e.unregisterRealtimeSportCallback(iTrackDataForDeveloper) ? 1 : 0;
                            try {
                                LogUtil.a("KitSportApi", "unregisterRealTimeSportCallback cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            } catch (RemoteException e) {
                                i = i2;
                                e = e;
                                ReleaseLogUtil.a("R_KitSportApi", "unregisterRealTimeSportCallback remoteException = ", e.getMessage());
                                i2 = i;
                            } catch (Exception e2) {
                                i = i2;
                                e = e2;
                                ReleaseLogUtil.a("R_KitSportApi", "unregisterRealTimeSportCallback exception: ", e.getMessage());
                                i2 = i;
                            }
                            try {
                                LogUtil.a("KitSportApi", "result= ", Integer.valueOf(i2));
                                iCommonCallback.onResult(i2, null);
                                return;
                            } catch (RemoteException e3) {
                                ReleaseLogUtil.a("R_KitSportApi", "unregisterRealTimeSportCallback RemoteException: ", e3.getMessage());
                                return;
                            }
                        }
                        ReleaseLogUtil.a("R_KitSportApi", "unregisster mApiAidl == null");
                        if (zRemove) {
                            iCommonCallback.onResult(0, null);
                        } else {
                            iCommonCallback.onResult(1, null);
                        }
                    } catch (RemoteException e4) {
                        e = e4;
                        i = 1;
                    } catch (Exception e5) {
                        e = e5;
                        i = 1;
                    }
                }
            });
            return;
        }
        ReleaseLogUtil.a("R_KitSportApi", "unregisterRealTimeSportCallback input illegal");
        if (iCommonCallback != null) {
            try {
                LogUtil.a("KitSportApi", "callback == null,result= ", 0);
                iCommonCallback.onResult(0, null);
            } catch (RemoteException e) {
                ReleaseLogUtil.a("R_KitSportApi", "unregisterRealTimeSportCallback RemoteException: ", e.getMessage());
            }
        }
    }

    public void a(final int i, final IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("R_KitSportApi", "enter start Sport");
        this.i.execute(new Runnable() { // from class: lbg.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (lbg.this.e != null) {
                        lbg.this.e.startSport(i, iBaseCommonCallback);
                        return;
                    }
                    lbg.this.f39803a = new ICommonCallback.Stub() { // from class: lbg.6.1
                        @Override // com.huawei.hihealth.ICommonCallback
                        public void onResult(int i2, String str) throws RemoteException {
                            lbg.this.e.startSport(i, iBaseCommonCallback);
                            lbg.this.f = true;
                        }
                    };
                    lbg.this.a(iBaseCommonCallback);
                } catch (Exception e) {
                    ReleaseLogUtil.a("R_KitSportApi", "startSport unknown Exception: ", e.getMessage());
                    lbg.this.e(iBaseCommonCallback, 4, lcr.b(4));
                }
            }
        });
    }

    public void c(final StartSportParam startSportParam, final IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("R_KitSportApi", "enter startSportEnhance");
        if (startSportParam.getInt("isBackground") == CharacteristicConstant.SportModeType.FOREGROUND_SPORT_MODE.getType()) {
            String strD = lkf.d(f39802c);
            LogUtil.a("KitSportApi", "startSportEnhance callingPackageName:" + strD);
            if (!"com.huawei.health".equals(strD) && !BaseApplication.APP_PACKAGE_GOOGLE_HEALTH.equals(strD)) {
                startSportParam.putBoolean("ExitApp", true);
                ReleaseLogUtil.d("R_KitSportApi", "startSportEnhance KEY_EXIT_APP: true");
            }
        }
        this.i.execute(new Runnable() { // from class: lbg.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (lbg.this.e != null) {
                        lbg.this.e.startSportEnhance(startSportParam, iBaseCommonCallback);
                        return;
                    }
                    lbg.this.f39803a = new ICommonCallback.Stub() { // from class: lbg.8.5
                        @Override // com.huawei.hihealth.ICommonCallback
                        public void onResult(int i, String str) throws RemoteException {
                            lbg.this.e.startSportEnhance(startSportParam, iBaseCommonCallback);
                            lbg.this.f = true;
                        }
                    };
                    lbg.this.a(iBaseCommonCallback);
                } catch (Exception e) {
                    ReleaseLogUtil.d("R_KitSportApi", "startSportEnhance unknown Exception: ", e.getMessage());
                    lbg.this.e(iBaseCommonCallback, 4, lcr.b(4));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IBaseCommonCallback iBaseCommonCallback) {
        Context context = f39802c;
        if (context == null) {
            ReleaseLogUtil.e("R_KitSportApi", "sendStartSportBroadcast context is null");
            e(iBaseCommonCallback, 4, lcr.b(4));
            return;
        }
        String packageName = context.getPackageName();
        LogUtil.a("KitSportApi", "sendBroadcast() ", " action == ", "com.huawei.health.track.broadcast");
        Intent intent = new Intent();
        intent.setPackage(packageName);
        intent.setAction("com.huawei.health.track.broadcast");
        intent.putExtra("command_type", "com.huawei.health.background.start.sport");
        f39802c.sendBroadcast(intent, f39801b);
    }

    public void d(final IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("R_KitSportApi", "enter stop Sport");
        this.i.execute(new Runnable() { // from class: lbg.10
            @Override // java.lang.Runnable
            public void run() {
                if (lbg.this.e != null) {
                    try {
                        lbg.this.e.stopSport(iBaseCommonCallback);
                        return;
                    } catch (Exception e) {
                        ReleaseLogUtil.e("R_KitSportApi", "stopSport aidl Exception: ", e.getMessage());
                        lbg.this.e(iBaseCommonCallback, 4, lcr.b(4));
                        return;
                    }
                }
                lbg.this.f39803a = new ICommonCallback.Stub() { // from class: lbg.10.1
                    @Override // com.huawei.hihealth.ICommonCallback
                    public void onResult(int i, String str) throws RemoteException {
                        lbg.this.e.stopSport(iBaseCommonCallback);
                        lbg.this.f = true;
                    }
                };
                lbg.this.a(iBaseCommonCallback);
            }
        });
    }

    public void c(final IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("R_KitSportApi", "enter pause Sport");
        this.i.execute(new Runnable() { // from class: lbg.7
            @Override // java.lang.Runnable
            public void run() {
                if (lbg.this.e != null) {
                    try {
                        lbg.this.e.pauseSport(iBaseCommonCallback);
                        return;
                    } catch (Exception e) {
                        ReleaseLogUtil.e("R_KitSportApi", "pauseSport Exception: ", e.getMessage());
                        lbg.this.e(iBaseCommonCallback, 4, lcr.b(4));
                        return;
                    }
                }
                ReleaseLogUtil.e("R_KitSportApi", "pauseSport aidl is null");
                lbg.this.e(iBaseCommonCallback, 1, lcr.b(1));
            }
        });
    }

    public void b(final IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("R_KitSportApi", "enter resume Sport");
        this.i.execute(new Runnable() { // from class: lbg.12
            @Override // java.lang.Runnable
            public void run() {
                if (lbg.this.e != null) {
                    try {
                        lbg.this.e.resumeSport(iBaseCommonCallback);
                        return;
                    } catch (Exception e) {
                        ReleaseLogUtil.e("R_KitSportApi", "resumeSport Exception: ", e.getMessage());
                        lbg.this.e(iBaseCommonCallback, 4, lcr.b(4));
                        return;
                    }
                }
                ReleaseLogUtil.e("R_KitSportApi", "resumeSport aidl is null");
                lbg.this.e(iBaseCommonCallback, 1, lcr.b(1));
            }
        });
    }

    public void d(final String str, final IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("KitSportApi", "enter sendDeviceControlinstruction");
        this.i.execute(new Runnable() { // from class: lbg.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (lbg.this.e != null) {
                        lbg.this.e.sendDeviceControlinstruction(str, iBaseCommonCallback);
                    } else {
                        ReleaseLogUtil.e("R_KitSportApi", "sendDeviceControlinstructionaidl is null");
                        lbg.this.e(iBaseCommonCallback, 4, lcr.b(4));
                    }
                } catch (Exception e) {
                    ReleaseLogUtil.e("R_KitSportApi", "sendDeviceControlinstruction unknown Exception: ", e.getMessage());
                    lbg.this.e(iBaseCommonCallback, 4, lcr.b(4));
                }
            }
        });
    }

    public void b(final int i, final IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("R_KitSportApi", "enter connectSportDevice");
        this.i.execute(new Runnable() { // from class: lbg.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (lbg.this.e != null) {
                        lbg.this.e.connectSportDevice(i, iBaseCommonCallback);
                        return;
                    }
                    lbg.this.f39803a = new ICommonCallback.Stub() { // from class: lbg.3.3
                        @Override // com.huawei.hihealth.ICommonCallback
                        public void onResult(int i2, String str) throws RemoteException {
                            ReleaseLogUtil.d("R_KitSportApi", "connectSportDevice code = ", Integer.valueOf(i2), ", message = ", str);
                            lbg.this.e.connectSportDevice(i, iBaseCommonCallback);
                            lbg.this.f = true;
                        }
                    };
                    lbg.this.a(iBaseCommonCallback);
                } catch (Exception e) {
                    ReleaseLogUtil.e("R_KitSportApi", "connectSportDevice unknown Exception: ", e.getMessage());
                    lbg.this.e(iBaseCommonCallback, 4, lcr.b(4));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(IBaseCommonCallback iBaseCommonCallback, int i, String str) {
        if (iBaseCommonCallback != null) {
            try {
                iBaseCommonCallback.onResponse(i, str);
            } catch (RemoteException e) {
                ReleaseLogUtil.d("R_KitSportApi", "notifyCallback RemoteException: ", e.getMessage());
            }
        }
    }
}
