package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiStressBreatheMetaData;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hihealth.data.model.HiStressRelaxMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public class nkp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nkp f43189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f43190c = new Object();
    private ExecutorService d = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f43191a = BaseApplication.getContext();

    private nkp() {
    }

    public static nkp a() {
        nkp nkpVar;
        synchronized (f43190c) {
            if (f43189b == null) {
                f43189b = new nkp();
            }
            nkpVar = f43189b;
        }
        return nkpVar;
    }

    public void d(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j * 1000);
        hiDataReadOption.setEndTime(j2 * 1000);
        int[] iArr = {2034};
        hiDataReadOption.setType(iArr);
        LogUtil.a("PressureMeasureModelInterator", "getStressDetailDatas errorCode setType =", Integer.valueOf(iArr[0]));
        e(iBaseResponseCallback, hiDataReadOption, 1);
    }

    public void b(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j * 1000);
        hiDataReadOption.setEndTime(j2 * 1000);
        hiDataReadOption.setType(new int[]{44306});
        e(iBaseResponseCallback, hiDataReadOption, 4);
    }

    private void e(final IBaseResponseCallback iBaseResponseCallback, HiDataReadOption hiDataReadOption, final int i) {
        HiHealthNativeApi.a(this.f43191a).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nkp.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                LogUtil.a("PressureMeasureModelInterator", "getDetailDatas errorCode = ", Integer.valueOf(i2));
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    LogUtil.j("PressureMeasureModelInterator", "callback is null");
                    return;
                }
                if (obj == null) {
                    iBaseResponseCallback2.a(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                int i4 = i;
                if (i4 == 1) {
                    nkp.this.d((SparseArray<Object>) sparseArray, iBaseResponseCallback);
                    return;
                }
                if (i4 == 2) {
                    nkp.this.a((SparseArray<Object>) sparseArray, iBaseResponseCallback);
                    return;
                }
                if (i4 == 4) {
                    nkp.this.c(sparseArray, iBaseResponseCallback);
                    return;
                }
                if (i4 == 5) {
                    nkp.this.e((SparseArray<Object>) sparseArray, iBaseResponseCallback);
                } else if (i4 == 6) {
                    nkp.this.b(sparseArray, iBaseResponseCallback);
                } else {
                    LogUtil.j("PressureMeasureModelInterator", "dataType = ", Integer.valueOf(i4));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SparseArray<Object> sparseArray, IBaseResponseCallback iBaseResponseCallback) {
        List list = (List) sparseArray.get(2034);
        LogUtil.a("PressureMeasureModelInterator", "pressureMeasureValueList.size() = ", Integer.valueOf(list.size()));
        d(list, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SparseArray<Object> sparseArray, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) sparseArray.get(2034)).iterator();
        while (it.hasNext()) {
            arrayList.add((HiStressMetaData) HiJsonUtil.d(((HiHealthData) it.next()).getMetaData(), HiStressMetaData.class));
        }
        LogUtil.a("PressureMeasureModelInterator", "stressMetaDatasList.size() = ", Integer.valueOf(arrayList.size()));
        d(arrayList, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SparseArray<Object> sparseArray, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : (List) sparseArray.get(44306)) {
            int intValue = hiHealthData.getIntValue();
            long startTime = hiHealthData.getStartTime();
            HiStressMetaData hiStressMetaData = new HiStressMetaData();
            hiStressMetaData.configStressScore(intValue);
            hiStressMetaData.configStressStartTime(startTime);
            arrayList.add(hiStressMetaData);
        }
        LogUtil.a("PressureMeasureModelInterator", "stressStatisticsMetaDatasList.size() = ", Integer.valueOf(arrayList.size()));
        d(arrayList, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SparseArray<Object> sparseArray, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) sparseArray.get(2037)).iterator();
        while (it.hasNext()) {
            arrayList.add((HiStressBreatheMetaData) HiJsonUtil.d(((HiHealthData) it.next()).getMetaData(), HiStressBreatheMetaData.class));
        }
        LogUtil.a("PressureMeasureModelInterator", "stressBreatheMetaDatasList = ", arrayList.toString());
        d(arrayList, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SparseArray<Object> sparseArray, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) sparseArray.get(2035)).iterator();
        while (it.hasNext()) {
            arrayList.add((HiStressRelaxMetaData) HiJsonUtil.d(((HiHealthData) it.next()).getMetaData(), HiStressRelaxMetaData.class));
        }
        LogUtil.a("PressureMeasureModelInterator", "stressRelaxMetaDatasList = ", arrayList.toString());
        d(arrayList, iBaseResponseCallback);
    }

    private void d(List list, IBaseResponseCallback iBaseResponseCallback) {
        if (list.size() > 0) {
            iBaseResponseCallback.a(0, list);
        } else {
            iBaseResponseCallback.a(-1, -1);
        }
    }

    public void b(String str, List<HiStressMetaData> list, IBaseResponseCallback iBaseResponseCallback) {
        if (list != null && !list.isEmpty()) {
            LogUtil.a("PressureMeasureModelInterator", "enter setStressData");
            ArrayList arrayList = new ArrayList();
            for (HiStressMetaData hiStressMetaData : list) {
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setValue(hiStressMetaData.fetchStressScore());
                hiHealthData.setDeviceUuid(str);
                hiHealthData.setTimeInterval(hiStressMetaData.fetchStressStartTime(), hiStressMetaData.fetchStressEndTime());
                hiHealthData.setType(2034);
                try {
                    hiHealthData.setMetaData(HiJsonUtil.d(hiStressMetaData));
                    LogUtil.a("PressureMeasureModelInterator", "metaData json =", HiJsonUtil.d(hiStressMetaData));
                    arrayList.add(hiHealthData);
                } catch (IllegalArgumentException e) {
                    LogUtil.a("PressureMeasureModelInterator", "setStressData : ", e.getMessage());
                    iBaseResponseCallback.a(100001, null);
                    return;
                }
            }
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            if (arrayList.isEmpty()) {
                iBaseResponseCallback.a(100001, null);
                return;
            } else {
                hiDataInsertOption.setDatas(arrayList);
                a(iBaseResponseCallback, hiDataInsertOption);
                return;
            }
        }
        LogUtil.j("PressureMeasureModelInterator", "metaDataList.isEmpty() or metaDataList is null setStressData ERR_NONE = ", 100001);
        iBaseResponseCallback.a(100001, null);
    }

    public void c(String str, HiStressMetaData hiStressMetaData, IBaseResponseCallback iBaseResponseCallback) {
        if (hiStressMetaData == null) {
            return;
        }
        LogUtil.d("PressureMeasureModelInterator", "setStressData uuid = ", str);
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setValue(hiStressMetaData.fetchStressScore());
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setTimeInterval(hiStressMetaData.fetchStressStartTime(), hiStressMetaData.fetchStressEndTime());
        hiHealthData.setType(2034);
        LogUtil.d("PressureMeasureModelInterator", "setStressData metaData = ", hiStressMetaData.toString());
        LogUtil.d("PressureMeasureModelInterator", "setStressData HiJsonUtil.toJson(metaData) = ", HiJsonUtil.d(hiStressMetaData));
        hiHealthData.setMetaData(HiJsonUtil.d(hiStressMetaData));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        a(iBaseResponseCallback, hiDataInsertOption);
    }

    private void a(final IBaseResponseCallback iBaseResponseCallback, HiDataInsertOption hiDataInsertOption) {
        HiHealthNativeApi.a(this.f43191a).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: nkp.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("PressureMeasureModelInterator", "errorCode = ", Integer.valueOf(i), "obj = ", HiJsonUtil.d(obj));
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(i, obj);
                }
            }
        });
    }

    public void e(final Context context, final HiStressMetaData hiStressMetaData) {
        this.d.execute(new Runnable() { // from class: nkp.2
            @Override // java.lang.Runnable
            public void run() {
                HiUserPreference hiUserPreference = new HiUserPreference();
                hiUserPreference.setKey("custom.pressure_adjust_userinfo");
                String strD = HiJsonUtil.d(hiStressMetaData);
                LogUtil.a("PressureMeasureModelInterator", "stressValues = ", strD);
                hiUserPreference.setValue(strD);
                HiHealthManager.d(context).setUserPreference(hiUserPreference);
            }
        });
    }

    public void b(final IBaseResponseCallback iBaseResponseCallback) {
        this.d.execute(new Runnable() { // from class: nkp.4
            @Override // java.lang.Runnable
            public void run() {
                HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.pressure_adjust_userinfo");
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    LogUtil.j("PressureMeasureModelInterator", "callback is null");
                    return;
                }
                if (userPreference != null) {
                    LogUtil.a("PressureMeasureModelInterator", "hiUserPreferenceBase != null");
                    if (!TextUtils.isEmpty(userPreference.getValue())) {
                        String value = userPreference.getValue();
                        LogUtil.a("PressureMeasureModelInterator", "getUserPressureAdjustDatas value = ", value);
                        iBaseResponseCallback.a(0, value);
                        return;
                    }
                    iBaseResponseCallback.a(100001, null);
                    return;
                }
                iBaseResponseCallback2.a(100006, null);
            }
        });
    }
}
