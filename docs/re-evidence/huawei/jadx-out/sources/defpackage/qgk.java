package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes15.dex */
public class qgk extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f46186a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile qgk f46187c;

    private qgk() {
        super(BaseApplication.getContext());
    }

    public static qgk a() {
        LogUtil.a("ThirdAuthorizeMgr", "ThirdAuthorizeMgr getInstance.");
        if (f46187c == null) {
            synchronized (f46186a) {
                if (f46187c == null) {
                    f46187c = new qgk();
                }
            }
        }
        return f46187c;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        String str;
        LogUtil.a("ThirdAuthorizeMgr", "receiveFromDevice errorCode ", Integer.valueOf(i));
        if (xiuVar == null || xiuVar.b() == null) {
            LogUtil.j("ThirdAuthorizeMgr", "receiveFromDevice Message is null");
            return;
        }
        try {
            str = new String(xiuVar.b(), "UTF_8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("ThirdAuthorizeMgr", "receiveFromDevice get message data error!");
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ThirdAuthorizeMgr", "receiveFromDevice tempCode is empty ");
        } else {
            LogUtil.a("ThirdAuthorizeMgr", "receiveFromDevice tempCode length == ", Integer.valueOf(str.length()));
            e(str);
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.LOGIN_AUTHORZE_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.huawei.health:accountAuth";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return "UniteDeviceManagement";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        if (connectState == ConnectState.CONNECTED) {
            LogUtil.a("ThirdAuthorizeMgr", "onDeviceConnectionChange connect ", deviceInfo.toString(), " device identify: ", deviceInfo.getDeviceIdentify());
        }
    }

    private void e(String str) {
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.e("ThirdAuthorizeMgr", "startAuthorizePage: context is null!");
            return;
        }
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.putExtra("requestCode", 6012);
        intent.putExtra("requestParam", str);
        intent.setClassName(context, "com.huawei.health.HuaweiLoginActivity");
        context.startActivity(intent);
    }
}
