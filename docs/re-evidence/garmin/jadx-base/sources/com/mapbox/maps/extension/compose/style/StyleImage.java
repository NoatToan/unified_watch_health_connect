package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.Image;
import com.mapbox.maps.ImageContent;
import com.mapbox.maps.ImageStretches;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006-"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/StyleImage;", "", "imageId", "", "image", "Lcom/mapbox/maps/Image;", "scale", "", "sdf", "", "stretchX", "", "Lcom/mapbox/maps/ImageStretches;", "stretchY", FirebaseAnalytics.Param.CONTENT, "Lcom/mapbox/maps/ImageContent;", "(Ljava/lang/String;Lcom/mapbox/maps/Image;Ljava/lang/Float;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)V", "getContent", "()Lcom/mapbox/maps/ImageContent;", "getImage", "()Lcom/mapbox/maps/Image;", "getImageId", "()Ljava/lang/String;", "getScale", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSdf", "()Z", "getStretchX", "()Ljava/util/List;", "getStretchY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/mapbox/maps/Image;Ljava/lang/Float;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/maps/extension/compose/style/StyleImage;", "equals", "other", "hashCode", "", "toString", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class StyleImage {
    private final ImageContent content;
    private final Image image;
    private final String imageId;
    private final Float scale;
    private final boolean sdf;
    private final List<ImageStretches> stretchX;
    private final List<ImageStretches> stretchY;

    public StyleImage(String str, Image image, Float f14, boolean z14, List list, List list2, ImageContent imageContent, int i14, j jVar) {
        this(str, image, (i14 & 4) != 0 ? null : f14, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? j0.f134944a : list, (i14 & 32) != 0 ? j0.f134944a : list2, (i14 & 64) != 0 ? null : imageContent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StyleImage copy$default(StyleImage styleImage, String str, Image image, Float f14, boolean z14, List list, List list2, ImageContent imageContent, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = styleImage.imageId;
        }
        if ((i14 & 2) != 0) {
            image = styleImage.image;
        }
        if ((i14 & 4) != 0) {
            f14 = styleImage.scale;
        }
        if ((i14 & 8) != 0) {
            z14 = styleImage.sdf;
        }
        if ((i14 & 16) != 0) {
            list = styleImage.stretchX;
        }
        if ((i14 & 32) != 0) {
            list2 = styleImage.stretchY;
        }
        if ((i14 & 64) != 0) {
            imageContent = styleImage.content;
        }
        List list3 = list2;
        ImageContent imageContent2 = imageContent;
        List list4 = list;
        Float f15 = f14;
        return styleImage.copy(str, image, f15, z14, list4, list3, imageContent2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSdf() {
        return this.sdf;
    }

    public final List<ImageStretches> component5() {
        return this.stretchX;
    }

    public final List<ImageStretches> component6() {
        return this.stretchY;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ImageContent getContent() {
        return this.content;
    }

    public final StyleImage copy(String imageId, Image image, Float scale, boolean sdf, List<ImageStretches> stretchX, List<ImageStretches> stretchY, ImageContent content) {
        imageId.getClass();
        image.getClass();
        stretchX.getClass();
        stretchY.getClass();
        return new StyleImage(imageId, image, scale, sdf, stretchX, stretchY, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleImage)) {
            return false;
        }
        StyleImage styleImage = (StyleImage) other;
        return s.g(this.imageId, styleImage.imageId) && s.g(this.image, styleImage.image) && s.g(this.scale, styleImage.scale) && this.sdf == styleImage.sdf && s.g(this.stretchX, styleImage.stretchX) && s.g(this.stretchY, styleImage.stretchY) && s.g(this.content, styleImage.content);
    }

    public final ImageContent getContent() {
        return this.content;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final Float getScale() {
        return this.scale;
    }

    public final boolean getSdf() {
        return this.sdf;
    }

    public final List<ImageStretches> getStretchX() {
        return this.stretchX;
    }

    public final List<ImageStretches> getStretchY() {
        return this.stretchY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    public int hashCode() {
        int iHashCode = (this.image.hashCode() + (this.imageId.hashCode() * 31)) * 31;
        Float f14 = this.scale;
        int iHashCode2 = (iHashCode + (f14 == null ? 0 : f14.hashCode())) * 31;
        boolean z14 = this.sdf;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int iB = u0.b(u0.b((iHashCode2 + r14) * 31, 31, this.stretchX), 31, this.stretchY);
        ImageContent imageContent = this.content;
        return iB + (imageContent != null ? imageContent.hashCode() : 0);
    }

    public String toString() {
        return "StyleImage(imageId=" + this.imageId + ", image=" + this.image + ", scale=" + this.scale + ", sdf=" + this.sdf + ", stretchX=" + this.stretchX + ", stretchY=" + this.stretchY + ", content=" + this.content + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public StyleImage(String str, Image image, Float f14, boolean z14, List<ImageStretches> list, List<ImageStretches> list2, ImageContent imageContent) {
        str.getClass();
        image.getClass();
        list.getClass();
        list2.getClass();
        this.imageId = str;
        this.image = image;
        this.scale = f14;
        this.sdf = z14;
        this.stretchX = list;
        this.stretchY = list2;
        this.content = imageContent;
    }
}
