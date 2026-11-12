package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\u001a-\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0082\b\u001a\u0019\u0010#\u001a\u00020 *\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010&\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002\u001a\u0019\u0010+\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a+\u00100\u001a\u00020\u0007*\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070,H\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b.\u0010/\"$\u00106\u001a\u000201*\u00020\u00078Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\"$\u00109\u001a\u000201*\u00020\u00078Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u00103\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "", "color", "(I)J", "", "(J)J", "(IIII)J", "start", Command.STOP, "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", "background", "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "fgC", "bgC", "fgA", "bgA", "a", "compositeComponent", "", "getComponents-8_81llA", "(J)[F", "getComponents", "luminance-8_81llA", "(J)F", "luminance", "v", "saturate", "toArgb-8_81llA", "(J)I", "toArgb", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "", "isSpecified-8_81llA", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "isUnspecified-8_81llA", "isUnspecified-8_81llA$annotations", "isUnspecified", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class ColorKt {
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    @Stable
    public static final long Color(float f, float f2, float f3, float f4, @NotNull ColorSpace colorSpace) {
        boolean z;
        if (f <= colorSpace.getMaxValue(0) && colorSpace.getMinValue(0) <= f) {
            if (f2 <= colorSpace.getMaxValue(1) && colorSpace.getMinValue(1) <= f2) {
                if (f3 <= colorSpace.getMaxValue(2) && colorSpace.getMinValue(2) <= f3) {
                    if (0.0f <= f4 && f4 <= 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            if (colorSpace.getIsSrgb()) {
                return Color.m1208constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
            }
            if (!(colorSpace.getComponentCount() == 3)) {
                throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
            }
            int id = colorSpace.getId();
            if (!(id != -1)) {
                throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
            }
            return Color.m1208constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(Float16.m1306constructorimpl(f2)) & WebSocketProtocol.s) << 32) | ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(Float16.m1306constructorimpl(f)) & WebSocketProtocol.s) << 48)) | ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(Float16.m1306constructorimpl(f3)) & WebSocketProtocol.s) << 16)) | ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m3905constructorimpl(ULong.m3905constructorimpl(id) & 63)));
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    @Stable
    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m1258compositeOverOWjLjI(long j, long j2) {
        long jM1209convertvNxB06k = Color.m1209convertvNxB06k(j, Color.m1216getColorSpaceimpl(j2));
        float fM1214getAlphaimpl = Color.m1214getAlphaimpl(j2);
        float fM1214getAlphaimpl2 = Color.m1214getAlphaimpl(jM1209convertvNxB06k);
        float f = 1.0f - fM1214getAlphaimpl2;
        float f2 = (fM1214getAlphaimpl * f) + fM1214getAlphaimpl2;
        return Color((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((Color.m1218getRedimpl(jM1209convertvNxB06k) * fM1214getAlphaimpl2) + ((Color.m1218getRedimpl(j2) * fM1214getAlphaimpl) * f)) / f2, (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((Color.m1217getGreenimpl(jM1209convertvNxB06k) * fM1214getAlphaimpl2) + ((Color.m1217getGreenimpl(j2) * fM1214getAlphaimpl) * f)) / f2, f2 == 0.0f ? 0.0f : ((Color.m1215getBlueimpl(jM1209convertvNxB06k) * fM1214getAlphaimpl2) + ((Color.m1215getBlueimpl(j2) * fM1214getAlphaimpl) * f)) / f2, f2, Color.m1216getColorSpaceimpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    public static final float[] m1259getComponents8_81llA(long j) {
        return new float[]{Color.m1218getRedimpl(j), Color.m1217getGreenimpl(j), Color.m1215getBlueimpl(j), Color.m1214getAlphaimpl(j)};
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m1260isSpecified8_81llA(long j) {
        return j != Color.INSTANCE.m1248getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1261isSpecified8_81llA$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m1262isUnspecified8_81llA(long j) {
        return j == Color.INSTANCE.m1248getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1263isUnspecified8_81llA$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m1264lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab$ui_graphics_release = ColorSpaces.INSTANCE.getOklab$ui_graphics_release();
        long jM1209convertvNxB06k = Color.m1209convertvNxB06k(j, oklab$ui_graphics_release);
        long jM1209convertvNxB06k2 = Color.m1209convertvNxB06k(j2, oklab$ui_graphics_release);
        float fM1214getAlphaimpl = Color.m1214getAlphaimpl(jM1209convertvNxB06k);
        float fM1218getRedimpl = Color.m1218getRedimpl(jM1209convertvNxB06k);
        float fM1217getGreenimpl = Color.m1217getGreenimpl(jM1209convertvNxB06k);
        float fM1215getBlueimpl = Color.m1215getBlueimpl(jM1209convertvNxB06k);
        float fM1214getAlphaimpl2 = Color.m1214getAlphaimpl(jM1209convertvNxB06k2);
        float fM1218getRedimpl2 = Color.m1218getRedimpl(jM1209convertvNxB06k2);
        float fM1217getGreenimpl2 = Color.m1217getGreenimpl(jM1209convertvNxB06k2);
        float fM1215getBlueimpl2 = Color.m1215getBlueimpl(jM1209convertvNxB06k2);
        return Color.m1209convertvNxB06k(Color(MathHelpersKt.lerp(fM1218getRedimpl, fM1218getRedimpl2, f), MathHelpersKt.lerp(fM1217getGreenimpl, fM1217getGreenimpl2, f), MathHelpersKt.lerp(fM1215getBlueimpl, fM1215getBlueimpl2, f), MathHelpersKt.lerp(fM1214getAlphaimpl, fM1214getAlphaimpl2, f), oklab$ui_graphics_release), Color.m1216getColorSpaceimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m1265luminance8_81llA(long j) {
        ColorSpace colorSpaceM1216getColorSpaceimpl = Color.m1216getColorSpaceimpl(j);
        if (!ColorModel.m1533equalsimpl0(colorSpaceM1216getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m1540getRgbxdoWZVw())) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("The specified color must be encoded in an RGB color space. The supplied color space is ", ColorModel.m1536toStringimpl(colorSpaceM1216getColorSpaceimpl.getModel())).toString());
        }
        Function1<Double, Double> eotf = ((Rgb) colorSpaceM1216getColorSpaceimpl).getEotf();
        return saturate((float) ((eotf.invoke(Double.valueOf(Color.m1218getRedimpl(j))).doubleValue() * 0.2126d) + (eotf.invoke(Double.valueOf(Color.m1217getGreenimpl(j))).doubleValue() * 0.7152d) + (eotf.invoke(Double.valueOf(Color.m1215getBlueimpl(j))).doubleValue() * 0.0722d)));
    }

    private static final float saturate(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m1266takeOrElseDxMtmZc(long j, @NotNull Function0<Color> function0) {
        return (j > Color.INSTANCE.m1248getUnspecified0d7_KjU() ? 1 : (j == Color.INSTANCE.m1248getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j : function0.invoke().m1222unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m1267toArgb8_81llA(long j) {
        ColorSpace colorSpaceM1216getColorSpaceimpl = Color.m1216getColorSpaceimpl(j);
        if (colorSpaceM1216getColorSpaceimpl.getIsSrgb()) {
            return (int) ULong.m3905constructorimpl(j >>> 32);
        }
        float[] fArrM1259getComponents8_81llA = m1259getComponents8_81llA(j);
        ColorSpaceKt.m1544connectYBCOT_4$default(colorSpaceM1216getColorSpaceimpl, null, 0, 3, null).transform(fArrM1259getComponents8_81llA);
        return ((int) ((fArrM1259getComponents8_81llA[2] * 255.0f) + 0.5f)) | (((int) ((fArrM1259getComponents8_81llA[3] * 255.0f) + 0.5f)) << 24) | (((int) ((fArrM1259getComponents8_81llA[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArrM1259getComponents8_81llA[1] * 255.0f) + 0.5f)) << 8);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @Stable
    public static final long Color(int i) {
        return Color.m1208constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(i) << 32));
    }

    @Stable
    public static final long Color(long j) {
        return Color.m1208constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(ULong.m3905constructorimpl(j) & 4294967295L) << 32));
    }

    @Stable
    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
