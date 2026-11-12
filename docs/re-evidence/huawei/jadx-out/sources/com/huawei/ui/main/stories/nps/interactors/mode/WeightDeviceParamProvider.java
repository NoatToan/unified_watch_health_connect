package com.huawei.ui.main.stories.nps.interactors.mode;

import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import defpackage.nio;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class WeightDeviceParamProvider implements DeviceParamProvider {
    private String mac;
    private String model;
    private String romVersion;
    private String sn;

    public WeightDeviceParamProvider(String str, String str2, String str3, String str4) {
        this.romVersion = str;
        this.sn = str2;
        this.mac = str3;
        this.model = str4;
    }

    @Override // com.huawei.ui.main.stories.nps.interactors.mode.DeviceParamProvider
    public Map<String, String> getSpecificParams() {
        HashMap map = new HashMap();
        map.put("appVersion", "21319");
        map.put("romVersion", this.romVersion);
        map.put("sn", this.sn);
        map.put("uniqueId", getUniqueIdBySHA256(nio.c(this.mac)));
        map.put("model", this.model);
        return map;
    }

    public String getRomVersion() {
        return this.romVersion;
    }

    public void setRomVersion(String str) {
        this.romVersion = str;
    }

    public String getSn() {
        return this.sn;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String str) {
        this.model = str;
    }

    private String getUniqueIdBySHA256(String str) {
        return HwNpsManager.getInstance().getDeviceId(str);
    }
}
