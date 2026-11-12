package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.ArrayUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiMultiDataClientListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class wgk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile wgk f52025b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52026a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f52027c;
    private int d;
    private int e;
    private Map<Integer, int[]> g;

    public wgk() {
        HashMap map = new HashMap();
        this.g = map;
        map.put(103, new int[]{22107, 22106, 22101, 22102, 22103, 22105, 22001, 22002});
        this.g.put(102, new int[]{2002, 2018});
        this.g.put(106, new int[]{2104, DicDataTypeUtil.DataType.BODY_TEMPERATURE.value(), DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value(), DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value()});
        this.g.put(Integer.valueOf(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON), new int[]{DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()});
        Context context = BaseApplication.getContext();
        this.f52026a = context;
        this.f52027c = new Handler(Looper.getMainLooper());
        wgt.a(context);
    }

    public static wgk c() {
        if (f52025b == null) {
            synchronized (wgk.class) {
                if (f52025b == null) {
                    f52025b = new wgk();
                }
            }
        }
        return f52025b;
    }

    public void e(final DataSourceCallback<List<SourceInfo>> dataSourceCallback) {
        HiDataSourceFetchOption hiDataSourceFetchOptionA = HiDataSourceFetchOption.builder().c(0).a();
        ReleaseLogUtil.d("R_SourceManager", "getSource start");
        HiHealthNativeApi.a(this.f52026a).fetchDataSource(hiDataSourceFetchOptionA, new HiDataClientListener() { // from class: wgp
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public final void onResult(List list) {
                this.f52038c.d(dataSourceCallback, list);
            }
        });
    }

    /* synthetic */ void d(final DataSourceCallback dataSourceCallback, final List list) {
        LogUtil.a("SourceManager", "getSource end clientList = ", list);
        ReleaseLogUtil.d("R_SourceManager", "getSource end size = ", Integer.valueOf(list == null ? 0 : list.size()));
        if (njy.e(list)) {
            this.f52027c.post(new Runnable() { // from class: wgh
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(0, new ArrayList());
                }
            });
        } else {
            this.f52027c.post(new Runnable() { // from class: wgn
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(dataSourceCallback, list);
                }
            });
        }
    }

    /* synthetic */ void c(DataSourceCallback dataSourceCallback, List list) {
        dataSourceCallback.onResponse(0, d(list));
    }

    /* JADX INFO: renamed from: wgk$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52030a;
        final /* synthetic */ DataSourceCallback e;

        AnonymousClass5(int i, DataSourceCallback dataSourceCallback) {
            this.f52030a = i;
            this.e = dataSourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.a("SourceManager", "getSourceByType start");
            wgk wgkVar = wgk.this;
            int i = this.f52030a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            final DataSourceCallback dataSourceCallback = this.e;
            wgkVar.b(i, 0L, jCurrentTimeMillis, new DataSourceCallback() { // from class: wgo
                @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
                public final void onResponse(int i2, Object obj) {
                    this.d.d(dataSourceCallback, i2, (List) obj);
                }
            });
        }

        /* synthetic */ void d(final DataSourceCallback dataSourceCallback, final int i, List list) {
            LogUtil.a("SourceManager", "getSourceByType end resultCode = ", Integer.valueOf(i), ", size = ", Integer.valueOf(list == null ? 0 : list.size()));
            if (i != 0 || njy.e(list)) {
                wgk.this.f52027c.post(new Runnable() { // from class: wgq
                    @Override // java.lang.Runnable
                    public final void run() {
                        dataSourceCallback.onResponse(i, new ArrayList());
                    }
                });
                return;
            }
            final List<SourceInfo> listE = wgt.e((List<SourceInfo>) wgk.this.d(list));
            wgt.a(listE);
            wgk.this.f52027c.post(new Runnable() { // from class: wgm
                @Override // java.lang.Runnable
                public final void run() {
                    dataSourceCallback.onResponse(i, listE);
                }
            });
        }
    }

    public void b(int i, DataSourceCallback<List<SourceInfo>> dataSourceCallback) {
        ThreadPoolManager.c().execute(new AnonymousClass5(i, dataSourceCallback));
    }

    public void b(int i, long j, long j2, DataSourceCallback<List<HiHealthClient>> dataSourceCallback) {
        final ArrayList arrayList = new ArrayList(10);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        int[] iArr = this.g.get(Integer.valueOf(i));
        ReleaseLogUtil.d("R_SourceManager", "getClient start");
        HiHealthNativeApi.a(this.f52026a).fetchDataSourceByTypes(ArrayUtils.toArrayList(ArrayUtils.toWrapperArray(iArr)), new HiTimeInterval(j, j2), true, new HiMultiDataClientListener() { // from class: wgk.3
            @Override // com.huawei.hihealth.data.listener.HiMultiDataClientListener
            public void onMultiTypeResult(Map<Integer, List<HiHealthClient>> map) {
            }

            @Override // com.huawei.hihealth.data.listener.HiMultiDataClientListener
            public void onMergeTypeResult(List<HiHealthClient> list) {
                ReleaseLogUtil.d("R_SourceManager", "getClient end size = ", Integer.valueOf(list == null ? 0 : list.size()));
                if (njy.b(list)) {
                    arrayList.addAll(list);
                }
                countDownLatch.countDown();
            }
        });
        try {
            boolean zAwait = countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            ReleaseLogUtil.d("R_SourceManager", "getClient isCountDownZero = ", Boolean.valueOf(zAwait));
            if (!zAwait) {
                dataSourceCallback.onResponse(2, arrayList);
                return;
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.e("R_SourceManager", "countDownLatch await exception");
        }
        if (e(iArr)) {
            xjj.a(arrayList);
        }
        dataSourceCallback.onResponse(0, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SourceInfo> d(List<HiHealthClient> list) {
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        SourceInfo sourceInfo = new SourceInfo();
        LogUtil.a("SourceManager", "distinguishSource start");
        a(list, sourceInfo, arrayList, arrayList2);
        LogUtil.a("SourceManager", "distinguishSource end");
        wgt.b(arrayList);
        wgt.c(arrayList2);
        LogUtil.a("SourceManager", "appList size" + arrayList.size() + ", deviceList size" + arrayList2.size());
        return c(wgt.d(arrayList), wgt.d(arrayList2), sourceInfo);
    }

    private static void a(List<HiHealthClient> list, SourceInfo sourceInfo, List<SourceInfo> list2, List<SourceInfo> list3) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof HiHealthClient)) {
                LogUtil.j("SourceManager", "distinguishSource clientList's element is not a HiHealthClient class");
            } else {
                HiHealthClient hiHealthClient = list.get(i);
                HiAppInfo hiAppInfo = hiHealthClient.getHiAppInfo();
                if (hiAppInfo == null) {
                    LogUtil.j("SourceManager", "distinguishSource hiAppInfo is null");
                } else {
                    String packageName = hiAppInfo.getPackageName();
                    HiDeviceInfo hiDeviceInfo = hiHealthClient.getHiDeviceInfo();
                    if (hiDeviceInfo == null) {
                        LogUtil.j("SourceManager", "distinguishSource hiDeviceInfo is null");
                    } else {
                        String deviceUniqueCode = hiDeviceInfo.getDeviceUniqueCode();
                        LogUtil.a("SourceManager", "packageName=", packageName, " deviceUniqueCode=", deviceUniqueCode);
                        if (wgr.d(packageName, deviceUniqueCode)) {
                            sourceInfo.setSourceType(3);
                            sourceInfo.setPackageName(packageName);
                            sourceInfo.setDeviceUniqueCode(deviceUniqueCode);
                            sourceInfo.setDeviceType(Integer.MIN_VALUE);
                            sourceInfo.setDeviceName(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_healthdata_input));
                            sourceInfo.setItemType(3);
                            LogUtil.a("SourceManager", "add to maual");
                        } else {
                            if (wgt.d(packageName)) {
                                list2.add(wgt.d(hiAppInfo));
                                LogUtil.a("SourceManager", "add to App");
                            }
                            if (wgt.a(deviceUniqueCode)) {
                                list3.add(wgt.c(hiDeviceInfo));
                                LogUtil.a("SourceManager", "add to Device");
                            }
                        }
                    }
                }
            }
        }
    }

    private List<SourceInfo> c(List<SourceInfo> list, List<SourceInfo> list2, SourceInfo sourceInfo) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.b(list)) {
            SourceInfo sourceInfo2 = new SourceInfo();
            sourceInfo2.setItemType(2);
            sourceInfo2.setTitle(this.f52026a.getResources().getString(R.string.IDS_hwh_info_app));
            arrayList.add(sourceInfo2);
            arrayList.addAll(list);
            this.d = list.size();
            if (njy.e(list2)) {
                SourceInfo sourceInfo3 = new SourceInfo();
                sourceInfo3.setItemType(1);
                arrayList.add(sourceInfo3);
            }
        }
        if (njy.b(list2)) {
            SourceInfo sourceInfo4 = new SourceInfo();
            sourceInfo4.setItemType(2);
            sourceInfo4.setTitle(this.f52026a.getResources().getString(R.string.IDS_hwh_info_device));
            arrayList.add(sourceInfo4);
            arrayList.addAll(list2);
            this.e = list2.size();
            SourceInfo sourceInfo5 = new SourceInfo();
            sourceInfo5.setItemType(1);
            arrayList.add(sourceInfo5);
        }
        if ("-1".equals(sourceInfo.getDeviceUniqueCode())) {
            arrayList.add(sourceInfo);
            SourceInfo sourceInfo6 = new SourceInfo();
            sourceInfo6.setItemType(1);
            arrayList.add(sourceInfo6);
        }
        return arrayList;
    }

    public void d(int i, String str, String str2, int i2, DataSourceCallback<vzq> dataSourceCallback) {
        if (dataSourceCallback == null) {
            LogUtil.e("SourceManager", "Parameter callback is null");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            LogUtil.e("SourceManager", "Parameter uuid is null");
            dataSourceCallback.onResponse(1, null);
        } else {
            new wgf().c(i, str, str2, i2, dataSourceCallback);
        }
    }

    public int d() {
        return this.d;
    }

    public int a() {
        return this.e;
    }

    private boolean e(int[] iArr) {
        int i = iArr[0];
        return i == 2002 || i == 2018;
    }
}
