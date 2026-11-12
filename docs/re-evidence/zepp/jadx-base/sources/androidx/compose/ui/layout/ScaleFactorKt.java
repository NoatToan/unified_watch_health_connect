package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a+\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u0010\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0010\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0087\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u000f\u001a\"\u0010\u0014\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u000f\u001a-\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"$\u0010 \u001a\u00020\u001b*\u00020\u00038Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"$\u0010#\u001a\u00020\u001b*\u00020\u00038Æ\u0002@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001d\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", "roundToTenths", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "size", "times-m-w2e94", "div-UQTWf7w", b.q, "start", Command.STOP, "fraction", "lerp--bDIf60", "(JJF)J", "lerp", "", "isSpecified-FK8aYYs", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "isUnspecified-FK8aYYs", "isUnspecified-FK8aYYs$annotations", "isUnspecified", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m2519constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m2533divUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m1052getWidthimpl(j) / ScaleFactor.m2525getScaleXimpl(j2), Size.m1049getHeightimpl(j) / ScaleFactor.m2526getScaleYimpl(j2));
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m2534isSpecifiedFK8aYYs(long j) {
        return j != ScaleFactor.Companion.m2532getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m2535isSpecifiedFK8aYYs$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m2536isUnspecifiedFK8aYYs(long j) {
        return j == ScaleFactor.Companion.m2532getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m2537isUnspecifiedFK8aYYs$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m2538lerpbDIf60(long j, long j2, float f) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m2525getScaleXimpl(j), ScaleFactor.m2525getScaleXimpl(j2), f), MathHelpersKt.lerp(ScaleFactor.m2526getScaleYimpl(j), ScaleFactor.m2526getScaleYimpl(j2), f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f) {
        float f2 = 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        return i / f2;
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m2539takeOrElseoyDd2qo(long j, @NotNull Function0<ScaleFactor> function0) {
        return (j > ScaleFactor.Companion.m2532getUnspecified_hLwfpc() ? 1 : (j == ScaleFactor.Companion.m2532getUnspecified_hLwfpc() ? 0 : -1)) != 0 ? j : function0.invoke().m2530unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m2540timesUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m1052getWidthimpl(j) * ScaleFactor.m2525getScaleXimpl(j2), Size.m1049getHeightimpl(j) * ScaleFactor.m2526getScaleYimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m2541timesmw2e94(long j, long j2) {
        return m2540timesUQTWf7w(j2, j);
    }
}
