package androidx.compose.ui.input.pointer.util;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/util/Matrix;", "", "", WorkoutExercises.ROW, "col", "", "get", "value", "", WatchFaceArrivingEvent.CMD_SET, "Landroidx/compose/ui/input/pointer/util/Vector;", "getRow", "", MessengerShareContentUtility.ELEMENTS, "[Landroidx/compose/ui/input/pointer/util/Vector;", "rows", "cols", "<init>", "(II)V", "ui_release"}, k = 1, mv = {1, 5, 1})
final class Matrix {

    @NotNull
    private final Vector[] elements;

    public Matrix(int i, int i2) {
        Vector[] vectorArr = new Vector[i];
        for (int i3 = 0; i3 < i; i3++) {
            vectorArr[i3] = new Vector(i2);
        }
        this.elements = vectorArr;
    }

    public final float get(int row, int col) {
        return this.elements[row].get(col);
    }

    @NotNull
    public final Vector getRow(int row) {
        return this.elements[row];
    }

    public final void set(int row, int col, float value) {
        this.elements[row].set(col, value);
    }
}
