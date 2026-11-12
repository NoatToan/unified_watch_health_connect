package com.mi.fitness.lpamanagement.ui.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.gv5;
import defpackage.iqc;
import defpackage.kad;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J)\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0018\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/webview/LpaJavscriptImpl;", "Lkad;", "", "goCTApp", "()V", "", "ctPackageName", "goMarket", "(Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "", "isIntentResolvable", "(Landroid/content/Intent;)Z", "individual", "startCUEsim", "(Z)V", "startScan", "url", "", "paramsArg", "startUnicomEsim", "(Ljava/lang/String;Ljava/util/Map;)V", "msg", "esimUserAction", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/mi/fitness/lpamanagement/ui/webview/LpaScanHelper;", "lpaScanHelper", "Lcom/mi/fitness/lpamanagement/ui/webview/LpaScanHelper;", "getLpaScanHelper", "()Lcom/mi/fitness/lpamanagement/ui/webview/LpaScanHelper;", "esimUrl", "Ljava/lang/String;", "getEsimUrl", "()Ljava/lang/String;", "Liqc;", "healthWebViewPage", "<init>", "(Landroid/content/Context;Liqc;Lcom/mi/fitness/lpamanagement/ui/webview/LpaScanHelper;)V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LpaJavscriptImpl extends kad {

    @NotNull
    private final Context context;

    @NotNull
    private final String esimUrl;

    @NotNull
    private final LpaScanHelper lpaScanHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LpaJavscriptImpl(@NotNull Context context, @NotNull iqc healthWebViewPage, @NotNull LpaScanHelper lpaScanHelper) {
        super(context, healthWebViewPage);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(healthWebViewPage, "healthWebViewPage");
        Intrinsics.checkNotNullParameter(lpaScanHelper, "lpaScanHelper");
        this.context = context;
        this.lpaScanHelper = lpaScanHelper;
        this.esimUrl = "https://img.client.10010.com/esimzq/index.html";
    }

    private final void goCTApp() {
        Intent launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage("com.ct.client");
        if (launchIntentForPackage == null) {
            goMarket("com.ct.client");
        } else {
            this.context.startActivity(launchIntentForPackage);
        }
    }

    private final void goMarket(String ctPackageName) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + ctPackageName));
        intent.addFlags(268435456);
        this.context.startActivity(intent);
    }

    private final boolean isIntentResolvable(Intent intent) {
        return intent.resolveActivity(this.context.getPackageManager()) != null;
    }

    private final void startCUEsim(boolean individual) {
        String cuMachinType;
        Product product;
        Product.ESIM esim;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null || (esim = product.getEsim()) == null || (cuMachinType = esim.getCuMachinType()) == null) {
            cuMachinType = "104";
        }
        Logger.i("LpaJavscriptImpl", "startCUEsim:machineType:" + cuMachinType);
        int i = !individual ? 1 : 0;
        HashMap map = new HashMap();
        map.put("oemName", "小米手表");
        map.put("packageName", "com.mi.health");
        map.put(TSMAuthContants.PARAM_SERVICE_TYPE, String.valueOf(i));
        map.put("terminalType", "14");
        map.put("machineType", cuMachinType);
        startUnicomEsim(this.esimUrl, map);
    }

    private final void startScan() {
        this.lpaScanHelper.goScan();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JavascriptInterface
    public final void esimUserAction(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i("LpaJavascriptImpl", "esimUserAction:msg:" + msg);
        switch (msg.hashCode()) {
            case -2056739062:
                if (msg.equals("CU.Dual.Activate.Android")) {
                    startCUEsim(false);
                    break;
                }
                break;
            case -1189472408:
                if (msg.equals("CT.Dual.Activate")) {
                    goCTApp();
                    break;
                }
                break;
            case -805693644:
                if (msg.equals("CU.Dual.Scan.Hall")) {
                    startScan();
                    break;
                }
                break;
            case -587468513:
                if (msg.equals("CU.Ind.Scan.Hall")) {
                    startScan();
                    break;
                }
                break;
            case 237018903:
                if (msg.equals("CM.Ind.Scan.Hall")) {
                    startScan();
                    break;
                }
                break;
            case 767357286:
                if (msg.equals("CM.Ind.Activate")) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("com.greenpoint://android.mc10086.activity?url=https://h.app.coc.10086.cn/cmcc-app/terminal/terminalDetails.html?v=true&n=13"));
                    if (!isIntentResolvable(intent)) {
                        goMarket("com.greenpoint.android.mc10086.activity");
                    } else {
                        this.context.startActivity(intent);
                    }
                    break;
                }
                break;
            case 1074060991:
                if (msg.equals("CU.Ind.Activate.Android")) {
                    startCUEsim(true);
                    break;
                }
                break;
            case 1142566817:
                if (msg.equals("CM.Dual.Activate")) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("heduohao://action=GoToApplyEsim#xiaomi"));
                    if (!isIntentResolvable(intent2)) {
                        goMarket("com.cmic.heduohao");
                    } else {
                        this.context.startActivity(intent2);
                    }
                    break;
                }
                break;
            case 1523414207:
                if (msg.equals("CT.Ind.Activate")) {
                    goCTApp();
                    break;
                }
                break;
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getEsimUrl() {
        return this.esimUrl;
    }

    @NotNull
    public final LpaScanHelper getLpaScanHelper() {
        return this.lpaScanHelper;
    }

    public final void startUnicomEsim(@NotNull String url, @NotNull Map<String, String> paramsArg) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(paramsArg, "paramsArg");
        String str = url;
        for (Map.Entry<String, String> entry : paramsArg.entrySet()) {
            if (!StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) entry.getKey(), false, 2, (Object) null)) {
                str = StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "?", false, 2, (Object) null) ? url + gv5.CONNECT_STR + ((Object) entry.getKey()) + "=" + ((Object) entry.getValue()) : url + "?" + ((Object) entry.getKey()) + "=" + ((Object) entry.getValue());
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openType", "url");
            jSONObject.put("title", "Esim专区");
            jSONObject.put("openUrl", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("chinaunicom://?open=" + jSONObject));
        if (isIntentResolvable(intent)) {
            this.context.startActivity(intent);
        } else {
            goMarket("com.sinovatech.unicom.ui");
        }
    }
}
