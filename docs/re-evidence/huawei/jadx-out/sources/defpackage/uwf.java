package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import health.compact.a.HiCommonUtil;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes19.dex */
public class uwf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<uwh> f50643a;

    private uwf() {
        this.f50643a = new ArrayList<>(31);
    }

    public static uwf d() {
        return b.f50648c;
    }

    public void b() {
        ArrayList<uwh> arrayList = this.f50643a;
        if (arrayList != null) {
            arrayList.clear();
        } else {
            this.f50643a = new ArrayList<>(31);
        }
    }

    public void b(final long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        nkb.d().e(j, j2, new IBaseResponseCallback() { // from class: uwd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                uwf.a(iBaseResponseCallback, j, i, obj);
            }
        });
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, long j, int i, Object obj) {
        if (!(obj instanceof List)) {
            iBaseResponseCallback.a(100001, null);
            return;
        }
        List<HiHealthData> list = (List) obj;
        LogUtil.a("UIHLH_HealthDataInteractor", "getSportRecords hasData, total count = ", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(16);
        for (HiHealthData hiHealthData : list) {
            umg umgVar = new umg();
            try {
                umgVar = (umg) nlu.b(hiHealthData.getMetaData(), umg.class);
            } catch (JsonSyntaxException unused) {
                LogUtil.d("UIHLH_HealthDataInteractor", "getSportRecord JsonUtil fromJson fail");
            }
            umgVar.setStartTime(hiHealthData.getStartTime());
            umgVar.setEndTime(hiHealthData.getEndTime());
            umgVar.b(j);
            arrayList.add(umgVar);
        }
        iBaseResponseCallback.a(0, arrayList);
    }

    private void d(Object obj, CommonUiBaseResponse commonUiBaseResponse) {
        synchronized (this) {
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleWeightData enter");
            List<HiHealthData> list = (List) obj;
            ArrayList arrayList = new ArrayList(31);
            if (HiCommonUtil.b(list)) {
                com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleWeightData enter datas is null");
                if (commonUiBaseResponse != null) {
                    commonUiBaseResponse.onResponse(0, arrayList);
                }
                return;
            }
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleWeightData datas.size = ", Integer.valueOf(list.size()));
            ArrayList<uwh> arrayList2 = new ArrayList<>(31);
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getDouble("bodyWeight") > 0.0d) {
                    arrayList2.add(uwl.d(hiHealthData));
                } else {
                    com.huawei.hwlogsmodel.LogUtil.j("UIHLH_HealthDataInteractor", "illegal weight, timeStamp ", Long.valueOf(hiHealthData.getStartTime()));
                }
            }
            c(arrayList2, arrayList);
            if (commonUiBaseResponse != null) {
                commonUiBaseResponse.onResponse(0, arrayList);
            }
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleWeightData end");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list, CommonUiBaseResponse commonUiBaseResponse) {
        com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleBloodsugarData enter");
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<ArrayList<uwh>> arrayList = new ArrayList<>(31);
        ArrayList<uwh> arrayList2 = new ArrayList<>(31);
        if (list != null && list.size() > 0) {
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleBloodSugarData data.size = ", Integer.valueOf(list.size()));
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getEndTime() <= jCurrentTimeMillis) {
                    arrayList2.add(uwl.c(hiHealthData));
                }
            }
            arrayList = b(arrayList2);
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleBloodSugarData data.size1 = ", Integer.valueOf(arrayList.size()));
        } else {
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "datas null or empty");
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(0, arrayList);
        }
        com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleBloodsugarData time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleWeightData end");
    }

    private void d(List<HiHealthData> list, CommonUiBaseResponse commonUiBaseResponse) {
        com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleTemperatureData enter");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(31);
        if (list != null && list.size() > 0) {
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleTemperatureData data.size = ", Integer.valueOf(list.size()));
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getEndTime() <= jCurrentTimeMillis) {
                    double value = hiHealthData.getValue();
                    long startTime = hiHealthData.getStartTime();
                    int i = hiHealthData.getInt("trackdata_deviceType");
                    int type = hiHealthData.getType();
                    uwh uwhVar = new uwh();
                    uwhVar.c(value);
                    uwhVar.e(startTime);
                    uwhVar.a(i);
                    uwhVar.j(type);
                    if (Math.abs(uwhVar.m()) >= 0.0d) {
                        arrayList.add(uwhVar);
                    } else {
                        com.huawei.hwlogsmodel.LogUtil.j("UIHLH_HealthDataInteractor", "invalid temperature value");
                    }
                }
            }
        } else {
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleTemperatureData data is null or empty");
        }
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(0, arrayList);
        }
        com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handleTemperatureData cost of time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public void a(Context context, long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        com.huawei.hwlogsmodel.LogUtil.d("UIHLH_HealthDataInteractor", "deleteWeightData ");
        nkb.d().a(context, j, j2, iBaseResponseCallback);
    }

    public void b(Context context, List<HiTimeInterval> list, IBaseResponseCallback iBaseResponseCallback) {
        com.huawei.hwlogsmodel.LogUtil.d("UIHLH_HealthDataInteractor", "deleteWeightData ");
        nkb.d().c(context, list, iBaseResponseCallback);
    }

    public void d(long j, IBaseResponseCallback iBaseResponseCallback) {
        com.huawei.hwlogsmodel.LogUtil.d("UIHLH_HealthDataInteractor", "deleteBloodPressureData ");
        ArrayList arrayList = new ArrayList();
        HiTimeInterval hiTimeInterval = new HiTimeInterval();
        hiTimeInterval.setStartTime(j);
        hiTimeInterval.setEndTime(j);
        arrayList.add(hiTimeInterval);
        a(arrayList, iBaseResponseCallback);
    }

    public void a(List<HiTimeInterval> list, IBaseResponseCallback iBaseResponseCallback) {
        com.huawei.hwlogsmodel.LogUtil.d("UIHLH_HealthDataInteractor", "deleteBloodPressureData ");
        nkb.d().b(list, iBaseResponseCallback);
    }

    public void e(Context context, int i, long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        com.huawei.hwlogsmodel.LogUtil.d("UIHLH_HealthDataInteractor", "deleteBloodSuagrData ");
        nkb.d().d(context, i, j, j2, iBaseResponseCallback);
    }

    public void b(final CommonUiBaseResponse commonUiBaseResponse) {
        if (commonUiBaseResponse == null) {
            com.huawei.hwlogsmodel.LogUtil.j("UIHLH_HealthDataInteractor", "readData callback is null");
            return;
        }
        HiAggregateOption hiAggregateOptionC = c();
        hiAggregateOptionC.setCount(1);
        hiAggregateOptionC.setTimeRange(0L, System.currentTimeMillis());
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionC, new HiAggregateListener() { // from class: uwf.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (njy.e(list)) {
                    com.huawei.hwlogsmodel.LogUtil.j("UIHLH_HealthDataInteractor", "datas is empty");
                    commonUiBaseResponse.onResponse(100001, new ArrayList());
                } else {
                    com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "readData data size = ", Integer.valueOf(list.size()));
                    commonUiBaseResponse.onResponse(0, list);
                }
            }
        });
    }

    private static HiAggregateOption c() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{2006, 2007});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    public void a(final CommonUiBaseResponse commonUiBaseResponse) {
        vbk vbkVarC = vbk.c();
        int[] iArr = {vbkVarC.a(), 2104, vbkVarC.q()};
        if (Utils.o()) {
            iArr = new int[]{vbkVarC.l()};
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setCount(1);
        vbkVarC.c(iArr, hiDataReadOption, new IBaseResponseCallback() { // from class: uwi
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.a(commonUiBaseResponse, i, obj);
            }
        });
    }

    /* synthetic */ void a(CommonUiBaseResponse commonUiBaseResponse, int i, Object obj) {
        d(obj instanceof List ? (List) obj : null, commonUiBaseResponse);
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        nkb.d().e(iBaseResponseCallback);
    }

    public void e(Context context, long[] jArr, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        if (jArr == null || jArr.length <= 1) {
            return;
        }
        nkf.a().e(context, jArr[0], jArr[1], i, new IBaseResponseCallback() { // from class: uwg
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f50651c.c(commonUiBaseResponse, i2, obj);
            }
        });
    }

    /* synthetic */ void c(CommonUiBaseResponse commonUiBaseResponse, int i, Object obj) {
        d(obj, commonUiBaseResponse);
    }

    public void d(Context context, long j, long j2, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        nkb.d().b(context, j, j2, i, new IBaseResponseCallback() { // from class: uwf.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "readBloodSugarData time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                uwf.this.a((List<HiHealthData>) obj, commonUiBaseResponse);
            }
        });
    }

    public void b(Context context, long j, long j2, final CommonUiBaseResponse commonUiBaseResponse) {
        nkb.d().e(context, j, j2, new IBaseResponseCallback() { // from class: uwf.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                commonUiBaseResponse.onResponse(0, obj);
            }
        });
    }

    public void a(Context context, long j, long j2, CommonUiBaseResponse commonUiBaseResponse) {
        nkb.d().c(context, j, j2, new c(this, System.currentTimeMillis(), commonUiBaseResponse));
    }

    public void c(Context context, long j, long j2, CommonUiBaseResponse commonUiBaseResponse) {
        nkb.d().d(context, j, j2, new c(this, System.currentTimeMillis(), commonUiBaseResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, CommonUiBaseResponse commonUiBaseResponse) {
        com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "handlerLastTimeHeartRateData enter");
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(0, obj);
        }
    }

    public void a(long j, double[] dArr, List<String> list, String str, IBaseResponseCallback iBaseResponseCallback) {
        long[] jArr = {j, j};
        if (list == null) {
            list = new ArrayList<>(0);
        }
        List<String> list2 = list;
        com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "customActions: ", list2.toString());
        nkb.d().d(jArr, dArr, list2, str, iBaseResponseCallback);
    }

    public void c(Context context, long[] jArr, int i, double d, IBaseResponseCallback iBaseResponseCallback) {
        nkb.d().a(context, jArr, new double[]{i, d, 0.0d}, iBaseResponseCallback);
    }

    public void c(ArrayList<uwh> arrayList, List<ArrayList<uwh>> list) {
        list.clear();
        a(arrayList, list);
        Iterator<ArrayList<uwh>> it = list.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
        int i = 0;
        while (i < list.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < list.size(); i3++) {
                if (list.get(i).get(0).g() < list.get(i3).get(0).g()) {
                    ArrayList<uwh> arrayList2 = list.get(i);
                    list.set(i, list.get(i3));
                    list.set(i3, arrayList2);
                }
            }
            i = i2;
        }
    }

    private List<ArrayList<uwh>> b(ArrayList<uwh> arrayList) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: uwj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Long) obj2).compareTo((Long) obj);
            }
        });
        for (uwh uwhVar : arrayList) {
            try {
                long time = simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(uwhVar.g()))).getTime();
                ArrayList arrayList2 = (ArrayList) treeMap.get(Long.valueOf(time));
                if (arrayList2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    treeMap.put(Long.valueOf(time), arrayList3);
                    arrayList3.add(uwhVar);
                } else {
                    a(arrayList2, uwhVar);
                }
            } catch (ParseException e) {
                com.huawei.hwlogsmodel.LogUtil.e("UIHLH_HealthDataInteractor", e);
            }
        }
        return new ArrayList(treeMap.values());
    }

    private void a(List<uwh> list, uwh uwhVar) {
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).m() > uwhVar.m()) {
                size = i;
                break;
            }
        }
        list.add(size, uwhVar);
    }

    private void a(ArrayList<uwh> arrayList, List<ArrayList<uwh>> list) {
        ArrayList arrayList2 = new ArrayList(31);
        for (uwh uwhVar : arrayList) {
            if (arrayList2.contains(a(uwhVar.g()))) {
                list.get(arrayList2.indexOf(a(uwhVar.g()))).add(uwhVar);
            } else {
                ArrayList<uwh> arrayList3 = new ArrayList<>(31);
                arrayList3.add(uwhVar);
                arrayList2.add(a(uwhVar.g()));
                list.add(arrayList3);
            }
        }
    }

    private void d(ArrayList<uwh> arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size - 1) {
            int i2 = i + 1;
            int size2 = arrayList.size();
            for (int i3 = i2; i3 < size2; i3++) {
                if (arrayList.get(i).g() < arrayList.get(i3).g()) {
                    uwh uwhVar = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i3));
                    arrayList.set(i3, uwhVar);
                }
            }
            i = i2;
        }
    }

    public String a(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMd")).format(date);
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final uwf f50648c = new uwf();
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CommonUiBaseResponse f50649b;
        private long d;
        private WeakReference<uwf> e;

        protected c(uwf uwfVar, long j, CommonUiBaseResponse commonUiBaseResponse) {
            this.d = j;
            this.f50649b = commonUiBaseResponse;
            this.e = new WeakReference<>(uwfVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            com.huawei.hwlogsmodel.LogUtil.a("UIHLH_HealthDataInteractor", "readHeartRateData time = ", Long.valueOf(System.currentTimeMillis() - this.d));
            uwf uwfVar = this.e.get();
            if (uwfVar != null) {
                uwfVar.a(obj, this.f50649b);
            }
        }
    }
}
