package com.xiaomi.fitness;

import java.net.HttpURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"TAG", "", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "compatSSLSocketFactory", "", "Ljava/net/HttpURLConnection;", "share_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TLSCompatSocketFactoryKt {

    @NotNull
    private static final String TAG = "TLSCompatSocketFactory";

    public static final void compatSSLSocketFactory(@NotNull HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
    }

    @NotNull
    public static final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory socketFactory = Platform.INSTANCE.get().newSSLContext().getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
        return new TLSCompatSocketFactory(socketFactory);
    }
}
