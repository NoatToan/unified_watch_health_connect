package androidx.work.impl.constraints;

import android.os.Build;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import defpackage.ppe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "trackers", "Landroidx/work/impl/constraints/trackers/Trackers;", "(Landroidx/work/impl/constraints/trackers/Trackers;)V", "controllers", "", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "(Ljava/util/List;)V", "areAllConstraintsMet", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "track", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "spec", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorkConstraintsTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,205:1\n766#2:206\n857#2,2:207\n1549#2:209\n1620#2,3:210\n766#2:218\n857#2,2:219\n287#3:213\n288#3:216\n37#4,2:214\n107#5:217\n*S KotlinDebug\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n*L\n92#1:206\n92#1:207,2\n92#1:209\n92#1:210,3\n100#1:218\n100#1:219,2\n93#1:213\n93#1:216\n93#1:214,2\n93#1:217\n*E\n"})
public final class WorkConstraintsTracker {

    @NotNull
    private final List<ConstraintController> controllers;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(@NotNull List<? extends ConstraintController> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.controllers = controllers;
    }

    public final boolean areAllConstraintsMet(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isCurrentlyConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            ppe.e().a(WorkConstraintsTrackerKt.TAG, "Work " + workSpec.id + " constrained by " + CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<ConstraintController, CharSequence>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final CharSequence invoke2(ConstraintController it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    String simpleName = it.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "it.javaClass.simpleName");
                    return simpleName;
                }
            }, 31, null));
        }
        return arrayList.isEmpty();
    }

    @NotNull
    public final Flow<ConstraintsState> track(@NotNull WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ConstraintController) it.next()).track(spec.constraints));
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt___CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
        return FlowKt.distinctUntilChanged(new Flow<ConstraintsState>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,332:1\n94#2:333\n1282#3,2:334\n*S KotlinDebug\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n*L\n94#1:334,2\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super ConstraintsState>, ConstraintsState[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ConstraintsState constraintsState;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                constraintsState = null;
                                break;
                            }
                            constraintsState = constraintsStateArr[i2];
                            if (!Intrinsics.areEqual(constraintsState, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i2++;
                        }
                        if (constraintsState == null) {
                            constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (flowCollector.emit(constraintsState, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                public final Object invoke(@NotNull FlowCollector<? super ConstraintsState> flowCollector, @NotNull ConstraintsState[] constraintsStateArr, @Nullable Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = constraintsStateArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super ConstraintsState> flowCollector, @NotNull Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<ConstraintsState[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final ConstraintsState[] invoke() {
                        return new ConstraintsState[flowArr2.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return objCombineInternal == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkConstraintsTracker(@NotNull Trackers trackers) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        ConstraintController[] constraintControllerArr = new ConstraintController[8];
        constraintControllerArr[0] = new BatteryChargingController(trackers.getBatteryChargingTracker());
        constraintControllerArr[1] = new BatteryNotLowController(trackers.getBatteryNotLowTracker());
        constraintControllerArr[2] = new StorageNotLowController(trackers.getStorageNotLowTracker());
        constraintControllerArr[3] = new NetworkConnectedController(trackers.getNetworkStateTracker());
        constraintControllerArr[4] = new NetworkUnmeteredController(trackers.getNetworkStateTracker());
        constraintControllerArr[5] = new NetworkNotRoamingController(trackers.getNetworkStateTracker());
        constraintControllerArr[6] = new NetworkMeteredController(trackers.getNetworkStateTracker());
        constraintControllerArr[7] = Build.VERSION.SDK_INT >= 28 ? WorkConstraintsTrackerKt.NetworkRequestConstraintController(trackers.getContext()) : null;
        this((List<? extends ConstraintController>) CollectionsKt__CollectionsKt.listOfNotNull((Object[]) constraintControllerArr));
    }
}
