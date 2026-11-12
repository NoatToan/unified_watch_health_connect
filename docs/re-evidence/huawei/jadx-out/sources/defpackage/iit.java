package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.taskplatform.task.BaseTask;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class iit extends BaseTask {
    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(int i, List<String> list, qfk qfkVar, ResponseCallback<List<String>> responseCallback) {
    }

    public iit(TaskEnum taskEnum) {
        super(taskEnum);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public String getTag() {
        return "TaskPlatform_BloodPressMeasure";
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiHealthType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiStatType() {
        return Collections.singletonList(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value()));
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getSubscribeType() {
        return Collections.singletonList(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value()));
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getGoalSubscribeType() {
        return Collections.singletonList(103);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public boolean isSubscribeType(int i) {
        return i == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value();
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(final int i, List<String> list, final List<qfq> list2, final ResponseCallback<List<String>> responseCallback) {
        if (!isNeedUpdate(list, TaskEnum.BLOOD_PRESS_MEASURE.getTaskId())) {
            onResponse(responseCallback, 0, Collections.EMPTY_LIST);
            return;
        }
        if (njy.e(list2)) {
            ReleaseLogUtil.b("TaskPlatform_BloodPressMeasure", "list is null");
            onResponse(responseCallback, -1, Collections.EMPTY_LIST);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        for (qfq qfqVar : list2) {
            if (qfqVar != null) {
                String strC = c(qfqVar.c(), "targetTime");
                arrayList.add(d(e(i, strC, 2), e(i, strC, 1)));
            }
        }
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: iit.1
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i2, int i3) {
                iit.this.onResponse(responseCallback, i2, iit.this.c(i, sparseArray, i2, list2, arrayList.size()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> c(int i, SparseArray<List<HiHealthData>> sparseArray, int i2, List<qfq> list, int i3) {
        qfq qfqVar;
        if (i2 != 0 || sparseArray == null || sparseArray.size() == 0) {
            ReleaseLogUtil.b("R_TaskPlatform_BloodPressMeasure", "processAggregateResult errorCode ", Integer.valueOf(i2), " dataList ", sparseArray);
            ArrayList arrayList = new ArrayList();
            for (qfq qfqVar2 : list) {
                if (qfqVar2 != null) {
                    String strRefreshObjectiveResult = refreshObjectiveResult(i, qfqVar2.i(), String.valueOf(0), 0, "");
                    if (!TextUtils.isEmpty(strRefreshObjectiveResult)) {
                        arrayList.add(strRefreshObjectiveResult);
                    }
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < i3; i4++) {
            List<HiHealthData> list2 = sparseArray.get(i4);
            if (!njy.e(list2)) {
                HiHealthData hiHealthData = list2.get(0);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(BleConstants.BLOODPRESSURE_SYSTOLIC, hiHealthData.getDouble("BLOOD_PRESSURE_SYSTOLIC"));
                    jSONObject.put(BleConstants.BLOODPRESSURE_DIASTOLIC, hiHealthData.getDouble("BLOOD_PRESSURE_DIASTOLIC"));
                    jSONObject.put("measureTime", hiHealthData.getStartTime());
                    jSONObject.put("timeZone", hiHealthData.getTimeZone());
                    String string = jSONObject.toString();
                    if (!njy.e(list, i4) && (qfqVar = list.get(i4)) != null) {
                        String strRefreshObjectiveResult2 = refreshObjectiveResult(i, qfqVar.i(), "1", 1, string);
                        if (!TextUtils.isEmpty(strRefreshObjectiveResult2)) {
                            arrayList2.add(strRefreshObjectiveResult2);
                        }
                    }
                } catch (Exception e) {
                    LogUtil.e("TaskPlatform_BloodPressMeasure", "JSONObject Exception: ", e.getMessage());
                    return Collections.EMPTY_LIST;
                }
            }
        }
        return arrayList2;
    }

    private long e(int i, String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("TaskPlatform_BloodPressMeasure", "targetTime is null or empty");
            return 0L;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit == null || strArrSplit.length == 0) {
            LogUtil.e("TaskPlatform_BloodPressMeasure", "texts is null");
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(DateFormatUtil.d(i));
        calendar.set(11, CommonUtils.j(strArrSplit[0]));
        calendar.set(12, CommonUtils.j(strArrSplit[1]));
        if (i2 == 1) {
            calendar.set(13, 59);
            calendar.set(14, 999);
            calendar.set(12, CommonUtils.j(strArrSplit[1]) + 30);
        } else {
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(12, CommonUtils.j(strArrSplit[1]) - 30);
        }
        return calendar.getTimeInMillis();
    }

    private String c(String str, String str2) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has(str2)) {
                    LogUtil.e("TaskPlatform_BloodPressMeasure", "JSON Not Contains Key, ", str2);
                    return null;
                }
                return jSONObject.getString(str2);
            } catch (JSONException e) {
                LogUtil.e("TaskPlatform_BloodPressMeasure", "JSON Check Fail: ", e.getMessage());
            }
        }
        return null;
    }

    private HiAggregateOption d(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(j, j2);
        hiAggregateOption.setType(new int[]{10002});
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.BLOOD_PRESSURE});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter("");
        return hiAggregateOption;
    }
}
