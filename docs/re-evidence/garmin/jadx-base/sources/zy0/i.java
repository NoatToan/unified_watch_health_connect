package zy0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class i implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f207454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f207455b;

    public i(int i14) {
        this.f207455b = Integer.toString(i14);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        if (TextUtils.isEmpty(this.f207455b)) {
            Context context = this.f207454a;
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    this.f207455b = Integer.toString(packageManager.getPackageInfo(packageName, 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        if (!TextUtils.isEmpty(this.f207455b)) {
            builderNewBuilder.header("X-app-ver", this.f207455b);
        }
        builderNewBuilder.header("X-lang", Locale.getDefault().getLanguage());
        return chain.proceed(builderNewBuilder.build());
    }

    public i(Context context) {
        this.f207454a = context;
    }
}
