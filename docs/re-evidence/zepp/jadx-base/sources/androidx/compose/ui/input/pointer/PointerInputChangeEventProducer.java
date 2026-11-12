package androidx.compose.ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bR%\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "produce", "", "clear", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "previousPointerInputData", "Ljava/util/Map;", "<init>", "()V", "PointerInputData", "ui_release"}, k = 1, mv = {1, 5, 1})
final class PointerInputChangeEventProducer {

    @NotNull
    private final Map<PointerId, PointerInputData> previousPointerInputData = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "", "uptime", "J", "getUptime", "()J", "Landroidx/compose/ui/geometry/Offset;", "positionOnScreen", "getPositionOnScreen-F1C5BW0", "", "down", "Z", "getDown", "()Z", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final long uptime;

        private PointerInputData(long j, long j2, boolean z) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
        }

        public /* synthetic */ PointerInputData(long j, long j2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name and from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        public final long getUptime() {
            return this.uptime;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    @NotNull
    public final InternalPointerEvent produce(@NotNull PointerInputEvent pointerInputEvent, @NotNull PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long jMo2436screenToLocalMKHz9U;
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size() - 1;
        if (size >= 0) {
            boolean z = false;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                PointerInputEventData pointerInputEventData = pointers.get(i);
                PointerInputData pointerInputData = this.previousPointerInputData.get(PointerId.m2374boximpl(pointerInputEventData.m2394getIdJ3iCeTQ()));
                if (pointerInputData == null) {
                    uptime = pointerInputEventData.getUptime();
                    jMo2436screenToLocalMKHz9U = pointerInputEventData.m2395getPositionF1C5BW0();
                    down = false;
                } else {
                    uptime = pointerInputData.getUptime();
                    down = pointerInputData.getDown();
                    jMo2436screenToLocalMKHz9U = positionCalculator.mo2436screenToLocalMKHz9U(pointerInputData.getPositionOnScreen());
                }
                linkedHashMap.put(PointerId.m2374boximpl(pointerInputEventData.m2394getIdJ3iCeTQ()), new PointerInputChange(pointerInputEventData.m2394getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m2395getPositionF1C5BW0(), pointerInputEventData.getDown(), uptime, jMo2436screenToLocalMKHz9U, down, new ConsumedData(z, z, 3, null), pointerInputEventData.m2397getTypeT8wyACA(), null));
                if (pointerInputEventData.getDown()) {
                    this.previousPointerInputData.put(PointerId.m2374boximpl(pointerInputEventData.m2394getIdJ3iCeTQ()), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m2396getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), null));
                } else {
                    this.previousPointerInputData.remove(PointerId.m2374boximpl(pointerInputEventData.m2394getIdJ3iCeTQ()));
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
                z = false;
            }
        }
        return new InternalPointerEvent(linkedHashMap, pointerInputEvent);
    }
}
