package com.mapbox.maps.extension.compose.style;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ColorTheme;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.color.ColorThemeExtKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\r\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u000eJ\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;", "", "colorTheme", "Lcom/mapbox/maps/ColorTheme;", "(Lcom/mapbox/maps/ColorTheme;)V", "isStyleDefault", "", "(Lcom/mapbox/maps/ColorTheme;Z)V", "getColorTheme", "()Lcom/mapbox/maps/ColorTheme;", "isStyleDefault$extension_compose_release", "()Z", "component1", "component2", "component2$extension_compose_release", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final /* data */ class StyleColorTheme {
    private final ColorTheme colorTheme;
    private final boolean isStyleDefault;
    public static final StyleColorTheme STYLE_DEFAULT = new StyleColorTheme(ColorThemeExtKt.colorTheme(), true);
    public static final StyleColorTheme NONE = new StyleColorTheme(ColorThemeExtKt.colorTheme(), false);

    public StyleColorTheme(ColorTheme colorTheme, boolean z14) {
        colorTheme.getClass();
        this.colorTheme = colorTheme;
        this.isStyleDefault = z14;
    }

    public static /* synthetic */ StyleColorTheme copy$default(StyleColorTheme styleColorTheme, ColorTheme colorTheme, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            colorTheme = styleColorTheme.colorTheme;
        }
        if ((i14 & 2) != 0) {
            z14 = styleColorTheme.isStyleDefault;
        }
        return styleColorTheme.copy(colorTheme, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ColorTheme getColorTheme() {
        return this.colorTheme;
    }

    /* JADX INFO: renamed from: component2$extension_compose_release, reason: from getter */
    public final boolean getIsStyleDefault() {
        return this.isStyleDefault;
    }

    public final StyleColorTheme copy(ColorTheme colorTheme, boolean isStyleDefault) {
        colorTheme.getClass();
        return new StyleColorTheme(colorTheme, isStyleDefault);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleColorTheme)) {
            return false;
        }
        StyleColorTheme styleColorTheme = (StyleColorTheme) other;
        return s.g(this.colorTheme, styleColorTheme.colorTheme) && this.isStyleDefault == styleColorTheme.isStyleDefault;
    }

    public final ColorTheme getColorTheme() {
        return this.colorTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.colorTheme.hashCode() * 31;
        boolean z14 = this.isStyleDefault;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return iHashCode + r14;
    }

    public final boolean isStyleDefault$extension_compose_release() {
        return this.isStyleDefault;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("StyleColorTheme(colorTheme=");
        sb3.append(this.colorTheme);
        sb3.append(", isStyleDefault=");
        return j.t(sb3, this.isStyleDefault, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StyleColorTheme(ColorTheme colorTheme) {
        this(colorTheme, false);
        colorTheme.getClass();
    }
}
