package defpackage;

import android.util.SparseArray;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class bug {
    private bug() {
    }

    public static bug c() {
        return new bug();
    }

    public void b(long j, long j2, int[] iArr, String[] strArr, HiAggregateListener hiAggregateListener) {
        if (hiAggregateListener == null) {
            LogUtil.e("Suggestion_RunDataManager", "getLastMonthRunDistance callback is null.");
            return;
        }
        if (j > j2 || njy.d(iArr) || strArr == null || strArr.length == 0) {
            LogUtil.e("Suggestion_RunDataManager", "getLastMonthRunDistance startTime = ", Long.valueOf(j), ", endTime = ", Long.valueOf(j2));
            hiAggregateListener.onResult(null, -1, -1);
            return;
        }
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(j);
        hiSportStatDataAggregateOption.setEndTime(j2);
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setGroupUnitType(7);
        hiSportStatDataAggregateOption.setReadType(0);
        hiSportStatDataAggregateOption.setType((int[]) iArr.clone());
        hiSportStatDataAggregateOption.setConstantsKey((String[]) strArr.clone());
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{258});
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateSportStatData(hiSportStatDataAggregateOption, hiAggregateListener);
    }

    public void c(long j, long j2, final DataCallback dataCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{258, 264, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 227});
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(btx.c()).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: bug.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("Suggestion_RunDataManager", "data error.");
                    dataCallback.onFailure(-1, "");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
                    LogUtil.j("Suggestion_RunDataManager", "requestTrackSimplifyData onResult obj not instanceof List");
                    dataCallback.onFailure(-1, "");
                    return;
                }
                List list = (List) sparseArray.get(i);
                if (!njy.e(list)) {
                    dataCallback.onSuccess(bug.this.d(list));
                } else {
                    LogUtil.j("Suggestion_RunDataManager", "empty data.");
                    dataCallback.onFailure(-1, "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject d(List<HiHealthData> list) {
        HiTrackMetaData hiTrackMetaData;
        float totalDistance = 0.0f;
        float totalTime = 0.0f;
        float totalCalories = 0.0f;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (hiTrackMetaData = (HiTrackMetaData) qqt.e(hiHealthData.getMetaData(), HiTrackMetaData.class)) != null && hiTrackMetaData.getSportDataSource() != 2) {
                if (hiTrackMetaData.getAbnormalTrack() != 0) {
                    LogUtil.j("Suggestion_RunDataManager", "trackMetaData is abnormal. abnormalTrack:", Integer.valueOf(hiTrackMetaData.getAbnormalTrack()));
                } else {
                    LogUtil.a("Suggestion_RunDataManager", "HiTrackMetaData:", hiTrackMetaData.toString());
                    totalDistance += hiTrackMetaData.getTotalDistance();
                    totalTime += hiTrackMetaData.getTotalTime();
                    totalCalories += hiTrackMetaData.getTotalCalories();
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("distance", totalDistance);
            jSONObject.put("duration", totalTime);
            jSONObject.put("calorie", totalCalories);
            LogUtil.a("Suggestion_RunDataManager", jSONObject.toString());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("Suggestion_RunDataManager", "json error:", LogAnonymous.b(e));
            return jSONObject;
        }
    }
}
