package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.device.activity.music.MusicMainActivity;
import com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dhu extends JumpDeviceStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f31798a = new IBaseResponseCallback() { // from class: dhu.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("JumpMusicListStrategy", "getAuthorizationStatus");
            if (obj instanceof Integer) {
                dhu.this.f31799b = ((Integer) obj).intValue();
                final DeviceInfo deviceInfo = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "JumpMusicListStrategy").get(0);
                final String deviceIdentify = deviceInfo.getDeviceIdentify();
                if (dhu.this.f31799b == 100) {
                    LogUtil.a("JumpMusicListStrategy", "authorizationStatus == AUTHORIZED_STATUS");
                    dhu.this.e(deviceIdentify, MusicMainActivity.class);
                } else {
                    BaseApplication.getActivity().runOnUiThread(new Runnable() { // from class: dhu.2.3
                        @Override // java.lang.Runnable
                        public void run() {
                            if (dhu.this.mContext == null) {
                                LogUtil.j("JumpMusicListStrategy", "mCallback onResponse, mContext is null");
                                return;
                            }
                            LogUtil.a("JumpMusicListStrategy", "Jump To MusicSecondaryMenuActivity");
                            dhu.this.b(deviceInfo, 2);
                            Intent intent = new Intent(dhu.this.mContext, (Class<?>) MusicSecondaryMenuActivity.class);
                            if (!TextUtils.isEmpty(deviceIdentify)) {
                                intent.putExtra("device_id", deviceIdentify);
                            }
                            intent.putExtra("isFromDeepLink", true);
                            intent.putExtra("musicAuthorizationStatus", false);
                            intent.setFlags(67108864);
                            dhu.this.mContext.startActivity(intent);
                        }
                    });
                }
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31799b;

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        return true;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
            LogUtil.d("JumpMusicListStrategy", "jumpMusic adapter is not Enabled");
            b(this.mContext);
        } else {
            if (lug.c() == null) {
                LogUtil.j("JumpMusicListStrategy", "jumpMusicList getDeviceList iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
                new Handler().postDelayed(new Runnable() { // from class: dhr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31795b.a();
                    }
                }, 500L);
                return;
            }
            a();
        }
    }

    private void b(Context context) {
        if (context == null) {
            LogUtil.j("JumpMusicListStrategy", "context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), BaseApplication.getAppPackage() + ".MainActivity");
        intent.setFlags(67108864);
        intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
        intent.putExtra("SHORTCUT", "SC_DEVICE");
        iov.d(context, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a() {
        LogUtil.a("JumpMusicListStrategy", "beginJumpMusicList");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "JumpMusicListStrategy");
        if (njy.e(deviceList) || eel.d(deviceList.get(0).getProductType())) {
            LogUtil.j("JumpMusicListStrategy", "jumpMusic currentDeviceInfo is null");
            e("", MusicMainActivity.class);
            return;
        }
        String deviceIdentify = deviceList.get(0).getDeviceIdentify();
        DeviceCapability deviceCapabilityA = eej.a(deviceIdentify);
        if (deviceCapabilityA == null) {
            LogUtil.j("JumpMusicListStrategy", "deviceCapability is null");
            b(this.mContext);
        } else if (!deviceCapabilityA.isSupportMusicInfoList()) {
            LogUtil.j("JumpMusicListStrategy", "jumpMusicList not support Music");
            b(this.mContext);
        } else {
            c(deviceIdentify);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, Class<?> cls) {
        if (this.mContext == null) {
            LogUtil.j("JumpMusicListStrategy", "mContext is null");
            return;
        }
        Intent intent = new Intent(this.mContext, cls);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("device_id", str);
        }
        intent.setFlags(67108864);
        this.mContext.startActivity(intent);
    }

    private void c(String str) {
        LogUtil.a("JumpMusicListStrategy", "go to jumpMusicListImpl");
        if (lzq.h()) {
            LogUtil.a("JumpMusicListStrategy", "isSupportAuthorizationStatus()");
            lzl.a(BaseApplication.getContext()).e(this.f31798a);
        } else {
            LogUtil.a("JumpMusicListStrategy", "go to musicMainActivity");
            e(str, MusicMainActivity.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceInfo deviceInfo, int i) {
        HashMap map = new HashMap();
        if (deviceInfo != null) {
            map.put("device_name_key", deviceInfo.getDeviceName());
            map.put("product_type", Integer.valueOf(deviceInfo.getProductType()));
        }
        map.put("operation_type", Integer.valueOf(i));
        String strValue = AnalyticsValue.DEVICE_MANAGER_DEEP_LINK_2060094.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                LogUtil.j("JumpMusicListStrategy", "the mapValue is null when mapKey is:", str);
            } else {
                linkedHashMap.put(str, value.toString());
            }
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(strValue, linkedHashMap);
    }
}
