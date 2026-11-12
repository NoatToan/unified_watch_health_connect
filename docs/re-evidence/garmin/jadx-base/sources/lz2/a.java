package lz2;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f115409a;

    public a() {
        this(new OkHttpClient.Builder().readTimeout(0L, TimeUnit.SECONDS).retryOnConnectionFailure(true).build());
    }

    public a(OkHttpClient okHttpClient) {
        this.f115409a = okHttpClient.newBuilder().protocols(Collections.singletonList(Protocol.HTTP_1_1)).build();
    }
}
