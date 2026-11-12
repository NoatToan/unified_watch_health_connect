package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.Utils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class neq {
    private neq() {
    }

    public void a(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("AppMarketFeaturesUtil", "getAppMarketSupportFeatures enter");
        if (iBaseResponseCallback == null) {
            LogUtil.j("AppMarketFeaturesUtil", "getAppMarketSupportFeatures callback is null");
        } else {
            ThreadPoolManager.c().a("AppMarketFeaturesUtil", new Runnable() { // from class: neq.4
                @Override // java.lang.Runnable
                public void run() {
                    neq.this.b(iBaseResponseCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final IBaseResponseCallback iBaseResponseCallback) {
        c(new IBaseResponseCallback() { // from class: neq.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("AppMarketFeaturesUtil", "checkShowAppMarketFeatures showAppMarket errorCode:", Integer.valueOf(i));
                if (i == 1) {
                    iBaseResponseCallback.a(1, null);
                } else {
                    iBaseResponseCallback.a(0, null);
                }
            }
        });
    }

    private void c(IBaseResponseCallback iBaseResponseCallback) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "AppMarketFeaturesUtil");
        if (deviceList.size() == 0) {
            LogUtil.j("AppMarketFeaturesUtil", "fetchAppMarketCapability, deviceInfo is null");
            iBaseResponseCallback.a(0, null);
            return;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "AppMarketFeaturesUtil");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("AppMarketFeaturesUtil", "fetchAppMarketCapability, deviceCapabilityHashMaps is empty");
            iBaseResponseCallback.a(0, null);
            return;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability == null) {
            LogUtil.j("AppMarketFeaturesUtil", "fetchAppMarketCapability, deviceCapability is null");
            iBaseResponseCallback.a(0, null);
            return;
        }
        if (deviceCapability.isSupportMarketFace() && !Utils.o()) {
            LogUtil.a("AppMarketFeaturesUtil", "fetchAppMarketCapability, deviceCapability isSupportMarketFace and not oversea");
            iBaseResponseCallback.a(1, null);
        } else if (b()) {
            iBaseResponseCallback.a(0, null);
        } else if (!c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010)) && deviceCapability.isSupportMarketParams()) {
            LogUtil.a("AppMarketFeaturesUtil", "fetchAppMarketCapability, deviceCapability isSupportMarketParams");
            iBaseResponseCallback.a(1, null);
        } else {
            iBaseResponseCallback.a(0, null);
        }
    }

    private boolean b() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo) || "0".equals(accountInfo)) {
            return true;
        }
        LogUtil.a("AppMarketFeaturesUtil", "isNotLogin, userId is normal value, so has login");
        return false;
    }

    private boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("AppMarketFeaturesUtil", "countryCode is empty");
            return true;
        }
        for (String str2 : BaseApplication.getContext().getResources().getStringArray(R.array.not_support_app_market_code)) {
            if (TextUtils.equals(str2, str)) {
                LogUtil.j("AppMarketFeaturesUtil", "fetchAppMarketCapability, countryCode is not support");
                return true;
            }
        }
        return false;
    }

    public static neq a() {
        return b.e;
    }

    static class b {
        private static final neq e = new neq();
    }
}
