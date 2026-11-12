package defpackage;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.connectivity.ConnectionBuilder;

/* JADX INFO: loaded from: classes20.dex */
public final class zrr implements ConnectionBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zrr f54554a = new zrr();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f54555b = (int) TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f54556c = (int) TimeUnit.SECONDS.toMillis(10);

    private zrr() {
    }

    @Override // net.openid.appauth.connectivity.ConnectionBuilder
    public HttpURLConnection openConnection(Uri uri) throws IOException {
        zre.c(uri, "url must not be null");
        zre.e(ProxyConfig.MATCH_HTTPS.equals(uri.getScheme()), "only https connections are permitted");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(f54555b);
        httpURLConnection.setReadTimeout(f54556c);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
