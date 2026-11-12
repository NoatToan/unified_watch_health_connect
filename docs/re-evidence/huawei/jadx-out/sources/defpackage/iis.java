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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class iis extends BaseTask {
    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(int i, List<String> list, List<qfq> list2, ResponseCallback<List<String>> responseCallback) {
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public boolean isSubscribeType(int i) {
        return i == 2 || i == 3;
    }

    public iis(TaskEnum taskEnum) {
        super(taskEnum);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public String getTag() {
        return "TaskPlatform_Bedtime";
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiHealthType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiStatType() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(44201);
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
        if (!isNeedUpdate(list, TaskEnum.BEDTIME.getTaskId())) {
            onResponse(responseCallback, 0, Collections.EMPTY_LIST);
        } else {
            Date date = new Date(DateFormatUtil.d(i));
            gwa.c().e(date, date, new int[]{3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 1}, new IBaseResponseCallback() { // from class: iiv
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f37679b.c(i, qfkVar, responseCallback, i2, obj);
                }
            });
        }
    }

    /* synthetic */ void c(int i, qfk qfkVar, ResponseCallback responseCallback, int i2, Object obj) {
        LogUtil.b("TaskPlatform_Bedtime", "getTaskValue errorCode ", Integer.valueOf(i2), " object ", HiJsonUtil.d(obj));
        if (!njy.b(obj, gxq.class)) {
            onResponse(responseCallback, i2, Collections.singletonList(refreshObjectiveResult(i, qfkVar, String.valueOf(0), 0, "")));
            return;
        }
        List<gxq> list = (List) obj;
        if (njy.e(list)) {
            onResponse(responseCallback, i2, Collections.singletonList(refreshObjectiveResult(i, qfkVar, String.valueOf(0), 0, "")));
        } else {
            onResponse(responseCallback, i2, Collections.singletonList(a(list, qfkVar, i)));
        }
    }

    private String a(List<gxq> list, qfk qfkVar, int i) {
        long jA = 0;
        for (gxq gxqVar : list) {
            if (gxqVar != null && !gwc.c(gxqVar) && !gwc.e(gxqVar)) {
                jA = gxqVar.a();
            }
        }
        if (qfkVar != null && jA > 0) {
            String[] timeArray = getTimeArray(qfkVar);
            if (timeArray == null || timeArray.length < 2) {
                return refreshObjectiveResult(i, qfkVar, String.valueOf(0), 0, "");
            }
            int iJ = CommonUtils.j(timeArray[0]);
            int iJ2 = CommonUtils.j(timeArray[1]);
            long time = new Date(DateFormatUtil.d(i)).getTime();
            if (iJ >= 20) {
                time = lsl.u(time);
            }
            long jA2 = lsl.a(time, iJ, iJ2 - 61, true);
            long jA3 = lsl.a(time, iJ, iJ2 + 61, true);
            int i2 = (jA <= jA2 || jA >= jA3) ? 0 : 1;
            LogUtil.b("TaskPlatform_Bedtime", "getTaskValue fallAsSleepTime ", Long.valueOf(jA), " goalHour ", Integer.valueOf(iJ), " goalMinute ", Integer.valueOf(iJ2), " startTime ", Long.valueOf(jA2), " endTime ", Long.valueOf(jA3), " status ", Integer.valueOf(i2));
            return refreshObjectiveResult(i, qfkVar, String.valueOf(jA), i2, "");
        }
        return refreshObjectiveResult(i, qfkVar, String.valueOf(0), 0, "");
    }
}
