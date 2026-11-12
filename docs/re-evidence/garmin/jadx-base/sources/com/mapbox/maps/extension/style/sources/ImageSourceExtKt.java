package com.mapbox.maps.extension.style.sources;

import android.graphics.Bitmap;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.Image;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.sources.generated.ImageSource;
import com.mapbox.maps.extension.style.utils.ExpectedUtilsKt;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"updateImage", "", "Lcom/mapbox/maps/extension/style/sources/generated/ImageSource;", "bitmap", "Landroid/graphics/Bitmap;", "image", "Lcom/mapbox/maps/Image;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ImageSourceExtKt {
    public static final void updateImage(ImageSource imageSource, Bitmap bitmap) {
        imageSource.getClass();
        bitmap.getClass();
        MapboxStyleManager delegate = imageSource.getDelegate();
        ExpectedUtilsKt.check(delegate != null ? delegate.updateStyleImageSourceImage(imageSource.getSourceId(), ExtensionUtils.toMapboxImage(bitmap)) : null);
    }

    public static final void updateImage(ImageSource imageSource, Image image) {
        imageSource.getClass();
        image.getClass();
        MapboxStyleManager delegate = imageSource.getDelegate();
        ExpectedUtilsKt.check(delegate != null ? delegate.updateStyleImageSourceImage(imageSource.getSourceId(), image) : null);
    }
}
