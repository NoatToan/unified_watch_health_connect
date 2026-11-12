package com.huawei.health.sportservice.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.linkage.sportlinkage.LinkagePlatformApi;
import com.huawei.operation.utils.Constants;
import defpackage.ecu;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.REVERSE_LINKAGE_MANAGER)
public class ReverseLinkageManager implements ManagerComponent {
    private static final String TAG = "SportService_ReverseLinkageManager";
    private BroadcastReceiver mConnectStateChangedReceiver;
    private LinkagePlatformApi mLinkagePlatformApi;
    private DeviceInfo mMainDevice = null;

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport(String str) {
        LogUtil.a(TAG, "onPreSport");
        LinkagePlatformApi linkagePlatformApi = (LinkagePlatformApi) Services.d("LinkagePlatform", LinkagePlatformApi.class);
        this.mLinkagePlatformApi = linkagePlatformApi;
        if (linkagePlatformApi == null) {
            LogUtil.e(TAG, "onPreSport reverseLinkagePlatformApi == null");
            return;
        }
        this.mMainDevice = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        this.mLinkagePlatformApi.replyDevice(100, "0");
        registerConnectStateBroadcast();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport(String str) {
        LogUtil.a(TAG, "onStartSport");
        if (this.mLinkagePlatformApi == null) {
            LogUtil.e(TAG, "onStartSport reverseLinkagePlatformApi == null");
        } else {
            if (Constants.HOME_TAB_DEVICE.equals(str)) {
                return;
            }
            this.mLinkagePlatformApi.start(BaseSportManager.getInstance().getSportType());
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport(String str) {
        LogUtil.a(TAG, "onResumeSport source:", str);
        if (Constants.HOME_TAB_DEVICE.equals(str)) {
            return;
        }
        this.mLinkagePlatformApi.resume();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport(String str) {
        LogUtil.a(TAG, "onPauseSport source:", str);
        if (Constants.HOME_TAB_DEVICE.equals(str)) {
            return;
        }
        this.mLinkagePlatformApi.pause();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStopSport(String str) {
        LogUtil.a(TAG, "onStopSport");
        if (Constants.HOME_TAB_DEVICE.equals(str)) {
            return;
        }
        this.mLinkagePlatformApi.stop();
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        unregisterConnectStateBroadcast();
        LinkagePlatformApi linkagePlatformApi = this.mLinkagePlatformApi;
        if (linkagePlatformApi == null) {
            LogUtil.e(TAG, "destroy mLinkagePlatformApi == null");
        } else {
            linkagePlatformApi.stopLinkage();
        }
    }

    private void registerConnectStateBroadcast() {
        if (this.mConnectStateChangedReceiver == null) {
            this.mConnectStateChangedReceiver = new BroadcastReceiver() { // from class: com.huawei.health.sportservice.manager.ReverseLinkageManager.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    LogUtil.a(ReverseLinkageManager.TAG, "mConnectStateChangedReceiver(): intent is ", intent.getAction());
                    if (context == null) {
                        LogUtil.j(ReverseLinkageManager.TAG, "mConnectStateChangedReceiver context is null.");
                        return;
                    }
                    if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                        LogUtil.j(ReverseLinkageManager.TAG, "mConnectStateChangedReceiver action not Match.");
                        return;
                    }
                    Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    if (!(parcelableExtra instanceof DeviceInfo)) {
                        LogUtil.j(ReverseLinkageManager.TAG, "mConnectStateChangedReceiver(): cast error");
                        return;
                    }
                    DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    ReleaseLogUtil.d(ReverseLinkageManager.TAG, "mConnectStateChangedReceiver(): ", deviceInfo.getDeviceName(), ",state is ", Integer.valueOf(deviceConnectState));
                    if (ReverseLinkageManager.this.mMainDevice != null && ReverseLinkageManager.this.mMainDevice.getDeviceIdentify() != null && !ReverseLinkageManager.this.mMainDevice.getDeviceIdentify().equals(deviceInfo.getDeviceIdentify())) {
                        ReleaseLogUtil.d(ReverseLinkageManager.TAG, " device not match: change device:", deviceInfo.getDeviceName(), " linkage device:", ReverseLinkageManager.this.mMainDevice.getDeviceName());
                    } else if (deviceConnectState == 3) {
                        BaseSportManager.getInstance().stagingAndNotification("DEVICE_CONNECT_STATUS", Integer.valueOf(deviceConnectState));
                    } else if (deviceConnectState == 2) {
                        BaseSportManager.getInstance().stagingAndNotification("DEVICE_CONNECT_STATUS", Integer.valueOf(deviceConnectState));
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            BroadcastManagerUtil.c(BaseApplication.getContext(), this.mConnectStateChangedReceiver, intentFilter, LocalBroadcast.f36595c, null);
        }
    }

    private void unregisterConnectStateBroadcast() {
        if (this.mConnectStateChangedReceiver != null) {
            BaseApplication.getContext().unregisterReceiver(this.mConnectStateChangedReceiver);
            this.mConnectStateChangedReceiver = null;
        }
    }
}
