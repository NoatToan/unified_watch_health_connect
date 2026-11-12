package com.garmin.net.omtanalytics.impl.upload;

import c83.b0;
import java.util.concurrent.TimeUnit;
import kg.f;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/net/omtanalytics/impl/upload/c;", "", "", "baseUrl", "clientName", "clientVersion", "clientGuid", "", "callTimeoutMillis", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f52529a;

    public c(String str, String str2, String str3, String str4, long j8) {
        f.p(str, str2, str3, str4);
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().addInterceptor(new e(str2, str3, str4)).callTimeout(j8, TimeUnit.MILLISECONDS).build();
        b0.b bVar = new b0.b();
        bVar.b(str);
        bVar.d(okHttpClientBuild);
        bVar.a(g83.a.c());
        Object objB = bVar.c().b(d.class);
        objB.getClass();
        this.f52529a = (d) objB;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, long j8, int i14, j jVar) {
        this(str, str2, str3, str4, (i14 & 16) != 0 ? 60000L : j8);
    }
}
