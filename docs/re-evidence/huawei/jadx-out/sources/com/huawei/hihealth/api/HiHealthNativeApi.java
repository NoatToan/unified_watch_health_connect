package com.huawei.hihealth.api;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiAuthorizationOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiDataUpdateOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiHealthUnit;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.HiSubscribeTrigger;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.IAggregateListener;
import com.huawei.hihealth.IAggregateListenerEx;
import com.huawei.hihealth.IAuthorizationListener;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealth.IDataClientListener;
import com.huawei.hihealth.IDataHiDeviceInfoListener;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.IDeleteListenerEx;
import com.huawei.hihealth.IHiHealth;
import com.huawei.hihealth.IMultiDataClientListener;
import com.huawei.hihealth.IRegisterClientListener;
import com.huawei.hihealth.ISubscribeListener;
import com.huawei.hihealth.ISupportedTypesListener;
import com.huawei.hihealth.IUnSubscribeListener;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiAuthorizationListener;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiDeleteListenerEx;
import com.huawei.hihealth.data.listener.HiMultiDataClientListener;
import com.huawei.hihealth.data.listener.HiRegisterClientListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiSupportedTypesListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.util.HiDivideUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import health.compact.a.HiBroadcastAction;
import health.compact.a.HiBroadcastManager;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes.dex */
public class HiHealthNativeApi implements HiHealthApi, IAuthApi, IDeviceApi, IStoreApi, UserInfoApi, ServiceConnection {
    private static final Object d = new Object();
    private static volatile HiHealthNativeApi e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile IHiHealth f12037c;
    private final Context g;
    private volatile CountDownLatch j;
    private final ThreadPoolExecutor l;
    private volatile CountDownLatch m;
    private final ThreadPoolExecutor n;
    private final ThreadPoolExecutor p;
    private final ThreadPoolExecutor t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f12036b = new Object();
    private volatile boolean i = false;
    private volatile boolean f = false;
    private boolean h = false;
    private LinkedBlockingQueue<Runnable> k = new LinkedBlockingQueue<>();
    private long o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MyBroadcastReceiver f12035a = new MyBroadcastReceiver();

