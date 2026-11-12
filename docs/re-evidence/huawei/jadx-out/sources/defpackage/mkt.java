package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.KeyValDbManager;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mkt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f41831c = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41830b = false;

    public boolean c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has("identify");
    }

    public void e(UniteDevice uniteDevice, cmr cmrVar, JSONObject jSONObject) {
        if (cmrVar == null) {
            return;
        }
        if (eei.b() && eei.a()) {
            cmrVar.a(true);
        } else {
            cmrVar.a(false);
        }
        cmrVar.d(c(uniteDevice, jSONObject));
        if (jSONObject == null || !jSONObject.has("isConnectNewPhone") || !a(uniteDevice)) {
            this.f41831c.countDown();
        }
        if (this.f41831c.getCount() > 0) {
            try {
                this.f41831c.await(60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                LogUtil.e("PreHandshakeCreator", "mCountDownLatch exception");
            }
        }
        cmrVar.b(this.f41830b);
    }

    private boolean c(UniteDevice uniteDevice, JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("isCompatibleDevice")) {
            return false;
        }
        int iE = e(uniteDevice.getDeviceInfo().getDeviceName());
        mkm.d().e();
        return eel.e(a(iE, uniteDevice.getIdentify(), mkm.d().e()));
    }

    private int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        if (upperCase.contains("AW70".toUpperCase(Locale.ENGLISH)) || upperCase.contains("HUAWEI Band 3e-".toUpperCase(Locale.ENGLISH))) {
            return 23;
        }
        return (upperCase.contains("HONOR AW70".toUpperCase(Locale.ENGLISH)) || upperCase.contains("honor Band 4R-".toUpperCase(Locale.ENGLISH))) ? 24 : -1;
    }

    private int a(int i, String str, List<DeviceInfo> list) {
        if (i != -1 || str == null) {
            return i;
        }
        for (DeviceInfo deviceInfo : list) {
            if (str.equals(deviceInfo.getDeviceIdentify())) {
                return deviceInfo.getProductType();
            }
        }
        return i;
    }

    private boolean a(UniteDevice uniteDevice) {
        if (uniteDevice == null || TextUtils.isEmpty(uniteDevice.getIdentify())) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pairing.NotifyActivity"));
            intent.addFlags(268435456);
            intent.addFlags(536870912);
            intent.putExtra("deviceName", uniteDevice.getIdentify());
            BaseApplication.getContext().startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PreHandshakeCreator", "startUserConfirmDialog ActivityNotFoundException.");
            return true;
        }
    }

    public void b(boolean z) {
        this.f41830b = !z;
        if (this.f41831c.getCount() > 0) {
            this.f41831c.countDown();
        }
    }

    public int b(String str) {
        String str2 = "pair_mode_key" + nio.c(str);
        LogUtil.a("PreHandshakeCreator", "getPairMode queryKey: ", str2);
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c(str2);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("PreHandshakeCreator", "getPairMode queryValue is empty.");
            return -1;
        }
        try {
            return Integer.parseInt(strC);
        } catch (NumberFormatException unused) {
            LogUtil.e("PreHandshakeCreator", "getPairMode NumberFormatException.");
            return -1;
        }
    }
}
