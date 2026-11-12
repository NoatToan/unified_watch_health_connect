package com.huawei.health.taskplatform.task;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.taskplatform.TaskEnum;
import defpackage.qfk;
import defpackage.qfq;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes31.dex */
public abstract class BaseTask {
    protected static final int TASK_ACHIEVED = 1;
    protected static final int TASK_UNACHIEVED = 0;
    protected Context mContext = BaseApplication.b();
    protected TaskEnum mTaskEnum;

    public abstract List<Integer> getGoalSubscribeType();

    public abstract List<Integer> getHiHealthType();

    public abstract List<Integer> getHiStatType();

    public abstract List<Integer> getSubscribeType();

    protected abstract String getTag();

    public abstract void getTaskValue(int i, List<String> list, List<qfq> list2, ResponseCallback<List<String>> responseCallback);

    public abstract void getTaskValue(int i, List<String> list, qfk qfkVar, ResponseCallback<List<String>> responseCallback);

    public abstract boolean isSubscribeType(int i);

    public BaseTask(TaskEnum taskEnum) {
        this.mTaskEnum = taskEnum;
    }

    public void onResponse(ResponseCallback<List<String>> responseCallback, int i, List<String> list) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_TaskPlatform_" + getTag(), "onResponse callback is null errorCode ", Integer.valueOf(i), " list ", list);
            return;
        }
        responseCallback.onResponse(i, list);
    }

    public boolean isNeedUpdate(List<String> list, String str) {
        if (CollectionUtils.a(list)) {
            return false;
        }
        return list.contains(str) || list.contains("all");
    }

    public String refreshObjectiveResult(int i, qfk qfkVar, String str, int i2, String str2) {
        int i3;
        String str3;
        if (qfkVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_" + getTag(), "refreshObjectiveResult scheduleDetail is null date ", Integer.valueOf(i), " value ", str, " status ", Integer.valueOf(i2), " metaData ", str2);
            return "";
        }
        String strAa = qfkVar.aa();
        int iZ = qfkVar.z();
        String strU = qfkVar.u();
        String strV = qfkVar.v();
        LogUtil.b(getTag(), "refreshObjectiveResult date ", Integer.valueOf(i), " value ", str, " originalValue ", strAa, " status ", Integer.valueOf(i2), " originalStatus ", Integer.valueOf(iZ), " metaData ", str2, " originalMetaData ", strU, " scheduleId ", strV);
        if (Objects.equals(strAa, str)) {
            i3 = i2;
            if (iZ == i3) {
                str3 = str2;
                if (Objects.equals(strU, str3)) {
                    return "";
                }
            }
            qfkVar.d(i, str, i3, str3);
            return strV;
        }
        i3 = i2;
        str3 = str2;
        qfkVar.d(i, str, i3, str3);
        return strV;
    }

    public String[] getTimeArray(qfk qfkVar) {
        if (qfkVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_" + getTag(), "getTimeArray scheduleDetail is null");
            return null;
        }
        String strJ = qfkVar.j();
        if (TextUtils.isEmpty(strJ)) {
            ReleaseLogUtil.e("R_TaskPlatform_" + getTag(), "getTimeArray goalValue ", strJ);
            return null;
        }
        return strJ.split(":");
    }
}
