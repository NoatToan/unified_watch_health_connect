package com.huawei.health.suggestion.util;

import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.pcp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class ClickEventUtils {

    public enum ClickEventType {
        ALL_RUN_COURSE,
        RUN_COURSE,
        ALL_RUN_PLAN,
        RECOMMENDED_RUN_PLAN,
        MY_ALL_RUN_COURSE,
        AI_RUN_COURSE,
        PLAN_TAB,
        START_OLD_RUN_PLAN,
        START_AI_RUN_PLAN,
        JUMP_VIP,
        AI_RUN_PLAN_REPORT,
        MY_ALL_WALK_COURSE
    }

    public static void c(ClickEventType clickEventType, HashMap<String, Object> map) {
        if (clickEventType == null) {
            LogUtil.j("ClickEventUtils", "doAction params is empty.");
            return;
        }
        if (map == null || map.isEmpty()) {
            a(clickEventType);
            return;
        }
        int iOrdinal = clickEventType.ordinal();
        if (iOrdinal == 0) {
            if (map.get("courseCategory") instanceof Integer) {
                JumpUtil.b(BaseApplication.getContext(), ((Integer) map.get("courseCategory")).intValue());
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            d(map);
            return;
        }
        if (iOrdinal == 3) {
            if (map.get("runPlanInfo") instanceof pcp) {
                JumpUtil.e(BaseApplication.getContext(), (pcp) map.get("runPlanInfo"));
                return;
            }
            return;
        }
        if (iOrdinal == 4) {
            a(map);
            return;
        }
        if (iOrdinal == 7) {
            c(map);
            return;
        }
        if (iOrdinal == 8) {
            if ((map.get("currentPlan") instanceof Plan) && (map.get("planWorkout") instanceof FitWorkout)) {
                JumpUtil.a(BaseApplication.getActivity(), (Plan) map.get("currentPlan"), (FitWorkout) map.get("planWorkout"));
                return;
            }
            return;
        }
        if (iOrdinal == 10) {
            b(map);
        } else if (iOrdinal == 11 && (map.get("myCourseType") instanceof Integer)) {
            JumpUtil.a(BaseApplication.getContext(), ((Integer) map.get("myCourseType")).intValue());
        }
    }

    private static void a(ClickEventType clickEventType) {
        int iOrdinal = clickEventType.ordinal();
        if (iOrdinal == 5) {
            JumpUtil.c(BaseApplication.getContext());
        } else if (iOrdinal == 6) {
            JumpUtil.a(BaseApplication.getContext());
        } else {
            if (iOrdinal != 9) {
                return;
            }
            JumpUtil.j(BaseApplication.getContext());
        }
    }

    private static void c(HashMap<String, Object> map) {
        if ((map.get("currentPlan") instanceof Plan) && (map.get("planWorkout") instanceof PlanWorkout)) {
            JumpUtil.b((Plan) map.get("currentPlan"), (PlanWorkout) map.get("planWorkout"));
        }
    }

    private static void d(HashMap<String, Object> map) {
        if ((map.get("fitWorkout") instanceof FitWorkout) && (map.get("biMap") instanceof Map)) {
            JumpUtil.c(BaseApplication.getContext(), (FitWorkout) map.get("fitWorkout"), (Map<String, Object>) map.get("biMap"));
        }
    }

    private static void a(HashMap<String, Object> map) {
        if (map.get("myCourseType") instanceof Integer) {
            JumpUtil.c(BaseApplication.getContext(), ((Integer) map.get("myCourseType")).intValue());
        }
    }

    private static void b(HashMap<String, Object> map) {
        if (map.get("currentPlan") instanceof Plan) {
            JumpUtil.d(1, BaseApplication.getContext(), IntPlan.PlanType.AI_RUN_PLAN.getType(), ((Plan) map.get("currentPlan")).acquireId());
        }
    }
}
