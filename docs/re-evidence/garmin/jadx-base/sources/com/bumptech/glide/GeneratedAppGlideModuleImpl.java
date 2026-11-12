package com.bumptech.glide;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.imagecache.glide.GlideConfiguration;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;", "Lcom/bumptech/glide/GeneratedAppGlideModule;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlideConfiguration f28440a;

    public GeneratedAppGlideModuleImpl(Context context) {
        context.getClass();
        this.f28440a = new GlideConfiguration();
    }

    @Override // kj.c
    public final void a(Context context, b bVar, Registry registry) {
        bVar.getClass();
        new com.bumptech.glide.integration.okhttp3.a().a(context, bVar, registry);
        this.f28440a.a(context, bVar, registry);
    }

    @Override // kj.a
    public final void b(Context context, c cVar) {
        context.getClass();
        this.f28440a.getClass();
    }
}
