package defpackage;

import com.huawei.health.taskplatform.task.BaseTask;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ijb extends BaseTask {
    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(int i, List<String> list, List<qfq> list2, ResponseCallback<List<String>> responseCallback) {
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public boolean isSubscribeType(int i) {
        return i == 2 || i == 3;
    }

    public ijb(TaskEnum taskEnum) {
        super(taskEnum);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public String getTag() {
        return "TaskPlatform_SleepDuration";
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiHealthType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiStatType() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(44105);
        arrayList.add(44108);
        return arrayList;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getSubscribeType() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(3);
        arrayList.add(2);
        return arrayList;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getGoalSubscribeType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(final int i, List<String> list, final qfk qfkVar, final ResponseCallback<List<String>> responseCallback) {
        if (!isNeedUpdate(list, TaskEnum.SLEEP_DURATION.getTaskId())) {
            onResponse(responseCallback, 0, Collections.EMPTY_LIST);
        } else {
            Date date = new Date(DateFormatUtil.d(i));
            gwa.c().e(date, date, new int[]{3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 1}, new IBaseResponseCallback() { // from class: ije
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.e.a(i, qfkVar, responseCallback, i2, obj);
                }
            });
        }
    }

    /* synthetic */ void a(int i, qfk qfkVar, ResponseCallback responseCallback, int i2, Object obj) {
        LogUtil.b("TaskPlatform_SleepDuration", "getTaskValue errorCode ", Integer.valueOf(i2), " object ", HiJsonUtil.d(obj));
        if (!njy.b(obj, gxq.class)) {
            onResponse(responseCallback, i2, Collections.singletonList(refreshObjectiveResult(i, qfkVar, String.valueOf(0), 0, "")));
            return;
        }
        List<gxq> list = (List) obj;
        if (njy.e(list)) {
            onResponse(responseCallback, i2, Collections.singletonList(refreshObjectiveResult(i, qfkVar, String.valueOf(0), 0, "")));
        } else {
            onResponse(responseCallback, i2, Collections.singletonList(d(list, qfkVar, i)));
        }
    }

    private String d(List<gxq> list, qfk qfkVar, int i) {
        int iL = 0;
        for (gxq gxqVar : list) {
            if (gxqVar != null) {
                iL = gxqVar.l() + gxqVar.i();
            }
        }
        if (qfkVar != null && iL > 0) {
            int i2 = iL * 60;
            int iJ = CommonUtils.j(qfkVar.j());
            double d = UnitUtil.d(((double) (iJ - 3600)) / 3600.0d, 1);
            double d2 = UnitUtil.d(((double) (iJ + 3600)) / 3600.0d, 1);
            double d3 = UnitUtil.d(((double) i2) / 3600.0d, 1);
            int i3 = (d3 < d || d3 > d2) ? 0 : 1;
            LogUtil.b("TaskPlatform_SleepDuration", "getScheduleId sleepTime ", Integer.valueOf(i2), " goal ", Integer.valueOf(iJ), " minHour ", Double.valueOf(d), " maxHour ", Double.valueOf(d2), " hour ", Double.valueOf(d3), " status ", Integer.valueOf(i3));
            return refreshObjectiveResult(i, qfkVar, String.valueOf(i2), i3, "");
        }
        return refreshObjectiveResult(i, qfkVar, String.valueOf(0), 0, "");
    }
}
