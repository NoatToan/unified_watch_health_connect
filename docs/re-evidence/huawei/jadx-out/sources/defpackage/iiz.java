package defpackage;

import com.huawei.health.taskplatform.task.BaseTask;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class iiz extends BaseTask {
    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(int i, List<String> list, List<qfq> list2, ResponseCallback<List<String>> responseCallback) {
    }

    public iiz(TaskEnum taskEnum) {
        super(taskEnum);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public String getTag() {
        return "TaskPlatform_DecompAndRelax";
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiHealthType() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.RELAXATION_TYPE.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()));
        return arrayList;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiStatType() {
        return new ArrayList();
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getSubscribeType() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.RELAXATION_TYPE.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()));
        return arrayList;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getGoalSubscribeType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public boolean isSubscribeType(int i) {
        return i == DicDataTypeUtil.DataType.RELAXATION_TYPE.value() || i == DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value();
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(final int i, List<String> list, final qfk qfkVar, final ResponseCallback<List<String>> responseCallback) {
        if (!isNeedUpdate(list, TaskEnum.DECOMP_AND_RELAX.getTaskId())) {
            onResponse(responseCallback, 0, Collections.EMPTY_LIST);
        } else {
            a(i, new ResponseCallback() { // from class: ija
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.f37691c.e(qfkVar, i, responseCallback, i2, (Integer) obj);
                }
            });
        }
    }

    /* synthetic */ void e(qfk qfkVar, int i, ResponseCallback responseCallback, int i2, Integer num) {
        String strRefreshObjectiveResult;
        int iIntValue = num == null ? 0 : num.intValue();
        if (qfkVar == null) {
            strRefreshObjectiveResult = "";
        } else {
            strRefreshObjectiveResult = refreshObjectiveResult(i, qfkVar, String.valueOf(iIntValue), iIntValue >= CommonUtils.j(qfkVar.j()) ? 1 : 0, "");
        }
        onResponse(responseCallback, i2, Collections.singletonList(strRefreshObjectiveResult));
    }

    protected void a(int i, final ResponseCallback<Integer> responseCallback) {
        ArrayList arrayList = new ArrayList(HiHealthDictManager.a(this.mContext).f(DicDataTypeUtil.DataType.RELAXATION_TYPE.value()));
        arrayList.addAll(HiHealthDictManager.a(this.mContext).f(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()));
        final ArrayList arrayList2 = new ArrayList(HiHealthDictManager.a(this.mContext).d(DicDataTypeUtil.DataType.RELAXATION_TYPE.value()));
        arrayList2.addAll(HiHealthDictManager.a(this.mContext).d(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()));
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(CommonUtil.c((List<Integer>) arrayList));
        hiAggregateOption.setConstantsKey((String[]) arrayList2.toArray(new String[0]));
        hiAggregateOption.setAggregateType(2);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        HiHealthManager.d(this.mContext).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: iiz.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                ReleaseLogUtil.c("R_TaskPlatform_DecompAndRelax", "getTaskValue onResult errorCode ", Integer.valueOf(i2));
                int i4 = 0;
                if (njy.e(list)) {
                    ReleaseLogUtil.d("R_TaskPlatform_DecompAndRelax", "getTaskValue onResult list ", list);
                    responseCallback.onResponse(i2, 0);
                    return;
                }
                HiHealthData hiHealthData = list.get(0);
                if (hiHealthData == null) {
                    ReleaseLogUtil.c("R_TaskPlatform_DecompAndRelax", "getTaskValue onResult hiHealthData is null");
                    responseCallback.onResponse(i2, 0);
                    return;
                }
                for (String str : arrayList2) {
                    int i5 = hiHealthData.getInt(str);
                    i4 += i5;
                    LogUtil.b("TaskPlatform_DecompAndRelax", "getTaskValue onResult value:", Integer.valueOf(i5), "name:", str);
                }
                responseCallback.onResponse(i2, Integer.valueOf(i4));
            }
        });
    }
}
