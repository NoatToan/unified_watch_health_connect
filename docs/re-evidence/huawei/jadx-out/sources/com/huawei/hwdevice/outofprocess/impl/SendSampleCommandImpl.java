package com.huawei.hwdevice.outofprocess.impl;

import com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.unitedevice.manager.SampleEventCache;
import defpackage.eea;
import defpackage.eee;
import defpackage.eef;
import defpackage.eeh;
import defpackage.xiq;

/* JADX INFO: loaded from: classes38.dex */
public class SendSampleCommandImpl implements SendSampleCommandApi {
    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendSampleConfigCommand(DeviceInfo deviceInfo, eef eefVar, String str) {
        return xiq.a().d(deviceInfo, eefVar, str);
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendSampleEventCommand(DeviceInfo deviceInfo, eee eeeVar, String str) {
        return xiq.a().c(deviceInfo, eeeVar, str);
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendSampleEventCommand(DeviceInfo deviceInfo, eee eeeVar, SampleEventCache.e eVar, String str) {
        return xiq.a().b(deviceInfo, eeeVar, eVar, str);
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendSamplePointCommand(DeviceInfo deviceInfo, eeh eehVar, String str) {
        return xiq.a().a(deviceInfo, eehVar, str);
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendDictionaryPointInfoCommand(DeviceInfo deviceInfo, eea eeaVar, String str) {
        return xiq.a().e(deviceInfo, eeaVar, str);
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public void registerDeviceSampleListener(String str, DataReceiveCallback dataReceiveCallback) {
        xiq.a().b(str, dataReceiveCallback);
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public void registerDeviceSampleListener(String str, DataReceiveCallback dataReceiveCallback, String str2) {
        xiq.a().a(str, dataReceiveCallback, str2);
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public void unRegisterDeviceSampleListener(String str) {
        xiq.a().e(str);
    }
}
