package com.huawei.hwarkuix.oHBrigdePlugin.load;

/* JADX INFO: loaded from: classes10.dex */
public class PluginLoadFactory {
    public static IPluginLoad generatedPluginLoad(int i) {
        switch (i) {
            case 1:
                return new EmotionModulesPluginLoad();
            case 2:
                return new ECGModulesPluginLoad();
            case 3:
                return new DeviceModulesPluginLoad();
            case 4:
                return new BridgeModulesPluginLoad();
            case 5:
                return new BaseModulesPluginLoad();
            case 6:
                return new BloodPressureModulesPluginLoad();
            default:
                return null;
        }
    }
}
