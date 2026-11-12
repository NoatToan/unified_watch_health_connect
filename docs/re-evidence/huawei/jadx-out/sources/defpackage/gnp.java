package defpackage;

import android.bluetooth.BluetoothAdapter;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.suggestion.RunCourseRecommendCallback;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes29.dex */
public class gnp {
    private hcp j = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f35821b = new ArrayList();
    private List<Integer> i = new ArrayList();
    private List<Long> d = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f35822c = new ArrayList();
    private List<Integer> e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RunCourseRecommendCallback> f35820a = Collections.synchronizedList(new ArrayList());

    private double a(int i, int i2) {
        return i == i2 ? 0.01d : -0.01d;
    }

    private void a(int i) {
        if (i == 100) {
            if (d()) {
                ReleaseLogUtil.d("Suggestion_RunCourseRecommend", "start Refresh");
                d(true, this.f35820a);
                return;
            } else {
                ReleaseLogUtil.d("Suggestion_RunCourseRecommend", "wait... Refresh");
                return;
            }
        }
        if (i != 101) {
            return;
        }
        if (e()) {
            ReleaseLogUtil.d("Suggestion_RunCourseRecommend", "start Refresh", 101);
            d(false, this.f35820a);
        } else {
            ReleaseLogUtil.d("Suggestion_RunCourseRecommend", "wait... Refresh");
        }
    }

