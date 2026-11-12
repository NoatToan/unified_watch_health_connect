package androidx.compose.ui.graphics;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.ingenic.iwds.HardwareList;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.Regex;
import kotlin.text.a;
import org.cybergarage.upnp.std.av.renderer.RenderingControl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081@\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001SB\u0014\b\u0016\u0012\u0006\u0010O\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\bP\u0010QB\u0014\b\u0016\u0012\u0006\u0010O\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\bP\u0010RB\u0012\u0012\u0006\u0010F\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\bP\u0010\bJ\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001b\u0010)\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0016\u0010+\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b*\u0010\bJ\u0016\u0010-\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b,\u0010\bJ\u0016\u0010/\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b.\u0010\bJ\u0016\u00101\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b0\u0010\bJ\u0016\u00103\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b2\u0010\bJ\r\u00107\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00109\u001a\u000204¢\u0006\u0004\b8\u00106J\r\u0010;\u001a\u000204¢\u0006\u0004\b:\u00106J\r\u0010=\u001a\u000204¢\u0006\u0004\b<\u00106J\r\u0010?\u001a\u00020\u001e¢\u0006\u0004\b>\u0010 J\u0010\u0010A\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b@\u0010\fJ\u001a\u0010E\u001a\u0002042\b\u0010\"\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bC\u0010DR\u0019\u0010F\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010&\u001a\u00020\u00008F@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bJ\u0010\bR\u0013\u0010L\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\bK\u0010\fR\u0013\u0010N\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\bM\u0010\fø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "", "toByte-impl", "(S)B", "toByte", "", "toShort-impl", "(S)S", "toShort", "", "toInt-impl", "(S)I", "toInt", "", "toLong-impl", "(S)J", "toLong", "", "toFloat-impl", "(S)F", "toFloat", "", "toDouble-impl", "(S)D", "toDouble", "toBits-impl", "toBits", "toRawBits-impl", "toRawBits", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "other", "compareTo-41bOqos", "(SS)I", "compareTo", "sign", "withSign-qCeQghg", "(SS)S", "withSign", "absoluteValue-slo4al4", "absoluteValue", "round-slo4al4", HardwareList.VALUE_LCD_EXTERIOR_ROUND, "ceil-slo4al4", "ceil", "floor-slo4al4", "floor", "trunc-slo4al4", "trunc", "", "isNaN-impl", "(S)Z", "isNaN", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "isNormalized-impl", "isNormalized", "toHexString-impl", "toHexString", "hashCode-impl", "hashCode", "", "equals-impl", "(SLjava/lang/Object;)Z", "equals", "halfValue", ExifInterface.LATITUDE_SOUTH, "getHalfValue", "()S", "getSign-slo4al4", "getExponent-impl", "exponent", "getSignificand-impl", "significand", "value", "constructor-impl", "(F)S", "(D)S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
@JvmInline
public final class Float16 implements Comparable<Float16> {
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final short Epsilon = m1307constructorimpl((short) 5120);
    private static final short LowestValue = m1307constructorimpl((short) -1025);
    private static final short MaxValue = m1307constructorimpl((short) 31743);
    private static final short MinNormal = m1307constructorimpl((short) 1024);
    private static final short MinValue = m1307constructorimpl((short) 1);
    private static final short NaN = m1307constructorimpl((short) 32256);
    private static final short NegativeInfinity = m1307constructorimpl((short) -1024);
    private static final short NegativeZero = m1307constructorimpl(ShortCompanionObject.MIN_VALUE);
    private static final short PositiveInfinity = m1307constructorimpl((short) 31744);
    private static final short PositiveZero = m1307constructorimpl((short) 0);
    private static final short One = m1306constructorimpl(1.0f);
    private static final short NegativeOne = m1306constructorimpl(-1.0f);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\"\u0010\n\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\"\u0010\u001e\u001a\u00020\t8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010!R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010!R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010!R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010!R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010!R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010!R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010!R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010!R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010!R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010!R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010!R\u0016\u00102\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010!R\u0016\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010!R\u001f\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b4\u0010\u000bR\u001f\u00105\u001a\u00020\t8\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b5\u0010\u000bR\u0016\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "", "value", "", "toCompareValue", "", "f", "floatToHalf", "Landroidx/compose/ui/graphics/Float16;", "Epsilon", ExifInterface.LATITUDE_SOUTH, "getEpsilon-slo4al4", "()S", "LowestValue", "getLowestValue-slo4al4", RenderingControl.MAXVALUE, "getMaxValue-slo4al4", "MinNormal", "getMinNormal-slo4al4", RenderingControl.MINVALUE, "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "FP16_COMBINED", LogUtil.I, "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "F", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "MaxExponent", "MinExponent", "NegativeOne", "One", "Size", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f) {
            int i;
            int i2;
            int iFloatToRawIntBits = Float.floatToRawIntBits(f);
            int i3 = iFloatToRawIntBits >>> 31;
            int i4 = (iFloatToRawIntBits >>> 23) & 255;
            int i5 = iFloatToRawIntBits & 8388607;
            int i6 = 0;
            if (i4 == 255) {
                i = i5 != 0 ? 512 : 0;
                i6 = 31;
            } else {
                int i7 = (i4 - 127) + 15;
                if (i7 >= 31) {
                    i = 0;
                    i6 = 49;
                } else {
                    if (i7 > 0) {
                        int i8 = i5 >> 13;
                        if ((i5 & 4096) != 0) {
                            i2 = (((i7 << 10) | i8) + 1) | (i3 << 15);
                        } else {
                            i = i8;
                            i6 = i7;
                        }
                        return (short) i2;
                    }
                    if (i7 < -10) {
                        i = 0;
                    } else {
                        int i9 = (i5 | 8388608) >> (1 - i7);
                        if ((i9 & 4096) != 0) {
                            i9 += 8192;
                        }
                        i = i9 >> 13;
                    }
                }
            }
            i2 = i | (i3 << 15) | (i6 << 10);
            return (short) i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short value) {
            return (value & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (value & UShort.MAX_VALUE) : value & UShort.MAX_VALUE;
        }

        /* JADX INFO: renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m1334getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* JADX INFO: renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m1335getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* JADX INFO: renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m1336getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* JADX INFO: renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m1337getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* JADX INFO: renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m1338getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* JADX INFO: renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m1339getNaNslo4al4() {
            return Float16.NaN;
        }

        /* JADX INFO: renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m1340getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* JADX INFO: renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m1341getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* JADX INFO: renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m1342getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* JADX INFO: renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m1343getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }
    }

    static {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    }

    private /* synthetic */ Float16(short s) {
        this.halfValue = s;
    }

    /* JADX INFO: renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m1301absoluteValueslo4al4(short s) {
        return m1307constructorimpl((short) (s & Short.MAX_VALUE));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m1302boximpl(short s) {
        return new Float16(s);
    }

    /* JADX INFO: renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m1303ceilslo4al4(short s) {
        int i = s & UShort.MAX_VALUE;
        int i2 = i & FP16_COMBINED;
        if (i2 < 15360) {
            i = ((-((~(i >> 15)) & (i2 == 0 ? 0 : 1))) & 15360) | (32768 & i);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + (((i >> 15) - 1) & i3)) & (~i3);
        }
        return m1307constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m1306constructorimpl(float f) {
        return m1307constructorimpl(INSTANCE.floatToHalf(f));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m1307constructorimpl(short s) {
        return s;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1308equalsimpl(short s, Object obj) {
        return (obj instanceof Float16) && s == ((Float16) obj).m1333unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1309equalsimpl0(short s, short s2) {
        return s == s2;
    }

    /* JADX INFO: renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m1310floorslo4al4(short s) {
        int i = s & UShort.MAX_VALUE;
        int i2 = i & FP16_COMBINED;
        if (i2 < 15360) {
            i = ((i <= 32768 ? 0 : 65535) & 15360) | (i & 32768);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + ((-(i >> 15)) & i3)) & (~i3);
        }
        return m1307constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: getExponent-impl, reason: not valid java name */
    public static final int m1311getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* JADX INFO: renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m1312getSignslo4al4(short s) {
        if (m1317isNaNimpl(s)) {
            return NaN;
        }
        if (m1304compareTo41bOqos(s, NegativeZero) < 0) {
            return NegativeOne;
        }
        return m1304compareTo41bOqos(s, PositiveZero) > 0 ? One : s;
    }

    /* JADX INFO: renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m1313getSignificandimpl(short s) {
        return s & 1023;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1314hashCodeimpl(short s) {
        return s;
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1315isFiniteimpl(short s) {
        return (s & Short.MAX_VALUE) != FP16_EXPONENT_MAX;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1316isInfiniteimpl(short s) {
        return (s & Short.MAX_VALUE) == FP16_EXPONENT_MAX;
    }

    /* JADX INFO: renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m1317isNaNimpl(short s) {
        return (s & Short.MAX_VALUE) > FP16_EXPONENT_MAX;
    }

    /* JADX INFO: renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m1318isNormalizedimpl(short s) {
        int i = s & FP16_EXPONENT_MAX;
        return (i == 0 || i == FP16_EXPONENT_MAX) ? false : true;
    }

    /* JADX INFO: renamed from: round-slo4al4, reason: not valid java name */
    public static final short m1319roundslo4al4(short s) {
        int i = s & UShort.MAX_VALUE;
        int i2 = i & FP16_COMBINED;
        if (i2 < 15360) {
            i = (i & 32768) | ((i2 < 14336 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = 25 - (i2 >> 10);
            i = (i + (1 << (i3 - 1))) & (~((1 << i3) - 1));
        }
        return m1307constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: toBits-impl, reason: not valid java name */
    public static final int m1320toBitsimpl(short s) {
        return m1317isNaNimpl(s) ? NaN : s & UShort.MAX_VALUE;
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    public static final byte m1321toByteimpl(short s) {
        return (byte) m1323toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1322toDoubleimpl(short s) {
        return m1323toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    public static final float m1323toFloatimpl(short s) {
        int i;
        int i2 = s & UShort.MAX_VALUE;
        int i3 = 32768 & i2;
        int i4 = (i2 >>> 10) & 31;
        int i5 = i2 & 1023;
        int i6 = 0;
        if (i4 != 0) {
            int i7 = i5 << 13;
            if (i4 == 31) {
                if (i7 != 0) {
                    i7 |= 4194304;
                }
                i = i7;
                i6 = 255;
            } else {
                i6 = (i4 - 15) + 127;
                i = i7;
            }
        } else {
            if (i5 != 0) {
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                float fIntBitsToFloat = Float.intBitsToFloat(i5 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
                return i3 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i = 0;
        }
        int i8 = i | (i3 << 16) | (i6 << 23);
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i8);
    }

    @NotNull
    /* JADX INFO: renamed from: toHexString-impl, reason: not valid java name */
    public static final String m1324toHexStringimpl(short s) {
        StringBuilder sb = new StringBuilder();
        int i = s & UShort.MAX_VALUE;
        int i2 = i >>> 15;
        int i3 = (i >>> 10) & 31;
        int i4 = i & 1023;
        if (i3 != 31) {
            if (i2 == 1) {
                sb.append('-');
            }
            if (i3 != 0) {
                sb.append("0x1.");
                sb.append(new Regex("0{2,}$").replaceFirst(Integer.toString(i4, a.checkRadix(16)), ""));
                sb.append('p');
                sb.append(String.valueOf(i3 - 15));
            } else if (i4 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                sb.append(new Regex("0{2,}$").replaceFirst(Integer.toString(i4, a.checkRadix(16)), ""));
                sb.append("p-14");
            }
        } else if (i4 == 0) {
            if (i2 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m1325toIntimpl(short s) {
        return (int) m1323toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m1326toLongimpl(short s) {
        return (long) m1323toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m1327toRawBitsimpl(short s) {
        return s & UShort.MAX_VALUE;
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    public static final short m1328toShortimpl(short s) {
        return (short) m1323toFloatimpl(s);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1329toStringimpl(short s) {
        return String.valueOf(m1323toFloatimpl(s));
    }

    /* JADX INFO: renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m1330truncslo4al4(short s) {
        int i;
        int i2 = s & UShort.MAX_VALUE;
        int i3 = i2 & FP16_COMBINED;
        if (i3 >= 15360) {
            i = i3 < 25600 ? ~((1 << (25 - (i3 >> 10))) - 1) : 32768;
            return m1307constructorimpl((short) i2);
        }
        i2 &= i;
        return m1307constructorimpl((short) i2);
    }

    /* JADX INFO: renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m1331withSignqCeQghg(short s, short s2) {
        return m1307constructorimpl((short) ((s & Short.MAX_VALUE) | (s2 & ShortCompanionObject.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m1332compareTo41bOqos(float16.m1333unboximpl());
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m1332compareTo41bOqos(short s) {
        return m1304compareTo41bOqos(this.halfValue, s);
    }

    public boolean equals(Object obj) {
        return m1308equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m1314hashCodeimpl(this.halfValue);
    }

    @NotNull
    public String toString() {
        return m1329toStringimpl(this.halfValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m1333unboximpl() {
        return this.halfValue;
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m1304compareTo41bOqos(short s, short s2) {
        if (m1317isNaNimpl(s)) {
            return !m1317isNaNimpl(s2) ? 1 : 0;
        }
        if (m1317isNaNimpl(s2)) {
            return -1;
        }
        Companion companion = INSTANCE;
        return Intrinsics.compare(companion.toCompareValue(s), companion.toCompareValue(s2));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m1305constructorimpl(double d) {
        return m1306constructorimpl((float) d);
    }
}
