package com.linecorp.linesdk.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.linecorp.linesdk.BuildConfig;
import com.linecorp.linesdk.a.a;
import com.linecorp.linesdk.a.a.d;
import com.linecorp.linesdk.a.c;
import com.linecorp.linesdk.api.a.b;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes18.dex */
public class LineApiClientBuilder {

    @NonNull
    private final Context a;

    @NonNull
    private final String b;

    @NonNull
    private Uri c;
    private boolean d;
    private boolean e;

    public LineApiClientBuilder(@NonNull Context context, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("channel id is empty");
        }
        this.a = context.getApplicationContext();
        this.b = str;
        this.c = Uri.parse(BuildConfig.AUTH_SERVER_BASE_URI);
    }

    @NonNull
    public LineApiClientBuilder a(@Nullable Uri uri) {
        if (uri == null) {
            uri = Uri.parse(BuildConfig.AUTH_SERVER_BASE_URI);
        }
        this.c = uri;
        return this;
    }

    @NonNull
    public LineApiClient build() {
        if (!this.e) {
            c.a(this.a);
        }
        b bVar = new b(this.b, new com.linecorp.linesdk.a.a.b(this.a, this.c), new d(this.a, this.c), new a(this.a, this.b));
        return this.d ? bVar : (LineApiClient) Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{LineApiClient.class}, new com.linecorp.linesdk.api.a.a.C0729a(bVar, (byte) 0));
    }

    @NonNull
    public LineApiClientBuilder disableEncryptorPreparation() {
        this.e = true;
        return this;
    }

    @NonNull
    public LineApiClientBuilder disableTokenAutoRefresh() {
        this.d = true;
        return this;
    }
}
