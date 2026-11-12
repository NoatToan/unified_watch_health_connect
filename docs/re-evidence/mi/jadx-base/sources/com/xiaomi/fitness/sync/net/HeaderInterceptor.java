package com.xiaomi.fitness.sync.net;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0002R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sync/net/HeaderInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "commonHeaderParameter", "", "appVersionCode", "", "getAppVersionCode", "()J", "countryCode", "getCountryCode", "()Ljava/lang/String;", "language", "getLanguage", "systemModel", "getSystemModel", CommonConstants.KEY_SYSTEM_VERSION, "getSystemVersion", "systemBuildId", "getSystemBuildId", "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeaderInterceptor implements Interceptor {

    @NotNull
    private static final String TAG = "HeaderInterceptor";

    private final String commonHeaderParameter() {
        return "_locale=" + getCountryCode() + "&_language=" + getLanguage() + "&_devtype=1&_ver=" + getAppVersionCode() + "&_model=" + getSystemModel() + "&_osver=" + getSystemVersion() + "&_pairos=Android&_buildId=" + getSystemBuildId();
    }

    private final long getAppVersionCode() {
        try {
            PackageInfo packageInfo = ApplicationExtKt.getApplication().getPackageManager().getPackageInfo(ApplicationExtKt.getApplication().getPackageName(), 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return -1L;
        }
    }

    private final String getCountryCode() {
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return country;
    }

    private final String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    private final String getSystemBuildId() {
        String ID = Build.ID;
        Intrinsics.checkNotNullExpressionValue(ID, "ID");
        return ID;
    }

    private final String getSystemModel() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    private final String getSystemVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(chain.request());
    }
}
