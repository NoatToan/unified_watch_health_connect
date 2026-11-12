package com.linecorp.linesdk.auth;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.a.c;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class LineLoginApi {
    private LineLoginApi() {
    }

    @NonNull
    public static Intent getLoginIntent(@NonNull Context context, @NonNull String str) {
        return getLoginIntent(context, new LineAuthenticationConfig.Builder(str).build(), (List<String>) Collections.emptyList());
    }

    @NonNull
    public static Intent getLoginIntentWithoutLineAppAuth(@NonNull Context context, @NonNull String str) {
        return getLoginIntent(context, new LineAuthenticationConfig.Builder(str).disableLineAppAuthentication().build(), (List<String>) Collections.emptyList());
    }

    @NonNull
    public static LineLoginResult getLoginResultFromIntent(@Nullable Intent intent) {
        return intent == null ? new LineLoginResult(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("Callback intent is null")) : LineAuthenticationActivity.a(intent);
    }

    @NonNull
    public static Intent getLoginIntent(@NonNull Context context, @NonNull String str, @NonNull List<String> list) {
        return getLoginIntent(context, new LineAuthenticationConfig.Builder(str).build(), list);
    }

    @NonNull
    public static Intent getLoginIntentWithoutLineAppAuth(@NonNull Context context, @NonNull String str, @NonNull List<String> list) {
        return getLoginIntent(context, new LineAuthenticationConfig.Builder(str).disableLineAppAuthentication().build(), list);
    }

    @NonNull
    public static Intent getLoginIntent(@NonNull Context context, @NonNull LineAuthenticationConfig lineAuthenticationConfig, @NonNull List<String> list) {
        if (!lineAuthenticationConfig.isEncryptorPreparationDisabled()) {
            c.a(context);
        }
        return LineAuthenticationActivity.a(context, lineAuthenticationConfig, list);
    }
}
