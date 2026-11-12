package com.xiaomi.account.privacy_data.master;

import com.xiaomi.passport.sim.SIMInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;

/* JADX INFO: loaded from: classes6.dex */
public enum PrivacyDataType {
    OAID("oaid"),
    ANDROID_ID("android_id"),
    DEVICE_ID("device_id"),
    MIUI_DEVICE_ID("miui_device_id"),
    BLUETOOTH_NAME("bluetooth_name"),
    BLUETOOTH_ADDRESS("bluetooth_address"),
    MAC_ADDRESS("mac_address"),
    SSID("ssid"),
    BSSID(DeviceTagInterface.ROUTER_BSSID),
    CONFIGURED_SSIDS("configured_ssids"),
    ICCID(SIMInfo.SIM_INFO_TYPE_ICCID),
    IMSI(SIMInfo.SIM_INFO_TYPE_IMSI),
    LINE_1_NUMBER("line_1_number"),
    MCCMNC(SIMInfo.SIM_INFO_TYPE_MCCMNC),
    NETWORK_MCCMNC("network_mccmnc"),
    SUB_ID(RnReportConst.PluginBusinessReport.PARAM_SUBID),
    MOBILE_DATA_ENABLE("mobile_data_enable"),
    SIM_IN_SERVICE("sim_in_service");

    public final String name;

    PrivacyDataType(String str) {
        this.name = str;
    }
}
