package defpackage;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import health.compact.a.Utils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mvd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f42485c = new LinkedHashMap(16);

    static {
        e();
    }

    public static void c() {
        if (Utils.o()) {
            f42485c.put(Integer.valueOf(DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()), Integer.valueOf(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON));
        } else {
            f42485c.put(Integer.valueOf(DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()), 168);
        }
        Map<Integer, Integer> map = f42485c;
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.ECG_OF_VASCULAR_HEALTH.value()), Integer.valueOf(a.L));
        if (eey.d(c("DictionarySequenceCapability"), a.w)) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.ECG_OF_VASCULAR_HEALTH.value()), Integer.valueOf(a.w));
        }
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.THIRD_WORKOUT_DETAILS.value()), 308);
    }

    public static Map<Integer, Integer> a() {
        return f42485c;
    }

    public static int d(int i) {
        Integer num = f42485c.get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private static void e() {
        Map<Integer, Integer> map = f42485c;
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPO2_RESP_INFECTION.value()), 117);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.RRI_RESP_INFECTION.value()), 117);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.TEMPERATURE_RESP_INFECTION.value()), 117);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_FRAGMENT_RESP_INFECTION.value()), 117);
        if (Utils.o()) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()), Integer.valueOf(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON));
        } else {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()), 168);
        }
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.CNTBPORIGINPPGDATA.value()), Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_DETAILS.value()), 143);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BG_DAILY_PROB_WIN.value()), 150);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BG_COMBINED_PPG_FEATURE.value()), 150);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICAL_EXAM_REPORT.value()), 157);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.DYNAMIC_BP_REPORT.value()), 205);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.PPG_OF_VASCULAR_HEALTH.value()), Integer.valueOf(a.L));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.RRI.value()), 235);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICAL_EXAM_REPORT_RESEARCH.value()), 157);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.CORONARY_HEART_DISEASE_RISK_STUDY.value()), Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.ECG_OF_VASCULAR_HEALTH.value()), Integer.valueOf(a.L));
        if (eey.d(c("DictionarySequenceCapability"), a.w)) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.ECG_OF_VASCULAR_HEALTH.value()), Integer.valueOf(a.w));
        }
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.ONE_SECOND_SPORT_DATA_TYPE.value()), 308);
    }

    private static DeviceInfo c(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, str);
        if (deviceList != null && !deviceList.isEmpty()) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        LogUtil.a("DictionarySequenceCapability", "getConnectDeviceInfo() deviceInfo ", deviceInfo, " , tag is ", str);
        return deviceInfo;
    }
}
