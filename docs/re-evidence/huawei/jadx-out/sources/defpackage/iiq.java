package defpackage;

import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.taskplatform.task.BaseTask;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class iiq extends BaseTask {
    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(int i, List<String> list, List<qfq> list2, ResponseCallback<List<String>> responseCallback) {
    }

    public iiq(TaskEnum taskEnum) {
        super(taskEnum);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public String getTag() {
        return "TaskPlatform_ActivityHours";
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiHealthType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiStatType() {
        return Collections.singletonList(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()));
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getSubscribeType() {
        return Collections.singletonList(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR.value()));
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getGoalSubscribeType() {
        return Collections.singletonList(103);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public boolean isSubscribeType(int i) {
        return i == DicDataTypeUtil.DataType.ACTIVE_HOUR.value();
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(final int i, List<String> list, final qfk qfkVar, final ResponseCallback<List<String>> responseCallback) {
        if (DateFormatUtil.a(System.currentTimeMillis()) == i) {
            c(i, qfkVar, responseCallback);
            return;
        }
        if (!isNeedUpdate(list, TaskEnum.ACTIVITY_HOURS.getTaskId())) {
            onResponse(responseCallback, 0, Collections.EMPTY_LIST);
            return;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()});
        hiAggregateOption.setConstantsKey(new String[]{"activeUserValue"});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(1);
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: iiq.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list2, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list2, int i2, int i3) {
                String strRefreshObjectiveResult;
                ReleaseLogUtil.c("R_TaskPlatform_ActivityHours", "getTaskValue onResult errorCode ", Integer.valueOf(i2));
                if (njy.e(list2)) {
                    ReleaseLogUtil.d("R_TaskPlatform_ActivityHours", "getTaskValue onResult list ", list2);
                    iiq.this.onResponse(responseCallback, i2, Collections.EMPTY_LIST);
                    return;
                }
                HiHealthData hiHealthData = list2.get(0);
                if (hiHealthData == null) {
                    ReleaseLogUtil.c("R_TaskPlatform_ActivityHours", "getTaskValue onResult hiHealthData is null");
                    iiq.this.onResponse(responseCallback, i2, Collections.EMPTY_LIST);
                    return;
                }
                int i4 = hiHealthData.getInt("activeUserValue");
                qfk qfkVar2 = qfkVar;
                if (qfkVar2 == null) {
                    strRefreshObjectiveResult = "";
                } else {
                    strRefreshObjectiveResult = iiq.this.refreshObjectiveResult(i, qfkVar2, String.valueOf(i4), i4 >= CommonUtils.j(qfkVar2.j()) ? 1 : 0, "");
                }
                LogUtil.b("TaskPlatform_ActivityHours", "getTaskValue onResult activityHour ", Integer.valueOf(i4));
                iiq.this.onResponse(responseCallback, i2, Collections.singletonList(strRefreshObjectiveResult));
            }
        });
    }

    private void c(final int i, final qfk qfkVar, final ResponseCallback<List<String>> responseCallback) {
        fga.d(BaseApplication.b()).e().c(new IExecuteResult() { // from class: iiq.5
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                String strRefreshObjectiveResult;
                if (!(obj instanceof Bundle)) {
                    iiq.this.onResponse(responseCallback, -1, Collections.EMPTY_LIST);
                    return;
                }
                int iMax = Math.max(0, ((Bundle) obj).getInt("activeCount"));
                LogUtil.b("TaskPlatform_ActivityHours", "getTaskValue onSuccess object ", Integer.valueOf(iMax));
                qfk qfkVar2 = qfkVar;
                if (qfkVar2 == null) {
                    strRefreshObjectiveResult = "";
                } else {
                    strRefreshObjectiveResult = iiq.this.refreshObjectiveResult(i, qfkVar2, String.valueOf(iMax), iMax >= CommonUtils.j(qfkVar2.j()) ? 1 : 0, "");
                }
                iiq.this.onResponse(responseCallback, 0, Collections.singletonList(strRefreshObjectiveResult));
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
                ReleaseLogUtil.d("R_TaskPlatform_ActivityHours", "getTaskValue onFailed object ", obj);
                iiq.this.onResponse(responseCallback, -1, Collections.EMPTY_LIST);
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
                ReleaseLogUtil.d("R_TaskPlatform_ActivityHours", "getTaskValue onServiceException object ", obj);
                iiq.this.onResponse(responseCallback, -1, Collections.EMPTY_LIST);
            }
        });
    }
}
