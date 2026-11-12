package com.huawei.hihealth;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
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
import com.huawei.hihealthkit.context.OutOfBandContext;
import com.huawei.hihealthkit.context.OutOfBandData;
import com.huawei.hihealthkit.data.store.HiRealTimeListener;
import com.huawei.hihealthkit.data.store.HiSportDataCallback;
import com.huawei.hihealthkit.data.type.HiHealthDataType;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.krl;
import defpackage.krp;
import defpackage.krq;
import defpackage.krr;
import defpackage.kss;
import defpackage.ksu;
import defpackage.ksv;
import defpackage.ksx;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthKitExtendApi implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile OutOfBandContext f11898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f11899c;
    private IHiHealthKitEx e;
    private ExecutorService g;
    private CountDownLatch h;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f11897a = new Object();

    private HiHealthKitExtendApi() {
        this.f11899c = false;
        this.g = Executors.newSingleThreadExecutor();
    }

    public static HiHealthKitExtendApi a(OutOfBandContext outOfBandContext) {
        HiHealthKitExtendApi hiHealthKitExtendApi;
        synchronized (HiHealthKitExtendApi.class) {
            if (outOfBandContext != null) {
                f11898b = outOfBandContext;
            }
            hiHealthKitExtendApi = Instance.e;
        }
        return hiHealthKitExtendApi;
    }

    public void b(final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                this.f11920b.f(resultCallback);
            }
        });
    }

    /* synthetic */ void f(final ResultCallback resultCallback) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "getGender mApiAidl is null");
            Log.w("HiHealthKitExtend", "getGender mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.getGender(f11898b.getOutOfBandData(), new ICommonListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.1
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i, List list) {
                    Log.i("HiHealthKitExtend", "enter KitExAPI getGender onSuccess");
                    if (list == null || list.size() <= 0) {
                        HiHealthKitExtendApi.this.d(resultCallback, 1, HiHealthError.e(1));
                        return;
                    }
                    Integer num = (Integer) list.get(0);
                    num.intValue();
                    HiHealthKitExtendApi.this.d(resultCallback, 0, num);
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i, List list) {
                    int iD = HiHealthError.d(i);
                    HiHealthKitExtendApi.this.d(resultCallback, iD, HiHealthError.e(iD));
                    Log.i("HiHealthKitExtend", "get gender onfailure");
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "get gender RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "getGender Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    public void a(final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f11912b.i(resultCallback);
            }
        });
    }

    /* synthetic */ void i(final ResultCallback resultCallback) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "getBirthday mApiAidl is null");
            Log.w("HiHealthKitExtend", "getBirthday mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.getBirthday(f11898b.getOutOfBandData(), new ICommonListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.2
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i, List list) {
                    Log.i("HiHealthKitExtend", "enter KitAPI getBirthday onSuccess");
                    if (list == null || list.size() <= 0) {
                        HiHealthKitExtendApi.this.d(resultCallback, 1, HiHealthError.e(1));
                        return;
                    }
                    Integer num = (Integer) list.get(0);
                    num.intValue();
                    HiHealthKitExtendApi.this.d(resultCallback, 0, num);
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i, List list) {
                    Log.i("HiHealthKitExtend", "get birthday onfailure");
                    int iD = HiHealthError.d(i);
                    HiHealthKitExtendApi.this.d(resultCallback, iD, HiHealthError.e(iD));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "get birthday RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "get birthday Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    public void d(final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11901b.j(resultCallback);
            }
        });
    }

    /* synthetic */ void j(final ResultCallback resultCallback) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "getHeight mApiAidl is null");
            Log.w("HiHealthKitExtend", "getHeight mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.getHeight(f11898b.getOutOfBandData(), new ICommonListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.3
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i, List list) {
                    Log.i("HiHealthKitExtend", "getHeight:onSuccess");
                    if (list == null || list.size() <= 0) {
                        HiHealthKitExtendApi.this.d(resultCallback, 1, HiHealthError.e(1));
                        return;
                    }
                    Integer num = (Integer) list.get(0);
                    Log.d("HiHealthKitExtend", "getHeight height: " + num.intValue());
                    HiHealthKitExtendApi.this.d(resultCallback, 0, num);
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i, List list) {
                    Log.i("HiHealthKitExtend", "getHeight onfailure");
                    int iD = HiHealthError.d(i);
                    HiHealthKitExtendApi.this.d(resultCallback, iD, HiHealthError.e(iD));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "getHeight RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "getHeight Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    public void c(final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f11925b.o(resultCallback);
            }
        });
    }

    /* synthetic */ void o(final ResultCallback resultCallback) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "getWeight mApiAidl is null");
            Log.w("HiHealthKitExtend", "getWeight mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.getWeight(f11898b.getOutOfBandData(), new ICommonListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.4
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i, List list) {
                    Log.i("HiHealthKitExtend", "enter KitAPI getWeight onSuccess");
                    if (list == null || list.size() <= 0) {
                        HiHealthKitExtendApi.this.d(resultCallback, 1, HiHealthError.e(1));
                        return;
                    }
                    Float f = (Float) list.get(0);
                    Log.i("HiHealthKitExtend", "getWeight onSuccess weight: " + f.floatValue());
                    HiHealthKitExtendApi.this.d(resultCallback, 0, f);
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i, List list) {
                    Log.i("HiHealthKitExtend", "get weight onfailure");
                    int iD = HiHealthError.d(i);
                    HiHealthKitExtendApi.this.d(resultCallback, iD, HiHealthError.e(iD));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "get weight RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "get weight Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    public void c(final HiHealthDataQuery hiHealthDataQuery, final int i, final ResultCallback resultCallback) {
        Log.i("HiHealthKitExtend", "enter execQuery");
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f11914b.e(resultCallback, hiHealthDataQuery, i);
            }
        });
    }

    /* synthetic */ void e(final ResultCallback resultCallback, final HiHealthDataQuery hiHealthDataQuery, int i) {
        c();
        if (this.e == null) {
            d(resultCallback, 1, "execQuery mApiAidl is null");
            Log.w("HiHealthKitExtend", "execQuery mApiAidl is null");
        } else {
            if (!ksx.b(hiHealthDataQuery.getSampleType())) {
                resultCallback.onResultHandler(30, HiHealthError.e(30));
                return;
            }
            try {
                this.e.execQuery(f11898b.getOutOfBandData(), hiHealthDataQuery, i, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.5
                    final List e = new ArrayList(10);

                    @Override // com.huawei.hihealth.IDataReadResultListener
                    public void onResult(List list, int i2, int i3) {
                        Log.i("HiHealthKitExtend", "enter KitAPI execQuery onSuccess, errorCode = " + i2 + "resultType = " + i3);
                        HiHealthKitExtendApi.this.e(i2, hiHealthDataQuery.getSampleType(), list, this.e);
                        e(i2, i3);
                    }

                    private void e(int i2, int i3) {
                        if (i3 == 2) {
                            int iD = HiHealthError.d(i2);
                            if (this.e.size() == 0) {
                                HiHealthKitExtendApi.this.d(resultCallback, iD, iD == 0 ? new ArrayList(10) : HiHealthError.e(iD));
                            } else {
                                HiHealthKitExtendApi.this.d(resultCallback, iD, this.e);
                            }
                            this.e.clear();
                        }
                    }
                });
            } catch (RemoteException unused) {
                Log.e("HiHealthKitExtend", "exec query RemoteException");
            } catch (Exception unused2) {
                Log.e("HiHealthKitExtend", "exec query Exception");
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hihealth.HiHealthKitExtendApi$6, reason: invalid class name */
    class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OutputStream f11987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HiHealthDataQuery f11988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11989c;
        final /* synthetic */ HiHealthKitExtendApi d;
        final /* synthetic */ ResultCallback e;

        @Override // java.lang.Runnable
        public void run() {
            this.d.c();
            if (this.d.e == null) {
                this.d.d(this.e, 1, "execQuery mApiAidl is null");
                Log.w("HiHealthKitExtend", "execQuery mApiAidl is null");
                return;
            }
            try {
                this.d.e.execQuery(HiHealthKitExtendApi.f11898b.getOutOfBandData(), this.f11988b, this.f11989c, this.d.new SequenceDataProxy(this.f11987a, this.e));
            } catch (RemoteException unused) {
                Log.e("HiHealthKitExtend", "exec query ecgData RemoteException");
            } catch (Exception unused2) {
                Log.e("HiHealthKitExtend", "exec query ecgData Exception");
            }
        }
    }

    public void c(final HiHealthAggregateQuery hiHealthAggregateQuery, final int i, final ResultCallback resultCallback) {
        Log.i("HiHealthKitExtend", "enter execQuery");
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f11909c.d(resultCallback, hiHealthAggregateQuery, i);
            }
        });
    }

    /* synthetic */ void d(final ResultCallback resultCallback, final HiHealthAggregateQuery hiHealthAggregateQuery, int i) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "exec query mApiAidl is null");
            Log.w("HiHealthKitExtend", "execQuery mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.execAggregateQuery(f11898b.getOutOfBandData(), hiHealthAggregateQuery, i, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.7

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                boolean f11991b;

                @Override // com.huawei.hihealth.IDataReadResultListener
                public void onResult(List list, int i2, int i3) {
                    Log.i("HiHealthKitExtend", "execQuery execAggregateQuery onSuccess");
                    if (list != null) {
                        Log.i("HiHealthKitExtend", "execQuery, datas size = " + list.size() + ", errorCode = " + i2);
                        ArrayList arrayList = new ArrayList(10);
                        HiHealthKitExtendApi.this.e(i2, hiHealthAggregateQuery.getSampleType(), list, arrayList);
                        this.f11991b = true;
                        resultCallback.onResultHandler(0, arrayList);
                        return;
                    }
                    if (this.f11991b) {
                        return;
                    }
                    Log.i("HiHealthKitExtend", "execQuery, datas == null");
                    int iD = i2 != hiHealthAggregateQuery.getSampleType() ? HiHealthError.d(i2) : 0;
                    HiHealthKitExtendApi.this.d(resultCallback, iD, HiHealthError.e(iD));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "execQuery, RemoteException");
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "execQuery, Exception");
        }
    }

    class SequenceDataProxy extends IDataReadResultListener.Stub {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<HiHealthKitData> f11998b = new ArrayList(10);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private OutputStream f11999c;
        private ResultCallback e;

        SequenceDataProxy(OutputStream outputStream, ResultCallback resultCallback) {
            this.f11999c = outputStream;
            this.e = resultCallback;
        }

        @Override // com.huawei.hihealth.IDataReadResultListener
        public void onResult(List list, int i, int i2) {
            Log.i("HiHealthKitExtend", "enter KitAPI execQuery ecgData onSuccess");
            if (i != 0) {
                Log.i("HiHealthKitExtend", "allData is Empty");
                int iD = HiHealthError.d(i);
                HiHealthKitExtendApi.this.d(this.e, iD, HiHealthError.e(iD));
                return;
            }
            if (e(list, i2)) {
                if (!this.f11998b.isEmpty()) {
                    Log.i("HiHealthKitExtend", "data size = " + this.f11998b.size() + ", error code = " + i);
                    if (!a()) {
                        Log.e("HiHealthKitExtend", "sequenceDetail unmatched size");
                        this.e.onResultHandler(4, null);
                        return;
                    } else {
                        this.e.onResultHandler(0, e());
                        return;
                    }
                }
                Log.i("HiHealthKitExtend", "allData is Empty");
                int iD2 = HiHealthError.d(i);
                HiHealthKitExtendApi.this.d(this.e, iD2, HiHealthError.e(iD2));
            }
        }

        private List e() {
            ArrayList arrayList = new ArrayList(1);
            HiHealthKitData hiHealthKitData = this.f11998b.get(0);
            Map map = hiHealthKitData.getMap();
            map.remove("detail_data");
            krq krqVar = new krq(hiHealthKitData.getType(), map, hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime());
            HiHealthKitExtendApi.this.a(hiHealthKitData, krqVar);
            arrayList.add(krqVar);
            return arrayList;
        }

        private boolean a() {
            StringBuilder sb = new StringBuilder();
            Iterator<HiHealthKitData> it = this.f11998b.iterator();
            while (it.hasNext()) {
                Map map = it.next().getMap();
                if (map.containsKey("detail_data")) {
                    sb.append((String) map.get("detail_data"));
                }
            }
            try {
                if (sb.length() != this.f11998b.get(0).getLong("size")) {
                    return false;
                }
                try {
                    HiZipUtil.a(sb.toString(), this.f11999c);
                } catch (IOException unused) {
                    Log.i("HiHealthKitExtend", "enter query ecgData IOException");
                }
                return true;
            } finally {
                d(this.f11999c);
            }
        }

        private void d(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    Log.e("HiHealthKitExtend", e.getMessage());
                }
            }
        }

        private boolean e(List<HiHealthKitData> list, int i) {
            if (list != null && !list.isEmpty()) {
                this.f11998b.addAll(list);
            }
            return i == 1;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hihealth.HiHealthKitExtendApi$26, reason: invalid class name */
    static /* synthetic */ class AnonymousClass26 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11979b;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f11979b = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11979b[HiHealthDataType.Category.STAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11979b[HiHealthDataType.Category.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11979b[HiHealthDataType.Category.SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11979b[HiHealthDataType.Category.SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11979b[HiHealthDataType.Category.SEQUENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2, List list, List list2) {
        switch (AnonymousClass26.f11979b[b(i2).ordinal()]) {
            case 1:
            case 2:
            case 3:
                a(list, list2, i2);
                break;
            case 4:
                d(list, list2);
                break;
            case 5:
            case 6:
                b(list, list2);
                break;
        }
        if (i == i2) {
            d((List<krl>) list2, i);
        }
    }

    public HiHealthDataType.Category b(int i) {
        HiHealthDataType.Category categoryD;
        c();
        if (this.e != null && ksx.d("get_category")) {
            try {
                categoryD = HiHealthDataType.Category.valueOf(this.e.getCategory(i));
            } catch (RemoteException unused) {
                Log.e("HiHealthKitExtend", "getCategory RemoteException");
                categoryD = HiHealthDataType.d(i);
            }
        } else {
            categoryD = HiHealthDataType.d(i);
        }
        return i == 44000 ? HiHealthDataType.Category.SET : categoryD;
    }

    private void d(List<krl> list, int i) {
        Iterator<krl> it = list.iterator();
        while (it.hasNext()) {
            it.next().setType(i);
        }
    }

    public void a(final HiHealthDataQuery hiHealthDataQuery, final int i, final ResultCallback resultCallback) {
        Log.i("HiHealthKitExtend", "enter querySleepWakeTime");
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(resultCallback, hiHealthDataQuery, i);
            }
        });
    }

    /* synthetic */ void d(final ResultCallback resultCallback, HiHealthDataQuery hiHealthDataQuery, int i) {
        c();
        if (this.e == null) {
            d(resultCallback, 1, "querySleepWakeTime mApiAidl is null");
            Log.w("HiHealthKitExtend", "querySleepWakeTime mApiAidl is null");
            return;
        }
        if (hiHealthDataQuery.getEndTime() - hiHealthDataQuery.getStartTime() > 345600000) {
            d(resultCallback, 1, "querySleepWakeTime, the period of time should be less than 96 hours.");
            Log.w("HiHealthKitExtend", "The period of time should be less than 96 hours.");
            return;
        }
        try {
            this.e.querySleepWakeTime(f11898b.getOutOfBandData(), hiHealthDataQuery, i, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.8
                @Override // com.huawei.hihealth.IDataReadResultListener
                public void onResult(List list, int i2, int i3) {
                    Log.i("HiHealthKitExtend", "enter KitAPI querySleepWakeTime onSuccess");
                    if (list != null) {
                        Log.i("HiHealthKitExtend", "datas size = " + list.size() + ", error code = " + i2);
                        ArrayList arrayList = new ArrayList(10);
                        HiHealthKitExtendApi.this.b(list, arrayList);
                        resultCallback.onResultHandler(i2, arrayList);
                        return;
                    }
                    Log.i("HiHealthKitExtend", "datas == null");
                    int iD = HiHealthError.d(i2);
                    HiHealthKitExtendApi.this.d(resultCallback, iD, HiHealthError.e(iD));
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "querySleepWakeTime RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "getSwitch Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    public void e(final HiHealthDataQuery hiHealthDataQuery, final ResultCallback resultCallback) {
        Log.i("HiHealthKitExtend", "enter getCount");
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f11947b.d(resultCallback, hiHealthDataQuery);
            }
        });
    }

    /* synthetic */ void d(final ResultCallback resultCallback, HiHealthDataQuery hiHealthDataQuery) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "getCount mApiAidl is null");
            Log.w("HiHealthKitExtend", "getCount mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.getCount(f11898b.getOutOfBandData(), hiHealthDataQuery, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.9

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f11995b;

                @Override // com.huawei.hihealth.IDataReadResultListener
                public void onResult(List list, int i, int i2) {
                    Log.i("HiHealthKitExtend", "enter KitAPI getCount onSuccess, errorCode = " + i + " resultType = " + i2);
                    if (list != null && !list.isEmpty() && (list.get(0) instanceof Integer)) {
                        this.f11995b += ((Integer) list.get(0)).intValue();
                    }
                    if (i2 == 2) {
                        resultCallback.onResultHandler(HiHealthError.d(i), Integer.valueOf(this.f11995b));
                        this.f11995b = 0;
                    }
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "getCount RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "getCount Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HiHealthKitData hiHealthKitData, krl krlVar) {
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

    private void a(List list, List list2, int i) {
        krp krpVar;
        if (list == null) {
            Log.i("HiHealthKitExtend", "point data null");
            return;
        }
        Log.i("HiHealthKitExtend", "handlePointData size = " + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HiHealthKitData hiHealthKitData = (HiHealthKitData) it.next();
            if (kss.a(i)) {
                krpVar = new krp(hiHealthKitData.getType(), hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime(), hiHealthKitData.getDoubleValue(), 0);
            } else if (kss.c(i)) {
                krpVar = new krp(hiHealthKitData.getType(), hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime(), hiHealthKitData.getString("metadata"), 0);
            } else {
                krpVar = new krp(hiHealthKitData.getType(), hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime(), hiHealthKitData.getIntValue(), 0);
            }
            a(hiHealthKitData, krpVar);
            krpVar.setUpdateTime(hiHealthKitData.getLong("update_time"));
            list2.add(krpVar);
        }
    }

    private void d(List list, List list2) {
        if (list == null) {
            Log.w("HiHealthKitExtend", "session data null");
            return;
        }
        Log.i("HiHealthKitExtend", "handleSessionData size = " + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HiHealthKitData hiHealthKitData = (HiHealthKitData) it.next();
            krr krrVar = new krr(hiHealthKitData.getType(), hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime());
            a(hiHealthKitData, krrVar);
            krrVar.setUpdateTime(hiHealthKitData.getLong("update_time"));
            list2.add(krrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List list, List list2) {
        if (list != null) {
            Log.i("HiHealthKitExtend", "handleSetData size = " + list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HiHealthKitData hiHealthKitData = (HiHealthKitData) it.next();
                Map map = hiHealthKitData.getMap();
                try {
                    if (map.containsKey("detail_data")) {
                        Object obj = map.get("detail_data");
                        if (obj instanceof String) {
                            map.remove("detail_data");
                            map.put("detail_data", HiZipUtil.c((String) obj));
                        }
                    }
                } catch (IOException unused) {
                    Log.i("HiHealthKitExtend", "enter query ecgData IOException");
                }
                krq krqVar = new krq(hiHealthKitData.getType(), map, hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime());
                a(hiHealthKitData, krqVar);
                krqVar.setMetaData(hiHealthKitData.getString("metadata"));
                krqVar.setUpdateTime(hiHealthKitData.getLong("update_time"));
                list2.add(krqVar);
            }
        }
    }

    public void b(final krl krlVar, final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(resultCallback, krlVar);
            }
        });
    }

    /* synthetic */ void c(final ResultCallback resultCallback, krl krlVar) {
        c();
        if (this.e == null) {
            Log.w("HiHealthKitExtend", "saveSample mApiAidl is null");
            d(resultCallback, 1, "saveSample mApiAidl is null");
            return;
        }
        try {
            HiHealthKitData hiHealthKitDataE = ksv.e(krlVar, b(krlVar.getType()));
            if (!ksx.d(hiHealthKitDataE.getType())) {
                resultCallback.onResultHandler(30, HiHealthError.e(30));
            } else {
                this.e.saveSample(f11898b.getOutOfBandData(), hiHealthKitDataE, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.10
                    @Override // com.huawei.hihealth.IDataOperateListener
                    public void onResult(int i, List list) {
                        Log.i("HiHealthKitExtend", "enter saveSample result code " + i);
                        resultCallback.onResultHandler(HiHealthError.d(i), list);
                    }
                });
            }
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "save sample RemoteException");
            resultCallback.onResultHandler(4, null);
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "save sample Exception");
            resultCallback.onResultHandler(4, null);
        }
    }

    public void d(final List<krl> list, final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(resultCallback, list);
            }
        });
    }

    /* synthetic */ void e(ResultCallback resultCallback, List list) {
        Log.i("HiHealthKitExtend", "enter saveSamples");
        c();
        if (this.e == null) {
            d(resultCallback, 1, "saveSamples mApiAidl is null");
            Log.w("HiHealthKitExtend", "saveSamples mApiAidl is null");
            return;
        }
        if (list == null || (list.size() > 20 && !ksx.d("divide_save_samples"))) {
            resultCallback.onResultHandler(2, "too much datas!");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!ksx.d(((krl) it.next()).getType())) {
                resultCallback.onResultHandler(30, HiHealthError.e(30));
                return;
            }
        }
        int[] iArr = {4};
        Object[] objArr = {HiHealthError.e(iArr[0])};
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            krl krlVar = (krl) it2.next();
            arrayList.add(ksv.e(krlVar, b(krlVar.getType())));
        }
        int iB = b(f11898b.getOutOfBandData());
        if (!ksx.d("divide_save_samples")) {
            if (iB > 0) {
                a(arrayList, resultCallback, iArr, objArr);
                return;
            } else {
                b(arrayList, resultCallback, iArr, objArr);
                return;
            }
        }
        if (ksv.c(arrayList)) {
            c(iArr, objArr, arrayList);
            d(resultCallback, iArr[0], objArr[0]);
        } else {
            e(iArr, objArr, arrayList);
            d(resultCallback, iArr[0], objArr[0]);
        }
    }

    private void e(final int[] iArr, final Object[] objArr, List<HiHealthKitData> list) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.e.saveSamples(f11898b.getOutOfBandData(), list, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.11
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list2) {
                    Log.i("HiHealthKitExtend", "enter saveSamplesImpl result errorCode:" + i);
                    iArr[0] = HiHealthError.d(i);
                    objArr[0] = list2;
                    countDownLatch.countDown();
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "saveSamplesImpl RemoteException");
            a(countDownLatch);
            iArr[0] = 4;
            objArr[0] = HiHealthError.e(4);
        } finally {
            try {
                countDownLatch.await(30L, TimeUnit.SECONDS);
            } catch (InterruptedException unused2) {
                Log.e("HiHealthKitExtend", "saveSamplesImpl interrupted exception");
                iArr[0] = 4;
                objArr[0] = HiHealthError.e(4);
            }
        }
    }

    private void c(int[] iArr, Object[] objArr, List<HiHealthKitData> list) {
        int iB = ksv.b(list);
        int size = list.size();
        int i = (int) ((size * 524288.0f) / iB);
        if (i == 0) {
            i = 1;
        }
        Log.i("HiHealthKitExtend", "divideSaveSamplesImpl dataList size = " + size + ", parcelSize = " + iB + ", divideLength = " + i);
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + i;
            if (i3 >= size) {
                e(iArr, objArr, list.subList(i2, size));
            } else {
                e(iArr, objArr, list.subList(i2, i3));
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.huawei.hihealth.listener.ResultCallback] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private void a(List<HiHealthKitData> list, ResultCallback resultCallback, int[] iArr, final Object[] objArr) {
        ?? r7;
        int iD;
        ?? r8;
        ?? r9;
        final ?? r3 = iArr;
        ?? r10 = "save samples interrupted exception";
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        try {
            this.e.saveSamples(f11898b.getOutOfBandData(), list, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.12
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list2) {
                    Log.i("HiHealthKitExtend", "saveSamples result errorCode " + i);
                    r3[0] = i;
                    objArr[0] = list2;
                    if (i != 0) {
                        HiHealthKitExtendApi.this.a(countDownLatch);
                    }
                    if (countDownLatch.getCount() > 0) {
                        countDownLatch.countDown();
                    }
                }
            });
            try {
                countDownLatch.await(3L, TimeUnit.SECONDS);
                r9 = r10;
            } catch (InterruptedException unused) {
                Log.e("HiHealthKitExtend", "save samples interrupted exception");
                r9 = 4;
                r3[0] = 4;
                objArr[0] = "InterruptedException";
            }
            iD = HiHealthError.d(r3[0]);
            r3 = objArr[0];
            r10 = r9;
        } catch (RemoteException unused2) {
            Log.e("HiHealthKitExtend", "save samples RemoteException");
            r3[0] = 4;
            objArr[0] = "RemoteException";
            try {
                countDownLatch.await(3L, TimeUnit.SECONDS);
                r8 = r10;
            } catch (InterruptedException unused3) {
                Log.e("HiHealthKitExtend", "save samples interrupted exception");
                r8 = 4;
                r3[0] = 4;
                objArr[0] = "InterruptedException";
            }
            iD = HiHealthError.d(r3[0]);
            r3 = objArr[0];
            r10 = r8;
        } catch (Exception unused4) {
            Log.e("HiHealthKitExtend", "save samples Exception");
            r3[0] = 4;
            objArr[0] = HiHealthError.e(4);
            try {
                countDownLatch.await(3L, TimeUnit.SECONDS);
                r7 = r10;
            } catch (InterruptedException unused5) {
                Log.e("HiHealthKitExtend", "save samples interrupted exception");
                r7 = 4;
                r3[0] = 4;
                objArr[0] = "InterruptedException";
            }
            iD = HiHealthError.d(r3[0]);
            r3 = objArr[0];
            r10 = r7;
        } finally {
            try {
                countDownLatch.await(3L, TimeUnit.SECONDS);
            } catch (InterruptedException unused6) {
                Log.e("HiHealthKitExtend", r10);
                r3[0] = 4;
                objArr[0] = "InterruptedException";
            }
            resultCallback.onResultHandler(HiHealthError.d(r3[0]), objArr[0]);
            Log.i("HiHealthKitExtend", "saveSamples end");
        }
        resultCallback.onResultHandler(iD, r3);
    }

    private void b(List<HiHealthKitData> list, ResultCallback resultCallback, final int[] iArr, final Object[] objArr) {
        int iD;
        Object obj;
        try {
            for (HiHealthKitData hiHealthKitData : list) {
                this.h = new CountDownLatch(1);
                this.f11899c = true;
                Log.i("HiHealthKitExtend", String.valueOf(hiHealthKitData.getStartTime()));
                this.e.saveSample(f11898b.getOutOfBandData(), hiHealthKitData, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.13
                    @Override // com.huawei.hihealth.IDataOperateListener
                    public void onResult(int i, List list2) {
                        Log.i("HiHealthKitExtend", "enter saveSample errorCode = " + i);
                        iArr[0] = i;
                        objArr[0] = list2;
                        if (HiHealthKitExtendApi.this.h != null) {
                            HiHealthKitExtendApi.this.h.countDown();
                        }
                    }
                });
                try {
                    this.h.await();
                } catch (InterruptedException unused) {
                    Log.e("HiHealthKitExtend", "saveSample InterruptedException");
                }
                this.f11899c = false;
                this.h = null;
                if (iArr[0] != 0) {
                    break;
                }
            }
            if (resultCallback != null) {
                iD = HiHealthError.d(iArr[0]);
                obj = objArr[0];
                resultCallback.onResultHandler(iD, obj);
            }
        } catch (RemoteException unused2) {
            Log.e("HiHealthKitExtend", "save sample RemoteException");
            iArr[0] = 4;
            objArr[0] = "RemoteException";
            if (resultCallback != null) {
                iD = HiHealthError.d(4);
                obj = objArr[0];
            }
        } catch (Exception unused3) {
            Log.e("HiHealthKitExtend", "save sample Exception");
            iArr[0] = 4;
            objArr[0] = "Exception";
            if (resultCallback != null) {
                iD = HiHealthError.d(4);
                obj = objArr[0];
            }
        } finally {
            if (resultCallback != null) {
                resultCallback.onResultHandler(HiHealthError.d(iArr[0]), objArr[0]);
            }
            Log.i("HiHealthKitExtend", "saveSamples end");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CountDownLatch countDownLatch) {
        while (countDownLatch.getCount() > 0) {
            countDownLatch.countDown();
        }
    }

    public void d(final krl krlVar, final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(resultCallback, krlVar);
            }
        });
    }

    /* synthetic */ void e(ResultCallback resultCallback, krl krlVar) {
        c();
        if (this.e == null) {
            Log.w("HiHealthKitExtend", "deleteSample mApiAidl is null");
            d(resultCallback, 1, HiHealthError.e(1));
        } else if (krlVar == null) {
            Log.w("HiHealthKitExtend", "deleteSample hiHealthData is null");
            d(resultCallback, 2, HiHealthError.e(2));
        } else {
            if (ksx.d("delete_sample")) {
                e(krlVar, resultCallback);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(krlVar);
            c(arrayList, resultCallback);
        }
    }

    private void e(krl krlVar, final ResultCallback resultCallback) {
        final int[] iArr = {4};
        final Object[] objArr = new Object[1];
        if (!ksx.a(krlVar.getType())) {
            resultCallback.onResultHandler(30, HiHealthError.e(30));
            return;
        }
        try {
            this.e.deleteSample(f11898b.getOutOfBandData(), ksv.e(krlVar, b(krlVar.getType())), new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.14
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list) {
                    Log.i("HiHealthKitExtend", "deleteSampleImpl result:" + i);
                    iArr[0] = i;
                    objArr[0] = list;
                    HiHealthKitExtendApi.this.d(resultCallback, HiHealthError.d(i), objArr[0]);
                }
            });
        } catch (RemoteException unused) {
            Log.w("HiHealthKitExtend", "deleteSampleImpl RemoteException");
            d(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.w("HiHealthKitExtend", "deleteSampleImpl Exception");
            d(resultCallback, 4, "Exception");
        }
    }

    public void a(final List<krl> list, final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f11903b.b(resultCallback, list);
            }
        });
    }

    /* synthetic */ void b(ResultCallback resultCallback, List list) {
        c();
        if (this.e == null) {
            d(resultCallback, 1, "deleteSamples mApiAidl is null");
            Log.w("HiHealthKitExtend", "deleteSamples mApiAidl is null");
        } else if (list == null || list.size() > 20) {
            resultCallback.onResultHandler(2, "too much datas!");
        } else {
            c((List<krl>) list, resultCallback);
        }
    }

    private void c(List<krl> list, final ResultCallback resultCallback) {
        final int[] iArr = {4};
        final Object[] objArr = new Object[1];
        try {
            Iterator<krl> it = list.iterator();
            while (it.hasNext()) {
                if (!ksx.a(it.next().getType())) {
                    resultCallback.onResultHandler(30, HiHealthError.e(30));
                    return;
                }
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (krl krlVar : list) {
                arrayList.add(ksv.e(krlVar, b(krlVar.getType())));
            }
            this.e.deleteSamples(f11898b.getOutOfBandData(), arrayList, new IDataOperateListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.15
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list2) {
                    Log.i("HiHealthKitExtend", "deleteSamplesImpl result:" + i);
                    iArr[0] = i;
                    objArr[0] = list2;
                    HiHealthKitExtendApi.this.d(resultCallback, HiHealthError.d(i), objArr[0]);
                }
            });
        } catch (RemoteException unused) {
            Log.w("HiHealthKitExtend", "deleteSamplesImpl RemoteException");
            d(resultCallback, 4, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.w("HiHealthKitExtend", "deleteSamplesImpl Exception");
            d(resultCallback, 4, "Exception");
        }
    }

    public void c(final HiRealTimeListener hiRealTimeListener) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(hiRealTimeListener);
            }
        });
    }

    /* synthetic */ void e(HiRealTimeListener hiRealTimeListener) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            hiRealTimeListener.onResultHandler(1);
            Log.w("HiHealthKitExtend", "startReadingHeartRate mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.startReadingHeartRate(f11898b.getOutOfBandData(), e("startReadingHeartRate", hiRealTimeListener));
            Log.i("HiHealthKitExtend", "startReadingHeartRate end");
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "startReadingHeartRate RemoteException");
            hiRealTimeListener.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "startReadingHeartRate Exception");
            hiRealTimeListener.onResultHandler(4);
        }
    }

    public void f(final HiRealTimeListener hiRealTimeListener) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(hiRealTimeListener);
            }
        });
    }

    /* synthetic */ void b(HiRealTimeListener hiRealTimeListener) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            hiRealTimeListener.onResultHandler(1);
            Log.w("HiHealthKitExtend", "stopReadingHeartRate mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.stopReadingHeartRate(f11898b.getOutOfBandData(), e("stopReadingHeartRate", hiRealTimeListener));
            Log.i("HiHealthKitExtend", "stopReadingHeartRate end");
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "stopReadingHeartRate RemoteException");
            hiRealTimeListener.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "stopReadingHeartRate Exception");
            hiRealTimeListener.onResultHandler(4);
        }
    }

    public void j(final HiRealTimeListener hiRealTimeListener) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(hiRealTimeListener);
            }
        });
    }

    /* synthetic */ void d(HiRealTimeListener hiRealTimeListener) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            hiRealTimeListener.onResultHandler(1);
            Log.w("HiHealthKitExtend", "startReadingRri mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.startReadingRRI(f11898b.getOutOfBandData(), e("startReadingRRI", hiRealTimeListener));
            Log.i("HiHealthKitExtend", "startReadingRRI end");
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "startReadingRRI RemoteException");
            hiRealTimeListener.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "startReadingRRI Exception");
            hiRealTimeListener.onResultHandler(4);
        }
    }

    public void h(final HiRealTimeListener hiRealTimeListener) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                this.f11922a.a(hiRealTimeListener);
            }
        });
    }

    /* synthetic */ void a(HiRealTimeListener hiRealTimeListener) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            hiRealTimeListener.onResultHandler(1);
            Log.w("HiHealthKitExtend", "stopReadingRri mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.stopReadingRRI(f11898b.getOutOfBandData(), e("stopReadingRRI", hiRealTimeListener));
            Log.i("HiHealthKitExtend", "stopReadingRRI end");
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "stopReadingRRI RemoteException");
            hiRealTimeListener.onResultHandler(4);
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "stopReadingRRI Exception");
            hiRealTimeListener.onResultHandler(4);
        }
    }

    public void e(final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f11945b.g(resultCallback);
            }
        });
    }

    /* synthetic */ void g(ResultCallback resultCallback) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "getDeviceList mApiAidl is null");
            Log.w("HiHealthKitExtend", "getDeviceList mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.getDeviceList(f11898b.getOutOfBandData(), e("getDeviceList", resultCallback));
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "getDeviceList RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "getDeviceList Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    public void b(final String str, final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(resultCallback, str);
            }
        });
    }

    /* synthetic */ void a(ResultCallback resultCallback, String str) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "sendDeviceCommand mApiAidl is null");
            Log.w("HiHealthKitExtend", "sendDeviceCommand mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.sendDeviceCommand(f11898b.getOutOfBandData(), str, e("sendDeviceCommand", resultCallback));
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "sendDeviceCommand RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "sendDeviceCommand Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    public void k(final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f11944c.m(resultCallback);
            }
        });
    }

    /* synthetic */ void m(ResultCallback resultCallback) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "startReadingAtrial mApiAidl is null");
            Log.w("HiHealthKitExtend", "startReadingAtrial mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.startReadingAtrial(f11898b.getOutOfBandData(), e("startReadingAtrial", resultCallback));
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "startReadingAtrial RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "startReadingAtrial Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    public void n(final ResultCallback resultCallback) {
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                this.f11938a.l(resultCallback);
            }
        });
    }

    /* synthetic */ void l(ResultCallback resultCallback) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "stopReadingAtrial mApiAidl is null");
            Log.w("HiHealthKitExtend", "stopReadingAtrial mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.stopReadingAtrial(f11898b.getOutOfBandData(), e("stopReadingAtrial", resultCallback));
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "stopReadingAtrial RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "stopReadingAtrial Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    /* synthetic */ void e(final ResultCallback resultCallback, String str, String str2) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            Log.e("HiHealthKitExtend", "pushMsgToWearable:mApiAidl is null");
            d(resultCallback, 1, HiHealthError.e(1));
            return;
        }
        try {
            iHiHealthKitEx.pushMsgToWearable(f11898b.getOutOfBandData(), str, str2, new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.16
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str3) throws RemoteException {
                    resultCallback.onResultHandler(HiHealthError.d(i), str3);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "pushMsgToWearable RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "pushMsgToWearable Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    /* synthetic */ void b(final ResultCallback resultCallback, String str, String str2, final OutputStream outputStream) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            Log.i("HiHealthKitExtend", "readFromWearable:mApiAidl is null");
            d(resultCallback, 1, HiHealthError.e(1));
            return;
        }
        try {
            iHiHealthKitEx.readFromWearable(f11898b.getOutOfBandData(), str, str2, new IReadCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.17
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
                            Log.i("HiHealthKitExtend", "readFromWearable IOException");
                            HiHealthKitExtendApi.this.d(resultCallback, 1, HiHealthError.e(1));
                            return;
                        }
                    }
                    resultCallback.onResultHandler(HiHealthError.d(i), str3);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "readFromWearable RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "readFromWearable Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    /* synthetic */ void e(ResultCallback resultCallback, InputStream inputStream, String str, String str2) {
        c();
        if (this.e == null) {
            Log.i("HiHealthKitExtend", "writeToWearable:mApiAidl is null");
            d(resultCallback, 1, HiHealthError.e(1));
        } else if (inputStream != null) {
            Log.i("HiHealthKitExtend", "writeToWearable is a big file.");
            c(inputStream, str, str2, resultCallback);
        } else {
            Log.i("HiHealthKitExtend", "writeToWearable is not a big file.");
            b(str, str2, null, null, resultCallback);
        }
    }

    private void b(String str, String str2, byte[] bArr, String str3, final ResultCallback resultCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(RemoteMessageConst.INPUT_TYPE, str);
            jSONObject.put("inputDescription", str2);
            jSONObject.put("sizeAndFinish", str3);
            this.e.writeToWearable(f11898b.getOutOfBandData(), jSONObject.toString(), bArr, new IWriteCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.18
                @Override // com.huawei.hihealth.IWriteCallback
                public void onResult(int i, String str4) throws RemoteException {
                    resultCallback.onResultHandler(HiHealthError.d(i), str4);
                }
            });
        } catch (TransactionTooLargeException unused) {
            Log.e("HiHealthKitExtend", "writeToWearable TransactionTooLargeException");
            d(resultCallback, 1021, HiHealthError.e(1021));
        } catch (RemoteException unused2) {
            Log.i("HiHealthKitExtend", "writeToWearable RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (JSONException unused3) {
            Log.i("HiHealthKitExtend", "writeToWearable JSONException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused4) {
            Log.i("HiHealthKitExtend", "writeToWearable Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    private void c(InputStream inputStream, String str, String str2, ResultCallback resultCallback) {
        byte[] bArr;
        boolean z;
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
                        b(str, str2, bArr, jSONObject.toString(), resultCallback);
                        i -= i2;
                        z2 = z;
                    }
                    inputStream.close();
                } catch (IOException unused) {
                    Log.i("HiHealthKitExtend", "writeToWearable:close inputStream IOException");
                }
            } catch (IOException unused2) {
                Log.i("HiHealthKitExtend", "writeToWearable IOException");
                d(resultCallback, 1, HiHealthError.e(1));
                b(str, str2, null, null, resultCallback);
                inputStream.close();
            } catch (JSONException unused3) {
                Log.i("HiHealthKitExtend", "writeToWearable JSONException");
                d(resultCallback, 1, HiHealthError.e(1));
                b(str, str2, null, null, resultCallback);
                inputStream.close();
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused4) {
                Log.i("HiHealthKitExtend", "writeToWearable:close inputStream IOException");
            }
            throw th;
        }
    }

    public void c(final HiSportDataCallback hiSportDataCallback) {
        Log.i("HiHealthKitExtend", "startRealTimeSportData");
        if (hiSportDataCallback == null) {
            Log.w("HiHealthKitExtend", "startRealTimeSportData callback is null");
        } else {
            this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11932b.e(hiSportDataCallback);
                }
            });
        }
    }

    /* synthetic */ void e(final HiSportDataCallback hiSportDataCallback) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            Log.w("HiHealthKitExtend", "fetchRealTimeSportData mApiAidl is null");
            hiSportDataCallback.onResultHandler(1);
            return;
        }
        try {
            iHiHealthKitEx.registerRealTimeSportCallback(f11898b.getOutOfBandData(), new ISportDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.19
                @Override // com.huawei.hihealth.ISportDataCallback
                public void onResult(int i) throws RemoteException {
                    Log.i("HiHealthKitExtend", "startRealTimeSportData onResult errCode = " + i);
                    hiSportDataCallback.onResultHandler(i);
                }

                @Override // com.huawei.hihealth.ISportDataCallback
                public void onDataChanged(int i, Bundle bundle) {
                    Log.i("HiHealthKitExtend", "startRealTimeSportData onDataChanged sportState = " + i);
                    Log.i("HiHealthKitExtend", "startRealTimeSportData onDataChanged bundle = " + bundle);
                    hiSportDataCallback.onDataChangedHandler(i, bundle);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "startRealTimeSportData RemoteException");
            hiSportDataCallback.onResultHandler(1);
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "startRealTimeSportData Exception");
            hiSportDataCallback.onResultHandler(1);
        }
    }

    public void d(final HiSportDataCallback hiSportDataCallback) {
        Log.i("HiHealthKitExtend", "stopRealTimeSportData");
        if (hiSportDataCallback == null) {
            Log.w("HiHealthKitExtend", "stopRealTimeSportData callback is null");
        } else {
            this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11919b.a(hiSportDataCallback);
                }
            });
        }
    }

    /* synthetic */ void a(final HiSportDataCallback hiSportDataCallback) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            Log.w("HiHealthKitExtend", "stopRealTimeSportData mApiAidl is null");
            hiSportDataCallback.onResultHandler(1);
            return;
        }
        try {
            iHiHealthKitEx.unregisterRealTimeSportCallback(f11898b.getOutOfBandData(), new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.20
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str) {
                    Log.i("HiHealthKitExtend", "stopRealTimeSportData resultCode = " + i);
                    hiSportDataCallback.onResultHandler(i);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "stopRealTimeSportData RemoteException");
            hiSportDataCallback.onResultHandler(1);
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "stopRealTimeSportData Exception");
            hiSportDataCallback.onResultHandler(1);
        }
    }

    public void b(final HiHealthCapabilityQuery hiHealthCapabilityQuery, final CapabilityResultCallback capabilityResultCallback) {
        Log.i("HiHealthKitExtend", "getHealthyLivingData");
        if (capabilityResultCallback == null) {
            Log.w("HiHealthKitExtend", "getHealthyLivingData callback is null");
        } else {
            this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(capabilityResultCallback, hiHealthCapabilityQuery);
                }
            });
        }
    }

    /* synthetic */ void d(final CapabilityResultCallback capabilityResultCallback, HiHealthCapabilityQuery hiHealthCapabilityQuery) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            Log.w("HiHealthKitExtend", "getHealthyLivingData mApiAidl is null");
            capabilityResultCallback.onResultHandler(1, "getHealthyLivingData mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.getHealthyLivingData(f11898b.getOutOfBandData(), hiHealthCapabilityQuery, new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.21
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str) {
                    Log.i("HiHealthKitExtend", "getHealthyLivingData result:" + i);
                    capabilityResultCallback.onResultHandler(HiHealthError.d(i), str);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "getHealthyLivingData RemoteException");
            capabilityResultCallback.onResultHandler(1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "getHealthyLivingData Exception");
            capabilityResultCallback.onResultHandler(1, HiHealthError.e(1));
        }
    }

    /* synthetic */ void d(final ResultCallback resultCallback, String str) {
        c();
        IHiHealthKitEx iHiHealthKitEx = this.e;
        if (iHiHealthKitEx == null) {
            d(resultCallback, 1, "getSwitch mApiAidl is null");
            Log.w("HiHealthKitExtend", "getSwitch mApiAidl is null");
            return;
        }
        try {
            iHiHealthKitEx.getSwitch(f11898b.getOutOfBandData(), str, new ICommonCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.22
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str2) {
                    Log.i("HiHealthKitExtend", "getSwitch onResult errCode = " + i);
                    HiHealthKitExtendApi.this.d(resultCallback, HiHealthError.d(i), str2);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "getSwitch RemoteException");
            d(resultCallback, 1, HiHealthError.e(1));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "getSwitch Exception");
            d(resultCallback, 1, HiHealthError.e(1));
        }
    }

    public void c(final HealthKitDictQuery healthKitDictQuery, final IuniversalCallback iuniversalCallback) {
        Log.i("HiHealthKitExtend", "enter queryData");
        this.g.execute(new Runnable() { // from class: com.huawei.hihealth.HiHealthKitExtendApi$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(iuniversalCallback, healthKitDictQuery);
            }
        });
    }

    /* synthetic */ void e(IuniversalCallback iuniversalCallback, HealthKitDictQuery healthKitDictQuery) {
        c();
        if (this.e == null) {
            iuniversalCallback.onResultHandler(1, null, HiHealthError.e(1));
            Log.w("HiHealthKitExtend", "queryData mApiAidl is null");
        } else if (!ksx.e(healthKitDictQuery.getSampleType())) {
            iuniversalCallback.onResultHandler(30, null, HiHealthError.e(30));
        } else {
            b(healthKitDictQuery, iuniversalCallback);
        }
    }

    private void b(final HealthKitDictQuery healthKitDictQuery, final IuniversalCallback iuniversalCallback) {
        try {
            final ArrayList arrayList = new ArrayList(10);
            this.e.queryData(f11898b.getOutOfBandData(), healthKitDictQuery, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.23
                @Override // com.huawei.hihealth.IDataReadResultListener
                public void onResult(List list, int i, int i2) {
                    Log.i("HiHealthKitExtend", "enter KitAPI queryDataImp onSuccess");
                    int iD = HiHealthError.d(i);
                    if (list != null) {
                        DictDataTransformUtil.c(HiHealthKitExtendApi.this.b(healthKitDictQuery.getSampleType()), list, arrayList);
                    }
                    DictDataTransformUtil.d(iD, i2, arrayList, iuniversalCallback);
                }
            });
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "queryDataImp RemoteException");
            iuniversalCallback.onResultHandler(4, null, HiHealthError.e(4));
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "queryDataImp Exception");
            iuniversalCallback.onResultHandler(4, null, HiHealthError.e(4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ResultCallback resultCallback, int i, Object obj) {
        if (resultCallback != null) {
            resultCallback.onResultHandler(i, obj);
        }
    }

    static class Instance {
        public static final HiHealthKitExtendApi e = new HiHealthKitExtendApi();

        private Instance() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (d) {
            if (this.e == null) {
                Intent intent = new Intent("com.huawei.health.action.KIT_SERVICE");
                intent.setClassName(ksu.b(), "com.huawei.hihealthservice.HiHealthService");
                intent.setPackage(ksu.b());
                try {
                    if (f11898b == null) {
                        return;
                    } else {
                        f11898b.bindService(intent, this, 1);
                    }
                } catch (SecurityException e) {
                    Log.e("HiHealthKitExtend", "bindService exception" + e.getMessage());
                }
                Object obj = f11897a;
                synchronized (obj) {
                    try {
                        if (this.e != null) {
                            Log.i("HiHealthKitExtend", "bindService bind mApiAidl is not null");
                            return;
                        }
                        obj.wait(5000L);
                        Log.i("HiHealthKitExtend", "bindService bind over mApiAidl is " + this.e);
                    } catch (InterruptedException e2) {
                        Log.e("HiHealthKitExtend", "bindService() InterruptedException = " + e2.getMessage());
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #3 {, blocks: (B:18:0x006c, B:26:0x00aa, B:19:0x0075, B:22:0x007b, B:25:0x00a5, B:24:0x009d), top: B:38:0x006a, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0075 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #3 {, blocks: (B:18:0x006c, B:26:0x00aa, B:19:0x0075, B:22:0x007b, B:25:0x00a5, B:24:0x009d), top: B:38:0x006a, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String nameForUid;
        Log.i("HiHealthKitExtend", Constant.SERVICE_CONNECT_MESSAGE);
        IHiHealthKitEx iHiHealthKitExAsInterface = null;
        try {
            int callingUid = Binder.getCallingUid();
            if (f11898b == null) {
                return;
            }
            PackageManager packageManager = f11898b.getPackageManager();
            if (packageManager != null) {
                nameForUid = packageManager.getNameForUid(callingUid);
                try {
                    Log.d("HiHealthKitExtend", "getCallingUid uid:" + callingUid + " packageName:" + nameForUid);
                } catch (Exception unused) {
                    Log.w("HiHealthKitExtend", "onServiceConnected Exception");
                }
            } else {
                nameForUid = null;
            }
            IBinder serviceBinder = IBinderInterceptor.Stub.asInterface(iBinder).getServiceBinder("KIT_EXTEND");
            Log.i("HiHealthKitExtend", "binder: " + serviceBinder);
            iHiHealthKitExAsInterface = IHiHealthKitEx.Stub.asInterface(serviceBinder);
            synchronized (f11897a) {
                if (iHiHealthKitExAsInterface == null) {
                    Log.w("HiHealthKitExtend", "onServiceConnected error !");
                } else {
                    this.e = iHiHealthKitExAsInterface;
                    if (nameForUid == null) {
                        nameForUid = "";
                    }
                    try {
                        iHiHealthKitExAsInterface.registerPackageName(nameForUid);
                        this.e.setKitVersion(String.valueOf(ksx.d(f11898b)));
                        ksx.c(this.e.getServiceApiLevel(f11898b.getOutOfBandData()));
                    } catch (RemoteException unused2) {
                        Log.e("HiHealthKitExtend", "setKitVersion RemoteException");
                    }
                    f11897a.notifyAll();
                }
            }
        } catch (Exception unused3) {
            nameForUid = null;
        }
        Log.w("HiHealthKitExtend", "onServiceConnected Exception");
        synchronized (f11897a) {
            if (iHiHealthKitExAsInterface == null) {
                Log.w("HiHealthKitExtend", "onServiceConnected error !");
            } else {
                this.e = iHiHealthKitExAsInterface;
                if (nameForUid == null) {
                    nameForUid = "";
                }
                iHiHealthKitExAsInterface.registerPackageName(nameForUid);
                this.e.setKitVersion(String.valueOf(ksx.d(f11898b)));
                ksx.c(this.e.getServiceApiLevel(f11898b.getOutOfBandData()));
                f11897a.notifyAll();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i("HiHealthKitExtend", "onServiceDisconnected");
        if (this.h != null && this.f11899c) {
            Log.i("HiHealthKitExtend", "onServiceDisconnected() latch countDown");
            this.h.countDown();
        }
        this.e = null;
    }

    /* synthetic */ void h(ResultCallback resultCallback) {
        c();
        if (this.e == null) {
            resultCallback.onResultHandler(1, HiHealthError.e(1));
            Log.w("HiHealthKitExtend", "getServiceApiLevel mApiAidl is null");
        } else {
            resultCallback.onResultHandler(0, Integer.valueOf(ksx.d()));
        }
    }

    private int b(OutOfBandData outOfBandData) {
        int abilityVersion = 0;
        try {
            abilityVersion = this.e.getAbilityVersion(outOfBandData);
            Log.i("HiHealthKitExtend", "getAbilityVersion version = " + abilityVersion);
            return abilityVersion;
        } catch (RemoteException unused) {
            Log.e("HiHealthKitExtend", "getAbilityVersion RemoteException");
            return abilityVersion;
        } catch (Exception unused2) {
            Log.e("HiHealthKitExtend", "getAbilityVersion Exception");
            return abilityVersion;
        }
    }

    private IRealTimeDataCallback.Stub e(final String str, final HiRealTimeListener hiRealTimeListener) {
        return new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.24
            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onResult(int i) {
                Log.i("HiHealthKitExtend", str + " onResult: " + i);
                hiRealTimeListener.onResultHandler(HiHealthError.d(i));
            }

            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onChange(int i, String str2) {
                hiRealTimeListener.onChangeHandler(HiHealthError.d(i), str2);
            }
        };
    }

    private IRealTimeDataCallback.Stub e(final String str, final ResultCallback resultCallback) {
        return new IRealTimeDataCallback.Stub() { // from class: com.huawei.hihealth.HiHealthKitExtendApi.25
            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onResult(int i) {
                Log.i("HiHealthKitExtend", str + " onResult: " + i);
                HiHealthKitExtendApi.this.d(resultCallback, i, HiHealthError.e(i));
            }

            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onChange(int i, String str2) {
                HiHealthKitExtendApi.this.d(resultCallback, i, str2);
            }
        };
    }

    /* synthetic */ void e() {
        Log.i("HiHealthKitExtend", "enter unBindHealthService");
        if (this.e == null) {
            Log.w("HiHealthKitExtend", "no need to unbind");
            return;
        }
        try {
            f11898b.unbindService(Instance.e);
            this.e = null;
        } catch (Exception unused) {
            Log.w("HiHealthKitExtend", "unbind service exception");
        }
    }
}
