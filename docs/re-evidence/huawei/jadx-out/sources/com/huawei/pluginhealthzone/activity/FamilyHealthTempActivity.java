package com.huawei.pluginhealthzone.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginhealthzone.R;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import defpackage.fua;
import defpackage.lmf;
import defpackage.lmm;
import defpackage.pgn;
import defpackage.pgt;
import defpackage.qre;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes3.dex */
public class FamilyHealthTempActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f22338c;
    private String d;
    private String e = null;
    private String f = null;
    private String h;
    private String j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
        getWindow().setBackgroundDrawableResource(com.huawei.ui.commonui.R.color.common_white_0alpha);
        a(getIntent());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtil.a("FamilyHealthTempActivity", "onNewIntent");
        setIntent(intent);
        a(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("FamilyHealthTempActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        Intent intent = getIntent();
        d(intent);
        if (TextUtils.isEmpty(this.j)) {
            LogUtil.j("FamilyHealthTempActivity", "verifyCode is empty");
        }
        c(intent);
        if (fua.l()) {
            a();
        }
        finish();
    }

    private void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        this.e = extras.getString("pushId");
        String string = extras.getString("serviceId");
        this.f = string;
        LogUtil.a("FamilyHealthTempActivity", "mPushId = ", this.e, "mServiceId =", string);
    }

    private void c(Intent intent) {
        if (intent == null) {
            return;
        }
        if (intent.hasExtra("pushType")) {
            String stringExtra = intent.getStringExtra("pushType");
            this.h = stringExtra;
            LogUtil.a("FamilyHealthTempActivity", "mPushType = ", stringExtra);
        }
        if (intent.hasExtra(HealthZonePushReceiver.MEMBER_HUID)) {
            String stringExtra2 = intent.getStringExtra(HealthZonePushReceiver.MEMBER_HUID);
            this.f22337b = stringExtra2;
            LogUtil.a("FamilyHealthTempActivity", "memberhuid = ", stringExtra2);
        }
        if (intent.hasExtra(HealthZonePushReceiver.DETAIL_TYPE)) {
            this.f22337b = intent.getStringExtra(HealthZonePushReceiver.DETAIL_TYPE);
            LogUtil.a("FamilyHealthTempActivity", "detailType = ", this.f22338c);
        }
        if (intent.hasExtra(HealthZonePushReceiver.IS_HASH_HUID)) {
            String stringExtra3 = intent.getStringExtra(HealthZonePushReceiver.IS_HASH_HUID);
            this.f22336a = stringExtra3;
            LogUtil.a("FamilyHealthTempActivity", "isHashHuid = ", stringExtra3);
        }
    }

    private void d(Intent intent) {
        if (intent == null) {
            return;
        }
        Uri uriB = AppRouterUtils.b(intent);
        LogUtil.a("FamilyHealthTempActivity", "uri: ", uriB);
        if (uriB != null) {
            String queryParameter = uriB.getQueryParameter(HealthZonePushReceiver.MEMBER_HUID);
            this.f22337b = queryParameter;
            LogUtil.a("FamilyHealthTempActivity", "uri get memberhuid = ", queryParameter);
            String queryParameter2 = uriB.getQueryParameter("pushType");
            this.h = queryParameter2;
            LogUtil.a("FamilyHealthTempActivity", "uri get pushType = ", queryParameter2);
            String queryParameter3 = uriB.getQueryParameter(HealthZonePushReceiver.DETAIL_TYPE);
            this.f22338c = queryParameter3;
            LogUtil.a("FamilyHealthTempActivity", "uri get detailType = ", queryParameter3);
            String queryParameter4 = uriB.getQueryParameter(HealthZonePushReceiver.IS_HASH_HUID);
            this.f22336a = queryParameter4;
            LogUtil.a("FamilyHealthTempActivity", "uri get isHashHuid = ", queryParameter4);
            String queryParameter5 = uriB.getQueryParameter("from");
            this.d = queryParameter5;
            LogUtil.a("FamilyHealthTempActivity", "uri get from = ", queryParameter5);
            String[] strArrSplit = uriB.toString().split("verificationcode=");
            if (strArrSplit.length >= 2) {
                this.j = strArrSplit[1];
                return;
            }
        }
        if (intent.hasExtra("verifyCode")) {
            this.j = intent.getStringExtra("verifyCode");
        }
    }

    private void a() {
        LogUtil.a("FamilyHealthTempActivity", "startH5 enter");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(CapabilityStatus.AWA_CAP_CODE_WIFI), "sIsFirstHealth");
        pgn pgnVar = new pgn();
        if ("1".equals(strE)) {
            pgnVar.a("false");
        } else {
            pgnVar.a("true");
        }
        if (!TextUtils.isEmpty(this.j)) {
            pgnVar.c("2");
            pgnVar.f(this.j);
        } else if (!TextUtils.isEmpty(this.h)) {
            e(this.h, pgnVar, this.f22337b, this.f22338c, this.f22336a);
        } else if (!TextUtils.isEmpty(this.d)) {
            pgnVar.c(this.d);
            pgnVar.d(this.f22337b);
        } else {
            pgnVar.c("0");
        }
        pgt.c(this, pgnVar);
    }

    private void e(String str, pgn pgnVar, String str2, String str3, String str4) {
        if (str.equals("4")) {
            pgnVar.c("4");
        } else {
            pgnVar.c("1");
            lmf.d().d(new lmm.e().c(1).b(qre.f(R.string.IDS_hwh_family_health_zone)).a((String) null).d(this.e).e(this.f).c((String) null).e());
        }
        pgnVar.h(str);
        pgnVar.d(str2);
        pgnVar.e(str3);
        pgnVar.b(str4);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
