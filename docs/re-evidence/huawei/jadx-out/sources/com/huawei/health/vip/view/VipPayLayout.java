package com.huawei.health.vip.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.tradeservice.R;
import com.huawei.health.vip.VipInnerApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import defpackage.ddv;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class VipPayLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f10409a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10410c;
    private H5ProWebView d;

    public VipPayLayout(Context context, String str, String str2) {
        super(context);
        this.f10410c = context;
        c(str, str2, null);
    }

    public VipPayLayout(Context context, String str, String str2, Map<String, Object> map) {
        super(context);
        this.f10410c = context;
        c(str, str2, map);
    }

    private void c(String str, String str2, Map<String, Object> map) {
        LogUtil.a("VipPayLayout", "VipPayLayout initView");
        if (TextUtils.isEmpty(str2)) {
            str2 = "#/PayPopup";
        } else {
            LogUtil.a("VipPayLayout", "jump into the path: ", str2);
        }
        if (TextUtils.isEmpty(str)) {
            str = "com.huawei.health.h5.vip";
        } else {
            LogUtil.a("VipPayLayout", "start the package: ", str);
        }
        View viewInflate = LayoutInflater.from(this.f10410c).inflate(R.layout.vip_pay_info_layout, this);
        this.f10409a = viewInflate;
        this.d = (H5ProWebView) viewInflate.findViewById(R.id.vip_pay_webview_bar);
        ddv.b().initH5Pro();
        ddv ddvVarB = ddv.b();
        if (map != null) {
            b(str, str2, ddvVarB, map);
        } else {
            H5ProClient.startH5MiniProgram(str, this.d, new H5ProLaunchOption.Builder().addPath(str2).setForceDarkMode(1).addCustomizeJsModule("VipInnerApi", VipInnerApi.class).addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).build());
        }
    }

    private void b(String str, String str2, ddv ddvVar, Map<String, Object> map) {
        String strB = b(map, WebViewHelp.BI_KEY_PULL_FROM);
        String strB2 = b(map, "resourceId");
        String strB3 = b(map, "resourceName");
        String strB4 = b(map, "pullOrder");
        String strB5 = b(map, "workout_id");
        H5ProClient.startH5MiniProgram(str, this.d, new H5ProLaunchOption.Builder().addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, strB).addGlobalBiParam("resourceId", strB2).addGlobalBiParam("resourceName", strB3).addGlobalBiParam("pullOrder", strB4).addGlobalBiParam("itemId", strB5).addGlobalBiParam("algId", b(map, "algId")).addPath(str2).setForceDarkMode(1).addCustomizeJsModule("VipInnerApi", VipInnerApi.class).addCustomizeJsModule("innerapi", ddvVar.getCommonJsModule("innerapi")).build());
    }

    private String b(Map<String, Object> map, String str) {
        if ((map.get(str) instanceof String) || (map.get(str) instanceof Integer)) {
            return (String) map.get(str);
        }
        return "";
    }

    public void e(int i, int i2, Intent intent) {
        if (this.d == null) {
            LogUtil.j("VipPayLayout", "mH5ProWebView is null in notifyActivityResult.");
        } else {
            H5ProBridgeManager.getInstance().notifyActivityResult(this.d.getInstance(), i, i2, intent);
        }
    }
}
