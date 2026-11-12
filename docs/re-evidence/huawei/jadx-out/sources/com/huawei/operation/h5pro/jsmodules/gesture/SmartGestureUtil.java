package com.huawei.operation.h5pro.jsmodules.gesture;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.cqj;
import defpackage.edc;
import defpackage.eee;
import defpackage.eey;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public class SmartGestureUtil {
    private static final String TAG = "SmartGestureUtil";

    public static boolean isShowSmartGestureItem(DeviceInfo deviceInfo) {
        LogUtil.b(TAG, "isSupportSmartGesture: ", Boolean.valueOf(eey.d(deviceInfo, 233)));
        return false;
    }

    public static boolean isSmartGestureOpen() {
        boolean zB = SharedPreferenceManager.b(SmartGestureConstant.MODULE_ID, SmartGestureConstant.KEY_SMART_GESTURE_SWITCH_STATUS, false);
        LogUtil.b(TAG, "isSmartGestureOpen is : ", Boolean.valueOf(zB));
        return zB;
    }

    public static boolean sendGestureCommand(DeviceInfo deviceInfo, int i) {
        eee sampleEvent = getSampleEvent(i);
        LogUtil.b(TAG, "sendGestureCommand sampleEvent is ", sampleEvent.toString());
        boolean zSendSampleEventCommand = edc.e().sendSampleEventCommand(deviceInfo, sampleEvent, TAG);
        LogUtil.b(TAG, "sendGestureTagCommand  isSuccess = ", Boolean.valueOf(zSendSampleEventCommand));
        return zSendSampleEventCommand;
    }

    private static eee getSampleEvent(int i) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName(SmartGestureConstant.SRC_PKG_NAME);
        eeeVar.setWearPkgName(SmartGestureConstant.WEAR_PKG_NAME);
        eeeVar.a(SmartGestureConstant.GESTURE_EVENT_ID);
        eeeVar.setCommandId(2);
        eeeVar.a(0);
        eeeVar.e(buildData(i));
        return eeeVar;
    }

    private static byte[] buildData(int i) {
        cqj cqjVar = new cqj();
        cqjVar.g(1, 2).g(2, i);
        return cqjVar.e();
    }

    public static void registerLocalBroadcast(BroadcastReceiver broadcastReceiver) {
        BroadcastManagerUtil.b(BaseApplication.b(), broadcastReceiver, new IntentFilter(SmartGestureConstant.ACTION_SMART_GESTURE_STATUS));
    }

    public static void unRegisterLocalBroadcast(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            BaseApplication.b().unregisterReceiver(broadcastReceiver);
        }
    }
}
