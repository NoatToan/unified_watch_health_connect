package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/TapGestureEvent;", "", "<init>", "()V", "AllUp", "Cancel", "Down", "Up", "Landroidx/compose/foundation/gestures/TapGestureEvent$Down;", "Landroidx/compose/foundation/gestures/TapGestureEvent$Up;", "Landroidx/compose/foundation/gestures/TapGestureEvent$AllUp;", "Landroidx/compose/foundation/gestures/TapGestureEvent$Cancel;", "foundation_release"}, k = 1, mv = {1, 5, 1})
abstract class TapGestureEvent {

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/TapGestureEvent$AllUp;", "Landroidx/compose/foundation/gestures/TapGestureEvent;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    public static final class AllUp extends TapGestureEvent {
        public static final int $stable = 0;

        @NotNull
        public static final AllUp INSTANCE = new AllUp();

        private AllUp() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/TapGestureEvent$Cancel;", "Landroidx/compose/foundation/gestures/TapGestureEvent;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    public static final class Cancel extends TapGestureEvent {
        public static final int $stable = 0;

        @NotNull
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/TapGestureEvent$Down;", "Landroidx/compose/foundation/gestures/TapGestureEvent;", "Landroidx/compose/ui/geometry/Offset;", "position", "J", "getPosition-F1C5BW0", "()J", "", "uptimeMillis", "getUptimeMillis", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    public static final class Down extends TapGestureEvent {
        public static final int $stable = 0;
        private final long position;
        private final long uptimeMillis;

        private Down(long j, long j2) {
            super(null);
            this.position = j;
            this.uptimeMillis = j2;
        }

        public /* synthetic */ Down(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
        public final long getPosition() {
            return this.position;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/TapGestureEvent$Up;", "Landroidx/compose/foundation/gestures/TapGestureEvent;", "Landroidx/compose/ui/geometry/Offset;", "position", "J", "getPosition-F1C5BW0", "()J", "", "uptimeMillis", "getUptimeMillis", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    public static final class Up extends TapGestureEvent {
        public static final int $stable = 0;
        private final long position;
        private final long uptimeMillis;

        private Up(long j, long j2) {
            super(null);
            this.position = j;
            this.uptimeMillis = j2;
        }

        public /* synthetic */ Up(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
        public final long getPosition() {
            return this.position;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }
    }

    private TapGestureEvent() {
    }

    public /* synthetic */ TapGestureEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
