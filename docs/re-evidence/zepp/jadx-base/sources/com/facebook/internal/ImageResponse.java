package com.facebook.internal;

import android.graphics.Bitmap;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R!\u0010\u000e\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/facebook/internal/ImageResponse;", "", "Lcom/facebook/internal/ImageRequest;", "a", "Lcom/facebook/internal/ImageRequest;", "getRequest", "()Lcom/facebook/internal/ImageRequest;", "request", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "Ljava/lang/Exception;", "getError", "()Ljava/lang/Exception;", "error", "", "c", "Z", "isCachedRedirect", "()Z", "Landroid/graphics/Bitmap;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Lcom/facebook/internal/ImageRequest;Ljava/lang/Exception;ZLandroid/graphics/Bitmap;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ImageResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ImageRequest request;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Exception error;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isCachedRedirect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Bitmap bitmap;

    public ImageResponse(@NotNull ImageRequest imageRequest, @Nullable Exception exc, boolean z, @Nullable Bitmap bitmap) {
        this.request = imageRequest;
        this.error = exc;
        this.isCachedRedirect = z;
        this.bitmap = bitmap;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final Exception getError() {
        return this.error;
    }

    @NotNull
    public final ImageRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: isCachedRedirect, reason: from getter */
    public final boolean getIsCachedRedirect() {
        return this.isCachedRedirect;
    }
}
