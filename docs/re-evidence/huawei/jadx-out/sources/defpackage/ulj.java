package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.huawei.hidatamanager.util.LogUtils;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.util.BloodSugarTimeUtils;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ulj implements IChartStorageHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f50321c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f50322a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataInfos f50323b;
    private DecimalFormat d;
    private String e;
    private final long f;
    private final String j;

    private static boolean b(int i) {
        return (i == 32 || i == 1) ? false : true;
    }

    public ulj(DataInfos dataInfos) {
        this.f50323b = dataInfos;
        if (dataInfos.isDayData()) {
            this.f = 180000L;
            this.j = "isDayData";
        } else if (dataInfos.isWeekData()) {
            this.f = 600000L;
            this.j = "isWeekData";
        } else {
            this.f = 3600000L;
            this.j = "isMonthData";
        }
    }

    public void c(String str) {
        this.e = str;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (dataInfos.isDayData() && !qnh.s(j)) {
            if (responseCallback != null) {
                responseCallback.onResult(-1, null);
            }
        } else if (!StringUtils.g(this.e)) {
            d(context, j, j2, responseCallback);
        } else if (responseCallback != null) {
            responseCallback.onResult(-1, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    private void d(Context context, long j, long j2, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        byte b2;
        String str = this.e;
        str.hashCode();
        switch (str) {
            case "BLOOD_SUGAR_NIGHT_BLOOD_GLUGLUCOSE":
                b2 = 0;
                break;
            case "BLOOD_SUGAR_BEFORE_SLEEP_BlOOD_GLUCOSE":
                b2 = 1;
                break;
            case "BLOOD_SUGAR_BEFORE_MEAL":
                b2 = 2;
                break;
            case "BLOOD_SUGAR_AFTER_MEAL":
                b2 = 3;
                break;
            case "BLOOD_SUGAR_LIMOSIS":
                b2 = 4;
                break;
            case "BLOOD_SUGAR_BEFORE_AFTER_MEAL_DIFFERENCE":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            c(context, j, j2, new int[]{2015}, responseCallback);
            return;
        }
        if (b2 == 1) {
            c(context, j, j2, new int[]{2014}, responseCallback);
            return;
        }
        if (b2 == 2) {
            c(context, j, j2, new int[]{2010, 2012}, responseCallback);
            return;
        }
        if (b2 == 3) {
            c(context, j, j2, new int[]{2009, 2011, 2013}, responseCallback);
            return;
        }
        if (b2 == 4) {
            c(context, j, j2, new int[]{2008}, responseCallback);
        } else if (b2 == 5) {
            a(context, j, j2, responseCallback);
        } else {
            e(context, j, j2, responseCallback);
        }
    }

    private void c(Context context, long j, long j2, int[] iArr, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        b(context, j, j2, iArr, new c(this, responseCallback, System.currentTimeMillis(), false, this.j + ", requestDataByTimePeriod"));
    }

    private void a(Context context, long j, long j2, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        b(context, j, j2, new int[]{2008, 2009, 2010, 2011, 2012, 2013}, new c(this, responseCallback, System.currentTimeMillis(), true, this.j + ",requestMealDifferenceData"));
    }

    private void e(Context context, long j, long j2, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        b(context, j, j2, this.f50323b.isDayData() ? uvz.e() : uvz.c(), new c(this, responseCallback, System.currentTimeMillis(), false, this.j + ", requestDataByTimeInterval"));
    }

    private void b(Context context, long j, long j2, int[] iArr, IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setSortOrder(0);
        if (this.f50323b.isDayData()) {
            ula.c().e(j, j2, iArr, iBaseResponseCallback);
        } else {
            nkb.d().b(context, hiDataReadOption, iBaseResponseCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        LogUtil.a("BloodSugarLineChartStorageHelper", "handleBloodsugarData enter");
        List<uwh> listD = d(list);
        HashMap map = new HashMap(16);
        if (njy.e(listD)) {
            if (responseCallback != null) {
                if (map.size() <= 0) {
                    responseCallback.onResult(-1, map);
                    return;
                } else {
                    responseCallback.onResult(0, map);
                    return;
                }
            }
            return;
        }
        b(listD, map);
        if (responseCallback != null) {
            if (map.size() <= 0) {
                responseCallback.onResult(-1, map);
            } else {
                responseCallback.onResult(0, map);
            }
        }
    }

    private void b(List<uwh> list, Map<Long, IStorageModel> map) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        ArrayList arrayList4 = new ArrayList(16);
        ArrayList arrayList5 = new ArrayList(16);
        ArrayList arrayList6 = new ArrayList(16);
        for (uwh uwhVar : list) {
            switch ((int) uwhVar.m()) {
                case 2008:
                    arrayList.add(uwhVar);
                    break;
                case 2009:
                    arrayList2.add(uwhVar);
                    break;
                case 2010:
                    arrayList3.add(uwhVar);
                    break;
                case 2011:
                    arrayList4.add(uwhVar);
                    break;
                case 2012:
                    arrayList5.add(uwhVar);
                    break;
                case 2013:
                    arrayList6.add(uwhVar);
                    break;
            }
        }
        Context context = BaseApplication.getContext();
        a(context, map, arrayList, arrayList2);
        a(context, map, arrayList3, arrayList4);
        a(context, map, arrayList5, arrayList6);
    }

    private void a(Context context, Map<Long, IStorageModel> map, List<uwh> list, List<uwh> list2) {
        uwh uwhVarValueAt;
        if (list == null || list2 == null) {
            LogUtil.j("BloodSugarLineChartStorageHelper", "The beforeMealList or afterMealList is Null");
            return;
        }
        if (list.isEmpty() || list2.isEmpty()) {
            LogUtil.j("BloodSugarLineChartStorageHelper", "The beforeMealList or afterMealList is Empty");
            return;
        }
        SparseArray<uwh> sparseArrayB = b(list);
        SparseArray<uwh> sparseArrayB2 = b(list2);
        if (sparseArrayB == null || sparseArrayB2 == null) {
            LogUtil.j("BloodSugarLineChartStorageHelper", "The beforeMealUniqueData or afterMealUniqueData is Empty");
            return;
        }
        int size = sparseArrayB.size();
        for (int i = 0; i < size; i++) {
            uwh uwhVar = sparseArrayB2.get(sparseArrayB.keyAt(i));
            if (uwhVar != null && (uwhVarValueAt = sparseArrayB.valueAt(i)) != null) {
                try {
                    float f = Float.parseFloat(e(Float.parseFloat(e((float) uwhVarValueAt.o())) - Float.parseFloat(e((float) uwhVar.o()))));
                    int i2 = Math.abs(f) > 3.3f ? 2 : 1;
                    uma umaVar = new uma(Math.abs(f), (int) uwhVarValueAt.m(), i2);
                    umaVar.d(c(context, i2));
                    umaVar.b(uwhVarValueAt.g());
                    umaVar.e(uwhVarValueAt.i());
                    umaVar.a(this.e);
                    d(context, umaVar, uwhVarValueAt, uwhVar);
                    map.put(Long.valueOf(uwhVarValueAt.g()), umaVar);
                } catch (NumberFormatException unused) {
                    LogUtil.e("BloodSugarLineChartStorageHelper", "diff value NumberFormatException");
                }
            }
        }
    }

    private void d(Context context, uma umaVar, uwh uwhVar, uwh uwhVar2) {
        float fO = (float) uwhVar.o();
        int iM = (int) uwhVar.m();
        int iE = e(context, fO, iM);
        boolean zD = d(uwhVar);
        int iC = c(context, iE);
        uma umaVar2 = new uma(fO, iM, iE);
        umaVar2.e(zD);
        umaVar2.d(iC);
        umaVar2.b(uwhVar.g());
        umaVar2.e(uwhVar.i());
        umaVar.e(umaVar2);
        float fO2 = (float) uwhVar2.o();
        int iM2 = (int) uwhVar2.m();
        int iE2 = e(context, fO2, iM2);
        boolean zD2 = d(uwhVar2);
        int iC2 = c(context, iE2);
        uma umaVar3 = new uma(fO2, iM2, iE2);
        umaVar3.e(zD2);
        umaVar3.d(iC2);
        umaVar3.b(uwhVar2.g());
        umaVar3.e(uwhVar2.i());
        umaVar.a(umaVar3);
    }

    private SparseArray<uwh> b(List<uwh> list) {
        if (list == null) {
            LogUtil.j("BloodSugarLineChartStorageHelper", "The healthDataList is NULL, return null");
            return new SparseArray<>(0);
        }
        e(list);
        SparseArray<uwh> sparseArray = new SparseArray<>(list.size());
        for (uwh uwhVar : list) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(uwhVar.g());
            sparseArray.put((calendar.get(1) * 10000) + (calendar.get(2) * 100) + calendar.get(5), uwhVar);
        }
        return sparseArray;
    }

    private void e(List<uwh> list) {
        Collections.sort(list, new Comparator<uwh>() { // from class: ulj.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(uwh uwhVar, uwh uwhVar2) {
                return Long.compare(uwhVar.g(), uwhVar2.g());
            }
        });
    }

    private List<uwh> d(List<HiHealthData> list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(16);
        if (list != null && !list.isEmpty()) {
            LogUtil.a("BloodSugarLineChartStorageHelper", "getValidHealthData, hiHealthData.size = ", Integer.valueOf(list.size()));
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getEndTime() <= jCurrentTimeMillis) {
                    uwh uwhVarC = uwl.c(hiHealthData);
                    if (uwhVarC == null) {
                        LogUtil.j("BloodSugarLineChartStorageHelper", "getValidHealthData, bloodSugarData is null");
                    } else {
                        if (TextUtils.isEmpty(uwhVarC.j()) && !b(uwhVarC.d())) {
                            uwhVarC.e(BloodSugarTimeUtils.b(hiHealthData.getType(), uwhVarC.g()));
                        }
                        arrayList.add(uwhVarC);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        HashMap map = new HashMap(16);
        if (njy.e(list)) {
            LogUtil.a("BloodSugarLineChartStorageHelper", "datas null or empty");
            responseCallback.onResult(-1, map);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        b(list, map, jCurrentTimeMillis);
        responseCallback.onResult(0, map);
        LogUtil.a("BloodSugarLineChartStorageHelper", "handleBloodsugarData end time=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", thread=", Long.valueOf(Thread.currentThread().getId()));
    }

    private void b(List<HiHealthData> list, Map<Long, IStorageModel> map, long j) {
        int iC;
        long endTime = 0;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getEndTime() <= j) {
                if (TextUtils.isEmpty(hiHealthData.getMetaData()) && !b(hiHealthData.getInt("trackdata_deviceType"))) {
                    hiHealthData.setEndTime(BloodSugarTimeUtils.b(hiHealthData.getType(), hiHealthData.getEndTime()));
                }
                int type = hiHealthData.getType();
                float fFloatValue = BigDecimal.valueOf(hiHealthData.getValue()).setScale(1, RoundingMode.HALF_UP).floatValue();
                int iE = e(BaseApplication.getContext(), fFloatValue, type);
                uma umaVar = new uma(fFloatValue, type, iE);
                String str = "BLOOD_SUGAR_CONTINUE";
                if (type != 2108) {
                    if (this.e.equals("BLOOD_SUGAR_CONTINUE")) {
                        iC = c(BaseApplication.getContext(), iE);
                        str = "BLOOD_SUGAR_FINGER_TIP";
                    } else {
                        str = this.e;
                        iC = c(BaseApplication.getContext(), iE);
                    }
                } else {
                    if (hiHealthData.getEndTime() - endTime < this.f) {
                        umaVar.d(true);
                    } else {
                        endTime = hiHealthData.getEndTime();
                    }
                    iC = ContextCompat.getColor(BaseApplication.getContext(), R.color.color_blood_low);
                }
                umaVar.e(a(hiHealthData));
                umaVar.d(iC);
                umaVar.b(hiHealthData.getEndTime());
                umaVar.e(hiHealthData.getString("device_uniquecode"));
                umaVar.a(str);
                umaVar.a(hiHealthData.getClientId());
                umaVar.a(hiHealthData.getModifiedTime());
                map.put(Long.valueOf(hiHealthData.getEndTime()), umaVar);
            }
        }
    }

    private int e(Context context, float f, int i) {
        Map<String, String> mapD = uvz.d(context, i, f);
        if (!mapD.containsKey("HEALTH_BLOOD_SUGAR_LEVEL_KEY")) {
            return 1000;
        }
        try {
            return Integer.parseInt(mapD.get("HEALTH_BLOOD_SUGAR_LEVEL_KEY"));
        } catch (NumberFormatException unused) {
            LogUtil.j("BloodSugarLineChartStorageHelper", "levelValue is String, parse to Integer error");
            return 1000;
        }
    }

    private boolean a(HiHealthData hiHealthData) {
        String metaData = hiHealthData.getMetaData();
        if (TextUtils.isEmpty(metaData)) {
            return false;
        }
        return !((HiBloodSugarMetaData) HiJsonUtil.d(metaData, HiBloodSugarMetaData.class)).getConfirmed();
    }

    private boolean d(uwh uwhVar) {
        String strJ = uwhVar.j();
        if (TextUtils.isEmpty(strJ)) {
            return false;
        }
        return !((HiBloodSugarMetaData) HiJsonUtil.d(strJ, HiBloodSugarMetaData.class)).getConfirmed();
    }

    private int c(Context context, int i) {
        if (context == null) {
            LogUtils.w("BloodSugarLineChartStorageHelper", "context is null");
            return 0;
        }
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 1001:
                    case 1002:
                        return ContextCompat.getColor(context, R.color.color_blood_low);
                    case 1003:
                        break;
                    case 1004:
                    case 1005:
                    case 1006:
                        break;
                    default:
                        return 0;
                }
            }
            return ContextCompat.getColor(context, R.color.color_blood_high);
        }
        return ContextCompat.getColor(context, R.color.color_blood_normal);
    }

    private String e(float f) {
        String str;
        if (this.d == null) {
            this.d = new DecimalFormat("0.0");
        }
        synchronized (f50321c) {
            str = this.d.format(f);
        }
        return str;
    }

    public void d(Context context, Handler handler) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(uvz.c());
        hiDataReadOption.setCount(1);
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setSortOrder(1);
        nkb.d().b(context, hiDataReadOption, new d(handler));
    }

    public void e() {
        this.f50322a = true;
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ulj> f50325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ResponseCallback<Map<Long, IStorageModel>> f50326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f50327c;
        private final String d;
        private final boolean e;

        c(ulj uljVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback, long j, boolean z, String str) {
            this.f50325a = new WeakReference<>(uljVar);
            this.f50326b = responseCallback;
            this.f50327c = j;
            this.e = z;
            this.d = str;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ulj uljVar = this.f50325a.get();
            if (uljVar == null || uljVar.f50322a) {
                this.f50326b = null;
                return;
            }
            LogUtil.a("BloodSugarLineChartStorageHelper", this.d, " mIsHandleMealDifferences=", Boolean.valueOf(this.e), ", time = ", Long.valueOf(System.currentTimeMillis() - this.f50327c), ", thread=", Long.valueOf(Thread.currentThread().getId()));
            List list = obj instanceof List ? (List) obj : null;
            if (this.e) {
                uljVar.e(list, this.f50326b);
            } else {
                uljVar.d((List<HiHealthData>) list, this.f50326b);
            }
        }
    }

    static class d implements IBaseResponseCallback {
        private final WeakReference<Handler> d;

        d(Handler handler) {
            this.d = new WeakReference<>(handler);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            HiHealthData hiHealthData;
            Handler handler = this.d.get();
            if (handler != null && (obj instanceof List)) {
                List list = (List) obj;
                if (list.size() == 0) {
                    return;
                }
                int type = 0;
                if (list.size() == 2) {
                    hiHealthData = (HiHealthData) list.get(0);
                    HiHealthData hiHealthData2 = (HiHealthData) list.get(1);
                    if (hiHealthData.getStartTime() <= hiHealthData2.getStartTime()) {
                        hiHealthData = hiHealthData2;
                    }
                    type = 12109;
                } else if (list.size() == 1) {
                    hiHealthData = (HiHealthData) list.get(0);
                    type = hiHealthData.getType();
                    if (type != 2108) {
                        type = 10001;
                    }
                } else {
                    LogUtil.a("BloodSugarLineChartStorageHelper", "not any bloodsugar data");
                    hiHealthData = null;
                }
                Message messageObtain = Message.obtain();
                messageObtain.arg1 = type;
                messageObtain.obj = hiHealthData;
                handler.sendMessage(messageObtain);
            }
        }
    }
}
