package defpackage;

import android.content.Context;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.JsInteractionCompact;
import com.huawei.pluginachievement.jsmodule.AchieveUtil;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes14.dex */
public class pgt {
    public static void c(Context context, pgn pgnVar) {
        H5proUtil.initH5pro();
        H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.familyspace", new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", JsInteractionCompact.class).addCustomizeJsModule("healthZoneApi", PluginHealthH5InteractionUtil.class).addCustomizeJsModule("AchieveUtil", AchieveUtil.class).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeArg("from", pgnVar.c()).addCustomizeArg("pushType", pgnVar.h()).addCustomizeArg("data", pgnVar.e()).addCustomizeArg(HealthZonePushReceiver.DETAIL_TYPE, pgnVar.b()).addCustomizeArg(HealthZonePushReceiver.IS_HASH_HUID, pgnVar.d()).addCustomizeArg("isFirstLoad", pgnVar.a()).addCustomizeArg("isGuestMode", String.valueOf(LoginInit.getInstance(context).isBrowseMode())).addCustomizeArg("verifyCode", pgnVar.j()).setImmerse().showStatusBar().setNeedSoftInputAdapter().setStatusBarTextBlack(true).setForceDarkMode(1).build());
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(CapabilityStatus.AWA_CAP_CODE_WIFI), "sIsFirstHealth", "1", null);
    }
}
