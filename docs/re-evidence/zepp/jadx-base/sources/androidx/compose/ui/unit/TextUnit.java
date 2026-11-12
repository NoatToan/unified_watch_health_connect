package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087@\u0018\u0000 12\u00020\u0001:\u00011B\u0014\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u001eø\u0001\u0000¢\u0006\u0004\b0\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\fH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\rJ!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\bJ!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\fH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\u00020\u001e8@@\u0001X\u0081\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0003R\u001c\u0010'\u001a\u00020%8F@\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010\u0003R\u0013\u0010*\u001a\u00020\u001a8F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010,\u001a\u00020\u001a8F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0013\u0010/\u001a\u00020\u00058F@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010.ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "unaryMinus-XSAIIZE", "(J)J", "unaryMinus", "", "other", "div-kPz2Gy4", "(JF)J", b.q, "", "(JD)J", "", "(JI)J", "times-kPz2Gy4", "times", "compareTo--R2X_6o", "(JJ)I", "compareTo", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "packedValue", "J", "getRawType-impl", "getRawType$annotations", "()V", "rawType", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "type", "isSp-impl", "(J)Z", "isSp", "isEm-impl", "isEm", "getValue-impl", "(J)F", "value", "constructor-impl", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1})
@JvmInline
public final class TextUnit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eR%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\b8\u0006@\u0007X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "", "Landroidx/compose/ui/unit/TextUnitType;", "TextUnitTypes", "[Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "Landroidx/compose/ui/unit/TextUnit;", "Unspecified", "J", "getUnspecified-XSAIIZE", "()J", "getUnspecified-XSAIIZE$annotations", "()V", "<init>", "ui-unit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3116getUnspecifiedXSAIIZE$annotations() {
        }

        @NotNull
        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m3117getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m3131boximpl(companion.m3140getUnspecifiedUIouoOA()), TextUnitType.m3131boximpl(companion.m3139getSpUIouoOA()), TextUnitType.m3131boximpl(companion.m3138getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m3096boximpl(long j) {
        return new TextUnit(j);
    }

    /* JADX INFO: renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m3097compareToR2X_6o(long j, long j2) {
        TextUnitKt.m3120checkArithmeticNB67dxo(j, j2);
        return Float.compare(m3106getValueimpl(j), m3106getValueimpl(j2));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3098constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m3100divkPz2Gy4(long j, float f) {
        TextUnitKt.m3119checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3104getRawTypeimpl(j), m3106getValueimpl(j) / f);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3102equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3103equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @PublishedApi
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* JADX INFO: renamed from: getRawType-impl, reason: not valid java name */
    public static final long m3104getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* JADX INFO: renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m3105getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m3104getRawTypeimpl(j) >>> 32)].getType();
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m3106getValueimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3107hashCodeimpl(long j) {
        return defpackage.b.a(j);
    }

    /* JADX INFO: renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m3108isEmimpl(long j) {
        return m3104getRawTypeimpl(j) == 8589934592L;
    }

    /* JADX INFO: renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m3109isSpimpl(long j) {
        return m3104getRawTypeimpl(j) == 4294967296L;
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m3111timeskPz2Gy4(long j, float f) {
        TextUnitKt.m3119checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3104getRawTypeimpl(j), m3106getValueimpl(j) * f);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3113toStringimpl(long j) {
        long jM3105getTypeUIouoOA = m3105getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3140getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3139getSpUIouoOA())) {
            return m3106getValueimpl(j) + ".sp";
        }
        if (!TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3138getEmUIouoOA())) {
            return "Invalid";
        }
        return m3106getValueimpl(j) + ".em";
    }

    /* JADX INFO: renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m3114unaryMinusXSAIIZE(long j) {
        TextUnitKt.m3119checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3104getRawTypeimpl(j), -m3106getValueimpl(j));
    }

    public boolean equals(Object obj) {
        return m3102equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3107hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m3113toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m3099divkPz2Gy4(long j, double d) {
        TextUnitKt.m3119checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3104getRawTypeimpl(j), (float) (((double) m3106getValueimpl(j)) / d));
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m3110timeskPz2Gy4(long j, double d) {
        TextUnitKt.m3119checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3104getRawTypeimpl(j), (float) (((double) m3106getValueimpl(j)) * d));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m3101divkPz2Gy4(long j, int i) {
        TextUnitKt.m3119checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3104getRawTypeimpl(j), m3106getValueimpl(j) / i);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m3112timeskPz2Gy4(long j, int i) {
        TextUnitKt.m3119checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3104getRawTypeimpl(j), m3106getValueimpl(j) * i);
    }
}
