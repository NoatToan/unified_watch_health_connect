package com.xiaomi.fitness.devicesettings.common.track;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.common.track.TrackViewModel;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.export.track.RouteListResponse;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0!R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\nR'\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/track/TrackViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "stateData", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$TrackData;", "viewStates", "Landroidx/lifecycle/MutableLiveData;", "getViewStates", "()Landroidx/lifecycle/MutableLiveData;", "deleteData", "", "tracksCountOnDevice", "", "", "getTracksCountOnDevice", "deleteState", "getDeleteState", "deleteState$delegate", "Lkotlin/Lazy;", "routerData", "getRouterData", "routerData$delegate", "delTracksOnDevices", "ids", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTracksOnDevices", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reqList", "", "delete", "selectIds", "", "TrackData", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    public static final String TAG = "TrackViewModel";

    @NotNull
    private final StateData<CourseMeData> stateData = new StateData<>();

    @NotNull
    private final MutableLiveData<StateData<CourseMeData>> viewStates = new MutableLiveData<>();

    @NotNull
    private final StateData<Integer> deleteData = new StateData<>();

    @NotNull
    private final MutableLiveData<String[]> tracksCountOnDevice = new MutableLiveData<>();

    /* JADX INFO: renamed from: deleteState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteState = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mop
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrackViewModel.deleteState_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: routerData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy routerData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nop
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrackViewModel.routerData_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$TrackData, reason: from toString */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$TrackData;", "", "feeds", "", "Lcom/xiaomi/fitness/route/export/track/Route;", "<init>", "(Ljava/util/List;)V", "getFeeds", "()Ljava/util/List;", "setFeeds", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CourseMeData {

        @Nullable
        private List<Route> feeds;

        /* JADX WARN: Multi-variable type inference failed */
        public CourseMeData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Nullable
        public final List<Route> getFeeds() {
            return this.feeds;
        }

        public final void setFeeds(@Nullable List<Route> list) {
            this.feeds = list;
        }

        @NotNull
        public String toString() {
            return "CourseMeData(feeds=" + this.feeds + ")";
        }

        public CourseMeData(@Nullable List<Route> list) {
            this.feeds = list;
        }

        public /* synthetic */ CourseMeData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$delete$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$delete$1", f = "TrackViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Set<String> $selectIds;
        int label;
        final /* synthetic */ TrackViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$delete$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$delete$1$1", f = "TrackViewModel.kt", i = {}, l = {92, 92}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nTrackViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$delete$1$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,104:1\n37#2:105\n36#2,3:106\n*S KotlinDebug\n*F\n+ 1 TrackViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$delete$1$1\n*L\n91#1:105\n91#1:106,3\n*E\n"})
        public static final class C04901 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Set<String> $selectIds;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TrackViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04901(Set<String> set, TrackViewModel trackViewModel, Continuation<? super C04901> continuation) {
                super(2, continuation);
                this.$selectIds = set;
                this.this$0 = trackViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04901 c04901 = new C04901(this.$selectIds, this.this$0, continuation);
                c04901.L$0 = obj;
                return c04901;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FlowCollector flowCollector;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                String[] strArr = (String[]) this.$selectIds.toArray(new String[0]);
                TrackViewModel trackViewModel = this.this$0;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = trackViewModel.delTracksOnDevices(strArr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
                return ((C04901) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$delete$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$delete$1$2", f = "TrackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TrackViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TrackViewModel trackViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = trackViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getDeleteState().setValue(this.this$0.deleteData.l());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$delete$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$delete$1$3", f = "TrackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TrackViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TrackViewModel trackViewModel, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = trackViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Logger.e(TrackViewModel.TAG, "delete: " + ((Throwable) this.L$0).getMessage());
                this.this$0.getDeleteState().setValue(this.this$0.deleteData.c());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set<String> set, TrackViewModel trackViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$selectIds = set;
            this.this$0 = trackViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$selectIds, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.onStart(FlowKt.flow(new C04901(this.$selectIds, this.this$0, null)), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, null));
                final TrackViewModel trackViewModel = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel.delete.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        trackViewModel.getDeleteState().setValue(trackViewModel.deleteData.r(Boxing.boxInt(i2)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowM2416catch.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$reqList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$reqList$1", f = "TrackViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$reqList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$TrackData;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$reqList$1$1", f = "TrackViewModel.kt", i = {0, 1, 1}, l = {52, 53, 65}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "routerIds"}, s = {"L$0", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nTrackViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$reqList$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,104:1\n13402#2,2:105\n*S KotlinDebug\n*F\n+ 1 TrackViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$reqList$1$1\n*L\n60#1:105,2\n*E\n"})
        public static final class C04911 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CourseMeData>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CourseMeData $data;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ TrackViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04911(TrackViewModel trackViewModel, CourseMeData courseMeData, Continuation<? super C04911> continuation) {
                super(2, continuation);
                this.this$0 = trackViewModel;
                this.$data = courseMeData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04911 c04911 = new C04911(this.this$0, this.$data, continuation);
                c04911.L$0 = obj;
                return c04911;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0071  */
            /* JADX WARN: Code duplicated, block: B:22:0x0076  */
            /* JADX WARN: Code duplicated, block: B:27:0x0097  */
            /* JADX WARN: Code duplicated, block: B:29:0x009b  */
            /* JADX WARN: Code duplicated, block: B:30:0x009d  */
            /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:35:0x00ac A[LOOP:0: B:34:0x00aa->B:35:0x00ac, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:42:0x0107  */
            /* JADX WARN: Code duplicated, block: B:45:0x011f A[RETURN] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v16, types: [T, java.util.ArrayList] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FlowCollector flowCollector;
                Object tracksOnDevices;
                Object userRoutesInfo;
                FlowCollector flowCollector2;
                String[] strArr;
                RouteListResponse routeListResponse;
                Ref.ObjectRef objectRef;
                T route_list;
                Collection collection;
                boolean z;
                boolean z2;
                int length;
                int i;
                Collection collection2;
                StateData stateDataB;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                boolean z3 = true;
                if (i2 != 0) {
                    if (i2 == 1) {
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        tracksOnDevices = obj;
                    } else if (i2 == 2) {
                        strArr = (String[]) this.L$1;
                        FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        flowCollector2 = flowCollector3;
                        userRoutesInfo = obj;
                        routeListResponse = (RouteListResponse) userRoutesInfo;
                        objectRef = new Ref.ObjectRef();
                        if (routeListResponse != null) {
                            route_list = routeListResponse.getRoute_list();
                        } else {
                            route_list = 0;
                        }
                        objectRef.element = route_list;
                        this.this$0.getTracksCountOnDevice().setValue(strArr);
                        this.this$0.getRouterData().setValue(strArr);
                        collection = (Collection) objectRef.element;
                        if (collection != null || collection.isEmpty()) {
                            z = false;
                            if (strArr.length == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                objectRef.element = new ArrayList();
                                length = strArr.length;
                                i = 0;
                                while (i < length) {
                                    ((List) objectRef.element).add(new Route(null, null, strArr[i], 0, null, Boxing.boxBoolean(z3), Boxing.boxBoolean(z), false, 0, 384, null));
                                    i++;
                                    z3 = true;
                                    z = false;
                                }
                            }
                        }
                        this.$data.setFeeds((List) objectRef.element);
                        collection2 = (Collection) objectRef.element;
                        if (collection2 != null || collection2.isEmpty()) {
                            stateDataB = this.this$0.stateData.b(this.$data);
                        } else {
                            stateDataB = this.this$0.stateData.r(this.$data);
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        if (flowCollector2.emit(stateDataB, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                TrackViewModel trackViewModel = this.this$0;
                this.L$0 = flowCollector;
                this.label = 1;
                tracksOnDevices = trackViewModel.getTracksOnDevices(this);
                if (tracksOnDevices == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String[] strArr2 = (String[]) tracksOnDevices;
                TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                this.L$0 = flowCollector;
                this.L$1 = strArr2;
                this.label = 2;
                userRoutesInfo = trackNetManagerKt.getUserRoutesInfo(strArr2, this);
                if (userRoutesInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector2 = flowCollector;
                strArr = strArr2;
                routeListResponse = (RouteListResponse) userRoutesInfo;
                objectRef = new Ref.ObjectRef();
                if (routeListResponse != null) {
                    route_list = routeListResponse.getRoute_list();
                } else {
                    route_list = 0;
                }
                objectRef.element = route_list;
                this.this$0.getTracksCountOnDevice().setValue(strArr);
                this.this$0.getRouterData().setValue(strArr);
                collection = (Collection) objectRef.element;
                if (collection != null) {
                    z = false;
                    if (strArr.length == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        objectRef.element = new ArrayList();
                        length = strArr.length;
                        i = 0;
                        while (i < length) {
                            ((List) objectRef.element).add(new Route(null, null, strArr[i], 0, null, Boxing.boxBoolean(z3), Boxing.boxBoolean(z), false, 0, 384, null));
                            i++;
                            z3 = true;
                            z = false;
                        }
                    }
                } else {
                    z = false;
                    if (strArr.length == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        objectRef.element = new ArrayList();
                        length = strArr.length;
                        i = 0;
                        while (i < length) {
                            ((List) objectRef.element).add(new Route(null, null, strArr[i], 0, null, Boxing.boxBoolean(z3), Boxing.boxBoolean(z), false, 0, 384, null));
                            i++;
                            z3 = true;
                            z = false;
                        }
                    }
                }
                this.$data.setFeeds((List) objectRef.element);
                collection2 = (Collection) objectRef.element;
                if (collection2 != null) {
                    stateDataB = this.this$0.stateData.b(this.$data);
                } else {
                    stateDataB = this.this$0.stateData.b(this.$data);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (flowCollector2.emit(stateDataB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CourseMeData>> flowCollector, Continuation<? super Unit> continuation) {
                return ((C04911) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$reqList$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$TrackData;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$reqList$1$2", f = "TrackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super StateData<CourseMeData>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CourseMeData $data;
            int label;
            final /* synthetic */ TrackViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TrackViewModel trackViewModel, CourseMeData courseMeData, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = trackViewModel;
                this.$data = courseMeData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$data, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Logger.d("TrackAcL", "reqList: ");
                this.this$0.getViewStates().setValue(this.this$0.stateData.m(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<CourseMeData>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$reqList$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u00022\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$TrackData;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.track.TrackViewModel$reqList$1$3", f = "TrackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super StateData<CourseMeData>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ CourseMeData $data;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TrackViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TrackViewModel trackViewModel, CourseMeData courseMeData, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = trackViewModel;
                this.$data = courseMeData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                Logger.e(TrackViewModel.TAG, "reqList: error = " + th.getMessage());
                this.this$0.getViewStates().setValue(((th instanceof UnknownHostException) || (th instanceof SocketTimeoutException)) ? this.this$0.stateData.o(this.$data) : this.this$0.stateData.e(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super StateData<CourseMeData>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$data, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        public C21501(Continuation<? super C21501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackViewModel.this.new C21501(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseMeData courseMeData = new CourseMeData(null, i2, 0 == true ? 1 : 0);
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.onStart(FlowKt.flow(new C04911(TrackViewModel.this, courseMeData, null)), new AnonymousClass2(TrackViewModel.this, courseMeData, null)), new AnonymousClass3(TrackViewModel.this, courseMeData, null));
                final TrackViewModel trackViewModel = TrackViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.devicesettings.common.track.TrackViewModel.reqList.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StateData<CourseMeData>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StateData<CourseMeData> stateData, Continuation<? super Unit> continuation) {
                        trackViewModel.getViewStates().setValue(stateData);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowM2416catch.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object delTracksOnDevices(String[] strArr, Continuation<? super Integer> continuation) {
        return TrackApiKt.getInstance(TrackApi.INSTANCE).delTracksOnDevice(strArr, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData deleteState_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTracksOnDevices(Continuation<? super String[]> continuation) {
        return TrackApiKt.getInstance(TrackApi.INSTANCE).getTracksOnDeviceIds(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData routerData_delegate$lambda$1() {
        return new MutableLiveData();
    }

    public final void delete(@NotNull Set<String> selectIds) {
        Intrinsics.checkNotNullParameter(selectIds, "selectIds");
        Logger.i(TAG, "delete: ids = " + selectIds);
        if (CollectionsKt___CollectionsKt.toList(selectIds).size() == 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(selectIds, this, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<StateData<Integer>> getDeleteState() {
        return (MutableLiveData) this.deleteState.getValue();
    }

    @NotNull
    public final MutableLiveData<String[]> getRouterData() {
        return (MutableLiveData) this.routerData.getValue();
    }

    @NotNull
    public final MutableLiveData<String[]> getTracksCountOnDevice() {
        return this.tracksCountOnDevice;
    }

    @NotNull
    public final MutableLiveData<StateData<CourseMeData>> getViewStates() {
        return this.viewStates;
    }

    public final void reqList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21501(null), 3, null);
    }
}
