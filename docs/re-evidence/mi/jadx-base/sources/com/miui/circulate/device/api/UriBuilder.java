package com.miui.circulate.device.api;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/miui/circulate/device/api/UriBuilder;", "", "()V", "withAppendedPath", "Landroid/net/Uri;", "baseUri", "id", "", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class UriBuilder {

    @NotNull
    public static final UriBuilder INSTANCE = new UriBuilder();

    private UriBuilder() {
    }

    @NotNull
    public final Uri withAppendedPath(@NotNull Uri baseUri, @NotNull String id) {
        Intrinsics.checkNotNullParameter(baseUri, "baseUri");
        Intrinsics.checkNotNullParameter(id, "id");
        Uri.Builder builderBuildUpon = baseUri.buildUpon();
        builderBuildUpon.appendPath(id);
        Uri uriBuild = builderBuildUpon.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "builder.build()");
        return uriBuild;
    }
}
