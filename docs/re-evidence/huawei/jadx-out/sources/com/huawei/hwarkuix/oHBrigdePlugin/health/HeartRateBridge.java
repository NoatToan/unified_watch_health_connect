package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.fxn;
import defpackage.njy;
import defpackage.nrh;
import defpackage.peh;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes37.dex */
public class HeartRateBridge {
    private static final String R_TAG = "R_ArkUIX_HeartRateBridge";
    private static final String TAG = "ArkUIX_HeartRateBridge";

    public static void processECG(Object... objArr) {
        ReleaseLogUtil.c(R_TAG, "enter processECG");
        if (objArr.length == 3) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                Object obj2 = objArr[1];
                if (obj2 instanceof IBaseResponseCallback) {
                    Object obj3 = objArr[2];
                    if (obj3 instanceof SparseArray) {
                        IBaseResponseCallback iBaseResponseCallback = (IBaseResponseCallback) obj2;
                        List listC = peh.c((String) obj, nrh[].class);
                        List list = (List) ((SparseArray) obj3).get(DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value(), null);
                        if (njy.b(list) && njy.b(listC)) {
                            List<Double> listE = fxn.e((List<HiHealthData>) list);
                            if (listE == null) {
                                ReleaseLogUtil.b(R_TAG, "chartDataList is null");
                                iBaseResponseCallback.a(0, "[]");
                                return;
                            }
                            nrh nrhVar = (nrh) listC.get(0);
                            HiHealthData hiHealthData = (HiHealthData) list.get(0);
                            compareTimeStamp(hiHealthData.getStartTime(), "NormalItemHolder");
                            nrhVar.e();
                            nrhVar.d("ecgFilterData", listE.toString());
                            try {
                                JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
                                nrhVar.d("ecgArrhyType", Integer.valueOf(jSONObject.getInt("ecgArrhyType")));
                                nrhVar.d("existNewData", Boolean.valueOf(fxn.c("NormalItemHolder")));
                                nrhVar.d(BleConstants.AVERAGE_HEART_RATE, Integer.valueOf(jSONObject.getInt(BleConstants.AVERAGE_HEART_RATE)));
                            } catch (JSONException unused) {
                                ReleaseLogUtil.b(R_TAG, "JSONException");
                            }
                            ReleaseLogUtil.b(R_TAG, "ecg data size ", Integer.valueOf(listE.size()));
                            LogUtil.a(TAG, " ecg data is ", listE, " output is ", peh.c(listC));
                            iBaseResponseCallback.a(0, peh.c(listC));
                            return;
                        }
                        ReleaseLogUtil.b(R_TAG, "parseEcgData no diagram data found, diagramDataList is empty!");
                        compareTimeStamp(0L, "NormalItemHolder");
                        iBaseResponseCallback.a(0, "[]");
                        return;
                    }
                }
            }
        }
        ReleaseLogUtil.b(R_TAG, "args exception");
    }

    public static void processECGDia(Object... objArr) {
        ReleaseLogUtil.c(R_TAG, "enter processECGDia");
        if (objArr.length == 3) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                Object obj2 = objArr[1];
                if (obj2 instanceof IBaseResponseCallback) {
                    Object obj3 = objArr[2];
                    if (obj3 instanceof SparseArray) {
                        IBaseResponseCallback iBaseResponseCallback = (IBaseResponseCallback) obj2;
                        List listC = peh.c((String) obj, nrh[].class);
                        List list = (List) ((SparseArray) obj3).get(31002, null);
                        if (njy.b(list) && njy.b(listC)) {
                            List<Double> listE = fxn.e((List<HiHealthData>) list);
                            if (listE == null) {
                                ReleaseLogUtil.b(R_TAG, "chartDataList is null");
                                iBaseResponseCallback.a(0, "[]");
                                return;
                            }
                            nrh nrhVar = (nrh) listC.get(0);
                            HiHealthData hiHealthData = (HiHealthData) list.get(0);
                            compareTimeStamp(hiHealthData.getStartTime(), "NormalDiaItemHolder");
                            nrhVar.e();
                            nrhVar.c("ecgDataList", listE.toString());
                            nrhVar.c("existNewData", Boolean.valueOf(fxn.c("NormalDiaItemHolder")));
                            try {
                                JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
                                nrhVar.c("ecgArrhyType", Integer.valueOf(jSONObject.getInt("ecgArrhyType")));
                                nrhVar.c(BleConstants.AVERAGE_HEART_RATE, Integer.valueOf(jSONObject.getInt(BleConstants.AVERAGE_HEART_RATE)));
                            } catch (JSONException unused) {
                                ReleaseLogUtil.b(TAG, "JSONException");
                            }
                            LogUtil.a(TAG, " ecg data is ", listE, " output is ", peh.c(listC));
                            iBaseResponseCallback.a(0, peh.c(listC));
                            return;
                        }
                        ReleaseLogUtil.b(R_TAG, "processECGDia no diagram data found, diagramDataList is empty!");
                        compareTimeStamp(0L, "NormalDiaItemHolder");
                        iBaseResponseCallback.a(0, "[]");
                        return;
                    }
                }
            }
        }
        ReleaseLogUtil.b(R_TAG, "args exception");
    }

    public static void processVas(Object... objArr) {
        ReleaseLogUtil.c(R_TAG, "enter processVas");
        if (objArr.length == 3) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                Object obj2 = objArr[1];
                if (obj2 instanceof IBaseResponseCallback) {
                    Object obj3 = objArr[2];
                    if (obj3 instanceof SparseArray) {
                        IBaseResponseCallback iBaseResponseCallback = (IBaseResponseCallback) obj2;
                        List listC = peh.c((String) obj, nrh[].class);
                        List list = (List) ((SparseArray) obj3).get(DicDataTypeUtil.DataType.PULSE_WAVE_VELOCITY.value(), null);
                        if (njy.b(list) && njy.b(listC)) {
                            compareTimeStamp(((HiHealthData) list.get(0)).getStartTime(), "VascularItemHolder");
                            ((nrh) listC.get(0)).c("existNewData", Boolean.valueOf(fxn.c("VascularItemHolder")));
                            iBaseResponseCallback.a(0, peh.c(listC));
                            return;
                        } else {
                            ReleaseLogUtil.b(R_TAG, "processVas no collection data found!");
                            compareTimeStamp(0L, "VascularItemHolder");
                            iBaseResponseCallback.a(0, "[]");
                            return;
                        }
                    }
                }
            }
        }
        ReleaseLogUtil.b(R_TAG, "args exception");
    }

    public static void processPPG(Object... objArr) {
        ReleaseLogUtil.c(R_TAG, "enter processPPG");
        if (objArr.length == 3) {
            Object obj = objArr[1];
            if (obj instanceof IBaseResponseCallback) {
                HiDataReadOption hiDataReadOption = new HiDataReadOption();
                hiDataReadOption.setStartTime(0L);
                hiDataReadOption.setEndTime(System.currentTimeMillis());
                hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.PPG_IRREGULAR_HEARTBEAT.value()});
                hiDataReadOption.setCount(1);
                HiHealthNativeApi.a(BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).a(1).b(), new AnonymousClass1((IBaseResponseCallback) obj));
                return;
            }
        }
        ReleaseLogUtil.b(R_TAG, "args exception");
    }

    /* JADX INFO: renamed from: com.huawei.hwarkuix.oHBrigdePlugin.health.HeartRateBridge$1, reason: invalid class name */
    class AnonymousClass1 implements HiDataReadResultListener {
        final /* synthetic */ IBaseResponseCallback val$callback;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass1(IBaseResponseCallback iBaseResponseCallback) {
            this.val$callback = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (i != 0 || !(obj instanceof SparseArray)) {
                ReleaseLogUtil.b(HeartRateBridge.R_TAG, "readHiHealthDataPro null");
                this.val$callback.a(0, "[]");
                return;
            }
            List list = (List) ((SparseArray) obj).get(DicDataTypeUtil.DataType.PPG_IRREGULAR_HEARTBEAT.value(), null);
            if (!njy.b(list)) {
                HeartRateBridge.compareTimeStamp(0L, "ArrhythmiaItemHolder");
                ReleaseLogUtil.b(HeartRateBridge.R_TAG, "processPPG no collection data found!");
                this.val$callback.a(0, "[]");
                return;
            }
            final HiHealthData hiHealthData = (HiHealthData) list.get(0);
            final nrh nrhVar = new nrh(hiHealthData);
            nrhVar.c("existNewData", Boolean.valueOf(fxn.c("ArrhythmiaItemHolder")));
            nrhVar.c("ppgIrregularHeartbeat", Integer.valueOf(fxn.a((int) hiHealthData.getValue())));
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final IBaseResponseCallback iBaseResponseCallback = this.val$callback;
            threadPoolManagerC.execute(new Runnable() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.HeartRateBridge$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    HiHealthData hiHealthData2 = hiHealthData;
                    HeartRateBridge.queryPPGDetailData(hiHealthData2.getStartTime(), hiHealthData2.getEndTime(), nrhVar, iBaseResponseCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void queryPPGDetailData(final long j, long j2, final nrh nrhVar, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setCount(1);
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()});
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).a(0).b(), new HiDataReadResultListener() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.HeartRateBridge.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a(HeartRateBridge.TAG, "ARRHYTHMIA_PPG_TYPE data = ", obj);
                if (!(obj instanceof SparseArray)) {
                    ReleaseLogUtil.b(HeartRateBridge.R_TAG, "readHiHealthDataPro null");
                    iBaseResponseCallback.a(0, "[]");
                    return;
                }
                List list = (List) ((SparseArray) obj).get(DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value());
                if (!njy.e(list)) {
                    HeartRateBridge.compareTimeStamp(j, "ArrhythmiaItemHolder");
                    nrhVar.c("existNewData", Boolean.valueOf(fxn.c("ArrhythmiaItemHolder")));
                    HiHealthData hiHealthData = (HiHealthData) list.get(0);
                    String simpleData = hiHealthData.getSimpleData();
                    if (TextUtils.isEmpty(simpleData)) {
                        LogUtil.a(HeartRateBridge.TAG, "onQueryDetailDone getDrawDataJsonStrWithAlgo now!");
                        simpleData = fxn.e(hiHealthData);
                    }
                    List<Double> listE = fxn.e(simpleData);
                    nrhVar.c("rriArray", listE != null ? listE.toString() : "[]");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(nrhVar);
                    LogUtil.a(HeartRateBridge.TAG, "ppg data is ", listE, " output is ", peh.c(arrayList));
                    iBaseResponseCallback.a(0, peh.c(arrayList));
                    return;
                }
                LogUtil.e(HeartRateBridge.TAG, "ppg cause hiSeqDataList is empty");
                HeartRateBridge.compareTimeStamp(0L, "ArrhythmiaItemHolder");
                nrhVar.c("existNewData", Boolean.valueOf(fxn.c("ArrhythmiaItemHolder")));
                iBaseResponseCallback.a(0, "[]");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void compareTimeStamp(long j, String str) {
        long jD = fxn.d(str);
        ReleaseLogUtil.c(TAG, "compareTimeStamp:lastTimeStamp ", Long.valueOf(jD), " newTimeStamp ", Long.valueOf(j), " tag is ", str);
        if (j > jD) {
            fxn.b(true, str);
            fxn.c(j, str);
        } else if (j == 0) {
            fxn.b(false, str);
            fxn.c(j, str);
        }
    }
}
