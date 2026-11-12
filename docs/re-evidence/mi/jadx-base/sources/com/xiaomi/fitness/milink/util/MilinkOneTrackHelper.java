package com.xiaomi.fitness.milink.util;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackConstant;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J \u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/milink/util/MilinkOneTrackHelper;", "", "<init>", "()V", "getMilinkOneTrackSource", "", "device", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "attachMilinkOneTrackControl", "", "source", "", "cmd", "getMilinkCmd", "getMilinkAudioCmd", "getMilinkTVCmd", "getMilinkHeadsetCmd", "getPrivacyDeviceId", "id", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MilinkOneTrackHelper {

    @NotNull
    public static final MilinkOneTrackHelper INSTANCE = new MilinkOneTrackHelper();

    private MilinkOneTrackHelper() {
    }

    private final String getMilinkAudioCmd(int cmd) {
        if (cmd == 0) {
            return OneTrack.Event.PLAY;
        }
        if (cmd == 1) {
            return "suspended";
        }
        if (cmd == 3) {
            return "volume_size";
        }
        if (cmd != 4) {
            return cmd != 5 ? "" : "next";
        }
        return "previous";
    }

    private final String getMilinkCmd(int source, int cmd) {
        if (source == 1) {
            return getMilinkAudioCmd(cmd);
        }
        if (source != 2) {
            return source != 3 ? "" : getMilinkHeadsetCmd(cmd);
        }
        return getMilinkTVCmd(cmd);
    }

    private final String getMilinkHeadsetCmd(int cmd) {
        if (cmd == 1) {
            return "noise_reduction";
        }
        if (cmd != 2) {
            return cmd != 3 ? "" : "shut_down";
        }
        return "fully";
    }

    private final String getMilinkTVCmd(int cmd) {
        switch (cmd) {
            case 2:
                return "up_key";
            case 3:
                return "down_key";
            case 4:
                return "left_key";
            case 5:
                return "right_key";
            case 6:
                return "home";
            case 7:
                return "menu";
            case 8:
                return "back";
            case 9:
                return "sound_increase";
            case 10:
                return "sound_reduce";
            case 11:
                return "Switch_machine";
            case 12:
                return "middle_key";
            default:
                return "";
        }
    }

    public final void attachMilinkOneTrackControl(@Nullable CirculateDeviceInfo device, int source, int cmd) {
        String sn;
        String did;
        String model;
        String name;
        String firmwareVersion;
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(OneTrackConstant.EVENT_NAME_CONNECTIVITY, "56.52.1.1.22971");
        Object[] objArr = new Object[18];
        objArr[0] = "name";
        objArr[1] = "device_control_command";
        objArr[2] = "source";
        objArr[3] = getMilinkOneTrackSource(device);
        objArr[4] = "device_did";
        objArr[5] = getPrivacyDeviceId(device != null ? device.f10301a : null);
        objArr[6] = "type_str";
        objArr[7] = getMilinkCmd(source, cmd);
        objArr[8] = CirculateDeviceInfo.DEVICE_SN;
        String str = "";
        if (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (sn = deviceInfo.getSn()) == null) {
            sn = "";
        }
        objArr[9] = sn;
        objArr[10] = "wearable_id";
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        objArr[11] = did;
        objArr[12] = "device_model";
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[13] = model;
        objArr[14] = "device_name";
        if (wearableDeviceModel == null || (name = DeviceModelExtKt.getName(wearableDeviceModel)) == null) {
            name = "";
        }
        objArr[15] = name;
        objArr[16] = "device_version";
        if (wearableDeviceModel != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) != null) {
            str = firmwareVersion;
        }
        objArr[17] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    @NotNull
    public final String getMilinkOneTrackSource(@Nullable CirculateDeviceInfo device) {
        String str = device != null ? device.d : null;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1834993054) {
                if (iHashCode != 2690) {
                    return iHashCode != 80074991 ? "audio" : "audio";
                }
                if (str.equals("TV")) {
                    return "television";
                }
            } else if (str.equals("Headset")) {
                return "earphone";
            }
        }
        return "cell_phone";
    }

    @NotNull
    public final String getPrivacyDeviceId(@Nullable String id) {
        if (id == null || id.length() == 0) {
            return "";
        }
        if (!Intrinsics.areEqual(id, "local_device_id")) {
            return MD5Util.MD5(id);
        }
        String oaid = DeviceUtil.INSTANCE.getOAID(ApplicationExtKt.getApplication());
        return oaid == null ? "" : oaid;
    }
}
