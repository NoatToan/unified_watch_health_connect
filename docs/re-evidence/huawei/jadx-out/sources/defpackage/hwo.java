package defpackage;

import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.plandata.CourseDataBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hwo {
    public static pdq a(Plan plan, int i) {
        List<pdq> planWeekDataList = plan.getPlanWeekDataList();
        if (njy.e(planWeekDataList)) {
            LogUtil.j("Suggestion_PlanDetailCourseUtil", "getPlanWeekData planWeekDataBeanList is empty");
            return new pdq();
        }
        for (pdq pdqVar : planWeekDataList) {
            if (pdqVar != null && pdqVar.j() == i) {
                return pdqVar;
            }
        }
        return new pdq();
    }

    public static List<CourseDataBean> e(Plan plan, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        List<pdt> listF = a(plan, i).f();
        if (njy.e(listF)) {
            LogUtil.j("Suggestion_PlanDetailCourseUtil", "getCourseList planDayDataBeanList is null");
            return arrayList;
        }
        for (pdt pdtVar : listF) {
            if (pdtVar != null && i2 == pdtVar.d()) {
                for (CourseDataBean courseDataBean : pdtVar.a()) {
                    if (courseDataBean != null) {
                        arrayList.add(courseDataBean);
                    }
                }
            }
        }
        return arrayList;
    }
}
