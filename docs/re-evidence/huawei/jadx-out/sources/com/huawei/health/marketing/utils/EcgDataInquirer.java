package com.huawei.health.marketing.utils;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.section.section.MeasureCardItemHolder;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import defpackage.gvl;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class EcgDataInquirer {
    public static final int ECG_ARRHY_TYPE_AFIB = 8;
    public static final int ECG_ARRHY_TYPE_AMBIGUOUS = 64;
    public static final int ECG_ARRHY_TYPE_AMBIGUOUS_BAD_SIGNAL = 128;
    public static final int ECG_ARRHY_TYPE_AMBIGUOUS_TOO_HIGH = 16;
    public static final int ECG_ARRHY_TYPE_AMBIGUOUS_TOO_LOW = 32;
    public static final int ECG_ARRHY_TYPE_PAC = 2;
    public static final int ECG_ARRHY_TYPE_PVC = 4;
    public static final int ECG_ARRHY_TYPE_SINUS = 1;
    public static final int ECG_ARR_TYPE_INVALID = 0;
    public static final String ECG_DATA_OBSERVER = "ECG_DATA_OBSERVER";
    private static final String TAG = "EcgDataInquirer";
    public static final int UPDATE_ALL = 63;
    public static final int UPDATE_ECG_ARRHYTHMIA_CHART = 8;
    public static final int UPDATE_ECG_ARRHYTHMIA_DESC = 4;
    public static final int UPDATE_ECG_NORMAL_CHART = 2;
    public static final int UPDATE_ECG_NORMAL_DESC = 1;
    public static final int UPDATE_ECG_VASCULAR_CHART = 32;
    public static final int UPDATE_ECG_VASCULAR_DESC = 16;
    private static final int VALID_MASK_MAX_READ_COUNT = 50;
    protected int[] mDataTypes;
    private volatile boolean mIsQuerying;
    protected gvl mMeasureCardBean;

    protected abstract void onQueryDetailDone(SparseArray<List<HiHealthData>> sparseArray);

    protected abstract void onQuerySummaryDone(SparseArray<List<HiHealthData>> sparseArray);

    public EcgDataInquirer(int[] iArr, MeasureCardItemHolder.MeasureType measureType) {
        this.mDataTypes = iArr;
        this.mMeasureCardBean = new gvl(measureType);
    }

    private void clearData() {
        gvl gvlVar = this.mMeasureCardBean;
        if (gvlVar != null) {
            gvlVar.e();
        }
    }

    public boolean isQuerying() {
        return this.mIsQuerying;
    }

    public void setQuerying(boolean z) {
        this.mIsQuerying = z;
    }

    public void clearAndRefreshUI() {
        clearData();
        ObserverManagerUtil.e(ECG_DATA_OBSERVER, 63);
    }

    public void querySummary() {
        if ("1".equals(SharedPreferenceUtil.getInstance(BaseApplication.b()).getAccountType())) {
            clearAndRefreshUI();
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(System.currentTimeMillis());
        hiDataReadOption.setCount(50);
        hiDataReadOption.setType(this.mDataTypes);
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(hiDataReadOption).a(1).b();
        this.mIsQuerying = true;
        LogUtil.a(TAG, "querySummary: dataTypes = ", Arrays.toString(this.mDataTypes));
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthDataPro(hiDataReadProOptionB, new AnonymousClass4());
    }

    /* JADX INFO: renamed from: com.huawei.health.marketing.utils.EcgDataInquirer$4, reason: invalid class name */
    public class AnonymousClass4 implements HiDataReadResultListener {
        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass4() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a(EcgDataInquirer.TAG, "querySummary : dataTypes = ", Arrays.toString(EcgDataInquirer.this.mDataTypes), ", errorCode = ", Integer.valueOf(i), ", data = ", obj);
            if (i != 0 || !(obj instanceof SparseArray)) {
                EcgDataInquirer.this.mIsQuerying = false;
                return;
            }
            EcgDataInquirer.this.mIsQuerying = false;
            final SparseArray sparseArray = (SparseArray) obj;
            ThreadPoolManager.c().execute(new Runnable() { // from class: fxi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34678b.c(sparseArray);
                }
            });
        }

        public /* synthetic */ void c(SparseArray sparseArray) {
            EcgDataInquirer.this.onQuerySummaryDone(sparseArray);
        }
    }

    protected void queryDetail(long j, long j2, int[] iArr) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setCount(1);
        hiDataReadOption.setType(iArr);
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).a(0).b(), new HiDataReadResultListener() { // from class: com.huawei.health.marketing.utils.EcgDataInquirer.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a(EcgDataInquirer.TAG, "parseEcgDiagramSeqData cause data = ", obj);
                if (obj instanceof SparseArray) {
                    EcgDataInquirer.this.onQueryDetailDone((SparseArray) obj);
                }
            }
        });
    }

    public gvl getMeasureCardBean() {
        return this.mMeasureCardBean;
    }
}
