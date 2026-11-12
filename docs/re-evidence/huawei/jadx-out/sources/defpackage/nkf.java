package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.up.utils.ErrorCode;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile nkf f43155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f43156b = BaseApplication.b();

    private nkf() {
    }

    public static nkf a() {
        if (f43155a == null) {
            synchronized (nkf.class) {
                if (f43155a == null) {
                    f43155a = new nkf();
                }
            }
        }
        return f43155a;
    }

    public void e(Context context, long j, long j2, int i, final IBaseResponseCallback iBaseResponseCallback) {
        if (j > j2) {
            LogUtil.j("Common_HwHealthWeightDataManager", "startTime > endTime");
            return;
        }
        String[] strArr = {BleConstants.WEIGHT_KEY};
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(HiDateUtil.p(j), HiDateUtil.g(j2));
        hiAggregateOption.setTimeRange(j, j2);
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setConstantsKey(strArr);
        if (i != 0) {
            if (i == 99999) {
                hiAggregateOption.setCount(1);
                hiAggregateOption.setFilter("");
            } else {
                hiAggregateOption.setCount(i);
                hiAggregateOption.setFilter("NULL");
            }
        }
        HiHealthManager.d(context).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: nkf.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (list == null) {
                    LogUtil.j("Common_HwHealthWeightDataManager", "getWeightData, datas is null");
                    iBaseResponseCallback.a(1, Collections.EMPTY_LIST);
                } else {
                    iBaseResponseCallback.a(0, list);
                }
            }
        });
    }

    public void a(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        int[] iArr = {DicDataTypeUtil.DataType.BODY_SHAPE.value()};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nkf.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                nkf.this.b(obj, iBaseResponseCallback, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastBodyShapeDataResult callback is null");
            return;
        }
        if (!(obj instanceof SparseArray)) {
            LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastBodyShapeDataResult onResult data not instanceof SparseArray");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastBodyShapeDataResult data is empty errorCode：", Integer.valueOf(i));
            iBaseResponseCallback.a(i, 0L);
            return;
        }
        Object obj2 = sparseArray.get(DicDataTypeUtil.DataType.BODY_SHAPE.value());
        if (!njy.b(obj2, HiHealthData.class)) {
            LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastBodyShapeDataResult onResult data not instanceof List");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        List list = (List) obj2;
        if (list.isEmpty()) {
            LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastBodyShapeDataResult onResult list is empty");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (hiHealthData != null) {
            long startTime = hiHealthData.getStartTime();
            LogUtil.a("Common_HwHealthWeightDataManager", "acquireLastBodyShapeDataResult getStartTime:", Long.valueOf(startTime));
            iBaseResponseCallback.a(0, Long.valueOf(startTime));
        } else {
            iBaseResponseCallback.a(100001, null);
            LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastBodyShapeDataResult onResult hiHealthData is null");
        }
    }

    public void d(String str, String str2, String str3, long j, boolean z) {
        LogUtil.a("Common_HwHealthWeightDataManager", "setSampleConfig type " + str + " configId " + str2 + " configData " + str3, " timeStamp ", Long.valueOf(j));
        xkb.d(str2, new AnonymousClass4(str2, str3, j, z));
    }

    /* JADX INFO: renamed from: nkf$4, reason: invalid class name */
    class AnonymousClass4 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f43161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f43162c;
        final /* synthetic */ String d;
        final /* synthetic */ long e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass4(String str, String str2, long j, boolean z) {
            this.f43162c = str;
            this.d = str2;
            this.e = j;
            this.f43161b = z;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (!njy.b(obj, HiSampleConfig.class)) {
                ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
                final String str = this.f43162c;
                final String str2 = this.d;
                final long j = this.e;
                final boolean z = this.f43161b;
                threadPoolManagerC.execute(new Runnable() { // from class: nkt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.a(str, str2, j, z);
                    }
                });
                return;
            }
            List list = (List) obj;
            if (njy.e(list) || list.get(0) == null) {
                LogUtil.j("Common_HwHealthWeightDataManager", "setSampleConfig empty list");
                ThreadPoolManager threadPoolManagerC2 = ThreadPoolManager.c();
                final String str3 = this.f43162c;
                final String str4 = this.d;
                final long j2 = this.e;
                final boolean z2 = this.f43161b;
                threadPoolManagerC2.execute(new Runnable() { // from class: nks
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43203c.e(str3, str4, j2, z2);
                    }
                });
                return;
            }
            long modifiedTime = ((HiSampleConfig) list.get(0)).getModifiedTime();
            LogUtil.a("Common_HwHealthWeightDataManager", "setSampleConfig modifiedTime: ", Long.valueOf(modifiedTime));
            if (this.e > modifiedTime) {
                ThreadPoolManager threadPoolManagerC3 = ThreadPoolManager.c();
                final String str5 = this.f43162c;
                final String str6 = this.d;
                final long j3 = this.e;
                final boolean z3 = this.f43161b;
                threadPoolManagerC3.execute(new Runnable() { // from class: nkq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.b(str5, str6, j3, z3);
                    }
                });
            }
        }

        /* synthetic */ void a(String str, String str2, long j, boolean z) {
            nkf.this.c(str, str2, j, z);
        }

        /* synthetic */ void e(String str, String str2, long j, boolean z) {
            nkf.this.c(str, str2, j, z);
        }

        /* synthetic */ void b(String str, String str2, long j, boolean z) {
            nkf.this.c(str, str2, j, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, final String str2, final long j, final boolean z) {
        if ("900300022".equals(str)) {
            try {
                nlx.b(new JSONObject(str2).optDouble("weightGoal"), j, new AnonymousClass5(z, j), z);
                return;
            } catch (JSONException e) {
                ReleaseLogUtil.a("Common_HwHealthWeightDataManager", "setSampleConfig exception ", ExceptionUtils.c(e));
                return;
            }
        }
        if ("900300023".equals(str)) {
            nlx.d((ivd) HiJsonUtil.d(str2, ivd.class), j, true, (ResponseCallback<ivd>) new ResponseCallback() { // from class: nkm
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f43186b.c(z, str2, j, i, (ivd) obj);
                }
            }, z, (iuv) null);
            c(OperationKey.HEALTH_APP_WEIGHT_LOSS_SHAPING_SERVICE_2129034, "Common_HwHealthWeightDataManager_setSampleConfig", 0, (DeviceInfo) null);
        }
    }

    /* JADX INFO: renamed from: nkf$5, reason: invalid class name */
    /* JADX INFO: loaded from: classes11.dex */
    class AnonymousClass5 implements ResponseCallback<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f43163a;
        final /* synthetic */ long e;

        AnonymousClass5(boolean z, long j) {
            this.f43163a = z;
            this.e = j;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Double d) {
            if (i == -1 || !this.f43163a) {
                return;
            }
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final long j = this.e;
            threadPoolManagerC.execute(new Runnable() { // from class: nkr
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(j);
                }
            });
        }

        /* synthetic */ void e(final long j) {
            xkb.d("900300023", new HiDataReadResultListener() { // from class: nkf.5.2
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    if (njy.b(obj, HiSampleConfig.class)) {
                        List list = (List) obj;
                        if (njy.e(list) || list.get(0) == null) {
                            LogUtil.j("Common_HwHealthWeightDataManager", "empty list");
                            return;
                        }
                        LogUtil.a("Common_HwHealthWeightDataManager", "weight goal:saveWeightTargetDifferences");
                        nkf.this.b(((HiSampleConfig) list.get(0)).getConfigData(), j);
                    }
                }
            });
        }
    }

    /* synthetic */ void c(boolean z, String str, long j, int i, ivd ivdVar) {
        if (i == 0 && z) {
            LogUtil.a("Common_HwHealthWeightDataManager", "weight manager:saveWeightTargetDifferences");
            b(str, j);
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(final String str, final long j) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: nkk
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(str, j);
                }
            });
            return;
        }
        ivd ivdVar = (ivd) HiJsonUtil.d(str, ivd.class);
        if (ivdVar == null) {
            ReleaseLogUtil.e("Common_HwHealthWeightDataManager", "saveWeightTargetDifferences weightManager is null");
        } else {
            iun.e(ivdVar, j);
        }
    }

    public void a(String str, String str2, HiDataReadResultListener hiDataReadResultListener) {
        xkb.d(str2, hiDataReadResultListener);
    }

    public void d(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        if (j >= j2) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        int[] iArr = {DicDataTypeUtil.DataType.RESTING_METABOLISM.value(), DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE.value()};
        String[] strArr = {BleConstants.BASAL_METABOLISM, "basalMetabolismAfterExercise"};
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(HiDateUtil.p(j), HiDateUtil.g(j2 - 1000));
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setConstantsKey(strArr);
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: nkf.1
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.j("Common_HwHealthWeightDataManager", "queryHistoryRestMetaData data ", list, " error code ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    return;
                }
                iBaseResponseCallback2.a(i, list);
            }
        });
    }

    public void b(long j, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HwHealthWeightDataManager", "getLatestWeight startTime ", Long.valueOf(j));
        int[] iArr = {10006};
        String[] strArr = {BleConstants.WEIGHT_KEY};
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        if (j == 0) {
            hiAggregateOption.setTimeInterval(0L, System.currentTimeMillis());
        } else {
            hiAggregateOption.setTimeInterval(j, System.currentTimeMillis());
        }
        hiAggregateOption.setTimeInterval(0L, System.currentTimeMillis());
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setFilter("NULL");
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: nkf.6
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.j("Common_HwHealthWeightDataManager", "getLatestWeight data ", list, " error code ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
                nkf.this.d(list, iBaseResponseCallback, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj, IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastWeightDataResult callback is null");
            return;
        }
        if (!njy.b(obj, HiHealthData.class)) {
            LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastWeightDataResult onResult data not instanceof List");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastWeightDataResult onResult list is empty");
            iBaseResponseCallback.a(100001, null);
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (hiHealthData != null) {
            LogUtil.a("Common_HwHealthWeightDataManager", "acquireLastWeightDataResult getStartTime:", Long.valueOf(hiHealthData.getStartTime()));
            if (a(hiHealthData)) {
                iBaseResponseCallback.a(0, hiHealthData);
                return;
            } else {
                iBaseResponseCallback.a(ErrorCode.HWID_IS_STOPED, hiHealthData);
                return;
            }
        }
        iBaseResponseCallback.a(100001, null);
        LogUtil.j("Common_HwHealthWeightDataManager", "acquireLastWeightDataResult onResult hiHealthData is null");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    private boolean a(HiHealthData hiHealthData) {
        double d;
        if (!hiHealthData.containsKey("bodyWeight") || !hiHealthData.containsKey(CommonConstant.KEY_GENDER) || !hiHealthData.containsKey("height") || !hiHealthData.containsKey("age")) {
            return false;
        }
        double d2 = hiHealthData.getDouble(BleConstants.BASAL_METABOLISM);
        int i = hiHealthData.getInt(CommonConstant.KEY_GENDER);
        int i2 = hiHealthData.getInt("bodyWeight");
        int i3 = hiHealthData.getInt("height");
        int i4 = hiHealthData.getInt("age");
        double d3 = ((((double) i2) * 9.99d) + (((double) i3) * 6.25d)) - ((double) (i4 * 5));
        if (i != 0) {
            if (i == 2) {
                d = 78.0d;
            } else if (i == 1) {
                d3 += 5.0d;
            }
            LogUtil.a("Common_HwHealthWeightDataManager", "satisfySendToDevice bmr=", Double.valueOf(d2), " gender=", Integer.valueOf(i), " weight=", Integer.valueOf(i2), " height=", Integer.valueOf(i3), " age=", Integer.valueOf(i4), " msje=", Double.valueOf(d3));
            if (d2 < d3 * 1.4d) {
                return true;
            }
            return false;
        }
        d = 161.0d;
        d3 -= d;
        LogUtil.a("Common_HwHealthWeightDataManager", "satisfySendToDevice bmr=", Double.valueOf(d2), " gender=", Integer.valueOf(i), " weight=", Integer.valueOf(i2), " height=", Integer.valueOf(i3), " age=", Integer.valueOf(i4), " msje=", Double.valueOf(d3));
        if (d2 < d3 * 1.4d) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(final ResponseCallback<Pair<Long, ivd>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("Common_HwHealthWeightDataManager", "getSampleConfig listener is null");
        } else if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: nko
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(responseCallback);
                }
            });
        } else {
            nlx.e("900300023", true, (ResponseCallback<Pair<Long, Object>>) new ResponseCallback() { // from class: nkn
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    nkf.a(responseCallback, i, (Pair) obj);
                }
            });
        }
    }

    static /* synthetic */ void a(ResponseCallback responseCallback, int i, Pair pair) {
        if (pair != null && (pair.second instanceof ivd)) {
            ivd ivdVar = (ivd) pair.second;
            iuo.d(ivdVar);
            responseCallback.onResponse(i, new Pair((Long) pair.first, ivdVar));
            return;
        }
        responseCallback.onResponse(-1, null);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final ResponseCallback<Float> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("Common_HwHealthWeightDataManager", "getSampleConfig listener is null");
        } else if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: nkh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43182a.a(responseCallback);
                }
            });
        } else {
            nlx.e("900300022", true, (ResponseCallback<Pair<Long, Object>>) new ResponseCallback() { // from class: nkl
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f43185c.c(responseCallback, i, (Pair) obj);
                }
            });
        }
    }

    /* synthetic */ void c(ResponseCallback responseCallback, int i, Pair pair) {
        ReleaseLogUtil.d("Common_HwHealthWeightDataManager", "getWeightGoal pair ", pair);
        if (pair != null && (pair.second instanceof Float)) {
            Float f = (Float) pair.second;
            float fFloatValue = f.floatValue();
            c(fFloatValue);
            iuo.e(fFloatValue);
            responseCallback.onResponse(i, f);
            return;
        }
        c((ResponseCallback<Float>) responseCallback);
    }

    private void c(final ResponseCallback<Float> responseCallback) {
        HiHealthNativeApi.a(BaseApplication.b()).fetchGoalInfo(0, 5, new HiCommonListener() { // from class: nkf.7
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (obj == null) {
                    LogUtil.e("Common_HwHealthWeightDataManager", "getWeightFromHiGoal data is null");
                    responseCallback.onResponse(-1, null);
                    return;
                }
                if (!njy.b(obj, HiGoalInfo.class)) {
                    LogUtil.e("Common_HwHealthWeightDataManager", "getWeightFromHiGoal is not list<HiGoalInfo> type");
                    responseCallback.onResponse(-1, null);
                    return;
                }
                List list = (List) obj;
                if (njy.e(list) || list.get(0) == null) {
                    LogUtil.e("Common_HwHealthWeightDataManager", "getWeightFromHiGoal goalInformationList is null");
                    responseCallback.onResponse(-1, null);
                } else {
                    float goalValue = (float) ((HiGoalInfo) list.get(0)).getGoalValue();
                    LogUtil.d("Common_HwHealthWeightDataManager", "getWeightFromHiGoal targetWeight is ", Float.valueOf(goalValue));
                    nkf.this.c(goalValue);
                    responseCallback.onResponse(0, Float.valueOf(goalValue));
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("Common_HwHealthWeightDataManager", "getWeightFromHiGoal failed, errCode is", Integer.valueOf(i));
                responseCallback.onResponse(-1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f) {
        if (f <= 0.0f) {
            ReleaseLogUtil.e("Common_HwHealthWeightDataManager", "setFatReductionShapingState targetWeight ", Float.valueOf(f));
            return;
        }
        boolean zA = iuo.a();
        ReleaseLogUtil.d("Common_HwHealthWeightDataManager", "setFatReductionShapingState isOpenFatReductionShaping ", Boolean.valueOf(zA));
        if (zA) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: nkj
            @Override // java.lang.Runnable
            public final void run() {
                iun.e(false, (ResponseCallback<Boolean>) new ResponseCallback() { // from class: nki
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        nkf.a(i, (Boolean) obj);
                    }
                });
            }
        });
    }

    static /* synthetic */ void a(int i, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            iuo.c(System.currentTimeMillis());
        }
    }

    public static void c(OperationKey operationKey, String str, int i, DeviceInfo deviceInfo) {
        if (CommonUtil.bu()) {
            return;
        }
        if (operationKey == null) {
            LogUtil.j("Common_HwHealthWeightDataManager", "setDietDiaryBiEvent operationKey is null");
            return;
        }
        String strValue = operationKey.value();
        if (TextUtils.isEmpty(strValue)) {
            LogUtil.j("Common_HwHealthWeightDataManager", "setDietDiaryBiEvent eventId ", strValue);
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
        linkedHashMap.put("source", str);
        linkedHashMap.put("actiontype", String.valueOf(i));
        if (deviceInfo != null) {
            String deviceName = deviceInfo.getDeviceName();
            String deviceModel = deviceInfo.getDeviceModel();
            String softVersion = deviceInfo.getSoftVersion();
            linkedHashMap.put("device_name", deviceName);
            linkedHashMap.put("device_model", deviceModel);
            linkedHashMap.put(OpAnalyticsConstants.DEVICE_SOFT_VERSION, softVersion);
            LogUtil.a("Common_HwHealthWeightDataManager", "setDietDiaryBiEvent deviceName ", deviceName, " deviceModel ", deviceModel, " deviceSoftVersion ", softVersion);
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(strValue, linkedHashMap);
        LogUtil.a("Common_HwHealthWeightDataManager", "setDietDiaryBiEvent eventId ", strValue, " source ", str, " actionType ", Integer.valueOf(i));
    }
}
