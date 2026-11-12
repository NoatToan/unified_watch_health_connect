package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.huami.account.ui.areas.SelectAreaActivity;
import it.sauronsoftware.ftp4j.FTPCodes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020)\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b>\u0010?J\u001a\u0010\u0006\u001a\u00020\u0003*\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\f\u001a\u00020\u0002*\u00020\u0003ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u0002*\u00020\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000bJ\n\u0010\u000e\u001a\u00020\u0002*\u00020\u0002J'\u0010\u0015\u001a\u00020\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u001b\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0019\u0010%\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010*\u001a\u00020)8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u00105\u001a\u0002048\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010:\u001a\u0002098\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "Landroidx/compose/ui/unit/Velocity;", "toVelocity-adjELrA", "toVelocity", "toFloat-k-4lQ0M", "(J)F", "toFloat", "toFloat-TH1AsA0", "reverseIfNeeded", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollDelta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchScroll-Tj5QQXo", "(Landroidx/compose/foundation/gestures/ScrollScope;FI)F", "dispatchScroll", "scroll", "performRawScroll-MK-Hz9U", "(J)J", "performRawScroll", "performRelocationScroll-MK-Hz9U", "performRelocationScroll", "axisVelocity", "", "onDragStopped", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFlingAnimation", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "", "reverseDirection", "Z", "getReverseDirection", "()Z", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/runtime/State;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
final class ScrollingLogic {

    @NotNull
    private final FlingBehavior flingBehavior;

    @NotNull
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;

    @NotNull
    private final Orientation orientation;
    private final boolean reverseDirection;

