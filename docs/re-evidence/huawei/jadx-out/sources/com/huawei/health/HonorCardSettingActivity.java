package com.huawei.health;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import defpackage.ird;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HonorCardSettingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Map<String, String>> f6113a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6114c = -1;
    private String d = "";

    static {
        HashMap map = new HashMap();
        f6113a = map;
        HashMap map2 = new HashMap();
        map2.put("serviceId", "118ee454f4ad434f879e02bc3a7a95fd");
        map2.put("cardId", "42a9fa8ffc6d2e4b9fc403318ed74627d10e118cce8d424de3ae9abb61b43d61");
        map2.put("cpId", "8550086500004227052");
        map.put("device", map2);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        LogUtil.a("HonorCardSettingActivity", "onCreate");
        super.onCreate(bundle);
        setContentView(R.layout.honor_card_setting_activity);
        this.f6114c = a();
        this.d = d();
        String strH = h();
        String strE = e();
        String strB = b();
        int iG = g();
        if (TextUtils.isEmpty(strH) || TextUtils.isEmpty(strE) || TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.e("R_HonorCardSettingActivity", "honor card not find");
            finish();
        } else {
            ird irdVar = new ird(this, strH, strE, strB, iG, this.d);
            irdVar.show();
            irdVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dbk
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f31592b.c(dialogInterface);
                }
            });
        }
    }

    public /* synthetic */ void c(DialogInterface dialogInterface) {
        finish();
    }

    private String d() {
        Map<String, String> map = f6113a.get(h());
        String str = "servicecardcenter://com.hihonor.servicecenter/cp?serviceId=" + map.get("serviceId") + "&cardId=" + map.get("cardId") + "&cpId=" + map.get("cpId");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        ReleaseLogUtil.e("R_HonorCardSettingActivity", "invalid url: ", str);
        return "";
    }

    private boolean c() {
        if (AppRouterUtils.b(getIntent()) != null) {
            return true;
        }
        ReleaseLogUtil.e("R_HonorCardSettingActivity", "schemeData is null");
        return false;
    }

    private int a() {
        if (!c()) {
            return -1;
        }
        String queryParameter = AppRouterUtils.b(getIntent()).getQueryParameter("type");
        if (TextUtils.isEmpty(queryParameter) || !TextUtils.isDigitsOnly(queryParameter)) {
            ReleaseLogUtil.e("R_HonorCardSettingActivity", "invalid type: ", queryParameter);
            return -1;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException e) {
            ReleaseLogUtil.e("R_HonorCardSettingActivity", e.getMessage());
            return -1;
        }
    }

    private String h() {
        return "device";
    }

    private String e() {
        if (this.f6114c == 101) {
            return qre.f(R.string.IDS_hw_health_show_health_devices);
        }
        return "";
    }

    private String b() {
        if (this.f6114c == 101) {
            return qre.f(R.string.IDS_honor_card_device_2x2_desc);
        }
        return "";
    }

    private int g() {
        if (this.f6114c != 101) {
            return -1;
        }
        if (ProfileRequestConstants.X_LANGUAGE_VALUE.equals(LanguageUtil.a())) {
            return R.mipmap.device_card_2x2;
        }
        return R.mipmap.device_card_2x2_en;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
