package com.xiaomi.fitness.sport.viewmodel;

import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.route.export.track.FdsResult;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import com.xiaomi.fitness.route.export.track.UploadUrl;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1", f = "RouteBaseViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 $action$inlined;
    final /* synthetic */ String $fail$inlined;
    final /* synthetic */ String $filePath$inlined;
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 RouteBaseViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/RouteBaseViewModel\n*L\n1#1,222:1\n168#2,19:223\n*E\n"})
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<String> $$this$flow;
        final /* synthetic */ Function2 $action$inlined;
        final /* synthetic */ String $fail$inlined;
        final /* synthetic */ String $filePath$inlined;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1$1", f = "RouteBaseViewModel.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {ErrorCode.ERROR_SP_NOTICE_NOT_READY, ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE, ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE, 234, 237}, m = "emit", n = {"this", "it", "$this$uploadTrackLibs_u24lambda_u241", "this", "$this$uploadTrackLibs_u24lambda_u241", "this", "$this$uploadTrackLibs_u24lambda_u241"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
        public static final class C07801 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public C07801(Continuation continuation) {
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

        public AnonymousClass1(FlowCollector flowCollector, Function2 function2, String str, String str2) {
            this.$action$inlined = function2;
            this.$filePath$inlined = str;
            this.$fail$inlined = str2;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[Catch: Exception -> 0x00ff, TryCatch #0 {Exception -> 0x00ff, blocks: (B:20:0x0048, B:23:0x0055, B:40:0x00cd, B:42:0x00d5, B:45:0x00ec), top: B:60:0x0026 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00eb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:45:0x00ec A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ff, blocks: (B:20:0x0048, B:23:0x0055, B:40:0x00cd, B:42:0x00d5, B:45:0x00ec), top: B:60:0x0026 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00fc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:51:0x010f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v21 */
        /* JADX WARN: Type inference failed for: r12v31 */
        /* JADX WARN: Type inference failed for: r12v32 */
        /* JADX WARN: Type inference failed for: r12v33 */
        /* JADX WARN: Type inference failed for: r12v34 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            C07801 c07801;
            String str;
            UploadUrl uploadUrl;
            AnonymousClass1<T> anonymousClass1;
            FlowCollector flowCollector;
            Object objEmit;
            Object objEmit2;
            if (continuation instanceof C07801) {
                c07801 = (C07801) continuation;
                int i = c07801.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c07801.label = i - Integer.MIN_VALUE;
                } else {
                    c07801 = new C07801(continuation);
                }
            } else {
                c07801 = new C07801(continuation);
            }
            Object obj = c07801.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            AnonymousClass1 anonymousClass2 = c07801.label;
            try {
                if (anonymousClass2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector2 = this.$$this$flow;
                    UploadUrl uploadUrl2 = (UploadUrl) t;
                    FitnessLogUtils.i(RouteBaseViewModel.TAG, "uploadRouteToFds:" + uploadUrl2);
                    if (uploadUrl2 == null || uploadUrl2.getCode() != 0) {
                        this.$action$inlined.invoke(Boxing.boxInt(uploadUrl2.getCode()), Boxing.boxInt(0));
                    } else if (uploadUrl2.getFile().getUrl().length() > 0) {
                        File file = new File(this.$filePath$inlined);
                        try {
                            TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                            String url = uploadUrl2.getFile().getUrl();
                            c07801.L$0 = this;
                            c07801.L$1 = uploadUrl2;
                            c07801.L$2 = flowCollector2;
                            c07801.label = 1;
                            Object objUploadRouteToFds = trackNetManagerKt.uploadRouteToFds(url, file, c07801);
                            if (objUploadRouteToFds == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            uploadUrl = uploadUrl2;
                            anonymousClass1 = this;
                            obj = objUploadRouteToFds;
                            flowCollector = flowCollector2;
                            if (((FdsResult) obj).isSuccess()) {
                                String url2 = uploadUrl.getIcon().getUrl();
                                c07801.L$0 = anonymousClass1;
                                c07801.L$1 = flowCollector;
                                c07801.L$2 = null;
                                c07801.label = 2;
                                objEmit2 = flowCollector.emit(url2, c07801);
                                if (objEmit2 == coroutine_suspended) {
                                    anonymousClass2 = anonymousClass1;
                                    t = objEmit2;
                                    return coroutine_suspended;
                                }
                            } else {
                                String str2 = anonymousClass1.$fail$inlined;
                                c07801.L$0 = anonymousClass1;
                                c07801.L$1 = flowCollector;
                                c07801.L$2 = null;
                                c07801.label = 3;
                                objEmit = flowCollector.emit(str2, c07801);
                                if (objEmit == coroutine_suspended) {
                                    anonymousClass2 = anonymousClass1;
                                    t = objEmit;
                                    return coroutine_suspended;
                                }
                            }
                            anonymousClass2 = anonymousClass1;
                            t = objEmit;
                            anonymousClass2 = anonymousClass1;
                            t = objEmit2;
                        } catch (Exception unused) {
                            anonymousClass2 = this;
                            t = flowCollector2;
                            str = anonymousClass2.$fail$inlined;
                            c07801.L$0 = null;
                            c07801.L$1 = null;
                            c07801.L$2 = null;
                            c07801.label = 4;
                            if (t.emit(str, c07801) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        String str3 = this.$fail$inlined;
                        c07801.label = 5;
                        if (flowCollector2.emit(str3, c07801) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (anonymousClass2 != 1) {
                    if (anonymousClass2 == 2) {
                        boolean z = (T) ((FlowCollector) c07801.L$1);
                        AnonymousClass1 anonymousClass3 = (AnonymousClass1) c07801.L$0;
                        ResultKt.throwOnFailure(obj);
                        anonymousClass2 = anonymousClass3;
                        t = z;
                    } else if (anonymousClass2 == 3) {
                        boolean z2 = (T) ((FlowCollector) c07801.L$1);
                        AnonymousClass1 anonymousClass4 = (AnonymousClass1) c07801.L$0;
                        ResultKt.throwOnFailure(obj);
                        anonymousClass2 = anonymousClass4;
                        t = z2;
                    } else {
                        if (anonymousClass2 != 4 && anonymousClass2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    anonymousClass2 = anonymousClass1;
                    t = objEmit;
                    anonymousClass2 = anonymousClass1;
                    t = objEmit2;
                } else {
                    t = (FlowCollector) c07801.L$2;
                    UploadUrl uploadUrl3 = (UploadUrl) c07801.L$1;
                    AnonymousClass1<T> anonymousClass5 = (AnonymousClass1) c07801.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        uploadUrl = uploadUrl3;
                        anonymousClass1 = anonymousClass5;
                        flowCollector = t;
                        if (((FdsResult) obj).isSuccess()) {
                            String url3 = uploadUrl.getIcon().getUrl();
                            c07801.L$0 = anonymousClass1;
                            c07801.L$1 = flowCollector;
                            c07801.L$2 = null;
                            c07801.label = 2;
                            objEmit2 = flowCollector.emit(url3, c07801);
                            if (objEmit2 == coroutine_suspended) {
                                anonymousClass2 = anonymousClass1;
                                t = objEmit2;
                                return coroutine_suspended;
                            }
                        } else {
                            String str4 = anonymousClass1.$fail$inlined;
                            c07801.L$0 = anonymousClass1;
                            c07801.L$1 = flowCollector;
                            c07801.L$2 = null;
                            c07801.label = 3;
                            objEmit = flowCollector.emit(str4, c07801);
                            if (objEmit == coroutine_suspended) {
                                anonymousClass2 = anonymousClass1;
                                t = objEmit;
                                return coroutine_suspended;
                            }
                        }
                        anonymousClass2 = anonymousClass1;
                        t = objEmit;
                        anonymousClass2 = anonymousClass1;
                        t = objEmit2;
                    } catch (Exception unused2) {
                        anonymousClass2 = anonymousClass5;
                        str = anonymousClass2.$fail$inlined;
                        c07801.L$0 = null;
                        c07801.L$1 = null;
                        c07801.L$2 = null;
                        c07801.label = 4;
                        if (t.emit(str, c07801) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } catch (Exception unused3) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1(Flow flow, Continuation continuation, Function2 function2, String str, String str2) {
        super(2, continuation);
        this.$this_transform = flow;
        this.$action$inlined = function2;
        this.$filePath$inlined = str;
        this.$fail$inlined = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1 routeBaseViewModel$uploadTrackLibs$$inlined$transform$1 = new RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1(this.$this_transform, continuation, this.$action$inlined, this.$filePath$inlined, this.$fail$inlined);
        routeBaseViewModel$uploadTrackLibs$$inlined$transform$1.L$0 = obj;
        return routeBaseViewModel$uploadTrackLibs$$inlined$transform$1;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.$action$inlined, this.$filePath$inlined, this.$fail$inlined);
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
        return ((RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