    @NotNull
    private final ScrollableState scrollableState;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0, 0, 1, 1}, l = {SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 225, FTPCodes.DATA_CONNECTION_CLOSING}, m = "onDragStopped", n = {"this", "velocity", "this", "available"}, s = {"L$0", "J$0", "L$0", "J$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollingLogic.this.onDragStopped(0.0f, this);
        }
    }

    public ScrollingLogic(@NotNull Orientation orientation, boolean z, @NotNull State<NestedScrollDispatcher> state, @NotNull ScrollableState scrollableState, @NotNull FlingBehavior flingBehavior) {
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = state;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
    }

    /* JADX INFO: renamed from: dispatchScroll-Tj5QQXo, reason: not valid java name */
    public final float m201dispatchScrollTj5QQXo(@NotNull ScrollScope scrollScope, float f, int i) {
        NestedScrollDispatcher value = this.nestedScrollDispatcher.getValue();
        float fM206toFloatk4lQ0M = f - m206toFloatk4lQ0M(value.m2344dispatchPreScrollOzD1aCk(m207toOffsettuRUvjQ(f), i));
        float fReverseIfNeeded = reverseIfNeeded(scrollScope.scrollBy(reverseIfNeeded(fM206toFloatk4lQ0M)));
        float f2 = fM206toFloatk4lQ0M - fReverseIfNeeded;
        value.m2342dispatchPostScrollDzOQY0M(m207toOffsettuRUvjQ(fReverseIfNeeded), m207toOffsettuRUvjQ(f2), i);
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    public final Object m202doFlingAnimationQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        Ref.LongRef longRef;
        if (continuation instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuation;
            int i = scrollingLogic$doFlingAnimation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
            }
        } else {
            scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
        }
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$2 = scrollingLogic$doFlingAnimation$1;
        Object obj = scrollingLogic$doFlingAnimation$2.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = scrollingLogic$doFlingAnimation$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = j;
            ScrollableState scrollableState = getScrollableState();
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$3 = new ScrollingLogic$doFlingAnimation$2(this, longRef2, j, null);
            scrollingLogic$doFlingAnimation$2.L$0 = longRef2;
            scrollingLogic$doFlingAnimation$2.label = 1;
            if (ScrollableState.DefaultImpls.scroll$default(scrollableState, null, scrollingLogic$doFlingAnimation$3, scrollingLogic$doFlingAnimation$2, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) scrollingLogic$doFlingAnimation$2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Velocity.m3141boximpl(longRef.element);
    }

    @NotNull
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    @NotNull
    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object onDragStopped(float f, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        long j;
        ScrollingLogic scrollingLogic;
        long j2;
        long packedValue;
        NestedScrollDispatcher value;
        long jM3153minusAH228Gc;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objM202doFlingAnimationQWom1Mo = anonymousClass2.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j = anonymousClass2.J$0;
                scrollingLogic = (ScrollingLogic) anonymousClass2.L$0;
                ResultKt.throwOnFailure(objM202doFlingAnimationQWom1Mo);
            } else if (i2 == 2) {
                j2 = anonymousClass2.J$0;
                scrollingLogic = (ScrollingLogic) anonymousClass2.L$0;
                ResultKt.throwOnFailure(objM202doFlingAnimationQWom1Mo);
                packedValue = ((Velocity) objM202doFlingAnimationQWom1Mo).getPackedValue();
                value = scrollingLogic.getNestedScrollDispatcher().getValue();
                jM3153minusAH228Gc = Velocity.m3153minusAH228Gc(j2, packedValue);
                anonymousClass2.L$0 = null;
                anonymousClass2.label = 3;
                if (value.m2341dispatchPostFlingRZ2iAVY(jM3153minusAH228Gc, packedValue, anonymousClass2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM202doFlingAnimationQWom1Mo);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM202doFlingAnimationQWom1Mo);
        long jM208toVelocityadjELrA = m208toVelocityadjELrA(f);
        NestedScrollDispatcher value2 = getNestedScrollDispatcher().getValue();
        anonymousClass2.L$0 = this;
        anonymousClass2.J$0 = jM208toVelocityadjELrA;
        anonymousClass2.label = 1;
        Object objM2343dispatchPreFlingQWom1Mo = value2.m2343dispatchPreFlingQWom1Mo(jM208toVelocityadjELrA, anonymousClass2);
        if (objM2343dispatchPreFlingQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        j = jM208toVelocityadjELrA;
        objM202doFlingAnimationQWom1Mo = objM2343dispatchPreFlingQWom1Mo;
        scrollingLogic = this;
        long jM3153minusAH228Gc2 = Velocity.m3153minusAH228Gc(j, ((Velocity) objM202doFlingAnimationQWom1Mo).getPackedValue());
        anonymousClass2.L$0 = scrollingLogic;
        anonymousClass2.J$0 = jM3153minusAH228Gc2;
        anonymousClass2.label = 2;
        objM202doFlingAnimationQWom1Mo = scrollingLogic.m202doFlingAnimationQWom1Mo(jM3153minusAH228Gc2, anonymousClass2);
        if (objM202doFlingAnimationQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        j2 = jM3153minusAH228Gc2;
        packedValue = ((Velocity) objM202doFlingAnimationQWom1Mo).getPackedValue();
        value = scrollingLogic.getNestedScrollDispatcher().getValue();
        jM3153minusAH228Gc = Velocity.m3153minusAH228Gc(j2, packedValue);
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 3;
        if (value.m2341dispatchPostFlingRZ2iAVY(jM3153minusAH228Gc, packedValue, anonymousClass2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m203performRawScrollMKHz9U(long scroll) {
        return this.scrollableState.isScrollInProgress() ? Offset.INSTANCE.m999getZeroF1C5BW0() : m207toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m206toFloatk4lQ0M(scroll)))));
    }

    /* JADX INFO: renamed from: performRelocationScroll-MK-Hz9U, reason: not valid java name */
    public final long m204performRelocationScrollMKHz9U(long scroll) {
        e.f(this.nestedScrollDispatcher.getValue().getCoroutineScope(), null, null, new ScrollingLogic$performRelocationScroll$1(this, scroll, null), 3, null);
        return scroll;
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m205toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m3150getXimpl(j) : Velocity.m3151getYimpl(j);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m206toFloatk4lQ0M(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m983getXimpl(j) : Offset.m984getYimpl(j);
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m207toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.INSTANCE.m999getZeroF1C5BW0();
        }
        return this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f, 0.0f) : OffsetKt.Offset(0.0f, f);
    }

    /* JADX INFO: renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m208toVelocityadjELrA(float f) {
        return this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f, 0.0f) : VelocityKt.Velocity(0.0f, f);
    }
}
