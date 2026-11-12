package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.health.algorithm.api.TrackFeatureExtractionApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.TrackAltPointData;
import com.huawei.hwfoundationmodel.trackmodel.TrackPauseData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.RouteOutputForApp;
import com.huawei.route.RouteTrackInfo;
import com.huawei.route.RouteTrackPoint;
import com.huawei.route.RouteType;
import com.huawei.route.SceneType;
import com.huawei.route.SlopeInfo;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f38306c = new Object();
    private static volatile jan d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f38308b;
    private boolean h = false;
    private final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<njm> f38307a = new ArrayList<>();

    private jan(Context context) {
        this.f38308b = context;
    }

    public static jan e() {
        jan janVar;
        synchronized (f38306c) {
            if (d == null) {
                d = new jan(BaseApplication.getContext());
            }
            janVar = d;
        }
        return janVar;
    }

    public void e(MotionPath motionPath, MotionPathSimplify motionPathSimplify, boolean z) {
        if (z) {
            e(motionPath, motionPathSimplify);
        }
        b();
    }

    public void d() {
        ReleaseLogUtil.d("Track_SportAfterProcessManager", "resetProcessFinish");
        synchronized (this.e) {
            this.h = false;
            this.f38307a = new ArrayList<>();
        }
    }

    public void e(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        ArrayList arrayList;
        LogUtil.a("Track_SportAfterProcessManager", "postProcessingTrackResult");
        if (motionPath == null || motionPathSimplify == null) {
            ReleaseLogUtil.d("Track_SportAfterProcessManager", "postProcessingTrackResult motionPath == null is ", Boolean.valueOf(motionPath == null));
            return;
        }
        if (!i()) {
            ReleaseLogUtil.d("Track_SportAfterProcessManager", "postProcessingTrackResult isNeedAfterProcess is false");
            return;
        }
        MotionPath motionPathE = jac.e(this.f38308b, motionPathSimplify.requestSportType());
        if (motionPathE == null) {
            ReleaseLogUtil.d("Track_SportAfterProcessManager", "postProcessingTrackResult motionPathFromFile is null");
            return;
        }
        e(motionPathE);
        a(motionPathE, motionPathSimplify);
        this.h = true;
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        synchronized (this.e) {
            arrayList = new ArrayList(this.f38307a);
        }
        intent.putExtra("SportAfterProcessAltList", arrayList);
        intent.setAction("com.huawei.health.update_process_track");
        BaseApplication.getContext().sendBroadcast(intent, SecurityConstant.f5920a);
    }

    private boolean i() {
        boolean zB;
        synchronized (this.e) {
            zB = njy.b(this.f38307a);
        }
        return zB;
    }

    private void e(MotionPath motionPath) {
        synchronized (this.e) {
            motionPath.saveAltitudeList(this.f38307a);
        }
    }

    public boolean a() {
        return this.h;
    }

    public ArrayList<njm> c() {
        return this.f38307a;
    }

    private void a(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.e("Track_SportAfterProcessManager", "saveSportDataWhenProcessFinished motionPathSimplify == null");
            return;
        }
        motionPathSimplify.saveEndTime(motionPathSimplify.requestEndTime() + 1);
        if (motionPath != null) {
            LogUtil.a("Track_SportAfterProcessManager", "ProcessReceiver isSuccess ", Boolean.valueOf(jaf.e(this.f38308b, motionPath, "motion_path_process.txt")));
            ive.c().a().saveTrackDataWhenProcess(motionPathSimplify, "motion_path_process.txt");
        }
    }

    public void d(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (motionPath == null || motionPathSimplify == null) {
            ReleaseLogUtil.d("Track_SportAfterProcessManager", "saveSlopeInfo motionPath == null is ", Boolean.valueOf(motionPath == null));
            return;
        }
        if (motionPathSimplify.requestSportType() != 259) {
            ReleaseLogUtil.d("Track_SportAfterProcessManager", "saveSlopeInfo sportType = ", Integer.valueOf(motionPathSimplify.requestSportType()));
            return;
        }
        if (!motionPath.isValidAltitudeList()) {
            ReleaseLogUtil.d("Track_SportAfterProcessManager", "saveSlopeInfo altitudeList isEmpty");
        } else if (njy.e(motionPath.requestLbsDataMap())) {
            ReleaseLogUtil.d("Track_SportAfterProcessManager", "saveSlopeInfo LbsDataMap isEmpty");
        } else {
            c(motionPath, motionPathSimplify, b(motionPath, motionPathSimplify));
        }
    }

    private RouteTrackInfo b(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        RouteTrackInfo routeTrackInfo = new RouteTrackInfo();
        ArrayList arrayList = new ArrayList();
        int i = motionPathSimplify.requestDeviceType() == 32 ? 1 : 1000;
        Iterator<Map.Entry<Long, double[]>> it = motionPath.requestLbsDataMap().entrySet().iterator();
        while (it.hasNext()) {
            double[] value = it.next().getValue();
            if (value.length >= 4 && !jfn.a(value[0], value[1]) && !jfn.b(value[0], value[1])) {
                RouteTrackPoint routeTrackPoint = new RouteTrackPoint();
                routeTrackPoint.setLatitude(value[0]);
                routeTrackPoint.setLongitude(value[1]);
                routeTrackPoint.setAltitude(value[2]);
                routeTrackPoint.setTimestamp((((long) value[3]) * ((long) i)) / 1000);
                arrayList.add(routeTrackPoint);
            }
        }
        routeTrackInfo.setPoints(arrayList);
        routeTrackInfo.setPointsNum(arrayList.size());
        ArrayList arrayList2 = new ArrayList();
        for (njm njmVar : motionPath.requestAltitudeList()) {
            arrayList2.add(new TrackAltPointData(njmVar.acquireTime() / 1000, njmVar.a()));
        }
        routeTrackInfo.setSupportClimb(true);
        routeTrackInfo.setAltPoints(arrayList2);
        routeTrackInfo.setAltPointsNum(arrayList2.size());
        ArrayList arrayList3 = new ArrayList();
        for (TrackPauseData trackPauseData : motionPath.requestPauseList()) {
            trackPauseData.setTimestamp(trackPauseData.acquireTime() / 1000);
            arrayList3.add(trackPauseData);
        }
        routeTrackInfo.setPauseInfos(arrayList3);
        routeTrackInfo.setPauseInfosNum(motionPath.requestPauseList().size());
        routeTrackInfo.setDisInfos(motionPath.requestDistanceList());
        routeTrackInfo.setDisInfosNum(motionPath.requestDistanceList().size());
        routeTrackInfo.setTrackType(RouteType.DEFAULT.routeType());
        routeTrackInfo.setTotalTime(motionPathSimplify.requestTotalTime());
        routeTrackInfo.setWorkoutType(motionPathSimplify.requestSportType());
        routeTrackInfo.setUseType(1);
        routeTrackInfo.setSceneType(SceneType.getSceneTypeBySportType(motionPathSimplify.requestSportType()).sceneType());
        routeTrackInfo.setShowAltitude(routeTrackInfo.getTrackType() == RouteType.DEFAULT.routeType());
        return routeTrackInfo;
    }

    private void c(MotionPath motionPath, MotionPathSimplify motionPathSimplify, RouteTrackInfo routeTrackInfo) {
        TrackFeatureExtractionApi trackFeatureExtractionApi = (TrackFeatureExtractionApi) Services.d("TrackFeatureExtractionAlgorithmService", TrackFeatureExtractionApi.class);
        if (trackFeatureExtractionApi == null) {
            ReleaseLogUtil.d("Track_SportAfterProcessManager", "saveSlopeInfo trackTrainApi == null");
            return;
        }
        try {
            RouteOutputForApp trackOutputForApp = trackFeatureExtractionApi.getTrackOutputForApp(routeTrackInfo, 80000, 0.0d, false);
            if (trackOutputForApp == null) {
                ReleaseLogUtil.d("Track_SportAfterProcessManager", "saveSlopeInfo outputForApp == null");
                return;
            }
            if (njy.b(trackOutputForApp.getSlopeInfo())) {
                ReleaseLogUtil.d("Track_SportAfterProcessManager", "saveSlopeInfo getSlopeInfo.size is ", Integer.valueOf(trackOutputForApp.getSlopeInfo().size()));
                for (SlopeInfo slopeInfo : trackOutputForApp.getSlopeInfo()) {
                    slopeInfo.setClimbTime(slopeInfo.getClimbTime() * 1000);
                }
                motionPath.saveSlopeInfoList(trackOutputForApp.getSlopeInfo());
            }
            HashMap map = new HashMap();
            map.put("slopeInfoNum", String.valueOf(trackOutputForApp.getSlopeInfoNum()));
            map.put("flatDistance", String.valueOf(trackOutputForApp.getFlatDistance()));
            map.put("flatRatio", String.valueOf(trackOutputForApp.getFlatRatio()));
            map.put("upHillDistance", String.valueOf(trackOutputForApp.getUpHillDistance()));
            map.put("upHillRatio", String.valueOf(trackOutputForApp.getUpHillRatio()));
            map.put("downHillDistance", String.valueOf(trackOutputForApp.getDownHillDistance()));
            map.put("downHillRatio", String.valueOf(trackOutputForApp.getDownHillRatio()));
            motionPathSimplify.saveExtendDataMap(map);
            if (trackOutputForApp.getCaliAltPointsNum() <= 0) {
                ReleaseLogUtil.d("Track_SportAfterProcessManager", "saveSlopeInfo getCaliAltPointsNum is 0");
                return;
            }
            ArrayList<njm> arrayList = new ArrayList<>();
            for (TrackAltPointData trackAltPointData : trackOutputForApp.getCaliAltPoints()) {
                arrayList.add(new njm(trackAltPointData.getTimestamp() * 1000, trackAltPointData.getAlt()));
            }
            synchronized (this.e) {
                this.f38307a = arrayList;
            }
        } catch (RuntimeException e) {
            ReleaseLogUtil.a("Track_SportAfterProcessManager", LogAnonymous.b(e));
        }
    }

    public void b() {
        ReleaseLogUtil.d("Track_SportAfterProcessManager", "onDestroy finished ");
    }
}
