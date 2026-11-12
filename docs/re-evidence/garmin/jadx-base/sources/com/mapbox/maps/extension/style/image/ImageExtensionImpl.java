package com.mapbox.maps.extension.style.image;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.Image;
import com.mapbox.maps.ImageContent;
import com.mapbox.maps.ImageStretches;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.utils.ExpectedUtilsKt;
import java.util.List;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleImageExtension;", "builder", "Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl$Builder;", "(Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl$Builder;)V", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "Builder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ImageExtensionImpl implements StyleContract.StyleImageExtension {
    private final Builder builder;

    public ImageExtensionImpl(Builder builder) {
        builder.getClass();
        this.builder = builder;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleImageExtension
    public void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        String imageId = this.builder.getImageId();
        Float scale = this.builder.getScale();
        ExpectedUtilsKt.check(delegate.addStyleImage(imageId, scale != null ? scale.floatValue() : delegate.getPixelRatio(), this.builder.getInternalImage$extension_style_release(), this.builder.getSdf(), this.builder.getStretchX$extension_style_release(), this.builder.getStretchY$extension_style_release(), this.builder.getContent()));
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0007J\u0006\u0010/\u001a\u000200J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020 J\u0016\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&J\u0016\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0006X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+¨\u00061"}, d2 = {"Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl$Builder;", "", "imageId", "", "(Ljava/lang/String;)V", "image", "Lcom/mapbox/maps/Image;", "(Ljava/lang/String;Lcom/mapbox/maps/Image;)V", "bitmap", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", FirebaseAnalytics.Param.CONTENT, "Lcom/mapbox/maps/ImageContent;", "getContent$extension_style_release", "()Lcom/mapbox/maps/ImageContent;", "setContent$extension_style_release", "(Lcom/mapbox/maps/ImageContent;)V", "getImageId", "()Ljava/lang/String;", "internalImage", "getInternalImage$extension_style_release", "()Lcom/mapbox/maps/Image;", "setInternalImage$extension_style_release", "(Lcom/mapbox/maps/Image;)V", "scale", "", "getScale$extension_style_release", "()Ljava/lang/Float;", "setScale$extension_style_release", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "sdf", "", "getSdf$extension_style_release", "()Z", "setSdf$extension_style_release", "(Z)V", "stretchX", "", "Lcom/mapbox/maps/ImageStretches;", "getStretchX$extension_style_release", "()Ljava/util/List;", "setStretchX$extension_style_release", "(Ljava/util/List;)V", "stretchY", "getStretchY$extension_style_release", "setStretchY$extension_style_release", "build", "Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private ImageContent content;
        private final String imageId;
        public Image internalImage;
        private Float scale;
        private boolean sdf;
        private List<ImageStretches> stretchX;
        private List<ImageStretches> stretchY;

        public Builder(String str, Bitmap bitmap) {
            str.getClass();
            bitmap.getClass();
            j0 j0Var = j0.f134944a;
            this.stretchX = j0Var;
            this.stretchY = j0Var;
            this.imageId = str;
            setInternalImage$extension_style_release(ExtensionUtils.toMapboxImage(bitmap));
        }

        public static /* synthetic */ Builder sdf$default(Builder builder, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return builder.sdf(z14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder stretchX$default(Builder builder, List list, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                list = j0.f134944a;
            }
            return builder.stretchX(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder stretchY$default(Builder builder, List list, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                list = j0.f134944a;
            }
            return builder.stretchY(list);
        }

        @e
        public final Builder bitmap(Bitmap bitmap) {
            bitmap.getClass();
            setInternalImage$extension_style_release(ExtensionUtils.toMapboxImage(bitmap));
            return this;
        }

        public final ImageExtensionImpl build() {
            if (this.internalImage != null) {
                return new ImageExtensionImpl(this);
            }
            h.z("An image plugin requires an image input.");
            return null;
        }

        public final Builder content(ImageContent content) {
            content.getClass();
            this.content = content;
            return this;
        }

        /* JADX INFO: renamed from: getContent$extension_style_release, reason: from getter */
        public final ImageContent getContent() {
            return this.content;
        }

        public final String getImageId() {
            return this.imageId;
        }

        public final Image getInternalImage$extension_style_release() {
            Image image = this.internalImage;
            if (image != null) {
                return image;
            }
            s.m("internalImage");
            throw null;
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

        @e
        public final Builder image(Image image) {
            image.getClass();
            setInternalImage$extension_style_release(image);
            return this;
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

        public final Builder stretchX(List<ImageStretches> stretchX) {
            stretchX.getClass();
            this.stretchX = stretchX;
            return this;
        }

        public final Builder stretchY(List<ImageStretches> stretchY) {
            stretchY.getClass();
            this.stretchY = stretchY;
            return this;
        }

        public Builder(String str, Image image) {
            str.getClass();
            image.getClass();
            j0 j0Var = j0.f134944a;
            this.stretchX = j0Var;
            this.stretchY = j0Var;
            this.imageId = str;
            setInternalImage$extension_style_release(image);
        }

        @e
        public Builder(String str) {
            str.getClass();
            j0 j0Var = j0.f134944a;
            this.stretchX = j0Var;
            this.stretchY = j0Var;
            this.imageId = str;
        }
    }
}
