package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0001\u001a\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "NoOpConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class NestedScrollDelegatingWrapperKt {

    @NotNull
    private static final NestedScrollConnection NoOpConnection = new NestedScrollConnection() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapperKt$NoOpConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        public Object mo197onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
            return Velocity.m3141boximpl(Velocity.INSTANCE.m3161getZero9UxMQ8M());
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
        public long mo198onPostScrollDzOQY0M(long consumed, long available, int source) {
            return Offset.INSTANCE.m999getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* JADX INFO: renamed from: onPreFling-QWom1Mo */
        public Object mo199onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
            return Velocity.m3141boximpl(Velocity.INSTANCE.m3161getZero9UxMQ8M());
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
        public long mo200onPreScrollOzD1aCk(long available, int source) {
            return Offset.INSTANCE.m999getZeroF1C5BW0();
        }
    };
}
