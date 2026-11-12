package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zac extends zab {
    private WeakReference<ImageManager.OnImageLoadedListener> g;

    public zac(ImageManager.OnImageLoadedListener onImageLoadedListener, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(onImageLoadedListener);
        this.g = new WeakReference<>(onImageLoadedListener);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zac)) {
            return false;
        }
        zac zacVar = (zac) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = this.g.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = zacVar.g.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.equal(onImageLoadedListener2, onImageLoadedListener) && Objects.equal(zacVar.a, this.a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // com.google.android.gms.common.images.zab
    public final void zaa(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (z2 || (onImageLoadedListener = this.g.get()) == null) {
            return;
        }
        onImageLoadedListener.onImageLoaded(this.a.a, drawable, z3);
    }
}
