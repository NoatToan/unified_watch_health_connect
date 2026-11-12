package com.garmin.android.apps.connectmobile.imagecache.glide;

import android.content.Context;
import com.bumptech.glide.Registry;
import com.bumptech.glide.b;
import com.bumptech.glide.c;
import g22.m;
import kj.a;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/imagecache/glide/GlideConfiguration;", "Lkj/a;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GlideConfiguration extends a {
    @Override // kj.c
    public final void a(Context context, b bVar, Registry registry) {
        bVar.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        m.a(builder);
        OkHttpClient okHttpClientBuild = builder.build();
        okHttpClientBuild.getClass();
        registry.j(new com.bumptech.glide.integration.okhttp3.b.a(okHttpClientBuild));
    }

    @Override // kj.a
    public final void b(Context context, c cVar) {
        throw null;
    }
}