    private HiHealthNativeApi(Context context) {
        LogUtil.a("HiH_HiHealthNatApi", "HiHealthNativeApi create");
        this.g = context.getApplicationContext();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.p = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.t = threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.l = threadPoolExecutor3;
        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(5, 5, 60L, TimeUnit.SECONDS, this.k);
        this.n = threadPoolExecutor4;
        threadPoolExecutor.allowCoreThreadTimeOut(false);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        threadPoolExecutor4.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.1
            @Override // java.lang.Runnable
            public void run() {
                HiHealthNativeApi.this.a();
                HiHealthNativeApi.this.o = Thread.currentThread().getId();
            }
        });
    }

    public static void a(Context context, LogApi logApi, LogApi logApi2) {
        LogUtil.b(logApi);
        ReleaseLogUtil.d(logApi2);
        HuaweiHealth.e(context.getApplicationContext());
    }

    public static HiHealthNativeApi a(Context context) {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    if (context == null) {
                        throw new IllegalArgumentException("context == null");
                    }
                    e = new HiHealthNativeApi(context);
                }
            }
        }
        return e;
    }

    private static Intent d(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null) {
            LogUtil.d("HiH_HiHealthNatApi", "createExplicitIntent() resolveInfo == null");
            return null;
        }
        if (listQueryIntentServices.size() != 1) {
            LogUtil.d("HiH_HiHealthNatApi", "createExplicitIntent() resolveInfo.size = ", Integer.valueOf(listQueryIntentServices.size()));
            return null;
        }
        LogUtil.a("HiH_HiHealthNatApi", "createExplicitIntent() resolveInfo size more than one");
        return intent;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "onServiceConnected() name = ", componentName, " time is ", Long.valueOf(jCurrentTimeMillis));
        this.f12037c = IHiHealth.Stub.asInterface(iBinder);
        if (this.f12037c == null) {
            ReleaseLogUtil.b("HiH_HiHealthNatApi", "onServiceConnected error !");
        }
        synchronized (this.f12036b) {
            this.f12036b.notifyAll();
        }
        this.n.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        });
        LogUtil.a("HiH_HiHealthNatApi", "onServiceConnected() end name = ", componentName, " time is ", Long.valueOf(jCurrentTimeMillis));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "onServiceDisconnected() name = ", componentName);
        if (this.i && this.j != null) {
            this.j.countDown();
            LogUtil.a("HiH_HiHealthNatApi", "onServiceDisconnected() insert latch countDown");
        }
        if (this.f && this.m != null) {
            this.m.countDown();
            LogUtil.a("HiH_HiHealthNatApi", "onServiceDisconnected() realtime latch countDown");
        }
        this.f12037c = null;
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IHiHealth a() {
        if (this.f12037c != null) {
            return this.f12037c;
        }
        LogApi logApiA = LogUtil.a();
        if (logApiA != null && !logApiA.isSystemInfoAuthorized(this.g)) {
            ReleaseLogUtil.b("HiH_HiHealthNatApi", "bindService() androidId unauthorized, return null service");
            return null;
        }
        synchronized (d) {
            if (this.f12037c == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ReleaseLogUtil.c("HiH_HiHealthNatApi", "bindService() time is ", Long.valueOf(jCurrentTimeMillis));
                String strC = HuaweiHealth.c();
                Intent intent = new Intent();
                intent.setClassName(strC, "com.huawei.hihealthservice.HiHealthService");
                intent.setPackage(strC);
                Intent intentD = d(this.g, intent);
                if (intentD == null) {
                    LogUtil.d("HiH_HiHealthNatApi", "bindService() explicitIntent = null");
                    return this.f12037c;
                }
                this.g.bindService(intentD, this, 1);
                synchronized (this.f12036b) {
                    try {
                        if (this.f12037c != null) {
                            LogUtil.a("HiH_HiHealthNatApi", "bindService() bind mApiAidl is not null = ", this.f12037c);
                            return this.f12037c;
                        }
                        this.f12036b.wait(30000L);
                        LogUtil.a("HiH_HiHealthNatApi", "bindService() bind over mApiAidl is ", this.f12037c, " end time is ", Long.valueOf(jCurrentTimeMillis));
                    } catch (InterruptedException unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "bindService() InterruptedException");
                    }
                }
            }
            return this.f12037c;
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void initHiHealth(final HiAppInfo hiAppInfo) {
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=initHiHealth enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.2
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        iHiHealthA.initHiHealth(hiAppInfo);
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "initHiHealth Exception");
                        return;
                    }
                }
                LogUtil.a("HiH_HiHealthNatApi", "initHiHealth cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void unBindHiHealth() {
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "unBindHiHealth() unbindService");
        synchronized (d) {
            if (this.f12037c != null) {
                this.f12037c = null;
                this.g.unbindService(this);
                ReleaseLogUtil.c("HiH_HiHealthNatApi", "unbindService success.");
            }
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IAuthApi
    public void requestAuthorization(final HiAuthorizationOption hiAuthorizationOption, final HiAuthorizationListener hiAuthorizationListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=requestAuthorization enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.3
            @Override // java.lang.Runnable
            public void run() {
                HiAuthorizationOption hiAuthorizationOption2;
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        LogUtil.a("HiH_HiHealthNatApi", "requestAuthorization start");
                        if (HiScopeUtil.a(HiHealthNativeApi.this.g) != null && (hiAuthorizationOption2 = hiAuthorizationOption) != null) {
                            hiAuthorizationOption2.setAppId(HiScopeUtil.a(HiHealthNativeApi.this.g));
                        }
                        iHiHealthA.requestAuthorization(hiAuthorizationOption, new IAuthorizationListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.3.1
                            @Override // com.huawei.hihealth.IAuthorizationListener
                            public void onResult(int i, List list) throws RemoteException {
                                if (hiAuthorizationListener != null) {
                                    hiAuthorizationListener.onResult(i, list);
                                }
                                LogUtil.a("HiH_HiHealthNatApi", "requestAuthorization cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            }
                        });
                        return;
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "requestAuthorization Exception");
                        HiAuthorizationListener hiAuthorizationListener2 = hiAuthorizationListener;
                        if (hiAuthorizationListener2 != null) {
                            hiAuthorizationListener2.onResult(1, null);
                            return;
                        }
                        return;
                    }
                }
                HiAuthorizationListener hiAuthorizationListener3 = hiAuthorizationListener;
                if (hiAuthorizationListener3 != null) {
                    hiAuthorizationListener3.onResult(1, null);
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchSupportedTypes(final HiHealthDataType.TypeSelector typeSelector, final HiSupportedTypesListener hiSupportedTypesListener) {
        if (hiSupportedTypesListener == null) {
            LogUtil.c("HiH_HiHealthNatApi", "fetchSupportedTypes listener null");
        } else {
            this.n.execute(new ReadTask("fetchSupportedTypes", typeSelector) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.4
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiSupportedTypesListener.onResult(null);
                        return;
                    }
                    try {
                        iHiHealthA.fetchSupportedTypes(AnonymousClass66.f12222a[typeSelector.ordinal()] != 1 ? 0 : 1, new ISupportedTypesListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.4.1
                            @Override // com.huawei.hihealth.ISupportedTypesListener
                            public void onResult(List list) throws RemoteException {
                                hiSupportedTypesListener.onResult(list);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchSupportedTypes cost, totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait queue time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time = ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
                            }
                        });
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiHealthNatApi", "fetchSupportedTypes Exception");
                        hiSupportedTypesListener.onResult(null);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huawei.hihealth.api.HiHealthNativeApi$66, reason: invalid class name */
    static /* synthetic */ class AnonymousClass66 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12222a;

        static {
            int[] iArr = new int[HiHealthDataType.TypeSelector.values().length];
            f12222a = iArr;
            try {
                iArr[HiHealthDataType.TypeSelector.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.k.isEmpty()) {
            return;
        }
        Object[] array = this.k.toArray();
        int length = array.length;
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "taskCt=", Integer.valueOf(length), ", head tskinfo:", array.length > 0 ? array[0] : null, ", last tskinfo: ", array.length > 1 ? array[array.length - 1] : null);
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IAuthApi
    public void subscribeHiHealthData(final List<Integer> list, final HiSubscribeListener hiSubscribeListener) {
        this.n.execute(new ReadTask("subscribeHiHealthData", list) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.5
            @Override // java.lang.Runnable
            public void run() {
                HiHealthSubscribeManager.a().e(list, hiSubscribeListener, getTaskCreateTime());
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void subscribeHiHealthData(final HiHealthClient hiHealthClient, final HiSubscribeListener hiSubscribeListener) {
        this.n.execute(new ReadTask("subscribeHiHealthData", hiHealthClient) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.6
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                HiHealthClient hiHealthClient2 = hiHealthClient;
                if (hiHealthClient2 != null) {
                    arrayList.add(hiHealthClient2);
                }
                HiHealthSubscribeManager.a().e(arrayList, hiSubscribeListener, getTaskCreateTime());
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void subscribeHiHealthData(final int i, final HiSubscribeListener hiSubscribeListener) {
        this.n.execute(new ReadTask("subscribeHiHealthData", Integer.valueOf(i)) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.7
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(i));
                HiHealthSubscribeManager.a().e(arrayList, hiSubscribeListener, getTaskCreateTime());
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IAuthApi
    public void unSubscribeHiHealthData(final List<Integer> list, final HiUnSubscribeListener hiUnSubscribeListener) {
        this.n.execute(new ReadTask("unSubscribeHiHealthData", list) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.8
            @Override // java.lang.Runnable
            public void run() {
                HiHealthSubscribeManager.a().d(list, hiUnSubscribeListener, getTaskCreateTime());
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public boolean addExternalSubscribeTrigger(final int i, HiHealthDataType.TriggerParam triggerParam, final HiSubscribeTrigger hiSubscribeTrigger) {
        if (triggerParam == null || hiSubscribeTrigger == null) {
            LogUtil.d("HiH_HiHealthNatApi", "addExternalSubscribeTrigger() parameter error");
            return false;
        }
        this.n.execute(new ReadTask("addExternalSubscribeTrigger", Integer.valueOf(i)) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.9
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        iHiHealthA.addExternalSubscribeTrigger(i, 0, hiSubscribeTrigger);
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "addExternalSubscribeTrigger Exception");
                        return;
                    }
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                LogUtil.a("HiH_HiHealthNatApi", "addExternalSubscribeTrigger, totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time = ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
            }
        });
        return false;
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IStoreApi
    public void aggregateHiHealthData(final HiAggregateOption hiAggregateOption, final HiAggregateListener hiAggregateListener) {
        this.n.execute(new ReadTask("aggregateHiHealthData", hiAggregateOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.10
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiAggregateListener hiAggregateListener2 = hiAggregateListener;
                    if (hiAggregateListener2 != null) {
                        hiAggregateListener2.onResult(null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final ArrayList arrayList = new ArrayList();
                    iHiHealthA.aggregateHiHealthData(hiAggregateOption, new IAggregateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.10.1
                        @Override // com.huawei.hihealth.IAggregateListener
                        public void onResult(List list, int i, int i2) throws RemoteException {
                            if (hiAggregateListener != null && HiDivideUtil.d((List<HiHealthData>) list, i2, (List<HiHealthData>) arrayList)) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiAggregateListener.onResult(arrayList.isEmpty() ? null : arrayList, i, i2);
                                ReleaseLogUtil.c("R_HiH_HiHealthNatApi", "aggregateHiHealthData errorCode=", Integer.valueOf(i), ",", hiAggregateOption, ",tlTm=", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ",waitTm=", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executedTm=", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ",onResultTm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        }
                    });
                } catch (Exception e2) {
                    ReleaseLogUtil.e("R_HiH_HiHealthNatApi", "aggregateHiHealthData Exception : ", ExceptionUtils.c(e2));
                    HiAggregateListener hiAggregateListener3 = hiAggregateListener;
                    if (hiAggregateListener3 != null) {
                        hiAggregateListener3.onResult(null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void insertFitnessData(final String str) {
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=insertFitnessData enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(str);
            }
        });
    }

    /* synthetic */ void b(String str) {
        IHiHealth iHiHealthA = a();
        if (iHiHealthA == null) {
            LogUtil.d("HiH_HiHealthNatApi", "insertFitnessData aidl is null");
            return;
        }
        try {
            iHiHealthA.insertFitnessData(str);
        } catch (RemoteException unused) {
            LogUtil.c("HiH_HiHealthNatApi", "insertFitnessData Exception");
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void aggregateHiHealthDataEx(final List<HiAggregateOption> list, final HiAggregateListenerEx hiAggregateListenerEx) {
        this.n.execute(new ReadTask("aggregateHiHealthDataEx", list) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.11
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiAggregateListenerEx hiAggregateListenerEx2 = hiAggregateListenerEx;
                    if (hiAggregateListenerEx2 != null) {
                        hiAggregateListenerEx2.onResult(null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final SparseArray sparseArray = new SparseArray();
                    final ArrayList arrayList = new ArrayList();
                    iHiHealthA.aggregateHiHealthDataEx(list, new IAggregateListenerEx.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.11.1
                        @Override // com.huawei.hihealth.IAggregateListenerEx
                        public void onResult(List list2, int i, int i2) throws RemoteException {
                            if (hiAggregateListenerEx != null && HiDivideUtil.d(list2, i, i2, arrayList, sparseArray)) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiAggregateListenerEx.onResult(sparseArray, i, i2);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "aggregateHiHealthDataEx errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "aggregateHiHealthDataEx Exception");
                    HiAggregateListenerEx hiAggregateListenerEx3 = hiAggregateListenerEx;
                    if (hiAggregateListenerEx3 != null) {
                        hiAggregateListenerEx3.onResult(null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void aggregateHiHealthDataProEx(final List<HiDataAggregateProOption> list, final HiAggregateListenerEx hiAggregateListenerEx) {
        this.n.execute(new ReadTask("aggregateHiHealthDataProEx", list) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.12
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiAggregateListenerEx hiAggregateListenerEx2 = hiAggregateListenerEx;
                    if (hiAggregateListenerEx2 != null) {
                        hiAggregateListenerEx2.onResult(null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final SparseArray sparseArray = new SparseArray();
                    final ArrayList arrayList = new ArrayList();
                    iHiHealthA.aggregateHiHealthDataProEx(list, new IAggregateListenerEx.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.12.1
                        @Override // com.huawei.hihealth.IAggregateListenerEx
                        public void onResult(List list2, int i, int i2) throws RemoteException {
                            if (hiAggregateListenerEx != null && HiDivideUtil.d(list2, i, i2, arrayList, sparseArray)) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiAggregateListenerEx.onResult(sparseArray, i, i2);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "aggregateHiHealthDataProEx errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "aggregateHiHealthDataEx Exception");
                    HiAggregateListenerEx hiAggregateListenerEx3 = hiAggregateListenerEx;
                    if (hiAggregateListenerEx3 != null) {
                        hiAggregateListenerEx3.onResult(null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IStoreApi
    public void insertHiHealthData(HiDataInsertOption hiDataInsertOption, HiDataOperateListener hiDataOperateListener) {
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=insertHiHealthData enter!");
        b(hiDataInsertOption, hiDataOperateListener, false);
    }

    private void b(final HiDataInsertOption hiDataInsertOption, final HiDataOperateListener hiDataOperateListener, final boolean z) {
        if (!z) {
            HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        }
        Runnable runnable = new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.13
            /* JADX WARN: Code duplicated, block: B:80:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:88:0x0226  */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                int i;
                int i2;
                int i3;
                HiDataOperateListener hiDataOperateListener2;
                HiDataOperateListener hiDataOperateListener3;
                int i4;
                int i5;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Object obj = true;
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                Object obj2 = "insertHiHealthData bindService Exception";
                if (iHiHealthA == null) {
                    HiDataOperateListener hiDataOperateListener4 = hiDataOperateListener;
                    if (hiDataOperateListener4 != null) {
                        hiDataOperateListener4.onResult(1, "insertHiHealthData bindService Exception");
                        return;
                    }
                    return;
                }
                int i6 = 0;
                try {
                    try {
                        int[] iArr = {1};
                        Object[] objArr = {false};
                        List<HiDataInsertOption> listD = HiDivideUtil.d(hiDataInsertOption);
                        if (!CollectionUtils.a(listD) && listD.get(0) != null && !CollectionUtils.a(listD.get(0).getDatas())) {
                            if (listD.get(0).getDatas().get(0) == null) {
                                i4 = 1;
                                i2 = 2;
                            } else {
                                int size = listD.size();
                                boolean z2 = z;
                                int size2 = listD.get(0).getDatas().size();
                                int type = listD.get(0).getDatas().get(0).getType();
                                Object[] objArr2 = new Object[8];
                                objArr2[0] = "instDt optSz=";
                                objArr2[1] = Integer.valueOf(size);
                                int i7 = 2;
                                try {
                                    objArr2[2] = ",iR=";
                                    objArr2[3] = Boolean.valueOf(z2);
                                    objArr2[4] = ",dtSz=";
                                    objArr2[5] = Integer.valueOf(size2);
                                    objArr2[6] = ",tp=";
                                    objArr2[7] = Integer.valueOf(type);
                                    ReleaseLogUtil.c("HiH_HiHealthNatApi", objArr2);
                                    Iterator<HiDataInsertOption> it = listD.iterator();
                                    int i8 = 0;
                                    while (it.hasNext()) {
                                        try {
                                            try {
                                                HiDataInsertOption next = it.next();
                                                if (hiDataInsertOption.getAppInfo() != null) {
                                                    next.setAppInfo(hiDataInsertOption.getAppInfo());
                                                }
                                                objArr = objArr;
                                                i6 = i6;
                                                i5 = i8;
                                                int i9 = i7;
                                                Iterator<HiDataInsertOption> it2 = it;
                                                i2 = i9;
                                                try {
                                                    HiHealthNativeApi.this.a(next, iHiHealthA, iArr, objArr, z);
                                                    i8 = iArr[i6];
                                                    if (i8 != 0) {
                                                        try {
                                                            obj = objArr[i6];
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            i3 = i8;
                                                            String strC = ExceptionUtils.c(e);
                                                            Object[] objArr3 = new Object[i2];
                                                            objArr3[i6] = "insertHiHealthData Exception";
                                                            objArr3[1] = strC;
                                                            ReleaseLogUtil.e("HiH_HiHealthNatApi", objArr3);
                                                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", 1, ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", "insertHiHealthData Exception");
                                                            hiDataOperateListener3 = hiDataOperateListener;
                                                            if (hiDataOperateListener3 != null) {
                                                                hiDataOperateListener3.onResult(1, "insertHiHealthData Exception");
                                                            }
                                                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                                                            return;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            i = i8;
                                                            obj2 = obj;
                                                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", Integer.valueOf(i), ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", obj2);
                                                            hiDataOperateListener2 = hiDataOperateListener;
                                                            if (hiDataOperateListener2 != null) {
                                                                hiDataOperateListener2.onResult(i, obj2);
                                                            }
                                                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                                                            throw th;
                                                        }
                                                    } else {
                                                        i8 = i5;
                                                    }
                                                    i7 = i2;
                                                    it = it2;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    i3 = i5;
                                                    String strC2 = ExceptionUtils.c(e);
                                                    Object[] objArr4 = new Object[i2];
                                                    objArr4[i6] = "insertHiHealthData Exception";
                                                    objArr4[1] = strC2;
                                                    ReleaseLogUtil.e("HiH_HiHealthNatApi", objArr4);
                                                    ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", 1, ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", "insertHiHealthData Exception");
                                                    hiDataOperateListener3 = hiDataOperateListener;
                                                    if (hiDataOperateListener3 != null) {
                                                        hiDataOperateListener3.onResult(1, "insertHiHealthData Exception");
                                                    }
                                                    ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                                                    return;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    i = i5;
                                                    obj2 = obj;
                                                    ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", Integer.valueOf(i), ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", obj2);
                                                    hiDataOperateListener2 = hiDataOperateListener;
                                                    if (hiDataOperateListener2 != null) {
                                                        hiDataOperateListener2.onResult(i, obj2);
                                                    }
                                                    ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                                                    throw th;
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                i6 = i6;
                                                i5 = i8;
                                                i2 = i7;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                i5 = i8;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            i6 = i6;
                                            i2 = i7;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj;
                                            i = i8;
                                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", Integer.valueOf(i), ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", obj2);
                                            hiDataOperateListener2 = hiDataOperateListener;
                                            if (hiDataOperateListener2 != null) {
                                                hiDataOperateListener2.onResult(i, obj2);
                                            }
                                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                                            throw th;
                                        }
                                    }
                                    int i10 = i8;
                                    ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", Integer.valueOf(i10), ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", obj);
                                    HiDataOperateListener hiDataOperateListener5 = hiDataOperateListener;
                                    if (hiDataOperateListener5 != null) {
                                        hiDataOperateListener5.onResult(i10, obj);
                                    }
                                    ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                                    return;
                                } catch (Exception e6) {
                                    e = e6;
                                    i2 = 2;
                                    i3 = i6;
                                }
                            }
                            i3 = i6;
                            try {
                                String strC3 = ExceptionUtils.c(e);
                                Object[] objArr5 = new Object[i2];
                                objArr5[i6] = "insertHiHealthData Exception";
                                objArr5[1] = strC3;
                                ReleaseLogUtil.e("HiH_HiHealthNatApi", objArr5);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", 1, ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", "insertHiHealthData Exception");
                                hiDataOperateListener3 = hiDataOperateListener;
                                if (hiDataOperateListener3 != null) {
                                    hiDataOperateListener3.onResult(1, "insertHiHealthData Exception");
                                }
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                i = i3;
                                obj2 = obj;
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", Integer.valueOf(i), ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", obj2);
                                hiDataOperateListener2 = hiDataOperateListener;
                                if (hiDataOperateListener2 != null) {
                                    hiDataOperateListener2.onResult(i, obj2);
                                }
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                                throw th;
                            }
                        }
                        i2 = 2;
                        i4 = 1;
                        try {
                            Object[] objArr6 = new Object[i4];
                            objArr6[0] = "Invalid param, data is null";
                            ReleaseLogUtil.e("HiH_HiHealthNatApi", objArr6);
                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", 1, ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", "insertHiHealthData bindService Exception");
                            HiDataOperateListener hiDataOperateListener6 = hiDataOperateListener;
                            if (hiDataOperateListener6 != null) {
                                hiDataOperateListener6.onResult(1, "insertHiHealthData bindService Exception");
                            }
                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                        } catch (Exception e7) {
                            e = e7;
                            obj = "insertHiHealthData bindService Exception";
                            i3 = 1;
                        } catch (Throwable th6) {
                            th = th6;
                            i = 1;
                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData code = ", Integer.valueOf(i), ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ",message = ", obj2);
                            hiDataOperateListener2 = hiDataOperateListener;
                            if (hiDataOperateListener2 != null) {
                                hiDataOperateListener2.onResult(i, obj2);
                            }
                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "insertHiHealthData end");
                            throw th;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        i2 = 2;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    i = 0;
                }
            }
        };
        if (z) {
            this.t.execute(runnable);
        } else {
            this.p.execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HiDataInsertOption hiDataInsertOption, IHiHealth iHiHealth, final int[] iArr, final Object[] objArr, final boolean z) throws RemoteException {
        if (z) {
            this.m = new CountDownLatch(1);
            this.f = true;
        } else {
            this.j = new CountDownLatch(1);
            this.i = true;
        }
        a(hiDataInsertOption, iHiHealth, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.14
            @Override // com.huawei.hihealth.IDataOperateListener
            public void onResult(int i, List list) throws RemoteException {
                LogUtil.a("HiH_HiHealthNatApi", "insertHiHealthDataRun onResult errorCode:", Integer.valueOf(i));
                if (i == 0) {
                    iArr[0] = 0;
                    objArr[0] = true;
                } else if (list != null && !list.isEmpty()) {
                    iArr[0] = i;
                    objArr[0] = list.get(0);
                } else {
                    LogUtil.a("HiH_HiHealthNatApi", "insertHiHealthDataRun onResult errorCode:", Integer.valueOf(i), " datas:", list);
                }
                if (z) {
                    if (HiHealthNativeApi.this.m != null) {
                        HiHealthNativeApi.this.m.countDown();
                    }
                } else if (HiHealthNativeApi.this.j != null) {
                    HiHealthNativeApi.this.j.countDown();
                }
            }
        }, z);
    }

    private void a(HiDataInsertOption hiDataInsertOption, IHiHealth iHiHealth, IDataOperateListener.Stub stub, boolean z) throws RemoteException {
        if (z) {
            iHiHealth.insertRealTimeHiHealthData(hiDataInsertOption, stub);
            try {
                this.m.await(3L, TimeUnit.MINUTES);
            } catch (InterruptedException unused) {
                ReleaseLogUtil.e("HiH_HiHealthNatApi", "insertHiHealthDataApiAidl InterruptedException");
            }
            this.f = false;
            this.m = null;
            return;
        }
        iHiHealth.insertHiHealthData(hiDataInsertOption, stub);
        try {
            this.j.await(3L, TimeUnit.MINUTES);
        } catch (InterruptedException unused2) {
            ReleaseLogUtil.e("HiH_HiHealthNatApi", "insertHiHealthDataApiAidl InterruptedException");
        }
        this.i = false;
        this.j = null;
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void insertRealTimeHiHealthData(HiDataInsertOption hiDataInsertOption, HiDataOperateListener hiDataOperateListener) {
        b(hiDataInsertOption, hiDataOperateListener, true);
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void deleteHiHealthData(final HiDataDeleteOption hiDataDeleteOption, final HiDataOperateListener hiDataOperateListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=deleteHiHealthData enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.15
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiDataOperateListener hiDataOperateListener2 = hiDataOperateListener;
                    if (hiDataOperateListener2 != null) {
                        hiDataOperateListener2.onResult(1, "deleteHiHealthData bindservice exeception");
                        return;
                    }
                    return;
                }
                try {
                    iHiHealthA.deleteHiHealthData(hiDataDeleteOption, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.15.1
                        @Override // com.huawei.hihealth.IDataOperateListener
                        public void onResult(int i, List list) throws RemoteException {
                            if (list == null || list.isEmpty()) {
                                ReleaseLogUtil.b("HiH_HiHealthNatApi", "deleteHiHealthData onResult datas is null or empty");
                                if (hiDataOperateListener != null) {
                                    hiDataOperateListener.onResult(1, "result is null or empty delete data fail " + hiDataDeleteOption);
                                    return;
                                }
                                return;
                            }
                            Object obj = list.get(0);
                            if (hiDataOperateListener != null) {
                                hiDataOperateListener.onResult(i, obj);
                            }
                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "deleteHiHealthData cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "deleteHiHealthData Exception");
                    HiDataOperateListener hiDataOperateListener3 = hiDataOperateListener;
                    if (hiDataOperateListener3 != null) {
                        hiDataOperateListener3.onResult(1, "delete data fail" + hiDataDeleteOption);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void deleteAllKitHealthData(final int i, final HiDataOperateListener hiDataOperateListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=deleteAllKitHealthData enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.16
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiDataOperateListener hiDataOperateListener2 = hiDataOperateListener;
                    if (hiDataOperateListener2 != null) {
                        hiDataOperateListener2.onResult(1, "deleteAllKitHealthData bindservice exeception");
                        return;
                    }
                    return;
                }
                try {
                    iHiHealthA.deleteAllKitHealthData(i, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.16.1
                        @Override // com.huawei.hihealth.IDataOperateListener
                        public void onResult(int i2, List list) throws RemoteException {
                            if (list == null || list.isEmpty()) {
                                LogUtil.a("HiH_HiHealthNatApi", "deleteAllKitHealthData onResult datas is null or empty");
                                if (hiDataOperateListener != null) {
                                    hiDataOperateListener.onResult(1, "result is null or empty delete data fail " + i);
                                    return;
                                }
                                return;
                            }
                            Object obj = list.get(0);
                            if (hiDataOperateListener != null) {
                                hiDataOperateListener.onResult(i2, obj);
                            }
                            LogUtil.a("HiH_HiHealthNatApi", "deleteAllKitHealthData cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                    });
                } catch (Exception e2) {
                    LogUtil.c("HiH_HiHealthNatApi", "deleteAllKitHealthData Exception :", e2.getClass().getSimpleName());
                    HiDataOperateListener hiDataOperateListener3 = hiDataOperateListener;
                    if (hiDataOperateListener3 != null) {
                        hiDataOperateListener3.onResult(1, "delete data fail" + i);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void migrateBaseData(final HiDataOperateListener hiDataOperateListener) {
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=migrateBaseData enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(hiDataOperateListener);
            }
        });
    }

    /* synthetic */ void c(final HiDataOperateListener hiDataOperateListener) {
        IHiHealth iHiHealthA = a();
        if (iHiHealthA != null) {
            try {
                iHiHealthA.migrateBaseData(new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.17
                    @Override // com.huawei.hihealth.IDataOperateListener
                    public void onResult(int i, List list) throws RemoteException {
                        HiDataOperateListener hiDataOperateListener2 = hiDataOperateListener;
                        if (hiDataOperateListener2 != null) {
                            hiDataOperateListener2.onResult(i, list);
                        } else {
                            ReleaseLogUtil.e("HiH_HiHealthNatApi", "failed to onResult migrateBaseData, listener is null");
                        }
                    }
                });
            } catch (Exception unused) {
                ReleaseLogUtil.e("HiH_HiHealthNatApi", "migrateBaseData Exception");
                if (hiDataOperateListener != null) {
                    hiDataOperateListener.onResult(1, "migrateBaseData Exception");
                } else {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "failed to onResult migrateBaseData, listener is null");
                }
            }
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IStoreApi
    public void readHiHealthData(final HiDataReadOption hiDataReadOption, final HiDataReadResultListener hiDataReadResultListener) {
        this.n.execute(new ReadTask("readHiHealthData", hiDataReadOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.18
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiDataReadResultListener hiDataReadResultListener2 = hiDataReadResultListener;
                    if (hiDataReadResultListener2 != null) {
                        hiDataReadResultListener2.onResult(null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    final SparseArray sparseArray = new SparseArray();
                    final ArrayList arrayList = new ArrayList();
                    iHiHealthA.readHiHealthData(hiDataReadOption, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.18.1
                        @Override // com.huawei.hihealth.IDataReadResultListener
                        public void onResult(List list, int i, int i2) throws RemoteException {
                            if (hiDataReadResultListener == null) {
                                return;
                            }
                            if (HiDivideUtil.c(HiHealthNativeApi.this.g, list, new int[]{i, i2}, arrayList, sparseArray)) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiDataReadResultListener.onResult(sparseArray, i, i2);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "readHiHealthData option = ", hiDataReadOption, "errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        }
                    });
                } catch (Exception e2) {
                    LogApi logApiA = LogUtil.a();
                    if (logApiA != null) {
                        LogUtil.c("HiH_HiHealthNatApi", "readHiHealthData Exception", logApiA.logAnonymousException(e2));
                    }
                    HiDataReadResultListener hiDataReadResultListener3 = hiDataReadResultListener;
                    if (hiDataReadResultListener3 != null) {
                        hiDataReadResultListener3.onResult(null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void readHiHealthData(final int i, final HiDataReadOption hiDataReadOption, final HiDataReadResultListener hiDataReadResultListener) {
        this.n.execute(new ReadTask("readHiHealthData", hiDataReadOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.19
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiDataReadResultListener hiDataReadResultListener2 = hiDataReadResultListener;
                    if (hiDataReadResultListener2 != null) {
                        hiDataReadResultListener2.onResultIntent(i, null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final SparseArray sparseArray = new SparseArray();
                    final ArrayList arrayList = new ArrayList();
                    iHiHealthA.readHiHealthData(hiDataReadOption, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.19.1
                        @Override // com.huawei.hihealth.IDataReadResultListener
                        public void onResult(List list, int i2, int i3) throws RemoteException {
                            if (hiDataReadResultListener == null) {
                                return;
                            }
                            if (HiDivideUtil.c(HiHealthNativeApi.this.g, list, new int[]{i2, i3}, arrayList, sparseArray)) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiDataReadResultListener.onResultIntent(i, sparseArray, i2, i3);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "readHiHealthData errorCode is ", Integer.valueOf(i2), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "readHiHealthData readIntent Exception,readIntent = ", Integer.valueOf(i));
                    HiDataReadResultListener hiDataReadResultListener3 = hiDataReadResultListener;
                    if (hiDataReadResultListener3 != null) {
                        hiDataReadResultListener3.onResultIntent(i, null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void updateHiHealthData(final HiDataUpdateOption hiDataUpdateOption, final HiDataOperateListener hiDataOperateListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=updateHiHealthData enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.20
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiDataOperateListener hiDataOperateListener2 = hiDataOperateListener;
                    if (hiDataOperateListener2 != null) {
                        hiDataOperateListener2.onResult(0, false);
                        return;
                    }
                    return;
                }
                try {
                    iHiHealthA.updateHiHealthData(hiDataUpdateOption, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.20.1
                        @Override // com.huawei.hihealth.IDataOperateListener
                        public void onResult(int i, List list) throws RemoteException {
                            if (HiCommonUtil.b(list)) {
                                LogUtil.d("HiH_HiHealthNatApi", "updateHiHealthData onResult datas is null or empty");
                                if (hiDataOperateListener != null) {
                                    hiDataOperateListener.onResult(1, "result is null or empty update data fail " + hiDataUpdateOption);
                                    return;
                                }
                                return;
                            }
                            if (hiDataOperateListener != null) {
                                hiDataOperateListener.onResult(i, list.get(0));
                            }
                            LogUtil.a("HiH_HiHealthNatApi", "updateHiHealthData cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                    });
                } catch (Exception unused) {
                    LogUtil.c("HiH_HiHealthNatApi", "updateHiHealthData Exception");
                    HiDataOperateListener hiDataOperateListener3 = hiDataOperateListener;
                    if (hiDataOperateListener3 != null) {
                        hiDataOperateListener3.onResult(0, false);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public int addHiHealthDataCustomType(final String str) {
        if (str == null) {
            return 0;
        }
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=addHiHealthDataCustomType enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.21
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        iHiHealthA.addHiHealthDataCustomType(str);
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "addHiHealthDataCustomType Exception");
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public int fetchHiHealthDataCustomType(final String str) {
        if (str == null) {
            return 0;
        }
        this.n.execute(new ReadTask("fetchHiHealthDataCustomType", str) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.22
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        iHiHealthA.fetchHiHealthDataCustomType(str);
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "fetchHiHealthDataCustomType Exception");
                    }
                }
            }
        });
        return 0;
    }

    private void a(HiDeviceInfo hiDeviceInfo) {
        if (hiDeviceInfo == null || TextUtils.isEmpty(hiDeviceInfo.getDeviceName()) || hiDeviceInfo.getDeviceType() != 1 || hiDeviceInfo.getDeviceName().indexOf("HUAWEI WATCH GT") == -1) {
            return;
        }
        if (HiCommonUtil.d(this.g)) {
            LogUtil.a("HiH_HiHealthNatApi", "checkWatchGtDeviceType() for a release problem");
        } else {
            LogUtil.c("HiH_HiHealthNatApi", "checkWatchGtDeviceType() for a other problem");
            throw new IllegalArgumentException("checkWatchGtDeviceType() for a other problem");
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IDeviceApi
    public void registerDataClient(final HiDeviceInfo hiDeviceInfo, final List<Integer> list, final HiRegisterClientListener hiRegisterClientListener) {
        if (LogUtil.d() && "-1".equals(hiDeviceInfo.getDeviceUniqueCode()) && hiDeviceInfo.getDeviceType() == 10001) {
            throw new IllegalArgumentException("deviceInfo error");
        }
        if (LogUtil.d() && !"-1".equals(hiDeviceInfo.getDeviceUniqueCode()) && hiDeviceInfo.getDeviceType() == 1) {
            throw new IllegalArgumentException("deviceInfo error");
        }
        a(hiDeviceInfo);
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=registerDataClient 1 enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.23
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        ReleaseLogUtil.c("HiH_HiHealthNatApi", "registerDataClient start time = ", Long.valueOf(jCurrentTimeMillis));
                        iHiHealthA.registerDataClient(hiDeviceInfo, list, new IRegisterClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.23.1
                            @Override // com.huawei.hihealth.IRegisterClientListener
                            public void onResult(HiHealthClient hiHealthClient) throws RemoteException {
                                if (hiRegisterClientListener != null) {
                                    hiRegisterClientListener.onResult(hiHealthClient);
                                }
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "registerDataClient cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            }
                        });
                        return;
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiHealthNatApi", "registerDataClient Exception");
                        HiRegisterClientListener hiRegisterClientListener2 = hiRegisterClientListener;
                        if (hiRegisterClientListener2 != null) {
                            hiRegisterClientListener2.onResult(null);
                            return;
                        }
                        return;
                    }
                }
                HiRegisterClientListener hiRegisterClientListener3 = hiRegisterClientListener;
                if (hiRegisterClientListener3 != null) {
                    hiRegisterClientListener3.onResult(null);
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IDeviceApi
    public void registerDataClient(final HiDeviceInfo hiDeviceInfo, final HiUserInfo hiUserInfo, final List<Integer> list, final HiRegisterClientListener hiRegisterClientListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=registerDataClient 2 enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.24
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiRegisterClientListener hiRegisterClientListener2 = hiRegisterClientListener;
                    if (hiRegisterClientListener2 != null) {
                        hiRegisterClientListener2.onResult(null);
                        return;
                    }
                    return;
                }
                try {
                    iHiHealthA.registerDataClientWithUserInfo(hiDeviceInfo, hiUserInfo, list, new IRegisterClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.24.1
                        @Override // com.huawei.hihealth.IRegisterClientListener
                        public void onResult(HiHealthClient hiHealthClient) throws RemoteException {
                            if (hiRegisterClientListener != null) {
                                hiRegisterClientListener.onResult(hiHealthClient);
                            }
                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "registerDataClient cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "registerDataClientWithUserInfo Exception");
                    HiRegisterClientListener hiRegisterClientListener3 = hiRegisterClientListener;
                    if (hiRegisterClientListener3 != null) {
                        hiRegisterClientListener3.onResult(null);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchBuildInDataClient(final HiDataClientListener hiDataClientListener) {
        if (hiDataClientListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchBuildInDataClient listener null");
        } else {
            this.n.execute(new ReadTask("fetchBuildInDataClient", hiDataClientListener) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.25
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataClientListener.onResult(null);
                        return;
                    }
                    try {
                        iHiHealthA.fetchBuildInDataClient(new IDataClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.25.1
                            @Override // com.huawei.hihealth.IDataClientListener
                            public void onResult(List list) throws RemoteException {
                                hiDataClientListener.onResult(list);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                LogUtil.a("HiH_HiHealthNatApi", "fetchBuildInDataClient, totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
                            }
                        });
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "fetchBuildInDataClient Exception");
                        hiDataClientListener.onResult(null);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchManualDataClient(final HiDataClientListener hiDataClientListener) {
        if (hiDataClientListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchManualDataClient listener null");
        } else {
            this.n.execute(new ReadTask("fetchManualDataClient", hiDataClientListener) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.26
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataClientListener.onResult(null);
                        return;
                    }
                    try {
                        iHiHealthA.fetchManualDataClient(new IDataClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.26.1
                            @Override // com.huawei.hihealth.IDataClientListener
                            public void onResult(List list) throws RemoteException {
                                hiDataClientListener.onResult(list);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchManualDataClient, totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
                            }
                        });
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiHealthNatApi", "fetchManualDataClient Exception");
                        hiDataClientListener.onResult(null);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchPhoneDataClient(final HiDataClientListener hiDataClientListener) {
        if (hiDataClientListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchPhoneDataClient listener null");
            return;
        }
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=fetchPhoneDataClient enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.27
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    hiDataClientListener.onResult(null);
                    return;
                }
                try {
                    iHiHealthA.fetchPhoneDataClient(new IDataClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.27.1
                        @Override // com.huawei.hihealth.IDataClientListener
                        public void onResult(List list) throws RemoteException {
                            hiDataClientListener.onResult(list);
                            ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchPhoneDataClient cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "fetchPhoneDataClient Exception");
                    hiDataClientListener.onResult(null);
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchRegisteredDataClient(final int i, final HiDataClientListener hiDataClientListener) {
        if (hiDataClientListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchRegisteredDataClient listener null");
        } else {
            this.n.execute(new ReadTask("fetchRegisteredDataClient", Integer.valueOf(i)) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.28
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataClientListener.onResult(null);
                        return;
                    }
                    try {
                        iHiHealthA.fetchRegisteredDataClient(i, new IDataClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.28.1
                            @Override // com.huawei.hihealth.IDataClientListener
                            public void onResult(List list) throws RemoteException {
                                hiDataClientListener.onResult(list);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchRegisteredDataClient, totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
                            }
                        });
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiHealthNatApi", "fetchRegisteredDataClient Exception");
                        hiDataClientListener.onResult(null);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IDeviceApi
    public void fetchDataClientByUniqueId(final int i, final String str, final HiDataClientListener hiDataClientListener) {
        if (hiDataClientListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchDataClientByUniqueID listener null");
        } else {
            this.n.execute(new ReadTask("fetchDataClientByUniqueID", Integer.valueOf(i)) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.29
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataClientListener.onResult(null);
                        return;
                    }
                    try {
                        iHiHealthA.fetchDataClientByUniqueID(i, str, new IDataClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.29.1
                            @Override // com.huawei.hihealth.IDataClientListener
                            public void onResult(List list) throws RemoteException {
                                hiDataClientListener.onResult(list);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchDataClientByUniqueID, totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
                            }
                        });
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiHealthNatApi", "fetchDataClientByUniqueID Exception");
                        hiDataClientListener.onResult(null);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public HiHealthUnit fetchPreferUnit(final int i) {
        this.n.execute(new ReadTask("fetchPreferUnit", Integer.valueOf(i)) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.30
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        iHiHealthA.fetchPreferUnit(i);
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "fetchPreferUnit Exception");
                    }
                }
            }
        });
        return null;
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void setPreferUnit(final int i, final HiHealthUnit hiHealthUnit) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=setPreferUnit enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.31
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        iHiHealthA.setPreferUnit(i, hiHealthUnit);
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "setPreferUnit Exception");
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.IDeviceApi
    public void fetchDataSourceByType(final int i, final HiTimeInterval hiTimeInterval, final HiDataClientListener hiDataClientListener) {
        if (hiDataClientListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchDataSourceByType listener null");
        } else {
            this.n.execute(new ReadTask("fetchDataSourceByType", Integer.valueOf(i)) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.32
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataClientListener.onResult(null);
                        return;
                    }
                    try {
                        iHiHealthA.fetchDataSourceByType(i, hiTimeInterval, new IDataClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.32.1
                            @Override // com.huawei.hihealth.IDataClientListener
                            public void onResult(List list) throws RemoteException {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiDataClientListener.onResult(list);
                                int i2 = i;
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchDataSourceByType type = ", Integer.valueOf(i2), ", timeInterval = ", hiTimeInterval, ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        });
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiHealthNatApi", "fetchDataSourceByType Exception");
                        hiDataClientListener.onResult(null);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchDataSourceByTypes(final List<Integer> list, final HiTimeInterval hiTimeInterval, final boolean z, final HiMultiDataClientListener hiMultiDataClientListener) {
        if (hiMultiDataClientListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchDataSourceByTypes listener null");
        } else {
            this.n.execute(new ReadTask("fetchDataSourceByTypes", list) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.33
                private void e() {
                    if (z) {
                        hiMultiDataClientListener.onMergeTypeResult(null);
                    } else {
                        hiMultiDataClientListener.onMultiTypeResult(null);
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        e();
                        return;
                    }
                    try {
                        iHiHealthA.fetchDataSourceByTypes(list, hiTimeInterval, z, new IMultiDataClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.33.1
                            @Override // com.huawei.hihealth.IMultiDataClientListener
                            public void onMultiTypeResult(Map map) throws RemoteException {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiMultiDataClientListener.onMultiTypeResult(map);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchDataSourceByTypes type = ", HiJsonUtil.d(list), ", timeInterval = ", hiTimeInterval, ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()));
                            }

                            @Override // com.huawei.hihealth.IMultiDataClientListener
                            public void onMergeTypeResult(List list2) throws RemoteException {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiMultiDataClientListener.onMergeTypeResult(list2);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchDataSourceByTypes type = ", HiJsonUtil.d(list), ", timeInterval = ", hiTimeInterval, ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()));
                            }
                        });
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiHealthNatApi", "fetchDataSourceByTypes Exception");
                        e();
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void setUserData(final HiUserInfo hiUserInfo, final HiCommonListener hiCommonListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=setUserData enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.34
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiCommonListener hiCommonListener2 = hiCommonListener;
                    if (hiCommonListener2 != null) {
                        hiCommonListener2.onFailure(1, "setUserData bindService exception");
                        return;
                    }
                    return;
                }
                try {
                    iHiHealthA.setUserData(hiUserInfo, new ICommonListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.34.1
                        @Override // com.huawei.hihealth.ICommonListener
                        public void onSuccess(int i, List list) throws RemoteException {
                            if (HiCommonUtil.b(list)) {
                                LogUtil.d("HiH_HiHealthNatApi", "setUserData onSuccess datas is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "setUserData onSuccess datas empty");
                                    return;
                                }
                                return;
                            }
                            Object obj = list.get(0);
                            if (hiCommonListener != null) {
                                hiCommonListener.onSuccess(i, obj);
                            }
                        }

                        @Override // com.huawei.hihealth.ICommonListener
                        public void onFailure(int i, List list) throws RemoteException {
                            if (HiCommonUtil.b(list)) {
                                LogUtil.d("HiH_HiHealthNatApi", "setUserData onFailure errMsg is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "setUserData onFailure errMsg empty");
                                    return;
                                }
                                return;
                            }
                            if (hiCommonListener != null) {
                                hiCommonListener.onFailure(i, list.get(0));
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j = jCurrentTimeMillis;
                            LogUtil.a("HiH_HiHealthNatApi", "setUserData fail, cost time = ", Long.valueOf(jCurrentTimeMillis2 - j), " errMsg = ", list.get(0));
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "setUserData Exception");
                    HiCommonListener hiCommonListener3 = hiCommonListener;
                    if (hiCommonListener3 != null) {
                        hiCommonListener3.onFailure(1, "setUserData Exception");
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi, com.huawei.hihealth.api.UserInfoApi
    public void fetchUserData(final HiCommonListener hiCommonListener) {
        if (hiCommonListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchUserData listener null");
        } else {
            this.n.execute(new ReadTask("fetchUserData", hiCommonListener) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.35
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiCommonListener.onFailure(1, "fetchUserData bindService exception");
                        return;
                    }
                    try {
                        iHiHealthA.fetchUserData(new ICommonListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.35.1
                            @Override // com.huawei.hihealth.ICommonListener
                            public void onSuccess(int i, List list) throws RemoteException {
                                hiCommonListener.onSuccess(i, list);
                            }

                            @Override // com.huawei.hihealth.ICommonListener
                            public void onFailure(int i, List list) throws RemoteException {
                                if (HiCommonUtil.b(list)) {
                                    ReleaseLogUtil.b("HiH_HiHealthNatApi", "fetchUserData onFailure errMsg is null or empty");
                                    if (hiCommonListener != null) {
                                        hiCommonListener.onFailure(1, "fetchUserData onFailure errMsg empty");
                                        return;
                                    }
                                    return;
                                }
                                hiCommonListener.onFailure(i, list.get(0));
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                long j = jCurrentTimeMillis;
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchUserData fail, cost time = ", Long.valueOf(jCurrentTimeMillis2 - j), " errMsg = ", list.get(0));
                            }
                        });
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiHealthNatApi", "fetchUserData Exception");
                        hiCommonListener.onFailure(1, "fetchUserData Exception");
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void synCloud(final HiSyncOption hiSyncOption, final HiCommonListener hiCommonListener) {
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=synCloud enter!", hiSyncOption);
        if (hiSyncOption.getSyncDataType() == 20000 && HiCommonUtil.d()) {
            ReleaseLogUtil.c("HiH_HiHealthNatApi", "syncCloud too frequent in background.");
            if (hiCommonListener != null) {
                hiCommonListener.onFailure(28, "synCloud too frequent in background.");
                return;
            }
            return;
        }
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        if (TextUtils.isEmpty(hiSyncOption.getStackTrace())) {
            hiSyncOption.setStackTrace(e());
        }
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.36
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiCommonListener hiCommonListener2 = hiCommonListener;
                    if (hiCommonListener2 != null) {
                        hiCommonListener2.onFailure(1, "synCloud bindService exception");
                        return;
                    }
                    return;
                }
                try {
                    iHiHealthA.synCloud(hiSyncOption, null);
                    ReleaseLogUtil.c("HiH_HiHealthNatApi", "synCloud cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "synCloud Exception");
                    HiCommonListener hiCommonListener3 = hiCommonListener;
                    if (hiCommonListener3 != null) {
                        hiCommonListener3.onFailure(1, "synCloud Exception");
                    }
                }
            }
        });
    }

    private String e() {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            sb.append(" at ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void checkDataStatus(final List<Integer> list, final HiCommonListener hiCommonListener) {
        this.n.execute(new ReadTask("checkDataStatus", list) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.37
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiCommonListener hiCommonListener2 = hiCommonListener;
                    if (hiCommonListener2 != null) {
                        hiCommonListener2.onFailure(1, "checkDataStatus bindService exception");
                        return;
                    }
                    return;
                }
                try {
                    iHiHealthA.checkDataStatus(list, new ICommonListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.37.1
                        @Override // com.huawei.hihealth.ICommonListener
                        public void onSuccess(int i, List list2) throws RemoteException {
                            if (HiCommonUtil.b(list2)) {
                                LogUtil.d("HiH_HiHealthNatApi", "checkDataStatus onSuccess data is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "checkDataStatus onSuccess data empty");
                                    return;
                                }
                                return;
                            }
                            if (hiCommonListener != null) {
                                hiCommonListener.onSuccess(i, list2.get(0));
                            }
                        }

                        @Override // com.huawei.hihealth.ICommonListener
                        public void onFailure(int i, List list2) throws RemoteException {
                            if (HiCommonUtil.b(list2)) {
                                LogUtil.d("HiH_HiHealthNatApi", "checkDataStatus onFailure errMsg is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "checkDataStatus onFailure errMsg empty");
                                    return;
                                }
                                return;
                            }
                            if (hiCommonListener != null) {
                                hiCommonListener.onFailure(i, list2.get(0));
                            }
                        }
                    });
                } catch (Exception unused) {
                    LogUtil.c("HiH_HiHealthNatApi", "checkDataStatus Exception");
                    HiCommonListener hiCommonListener3 = hiCommonListener;
                    if (hiCommonListener3 != null) {
                        hiCommonListener3.onFailure(1, "checkDataStatus exception");
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void synCloudCancel() {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=synCloudCancel enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.38
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        iHiHealthA.synCloudCancel();
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "synCloudCancel Exception");
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void hiLogin(final HiAccountInfo hiAccountInfo, final HiCommonListener hiCommonListener) {
        this.l.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.39
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiCommonListener hiCommonListener2 = hiCommonListener;
                    if (hiCommonListener2 != null) {
                        hiCommonListener2.onFailure(1, "hiLogin bindService Exception");
                        return;
                    }
                    return;
                }
                try {
                    LogUtil.a("HiH_HiHealthNatApi", "hiLogin() start");
                    iHiHealthA.hiLogin(hiAccountInfo, new ICommonListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.39.1
                        @Override // com.huawei.hihealth.ICommonListener
                        public void onSuccess(int i, List list) throws RemoteException {
                            if (HiCommonUtil.b(list)) {
                                LogUtil.d("HiH_HiHealthNatApi", "hiLogin onSuccess datas is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "hiLogin onSuccess datas empty");
                                    return;
                                }
                                return;
                            }
                            if (hiCommonListener != null) {
                                hiCommonListener.onSuccess(i, list.get(0));
                            }
                        }

                        @Override // com.huawei.hihealth.ICommonListener
                        public void onFailure(int i, List list) throws RemoteException {
                            if (HiCommonUtil.b(list)) {
                                LogUtil.d("HiH_HiHealthNatApi", "hiLogin onFailure errMsg is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "hiLogin onFailure errMsg empty");
                                    return;
                                }
                                return;
                            }
                            if (hiCommonListener != null) {
                                hiCommonListener.onFailure(i, list.get(0));
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j = jCurrentTimeMillis;
                            LogUtil.a("HiH_HiHealthNatApi", "hiLogin fail, cost time = ", Long.valueOf(jCurrentTimeMillis2 - j), " errMsg = ", list.get(0));
                        }
                    });
                } catch (Exception e2) {
                    ReleaseLogUtil.e("R_HiH_HiHealthNatApi", "hiLogin Exception", ExceptionUtils.c(e2));
                    HiCommonListener hiCommonListener3 = hiCommonListener;
                    if (hiCommonListener3 != null) {
                        hiCommonListener3.onFailure(1, "hiLogin Exception");
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void hiLogout(final HiCommonListener hiCommonListener) {
        this.l.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.40
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiCommonListener hiCommonListener2 = hiCommonListener;
                    if (hiCommonListener2 != null) {
                        hiCommonListener2.onFailure(1, "hiLogout bindService Exception");
                        return;
                    }
                    return;
                }
                try {
                    LogUtil.a("HiH_HiHealthNatApi", "hiLogout() start");
                    iHiHealthA.hiLogout(new ICommonListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.40.1
                        @Override // com.huawei.hihealth.ICommonListener
                        public void onSuccess(int i, List list) throws RemoteException {
                            if (HiCommonUtil.b(list)) {
                                LogUtil.d("HiH_HiHealthNatApi", "hiLogout onSuccess data is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "hiLogout onSuccess data empty");
                                    return;
                                }
                                return;
                            }
                            if (hiCommonListener != null) {
                                hiCommonListener.onSuccess(i, list.get(0));
                            }
                        }

                        @Override // com.huawei.hihealth.ICommonListener
                        public void onFailure(int i, List list) throws RemoteException {
                            if (HiCommonUtil.b(list)) {
                                LogUtil.d("HiH_HiHealthNatApi", "hiLogout onFailure errMsg is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "hiLogout onFailure errMsg empty");
                                    return;
                                }
                                return;
                            }
                            if (hiCommonListener != null) {
                                hiCommonListener.onFailure(i, list.get(0));
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j = jCurrentTimeMillis;
                            LogUtil.a("HiH_HiHealthNatApi", "hiLogout fail, cost time = ", Long.valueOf(jCurrentTimeMillis2 - j), " errMsg = ", list.get(0));
                        }
                    });
                } catch (Exception e2) {
                    ReleaseLogUtil.e("R_HiH_HiHealthNatApi", "hiLogout Exception", ExceptionUtils.c(e2));
                    HiCommonListener hiCommonListener3 = hiCommonListener;
                    if (hiCommonListener3 != null) {
                        hiCommonListener3.onFailure(1, "hiLogout Exception");
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchAccountInfo(final HiCommonListener hiCommonListener) {
        if (hiCommonListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchAccountInfo listener null");
        } else {
            this.n.execute(new ReadTask("fetchAccountInfo", hiCommonListener) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.41
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiCommonListener.onFailure(1, "fetchAccountInfo bind service Exception");
                        return;
                    }
                    try {
                        iHiHealthA.fetchAccountInfo(new ICommonListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.41.1
                            @Override // com.huawei.hihealth.ICommonListener
                            public void onSuccess(int i, List list) throws RemoteException {
                                if (HiCommonUtil.b(list)) {
                                    LogUtil.d("HiH_HiHealthNatApi", "fetchAccountInfo onSuccess datas is null or empty");
                                    if (hiCommonListener != null) {
                                        hiCommonListener.onFailure(1, "fetchAccountInfo onSuccess data empty");
                                        return;
                                    }
                                    return;
                                }
                                hiCommonListener.onSuccess(i, list.get(0));
                                LogUtil.a("HiH_HiHealthNatApi", "fetchAccountInfo success, cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            }

                            @Override // com.huawei.hihealth.ICommonListener
                            public void onFailure(int i, List list) throws RemoteException {
                                if (HiCommonUtil.b(list)) {
                                    LogUtil.d("HiH_HiHealthNatApi", "fetchAccountInfo onFailure errMsg is null or empty");
                                    if (hiCommonListener != null) {
                                        hiCommonListener.onFailure(1, "fetchAccountInfo onFailure errMsg empty");
                                        return;
                                    }
                                    return;
                                }
                                hiCommonListener.onFailure(i, list.get(0));
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                long j = jCurrentTimeMillis;
                                LogUtil.a("HiH_HiHealthNatApi", "fetchAccountInfo fail, cost time = ", Long.valueOf(jCurrentTimeMillis2 - j), " errMsg = ", list.get(0));
                            }
                        });
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "fetchAccountInfo Exception");
                        hiCommonListener.onFailure(1, "fetchAccountInfo Exception");
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void setGoalInfo(final int i, final List<HiGoalInfo> list, final HiCommonListener hiCommonListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=setGoalInfo enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.42
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiCommonListener hiCommonListener2 = hiCommonListener;
                    if (hiCommonListener2 != null) {
                        hiCommonListener2.onFailure(1, "setGoalInfo bindService Exception");
                        return;
                    }
                    return;
                }
                try {
                    iHiHealthA.setGoalInfo(i, list, new ICommonListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.42.1
                        @Override // com.huawei.hihealth.ICommonListener
                        public void onSuccess(int i2, List list2) throws RemoteException {
                            if (HiCommonUtil.b(list2)) {
                                LogUtil.d("HiH_HiHealthNatApi", "setGoalInfo onSuccess datas is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "setGoalInfo onSuccess data empty");
                                    return;
                                }
                                return;
                            }
                            if (hiCommonListener != null) {
                                hiCommonListener.onSuccess(i2, list2.get(0));
                            }
                        }

                        @Override // com.huawei.hihealth.ICommonListener
                        public void onFailure(int i2, List list2) throws RemoteException {
                            if (HiCommonUtil.b(list2)) {
                                LogUtil.d("HiH_HiHealthNatApi", "setGoalInfo onFailure errMsg is null or empty");
                                if (hiCommonListener != null) {
                                    hiCommonListener.onFailure(1, "setGoalInfo onFailure errMsg empty");
                                    return;
                                }
                                return;
                            }
                            if (hiCommonListener != null) {
                                hiCommonListener.onFailure(i2, list2.get(0));
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j = jCurrentTimeMillis;
                            LogUtil.a("HiH_HiHealthNatApi", "setGoalInfo fail, cost time = ", Long.valueOf(jCurrentTimeMillis2 - j), " errMsg = ", list2.get(0));
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "setGoalInfo Exception");
                    HiCommonListener hiCommonListener3 = hiCommonListener;
                    if (hiCommonListener3 != null) {
                        hiCommonListener3.onFailure(1, "setGoalInfo Exception");
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchGoalInfo(final int i, final int i2, final HiCommonListener hiCommonListener) {
        if (hiCommonListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchGoalInfo listener null");
        } else {
            this.n.execute(new ReadTask("fetchGoalInfo", Integer.valueOf(i2)) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.43
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiCommonListener.onFailure(1, "fetchGoalInfo bindservice Exception");
                        return;
                    }
                    try {
                        iHiHealthA.fetchGoalInfo(i, i2, new ICommonListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.43.1
                            @Override // com.huawei.hihealth.ICommonListener
                            public void onSuccess(int i3, List list) throws RemoteException {
                                hiCommonListener.onSuccess(i3, list);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchGoalInfo, totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            }

                            @Override // com.huawei.hihealth.ICommonListener
                            public void onFailure(int i3, List list) throws RemoteException {
                                if (HiCommonUtil.b(list)) {
                                    LogUtil.d("HiH_HiHealthNatApi", "fetchGoalInfo onFailure errMsg is null or empty");
                                    if (hiCommonListener != null) {
                                        hiCommonListener.onFailure(1, "fetchGoalInfo onFailure errMsg empty");
                                        return;
                                    }
                                    return;
                                }
                                hiCommonListener.onFailure(i3, list.get(0));
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                long j = jCurrentTimeMillis;
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "fetchGoalInfo fail, cost time = ", Long.valueOf(jCurrentTimeMillis2 - j), " errMsg = ", list.get(0));
                            }
                        });
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiHealthNatApi", "fetchGoalInfo Exception");
                        hiCommonListener.onFailure(1, "fetchGoalInfo Exception");
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public boolean setUserPreference(HiUserPreference hiUserPreference) {
        return setUserPreference(hiUserPreference, false);
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public boolean setUserPreference(final HiUserPreference hiUserPreference, final boolean z) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            LogUtil.c("HiH_HiHealthNatApi", "setUserPreference can't be called in main thread isNeedNotifyChange = ", Boolean.valueOf(z));
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=insertFitnessData enter!", Boolean.valueOf(z));
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(zArr, hiUserPreference, z, countDownLatch);
            }
        });
        try {
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            LogUtil.c("HiH_HiHealthNatApi", "getUP InterruptedException keys = ", e2.getMessage());
        }
        return zArr[0];
    }

    /* synthetic */ void a(boolean[] zArr, HiUserPreference hiUserPreference, boolean z, CountDownLatch countDownLatch) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        IHiHealth iHiHealthA = a();
        if (iHiHealthA != null) {
            try {
                zArr[0] = iHiHealthA.setUserPreference(hiUserPreference, z);
            } catch (Exception e2) {
                LogUtil.c("HiH_HiHealthNatApi", "setUserPreference Exception:", e2.getMessage());
            }
        }
        boolean z2 = zArr[0];
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        LogUtil.a("HiH_HiHealthNatApi", "setUserPreference result = ", Boolean.valueOf(z2), ",totalTime = ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), " key ", hiUserPreference.getKey());
        countDownLatch.countDown();
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    @Deprecated
    public HiUserPreference getUserPreference(String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        List<HiUserPreference> userPreferenceList = getUserPreferenceList(arrayList);
        if (HiCommonUtil.b(userPreferenceList)) {
            return new HiUserPreference();
        }
        return userPreferenceList.get(0);
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public List<HiUserPreference> getUserPreferenceList(final List<String> list) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            LogUtil.c("HiH_HiHealthNatApi", "getUP can't be called in main thread keys = ", list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final List<HiUserPreference>[] listArr = {new ArrayList(1)};
        this.t.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.44
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HiH_HiHealthNatApi", "gUP Do");
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA != null) {
                    try {
                        listArr[0] = iHiHealthA.getUserPreferenceList(list);
                    } catch (Exception e2) {
                        LogUtil.c("HiH_HiHealthNatApi", "gUP Exception keys = ", list, e2.getMessage());
                    }
                    LogUtil.a("HiH_HiHealthNatApi", "gUP cD keys=", list);
                } else {
                    LogUtil.d("HiH_HiHealthNatApi", "gUP hiHealthApiAidl=null");
                }
                countDownLatch.countDown();
                LogUtil.a("HiH_HiHealthNatApi", "gUP Done");
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.c("HiH_HiHealthNatApi", "gUP InterruptedException keys = ", list);
        }
        LogUtil.a("HiH_HiHealthNatApi", "gUP tlTm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return listArr[0];
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public boolean checkHiHealthServiceExist() {
        Intent intent = new Intent("com.huawei.hihealthservice.HiHealthService");
        intent.setPackage(HuaweiHealth.c());
        List<ResolveInfo> listQueryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.size() != 1) {
            LogUtil.d("HiH_HiHealthNatApi", "checkHiHealthServiceExist() resolveInfo == null || resolveInfo.size () != 1 false ");
            return false;
        }
        LogUtil.a("HiH_HiHealthNatApi", "checkHiHealthServiceExist() true");
        return true;
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public boolean checkHiHealthLogin(String str) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            LogUtil.c("HiH_HiHealthNatApi", "checkHiHealthLogin can't be called in main thread");
        }
        boolean zCheckHiHealthLogin = false;
        if (HiCommonUtil.a(str)) {
            LogUtil.d("HiH_HiHealthNatApi", "checkHiHealthLogin huid = null");
            return false;
        }
        LogUtil.e("HiH_HiHealthNatApi", "checkHiHealthLogin");
        long jCurrentTimeMillis = System.currentTimeMillis();
        IHiHealth iHiHealthA = a();
        if (iHiHealthA != null) {
            try {
                zCheckHiHealthLogin = iHiHealthA.checkHiHealthLogin(str);
            } catch (Exception unused) {
                LogUtil.c("HiH_HiHealthNatApi", "checkHiHealthLogin Exception");
            }
        }
        LogUtil.a("HiH_HiHealthNatApi", "checkHiHealthLogin login = ", Boolean.valueOf(zCheckHiHealthLogin), ", totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return zCheckHiHealthLogin;
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public int getHiHealthVersionCode() {
        int hiHealthVersionCode;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            LogUtil.c("HiH_HiHealthNatApi", "getHiHealthVersionCode can't be called in main thread");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        IHiHealth iHiHealthA = a();
        if (iHiHealthA != null) {
            try {
                hiHealthVersionCode = iHiHealthA.getHiHealthVersionCode();
            } catch (Exception unused) {
                LogUtil.c("HiH_HiHealthNatApi", "getHiHealthVersionCode Exception");
                hiHealthVersionCode = -1;
            }
        } else {
            hiHealthVersionCode = -1;
        }
        LogUtil.a("HiH_HiHealthNatApi", "getHiHealthVersion version = ", Integer.valueOf(hiHealthVersionCode), ", totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return hiHealthVersionCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("HiH_HiHealthNatApi", "registerMyBroadcast()");
        if (HuaweiHealth.c().equals(this.g.getPackageName())) {
            this.h = true;
            HiBroadcastManager.e(this.g, this.f12035a, HiBroadcastAction.d());
        }
    }

    private void j() {
        LogUtil.a("HiH_HiHealthNatApi", "unregisterMyBroadcast()");
        if (HuaweiHealth.c().equals(this.g.getPackageName()) && this.h) {
            this.h = false;
            HiBroadcastManager.d(this.g, this.f12035a);
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void readDeviceInfo(final HiDataHiDeviceInfoListener hiDataHiDeviceInfoListener) {
        if (hiDataHiDeviceInfoListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "readDeviceInfo listener null");
        } else {
            this.n.execute(new ReadTask("readDeviceInfo", hiDataHiDeviceInfoListener) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.45
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataHiDeviceInfoListener.onResult(null);
                        return;
                    }
                    try {
                        iHiHealthA.readDeviceInfo(new IDataHiDeviceInfoListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.45.1
                            @Override // com.huawei.hihealth.IDataHiDeviceInfoListener
                            public void onResult(List list) throws RemoteException {
                                hiDataHiDeviceInfoListener.onResult(list);
                            }
                        });
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "readHiHealthData Exception");
                        hiDataHiDeviceInfoListener.onResult(null);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void queryKitAppInfo(final HiDataOperateListener hiDataOperateListener) {
        if (hiDataOperateListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "queryKitAppInfo listener null");
        } else {
            this.n.execute(new ReadTask("queryKitAppInfo", hiDataOperateListener) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.46
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataOperateListener.onResult(1, new ArrayList(10));
                        return;
                    }
                    try {
                        iHiHealthA.queryKitAppInfo(new InnerDataReadResultListener(hiDataOperateListener));
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "queryKitAppInfo Exception");
                        hiDataOperateListener.onResult(1, new ArrayList(10));
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void queryHealthKitPermission(final int i, final HiDataOperateListener hiDataOperateListener) {
        if (hiDataOperateListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "queryHealthKitPermission listener null");
        } else {
            this.l.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.47
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataOperateListener.onResult(1, new ArrayList(10));
                        return;
                    }
                    try {
                        iHiHealthA.queryHealthKitPermission(i, new InnerDataReadResultListener(hiDataOperateListener));
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "queryHealthKitPermission Exception");
                        hiDataOperateListener.onResult(1, new ArrayList(10));
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void updateHealthKitPermission(final int i, final int i2, final int i3, final boolean z, final HiDataOperateListener hiDataOperateListener) {
        if (hiDataOperateListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "updateHealthKitPermission listener null");
        } else {
            this.l.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.48
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataOperateListener.onResult(1, new ArrayList(10));
                        return;
                    }
                    try {
                        iHiHealthA.updateHealthKitPermission(i, i2, i3, z, new InnerDataReadResultListener(hiDataOperateListener));
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "updateHealthKitPermission Exception");
                        hiDataOperateListener.onResult(1, new ArrayList(10));
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void queryWearKitAppInfo(final HiDataOperateListener hiDataOperateListener) {
        if (hiDataOperateListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "queryKitAppInfo listener null");
        } else {
            this.n.execute(new ReadTask("queryWearKitAppInfo", hiDataOperateListener) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.49
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataOperateListener.onResult(1, new ArrayList(10));
                        return;
                    }
                    try {
                        iHiHealthA.queryWearKitAppInfo(new InnerDataReadResultListener(hiDataOperateListener));
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "queryKitAppInfo Exception");
                        hiDataOperateListener.onResult(1, Collections.EMPTY_LIST);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void queryWearKitPermission(final int i, final HiDataOperateListener hiDataOperateListener) {
        if (hiDataOperateListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "queryWearKitPermission listener null");
        } else {
            this.l.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.50
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataOperateListener.onResult(1, new ArrayList(10));
                        return;
                    }
                    try {
                        iHiHealthA.queryWearKitPermission(i, new InnerDataReadResultListener(hiDataOperateListener));
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "queryWearKitPermission Exception");
                        hiDataOperateListener.onResult(1, Collections.EMPTY_LIST);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void updateWearKitPermission(final int i, final int i2, final boolean z, final HiDataOperateListener hiDataOperateListener) {
        if (hiDataOperateListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "updateWearKitPermission listener null");
        } else {
            this.l.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.51
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataOperateListener.onResult(1, new ArrayList(10));
                        return;
                    }
                    try {
                        iHiHealthA.updateWearKitPermission(i, i2, z, new InnerDataReadResultListener(hiDataOperateListener));
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "updateWearKitPermission Exception");
                        hiDataOperateListener.onResult(1, Collections.EMPTY_LIST);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void setBinder(final String str, final IBinder iBinder, final HiCommonListener hiCommonListener) {
        if (hiCommonListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "setBinder listener null");
        } else if (!TextUtils.isEmpty(str)) {
            LogUtil.a("HiH_HiHealthNatApi", "setBinder, tag = ", str);
            this.l.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.52
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiCommonListener.onFailure(1, "HiHealthNativeApi.setBinder: hiHealthApiAidl == null");
                        return;
                    }
                    try {
                        iHiHealthA.setBinder(str, iBinder, new ICommonCallback.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.52.1
                            @Override // com.huawei.hihealth.ICommonCallback
                            public void onResult(int i, String str2) throws RemoteException {
                                hiCommonListener.onSuccess(i, str2);
                                LogUtil.a("HiH_HiHealthNatApi", "setBinder errorCode = ", Integer.valueOf(i));
                            }
                        });
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "setBinder Exception");
                        hiCommonListener.onFailure(1, "HiHealthNativeApi.setBinder: exception occurs when call hiHealthApiAidl.setBinder");
                    }
                }
            });
        } else {
            hiCommonListener.onFailure(1, "HiHealthNativeApi.setBinder: tag can't be null or empty");
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchSportTypeList(final HiDataReadOption hiDataReadOption, final HiCommonListener hiCommonListener) {
        if (hiCommonListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fechSportTypeList listener is null");
        } else {
            this.n.execute(new ReadTask("fetchSportTypeList", hiDataReadOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.53
                @Override // java.lang.Runnable
                public void run() {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiCommonListener.onFailure(1, "fetchSportTypeList bindService exception");
                        return;
                    }
                    try {
                        iHiHealthA.fetchSportTypeList(hiDataReadOption, new ICommonListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.53.1
                            @Override // com.huawei.hihealth.ICommonListener
                            public void onSuccess(int i, List list) throws RemoteException {
                                hiCommonListener.onSuccess(i, list);
                                LogUtil.a("HiH_HiHealthNatApi", "fetchSportTypeList, totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            }

                            @Override // com.huawei.hihealth.ICommonListener
                            public void onFailure(int i, List list) throws RemoteException {
                                if (HiCommonUtil.b(list)) {
                                    LogUtil.d("HiH_HiHealthNatApi", "fetchSportTypeList onResult datas is null or empty");
                                    hiCommonListener.onFailure(1, "result is null or empty fetchSportTypeList data fail " + hiDataReadOption);
                                    return;
                                }
                                hiCommonListener.onFailure(i, list.get(0));
                                LogUtil.a("HiH_HiHealthNatApi", "fetchSportTypeList fail, cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), " errCode = ", Integer.valueOf(i));
                            }
                        });
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "fetchSportTypeList Exception");
                        hiCommonListener.onFailure(1, "fetchSportTypeList Exception");
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchSequenceDataBySportType(final HiDataReadOption hiDataReadOption, final HiDataReadResultListener hiDataReadResultListener) {
        if (hiDataReadResultListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchSequenceDataBySportType listener is null");
        } else {
            this.n.execute(new ReadTask("fetchSequenceDataBySportType", hiDataReadOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.54
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataReadResultListener.onResult(null, 1, 0);
                        return;
                    }
                    try {
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        final SparseArray sparseArray = new SparseArray();
                        final ArrayList arrayList = new ArrayList();
                        iHiHealthA.fetchSequenceDataBySportType(hiDataReadOption, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.54.1
                            @Override // com.huawei.hihealth.IDataReadResultListener
                            public void onResult(List list, int i, int i2) throws RemoteException {
                                if (HiDivideUtil.c(HiHealthNativeApi.this.g, list, new int[]{i, i2}, arrayList, sparseArray)) {
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    hiDataReadResultListener.onResult(sparseArray, i, i2);
                                    LogUtil.a("HiH_HiHealthNatApi", "fetchSequenceDataBySportType option = ", hiDataReadOption, "errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                }
                            }
                        });
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "fetchSequenceDataBySportType Exception");
                        hiDataReadResultListener.onResult(null, 1, 0);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchSequenceDataProBySportType(final HiDataReadProOption hiDataReadProOption, final HiDataReadResultListener hiDataReadResultListener) {
        if (hiDataReadResultListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchSequenceDataProBySportType listener is null");
        } else {
            this.n.execute(new ReadTask("fetchSequenceDataProBySportType", hiDataReadProOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.55
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataReadResultListener.onResult(null, 1, 0);
                        return;
                    }
                    try {
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        final SparseArray sparseArray = new SparseArray();
                        final ArrayList arrayList = new ArrayList();
                        iHiHealthA.fetchSequenceDataProBySportType(hiDataReadProOption, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.55.1
                            @Override // com.huawei.hihealth.IDataReadResultListener
                            public void onResult(List list, int i, int i2) throws RemoteException {
                                if (HiDivideUtil.c(HiHealthNativeApi.this.g, list, new int[]{i, i2}, arrayList, sparseArray)) {
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    hiDataReadResultListener.onResult(sparseArray, i, i2);
                                    LogUtil.a("HiH_HiHealthNatApi", "fetchSequenceDataProBySportType option = ", hiDataReadProOption, "errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                }
                            }
                        });
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "fetchSequenceDataBySportType Exception");
                        hiDataReadResultListener.onResult(null, 1, 0);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void aggregateSportStatData(final HiSportStatDataAggregateOption hiSportStatDataAggregateOption, final HiAggregateListener hiAggregateListener) {
        this.n.execute(new ReadTask("aggregateSportStatData", hiSportStatDataAggregateOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.56
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiAggregateListener hiAggregateListener2 = hiAggregateListener;
                    if (hiAggregateListener2 != null) {
                        hiAggregateListener2.onResult(null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final ArrayList arrayList = new ArrayList();
                    iHiHealthA.aggregateSportStatData(hiSportStatDataAggregateOption, new IAggregateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.56.1
                        @Override // com.huawei.hihealth.IAggregateListener
                        public void onResult(List list, int i, int i2) throws RemoteException {
                            if (hiAggregateListener != null && HiDivideUtil.d((List<HiHealthData>) list, i2, (List<HiHealthData>) arrayList)) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiAggregateListener.onResult(arrayList.isEmpty() ? null : arrayList, i, i2);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "aggregateSportStatData errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "aggregateSportStatData Exception");
                    HiAggregateListener hiAggregateListener3 = hiAggregateListener;
                    if (hiAggregateListener3 != null) {
                        hiAggregateListener3.onResult(null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void fetchDataSource(final HiDataSourceFetchOption hiDataSourceFetchOption, final HiDataClientListener hiDataClientListener) {
        if (hiDataClientListener == null) {
            LogUtil.d("HiH_HiHealthNatApi", "fetchDataSource listener null");
        } else {
            this.n.execute(new ReadTask("fetchDataSource", hiDataSourceFetchOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.57
                @Override // java.lang.Runnable
                public void run() {
                    IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                    if (iHiHealthA == null) {
                        hiDataClientListener.onResult(null);
                        return;
                    }
                    try {
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        iHiHealthA.fetchDataSource(hiDataSourceFetchOption, new IDataClientListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.57.1
                            @Override // com.huawei.hihealth.IDataClientListener
                            public void onResult(List list) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiDataClientListener.onResult(list);
                                LogUtil.a("HiH_HiHealthNatApi", "fetchDataSource dataSourceFetchOption = ", hiDataSourceFetchOption, ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        });
                    } catch (Exception unused) {
                        LogUtil.c("HiH_HiHealthNatApi", "fetchDataSource Exception");
                        hiDataClientListener.onResult(null);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void readHiHealthDataPro(final HiDataReadProOption hiDataReadProOption, final HiDataReadResultListener hiDataReadResultListener) {
        this.n.execute(new ReadTask("readHiHealthDataPro", hiDataReadProOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.58
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiDataReadResultListener hiDataReadResultListener2 = hiDataReadResultListener;
                    if (hiDataReadResultListener2 != null) {
                        hiDataReadResultListener2.onResult(null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    final SparseArray sparseArray = new SparseArray();
                    final ArrayList arrayList = new ArrayList();
                    iHiHealthA.readHiHealthDataPro(hiDataReadProOption, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.58.1
                        @Override // com.huawei.hihealth.IDataReadResultListener
                        public void onResult(List list, int i, int i2) throws RemoteException {
                            if (hiDataReadResultListener == null) {
                                return;
                            }
                            if (HiDivideUtil.c(HiHealthNativeApi.this.g, list, new int[]{i, i2}, arrayList, sparseArray)) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiDataReadResultListener.onResult(sparseArray, i, i2);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "readHiHealthDataPro option = ", hiDataReadProOption, "errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), ",dataSz=", Integer.valueOf(sparseArray.size()));
                            }
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "readHiHealthDataPro Exception");
                    HiDataReadResultListener hiDataReadResultListener3 = hiDataReadResultListener;
                    if (hiDataReadResultListener3 != null) {
                        hiDataReadResultListener3.onResult(null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void readHiHealthDataEx(final List<HiDataReadProOption> list, final HiDataReadResultListener hiDataReadResultListener) {
        this.n.execute(new ReadTask("readHiHealthDataEx", list) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.59
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiDataReadResultListener hiDataReadResultListener2 = hiDataReadResultListener;
                    if (hiDataReadResultListener2 != null) {
                        hiDataReadResultListener2.onResult(null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    final SparseArray sparseArray = new SparseArray();
                    final ArrayList arrayList = new ArrayList();
                    iHiHealthA.readHiHealthDataEx(list, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.59.1
                        @Override // com.huawei.hihealth.IDataReadResultListener
                        public void onResult(List list2, int i, int i2) throws RemoteException {
                            if (hiDataReadResultListener == null) {
                                return;
                            }
                            if (HiDivideUtil.c(HiHealthNativeApi.this.g, list2, new int[]{i, i2}, arrayList, sparseArray)) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiDataReadResultListener.onResult(sparseArray, i, i2);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "readHiHealthDataEx options = ", list, "errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "readHiHealthDataEx Exception");
                    HiDataReadResultListener hiDataReadResultListener3 = hiDataReadResultListener;
                    if (hiDataReadResultListener3 != null) {
                        hiDataReadResultListener3.onResult(null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void aggregateHiHealthDataPro(final HiDataAggregateProOption hiDataAggregateProOption, final HiAggregateListener hiAggregateListener) {
        this.n.execute(new ReadTask("aggregateHiHealthDataPro", hiDataAggregateProOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.60
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiAggregateListener hiAggregateListener2 = hiAggregateListener;
                    if (hiAggregateListener2 != null) {
                        hiAggregateListener2.onResult(null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final ArrayList arrayList = new ArrayList();
                    iHiHealthA.aggregateHiHealthDataPro(hiDataAggregateProOption, new IAggregateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.60.1
                        @Override // com.huawei.hihealth.IAggregateListener
                        public void onResult(List list, int i, int i2) throws RemoteException {
                            if (hiAggregateListener != null && HiDivideUtil.d((List<HiHealthData>) list, i2, (List<HiHealthData>) arrayList)) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                hiAggregateListener.onResult(arrayList.isEmpty() ? null : arrayList, i, i2);
                                ReleaseLogUtil.c("HiH_HiHealthNatApi", "aggregateHiHealthDataPro errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "aggregateHiHealthDataPro Exception");
                    HiAggregateListener hiAggregateListener3 = hiAggregateListener;
                    if (hiAggregateListener3 != null) {
                        hiAggregateListener3.onResult(null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void deleteHiHealthDataPro(final HiDataDeleteProOption hiDataDeleteProOption, final HiDataOperateListener hiDataOperateListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=deleteHiHealthDataPro enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.61
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiDataOperateListener hiDataOperateListener2 = hiDataOperateListener;
                    if (hiDataOperateListener2 != null) {
                        hiDataOperateListener2.onResult(1, "deleteHiHealthDataPro bindservice exeception");
                        return;
                    }
                    return;
                }
                try {
                    iHiHealthA.deleteHiHealthDataPro(hiDataDeleteProOption, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.61.1
                        @Override // com.huawei.hihealth.IDataOperateListener
                        public void onResult(int i, List list) throws RemoteException {
                            if (list == null || list.isEmpty()) {
                                LogUtil.d("HiH_HiHealthNatApi", "deleteHiHealthDataPro onResult datas is null or empty");
                                if (hiDataOperateListener != null) {
                                    hiDataOperateListener.onResult(1, "result is null or empty delete data fail " + hiDataDeleteProOption);
                                    return;
                                }
                                return;
                            }
                            Object obj = list.get(0);
                            if (hiDataOperateListener != null) {
                                hiDataOperateListener.onResult(i, obj);
                            }
                            LogUtil.a("HiH_HiHealthNatApi", "deleteHiHealthDataPro cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "deleteHiHealthDataPro Exception");
                    HiDataOperateListener hiDataOperateListener3 = hiDataOperateListener;
                    if (hiDataOperateListener3 != null) {
                        hiDataOperateListener3.onResult(1, "delete data fail" + hiDataDeleteProOption);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void deleteHiHealthDataProEx(final List<HiDataDeleteProOption> list, final HiDeleteListenerEx hiDeleteListenerEx) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=deleteHiHealthDataProEx enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.62
            @Override // java.lang.Runnable
            public void run() {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiHealthNativeApi.this.e(1, "deleteHiHealthDataProEx bindservice exeception", hiDeleteListenerEx);
                    return;
                }
                try {
                    iHiHealthA.deleteHiHealthDataProEx(list, new IDeleteListenerEx.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.62.1
                        @Override // com.huawei.hihealth.IDeleteListenerEx
                        public void onResult(Map map) throws RemoteException {
                            if (hiDeleteListenerEx != null) {
                                hiDeleteListenerEx.onResult(map);
                            }
                            LogUtil.a("HiH_HiHealthNatApi", "deleteHiHealthDataProEx cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "deleteHiHealthDataProEx Exception");
                    HiHealthNativeApi.this.e(1, "delete datas fail" + list, hiDeleteListenerEx);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, HiDeleteListenerEx hiDeleteListenerEx) {
        if (hiDeleteListenerEx != null) {
            HashMap map = new HashMap(1);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            map.put(Integer.valueOf(i), arrayList);
            hiDeleteListenerEx.onResult(map);
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void setSampleConfig(final List<HiSampleConfig> list, final HiDataOperateListener hiDataOperateListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=setSampleConfig enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(hiDataOperateListener, list);
            }
        });
    }

    /* synthetic */ void a(final HiDataOperateListener hiDataOperateListener, List list) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        IHiHealth iHiHealthA = a();
        if (iHiHealthA == null) {
            if (hiDataOperateListener != null) {
                hiDataOperateListener.onResult(1, "setSampleConfig bindService exception");
            }
        } else {
            try {
                iHiHealthA.setSampleConfig(list, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.63
                    @Override // com.huawei.hihealth.IDataOperateListener
                    public void onResult(int i, List list2) throws RemoteException {
                        if (HiCommonUtil.b(list2)) {
                            LogUtil.d("HiH_HiHealthNatApi", "setSampleConfig onResult datas is null or empty");
                            HiDataOperateListener hiDataOperateListener2 = hiDataOperateListener;
                            if (hiDataOperateListener2 != null) {
                                hiDataOperateListener2.onResult(1, "result is null or empty delete data fail");
                                return;
                            }
                            return;
                        }
                        Object obj = list2.get(0);
                        HiDataOperateListener hiDataOperateListener3 = hiDataOperateListener;
                        if (hiDataOperateListener3 != null) {
                            hiDataOperateListener3.onResult(i, obj);
                        }
                        LogUtil.a("HiH_HiHealthNatApi", "setSampleConfig cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    }
                });
            } catch (Exception unused) {
                ReleaseLogUtil.e("HiH_HiHealthNatApi", "setSampleConfig Exception");
                if (hiDataOperateListener != null) {
                    hiDataOperateListener.onResult(1, "setSampleConfig fail");
                }
            }
        }
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void getSampleConfig(final HiSampleConfigProcessOption hiSampleConfigProcessOption, final HiDataReadResultListener hiDataReadResultListener) {
        this.n.execute(new ReadTask("getSampleConfig", hiSampleConfigProcessOption) { // from class: com.huawei.hihealth.api.HiHealthNativeApi.64
            @Override // java.lang.Runnable
            public void run() {
                IHiHealth iHiHealthA = HiHealthNativeApi.this.a();
                if (iHiHealthA == null) {
                    HiDataReadResultListener hiDataReadResultListener2 = hiDataReadResultListener;
                    if (hiDataReadResultListener2 != null) {
                        hiDataReadResultListener2.onResult(null, 1, 0);
                        return;
                    }
                    return;
                }
                try {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    iHiHealthA.getSampleConfig(hiSampleConfigProcessOption, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.64.1
                        @Override // com.huawei.hihealth.IDataReadResultListener
                        public void onResult(List list, int i, int i2) throws RemoteException {
                            if (hiDataReadResultListener == null) {
                                return;
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            hiDataReadResultListener.onResult(list, i, i2);
                            LogUtil.a("HiH_HiHealthNatApi", "getSampleConfig option = ", hiSampleConfigProcessOption, "errorCode is ", Integer.valueOf(i), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - getTaskCreateTime()), ", wait time = ", Long.valueOf(jCurrentTimeMillis - getTaskCreateTime()), ", executed time is ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", onResult time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                        }
                    });
                } catch (Exception unused) {
                    ReleaseLogUtil.e("HiH_HiHealthNatApi", "getSampleConfig Exception");
                    HiDataReadResultListener hiDataReadResultListener3 = hiDataReadResultListener;
                    if (hiDataReadResultListener3 != null) {
                        hiDataReadResultListener3.onResult(null, 1, 0);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hihealth.api.HiHealthApi
    public void deleteSampleConfig(final HiSampleConfigProcessOption hiSampleConfigProcessOption, final HiDataOperateListener hiDataOperateListener) {
        HiCommonUtil.e("HiH_HiHealthNatApi", this.o);
        ReleaseLogUtil.c("HiH_HiHealthNatApi", "ac=deleteSampleConfig enter!");
        this.p.execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f12043b.d(hiDataOperateListener, hiSampleConfigProcessOption);
            }
        });
    }

    /* synthetic */ void d(final HiDataOperateListener hiDataOperateListener, final HiSampleConfigProcessOption hiSampleConfigProcessOption) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        IHiHealth iHiHealthA = a();
        if (iHiHealthA == null) {
            if (hiDataOperateListener != null) {
                hiDataOperateListener.onResult(1, "deleteSampleConfig bindService exception");
                return;
            }
            return;
        }
        try {
            iHiHealthA.deleteSampleConfig(hiSampleConfigProcessOption, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.65
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list) throws RemoteException {
                    if (HiCommonUtil.b(list)) {
                        LogUtil.d("HiH_HiHealthNatApi", "deleteSampleConfig onResult datas is null or empty");
                        if (hiDataOperateListener != null) {
                            hiDataOperateListener.onResult(1, "deleteSampleConfig fail " + hiSampleConfigProcessOption);
                            return;
                        }
                        return;
                    }
                    Object obj = list.get(0);
                    HiDataOperateListener hiDataOperateListener2 = hiDataOperateListener;
                    if (hiDataOperateListener2 != null) {
                        hiDataOperateListener2.onResult(i, obj);
                    }
                    LogUtil.a("HiH_HiHealthNatApi", "deleteSampleConfig cost time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                }
            });
        } catch (Exception unused) {
            ReleaseLogUtil.e("HiH_HiHealthNatApi", "deleteSampleConfig Exception");
            if (hiDataOperateListener != null) {
                hiDataOperateListener.onResult(1, "deleteSampleConfig fail" + hiSampleConfigProcessOption);
            }
        }
    }

    static class MyBroadcastReceiver extends BroadcastReceiver {
        private MyBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.d("HiH_HiHealthNatApi", "MyBroadcastReceiver onReceive intent = null");
            } else {
                HiBroadcastManager.d(context, intent);
            }
        }
    }

    static class InnerDataReadResultListener extends IDataReadResultListener.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HiDataOperateListener f12245a;

        InnerDataReadResultListener(HiDataOperateListener hiDataOperateListener) {
            this.f12245a = hiDataOperateListener;
        }

        @Override // com.huawei.hihealth.IDataReadResultListener
        public void onResult(List list, int i, int i2) throws RemoteException {
            HiDataOperateListener hiDataOperateListener = this.f12245a;
            if (hiDataOperateListener != null) {
                hiDataOperateListener.onResult(i, list);
            }
        }
    }

    abstract class Task implements Runnable {
        private String mFocusActivity;
        private String mMethodInfo;
        private Object mParameterInfo;
        private long mTaskCreateTime = System.currentTimeMillis();

        Task(String str, Object obj) {
            this.mMethodInfo = str;
            this.mParameterInfo = obj;
            LogApi logApiA = LogUtil.a();
            if (logApiA != null) {
                this.mFocusActivity = logApiA.getCurrentActivity();
            }
        }

        public long getTaskCreateTime() {
            return this.mTaskCreateTime;
        }

        public String getFocusActivity() {
            return this.mFocusActivity;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TaskInfo{cTm:");
            sb.append(HiDateUtil.e(this.mTaskCreateTime, "yyyy-MM-dd HH:mm:ss:SSS"));
            if (this.mFocusActivity != null) {
                sb.append(",reqAct:");
                sb.append(this.mFocusActivity);
            }
            sb.append(",method:");
            sb.append(this.mMethodInfo);
            sb.append(",param:");
            sb.append(this.mParameterInfo);
            sb.append("}");
            return sb.toString();
        }
    }

    abstract class ReadTask extends Task {
        ReadTask(String str, Object obj) {
            super(str, obj);
            if (HiHealthNativeApi.this.k.isEmpty()) {
                ReleaseLogUtil.c("HiH_HiHealthNatApi", "taskCt=0 ", toString());
            }
            HiHealthNativeApi.this.c();
        }
    }

    static class HiHealthSubscribeManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12231a = 2000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<Integer> f12232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile int f12233c;
        private final ConcurrentHashMap<Integer, CountDownLatch> d;
        private final ConcurrentHashMap<Integer, Integer> e;
        private final ConcurrentHashMap<Integer, Integer> f;
        private final ConcurrentHashMap<Integer, HiSubscribeListener> g;
        private final ConcurrentHashMap<Integer, List<HiSubscribeListener>> h;
        private final ConcurrentHashMap<Integer, Integer> i;
        private final Handler j;

        private HiHealthSubscribeManager() {
            this.h = new ConcurrentHashMap<>(16);
            this.g = new ConcurrentHashMap<>(16);
            this.e = new ConcurrentHashMap<>(16);
            this.f = new ConcurrentHashMap<>(16);
            this.i = new ConcurrentHashMap<>(16);
            this.d = new ConcurrentHashMap<>(16);
            this.f12232b = ConcurrentHashMap.newKeySet();
            this.f12233c = 0;
            HandlerThread handlerThread = new HandlerThread("HiH_HiHealthSubscribeManager");
            handlerThread.start();
            this.j = new Handler(handlerThread.getLooper());
            e();
        }

        /* JADX INFO: renamed from: com.huawei.hihealth.api.HiHealthNativeApi$HiHealthSubscribeManager$1, reason: invalid class name */
        class AnonymousClass1 extends BroadcastReceiver {
            AnonymousClass1() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra("processName");
                if (intent.getBooleanExtra("isRunning", false) && XiaomiWidgetProvider.DAEMON_SERVICE_PROCESS.equals(stringExtra)) {
                    final List list = (List) HiHealthSubscribeManager.this.f.keySet().stream().collect(Collectors.toList());
                    ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi$HiHealthSubscribeManager$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.e.e(list);
                        }
                    });
                }
            }

            /* synthetic */ void e(List list) {
                HiHealthSubscribeManager.this.d((List<Integer>) list);
            }
        }

        private void e() {
            BroadcastManager.a(new AnonymousClass1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(List<Integer> list) {
            this.f.clear();
            this.i.clear();
            this.d.clear();
            this.f12232b.clear();
            e(list, new HiSubscribeListener() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.HiHealthSubscribeManager.2
                @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
                public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                }

                @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
                public void onResult(List<Integer> list2, List<Integer> list3) {
                    ReleaseLogUtil.c("HiH_HiHealthSubscribeManager", "resetSubscription success=", list2, ",fail=", list3);
                    HiHealthSubscribeManager.this.d(list2, (HiUnSubscribeListener) null, System.currentTimeMillis());
                }
            }, System.currentTimeMillis());
            ReleaseLogUtil.c("HiH_HiHealthSubscribeManager", "resetClientSubscription!");
        }

        /* JADX INFO: loaded from: classes2.dex */
        static class Instance {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final HiHealthSubscribeManager f12244b = new HiHealthSubscribeManager();

            private Instance() {
            }
        }

        public static HiHealthSubscribeManager a() {
            return Instance.f12244b;
        }

        public void e(List list, HiSubscribeListener hiSubscribeListener, long j) {
            if (list == null || list.isEmpty() || hiSubscribeListener == null) {
                LogUtil.d("HiH_HiHealthSubscribeManager", "subscribeHiHealthData typeList is null or empty");
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            LogUtil.a("HiH_HiHealthSubscribeManager", "clientSublist=", copyOnWriteArrayList);
            c(b(copyOnWriteArrayList, hiSubscribeListener), j);
        }

        private ClientSubscribeResult b(List list, HiSubscribeListener hiSubscribeListener) {
            ClientSubscribeResult clientSubscribeResult;
            synchronized (this) {
                clientSubscribeResult = new ClientSubscribeResult(list, hiSubscribeListener);
                List<Integer> listD = clientSubscribeResult.d();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                for (Integer num : listD) {
                    Integer numC = c(num);
                    if (numC == null) {
                        clientSubscribeResult.b().add(num);
                    } else {
                        clientSubscribeResult.e().add(numC);
                        d(numC, num, hiSubscribeListener);
                        if (!this.f12232b.contains(num)) {
                            this.f12232b.add(num);
                            clientSubscribeResult.c().add(num);
                            this.d.put(num, countDownLatch);
                        }
                    }
                }
            }
            return clientSubscribeResult;
        }

        public void d(List<Integer> list, HiUnSubscribeListener hiUnSubscribeListener, long j) {
            if (list == null || list.isEmpty()) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            LogUtil.a("HiH_HiHealthSubscribeManager", "clientUnSublist=", copyOnWriteArrayList);
            ArrayList arrayList = new ArrayList(10);
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Integer numD = d((Integer) it.next());
                if (numD != null) {
                    arrayList.add(numD);
                }
            }
            b(arrayList, hiUnSubscribeListener, j);
        }

        private Integer c(Integer num) {
            if (num == null) {
                LogUtil.d("registerListener not right", new Object[0]);
                return null;
            }
            if (!HiSubscribeType.b(num.intValue())) {
                LogUtil.d("registerListener this type can not be subscribed ,type = ", num);
                return null;
            }
            do {
                this.f12233c--;
            } while (this.g.get(Integer.valueOf(this.f12233c)) != null);
            return Integer.valueOf(this.f12233c);
        }

        private void d(Integer num, Integer num2, HiSubscribeListener hiSubscribeListener) {
            List<HiSubscribeListener> orDefault = this.h.getOrDefault(num2, new ArrayList(10));
            synchronized (orDefault) {
                orDefault.add(hiSubscribeListener);
                this.h.put(num2, orDefault);
            }
            this.g.put(num, hiSubscribeListener);
            this.e.put(num, num2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            List<HiSubscribeListener> orDefault = this.h.getOrDefault(Integer.valueOf(i), new ArrayList(10));
            CopyOnWriteArrayList<HiSubscribeListener> copyOnWriteArrayList = new CopyOnWriteArrayList(orDefault);
            ReleaseLogUtil.c("HiH_HiHealthSubscribeManager", "clientOnChg,tp=", Integer.valueOf(i), ",lsz=", Integer.valueOf(orDefault.size()));
            for (HiSubscribeListener hiSubscribeListener : copyOnWriteArrayList) {
                if (hiSubscribeListener != null) {
                    hiSubscribeListener.onChange(i, hiHealthClient, str, hiHealthData, j);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(List<Integer> list, List<Integer> list2, List<Integer> list3) {
            if (list == null) {
                ReleaseLogUtil.e("HiH_HiHealthSubscribeManager", "saveResult successLists=null!");
                return;
            }
            int i = 0;
            for (int i2 = 0; i2 < list3.size(); i2++) {
                Integer num = list3.get(i2);
                if (list2 == null || !list2.contains(num)) {
                    if (i >= list.size()) {
                        return;
                    }
                    this.f.put(num, list.get(i));
                    this.i.put(list.get(i), num);
                    i++;
                }
            }
        }

        private Boolean b(Integer num) {
            return Boolean.valueOf(this.f.containsKey(num));
        }

        private Boolean e(List<Integer> list) {
            Boolean boolValueOf = true;
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() & b(it.next()).booleanValue());
            }
            return boolValueOf;
        }

        private Integer d(Integer num) {
            if (num == null) {
                LogUtil.d("HiH_HiHealthSubscribeManager", "unregisterListenerByKey key = null");
                return null;
            }
            HiSubscribeListener orDefault = this.g.getOrDefault(num, null);
            if (orDefault == null) {
                LogUtil.d("HiH_HiHealthSubscribeManager", "unregisterListenerByKey tempListener == null");
                return null;
            }
            Integer orDefault2 = this.e.getOrDefault(num, null);
            if (orDefault2 == null) {
                ReleaseLogUtil.b("HiH_HiHealthSubscribeManager", "This key hasn't type, key is ", num);
                return null;
            }
            e(orDefault2, orDefault);
            this.g.remove(num);
            this.e.remove(num);
            List<HiSubscribeListener> orDefault3 = this.h.getOrDefault(orDefault2, null);
            if (orDefault3 != null && (orDefault3 == null || orDefault3.size() != 0)) {
                return null;
            }
            if (this.h.containsKey(orDefault2)) {
                this.h.remove(orDefault2);
            }
            if (this.f12232b.contains(orDefault2)) {
                this.f12232b.remove(orDefault2);
            }
            ReleaseLogUtil.e("HiH_HiHealthSubscribeManager", "unBinderT=", orDefault2);
            return this.f.getOrDefault(orDefault2, null);
        }

        private void e(Integer num, HiSubscribeListener hiSubscribeListener) {
            List<HiSubscribeListener> orDefault = this.h.getOrDefault(num, null);
            if (orDefault == null) {
                LogUtil.d("HiH_HiHealthSubscribeManager", "unregisterListenerByKey listeners == null");
                return;
            }
            synchronized (orDefault) {
                Iterator<HiSubscribeListener> it = orDefault.iterator();
                while (it.hasNext()) {
                    HiSubscribeListener next = it.next();
                    if (next != null && next.equals(hiSubscribeListener)) {
                        it.remove();
                        break;
                    }
                }
            }
        }

        private void a(List<Integer> list, Boolean bool) {
            for (Integer num : list) {
                Integer orDefault = this.i.getOrDefault(num, null);
                if (orDefault != null) {
                    if (bool.booleanValue() && this.i.containsKey(num)) {
                        this.i.remove(num);
                    }
                    if (bool.booleanValue() && this.f.getOrDefault(orDefault, null) == num) {
                        this.f.remove(orDefault);
                    }
                }
            }
        }

        private void c(final ClientSubscribeResult clientSubscribeResult, final long j) {
            try {
                if (clientSubscribeResult.c().size() != 0) {
                    IHiHealth iHiHealthA = HiHealthNativeApi.e.a();
                    if (iHiHealthA == null) {
                        b(clientSubscribeResult);
                        return;
                    }
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    ReleaseLogUtil.c("HiH_HiHealthSubscribeManager", "binderT= ", clientSubscribeResult.c());
                    final Runnable runnable = new Runnable() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.HiHealthSubscribeManager.3
                        @Override // java.lang.Runnable
                        public void run() {
                            ReleaseLogUtil.c("HiH_HiHealthSubscribeManager", "subscribeHiHealthData no response");
                            HiHealthSubscribeManager.this.b(clientSubscribeResult);
                        }
                    };
                    this.j.postDelayed(runnable, 5000L);
                    iHiHealthA.subscribeHiHealthData(clientSubscribeResult.c(), new ISubscribeListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.HiHealthSubscribeManager.4
                        @Override // com.huawei.hihealth.ISubscribeListener
                        public void onResult(List list, List list2) {
                            HiHealthSubscribeManager.this.j.removeCallbacks(runnable);
                            HiHealthSubscribeManager.this.d((List<Integer>) list, (List<Integer>) list2, clientSubscribeResult.c());
                            HiHealthSubscribeManager.this.b(clientSubscribeResult);
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j2 = j;
                            long j3 = jCurrentTimeMillis;
                            ReleaseLogUtil.c("HiH_HiHealthSubscribeManager", "subscribeHiHealthData, totalTime = ", Long.valueOf(jCurrentTimeMillis2 - j2), ", wait time = ", Long.valueOf(j3 - j2), ", executed time = ", Long.valueOf(jCurrentTimeMillis2 - j3));
                        }

                        @Override // com.huawei.hihealth.ISubscribeListener
                        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j2) {
                            HiHealthSubscribeManager.this.a(i, hiHealthClient, str, hiHealthData, j2);
                        }
                    });
                    return;
                }
                b(clientSubscribeResult);
            } catch (Exception unused) {
                ReleaseLogUtil.e("HiH_HiHealthSubscribeManager", "subscribeHiHealthData Exception");
                b(clientSubscribeResult);
            }
        }

        private void b(final List<Integer> list, final HiUnSubscribeListener hiUnSubscribeListener, final long j) {
            try {
                if (list.size() != 0) {
                    IHiHealth iHiHealthA = HiHealthNativeApi.e.a();
                    if (iHiHealthA == null) {
                        d(list, hiUnSubscribeListener, false);
                        return;
                    } else {
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        iHiHealthA.unSubscribeHiHealthData(list, new IUnSubscribeListener.Stub() { // from class: com.huawei.hihealth.api.HiHealthNativeApi.HiHealthSubscribeManager.5
                            @Override // com.huawei.hihealth.IUnSubscribeListener
                            public void onResult(boolean z) {
                                HiHealthSubscribeManager.this.d((List<Integer>) list, hiUnSubscribeListener, z);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                long j2 = j;
                                long j3 = jCurrentTimeMillis;
                                LogUtil.a("HiH_HiHealthSubscribeManager", "unSubscribeHiHealthData result is ", Boolean.valueOf(z), ", totalTime = ", Long.valueOf(jCurrentTimeMillis2 - j2), ", wait time = ", Long.valueOf(j3 - j2), ", executed time = ", Long.valueOf(jCurrentTimeMillis2 - j3));
                            }
                        });
                        return;
                    }
                }
                d(list, hiUnSubscribeListener, true);
            } catch (Exception unused) {
                ReleaseLogUtil.e("HiH_HiHealthSubscribeManager", "unSubscribeHiHealthData Exception");
                d(list, hiUnSubscribeListener, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(ClientSubscribeResult clientSubscribeResult) {
            CountDownLatch orDefault;
            c(clientSubscribeResult.c());
            List listD = clientSubscribeResult.d();
            HiSubscribeListener hiSubscribeListenerA = clientSubscribeResult.a();
            List<Integer> listE = clientSubscribeResult.e();
            List<Integer> listB = clientSubscribeResult.b();
            if (e((List<Integer>) listD).booleanValue()) {
                hiSubscribeListenerA.onResult(listE, listB);
                return;
            }
            long jCurrentTimeMillis = 0;
            for (Integer num : listD) {
                if (!b(num).booleanValue() && (orDefault = this.d.getOrDefault(num, null)) != null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    try {
                        orDefault.await(f12231a, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        ReleaseLogUtil.e("HiH_HiHealthSubscribeManager", "clientSubscribeOnResult InterruptedException");
                    }
                    jCurrentTimeMillis += System.currentTimeMillis() - jCurrentTimeMillis2;
                    if (jCurrentTimeMillis >= f12231a) {
                        break;
                    }
                }
            }
            ReleaseLogUtil.b("HiH_HiHealthSubscribeManager", "mBinderTypeToCountDownLatchMap awaitTime=", Long.valueOf(jCurrentTimeMillis));
            e(listD, hiSubscribeListenerA, listE, listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(List<Integer> list, HiUnSubscribeListener hiUnSubscribeListener, boolean z) {
            a(list, Boolean.valueOf(z));
            if (hiUnSubscribeListener == null) {
                ReleaseLogUtil.e("HiH_HiHealthSubscribeManager", "clientUnSubscribeOnResult listener is null");
            } else {
                hiUnSubscribeListener.onResult(z);
            }
        }

        private void c(List<Integer> list) {
            for (Integer num : list) {
                ReleaseLogUtil.c("HiH_HiHealthSubscribeManager", "binderFinish:", num);
                CountDownLatch orDefault = this.d.getOrDefault(num, null);
                if (orDefault != null) {
                    orDefault.countDown();
                    this.d.remove(num);
                }
            }
        }

        private void e(List<Integer> list, HiSubscribeListener hiSubscribeListener, List<Integer> list2, List<Integer> list3) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Integer num : list) {
                if (i >= list2.size()) {
                    break;
                }
                Integer num2 = list2.get(i);
                if (!list3.contains(num)) {
                    if (b(num).booleanValue()) {
                        arrayList.add(num2);
                    } else {
                        list3.add(num);
                        d(num2);
                        ReleaseLogUtil.b("HiH_HiHealthSubscribeManager", "checkClientSubscribeResult unRegisterListenerByKey", num2);
                    }
                    i++;
                }
            }
            hiSubscribeListener.onResult(arrayList, list3);
            ReleaseLogUtil.b("HiH_HiHealthSubscribeManager", "checkClientSubscribeResult：successKeyList = ", arrayList, ",registerFailList=", list3);
        }
    }

    static class ClientSubscribeResult {
        private HiSubscribeListener d;
        private final List e = new ArrayList(10);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<Integer> f12228a = new ArrayList(10);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Integer> f12229b = new ArrayList(10);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<Integer> f12230c = new ArrayList(10);

        public ClientSubscribeResult(List list, HiSubscribeListener hiSubscribeListener) {
            for (Object obj : list) {
                if (obj instanceof Integer) {
                    this.e.add(obj);
                }
            }
            this.d = hiSubscribeListener;
        }

        public List d() {
            return this.e;
        }

        public HiSubscribeListener a() {
            return this.d;
        }

        public List<Integer> c() {
            return this.f12228a;
        }

        public List<Integer> e() {
            return this.f12229b;
        }

        public List<Integer> b() {
            return this.f12230c;
        }
    }
}
