package com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.datasourcemanager.util.DivideConditional;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.njy;
import defpackage.paw;
import defpackage.vzo;
import defpackage.wgr;
import defpackage.wgs;
import defpackage.wgt;
import defpackage.whr;
import defpackage.whz;
import defpackage.wig;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseOperate {
    private static final String TAG = "BaseOperate";
    private static final String TAG_RELEASE = "R_BaseOperate";
    protected int pageType;
    public List<HiHealthData> mHiHealthDataListRecursive = new ArrayList(10);
    public List<HiHealthData> mMaxDataList = new ArrayList(10);
    public List<HiHealthData> mMinDataList = new ArrayList(10);
    protected final SimpleDateFormat sfYearMonth = new SimpleDateFormat("yyyy-MM");
    protected Context mContext = BaseApplication.getContext();
    public Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: readCateDouGroupDataBySource, reason: merged with bridge method [inline-methods] */
    public void m1742x104e9445(vzo vzoVar, DataSourceCallback<Map<Integer, List<whr>>> dataSourceCallback) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: readCateDouGroupDataNoSource, reason: merged with bridge method [inline-methods] */
    public void m1743x17777686(vzo vzoVar, DataSourceCallback<Map<Integer, List<whr>>> dataSourceCallback) {
    }

    public void readCategoryGroupData(vzo vzoVar, DataSourceCallback<Map<Integer, List<whz>>> dataSourceCallback) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: readDayDataBySource, reason: merged with bridge method [inline-methods] */
    public void m1744xa7339313(vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: readDoubleGroupDataBySource, reason: merged with bridge method [inline-methods] */
    public void m1747x53f041a1(vzo vzoVar, DataSourceCallback<List<whr>> dataSourceCallback) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: readDoubleGroupDataNoSource, reason: merged with bridge method [inline-methods] */
    public void m1748x5b1923e2(vzo vzoVar, DataSourceCallback<List<whr>> dataSourceCallback) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: readGroupDataBySource, reason: merged with bridge method [inline-methods] */
    public void m1750xdec3f9b0(vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: readGroupDataNoSource, reason: merged with bridge method [inline-methods] */
    public void m1751xe5ecdbf1(vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
    }

    protected void setVarOfHiHealthDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
    }

    protected void setVarOfReadByMonthByAppSource(vzo vzoVar) {
    }

    protected void setVarOfReadByMonthByDeviceSource(vzo vzoVar) {
    }

    protected void setVarOfReadByMonthNoSource(vzo vzoVar) {
    }

    protected void setVarOfReadInOneDayByAppSource(vzo vzoVar) {
    }

    protected void setVarOfReadInOneDayByDeviceSource(vzo vzoVar) {
    }

    protected void setVarOfReadInOneDayNoSource(vzo vzoVar) {
    }

    protected void setVarOfRecordDataProcess(HiHealthData hiHealthData, PrivacyDataModel privacyDataModel) {
    }

    public void readByMonthNoSource(DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        vzoVar.d(1);
        vzoVar.b(3);
        vzoVar.a(0);
        setVarOfReadByMonthNoSource(vzoVar);
        aggregateHiHealthDataByMonth(vzoVar, dataSourceCallback);
    }

    public void readGroupData(final vzo vzoVar, final DataSourceCallback<List<whz>> dataSourceCallback) {
        if (vzoVar == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "readGroupData readOption is null");
            dataSourceCallback.onResponse(1, new ArrayList());
            return;
        }
        int iL = vzoVar.l();
        if (iL == 1 || iL == 2 || iL == 3) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wag
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51776a.m1750xdec3f9b0(vzoVar, dataSourceCallback);
                }
            });
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wak
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.m1751xe5ecdbf1(vzoVar, dataSourceCallback);
                }
            });
        }
    }

    public void readDoubleGroupData(final vzo vzoVar, final DataSourceCallback<List<whr>> dataSourceCallback) {
        if (vzoVar == null) {
            LogUtil.j(TAG, "readDoubleGroupData readOption is null");
            dataSourceCallback.onResponse(1, new ArrayList());
            return;
        }
        int iL = vzoVar.l();
        if (iL == 1 || iL == 2 || iL == 3) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wae
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.m1747x53f041a1(vzoVar, dataSourceCallback);
                }
            });
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wam
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51783b.m1748x5b1923e2(vzoVar, dataSourceCallback);
                }
            });
        }
    }

    public void readCategoryDoubleGroupData(final vzo vzoVar, final DataSourceCallback<Map<Integer, List<whr>>> dataSourceCallback) {
        if (vzoVar == null) {
            LogUtil.j(TAG, "readCategoryDoubleGroupData readOption is null");
            dataSourceCallback.onResponse(1, new HashMap());
            return;
        }
        int iL = vzoVar.l();
        if (iL == 1 || iL == 2 || iL == 3) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: waf
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.m1742x104e9445(vzoVar, dataSourceCallback);
                }
            });
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wad
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.m1743x17777686(vzoVar, dataSourceCallback);
                }
            });
        }
    }

    public void readDayData(final vzo vzoVar, final DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        if (vzoVar == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "readGroupData readOption is null");
            dataSourceCallback.onResponse(1, new ArrayList());
            return;
        }
        int iL = vzoVar.l();
        if (iL == 1 || iL == 2 || iL == 3) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wav
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51797c.m1744xa7339313(vzoVar, dataSourceCallback);
                }
            });
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wau
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.m1745xae5c7554(vzoVar, dataSourceCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: readDayDataNoSource, reason: merged with bridge method [inline-methods] */
    public void m1745xae5c7554(final vzo vzoVar, final DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        this.mHiHealthDataListRecursive.clear();
        setVarOfReadInOneDayNoSource(vzoVar);
        ReleaseLogUtil.d(TAG_RELEASE, "readDayDataNoSource start");
        readInOneDay(vzoVar, new DataSourceCallback() { // from class: vzt
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.e.m1746x76c6a262(dataSourceCallback, vzoVar, i, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$readDayDataNoSource$10$com-huawei-ui-main-stories-privacy-datasourcemanager-operate-data-BaseOperate, reason: not valid java name */
    public /* synthetic */ void m1746x76c6a262(final DataSourceCallback dataSourceCallback, vzo vzoVar, final int i, List list) {
        ReleaseLogUtil.d(TAG_RELEASE, "readDayDataNoSource end resultCode = ", Integer.valueOf(i));
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: wat
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        final List<PrivacyDataModel> listProResultOfReadInOneDayNoSource = proResultOfReadInOneDayNoSource(list);
        if (vzoVar.n()) {
            setIconResource(listProResultOfReadInOneDayNoSource);
        }
        this.mHandler.post(new Runnable() { // from class: was
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(i, listProResultOfReadInOneDayNoSource);
            }
        });
    }

    protected List<PrivacyDataModel> proResultOfReadInOneDayNoSource(List<HiHealthData> list) {
        return new ArrayList();
    }

    public void deleteDatas(List<PrivacyDataModel> list, vzo vzoVar, final DataSourceCallback<Boolean> dataSourceCallback) {
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTypes(getDeleteDataTypes(vzoVar));
        ArrayList arrayList = new ArrayList(10);
        for (PrivacyDataModel privacyDataModel : list) {
            arrayList.add(new HiTimeInterval(privacyDataModel.getStartTime(), privacyDataModel.getEndTime()));
        }
        hiDataDeleteOption.setTimes(arrayList);
        HiDataDeleteProOption hiDataDeleteProOptionC = HiDataDeleteProOption.builder().c(hiDataDeleteOption).b(Integer.valueOf(vzoVar.a())).d(0).a(vzoVar.j()).b(vzoVar.f()).c();
        ReleaseLogUtil.d(TAG_RELEASE, "deleteData start");
        HiHealthManager.d(BaseApplication.getContext()).deleteHiHealthDataPro(hiDataDeleteProOptionC, new HiDataOperateListener() { // from class: vzy
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                this.f51765b.m1737xfa38a593(dataSourceCallback, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$deleteDatas$13$com-huawei-ui-main-stories-privacy-datasourcemanager-operate-data-BaseOperate, reason: not valid java name */
    public /* synthetic */ void m1737xfa38a593(final DataSourceCallback dataSourceCallback, int i, Object obj) {
        ReleaseLogUtil.d(TAG_RELEASE, "deleteData end errorCode = ", Integer.valueOf(i));
        if (i == 0) {
            this.mHandler.post(new Runnable() { // from class: vzz
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(0, true);
                }
            });
        } else {
            this.mHandler.post(new Runnable() { // from class: wab
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(1, false);
                }
            });
        }
    }

    protected int[] getDeleteDataTypes(vzo vzoVar) {
        return new int[0];
    }

    public void readByMonthByDeviceSource(String str, int i, String str2, DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        vzoVar.d(1);
        vzoVar.b(3);
        vzoVar.e(str);
        vzoVar.a(i);
        vzoVar.e(true);
        setVarOfReadByMonthByDeviceSource(vzoVar);
        if (!wgr.d(str2, str)) {
            aggregateHiHealthDataByMonth(vzoVar, dataSourceCallback);
        } else {
            vzoVar.c(str2);
            aggregateHiHealthDataProByMonth(vzoVar, dataSourceCallback);
        }
    }

    public void readByMonthByAppSource(String str, DataSourceCallback<List<whz>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        vzoVar.c(str);
        vzoVar.d(1);
        vzoVar.b(3);
        vzoVar.a(1);
        setVarOfReadByMonthByAppSource(vzoVar);
        aggregateHiHealthDataProByMonth(vzoVar, dataSourceCallback);
    }

    public void readInOneDayByDeviceSource(long j, String str, final DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        vzo vzoVar = new vzo();
        this.mHiHealthDataListRecursive.clear();
        vzoVar.a(wgr.d(j));
        vzoVar.e(wgr.b(j));
        vzoVar.a(2);
        vzoVar.e(str);
        vzoVar.e(true);
        setVarOfReadInOneDayByDeviceSource(vzoVar);
        ReleaseLogUtil.d(TAG_RELEASE, "readInOneDayByDeviceSource start");
        readInOneDay(vzoVar, new DataSourceCallback() { // from class: wai
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.d.m1753xbaca70c1(dataSourceCallback, i, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$readInOneDayByDeviceSource$16$com-huawei-ui-main-stories-privacy-datasourcemanager-operate-data-BaseOperate, reason: not valid java name */
    public /* synthetic */ void m1753xbaca70c1(final DataSourceCallback dataSourceCallback, final int i, List list) {
        ReleaseLogUtil.d(TAG_RELEASE, "readInOneDayByDeviceSource end resultCode = ", Integer.valueOf(i));
        if (i != 0 || njy.e(list)) {
            this.mHandler.post(new Runnable() { // from class: vzr
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
        } else {
            final List<PrivacyDataModel> listProResultOfReadInOneDayNoSource = proResultOfReadInOneDayNoSource(list);
            this.mHandler.post(new Runnable() { // from class: wah
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, listProResultOfReadInOneDayNoSource);
                }
            });
        }
    }

    public void readInOneDayByAppSource(long j, String str, String str2, int i, final DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        final vzo vzoVar = new vzo();
        this.mHiHealthDataListRecursive.clear();
        vzoVar.a(wgr.d(j));
        vzoVar.e(wgr.b(j));
        vzoVar.a(i);
        vzoVar.c(str2);
        vzoVar.e(str);
        setVarOfReadInOneDayByAppSource(vzoVar);
        ReleaseLogUtil.d(TAG_RELEASE, "readInOneDayByAppSource start");
        readHiHealthDataPro(vzoVar, new DataSourceCallback() { // from class: wap
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i2, Object obj) {
                this.f51788a.m1752xfe11d3c3(dataSourceCallback, vzoVar, i2, (SparseArray) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$readInOneDayByAppSource$19$com-huawei-ui-main-stories-privacy-datasourcemanager-operate-data-BaseOperate, reason: not valid java name */
    public /* synthetic */ void m1752xfe11d3c3(final DataSourceCallback dataSourceCallback, vzo vzoVar, final int i, SparseArray sparseArray) {
        ReleaseLogUtil.d(TAG_RELEASE, "readInOneDayByAppSource end resultCode = ", Integer.valueOf(i));
        if (i != 0 || sparseArray == null || sparseArray.size() == 0) {
            this.mHandler.post(new Runnable() { // from class: war
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
        } else {
            final List<PrivacyDataModel> listProResultOfReadInOneDayNoSource = proResultOfReadInOneDayNoSource(dealResultForReadInOneDay(sparseArray, vzoVar));
            this.mHandler.post(new Runnable() { // from class: wan
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, listProResultOfReadInOneDayNoSource);
                }
            });
        }
    }

    protected void aggregateHiHealthDataByMonth(vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setConstantsKey(vzoVar.e());
        hiAggregateOption.setAggregateType(vzoVar.d());
        hiAggregateOption.setType(vzoVar.o());
        hiAggregateOption.setGroupUnitType(vzoVar.g());
        hiAggregateOption.setReadType(vzoVar.l());
        hiAggregateOption.setSortOrder(1);
        if (vzoVar.k()) {
            hiAggregateOption.setDeviceUuid(vzoVar.j());
        }
        ReleaseLogUtil.d(TAG_RELEASE, "aggregateHiHealthDataByMonth start");
        HiHealthManager.d(this.mContext).aggregateHiHealthData(hiAggregateOption, new AnonymousClass1(dataSourceCallback));
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate$1, reason: invalid class name */
    public class AnonymousClass1 implements HiAggregateListener {
        final /* synthetic */ DataSourceCallback d;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass1(DataSourceCallback dataSourceCallback) {
            this.d = dataSourceCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "aggregateHiHealthDataByMonth end errorCode = " + i);
            if (i != 0) {
                Handler handler = BaseOperate.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.d;
                handler.post(new Runnable() { // from class: waz
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
            } else if (njy.e(list)) {
                Handler handler2 = BaseOperate.this.mHandler;
                final DataSourceCallback dataSourceCallback2 = this.d;
                handler2.post(new Runnable() { // from class: wax
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback2.onResponse(0, new ArrayList());
                    }
                });
            } else {
                final List<whz> listHiHealthDataProcess = BaseOperate.this.hiHealthDataProcess(list);
                Handler handler3 = BaseOperate.this.mHandler;
                final DataSourceCallback dataSourceCallback3 = this.d;
                handler3.post(new Runnable() { // from class: wbb
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback3.onResponse(0, listHiHealthDataProcess);
                    }
                });
            }
        }
    }

    protected void aggregateHiHealthDataProByMonth(vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setConstantsKey(vzoVar.e());
        hiAggregateOption.setAggregateType(vzoVar.d());
        hiAggregateOption.setType(vzoVar.o());
        hiAggregateOption.setGroupUnitType(vzoVar.g());
        hiAggregateOption.setReadType(vzoVar.l());
        hiAggregateOption.setDeviceUuid(vzoVar.j());
        hiAggregateOption.setSortOrder(1);
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(vzoVar.f()).e();
        ReleaseLogUtil.d(TAG_RELEASE, "aggregateHiHealthDataProByMonth start");
        HiHealthManager.d(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new AnonymousClass5(dataSourceCallback));
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate$5, reason: invalid class name */
    public class AnonymousClass5 implements HiAggregateListener {
        final /* synthetic */ DataSourceCallback e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass5(DataSourceCallback dataSourceCallback) {
            this.e = dataSourceCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "aggregateHiHealthDataProByMonth end errorCode = " + i);
            if (i != 0) {
                Handler handler = BaseOperate.this.mHandler;
                final DataSourceCallback dataSourceCallback = this.e;
                handler.post(new Runnable() { // from class: way
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(1, new ArrayList());
                    }
                });
            } else if (njy.e(list)) {
                Handler handler2 = BaseOperate.this.mHandler;
                final DataSourceCallback dataSourceCallback2 = this.e;
                handler2.post(new Runnable() { // from class: wba
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback2.onResponse(0, new ArrayList());
                    }
                });
            } else {
                final List<whz> listHiHealthDataProcess = BaseOperate.this.hiHealthDataProcess(list);
                Handler handler3 = BaseOperate.this.mHandler;
                final DataSourceCallback dataSourceCallback3 = this.e;
                handler3.post(new Runnable() { // from class: wbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback3.onResponse(0, listHiHealthDataProcess);
                    }
                });
            }
        }
    }

    public void sortHiHealthDataToDesc(List<HiHealthData> list) {
        HiHealthData[] hiHealthDataArr = (HiHealthData[]) list.toArray(new HiHealthData[0]);
        Arrays.sort(hiHealthDataArr, new Comparator() { // from class: waj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((HiHealthData) obj2).getStartTime(), ((HiHealthData) obj).getStartTime());
            }
        });
        ListIterator<HiHealthData> listIterator = list.listIterator();
        for (HiHealthData hiHealthData : hiHealthDataArr) {
            listIterator.next();
            listIterator.set(hiHealthData);
        }
    }

    protected void readInOneDay(final vzo vzoVar, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setReadType(vzoVar.l());
        hiDataReadOption.setStartTime(vzoVar.m());
        hiDataReadOption.setEndTime(vzoVar.h());
        hiDataReadOption.setType(vzoVar.o());
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(vzoVar.b());
        if (vzoVar.k()) {
            hiDataReadOption.setDeviceUuid(vzoVar.j());
        }
        HiHealthNativeApi hiHealthNativeApiA = HiHealthNativeApi.a(this.mContext);
        ReleaseLogUtil.d(TAG_RELEASE, "readInOneDay start");
        hiHealthNativeApiA.readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "readInOneDay end errorCode = " + i + ", anchor = " + i2);
                if (i != 0) {
                    dataSourceCallback.onResponse(1, new ArrayList());
                    return;
                }
                SparseArray<List<HiHealthData>> sparseArray = new SparseArray<>();
                if (obj instanceof SparseArray) {
                    sparseArray = (SparseArray) obj;
                }
                if (sparseArray.size() == 0) {
                    dataSourceCallback.onResponse(0, new ArrayList());
                } else {
                    dataSourceCallback.onResponse(0, BaseOperate.this.dealResultForReadInOneDay(sparseArray, vzoVar));
                }
            }
        });
    }

    public void readHiHealthDataProInOneDay(final vzo vzoVar, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setReadType(vzoVar.l());
        hiDataReadOption.setStartTime(vzoVar.m());
        hiDataReadOption.setEndTime(vzoVar.h());
        hiDataReadOption.setType(vzoVar.o());
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setDeviceUuid(vzoVar.j());
        hiDataReadOption.setCount(vzoVar.b());
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(hiDataReadOption).a(vzoVar.f()).b();
        ReleaseLogUtil.d(TAG_RELEASE, "readHiHealthDataProInOneDay start");
        HiHealthNativeApi.a(this.mContext).readHiHealthDataPro(hiDataReadProOptionB, new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "readHiHealthDataProInOneDay end errorCode = " + i + ", anchor = " + i2);
                if (i != 0) {
                    dataSourceCallback.onResponse(1, null);
                    return;
                }
                SparseArray<List<HiHealthData>> sparseArray = new SparseArray<>();
                if (obj instanceof SparseArray) {
                    sparseArray = (SparseArray) obj;
                }
                List<HiHealthData> listDealResultForReadInOneDay = BaseOperate.this.dealResultForReadInOneDay(sparseArray, vzoVar);
                if (njy.e(listDealResultForReadInOneDay) || listDealResultForReadInOneDay.size() < vzoVar.b() || listDealResultForReadInOneDay.get(listDealResultForReadInOneDay.size() - 1).getStartTime() <= vzoVar.m()) {
                    dataSourceCallback.onResponse(0, BaseOperate.this.mHiHealthDataListRecursive);
                } else {
                    vzoVar.e(listDealResultForReadInOneDay.get(listDealResultForReadInOneDay.size() - 1).getStartTime() - 1);
                    BaseOperate.this.readHiHealthDataProInOneDay(vzoVar, dataSourceCallback);
                }
            }
        });
    }

    public List<HiHealthData> dealResultForReadInOneDay(SparseArray<List<HiHealthData>> sparseArray, vzo vzoVar) {
        List<HiHealthData> list = sparseArray.get(vzoVar.o()[0]);
        if (njy.b(list)) {
            this.mHiHealthDataListRecursive.addAll(list);
        }
        return list;
    }

    protected List<PrivacyDataModel> convertToDataModels(List<HiHealthData> list, vzo vzoVar) {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(list)) {
            Iterator<HiHealthData> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(convertToDataModel(it.next(), vzoVar));
            }
        }
        return arrayList;
    }

    protected PrivacyDataModel convertToDataModel(HiHealthData hiHealthData, vzo vzoVar) {
        PrivacyDataModel privacyDataModel = new PrivacyDataModel();
        if (hiHealthData == null) {
            return privacyDataModel;
        }
        privacyDataModel.setPageType(this.pageType);
        privacyDataModel.setDataTitle(wgr.a(this.pageType, hiHealthData, vzoVar));
        privacyDataModel.setDataDesc(wgr.e(this.pageType, hiHealthData, vzoVar));
        privacyDataModel.setContentValues(hiHealthData.getValueHolder());
        privacyDataModel.setStartTime(hiHealthData.getStartTime());
        privacyDataModel.setEndTime(hiHealthData.getEndTime());
        privacyDataModel.setModifyTime(hiHealthData.getModifiedTime());
        privacyDataModel.setType(hiHealthData.getType());
        privacyDataModel.setClientId(hiHealthData.getClientId());
        return privacyDataModel;
    }

    protected List<PrivacyDataModel> recordDataProcess(List<HiHealthData> list, int i) {
        ArrayList arrayList = new ArrayList(10);
        if (list != null) {
            for (HiHealthData hiHealthData : list) {
                PrivacyDataModel privacyDataModel = new PrivacyDataModel();
                privacyDataModel.setStartTime(hiHealthData.getStartTime());
                privacyDataModel.setEndTime(hiHealthData.getEndTime());
                privacyDataModel.setModifyTime(hiHealthData.getModifiedTime());
                privacyDataModel.setDataDesc(wgr.a(hiHealthData, i));
                privacyDataModel.setPageType(this.pageType);
                privacyDataModel.setType(hiHealthData.getType());
                privacyDataModel.setClientId(hiHealthData.getClientId());
                setVarOfRecordDataProcess(hiHealthData, privacyDataModel);
                arrayList.add(privacyDataModel);
            }
        }
        return arrayList;
    }

    public List<whz> hiHealthDataProcess(List<HiHealthData> list) {
        List<List<PrivacyDataModel>> listC = wgs.c(transPrivacyDataModels(list), new DivideConditional() { // from class: vzu
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.util.DivideConditional
            public final boolean isDivide(Object obj, Object obj2) {
                return this.f51760c.m1741x82902de6((PrivacyDataModel) obj, (PrivacyDataModel) obj2);
            }
        });
        ArrayList arrayList = new ArrayList(10);
        for (List<PrivacyDataModel> list2 : listC) {
            if (!njy.e(list2)) {
                whz whzVar = new whz();
                whzVar.e(list2);
                if (this.pageType == 103) {
                    whzVar.b(paw.d(list2.get(0).getStartTime() + 14400000, 0));
                } else {
                    whzVar.b(paw.d(list2.get(0).getStartTime(), 0));
                }
                arrayList.add(whzVar);
            }
        }
        LogUtil.a(TAG, "hiHealthDataProcess end, hiHealthDataProcess list size=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    /* JADX INFO: renamed from: lambda$hiHealthDataProcess$21$com-huawei-ui-main-stories-privacy-datasourcemanager-operate-data-BaseOperate, reason: not valid java name */
    public /* synthetic */ boolean m1741x82902de6(PrivacyDataModel privacyDataModel, PrivacyDataModel privacyDataModel2) {
        boolean zB;
        if (this.pageType == 103) {
            zB = wig.b(privacyDataModel.getStartTime() + 14400000, privacyDataModel2.getStartTime() + 14400000);
        } else {
            zB = wig.b(privacyDataModel.getStartTime(), privacyDataModel2.getStartTime());
        }
        return !zB;
    }

    private List<PrivacyDataModel> transPrivacyDataModels(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            PrivacyDataModel privacyDataModel = new PrivacyDataModel();
            privacyDataModel.setStartTime(hiHealthData.getStartTime());
            privacyDataModel.setEndTime(hiHealthData.getEndTime());
            privacyDataModel.setModifyTime(hiHealthData.getModifiedTime());
            privacyDataModel.setPageType(this.pageType);
            privacyDataModel.setClientId(hiHealthData.getClientId());
            setVarOfHiHealthDataProcess(hiHealthData, privacyDataModel);
            arrayList.add(privacyDataModel);
        }
        return arrayList;
    }

    protected void readForOneDayDatas(final vzo vzoVar, final DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        readHiHealthDataPro(vzoVar, new DataSourceCallback() { // from class: wac
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
            public final void onResponse(int i, Object obj) {
                this.f51769b.m1749x8945e7f7(dataSourceCallback, vzoVar, i, (SparseArray) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$readForOneDayDatas$24$com-huawei-ui-main-stories-privacy-datasourcemanager-operate-data-BaseOperate, reason: not valid java name */
    public /* synthetic */ void m1749x8945e7f7(final DataSourceCallback dataSourceCallback, vzo vzoVar, final int i, SparseArray sparseArray) {
        if (i != 0 || sparseArray == null || sparseArray.size() == 0) {
            this.mHandler.post(new Runnable() { // from class: vzw
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, new ArrayList());
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        for (int i2 : vzoVar.o()) {
            if (sparseArray.get(i2) != null) {
                arrayList.addAll((Collection) sparseArray.get(i2));
            }
        }
        sortHiHealthDataToDesc(arrayList);
        final List<PrivacyDataModel> listProResultOfReadInOneDayNoSource = proResultOfReadInOneDayNoSource(arrayList);
        if (vzoVar.n()) {
            setIconResource(listProResultOfReadInOneDayNoSource);
        }
        this.mHandler.post(new Runnable() { // from class: vzx
            @Override // java.lang.Runnable
            public final void run() {
                dataSourceCallback.onResponse(i, listProResultOfReadInOneDayNoSource);
            }
        });
    }

    protected void readHiHealthDataPro(vzo vzoVar, final DataSourceCallback<SparseArray<List<HiHealthData>>> dataSourceCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(vzoVar.o());
        hiDataReadOption.setStartTime(vzoVar.m());
        hiDataReadOption.setEndTime(vzoVar.h());
        hiDataReadOption.setReadType(vzoVar.l());
        hiDataReadOption.setDeviceUuid(vzoVar.j());
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(hiDataReadOption).a(vzoVar.f()).b();
        ReleaseLogUtil.d(TAG_RELEASE, "readHiHealthDataPro start");
        HiHealthNativeApi.a(this.mContext).readHiHealthDataPro(hiDataReadProOptionB, new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate.6
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "readHiHealthDataPro end errorCode = " + i);
                if (i != 0) {
                    dataSourceCallback.onResponse(1, new SparseArray());
                    return;
                }
                SparseArray sparseArray = new SparseArray();
                if (obj instanceof SparseArray) {
                    sparseArray = (SparseArray) obj;
                }
                dataSourceCallback.onResponse(0, sparseArray);
            }
        });
    }

    public void readHiHealthDataPro(HiDataReadProOption hiDataReadProOption, final DataSourceCallback<SparseArray<List<HiHealthData>>> dataSourceCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "readHiHealthDataPro start");
        HiHealthNativeApi.a(this.mContext).readHiHealthDataPro(hiDataReadProOption, new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate.7
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "readHiHealthDataPro end errorCode = ", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof SparseArray)) {
                    dataSourceCallback.onResponse(1, new SparseArray());
                } else {
                    dataSourceCallback.onResponse(0, (SparseArray) obj);
                }
            }
        });
    }

    protected List<HiHealthData> mergeMaxMinList(List<HiHealthData> list, List<HiHealthData> list2) {
        return mergeMaxMinList(list, list2, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    protected List<HiHealthData> mergeMaxMinList(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3, List<HiHealthData> list4) {
        List<HiHealthData> listHandleLongerList;
        List<HiHealthData> listHandleLongerList2;
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: vzs
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Long) obj2).compareTo((Long) obj);
            }
        });
        if (njy.e(list) || njy.e(list2)) {
            listHandleLongerList = list;
            listHandleLongerList2 = list2;
        } else if (list.size() > list2.size()) {
            listHandleLongerList2 = list2;
            listHandleLongerList = handleLongerList(list, list2);
        } else if (list.size() < list2.size()) {
            listHandleLongerList = list;
            listHandleLongerList2 = handleLongerList(list2, listHandleLongerList);
        } else {
            listHandleLongerList = list;
            listHandleLongerList2 = list2;
        }
        int i = 0;
        if (!njy.e(listHandleLongerList) && !njy.e(listHandleLongerList2) && listHandleLongerList.size() == listHandleLongerList2.size()) {
            for (int i2 = 0; i2 < listHandleLongerList.size(); i2++) {
                HiHealthData hiHealthData = new HiHealthData();
                HiHealthData hiHealthData2 = listHandleLongerList.get(i2);
                HiHealthData hiHealthData3 = listHandleLongerList2.get(i2);
                long jD = wgr.d(hiHealthData2.getStartTime());
                hiHealthData.setStartTime(jD);
                hiHealthData.setEndTime(wgr.b(hiHealthData2.getEndTime()));
                hiHealthData.setModifiedTime(hiHealthData2.getModifiedTime());
                hiHealthData.putDouble("maxTemperature", hiHealthData2.getValue());
                hiHealthData.putDouble("minTemperature", hiHealthData3.getValue());
                LogUtil.d(TAG, "mergeMaxMinList base key=", Long.valueOf(jD), ", data=", hiHealthData);
                treeMap.put(Long.valueOf(jD), hiHealthData);
            }
        }
        ReleaseLogUtil.d(TAG_RELEASE, "mergeMaxMinList max=", Integer.valueOf(listHandleLongerList == null ? 0 : listHandleLongerList.size()), ", min=", Integer.valueOf(listHandleLongerList2 == null ? 0 : listHandleLongerList2.size()), ", maxSus=", Integer.valueOf(list3 == 0 ? 0 : list3.size()), ", minSus=", Integer.valueOf(list4 == 0 ? 0 : list4.size()), ", baseMerge=", Integer.valueOf(treeMap.size()));
        if (!njy.e(list3) && !njy.e(list4) && list3.size() == list4.size()) {
            while (i < list3.size()) {
                HiHealthData hiHealthData4 = list3.get(i);
                HiHealthData hiHealthData5 = list4.get(i);
                double value = hiHealthData4.getValue();
                double value2 = hiHealthData5.getValue();
                long jD2 = wgr.d(hiHealthData4.getStartTime());
                HiHealthData hiHealthData6 = (HiHealthData) treeMap.get(Long.valueOf(jD2));
                if (hiHealthData6 == null) {
                    HiHealthData hiHealthData7 = new HiHealthData();
                    hiHealthData7.setTimeInterval(jD2, wgr.b(hiHealthData4.getEndTime()));
                    hiHealthData7.setModifiedTime(hiHealthData4.getModifiedTime());
                    if (value == value2) {
                        hiHealthData7.putDouble("singleSuspectBodyTemperature", value);
                        LogUtil.d(TAG, "mergeMaxMinList singleSuspect: ", Double.valueOf(value));
                    } else {
                        hiHealthData7.putDouble("maxTemperature", value);
                        hiHealthData7.putDouble("minTemperature", value2);
                        LogUtil.d(TAG, "mergeMaxMinList onlySuspect: max=", Double.valueOf(value), ", min=", Double.valueOf(value2));
                    }
                    treeMap.put(Long.valueOf(jD2), hiHealthData7);
                } else {
                    if (value > hiHealthData6.getDouble("maxTemperature")) {
                        hiHealthData6.putDouble("maxTemperature", value);
                    }
                    if (value2 < hiHealthData6.getDouble("minTemperature")) {
                        hiHealthData6.putDouble("minTemperature", value2);
                    }
                    LogUtil.d(TAG, "mergeMaxMinList mixed: max=", Double.valueOf(hiHealthData6.getDouble("maxTemperature")), ", min=", Double.valueOf(hiHealthData6.getDouble("minTemperature")), ", susMax=", Double.valueOf(value), ", susMin=", Double.valueOf(value2));
                }
                i++;
                list3 = list3;
                list4 = list4;
            }
        }
        return new ArrayList(treeMap.values());
    }

    private List<HiHealthData> handleLongerList(List<HiHealthData> list, List<HiHealthData> list2) {
        final HashSet hashSet = new HashSet();
        Iterator<HiHealthData> it = list2.iterator();
        while (it.hasNext()) {
            hashSet.add(Long.valueOf(it.next().getDay()));
        }
        return (List) list.stream().filter(new Predicate() { // from class: waa
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return hashSet.contains(Long.valueOf(((HiHealthData) obj).getDay()));
            }
        }).collect(Collectors.toList());
    }

    protected void aggregateProMaxAndMin(vzo vzoVar, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(vzoVar.m());
        hiAggregateOption.setEndTime(vzoVar.h());
        hiAggregateOption.setConstantsKey(vzoVar.e());
        hiAggregateOption.setAggregateType(vzoVar.d());
        hiAggregateOption.setType(vzoVar.o());
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(vzoVar.l());
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setDeviceUuid(vzoVar.j());
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(vzoVar.f()).e();
        ReleaseLogUtil.d(TAG_RELEASE, "aggregateProMaxAndMin start");
        HiHealthNativeApi.a(this.mContext).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new HiAggregateListener() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate.10
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "aggregateProMaxAndMin end errorCode = " + i);
                if (i != 0) {
                    dataSourceCallback.onResponse(1, new ArrayList());
                } else if (njy.e(list)) {
                    dataSourceCallback.onResponse(0, new ArrayList());
                } else {
                    dataSourceCallback.onResponse(0, list);
                }
            }
        });
    }

    protected void transKeyToValue(List<HiHealthData> list, List<HiHealthData> list2, vzo vzoVar) {
        for (HiHealthData hiHealthData : list) {
            HiHealthData hiHealthData2 = new HiHealthData();
            hiHealthData2.setValue(hiHealthData.getDouble(vzoVar.e()[0]));
            hiHealthData2.setStartTime(hiHealthData.getStartTime());
            hiHealthData2.setEndTime(hiHealthData.getEndTime());
            hiHealthData2.setModifiedTime(hiHealthData.getModifiedTime());
            list2.add(hiHealthData2);
        }
    }

    protected List<whz> groupByMonth(List<PrivacyDataModel> list) {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(list)) {
            for (List<PrivacyDataModel> list2 : wgs.c(list, new DivideConditional() { // from class: vzv
                @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.util.DivideConditional
                public final boolean isDivide(Object obj, Object obj2) {
                    return this.f51761c.m1740x24a5850((PrivacyDataModel) obj, (PrivacyDataModel) obj2);
                }
            })) {
                whz whzVar = new whz();
                whzVar.e(list2);
                if (this.pageType == 103) {
                    whzVar.b(paw.d(list2.get(0).getStartTime() + 14400000, 0));
                } else {
                    whzVar.b(paw.d(list2.get(0).getStartTime(), 0));
                }
                arrayList.add(whzVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lambda$groupByMonth$27$com-huawei-ui-main-stories-privacy-datasourcemanager-operate-data-BaseOperate, reason: not valid java name */
    public /* synthetic */ boolean m1740x24a5850(PrivacyDataModel privacyDataModel, PrivacyDataModel privacyDataModel2) {
        boolean zB;
        if (this.pageType == 103) {
            zB = wig.b(privacyDataModel.getStartTime() + 14400000, privacyDataModel2.getStartTime() + 14400000);
        } else {
            zB = wig.b(privacyDataModel.getStartTime(), privacyDataModel2.getStartTime());
        }
        return !zB;
    }

    protected List<whz> groupByDay(List<PrivacyDataModel> list) {
        List<List<PrivacyDataModel>> listC = wgs.c(list, new DivideConditional() { // from class: waw
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.util.DivideConditional
            public final boolean isDivide(Object obj, Object obj2) {
                return BaseOperate.lambda$groupByDay$28((PrivacyDataModel) obj, (PrivacyDataModel) obj2);
            }
        });
        ArrayList arrayList = new ArrayList(10);
        for (List<PrivacyDataModel> list2 : listC) {
            if (!njy.e(list2)) {
                whz whzVar = new whz();
                whzVar.e(list2);
                whzVar.b(paw.d(list2.get(0).getStartTime(), Integer.MAX_VALUE));
                whzVar.c(list2.get(0).getStartTime());
                arrayList.add(whzVar);
            }
        }
        LogUtil.a(TAG, "groupByDay end, groupByDay list size=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static /* synthetic */ boolean lambda$groupByDay$28(PrivacyDataModel privacyDataModel, PrivacyDataModel privacyDataModel2) {
        return !wig.d(privacyDataModel.getStartTime(), privacyDataModel2.getStartTime());
    }

    protected List<whr> doubleGroupSort(List<whz> list) {
        List<List<whz>> listC = wgs.c(list, new DivideConditional() { // from class: waq
            @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.util.DivideConditional
            public final boolean isDivide(Object obj, Object obj2) {
                return this.e.m1738x375d136a((whz) obj, (whz) obj2);
            }
        });
        ArrayList arrayList = new ArrayList(10);
        for (List<whz> list2 : listC) {
            if (!njy.e(list2)) {
                whr whrVar = new whr();
                whrVar.c(list2);
                whrVar.a(paw.d(list2.get(0).a(), 0));
                arrayList.add(whrVar);
            }
        }
        LogUtil.a(TAG, "doubleGroupSort end, doubleGroupSort list size=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    /* JADX INFO: renamed from: lambda$doubleGroupSort$29$com-huawei-ui-main-stories-privacy-datasourcemanager-operate-data-BaseOperate, reason: not valid java name */
    public /* synthetic */ boolean m1738x375d136a(whz whzVar, whz whzVar2) {
        return !this.sfYearMonth.format(Long.valueOf(whzVar.a())).equals(this.sfYearMonth.format(Long.valueOf(whzVar2.a())));
    }

    protected List<whr> doubleGroupForCache(List<whz> list, vzo vzoVar) {
        ArrayList arrayList = new ArrayList(10);
        whr whrVar = new whr();
        if (njy.e(list)) {
            return arrayList;
        }
        long jM = vzoVar.m();
        long jH = vzoVar.h();
        if (isSameYear(jM, jH)) {
            whrVar.a(paw.d(jM, Integer.MIN_VALUE) + Constants.LINK + paw.d(jH, 1));
        } else {
            whrVar.a(paw.d(jM, Integer.MIN_VALUE) + Constants.LINK + paw.d(jH, Integer.MIN_VALUE));
        }
        whrVar.c(list);
        arrayList.add(whrVar);
        return arrayList;
    }

    private boolean isSameYear(long j, long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String str = simpleDateFormat.format(Long.valueOf(j));
        String str2 = simpleDateFormat.format(Long.valueOf(j2));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.equals(str2);
    }

    protected Map<Long, HiHealthData> listToMap(List<HiHealthData> list) {
        HashMap map = new HashMap(16);
        if (list != null) {
            for (HiHealthData hiHealthData : list) {
                if (!map.containsKey(Long.valueOf(hiHealthData.getStartTime()))) {
                    map.put(Long.valueOf(hiHealthData.getStartTime()), hiHealthData);
                }
            }
        }
        return map;
    }

    protected void aggregateHiHealthDataEx(ArrayList<HiAggregateOption> arrayList, final DataSourceCallback<SparseArray<List<HiHealthData>>> dataSourceCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "aggregateHiHealthDataEx start");
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: wao
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public final void onResult(SparseArray sparseArray, int i, int i2) {
                BaseOperate.lambda$aggregateHiHealthDataEx$30(dataSourceCallback, sparseArray, i, i2);
            }
        });
    }

    public static /* synthetic */ void lambda$aggregateHiHealthDataEx$30(DataSourceCallback dataSourceCallback, SparseArray sparseArray, int i, int i2) {
        ReleaseLogUtil.d(TAG_RELEASE, "aggregateHiHealthDataEx end errorCode = " + i);
        if (i != 0) {
            dataSourceCallback.onResponse(1, new SparseArray());
        } else if (sparseArray == null || sparseArray.size() == 0) {
            dataSourceCallback.onResponse(0, new SparseArray());
        } else {
            dataSourceCallback.onResponse(0, sparseArray);
        }
    }

    public void aggregateHiHealthDataPro(HiDataAggregateProOption hiDataAggregateProOption, final DataSourceCallback<List<HiHealthData>> dataSourceCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "aggregateHiHealthDataPro start");
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateHiHealthDataPro(hiDataAggregateProOption, new HiAggregateListener() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate.8
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "aggregateHiHealthDataPro end errorCode = " + i + ", anchor = " + i2);
                if (i != 0) {
                    dataSourceCallback.onResponse(1, new ArrayList());
                } else {
                    dataSourceCallback.onResponse(0, list);
                }
            }
        });
    }

    protected void aggregateHiHealthDataProEx(List<HiDataAggregateProOption> list, final DataSourceCallback<SparseArray<List<HiHealthData>>> dataSourceCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "aggregateHiHealthDataProEx start");
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateHiHealthDataProEx(list, new HiAggregateListenerEx() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate.9
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "aggregateHiHealthDataProEx end errorCode = " + i + ", anchor = " + i2);
                if (i != 0) {
                    dataSourceCallback.onResponse(1, new SparseArray());
                } else {
                    dataSourceCallback.onResponse(0, sparseArray);
                }
            }
        });
    }

    protected void readHiHealthDataEx(List<HiDataReadProOption> list, final DataSourceCallback<SparseArray<List<HiHealthData>>> dataSourceCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "readHiHealthDataEx start");
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthDataEx(list, new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d(BaseOperate.TAG_RELEASE, "readHiHealthDataEx end errorCode = " + i + ", anchor = " + i2);
                if (i != 0) {
                    dataSourceCallback.onResponse(1, new SparseArray());
                    return;
                }
                SparseArray sparseArray = new SparseArray();
                if (obj instanceof SparseArray) {
                    sparseArray = (SparseArray) obj;
                }
                dataSourceCallback.onResponse(0, sparseArray);
            }
        });
    }

    public void setIconResource(List<PrivacyDataModel> list) {
        if (list.size() == 0) {
            return;
        }
        HashSet hashSet = new HashSet(16);
        Iterator<PrivacyDataModel> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(it.next().getClientId()));
        }
        HashMap<Integer, String> iconMap = getIconMap(wgr.e(hashSet));
        for (PrivacyDataModel privacyDataModel : list) {
            int clientId = privacyDataModel.getClientId();
            if (iconMap.containsKey(Integer.valueOf(clientId))) {
                privacyDataModel.putString("iconResource", iconMap.get(Integer.valueOf(clientId)));
            }
        }
    }

    protected HashMap<Integer, String> getIconMap(int[] iArr) {
        final HashMap<Integer, String> map = new HashMap<>(16);
        for (int i : iArr) {
            map.put(Integer.valueOf(i), String.valueOf(wgt.d()));
        }
        HiDataSourceFetchOption hiDataSourceFetchOptionA = HiDataSourceFetchOption.builder().c(1).b(iArr).a();
        ReleaseLogUtil.d(TAG_RELEASE, "fetchDataSource start");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(this.mContext).fetchDataSource(hiDataSourceFetchOptionA, new HiDataClientListener() { // from class: wal
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public final void onResult(List list) {
                this.e.m1739x871da6c6(countDownLatch, map, list);
            }
        });
        try {
            countDownLatch.await();
            return map;
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a(TAG_RELEASE, "CountDownLatch Exception");
            return map;
        }
    }

    /* JADX INFO: renamed from: lambda$getIconMap$31$com-huawei-ui-main-stories-privacy-datasourcemanager-operate-data-BaseOperate, reason: not valid java name */
    public /* synthetic */ void m1739x871da6c6(CountDownLatch countDownLatch, HashMap map, List list) {
        String strValueOf;
        StringBuilder sb = new StringBuilder("fetchDataSource end clientList size = ");
        sb.append(list == null ? 0 : list.size());
        ReleaseLogUtil.d(TAG_RELEASE, sb.toString());
        if (njy.e(list)) {
            countDownLatch.countDown();
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            HiHealthClient hiHealthClient = (HiHealthClient) list.get(i);
            if (wgr.a(hiHealthClient)) {
                map.put(Integer.valueOf(hiHealthClient.getClientId()), String.valueOf(wgt.a()));
            } else {
                if (hiHealthClient.getHiDeviceInfo() == null) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(hiHealthClient.getHiDeviceInfo().getDeviceType());
                }
                if (this.pageType == 107) {
                    map.put(Integer.valueOf(hiHealthClient.getClientId()), String.valueOf(wgt.e(strValueOf)));
                } else {
                    map.put(Integer.valueOf(hiHealthClient.getClientId()), String.valueOf(wgt.c(strValueOf)));
                }
            }
        }
        countDownLatch.countDown();
    }
}
