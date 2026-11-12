package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "parent", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setParent", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "self", "getSelf", "setSelf", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
final class ParentWrapperNestedScrollConnection implements NestedScrollConnection {

    @NotNull
    private NestedScrollConnection parent;

    @NotNull
    private NestedScrollConnection self;

    public ParentWrapperNestedScrollConnection(@NotNull NestedScrollConnection nestedScrollConnection, @NotNull NestedScrollConnection nestedScrollConnection2) {
        this.parent = nestedScrollConnection;
        this.self = nestedScrollConnection2;
    }

    @NotNull
    public final NestedScrollConnection getParent() {
        return this.parent;
    }

    @NotNull
    public final NestedScrollConnection getSelf() {
        return this.self;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo197onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        ParentWrapperNestedScrollConnection$onPostFling$1 parentWrapperNestedScrollConnection$onPostFling$1;
        long j3;
        long j4;
        ParentWrapperNestedScrollConnection parentWrapperNestedScrollConnection;
        long j5;
        if (continuation instanceof ParentWrapperNestedScrollConnection$onPostFling$1) {
            parentWrapperNestedScrollConnection$onPostFling$1 = (ParentWrapperNestedScrollConnection$onPostFling$1) continuation;
            int i = parentWrapperNestedScrollConnection$onPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                parentWrapperNestedScrollConnection$onPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                parentWrapperNestedScrollConnection$onPostFling$1 = new ParentWrapperNestedScrollConnection$onPostFling$1(this, continuation);
            }
        } else {
            parentWrapperNestedScrollConnection$onPostFling$1 = new ParentWrapperNestedScrollConnection$onPostFling$1(this, continuation);
        }
        Object objMo197onPostFlingRZ2iAVY = parentWrapperNestedScrollConnection$onPostFling$1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = parentWrapperNestedScrollConnection$onPostFling$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                long j6 = parentWrapperNestedScrollConnection$onPostFling$1.J$1;
                long j7 = parentWrapperNestedScrollConnection$onPostFling$1.J$0;
                parentWrapperNestedScrollConnection = (ParentWrapperNestedScrollConnection) parentWrapperNestedScrollConnection$onPostFling$1.L$0;
                ResultKt.throwOnFailure(objMo197onPostFlingRZ2iAVY);
                j4 = j6;
                j3 = j7;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j5 = parentWrapperNestedScrollConnection$onPostFling$1.J$0;
                ResultKt.throwOnFailure(objMo197onPostFlingRZ2iAVY);
            }
            return Velocity.m3141boximpl(Velocity.m3154plusAH228Gc(j5, ((Velocity) objMo197onPostFlingRZ2iAVY).getPackedValue()));
        }
        ResultKt.throwOnFailure(objMo197onPostFlingRZ2iAVY);
        NestedScrollConnection self = getSelf();
        parentWrapperNestedScrollConnection$onPostFling$1.L$0 = this;
        j3 = j;
        parentWrapperNestedScrollConnection$onPostFling$1.J$0 = j3;
        j4 = j2;
        parentWrapperNestedScrollConnection$onPostFling$1.J$1 = j4;
        parentWrapperNestedScrollConnection$onPostFling$1.label = 1;
        objMo197onPostFlingRZ2iAVY = self.mo197onPostFlingRZ2iAVY(j, j2, parentWrapperNestedScrollConnection$onPostFling$1);
        if (objMo197onPostFlingRZ2iAVY == coroutine_suspended) {
            return coroutine_suspended;
        }
        parentWrapperNestedScrollConnection = this;
        long packedValue = ((Velocity) objMo197onPostFlingRZ2iAVY).getPackedValue();
        NestedScrollConnection parent = parentWrapperNestedScrollConnection.getParent();
        long jM3154plusAH228Gc = Velocity.m3154plusAH228Gc(j3, packedValue);
        long jM3153minusAH228Gc = Velocity.m3153minusAH228Gc(j4, packedValue);
        parentWrapperNestedScrollConnection$onPostFling$1.L$0 = null;
        parentWrapperNestedScrollConnection$onPostFling$1.J$0 = packedValue;
        parentWrapperNestedScrollConnection$onPostFling$1.label = 2;
        objMo197onPostFlingRZ2iAVY = parent.mo197onPostFlingRZ2iAVY(jM3154plusAH228Gc, jM3153minusAH228Gc, parentWrapperNestedScrollConnection$onPostFling$1);
        if (objMo197onPostFlingRZ2iAVY == coroutine_suspended) {
            return coroutine_suspended;
        }
        j5 = packedValue;
        return Velocity.m3141boximpl(Velocity.m3154plusAH228Gc(j5, ((Velocity) objMo197onPostFlingRZ2iAVY).getPackedValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo198onPostScrollDzOQY0M(long consumed, long available, int source) {
        long jMo198onPostScrollDzOQY0M = this.self.mo198onPostScrollDzOQY0M(consumed, available, source);
        return Offset.m988plusMKHz9U(jMo198onPostScrollDzOQY0M, this.parent.mo198onPostScrollDzOQY0M(Offset.m988plusMKHz9U(consumed, jMo198onPostScrollDzOQY0M), Offset.m987minusMKHz9U(available, jMo198onPostScrollDzOQY0M), source));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo199onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        ParentWrapperNestedScrollConnection$onPreFling$1 parentWrapperNestedScrollConnection$onPreFling$1;
        ParentWrapperNestedScrollConnection parentWrapperNestedScrollConnection;
        long j2;
        if (continuation instanceof ParentWrapperNestedScrollConnection$onPreFling$1) {
            parentWrapperNestedScrollConnection$onPreFling$1 = (ParentWrapperNestedScrollConnection$onPreFling$1) continuation;
            int i = parentWrapperNestedScrollConnection$onPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                parentWrapperNestedScrollConnection$onPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                parentWrapperNestedScrollConnection$onPreFling$1 = new ParentWrapperNestedScrollConnection$onPreFling$1(this, continuation);
            }
        } else {
            parentWrapperNestedScrollConnection$onPreFling$1 = new ParentWrapperNestedScrollConnection$onPreFling$1(this, continuation);
        }
        Object objMo199onPreFlingQWom1Mo = parentWrapperNestedScrollConnection$onPreFling$1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = parentWrapperNestedScrollConnection$onPreFling$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j = parentWrapperNestedScrollConnection$onPreFling$1.J$0;
                parentWrapperNestedScrollConnection = (ParentWrapperNestedScrollConnection) parentWrapperNestedScrollConnection$onPreFling$1.L$0;
                ResultKt.throwOnFailure(objMo199onPreFlingQWom1Mo);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = parentWrapperNestedScrollConnection$onPreFling$1.J$0;
                ResultKt.throwOnFailure(objMo199onPreFlingQWom1Mo);
            }
            return Velocity.m3141boximpl(Velocity.m3154plusAH228Gc(j2, ((Velocity) objMo199onPreFlingQWom1Mo).getPackedValue()));
        }
        ResultKt.throwOnFailure(objMo199onPreFlingQWom1Mo);
        NestedScrollConnection parent = getParent();
        parentWrapperNestedScrollConnection$onPreFling$1.L$0 = this;
        parentWrapperNestedScrollConnection$onPreFling$1.J$0 = j;
        parentWrapperNestedScrollConnection$onPreFling$1.label = 1;
        objMo199onPreFlingQWom1Mo = parent.mo199onPreFlingQWom1Mo(j, parentWrapperNestedScrollConnection$onPreFling$1);
        if (objMo199onPreFlingQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        parentWrapperNestedScrollConnection = this;
        long packedValue = ((Velocity) objMo199onPreFlingQWom1Mo).getPackedValue();
        NestedScrollConnection self = parentWrapperNestedScrollConnection.getSelf();
        long jM3153minusAH228Gc = Velocity.m3153minusAH228Gc(j, packedValue);
        parentWrapperNestedScrollConnection$onPreFling$1.L$0 = null;
        parentWrapperNestedScrollConnection$onPreFling$1.J$0 = packedValue;
        parentWrapperNestedScrollConnection$onPreFling$1.label = 2;
        objMo199onPreFlingQWom1Mo = self.mo199onPreFlingQWom1Mo(jM3153minusAH228Gc, parentWrapperNestedScrollConnection$onPreFling$1);
        if (objMo199onPreFlingQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        j2 = packedValue;
        return Velocity.m3141boximpl(Velocity.m3154plusAH228Gc(j2, ((Velocity) objMo199onPreFlingQWom1Mo).getPackedValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo200onPreScrollOzD1aCk(long available, int source) {
        long jMo200onPreScrollOzD1aCk = this.parent.mo200onPreScrollOzD1aCk(available, source);
        return Offset.m988plusMKHz9U(jMo200onPreScrollOzD1aCk, this.self.mo200onPreScrollOzD1aCk(Offset.m987minusMKHz9U(available, jMo200onPreScrollOzD1aCk), source));
    }

    public final void setParent(@NotNull NestedScrollConnection nestedScrollConnection) {
        this.parent = nestedScrollConnection;
    }

    public final void setSelf(@NotNull NestedScrollConnection nestedScrollConnection) {
        this.self = nestedScrollConnection;
    }
}
