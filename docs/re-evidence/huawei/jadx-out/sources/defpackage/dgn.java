package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dgn extends JumpDeviceStrategy {
    private String e;

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
        LogUtil.a("JumpAppHelpStrategy", "enter jumpAppHelp");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "JumpAppHelpStrategy");
        if (njy.e(deviceList)) {
            deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "JumpAppHelpStrategy");
        }
        if (njy.e(deviceList)) {
            LogUtil.j("JumpAppHelpStrategy", "jumpAppHelp lists is empty");
            a(this.mContext);
            return;
        }
        final DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("JumpAppHelpStrategy", "jumpAppHelp currentDeviceInfo is null");
            a(this.mContext);
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (!lvi.a(deviceInfo.getProductType()).z()) {
            LogUtil.j("JumpAppHelpStrategy", "jumpAppHelp no support Help");
            a(this.mContext);
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceIdentify);
        if (deviceCapabilityA != null && deviceCapabilityA.isSupportHelp()) {
            e(deviceInfo, 4);
            ThreadPoolManager.c().execute(new Runnable() { // from class: dgt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31783a.c(deviceInfo);
                }
            });
        } else {
            LogUtil.j("JumpAppHelpStrategy", "currentDeviceInfo not support appHelp");
            a(this.mContext);
        }
    }

    /* synthetic */ void c(DeviceInfo deviceInfo) {
        String strD = tqu.e().d(deviceInfo);
        this.e = strD;
        LogUtil.d("JumpAppHelpStrategy", "openAppHelpActivity url is:", strD);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: dgr
            @Override // java.lang.Runnable
            public final void run() {
                this.f31780a.d();
            }
        });
    }

    private void a(Context context) {
        if (context == null) {
            LogUtil.j("JumpAppHelpStrategy", "context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), BaseApplication.getAppPackage() + ".MainActivity");
        intent.setFlags(67108864);
        intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
        intent.putExtra("SHORTCUT", "SC_DEVICE");
        iov.d(context, intent);
    }

    private void e(DeviceInfo deviceInfo, int i) {
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
                LogUtil.j("JumpAppHelpStrategy", "the mapValue is null when mapKey is:", str);
            } else {
                linkedHashMap.put(str, value.toString());
            }
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(strValue, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d() {
        if (this.mContext == null) {
            LogUtil.j("JumpAppHelpStrategy", "mContext is null");
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", this.e);
        intent.putExtra(Constants.JUMP_MODE_KEY, 0);
        this.mContext.startActivity(intent);
    }
}
