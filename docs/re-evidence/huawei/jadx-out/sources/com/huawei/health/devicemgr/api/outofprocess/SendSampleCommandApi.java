package com.huawei.health.devicemgr.api.outofprocess;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.unitedevice.manager.SampleEventCache;
import defpackage.eea;
import defpackage.eee;
import defpackage.eef;
import defpackage.eeh;

/* JADX INFO: loaded from: classes7.dex */
public interface SendSampleCommandApi {
    void registerDeviceSampleListener(String str, DataReceiveCallback dataReceiveCallback);

    void registerDeviceSampleListener(String str, DataReceiveCallback dataReceiveCallback, String str2);

    boolean sendDictionaryPointInfoCommand(DeviceInfo deviceInfo, eea eeaVar, String str);

    boolean sendSampleConfigCommand(DeviceInfo deviceInfo, eef eefVar, String str);

    boolean sendSampleEventCommand(DeviceInfo deviceInfo, eee eeeVar, SampleEventCache.e eVar, String str);

    boolean sendSampleEventCommand(DeviceInfo deviceInfo, eee eeeVar, String str);

    boolean sendSamplePointCommand(DeviceInfo deviceInfo, eeh eehVar, String str);

    void unRegisterDeviceSampleListener(String str);
}
