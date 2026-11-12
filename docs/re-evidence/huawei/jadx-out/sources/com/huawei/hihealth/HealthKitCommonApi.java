package com.huawei.hihealth;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.hihealth.error.HiHealthError;
import com.huawei.hihealth.listener.HiSubscribeCallback;
import com.huawei.hihealth.listener.IuniversalCallback;
import com.huawei.hihealth.listener.ResultCallback;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.Notification;
import com.huawei.hihealth.model.SubscribeModel;
import com.huawei.hihealth.model.Subscriber;
import com.huawei.hihealthkit.context.OutOfBandContext;
import com.huawei.hihealthkit.data.store.HiRealTimeCallback;
import com.huawei.up.utils.Constants;
import defpackage.ksu;
import defpackage.ksv;
import defpackage.ksx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class HealthKitCommonApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<HiRealTimeCallback, IRegisterRealTimeCallback> f11748b = new ConcurrentHashMap(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<DataReportModel> f11749c = new ArrayList(10);
    private static DataReportModel d = null;
    private static Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IHiHealthKit f11750a;
    private IHiHealthKitEx f;
    private ExecutorService g;
    private final Object h;
    private IBinder i;
    private ServiceConnection j;
    private List<SubscribeModel> l;
    private Map<HiSubscribeCallback, ISubScribeCallback> m;

    private HealthKitCommonApi() {
        this.h = new Object();
        this.l = new ArrayList(10);
        this.m = new HashMap(10);
        this.i = new Binder();
        this.j = new ServiceConnection() { // from class: com.huawei.hihealth.HealthKitCommonApi.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                try {
                    if (HealthKitCommonApi.e instanceof OutOfBandContext) {
                        IBinder serviceBinder = IBinderInterceptor.Stub.asInterface(iBinder).getServiceBinder("KIT_EXTEND");
                        HealthKitCommonApi.this.f = IHiHealthKitEx.Stub.asInterface(serviceBinder);
                    } else {
                        IBinder serviceBinder2 = IBinderInterceptor.Stub.asInterface(iBinder).getServiceBinder(null);
                        HealthKitCommonApi.this.f11750a = IHiHealthKit.Stub.asInterface(serviceBinder2);
                    }
                } catch (RemoteException unused) {
                    Log.w("HealthKitCommonApi", "onServiceConnected Exception");
                }
                try {
                    if (HealthKitCommonApi.this.f11750a != null || HealthKitCommonApi.this.f != null) {
                        if (HealthKitCommonApi.this.f11750a != null) {
                            HealthKitCommonApi.this.f11750a.registerPackageName(HealthKitCommonApi.e.getPackageName());
                            HealthKitCommonApi.this.f11750a.setKitVersion(String.valueOf(ksx.d(HealthKitCommonApi.e)));
                            ksx.c(HealthKitCommonApi.this.f11750a.getServiceApiLevel());
                        } else {
                            HealthKitCommonApi.this.f.registerPackageName(HealthKitCommonApi.e.getPackageName());
                            HealthKitCommonApi.this.f.setKitVersion(String.valueOf(ksx.d(HealthKitCommonApi.e)));
                            ksx.c(HealthKitCommonApi.this.f.getServiceApiLevel(((OutOfBandContext) HealthKitCommonApi.e).getOutOfBandData()));
                        }
                    } else {
                        Log.w("HealthKitCommonApi", "bind service fail");
                    }
                } catch (RemoteException unused2) {
                    Log.w("HealthKitCommonApi", "init kit version error");
                }
                synchronized (HealthKitCommonApi.this.h) {
                    HealthKitCommonApi.this.h.notifyAll();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.w("HealthKitCommonApi", "onServiceDisconnected");
                HealthKitCommonApi.this.f11750a = null;
                HealthKitCommonApi.this.f = null;
                Iterator it = HealthKitCommonApi.f11748b.keySet().iterator();
                while (it.hasNext()) {
                    ((HiRealTimeCallback) it.next()).onResultHandler(31, HiHealthError.e(31));
                }
                Iterator it2 = HealthKitCommonApi.this.m.keySet().iterator();
                while (it2.hasNext()) {
                    ((HiSubscribeCallback) it2.next()).onResultHandler(new ArrayList(), Arrays.asList(new Notification(0, 31, HiHealthError.e(31))));
                }
                HealthKitCommonApi.f11748b.clear();
                HealthKitCommonApi.this.m.clear();
                HealthKitCommonApi.this.l.clear();
            }
        };
        Log.i("HealthKitCommonApi", "HiHealthKitCommonApi construct");
        this.g = Executors.newSingleThreadExecutor();
    }

    public static HealthKitCommonApi a(Context context) {
        synchronized (HealthKitCommonApi.class) {
            if (context instanceof OutOfBandContext) {
                e = context;
            } else if (e == null) {
                e = context.getApplicationContext();
            } else {
                return Instance.d;
            }
            return Instance.d;
        }
    }

    private void a() {
        if (this.f11750a == null && this.f == null) {
            Intent intent = new Intent("com.huawei.health.action.KIT_SERVICE");
            intent.setClassName(ksu.b(), "com.huawei.hihealthservice.HiHealthService");
            intent.setPackage(ksu.b());
            try {
                e.bindService(intent, this.j, 1);
            } catch (SecurityException unused) {
                Log.e("HealthKitCommonApi", "bindService exception");
            }
            synchronized (this.h) {
                try {
                    this.h.wait(5000L);
                } catch (InterruptedException unused2) {
                    Log.e("HealthKitCommonApi", "bindService InterruptedException");
                }
            }
        }
    }

    /* synthetic */ void e(HiRealTimeCallback hiRealTimeCallback, DataReportModel dataReportModel) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "registerDataAutoReport mApiAidl is null");
            hiRealTimeCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("register_data_auto_report")) {
            hiRealTimeCallback.onResultHandler(30, HiHealthError.e(30));
            Log.w("HealthKitCommonApi", "Health Application need to be updated to support this API");
        } else {
            a(dataReportModel, hiRealTimeCallback);
        }
    }

    private boolean c(DataReportModel dataReportModel, HiRealTimeCallback hiRealTimeCallback) {
        if (f11749c.contains(dataReportModel)) {
            Log.i("HealthKitCommonApi", "checkModelValid repeat error");
            hiRealTimeCallback.onResultHandler(101, HiHealthError.e(101));
            return false;
        }
        if (f11749c.size() >= 10) {
            Log.i("HealthKitCommonApi", "checkModelValid limit error");
            hiRealTimeCallback.onResultHandler(102, HiHealthError.e(102));
            return false;
        }
        f11749c.add(dataReportModel);
        Log.i("HealthKitCommonApi", "checkModelValid checkModelValid ok");
        return true;
    }

    private void e(DataReportModel dataReportModel) {
        f11749c.remove(dataReportModel);
    }

    private void a(DataReportModel dataReportModel, final HiRealTimeCallback hiRealTimeCallback) {
        IRegisterRealTimeCallback iRegisterRealTimeCallback;
        if (!c(dataReportModel, hiRealTimeCallback)) {
            Log.i("HealthKitCommonApi", "checkModelValid fail");
            return;
        }
        if (f11748b.containsKey(hiRealTimeCallback)) {
            iRegisterRealTimeCallback = f11748b.get(hiRealTimeCallback);
        } else {
            iRegisterRealTimeCallback = new IRegisterRealTimeCallback.Stub() { // from class: com.huawei.hihealth.HealthKitCommonApi.2
                @Override // com.huawei.hihealth.IRegisterRealTimeCallback
                public void onResult(int i, String str) {
                    Log.i("HealthKitCommonApi", "DataAutoReportImpl onResult errCode = " + i);
                    hiRealTimeCallback.onResultHandler(HiHealthError.d(i), str);
                }

                @Override // com.huawei.hihealth.IRegisterRealTimeCallback
                public void onDataChanged(Bundle bundle) {
                    hiRealTimeCallback.onDataChangedHandler(bundle);
                }
            };
            f11748b.put(hiRealTimeCallback, iRegisterRealTimeCallback);
        }
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.registerDataAutoReport(dataReportModel, iRegisterRealTimeCallback);
            } else {
                this.f.registerDataAutoReport(((OutOfBandContext) e).getOutOfBandData(), dataReportModel, iRegisterRealTimeCallback);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "registerRealTimeCallbackImpl exception");
            hiRealTimeCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    /* synthetic */ void d(HiRealTimeCallback hiRealTimeCallback, DataReportModel dataReportModel) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "registerDataAutoReport mApiAidl is null");
            hiRealTimeCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("register_data_auto_report")) {
            hiRealTimeCallback.onResultHandler(30, HiHealthError.e(30));
            Log.w("HealthKitCommonApi", "Health Application need to be updated to support this API");
        } else {
            b(dataReportModel, hiRealTimeCallback);
        }
    }

    private void b(DataReportModel dataReportModel, HiRealTimeCallback hiRealTimeCallback) {
        e(dataReportModel);
        IRegisterRealTimeCallback iRegisterRealTimeCallback = f11748b.get(hiRealTimeCallback);
        if (iRegisterRealTimeCallback == null) {
            Log.e("HealthKitCommonApi", "unregisterDataAutoReportImpl innerCallback = null");
            hiRealTimeCallback.onResultHandler(4, HiHealthError.e(4));
            return;
        }
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.unregisterDataAutoReport(dataReportModel, iRegisterRealTimeCallback);
            } else {
                this.f.unregisterDataAutoReport(((OutOfBandContext) e).getOutOfBandData(), dataReportModel, iRegisterRealTimeCallback);
            }
        } catch (Exception unused) {
            Log.e("HealthKitCommonApi", "unregisterDataAutoReportImpl Exception");
            hiRealTimeCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    public void a(final StartSportParam startSportParam, final ResultCallback resultCallback) {
        Log.i("HealthKitCommonApi", "startSportEnhance");
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HealthKitCommonApi$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(resultCallback, startSportParam);
            }
        });
    }

    /* synthetic */ void d(ResultCallback resultCallback, StartSportParam startSportParam) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "startSportEnhance mApiAidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("register_data_auto_report")) {
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            Log.w("HealthKitCommonApi", "Health Application need to be updated to support this API");
        } else {
            c(startSportParam, resultCallback);
        }
    }

    private void c(StartSportParam startSportParam, final ResultCallback resultCallback) {
        ICommonCallback.Stub stub = new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HealthKitCommonApi.3
            @Override // com.huawei.hihealth.ICommonCallback
            public void onResult(int i, String str) throws RemoteException {
                Log.i("HealthKitCommonApi", "resultCode = " + i);
                resultCallback.onResultHandler(HiHealthError.d(i), str);
                if (i != 0 || HealthKitCommonApi.this.f11750a == null) {
                    return;
                }
                HealthKitCommonApi.this.f11750a.setBinder(HealthKitCommonApi.this.i);
            }
        };
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.startSportEnhance(startSportParam, stub);
            } else {
                this.f.startSportEnhance(((OutOfBandContext) e).getOutOfBandData(), startSportParam, stub);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "startSportEnhanceImpl RemoteException");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "startSportEnhanceImpl Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    public void d(final ResultCallback resultCallback) {
        Log.i("HealthKitCommonApi", "stopSport");
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HealthKitCommonApi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11751a.b(resultCallback);
            }
        });
    }

    /* synthetic */ void b(ResultCallback resultCallback) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "stopSport mApiAidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else {
            f(resultCallback);
        }
    }

    private void f(ResultCallback resultCallback) {
        ICommonCallback.Stub stubC = c(resultCallback);
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.stopSport(stubC);
            } else {
                this.f.stopSport(((OutOfBandContext) e).getOutOfBandData(), stubC);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "stopSport RemoteException");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "stopSport Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    /* synthetic */ void a(ResultCallback resultCallback) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "stopSport mApiAidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("pauseSport")) {
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            Log.w("HealthKitCommonApi", "Health Application need to be updated to support this API");
        } else {
            i(resultCallback);
        }
    }

    private void i(ResultCallback resultCallback) {
        ICommonCallback.Stub stubC = c(resultCallback);
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.pauseSport(stubC);
            } else {
                this.f.pauseSport(((OutOfBandContext) e).getOutOfBandData(), stubC);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "stopSport RemoteException");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "stopSport Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    /* synthetic */ void e(ResultCallback resultCallback) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "stopSport mApiAidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("resumeSport")) {
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            Log.w("HealthKitCommonApi", "Health Application need to be updated to support this API");
        } else {
            h(resultCallback);
        }
    }

    private void h(ResultCallback resultCallback) {
        ICommonCallback.Stub stubC = c(resultCallback);
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.resumeSport(stubC);
            } else {
                this.f.resumeSport(((OutOfBandContext) e).getOutOfBandData(), stubC);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "stopSport RemoteException");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "stopSport Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    private ICommonCallback.Stub c(final ResultCallback resultCallback) {
        return new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HealthKitCommonApi.4
            @Override // com.huawei.hihealth.ICommonCallback
            public void onResult(int i, String str) {
                Log.i("HealthKitCommonApi", "resultCode = " + i);
                resultCallback.onResultHandler(HiHealthError.d(i), str);
            }
        };
    }

    /* synthetic */ void d(ResultCallback resultCallback, String str) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "sendDeviceControlinstruction mApiAidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("send_device_controlinstruction")) {
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            Log.w("HealthKitCommonApi", "Health Application need to be updated to support this API");
        } else {
            e(str, resultCallback);
        }
    }

    private void e(String str, ResultCallback resultCallback) {
        ICommonCallback.Stub stubC = c(resultCallback);
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.sendDeviceControlinstruction(str, stubC);
            } else {
                this.f.sendDeviceControlinstruction(((OutOfBandContext) e).getOutOfBandData(), str, stubC);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "sendDeviceControlinstructionImpl RemoteException");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "sendDeviceControlinstructionImpl Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    /* synthetic */ void d(ResultCallback resultCallback, List list) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "getUserInfo mApiAidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d(Constants.METHOD_GET_USER_INFO)) {
            Log.w("HealthKitCommonApi", "getUserInfo not support");
            resultCallback.onResultHandler(30, HiHealthError.e(30));
        } else {
            d((List<String>) list, resultCallback);
        }
    }

    private void d(List<String> list, ResultCallback resultCallback) {
        ICommonCallback.Stub stubC = c(resultCallback);
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.getUserInfo(list, stubC);
            } else {
                this.f.getUserInfo(((OutOfBandContext) e).getOutOfBandData(), list, stubC);
            }
        } catch (Exception unused) {
            Log.e("HealthKitCommonApi", "getUserInfo Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    /* synthetic */ void a(final ResultCallback resultCallback, HiUserPreferenceData hiUserPreferenceData, boolean z) {
        a();
        if (this.f11750a == null) {
            resultCallback.onResultHandler(1, "setUserPreference mApiAidl is null");
            Log.w("HealthKitCommonApi", "setUserPreference mApiAidl is null");
            return;
        }
        if (!ksx.d("setUserPreference")) {
            Log.w("HealthKitCommonApi", "setUserPreference not support");
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            return;
        }
        try {
            IDataOperateListener.Stub stub = new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HealthKitCommonApi.5
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list) throws RemoteException {
                    Log.i("HealthKitCommonApi", "setUserPreference onResult:" + i);
                    resultCallback.onResultHandler(i, i == 0 ? null : HiHealthError.e(i));
                }
            };
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.setUserPreference(hiUserPreferenceData, z, stub);
            } else {
                this.f.setUserPreference(((OutOfBandContext) e).getOutOfBandData(), hiUserPreferenceData, z, stub);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "setUserPreference, RemoteException");
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "setUserPreference, Exception");
        }
    }

    /* synthetic */ void c(final ResultCallback resultCallback, List list) {
        a();
        if (this.f11750a == null) {
            resultCallback.onResultHandler(1, "setUserPreference mApiAidl is null");
            Log.w("HealthKitCommonApi", "getUserPreference mApiAidl is null");
            return;
        }
        if (!ksx.d("getUserPreference")) {
            Log.w("HealthKitCommonApi", "getUserPreference not support");
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            return;
        }
        try {
            IDataOperateListener.Stub stub = new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HealthKitCommonApi.6
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list2) throws RemoteException {
                    Log.i("HealthKitCommonApi", "getUserPreference onResult:" + i);
                    resultCallback.onResultHandler(i, list2);
                }
            };
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.getUserPreference(list, stub);
            } else {
                this.f.getUserPreference(((OutOfBandContext) e).getOutOfBandData(), list, stub);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "getUserPreference, RemoteException");
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "getUserPreference, Exception");
        }
    }

    /* synthetic */ void b(HiSubscribeCallback hiSubscribeCallback, Notification notification, SubscribeModel subscribeModel) {
        Log.i("HealthKitCommonApi", "subscribeDataApi");
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "registerDataAutoReport mApiAidl is null");
            hiSubscribeCallback.onResultHandler(new ArrayList(), Arrays.asList(notification));
        } else {
            if (this.l.contains(subscribeModel)) {
                Log.w("HealthKitCommonApi", HiHealthError.e(101));
                notification.setErrorInfo(101, HiHealthError.e(101));
                hiSubscribeCallback.onResultHandler(new ArrayList(), Arrays.asList(notification));
                return;
            }
            e(subscribeModel, hiSubscribeCallback, notification);
        }
    }

    private void e(final SubscribeModel subscribeModel, final HiSubscribeCallback hiSubscribeCallback, Notification notification) {
        ISubScribeCallback iSubScribeCallback;
        if (this.m.containsKey(hiSubscribeCallback)) {
            iSubScribeCallback = this.m.get(hiSubscribeCallback);
        } else {
            iSubScribeCallback = new ISubScribeCallback.Stub() { // from class: com.huawei.hihealth.HealthKitCommonApi.7
                @Override // com.huawei.hihealth.ISubScribeCallback
                public void onResult(List<Notification> list, List<Notification> list2) {
                    for (Notification notification2 : list) {
                        Log.i("HealthKitCommonApi", "success data result, data type is " + notification2.getDataType() + " error code is " + notification2.getErrorCode());
                    }
                    for (Notification notification3 : list2) {
                        Log.w("HealthKitCommonApi", "fail data result, data type is " + notification3.getDataType() + " error code is " + notification3.getErrorCode());
                    }
                    hiSubscribeCallback.onResultHandler(list, list2);
                    if (list2.isEmpty() && !list.isEmpty() && list.get(0).getSubscribeTag()) {
                        Log.i("HealthKitCommonApi", "subscribe success");
                        HealthKitCommonApi.this.l.add(subscribeModel);
                        HealthKitCommonApi.this.m.put(hiSubscribeCallback, this);
                    }
                    if (!list2.isEmpty() || list.isEmpty() || list.get(0).getSubscribeTag()) {
                        return;
                    }
                    Log.i("HealthKitCommonApi", "unsubscribe success");
                    HealthKitCommonApi.this.l.remove(subscribeModel);
                    HealthKitCommonApi.this.m.remove(hiSubscribeCallback);
                }

                @Override // com.huawei.hihealth.ISubScribeCallback
                public void onDataChanged(Notification notification2) {
                    Log.i("HealthKitCommonApi", "subscribe data changed, error code is " + notification2.getErrorCode());
                    hiSubscribeCallback.onDataChangedHandler(notification2);
                }
            };
        }
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.subscribeData(subscribeModel, iSubScribeCallback);
            } else {
                this.f.subscribeData(((OutOfBandContext) e).getOutOfBandData(), subscribeModel, iSubScribeCallback);
            }
        } catch (Exception unused) {
            Log.e("HealthKitCommonApi", "registerRealTimeCallbackImpl exception");
            notification.setErrorInfo(4, HiHealthError.e(4));
            hiSubscribeCallback.onResultHandler(new ArrayList(), Arrays.asList(notification));
        }
    }

    /* synthetic */ void c(Notification notification, HiSubscribeCallback hiSubscribeCallback, SubscribeModel subscribeModel) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "mApiAidl is null");
            notification.setErrorInfo(1, HiHealthError.e(1));
            hiSubscribeCallback.onResultHandler(new ArrayList(), Arrays.asList(notification));
        } else {
            if (!this.l.contains(subscribeModel)) {
                Log.w("HealthKitCommonApi", "not register before");
                notification.setErrorInfo(101, HiHealthError.e(101));
                hiSubscribeCallback.onResultHandler(new ArrayList(), Arrays.asList(notification));
                return;
            }
            a(subscribeModel, hiSubscribeCallback, notification);
        }
    }

    private void a(SubscribeModel subscribeModel, HiSubscribeCallback hiSubscribeCallback, Notification notification) {
        ISubScribeCallback iSubScribeCallback = this.m.get(hiSubscribeCallback);
        if (iSubScribeCallback == null) {
            Log.e("HealthKitCommonApi", "unSubscribeDataImpl innerCallback = null");
            notification.setErrorInfo(101, HiHealthError.e(101));
            hiSubscribeCallback.onResultHandler(new ArrayList(), Arrays.asList(notification));
            return;
        }
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.unSubscribeData(subscribeModel, iSubScribeCallback);
            } else {
                this.f.unSubscribeData(((OutOfBandContext) e).getOutOfBandData(), subscribeModel, iSubScribeCallback);
            }
        } catch (Exception unused) {
            Log.e("HealthKitCommonApi", "unregisterDataAutoReportImpl exception");
            notification.setErrorInfo(4, HiHealthError.e(4));
            hiSubscribeCallback.onResultHandler(new ArrayList(), Arrays.asList(notification));
        }
    }

    /* synthetic */ void c(ResultCallback resultCallback, Subscriber subscriber, EventTypeInfo eventTypeInfo) {
        Log.i("HealthKitCommonApi", "enter subscribeDataEx");
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "subscribeDataEx aidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("subscribe_goal_achieve")) {
            Log.w("HealthKitCommonApi", "does not support subscribeDataEx");
            resultCallback.onResultHandler(30, HiHealthError.e(30));
        } else {
            try {
                this.f11750a.subscribeDataEx(subscriber, eventTypeInfo, c(resultCallback));
            } catch (Exception unused) {
                Log.w("HealthKitCommonApi", "aidl exception");
            }
        }
    }

    /* synthetic */ void d(ResultCallback resultCallback, Subscriber subscriber, EventTypeInfo eventTypeInfo) {
        Log.i("HealthKitCommonApi", "enter unSubscribeDataEx");
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "unSubscribeDataEx aidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("subscribe_goal_achieve")) {
            Log.w("HealthKitCommonApi", "does not support subscribeDataEx");
            resultCallback.onResultHandler(30, HiHealthError.e(30));
        } else {
            try {
                this.f11750a.unSubscribeDataEx(subscriber, eventTypeInfo, c(resultCallback));
            } catch (Exception unused) {
                Log.w("HealthKitCommonApi", "aidl exception");
            }
        }
    }

    /* synthetic */ void d() {
        Log.i("HealthKitCommonApi", "enter unBindHealthService");
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "no need to unbind");
            return;
        }
        try {
            e.unbindService(this.j);
            this.f11750a = null;
            this.f = null;
        } catch (Exception unused) {
            Log.w("HealthKitCommonApi", "unbind service exception");
        }
    }

    public void a(final int[] iArr, final ResultCallback resultCallback) {
        Log.i("HealthKitCommonApi", "enter syncData");
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HealthKitCommonApi$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f11768b.e(resultCallback, iArr);
            }
        });
    }

    /* synthetic */ void e(ResultCallback resultCallback, int[] iArr) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "syncData mApiAidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("syncData")) {
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            Log.w("HealthKitCommonApi", "Health Application need to be updated to support this API");
        } else if (ksv.c(Arrays.asList(iArr))) {
            resultCallback.onResultHandler(1021, HiHealthError.e(1021));
            Log.w("HealthKitCommonApi", "syncDataTypes is too large");
        } else {
            e(iArr, resultCallback);
        }
    }

    private void e(int[] iArr, ResultCallback resultCallback) {
        ICommonCallback.Stub stubC = c(resultCallback);
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.syncData(iArr, stubC);
            } else {
                this.f.syncData(((OutOfBandContext) e).getOutOfBandData(), iArr, stubC);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "syncDataImpl RemoteException");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "syncDataImpl Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    /* synthetic */ void e(ResultCallback resultCallback, int i) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "connectSportDevice mApiAidl is null");
            resultCallback.onResultHandler(1, HiHealthError.e(1));
        } else if (!ksx.d("connectSportDevice")) {
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            Log.w("HealthKitCommonApi", "Health Application need to be updated to support this API");
        } else {
            d(i, resultCallback);
        }
    }

    private void d(int i, ResultCallback resultCallback) {
        ICommonCallback.Stub stubC = c(resultCallback);
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.connectSportDevice(i, stubC);
            } else {
                this.f.connectSportDevice(((OutOfBandContext) e).getOutOfBandData(), i, stubC);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "syncDataImpl RemoteException");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "syncDataImpl Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    public void a(final TrendQuery trendQuery, final int i, final IuniversalCallback iuniversalCallback) {
        Log.i("HealthKitCommonApi", "queryTrends");
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HealthKitCommonApi$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f11759c.d(iuniversalCallback, trendQuery, i);
            }
        });
    }

    /* synthetic */ void d(IuniversalCallback iuniversalCallback, TrendQuery trendQuery, int i) {
        a();
        if (this.f11750a == null && this.f == null) {
            Log.w("HealthKitCommonApi", "queryTrends mApiAidl is null");
            iuniversalCallback.onResultHandler(1, null, HiHealthError.e(1));
        } else if (!ksx.d("queryTrends")) {
            iuniversalCallback.onResultHandler(30, null, HiHealthError.e(30));
            Log.w("HealthKitCommonApi", "Health Application need to be updated to support this API");
        } else {
            d(trendQuery, i, iuniversalCallback);
        }
    }

    private void d(TrendQuery trendQuery, int i, final IuniversalCallback iuniversalCallback) {
        IDataReadResultListener.Stub stub = new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.HealthKitCommonApi.8
            @Override // com.huawei.hihealth.IDataReadResultListener
            public void onResult(List list, int i2, int i3) {
                Log.i("HealthKitCommonApi", "queryTrends callback errorCode: " + i2 + ", resultType: " + i3);
                int iD = HiHealthError.d(i2);
                if (list != null) {
                    iuniversalCallback.onResultHandler(iD, list, HiHealthError.e(iD));
                } else {
                    iuniversalCallback.onResultHandler(iD, new ArrayList(), HiHealthError.e(iD));
                }
            }
        };
        try {
            IHiHealthKit iHiHealthKit = this.f11750a;
            if (iHiHealthKit != null) {
                iHiHealthKit.queryTrends(trendQuery, i, stub);
            } else {
                this.f.queryTrends(((OutOfBandContext) e).getOutOfBandData(), trendQuery, i, stub);
            }
        } catch (RemoteException unused) {
            Log.e("HealthKitCommonApi", "queryTrendsImpl RemoteException");
            iuniversalCallback.onResultHandler(4, new ArrayList(), HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HealthKitCommonApi", "queryTrendsImpl Exception");
            iuniversalCallback.onResultHandler(4, new ArrayList(), HiHealthError.e(4));
        }
    }

    static class Instance {
        private static final HealthKitCommonApi d = new HealthKitCommonApi();

        private Instance() {
        }
    }
}
