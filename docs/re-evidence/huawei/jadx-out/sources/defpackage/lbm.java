package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.HiAppInfo;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.IKitWearAIDL;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.IReadCallback;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hihealth.IWriteCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.datatypes.HeartDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearkit.IDetectCommonCallback;
import com.huawei.wearkit.IWearCommonCallback;
import com.huawei.wearkit.IWearReadCallback;
import com.huawei.wearkit.IWearWriteCallback;
import com.huawei.wearkit.model.HealthLogOption;
import health.compact.a.DeviceUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lbm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f39832c = new byte[0];
    private static Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder.DeathRecipient f39833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile IBinder f39834b;
    private volatile IKitWearAIDL e;
    private ExecutorService f;
    private volatile IWriteCallback g;

    /* synthetic */ lbm(AnonymousClass4 anonymousClass4) {
        this();
    }

    /* JADX INFO: renamed from: lbm$4, reason: invalid class name */
    class AnonymousClass4 implements IBinder.DeathRecipient {
        AnonymousClass4() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            ReleaseLogUtil.d("HiH_WearAPI", "AIDL binderDied.");
            lbm.this.b((IBinder) null);
            if (nzz.c()) {
                ReleaseLogUtil.d("HiH_WearAPI", "PhoneService needs to be started");
                lbm.this.f.execute(new Runnable() { // from class: lcl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.d();
                    }
                });
            }
        }

        /* synthetic */ void d() {
            lbm.this.e();
        }
    }

    static class a {
        private static final lbm e = new lbm(null);
    }

    private lbm() {
        this.g = null;
        this.f39833a = new AnonymousClass4();
        LogUtil.a("WearAPI", "HiHealthKitAPI construct");
        this.f = Executors.newSingleThreadExecutor();
    }

    public static lbm c(Context context) {
        LogUtil.a("WearAPI", "HiHealthKitAPI getInstance");
        d = context;
        return a.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        d(null);
    }

    private void d(String str) {
        if (this.e != null) {
            ReleaseLogUtil.a("HiH_WearAPI", "mApiAidl is not null");
            return;
        }
        if (!DeviceUtil.b() && TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("HiH_WearAPI", "no bind device");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package", str);
        LogUtil.a("WearAPI", "start to invoke phone service");
        DeviceUtil.d(d, false, bundle);
        for (int i = 0; i < 70; i++) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "InterruptedException occour");
            }
            if (this.e != null) {
                LogUtil.a("WearAPI", " mApiAidl not null ,check times:", Integer.valueOf(i));
                break;
            }
        }
        ReleaseLogUtil.d("HiH_WearAPI", "get phone service binder success");
    }

    public void a(final IRealTimeDataCallback iRealTimeDataCallback) {
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "getDeviceList:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lcf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39900b.b(iRealTimeDataCallback);
                }
            });
        }
    }

    /* synthetic */ void b(final IRealTimeDataCallback iRealTimeDataCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "getDeviceList:mApiAidl is null");
                iRealTimeDataCallback.onChange(0, "[]");
            } else {
                this.e.getDeviceList(new IBaseCommonCallback.Stub() { // from class: lbm.11
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "getDeviceList onResponse err_code:", Integer.valueOf(i));
                        iRealTimeDataCallback.onChange(i, str);
                    }
                });
                LogUtil.a("WearAPI", "getDeviceList cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_WearAPI", "getDeviceList Exception: ", e.getMessage());
            try {
                iRealTimeDataCallback.onResult(1);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "getDeviceList,RemoteException: ", e.getMessage());
            }
        }
    }

    public void f(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        ReleaseLogUtil.d("HiH_WearAPI", "sendDeviceCommand enter");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "sendDeviceCommand:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lci
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39907b.e(iRealTimeDataCallback, str);
                }
            });
        }
    }

    /* synthetic */ void e(final IRealTimeDataCallback iRealTimeDataCallback, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "sendDeviceCommand:mApiAidl is null");
                iRealTimeDataCallback.onResult(1);
            } else {
                this.e.sendDeviceCommand(str, new IBaseCommonCallback.Stub() { // from class: lbm.19
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str2) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "sendDeviceCommand onResponse err_code:", Integer.valueOf(i));
                        iRealTimeDataCallback.onChange(i, str2);
                    }
                });
                LogUtil.a("WearAPI", "sendDeviceCommand cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_WearAPI", "sendDeviceCommand Exception: ", e.getMessage());
            try {
                iRealTimeDataCallback.onResult(1);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "sendDeviceCommand,RemoteException: ", e.getMessage());
            }
        }
    }

    public void j(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "startReadingAtrial:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lbr
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(str, iRealTimeDataCallback);
                }
            });
        }
    }

    /* synthetic */ void a(String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "startReadingAtrial:mApiAidl is null");
                c(str, 1, iRealTimeDataCallback);
            } else {
                this.e.registerSingleAtrialCallback(new IBaseCommonCallback.Stub() { // from class: lbm.16
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str2) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "startReadingAtrial onResponse err_code:", Integer.valueOf(i));
                        iRealTimeDataCallback.onChange(i, str2);
                    }
                });
                LogUtil.a("WearAPI", "startReadingAtrial cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_WearAPI", "startReadingAtrial Exception: ", e.getMessage());
            try {
                iRealTimeDataCallback.onResult(1);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "startReadingAtrial,RemoteException: ", e.getMessage());
            }
        }
    }

    public void m(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "stopReadingAtrial:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lcj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39909b.e(str, iRealTimeDataCallback);
                }
            });
        }
    }

    /* synthetic */ void e(String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "stopReadingAtrial:mApiAidl is null");
                c(str, 1, iRealTimeDataCallback);
            } else {
                this.e.unRegisterSingleAtrialCallback(new IBaseCommonCallback.Stub() { // from class: lbm.21
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str2) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "stopReadingAtrial onResponse err_code:", Integer.valueOf(i));
                        iRealTimeDataCallback.onResult(i);
                    }
                });
                LogUtil.a("WearAPI", "stopReadingAtrial cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ReleaseLogUtil.e("HiH_WearAPI", "stopReadingAtrial Exception: ", e.getMessage());
            try {
                iRealTimeDataCallback.onResult(1);
            } catch (RemoteException e2) {
                ReleaseLogUtil.e("HiH_WearAPI", "stopReadingAtrial,RemoteException: ", e2.getMessage());
            }
        }
    }

    public void g(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        ReleaseLogUtil.d("HiH_WearAPI", "startReadingHeatRate enter");
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "startReadingHeatRate callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lbt
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(str, iRealTimeDataCallback);
                }
            });
        }
    }

    /* synthetic */ void b(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "startReadingHeatRate:mApiAidl is null");
                c(str, 1, iRealTimeDataCallback);
            } else {
                this.e.getDeviceList(new IBaseCommonCallback.Stub() { // from class: lbm.24
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str2) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "startReadingHeatRate getDeviceList onResponse errCode:", Integer.valueOf(i));
                        if (lbm.this.d(str, iRealTimeDataCallback, str2, "supportHeartRate")) {
                            lbm.this.e.getRealTimeData(str, 1, 1, new IBaseCommonCallback.Stub() { // from class: lbm.24.5
                                @Override // com.huawei.health.IBaseCommonCallback
                                public void onResponse(int i2, String str3) throws RemoteException {
                                    ReleaseLogUtil.d("HiH_WearAPI", "startReadingHeatRate onResponse errorCode:", Integer.valueOf(i2), ", reason: ", str3);
                                    lbm.this.b(i2, str3, iRealTimeDataCallback);
                                }
                            });
                        } else {
                            ReleaseLogUtil.e("HiH_WearAPI", "device not support real-heart-rate");
                        }
                    }
                });
                LogUtil.a("WearAPI", "startReadingHeatRate cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_WearAPI", "startReadingHeatRate Exception: ", e.getMessage());
            try {
                iRealTimeDataCallback.onResult(1);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "startReadingHeatRate,RemoteException: ", e.getMessage());
            }
        }
    }

    private void c(String str, int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        if (let.e(str, 4)) {
            iRealTimeDataCallback.onResult(150);
        } else {
            iRealTimeDataCallback.onResult(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str, IRealTimeDataCallback iRealTimeDataCallback) {
        if (iRealTimeDataCallback != null) {
            try {
                if (!"OpenOrClose state".equals(str) && str != null) {
                    if (new JSONObject(str).getInt("hr_info") == 255) {
                        iRealTimeDataCallback.onChange(5, lcr.b(5));
                        return;
                    } else {
                        iRealTimeDataCallback.onChange(i, str);
                        return;
                    }
                }
                iRealTimeDataCallback.onResult(i);
            } catch (RemoteException e) {
                ReleaseLogUtil.a("HiH_WearAPI", "notifyHeartRateChanged RemoteException = ", e.getMessage());
            } catch (JSONException e2) {
                ReleaseLogUtil.a("HiH_WearAPI", "notifyHeartRateChanged JSONException = ", e2.getMessage());
            }
        }
    }

    public void n(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "stopReadingHeartRate:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lbp
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(str, iRealTimeDataCallback);
                }
            });
        }
    }

    /* synthetic */ void d(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "stopReadingHeartRate:mApiAidl is null");
                c(str, 1, iRealTimeDataCallback);
            } else {
                this.e.getDeviceList(new IBaseCommonCallback.Stub() { // from class: lbm.23
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str2) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "stopReadingHeartRate getDeviceList onResponse errCode:", Integer.valueOf(i));
                        if (lbm.this.d(str, iRealTimeDataCallback, str2, "supportHeartRate")) {
                            lbm.this.e.getRealTimeData(str, 1, 2, new IBaseCommonCallback.Stub() { // from class: lbm.23.2
                                @Override // com.huawei.health.IBaseCommonCallback
                                public void onResponse(int i2, String str3) throws RemoteException {
                                    ReleaseLogUtil.d("HiH_WearAPI", "stopReadingHeartRate onResponse errorCode:", Integer.valueOf(i2));
                                    iRealTimeDataCallback.onResult(i2);
                                }
                            });
                        } else {
                            ReleaseLogUtil.e("HiH_WearAPI", "device not support real-heart-rate");
                        }
                    }
                });
                LogUtil.a("WearAPI", "stopReadingHeartRate cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ReleaseLogUtil.d("HiH_WearAPI", "stopReadingHeartRate Exception: ", e.getMessage());
            try {
                iRealTimeDataCallback.onResult(1);
            } catch (RemoteException e2) {
                ReleaseLogUtil.d("HiH_WearAPI", "stopReadingHeartRate , RemoteException: ", e2.getMessage());
            }
        }
    }

    public void i(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "startReadingRRI:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lbl
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(str, iRealTimeDataCallback);
                }
            });
        }
    }

    /* synthetic */ void c(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "startReadingRRI:mApiAidl is null");
                c(str, 1, iRealTimeDataCallback);
            } else {
                this.e.getDeviceList(new IBaseCommonCallback.Stub() { // from class: lbm.25
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str2) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "startReadingRRI getDeviceList onResponse errCode:", Integer.valueOf(i));
                        if (lbm.this.d(str, iRealTimeDataCallback, str2, "supportRRI")) {
                            lbm.this.e.getRealTimeData(str, 1, 3, new IBaseCommonCallback.Stub() { // from class: lbm.25.3
                                @Override // com.huawei.health.IBaseCommonCallback
                                public void onResponse(int i2, String str3) throws RemoteException {
                                    ReleaseLogUtil.d("HiH_WearAPI", "startReadingRRI onResponse errorCode:", Integer.valueOf(i2), ", reason: ", str3);
                                    if ("OpenOrClose state".equals(str3) || str3 == null) {
                                        iRealTimeDataCallback.onResult(i2);
                                    } else {
                                        iRealTimeDataCallback.onChange(i2, str3);
                                    }
                                }
                            });
                        } else {
                            ReleaseLogUtil.e("HiH_WearAPI", "device not support RRI");
                        }
                    }
                });
                LogUtil.a("WearAPI", "startReadingRRI cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_WearAPI", "startReadingRRI Exception: ", e.getMessage());
            try {
                iRealTimeDataCallback.onResult(1);
            } catch (RemoteException e2) {
                ReleaseLogUtil.a("HiH_WearAPI", "startReadingRRI , RemoteException: ", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str, IRealTimeDataCallback iRealTimeDataCallback, String str2, String str3) throws RemoteException {
        List list = (List) ((List) HiJsonUtil.d(str2, new TypeToken<List<HeartDeviceInfo>>() { // from class: com.huawei.hihealthservice.hihealthkit.WearAPI$9
        }.getType())).stream().filter(new Predicate() { // from class: lbq
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lbm.a((HeartDeviceInfo) obj);
            }
        }).collect(Collectors.toList());
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeviceCapability deviceCapability = (DeviceCapability) HiJsonUtil.d(((HeartDeviceInfo) it.next()).getDeviceCapability(), new TypeToken<DeviceCapability>() { // from class: com.huawei.hihealthservice.hihealthkit.WearAPI$10
                }.getType());
                if ("supportRRI".equals(str3) && deviceCapability.isSupportPressAutoMonitor()) {
                    return true;
                }
                if ("supportHeartRate".equals(str3) && deviceCapability.isSupportHeartRateInfo()) {
                    return true;
                }
            }
            LogUtil.j("WearAPI", "isSupportInvoked: device unsupported get real time data");
            iRealTimeDataCallback.onResult(5);
            return false;
        }
        LogUtil.j("WearAPI", "isSupportInvoked: device not connected");
        c(str, 5, iRealTimeDataCallback);
        return false;
    }

    static /* synthetic */ boolean a(HeartDeviceInfo heartDeviceInfo) {
        return heartDeviceInfo.getDeviceConnectState() == 2;
    }

    public void o(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        if (iRealTimeDataCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "stopReadingRRI:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lbz
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.h(str, iRealTimeDataCallback);
                }
            });
        }
    }

    /* synthetic */ void h(final String str, final IRealTimeDataCallback iRealTimeDataCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "stopReadingRRI:mApiAidl is null");
                c(str, 1, iRealTimeDataCallback);
            } else {
                this.e.getDeviceList(new IBaseCommonCallback.Stub() { // from class: lbm.1
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str2) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "stopReadingRRI getDeviceList onResponse errCode:", Integer.valueOf(i));
                        if (lbm.this.d(str, iRealTimeDataCallback, str2, "supportRRI")) {
                            lbm.this.e.getRealTimeData(str, 1, 4, new IBaseCommonCallback.Stub() { // from class: lbm.1.1
                                @Override // com.huawei.health.IBaseCommonCallback
                                public void onResponse(int i2, String str3) throws RemoteException {
                                    ReleaseLogUtil.d("HiH_WearAPI", "stopReadingRRI onResponse errorCode:", Integer.valueOf(i2));
                                    iRealTimeDataCallback.onResult(i2);
                                }
                            });
                        } else {
                            ReleaseLogUtil.e("HiH_WearAPI", "device not support RRI");
                        }
                    }
                });
                LogUtil.a("WearAPI", "stopReadingRRI cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_WearAPI", "stopReadingRRI Exception: ", e.getMessage());
            try {
                iRealTimeDataCallback.onResult(1);
            } catch (RemoteException unused) {
                ReleaseLogUtil.e("HiH_WearAPI", "stopReadingRRI , RemoteException: ", e.getMessage());
            }
        }
    }

    public void a(final String str, final String str2, final byte[] bArr, final String str3, final IWriteCallback iWriteCallback) {
        if (iWriteCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "writeToWear:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lcg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39902b.c(iWriteCallback, str, str2, bArr, str3);
                }
            });
        }
    }

    /* synthetic */ void c(final IWriteCallback iWriteCallback, String str, String str2, byte[] bArr, String str3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        if (this.e == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "writeToWear:mApiAidl is null");
            b(iWriteCallback, 1, lcr.b(1));
            return;
        }
        try {
            this.e.writeToWear(str, str2, bArr, str3, new IBaseCommonCallback.Stub() { // from class: lbm.3
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str4) throws RemoteException {
                    ReleaseLogUtil.d("HiH_WearAPI", "writeToWear onResponse err_code:", Integer.valueOf(i));
                    if (i == 200 && lbm.this.g == null) {
                        lbm.this.g = iWriteCallback;
                        LogUtil.a("WearAPI", "Put mWriteCallback.");
                    } else if (i == 0 || i == 1 || i == 1025) {
                        lbm.this.g = null;
                        LogUtil.a("WearAPI", "Remove mWriteCallback.");
                    } else {
                        LogUtil.a("WearAPI", "ErrorCode = ", Integer.valueOf(i), " no processing.");
                    }
                    iWriteCallback.onResult(i, str4);
                }
            });
            LogUtil.a("WearAPI", "writeToWear cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (RemoteException e) {
            ReleaseLogUtil.a("HiH_WearAPI", "writeToWear RemoteException: ", e.getMessage());
            this.g = null;
            b(iWriteCallback, 1, lcr.b(1));
        }
    }

    private void b(IWriteCallback iWriteCallback, int i, String str) {
        if (iWriteCallback != null) {
            try {
                iWriteCallback.onResult(i, str);
                return;
            } catch (RemoteException e) {
                ReleaseLogUtil.a("HiH_WearAPI", "notifyWriteCallback RemoteException: ", e.getMessage());
                return;
            }
        }
        LogUtil.j("WearAPI", "writeCallback is null.");
    }

    public void a(final String str, final String str2, final byte[] bArr, final String str3, final IWearWriteCallback iWearWriteCallback) {
        if (iWearWriteCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "writeToWear:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lcb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39891c.b(iWearWriteCallback, str, str2, bArr, str3);
                }
            });
        }
    }

    /* synthetic */ void b(final IWearWriteCallback iWearWriteCallback, String str, String str2, byte[] bArr, String str3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "writeToWear:mApiAidl is null");
                iWearWriteCallback.onResult(1, lcr.b(1));
            } else {
                this.e.writeToWear(str, str2, bArr, str3, new IBaseCommonCallback.Stub() { // from class: lbm.2
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str4) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "writeToWear onResponse err_code:", Integer.valueOf(i));
                        iWearWriteCallback.onResult(i, str4);
                    }
                });
                LogUtil.a("WearAPI", "writeToWear cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.a("HiH_WearAPI", "writeToWear RemoteException: ", e.getMessage());
            try {
                iWearWriteCallback.onResult(1, lcr.b(1));
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "writeToWear , RemoteException: ", e.getMessage());
            }
        }
    }

    public void e(final String str, final String str2, final IReadCallback iReadCallback) {
        if (iReadCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "readFromWear:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lbu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39875b.b(iReadCallback, str, str2);
                }
            });
        }
    }

    /* synthetic */ void b(final IReadCallback iReadCallback, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "readFromWear:mApiAidl is null");
                iReadCallback.onResult(1, lcr.b(1), f39832c);
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.e.readFromWear(str, str2, new IBaseCommonCallback.Stub() { // from class: lbm.5
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str3) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "readFromWear onResponse err_code:", Integer.valueOf(i));
                        iReadCallback.onResult(i, str3, lbm.f39832c);
                    }
                });
                LogUtil.a("WearAPI", "readFromWear cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                return;
            }
            iReadCallback.onResult(1, "inputType or fileDescriptionString is empty", f39832c);
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_WearAPI", "readFromWear Exception: ", e.getMessage());
            try {
                iReadCallback.onResult(1, lcr.b(1), f39832c);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "readFromWear , RemoteException: ", e.getMessage());
            }
        }
    }

    public void d(final String str, final String str2, final IWearReadCallback iWearReadCallback) {
        if (iWearReadCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "readFromWear:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lce
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(iWearReadCallback, str, str2);
                }
            });
        }
    }

    /* synthetic */ void e(final IWearReadCallback iWearReadCallback, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "readFromWear:mApiAidl is null");
                iWearReadCallback.onResult(1, lcr.b(1), f39832c);
            } else {
                this.e.readFromWear(str, str2, new IBaseCommonCallback.Stub() { // from class: lbm.8
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str3) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "readFromWear onResponse err_code:", Integer.valueOf(i));
                        iWearReadCallback.onResult(i, str3, lbm.f39832c);
                    }
                });
                LogUtil.a("WearAPI", "readFromWear cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_WearAPI", "readFromWear RemoteException: ", e.getMessage());
            try {
                iWearReadCallback.onResult(1, lcr.b(1), f39832c);
            } catch (RemoteException e2) {
                ReleaseLogUtil.a("HiH_WearAPI", "readFromWear callback, RemoteException: ", e2.getMessage());
            }
        }
    }

    public void a(final HiAppInfo hiAppInfo, final String str, final String str2, final ICommonCallback iCommonCallback) {
        if (iCommonCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "pushMsgToWearable:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lcd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39895b.a(iCommonCallback, hiAppInfo, str, str2);
                }
            });
        }
    }

    /* synthetic */ void a(final ICommonCallback iCommonCallback, HiAppInfo hiAppInfo, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "pushMsgToWearable:mApiAidl is null");
                iCommonCallback.onResult(1, lcr.b(1));
            } else {
                this.e.pushMsgToWearable(hiAppInfo, str, str2, new IBaseCommonCallback.Stub() { // from class: lbm.6
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str3) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "pushMsgToWearable onResponse err_code:", Integer.valueOf(i));
                        iCommonCallback.onResult(i, str3);
                    }
                });
                LogUtil.a("WearAPI", "pushMsgToWearable cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.a("HiH_WearAPI", "pushMsgToWearable RemoteException: ", e.getMessage());
            try {
                iCommonCallback.onResult(1, lcr.b(1));
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "pushMsgToWearable , RemoteException: ", e.getMessage());
            }
        }
    }

    public void e(final HiAppInfo hiAppInfo, final String str, final String str2, final IWearCommonCallback iWearCommonCallback) {
        if (iWearCommonCallback == null) {
            ReleaseLogUtil.e("HiH_WearAPI", "pushMsgToWearable:callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: lby
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39885c.a(iWearCommonCallback, hiAppInfo, str, str2);
                }
            });
        }
    }

    /* synthetic */ void a(final IWearCommonCallback iWearCommonCallback, HiAppInfo hiAppInfo, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "pushMsgToWearable:mApiAidl is null");
                iWearCommonCallback.onResult(1, lcr.b(1));
            } else {
                this.e.pushMsgToWearable(hiAppInfo, str, str2, new IBaseCommonCallback.Stub() { // from class: lbm.10
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str3) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "pushMsgToWearable onResponse err_code:", Integer.valueOf(i));
                        iWearCommonCallback.onResult(i, str3);
                    }
                });
                LogUtil.a("WearAPI", "pushMsgToWearable cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.a("HiH_WearAPI", "pushMsgToWearable RemoteException: ", e.getMessage());
            try {
                iWearCommonCallback.onResult(1, lcr.b(1));
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "pushMsgToWearable , RemoteException: ", e.getMessage());
            }
        }
    }

    public void a(final String str, final ICommonCallback iCommonCallback) {
        this.f.execute(new Runnable() { // from class: lch
            @Override // java.lang.Runnable
            public final void run() {
                this.f39904a.e(iCommonCallback, str);
            }
        });
    }

    /* synthetic */ void e(final ICommonCallback iCommonCallback, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "getSwitch:mApiAidl is null");
                iCommonCallback.onResult(1, lcr.b(1));
            } else {
                this.e.getSwitch(str, new IBaseCommonCallback.Stub() { // from class: lbm.9
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i, String str2) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "getSwitch onResponse err_code:", Integer.valueOf(i));
                        iCommonCallback.onResult(i, str2);
                    }
                });
                LogUtil.a("WearAPI", "getSwitch cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.a("HiH_WearAPI", "getSwitch Exception: ", e.getMessage());
            try {
                iCommonCallback.onResult(1, lcr.b(1));
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("HiH_WearAPI", "getSwitch RemoteException: ", e.getMessage());
            }
        }
    }

    public void e(final int i, final IDetectCommonCallback iDetectCommonCallback) {
        this.f.execute(new Runnable() { // from class: lbn
            @Override // java.lang.Runnable
            public final void run() {
                this.f39867a.b(iDetectCommonCallback, i);
            }
        });
    }

    /* synthetic */ void b(final IDetectCommonCallback iDetectCommonCallback, int i) {
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "isSwitchOn:mApiAidl is null");
                iDetectCommonCallback.onResult(1, null, lcr.b(1));
            } else {
                this.e.isSwitchOn(i, new com.huawei.health.IDetectCommonCallback.Stub() { // from class: lbm.7
                    @Override // com.huawei.health.IDetectCommonCallback
                    public void onResponse(int i2, List list, String str) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "isSwitchOn onResponse err_code:", Integer.valueOf(i2));
                        iDetectCommonCallback.onResult(i2, list, str);
                    }
                });
            }
        } catch (RemoteException e) {
            a("isSwitchOn", e, iDetectCommonCallback);
        }
    }

    public void b(final int i, final IDetectCommonCallback iDetectCommonCallback) {
        this.f.execute(new Runnable() { // from class: lbw
            @Override // java.lang.Runnable
            public final void run() {
                this.f39880c.c(iDetectCommonCallback, i);
            }
        });
    }

    /* synthetic */ void c(final IDetectCommonCallback iDetectCommonCallback, int i) {
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "getList:mApiAidl is null");
                iDetectCommonCallback.onResult(1, null, lcr.b(1));
            } else {
                this.e.getList(i, new com.huawei.health.IDetectCommonCallback.Stub() { // from class: lbm.12
                    @Override // com.huawei.health.IDetectCommonCallback
                    public void onResponse(int i2, List list, String str) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "getList onResponse err_code:", Integer.valueOf(i2));
                        iDetectCommonCallback.onResult(i2, list, str);
                    }
                });
            }
        } catch (RemoteException e) {
            a("getList", e, iDetectCommonCallback);
        }
    }

    public void a(final int i, final IDetectCommonCallback iDetectCommonCallback) {
        this.f.execute(new Runnable() { // from class: lcc
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(iDetectCommonCallback, i);
            }
        });
    }

    /* synthetic */ void e(final IDetectCommonCallback iDetectCommonCallback, int i) {
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "isLatestVersion:mApiAidl is null");
                iDetectCommonCallback.onResult(1, null, lcr.b(1));
            } else {
                this.e.isLatestVersion(i, new com.huawei.health.IDetectCommonCallback.Stub() { // from class: lbm.14
                    @Override // com.huawei.health.IDetectCommonCallback
                    public void onResponse(int i2, List list, String str) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "isLatestVersion onResponse err_code:", Integer.valueOf(i2));
                        iDetectCommonCallback.onResult(i2, list, str);
                    }
                });
            }
        } catch (RemoteException e) {
            a("isLatestVersion", e, iDetectCommonCallback);
        }
    }

    public void e(final String str, final int i, final IDetectCommonCallback iDetectCommonCallback) {
        this.f.execute(new Runnable() { // from class: lbx
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(iDetectCommonCallback, str, i);
            }
        });
    }

    /* synthetic */ void c(final IDetectCommonCallback iDetectCommonCallback, String str, int i) {
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "goIntoPage:mApiAidl is null");
                iDetectCommonCallback.onResult(1, null, lcr.b(1));
            } else {
                this.e.goIntoPage(str, i, new com.huawei.health.IDetectCommonCallback.Stub() { // from class: lbm.13
                    @Override // com.huawei.health.IDetectCommonCallback
                    public void onResponse(int i2, List list, String str2) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "goIntoPage onResponse err_code:", Integer.valueOf(i2));
                        iDetectCommonCallback.onResult(i2, list, str2);
                    }
                });
            }
        } catch (RemoteException e) {
            a("goIntoPage", e, iDetectCommonCallback);
        }
    }

    public void b(IBinder iBinder) {
        LogUtil.a("WearAPI", "setBinder enter, binder = ", iBinder, " mApiAidl = ", this.e);
        if (iBinder != null) {
            try {
                if (this.f39834b != null) {
                    this.f39834b.unlinkToDeath(this.f39833a, 0);
                }
                this.f39834b = iBinder;
                this.f39834b.linkToDeath(this.f39833a, 0);
            } catch (RemoteException e) {
                ReleaseLogUtil.a("HiH_WearAPI", "setBinder RemoteException = ", e.getMessage());
            }
            this.e = IKitWearAIDL.Stub.asInterface(this.f39834b);
            LogUtil.d("WearAPI", "mApiAidl = ", this.e);
            return;
        }
        this.f.execute(new Runnable() { // from class: lca
            @Override // java.lang.Runnable
            public final void run() {
                this.f39888a.a();
            }
        });
        if (this.g != null) {
            LogUtil.a("HiH_WearAPI", "notify error");
            b(this.g, 150, lcr.b(150));
            this.g = null;
        }
    }

    /* synthetic */ void a() {
        this.e = null;
    }

    private void a(String str, RemoteException remoteException, IDetectCommonCallback iDetectCommonCallback) {
        ReleaseLogUtil.d("HiH_WearAPI", str, " handleRemoteException Exception: ", remoteException.getMessage());
        try {
            iDetectCommonCallback.onResult(1, null, lcr.b(1));
        } catch (RemoteException unused) {
            ReleaseLogUtil.a("HiH_WearAPI", "handleRemoteException RemoteException: ", remoteException.getMessage());
        }
    }

    public void a(final String str, final String str2, final String str3, final int i, final ICommonCallback iCommonCallback) {
        final String strD = lkf.d(d);
        this.f.execute(new Runnable() { // from class: lbv
            @Override // java.lang.Runnable
            public final void run() {
                this.f39877b.d(strD, iCommonCallback, str, str2, str3, i);
            }
        });
    }

    /* synthetic */ void d(String str, final ICommonCallback iCommonCallback, String str2, String str3, String str4, int i) {
        d(str);
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "bindDevice:mApiAidl is null");
                iCommonCallback.onResult(1, lcr.b(1));
            } else {
                this.e.bindDevice(str2, str3, str4, i, new IBaseCommonCallback.Stub() { // from class: lbm.15
                    @Override // com.huawei.health.IBaseCommonCallback
                    public void onResponse(int i2, String str5) throws RemoteException {
                        ReleaseLogUtil.d("HiH_WearAPI", "bindDevice onResponse err_code:", Integer.valueOf(i2));
                        iCommonCallback.onResult(i2, str5);
                    }
                });
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.a("HiH_WearAPI", "bindDevice Exception: ", e.getMessage());
            try {
                iCommonCallback.onResult(1, lcr.b(1));
            } catch (RemoteException e2) {
                ReleaseLogUtil.a("HiH_WearAPI", "bindDevice RemoteException: ", e2.getMessage());
            }
        }
    }

    public void b(final HealthLogOption healthLogOption, final IWearCommonCallback iWearCommonCallback) {
        this.f.execute(new Runnable() { // from class: lbs
            @Override // java.lang.Runnable
            public final void run() {
                this.f39871a.b(iWearCommonCallback, healthLogOption);
            }
        });
    }

    /* synthetic */ void b(IWearCommonCallback iWearCommonCallback, HealthLogOption healthLogOption) {
        e();
        try {
            if (this.e == null) {
                ReleaseLogUtil.e("HiH_WearAPI", "captureLog:mApiAidl is null");
                iWearCommonCallback.onResult(1, lcr.b(1));
            } else {
                c(healthLogOption, iWearCommonCallback);
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.a("HiH_WearAPI", "captureLog RemoteException: ", e.getMessage());
            try {
                iWearCommonCallback.onResult(1, lcr.b(1));
            } catch (RemoteException e2) {
                ReleaseLogUtil.a("HiH_WearAPI", "handleWearCommonCallback , RemoteException: ", e2.getMessage());
            }
        }
    }

    private void c(HealthLogOption healthLogOption, final IWearCommonCallback iWearCommonCallback) throws RemoteException {
        LogUtil.a("WearAPI", "enter doCaptureLog.");
        int iGeActionType = healthLogOption.getActionType().geActionType();
        if (iGeActionType == HealthLogOption.ActionType.CAPTURE_LOG.geActionType()) {
            this.e.captureLog(healthLogOption.getUuid(), new IBaseCommonCallback.Stub() { // from class: lbm.20
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str) throws RemoteException {
                    ReleaseLogUtil.d("HiH_WearAPI", "captureLog onResponse err_code:", Integer.valueOf(i));
                    iWearCommonCallback.onResult(i, str);
                }
            });
            return;
        }
        if (iGeActionType == HealthLogOption.ActionType.UPLOAD_LOG.geActionType()) {
            this.e.uploadLog(healthLogOption.getUploadType(), healthLogOption.getUuid(), healthLogOption.getFileNameList(), new IBaseCommonCallback.Stub() { // from class: lbm.17
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str) throws RemoteException {
                    ReleaseLogUtil.d("HiH_WearAPI", "uploadLog onResponse err_code:", Integer.valueOf(i));
                    iWearCommonCallback.onResult(i, str);
                }
            });
        } else if (iGeActionType == HealthLogOption.ActionType.REMOVE_LOG.geActionType()) {
            this.e.removeLog(healthLogOption.getFileNameList(), new IBaseCommonCallback.Stub() { // from class: lbm.18
                @Override // com.huawei.health.IBaseCommonCallback
                public void onResponse(int i, String str) throws RemoteException {
                    ReleaseLogUtil.d("HiH_WearAPI", "removeLog onResponse err_code:", Integer.valueOf(i));
                    iWearCommonCallback.onResult(i, str);
                }
            });
        } else {
            iWearCommonCallback.onResult(2, lcr.b(2));
        }
    }
}
