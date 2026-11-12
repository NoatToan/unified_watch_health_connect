package androidx.compose.ui.graphics;

import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0000\u001a%\u0010\n\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u0011*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u0011H\u0000\u001a\u001a\u0010\u0015\u001a\u00020\u0014*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0019\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u0014H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u001c\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u001aH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\t\u001a\u001a\u0010\u001d\u001a\u00020\u001a*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0010\u0010\u001f\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010 \u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010\"\u001a\u00020!*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001e\u001a%\u0010$\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\t\u001a\u001a\u0010&\u001a\u00020%*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001e\u001a%\u0010(\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020%H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\t\u001a\u0010\u0010)\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010*\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010,\u001a\u00020+*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001e\u001a%\u0010.\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020+H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\t\u001a \u00101\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u000e\u0010\f\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0000\u001a\u001a\u00103\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\b\u0010\f\u001a\u0004\u0018\u000102H\u0000*\n\u00104\"\u00020\u00022\u00020\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", "Paint", "Landroid/graphics/Paint;", "makeNativePaint", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/BlendMode;", "mode", "", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "setNativeColorFilter", "", "getNativeAlpha", "setNativeAlpha", "", "getNativeAntiAlias", "setNativeAntiAlias", "Landroidx/compose/ui/graphics/Color;", "getNativeColor", "(Landroid/graphics/Paint;)J", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColor", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeStyle--5YerkU", "setNativeStyle", "getNativeStyle", "(Landroid/graphics/Paint;)I", "getNativeStrokeWidth", "setNativeStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeJoin", "getNativeStrokeMiterLimit", "setNativeStrokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativeFilterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeShader", "Landroidx/compose/ui/graphics/PathEffect;", "setNativePathEffect", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidPaint_androidKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[android.graphics.Paint.Style.values().length];
            iArr[android.graphics.Paint.Style.STROKE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[android.graphics.Paint.Cap.values().length];
            iArr2[android.graphics.Paint.Cap.BUTT.ordinal()] = 1;
            iArr2[android.graphics.Paint.Cap.ROUND.ordinal()] = 2;
            iArr2[android.graphics.Paint.Cap.SQUARE.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[android.graphics.Paint.Join.values().length];
            iArr3[android.graphics.Paint.Join.MITER.ordinal()] = 1;
            iArr3[android.graphics.Paint.Join.BEVEL.ordinal()] = 2;
            iArr3[android.graphics.Paint.Join.ROUND.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final float getNativeAlpha(@NotNull android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@NotNull android.graphics.Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(@NotNull android.graphics.Paint paint) {
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(@NotNull android.graphics.Paint paint) {
        return !paint.isFilterBitmap() ? FilterQuality.INSTANCE.m1300getNonefv9h1I() : FilterQuality.INSTANCE.m1298getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(@NotNull android.graphics.Paint paint) {
        android.graphics.Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i == 1) {
            return StrokeCap.INSTANCE.m1481getButtKaPHkGw();
        }
        if (i != 2) {
            return i != 3 ? StrokeCap.INSTANCE.m1481getButtKaPHkGw() : StrokeCap.INSTANCE.m1483getSquareKaPHkGw();
        }
        return StrokeCap.INSTANCE.m1482getRoundKaPHkGw();
    }

    public static final int getNativeStrokeJoin(@NotNull android.graphics.Paint paint) {
        android.graphics.Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i == 1) {
            return StrokeJoin.INSTANCE.m1492getMiterLxFBmk8();
        }
        if (i != 2) {
            return i != 3 ? StrokeJoin.INSTANCE.m1492getMiterLxFBmk8() : StrokeJoin.INSTANCE.m1493getRoundLxFBmk8();
        }
        return StrokeJoin.INSTANCE.m1491getBevelLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@NotNull android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(@NotNull android.graphics.Paint paint) {
        android.graphics.Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.INSTANCE.m1413getStrokeTiuSbCo() : PaintingStyle.INSTANCE.m1412getFillTiuSbCo();
    }

    @NotNull
    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(1);
    }

    public static final void setNativeAlpha(@NotNull android.graphics.Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void setNativeAntiAlias(@NotNull android.graphics.Paint paint, boolean z) {
        paint.setAntiAlias(z);
    }

    /* JADX INFO: renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m1109setNativeBlendModeGB0RdKg(@NotNull android.graphics.Paint paint, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m1529setBlendModeGB0RdKg(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m1076toPorterDuffModes9anfk8(i)));
        }
    }

    /* JADX INFO: renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m1110setNativeColor4WTKRHQ(@NotNull android.graphics.Paint paint, long j) {
        paint.setColor(ColorKt.m1267toArgb8_81llA(j));
    }

    public static final void setNativeColorFilter(@NotNull android.graphics.Paint paint, @Nullable ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter == null ? null : AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter));
    }

    /* JADX INFO: renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m1111setNativeFilterQuality50PEsBU(@NotNull android.graphics.Paint paint, int i) {
        paint.setFilterBitmap(!FilterQuality.m1293equalsimpl0(i, FilterQuality.INSTANCE.m1300getNonefv9h1I()));
    }

    public static final void setNativePathEffect(@NotNull android.graphics.Paint paint, @Nullable PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect == null ? null : androidPathEffect.getNativePathEffect());
    }

    public static final void setNativeShader(@NotNull android.graphics.Paint paint, @Nullable Shader shader) {
        paint.setShader(shader);
    }

    /* JADX INFO: renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m1112setNativeStrokeCapCSYIeUk(@NotNull android.graphics.Paint paint, int i) {
        android.graphics.Paint.Cap cap;
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        if (StrokeCap.m1477equalsimpl0(i, companion.m1483getSquareKaPHkGw())) {
            cap = android.graphics.Paint.Cap.SQUARE;
        } else if (StrokeCap.m1477equalsimpl0(i, companion.m1482getRoundKaPHkGw())) {
            cap = android.graphics.Paint.Cap.ROUND;
        } else {
            cap = StrokeCap.m1477equalsimpl0(i, companion.m1481getButtKaPHkGw()) ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* JADX INFO: renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m1113setNativeStrokeJoinkLtJ_vA(@NotNull android.graphics.Paint paint, int i) {
        android.graphics.Paint.Join join;
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        if (StrokeJoin.m1487equalsimpl0(i, companion.m1492getMiterLxFBmk8())) {
            join = android.graphics.Paint.Join.MITER;
        } else if (StrokeJoin.m1487equalsimpl0(i, companion.m1491getBevelLxFBmk8())) {
            join = android.graphics.Paint.Join.BEVEL;
        } else {
            join = StrokeJoin.m1487equalsimpl0(i, companion.m1493getRoundLxFBmk8()) ? android.graphics.Paint.Join.ROUND : android.graphics.Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void setNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(@NotNull android.graphics.Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m1114setNativeStyle5YerkU(@NotNull android.graphics.Paint paint, int i) {
        paint.setStyle(PaintingStyle.m1408equalsimpl0(i, PaintingStyle.INSTANCE.m1413getStrokeTiuSbCo()) ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }
}
