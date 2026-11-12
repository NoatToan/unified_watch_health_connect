package defpackage;

import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class fkn {
    public static final Set<Integer> d = Collections.unmodifiableSet(new HashSet<Integer>() { // from class: fkn.5
        private static final long serialVersionUID = 4413638449915745765L;

        {
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WALK_OR_RUN.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SPEED.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STEP_RATE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STRIDE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FORE_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WHOLE_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HIND_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_ACTIVE_PEAK.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_LOADING_RATE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_EVERSION.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GROUND_CONTACT_TIME.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HANG_TIME.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FLIGHT_RATIO.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SWING_ANGLE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_OSCILLATION.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GC_TIME_BALANCE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_CADENCE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_DELTA_CIRCLE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SUM_CIRCLE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_GROUND_IMPACT_ACCELERATION.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_VERTICAL_RATIO.value()));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f34128c = Collections.unmodifiableSet(new HashSet<String>() { // from class: fkn.3
        private static final long serialVersionUID = -2780575908466807560L;

        {
            add("walkOrRun");
            add("speed");
            add(MedalConstants.EVENT_STEPS);
            add("stepRate");
            add("stride");
            add("foreSteps");
            add("wholeSteps");
            add("hindSteps");
            add("activePeak");
            add("verticalLoadingRate");
            add("eversion");
            add("groundContactTime");
            add("hangTime");
            add("flightRatio");
            add("swingAngle");
            add("verticalOscillation");
            add("GCTimeBalance");
            add("cadence");
            add("deltaCircle");
            add("sumCircle");
            add("groundImpactAcceleration");
            add("verticalRatio");
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Integer> f34126a = Collections.unmodifiableSet(new HashSet<Integer>() { // from class: fkn.1
        private static final long serialVersionUID = 303463443691344598L;

        {
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_ACTIVE_PEAK.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_LOADING_RATE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_OSCILLATION.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GC_TIME_BALANCE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_VERTICAL_RATIO.value()));
        }
    });
    public static final Set<Integer> e = Collections.unmodifiableSet(new HashSet<Integer>() { // from class: fkn.2
        private static final long serialVersionUID = 4890156620666725262L;

        {
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STRIDE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FORE_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WHOLE_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HIND_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_EVERSION.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GROUND_CONTACT_TIME.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HANG_TIME.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SWING_ANGLE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_GROUND_IMPACT_ACCELERATION.value()));
        }
    });
    public static final Set<Integer> g = Collections.unmodifiableSet(new HashSet<Integer>() { // from class: fkn.4
        private static final long serialVersionUID = 831812500369210778L;

        {
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WALK_OR_RUN.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SPEED.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STEP_RATE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STRIDE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FORE_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WHOLE_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HIND_STEPS.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_ACTIVE_PEAK.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_LOADING_RATE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_EVERSION.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GROUND_CONTACT_TIME.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HANG_TIME.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FLIGHT_RATIO.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SWING_ANGLE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_OSCILLATION.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GC_TIME_BALANCE.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_GROUND_IMPACT_ACCELERATION.value()));
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_VERTICAL_RATIO.value()));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<Integer> f34127b = Collections.unmodifiableSet(new HashSet<Integer>() { // from class: fkn.6
        private static final long serialVersionUID = 4244797520969072913L;

        {
            add(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FLIGHT_RATIO.value()));
        }
    });

    public static boolean c() {
        boolean zD = eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Posture_"), 175);
        ReleaseLogUtil.d("HWhealthLinkage_Posture_", "isSupportWatchRunPosture is ", Boolean.valueOf(zD));
        return zD;
    }

    public static Map<Integer, Double> c(List<eed> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        if (njy.e(list)) {
            ReleaseLogUtil.e("HWhealthLinkage_Posture_", "parseRunPostureSamplePoints failed, SamplePointInfos is null");
            return linkedHashMap;
        }
        for (eed eedVar : list) {
            int iA = (int) eedVar.a();
            if (d.contains(Integer.valueOf(iA))) {
                linkedHashMap.put(Integer.valueOf(iA), Double.valueOf(b(iA, CommonUtil.v(HEXUtils.a(eedVar.b())))));
            }
        }
        return linkedHashMap;
    }

    public static Map<Integer, Double> b(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        if (obj instanceof gzt) {
            return d((gzt) obj);
        }
        return obj instanceof gzs ? e((gzs) obj) : linkedHashMap;
    }

    private static Map<Integer, Double> e(gzs gzsVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        int iC = gzsVar.c();
        gzsVar.a();
        if (iC != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_CADENCE.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_CADENCE.value(), iC)));
        }
        return linkedHashMap;
    }

    private static Map<Integer, Double> d(gzt gztVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        int iD = gztVar.d();
        if (iD != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STEP_RATE.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STEP_RATE.value(), iD)));
        }
        int iL = gztVar.l();
        if (iL != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STRIDE.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STRIDE.value(), iL)));
        }
        int iB = gztVar.b();
        if (iB != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GROUND_CONTACT_TIME.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GROUND_CONTACT_TIME.value(), iB)));
        }
        int iF = gztVar.f();
        if (iF != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_GROUND_IMPACT_ACCELERATION.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_GROUND_IMPACT_ACCELERATION.value(), iF)));
        }
        int iK = gztVar.k();
        if (iK != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SWING_ANGLE.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SWING_ANGLE.value(), iK)));
        }
        int iA = gztVar.a();
        if (iA != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FORE_STEPS.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FORE_STEPS.value(), iA)));
        }
        int iO = gztVar.o();
        if (iO != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WHOLE_STEPS.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WHOLE_STEPS.value(), iO)));
        }
        int iJ = gztVar.j();
        if (iJ != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HIND_STEPS.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HIND_STEPS.value(), iJ)));
        }
        int iE = gztVar.e();
        if (iE != -101) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_EVERSION.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_EVERSION.value(), iE)));
        }
        int iG = gztVar.g();
        if (iG != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HANG_TIME.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HANG_TIME.value(), iG)));
        }
        int i = gztVar.i();
        if (i != -1) {
            linkedHashMap.put(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FLIGHT_RATIO.value()), Double.valueOf(b(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FLIGHT_RATIO.value(), i)));
        }
        return linkedHashMap;
    }

    public static double b(int i, double d2) {
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_ACTIVE_PEAK.value()) {
            LogUtil.d("Posture_", "activePeak: ", Double.valueOf(d2));
            return d2 / 10.0d;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_LOADING_RATE.value()) {
            double dDoubleValue = new BigDecimal(d2 / 10.0d).setScale(1, 4).doubleValue();
            LogUtil.d("Posture_", "verticalLoadingRate: ", Double.valueOf(dDoubleValue));
            return dDoubleValue;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_OSCILLATION.value()) {
            double dDoubleValue2 = new BigDecimal(d2 / 10.0d).setScale(1, 4).doubleValue();
            LogUtil.d("Posture_", "verticalOscillation: ", Double.valueOf(dDoubleValue2));
            return dDoubleValue2;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GC_TIME_BALANCE.value()) {
            double dDoubleValue3 = new BigDecimal(d2 / 100.0d).setScale(1, 4).doubleValue();
            LogUtil.d("Posture_", "GCTimeBalance: ", Double.valueOf(dDoubleValue3));
            return dDoubleValue3;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_DELTA_CIRCLE.value()) {
            double d3 = d2 / 100.0d;
            LogUtil.d("Posture_", "deltaCircle: ", Double.valueOf(d3));
            return d3;
        }
        if (i != DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SUM_CIRCLE.value()) {
            return d2;
        }
        double d4 = d2 / 100.0d;
        LogUtil.d("Posture_", "sumCircle: ", Double.valueOf(d4));
        return d4;
    }

    public static String b(Set<Integer> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        for (Integer num : set) {
            if (g.contains(num)) {
                linkedHashMap.put(num, 5000);
            } else {
                linkedHashMap.put(num, 1000);
            }
        }
        String strD = HiJsonUtil.d(linkedHashMap);
        LogUtil.a("Posture_", "intervalValueJson: ", strD);
        return strD;
    }
}
