package com.xiaomi.fitness.sport.view.viewmodel;

import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.route.export.track.FdsResult;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import com.xiaomi.fitness.route.export.track.UploadUrl;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1", f = "RunningRouteDetailViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fail$inlined;
    final /* synthetic */ Recorder $recorder$inlined;
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 RunningRouteDetailViewModel.kt\ncom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel$uploadTrack$1\n*L\n1#1,222:1\n209#2,3:223\n225#2:226\n215#2,7:227\n*E\n"})
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<String> $$this$flow;
        final /* synthetic */ String $fail$inlined;
        final /* synthetic */ Recorder $recorder$inlined;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1$1", f = "RunningRouteDetailViewModel.kt", i = {1, 1, 1}, l = {SportReportBaseParser.ReportType.maxFreq, 230, ErrorCode.ERROR_SP_NOTICE_NOT_READY, ErrorCode.ERROR_SP_NOTICE_NOT_READY, 233}, m = "emit", n = {"this", "it", "$this$invokeSuspend_u24lambda_u240"}, s = {"L$0", "L$1", "L$2"})
        public static final class C07711 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public C07711(Continuation continuation) {
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

        public AnonymousClass1(FlowCollector flowCollector, Recorder recorder, String str) {
            this.$recorder$inlined = recorder;
            this.$fail$inlined = str;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ce A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:37:0x00df A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            C07711 c07711;
            UploadUrl uploadUrl;
            AnonymousClass1<T> anonymousClass1;
            FlowCollector<String> flowCollector;
            String str;
            String url;
            if (continuation instanceof C07711) {
                c07711 = (C07711) continuation;
                int i = c07711.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c07711.label = i - Integer.MIN_VALUE;
                } else {
                    c07711 = new C07711(continuation);
                }
            } else {
                c07711 = new C07711(continuation);
            }
            Object obj = c07711.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c07711.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        flowCollector = (FlowCollector) c07711.L$2;
                        uploadUrl = (UploadUrl) c07711.L$1;
                        anonymousClass1 = (AnonymousClass1) c07711.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((FdsResult) obj).isSuccess()) {
                            url = uploadUrl.getIcon().getUrl();
                            c07711.L$0 = null;
                            c07711.L$1 = null;
                            c07711.L$2 = null;
                            c07711.label = 3;
                            if (flowCollector.emit(url, c07711) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            str = anonymousClass1.$fail$inlined;
                            c07711.L$0 = null;
                            c07711.L$1 = null;
                            c07711.L$2 = null;
                            c07711.label = 4;
                            if (flowCollector.emit(str, c07711) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (i2 != 3 && i2 != 4 && i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                FlowCollector<String> flowCollector2 = this.$$this$flow;
                uploadUrl = (UploadUrl) t;
                FitnessLogUtils.i(RunningRouteDetailViewModel.TAG, "uploadRouteToFds:" + uploadUrl);
                if (uploadUrl == null || uploadUrl.getCode() != 0) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    RunningRouteDetailViewModel$uploadTrack$1$2$1 runningRouteDetailViewModel$uploadTrack$1$2$1 = new RunningRouteDetailViewModel$uploadTrack$1$2$1(uploadUrl, null);
                    c07711.label = 1;
                    if (BuildersKt.withContext(main, runningRouteDetailViewModel$uploadTrack$1$2$1, c07711) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (uploadUrl.getFile().getUrl().length() > 0) {
                    File file = new File(this.$recorder$inlined.getFilePath());
                    TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                    String url2 = uploadUrl.getFile().getUrl();
                    c07711.L$0 = this;
                    c07711.L$1 = uploadUrl;
                    c07711.L$2 = flowCollector2;
                    c07711.label = 2;
                    Object objUploadRouteToFds = trackNetManagerKt.uploadRouteToFds(url2, file, c07711);
                    if (objUploadRouteToFds == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anonymousClass1 = this;
                    obj = objUploadRouteToFds;
                    flowCollector = flowCollector2;
                    if (((FdsResult) obj).isSuccess()) {
                        url = uploadUrl.getIcon().getUrl();
                        c07711.L$0 = null;
                        c07711.L$1 = null;
                        c07711.L$2 = null;
                        c07711.label = 3;
                        if (flowCollector.emit(url, c07711) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        str = anonymousClass1.$fail$inlined;
                        c07711.L$0 = null;
                        c07711.L$1 = null;
                        c07711.L$2 = null;
                        c07711.label = 4;
                        if (flowCollector.emit(str, c07711) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    String str2 = this.$fail$inlined;
                    c07711.label = 5;
                    if (flowCollector2.emit(str2, c07711) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1(Flow flow, Continuation continuation, Recorder recorder, String str) {
        super(2, continuation);
        this.$this_transform = flow;
        this.$recorder$inlined = recorder;
        this.$fail$inlined = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1 runningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1 = new RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1(this.$this_transform, continuation, this.$recorder$inlined, this.$fail$inlined);
        runningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1.L$0 = obj;
        return runningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.$recorder$inlined, this.$fail$inlined);
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
    public final Object invoke(@NotNull FlowCollector<? super String> flowCollector, @Nullable Continuation<? super Unit> continuation) {
        return ((RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
