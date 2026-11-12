package com.huawei.hms.hwid.internal.ui.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.hwid.ao;
import com.huawei.hms.hwid.ar;
import com.huawei.hms.hwid.f;
import com.huawei.hms.hwid.q;
import com.huawei.hms.hwid.s;
import com.huawei.hms.hwid.y;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.support.picker.activity.AccountPickerSignInHubActivity;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.HMSPackageManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HwIdSignInHubActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13563a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13564b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HuaweiIdSignInRequest f13565c = null;
    private HuaweiIdAuthResult d = null;
    private s e;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (a(intent)) {
            a(0, "invalid intent");
            return;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        boolean booleanExtra = safeIntent.getBooleanExtra("intent.extra.isfullscreen", false);
        ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "isActivityFullScreen is :" + booleanExtra, true);
        if (booleanExtra) {
            f.a(getWindow());
            getWindow().setFlags(1024, 1024);
        } else {
            f.a(this);
        }
        String action = safeIntent.getAction();
        if (!TextUtils.equals("com.huawei.hms.jos.signIn", action)) {
            String str = "unknow Action:";
            if (action != null) {
                str = "unknow Action:" + action;
            }
            a(0, str);
            return;
        }
        String stringExtra = safeIntent.getStringExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDCPCLIENTINFO);
        try {
            this.f13565c = HuaweiIdSignInRequest.fromJson(safeIntent.getStringExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDSIGNINREQUEST));
        } catch (JSONException unused) {
            this.f13565c = null;
            ar.d("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate: JsonException", true);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            a(0, "Activity started with invalid cp client info");
            return;
        }
        try {
            this.e = s.a(stringExtra);
        } catch (JSONException unused2) {
            this.e = null;
            ar.d("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate: JsonException", true);
        }
        if (this.f13565c == null || this.e == null) {
            a(0, "Activity started with invalid sign in request info");
            return;
        }
        ao.a(this);
        if (bundle != null) {
            restoreInstanceState(bundle);
        } else {
            a();
        }
    }

    private boolean a(Intent intent) {
        if (intent == null) {
            return true;
        }
        try {
            intent.getStringExtra("ANYTHING");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "onActivityResult: requestCode：" + i + " , resultCode：" + i2, true);
        SafeIntent safeIntent = intent != null ? new SafeIntent(intent) : null;
        if (this.f13564b || i != 16587) {
            return;
        }
        if (safeIntent != null && (stringExtra = safeIntent.getStringExtra("HUAWEIID_SIGNIN_RESULT")) != null) {
            try {
                this.d = new HuaweiIdAuthResult().fromJson(stringExtra);
                y.a().a(this.d.getHuaweiId(), this.f13565c.getHuaweiIdAuthParams());
                this.d.getStatus().getStatusCode();
            } catch (JSONException unused) {
                this.d = null;
                ar.d("[HUAWEIIDSDK]HwIdSignInClientHub", "onActivityResult: JsonException", true);
            }
            if (this.f13563a != null && this.e != null) {
                ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "report: api=hwid.signinintentversion=" + this.e.a(), true);
            }
            setResult(i2, safeIntent);
            finish();
            return;
        }
        if (i2 <= 0) {
            i2 = 8;
        }
        a(i2);
    }

    protected void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.f13563a = bundle.getString("HiAnalyticsTransId");
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.f13563a;
        if (str == null || bundle == null) {
            return;
        }
        bundle.putString("HiAnalyticsTransId", str);
    }

    private void a(int i, String str) {
        ar.d("[HUAWEIIDSDK]HwIdSignInClientHub", str, true);
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "onSignInAccountFailed: retCode：" + i, true);
        if (this.f13563a != null && this.e != null) {
            ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "report: api=hwid.signinintentversion=" + this.e.a(), true);
        }
        Status status = new Status(i);
        HuaweiIdAuthResult huaweiIdAuthResult = new HuaweiIdAuthResult();
        huaweiIdAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra("HUAWEIID_SIGNIN_RESULT", huaweiIdAuthResult.toJson());
        } catch (JSONException unused) {
            ar.d("[HUAWEIIDSDK]HwIdSignInClientHub", "convert result to json failed", true);
        }
        setResult(0, intent);
        finish();
    }

    private void a() {
        ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "checkMinVersion start.", true);
        q.a(this, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.hwid.internal.ui.activity.HwIdSignInHubActivity.1
            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i) {
                if (i == 0) {
                    ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "version check ok", true);
                    HwIdSignInHubActivity.this.b();
                } else {
                    ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "version check failed", true);
                    HwIdSignInHubActivity.this.a(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "startSignInActivity", true);
        try {
            startActivityForResult(c(), AccountPickerSignInHubActivity.IDENTIFIER);
        } catch (ActivityNotFoundException e) {
            this.f13564b = true;
            ar.d("[HUAWEIIDSDK]HwIdSignInClientHub", "Launch sign in Intent failed. hms is probably being updated：" + e.getClass().getSimpleName(), true);
            a(17);
        }
    }

    private Intent c() {
        ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent", true);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDCPCLIENTINFO);
        String stringExtra2 = intent.getStringExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDSIGNINREQUEST);
        String stringExtra3 = intent.getStringExtra("exParams");
        ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent. exParams is null " + TextUtils.isEmpty(stringExtra3), true);
        if (!TextUtils.isEmpty(stringExtra3)) {
            try {
                JSONObject jSONObject = new JSONObject(stringExtra2);
                jSONObject.put("exParams", stringExtra3);
                stringExtra2 = jSONObject.toString();
            } catch (JSONException e) {
                ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent Exception " + e.getClass().getSimpleName(), true);
            }
        }
        String action = intent.getAction();
        try {
            s sVarA = s.a(stringExtra);
            ForegroundIntentBuilder kitSdkVersion = new ForegroundIntentBuilder(this).setAction(action).setRequestBody(stringExtra2).setKitSdkVersion(AuthInternalPickerConstant.HMS_SDK_VERSION);
            if (sVarA.b() != null) {
                kitSdkVersion.setSubAppId(sVarA.b());
            }
            Intent intentBuild = kitSdkVersion.build();
            ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "get package name of hms is " + HMSPackageManager.getInstance(this).getHMSPackageName(), true);
            ar.b("[HUAWEIIDSDK]HwIdSignInClientHub", "Current package name is " + getPackageName(), true);
            intentBuild.setPackage(getPackageName());
            return intentBuild;
        } catch (Exception e2) {
            ar.d("[HUAWEIIDSDK]HwIdSignInClientHub", "getSignInIntent failed because:" + e2.getClass().getSimpleName(), true);
            return new Intent();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
