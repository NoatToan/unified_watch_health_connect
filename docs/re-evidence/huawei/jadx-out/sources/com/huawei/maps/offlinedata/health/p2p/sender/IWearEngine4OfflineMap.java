package com.huawei.maps.offlinedata.health.p2p.sender;

import com.huawei.maps.offlinedata.health.p2p.OfflineMapP2pMessage;
import com.huawei.maps.offlinedata.health.sample.SampleConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface IWearEngine4OfflineMap {
    String getDeviceInfo(String str);

    boolean isSmartWatchApMode();

    boolean isSmartWatchMcuMode();

    Map<Integer, Boolean> queryDeviceCapability(List<Integer> list);

    void registerDeviceSampleListener(String str, IOfflineMapSampleCallback iOfflineMapSampleCallback);

    void sendCancelCommand(String str, int i, IOfflineMapSendCallback iOfflineMapSendCallback);

    void sendMsgToDevice(OfflineMapP2pMessage offlineMapP2pMessage);

    void sendMsgToDevice(OfflineMapP2pMessage offlineMapP2pMessage, int i, IOfflineMapSendCallback iOfflineMapSendCallback);

    void sendPingToDevice(IOfflineMapPingCallback iOfflineMapPingCallback, String str);

    void sendSampleConfigCommand(String str, String str2, SampleConfig sampleConfig);

    void unregisterDeviceSampleListener(String str, IOfflineMapSampleCallback iOfflineMapSampleCallback);
}
