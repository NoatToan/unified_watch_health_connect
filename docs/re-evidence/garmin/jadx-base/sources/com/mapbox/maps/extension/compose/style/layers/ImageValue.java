package com.mapbox.maps.extension.compose.style.layers;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.StyleImage;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001b\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\fHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "", "styleImage", "Lcom/mapbox/maps/extension/compose/style/StyleImage;", "(Lcom/mapbox/maps/extension/compose/style/StyleImage;)V", "imageId", "", "(Ljava/lang/String;)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "value", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/extension/compose/style/StyleImage;)V", "imageIdOrNull", "getImageIdOrNull", "()Ljava/lang/String;", "notInitial", "", "getNotInitial$extension_compose_release", "()Z", "getStyleImage", "()Lcom/mapbox/maps/extension/compose/style/StyleImage;", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ImageValue {
    public static final ImageValue DEFAULT;
    public static final ImageValue INITIAL;
    private final StyleImage styleImage;
    private final Value value;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Value valueValueOf = Value.valueOf("ImageValue.INITIAL");
        valueValueOf.getClass();
        int i14 = 2;
        INITIAL = new ImageValue(valueValueOf, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new ImageValue(valueNullValue, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageValue(StyleImage styleImage) {
        this(new Value(styleImage.getImageId()), styleImage);
        styleImage.getClass();
    }

    public static /* synthetic */ ImageValue copy$default(ImageValue imageValue, Value value, StyleImage styleImage, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = imageValue.value;
        }
        if ((i14 & 2) != 0) {
            styleImage = imageValue.styleImage;
        }
        return imageValue.copy(value, styleImage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Value getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StyleImage getStyleImage() {
        return this.styleImage;
    }

    public final ImageValue copy(Value value, StyleImage styleImage) {
        value.getClass();
        return new ImageValue(value, styleImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageValue)) {
            return false;
        }
        ImageValue imageValue = (ImageValue) other;
        return s.g(this.value, imageValue.value) && s.g(this.styleImage, imageValue.styleImage);
    }

    public final String getImageIdOrNull() {
        Object contents = this.value.getContents();
        if (contents instanceof String) {
            return (String) contents;
        }
        return null;
    }

    public final boolean getNotInitial$extension_compose_release() {
        return this != INITIAL;
    }

    public final StyleImage getStyleImage() {
        return this.styleImage;
    }

    public final Value getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        StyleImage styleImage = this.styleImage;
        return iHashCode + (styleImage == null ? 0 : styleImage.hashCode());
    }

    public String toString() {
        return "ImageValue(value=" + this.value + ", styleImage=" + this.styleImage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ ImageValue(Value value, StyleImage styleImage, int i14, j jVar) {
        this(value, (i14 & 2) != 0 ? null : styleImage);
    }

    public ImageValue(Value value, StyleImage styleImage) {
        value.getClass();
        this.value = value;
        this.styleImage = styleImage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageValue(String str) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(str), null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageValue(Expression expression) {
        this(expression, null, 2, 0 == true ? 1 : 0);
        expression.getClass();
    }
}
