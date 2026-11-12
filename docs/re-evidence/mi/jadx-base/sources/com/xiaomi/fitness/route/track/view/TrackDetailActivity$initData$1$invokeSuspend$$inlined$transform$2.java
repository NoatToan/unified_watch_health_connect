package com.xiaomi.fitness.route.track.view;

import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.WayPointData;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.TrackDetailData;
import com.xiaomi.fitness.route.track.TrackDataManager;
import defpackage.x0j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2", f = "TrackDetailActivity.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2 extends SuspendLambda implements Function2<FlowCollector<? super Pair<? extends byte[], ? extends Recorder>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TrackDetailActivity this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 TrackDetailActivity.kt\ncom/xiaomi/fitness/route/track/view/TrackDetailActivity$initData$1\n*L\n1#1,222:1\n387#2,18:223\n*E\n"})
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<Pair<? extends byte[], ? extends Recorder>> $$this$flow;
        final /* synthetic */ TrackDetailActivity this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2$1", f = "TrackDetailActivity.kt", i = {0, 0}, l = {235}, m = "emit", n = {"this", "$this$invokeSuspend_u24lambda_u244"}, s = {"L$0", "L$1"})
        public static final class C07231 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C07231(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, TrackDetailActivity trackDetailActivity) {
            this.this$0 = trackDetailActivity;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            C07231 c07231;
            String routeId;
            String alias;
            String suffix;
            String dis;
            if (continuation instanceof C07231) {
                c07231 = (C07231) continuation;
                int i = c07231.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c07231.label = i - Integer.MIN_VALUE;
                } else {
                    c07231 = new C07231(continuation);
                }
            } else {
                c07231 = new C07231(continuation);
            }
            Object obj = c07231.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c07231.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector<Pair<? extends byte[], ? extends Recorder>> flowCollector = this.$$this$flow;
                Triple triple = (Triple) t;
                TrackDetailData routeDetail = this.this$0.getRouteDetail();
                Double dBoxDouble = (routeDetail == null || (dis = routeDetail.getDis()) == null) ? null : Boxing.boxDouble(Double.parseDouble(dis));
                TrackDataManager trackDataManager = TrackDataManager.INSTANCE;
                List<CommonTrackData> list = (List) triple.getFirst();
                List<WayPointData> list2 = (List) triple.getSecond();
                TrackDetailData routeDetail2 = this.this$0.getRouteDetail();
                if (routeDetail2 == null || (routeId = routeDetail2.getRouteId()) == null) {
                    routeId = "";
                }
                TrackDetailData routeDetail3 = this.this$0.getRouteDetail();
                if (routeDetail3 == null || (alias = routeDetail3.getAlias()) == null) {
                    alias = "";
                }
                TrackDetailData routeDetail4 = this.this$0.getRouteDetail();
                String str = (routeDetail4 == null || (suffix = routeDetail4.getSuffix()) == null) ? "" : suffix;
                Triple triple2 = (Triple) triple.getThird();
                Double d = triple2 != null ? (Double) triple2.getSecond() : null;
                Triple triple3 = (Triple) triple.getThird();
                Object objRecorder = trackDataManager.recorder(list, list2, routeId, alias, "", str, dBoxDouble, d, triple3 != null ? (Double) triple3.getThird() : null);
                if (objRecorder != null) {
                    c07231.L$0 = this;
                    c07231.L$1 = flowCollector;
                    c07231.label = 1;
                    if (flowCollector.emit((Pair<? extends byte[], ? extends Recorder>) objRecorder, c07231) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.this$0.dismissDialog();
                    ToastUtil.showShortToast(x0j.q);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2(Flow flow, Continuation continuation, TrackDetailActivity trackDetailActivity) {
        super(2, continuation);
        this.$this_transform = flow;
        this.this$0 = trackDetailActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2 trackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2 = new TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2(this.$this_transform, continuation, this.this$0);
        trackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2.L$0 = obj;
        return trackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.this$0);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
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
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super Pair<? extends byte[], ? extends Recorder>> flowCollector, @Nullable Continuation<? super Unit> continuation) {
        return ((TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
