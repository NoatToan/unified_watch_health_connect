package androidx.work.impl.constraints.controllers;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import defpackage.awaitClose;
import defpackage.createFailure;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zjn;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController;", ExifInterface.GPS_DIRECTION_TRUE, "", "tracker", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "(Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "reason", "", "getReason$annotations", "()V", "getReason", "()I", "hasConstraint", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "isConstrained", "value", "(Ljava/lang/Object;)Z", "track", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ConstraintController<T> {
    private final ConstraintTracker<T> tracker;

    public static /* synthetic */ void getReason$annotations() {
    }

    public abstract int getReason();

    public abstract boolean hasConstraint(WorkSpec workSpec);

    public abstract boolean isConstrained(T value);

    public ConstraintController(ConstraintTracker<T> constraintTracker) {
        zcp.c(constraintTracker, "");
        this.tracker = constraintTracker;
    }

    /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.ConstraintController$track$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", f = "ContraintControllers.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super ConstraintsState>, Continuation<? super yzc>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConstraintController<T> this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final ConstraintController<T> constraintController = this.this$0;
                final ConstraintListener<T> constraintListener = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.ConstraintController$track$1$listener$1
                    @Override // androidx.work.impl.constraints.ConstraintListener
                    public void onConstraintChanged(T newValue) {
                        producerScope.getChannel().mo1959trySendJP2dKIU(constraintController.isConstrained(newValue) ? new ConstraintsState.ConstraintsNotMet(constraintController.getReason()) : ConstraintsState.ConstraintsMet.INSTANCE);
                    }
                };
                ((ConstraintController) this.this$0).tracker.addListener(constraintListener);
                final ConstraintController<T> constraintController2 = this.this$0;
                this.label = 1;
                if (awaitClose.d(producerScope, new Function0<yzc>() { // from class: androidx.work.impl.constraints.controllers.ConstraintController.track.1.1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ yzc invoke() {
                        invoke2();
                        return yzc.e;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((ConstraintController) constraintController2).tracker.removeListener(constraintListener);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, this) == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            return yzc.e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super ConstraintsState> producerScope, Continuation<? super yzc> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ConstraintController<T> constraintController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = constraintController;
        }
    }

    public final Flow<ConstraintsState> track() {
        return zjn.b(new AnonymousClass1(this, null));
    }

    public final boolean isConstrained(WorkSpec workSpec) {
        zcp.c(workSpec, "");
        return hasConstraint(workSpec) && isConstrained(this.tracker.readSystemState());
    }
}
