package defpackage;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.huawei.basefitnessadvice.model.Introduction;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.courseplanservice.R;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.CommonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class gns {
    public static float a(int i, int i2) {
        if (i2 == 0) {
            return 0.0f;
        }
        return (i * 100.0f) / i2;
    }

    public static ghf a(qey qeyVar) {
        List<ghe> listE;
        ghf ghfVarC = ghf.c();
        if (qeyVar == null) {
            return ghfVarC;
        }
        ghn ghnVarC = c(qeyVar);
        ghm ghmVar = new ghm();
        gnm gnmVar = (gnm) HiJsonUtil.d(qeyVar.a(), gnm.class);
        long jD = DateFormatUtil.d(qeyVar.i());
        long jD2 = DateFormatUtil.d(qeyVar.b());
        int iE = lsl.e(jD, jD2);
        int iE2 = e(qeyVar);
        ghnVarC.i(iE);
        ghmVar.a(qeyVar.c());
        ghmVar.b(jD / 1000);
        ghmVar.d(jD2 / 1000);
        ghfVarC.d(qeyVar.m());
        ghmVar.c(qeyVar.l() / 1000);
        ghfVarC.d(1);
        ghfVarC.e(ghmVar);
        ghfVarC.c(ghnVarC);
        ghfVarC.a((Introduction) null);
        ghfVarC.a(gnmVar.c());
        ghfVarC.e(iE2);
        ghfVarC.c(qeyVar.o() == 1);
        if (iE2 == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue()) {
            b(qeyVar, ghfVarC);
        }
        gng gngVarB = gnmVar.b();
        ghfVarC.e(new ghj("progress", Float.valueOf(gngVarB != null ? a(gngVarB.d(), gngVarB.a()) : 0.0f)));
        if (iE2 == SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue()) {
            listE = a(qeyVar.n(), jD, jD2, gnmVar.c());
        } else {
            listE = e(qeyVar.n(), jD, jD2);
        }
        ghfVarC.e(listE);
        return ghfVarC;
    }

    private static void b(qey qeyVar, ghf ghfVar) {
        if (qeyVar == null || ghfVar == null) {
            LogUtil.j("SmartTrainPlanUtil", "planDetailBean or intPlan is null");
            return;
        }
        if (njy.b(qeyVar.j()) && qeyVar.j().get(0) != null) {
            ghfVar.a(CommonUtils.a(qeyVar.j().get(0).e()));
        }
        gnj gnjVar = (gnj) HiJsonUtil.d(qeyVar.a(), gnj.class);
        if (gnjVar == null || gnjVar.c() == null) {
            return;
        }
        ghfVar.d(gnjVar.c().a());
    }

    private static int e(qey qeyVar) {
        if (qeyVar == null) {
            return SmartPlanTypeEnum.SMART_NA_PLAN.getValue();
        }
        if (qeyVar.e() == 1 && qeyVar.k() == 0) {
            return SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue();
        }
        if (qeyVar.e() == 0 && qeyVar.k() == 0) {
            return SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue();
        }
        return SmartPlanTypeEnum.SMART_NA_PLAN.getValue();
    }

    private static IntPlan.PlanType b(qey qeyVar) {
        int iE = e(qeyVar);
        if (iE == SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue()) {
            return IntPlan.PlanType.AI_RUN_PLAN;
        }
        if (iE == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue()) {
            return IntPlan.PlanType.AI_FITNESS_PLAN;
        }
        return IntPlan.PlanType.NA_PLAN;
    }

    private static ghn c(qey qeyVar) {
        ghn ghnVar = new ghn();
        if (qeyVar == null) {
            return ghnVar;
        }
        ghnVar.d(b(qeyVar));
        ghnVar.h(qeyVar.h());
        ghnVar.e(qeyVar.f());
        ghnVar.e(qeyVar.d());
        ghnVar.c(qeyVar.g());
        ghnVar.a(Math.abs(lsl.a(DateFormatUtil.d(qeyVar.i()), DateFormatUtil.d(qeyVar.b()))));
        return ghnVar;
    }

    private static List<ghe> a(List<qfy> list, long j, long j2, int i) {
        if (njy.e(list)) {
            LogUtil.j("SmartTrainPlanUtil", "convertAiRunWeekInfo planTaskList is null");
            return new ArrayList();
        }
        HashMap map = new HashMap();
        for (qfy qfyVar : list) {
            if (!TextUtils.isEmpty(qfyVar.a())) {
                int asInt = d(qfyVar.a()).get("weekNo").getAsInt();
                List arrayList = (List) map.get(Integer.valueOf(asInt));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qfyVar);
                map.put(Integer.valueOf(asInt), arrayList);
            }
        }
        return e(map, j, j2, i);
    }

    private static List<ghe> e(Map<Integer, List<qfy>> map, long j, long j2, int i) {
        ArrayList arrayList = new ArrayList();
        int iE = lsl.e(j, j2);
        for (int i2 = 1; i2 <= iE; i2++) {
            List<qfy> list = map.get(Integer.valueOf(i2));
            ghe gheVar = new ghe();
            gheVar.a(i2);
            gheVar.e(e(d(list, gheVar, i), j, j2, i2));
            arrayList.add(gheVar);
        }
        return arrayList;
    }

    private static List<qfk> d(List<qfy> list, ghe gheVar, int i) {
        ArrayList arrayList = new ArrayList();
        if (njy.b(list)) {
            for (qfy qfyVar : list) {
                if (!TextUtils.isEmpty(qfyVar.a())) {
                    gheVar.b(e(d(qfyVar.a()).get(TypedValues.CycleType.S_WAVE_PERIOD).getAsInt(), i));
                    if (njy.b(qfyVar.n())) {
                        arrayList.addAll(qfyVar.n());
                    }
                }
            }
        }
        return arrayList;
    }

    public static JsonObject d(String str) {
        try {
            return JsonParser.parseString(str).getAsJsonObject();
        } catch (JsonSyntaxException unused) {
            LogUtil.e("SmartTrainPlanUtil", "parseMetadata JsonSyntaxException");
            return new JsonObject();
        }
    }

    private static List<ghi> e(List<qfk> list, long j, long j2, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 <= 7; i2++) {
            if ((i != 1 || i2 >= lsl.o(j)) && (i != lsl.e(j, j2) || i2 <= lsl.o(j2))) {
                ghi ghiVar = new ghi();
                ghiVar.d(i2);
                ghiVar.b(1);
                ghiVar.c(-1);
                for (qfk qfkVar : list) {
                    if (!TextUtils.isEmpty(qfkVar.g()) && ((gnl) HiJsonUtil.d(qfkVar.g(), gnl.class)).a() == i2) {
                        int iA = a(qfkVar.y());
                        if (ghiVar.getPunchFlag() == -1 || iA == 0) {
                            ghiVar.c(iA);
                        }
                        ghiVar.b(0);
                        ghiVar.b().addAll(e(qfkVar, iA, SmartPlanTypeEnum.SMART_TRAINING_PLAN));
                    }
                }
                if (ghiVar.getPunchFlag() == -1) {
                    ghiVar.c(0);
                }
                arrayList.add(ghiVar);
            }
        }
        return arrayList;
    }

    private static List<ghg> e(qfk qfkVar, int i, SmartPlanTypeEnum smartPlanTypeEnum) {
        ArrayList arrayList = new ArrayList();
        List<qfg> listN = qfkVar.n();
        if (!njy.e(listN)) {
            for (qfg qfgVar : listN) {
                if (qfgVar != null) {
                    arrayList.add(b(qfgVar, i, smartPlanTypeEnum));
                }
            }
        }
        return arrayList;
    }

    public static int a(List<qfl> list) {
        if (njy.e(list)) {
            return 0;
        }
        return list.get(0).d();
    }

    private static ghg b(qfg qfgVar, int i, SmartPlanTypeEnum smartPlanTypeEnum) {
        ghg ghgVar = new ghg();
        JsonObject jsonObjectD = d(qfgVar.d());
        JsonObject asJsonObject = jsonObjectD.has("resource") ? jsonObjectD.get("resource").getAsJsonObject() : null;
        if (asJsonObject == null) {
            return ghgVar;
        }
        pce.d dVar = (pce.d) HiJsonUtil.d(HiJsonUtil.d(asJsonObject), pce.d.class);
        ghgVar.e(dVar.g());
        ghgVar.a(i);
        if ("0".equals(dVar.h())) {
            ghgVar.e(true);
        } else {
            ghgVar.e(false);
            FitWorkout fitWorkout = new FitWorkout(dVar.g(), dVar.j());
            fitWorkout.saveDuration((int) ((ied.e() != 0 || dVar.f() == 0) ? dVar.i() : dVar.f()));
            fitWorkout.saveMeasurementType(1);
            fitWorkout.setCourseActions(pea.a((pce.b) HiJsonUtil.d(dVar.a(), pce.b.class)));
            ghgVar.c(fitWorkout);
        }
        if (smartPlanTypeEnum == SmartPlanTypeEnum.SMART_WEIGHT_PLAN || "resistanceCourse".equals(qfgVar.a())) {
            ghgVar.c(IntAction.ActionType.WORKOUT);
        } else {
            ghgVar.c(IntAction.ActionType.RUN);
        }
        pds pdsVar = new pds();
        pdsVar.e(dVar.g());
        pdsVar.a(dVar.j());
        ghgVar.b(pdsVar);
        LogUtil.d("SmartTrainPlanUtil", "convertAiRunInPlanAction in day : actionIdx:", ghgVar.getActionId());
        return ghgVar;
    }

    private static String e(int i, int i2) {
        if (i2 >= 11) {
            if (i == 1) {
                return qre.f(R.string.IDS_train_plan_foundation_period);
            }
            if (i == 2) {
                return qre.f(R.string.IDS_train_plan_growth_period);
            }
            if (i == 3) {
                return qre.f(R.string.IDS_train_plan_consolidation_period);
            }
            return "";
        }
        if (i == 1) {
            return qre.f(R.string.IDS_train_plan_adaptation_period);
        }
        if (i == 2) {
            return qre.f(R.string.IDS_train_plan_growth_period);
        }
        if (i == 3) {
            return qre.f(R.string.IDS_train_plan_intensive_period);
        }
        if (i == 4) {
            return qre.f(R.string.IDS_train_plan_competition_period);
        }
        return "";
    }

    private static List<ghe> e(List<qfy> list, long j, long j2) {
        if (njy.e(list)) {
            LogUtil.j("SmartTrainPlanUtil", "convertAiFitnessWeekInfo planTaskList is null");
            return new ArrayList();
        }
        ArrayList<qfk> arrayList = new ArrayList();
        for (qfy qfyVar : list) {
            if (qfyVar.l() != 10041) {
                arrayList.addAll(qfyVar.n());
            }
        }
        HashMap map = new HashMap();
        for (qfk qfkVar : arrayList) {
            int iE = lsl.e(j, qfkVar.f());
            List arrayList2 = (List) map.get(Integer.valueOf(iE));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.add(qfkVar);
            map.put(Integer.valueOf(iE), arrayList2);
        }
        int iE2 = lsl.e(j, j2);
        ArrayList arrayList3 = new ArrayList();
        for (int i = 1; i <= iE2; i++) {
            List arrayList4 = (List) map.get(Integer.valueOf(i));
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
            }
            ghe gheVar = new ghe();
            gheVar.a(i);
            gheVar.e(b(arrayList4, j, j2, i));
            arrayList3.add(gheVar);
        }
        return arrayList3;
    }

    private static List<ghi> b(List<qfk> list, long j, long j2, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 <= 7; i2++) {
            if ((i != 1 || i2 >= lsl.o(j)) && (i != lsl.e(j, j2) || i2 <= lsl.o(j2))) {
                ghi ghiVar = new ghi();
                ghiVar.d(i2);
                ghiVar.b(1);
                ghiVar.c(-1);
                for (qfk qfkVar : list) {
                    if (lsl.o(qfkVar.f()) == i2) {
                        int iA = a(qfkVar.y());
                        if (ghiVar.getPunchFlag() == -1 || iA == 0) {
                            ghiVar.c(iA);
                        }
                        ghiVar.b(0);
                        ghiVar.b().addAll(e(qfkVar, iA, SmartPlanTypeEnum.SMART_WEIGHT_PLAN));
                    }
                }
                if (ghiVar.getPunchFlag() == -1) {
                    ghiVar.c(0);
                }
                arrayList.add(ghiVar);
            }
        }
        return arrayList;
    }
}
