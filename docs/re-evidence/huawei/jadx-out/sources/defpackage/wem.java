package defpackage;

import android.os.Handler;
import android.util.SparseArray;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wem extends BaseOperate {
    private List<HiHealthData> d = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<HiHealthData> f51948c = new ArrayList(10);

    public wem() {
        this.pageType = 102;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthNoSource(final DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        vzoVar.e(new int[]{46016, 46017});
        vzoVar.d(new String[]{"maxHeartRate", "minHeartRate"});
        vzoVar.a(new int[]{4, 5});
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
        aggregateHiHealthDataEx(arrayList, new DataSourceCallback() { // from class: wer
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.f51957b.c(dataSourceCallback, i2, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void c(final DataSourceCallback dataSourceCallback, final int i, SparseArray sparseArray) {
        if (i != 0 || njy.e((Collection<?>) sparseArray.get(0))) {
            LogUtil.e("HeartRateOperateImp", "aggregateHiHealthDataEx fail");
            this.mHandler.post(new Runnable() { // from class: wej
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
        } else {
            final List<whz> listHiHealthDataProcess = hiHealthDataProcess((List) sparseArray.get(0));
            this.mHandler.post(new Runnable() { // from class: wes
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, listHiHealthDataProcess);
                }
            });
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByDeviceSource(String str, int i, String str2, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setConstantsKey(new String[]{"DATA_POINT_HEARTRATE", "DATA_POINT_REST_HEARTRATE"});
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setType(new int[]{2002, 2018});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(i);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setDeviceUuid(str);
        vzo vzoVar = new vzo();
        vzoVar.c(str2);
        b(vzoVar, hiAggregateOption, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readByMonthByAppSource(String str, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setConstantsKey(new String[]{"DATA_POINT_HEARTRATE", "DATA_POINT_REST_HEARTRATE"});
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setType(new int[]{2002, 2018});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(1);
        hiAggregateOption.setSortOrder(1);
        vzo vzoVar = new vzo();
        vzoVar.c(str);
        b(vzoVar, hiAggregateOption, dataSourceCallback);
    }

    private void b(vzo vzoVar, HiAggregateOption hiAggregateOption, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(vzoVar.f()).e();
        LogUtil.a("HeartRateOperateImp", "aggregateProMax start");
        HiHealthManager.d(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new AnonymousClass2(dataSourceCallback, hiAggregateOption, vzoVar));
    }

    /* JADX INFO: renamed from: wem$2, reason: invalid class name */
    class AnonymousClass2 implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HiAggregateOption f51949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vzo f51950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DataSourceCallback f51951c;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass2(DataSourceCallback dataSourceCallback, HiAggregateOption hiAggregateOption, vzo vzoVar) {
            this.f51951c = dataSourceCallback;
            this.f51949a = hiAggregateOption;
            this.f51950b = vzoVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.a("HeartRateOperateImp", "aggregateProMax end errorCode = ", Integer.valueOf(i));
            if (i != 0) {
                Handler handler = wem.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.f51951c;
                handler.post(new Runnable() { // from class: weq
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
            } else if (!njy.e(list)) {
                wem.this.d = list;
                this.f51949a.setAggregateType(5);
                wem.this.c(this.f51950b, this.f51949a, (DataSourceCallback<List<whz>>) this.f51951c);
            } else {
                Handler handler2 = wem.this.mHandler;
                final DataSourceCallback dataSourceCallback2 = this.f51951c;
                handler2.post(new Runnable() { // from class: weo
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback2.onResponse(0, new ArrayList());
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(vzo vzoVar, HiAggregateOption hiAggregateOption, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(vzoVar.f()).e();
        LogUtil.a("HeartRateOperateImp", "aggregateProMin start");
        HiHealthManager.d(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new AnonymousClass4(dataSourceCallback));
    }

    /* JADX INFO: renamed from: wem$4, reason: invalid class name */
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
            LogUtil.a("HeartRateOperateImp", "aggregateProMin end errorCode = ", Integer.valueOf(i));
            if (i != 0) {
                Handler handler = wem.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.e;
                handler.post(new Runnable() { // from class: wep
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
            } else {
                if (!njy.e(list)) {
                    wem.this.f51948c = list;
                    wem wemVar = wem.this;
                    final List<whz> listHiHealthDataProcess = wem.this.hiHealthDataProcess(wemVar.b(wemVar.d, wem.this.f51948c));
                    Handler handler2 = wem.this.mHandler;
                    final DataSourceCallback dataSourceCallback2 = this.e;
                    handler2.post(new Runnable() { // from class: wev
                        @Override // java.lang.Runnable
                        public final void run() {
                            dataSourceCallback2.onResponse(0, listHiHealthDataProcess);
                        }
                    });
                    return;
                }
                Handler handler3 = wem.this.mHandler;
                final DataSourceCallback dataSourceCallback3 = this.e;
                handler3.post(new Runnable() { // from class: wew
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback3.onResponse(0, new ArrayList());
                    }
                });
            }
        }
    }

    protected List<HiHealthData> b(List<HiHealthData> list, List<HiHealthData> list2) {
        if (list.size() != list2.size()) {
            return Collections.EMPTY_LIST;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            HiHealthData hiHealthData = new HiHealthData();
            HiHealthData hiHealthData2 = list.get(i);
            hiHealthData.setStartTime(hiHealthData2.getStartTime());
            hiHealthData.setEndTime(hiHealthData2.getEndTime());
            hiHealthData.setCreateTime(hiHealthData2.getCreateTime());
            hiHealthData.putInt("maxHeartRate", c(hiHealthData2));
            HiHealthData hiHealthData3 = list2.get(i);
            if (b(hiHealthData3) == 0) {
                hiHealthData.putInt("minHeartRate", b(hiHealthData2));
            } else {
                hiHealthData.putInt("minHeartRate", b(hiHealthData3));
            }
            arrayList.add(hiHealthData);
        }
        return arrayList;
    }

    private int c(HiHealthData hiHealthData) {
        return (int) Math.max(hiHealthData.getDouble("DATA_POINT_HEARTRATE"), hiHealthData.getDouble("DATA_POINT_REST_HEARTRATE"));
    }

    private int b(HiHealthData hiHealthData) {
        ArrayList arrayList = new ArrayList(3);
        if (hiHealthData.getDouble("DATA_POINT_HEARTRATE") > 0.0d) {
            arrayList.add(Double.valueOf(hiHealthData.getDouble("DATA_POINT_HEARTRATE")));
        }
        if (hiHealthData.getDouble("DATA_POINT_REST_HEARTRATE") > 0.0d) {
            arrayList.add(Double.valueOf(hiHealthData.getDouble("DATA_POINT_REST_HEARTRATE")));
        }
        int size = arrayList.size();
        if (size == 1) {
            return ((Double) arrayList.get(0)).intValue();
        }
        if (size != 2) {
            return 0;
        }
        return (int) Math.min(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue());
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setStartTime(wgr.d(hiHealthData.getStartTime()));
        privacyDataModel.setEndTime(wgr.b(hiHealthData.getStartTime()));
        privacyDataModel.setDataTitle(wgv.e(hiHealthData.getInt("maxHeartRate"), hiHealthData.getInt("minHeartRate")));
        privacyDataModel.setDataDesc(wig.d(hiHealthData.getStartTime()));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDayDataNoSource */
    public void m1745xae5c7554(vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzoVar.e(new int[]{2002, 2018});
        vzoVar.b(true);
        a(vzoVar.m(), vzoVar, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDayDataBySource */
    public void m1744xa7339313(vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzoVar.e(new int[]{2002, 2018});
        vzoVar.b(true);
        a(vzoVar.m(), vzoVar, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readInOneDayByDeviceSource(long j, String str, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        vzoVar.a(2);
        vzoVar.e(str);
        vzoVar.e(new int[]{2002, 2018});
        a(j, vzoVar, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void readInOneDayByAppSource(long j, String str, String str2, int i, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        vzoVar.a(i);
        vzoVar.c(str2);
        vzoVar.e(str);
        vzoVar.e(new int[]{2002, 2018});
        a(j, vzoVar, dataSourceCallback);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        return recordDataProcess(list, 1005);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfRecordDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setIntValue(hiHealthData.getIntValue());
        privacyDataModel.setDataTitle(wgv.b(hiHealthData.getIntValue()));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public int[] getDeleteDataTypes(vzo vzoVar) {
        return new int[]{2002, 2105, 2018};
    }

    private void a(long j, vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(wgr.d(j));
        hiDataReadOption.setEndTime(wgr.b(j));
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(vzoVar.o());
        hiDataReadOption.setReadType(vzoVar.l());
        hiDataReadOption.setDeviceUuid(vzoVar.j());
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(hiDataReadOption).a(vzoVar.f()).b();
        LogUtil.a("HeartRateOperateImp", "readHiHealthDataProPageQuery start");
        HiHealthManager.d(this.mContext).readHiHealthDataPro(hiDataReadProOptionB, new AnonymousClass3(dataSourceCallback, vzoVar));
    }

    /* JADX INFO: renamed from: wem$3, reason: invalid class name */
    class AnonymousClass3 implements HiDataReadResultListener {
        final /* synthetic */ vzo d;
        final /* synthetic */ DataSourceCallback e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass3(DataSourceCallback dataSourceCallback, vzo vzoVar) {
            this.e = dataSourceCallback;
            this.d = vzoVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("HeartRateOperateImp", "readHiHealthDataProPageQuery end errorCode = ", Integer.valueOf(i));
            if (i != 0) {
                Handler handler = wem.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.e;
                handler.post(new Runnable() { // from class: weu
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
                return;
            }
            SparseArray sparseArray = new SparseArray();
            if (obj instanceof SparseArray) {
                sparseArray = (SparseArray) obj;
            }
            if (sparseArray.size() == 0) {
                Handler handler2 = wem.this.mHandler;
                final DataSourceCallback dataSourceCallback2 = this.e;
                handler2.post(new Runnable() { // from class: wet
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback2.onResponse(0, new ArrayList());
                    }
                });
                return;
            }
            ArrayList arrayList = new ArrayList(10);
            for (int i3 : this.d.o()) {
                if (sparseArray.get(i3) != null) {
                    arrayList.addAll((Collection) sparseArray.get(i3));
                }
            }
            List<HiHealthData> listE = wem.this.e(arrayList);
            wem.this.sortHiHealthDataToDesc(listE);
            final List<PrivacyDataModel> listProResultOfReadInOneDayNoSource = wem.this.proResultOfReadInOneDayNoSource(listE);
            if (this.d.n()) {
                wem.this.setIconResource(listProResultOfReadInOneDayNoSource);
            }
            Handler handler3 = wem.this.mHandler;
            final DataSourceCallback dataSourceCallback3 = this.e;
            handler3.post(new Runnable() { // from class: wex
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback3.onResponse(0, listProResultOfReadInOneDayNoSource);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> e(List<HiHealthData> list) {
        HashMap map = new HashMap(16);
        for (HiHealthData hiHealthData : list) {
            if (!map.containsKey(Long.valueOf(hiHealthData.getStartTime()))) {
                map.put(Long.valueOf(hiHealthData.getStartTime()), hiHealthData);
            }
        }
        ArrayList arrayList = new ArrayList(10);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((HiHealthData) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }
}
