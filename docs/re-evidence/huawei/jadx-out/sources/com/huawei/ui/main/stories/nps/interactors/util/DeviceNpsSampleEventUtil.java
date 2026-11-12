package com.huawei.ui.main.stories.nps.interactors.util;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cpy;
import defpackage.cql;
import defpackage.edc;
import defpackage.eec;
import defpackage.eee;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceNpsSampleEventUtil implements DataReceiveCallback {
    private static final Object LOCK = new Object();
    private static final long NPS_EVENT_ID = 800100018;
    private static final String SRC_PKG_NAME = "hw.nps.app";
    private static final String TAG = "DeviceNpsSampleEventUtil";
    private static final String TAG_RELEASE = "Nps_DeviceNpsSampleEventUtil";
    private static final byte TYPE_ACTIVATION_TIME = 2;
    private static final byte TYPE_ODID = 1;
    private static final String WEAR_PKG_NAME = "hw.nps.device";
    private static DeviceNpsSampleEventUtil sInstance;
    private SampleEventCallback callback;

    private DeviceNpsSampleEventUtil() {
    }

    public static DeviceNpsSampleEventUtil getInstance() {
        DeviceNpsSampleEventUtil deviceNpsSampleEventUtil;
        synchronized (LOCK) {
            if (sInstance == null) {
                sInstance = new DeviceNpsSampleEventUtil();
            }
            deviceNpsSampleEventUtil = sInstance;
        }
        return deviceNpsSampleEventUtil;
    }

    public void requestDeviceNpsData(DeviceInfo deviceInfo, SampleEventCallback sampleEventCallback) {
        this.callback = sampleEventCallback;
        edc.e().registerDeviceSampleListener(SRC_PKG_NAME, this);
        sendCommand(deviceInfo);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        edc.e().unRegisterDeviceSampleListener(SRC_PKG_NAME);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "onDataReceived deviceInfo is null");
            return;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "get SampleEvent message success");
        if (!(eecVar instanceof eee)) {
            LogUtil.j(TAG, "onDataReceived sampleBase not instanceof SampleEvent");
            return;
        }
        eee eeeVar = (eee) eecVar;
        if (isSampleEventValid(eeeVar)) {
            try {
                cql.c cVarA = new cql().a(eeeVar.c(), 0);
                SampleEventCallback sampleEventCallback = this.callback;
                if (sampleEventCallback != null) {
                    sampleEventCallback.onSuccess(cVarA);
                }
            } catch (cpy unused) {
                ReleaseLogUtil.a(TAG_RELEASE, "handleSampleEvent error EventData = ", eeeVar.c());
                this.callback.onError();
            }
        }
    }

    private boolean isSampleEventValid(eee eeeVar) {
        if (!eeeVar.getSrcPkgName().equals(WEAR_PKG_NAME)) {
            LogUtil.j(TAG, "wearPkgName not match.");
            return false;
        }
        if (eeeVar.getCommandId() != 2) {
            LogUtil.j(TAG, "command not match.");
            return false;
        }
        if (eeeVar.d() != NPS_EVENT_ID) {
            LogUtil.j(TAG, "eventId not match.");
            return false;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC != null && bArrC.length != 0) {
            return true;
        }
        LogUtil.j(TAG, "sampleEvent data is empty.");
        return false;
    }

    private void sendCommand(DeviceInfo deviceInfo) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName(SRC_PKG_NAME);
        eeeVar.setWearPkgName(WEAR_PKG_NAME);
        eeeVar.a(NPS_EVENT_ID);
        eeeVar.setCommandId(2);
        eeeVar.a(0);
        edc.e().sendSampleEventCommand(deviceInfo, eeeVar, TAG);
        LogUtil.a(TAG, "sendCommand success");
    }
}
