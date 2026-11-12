package com.huami.lib.compose.rainbow;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b3\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\b\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0019\u0010\u000b\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0019\u0010\u000e\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u0019\u0010\u0011\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0019\u0010\u0014\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u0019\u0010\u0017\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u0019\u0010\u001a\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u0019\u0010\u001d\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u0019\u0010 \u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u0019\u0010#\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u0019\u0010&\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004\"\u0019\u0010)\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0004\"\u0019\u0010,\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0004\"\u0019\u0010/\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u0019\u00102\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0004¨\u00063"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "a", "Landroidx/compose/ui/text/TextStyle;", "getNumber1", "()Landroidx/compose/ui/text/TextStyle;", "number1", "b", "getNumber2", "number2", "c", "getNumber3", "number3", GoogleApiAvailabilityLight.a, "getNumber4", "number4", "e", "getNumber5", "number5", "f", "getNumber6", "number6", "g", "getNumber7", "number7", "h", "getNumber8", "number8", "i", "getTitle1", "title1", z.j, "getTitle2", "title2", hl.k, "getTitle3", "title3", "l", "getBody1", "body1", "m", "getBody2", "body2", GoogleApiAvailabilityLight.b, "getBody3", "body3", "o", "getBody4", "body4", b.r, "getBody5", "body5", "rainbow_release"}, k = 2, mv = {1, 5, 1})
public final class TextStyleKt {

    @NotNull
    private static final TextStyle a;

    @NotNull
    private static final TextStyle b;

    @NotNull
    private static final TextStyle c;

    @NotNull
    private static final TextStyle d;

    @NotNull
    private static final TextStyle e;

    @NotNull
    private static final TextStyle f;

    @NotNull
    private static final TextStyle g;

    @NotNull
    private static final TextStyle h;

    @NotNull
    private static final TextStyle i;

    @NotNull
    private static final TextStyle j;

    @NotNull
    private static final TextStyle k;

    @NotNull
    private static final TextStyle l;

    @NotNull
    private static final TextStyle m;

    @NotNull
    private static final TextStyle n;

    @NotNull
    private static final TextStyle o;

    @NotNull
    private static final TextStyle p;

    static {
        long sp = TextUnitKt.getSp(40);
        int i2 = R.font.maisonneue;
        a = new TextStyle(0L, sp, null, null, null, FontFamilyKt.FontFamily((List<? extends Font>) e.listOf(FontKt.m2753FontRetOiIg$default(i2, null, 0, 6, null))), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null);
        b = new TextStyle(0L, TextUnitKt.getSp(30), null, null, null, FontFamilyKt.FontFamily((List<? extends Font>) e.listOf(FontKt.m2753FontRetOiIg$default(i2, null, 0, 6, null))), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null);
        c = new TextStyle(0L, TextUnitKt.getSp(24), null, null, null, FontFamilyKt.FontFamily((List<? extends Font>) e.listOf(FontKt.m2753FontRetOiIg$default(i2, null, 0, 6, null))), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null);
        d = new TextStyle(0L, TextUnitKt.getSp(20), null, null, null, FontFamilyKt.FontFamily((List<? extends Font>) e.listOf(FontKt.m2753FontRetOiIg$default(i2, null, 0, 6, null))), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null);
        e = new TextStyle(0L, TextUnitKt.getSp(18), null, null, null, FontFamilyKt.FontFamily((List<? extends Font>) e.listOf(FontKt.m2753FontRetOiIg$default(i2, null, 0, 6, null))), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null);
        f = new TextStyle(0L, TextUnitKt.getSp(16), null, null, null, FontFamilyKt.FontFamily((List<? extends Font>) e.listOf(FontKt.m2753FontRetOiIg$default(i2, null, 0, 6, null))), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null);
        g = new TextStyle(0L, TextUnitKt.getSp(14), null, null, null, FontFamilyKt.FontFamily((List<? extends Font>) e.listOf(FontKt.m2753FontRetOiIg$default(i2, null, 0, 6, null))), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null);
        h = new TextStyle(0L, TextUnitKt.getSp(12), null, null, null, FontFamilyKt.FontFamily((List<? extends Font>) e.listOf(FontKt.m2753FontRetOiIg$default(i2, null, 0, 6, null))), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null);
        long sp2 = TextUnitKt.getSp(20);
        FontWeight.Companion companion = FontWeight.INSTANCE;
        i = new TextStyle(0L, sp2, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262137, null);
        j = new TextStyle(0L, TextUnitKt.getSp(18), companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262137, null);
        k = new TextStyle(0L, TextUnitKt.getSp(16), companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262137, null);
        l = new TextStyle(0L, TextUnitKt.getSp(20), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262141, null);
        m = new TextStyle(0L, TextUnitKt.getSp(18), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262141, null);
        n = new TextStyle(0L, TextUnitKt.getSp(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262141, null);
        o = new TextStyle(0L, TextUnitKt.getSp(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262141, null);
        p = new TextStyle(0L, TextUnitKt.getSp(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262141, null);
    }

    @NotNull
    public static final TextStyle getBody1() {
        return l;
    }

    @NotNull
    public static final TextStyle getBody2() {
        return m;
    }

    @NotNull
    public static final TextStyle getBody3() {
        return n;
    }

    @NotNull
    public static final TextStyle getBody4() {
        return o;
    }

    @NotNull
    public static final TextStyle getBody5() {
        return p;
    }

    @NotNull
    public static final TextStyle getNumber1() {
        return a;
    }

    @NotNull
    public static final TextStyle getNumber2() {
        return b;
    }

    @NotNull
    public static final TextStyle getNumber3() {
        return c;
    }

    @NotNull
    public static final TextStyle getNumber4() {
        return d;
    }

    @NotNull
    public static final TextStyle getNumber5() {
        return e;
    }

    @NotNull
    public static final TextStyle getNumber6() {
        return f;
    }

    @NotNull
    public static final TextStyle getNumber7() {
        return g;
    }

    @NotNull
    public static final TextStyle getNumber8() {
        return h;
    }

    @NotNull
    public static final TextStyle getTitle1() {
        return i;
    }

    @NotNull
    public static final TextStyle getTitle2() {
        return j;
    }

    @NotNull
    public static final TextStyle getTitle3() {
        return k;
    }
}
