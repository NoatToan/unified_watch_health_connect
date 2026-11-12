package net.openid.appauth;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.constant.VastAttribute;
import defpackage.zqw;
import defpackage.zqx;
import net.openid.appauth.internal.Logger;
import org.json.JSONException;

/* JADX INFO: loaded from: classes46.dex */
public class AuthorizationManagementActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingIntent f43031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43032b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f43033c;
    private AuthorizationManagementRequest d;
    private PendingIntent e;

    public static Intent d(Context context, Uri uri) {
        Intent intentC = c(context);
        intentC.setData(uri);
        intentC.addFlags(603979776);
        return intentC;
    }

    private static Intent c(Context context) {
        return new Intent(context, (Class<?>) AuthorizationManagementActivity.class);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (bundle == null) {
                b(getIntent().getExtras());
            } else {
                b(bundle);
            }
        } catch (RuntimeException e) {
            Log.e("AuthorizationManagementActivity", "onCreate->RuntimeException: " + e.toString());
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Intent intent;
        super.onResume();
        if (this.f43032b || (intent = this.f43033c) == null) {
            return;
        }
        startActivity(intent);
        this.f43032b = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012 A[Catch: RuntimeException -> 0x0019, TryCatch #0 {RuntimeException -> 0x0019, blocks: (B:4:0x0008, B:6:0x000e, B:8:0x0015, B:7:0x0012), top: B:13:0x0008 }] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent != null) {
            try {
                if (intent.getData() != null) {
                    b();
                } else {
                    e();
                }
            } catch (RuntimeException e) {
                Log.e("AuthorizationManagementActivity", "onResume->RuntimeException: " + e.toString());
                finish();
                return;
            }
        } else {
            e();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.f43032b);
        bundle.putParcelable("authIntent", this.f43033c);
        AuthorizationManagementRequest authorizationManagementRequest = this.d;
        bundle.putString("authRequest", authorizationManagementRequest == null ? null : authorizationManagementRequest.jsonSerializeString());
        bundle.putString("authRequestType", zqx.e(this.d));
        bundle.putParcelable("completeIntent", this.f43031a);
        bundle.putParcelable("cancelIntent", this.e);
    }

    private void b() {
        Uri data = getIntent().getData();
        Intent intentB = b(data);
        if (intentB == null) {
            Logger.a("Failed to extract OAuth2 response from redirect", new Object[0]);
        } else {
            intentB.setData(data);
            a(this.f43031a, intentB, -1);
        }
    }

    private void e() {
        Logger.d("Authorization flow canceled by user", new Object[0]);
        a(this.e, zqw.e(zqw.b.j, (Throwable) null).c(), 0);
    }

    private void b(Bundle bundle) {
        if (bundle == null) {
            Logger.c("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f43033c = (Intent) bundle.getParcelable("authIntent");
        this.f43032b = bundle.getBoolean("authStarted", false);
        this.f43031a = (PendingIntent) bundle.getParcelable("completeIntent");
        this.e = (PendingIntent) bundle.getParcelable("cancelIntent");
        try {
            String string = bundle.getString("authRequest", null);
            this.d = string != null ? zqx.b(string, bundle.getString("authRequestType", null)) : null;
        } catch (JSONException unused) {
            a(this.e, zqw.a.f54510b.c(), 0);
        }
    }

    private void a(PendingIntent pendingIntent, Intent intent, int i) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send(this, 0, intent);
                return;
            } catch (PendingIntent.CanceledException e) {
                Logger.a("Failed to send cancel intent", e);
                return;
            }
        }
        setResult(i, intent);
    }

    private Intent b(Uri uri) {
        if (uri.getQueryParameterNames().contains(VastAttribute.ERROR)) {
            return zqw.d(uri).c();
        }
        AuthorizationManagementResponse authorizationManagementResponseA = zqx.a(this.d, uri);
        if ((this.d.getState() == null && authorizationManagementResponseA.getState() != null) || (this.d.getState() != null && !this.d.getState().equals(authorizationManagementResponseA.getState()))) {
            Logger.c("State returned in authorization response (%s) does not match state from request (%s) - discarding response", authorizationManagementResponseA.getState(), this.d.getState());
            return zqw.a.i.c();
        }
        return authorizationManagementResponseA.toIntent();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
