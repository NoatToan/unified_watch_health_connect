package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\u001a+\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\b\u0010\f\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u000e\u001a&\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\t\u001a&\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\t\u001a*\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\"\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\t\u001a\"\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\t\u001a-\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b!\u0010\u0018\u001a%\u0010(\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b&\u0010'\u001a-\u0010\"\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020%2\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b)\u0010*\"$\u00100\u001a\u00020+*\u00020\u00008Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-\"$\u00103\u001a\u00020+*\u00020\u00008Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010-\"$\u00108\u001a\u00020\u0000*\u00020\r8Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105\"$\u00108\u001a\u00020\u0000*\u00020\u000b8Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b6\u0010:\u001a\u0004\b4\u00109\"$\u00108\u001a\u00020\u0000*\u00020\u00068Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b6\u0010/\u001a\u0004\b4\u0010;\"$\u0010>\u001a\u00020+*\u00020\u00008Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010-\"$\u0010D\u001a\u00020\u0000*\u00020?8Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010A\"$\u0010G\u001a\u00020\u0000*\u00020?8Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bF\u0010C\u001a\u0004\bE\u0010A\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse", "", "other", "times-3ABfNKs", "(FF)F", "times", "", "(DF)F", "", "(IF)F", "a", "b", "min-YgX7TsA", "min", "max-YgX7TsA", "max", "minimumValue", "maximumValue", "coerceIn-2z7ARbQ", "(FFF)F", "coerceIn", "coerceAtLeast-YgX7TsA", "coerceAtLeast", "coerceAtMost-YgX7TsA", "coerceAtMost", "start", Command.STOP, "fraction", "lerp-Md-fbLM", "lerp", "x", "y", "Landroidx/compose/ui/unit/DpOffset;", "DpOffset-YgX7TsA", "(FF)J", "DpOffset", "lerp-xhh869w", "(JJF)J", "", "isSpecified-0680j_4", "(F)Z", "isSpecified-0680j_4$annotations", "(F)V", "isSpecified", "isUnspecified-0680j_4", "isUnspecified-0680j_4$annotations", "isUnspecified", "getDp", "(I)F", "getDp$annotations", "(I)V", Constant.PAI_KEY_DAILY_PAI, "(D)F", "(D)V", "(F)F", "isFinite-0680j_4", "isFinite-0680j_4$annotations", "isFinite", "Landroidx/compose/ui/unit/DpRect;", "getWidth", "(Landroidx/compose/ui/unit/DpRect;)F", "getWidth$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getHeight", "getHeight$annotations", "height", "ui-unit_release"}, k = 2, mv = {1, 5, 1})
public final class DpKt {
    @Stable
    /* JADX INFO: renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m2986DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m3005constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m2987coerceAtLeastYgX7TsA(float f, float f2) {
        return Dp.m2965constructorimpl(e.coerceAtLeast(f, f2));
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m2988coerceAtMostYgX7TsA(float f, float f2) {
        return Dp.m2965constructorimpl(e.coerceAtMost(f, f2));
    }

    @Stable
    /* JADX INFO: renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m2989coerceIn2z7ARbQ(float f, float f2, float f3) {
        return Dp.m2965constructorimpl(e.coerceIn(f, f2, f3));
    }

    public static final float getDp(int i) {
        return Dp.m2965constructorimpl(i);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i) {
    }

    public static final float getHeight(@NotNull DpRect dpRect) {
        return Dp.m2965constructorimpl(dpRect.m3030getBottomD9Ej5fM() - dpRect.m3033getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final float getWidth(@NotNull DpRect dpRect) {
        return Dp.m2965constructorimpl(dpRect.m3032getRightD9Ej5fM() - dpRect.m3031getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* JADX INFO: renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m2990isFinite0680j_4(float f) {
        return !(f == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* JADX INFO: renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m2991isFinite0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m2992isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m2993isSpecified0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m2994isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m2995isUnspecified0680j_4$annotations(float f) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m2996lerpMdfbLM(float f, float f2, float f3) {
        return Dp.m2965constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m2997lerpxhh869w(long j, long j2, float f) {
        return m2986DpOffsetYgX7TsA(m2996lerpMdfbLM(DpOffset.m3010getXD9Ej5fM(j), DpOffset.m3010getXD9Ej5fM(j2), f), m2996lerpMdfbLM(DpOffset.m3012getYD9Ej5fM(j), DpOffset.m3012getYD9Ej5fM(j2), f));
    }

    @Stable
    /* JADX INFO: renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m2998maxYgX7TsA(float f, float f2) {
        return Dp.m2965constructorimpl(Math.max(f, f2));
    }

    @Stable
    /* JADX INFO: renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m2999minYgX7TsA(float f, float f2) {
        return Dp.m2965constructorimpl(Math.min(f, f2));
    }

    /* JADX INFO: renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m3000takeOrElseD5KLDUw(float f, @NotNull Function0<Dp> function0) {
        return Float.isNaN(f) ^ true ? f : function0.invoke().m2979unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m3002times3ABfNKs(float f, float f2) {
        return Dp.m2965constructorimpl(f * f2);
    }

    public static final float getDp(double d) {
        return Dp.m2965constructorimpl((float) d);
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m3001times3ABfNKs(double d, float f) {
        return Dp.m2965constructorimpl(((float) d) * f);
    }

    public static final float getDp(float f) {
        return Dp.m2965constructorimpl(f);
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m3003times3ABfNKs(int i, float f) {
        return Dp.m2965constructorimpl(i * f);
    }
}
