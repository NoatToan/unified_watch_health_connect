package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "timestamp", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "upIndex", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "createPointerInputEventData-VnAYq1g", "(Landroidx/compose/ui/input/pointer/PositionCalculator;JJLandroid/view/MotionEvent;ILjava/lang/Integer;)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "createPointerInputEventData", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class MotionEventAdapter_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createPointerInputEventData-VnAYq1g, reason: not valid java name */
    public static final PointerInputEventData m2370createPointerInputEventDataVnAYq1g(PositionCalculator positionCalculator, long j, long j2, MotionEvent motionEvent, int i, Integer num) {
        long jMo2436screenToLocalMKHz9U;
        long jMo2435localToScreenMKHz9U;
        int iM2434getUnknownT8wyACA;
        long jOffset = OffsetKt.Offset(motionEvent.getX(i), motionEvent.getY(i));
        if (i == 0) {
            long jOffset2 = OffsetKt.Offset(motionEvent.getRawX(), motionEvent.getRawY());
            jMo2435localToScreenMKHz9U = jOffset2;
            jMo2436screenToLocalMKHz9U = positionCalculator.mo2436screenToLocalMKHz9U(jOffset2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            long jM2371toRawOffsetdBAh8RU = MotionEventHelper.INSTANCE.m2371toRawOffsetdBAh8RU(motionEvent, i);
            jMo2435localToScreenMKHz9U = jM2371toRawOffsetdBAh8RU;
            jMo2436screenToLocalMKHz9U = positionCalculator.mo2436screenToLocalMKHz9U(jM2371toRawOffsetdBAh8RU);
        } else {
            jMo2436screenToLocalMKHz9U = jOffset;
            jMo2435localToScreenMKHz9U = positionCalculator.mo2435localToScreenMKHz9U(jOffset);
        }
        int toolType = motionEvent.getToolType(i);
        if (toolType == 0) {
            iM2434getUnknownT8wyACA = PointerType.INSTANCE.m2434getUnknownT8wyACA();
        } else if (toolType == 1) {
            iM2434getUnknownT8wyACA = PointerType.INSTANCE.m2433getTouchT8wyACA();
        } else if (toolType == 2) {
            iM2434getUnknownT8wyACA = PointerType.INSTANCE.m2432getStylusT8wyACA();
        } else if (toolType != 3) {
            iM2434getUnknownT8wyACA = toolType != 4 ? PointerType.INSTANCE.m2434getUnknownT8wyACA() : PointerType.INSTANCE.m2430getEraserT8wyACA();
        } else {
            iM2434getUnknownT8wyACA = PointerType.INSTANCE.m2431getMouseT8wyACA();
        }
        return new PointerInputEventData(j, j2, jMo2435localToScreenMKHz9U, jMo2436screenToLocalMKHz9U, num == null || i != num.intValue(), iM2434getUnknownT8wyACA, null);
    }
}
