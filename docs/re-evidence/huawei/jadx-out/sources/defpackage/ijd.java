package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.taskplatform.task.BaseTask;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class ijd extends BaseTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f37698c = {DicDataTypeUtil.DataType.MEDICATION_PUNCH_TASK_ID.value(), DicDataTypeUtil.DataType.MEDICATION_PUNCH_STATUS.value(), DicDataTypeUtil.DataType.MEDICATION_PUNCH_TIME.value()};
    private static final String[] e = {"punchTaskId", "punchStatus", "punchTime"};

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(int i, List<String> list, qfk qfkVar, ResponseCallback<List<String>> responseCallback) {
    }

    public ijd(TaskEnum taskEnum) {
        super(taskEnum);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public String getTag() {
        return "TaskPlatform_TakeMedicine";
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiHealthType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiStatType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getSubscribeType() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_PUNCHING.value()));
        return arrayList;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getGoalSubscribeType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public boolean isSubscribeType(int i) {
        return i == DicDataTypeUtil.DataType.MEDICATION_RULE.value() || i == DicDataTypeUtil.DataType.MEDICATION_PUNCHING.value();
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(final int i, List<String> list, final List<qfq> list2, final ResponseCallback<List<String>> responseCallback) {
        if (!isNeedUpdate(list, TaskEnum.TAKE_MEDICINE.getTaskId())) {
            onResponse(responseCallback, 0, Collections.EMPTY_LIST);
            return;
        }
        if (njy.e(list2)) {
            LogUtil.j("TaskPlatform_TakeMedicine", "list empty");
            onResponse(responseCallback, -1, Collections.EMPTY_LIST);
            return;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(String.valueOf(i), String.valueOf(i), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(f37698c);
        hiAggregateOption.setConstantsKey(e);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(0);
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: ijd.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list3, int i2, int i3) {
                if (njy.e(list3)) {
                    LogUtil.e("TaskPlatform_TakeMedicine", "getTaskValue is empty");
                    ijd.this.onResponse(responseCallback, i2, Collections.EMPTY_LIST);
                } else {
                    LogUtil.a("TaskPlatform_TakeMedicine", "getTaskValue datas", list3.toString());
                    ijd.this.c(list3, i2, responseCallback, list2, i);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list3, int i3, int i4) {
                LogUtil.j("TaskPlatform_TakeMedicine", "getMedicineRecord errorCode:" + i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list, int i, ResponseCallback<List<String>> responseCallback, List<qfq> list2, int i2) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                int i3 = hiHealthData.getInt("punchTaskId");
                int i4 = hiHealthData.getInt("punchStatus");
                long j = hiHealthData.getLong("punchTime");
                a aVar = new a();
                aVar.d(i3);
                aVar.e(i4);
                aVar.e(j);
                arrayList.add(aVar);
            }
        }
        if (njy.e(arrayList)) {
            onResponse(responseCallback, i, Collections.EMPTY_LIST);
        } else {
            onResponse(responseCallback, i, c(list2, arrayList, i2));
        }
    }

    private List<String> c(List<qfq> list, List<a> list2, int i) {
        int iOptInt;
        int iO = lsl.o(DateFormatUtil.d(i));
        ArrayList arrayList = new ArrayList();
        for (qfq qfqVar : list) {
            if (qfqVar != null) {
                String strC = qfqVar.c();
                if (!TextUtils.isEmpty(strC)) {
                    int iOptInt2 = 0;
                    try {
                        JSONObject jSONObject = new JSONObject(strC);
                        iOptInt = jSONObject.optInt("medicinePeriod");
                        try {
                            iOptInt2 = jSONObject.optInt("medicationRuleId");
                        } catch (JSONException unused) {
                            ReleaseLogUtil.a("TaskPlatform_TakeMedicine", "JSONException medicinePeriod");
                        }
                    } catch (JSONException unused2) {
                        iOptInt = 0;
                    }
                    if ((iOptInt & (1 << (iO - 1))) != 0) {
                        qfk qfkVarI = qfqVar.i();
                        a aVarB = b(list2, Integer.valueOf(iOptInt2));
                        if (aVarB != null) {
                            String strRefreshObjectiveResult = refreshObjectiveResult(i, qfkVarI, "1", 1, a(qfkVarI, aVarB));
                            if (!TextUtils.isEmpty(strRefreshObjectiveResult)) {
                                arrayList.add(strRefreshObjectiveResult);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static String a(qfk qfkVar, a aVar) {
        if (qfkVar == null) {
            return HiJsonUtil.d(aVar);
        }
        String strU = qfkVar.u();
        if (TextUtils.isEmpty(strU)) {
            return HiJsonUtil.d(aVar);
        }
        Map map = (Map) HiJsonUtil.d(strU, new TypeToken<Map<String, Object>>() { // from class: com.huawei.health.taskplatform.task.TakeMedicine$2
        }.getType());
        map.put("medicationPunchTaskId", Integer.valueOf(aVar.a()));
        map.put("medicationPunchStatus", Integer.valueOf(aVar.d()));
        map.put("medicationPunchTime", Long.valueOf(aVar.c()));
        return HiJsonUtil.d(map);
    }

    public static a b(List<a> list, Integer num) {
        if (njy.e(list)) {
            return null;
        }
        for (a aVar : list) {
            if (aVar != null && aVar.a() == num.intValue()) {
                return aVar;
            }
        }
        return null;
    }

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("medicationPunchStatus")
        private int f37702b;

        @SerializedName("medicationPunchTime")
        private long d;

        @SerializedName("medicationPunchTaskId")
        private int e;

        public int a() {
            return this.e;
        }

        public void d(int i) {
            this.e = i;
        }

        public long c() {
            return this.d;
        }

        public void e(long j) {
            this.d = j;
        }

        public int d() {
            return this.f37702b;
        }

        public void e(int i) {
            this.f37702b = i;
        }
    }
}
