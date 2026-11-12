package defpackage;

import android.os.Bundle;
import android.os.Message;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.model.IRunningPostureCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f38297a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PluginSportTrackAdapter f38299c;
    private ExtendHandler e;
    private boolean d = false;
    private int o = 0;
    private int f = 0;
    private gzv h = new gzv();
    private CopyOnWriteArrayList<gzv> j = new CopyOnWriteArrayList<>();
    private ArrayList<gzv> i = new ArrayList<>(16);
    private long g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<gzv> f38298b = new CopyOnWriteArrayList<>();

    public jah(PluginSportTrackAdapter pluginSportTrackAdapter) {
        this.f38299c = null;
        this.f38299c = pluginSportTrackAdapter;
    }

    public void c(int i) {
        this.f = i;
    }

    public void d(int i) {
        this.o = i;
    }

    public void c(PluginSportTrackAdapter pluginSportTrackAdapter) {
        this.f38299c = pluginSportTrackAdapter;
    }

    public CopyOnWriteArrayList<gzv> c() {
        if (this.f38298b.size() >= 12) {
            return this.f38298b;
        }
        return null;
    }

    public void b() {
        if (jaa.h(this.o) && jaa.i(this.f)) {
            LogUtil.a("Track_RunningPostureUtils", "registerRunningPosture begin");
            if (this.f38299c == null) {
                LogUtil.e("Track_RunningPostureUtils", "registerRunningPosture mPluginTrackAdapter is null!");
                return;
            }
            d();
            this.f38299c.regRunningPostureListener(new IRunningPostureCallback() { // from class: jah.1
                @Override // com.huawei.healthcloud.plugintrack.model.IRunningPostureCallback
                public void onResult(int i) {
                }

                @Override // com.huawei.healthcloud.plugintrack.model.IRunningPostureCallback
                public void onChange(gzv gzvVar) {
                    if (gzvVar == null) {
                        LogUtil.j("Track_RunningPostureUtils", "runningPosture is null");
                    } else {
                        jah.this.b(gzvVar);
                        LogUtil.a("Track_RunningPostureUtils", "runningPosture is ", gzvVar.toString());
                    }
                }
            });
            this.d = true;
            return;
        }
        LogUtil.a("Track_RunningPostureUtils", "registerRunningPosture not supportRunningPosture");
    }

    public void c(List<gzv> list) {
        LogUtil.a("Track_RunningPostureUtils", "recoveryRunningPostureList");
        this.j.clear();
        if (njy.e(list)) {
            return;
        }
        this.j.addAll(list);
    }

    private void d() {
        LogUtil.a("Track_RunningPostureUtils", "startHandlerThread enter");
        if (this.e == null) {
            this.e = HandlerCenter.b(new a(this), "RUNNING_HANDLER_THREAD");
        }
    }

    private void i() {
        LogUtil.a("Track_RunningPostureUtils", "stopHandlerThread enter");
        synchronized (f38297a) {
            ExtendHandler extendHandler = this.e;
            if (extendHandler != null) {
                extendHandler.removeTasksAndMessages();
                this.e.quit(false);
                this.e = null;
            }
        }
    }

    public void a() {
        PluginSportTrackAdapter pluginSportTrackAdapter;
        if (this.d) {
            if (jaa.h(this.o) && (pluginSportTrackAdapter = this.f38299c) != null) {
                pluginSportTrackAdapter.unregRunningPostureListener();
            }
            this.d = false;
            i();
        }
    }

    public static boolean e() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RunningPostureUtils");
        if (deviceInfo == null) {
            LogUtil.j("Track_RunningPostureUtils", "device info null");
            return false;
        }
        return eey.d(deviceInfo, 175);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(gzv gzvVar) {
        if (!this.j.contains(gzvVar)) {
            this.j.add(gzvVar);
            LogUtil.a("Track_RunningPostureUtils", "updateRunningPostureData runningPosture.toString() =  ", gzvVar.toString());
        }
        if (!this.i.contains(gzvVar)) {
            this.i.add(gzvVar);
        }
        if (this.f38298b.size() >= 12) {
            this.f38298b.remove(0);
            this.f38298b.add(gzvVar);
        } else {
            this.f38298b.add(gzvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(gzv gzvVar) {
        if (this.e == null) {
            LogUtil.e("Track_RunningPostureUtils", "sendRunningPostureToThread mExtendHandler == null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.obj = gzvVar;
        this.e.sendMessage(messageObtain);
    }

    public void a(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("Track_RunningPostureUtils", "saveCadenceDta motionPathSimplify is null");
            return;
        }
        if (njy.e(this.j)) {
            return;
        }
        Bundle bundleD = gzu.d(this.j);
        c(motionPathSimplify, bundleD);
        float f = bundleD.getFloat("averageverticalimpactrate", -1.0f);
        if (f > 0.0f) {
            motionPathSimplify.addExtendDataMap("avg_v_i_r", String.valueOf(f));
        }
        float f2 = bundleD.getFloat("averageimpactpeak", -1.0f);
        if (f2 > 0.0f) {
            motionPathSimplify.addExtendDataMap("avg_i_p", String.valueOf(f2));
        }
        float f3 = bundleD.getFloat("averagegctimebalance", -1.0f);
        if (f3 > 0.0f) {
            motionPathSimplify.addExtendDataMap("avg_gc_tb", String.valueOf(f3));
        }
        float f4 = bundleD.getFloat("averageverticaloscillation", -1.0f);
        if (f4 > 0.0f) {
            motionPathSimplify.addExtendDataMap("avg_v_osc", String.valueOf(f4));
        }
        float f5 = bundleD.getFloat("averageverticalration", -1.0f);
        if (f5 > 0.0f) {
            motionPathSimplify.addExtendDataMap("avg_v_s_r", String.valueOf(f5));
        }
        if (f > 0.0f || f3 > 0.0f || f4 > 0.0f) {
            motionPathSimplify.addExtendDataMap("bolt_connected_flag", "2");
        }
        LogUtil.a("Track_RunningPostureUtils", "saveRunningPostureData verticalImpactRate = ", Float.valueOf(f), " avgImpactPeak = ", Float.valueOf(f2), " gcTimeBalance = ", Float.valueOf(f3), " verticalOscillation = ", Float.valueOf(f4), "avgVerStrikeRatio = ", Float.valueOf(f5), " motionPathSimplify.getExtendDataFloat = ", Float.valueOf(motionPathSimplify.getExtendDataFloat("bolt_connected_flag")));
    }

    private void c(MotionPathSimplify motionPathSimplify, Bundle bundle) {
        motionPathSimplify.saveAverageHangTime(bundle.getInt("averageHangTime", 0));
        motionPathSimplify.saveGroundHangTimeRate(bundle.getFloat("groundHangTimeRate", 0.0f));
        motionPathSimplify.saveAvgGroundContactTime(bundle.getInt("avgGroundContactTime", 0));
        motionPathSimplify.saveAvgGroundImpactAcceleration(bundle.getInt("avgGroundImpactAcceleration", 0));
        motionPathSimplify.saveAvgSwingAngle(bundle.getInt("avgSwingAngle", 0));
        motionPathSimplify.saveAvgEversionExcursion(bundle.getInt("avgEversionExcursion", -101));
        motionPathSimplify.saveAvgForeFootStrikePattern(bundle.getInt("foreFootStrikePatternPercentage", 0));
        motionPathSimplify.saveAvgWholeFootStrikePattern(bundle.getInt("wholeFootStrikePatternPercentage", 0));
        motionPathSimplify.saveAvgHindFootStrikePattern(bundle.getInt("hindFootStrikePatternPercentage", 0));
    }

    public ArrayList<gzv> a(boolean z) {
        ArrayList<gzv> arrayList = new ArrayList<>(16);
        if (this.i.size() > 0) {
            arrayList.addAll(this.i);
            if (z) {
                this.i.clear();
            }
        }
        return arrayList;
    }

    public void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        gzv gzvVar = this.h;
        if (gzvVar == null || gzvVar.r() || (this.g != 0 && TimeUnit.MILLISECONDS.toSeconds(iwy.a(BaseApplication.getContext()).getSportDuration()) - this.g > 20)) {
            LogUtil.j("Track_RunningPostureUtils", "putReportData reportData is null or long time no update");
        } else {
            c(bundle);
        }
    }

    private void c(Bundle bundle) {
        double dK = ((double) this.h.k()) / 100.0d;
        if (dK > 0.0d) {
            bundle.putString("flightRatio", ltc.c(dK, 1, 1));
        }
        if (this.h.a() > 0) {
            bundle.putString("groundContactTime", String.valueOf(this.h.a()));
        }
        if (this.h.d() > 0) {
            bundle.putString("mGroundImpactAcceleration", String.valueOf(this.h.d()));
        }
        if (this.h.j() > 0) {
            bundle.putString("swingAngle", String.valueOf(this.h.j()));
        }
        if (this.h.b() != -101) {
            bundle.putString("eversion", String.valueOf(this.h.b()));
        }
        if (this.h.l() > 0) {
            bundle.putString("hangTime", String.valueOf(this.h.l()));
        }
        if (this.h.f() > 0.0f) {
            bundle.putString("verticalLoadingRate", ltc.c(this.h.f(), 1, 1));
        }
        if (this.h.o() > 0.0f) {
            bundle.putString("activePeak", String.valueOf(this.h.o()));
        }
        if (this.h.n() > 0.0f) {
            bundle.putString("GCTimeBalance", ltc.c(this.h.n(), 1, 1));
        }
        float fT = this.h.t();
        if (fT > 0.0f) {
            bundle.putString("verticalOscillation", ltc.c(fT, 1, 1));
        }
        int iM = this.h.m();
        if (iM <= 0 || fT <= 0.0f) {
            return;
        }
        bundle.putString("mVerticalRatio", ltc.c((fT / iM) * 100.0f, 1, 1));
    }

    public Bundle a(Bundle bundle) {
        if (this.h == null || (this.g != 0 && TimeUnit.MILLISECONDS.toSeconds(iwy.a(BaseApplication.getContext()).getSportDuration()) - this.g > 20)) {
            LogUtil.j("Track_RunningPostureUtils", "putReportData reportData is null or long time no update");
            return bundle;
        }
        e(bundle, this.h);
        return bundle;
    }

    public static void e(Bundle bundle, gzv gzvVar) {
        if (bundle == null || gzvVar == null) {
            return;
        }
        int iA = gzvVar.a();
        int iD = gzvVar.d();
        int iJ = gzvVar.j();
        int iB = gzvVar.b();
        int iL = gzvVar.l();
        int iE = gzvVar.e();
        int i = gzvVar.i();
        int iC = gzvVar.c();
        double dK = ((double) gzvVar.k()) / 100.0d;
        float f = gzvVar.f();
        float fO = gzvVar.o();
        float fN = gzvVar.n();
        float fT = gzvVar.t();
        bundle.putInt("groundContactTime", iA);
        bundle.putInt("mGroundImpactAcceleration", iD);
        bundle.putInt("swingAngle", iJ);
        bundle.putInt("eversion", iB);
        bundle.putInt("hangTime", iL);
        bundle.putDouble("flightRatio", dK > 0.0d ? CommonUtil.a(ltc.c(dK, 1, 1)) : 0.0d);
        bundle.putInt("foreSteps", iE);
        bundle.putInt("wholeSteps", i);
        bundle.putInt("hindSteps", iC);
        bundle.putFloat("verticalLoadingRate", f);
        bundle.putFloat("activePeak", fO);
        bundle.putFloat("GCTimeBalance", fN);
        bundle.putFloat("verticalOscillation", fT);
        int iM = gzvVar.m();
        bundle.putInt("stride", iM);
        if (iM <= 0 || fT <= 0.0f) {
            return;
        }
        bundle.putFloat("mVerticalRatio", new BigDecimal((fT / iM) * 100.0f).setScale(1, 1).floatValue());
    }

    static class a extends BaseHandlerCallback<jah> {
        private float b(float f, boolean z) {
            if (f != 0.0f || z) {
                return f;
            }
            return -1.0f;
        }

        private int e(int i, boolean z, float f) {
            return (i != 0 || z) ? i : (int) f;
        }

        a(jah jahVar) {
            super(jahVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(jah jahVar, Message message) {
            if (message.what != 7) {
                return false;
            }
            if (message.obj instanceof gzv) {
                jahVar.h = (gzv) message.obj;
                LogUtil.a("Track_RunningPostureUtils", " handleMessage MSG_UPDATE_RUNNING_POSTURE utils.mRunningPostureTemp = ", jahVar.h);
                if (jahVar.h.r()) {
                    return true;
                }
                gzv gzvVar = new gzv();
                gzvVar.a(TimeUnit.MILLISECONDS.toSeconds(iwy.a(BaseApplication.getContext()).getSportDuration()));
                e(gzvVar, jahVar.h, false);
                jahVar.d(gzvVar);
                jahVar.g = jahVar.h.h();
            }
            return true;
        }

        private void e(gzv gzvVar, gzv gzvVar2, boolean z) {
            if (gzvVar == null || gzvVar2 == null) {
                return;
            }
            if (gzvVar2.t() >= 0.0f) {
                gzvVar.a(b(gzvVar2.t(), z));
            }
            if (gzvVar2.n() >= 0.0f) {
                gzvVar.b(b(gzvVar2.n(), z));
            }
            if (gzvVar2.f() >= 0.0f) {
                gzvVar.d(b(gzvVar2.f(), z));
            }
            if (gzvVar2.o() >= 0.0f) {
                gzvVar.c(b(gzvVar2.o(), z));
            }
            if (gzvVar2.m() >= 0) {
                gzvVar.f(e(gzvVar2.m(), z));
            }
            if (gzvVar2.l() >= 0) {
                gzvVar.i(e(gzvVar2.l(), z));
            }
            if (gzvVar2.k() >= 0) {
                gzvVar.h(e(gzvVar2.k(), z));
            }
            e(gzvVar, z);
            if (gzvVar2.b() != -101) {
                gzvVar.c(e(gzvVar2.b(), z, -101.0f));
            }
            a(gzvVar, gzvVar2, z);
            if (gzvVar2.a() >= 0) {
                gzvVar.d(e(gzvVar2.a(), z));
            }
            if (gzvVar2.d() >= 0) {
                gzvVar.b(e(gzvVar2.d(), z));
            }
            if (gzvVar2.j() >= 0) {
                gzvVar.g(e(gzvVar2.j(), z));
            }
        }

        private void a(gzv gzvVar, gzv gzvVar2, boolean z) {
            if (gzvVar2.e() >= 0) {
                gzvVar.e(e(gzvVar2.e(), z));
            }
            if (gzvVar2.i() >= 0) {
                gzvVar.j(e(gzvVar2.i(), z));
            }
            if (gzvVar2.c() >= 0) {
                gzvVar.a(e(gzvVar2.c(), z));
            }
        }

        private void e(gzv gzvVar, boolean z) {
            int iM = gzvVar.m();
            float fT = gzvVar.t();
            LogUtil.a("Track_RunningPostureUtils", " updateRunningPostureTemp stepLength = ", Integer.valueOf(iM), " oscillation = ", Float.valueOf(fT));
            if (iM <= 0 || fT < 0.0f) {
                return;
            }
            float fFloatValue = new BigDecimal((fT / iM) * 100.0f).setScale(1, 1).floatValue();
            gzvVar.e(b(fFloatValue, z));
            LogUtil.a("Track_RunningPostureUtils", " updateRunningPostureTemp averageVerticalRatio hasSave = ", Float.valueOf(fFloatValue));
        }

        private int e(int i, boolean z) {
            return e(i, z, -1.0f);
        }
    }
}
