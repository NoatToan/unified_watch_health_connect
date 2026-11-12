package com.huawei.wearengine;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.yis;
import defpackage.ylx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class ClientHubActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        yis.a("ClientHubActivity", "ClientHubActivity onCreate");
        super.onCreate(bundle);
        ylx.d(this);
        Intent intent = getIntent();
        if (!d(intent)) {
            c(5, "invalid intent");
            return;
        }
        String stringExtra = intent.getStringExtra("target_json");
        String stringExtra2 = intent.getStringExtra("start_request_json");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            c(5, "ClientHubActivity start authNameJson is empty or requestDataJsonString is empty");
        } else {
            a(stringExtra, stringExtra2);
        }
    }

    private void c(int i, String str) {
        yis.d("ClientHubActivity", "errorReturn:" + str + ", resultCode:" + i);
        setResult(i);
        finish();
    }

    private boolean d(Intent intent) {
        if (intent != null) {
            return true;
        }
        yis.d("ClientHubActivity", "checkIntent intent is null");
        return false;
    }

    private void a(String str, String str2) {
        yis.a("ClientHubActivity", "startJumpActivity");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("target_package_name");
            String string2 = jSONObject.getString("target_activity_name");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                c(12, "targetPackageName or targetActivityName is empty");
                return;
            }
            Intent intent = new Intent();
            intent.setPackage(string);
            intent.setClassName(string, string2);
            intent.putExtra("start_request_json", str2);
            Intent intentE = ylx.e(intent);
            if (intentE == null) {
                c(12, "createExplicitActivityIntent, intent is null.");
                return;
            }
            try {
                startActivityForResult(intentE, 19900);
            } catch (ActivityNotFoundException unused) {
                c(12, "startJumpActivity not find JumpActivity");
            }
        } catch (JSONException unused2) {
            c(12, "startJumpActivity JSONException");
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        yis.a("ClientHubActivity", "onActivityResult requestCode:" + i + ", resultCode:" + i2);
        if (i == 19900) {
            yis.a("ClientHubActivity", "onActivityResult finish");
            setResult(i2);
            finish();
        }
    }
}
