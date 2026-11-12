package com.mapbox.maps.extension.style.image;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.Image;
import com.mapbox.maps.ImageContent;
import com.mapbox.maps.ImageStretches;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.utils.ExpectedUtilsKt;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleImageExtension;", "builder", "Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl$Builder;", "(Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl$Builder;)V", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "Builder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ImageNinePatchExtensionImpl implements StyleContract.StyleImageExtension {
    private final Builder builder;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010.\u001a\u00020/J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*¨\u00060"}, d2 = {"Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl$Builder;", "", "imageId", "", "bitmap", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", FirebaseAnalytics.Param.CONTENT, "Lcom/mapbox/maps/ImageContent;", "getContent$extension_style_release", "()Lcom/mapbox/maps/ImageContent;", "setContent$extension_style_release", "(Lcom/mapbox/maps/ImageContent;)V", "getImageId", "()Ljava/lang/String;", "internalImage", "Lcom/mapbox/maps/Image;", "getInternalImage$extension_style_release", "()Lcom/mapbox/maps/Image;", "setInternalImage$extension_style_release", "(Lcom/mapbox/maps/Image;)V", "scale", "", "getScale$extension_style_release", "()Ljava/lang/Float;", "setScale$extension_style_release", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "sdf", "", "getSdf$extension_style_release", "()Z", "setSdf$extension_style_release", "(Z)V", "stretchX", "", "Lcom/mapbox/maps/ImageStretches;", "getStretchX$extension_style_release", "()Ljava/util/List;", "setStretchX$extension_style_release", "(Ljava/util/List;)V", "stretchY", "getStretchY$extension_style_release", "setStretchY$extension_style_release", "build", "Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private final Bitmap bitmap;
        private ImageContent content;
        private final String imageId;
        private Image internalImage;
        private Float scale;
        private boolean sdf;
        private List<ImageStretches> stretchX;
        private List<ImageStretches> stretchY;

        public Builder(String str, Bitmap bitmap) {
            str.getClass();
            bitmap.getClass();
            this.imageId = str;
            this.bitmap = bitmap;
            j0 j0Var = j0.f134944a;
            this.stretchX = j0Var;
            this.stretchY = j0Var;
            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                h.s("Only ARGB_8888 bitmap config is supported!");
                throw null;
            }
            NinePatchImage ninePatchImage = NinePatchUtils.parse9PatchBitmap(bitmap);
            this.internalImage = ninePatchImage.getInternalImage();
            this.content = ninePatchImage.getImageContent();
            this.stretchX = ninePatchImage.getStretchX();
            this.stretchY = ninePatchImage.getStretchY();
        }

        public static /* synthetic */ Builder sdf$default(Builder builder, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return builder.sdf(z14);
        }

        public final ImageNinePatchExtensionImpl build() {
            return new ImageNinePatchExtensionImpl(this);
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: getContent$extension_style_release, reason: from getter */
        public final ImageContent getContent() {
            return this.content;
        }

        public final String getImageId() {
            return this.imageId;
        }

        /* JADX INFO: renamed from: getInternalImage$extension_style_release, reason: from getter */
        public final Image getInternalImage() {
            return this.internalImage;
        }

        /* JADX INFO: renamed from: getScale$extension_style_release, reason: from getter */
        public final Float getScale() {
            return this.scale;
        }

        /* JADX INFO: renamed from: getSdf$extension_style_release, reason: from getter */
        public final boolean getSdf() {
            return this.sdf;
        }

        public final List<ImageStretches> getStretchX$extension_style_release() {
            return this.stretchX;
        }

        public final List<ImageStretches> getStretchY$extension_style_release() {
            return this.stretchY;
        }

        public final Builder scale(float scale) {
            this.scale = Float.valueOf(scale);
            return this;
        }

        public final Builder sdf(boolean sdf) {
            this.sdf = sdf;
            return this;
        }

        public final void setContent$extension_style_release(ImageContent imageContent) {
            this.content = imageContent;
        }

        public final void setInternalImage$extension_style_release(Image image) {
            image.getClass();
            this.internalImage = image;
        }

        public final void setScale$extension_style_release(Float f14) {
            this.scale = f14;
        }

        public final void setSdf$extension_style_release(boolean z14) {
            this.sdf = z14;
        }

        public final void setStretchX$extension_style_release(List<ImageStretches> list) {
            list.getClass();
            this.stretchX = list;
        }

        public final void setStretchY$extension_style_release(List<ImageStretches> list) {
            list.getClass();
            this.stretchY = list;
        }
    }

    public ImageNinePatchExtensionImpl(Builder builder) {
        builder.getClass();
        this.builder = builder;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleImageExtension
    public void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        String imageId = this.builder.getImageId();
        Float scale = this.builder.getScale();
        ExpectedUtilsKt.check(delegate.addStyleImage(imageId, scale != null ? scale.floatValue() : delegate.getPixelRatio(), this.builder.getInternalImage(), this.builder.getSdf(), this.builder.getStretchX$extension_style_release(), this.builder.getStretchY$extension_style_release(), this.builder.getContent()));
    }
}
