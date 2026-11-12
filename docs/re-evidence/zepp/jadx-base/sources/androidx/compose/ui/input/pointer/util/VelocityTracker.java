package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.VelocityKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000f\u001a\u00020\fø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0010\u001a\u00020\bR\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "getVelocityEstimate", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "calculateVelocity", "resetTracking", "", "Landroidx/compose/ui/input/pointer/util/PointAtTime;", "samples", "[Landroidx/compose/ui/input/pointer/util/PointAtTime;", "", "index", LogUtil.I, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class VelocityTracker {
    public static final int $stable = 8;
    private int index;

    @NotNull
    private final PointAtTime[] samples;

    public VelocityTracker() {
        PointAtTime[] pointAtTimeArr = new PointAtTime[20];
        for (int i = 0; i < 20; i++) {
            pointAtTimeArr[i] = null;
        }
        this.samples = pointAtTimeArr;
    }

    private final VelocityEstimate getVelocityEstimate() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = this.index;
        PointAtTime pointAtTime = this.samples[i];
        if (pointAtTime == null) {
            return VelocityEstimate.INSTANCE.getNone();
        }
        int i2 = 0;
        PointAtTime pointAtTime2 = pointAtTime;
        while (true) {
            PointAtTime pointAtTime3 = this.samples[i];
            if (pointAtTime3 == null) {
                break;
            }
            float time = pointAtTime.getTime() - pointAtTime3.getTime();
            float fAbs = Math.abs(pointAtTime3.getTime() - pointAtTime2.getTime());
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            long jM2449getPointF1C5BW0 = pointAtTime3.m2449getPointF1C5BW0();
            arrayList.add(Float.valueOf(Offset.m983getXimpl(jM2449getPointF1C5BW0)));
            arrayList2.add(Float.valueOf(Offset.m984getYimpl(jM2449getPointF1C5BW0)));
            arrayList3.add(Float.valueOf(-time));
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                pointAtTime2 = pointAtTime3;
                break;
            }
            pointAtTime2 = pointAtTime3;
        }
        if (i2 < 3) {
            return new VelocityEstimate(Offset.INSTANCE.m999getZeroF1C5BW0(), 1.0f, pointAtTime.getTime() - pointAtTime2.getTime(), Offset.m987minusMKHz9U(pointAtTime.m2449getPointF1C5BW0(), pointAtTime2.m2449getPointF1C5BW0()), null);
        }
        try {
            PolynomialFit polynomialFitPolyFitLeastSquares = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList, 2);
            PolynomialFit polynomialFitPolyFitLeastSquares2 = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList2, 2);
            float f = 1000;
            return new VelocityEstimate(OffsetKt.Offset(polynomialFitPolyFitLeastSquares.getCoefficients().get(1).floatValue() * f, polynomialFitPolyFitLeastSquares2.getCoefficients().get(1).floatValue() * f), polynomialFitPolyFitLeastSquares.getConfidence() * polynomialFitPolyFitLeastSquares2.getConfidence(), pointAtTime.getTime() - pointAtTime2.getTime(), Offset.m987minusMKHz9U(pointAtTime.m2449getPointF1C5BW0(), pointAtTime2.m2449getPointF1C5BW0()), null);
        } catch (IllegalArgumentException unused) {
            return VelocityEstimate.INSTANCE.getNone();
        }
    }

    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m2456addPositionUv8p0NA(long timeMillis, long position) {
        int i = (this.index + 1) % 20;
        this.index = i;
        this.samples[i] = new PointAtTime(position, timeMillis, null);
    }

    /* JADX INFO: renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m2457calculateVelocity9UxMQ8M() {
        long jM2455getPixelsPerSecondF1C5BW0 = getVelocityEstimate().m2455getPixelsPerSecondF1C5BW0();
        return VelocityKt.Velocity(Offset.m983getXimpl(jM2455getPixelsPerSecondF1C5BW0), Offset.m984getYimpl(jM2455getPixelsPerSecondF1C5BW0));
    }

    public final void resetTracking() {
        ArraysKt___ArraysJvmKt.fill$default(this.samples, (Object) null, 0, 0, 6, (Object) null);
    }
}
