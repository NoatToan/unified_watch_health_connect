package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import com.haibin.calendarview.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {359, 361, 368, BuildConfig.VERSION_CODE, 378}, m = "invokeSuspend", n = {"delayJob", "success", "releaseInteraction"}, s = {"L$0", "Z$0", "L$0"})
public final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ long $pressPoint;
    public final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    public final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    public boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, Continuation<? super ClickableKt$handlePressInteraction$2> continuation) {
        super(2, continuation);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, continuation);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickableKt$handlePressInteraction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Job jobF;
        Object objTryAwaitRelease;
        boolean z;
        PressInteraction.Press press;
        PressInteraction.Release release;
        MutableInteractionSource mutableInteractionSource;
        PressInteraction.Release release2;
        MutableInteractionSource mutableInteractionSource2;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jobF = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                objTryAwaitRelease = obj;
            } else if (i == 2) {
                z = this.Z$0;
                ResultKt.throwOnFailure(obj);
                if (z) {
                    press = new PressInteraction.Press(this.$pressPoint, null);
                    release = new PressInteraction.Release(press);
                    mutableInteractionSource = this.$interactionSource;
                    this.L$0 = release;
                    this.label = 3;
                    if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    release2 = release;
                    mutableInteractionSource2 = this.$interactionSource;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableInteractionSource2.emit(release2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 3) {
                release2 = (PressInteraction.Release) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableInteractionSource2 = this.$interactionSource;
                this.L$0 = null;
                this.label = 4;
                if (mutableInteractionSource2.emit(release2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$pressedInteraction.setValue(null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        jobF = e.f((CoroutineScope) this.L$0, null, null, new ClickableKt$handlePressInteraction$2$delayJob$1(this.$pressPoint, this.$interactionSource, this.$pressedInteraction, null), 3, null);
        PressGestureScope pressGestureScope = this.$this_handlePressInteraction;
        this.L$0 = jobF;
        this.label = 1;
        objTryAwaitRelease = pressGestureScope.tryAwaitRelease(this);
        if (objTryAwaitRelease == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean zBooleanValue = ((Boolean) objTryAwaitRelease).booleanValue();
        if (jobF.isActive()) {
            this.L$0 = null;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            if (JobKt.cancelAndJoin(jobF, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zBooleanValue;
            if (z) {
                press = new PressInteraction.Press(this.$pressPoint, null);
                release = new PressInteraction.Release(press);
                mutableInteractionSource = this.$interactionSource;
                this.L$0 = release;
                this.label = 3;
                if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                release2 = release;
                mutableInteractionSource2 = this.$interactionSource;
                this.L$0 = null;
                this.label = 4;
                if (mutableInteractionSource2.emit(release2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            PressInteraction.Press value = this.$pressedInteraction.getValue();
            if (value != null) {
                MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                Interaction release3 = zBooleanValue ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                this.L$0 = null;
                this.label = 5;
                if (mutableInteractionSource3.emit(release3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        this.$pressedInteraction.setValue(null);
        return Unit.INSTANCE;
    }
}
