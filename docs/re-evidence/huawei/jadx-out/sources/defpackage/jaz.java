package defpackage;

import com.huawei.healthcloud.plugintrack.manager.voice.SportAudioScenarioId;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.ChineseVoiceConstructor;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.ISoundResourceConstructor;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceContentConstructor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jaz extends ChineseVoiceConstructor implements IVoiceContentConstructor, ISoundResourceConstructor {
    private boolean c(int i) {
        return i == 264 || i == 257 || i == 258;
    }

    private boolean e(int i) {
        return i == 259 || i == 265;
    }

    public jaz() {
        Locale locale = BaseApplication.getContext().getResources().getConfiguration().locale;
        String strE = pqj.e();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pqj.b().init(pqp.c(strE, "", "Sport", locale));
        LogUtil.a("MultilingualAudioConstructor", "MultilingualAudio init lang ", strE, " locale ", locale, " timbre ", "", " init time ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.ChineseVoiceConstructor, com.huawei.healthcloud.plugintrack.manager.voice.constructor.ISoundResourceConstructor
    public Map<Integer, Integer> getSoundResource() {
        return super.getSoundResource();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.ChineseVoiceConstructor, com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceContentConstructor
    public Object constructContent(int i, Object obj) {
        LogUtil.a("MultilingualAudioConstructor", "constructContent type : ", Integer.valueOf(i));
        if (!(obj instanceof jbc)) {
            LogUtil.a("MultilingualAudioConstructor", "parameter not instance of SportStateVoiceParameter");
            return a();
        }
        jbc jbcVar = (jbc) obj;
        ArrayList arrayList = new ArrayList(1);
        if (a((List<Object>) arrayList, i) || e(arrayList, i, jbcVar) || d(arrayList, i, jbcVar) || a(arrayList, i, jbcVar)) {
            return arrayList;
        }
        d((List<Object>) arrayList);
        return arrayList;
    }

    private void d(List<Object> list) {
        if (list.isEmpty()) {
            list.addAll(a());
        }
    }

    private boolean a(List<Object> list, int i, jbc jbcVar) {
        if (i == 9) {
            list.addAll(c(jbcVar, 9));
            return true;
        }
        if (i != 11) {
            return false;
        }
        list.addAll(c(jbcVar, 11));
        return true;
    }

    private boolean d(List<Object> list, int i, jbc jbcVar) {
        if (i == 14) {
            list.addAll(f());
            return true;
        }
        switch (i) {
            case 21:
                list.addAll(d());
                return true;
            case 22:
                list.addAll(b());
                return true;
            case 23:
                list.addAll(m(jbcVar));
                return true;
            case 24:
                list.addAll(c());
                return true;
            case 25:
                list.addAll(o());
                return true;
            default:
                return false;
        }
    }

    private boolean e(List<Object> list, int i, jbc jbcVar) {
        if (i == 6) {
            list.addAll(g());
            return true;
        }
        if (i == 12) {
            list.addAll(f(jbcVar));
            return true;
        }
        if (i == 13) {
            list.addAll(h(jbcVar));
            return true;
        }
        switch (i) {
            case 17:
                list.addAll(o(jbcVar));
                return true;
            case 18:
                list.addAll(e());
                return true;
            case 19:
                list.addAll(j());
                return true;
            case 20:
                list.addAll(a(jbcVar));
                return true;
            default:
                return false;
        }
    }

    private boolean a(List<Object> list, int i) {
        if (i == 0) {
            list.addAll(r());
            return true;
        }
        if (i == 1) {
            list.addAll(s());
            return true;
        }
        if (i == 2) {
            list.addAll(x());
            return true;
        }
        if (i == 3) {
            list.addAll(k());
            return true;
        }
        if (i == 4) {
            list.addAll(v());
            return true;
        }
        if (i == 5) {
            list.addAll(n());
            return true;
        }
        if (i == 15) {
            list.addAll(u());
            return true;
        }
        if (i != 16) {
            switch (i) {
                case 110:
                    list.addAll(w());
                    return true;
                case 111:
                    list.addAll(p());
                    return true;
                case 112:
                    list.addAll(t());
                    return true;
                default:
                    return false;
            }
        }
        list.addAll(y());
        return true;
    }

    private List<String> a(jbc jbcVar) {
        int iA = jbcVar.a();
        List<SportAudioScenarioId> countDownScenarios = SportAudioScenarioId.getCountDownScenarios();
        if (njy.e(countDownScenarios, iA)) {
            return Collections.EMPTY_LIST;
        }
        return c(countDownScenarios.get(iA));
    }

    public List<String> c(jbc jbcVar, int i) {
        LogUtil.a("MultilingualAudioConstructor", "getSportInfoUrls ", jbcVar, " ", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList(1);
        arrayList.addAll(e(jbcVar, i));
        arrayList.addAll(g(jbcVar));
        arrayList.addAll(j(jbcVar));
        arrayList.addAll(k(jbcVar));
        arrayList.addAll(d(jbcVar));
        arrayList.addAll(l(jbcVar));
        arrayList.addAll(b(jbcVar));
        arrayList.addAll(c(jbcVar));
        arrayList.addAll(i(jbcVar));
        arrayList.addAll(e(jbcVar));
        arrayList.addAll(q(jbcVar));
        arrayList.addAll(n(jbcVar));
        arrayList.addAll(a());
        LogUtil.a("MultilingualAudioConstructor", "getSportInfoUrls ", arrayList);
        return arrayList;
    }

    private List<String> a() {
        return c(SportAudioScenarioId.EMPTY);
    }

    private List<String> e(jbc jbcVar, int i) {
        boolean zS = jbcVar.s();
        boolean zP = jbcVar.p();
        float fB = jbcVar.b();
        if (zS && i == 9) {
            fB = (int) fB;
        }
        int iR = ((int) jbcVar.r()) / 1000;
        int iY = jbcVar.y();
        if (fB <= 0.0f || iR <= 0 || iY < 0) {
            return Collections.EMPTY_LIST;
        }
        boolean z = false;
        boolean z2 = jbcVar.l() > 50;
        if (jbcVar.o() && jbcVar.f() > 0.0f) {
            z = true;
        }
        if (zS && z) {
            return a(fB, iR, iY, jbcVar.f() / 1000.0f, z2);
        }
        if (zP && z) {
            return a(fB, iR, iY, (int) jbcVar.f(), z2);
        }
        return d(fB, iR);
    }

    private List<String> a(double d, int i, int i2, int i3, boolean z) {
        SportAudioScenarioId sportAudioScenarioId;
        pqk pqkVar = new pqk();
        d(pqkVar, d);
        pqkVar.e(Integer.valueOf(i));
        pqkVar.e(Integer.valueOf(i2));
        pqkVar.e(Integer.valueOf(i3));
        if (z) {
            sportAudioScenarioId = SportAudioScenarioId.EXERCISE_DETAIL_WHEN_TIME_TARGET_HANG_ON;
        } else {
            sportAudioScenarioId = SportAudioScenarioId.EXERCISE_DETAIL_WHEN_TIME_TARGET_COME_ON;
        }
        return d(sportAudioScenarioId, pqkVar);
    }

    private List<String> a(double d, int i, int i2, double d2, boolean z) {
        SportAudioScenarioId sportAudioScenarioId;
        pqk pqkVar = new pqk();
        d(pqkVar, d);
        pqkVar.e(Integer.valueOf(i));
        pqkVar.e(Integer.valueOf(i2));
        pqkVar.d(Double.valueOf(d2));
        if (z) {
            sportAudioScenarioId = SportAudioScenarioId.EXERCISE_DETAIL_WHEN_DISTANCE_TARGET_HANG_ON;
        } else {
            sportAudioScenarioId = SportAudioScenarioId.EXERCISE_DETAIL_WHEN_DISTANCE_TARGET_COME_ON;
        }
        return d(sportAudioScenarioId, pqkVar);
    }

    private List<String> d(double d, int i) {
        pqk pqkVar = new pqk();
        d(pqkVar, d);
        pqkVar.e(Integer.valueOf(i));
        return d(SportAudioScenarioId.EXERCISE_DETAIL_WITHOUT_TARGET, pqkVar);
    }

    private void d(pqk pqkVar, double d) {
        double d2 = UnitUtil.d(d, 2);
        if (Math.abs(d2 - Math.round(d2)) < Double.MIN_VALUE) {
            pqkVar.e(Integer.valueOf((int) d2));
        } else {
            pqkVar.d(Double.valueOf(d2));
        }
    }

    private List<String> q(jbc jbcVar) {
        if (!jbcVar.an()) {
            return Collections.EMPTY_LIST;
        }
        int iZ = jbcVar.z();
        if (iZ == 22) {
            return r(jbcVar);
        }
        if (iZ == 23) {
            return ad();
        }
        return Collections.EMPTY_LIST;
    }

    private List<String> ad() {
        return c(SportAudioScenarioId.WARM_UP_NOT_ENOUGH);
    }

    private List<String> r(jbc jbcVar) {
        pqk pqkVar = new pqk();
        pqkVar.e(Integer.valueOf(jbcVar.ae()));
        pqkVar.e(Integer.valueOf(jbcVar.ad()));
        return d(SportAudioScenarioId.WARM_UP_IN_HEART_RATE_RANGE, pqkVar);
    }

    private List<String> n(jbc jbcVar) {
        if (!jbcVar.ah()) {
            return Collections.EMPTY_LIST;
        }
        int iU = jbcVar.u();
        Map<Integer, SportAudioScenarioId> runningPostureScenarios = SportAudioScenarioId.getRunningPostureScenarios();
        if (!runningPostureScenarios.containsKey(Integer.valueOf(iU))) {
            return Collections.EMPTY_LIST;
        }
        return c(runningPostureScenarios.get(Integer.valueOf(iU)));
    }

    private List<String> e(jbc jbcVar) {
        if (!jbcVar.aj()) {
            return Collections.EMPTY_LIST;
        }
        int iAc = jbcVar.ac();
        Map<Integer, SportAudioScenarioId> cadenceSpeedScenarios = SportAudioScenarioId.getCadenceSpeedScenarios();
        if (!cadenceSpeedScenarios.containsKey(Integer.valueOf(iAc))) {
            return Collections.EMPTY_LIST;
        }
        return c(cadenceSpeedScenarios.get(Integer.valueOf(iAc)));
    }

    private List<String> i(jbc jbcVar) {
        if (!jbcVar.ai()) {
            return Collections.EMPTY_LIST;
        }
        int iW = jbcVar.w();
        Map<Integer, SportAudioScenarioId> landPostureEstimationScenarios = SportAudioScenarioId.getLandPostureEstimationScenarios();
        if (!landPostureEstimationScenarios.containsKey(Integer.valueOf(iW))) {
            return Collections.EMPTY_LIST;
        }
        return c(landPostureEstimationScenarios.get(Integer.valueOf(iW)));
    }

    private List<String> c(jbc jbcVar) {
        if (!jbcVar.af()) {
            return Collections.EMPTY_LIST;
        }
        return c(SportAudioScenarioId.ADJUST_POSTURE_REMIND);
    }

    private List<String> b(jbc jbcVar) {
        if (!jbcVar.am()) {
            return Collections.EMPTY_LIST;
        }
        return c(SportAudioScenarioId.FOLLOW_DEVICE_GUIDE_TO_SPORT);
    }

    private List<String> l(jbc jbcVar) {
        if (!jbcVar.ak()) {
            return Collections.EMPTY_LIST;
        }
        return c(SportAudioScenarioId.PRESS_START_ON_DEVICE_TO_SPORT);
    }

    private List<String> d(jbc jbcVar) {
        if (!jbcVar.ag()) {
            return Collections.EMPTY_LIST;
        }
        return c(SportAudioScenarioId.DEVICE_CONNECTED);
    }

    private List<String> k(jbc jbcVar) {
        if (!jbcVar.x()) {
            return Collections.EMPTY_LIST;
        }
        float fC = jbcVar.c();
        int iK = jbcVar.k();
        if (fC > 0.0f) {
            return a(jbcVar, fC, iK);
        }
        return a(jbcVar, iK);
    }

    private List<String> a(jbc jbcVar, int i) {
        LogUtil.a("MultilingualAudioConstructor", "getCurrentSpeedEqualsZero, mSpeed = 0");
        if (jbcVar.s() && jbcVar.p() && jbcVar.x() && jbcVar.t()) {
            return Collections.EMPTY_LIST;
        }
        if (c(i)) {
            return m();
        }
        if (e(i)) {
            return q();
        }
        return Collections.EMPTY_LIST;
    }

    private List<String> a(jbc jbcVar, float f, int i) {
        double d;
        LogUtil.a("MultilingualAudioConstructor", "getCurrentSpeedGreaterThanZero");
        if (c(i)) {
            return c(((int) (3600.0f / f)) * 1000, jbcVar.j());
        }
        if (e(i)) {
            try {
                d = Double.parseDouble(jaa.d(f, 1));
            } catch (NumberFormatException unused) {
                LogUtil.j("MultilingualAudioConstructor", "numberFormatException");
                d = 0.0d;
            }
            return d(d, jbcVar.j());
        }
        return Collections.EMPTY_LIST;
    }

    private List<String> d(double d, boolean z) {
        new pqk().d(Double.valueOf(d));
        return c(z ? SportAudioScenarioId.CURRENT_SPEED_GREAT : SportAudioScenarioId.CURRENT_SPEED_COME_ON);
    }

    private List<String> c(int i, boolean z) {
        new pqk().e(Integer.valueOf(i));
        return c(z ? SportAudioScenarioId.CURRENT_PACE_GREAT : SportAudioScenarioId.CURRENT_PACE_COME_ON);
    }

    private List<String> q() {
        return c(SportAudioScenarioId.SPEED_MEASURING);
    }

    private List<String> m() {
        return c(SportAudioScenarioId.PACE_MEASURING);
    }

    private List<String> j(jbc jbcVar) {
        if (!jbcVar.t()) {
            return Collections.EMPTY_LIST;
        }
        LogUtil.a("MultilingualAudioConstructor", "getHeartRateUrls");
        int iE = jbcVar.e();
        if (iE > 0) {
            return a(iE);
        }
        if (jbcVar.s() && jbcVar.p() && ((jbcVar.x() || jbcVar.v()) && jbcVar.t())) {
            return Collections.EMPTY_LIST;
        }
        if (jbcVar.ab() > 1) {
            return Collections.EMPTY_LIST;
        }
        boolean zI = ive.c().i();
        boolean zL = ive.c().l();
        if (!zI || !zL) {
            return i();
        }
        return h();
    }

    private List<String> h() {
        return c(SportAudioScenarioId.HEART_RATE_MEASURING);
    }

    private List<String> i() {
        return c(SportAudioScenarioId.HEART_RATE_DEVICE_NOT_CONNECTED);
    }

    private List<String> a(int i) {
        pqk pqkVar = new pqk();
        pqkVar.e(Integer.valueOf(i));
        return d(SportAudioScenarioId.CURRENT_HEART_RATE, pqkVar);
    }

    private List<String> g(jbc jbcVar) {
        if (!jbcVar.v()) {
            return Collections.EMPTY_LIST;
        }
        long jG = jbcVar.g();
        LogUtil.a("MultilingualAudioConstructor", "getPaceUrls");
        if (jG > 0) {
            return d(jbcVar, jG);
        }
        return Collections.EMPTY_LIST;
    }

    private List<String> d(jbc jbcVar, long j) {
        if (j <= 1000) {
            if (jbcVar.s() && jbcVar.p() && jbcVar.v() && jbcVar.t()) {
                return Collections.EMPTY_LIST;
            }
            return l();
        }
        return d(j / 1000, jbcVar.j());
    }

    private List<String> d(long j, boolean z) {
        pqk pqkVar = new pqk();
        pqkVar.e(Integer.valueOf((int) j));
        return d(z ? SportAudioScenarioId.RECENT_ONE_KM_PACE_GREAT : SportAudioScenarioId.RECENT_ONE_KM_PACE_COMMON_ON, pqkVar);
    }

    private List<String> l() {
        return c(SportAudioScenarioId.LESS_THEN_ONE_KM);
    }

    private List<String> s() {
        return c(SportAudioScenarioId.START_RUN);
    }

    private List<String> t() {
        return c(SportAudioScenarioId.START_CLIMB);
    }

    private List<String> p() {
        return c(SportAudioScenarioId.START_HIKING);
    }

    private List<String> w() {
        return c(SportAudioScenarioId.START_SPORT);
    }

    private List<String> r() {
        return c(SportAudioScenarioId.START_BIKE);
    }

    private List<String> x() {
        return c(SportAudioScenarioId.START_WALK);
    }

    private List<String> b() {
        return a(SportAudioScenarioId.getEncourageScenarios());
    }

    private List<String> d() {
        return a(SportAudioScenarioId.getEncourageWithRunningScenarios());
    }

    private List<String> a(List<SportAudioScenarioId> list) {
        int iD = d(list.size());
        if (njy.e(list, iD)) {
            iD = 0;
        }
        return c(list.get(iD));
    }

    private int d(int i) {
        return new SecureRandom().nextInt(i);
    }

    private List<String> k() {
        return c(SportAudioScenarioId.PAUSE_SPORT);
    }

    private List<String> n() {
        return c(SportAudioScenarioId.RESUME_SPORT);
    }

    private List<String> u() {
        return c(SportAudioScenarioId.STOP_SPORT_WITH_RELAX);
    }

    private List<String> y() {
        return c(SportAudioScenarioId.STOP_SPORT_WITH_STRETCH);
    }

    private List<String> v() {
        return c(SportAudioScenarioId.STOP_SPORT);
    }

    private List<String> g() {
        return c(SportAudioScenarioId.ACHIEVE_GOAL);
    }

    private List<String> j() {
        return c(SportAudioScenarioId.ACHIEVE_HALF_GOAL);
    }

    private List<String> h(jbc jbcVar) {
        new pqk().e(Integer.valueOf(c(jbcVar.r())));
        return c(SportAudioScenarioId.HALF_MARATHON_COMPLETE);
    }

    private List<String> f(jbc jbcVar) {
        new pqk().e(Integer.valueOf(c(jbcVar.r())));
        return c(SportAudioScenarioId.MARATHON_COMPLETE);
    }

    private List<String> e() {
        return c(SportAudioScenarioId.FIVE_HUNDRED_LEFT);
    }

    private List<String> o(jbc jbcVar) {
        double dF = jbcVar.f();
        int iA = jbcVar.a();
        List<SportAudioScenarioId> distanceRemainingScenarios = SportAudioScenarioId.getDistanceRemainingScenarios();
        d(new pqk(), dF);
        return c(distanceRemainingScenarios.get(iA % distanceRemainingScenarios.size()));
    }

    private List<String> m(jbc jbcVar) {
        new pqk().e(Integer.valueOf((int) jbcVar.b()));
        return c(SportAudioScenarioId.SENSOR_DISTANCE);
    }

    private List<String> c() {
        List<String> listC = c(SportAudioScenarioId.STOP_SPORT);
        listC.addAll(c(SportAudioScenarioId.DISTANCE_TOO_SHORT));
        return listC;
    }

    private List<String> o() {
        return c(SportAudioScenarioId.PRIVACY_AUTHORIZE_REMIND);
    }

    private List<String> f() {
        return c(SportAudioScenarioId.HEART_RATE_TOO_FAST_WARNING);
    }

    private List<String> c(SportAudioScenarioId sportAudioScenarioId) {
        return d(sportAudioScenarioId, new pqk());
    }

    private List<String> d(SportAudioScenarioId sportAudioScenarioId, pqk pqkVar) {
        LogUtil.a("MultilingualAudioConstructor", "getAudioUrls id: ", sportAudioScenarioId.getId(), " name: ", sportAudioScenarioId.name(), " input: ", pqkVar);
        return pqj.b().getScenarioAudioPaths(sportAudioScenarioId.getId(), pqkVar);
    }

    private int c(long j) {
        return (int) (j / 1000);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceContentConstructor
    public void release() {
        pqj.b().release();
    }
}