    public void b(final RunCourseRecommendCallback runCourseRecommendCallback) {
        if (runCourseRecommendCallback == null) {
            LogUtil.j("Suggestion_RunCourseRecommend", "getRunCourseRecommend callback == null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gnp.4
                @Override // java.lang.Runnable
                public void run() {
                    gnp.this.a(runCourseRecommendCallback);
                }
            });
        }
    }

    private boolean d(boolean z) {
        if (!z) {
            LogUtil.j("Suggestion_RunCourseRecommend", "isConnectedHeartRateDeviceWear()=false, bluetoothIsEnabled=false");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_RunCourseRecommend");
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2 || (!edh.d(deviceInfo.getProductType()) && !edd.a().a(deviceInfo.getProductType()))) {
            LogUtil.j("Suggestion_RunCourseRecommend", "isConnectedHeartRateDeviceWear()=false, failed");
            return false;
        }
        LogUtil.a("Suggestion_RunCourseRecommend", "isConnectedHeartRateDeviceWear()=true, isSupportHeartRate Wear=true, realtime_hearrate");
        return true;
    }

    private boolean c() {
        if (BluetoothAdapter.getDefaultAdapter() != null) {
            return BluetoothAdapter.getDefaultAdapter().isEnabled();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RunCourseRecommendCallback runCourseRecommendCallback) {
        long jA;
        if (!d(c())) {
            e(runCourseRecommendCallback);
            return;
        }
        hco hcoVarD = gnr.d(gnr.c());
        if (hcoVarD != null) {
            jA = hcoVarD.a();
        } else {
            LogUtil.a("Suggestion_RunCourseRecommend", "sp time is null");
            jA = 0;
        }
        a(runCourseRecommendCallback, jA, hcoVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(RunCourseRecommendCallback runCourseRecommendCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        hcp hcpVarE = gnr.e(gnr.a());
        long jF = 0;
        if (hcpVarE != null && hcpVarE.f() != 0) {
            jF = hcpVarE.f();
            this.j = hcpVarE;
        }
        LogUtil.a("Suggestion_RunCourseRecommend", "userInfoLastRefreshTime= ", Long.valueOf(jF));
        if (jCurrentTimeMillis <= 2592000000L + jF) {
            a();
        } else {
            c(runCourseRecommendCallback, jF);
        }
    }

    private void d(final RunCourseRecommendCallback runCourseRecommendCallback, hco hcoVar) {
        LogUtil.a("Suggestion_RunCourseRecommend", "refresh time<7");
        if (njy.e(hcoVar.c())) {
            gnr.d(new RunCourseRecommendCallback() { // from class: gnp.2
                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onSuccess(List<String> list) {
                }

                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onSuccess(String str) {
                    hco hcoVarD = gnr.d(str);
                    if (hcoVarD != null && !njy.e(hcoVarD.c())) {
                        gnp.this.e(runCourseRecommendCallback, hcoVarD.c());
                    } else {
                        LogUtil.a("Suggestion_RunCourseRecommend", "getCourseFromDb tempBean == null");
                        gnp.this.c(runCourseRecommendCallback);
                    }
                }

                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onFailure(int i, String str) {
                    gnp.this.c(runCourseRecommendCallback);
                }
            });
        } else {
            e(runCourseRecommendCallback, hcoVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(RunCourseRecommendCallback runCourseRecommendCallback, List<String> list) {
        if (njy.e(list) || list.size() < 3) {
            LogUtil.j("Suggestion_RunCourseRecommend", "sp data error");
            h();
            this.f35820a.add(runCourseRecommendCallback);
            return;
        }
        runCourseRecommendCallback.onSuccess(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("Suggestion_RunCourseRecommend", "startRequestData");
        j();
        g();
        i();
        b(true);
        e(true);
    }

    private void e(RunCourseRecommendCallback runCourseRecommendCallback) {
        LogUtil.a("Suggestion_RunCourseRecommend", "!isConnectedDevice,time<7");
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("R008R");
        arrayList.add("R009R");
        arrayList.add("R010R");
        runCourseRecommendCallback.onSuccess(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("Suggestion_RunCourseRecommend", "userFitness RefreshTime <30");
        if (this.j != null) {
            b(false);
            e(false);
        } else {
            LogUtil.a("Suggestion_RunCourseRecommend", "userInfo == null");
            h();
        }
    }

    private void a(final RunCourseRecommendCallback runCourseRecommendCallback, long j, hco hcoVar) {
        if (System.currentTimeMillis() <= 604800000 + j) {
            d(runCourseRecommendCallback, hcoVar);
        } else if (j != 0) {
            LogUtil.a("Suggestion_RunCourseRecommend", "lastWeekRefreshTime != 0 ");
            c(runCourseRecommendCallback);
        } else {
            gnr.d(new RunCourseRecommendCallback() { // from class: gnp.8
                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onSuccess(List<String> list) {
                }

                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onSuccess(String str) {
                    LogUtil.a("Suggestion_RunCourseRecommend", "getCourseFromDb str");
                    hco hcoVarD = gnr.d(str);
                    if (hcoVarD == null) {
                        gnp.this.h();
                        LogUtil.a("Suggestion_RunCourseRecommend", "isRefreshCourse lastWeekRefreshTime == null");
                    } else if (System.currentTimeMillis() > hcoVarD.a() + 604800000) {
                        gnp.this.c(runCourseRecommendCallback);
                        LogUtil.a("Suggestion_RunCourseRecommend", "isRefreshCourse isOverWeek");
                    } else if (njy.e(hcoVarD.c())) {
                        LogUtil.a("Suggestion_RunCourseRecommend", "RunCourseRecommendBean is null");
                        gnp.this.h();
                    } else {
                        runCourseRecommendCallback.onSuccess(hcoVarD.c());
                        gnr.e(hcoVarD.c(), hcoVarD.a());
                    }
                }

                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("Suggestion_RunCourseRecommend", "errorCode", Integer.valueOf(i), " errorInfo= ", str);
                    gnp.this.c(runCourseRecommendCallback);
                }
            });
        }
    }

    private void c(RunCourseRecommendCallback runCourseRecommendCallback, long j) {
        if (j != 0) {
            h();
            LogUtil.a("Suggestion_RunCourseRecommend", "all refresh,userInfoLastRefreshTime>30");
        } else {
            gnr.b(new RunCourseRecommendCallback() { // from class: gnp.9
                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onSuccess(List<String> list) {
                }

                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onSuccess(String str) {
                    LogUtil.a("Suggestion_RunCourseRecommend", "refreshUserInfoAndRecommendCourse str");
                    gnp.this.j = gnr.e(str);
                    if (gnp.this.j == null) {
                        gnp.this.h();
                        LogUtil.a("Suggestion_RunCourseRecommend", "isRefreshCourse startRequestData");
                        return;
                    }
                    LogUtil.a("Suggestion_RunCourseRecommend", "isRefreshCourse mUserInfo.getRefreshMonthInfo()=", Long.valueOf(gnp.this.j.f()));
                    if (System.currentTimeMillis() <= gnp.this.j.f() + 2592000000L) {
                        gnp.this.a();
                        gnr.g(gnr.c(gnp.this.j));
                    } else {
                        LogUtil.a("Suggestion_RunCourseRecommend", "isRefreshUserInfo > 30");
                        gnp.this.h();
                    }
                }

                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("Suggestion_RunCourseRecommend", "refreshUserInfoAndRecommendCourse errorCode", Integer.valueOf(i), " errorInfo= ", str);
                    gnp.this.h();
                }
            });
        }
    }

    private boolean e() {
        return (this.f35822c.size() == 0 || this.e.size() == 0) ? false : true;
    }

    private boolean d() {
        LogUtil.j("Suggestion_RunCourseRecommend", "mUserBodyInfo:", Integer.valueOf(this.f35821b.size()), " mVo2max:", Integer.valueOf(this.i.size()), " mDistanceData:", Integer.valueOf(this.d.size()), " mLastUseCourse:", Integer.valueOf(this.f35822c.size()), " mLastWatchCourse:", Integer.valueOf(this.e.size()));
        boolean z = (this.f35821b.size() == 0 || this.i.size() == 0 || this.d.size() == 0) ? false : true;
        if (!z || this.f35822c.size() == 0 || this.e.size() == 0) {
            return z;
        }
        return true;
    }

    private void d(final boolean z, final List<RunCourseRecommendCallback> list) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: gnp.6
            @Override // java.lang.Runnable
            public void run() {
                if (gzq.a() != 204) {
                    gnp.this.d(z, (List<RunCourseRecommendCallback>) list, 0);
                } else {
                    LogUtil.a("Suggestion_RunCourseRecommend", "isOversea");
                    gnp.this.c(z, (List<RunCourseRecommendCallback>) list, gzq.a());
                }
            }
        });
    }

    /* JADX INFO: renamed from: gnp$7, reason: invalid class name */
    class AnonymousClass7 extends UiCallback<List<Topic>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35834b;
        final /* synthetic */ List e;

        AnonymousClass7(List list, boolean z, int i) {
            this.e = list;
            this.f35834b = z;
            this.f35833a = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_RunCourseRecommend", "getFitnessCourseTopicList()  errorCode:", Integer.valueOf(i), " error info ", str);
            gnp.a((List<RunCourseRecommendCallback>) this.e, i, str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final List<Topic> list) {
            if (njy.e(list)) {
                LogUtil.j("Suggestion_RunCourseRecommend", "initRunCourseTopic data null");
                gnp.a((List<RunCourseRecommendCallback>) this.e, 0, "topic list is null");
                return;
            }
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final boolean z = this.f35834b;
            final List list2 = this.e;
            final int i = this.f35833a;
            threadPoolManagerC.execute(new Runnable() { // from class: gno
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35819c.c(list, z, list2, i);
                }
            });
        }

        /* synthetic */ void c(List list, boolean z, List list2, int i) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Topic topic = (Topic) it.next();
                if (topic != null && "SF006".equals(topic.acquireSerialNum())) {
                    gnp.this.c(z, (List<RunCourseRecommendCallback>) list2, topic.acquireId());
                    return;
                }
            }
            gnp.this.d(z, (List<RunCourseRecommendCallback>) list2, i + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, List<RunCourseRecommendCallback> list, int i) {
        gls.b().getFitnessCourseTopicList(i, new AnonymousClass7(list, z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final boolean z, final List<RunCourseRecommendCallback> list, int i) {
        final ArrayList arrayList = new ArrayList();
        gls.b().getWorkoutsByTopicId(0, i, new UiCallback<List<FitWorkout>>() { // from class: gnp.10
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                LogUtil.e("Suggestion_RunCourseRecommend", str, "==Failed--errorcode:", Integer.valueOf(i2));
                gnp.a((List<RunCourseRecommendCallback>) list, i2, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitWorkout> list2) {
                List<FitWorkout> listE = gnp.this.e(list2);
                ArrayList arrayList2 = new ArrayList();
                for (FitWorkout fitWorkout : listE) {
                    if (fitWorkout != null && fitWorkout.getType() == 2) {
                        hcr hcrVar = new hcr();
                        hcrVar.e(gnr.e(fitWorkout.acquireDifficulty()));
                        if (fitWorkout.acquireMeasurementType() == 1) {
                            hcrVar.a().b(fitWorkout.acquireDuration());
                        } else {
                            LogUtil.j("Suggestion_RunCourseRecommend", "TYPE_MEASUREMENT_DISTANCE", Integer.valueOf(fitWorkout.acquireMeasurementType()));
                            hcrVar.a().b(0);
                        }
                        hcrVar.a().c(fitWorkout.acquireId());
                        hcrVar.a().a(fitWorkout.acquireId());
                        arrayList2.add(hcrVar);
                    }
                }
                LogUtil.a("Suggestion_RunCourseRecommend", "fitBeanList.size= ", Integer.valueOf(arrayList2.size()));
                if (arrayList2.size() == 0) {
                    gnp.a((List<RunCourseRecommendCallback>) list, 0, "run course is 0");
                } else {
                    gnp.b(list, gnp.this.a((List<String>) arrayList, arrayList2, z));
                    gnr.e((List<String>) arrayList, System.currentTimeMillis());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<RunCourseRecommendCallback> list, int i, String str) {
        if (njy.e(list)) {
            return;
        }
        for (RunCourseRecommendCallback runCourseRecommendCallback : list) {
            if (runCourseRecommendCallback != null) {
                runCourseRecommendCallback.onFailure(i, str);
            }
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(List<RunCourseRecommendCallback> list, List<String> list2) {
        if (njy.e(list)) {
            return;
        }
        for (RunCourseRecommendCallback runCourseRecommendCallback : list) {
            if (runCourseRecommendCallback != null) {
                runCourseRecommendCallback.onSuccess(list2);
            }
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FitWorkout> e(List<FitWorkout> list) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("Suggestion_RunCourseRecommend", "removeDupWorkouts() workouts is null");
            return arrayList;
        }
        for (FitWorkout fitWorkout : list) {
            if (!arrayList.contains(fitWorkout)) {
                arrayList.add(fitWorkout);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> a(List<String> list, List<hcr> list2, boolean z) {
        hcp hcpVarB;
        TreeMap treeMap = new TreeMap(new Comparator<Double>() { // from class: gnp.11
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(Double d, Double d2) {
                return (int) (d2.doubleValue() - d.doubleValue());
            }
        });
        if (z) {
            hcpVarB = b();
            hcpVarB.c(gnr.b(hcpVarB));
        } else {
            hcpVarB = this.j;
        }
        hcp hcpVar = hcpVarB;
        hcv hcvVarC = c(hcpVar);
        if (z) {
            String strC = gnr.c(list2.get(0).d());
            gnr.g(strC);
            gnr.j(strC);
        }
        d(z, hcpVar, hcvVarC);
        for (hcr hcrVar : list2) {
            if (hcrVar != null) {
                hcrVar.a(hcpVar);
                hcrVar.b(hcvVarC);
                double dB = gnr.b(hcrVar);
                if (treeMap.containsKey(Double.valueOf(dB))) {
                    d(treeMap, dB, hcrVar, hcpVar.i());
                }
                treeMap.put(Double.valueOf(dB), e(hcrVar));
            }
        }
        LogUtil.a("Suggestion_RunCourseRecommend", "tempResult recommendInfo = ", Integer.valueOf(treeMap.size()));
        int i = 0;
        for (String str : treeMap.values()) {
            if (str != null) {
                i++;
                if (i > 3) {
                    break;
                }
                list.add(str.split("_")[0]);
            }
        }
        LogUtil.a("Suggestion_RunCourseRecommend", "courseIdList.size= ", Integer.valueOf(list.size()));
        return list;
    }

    private String e(hcr hcrVar) {
        StringBuilder sb = new StringBuilder(7);
        sb.append(hcrVar.a().d());
        sb.append("_");
        sb.append(hcrVar.a().b());
        sb.append("_");
        sb.append(hcrVar.b());
        sb.append("_");
        sb.append(hcrVar.a().e());
        return sb.toString();
    }

    private void d(Map<Double, String> map, double d, hcr hcrVar, int i) {
        String[] strArrSplit = map.get(Double.valueOf(d)).split("_");
        if (strArrSplit.length != 4) {
            map.put(Double.valueOf(d - 0.01d), map.get(Double.valueOf(d)));
            return;
        }
        String string = Integer.toString(hcrVar.e().c());
        String str = strArrSplit[1];
        String strB = hcrVar.a().b();
        double dE = e(string, str) + d;
        if (!a(dE, e(string, strB) + d)) {
            map.put(Double.valueOf(dE), map.get(Double.valueOf(d)));
            return;
        }
        int iC = c(strArrSplit[2]);
        int iB = hcrVar.b();
        double dA = a(i, iC) + d;
        if (!a(dA, a(i, iB) + d)) {
            map.put(Double.valueOf(dA), map.get(Double.valueOf(d)));
        } else {
            map.put(Double.valueOf(d(hcrVar.d().h(), c(strArrSplit[3]), hcrVar.a().e()) + d), map.get(Double.valueOf(d)));
        }
    }

    private int c(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("Suggestion_RunCourseRecommend", "NumberFormatException");
            return 0;
        }
    }

    private boolean a(double d, double d2) {
        return new BigDecimal(d).compareTo(new BigDecimal(d2)) == 0;
    }

    private double e(String str, String str2) {
        return str.equals(str2) ? 0.01d : -0.01d;
    }

    private double d(long j, int i, int i2) {
        return Math.abs(j - ((long) i)) < Math.abs(j - ((long) i2)) ? 0.01d : -0.01d;
    }

    private void d(boolean z, hcp hcpVar, hcv hcvVar) {
        if (z) {
            gnr.e(hcpVar.i(), hcvVar.c(), hcpVar.h());
        } else {
            gnr.a(hcvVar.c());
        }
    }

    private hcv c(hcp hcpVar) {
        hcv hcvVar = new hcv();
        if (this.f35822c.size() == 2 && this.f35822c.get(0).intValue() != 0) {
            hcvVar.c(this.f35822c.get(0).intValue());
            hcvVar.e(this.f35822c.get(1).intValue());
        } else if (this.e.size() == 2 && this.e.get(0).intValue() != 0) {
            hcvVar.c(this.e.get(0).intValue());
            hcvVar.e(this.e.get(1).intValue());
        } else {
            hcvVar.c(0);
            hcvVar.e(0);
            LogUtil.j("Suggestion_RunCourseRecommend", "mLastUseCourse.size() != 2");
        }
        int[] iArrD = gnr.d(hcpVar, hcpVar.i(), hcvVar);
        hcvVar.c(iArrD[0]);
        hcvVar.e(iArrD[1]);
        return hcvVar;
    }

    private hcp b() {
        hcp hcpVar = new hcp();
        if (this.f35821b.size() == 3) {
            hcpVar.e(this.f35821b.get(0).intValue());
            hcpVar.a(this.f35821b.get(1).intValue());
            hcpVar.b(this.f35821b.get(2).intValue());
        } else {
            LogUtil.j("Suggestion_RunCourseRecommend", "mUserBodyInfo.size() != 3");
        }
        if (this.i.size() == 2) {
            if (this.i.get(0).intValue() == 0) {
                hcpVar.a(false);
            } else {
                hcpVar.a(true);
            }
            hcpVar.d(this.i.get(1).intValue());
        } else {
            LogUtil.j("Suggestion_RunCourseRecommend", "mVo2max.size() != 2");
        }
        if (this.d.size() == 3) {
            hcpVar.b(this.d.get(0).intValue());
            hcpVar.a(this.d.get(1).longValue());
            hcpVar.e(this.d.get(2).longValue());
            return hcpVar;
        }
        LogUtil.j("Suggestion_RunCourseRecommend", "mDistanceData.size() != 3");
        return hcpVar;
    }

    private void j() {
        hcp hcpVar = this.j;
        if (hcpVar != null) {
            this.f35821b.add(Integer.valueOf(hcpVar.d()));
            this.f35821b.add(Integer.valueOf(this.j.a()));
            this.f35821b.add(Integer.valueOf((int) this.j.b()));
        }
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_RunCourseRecommend", "startRequestUserInfo : userProfileMgrApi is null.");
            return;
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo != null) {
            float weightOrDefaultValue = userInfo.getWeightOrDefaultValue();
            int ageOrDefaultValue = userInfo.getAgeOrDefaultValue();
            int genderOrDefaultValue = userInfo.getGenderOrDefaultValue();
            int heightOrDefaultValue = userInfo.getHeightOrDefaultValue();
            if (heightOrDefaultValue != 0) {
                c(ageOrDefaultValue, genderOrDefaultValue, (int) (((double) weightOrDefaultValue) / Math.pow(((double) heightOrDefaultValue) / 100.0d, 2.0d)));
                return;
            } else {
                c(0, 0, 0);
                return;
            }
        }
        c(0, 0, 0);
    }

    private void g() {
        gnk gnkVar = new gnk(new RunCourseRecommendCallback() { // from class: gnp.15
            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(List<String> list) {
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(String str) {
                hcp hcpVarE = gnr.e(str);
                if (hcpVarE == null) {
                    gnp.this.e(0, 0);
                } else {
                    gnp.this.e(1, hcpVarE.j());
                }
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onFailure(int i, String str) {
                gnp.this.e(0, 0);
            }
        });
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j("Suggestion_RunCourseRecommend", "getLastVo2max() : healthDataMgrApi is null.");
        } else {
            healthDataMgrApi.getLastVo2max(gnkVar);
        }
    }

    private void i() {
        gni gniVar = new gni(new RunCourseRecommendCallback() { // from class: gnp.5
            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(List<String> list) {
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(String str) {
                hcp hcpVarE = gnr.e(str);
                if (hcpVarE != null) {
                    gnp.this.b(hcpVarE.e(), hcpVarE.c(), hcpVarE.h());
                } else {
                    gnp.this.b(0L, 0L, 0L);
                }
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onFailure(int i, String str) {
                gnp.this.b(0L, 0L, 0L);
            }
        });
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j("Suggestion_RunCourseRecommend", "requestTrackSimplifyData : healthDataMgrApi is null.");
            return;
        }
        healthDataMgrApi.requestTrackSimplifyData(System.currentTimeMillis() - 2592000000L, System.currentTimeMillis(), 258, false, gniVar);
    }

    private void c(final boolean z) {
        gnr.a("last_use_run_course", new RunCourseRecommendCallback() { // from class: gnp.1
            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(List<String> list) {
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(String str) {
                hcv hcvVarC = gnr.c(str);
                if (hcvVarC == null) {
                    gnp.this.b(0, 0, z);
                    return;
                }
                gnp.this.b(hcvVarC.c(), hcvVarC.a(), z);
                LogUtil.a("Suggestion_RunCourseRecommend", "update mUsePurpose onSuccess");
                gnr.a("last_use_run_course", Integer.toString(hcvVarC.c()), System.currentTimeMillis(), hcvVarC);
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onFailure(int i, String str) {
                LogUtil.a("Suggestion_RunCourseRecommend", "update mUsePurpose onFailure");
                gnp.this.b(0, 0, z);
            }
        });
    }

    private void a(final boolean z) {
        gnr.a("last_watch_run_course", new RunCourseRecommendCallback() { // from class: gnp.3
            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(List<String> list) {
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(String str) {
                LogUtil.a("Suggestion_RunCourseRecommend", "update mWatchPurpose onSuccess");
                hcv hcvVarC = gnr.c(str);
                if (hcvVarC == null) {
                    gnp.this.d(0, 0, z);
                    return;
                }
                gnp.this.d(hcvVarC.c(), hcvVarC.a(), z);
                int iC = hcvVarC.c();
                gnr.a("last_watch_run_course", String.valueOf(iC), System.currentTimeMillis(), hcvVarC);
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onFailure(int i, String str) {
                LogUtil.a("Suggestion_RunCourseRecommend", "update mWatchPurpose onFailure");
                gnp.this.d(0, 0, z);
            }
        });
    }

    private void b(boolean z) {
        hcv hcvVarB = gnr.b("last_use_run_course");
        if (hcvVarB == null) {
            LogUtil.a("Suggestion_RunCourseRecommend", "spArray = null");
            c(z);
            return;
        }
        int iC = hcvVarB.c();
        int i = 0;
        if (d(hcvVarB.e())) {
            b(0, 0, z);
            return;
        }
        if (iC <= 0 || iC >= 5) {
            iC = 0;
        } else {
            LogUtil.a("Suggestion_RunCourseRecommend", "lastPurpose = ", Integer.valueOf(iC));
        }
        long jD = hcvVarB.d();
        int iA = hcvVarB.a();
        if (d(jD)) {
            iA = iC;
        }
        if (iA > 0 && iA < 5) {
            LogUtil.a("Suggestion_RunCourseRecommend", "penultimatePurpose = ", Integer.valueOf(iA));
            i = iA;
        }
        b(iC, i, z);
    }

    private boolean d(long j) {
        return System.currentTimeMillis() > j + 2592000000L;
    }

    private void e(boolean z) {
        hcv hcvVarB = gnr.b("last_watch_run_course");
        if (hcvVarB == null) {
            LogUtil.a("Suggestion_RunCourseRecommend", "startRequestIsUserWatched spArray =null ");
            a(z);
            return;
        }
        int iC = hcvVarB.c();
        int i = 0;
        if (d(hcvVarB.e())) {
            d(0, 0, z);
            return;
        }
        if (iC <= 0 || iC >= 5) {
            iC = 0;
        } else {
            LogUtil.a("Suggestion_RunCourseRecommend", "lastPurpose = ", Integer.valueOf(iC));
        }
        long jD = hcvVarB.d();
        int iA = hcvVarB.a();
        if (d(jD)) {
            iA = iC;
        }
        if (iA > 0 && iA < 5) {
            LogUtil.a("Suggestion_RunCourseRecommend", "penultimatePurpose = ", Integer.valueOf(iA));
            i = iA;
        }
        d(iC, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2, boolean z) {
        this.f35822c.add(Integer.valueOf(i));
        this.f35822c.add(Integer.valueOf(i2));
        if (z) {
            a(100);
        } else {
            a(101);
        }
        ReleaseLogUtil.d("Suggestion_RunCourseRecommend", "use info=");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2, boolean z) {
        this.e.add(Integer.valueOf(i));
        this.e.add(Integer.valueOf(i2));
        if (z) {
            a(100);
        } else {
            a(101);
        }
        ReleaseLogUtil.d("Suggestion_RunCourseRecommend", "watch info=");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, long j2, long j3) {
        this.d.add(Long.valueOf(j));
        this.d.add(Long.valueOf(j2));
        this.d.add(Long.valueOf(j3));
        a(100);
        ReleaseLogUtil.d("Suggestion_RunCourseRecommend", "distance");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        this.i.add(Integer.valueOf(i));
        this.i.add(Integer.valueOf(i2));
        a(100);
        ReleaseLogUtil.d("Suggestion_RunCourseRecommend", "vo2max info=", Integer.valueOf(i));
    }

    private void c(int i, int i2, int i3) {
        this.f35821b.add(Integer.valueOf(i));
        this.f35821b.add(Integer.valueOf(i2));
        this.f35821b.add(Integer.valueOf(i3));
        a(100);
    }
}
