package defpackage;

import com.huawei.health.taskplatform.task.BaseTask;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class iiw extends BaseTask {
    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(int i, List<String> list, List<qfq> list2, ResponseCallback<List<String>> responseCallback) {
    }

    public iiw(TaskEnum taskEnum) {
        super(taskEnum);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public String getTag() {
        return "TaskPlatform_DrinkWater";
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiHealthType() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.DRINK_WATER_SET.value()));
        return arrayList;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiStatType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getSubscribeType() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.DRINK_WATER_SET.value()));
        return arrayList;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getGoalSubscribeType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public boolean isSubscribeType(int i) {
        return i == DicDataTypeUtil.DataType.DRINK_WATER_SET.value();
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(final int i, List<String> list, final qfk qfkVar, final ResponseCallback<List<String>> responseCallback) {
        if (!isNeedUpdate(list, TaskEnum.DRINK_WATER.getTaskId())) {
            onResponse(responseCallback, 0, Collections.EMPTY_LIST);
        } else {
            a(i, new ResponseCallback() { // from class: iix
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.d.c(qfkVar, i, responseCallback, i2, (Integer) obj);
                }
            });
        }
    }

    /* synthetic */ void c(qfk qfkVar, int i, ResponseCallback responseCallback, int i2, Integer num) {
        String strRefreshObjectiveResult;
        int iIntValue = num == null ? 0 : num.intValue();
        if (qfkVar == null) {
            strRefreshObjectiveResult = "";
        } else {
            strRefreshObjectiveResult = refreshObjectiveResult(i, qfkVar, String.valueOf(iIntValue), iIntValue >= CommonUtils.j(qfkVar.j()) ? 1 : 0, "");
        }
        onResponse(responseCallback, i2, Collections.singletonList(strRefreshObjectiveResult));
    }

    private void a(int i, final ResponseCallback<Integer> responseCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.DRINK_WATER_SET.value()});
        final String str = "drinkWater";
        hiAggregateOption.setConstantsKey(new String[]{"drinkWater"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        HiHealthManager.d(this.mContext).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: iiw.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                ReleaseLogUtil.c("R_TaskPlatform_DrinkWater", "getTaskValue onResult errorCode ", Integer.valueOf(i2));
                if (i2 == 0) {
                    iiw.this.e(list, i2, str, responseCallback);
                } else {
                    responseCallback.onResponse(i2, 0);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, int i, String str, ResponseCallback<Integer> responseCallback) {
        int i2 = 0;
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_TaskPlatform_DrinkWater", "getTaskValue onResult list ", list);
            responseCallback.onResponse(i, 0);
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.e("TaskPlatform_DrinkWater", "hiHealthData is null");
            } else {
                i2 += hiHealthData.getInt(str);
            }
        }
        LogUtil.b("TaskPlatform_DrinkWater", "getTaskValue onResult waterValue ", Integer.valueOf(i2));
        responseCallback.onResponse(i, Integer.valueOf(i2));
    }
}
