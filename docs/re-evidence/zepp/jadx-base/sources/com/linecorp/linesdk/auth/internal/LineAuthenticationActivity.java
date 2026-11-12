package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class LineAuthenticationActivity extends Activity {

    @NonNull
    private d a;

    @NonNull
    private c b;

    @NonNull
    public static Intent a(@NonNull Context context, @NonNull LineAuthenticationConfig lineAuthenticationConfig, @NonNull List<String> list) {
        Intent intent = new Intent(context, (Class<?>) LineAuthenticationActivity.class);
        intent.putExtra("authentication_config", lineAuthenticationConfig);
        intent.putExtra("permissions", (String[]) list.toArray(new String[list.size()]));
        return intent;
    }

    @MainThread
    public final void b(@NonNull LineLoginResult lineLoginResult) {
        Intent intent = new Intent();
        intent.putExtra("authentication_result", lineLoginResult);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.a.e) {
            c cVar = this.b;
            if (i != 3 || cVar.h.c) {
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new c.b(cVar, (byte) 0), 1000L);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        d dVar;
        super.onCreate(bundle);
        setContentView(R.layout.linesdk_activity_lineauthentication);
        Intent intent = getIntent();
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) intent.getParcelableExtra("authentication_config");
        if (lineAuthenticationConfig == null) {
            b(new LineLoginResult(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("The requested parameter is illegal.")));
            finish();
            return;
        }
        if (bundle == null || (dVar = (d) bundle.getParcelable("authenticationStatus")) == null) {
            dVar = new d();
        }
        this.a = dVar;
        this.b = new c(this, lineAuthenticationConfig, dVar, intent.getStringArrayExtra("permissions"));
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        a.c cVarA;
        super.onNewIntent(intent);
        if (this.a.e) {
            c cVar = this.b;
            cVar.h.c = true;
            a aVar = cVar.e;
            Uri data = intent.getData();
            if (data == null) {
                cVarA = a.c.a("Illegal redirection from external application.");
            } else {
                String str = aVar.a.d;
                String queryParameter = data.getQueryParameter("state");
                if (str == null || !str.equals(queryParameter)) {
                    cVarA = a.c.a("Illegal parameter value of 'state'.");
                } else {
                    String queryParameter2 = data.getQueryParameter("code");
                    cVarA = !TextUtils.isEmpty(queryParameter2) ? new a.c(queryParameter2, null, null, null) : new a.c(null, data.getQueryParameter("error"), data.getQueryParameter("error_description"), null);
                }
            }
            if (!cVarA.b()) {
                cVar.a.b(new LineLoginResult(cVarA.c() ? LineApiResponseCode.AUTHENTICATION_AGENT_ERROR : LineApiResponseCode.INTERNAL_ERROR, cVarA.d()));
                return;
            }
            c.a aVar2 = new c.a(cVar, (byte) 0);
            String[] strArr = new String[1];
            if (TextUtils.isEmpty(cVarA.a)) {
                throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
            }
            strArr[0] = cVarA.a;
            aVar2.execute(strArr);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authenticationStatus", this.a);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        d dVar = this.a;
        if (dVar.e) {
            return;
        }
        dVar.e = true;
        new c.AsyncTaskC0731c(this.b, (byte) 0).execute(new Void[0]);
    }

    @NonNull
    public static LineLoginResult a(@NonNull Intent intent) {
        LineLoginResult lineLoginResult = (LineLoginResult) intent.getParcelableExtra("authentication_result");
        return lineLoginResult == null ? new LineLoginResult(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("Authentication result is not found.")) : lineLoginResult;
    }
}
