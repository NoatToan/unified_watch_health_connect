package androidx.compose.ui.graphics;

import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.fitness.data.WorkoutExercises;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\r\u001a\u00020\n*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "m1", "", WorkoutExercises.ROW, "m2", "column", "", "dot-p89u6pk", "([FI[FI)F", b.x0, "", "isIdentity-58bKbWc", "([F)Z", "isIdentity", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class MatrixKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    public static final float m1399dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    /* JADX INFO: renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m1400isIdentity58bKbWc(@NotNull float[] fArr) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (!(fArr[(i * 4) + i3] == (i == i3 ? 1.0f : 0.0f))) {
                    return false;
                }
                if (i4 > 3) {
                    break;
                }
                i3 = i4;
            }
            if (i2 > 3) {
                return true;
            }
            i = i2;
        }
    }
}
