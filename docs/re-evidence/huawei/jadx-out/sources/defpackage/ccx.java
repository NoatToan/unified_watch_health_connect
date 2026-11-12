package defpackage;

import com.huawei.basichealthmodel.devicelink.bean.TaskBean;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ccx {
    private static int d;

    private static void d() {
        d = 0;
    }

    private static boolean c() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        LogUtil.b("HL_HealthLifeDeveloperUtils", "isOpenDeveloperSwitch developerSwitch ", strE);
        if ("1".equals(strE)) {
            return true;
        }
        d();
        return false;
    }

    private static boolean b() {
        return d <= 0;
    }

    public static void d(int i) {
        d = i;
    }

    public static String c(List<HealthLifeBean> list) {
        List<Integer> listE = e(list);
        if (CollectionUtils.a(listE)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : listE) {
            if (num != null) {
                sb.append(",");
                sb.append(num);
            }
        }
        String string = sb.toString();
        LogUtil.b("HL_HealthLifeDeveloperUtils", "getNeedAddTaskIdString needAddTaskIdString ", string, " sDeviceLinkageTaskListSize ", Integer.valueOf(d));
        return string;
    }

    public static List<Integer> e(List<HealthLifeBean> list) {
        int id;
        if (b() || CollectionUtils.a(list)) {
            return Collections.EMPTY_LIST;
        }
        int i = 0;
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && 1 != (id = healthLifeBean.getId()) && 100001 != id) {
                i++;
            }
        }
        if (d <= i || !c()) {
            return Collections.EMPTY_LIST;
        }
        int iAbs = Math.abs(d - i);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < iAbs; i2++) {
            arrayList.add(Integer.valueOf(i2 + 15));
        }
        LogUtil.b("HL_HealthLifeDeveloperUtils", "getNeedAddTaskIdList list ", arrayList, " sDeviceLinkageTaskListSize ", Integer.valueOf(d));
        return arrayList;
    }

    public static void c(List<TaskBean> list, List<Integer> list2) {
        if (b() || CollectionUtils.a(list) || CollectionUtils.a(list2)) {
            return;
        }
        String str = qre.f(R.string.IDS_life_developer_device_task) + Constants.LINK;
        for (Integer num : list2) {
            if (num != null) {
                TaskBean taskBean = new TaskBean();
                int iIntValue = num.intValue() * 1000;
                taskBean.setTaskValue(String.valueOf(iIntValue));
                int iIntValue2 = num.intValue() + 10000;
                taskBean.setTaskTarget(String.valueOf(iIntValue2));
                taskBean.setStatusDes(qre.a(com.huawei.basichealthmodel.R.string.IDS_splash_no_space, UnitUtil.e(iIntValue, 1, 0), qre.e(com.huawei.basichealthmodel.R.plurals.IDS_health_step_local, iIntValue2, UnitUtil.e(iIntValue2, 1, 0))));
                taskBean.setTaskName(str + num);
                taskBean.setTimestamp(System.currentTimeMillis());
                taskBean.setTaskId(num.intValue());
                taskBean.setRestStatus(0);
                taskBean.setStatus(0);
                list.add(taskBean);
            }
        }
        LogUtil.b("HL_HealthLifeDeveloperUtils", "processNeedAddTaskList list ", list2, " taskList ", list, " sDeviceLinkageTaskListSize ", Integer.valueOf(d));
    }
}
