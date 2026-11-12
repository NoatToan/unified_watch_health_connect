package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010\u001bJ;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R1\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u00148\u0000@\u0001X\u0081\u0004ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "downIndex", "upIndex", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "createPointerInputEventData", "(Landroidx/compose/ui/input/pointer/PositionCalculator;Landroid/view/MotionEvent;ILjava/lang/Integer;Ljava/lang/Integer;)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent$ui_release", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent", "", "nextId", "J", "", "Landroidx/compose/ui/input/pointer/PointerId;", "motionEventToComposePointerIdMap", "Ljava/util/Map;", "getMotionEventToComposePointerIdMap$ui_release", "()Ljava/util/Map;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "()V", "", "pointers", "Ljava/util/List;", "<init>", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class MotionEventAdapter {
    private long nextId;

    @NotNull
    private final Map<Integer, PointerId> motionEventToComposePointerIdMap = new LinkedHashMap();

    @NotNull
    private final List<PointerInputEventData> pointers = new ArrayList();

    private final PointerInputEventData createPointerInputEventData(PositionCalculator positionCalculator, MotionEvent motionEvent, int index, Integer downIndex, Integer upIndex) {
        PointerId pointerIdRemove;
        int pointerId = motionEvent.getPointerId(index);
        if (downIndex != null && index == downIndex.intValue()) {
            long j = this.nextId;
            this.nextId = 1 + j;
            pointerIdRemove = PointerId.m2374boximpl(PointerId.m2375constructorimpl(j));
            getMotionEventToComposePointerIdMap$ui_release().put(Integer.valueOf(pointerId), PointerId.m2374boximpl(pointerIdRemove.m2380unboximpl()));
        } else {
            pointerIdRemove = (upIndex != null && index == upIndex.intValue()) ? this.motionEventToComposePointerIdMap.remove(Integer.valueOf(pointerId)) : this.motionEventToComposePointerIdMap.get(Integer.valueOf(pointerId));
        }
        if (pointerIdRemove != null) {
            return MotionEventAdapter_androidKt.m2370createPointerInputEventDataVnAYq1g(positionCalculator, pointerIdRemove.m2380unboximpl(), motionEvent.getEventTime(), motionEvent, index, upIndex);
        }
        throw new IllegalStateException("Compose assumes that all pointer ids in MotionEvents are first provided alongside ACTION_DOWN or ACTION_POINTER_DOWN.  This appears not to have been the case");
    }

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    @Nullable
    public final PointerInputEvent convertToPointerInputEvent$ui_release(@NotNull MotionEvent motionEvent, @NotNull PositionCalculator positionCalculator) {
        Integer numValueOf;
        Integer numValueOf2 = null;
        if (motionEvent.getActionMasked() == 3) {
            this.motionEventToComposePointerIdMap.clear();
            return null;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            numValueOf = actionMasked != 5 ? null : Integer.valueOf(motionEvent.getActionIndex());
        } else {
            numValueOf = 0;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 1) {
            numValueOf2 = 0;
        } else if (actionMasked2 == 6) {
            numValueOf2 = Integer.valueOf(motionEvent.getActionIndex());
        }
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                this.pointers.add(createPointerInputEventData(positionCalculator, motionEvent, i, numValueOf, numValueOf2));
                if (i2 >= pointerCount) {
                    break;
                }
                i = i2;
            }
        }
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    @NotNull
    public final Map<Integer, PointerId> getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }
}
