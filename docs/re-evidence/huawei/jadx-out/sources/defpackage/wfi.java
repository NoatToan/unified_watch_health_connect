package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDeleteListenerEx;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.datasourcemanager.util.DivideConditional;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class wfi extends BaseOperate {
    private List<HiHealthData> d = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<HiHealthData> f51982c = new ArrayList(10);
    private List<HiHealthData> i = new ArrayList(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<HiHealthData> f51980a = new ArrayList(10);
    private List<HiHealthData> e = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, List<HiHealthData>> f51981b = new LinkedHashMap(16);

    public wfi() {
        this.pageType = 103;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDayDataNoSource */
    public void m1745xae5c7554(vzo vzoVar, final DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        if (!d(vzoVar)) {
            this.mHandler.post(new Runnable() { // from class: wfr
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(2, new ArrayList());
                }
            });
            return;
        }
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        wgk.c().b(this.pageType, vzoVar.m(), vzoVar.h(), new DataSourceCallback() { // from class: wfk
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                wfi.b(iArr, arrayList, i, (List) obj);
            }
        });
        if (iArr[0] != 0 || njy.e(arrayList)) {
            this.mHandler.post(new Runnable() { // from class: wfo
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(iArr[0], new ArrayList());
                }
            });
            return;
        }
        List<HiHealthClient> listB = b(arrayList);
        int[] iArr2 = {22100, 22000};
        ArrayList arrayList2 = new ArrayList(10);
        for (int i = 0; i < listB.size(); i++) {
            arrayList2.add(wgu.d(wgu.b(new vzo(vzoVar.m(), vzoVar.h(), 2, listB.get(i).getDeviceUuid(), ""), iArr2), ""));
        }
        ReleaseLogUtil.d("R_SleepOperateImp", "readDayDataNoSource start");
        readHiHealthDataEx(arrayList2, new AnonymousClass1(dataSourceCallback, vzoVar));
    }

    static /* synthetic */ void b(int[] iArr, List list, int i, List list2) {
        ReleaseLogUtil.d("R_SleepOperateImp", "readDayDataNoSource getClient resultCode = ", Integer.valueOf(i), ", client size = ", Integer.valueOf(list2 == null ? 0 : list2.size()));
        iArr[0] = i;
        if (njy.b(list2)) {
            list.addAll(list2);
        }
    }

    /* JADX INFO: renamed from: wfi$1, reason: invalid class name */
    class AnonymousClass1 implements DataSourceCallback<SparseArray<List<HiHealthData>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataSourceCallback f51983a;
        final /* synthetic */ vzo e;

        AnonymousClass1(DataSourceCallback dataSourceCallback, vzo vzoVar) {
            this.f51983a = dataSourceCallback;
            this.e = vzoVar;
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResponse(final int i, SparseArray<List<HiHealthData>> sparseArray) {
            ReleaseLogUtil.d("R_SleepOperateImp", "readDayDataNoSource end resultCode = ", Integer.valueOf(i));
            if (i == 0 && sparseArray != null && sparseArray.size() != 0) {
                wfi.this.e(sparseArray);
                final List<PrivacyDataModel> listB = wfi.this.b(this.e);
                if (this.e.n()) {
                    wfi.this.setIconResource(listB);
                }
                Handler handler = wfi.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.f51983a;
                handler.post(new Runnable() { // from class: wfx
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(i, listB);
                    }
                });
                return;
            }
            Handler handler2 = wfi.this.mHandler;
            final DataSourceCallback dataSourceCallback2 = this.f51983a;
            handler2.post(new Runnable() { // from class: wfw
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback2.onResponse(i, new ArrayList());
                }
            });
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readDayDataBySource */
    public void m1744xa7339313(vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(wgu.b(vzoVar, new int[]{22100, 22000})).a(vzoVar.f()).b();
        ReleaseLogUtil.d("R_SleepOperateImp", "readDayDataBySource start");
        readHiHealthDataPro(hiDataReadProOptionB, new AnonymousClass2(dataSourceCallback, vzoVar));
    }

    /* JADX INFO: renamed from: wfi$2, reason: invalid class name */
    class AnonymousClass2 implements DataSourceCallback<SparseArray<List<HiHealthData>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vzo f51985b;
        final /* synthetic */ DataSourceCallback d;

        AnonymousClass2(DataSourceCallback dataSourceCallback, vzo vzoVar) {
            this.d = dataSourceCallback;
            this.f51985b = vzoVar;
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(final int i, SparseArray<List<HiHealthData>> sparseArray) {
            ReleaseLogUtil.d("R_SleepOperateImp", "readDayDataBySource end resultCode = ", Integer.valueOf(i));
            if (i == 0 && sparseArray != null && sparseArray.size() != 0) {
                wfi.this.e(sparseArray);
                final List<PrivacyDataModel> listB = wfi.this.b(this.f51985b);
                if (this.f51985b.n()) {
                    wfi.this.setIconResource(listB);
                }
                Handler handler = wfi.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.d;
                handler.post(new Runnable() { // from class: wgb
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(i, listB);
                    }
                });
                return;
            }
            Handler handler2 = wfi.this.mHandler;
            final DataSourceCallback dataSourceCallback2 = this.d;
            handler2.post(new Runnable() { // from class: wga
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback2.onResponse(i, new ArrayList());
                }
            });
        }
    }

    private boolean d(vzo vzoVar) {
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(wgu.b(vzoVar, new int[]{22100})).a(vzoVar.f()).b();
        ReleaseLogUtil.d("R_SleepOperateImp", "downLoadDayData start");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        readHiHealthDataPro(hiDataReadProOptionB, new DataSourceCallback<SparseArray<List<HiHealthData>>>() { // from class: wfi.4
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, SparseArray<List<HiHealthData>> sparseArray) {
                ReleaseLogUtil.d("R_SleepOperateImp", "downLoadDayData end resultCode = ", Integer.valueOf(i));
                countDownLatch.countDown();
            }
        });
        try {
            boolean zAwait = countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            ReleaseLogUtil.d("R_SleepOperateImp", "downLoadDayData isCountDownZero = ", Boolean.valueOf(zAwait));
            return zAwait;
        } catch (InterruptedException unused) {
            ReleaseLogUtil.d("R_SleepOperateImp", "downLoadDayData exception");
            return false;
        }
    }

    private List<HiHealthClient> b(List<HiHealthClient> list) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.addAll(c(list, "06D"));
        arrayList.addAll(c(list, "06E"));
        arrayList.addAll(c(list, "054"));
        arrayList.addAll(c(list, "00E"));
        arrayList.addAll(c(list, "011"));
        arrayList.addAll(c(list, "001"));
        if (njy.b(list)) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    private List<HiHealthClient> c(List<HiHealthClient> list, String str) {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(list) && !TextUtils.isEmpty(str)) {
            Iterator<HiHealthClient> it = list.iterator();
            while (it.hasNext()) {
                HiHealthClient next = it.next();
                if (next != null && next.getHiDeviceInfo() != null && str.equals(wgt.b(String.valueOf(next.getHiDeviceInfo().getDeviceType())))) {
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SparseArray<List<HiHealthData>> sparseArray) {
        if (sparseArray == null || sparseArray.size() == 0) {
            return;
        }
        ArrayList<HiHealthData> arrayList = new ArrayList(10);
        List<HiHealthData> list = sparseArray.get(22100);
        List<HiHealthData> list2 = sparseArray.get(22000);
        if (njy.b(list)) {
            arrayList.addAll(list);
        }
        if (njy.b(list2)) {
            arrayList.addAll(list2);
        }
        for (HiHealthData hiHealthData : arrayList) {
            int clientId = hiHealthData.getClientId();
            int type = hiHealthData.getType();
            if (type != 22001 && type != 22002) {
                switch (type) {
                    case 22101:
                    case 22102:
                    case 22103:
                        break;
                    default:
                        switch (type) {
                            case 22105:
                                break;
                            case 22106:
                                this.e.add(hiHealthData);
                                continue;
                            case 22107:
                                this.f51980a.add(hiHealthData);
                                this.e.add(hiHealthData);
                                continue;
                            default:
                                continue;
                        }
                        break;
                }
            }
            if (this.f51981b.containsKey(Integer.valueOf(clientId))) {
                this.f51981b.get(Integer.valueOf(clientId)).add(hiHealthData);
            } else {
                ArrayList arrayList2 = new ArrayList(10);
                arrayList2.add(hiHealthData);
                this.f51981b.put(Integer.valueOf(clientId), arrayList2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<PrivacyDataModel> b(vzo vzoVar) {
        ArrayList arrayList = new ArrayList(10);
        Iterator<Map.Entry<Integer, List<HiHealthData>>> it = this.f51981b.entrySet().iterator();
        while (it.hasNext()) {
            List<HiHealthData> value = it.next().getValue();
            sortHiHealthDataToDesc(value);
            arrayList.addAll(c(value));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(convertToDataModel((HiHealthData) it2.next(), vzoVar));
        }
        if (njy.e(this.f51980a)) {
            arrayList2.addAll(e(vzoVar));
        } else {
            arrayList2.addAll(a(vzoVar));
        }
        this.f51981b.clear();
        this.f51980a.clear();
        this.e.clear();
        return arrayList2;
    }

    private List<PrivacyDataModel> a(vzo vzoVar) {
        List<HiHealthData> listC = c(this.f51980a);
        ArrayList arrayList = new ArrayList();
        if (!njy.e(listC)) {
            List<HiHealthData> listC2 = c(this.e);
            for (HiHealthData hiHealthData : listC) {
                PrivacyDataModel privacyDataModelConvertToDataModel = convertToDataModel(hiHealthData, vzoVar);
                privacyDataModelConvertToDataModel.putLong("sleepStartTime", hiHealthData.getStartTime());
                privacyDataModelConvertToDataModel.putLong("sleepEndTime", hiHealthData.getEndTime());
                arrayList.add(privacyDataModelConvertToDataModel);
                for (HiHealthData hiHealthData2 : listC2) {
                    if (hiHealthData.getStartTime() >= hiHealthData2.getStartTime() && hiHealthData.getEndTime() <= hiHealthData2.getEndTime()) {
                        privacyDataModelConvertToDataModel.putLong("bedStartTime", hiHealthData2.getStartTime());
                        privacyDataModelConvertToDataModel.putLong("bedEndTime", hiHealthData2.getEndTime());
                        break;
                    }
                    if (hiHealthData.getEndTime() > hiHealthData2.getEndTime()) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private List<PrivacyDataModel> e(vzo vzoVar) {
        List<HiHealthData> listC = c(this.e);
        ArrayList arrayList = new ArrayList();
        if (!njy.e(listC)) {
            for (HiHealthData hiHealthData : listC) {
                PrivacyDataModel privacyDataModelConvertToDataModel = convertToDataModel(hiHealthData, vzoVar);
                privacyDataModelConvertToDataModel.putLong("bedStartTime", hiHealthData.getStartTime());
                privacyDataModelConvertToDataModel.putLong("bedEndTime", hiHealthData.getEndTime());
                arrayList.add(privacyDataModelConvertToDataModel);
            }
        }
        return arrayList;
    }

    private List<HiHealthData> c(List<HiHealthData> list) {
        List<List> listC = wgs.c(list, new DivideConditional() { // from class: wfm
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.util.DivideConditional
            public final boolean isDivide(Object obj, Object obj2) {
                return wfi.c((HiHealthData) obj, (HiHealthData) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        for (List list2 : listC) {
            if (!njy.e(list2)) {
                HiHealthData hiHealthData = new HiHealthData();
                HiHealthData hiHealthData2 = (HiHealthData) list2.get(0);
                HiHealthData hiHealthData3 = (HiHealthData) list2.get(list2.size() - 1);
                hiHealthData.setEndTime(hiHealthData2.getEndTime());
                hiHealthData.setModifiedTime(hiHealthData2.getModifiedTime());
                hiHealthData.setType(hiHealthData2.getType());
                hiHealthData.setClientId(hiHealthData2.getClientId());
                hiHealthData.setStartTime(hiHealthData3.getStartTime());
                arrayList.add(hiHealthData);
            }
        }
        LogUtil.a("SleepOperateImp", "splitData end, splitDataList list size=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    static /* synthetic */ boolean c(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
        return hiHealthData.getStartTime() != hiHealthData2.getEndTime();
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readGroupDataNoSource */
    public void m1751xe5ecdbf1(vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        HiDataAggregateProOption hiDataAggregateProOptionC = wgu.c(wgu.c(vzoVar, new int[]{44109, 44110, 44105, 44108, 44004}, new String[]{"stat_core_sleep_bed_key", "stat_core_sleep_device_category_key", "stat_core_sleep_night_key", "stat_core_sleep_noon_key", "stat_common_sleep_key"}, 1, 3), vzoVar.f());
        LogUtil.a("SleepOperateImp", "readGroupDataNoSource aggregateHiHealthDataPro start");
        aggregateHiHealthDataPro(hiDataAggregateProOptionC, new DataSourceCallback() { // from class: wfp
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f52001c.a(dataSourceCallback, i, (List) obj);
            }
        });
    }

    /* synthetic */ void a(final DataSourceCallback dataSourceCallback, final int i, List list) {
        LogUtil.a("SleepOperateImp", "readGroupDataNoSource aggregateHiHealthDataPro end resultCode = ", Integer.valueOf(i));
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wfn
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
        }
        final ArrayList arrayList = new ArrayList(10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PrivacyDataModel privacyDataModelE = e((HiHealthData) it.next());
            if (privacyDataModelE != null) {
                arrayList.add(privacyDataModelE);
            }
        }
        this.mHandler.post(new Runnable() { // from class: wfq
            @Override // java.lang.Runnable
            public final void run() {
                this.f52004c.e(dataSourceCallback, i, arrayList);
            }
        });
    }

    /* synthetic */ void e(DataSourceCallback dataSourceCallback, int i, List list) {
        dataSourceCallback.onResponse(i, groupByMonth(list));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    /* JADX INFO: renamed from: readGroupDataBySource */
    public void m1750xdec3f9b0(vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
        if (wgr.d(vzoVar.f(), vzoVar.j())) {
            a(vzoVar, dataSourceCallback);
        } else {
            d(vzoVar, dataSourceCallback);
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
        privacyDataModel.setStartTime(wgr.c(hiHealthData.getStartTime()));
        privacyDataModel.setEndTime(wgr.a(hiHealthData.getStartTime()));
        privacyDataModel.setDataTitle(wgv.i(hiHealthData.getInt("sleepNum")));
        privacyDataModel.setDataDesc(wig.d(hiHealthData.getEndTime() + 14399999));
        privacyDataModel.putBoolean("hasCoreSleep", hiHealthData.getBoolean("hasCoreSleep"));
        privacyDataModel.putBoolean("hasCommonSleep", hiHealthData.getBoolean("hasCommonSleep"));
    }

    private PrivacyDataModel e(HiHealthData hiHealthData) {
        int i;
        int i2 = hiHealthData.getInt("stat_core_sleep_bed_key");
        int i3 = hiHealthData.getInt("stat_core_sleep_device_category_key");
        int i4 = hiHealthData.getInt("stat_core_sleep_night_key");
        int i5 = hiHealthData.getInt("stat_core_sleep_noon_key");
        int i6 = hiHealthData.getInt("stat_common_sleep_key") / 60;
        if (i4 > 0 && i3 != 1) {
            i = i4 + i5;
        } else if (i6 > 0) {
            i = i6;
        } else if (i4 > 0) {
            i = i4;
        } else {
            i = i2 > 0 ? i2 : i5;
        }
        if (i == 0) {
            return null;
        }
        PrivacyDataModel privacyDataModel = new PrivacyDataModel();
        if (i4 > 0 || i5 > 0 || i2 > 0) {
            privacyDataModel.putBoolean("hasCoreSleep", true);
        }
        if (i6 > 0) {
            privacyDataModel.putBoolean("hasCommonSleep", true);
        }
        privacyDataModel.setPageType(this.pageType);
        privacyDataModel.setDataTitle(wgv.i(i));
        privacyDataModel.setDataDesc(wig.d(hiHealthData.getStartTime()));
        privacyDataModel.setStartTime(wgr.c(hiHealthData.getStartTime()));
        privacyDataModel.setEndTime(wgr.a(hiHealthData.getStartTime()));
        privacyDataModel.setModifyTime(hiHealthData.getModifiedTime());
        privacyDataModel.setType(hiHealthData.getType());
        privacyDataModel.setClientId(hiHealthData.getClientId());
        return privacyDataModel;
    }

    private void a(vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        HiAggregateOption hiAggregateOptionA = wgu.a(vzoVar, new int[]{22107, 22106}, new String[]{"sleep_sum", "bed_sum"}, 1);
        HiDataAggregateProOption hiDataAggregateProOptionE = new HiDataAggregateProOption.Builder().c(hiAggregateOptionA).e(vzoVar.f()).e();
        hiAggregateOptionA.setFilter("GET_SESSION_SLEEP_DATA");
        ReleaseLogUtil.d("R_SleepOperateImp", "readGroupDataOfManual start ");
        aggregateHiHealthDataPro(hiDataAggregateProOptionE, new DataSourceCallback() { // from class: wfv
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f52010b.d(dataSourceCallback, i, (List) obj);
            }
        });
    }

    /* synthetic */ void d(final DataSourceCallback dataSourceCallback, final int i, final List list) {
        ReleaseLogUtil.d("R_SleepOperateImp", "readGroupDataOfManual end resultCode = ", Integer.valueOf(i));
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wfs
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
        } else {
            this.mHandler.post(new Runnable() { // from class: wft
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(dataSourceCallback, i, list);
                }
            });
        }
    }

    /* synthetic */ void b(DataSourceCallback dataSourceCallback, int i, List list) {
        dataSourceCallback.onResponse(i, hiHealthDataProcess(e((List<HiHealthData>) list)));
    }

    private List<HiHealthData> e(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            arrayList.addAll(list);
            sortHiHealthDataToDesc(arrayList);
            Iterator<HiHealthData> it = arrayList.iterator();
            HiHealthData next = null;
            while (it.hasNext()) {
                if (next == null) {
                    next = it.next();
                } else {
                    HiHealthData next2 = it.next();
                    next.putBoolean("hasCoreSleep", true);
                    next.putBoolean("hasCommonSleep", false);
                    if (wgr.c(next.getStartTime()) == wgr.c(next2.getStartTime())) {
                        next.putInt("sleepNum", Math.max(next.getInt("sleep_sum"), next2.getInt("sleep_sum")));
                        it.remove();
                        next = null;
                    } else {
                        int i = next.getInt("sleep_sum");
                        if (i <= 0) {
                            i = next.getInt("bed_sum");
                        }
                        next.putInt("sleepNum", i);
                        next = next2;
                    }
                    if (next != null && !it.hasNext()) {
                        next.putBoolean("hasCoreSleep", true);
                        next.putBoolean("hasCommonSleep", false);
                        int i2 = next.getInt("sleep_sum");
                        if (i2 <= 0) {
                            i2 = next.getInt("bed_sum");
                        }
                        next.putInt("sleepNum", i2);
                    }
                }
            }
            HiHealthData hiHealthData = arrayList.get(arrayList.size() - 1);
            if (!hiHealthData.getBoolean("hasCoreSleep")) {
                hiHealthData.putBoolean("hasCoreSleep", true);
                hiHealthData.putBoolean("hasCommonSleep", false);
                int i3 = hiHealthData.getInt("sleep_sum");
                if (i3 <= 0) {
                    i3 = hiHealthData.getInt("bed_sum");
                }
                hiHealthData.putInt("sleepNum", i3);
            }
        }
        return arrayList;
    }

    private void d(vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setConstantsKey(new String[]{"sleepNum"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setType(new int[]{22100});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(vzoVar.l());
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter("GET_SESSION_SLEEP_DATA");
        hiAggregateOption.setDeviceUuid(vzoVar.j());
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(vzoVar.f()).e();
        ReleaseLogUtil.d("R_SleepOperateImp", "querySleepSource start");
        HiHealthNativeApi.a(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new AnonymousClass5(dataSourceCallback, hiAggregateOption, vzoVar));
    }

    /* JADX INFO: renamed from: wfi$5, reason: invalid class name */
    class AnonymousClass5 implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataSourceCallback f51990a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HiAggregateOption f51992c;
        final /* synthetic */ vzo e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass5(DataSourceCallback dataSourceCallback, HiAggregateOption hiAggregateOption, vzo vzoVar) {
            this.f51990a = dataSourceCallback;
            this.f51992c = hiAggregateOption;
            this.e = vzoVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ReleaseLogUtil.d("R_SleepOperateImp", "querySleepSource end errorCode = " + i);
            if (i != 0) {
                Handler handler = wfi.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.f51990a;
                handler.post(new Runnable() { // from class: wfy
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
            } else {
                if (njy.b(list)) {
                    wfi.this.d.addAll(list);
                }
                wfi.this.c(this.f51992c, this.e, (DataSourceCallback<List<whz>>) this.f51990a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HiAggregateOption hiAggregateOption, vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
        hiAggregateOption.setType(new int[]{22105});
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(vzoVar.f()).e();
        ReleaseLogUtil.d("R_SleepOperateImp", "queryNoonSleepSource start");
        HiHealthNativeApi.a(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new AnonymousClass3(dataSourceCallback, hiAggregateOption, vzoVar));
    }

    /* JADX INFO: renamed from: wfi$3, reason: invalid class name */
    class AnonymousClass3 implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ vzo f51986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HiAggregateOption f51987b;
        final /* synthetic */ DataSourceCallback e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass3(DataSourceCallback dataSourceCallback, HiAggregateOption hiAggregateOption, vzo vzoVar) {
            this.e = dataSourceCallback;
            this.f51987b = hiAggregateOption;
            this.f51986a = vzoVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ReleaseLogUtil.d("R_SleepOperateImp", "queryNoonSleepSource end errorCode = " + i);
            if (i != 0) {
                Handler handler = wfi.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.e;
                handler.post(new Runnable() { // from class: wfz
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
            } else {
                if (njy.b(list)) {
                    wfi.this.i.addAll(list);
                }
                wfi.this.a(this.f51987b, this.f51986a, (DataSourceCallback<List<whz>>) this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HiAggregateOption hiAggregateOption, vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
        hiAggregateOption.setType(new int[]{22000});
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(vzoVar.f()).e();
        ReleaseLogUtil.d("R_SleepOperateImp", "queryCommonSleepBySource start");
        HiHealthNativeApi.a(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new AnonymousClass9(dataSourceCallback));
    }

    /* JADX INFO: renamed from: wfi$9, reason: invalid class name */
    class AnonymousClass9 implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DataSourceCallback f51993b;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass9(DataSourceCallback dataSourceCallback) {
            this.f51993b = dataSourceCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ReleaseLogUtil.d("R_SleepOperateImp", "queryCommonSleepBySource end errorCode = " + i);
            if (i != 0) {
                Handler handler = wfi.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.f51993b;
                handler.post(new Runnable() { // from class: wgd
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
                return;
            }
            if (njy.b(list)) {
                wfi.this.f51982c.addAll(list);
            }
            wfi wfiVar = wfi.this;
            final List<HiHealthData> listD = wfiVar.d((List<HiHealthData>) wfiVar.d, (List<HiHealthData>) wfi.this.f51982c, (List<HiHealthData>) wfi.this.i);
            wfi.this.sortHiHealthDataToDesc(listD);
            Handler handler2 = wfi.this.mHandler;
            final DataSourceCallback dataSourceCallback2 = this.f51993b;
            handler2.post(new Runnable() { // from class: wgg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52021b.b(dataSourceCallback2, listD);
                }
            });
        }

        /* synthetic */ void b(DataSourceCallback dataSourceCallback, List list) {
            dataSourceCallback.onResponse(0, wfi.this.hiHealthDataProcess(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> d(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3) {
        HashMap map = new HashMap(16);
        Map<String, HiHealthData> mapD = d(list);
        Map<String, HiHealthData> mapD2 = d(list3);
        Map<String, HiHealthData> mapD3 = d(list2);
        int i = 0;
        for (Map.Entry<String, HiHealthData> entry : mapD.entrySet()) {
            String key = entry.getKey();
            HiHealthData value = entry.getValue();
            int i2 = value.getInt("sleepNum");
            if (mapD2.containsKey(key)) {
                i = mapD2.get(key).getInt("sleepNum");
            }
            if (i2 == i && mapD3.containsKey(key)) {
                value.putInt("sleepNum", mapD3.get(key).getInt("sleepNum"));
            }
            map.put(key, value);
        }
        for (Map.Entry<String, HiHealthData> entry2 : mapD3.entrySet()) {
            String key2 = entry2.getKey();
            if (!map.containsKey(key2)) {
                map.put(key2, entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(10);
        for (Map.Entry entry3 : map.entrySet()) {
            String str = (String) entry3.getKey();
            HiHealthData hiHealthData = (HiHealthData) entry3.getValue();
            if (mapD.containsKey(str) || mapD2.containsKey(str)) {
                hiHealthData.putBoolean("hasCoreSleep", true);
            }
            if (mapD3.containsKey(str)) {
                hiHealthData.putBoolean("hasCommonSleep", true);
            }
            arrayList.add((HiHealthData) entry3.getValue());
        }
        return arrayList;
    }

    private Map<String, HiHealthData> d(List<HiHealthData> list) {
        HashMap map = new HashMap(16);
        if (!njy.e(list)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            for (HiHealthData hiHealthData : list) {
                map.put(simpleDateFormat.format(Long.valueOf(hiHealthData.getStartTime() + 14400000)), hiHealthData);
            }
        }
        return map;
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate
    public void deleteDatas(List<PrivacyDataModel> list, vzo vzoVar, final DataSourceCallback<Boolean> dataSourceCallback) {
        ArrayList<PrivacyDataModel> arrayList = new ArrayList(10);
        ArrayList<PrivacyDataModel> arrayList2 = new ArrayList(10);
        ArrayList arrayList3 = new ArrayList(10);
        for (PrivacyDataModel privacyDataModel : list) {
            if (privacyDataModel.getBoolean("hasCoreSleep")) {
                arrayList.add(privacyDataModel);
            }
            if (privacyDataModel.getBoolean("hasCommonSleep")) {
                arrayList2.add(privacyDataModel);
            }
            arrayList3.add(privacyDataModel);
        }
        ArrayList arrayList4 = new ArrayList(10);
        c(vzoVar, arrayList3, arrayList4);
        if (njy.b(arrayList)) {
            HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
            hiDataDeleteOption.setTypes(uyr.f50747a);
            ArrayList arrayList5 = new ArrayList(10);
            for (PrivacyDataModel privacyDataModel2 : arrayList) {
                arrayList5.add(new HiTimeInterval(privacyDataModel2.getStartTime(), privacyDataModel2.getEndTime()));
            }
            hiDataDeleteOption.setTimes(arrayList5);
            arrayList4.add(wgu.e(hiDataDeleteOption, vzoVar));
        }
        if (njy.b(arrayList2)) {
            HiDataDeleteOption hiDataDeleteOption2 = new HiDataDeleteOption();
            hiDataDeleteOption2.setTypes(uyr.e);
            ArrayList arrayList6 = new ArrayList(10);
            for (PrivacyDataModel privacyDataModel3 : arrayList2) {
                arrayList6.add(new HiTimeInterval(privacyDataModel3.getStartTime(), privacyDataModel3.getEndTime()));
            }
            hiDataDeleteOption2.setTimes(arrayList6);
            arrayList4.add(wgu.e(hiDataDeleteOption2, vzoVar));
        }
        ReleaseLogUtil.d("R_SleepOperateImp", "deleteHiHealthDataProEx start");
        HiHealthManager.d(BaseApplication.getContext()).deleteHiHealthDataProEx(arrayList4, new HiDeleteListenerEx() { // from class: wfu
            @Override // com.huawei.hihealth.data.listener.HiDeleteListenerEx
            public final void onResult(Map map) {
                this.d.d(dataSourceCallback, map);
            }
        });
    }

    /* synthetic */ void d(final DataSourceCallback dataSourceCallback, Map map) {
        StringBuilder sb = new StringBuilder("deleteHiHealthDataProEx end callbackMap size = ");
        sb.append(map);
        ReleaseLogUtil.d("R_SleepOperateImp", Integer.valueOf(sb.toString() == null ? 0 : map.size()));
        if (map == null || map.size() == 0) {
            this.mHandler.post(new Runnable() { // from class: wfl
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(0, true);
                }
            });
        } else {
            this.mHandler.post(new Runnable() { // from class: wfj
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(1, false);
                }
            });
        }
    }

    private void c(vzo vzoVar, List<PrivacyDataModel> list, List<HiDataDeleteProOption> list2) {
        if (njy.b(list)) {
            HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
            hiDataDeleteOption.setTypes(uyr.d);
            ArrayList arrayList = new ArrayList(10);
            for (PrivacyDataModel privacyDataModel : list) {
                arrayList.add(new HiTimeInterval(privacyDataModel.getStartTime(), privacyDataModel.getEndTime()));
            }
            hiDataDeleteOption.setTimes(arrayList);
            list2.add(wgu.e(hiDataDeleteOption, vzoVar));
        }
    }
}
