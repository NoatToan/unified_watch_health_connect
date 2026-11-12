package com.mapbox.maps.extension.compose.style;

import com.mapbox.maps.ColorTheme;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.Image;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.color.ColorThemeExtKt;
import n5.c;
import o4.g;
import o4.v0;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;
import t4.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0003\u0010\r\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "base64", "Lcom/mapbox/maps/ColorTheme;", "rememberColorTheme", "(Ljava/lang/String;Lp3/m;I)Lcom/mapbox/maps/ColorTheme;", "Lcom/mapbox/maps/Image;", "image", "(Lcom/mapbox/maps/Image;Lp3/m;I)Lcom/mapbox/maps/ColorTheme;", "Lo4/v0;", "imageBitmap", "(Lo4/v0;Lp3/m;I)Lcom/mapbox/maps/ColorTheme;", "Lt4/d;", "painter", "(Lt4/d;Lp3/m;I)Lcom/mapbox/maps/ColorTheme;", "", "resourceId", "(ILp3/m;I)Lcom/mapbox/maps/ColorTheme;", "colorTheme", "Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;", "rememberStyleColorTheme", "(Lcom/mapbox/maps/ColorTheme;Lp3/m;I)Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StyleColorThemeKt {
    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @MapboxExperimental
    public static final ColorTheme rememberColorTheme(String str, m mVar, int i14) {
        str.getClass();
        mVar.L(1766412746);
        x1 x1Var = n.f135158a;
        mVar.L(1157296644);
        boolean zB = mVar.B(str);
        Object objQ = mVar.q();
        if (zB) {
            objQ = ColorThemeExtKt.colorTheme(str);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = ColorThemeExtKt.colorTheme(str);
                mVar.K(objQ);
            }
        }
        mVar.R();
        ColorTheme colorTheme = (ColorTheme) objQ;
        mVar.R();
        return colorTheme;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @MapboxExperimental
    public static final StyleColorTheme rememberStyleColorTheme(ColorTheme colorTheme, m mVar, int i14) {
        colorTheme.getClass();
        mVar.L(219267795);
        x1 x1Var = n.f135158a;
        mVar.L(1157296644);
        boolean zB = mVar.B(colorTheme);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new StyleColorTheme(colorTheme);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new StyleColorTheme(colorTheme);
                mVar.K(objQ);
            }
        }
        mVar.R();
        StyleColorTheme styleColorTheme = (StyleColorTheme) objQ;
        mVar.R();
        return styleColorTheme;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @MapboxExperimental
    public static final ColorTheme rememberColorTheme(Image image, m mVar, int i14) {
        image.getClass();
        mVar.L(-1869495058);
        x1 x1Var = n.f135158a;
        mVar.L(1157296644);
        boolean zB = mVar.B(image);
        Object objQ = mVar.q();
        if (!zB) {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = ColorThemeExtKt.colorTheme(image);
                mVar.K(objQ);
            }
        } else {
            objQ = ColorThemeExtKt.colorTheme(image);
            mVar.K(objQ);
        }
        mVar.R();
        ColorTheme colorTheme = (ColorTheme) objQ;
        mVar.R();
        return colorTheme;
    }

    @MapboxExperimental
    public static final ColorTheme rememberColorTheme(v0 v0Var, m mVar, int i14) {
        v0Var.getClass();
        mVar.L(-940925249);
        x1 x1Var = n.f135158a;
        ColorTheme colorThemeRememberColorTheme = rememberColorTheme(ExtensionUtils.toMapboxImage(g.a(v0Var)), mVar, 8);
        mVar.R();
        return colorThemeRememberColorTheme;
    }

    @MapboxExperimental
    public static final ColorTheme rememberColorTheme(d dVar, m mVar, int i14) {
        dVar.getClass();
        mVar.L(1175940350);
        x1 x1Var = n.f135158a;
        ColorTheme colorThemeRememberColorTheme = rememberColorTheme(StyleImageKt.drawToBitmap(dVar), mVar, 8);
        mVar.R();
        return colorThemeRememberColorTheme;
    }

    @MapboxExperimental
    public static final ColorTheme rememberColorTheme(int i14, m mVar, int i15) {
        mVar.L(-382230118);
        x1 x1Var = n.f135158a;
        ColorTheme colorThemeRememberColorTheme = rememberColorTheme(c.a(i14, mVar, i15 & 14), mVar, 8);
        mVar.R();
        return colorThemeRememberColorTheme;
    }
}
