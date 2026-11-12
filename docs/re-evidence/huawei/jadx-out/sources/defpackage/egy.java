package defpackage;

import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.ble.BleJsDataApi;
import com.huawei.operation.share.ResultCallback;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class egy {
    public static List<HiHealthData> a(List<HiHealthData> list) {
        int i;
        ArrayList arrayList = new ArrayList(10);
        try {
            for (HiHealthData hiHealthData : list) {
                JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
                if (hiHealthData.getType() != 30001 || jSONObject.getInt(BleConstants.SPORT_TYPE) != 283) {
                    break;
                    break;
                }
                float f = jSONObject.getInt(BleConstants.TOTAL_CALORIES);
                long startTime = hiHealthData.getStartTime();
                long j = 60000;
                long j2 = startTime - (startTime % 60000);
                long endTime = hiHealthData.getEndTime();
                long j3 = endTime - startTime;
                if (Math.abs(f) <= 0.001f || j3 <= 0) {
                    break;
                    break;
                }
                if (j3 % 60000 > 0) {
                    i = ((int) (j3 / 60000)) + 1;
                } else {
                    i = (int) (j3 / 60000);
                }
                float f2 = f / i;
                while (true) {
                    HiHealthData hiHealthData2 = new HiHealthData(4);
                    long j4 = j2 + j;
                    hiHealthData2.setTimeInterval(j2, j4);
                    HiHealthData hiHealthData3 = new HiHealthData(20003);
                    hiHealthData3.setTimeInterval(j2, j4);
                    j = 60000;
                    startTime += 60000;
                    hiHealthData2.setValue(f2);
                    hiHealthData2.setDeviceUuid(hiHealthData.getDeviceUuid());
                    arrayList.add(hiHealthData2);
                    hiHealthData3.setValue(0);
                    hiHealthData3.setDeviceUuid(hiHealthData.getDeviceUuid());
                    arrayList.add(hiHealthData3);
                    if (startTime >= endTime) {
                        break;
                    }
                    j2 = j4;
                }
            }
        } catch (JSONException unused) {
            LogUtil.a("PDROPE_RopeCalorieProcessor", "assembleCaloriePoints JSONException");
        }
        return arrayList;
    }

    public void e(List<HiHealthData> list) {
        LogUtil.a("PDROPE_RopeCalorieProcessor", "saveHealthDataToPlatform");
        if (list == null || list.isEmpty()) {
            return;
        }
        List<HiHealthData> listA = a(list);
        if (listA.isEmpty()) {
            return;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(listA);
        BleJsDataApi.getInstance().saveSample(hiDataInsertOption, 3, new ResultCallback() { // from class: eha
            @Override // com.huawei.operation.share.ResultCallback
            public final void onResult(int i, Object obj) {
                LogUtil.a("PDROPE_RopeCalorieProcessor", "saveHealthDataToPlatform resultCode：", Integer.valueOf(i));
            }
        });
    }
}
