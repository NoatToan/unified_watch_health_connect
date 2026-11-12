package com.huawei.hihealth;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.common.Constant;
import com.huawei.hihealth.device.HiHealthDeviceInfo;
import com.huawei.hihealth.error.HiHealthError;
import com.huawei.hihealth.listener.CapabilityResultCallback;
import com.huawei.hihealth.listener.IuniversalCallback;
import com.huawei.hihealth.listener.ResultCallback;
import com.huawei.hihealth.option.HiHealthCapabilityQuery;
import com.huawei.hihealth.util.DictDataTransformUtil;
import com.huawei.hihealthkit.data.store.HiRealTimeCallback;
import com.huawei.hihealthkit.data.store.HiRealTimeListener;
import com.huawei.hihealthkit.data.store.HiSportDataCallback;
import com.huawei.hihealthkit.data.type.HiHealthDataType;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.krl;
import defpackage.krp;
import defpackage.krq;
import defpackage.krr;
import defpackage.kss;
import defpackage.ksu;
import defpackage.ksv;
import defpackage.ksw;
import defpackage.ksx;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthKitApi implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Context f11797a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f11798c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinder f11799b;
    private IHiHealthKit d;
    private final Object e;
    private ExecutorService f;
    private Set<Object> h;

    private HiHealthKitApi() {
        this.e = new Object();
        this.h = new CopyOnWriteArraySet();
        this.f11799b = new Binder();
        Log.i("HiHealthKit", "HiHealthKitApi construct");
        this.f = Executors.newSingleThreadExecutor();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i("HiHealthKit", Constant.SERVICE_CONNECT_MESSAGE);
        try {
            int callingUid = Binder.getCallingUid();
            String packageName = f11797a.getPackageName();
            Log.d("HiHealthKit", "getCallingUid uid:" + callingUid + " packageName1:" + packageName);
            IBinder serviceBinder = IBinderInterceptor.Stub.asInterface(iBinder).getServiceBinder(null);
            StringBuilder sb = new StringBuilder("binder: ");
            sb.append(serviceBinder);
            Log.i("HiHealthKit", sb.toString());
            this.d = IHiHealthKit.Stub.asInterface(serviceBinder);
            Log.i("HiHealthKit", "mApiAidl: " + this.d);
            IHiHealthKit iHiHealthKit = this.d;
            if (iHiHealthKit == null) {
                Log.w("HiHealthKit", "onServiceConnected mApiAidl is null");
            } else {
                if (packageName == null) {
                    packageName = "";
                }
                try {
                    iHiHealthKit.registerPackageName(packageName);
                    this.d.setKitVersion(String.valueOf(ksx.d(f11797a)));
                    ksx.c(this.d.getServiceApiLevel());
                } catch (RemoteException unused) {
                    Log.e("HiHealthKit", "setKitVersion RemoteException");
                }
            }
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "onServiceConnected Exception");
        }
        synchronized (this.e) {
            this.e.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i("HiHealthKit", "onServiceDisconnected");
        this.d = null;
        d();
    }

    private void d() {
        Log.i("HiHealthKit", "need notify callback number " + this.h.size());
        for (Object obj : this.h) {
            if (obj instanceof HiRealTimeCallback) {
                ((HiRealTimeCallback) obj).onResultHandler(31, HiHealthError.e(31));
            } else if (obj instanceof HiSportDataCallback) {
                ((HiSportDataCallback) obj).onResultHandler(31);
            } else {
                Log.w("HiHealthKit", "no callback of this type");
            }
        }
        this.h.clear();
    }

    static class Instance {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final HiHealthKitApi f11893b = new HiHealthKitApi();

        private Instance() {
        }
    }

    public static HiHealthKitApi b(Context context) {
        Log.i("HiHealthKit", "HiHealthKitApi getInstance");
        if (f11797a == null) {
            f11797a = context.getApplicationContext();
        }
        return Instance.f11893b;
    }

    private void e() {
        synchronized (f11798c) {
            if (this.d != null) {
                return;
            }
            Intent intent = new Intent("com.huawei.health.action.KIT_SERVICE");
            intent.setClassName(ksu.b(), "com.huawei.hihealthservice.HiHealthService");
            intent.setPackage(ksu.b());
            try {
                f11797a.bindService(intent, this, 1);
            } catch (SecurityException e) {
                Log.e("HiHealthKit", "bindService exception" + e.getMessage());
            }
            synchronized (this.e) {
                try {
                    if (this.d != null) {
                        Log.i("HiHealthKit", "bindService bind mApiAidl is not null = " + this.d);
                    } else {
                        this.e.wait(30000L);
                        Log.i("HiHealthKit", "bindService bind over mApiAidl is " + this.d);
                    }
                } catch (InterruptedException e2) {
                    Log.e("HiHealthKit", "bindService InterruptedException = " + e2.getMessage());
                }
            }
        }
    }

    private int b() {
        SharedPreferences sharedPreferences;
        if (f11797a == null || (sharedPreferences = f11797a.getSharedPreferences("hihealth_kit", 0)) == null) {
            return 0;
        }
        return sharedPreferences.getInt("hihealth_kit", 0);
    }

    public void e(final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                this.f11815a.i(resultCallback);
            }
        });
    }

    /* synthetic */ void i(ResultCallback resultCallback) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "getGender mApiAidl is null");
            Log.w("HiHealthKit", "getGender mApiAidl is null");
        } else {
            t(resultCallback);
        }
    }

    private void t(final ResultCallback resultCallback) {
        try {
            this.d.getGender(b(), new ICommonListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.1
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i, List list) {
                    Log.i("HiHealthKit", "enter KitAPI getGenderImpl onSuccess errorCode:" + i);
                    if (list != null && list.size() > 0) {
                        Integer num = (Integer) list.get(0);
                        num.intValue();
                        HiHealthKitApi.this.c(resultCallback, 0, num);
                    } else {
                        int iD = HiHealthError.d(i);
                        HiHealthKitApi.this.c(resultCallback, iD, HiHealthError.e(iD));
                    }
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i, List list) {
                    Log.i("HiHealthKit", "getGenderImpl onfailure");
                    int iD = HiHealthError.d(i);
                    HiHealthKitApi.this.c(resultCallback, iD, HiHealthError.e(iD));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "getGenderImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "getGenderImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    public void b(final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.d.g(resultCallback);
            }
        });
    }

    /* synthetic */ void g(ResultCallback resultCallback) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "getBirthday mApiAidl is null");
            Log.w("HiHealthKit", "getBirthday mApiAidl is null");
        } else {
            r(resultCallback);
        }
    }

    private void r(final ResultCallback resultCallback) {
        try {
            this.d.getBirthday(b(), new ICommonListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.2
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i, List list) {
                    Log.i("HiHealthKit", "enter KitAPI getBirthdayImpl onSuccess errorCode:" + i);
                    if (list != null && list.size() > 0) {
                        Integer num = (Integer) list.get(0);
                        num.intValue();
                        HiHealthKitApi.this.c(resultCallback, 0, num);
                    } else {
                        int iD = HiHealthError.d(i);
                        HiHealthKitApi.this.c(resultCallback, iD, HiHealthError.e(iD));
                    }
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i, List list) {
                    Log.i("HiHealthKit", "getBirthdayImpl onfailure");
                    int iD = HiHealthError.d(i);
                    HiHealthKitApi.this.c(resultCallback, iD, HiHealthError.e(iD));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "getBirthdayImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "getBirthdayImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    public void d(final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                this.f11833c.h(resultCallback);
            }
        });
    }

    /* synthetic */ void h(ResultCallback resultCallback) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "getHeight mApiAidl is null");
            Log.w("HiHealthKit", "getHeight mApiAidl is null");
        } else {
            p(resultCallback);
        }
    }

    private void p(final ResultCallback resultCallback) {
        try {
            this.d.getHeight(b(), new ICommonListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.3
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i, List list) {
                    Log.i("HiHealthKit", "getHeightImpl:onSuccess errorCode:" + i);
                    if (list != null && list.size() > 0) {
                        Integer num = (Integer) list.get(0);
                        Log.i("HiHealthKit", "getHeightImpl height: " + num.intValue());
                        HiHealthKitApi.this.c(resultCallback, 0, num);
                        return;
                    }
                    int iD = HiHealthError.d(i);
                    HiHealthKitApi.this.c(resultCallback, iD, HiHealthError.e(iD));
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i, List list) {
                    Log.i("HiHealthKit", "getHeightImpl onfailure");
                    int iD = HiHealthError.d(i);
                    HiHealthKitApi.this.c(resultCallback, iD, HiHealthError.e(iD));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "getHeightImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "getHeightImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    public void a(final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.e.l(resultCallback);
            }
        });
    }

    /* synthetic */ void l(ResultCallback resultCallback) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "getWeight mApiAidl is null");
            Log.w("HiHealthKit", "getWeight mApiAidl is null");
        } else {
            q(resultCallback);
        }
    }

    private void q(final ResultCallback resultCallback) {
        try {
            this.d.getWeight(b(), new ICommonListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.4
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i, List list) {
                    Log.i("HiHealthKit", "enter KitAPI getWeightImp onSuccess errorCode:" + i);
                    if (list != null && list.size() > 0) {
                        Float f = (Float) list.get(0);
                        Log.i("HiHealthKit", "getWeightImpl onSuccess weight: " + f.floatValue());
                        HiHealthKitApi.this.c(resultCallback, 0, f);
                        return;
                    }
                    int iD = HiHealthError.d(i);
                    HiHealthKitApi.this.c(resultCallback, iD, HiHealthError.e(iD));
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i, List list) {
                    Log.i("HiHealthKit", "getWeightImpl onfailure");
                    int iD = HiHealthError.d(i);
                    HiHealthKitApi.this.c(resultCallback, iD, HiHealthError.e(iD));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "getWeightImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "getWeightImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    public void e(final HiHealthDataQuery hiHealthDataQuery, final int i, final ResultCallback resultCallback) {
        Log.i("HiHealthKit", "enter execQuery");
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                this.f11822b.e(resultCallback, hiHealthDataQuery, i);
            }
        });
    }

    /* synthetic */ void e(ResultCallback resultCallback, HiHealthDataQuery hiHealthDataQuery, int i) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "execQuery mApiAidl is null");
            Log.w("HiHealthKit", "execQuery mApiAidl is null");
        } else if (!ksx.b(hiHealthDataQuery.getSampleType())) {
            resultCallback.onResultHandler(30, HiHealthError.e(30));
        } else {
            d(hiHealthDataQuery, i, resultCallback);
        }
    }

    class QueryDataResultListener extends IDataReadResultListener.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HiHealthDataQuery f11894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ResultCallback f11895b;
        private boolean d;
        private List e = new ArrayList(10);

        QueryDataResultListener(boolean z, HiHealthDataQuery hiHealthDataQuery, ResultCallback resultCallback) {
            this.d = z;
            this.f11894a = hiHealthDataQuery;
            this.f11895b = resultCallback;
        }

        @Override // com.huawei.hihealth.IDataReadResultListener
        public void onResult(List list, int i, int i2) {
            Log.i("HiHealthKit", "enter KitAPI execQueryImpl onSuccess errorCode:" + i + ", resultType:" + i2);
            if (this.d) {
                d(list, this.e, i);
                d(i, i2);
            } else {
                ArrayList arrayList = new ArrayList(10);
                d(list, arrayList, i);
                e(list, i, arrayList);
            }
        }

        private void e(List list, int i, List list2) {
            if (list != null) {
                this.f11895b.onResultHandler(0, list2);
                return;
            }
            Log.w("HiHealthKit", "dataList is null");
            int iD = HiHealthError.d(i);
            HiHealthKitApi.this.c(this.f11895b, iD, iD == 0 ? new ArrayList(10) : HiHealthError.e(iD));
        }

        private void d(int i, int i2) {
            if (i2 == 2) {
                int iD = HiHealthError.d(i);
                if (this.e.size() == 0) {
                    HiHealthKitApi.this.c(this.f11895b, iD, iD == 0 ? new ArrayList(10) : HiHealthError.e(iD));
                } else {
                    HiHealthKitApi.this.c(this.f11895b, iD, this.e);
                }
                this.e.clear();
            }
        }

        private void d(List list, List list2, int i) {
            if (list != null) {
                Log.i("HiHealthKit", "datas size = " + list.size() + ", error code = " + i);
                switch (AnonymousClass30.d[HiHealthKitApi.this.a(this.f11894a.getSampleType()).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        HiHealthKitApi.this.d(list, list2, this.f11894a);
                        break;
                    case 4:
                        HiHealthKitApi.this.e(list, list2);
                        break;
                    case 5:
                    case 6:
                        HiHealthKitApi.this.a(list, list2);
                        break;
                }
                if (i == this.f11894a.getSampleType()) {
                    HiHealthKitApi.this.b((List<krl>) list2, i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hihealth.HiHealthKitApi$30, reason: invalid class name */
    static /* synthetic */ class AnonymousClass30 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            d = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[HiHealthDataType.Category.STAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[HiHealthDataType.Category.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[HiHealthDataType.Category.SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[HiHealthDataType.Category.SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[HiHealthDataType.Category.SEQUENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public HiHealthDataType.Category a(int i) {
        HiHealthDataType.Category categoryD;
        e();
        if (this.d != null && ksx.d("get_category")) {
            try {
                categoryD = HiHealthDataType.Category.valueOf(this.d.getCategory(i));
            } catch (RemoteException unused) {
                Log.e("HiHealthKit", "getCategory RemoteException");
                categoryD = HiHealthDataType.d(i);
            }
        } else {
            categoryD = HiHealthDataType.d(i);
        }
        return i == 44000 ? HiHealthDataType.Category.SET : categoryD;
    }

    private void d(HiHealthDataQuery hiHealthDataQuery, int i, ResultCallback resultCallback) {
        Log.i("HiHealthKit", "enter execQueryImpl");
        try {
            this.d.execQuery(b(), hiHealthDataQuery, i, new QueryDataResultListener(ksu.c(f11797a, ksu.b()) >= 1010053501, hiHealthDataQuery, resultCallback));
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "execQueryImpl RemoteException");
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "execQueryImpl Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<krl> list, int i) {
        Iterator<krl> it = list.iterator();
        while (it.hasNext()) {
            it.next().setType(i);
        }
    }

    public void c(final HiHealthDataQuery hiHealthDataQuery, final int i, final ResultCallback resultCallback) {
        Log.i("HiHealthKit", "enter querySleepWakeTime");
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f11850a.a(resultCallback, hiHealthDataQuery, i);
            }
        });
    }

    /* synthetic */ void a(ResultCallback resultCallback, HiHealthDataQuery hiHealthDataQuery, int i) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "querySleepWakeTime mApiAidl is null");
            Log.w("HiHealthKit", "execQuery mApiAidl is null");
        } else {
            e(hiHealthDataQuery, resultCallback, i);
        }
    }

    private void e(HiHealthDataQuery hiHealthDataQuery, final ResultCallback resultCallback, int i) {
        if (hiHealthDataQuery.getEndTime() - hiHealthDataQuery.getStartTime() > 345600000) {
            c(resultCallback, 1, "querySleepWakeTime, the period of time should be less than 96 hours.");
            Log.w("HiHealthKit", "The period of time should be less than 96 hours.");
        } else {
            try {
                this.d.querySleepWakeTime(b(), hiHealthDataQuery, i, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.5
                    @Override // com.huawei.hihealth.IDataReadResultListener
                    public void onResult(List list, int i2, int i3) {
                        Log.i("HiHealthKit", "enter KitAPI querySleepWakeTimeImpl onSuccess");
                        try {
                            if (list != null) {
                                Log.i("HiHealthKit", "datas size =" + list.size() + ", error code = " + i2);
                                ArrayList arrayList = new ArrayList(10);
                                HiHealthKitApi.this.a(list, arrayList);
                                resultCallback.onResultHandler(i2, arrayList);
                                return;
                            }
                            Log.w("HiHealthKit", "dataList is null");
                            HiHealthKitApi.this.c(resultCallback, i2, (Object) null);
                        } catch (Exception unused) {
                            Log.w("HiHealthKit", "query sleep wake time exception");
                        }
                    }
                });
            } catch (RemoteException unused) {
                Log.e("HiHealthKit", "querySleepWakeTimeImpl RemoteException");
                c(resultCallback, 4, HiHealthError.e(4));
            }
        }
    }

    public void b(final HiHealthDataQuery hiHealthDataQuery, final ResultCallback resultCallback) {
        Log.i("HiHealthKit", "enter getCount");
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f11841c.d(resultCallback, hiHealthDataQuery);
            }
        });
    }

    /* synthetic */ void d(ResultCallback resultCallback, HiHealthDataQuery hiHealthDataQuery) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "getCount mApiAidl is null");
            Log.w("HiHealthKit", "getCount mApiAidl is null");
        } else {
            e(hiHealthDataQuery, resultCallback);
        }
    }

    private void e(HiHealthDataQuery hiHealthDataQuery, final ResultCallback resultCallback) {
        try {
            final boolean z = ksu.c(f11797a, ksu.b()) >= 1010053501;
            this.d.getCount(b(), hiHealthDataQuery, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.6

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f11889b;

                @Override // com.huawei.hihealth.IDataReadResultListener
                public void onResult(List list, int i, int i2) {
                    Integer num;
                    Log.i("HiHealthKit", "enter KitAPI getCountImpl onSuccess errorCode:" + i + ",resultType:" + i2);
                    if (list == null || !(list.get(0) instanceof Integer)) {
                        num = null;
                    } else {
                        num = (Integer) list.get(0);
                        this.f11889b += num.intValue();
                    }
                    if (z) {
                        c(i, i2);
                    } else {
                        a(list, i, num);
                    }
                }

                private void a(List list, int i, Integer num) {
                    if (list != null) {
                        ResultCallback resultCallback2 = resultCallback;
                        if (num == null) {
                            num = 0;
                        }
                        resultCallback2.onResultHandler(0, num);
                        return;
                    }
                    resultCallback.onResultHandler(HiHealthError.d(i), 0);
                }

                private void c(int i, int i2) {
                    if (i2 == 2) {
                        resultCallback.onResultHandler(HiHealthError.d(i), Integer.valueOf(this.f11889b));
                        this.f11889b = 0;
                    }
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "getCountImpl RemoteException");
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "getCountImpl Exception");
        }
    }

    private void c(HiHealthKitData hiHealthKitData, krl krlVar) {
        String string = hiHealthKitData.getString("device_uniquecode");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String string2 = hiHealthKitData.getString("device_name");
        String string3 = hiHealthKitData.getString("device_model");
        String string4 = hiHealthKitData.getString("deviceType");
        HiHealthDeviceInfo hiHealthDeviceInfo = new HiHealthDeviceInfo(string, string2, string3);
        if (!TextUtils.isEmpty(string4)) {
            hiHealthDeviceInfo.setDeviceType(string4);
        }
        krlVar.setSourceDevice(hiHealthDeviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List list, List list2, HiHealthDataQuery hiHealthDataQuery) {
        krp krpVar;
        if (list == null) {
            Log.w("HiHealthKit", "point data null");
            return;
        }
        Log.i("HiHealthKit", "handlePointData size = " + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HiHealthKitData hiHealthKitData = (HiHealthKitData) it.next();
            if (kss.a(hiHealthDataQuery.getSampleType())) {
                krpVar = new krp(hiHealthKitData.getType(), hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime(), hiHealthKitData.getDoubleValue(), 0);
            } else if (kss.c(hiHealthDataQuery.getSampleType())) {
                krpVar = new krp(hiHealthKitData.getType(), hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime(), hiHealthKitData.getString("metadata"), 0);
            } else {
                krpVar = new krp(hiHealthKitData.getType(), hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime(), hiHealthKitData.getIntValue(), 0);
            }
            c(hiHealthKitData, krpVar);
            krpVar.setUpdateTime(hiHealthKitData.getLong("update_time"));
            list2.add(krpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List list, List list2) {
        if (list == null) {
            Log.w("HiHealthKit", "session data null");
            return;
        }
        Log.i("HiHealthKit", "handleSessionData size = " + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HiHealthKitData hiHealthKitData = (HiHealthKitData) it.next();
            krr krrVar = new krr(hiHealthKitData.getType(), hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime());
            c(hiHealthKitData, krrVar);
            krrVar.setUpdateTime(hiHealthKitData.getLong("update_time"));
            list2.add(krrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list, List list2) {
        if (list != null) {
            Log.i("HiHealthKit", "handleSetData size = " + list.size());
            for (Object obj : list) {
                if (obj instanceof HiHealthKitData) {
                    HiHealthKitData hiHealthKitData = (HiHealthKitData) obj;
                    Map map = hiHealthKitData.getMap();
                    if (map != null) {
                        try {
                            if (map.containsKey("detail_data")) {
                                Object obj2 = map.get("detail_data");
                                if (obj2 instanceof String) {
                                    map.remove("detail_data");
                                    map.put("detail_data", HiZipUtil.c((String) obj2));
                                }
                            }
                        } catch (IOException unused) {
                            Log.e("HiHealthKit", "enter query ecgData IOException");
                        }
                    }
                    krq krqVar = new krq(hiHealthKitData.getType(), hiHealthKitData.getMap(), hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime());
                    c(hiHealthKitData, krqVar);
                    krqVar.setMetaData(hiHealthKitData.getString("metadata"));
                    krqVar.setUpdateTime(hiHealthKitData.getLong("update_time"));
                    list2.add(krqVar);
                }
            }
        }
    }

    public void c(final krl krlVar, final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(resultCallback, krlVar);
            }
        });
    }

    /* synthetic */ void a(ResultCallback resultCallback, krl krlVar) {
        e();
        if (this.d == null) {
            Log.w("HiHealthKit", "saveSample mApiAidl is null");
            c(resultCallback, 1, "saveSample mApiAidl is null");
        } else if (ksw.c(krlVar, resultCallback)) {
            e(krlVar, resultCallback);
        }
    }

    private void e(krl krlVar, final ResultCallback resultCallback) {
        try {
            Log.i("HiHealthKit", "saveSampleImpl set");
            int type = krlVar.getType();
            if (!ksx.d(type)) {
                resultCallback.onResultHandler(30, HiHealthError.e(30));
            } else {
                this.d.saveSample(b(), ksv.e(krlVar, a(type)), new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.7
                    @Override // com.huawei.hihealth.IDataOperateListener
                    public void onResult(int i, List list) {
                        Log.i("HiHealthKit", "enter saveSampleImpl result errorCode:" + i);
                        resultCallback.onResultHandler(HiHealthError.d(i), list);
                    }
                });
            }
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "saveSampleImpl RemoteException");
            resultCallback.onResultHandler(4, null);
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "saveSampleImpl Exception");
            resultCallback.onResultHandler(4, null);
        }
    }

    public void e(final List<krl> list, final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11800b.e(resultCallback, list);
            }
        });
    }

    /* synthetic */ void e(ResultCallback resultCallback, List list) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "saveSamples mApiAidl is null");
            Log.w("HiHealthKit", "saveSamples mApiAidl is null");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            krl krlVar = (krl) it.next();
            if (!ksw.c(krlVar, resultCallback)) {
                return;
            }
            if (!ksx.d(krlVar.getType())) {
                resultCallback.onResult(30, HiHealthError.e(30));
                return;
            }
        }
        c((List<krl>) list, resultCallback);
    }

    private void c(List<krl> list, final ResultCallback resultCallback) {
        int[] iArr = {4};
        Object[] objArr = new Object[1];
        try {
            ArrayList arrayList = new ArrayList(list.size());
            for (krl krlVar : list) {
                arrayList.add(ksv.e(krlVar, a(krlVar.getType())));
            }
            if (ksx.d("save_samples")) {
                if (ksv.c(arrayList)) {
                    a(iArr, objArr, arrayList);
                    c(resultCallback, iArr[0], objArr[0]);
                    return;
                } else {
                    this.d.saveSamples(b(), arrayList, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.8
                        @Override // com.huawei.hihealth.IDataOperateListener
                        public void onResult(int i, List list2) {
                            Log.i("HiHealthKit", "enter saveSamplesImpl result errorCode:" + i);
                            HiHealthKitApi.this.c(resultCallback, HiHealthError.d(i), list2);
                        }
                    });
                    return;
                }
            }
            if (list.size() > 20) {
                c(resultCallback, 2, "too much data!");
                return;
            }
            Iterator<HiHealthKitData> it = arrayList.iterator();
            while (it.hasNext()) {
                d(iArr, objArr, it.next());
            }
            c(resultCallback, iArr[0], objArr[0]);
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "saveSamplesImpl RemoteException");
            c(resultCallback, 4, "RemoteException");
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "save sample Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    private void d(final int[] iArr, final Object[] objArr, HiHealthKitData hiHealthKitData) throws RemoteException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.d.saveSample(b(), hiHealthKitData, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.9
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list) {
                    Log.i("HiHealthKit", "enter saveSampleImpl result errorCode:" + i);
                    iArr[0] = HiHealthError.d(i);
                    objArr[0] = list;
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Log.e("HiHealthKit", "saveSampleImpl InterruptedException");
            }
        } catch (RemoteException e) {
            countDownLatch.countDown();
            throw e;
        }
    }

    private void c(final int[] iArr, final Object[] objArr, List<HiHealthKitData> list) throws InterruptedException, RemoteException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.d.saveSamples(b(), list, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.10
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list2) {
                    Log.i("HiHealthKit", "enter saveSamplesImpl result errorCode:" + i);
                    iArr[0] = HiHealthError.d(i);
                    objArr[0] = list2;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(30L, TimeUnit.SECONDS);
        } catch (RemoteException e) {
            countDownLatch.countDown();
            throw e;
        }
    }

    private void a(int[] iArr, Object[] objArr, List<HiHealthKitData> list) throws InterruptedException, RemoteException {
        int iB = ksv.b(list);
        int size = list.size();
        int i = (int) ((size * 524288.0f) / iB);
        if (i == 0) {
            i = 1;
        }
        Log.i("HiHealthKit", "divideSaveSamplesImpl dataList size = " + size + ", parcelSize = " + iB + ", divideLength = " + i);
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + i;
            if (i3 >= size) {
                c(iArr, objArr, list.subList(i2, size));
            } else {
                c(iArr, objArr, list.subList(i2, i3));
            }
            i2 = i3;
        }
    }

    public void d(final krl krlVar, final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(resultCallback, krlVar);
            }
        });
    }

    /* synthetic */ void e(ResultCallback resultCallback, krl krlVar) {
        e();
        if (this.d == null) {
            Log.w("HiHealthKit", "deleteSample mApiAidl is null");
            c(resultCallback, 1, HiHealthError.e(1));
        } else if (krlVar == null) {
            Log.w("HiHealthKit", "deleteSample hiHealthData is null");
            c(resultCallback, 2, HiHealthError.e(2));
        } else {
            if (ksx.d("delete_sample")) {
                a(krlVar, resultCallback);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(krlVar);
            b(arrayList, resultCallback);
        }
    }

    private void a(krl krlVar, ResultCallback resultCallback) {
        Log.i("HiHealthKit", "deleteSampleImpl " + krlVar.getType());
        final int[] iArr = {4};
        final Object[] objArr = new Object[1];
        if (!ksx.a(krlVar.getType())) {
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            return;
        }
        try {
            try {
                this.d.deleteSample(b(), ksv.e(krlVar, a(krlVar.getType())), new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.11
                    @Override // com.huawei.hihealth.IDataOperateListener
                    public void onResult(int i, List list) {
                        Log.i("HiHealthKit", "enter deleteSample result:" + i);
                        iArr[0] = HiHealthError.d(i);
                        objArr[0] = list;
                    }
                });
                if (resultCallback != null) {
                    resultCallback.onResultHandler(iArr[0], objArr[0]);
                }
                Log.i("HiHealthKit", "deleteSampleImpl end");
            } catch (RemoteException unused) {
                Log.e("HiHealthKit", "deleteSampleImpl RemoteException");
                iArr[0] = 4;
                objArr[0] = "RemoteException";
                if (resultCallback != null) {
                    resultCallback.onResultHandler(4, "RemoteException");
                }
                Log.i("HiHealthKit", "deleteSampleImpl end");
            } catch (Exception unused2) {
                Log.e("HiHealthKit", "deleteSampleImpl Exception");
                iArr[0] = 4;
                String strE = HiHealthError.e(4);
                objArr[0] = strE;
                if (resultCallback != null) {
                    resultCallback.onResultHandler(iArr[0], strE);
                }
                Log.i("HiHealthKit", "deleteSampleImpl end");
            }
        } catch (Throwable th) {
            if (resultCallback != null) {
                resultCallback.onResultHandler(iArr[0], objArr[0]);
            }
            Log.i("HiHealthKit", "deleteSampleImpl end");
            throw th;
        }
    }

    public void d(final List<krl> list, final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                this.f11813b.c(resultCallback, list);
            }
        });
    }

    /* synthetic */ void c(ResultCallback resultCallback, List list) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "deleteSamples mApiAidl is null");
            Log.w("HiHealthKit", "deleteSamples mApiAidl is null");
        } else if (list == null || list.size() > 20) {
            c(resultCallback, 2, "too much data!");
        } else {
            b((List<krl>) list, resultCallback);
        }
    }

    private void b(List<krl> list, ResultCallback resultCallback) {
        Log.i("HiHealthKit", "deleteSamplesImpl set");
        final int[] iArr = {4};
        final Object[] objArr = new Object[1];
        for (krl krlVar : list) {
            if (!ksx.a(krlVar.getType())) {
                Log.w("HiHealthKit", "delete type is not allowed : " + krlVar.getType());
                resultCallback.onResult(30, HiHealthError.e(30));
                return;
            }
        }
        try {
            try {
                try {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (krl krlVar2 : list) {
                        arrayList.add(ksv.e(krlVar2, a(krlVar2.getType())));
                    }
                    this.d.deleteSamples(b(), arrayList, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.12
                        @Override // com.huawei.hihealth.IDataOperateListener
                        public void onResult(int i, List list2) {
                            Log.i("HiHealthKit", "enter deleteSamplesImpl result:" + i);
                            iArr[0] = HiHealthError.d(i);
                            objArr[0] = list2;
                        }
                    });
                    if (resultCallback != null) {
                        resultCallback.onResultHandler(iArr[0], objArr[0]);
                    }
                    Log.i("HiHealthKit", "deleteSamplesImpl end");
                } catch (RemoteException unused) {
                    Log.e("HiHealthKit", "deleteSamplesImpl RemoteException");
                    iArr[0] = 4;
                    objArr[0] = "RemoteException";
                    if (resultCallback != null) {
                        resultCallback.onResultHandler(4, "RemoteException");
                    }
                    Log.i("HiHealthKit", "deleteSamplesImpl end");
                }
            } catch (Exception unused2) {
                Log.e("HiHealthKit", "deleteSamplesImpl Exception");
                iArr[0] = 4;
                String strE = HiHealthError.e(4);
                objArr[0] = strE;
                if (resultCallback != null) {
                    resultCallback.onResultHandler(iArr[0], strE);
                }
                Log.i("HiHealthKit", "deleteSamplesImpl end");
            }
        } catch (Throwable th) {
            if (resultCallback != null) {
                resultCallback.onResultHandler(iArr[0], objArr[0]);
            }
            Log.i("HiHealthKit", "deleteSamplesImpl end");
            throw th;
        }
    }

    public void a(final HiRealTimeListener hiRealTimeListener) {
        if (hiRealTimeListener == null) {
            return;
        }
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f11848a.d(hiRealTimeListener);
            }
        });
    }

    /* synthetic */ void d(HiRealTimeListener hiRealTimeListener) {
        e();
        if (this.d == null) {
            hiRealTimeListener.onResultHandler(1);
            Log.w("HiHealthKit", "startReadingHeartRate mApiAidl is null");
        } else {
            i(hiRealTimeListener);
        }
    }

    private void i(final HiRealTimeListener hiRealTimeListener) {
        try {
            this.d.startReadingHeartRate(b(), new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.13
                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onResult(int i) {
                    Log.i("HiHealthKit", "startReadingHeartRateImpl onResultHandler:" + i);
                    hiRealTimeListener.onResultHandler(HiHealthError.d(i));
                }

                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onChange(int i, String str) {
                    hiRealTimeListener.onChangeHandler(HiHealthError.d(i), str);
                }
            });
            Log.i("HiHealthKit", "startReadingHeartRateImpl end");
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "startReadingHeartRateImpl RemoteException");
            hiRealTimeListener.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "startReadingHeartRateImpl Exception");
            hiRealTimeListener.onResultHandler(4);
        }
    }

    public void g(final HiRealTimeListener hiRealTimeListener) {
        if (hiRealTimeListener == null) {
            return;
        }
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                this.f11831a.e(hiRealTimeListener);
            }
        });
    }

    /* synthetic */ void e(HiRealTimeListener hiRealTimeListener) {
        e();
        if (this.d == null) {
            hiRealTimeListener.onResultHandler(1);
            Log.w("HiHealthKit", "stopReadingHeartRate mApiAidl is null");
        } else {
            k(hiRealTimeListener);
        }
    }

    private void k(final HiRealTimeListener hiRealTimeListener) {
        try {
            this.d.stopReadingHeartRate(b(), new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.14
                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onResult(int i) {
                    Log.i("HiHealthKit", "stopReadingHeartRateImpl onResultHandler:" + i);
                    hiRealTimeListener.onResultHandler(HiHealthError.d(i));
                }

                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onChange(int i, String str) {
                    hiRealTimeListener.onChangeHandler(HiHealthError.d(i), str);
                }
            });
            Log.i("HiHealthKit", "stopReadingHeartRateImpl end");
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "stopReadingHeartRateImpl RemoteException");
            hiRealTimeListener.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "stopReadingHeartRateImpl Exception");
            hiRealTimeListener.onResultHandler(4);
        }
    }

    public void f(final HiRealTimeListener hiRealTimeListener) {
        if (hiRealTimeListener == null) {
            return;
        }
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(hiRealTimeListener);
            }
        });
    }

    /* synthetic */ void b(HiRealTimeListener hiRealTimeListener) {
        e();
        if (this.d == null) {
            hiRealTimeListener.onResultHandler(1);
            Log.w("HiHealthKit", "startReadingRri mApiAidl is null");
        } else {
            h(hiRealTimeListener);
        }
    }

    private void h(final HiRealTimeListener hiRealTimeListener) {
        try {
            this.d.startReadingRRI(b(), new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.15
                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onResult(int i) {
                    Log.i("HiHealthKit", "startReadingRriImpl onResultHandler:" + i);
                    hiRealTimeListener.onResultHandler(HiHealthError.d(i));
                }

                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onChange(int i, String str) {
                    hiRealTimeListener.onChangeHandler(HiHealthError.d(i), str);
                }
            });
            Log.i("HiHealthKit", "startReadingRriImpl end");
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "startReadingRriImpl RemoteException");
            hiRealTimeListener.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "startReadingRriImpl Exception");
            hiRealTimeListener.onResultHandler(4);
        }
    }

    public void j(final HiRealTimeListener hiRealTimeListener) {
        if (hiRealTimeListener == null) {
            return;
        }
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(hiRealTimeListener);
            }
        });
    }

    /* synthetic */ void c(HiRealTimeListener hiRealTimeListener) {
        e();
        if (this.d == null) {
            hiRealTimeListener.onResultHandler(1);
            Log.w("HiHealthKit", "stopReadingRri mApiAidl is null");
        } else {
            m(hiRealTimeListener);
        }
    }

    private void m(final HiRealTimeListener hiRealTimeListener) {
        try {
            this.d.stopReadingRRI(b(), new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.16
                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onResult(int i) {
                    Log.i("HiHealthKit", "stopReadingRriImpl onResultHandler:" + i);
                    hiRealTimeListener.onResultHandler(HiHealthError.d(i));
                }

                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onChange(int i, String str) {
                    hiRealTimeListener.onChangeHandler(HiHealthError.d(i), str);
                }
            });
            Log.i("HiHealthKit", "stopReadingRriImpl end");
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "stopReadingRriImpl RemoteException");
            hiRealTimeListener.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "stopReadingRriImpl Exception");
            hiRealTimeListener.onResultHandler(4);
        }
    }

    public void c(final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                this.f11838b.j(resultCallback);
            }
        });
    }

    /* synthetic */ void j(ResultCallback resultCallback) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "getDeviceList mApiAidl is null");
            Log.w("HiHealthKit", "getDeviceList mApiAidl is null");
        } else {
            s(resultCallback);
        }
    }

    private void s(final ResultCallback resultCallback) {
        try {
            this.d.getDeviceList(b(), new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.17
                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onResult(int i) {
                    Log.i("HiHealthKit", "getDeviceListImpl onResultHandler");
                    HiHealthKitApi.this.c(resultCallback, i, HiHealthError.e(i));
                }

                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onChange(int i, String str) {
                    HiHealthKitApi.this.c(resultCallback, i, str);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "getDeviceListImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "getDeviceListImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    public void a(final String str, final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f11806c.a(resultCallback, str);
            }
        });
    }

    /* synthetic */ void a(ResultCallback resultCallback, String str) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "sendDeviceCommand mApiAidl is null");
            Log.w("HiHealthKit", "sendDeviceCommand mApiAidl is null");
        } else {
            b(str, resultCallback);
        }
    }

    private void b(String str, final ResultCallback resultCallback) {
        try {
            this.d.sendDeviceCommand(b(), str, new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.18
                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onResult(int i) {
                    Log.i("HiHealthKit", "sendDeviceCommandImpl onResultHandler errCode = " + i);
                    HiHealthKitApi.this.c(resultCallback, i, HiHealthError.e(i));
                }

                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onChange(int i, String str2) {
                    HiHealthKitApi.this.c(resultCallback, i, str2);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "sendDeviceCommandImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "sendDeviceCommandImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    public void k(final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                this.f11827a.n(resultCallback);
            }
        });
    }

    /* synthetic */ void n(ResultCallback resultCallback) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "startReadingAtrial mApiAidl is null");
            Log.w("HiHealthKit", "startReadingAtrial mApiAidl is null");
        } else {
            x(resultCallback);
        }
    }

    private void x(final ResultCallback resultCallback) {
        try {
            this.d.startReadingAtrial(b(), new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.19
                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onResult(int i) {
                    Log.i("HiHealthKit", "startReadingAtrialImpl onResultHandler errCode = " + i);
                    HiHealthKitApi.this.c(resultCallback, i, HiHealthError.e(i));
                }

                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onChange(int i, String str) {
                    HiHealthKitApi.this.c(resultCallback, i, str);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "startReadingAtrialImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "startReadingAtrialImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    public void m(final ResultCallback resultCallback) {
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.e.o(resultCallback);
            }
        });
    }

    /* synthetic */ void o(ResultCallback resultCallback) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "stopReadingAtrial mApiAidl is null");
            Log.w("HiHealthKit", "stopReadingAtrial mApiAidl is null");
        } else {
            v(resultCallback);
        }
    }

    private void v(final ResultCallback resultCallback) {
        try {
            this.d.stopReadingAtrial(b(), new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.20
                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onResult(int i) {
                    Log.i("HiHealthKit", "stopReadingAtrialImpl onResultHandler errCode = " + i);
                    HiHealthKitApi.this.c(resultCallback, i, HiHealthError.e(i));
                }

                @Override // com.huawei.hihealth.IRealTimeDataCallback
                public void onChange(int i, String str) {
                    HiHealthKitApi.this.c(resultCallback, i, str);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "stopReadingAtrialImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "stopReadingAtrialImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    /* synthetic */ void d(ResultCallback resultCallback, String str, String str2) {
        e();
        if (this.d == null) {
            Log.w("HiHealthKit", "pushMsgToWearable:mApiAidl is null");
            c(resultCallback, 1, HiHealthError.e(1));
        } else {
            e(str, str2, resultCallback);
        }
    }

    private void e(String str, String str2, final ResultCallback resultCallback) {
        try {
            this.d.pushMsgToWearable(str, str2, new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.21
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str3) {
                    resultCallback.onResultHandler(i, str3);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "pushMsgToWearableImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "pushMsgToWearableImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    /* synthetic */ void a(ResultCallback resultCallback, String str, String str2, OutputStream outputStream) {
        e();
        if (this.d == null) {
            Log.w("HiHealthKit", "readFromWearable:mApiAidl is null");
            c(resultCallback, 1, HiHealthError.e(1));
        } else {
            c(str, str2, outputStream, resultCallback);
        }
    }

    private void c(String str, String str2, OutputStream outputStream, ResultCallback resultCallback) {
        try {
            d(str, str2, outputStream, resultCallback);
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "readFromWearableImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "readFromWearableImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    private void d(String str, String str2, final OutputStream outputStream, final ResultCallback resultCallback) throws RemoteException {
        this.d.readFromWearable(str, str2, new IReadCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.22
            @Override // com.huawei.hihealth.IReadCallback
            public void onResult(int i, String str3, byte[] bArr) {
                if (i == 0) {
                    try {
                        OutputStream outputStream2 = outputStream;
                        if (outputStream2 != null && bArr != null) {
                            outputStream2.write(bArr);
                        }
                        resultCallback.onResultHandler(0, str3);
                        return;
                    } catch (IOException unused) {
                        Log.e("HiHealthKit", "readFromWearableAidl IOException");
                        HiHealthKitApi.this.c(resultCallback, 4, HiHealthError.e(4));
                        return;
                    }
                }
                resultCallback.onResultHandler(i, str3);
            }
        });
    }

    /* synthetic */ void e(ResultCallback resultCallback, InputStream inputStream, String str, String str2) {
        e();
        if (this.d == null) {
            Log.w("HiHealthKit", "writeToWearable:mApiAidl is null");
            c(resultCallback, 1, HiHealthError.e(1));
        } else {
            b(inputStream, str, str2, resultCallback);
        }
    }

    private void c(String str, String str2, byte[] bArr, String str3, final ResultCallback resultCallback) {
        try {
            this.d.writeToWearable(str, str2, bArr, str3, new IWriteCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.23
                @Override // com.huawei.hihealth.IWriteCallback
                public void onResult(int i, String str4) {
                    resultCallback.onResultHandler(HiHealthError.d(i), str4);
                }
            });
        } catch (TransactionTooLargeException unused) {
            Log.e("HiHealthKit", "writeToWearable TransactionTooLargeException");
            c(resultCallback, 1021, HiHealthError.e(1021));
        } catch (RemoteException unused2) {
            Log.e("HiHealthKit", "writeToWearable RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused3) {
            Log.e("HiHealthKit", "writeToWearable Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    private void b(InputStream inputStream, String str, String str2, ResultCallback resultCallback) {
        byte[] bArr;
        boolean z;
        if (inputStream != null) {
            Log.i("HiHealthKit", "writeToWearableImpl is a big file.");
            try {
                try {
                    try {
                        int iAvailable = inputStream.available();
                        byte[] bArr2 = new byte[Constants.IMG_SIZE_UPPER_LIMIT_KB];
                        boolean z2 = false;
                        int i = iAvailable;
                        while (i > 0) {
                            if (i >= 51200) {
                                z = z2;
                                bArr = bArr2;
                            } else {
                                bArr = new byte[i];
                                z = true;
                            }
                            int i2 = inputStream.read(bArr);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("size", iAvailable);
                            jSONObject.put("is_finished", z);
                            boolean z3 = z;
                            c(str, str2, bArr, jSONObject.toString(), resultCallback);
                            i -= i2;
                            z2 = z3;
                        }
                    } catch (JSONException unused) {
                        Log.e("HiHealthKit", "writeToWearableImpl JSONException");
                        c(resultCallback, 4, HiHealthError.e(4));
                        c(str, str2, null, null, resultCallback);
                    }
                } catch (IOException unused2) {
                    Log.e("HiHealthKit", "writeToWearableImpl IOException");
                    c(resultCallback, 4, HiHealthError.e(4));
                    c(str, str2, null, null, resultCallback);
                }
                try {
                    inputStream.close();
                    return;
                } catch (IOException unused3) {
                    Log.e("HiHealthKit", "writeToWearableImpl:close inputStream IOException");
                    return;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                    Log.e("HiHealthKit", "writeToWearableImpl:close inputStream IOException");
                }
                throw th;
            }
        }
        Log.i("HiHealthKit", "writeToWearableImpl is not a big file.");
        c(str, str2, null, null, resultCallback);
    }

    public void e(final HiSportDataCallback hiSportDataCallback) {
        Log.i("HiHealthKit", "startRealTimeSportData");
        if (hiSportDataCallback == null) {
            Log.w("HiHealthKit", "startRealTimeSportData callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11818b.c(hiSportDataCallback);
                }
            });
        }
    }

    /* synthetic */ void c(HiSportDataCallback hiSportDataCallback) {
        e();
        if (this.d == null) {
            Log.w("HiHealthKit", "fetchRealTimeSportData mApiAidl is null");
            hiSportDataCallback.onResultHandler(1);
        } else {
            b(hiSportDataCallback);
        }
    }

    private void b(final HiSportDataCallback hiSportDataCallback) {
        try {
            this.d.registerRealTimeSportCallback(new ISportDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.24
                @Override // com.huawei.hihealth.ISportDataCallback
                public void onResult(int i) {
                    if (i == 0) {
                        HiHealthKitApi.this.h.add(hiSportDataCallback);
                    }
                    Log.i("HiHealthKit", "startRealTimeSportDataImpl onResultHandler errCode = " + i);
                    hiSportDataCallback.onResultHandler(HiHealthError.d(i));
                }

                @Override // com.huawei.hihealth.ISportDataCallback
                public void onDataChanged(int i, Bundle bundle) {
                    Log.i("HiHealthKit", "startRealTimeSportDataImpl onDataChanged sportState = " + i);
                    Log.i("HiHealthKit", "startRealTimeSportDataImpl onDataChanged bundle = " + bundle);
                    hiSportDataCallback.onDataChangedHandler(i, bundle);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "startRealTimeSportDataImpl RemoteException");
            hiSportDataCallback.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "startRealTimeSportDataImpl Exception");
            hiSportDataCallback.onResultHandler(4);
        }
    }

    public void d(final HiSportDataCallback hiSportDataCallback) {
        Log.i("HiHealthKit", "stopRealTimeSportData");
        if (hiSportDataCallback == null) {
            Log.w("HiHealthKit", "stopRealTimeSportData callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11834c.a(hiSportDataCallback);
                }
            });
        }
    }

    /* synthetic */ void a(HiSportDataCallback hiSportDataCallback) {
        e();
        if (this.d == null) {
            Log.w("HiHealthKit", "stopRealTimeSportData mApiAidl is null");
            hiSportDataCallback.onResultHandler(1);
        } else {
            f(hiSportDataCallback);
        }
    }

    private void f(final HiSportDataCallback hiSportDataCallback) {
        try {
            this.d.unregisterRealTimeSportCallback(new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.25
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str) {
                    if (i == 0) {
                        HiHealthKitApi.this.h.remove(hiSportDataCallback);
                    }
                    Log.i("HiHealthKit", "stopRealTimeSportDataImpl errorCode = " + i);
                    hiSportDataCallback.onResultHandler(HiHealthError.d(i));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "stopRealTimeSportDataImpl RemoteException");
            hiSportDataCallback.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "stopRealTimeSportDataImpl Exception");
            hiSportDataCallback.onResultHandler(4);
        }
    }

    /* synthetic */ void e(ResultCallback resultCallback, String str) {
        e();
        if (this.d == null) {
            c(resultCallback, 1, "getSwitch mApiAidl is null");
            Log.w("HiHealthKit", "getSwitch mApiAidl is null");
        } else {
            d(str, resultCallback);
        }
    }

    private void d(String str, final ResultCallback resultCallback) {
        try {
            this.d.getSwitch(b(), str, new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.26
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str2) {
                    Log.i("HiHealthKit", "getSwitchImpl onResultHandler errCode = " + i);
                    HiHealthKitApi.this.c(resultCallback, i, str2);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "getSwitchImpl RemoteException");
            c(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "getSwitchImpl Exception");
            c(resultCallback, 4, HiHealthError.e(4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ResultCallback resultCallback, int i, Object obj) {
        if (resultCallback != null) {
            resultCallback.onResultHandler(i, obj);
        }
    }

    /* synthetic */ void e(int i, final ResultCallback resultCallback) {
        e();
        try {
            this.d.startSport(i, new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.27
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i2, String str) throws RemoteException {
                    Log.i("HiHealthKit", "start sport errorCode = " + i2);
                    resultCallback.onResultHandler(i2, str);
                    if (i2 == 0) {
                        HiHealthKitApi.this.d.setBinder(HiHealthKitApi.this.f11799b);
                    }
                }
            });
        } catch (RemoteException unused) {
            Log.w("HiHealthKit", "remote Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.w("HiHealthKit", "unknown Exception");
            resultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    /* synthetic */ void f(ResultCallback resultCallback) {
        e();
        if (this.d == null) {
            resultCallback.onResultHandler(1, HiHealthError.e(1));
            Log.w("HiHealthKit", "getServiceApiLevel mApiAidl is null");
        } else {
            resultCallback.onResultHandler(0, Integer.valueOf(ksx.d()));
        }
    }

    public void a(final HiHealthCapabilityQuery hiHealthCapabilityQuery, final CapabilityResultCallback capabilityResultCallback) {
        Log.i("HiHealthKit", "enter getHealthyLivingData");
        if (capabilityResultCallback == null) {
            Log.w("HiHealthKit", "callback is null");
        } else {
            this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11819a.e(capabilityResultCallback, hiHealthCapabilityQuery);
                }
            });
        }
    }

    /* synthetic */ void e(final CapabilityResultCallback capabilityResultCallback, HiHealthCapabilityQuery hiHealthCapabilityQuery) {
        e();
        IHiHealthKit iHiHealthKit = this.d;
        if (iHiHealthKit == null) {
            capabilityResultCallback.onResultHandler(1, "getHealthyLivingData mApiAidl is null");
            Log.w("HiHealthKit", "execQuery mApiAidl is null");
            return;
        }
        try {
            iHiHealthKit.getHealthyLivingData(b(), hiHealthCapabilityQuery, new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.28
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str) {
                    Log.i("HiHealthKit", "getHealthyLivingData result : " + i);
                    capabilityResultCallback.onResultHandler(HiHealthError.d(i), str);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "getHealthyLivingData RemoteException");
            capabilityResultCallback.onResultHandler(4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "getHealthyLivingData Exception");
            capabilityResultCallback.onResultHandler(4, HiHealthError.e(4));
        }
    }

    public void e(final HealthKitDictQuery healthKitDictQuery, final IuniversalCallback iuniversalCallback) {
        Log.i("HiHealthKit", "enter queryData");
        this.f.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitApi$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                this.f11829b.c(iuniversalCallback, healthKitDictQuery);
            }
        });
    }

    /* synthetic */ void c(IuniversalCallback iuniversalCallback, HealthKitDictQuery healthKitDictQuery) {
        e();
        if (this.d == null) {
            Log.w("HiHealthKit", "queryData mApiAidl is null");
            iuniversalCallback.onResultHandler(1, null, HiHealthError.e(1));
        } else if (!ksx.e(healthKitDictQuery.getSampleType())) {
            iuniversalCallback.onResultHandler(30, null, HiHealthError.e(30));
        } else {
            a(healthKitDictQuery, iuniversalCallback);
        }
    }

    private void a(final HealthKitDictQuery healthKitDictQuery, final IuniversalCallback iuniversalCallback) {
        try {
            final ArrayList arrayList = new ArrayList(10);
            this.d.queryData(healthKitDictQuery, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitApi.29
                @Override // com.huawei.hihealth.IDataReadResultListener
                public void onResult(List list, int i, int i2) {
                    Log.i("HiHealthKit", "enter KitAPI queryDataImp onSuccess " + i);
                    int iD = HiHealthError.d(i);
                    if (list != null) {
                        DictDataTransformUtil.c(HiHealthKitApi.this.a(healthKitDictQuery.getSampleType()), list, arrayList);
                    }
                    DictDataTransformUtil.d(iD, i2, arrayList, iuniversalCallback);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKit", "queryDataImp RemoteException");
            iuniversalCallback.onResultHandler(4, null, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKit", "queryDataImp Exception");
            iuniversalCallback.onResultHandler(4, null, HiHealthError.e(4));
        }
    }

    /* synthetic */ void a() {
        Log.i("HiHealthKit", "enter unBindHealthService");
        if (this.d != null) {
            try {
                f11797a.unbindService(Instance.f11893b);
                this.d = null;
                return;
            } catch (Exception unused) {
                Log.w("HiHealthKit", "unbind service exception");
                return;
            }
        }
        Log.w("HiHealthKit", "no need to unbind");
    }
}
