package defpackage;

import android.os.Handler;
import android.util.SparseArray;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class wbe extends BaseOperate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<HiHealthData> f51804b = new ArrayList(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<HiHealthData> f51803a = new ArrayList(10);
    private List<HiHealthData> d = new ArrayList(10);
    private List<HiHealthData> e = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<HiHealthData> f51805c = new ArrayList(10);

    public wbe() {
        this.pageType = 105;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        return recordDataProcess(list, 1005);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfRecordDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setIntValue(hiHealthData.getIntValue());
        privacyDataModel.setDataTitle(wgv.c(hiHealthData.getIntValue()));
        privacyDataModel.putInt("bloodOxygenCardKey", hiHealthData.getInt("bloodOxygenCardKey"));
        privacyDataModel.putInt("altitudeKey", hiHealthData.getInt("altitudeKey"));
        privacyDataModel.putInt("bloodOxygenKey", hiHealthData.getIntValue());
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readGroupDataNoSource */
    public void m1751xe5ecdbf1(vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
        int iB = vzoVar.b("Subpage");
        if (iB == 2) {
            c(dataSourceCallback);
            return;
        }
        if (iB == 4) {
            b(dataSourceCallback);
        } else if (iB == 3) {
            e(dataSourceCallback);
        } else {
            d(dataSourceCallback);
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByDeviceSource(String str, int i, String str2, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setConstantsKey(new String[]{"BloodOxygen"});
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setType(new int[]{2103});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(2);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setDeviceUuid(str);
        b(hiAggregateOption, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByAppSource(String str, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setConstantsKey(new String[]{"BloodOxygen"});
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setType(new int[]{2103});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setDeviceUuid(str);
        b(hiAggregateOption, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDayDataNoSource */
    public void m1745xae5c7554(vzo vzoVar, final DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        int[] iArr;
        if (fua.e()) {
            iArr = new int[]{2103, DicDataTypeUtil.DataType.ALTITUDE_TYPE.value(), 2107};
        } else {
            iArr = new int[]{2103, 2107};
        }
        vzoVar.e(iArr);
        LogUtil.a("BloodOxygenOperateImp", "readDayDataNoSource start");
        readHiHealthDataPro(vzoVar, new DataSourceCallback() { // from class: wbv
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.d.a(dataSourceCallback, i, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void a(final DataSourceCallback dataSourceCallback, final int i, SparseArray sparseArray) {
        if (i != 0 || sparseArray == null || sparseArray.size() == 0) {
            this.mHandler.post(new Runnable() { // from class: wby
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        List<HiHealthData> list = (List) sparseArray.get(2103);
        List<HiHealthData> list2 = (List) sparseArray.get(DicDataTypeUtil.DataType.ALTITUDE_TYPE.value());
        List<HiHealthData> list3 = (List) sparseArray.get(2107);
        if (!njy.e(list2)) {
            for (HiHealthData hiHealthData : list2) {
                hiHealthData.putInt("altitudeKey", hiHealthData.getIntValue());
            }
        }
        List<HiHealthData> listE = e(list3, list);
        sortHiHealthDataToDesc(listE);
        wua.a(listE, (List<HiHealthData>) list2);
        final List<PrivacyDataModel> listProResultOfReadInOneDayNoSource = proResultOfReadInOneDayNoSource(listE);
        int i2 = 0;
        for (PrivacyDataModel privacyDataModel : listProResultOfReadInOneDayNoSource) {
            if (i2 >= 20) {
                break;
            }
            wjr.e(privacyDataModel.getInt("bloodOxygenKey"));
            i2++;
        }
        this.mHandler.post(new Runnable() { // from class: wcf
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(i, listProResultOfReadInOneDayNoSource);
            }
        });
    }

    private List<HiHealthData> e(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(list2) || !njy.e(list)) {
            if (njy.e(list)) {
                Iterator<HiHealthData> it = list2.iterator();
                while (it.hasNext()) {
                    it.next().putInt("bloodOxygenCardKey", 1004);
                }
                return list2;
            }
            if (njy.e(list2)) {
                Iterator<HiHealthData> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().putInt("bloodOxygenCardKey", 1002);
                }
                return list;
            }
            HashMap map = new HashMap(16);
            for (HiHealthData hiHealthData : list2) {
                hiHealthData.putInt("bloodOxygenCardKey", 1004);
                map.put(Long.valueOf(hiHealthData.getStartTime()), hiHealthData);
            }
            for (HiHealthData hiHealthData2 : list) {
                hiHealthData2.putInt("bloodOxygenCardKey", 1002);
                map.put(Long.valueOf(hiHealthData2.getStartTime()), hiHealthData2);
            }
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                arrayList.add((HiHealthData) ((Map.Entry) it3.next()).getValue());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readInOneDayByDeviceSource(long j, String str, final DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        this.mHiHealthDataListRecursive.clear();
        vzoVar.a(wgr.d(j));
        vzoVar.e(wgr.b(j));
        vzoVar.a(2);
        vzoVar.e(str);
        vzoVar.e(300);
        setVarOfReadInOneDayByAppSource(vzoVar);
        LogUtil.a("BloodOxygenOperateImp", "readHiHealthDataProInOneDay start");
        readHiHealthDataProInOneDay(vzoVar, new DataSourceCallback() { // from class: wbw
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51836c.f(dataSourceCallback, i, (List) obj);
            }
        });
    }

    /* synthetic */ void f(final DataSourceCallback dataSourceCallback, final int i, List list) {
        LogUtil.e("BloodOxygenOperateImp", "readHiHealthDataProInOneDay end resultCode = ", Integer.valueOf(i));
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wbn
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
        } else {
            final List<PrivacyDataModel> listProResultOfReadInOneDayNoSource = proResultOfReadInOneDayNoSource(list);
            this.mHandler.post(new Runnable() { // from class: wbp
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, listProResultOfReadInOneDayNoSource);
                }
            });
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfReadInOneDayByAppSource(vzo vzoVar) {
        vzoVar.e(new int[]{2103});
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        int i = hiHealthData.getInt("bloodOxygenCardKey");
        privacyDataModel.putInt("bloodOxygenCardKey", i);
        int i2 = hiHealthData.getInt("maxBloodOxygen");
        int i3 = hiHealthData.getInt("minBloodOxygen");
        if (i == 0) {
            privacyDataModel.setDataTitle(wgv.d(i2, i3));
            privacyDataModel.setDataDesc(wig.d(hiHealthData.getStartTime()));
            return;
        }
        if (i == 1003) {
            privacyDataModel.setDataTitle(wgv.a(i2, i3));
            privacyDataModel.setDataDesc(wua.a(BaseApplication.getContext(), hiHealthData.getStartTime()));
            return;
        }
        privacyDataModel.putInt("bloodOxygenKey", hiHealthData.getInt("bloodOxygenKey"));
        privacyDataModel.putInt("altitudeKey", hiHealthData.getInt("altitudeKey"));
        privacyDataModel.setDataDesc(wua.c(BaseApplication.getContext(), hiHealthData.getStartTime()));
        privacyDataModel.setDataTitle(wgv.c(hiHealthData.getInt("bloodOxygenKey")));
        privacyDataModel.setIntValue(hiHealthData.getInt("bloodOxygenKey"));
        if (i == 1001) {
            privacyDataModel.putInt("lakeLouiseScoreKey", hiHealthData.getInt("lakeLouiseScoreKey"));
        }
    }

    private void b(HiAggregateOption hiAggregateOption, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e((String) null).e();
        LogUtil.a("BloodOxygenOperateImp", "aggregateProMax start");
        HiHealthManager.d(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new AnonymousClass1(dataSourceCallback, hiAggregateOption));
    }

    /* JADX INFO: renamed from: wbe$1, reason: invalid class name */
    class AnonymousClass1 implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataSourceCallback f51806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HiAggregateOption f51807b;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass1(DataSourceCallback dataSourceCallback, HiAggregateOption hiAggregateOption) {
            this.f51806a = dataSourceCallback;
            this.f51807b = hiAggregateOption;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.a("BloodOxygenOperateImp", "aggregateProMax end errorCode = ", Integer.valueOf(i));
            if (i != 0) {
                Handler handler = wbe.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.f51806a;
                handler.post(new Runnable() { // from class: wce
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
            } else if (njy.e(list)) {
                Handler handler2 = wbe.this.mHandler;
                final DataSourceCallback dataSourceCallback2 = this.f51806a;
                handler2.post(new Runnable() { // from class: wcd
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback2.onResponse(0, new ArrayList());
                    }
                });
            } else {
                wbe.this.mMaxDataList = list;
                this.f51807b.setAggregateType(5);
                wbe.this.d(this.f51807b, (DataSourceCallback<List<whz>>) this.f51806a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HiAggregateOption hiAggregateOption, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e((String) null).e();
        LogUtil.a("BloodOxygenOperateImp", "aggregateProMin start");
        HiHealthManager.d(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new AnonymousClass4(dataSourceCallback));
    }

    /* JADX INFO: renamed from: wbe$4, reason: invalid class name */
    class AnonymousClass4 implements HiAggregateListener {
        final /* synthetic */ DataSourceCallback e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass4(DataSourceCallback dataSourceCallback) {
            this.e = dataSourceCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.a("BloodOxygenOperateImp", "aggregateProMin end errorCode = ", Integer.valueOf(i));
            if (i != 0) {
                Handler handler = wbe.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.e;
                handler.post(new Runnable() { // from class: wcb
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
            } else {
                if (njy.e(list)) {
                    Handler handler2 = wbe.this.mHandler;
                    final DataSourceCallback dataSourceCallback2 = this.e;
                    handler2.post(new Runnable() { // from class: wcc
                        @Override // java.lang.Runnable
                        public final void run() {
                            dataSourceCallback2.onResponse(0, new ArrayList());
                        }
                    });
                    return;
                }
                wbe.this.mMinDataList = list;
                wbe wbeVar = wbe.this;
                final List<whz> listHiHealthDataProcess = wbe.this.hiHealthDataProcess(wbeVar.a(wbeVar.mMaxDataList, wbe.this.mMinDataList));
                Handler handler3 = wbe.this.mHandler;
                final DataSourceCallback dataSourceCallback3 = this.e;
                handler3.post(new Runnable() { // from class: wch
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback3.onResponse(0, listHiHealthDataProcess);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> a(List<HiHealthData> list, List<HiHealthData> list2) {
        if (list.size() != list2.size()) {
            return Collections.EMPTY_LIST;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            HiHealthData hiHealthData = new HiHealthData();
            HiHealthData hiHealthData2 = list.get(i);
            HiHealthData hiHealthData3 = list2.get(i);
            hiHealthData.setStartTime(hiHealthData2.getStartTime());
            hiHealthData.setEndTime(hiHealthData2.getEndTime());
            hiHealthData.setCreateTime(hiHealthData2.getCreateTime());
            hiHealthData.putInt("maxBloodOxygen", hiHealthData2.getInt("BloodOxygen"));
            hiHealthData.putInt("minBloodOxygen", hiHealthData3.getInt("BloodOxygen"));
            arrayList.add(hiHealthData);
        }
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public int[] getDeleteDataTypes(vzo vzoVar) {
        return new int[]{2103};
    }

    private void d(final DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value()});
        vzoVar.a(0L);
        vzoVar.e(System.currentTimeMillis());
        vzoVar.a(0);
        LogUtil.a("BloodOxygenOperateImp", "getAllData start");
        e(vzoVar, new DataSourceCallback() { // from class: wbk
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.d.g(dataSourceCallback, i, (List) obj);
            }
        });
    }

    /* synthetic */ void g(final DataSourceCallback dataSourceCallback, final int i, List list) {
        LogUtil.a("BloodOxygenOperateImp", "getAllData end resultCode = ", Integer.valueOf(i));
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wbh
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        final List<whz> listHiHealthDataProcess = hiHealthDataProcess(list);
        c(listHiHealthDataProcess);
        this.mHandler.post(new Runnable() { // from class: wbq
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(i, listHiHealthDataProcess);
            }
        });
    }

    private void e(vzo vzoVar, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        final ArrayList arrayList = new ArrayList(10);
        c(vzoVar, new DataSourceCallback() { // from class: wbz
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51840a.a(arrayList, dataSourceCallback, i, (List) obj);
            }
        });
    }

    /* synthetic */ void a(final List list, DataSourceCallback dataSourceCallback, int i, List list2) {
        if (i == 0 && njy.b(list2) && fua.e()) {
            list.addAll(list2);
        }
        vzo vzoVar = new vzo();
        vzoVar.e(new int[]{47201, 47202});
        vzoVar.d(new String[]{"maxBloodOxygen", "minBloodOxygen"});
        vzoVar.a(new int[]{4, 5});
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        b(vzoVar, new DataSourceCallback() { // from class: wbr
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                wbe.d(list, countDownLatch, i2, (List) obj);
            }
        });
        try {
            LogUtil.a("BloodOxygenOperateImp", "getAllDataImp getMeasureListImp isCountDownZero = ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.j("BloodOxygenOperateImp", "getAllDataImp getMeasureListImp interruptedException");
        }
        if (njy.e(list)) {
            dataSourceCallback.onResponse(1, new ArrayList());
        } else {
            sortHiHealthDataToDesc(list);
            dataSourceCallback.onResponse(0, list);
        }
    }

    static /* synthetic */ void d(List list, CountDownLatch countDownLatch, int i, List list2) {
        if (i == 0 && njy.b(list2)) {
            list.addAll(list2);
        }
        countDownLatch.countDown();
    }

    private void e(final DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        vzoVar.e(new int[]{47201, 47202});
        vzoVar.d(new String[]{"maxBloodOxygen", "minBloodOxygen"});
        vzoVar.a(new int[]{4, 5});
        LogUtil.a("BloodOxygenOperateImp", "getMeasureList start");
        b(vzoVar, new DataSourceCallback() { // from class: wca
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.e.h(dataSourceCallback, i, (List) obj);
            }
        });
    }

    /* synthetic */ void h(final DataSourceCallback dataSourceCallback, final int i, List list) {
        LogUtil.a("BloodOxygenOperateImp", "getMeasureList end resultCode = ", Integer.valueOf(i));
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wbm
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
        } else {
            final List<whz> listHiHealthDataProcess = hiHealthDataProcess(list);
            this.mHandler.post(new Runnable() { // from class: wbu
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, listHiHealthDataProcess);
                }
            });
        }
    }

    private void b(vzo vzoVar, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        ArrayList<HiAggregateOption> arrayList = new ArrayList<>(10);
        for (int i : vzoVar.i()) {
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            hiAggregateOption.setReadType(0);
            hiAggregateOption.setStartTime(0L);
            hiAggregateOption.setEndTime(System.currentTimeMillis());
            hiAggregateOption.setGroupUnitType(3);
            hiAggregateOption.setAggregateType(i);
            hiAggregateOption.setConstantsKey(vzoVar.e());
            hiAggregateOption.setType(vzoVar.o());
            hiAggregateOption.setSortOrder(1);
            arrayList.add(hiAggregateOption);
        }
        aggregateHiHealthDataEx(arrayList, new DataSourceCallback() { // from class: wbl
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                wbe.e(dataSourceCallback, i2, (SparseArray) obj);
            }
        });
    }

    static /* synthetic */ void e(DataSourceCallback dataSourceCallback, int i, SparseArray sparseArray) {
        if (i != 0 || njy.e((Collection<?>) sparseArray.get(0))) {
            dataSourceCallback.onResponse(i, new ArrayList());
            return;
        }
        List list = (List) sparseArray.get(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((HiHealthData) it.next()).putInt("bloodOxygenCardKey", 1003);
        }
        dataSourceCallback.onResponse(i, list);
    }

    private void b(final DataSourceCallback<List<whz>> dataSourceCallback) {
        final vzo vzoVar = new vzo();
        vzoVar.e(new int[]{2107});
        vzoVar.a(0L);
        vzoVar.e(System.currentTimeMillis());
        vzoVar.a(0);
        LogUtil.a("BloodOxygenOperateImp", "getAbnormalList getLowOxygenList start");
        a(vzoVar, new DataSourceCallback() { // from class: wbo
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51823b.b(vzoVar, dataSourceCallback, i, (List) obj);
            }
        });
    }

    /* synthetic */ void b(vzo vzoVar, final DataSourceCallback dataSourceCallback, int i, List list) {
        LogUtil.a("BloodOxygenOperateImp", "getAbnormalList getLowOxygenList end resultCode = ", Integer.valueOf(i));
        final ArrayList arrayList = new ArrayList(10);
        if (i == 0 && njy.b(list)) {
            arrayList.addAll(list);
        }
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value()});
        LogUtil.a("BloodOxygenOperateImp", "getAbnormalList getLakeLouiseCardList start");
        c(vzoVar, new DataSourceCallback() { // from class: wbx
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.e.c(arrayList, dataSourceCallback, i2, (List) obj);
            }
        });
    }

    /* synthetic */ void c(List list, final DataSourceCallback dataSourceCallback, int i, List list2) {
        LogUtil.a("BloodOxygenOperateImp", "getAbnormalList getLakeLouiseCardList end resultCode = ", Integer.valueOf(i));
        if (i == 0 && njy.b(list2)) {
            List<HiHealthData> listA = a((List<HiHealthData>) list2);
            c((List<HiHealthData>) list, listA);
            list.addAll(listA);
        }
        sortHiHealthDataToDesc(list);
        final List<whz> listHiHealthDataProcess = hiHealthDataProcess(list);
        c(listHiHealthDataProcess);
        this.mHandler.post(new Runnable() { // from class: wbt
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(0, listHiHealthDataProcess);
            }
        });
    }

    private List<HiHealthData> a(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getInt("lakeLouiseScoreKey") > 2) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private void c(List<HiHealthData> list, List<HiHealthData> list2) {
        if (njy.e(list)) {
            return;
        }
        HashSet hashSet = new HashSet(16);
        Iterator<HiHealthData> it = list2.iterator();
        while (it.hasNext()) {
            hashSet.add(Long.valueOf(it.next().getStartTime()));
        }
        Iterator<HiHealthData> it2 = list.iterator();
        while (it2.hasNext()) {
            if (hashSet.contains(Long.valueOf(it2.next().getStartTime()))) {
                it2.remove();
            }
        }
    }

    private void a(vzo vzoVar, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        this.e.clear();
        this.f51805c.clear();
        readHiHealthDataPro(vzoVar, new DataSourceCallback() { // from class: wbd
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51802b.b(dataSourceCallback, i, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void b(DataSourceCallback dataSourceCallback, int i, SparseArray sparseArray) {
        if (i != 0 || sparseArray == null || sparseArray.get(2107) == null) {
            dataSourceCallback.onResponse(i, new ArrayList());
            return;
        }
        List<HiHealthData> list = (List) sparseArray.get(2107);
        this.e = list;
        for (HiHealthData hiHealthData : list) {
            hiHealthData.putInt("bloodOxygenCardKey", 1002);
            hiHealthData.putInt("bloodOxygenKey", hiHealthData.getIntValue());
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        c(1, this.e, new DataSourceCallback() { // from class: wbs
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.f51830b.b(countDownLatch, i2, (List) obj);
            }
        });
        try {
            LogUtil.a("BloodOxygenOperateImp", "getLowOxygenListImp getAltitude isCountDownZero = ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.j("BloodOxygenOperateImp", "getLowOxygenListImp getAltitude interruptedException");
        }
        wua.a(this.e, this.f51805c);
        dataSourceCallback.onResponse(i, this.e);
    }

    /* synthetic */ void b(CountDownLatch countDownLatch, int i, List list) {
        if (i == 0) {
            this.f51805c = list;
        }
        countDownLatch.countDown();
    }

    private void c(final DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        vzoVar.e(new int[]{DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value()});
        vzoVar.a(0L);
        vzoVar.e(System.currentTimeMillis());
        vzoVar.a(0);
        LogUtil.a("BloodOxygenOperateImp", "getLakeLouiseCardList start");
        c(vzoVar, new DataSourceCallback() { // from class: wbg
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51813a.i(dataSourceCallback, i, (List) obj);
            }
        });
    }

    /* synthetic */ void i(final DataSourceCallback dataSourceCallback, final int i, List list) {
        LogUtil.a("BloodOxygenOperateImp", "getLakeLouiseCardList end resultCode = ", Integer.valueOf(i));
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wbf
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        final List<whz> listHiHealthDataProcess = hiHealthDataProcess(list);
        c(listHiHealthDataProcess);
        this.mHandler.post(new Runnable() { // from class: wbi
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(i, listHiHealthDataProcess);
            }
        });
    }

    private void c(vzo vzoVar, DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        this.f51804b.clear();
        this.f51803a.clear();
        this.d.clear();
        readHiHealthDataPro(vzoVar, new AnonymousClass3(dataSourceCallback));
    }

    /* JADX INFO: renamed from: wbe$3, reason: invalid class name */
    class AnonymousClass3 implements DataSourceCallback<SparseArray<List<HiHealthData>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataSourceCallback f51808a;

        AnonymousClass3(DataSourceCallback dataSourceCallback) {
            this.f51808a = dataSourceCallback;
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(final int i, SparseArray<List<HiHealthData>> sparseArray) {
            if (i == 0 && sparseArray != null && sparseArray.get(DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value()) != null) {
                wbe.this.f51804b = sparseArray.get(DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value());
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                wbe wbeVar = wbe.this;
                wbeVar.c(0, wbeVar.f51804b, new DataSourceCallback() { // from class: wck
                    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
                    public final void onResponse(int i2, Object obj) {
                        this.d.a(countDownLatch, i2, (List) obj);
                    }
                });
                try {
                    LogUtil.a("BloodOxygenOperateImp", "getLakeLouiseCardListImp getOxygen isCountDownZero = ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
                } catch (InterruptedException unused) {
                    LogUtil.j("BloodOxygenOperateImp", "getLakeLouiseCardListImp getOxygen interruptedException");
                }
                final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                wbe wbeVar2 = wbe.this;
                wbeVar2.c(1, wbeVar2.f51803a, new DataSourceCallback() { // from class: wci
                    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
                    public final void onResponse(int i2, Object obj) {
                        this.f51852a.c(countDownLatch2, i2, (List) obj);
                    }
                });
                try {
                    LogUtil.a("BloodOxygenOperateImp", "getLakeLouiseCardListImp getAltitude isCountDownZero = ", Boolean.valueOf(countDownLatch2.await(5000L, TimeUnit.MILLISECONDS)));
                } catch (InterruptedException unused2) {
                    LogUtil.j("BloodOxygenOperateImp", "getLakeLouiseCardListImp getAltitude interruptedException");
                }
                this.f51808a.onResponse(i, wua.b(wbe.this.f51804b, wbe.this.f51803a, wbe.this.d, false));
                return;
            }
            Handler handler = wbe.this.mHandler;
            final DataSourceCallback dataSourceCallback = this.f51808a;
            handler.post(new Runnable() { // from class: wcg
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
        }

        /* synthetic */ void a(CountDownLatch countDownLatch, int i, List list) {
            if (i == 0) {
                wbe.this.f51803a = list;
            }
            countDownLatch.countDown();
        }

        /* synthetic */ void c(CountDownLatch countDownLatch, int i, List list) {
            if (i == 0) {
                wbe.this.d = list;
            }
            countDownLatch.countDown();
        }
    }

    public void c(int i, List<HiHealthData> list, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        ArrayList<HiAggregateOption> arrayList = new ArrayList<>(10);
        for (HiHealthData hiHealthData : list) {
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            hiAggregateOption.setReadType(0);
            hiAggregateOption.setGroupUnitType(0);
            hiAggregateOption.setAggregateType(1);
            hiAggregateOption.setSortOrder(1);
            if (i == 0) {
                hiAggregateOption.setStartTime(hiHealthData.getEndTime() - 120000);
                hiAggregateOption.setEndTime(hiHealthData.getEndTime() + 120000);
                hiAggregateOption.setConstantsKey(new String[]{"bloodOxygenKey"});
                hiAggregateOption.setType(new int[]{2103});
            } else {
                if (i != 1) {
                    return;
                }
                hiAggregateOption.setStartTime(hiHealthData.getStartTime() - 60000);
                hiAggregateOption.setEndTime(hiHealthData.getEndTime() + 60000);
                hiAggregateOption.setConstantsKey(new String[]{"altitudeKey"});
                hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.ALTITUDE_TYPE.value()});
            }
            arrayList.add(hiAggregateOption);
        }
        aggregateHiHealthDataEx(arrayList, new DataSourceCallback() { // from class: wbj
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                wbe.d(dataSourceCallback, i2, (SparseArray) obj);
            }
        });
    }

    static /* synthetic */ void d(DataSourceCallback dataSourceCallback, int i, SparseArray sparseArray) {
        if (i != 0 || sparseArray.size() == 0) {
            dataSourceCallback.onResponse(i, new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            List list = (List) sparseArray.get(sparseArray.keyAt(i2));
            if (njy.b(list)) {
                arrayList.addAll(list);
            }
        }
        dataSourceCallback.onResponse(i, arrayList);
    }

    private void c(List<whz> list) {
        ArrayList<PrivacyDataModel> arrayList = new ArrayList(10);
        Iterator<whz> it = list.iterator();
        loop0: while (it.hasNext()) {
            for (PrivacyDataModel privacyDataModel : it.next().c()) {
                if (arrayList.size() >= 20) {
                    break loop0;
                } else {
                    arrayList.add(privacyDataModel);
                }
            }
        }
        for (PrivacyDataModel privacyDataModel2 : arrayList) {
            int i = privacyDataModel2.getInt("bloodOxygenCardKey");
            if (i == 1001) {
                wjr.b(privacyDataModel2.getInt("lakeLouiseScoreKey"));
            } else if (i == 1002) {
                wjr.e(privacyDataModel2.getInt("bloodOxygenKey"));
            }
        }
    }
}
