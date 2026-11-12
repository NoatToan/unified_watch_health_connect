package defpackage;

import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes29.dex */
public class gnn {
    public static List<gzh> e(Plan plan) {
        List<PlanWorkout> listAcquireWorkouts = plan.acquireWorkouts();
        if (njy.e(listAcquireWorkouts)) {
            return new ArrayList(10);
        }
        ArrayList<gzh> arrayListB = b(ift.c(plan.acquireStartDate()), listAcquireWorkouts, d(plan));
        if (plan.acquireType() == 3) {
            gnq.d(arrayListB, ift.c(plan.acquireStartDate()));
            return arrayListB;
        }
        gnq.b(arrayListB, ift.c(plan.acquireStartDate()));
        return arrayListB;
    }

    private static ArrayList<gzh> b(int i, List<PlanWorkout> list, Map<Integer, gyx> map) {
        if (i == -1) {
            return new ArrayList<>(10);
        }
        TreeMap treeMap = new TreeMap();
        for (PlanWorkout planWorkout : list) {
            if (planWorkout != null) {
                int iAcquireOrder = planWorkout.popWeekInfo().acquireOrder();
                if (treeMap.get(Integer.valueOf(iAcquireOrder)) == null) {
                    treeMap.put(Integer.valueOf(iAcquireOrder), new gzh(planWorkout.popWeekInfo()));
                }
            }
        }
        return d(i, new ArrayList(treeMap.values()), map);
    }

    private static Map<Integer, gyx> d(Plan plan) {
        int iC;
        HashMap map = new HashMap(10);
        for (PlanWorkout planWorkout : plan.acquireWorkouts()) {
            if (planWorkout != null && (iC = ift.c(planWorkout.popDayInfo().acquireDate())) != -1) {
                gyx gyxVar = (gyx) map.get(Integer.valueOf(iC));
                if (gyxVar == null) {
                    gyxVar = new gyx(iC, planWorkout.popDayInfo());
                    map.put(Integer.valueOf(iC), gyxVar);
                }
                gyxVar.d().add(planWorkout);
            }
        }
        return map;
    }

    private static ArrayList<gzh> d(int i, ArrayList<gzh> arrayList, Map<Integer, gyx> map) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            gzh gzhVar = arrayList.get(i2);
            for (int i3 = 0; i3 < 7; i3++) {
                gzhVar.a().set(i3, map.get(Integer.valueOf((i2 * 7) + i3 + i)));
            }
        }
        return arrayList;
    }
}
