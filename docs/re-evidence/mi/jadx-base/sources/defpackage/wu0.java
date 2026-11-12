package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class wu0 implements kgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Range<Integer> f38350a;

    public wu0(vf3 vf3Var) {
        this.f38350a = d((Range[]) vf3Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    public static boolean c(vf3 vf3Var) {
        Integer num = (Integer) vf3Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public final Range<Integer> a(Range<Integer> range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    public Range<Integer> b() {
        return this.f38350a;
    }

    public final Range<Integer> d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> rangeA = a(range2);
                if (((Integer) rangeA.getUpper()).intValue() == 30 && (range == null || ((Integer) rangeA.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangeA;
                }
            }
        }
        return range;
    }
}
