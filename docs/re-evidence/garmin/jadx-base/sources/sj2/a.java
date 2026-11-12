package sj2;

import android.content.Context;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes11.dex */
public interface a {
    zi2.a a();

    OkHttpClient b();

    OkHttpClient c();

    OkHttpClient d();

    void e(Context context, xj2.a aVar);

    void f(Context context, ConnectIQOAuthRequest connectIQOAuthRequest);

    String g();
}
