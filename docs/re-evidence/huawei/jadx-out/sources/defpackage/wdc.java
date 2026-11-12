package defpackage;

import android.util.SparseArray;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDeleteListenerEx;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes19.dex */
public class wdc extends BaseOperate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<HiHealthData> f51892c;
    private List<HiHealthData> d;
    private List<HiHealthData> e;

    public wdc() {
        this.pageType = 106;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readCategoryGroupData(vzo vzoVar, DataSourceCallback<Map<Integer, List<whz>>> dataSourceCallback) {
        if (vzoVar == null) {
            LogUtil.j("BodyTemperature", "readCategoryGroupData optionBean is null");
            return;
        }
        int iL = vzoVar.l();
        if (iL == 1 || iL == 2 || iL == 3) {
            f(vzoVar, dataSourceCallback);
        } else {
            i(vzoVar, dataSourceCallback);
        }
    }

    private void i(final vzo vzoVar, final DataSourceCallback<Map<Integer, List<whz>>> dataSourceCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wdj
            @Override // java.lang.Runnable
            public final void run() {
                this.f51900b.d(vzoVar, dataSourceCallback);
            }
        });
    }

    /* synthetic */ void d(vzo vzoVar, final DataSourceCallback dataSourceCallback) {
        final HashMap map = new HashMap();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        h(vzoVar, new DataSourceCallback() { // from class: wdh
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.e.d(dataSourceCallback, map, countDownLatch, i, (SparseArray) obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            LogUtil.e("BodyTemperature", e.toString());
        }
        o(vzoVar, new DataSourceCallback() { // from class: wdt
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51915c.c(dataSourceCallback, map, i, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void d(final DataSourceCallback dataSourceCallback, final Map map, CountDownLatch countDownLatch, final int i, SparseArray sparseArray) {
        if (i != 0) {
            this.mHandler.post(new Runnable() { // from class: wdw
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, map);
                }
            });
            return;
        }
        if (sparseArray != null) {
            List<HiHealthData> list = (List) sparseArray.get(DicDataTypeUtil.DataType.MAX_BODY_TEMPERATURE.value());
            List<HiHealthData> list2 = (List) sparseArray.get(DicDataTypeUtil.DataType.MIN_BODY_TEMPERATURE.value());
            List<HiHealthData> list3 = (List) sparseArray.get(DicDataTypeUtil.DataType.MAX_SUSPECTED_HIGH_TEMPERATURE.value());
            List<HiHealthData> list4 = (List) sparseArray.get(DicDataTypeUtil.DataType.MIN_SUSPECTED_HIGH_TEMPERATURE.value());
            ReleaseLogUtil.d("R_BodyTemperature", "readCategoryGroupDataNoSource max=", Integer.valueOf(list == null ? 0 : list.size()), ", min=", Integer.valueOf(list2 == null ? 0 : list2.size()), ", maxSus=", Integer.valueOf(list3 == null ? 0 : list3.size()), ", minSus=", Integer.valueOf(list4 != null ? list4.size() : 0));
            this.f51892c = mergeMaxMinList(list, list2, list3, list4);
            this.e = mergeMaxMinList((List) sparseArray.get(DicDataTypeUtil.DataType.MAX_SKIN_TEMPERATURE.value()), (List) sparseArray.get(DicDataTypeUtil.DataType.MIN_SKIN_TEMPERATURE.value()));
        }
        countDownLatch.countDown();
    }

    /* synthetic */ void c(final DataSourceCallback dataSourceCallback, final Map map, final int i, SparseArray sparseArray) {
        if (i != 0) {
            this.mHandler.post(new Runnable() { // from class: wdu
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, map);
                }
            });
        }
        if (sparseArray != null && sparseArray.size() != 0) {
            this.d = c((List<HiHealthData>) sparseArray.get(0), (List<HiHealthData>) sparseArray.get(1));
        }
        map.put(1, hiHealthDataProcess(a(this.d, this.f51892c)));
        map.put(2, hiHealthDataProcess(this.e));
        this.mHandler.post(new Runnable() { // from class: wdx
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(i, map);
            }
        });
    }

    private List<HiHealthData> c(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list) && !njy.e(list2) && list.size() == list2.size()) {
            for (int i = 0; i < list.size(); i++) {
                HiHealthData hiHealthData = new HiHealthData();
                HiHealthData hiHealthData2 = list.get(i);
                HiHealthData hiHealthData3 = list2.get(i);
                hiHealthData.setStartTime(wgr.d(hiHealthData2.getStartTime()));
                hiHealthData.setEndTime(wgr.b(hiHealthData2.getEndTime()));
                hiHealthData.setModifiedTime(hiHealthData2.getModifiedTime());
                hiHealthData.putDouble("maxTemperature", hiHealthData2.getDouble("maxOldBodyTemperature"));
                hiHealthData.putDouble("minTemperature", hiHealthData3.getDouble("minOldBodyTemperature"));
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private List<HiHealthData> a(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return list2;
        }
        if (njy.e(list2)) {
            return list;
        }
        arrayList.addAll(list);
        arrayList.addAll(list2);
        sortHiHealthDataToDesc(arrayList);
        Iterator<HiHealthData> it = arrayList.iterator();
        while (true) {
            HiHealthData next = null;
            while (it.hasNext()) {
                if (next == null) {
                    next = it.next();
                } else {
                    HiHealthData next2 = it.next();
                    if (next.getStartTime() == next2.getStartTime()) {
                        next.putDouble("maxTemperature", Math.max(next.getDouble("maxTemperature"), next2.getDouble("maxTemperature")));
                        next.putDouble("minTemperature", Math.min(next.getDouble("minTemperature"), next2.getDouble("minTemperature")));
                        it.remove();
                    } else {
                        next = next2;
                    }
                }
            }
            return arrayList;
        }
    }

    private void h(vzo vzoVar, DataSourceCallback<SparseArray<List<HiHealthData>>> dataSourceCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiDataReadProOption.Builder().e(wgu.b(vzoVar, new int[]{DicDataTypeUtil.DataType.MAX_BODY_TEMPERATURE.value(), DicDataTypeUtil.DataType.MIN_BODY_TEMPERATURE.value(), DicDataTypeUtil.DataType.MAX_SKIN_TEMPERATURE.value(), DicDataTypeUtil.DataType.MIN_SKIN_TEMPERATURE.value(), DicDataTypeUtil.DataType.MAX_SUSPECTED_HIGH_TEMPERATURE.value(), DicDataTypeUtil.DataType.MIN_SUSPECTED_HIGH_TEMPERATURE.value()})).b());
        readHiHealthDataEx(arrayList, dataSourceCallback);
    }

    private void o(vzo vzoVar, DataSourceCallback<SparseArray<List<HiHealthData>>> dataSourceCallback) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"maxOldBodyTemperature", "minOldBodyTemperature"};
        int[] iArr = {4, 5};
        for (int i = 0; i < 2; i++) {
            arrayList.add(new HiDataAggregateProOption.Builder().c(wgu.a(vzoVar, new int[]{2104}, new String[]{strArr[i]}, iArr[i])).e());
        }
        aggregateHiHealthDataProEx(arrayList, dataSourceCallback);
    }

    private void f(final vzo vzoVar, final DataSourceCallback<Map<Integer, List<whz>>> dataSourceCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wdv
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(vzoVar, dataSourceCallback);
            }
        });
    }

    /* synthetic */ void c(vzo vzoVar, final DataSourceCallback dataSourceCallback) {
        final HashMap map = new HashMap();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        g(vzoVar, new DataSourceCallback() { // from class: web
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                wdc.b(map, countDownLatch, i, (List) obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            LogUtil.e("BodyTemperature", e.toString());
        }
        l(vzoVar, new DataSourceCallback() { // from class: wdz
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51924b.e(map, dataSourceCallback, i, (List) obj);
            }
        });
    }

    static /* synthetic */ void b(Map map, CountDownLatch countDownLatch, int i, List list) {
        if (i == 0) {
            map.put(1, list);
        }
        countDownLatch.countDown();
    }

    /* synthetic */ void e(final Map map, final DataSourceCallback dataSourceCallback, int i, List list) {
        if (i == 0) {
            map.put(2, list);
        }
        this.mHandler.post(new Runnable() { // from class: wdp
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(0, map);
            }
        });
    }

    private void g(vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        ArrayList arrayList = new ArrayList();
        String[][] strArr = {new String[]{"maxOldBodyTemperature", "maxNewBodyTemperature", "maxSuspectBodyTemperature"}, new String[]{"minOldBodyTemperature", "minNewBodyTemperature", "minSuspectBodyTemperature"}};
        int[] iArr = {4, 5};
        for (int i = 0; i < 2; i++) {
            arrayList.add(new HiDataAggregateProOption.Builder().c(wgu.a(vzoVar, new int[]{2104, DicDataTypeUtil.DataType.BODY_TEMPERATURE.value(), DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value()}, strArr[i], iArr[i])).e(vzoVar.f()).e());
        }
        LogUtil.a("BodyTemperature", "readBodyGroupDataBySource start");
        aggregateHiHealthDataProEx(arrayList, new DataSourceCallback() { // from class: wei
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.f51940c.c(dataSourceCallback, i2, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void c(DataSourceCallback dataSourceCallback, int i, SparseArray sparseArray) {
        LogUtil.a("BodyTemperature", "readBodyGroupDataBySource end resultCode = ", Integer.valueOf(i));
        if (i != 0 || sparseArray == null || sparseArray.size() == 0) {
            dataSourceCallback.onResponse(i, new ArrayList());
        } else {
            dataSourceCallback.onResponse(i, hiHealthDataProcess(b((List<HiHealthData>) sparseArray.get(0), (List<HiHealthData>) sparseArray.get(1))));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0120  */
    /* JADX WARN: Code duplicated, block: B:43:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x012c  */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00b5, please report this as an issue */
    private List<HiHealthData> b(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList;
        double dMin;
        ArrayList arrayList2 = new ArrayList();
        if (!njy.e(list) && !njy.e(list2) && list.size() == list2.size()) {
            int i = 0;
            while (i < list.size()) {
                HiHealthData hiHealthData = new HiHealthData();
                HiHealthData hiHealthData2 = list.get(i);
                HiHealthData hiHealthData3 = list2.get(i);
                hiHealthData.setStartTime(wgr.d(hiHealthData2.getStartTime()));
                hiHealthData.setEndTime(wgr.b(hiHealthData2.getEndTime()));
                hiHealthData.setModifiedTime(hiHealthData2.getModifiedTime());
                double d = hiHealthData2.getDouble("maxOldBodyTemperature");
                double d2 = hiHealthData2.getDouble("maxNewBodyTemperature");
                double d3 = hiHealthData2.getDouble("maxSuspectBodyTemperature");
                double d4 = hiHealthData3.getDouble("minOldBodyTemperature");
                double d5 = hiHealthData3.getDouble("minNewBodyTemperature");
                double dMin2 = hiHealthData3.getDouble("minSuspectBodyTemperature");
                int i2 = i;
                if (d2 != 0.0d || d != 0.0d || d5 != 0.0d || d4 != 0.0d) {
                    arrayList = arrayList2;
                    String str = "mergeBodyMaxMin max(" + d + "," + d2 + "," + d3 + "); min(";
                    hiHealthData.putDouble("maxTemperature", Math.max(d3, Math.max(d2, d)));
                    if (d5 <= 0.0d && d4 > 0.0d) {
                        dMin = Math.min(d5, d4);
                    } else if (d4 > 0.0d) {
                        dMin = d4;
                    } else {
                        dMin = d5;
                    }
                    LogUtil.d("BodyTemperature", str, Double.valueOf(d4), ",", Double.valueOf(d5), ",", Double.valueOf(dMin2), Constants.RIGHT_BRACKET_ONLY);
                    if (dMin2 > 0.0d) {
                        if (dMin > 0.0d) {
                            dMin2 = Math.min(dMin, dMin2);
                        }
                        hiHealthData.putDouble("minTemperature", dMin2);
                    } else if (dMin <= 0.0d) {
                        arrayList2 = arrayList;
                    } else {
                        hiHealthData.putDouble("minTemperature", dMin);
                    }
                    arrayList2 = arrayList;
                    arrayList2.add(hiHealthData);
                } else if (d3 != 0.0d && dMin2 != 0.0d) {
                    if (d3 == dMin2) {
                        LogUtil.d("BodyTemperature", "mergeBodyMaxMin no exact temp, singleSuspect=", Double.valueOf(d3));
                        hiHealthData.putDouble("singleSuspectBodyTemperature", d3);
                        arrayList2.add(hiHealthData);
                    } else {
                        arrayList = arrayList2;
                        String str2 = "mergeBodyMaxMin max(" + d + "," + d2 + "," + d3 + "); min(";
                        hiHealthData.putDouble("maxTemperature", Math.max(d3, Math.max(d2, d)));
                        if (d5 <= 0.0d) {
                            if (d4 > 0.0d) {
                                dMin = d4;
                            } else {
                                dMin = d5;
                            }
                        } else if (d4 > 0.0d) {
                            dMin = d4;
                        } else {
                            dMin = d5;
                        }
                        LogUtil.d("BodyTemperature", str2, Double.valueOf(d4), ",", Double.valueOf(d5), ",", Double.valueOf(dMin2), Constants.RIGHT_BRACKET_ONLY);
                        if (dMin2 > 0.0d) {
                            if (dMin > 0.0d) {
                                dMin2 = Math.min(dMin, dMin2);
                            }
                            hiHealthData.putDouble("minTemperature", dMin2);
                        } else if (dMin <= 0.0d) {
                            arrayList2 = arrayList;
                        } else {
                            hiHealthData.putDouble("minTemperature", dMin);
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(hiHealthData);
                    }
                }
                i = i2 + 1;
            }
        }
        return arrayList2;
    }

    private void l(vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        ArrayList arrayList = new ArrayList();
        String[][] strArr = {new String[]{"maxSkinTemperature"}, new String[]{"minSkinTemperature"}};
        int[] iArr = {4, 5};
        for (int i = 0; i < 2; i++) {
            arrayList.add(new HiDataAggregateProOption.Builder().c(wgu.a(vzoVar, new int[]{DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()}, strArr[i], iArr[i])).e(vzoVar.f()).e());
        }
        LogUtil.a("BodyTemperature", "readSkinGroupDataBySource start");
        aggregateHiHealthDataProEx(arrayList, new DataSourceCallback() { // from class: wdy
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.f51922a.a(dataSourceCallback, i2, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void a(DataSourceCallback dataSourceCallback, int i, SparseArray sparseArray) {
        LogUtil.a("BodyTemperature", "readSkinGroupDataBySource end resultCode = ", Integer.valueOf(i));
        if (i != 0 || sparseArray == null || sparseArray.size() == 0) {
            dataSourceCallback.onResponse(i, new ArrayList());
        } else {
            dataSourceCallback.onResponse(i, hiHealthDataProcess(d((List<HiHealthData>) sparseArray.get(0), (List<HiHealthData>) sparseArray.get(1))));
        }
    }

    private List<HiHealthData> d(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list2 != null && list.size() == list2.size()) {
            for (int i = 0; i < list.size(); i++) {
                HiHealthData hiHealthData = new HiHealthData();
                HiHealthData hiHealthData2 = list.get(i);
                HiHealthData hiHealthData3 = list2.get(i);
                hiHealthData.setStartTime(wgr.d(hiHealthData2.getStartTime()));
                hiHealthData.setEndTime(wgr.b(hiHealthData2.getEndTime()));
                hiHealthData.setModifiedTime(hiHealthData2.getModifiedTime());
                hiHealthData.putDouble("maxTemperature", hiHealthData2.getDouble("maxSkinTemperature"));
                hiHealthData.putDouble("minTemperature", hiHealthData3.getDouble("minSkinTemperature"));
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthNoSource(DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVarB = b();
        vzoVarB.a(0);
        ThreadPoolManager.c().execute(j(vzoVarB, dataSourceCallback));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByDeviceSource(String str, int i, String str2, DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVarB = b();
        vzoVarB.a(i);
        vzoVarB.e(str);
        vzoVarB.c(str2);
        ThreadPoolManager.c().execute(a(vzoVarB, dataSourceCallback));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByAppSource(String str, DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVarB = b();
        vzoVarB.a(1);
        vzoVarB.c(str);
        ThreadPoolManager.c().execute(a(vzoVarB, dataSourceCallback));
    }

    private vzo b() {
        vzo vzoVar = new vzo();
        vzoVar.a(0L);
        vzoVar.e(System.currentTimeMillis());
        vzoVar.e(new int[]{2104});
        vzoVar.d(new String[]{"maxTemperature"});
        vzoVar.d(4);
        return vzoVar;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDayDataNoSource */
    public void m1745xae5c7554(vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.BODY_TEMPERATURE.value(), 2104, DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value()});
        vzoVar.b(true);
        readForOneDayDatas(vzoVar, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDayDataBySource */
    public void m1744xa7339313(vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.BODY_TEMPERATURE.value(), DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value(), 2104});
        vzoVar.b(true);
        readForOneDayDatas(vzoVar, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readInOneDayByDeviceSource(long j, String str, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzo vzoVarC = c(j);
        vzoVarC.a(2);
        vzoVarC.e(str);
        readForOneDayDatas(vzoVarC, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readInOneDayByAppSource(long j, String str, String str2, int i, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzo vzoVarC = c(j);
        vzoVarC.a(i);
        vzoVarC.e(str);
        vzoVarC.c(str2);
        readForOneDayDatas(vzoVarC, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public int[] getDeleteDataTypes(vzo vzoVar) {
        if (vzoVar.b("categoryType") == 2) {
            return new int[]{DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()};
        }
        return new int[]{DicDataTypeUtil.DataType.BODY_TEMPERATURE.value(), 2104};
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void deleteDatas(List<PrivacyDataModel> list, vzo vzoVar, final DataSourceCallback<Boolean> dataSourceCallback) {
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        for (PrivacyDataModel privacyDataModel : list) {
            if (privacyDataModel != null) {
                LogUtil.a("BodyTemperature", "deleteDatas model=", privacyDataModel.toString());
                if (privacyDataModel.getType() == 0) {
                    arrayList2.add(new HiTimeInterval(privacyDataModel.getStartTime(), privacyDataModel.getEndTime()));
                } else if (privacyDataModel.getType() == DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value() || privacyDataModel.getType() == DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE_VALUE.value()) {
                    arrayList2.add(new HiTimeInterval(privacyDataModel.getStartTime(), privacyDataModel.getEndTime()));
                }
                arrayList.add(new HiTimeInterval(privacyDataModel.getStartTime(), privacyDataModel.getEndTime()));
            }
        }
        ArrayList arrayList3 = new ArrayList(2);
        if (vzoVar.b("categoryType") == 1) {
            b(arrayList3, vzoVar, new int[]{DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value(), DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE_VALUE.value()}, arrayList2);
        }
        b(arrayList3, vzoVar, getDeleteDataTypes(vzoVar), arrayList);
        if (arrayList3.isEmpty()) {
            return;
        }
        LogUtil.a("BodyTemperature", "deleteData start");
        HiHealthManager.d(BaseApplication.getContext()).deleteHiHealthDataProEx(arrayList3, new HiDeleteListenerEx() { // from class: wdi
            @Override // com.huawei.hihealth.data.listener.HiDeleteListenerEx
            public final void onResult(Map map) {
                this.f51899b.e(dataSourceCallback, map);
            }
        });
    }

    /* synthetic */ void e(final DataSourceCallback dataSourceCallback, Map map) {
        if (map == null || map.isEmpty()) {
            LogUtil.a("BodyTemperature", "deleteData end errorCode = 0");
            this.mHandler.post(new Runnable() { // from class: wdl
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(0, true);
                }
            });
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            LogUtil.a("BodyTemperature", "deleteData end errorCode = ", entry.getKey(), ", object = ", ((List) entry.getValue()).toString());
        }
        this.mHandler.post(new Runnable() { // from class: wdn
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(1, false);
            }
        });
    }

    private void b(List<HiDataDeleteProOption> list, vzo vzoVar, int[] iArr, List<HiTimeInterval> list2) {
        if (list2.isEmpty()) {
            return;
        }
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTypes(iArr);
        hiDataDeleteOption.setTimes(list2);
        list.add(HiDataDeleteProOption.builder().c(hiDataDeleteOption).b(Integer.valueOf(vzoVar.a())).d(0).a(vzoVar.j()).b(vzoVar.f()).c());
    }

    private vzo c(long j) {
        vzo vzoVar = new vzo();
        vzoVar.a(wgr.d(j));
        vzoVar.e(wgr.b(j));
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.BODY_TEMPERATURE.value(), 2104, DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value()});
        return vzoVar;
    }

    private Runnable j(final vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        return new Runnable() { // from class: wdq
            @Override // java.lang.Runnable
            public final void run() {
                this.f51909a.e(vzoVar, dataSourceCallback);
            }
        };
    }

    /* synthetic */ void e(final vzo vzoVar, final DataSourceCallback dataSourceCallback) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        aggregateProMaxAndMin(vzoVar, new DataSourceCallback() { // from class: wed
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.e.b(vzoVar, countDownLatch, dataSourceCallback, i, (List) obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.e("BodyTemperature", "CountDownLatch exception");
        }
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.MAX_BODY_TEMPERATURE.value(), DicDataTypeUtil.DataType.MIN_BODY_TEMPERATURE.value()});
        readHiHealthDataPro(vzoVar, new DataSourceCallback() { // from class: wec
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51930b.e(dataSourceCallback, vzoVar, i, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void b(vzo vzoVar, CountDownLatch countDownLatch, DataSourceCallback dataSourceCallback, int i, List list) {
        d(i, vzoVar, (List<HiHealthData>) list, countDownLatch, (DataSourceCallback<List<whz>>) dataSourceCallback);
    }

    /* synthetic */ void e(final DataSourceCallback dataSourceCallback, vzo vzoVar, final int i, SparseArray sparseArray) {
        if (i != 0) {
            this.mHandler.post(new Runnable() { // from class: weh
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        if (sparseArray != null && sparseArray.get(vzoVar.o()[0]) != null) {
            this.mMaxDataList.addAll((Collection) sparseArray.get(vzoVar.o()[0]));
        }
        if (sparseArray != null && sparseArray.get(vzoVar.o()[1]) != null) {
            this.mMinDataList.addAll((Collection) sparseArray.get(vzoVar.o()[1]));
        }
        ReleaseLogUtil.d("R_BodyTemperature", "queryMaxAndMinDataNoSource max", Integer.valueOf(this.mMaxDataList == null ? 0 : this.mMaxDataList.size()), ", min", Integer.valueOf(this.mMinDataList != null ? this.mMinDataList.size() : 0));
        final List<whz> listHiHealthDataProcess = hiHealthDataProcess(mergeMaxMinList(b(this.mMaxDataList, "deduplicate_max"), b(this.mMinDataList, "deduplicate_min")));
        this.mHandler.post(new Runnable() { // from class: wdg
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(i, listHiHealthDataProcess);
            }
        });
    }

    private Runnable a(final vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        return new Runnable() { // from class: wea
            @Override // java.lang.Runnable
            public final void run() {
                this.f51927b.b(vzoVar, dataSourceCallback);
            }
        };
    }

    /* synthetic */ void b(final vzo vzoVar, final DataSourceCallback dataSourceCallback) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        aggregateProMaxAndMin(vzoVar, new DataSourceCallback() { // from class: wdm
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51904a.d(vzoVar, countDownLatch, dataSourceCallback, i, (List) obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.e("BodyTemperature", "CountDownLatch exception");
        }
        vzoVar.d(new String[]{"maxTemperature"});
        vzoVar.d(4);
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.BODY_TEMPERATURE.value()});
        final CountDownLatch countDownLatch2 = new CountDownLatch(1);
        aggregateProMaxAndMin(vzoVar, new DataSourceCallback() { // from class: wdk
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.e.e(vzoVar, countDownLatch2, dataSourceCallback, i, (List) obj);
            }
        });
        try {
            countDownLatch2.await();
        } catch (InterruptedException unused2) {
            LogUtil.e("BodyTemperature", "CountDownLatch exception");
        }
        ReleaseLogUtil.d("R_BodyTemperature", "queryMaxAndMinDataForSource max", Integer.valueOf(this.mMaxDataList == null ? 0 : this.mMaxDataList.size()), ", min", Integer.valueOf(this.mMinDataList != null ? this.mMinDataList.size() : 0));
        final List<whz> listHiHealthDataProcess = hiHealthDataProcess(mergeMaxMinList(b(this.mMaxDataList, "deduplicate_max"), b(this.mMinDataList, "deduplicate_min")));
        this.mHandler.post(new Runnable() { // from class: wdo
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(0, listHiHealthDataProcess);
            }
        });
    }

    /* synthetic */ void d(vzo vzoVar, CountDownLatch countDownLatch, DataSourceCallback dataSourceCallback, int i, List list) {
        d(i, vzoVar, (List<HiHealthData>) list, countDownLatch, (DataSourceCallback<List<whz>>) dataSourceCallback);
    }

    /* synthetic */ void e(vzo vzoVar, CountDownLatch countDownLatch, DataSourceCallback dataSourceCallback, int i, List list) {
        d(i, vzoVar, (List<HiHealthData>) list, countDownLatch, (DataSourceCallback<List<whz>>) dataSourceCallback);
    }

    private void d(final int i, final vzo vzoVar, List<HiHealthData> list, final CountDownLatch countDownLatch, final DataSourceCallback<List<whz>> dataSourceCallback) {
        if (i != 0) {
            this.mHandler.post(new Runnable() { // from class: wdr
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        if (list != null) {
            transKeyToValue(list, this.mMaxDataList, vzoVar);
        }
        vzoVar.d(new String[]{"minTemperature"});
        vzoVar.d(5);
        aggregateProMaxAndMin(vzoVar, new DataSourceCallback() { // from class: wds
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.f51913c.a(dataSourceCallback, vzoVar, countDownLatch, i2, (List) obj);
            }
        });
    }

    /* synthetic */ void a(final DataSourceCallback dataSourceCallback, vzo vzoVar, CountDownLatch countDownLatch, final int i, List list) {
        if (i != 0) {
            this.mHandler.post(new Runnable() { // from class: wdf
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        if (list != null) {
            transKeyToValue(list, this.mMinDataList, vzoVar);
        }
        countDownLatch.countDown();
    }

    private List<HiHealthData> b(List<HiHealthData> list, String str) {
        sortHiHealthDataToDesc(list);
        ArrayList arrayList = new ArrayList(10);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setStartTime(0L);
        hiHealthData.setValue(Integer.MIN_VALUE);
        int size = list.size();
        list.add(hiHealthData);
        int i = 0;
        while (i < size) {
            HiHealthData hiHealthData2 = list.get(i);
            int i2 = i + 1;
            HiHealthData hiHealthData3 = list.get(i2);
            if (!simpleDateFormat.format(Long.valueOf(hiHealthData2.getStartTime())).equals(simpleDateFormat.format(Long.valueOf(hiHealthData3.getStartTime())))) {
                arrayList.add(list.get(i));
                i = i2;
            } else {
                if ("deduplicate_max".equals(str) && hiHealthData2.getValue() > hiHealthData3.getValue()) {
                    arrayList.add(hiHealthData2);
                } else if ((!"deduplicate_max".equals(str) || hiHealthData2.getValue() >= hiHealthData3.getValue()) && "deduplicate_min".equals(str) && hiHealthData2.getValue() < hiHealthData3.getValue()) {
                    arrayList.add(hiHealthData2);
                } else {
                    arrayList.add(hiHealthData3);
                }
                i += 2;
            }
        }
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        return recordDataProcess(list, 1005);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setDataDesc(wig.d(hiHealthData.getStartTime()));
        if (hiHealthData.containsKey("singleSuspectBodyTemperature")) {
            privacyDataModel.setDataTitle(wgv.d(hiHealthData.getDouble("singleSuspectBodyTemperature"), DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value()));
        } else {
            privacyDataModel.setDataTitle(wgv.c(hiHealthData.getDouble("maxTemperature"), hiHealthData.getDouble("minTemperature")));
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfRecordDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setDoubleValue(hiHealthData.getValue());
        privacyDataModel.setDataTitle(wgv.d(hiHealthData.getValue(), hiHealthData.getType()));
    }
}
