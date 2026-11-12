package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.pluginlocation.MAGAndGPSService;
import com.huawei.health.trackprocess.api.TrackPostProcessApi;
import com.huawei.healthcloud.plugintrack.manager.TrackAltitudeMgr;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile jal f38300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f38301b = new Object();
    private final Context d;
    private String e;
    private jpi i;
    private final TrackAltitudeMgr j;
    private boolean h = true;
    private boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Long, double[]> f38302c = new HashMap();

    private jal(Context context) {
        this.d = context;
        this.j = new TrackAltitudeMgr(context);
    }

    public static jal a() {
        jal jalVar;
        synchronized (f38301b) {
            if (f38300a == null) {
                f38300a = new jal(BaseApplication.getContext());
            }
            jalVar = f38300a;
        }
        return jalVar;
    }

    public void a(jpi jpiVar, boolean z, boolean z2) {
        if (!jar.e(iwy.a(this.d).k()) || jpiVar.j()) {
            return;
        }
        if (this.h && !z) {
            jar.e();
            d(jpiVar);
        } else {
            a(jpiVar, z2);
        }
        this.h = false;
    }

    public void a(jpi jpiVar, boolean z) {
        if (jar.e(iwy.a(this.d).k())) {
            if (jpiVar == null || this.i == null) {
                LogUtil.a("Track_TrackAfterProcessGpsManager", "updateGpsFileForAfterProcess basePoint is null ", Boolean.valueOf(jpiVar == null), " mLastReportBasePoint is null ", Boolean.valueOf(this.i == null));
                this.i = jpiVar;
                return;
            }
            if ((jpiVar.f() - this.i.f()) / 1000 <= 0) {
                LogUtil.a("Track_TrackAfterProcessGpsManager", "updateGpsFileForAfterProcess time less one second return!");
                return;
            }
            if (TextUtils.isEmpty(this.e)) {
                String str = iwy.a(this.d).aj() + "_gps.bin";
                this.e = str;
                LogUtil.a("Track_TrackAfterProcessGpsManager", "updateGpsFileForAfterProcess but fileName is null mGpsFileName ", str);
            }
            LogUtil.a("Track_TrackAfterProcessGpsManager", "updateGpsFileForAfterProcess before  time ", Long.valueOf(jpiVar.f()), " lat ", Double.valueOf(jpiVar.i()), " lng ", Double.valueOf(jpiVar.h()), Long.valueOf(this.i.f()), " lat ", Double.valueOf(this.i.i()), " lng ", Double.valueOf(this.i.h()));
            double[] dArrC = jar.c(this.i.i(), this.i.h(), jpiVar.i(), jpiVar.h());
            jar.a(this.e, (short) ((jpiVar.f() - this.i.f()) / 1000), (short) (jpiVar.c() * 100.0f), (float) dArrC[0], (float) dArrC[1], (int) jpiVar.b(), (int) jpiVar.d(), z ? 1 : 0, (short) (jpiVar.e() - this.i.e()), (short) (this.j.b() ? jpiVar.a() : -1.0f));
            this.i = new jpi(jpiVar);
        }
    }

    public jpi c() {
        return this.i;
    }

    private void d(jpi jpiVar) {
        if (jpiVar == null) {
            return;
        }
        this.i = new jpi(jpiVar);
        int[] iArr = {0, 4, 3, 3, 3, 3, 3, 3, 3};
        if (TextUtils.isEmpty(this.e)) {
            String str = iwy.a(this.d).aj() + "_gps.bin";
            this.e = str;
            LogUtil.a("Track_TrackAfterProcessGpsManager", "setGpsFileDataHead but fileName is null mGpsFileName ", str);
        }
        LogUtil.a("Track_TrackAfterProcessGpsManager", "setGpsFileDataHead  locatedTime ", Long.valueOf(jpiVar.f()), " lng ", Double.valueOf(jpiVar.h()), " lat ", Double.valueOf(jpiVar.i()));
        jar.e(this.e, 0, (int) (jpiVar.f() / 1000), jpiVar.h(), jpiVar.i(), jpiVar.e(), (int) jpiVar.a(), iArr);
    }

    public void b(Location location, int i) {
        if (jar.e(i)) {
            MAGAndGPSService.getInstance(this.d).setGpsLocation(location);
        }
    }

    public void g() {
        if (jar.e(iwy.a(this.d).k())) {
            this.e = iwy.a(this.d).aj() + "_gps.bin";
            a().d();
            ThreadPoolManager.c().execute(new Runnable() { // from class: jal.2
                @Override // java.lang.Runnable
                public void run() {
                    String url = GRSManager.c(jal.this.d).getUrl("domainHealthcommonHicloud");
                    if (TextUtils.isEmpty(url)) {
                        LogUtil.e("Track_TrackAfterProcessGpsManager", "download url is empty");
                        return;
                    }
                    String str = url + "/commonAbility/configCenter/getConfigInfo";
                    LogUtil.a("Track_TrackAfterProcessGpsManager", "download url ", str);
                    MAGAndGPSService.getInstance(jal.this.d).start(str, new izx());
                }
            });
        }
    }

    public void h() {
        if (jar.e(iwy.a(this.d).k())) {
            MAGAndGPSService.getInstance(this.d).pause();
        }
    }

    public void f() {
        if (jar.e(iwy.a(this.d).k())) {
            MAGAndGPSService.getInstance(this.d).resume();
        }
    }

    public void c(long j, int i, MotionPathSimplify motionPathSimplify, boolean z) {
        if (jar.e(iwy.a(this.d).k())) {
            if (z && jar.d(j, i)) {
                a().e(this.e, true, motionPathSimplify);
            }
            MAGAndGPSService.getInstance(this.d).stop();
        }
        i();
    }

    public int e(String str, boolean z, MotionPathSimplify motionPathSimplify) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Track_TrackAfterProcessGpsManager", "getPostProcessingTrackResult fileName is empty! ");
            return -100;
        }
        LogUtil.e("Track_TrackAfterProcessGpsManager", "getPostProcessingTrackResult fileName is ", str, " deviceType ", motionPathSimplify == null ? "" : Integer.valueOf(motionPathSimplify.requestDeviceType()));
        lsy.a(new AnonymousClass5(str, z, motionPathSimplify));
        return -100;
    }

    /* JADX INFO: renamed from: jal$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f38304a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MotionPathSimplify f38305c;
        final /* synthetic */ String e;

        AnonymousClass5(String str, boolean z, MotionPathSimplify motionPathSimplify) {
            this.e = str;
            this.f38304a = z;
            this.f38305c = motionPathSimplify;
        }

        @Override // java.lang.Runnable
        public void run() {
            TrackPostProcessApi trackPostProcessApi = (TrackPostProcessApi) Services.b("Module_Track_Post_Process_Service", TrackPostProcessApi.class);
            String str = this.e;
            boolean z = this.f38304a;
            final MotionPathSimplify motionPathSimplify = this.f38305c;
            trackPostProcessApi.getPostProcessingTrack(str, "mobile_phone", z, new IBaseResponseCallback() { // from class: jam
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.c(motionPathSimplify, i, obj);
                }
            }, "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(MotionPathSimplify motionPathSimplify, int i, Object obj) {
            if (obj instanceof iln) {
                Map<Long, double[]> mapD = ((iln) obj).d();
                int size = mapD.size();
                LogUtil.a("Track_TrackAfterProcessGpsManager", "getPostProcessingTrackResult ", Integer.valueOf(size));
                if (size < 2) {
                    ReleaseLogUtil.a("Track_TrackAfterProcessGpsManager", "getPostProcessingTrackResult gpsInfoMap size less than 2,size=", Integer.valueOf(size));
                    jaj.c(i, size);
                    return;
                }
                jal.this.f38302c = mapD;
                Iterator<Long> it = mapD.keySet().iterator();
                while (it.hasNext()) {
                    double[] dArr = mapD.get(it.next());
                    double dDoubleValue = new BigDecimal(Double.toString(1000.0d)).multiply(new BigDecimal(dArr[3])).doubleValue();
                    dArr[3] = dDoubleValue;
                    LogUtil.a("Track_TrackAfterProcessGpsManager", "getPostProcessingTrackResult lat=", Double.valueOf(dArr[0]), ",lon=", Double.valueOf(dArr[1]), ",alt=", Double.valueOf(dArr[2]), ",time=", String.valueOf(dDoubleValue));
                }
                jal.this.b(motionPathSimplify, mapD);
                jal.this.f = true;
                Intent intent = new Intent();
                intent.setPackage(BaseApplication.getAppPackage());
                intent.putExtra("AfterProcessTrack", (Serializable) mapD);
                intent.setAction("com.huawei.health.update_process_track");
                BaseApplication.getContext().sendBroadcast(intent, SecurityConstant.f5920a);
            }
        }
    }

    public boolean e() {
        return this.f;
    }

    public Map<Long, double[]> b() {
        return this.f38302c;
    }

    public void j() {
        ReleaseLogUtil.d("Track_TrackAfterProcessGpsManager", "resetProcessFinish");
        this.f = false;
        this.f38302c = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MotionPathSimplify motionPathSimplify, Map<Long, double[]> map) {
        if (motionPathSimplify == null) {
            LogUtil.e("Track_TrackAfterProcessGpsManager", "saveTrackDataWhenProcessFinished motionPathSimplify == null");
            return;
        }
        MotionPath motionPathE = jac.e(this.d, motionPathSimplify.requestSportType());
        motionPathSimplify.saveEndTime(motionPathSimplify.requestEndTime() + 1);
        if (motionPathE != null) {
            motionPathE.saveLbsDataMap(map);
            double[] dArr = motionPathE.requestLbsDataMap().get(0L);
            LogUtil.a("Track_TrackAfterProcessGpsManager", "ProcessReceiver gpsInfoMap size ", Integer.valueOf(motionPathE.requestLbsDataMap().size()), " firstPoint lat =", Double.valueOf(dArr[0]), " firstPoint long =", Double.valueOf(dArr[1]));
            LogUtil.a("Track_TrackAfterProcessGpsManager", "ProcessReceiver isSuccess ", Boolean.valueOf(jaf.e(this.d, motionPathE, "motion_path_process.txt")));
            ive.c().a().saveTrackDataWhenProcess(motionPathSimplify, "motion_path_process.txt");
        }
    }

    public void i() {
        this.i = null;
        this.h = true;
        this.e = null;
        ReleaseLogUtil.d("Track_TrackAfterProcessGpsManager", "onDestroy finished ");
    }

    /* JADX INFO: renamed from: jal$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        AnonymousClass3(jal jalVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            ilf.b().d(new AppBundleLauncher.InstallCallback() { // from class: jak
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context, Intent intent) {
                    return jal.AnonymousClass3.b(context, intent);
                }
            });
        }

        static /* synthetic */ boolean b(Context context, Intent intent) {
            LogUtil.a("Track_TrackAfterProcessGpsManager", "PluginLocationProxy loadPlugin success");
            return false;
        }
    }

    public void d() {
        ThreadPoolManager.c().execute(new AnonymousClass3(this));
    }
}
