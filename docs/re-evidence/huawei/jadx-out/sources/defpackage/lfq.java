package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealthservice.R;
import com.huawei.hihealthservice.postprocessing.HiPostProcessAction;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class lfq implements HiPostProcessAction {
    private static final Map<Integer, Integer> e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, lfu> f40044a = new HashMap();

    static {
        HashMap map = new HashMap(1);
        e = map;
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.VASCULAR_HEALTH.value()), Integer.valueOf(DicDataTypeUtil.DataType.ARTERIAL_ELASTICITY.value()));
    }

    public boolean a(Integer num, lfu lfuVar) {
        if (this.f40044a.containsKey(num)) {
            return false;
        }
        this.f40044a.put(num, lfuVar);
        return true;
    }

    @Override // com.huawei.hihealthservice.postprocessing.HiPostProcessAction
    public boolean postProcessAction(HiHealthData hiHealthData, int i) {
        lfu lfuVar = this.f40044a.get(Integer.valueOf(i));
        lfuVar.a();
        lfuVar.e();
        lfuVar.setCreateTime(System.currentTimeMillis());
        if (TextUtils.isEmpty(lfuVar.getMsgContent())) {
            LogUtil.j("HiNotifyAction", "postProcessAction post message failed by empty content");
            return false;
        }
        LogUtil.a("HiNotifyAction", "postProcessAction message id:", lfuVar.getMsgId());
        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).showNotification(BaseApplication.getContext(), lfuVar);
        return true;
    }

    @Override // com.huawei.hihealthservice.postprocessing.HiPostProcessAction
    public Set<Integer> getDataTypes() {
        return this.f40044a.keySet();
    }

    @Override // com.huawei.hihealthservice.postprocessing.HiPostProcessAction
    public boolean beforePostProcessAction(HiHealthData hiHealthData, int i) {
        int syncStatus = hiHealthData.getSyncStatus();
        if (syncStatus == 1) {
            LogUtil.a("HiNotifyAction", "beforePostProcessAction() syncStatus=", Integer.valueOf(syncStatus));
            return false;
        }
        HiDeviceInfo hiDeviceInfoB = kwy.b(BaseApplication.getContext()).b(hiHealthData.getDeviceUuid());
        int deviceType = hiDeviceInfoB != null ? hiDeviceInfoB.getDeviceType() : 0;
        LogUtil.a("HiNotifyAction", "beforePostProcessAction() syncStatus=", Integer.valueOf(syncStatus), ", deviceType=", Integer.valueOf(deviceType));
        if (deviceType == 0 || deviceType == 1 || "-1".equals(hiHealthData.getDeviceUuid())) {
            return false;
        }
        if (i == 10002) {
            return b(hiHealthData, i, deviceType);
        }
        if (i == DicDataTypeUtil.DataType.ARRHYTHMIA_RESULT_TYPE.value() && !e(hiHealthData, i)) {
            return false;
        }
        if (i == DicDataTypeUtil.DataType.MEDICAL_EXAM_REPORT.value()) {
            HashMap map = new HashMap(1);
            map.put("reportTime", Long.toString(hiHealthData.getStartTime()));
            a(this.f40044a.get(Integer.valueOf(i)), map);
            return true;
        }
        Map<Integer, Integer> map2 = e;
        return !map2.containsKey(Integer.valueOf(i)) || hiHealthData.getType() == map2.get(Integer.valueOf(i)).intValue();
    }

    private boolean e(HiHealthData hiHealthData, int i) {
        if (!CommonUtil.ao()) {
            return false;
        }
        if (hiHealthData.getType() == DicDataTypeUtil.DataType.PPG_IRREGULAR_HEARTBEAT.value()) {
            int intValue = hiHealthData.getIntValue();
            HiHealthData hiHealthDataA = a(hiHealthData, DicDataTypeUtil.DataType.ARRHYTHMIA_MEASURE_TYPE.value());
            if (hiHealthDataA == null) {
                LogUtil.a("HiNotifyAction", "beforePostActionPpg missing require data: ARRHYTHMIA_MEASURE_TYPE");
                return false;
            }
            return b(hiHealthData, i, intValue, hiHealthDataA.getIntValue());
        }
        LogUtil.a("HiNotifyAction", "ARRHYTHMIA_RESULT_TYPE data ignore");
        return false;
    }

    private boolean b(HiHealthData hiHealthData, int i, int i2, int i3) {
        lfu lfuVar = this.f40044a.get(Integer.valueOf(i));
        if (i2 == 2) {
            lfuVar.d(R.string.IDS_ppg_sync_notify_premature_beat_suspect);
        } else if (i2 == 3) {
            lfuVar.d(R.string.IDS_ppg_sync_notify_atrial_fibrillation_suspect);
        } else if (i2 == 4) {
            lfuVar.d(Utils.o() ? R.string.IDS_ppg_sync_notify_atrial_fibrillation_risk : R.string.IDS_ppg_sync_notify_atrial_fibrillation_suspect);
        } else {
            if (i2 != 5) {
                LogUtil.a("HiNotifyAction", "PPG_IRREGULAR_HEARTBEAT status without abnormal");
                return false;
            }
            lfuVar.d(Utils.o() ? R.string.IDS_ppg_sync_notify_premature_beat_risk : R.string.IDS_ppg_sync_notify_premature_beat_suspect);
        }
        HiDeviceInfo hiDeviceInfoB = kwy.b(BaseApplication.getContext()).b(hiHealthData.getDeviceUuid());
        if (hiDeviceInfoB == null) {
            LogUtil.e("HiNotifyAction", "get an invalid device name during beforePostActionPpg");
            return false;
        }
        HashMap map = new HashMap(5);
        map.put("device_name", hiDeviceInfoB.getDeviceName());
        map.put("measureType", Integer.toString(i3));
        map.put("start_time", Long.toString(hiHealthData.getStartTime()));
        map.put("end_time", Long.toString(hiHealthData.getEndTime()));
        map.put("heartRateStatus", Integer.toString(i2));
        a(lfuVar, map);
        this.f40044a.put(Integer.valueOf(i), lfuVar);
        return true;
    }

    private HiHealthData a(HiHealthData hiHealthData, int i) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime());
        hiDataReadOption.setType(new int[]{i});
        Context context = BaseApplication.getContext();
        List<HiHealthData> listB = kxe.d(context).b(hiDataReadOption, i, kwt.b().f(kud.a().e()), (kth) null);
        if (njy.e(listB)) {
            return null;
        }
        return listB.get(0);
    }

    private boolean b(HiHealthData hiHealthData, int i, int i2) {
        if (hiHealthData.getType() == DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()) {
            LogUtil.a("HiNotifyAction", "BLOOD_BEFORE_ACTIVITY data ignore");
            return false;
        }
        LogUtil.a("HiNotifyAction", "start beforePostProcessAction of DATA_SET_BLOODPRESSURE_EX");
        lfu lfuVar = this.f40044a.get(Integer.valueOf(i));
        e(lfuVar, hiHealthData.getStartTime());
        if (d(i2)) {
            LogUtil.a("HiNotifyAction", "bloodPressure not from watch");
            lfuVar.setGroupSummary(false);
        } else {
            lfuVar.setGroupSummary(true);
        }
        this.f40044a.put(Integer.valueOf(i), lfuVar);
        LogUtil.a("HiNotifyAction", "end beforePostProcessAction of DATA_SET_BLOODPRESSURE_EX");
        return i2 != 10001;
    }

    private boolean d(int i) {
        Iterator<ProductMapInfo> it = ProductMap.c("deviceId", String.valueOf(i)).iterator();
        while (it.hasNext()) {
            if ("02B".equals(it.next().e())) {
                return true;
            }
        }
        return false;
    }

    private void e(lfu lfuVar, long j) {
        if (lfuVar == null || j == 0) {
            return;
        }
        HashMap map = new HashMap(1);
        map.put("key_marker_view_time", Long.toString(j));
        a(lfuVar, map);
    }

    private void a(lfu lfuVar, Map<String, String> map) {
        Uri uri = Uri.parse(lfuVar.d());
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!uri.getQueryParameterNames().contains(key)) {
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                builderBuildUpon.appendQueryParameter(key, value);
            }
        }
        String string = builderBuildUpon.build().toString();
        LogUtil.d("HiNotifyAction", "addParamsIntoMsgUri result uri: ", string);
        lfuVar.setDetailUri(string);
    }
}
