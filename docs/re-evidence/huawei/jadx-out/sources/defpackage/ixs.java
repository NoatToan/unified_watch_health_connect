package defpackage;

import android.content.Context;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class ixs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ixs f38178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f38179b = new Object();
    private boolean d = false;
    private boolean e = false;
    private int i = -1;
    private float h = -1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38180c = false;

    private ixs() {
    }

    public static ixs a() {
        if (f38178a == null) {
            synchronized (f38179b) {
                if (f38178a == null) {
                    f38178a = new ixs();
                }
            }
        }
        return f38178a;
    }

    public void g() {
        this.d = false;
        this.e = false;
    }

    public void e(boolean z) {
        this.d = z;
    }

    public boolean d() {
        return this.d;
    }

    void e(Context context, int i, float f, float f2) {
        if (i != 1 || this.e || f2 <= f) {
            return;
        }
        LogUtil.a("Track_StopSportWithTargetManager", " targetType", Integer.valueOf(i), " targetValue", Float.valueOf(f), " distance", Float.valueOf(f2), " mIsOverTarget: ", false);
        this.h = f;
        this.i = i;
        this.e = true;
        MotionPathSimplify motionPathSimplifyA = jac.a(context, "target_motion_simplify.txt");
        if (motionPathSimplifyA != null && motionPathSimplifyA.requestTotalDistance() >= Math.round(f)) {
            this.f38180c = true;
            LogUtil.a("Track_StopSportWithTargetManager", "isOverTarget");
        } else {
            e(context, f);
        }
    }

    private void e(Context context, float f) throws Throwable {
        CountDownLatch countDownLatch;
        jaf.a(context, "motion_path2.txt", "target_motion_path.txt");
        jaf.a(context, "simplemotion.txt", "target_motion_simplify.txt");
        iwy iwyVarA = iwy.a(context);
        LogUtil.a("Track_StopSportWithTargetManager", "!CommonUtil.closeRoad(),", Boolean.valueOf(izn.d()));
        if (!izn.d() && iwyVarA.k() == 264) {
            iwyVarA.bm();
        }
        iwyVarA.d(true);
        iwyVarA.c(true);
        ixr ixrVarAn = iwyVarA.an();
        if (ixrVarAn != null) {
            ixrVarAn.c();
            countDownLatch = new CountDownLatch(1);
            ixrVarAn.a(countDownLatch);
        } else {
            countDownLatch = null;
        }
        CountDownLatch countDownLatch2 = countDownLatch;
        MotionPath motionPathB = jac.b(context, "target_motion_path.txt");
        MotionPathSimplify motionPathSimplifyA = jac.a(context, "target_motion_simplify.txt");
        iyz iyzVarAf = iwyVarA.af();
        if (motionPathB != null && motionPathSimplifyA != null) {
            motionPathB.savePaceMap(d(f, iyzVarAf.o()));
            motionPathB.saveBritishPaceMap(iyzVarAf.l());
            motionPathB.savePaceV2(e(f, iyzVarAf.m()));
            motionPathB.saveBriPacesV2(iyzVarAf.k());
            iwyVarA.d(motionPathSimplifyA, motionPathB, true);
            motionPathSimplifyA.saveTotalDistance(Math.round(f));
        }
        iwyVarA.e("target_motion_path.txt", true);
        MotionPath motionPathB2 = jac.b(context, "target_motion_path.txt");
        motionPathB2.savePaceMap(d(f, iyzVarAf.o()));
        motionPathB2.saveBritishPaceMap(iyzVarAf.l());
        motionPathB2.savePaceV2(e(f, iyzVarAf.m()));
        motionPathB2.saveBriPacesV2(iyzVarAf.k());
        if (motionPathB != null) {
            motionPathB2.saveLbsDataMap(motionPathB.requestLbsDataMap());
        }
        a(motionPathB2, context, motionPathSimplifyA, ixrVarAn, countDownLatch2);
    }

    private static Map<Integer, Float> d(float f, Map<Integer, Float> map) {
        if (f % 1000.0f == 0.0f && map.size() > ((int) f) / 1000) {
            Iterator<Integer> it = map.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if ((next.intValue() / 100000) % 100 != 0) {
                    LogUtil.a("Track_StopSportWithTargetManager", "remove Key is ", next);
                    it.remove();
                }
            }
        }
        return map;
    }

    private static List<njj> e(float f, List<njj> list) {
        if (f % 1000.0f == 0.0f && list.size() > ((int) f) / 1000) {
            Iterator<njj> it = list.iterator();
            while (it.hasNext()) {
                int iC = it.next().c();
                if (iC % 1000 != 0) {
                    LogUtil.a("Track_StopSportWithTargetManager", "remove Key is ", Integer.valueOf(iC));
                    it.remove();
                }
            }
        }
        return list;
    }

    private void a(MotionPath motionPath, Context context, MotionPathSimplify motionPathSimplify, ixr ixrVar, CountDownLatch countDownLatch) throws Throwable {
        if (ixrVar != null && countDownLatch != null) {
            try {
                countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                ReleaseLogUtil.a("Track_StopSportWithTargetManager", "get step rate count down error, ", LogAnonymous.b(e));
            }
            if (motionPathSimplify != null) {
                motionPathSimplify.savePaceMap(motionPath.requestPaceMap());
                motionPathSimplify.saveBritishPaceMap(motionPath.requestBritishPaceMap());
                motionPathSimplify.savePaceV2(motionPath.getPacesV2());
                motionPathSimplify.saveBriPaceV2(motionPath.getBriPaceV2());
                b(motionPathSimplify);
                int iO = ixrVar.o();
                if (iO == 0) {
                    iO = iwy.a(context).ag();
                    LogUtil.a("Track_StopSportWithTargetManager", "targetTotalSteps = ", Integer.valueOf(iO));
                }
                motionPathSimplify.saveBestStepRate(ixrVar.h());
                motionPathSimplify.saveTotalSteps(iO);
                motionPathSimplify.saveAvgStepRate(ixrVar.d(motionPathSimplify.requestTotalTime()));
                jaf.c(context, motionPathSimplify, "target_motion_simplify.txt");
            }
            ArrayList<StepRateData> arrayListRequestStepRateList = motionPath.requestStepRateList();
            if (arrayListRequestStepRateList == null) {
                arrayListRequestStepRateList = new ArrayList<>();
            }
            arrayListRequestStepRateList.addAll(ixrVar.e(true));
            motionPath.saveStepRateList(arrayListRequestStepRateList);
            ixrVar.d();
        } else {
            jaf.c(context, motionPathSimplify, "target_motion_simplify.txt");
        }
        c(motionPath, motionPathSimplify);
        boolean zE = jaf.e(context, motionPath, "target_motion_path.txt", false);
        this.f38180c = zE;
        ReleaseLogUtil.d("Track_StopSportWithTargetManager", "refreshMotionData mIsSaveTargetSuccess：", Boolean.valueOf(zE));
    }

    private void b(MotionPathSimplify motionPathSimplify) {
        long jRequestTotalTime = motionPathSimplify.requestTotalTime();
        motionPathSimplify.correctTotalTime("Track_StopSportWithTargetManager");
        if (motionPathSimplify.requestTotalTime() + motionPathSimplify.requestStartTime() > System.currentTimeMillis()) {
            motionPathSimplify.saveTotalTime(jRequestTotalTime);
        }
    }

    private void c(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (motionPath.isValidLbsDataMap() && motionPathSimplify != null && (motionPath.requestLbsDataMap() instanceof TreeMap)) {
            TreeMap treeMap = (TreeMap) motionPath.requestLbsDataMap();
            long jRequestTotalTime = motionPathSimplify.requestTotalTime() / 1000;
            if (treeMap.size() > jRequestTotalTime) {
                motionPath.saveLbsDataMap(treeMap.subMap(0L, Long.valueOf(jRequestTotalTime)));
            }
            ReleaseLogUtil.d("Track_StopSportWithTargetManager", "correctLbsDataByTotalTime：lbsMap.size()=", Integer.valueOf(treeMap.size()), " totalTime= ", Long.valueOf(jRequestTotalTime));
        }
    }

    public boolean b() {
        return this.f38180c;
    }

    public int c() {
        return this.i;
    }

    public float j() {
        return this.h;
    }

    boolean e() {
        return this.e;
    }
}
