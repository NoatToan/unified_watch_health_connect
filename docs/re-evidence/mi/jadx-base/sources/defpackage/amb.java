package defpackage;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.io.IOException;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class amb implements Interceptor {
    public final String a() {
        return "_locale=" + c() + "&_language=" + d() + "&_devtype=1&_ver=" + b() + "&_model=" + f() + "&_osver=" + g() + "&_pairos=Android&_buildId=" + e();
    }

    public final long b() {
        try {
            Application app = AppUtil.getApp();
            PackageInfo packageInfo = app.getPackageManager().getPackageInfo(app.getPackageName(), 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (Exception e) {
            e = e;
            e.printStackTrace();
            return -1L;
        } catch (NoSuchMethodError e2) {
            e = e2;
            e.printStackTrace();
            return -1L;
        }
    }

    public final String c() {
        return Locale.getDefault().getCountry();
    }

    public final String d() {
        return Locale.getDefault().getLanguage();
    }

    public final String e() {
        return Build.ID;
    }

    public final String f() {
        return Build.MODEL;
    }

    public final String g() {
        return Build.VERSION.RELEASE;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        String strHost = request.url().host();
        String host = Uri.parse("https://watch-appstore.iot.mi.com/").getHost();
        if (!strHost.equals(host)) {
            return chain.proceed(request);
        }
        Logger.d("HeaderInterceptor", "intercept: " + strHost + "; " + host);
        return chain.proceed(request.newBuilder().header("watch-appstore-common", a()).method(request.method(), request.body()).build());
    }
}
