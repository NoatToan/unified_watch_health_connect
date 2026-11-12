package com.garmin.net.omtanalytics.impl.upload;

import d53.w;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/net/omtanalytics/impl/upload/e;", "Lokhttp3/Interceptor;", "", "clientName", "clientVersion", "clientGuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52532c;

    public e(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f52530a = str;
        this.f52531b = str3;
        int iH = w.H(str2, "-", 0, false, 6);
        this.f52532c = iH > 0 ? str2.substring(0, iH) : str2;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderHeader = chain.request().newBuilder().header("Garmin-Client-Name", this.f52530a).header("Garmin-Client-Version", this.f52532c);
        jc2.e.f98177a.getClass();
        return chain.proceed(builderHeader.header("Garmin-Client-Platform", (String) jc2.e.f98178b.getValue()).header("Garmin-Client-Platform-Version", jc2.e.a()).header("Garmin-Client-Guid", this.f52531b).build());
    }
}
