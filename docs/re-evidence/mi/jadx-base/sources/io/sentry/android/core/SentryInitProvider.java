package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import defpackage.cul;
import defpackage.kvl;
import io.sentry.SentryLevel;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class SentryInitProvider extends z0 {
    @Override // android.content.ContentProvider
    public void attachInfo(@NotNull Context context, @NotNull ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        u uVar = new u();
        Context context = getContext();
        if (context == null) {
            uVar.c(SentryLevel.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        if (!h1.c(context, uVar)) {
            return true;
        }
        r1.f(context, uVar);
        kvl.c().a("AutoInit");
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        cul.j();
    }
}
