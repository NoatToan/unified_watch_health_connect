package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.devicepair.api.PermissionsApi;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homewear21.home.devicepairjs.PairPermissionType;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = PermissionsApi.class)
@Singleton
public class tov implements PermissionsApi {
    @Override // com.huawei.devicepair.api.PermissionsApi
    public Map<String, Boolean> requestPermissionsForPair(String str) {
        DeviceInfo deviceInfoA;
        HashMap map = new HashMap(16);
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "deviceMac is empty");
            deviceInfoA = tfn.a().j();
        } else {
            deviceInfoA = tfn.a().a(str);
        }
        if (deviceInfoA == null) {
            ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "deviceInfo is null");
            return map;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(str);
        a(deviceCapabilityE, map);
        if (tqp.d(deviceInfoA) || tqp.h(deviceInfoA)) {
            ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission sms");
            map.put(PairPermissionType.SMS.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), PairPermissionType.SMS.value())));
        } else if (deviceCapabilityE != null && deviceCapabilityE.isSupportSendSosSms()) {
            ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission sms");
            map.put(PairPermissionType.SMS.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.SEND_SMS"})));
        }
        if (eey.d(deviceInfoA, 171)) {
            ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission calendar");
            map.put(PairPermissionType.CALENDAR.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), PairPermissionType.CALENDAR.value())));
        }
        LogUtil.a("PermissionsApiImpl", "requestPermissionsForPair permissionMap:", map.toString());
        return map;
    }

    private void a(DeviceCapability deviceCapability, Map<String, Boolean> map) {
        if (deviceCapability == null) {
            ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission deviceCapability is null");
            return;
        }
        if (deviceCapability.isMessageAlert() && rcv.a(BaseApplication.getContext()).j()) {
            ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission outgoing");
            map.put(PairPermissionType.READ_CALL_LOG.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.PROCESS_OUTGOING_CALLS"})));
        }
        if (tqp.j() && deviceCapability.isSupportCallingOperationType()) {
            ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission answer and phone");
            map.put(PairPermissionType.CALL_PHONE.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), PairPermissionType.CALL_PHONE.value())));
        }
        if (deviceCapability.isMessageAlert() && tqp.j()) {
            ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission call log");
            map.put(PairPermissionType.READ_CALL_LOG.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.READ_CALL_LOG"})));
        }
        if (deviceCapability.isMessageAlert() || deviceCapability.isContacts() || deviceCapability.isSupportSosTransmission()) {
            ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission contacts");
            map.put(PairPermissionType.READ_CONTACTS.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), PairPermissionType.READ_CONTACTS.value())));
        }
        if (deviceCapability.isMessageAlert() || deviceCapability.isSupportCallingOperationType() || deviceCapability.isSupportEsim()) {
            ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission phone state");
            map.put(PairPermissionType.READ_PHONE_STATE.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), PairPermissionType.READ_PHONE_STATE.value())));
        }
        if (deviceCapability.isWeatherPush()) {
            ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "addDeviceCapabilityPermission location");
            map.put(PairPermissionType.LOCATION.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), PairPermissionType.LOCATION.value())));
        }
    }

    @Override // com.huawei.devicepair.api.PermissionsApi
    public void requestPermissionsGrantStatus(List<String> list, final String str, final Context context, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "requestPermissionsGrantStatus callback is null");
            return;
        }
        if (!(context instanceof Activity)) {
            iBaseResponseCallback.a(-1, "context is error");
            ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "requestPermissionsGrantStatus context is error");
            return;
        }
        if (njy.e(list)) {
            iBaseResponseCallback.a(-1, "param is error");
            ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "requestPermissionsGrantStatus param is error");
            return;
        }
        final HashMap map = new HashMap(16);
        for (String str2 : list) {
            for (PairPermissionType pairPermissionType : PairPermissionType.values()) {
                if (pairPermissionType.key().equals(str2)) {
                    map.put(str2, pairPermissionType.value());
                    break;
                }
            }
        }
        if (map.isEmpty()) {
            iBaseResponseCallback.a(-1, "requestPermissionMap is error");
            ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "requestPermissionsGrantStatus requestPermissionMap is error");
        } else {
            ThreadPoolManager.c().a("PermissionsApiImpl", new Runnable() { // from class: tov.3
                @Override // java.lang.Runnable
                public void run() {
                    tov.this.a(iBaseResponseCallback, context, map, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IBaseResponseCallback iBaseResponseCallback, Context context, Map<String, String[]> map, String str) {
        final HashMap map2 = new HashMap(map.size());
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            final String key = entry.getKey();
            String[] value = entry.getValue();
            if (PermissionUtil.PermissionResult.FOREVER_DENIED == PermissionUtil.d(context, value)) {
                LogUtil.a("PermissionsApiImpl", "requestPermission forever onDenied:", key);
                map2.put(key, -2);
            } else {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                PermissionUtil.a((Activity) context, value, new CustomPermissionAction(BaseApplication.getContext()) { // from class: tov.5
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        LogUtil.a("PermissionsApiImpl", "requestPermission onGranted:", key);
                        map2.put(key, 0);
                        countDownLatch.countDown();
                    }

                    @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onDenied(String str2) {
                        LogUtil.a("PermissionsApiImpl", "requestPermission onDenied:", key);
                        map2.put(key, -1);
                        countDownLatch.countDown();
                    }

                    @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                        LogUtil.a("PermissionsApiImpl", "requestPermission onForeverDenied:", key);
                        map2.put(key, -2);
                        countDownLatch.countDown();
                    }
                });
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    ReleaseLogUtil.a("DEVMGR_PermissionsApiImpl", "requestPermission InterruptedException");
                }
            }
        }
        ReleaseLogUtil.d("DEVMGR_PermissionsApiImpl", "requestPermission requestResultMap:", Integer.valueOf(map2.size()));
        iBaseResponseCallback.a(0, map2);
    }

    @Override // com.huawei.devicepair.api.PermissionsApi
    public void permissionGrantRegisterContactObserver(String str) {
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(str);
        if (deviceCapabilityE == null || !deviceCapabilityE.isSupportSendSosSms()) {
            return;
        }
        LogUtil.a("PermissionsApiImpl", "permissionGrantRegisterContactObserver");
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).registerContactChangeObserver();
        DeviceCommand deviceCommandB = mxv.b(mxv.d(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getEmergencyInfo()));
        if (deviceCommandB != null) {
            lvb.e().c(deviceCommandB);
        }
    }

    @Override // com.huawei.devicepair.api.PermissionsApi
    public Map<String, Boolean> requestPermissionsForSoS(String str) {
        DeviceInfo deviceInfoA;
        ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "enter requestPermissionsForSoS ");
        HashMap map = new HashMap(16);
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "requestPermissionsForSoS deviceMac is empty");
            deviceInfoA = tfn.a().j();
        } else {
            deviceInfoA = tfn.a().a(str);
        }
        if (deviceInfoA == null) {
            ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "requestPermissionsForSoS deviceInfo is null");
            return null;
        }
        boolean zD = eey.d(deviceInfoA, OldToNewMotionPath.SPORT_TYPE_PINGPONG);
        ReleaseLogUtil.e("DEVMGR_PermissionsApiImpl", "requestPermissionsForSoS isSupportFallDetection ", Boolean.valueOf(zD));
        if (!zD) {
            return null;
        }
        map.put(PairPermissionType.SMS.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.SEND_SMS"})));
        map.put(PairPermissionType.READ_CONTACTS.key(), Boolean.valueOf(PermissionUtil.b(BaseApplication.getContext(), PairPermissionType.READ_CONTACTS.value())));
        return map;
    }
}
