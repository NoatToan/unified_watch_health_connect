package com.xiaomi.fitness.detail.viewmodel;

import android.graphics.Bitmap;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.route.export.track.FdsResult;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import defpackage.j1j;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2", f = "SportRecordDetailViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap$inlined;
    final /* synthetic */ String $fail$inlined;
    final /* synthetic */ String $success$inlined;
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SportRecordDetailViewModel this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 SportRecordDetailViewModel.kt\ncom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel$uploadTrack$2$1\n*L\n1#1,222:1\n734#2,14:223\n*E\n"})
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<String> $$this$flow;
        final /* synthetic */ Bitmap $bitmap$inlined;
        final /* synthetic */ String $fail$inlined;
        final /* synthetic */ String $success$inlined;
        final /* synthetic */ SportRecordDetailViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2$1", f = "SportRecordDetailViewModel.kt", i = {0, 0}, l = {229, 230, 230, 233}, m = "emit", n = {"this", "$this$invokeSuspend_u24lambda_u242"}, s = {"L$0", "L$1"})
        public static final class C04131 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C04131(Continuation continuation) {
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

        public AnonymousClass1(FlowCollector flowCollector, String str, String str2, SportRecordDetailViewModel sportRecordDetailViewModel, Bitmap bitmap) {
            this.$success$inlined = str;
            this.$fail$inlined = str2;
            this.this$0 = sportRecordDetailViewModel;
            this.$bitmap$inlined = bitmap;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ae A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x00af  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            C04131 c04131;
            AnonymousClass1<T> anonymousClass1;
            FlowCollector<String> flowCollector;
            String str;
            String str2;
            if (continuation instanceof C04131) {
                c04131 = (C04131) continuation;
                int i = c04131.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c04131.label = i - Integer.MIN_VALUE;
                } else {
                    c04131 = new C04131(continuation);
                }
            } else {
                c04131 = new C04131(continuation);
            }
            Object obj = c04131.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c04131.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector<String> flowCollector2 = this.$$this$flow;
                String str3 = (String) t;
                FitnessLogUtils.i(SportRecordDetailViewModel.TAG, "uploadIconToFds url:" + str3);
                if (str3.length() > 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    this.$bitmap$inlined.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                    Intrinsics.checkNotNull(byteArray);
                    c04131.L$0 = this;
                    c04131.L$1 = flowCollector2;
                    c04131.label = 1;
                    Object objUploadIconToFds = trackNetManagerKt.uploadIconToFds(str3, byteArray, c04131);
                    if (objUploadIconToFds == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anonymousClass1 = this;
                    obj = objUploadIconToFds;
                    flowCollector = flowCollector2;
                    if (((FdsResult) obj).isSuccess()) {
                        str2 = anonymousClass1.$success$inlined;
                        c04131.L$0 = null;
                        c04131.L$1 = null;
                        c04131.label = 2;
                        if (flowCollector.emit(str2, c04131) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        str = anonymousClass1.$fail$inlined;
                        c04131.L$0 = null;
                        c04131.L$1 = null;
                        c04131.label = 3;
                        if (flowCollector.emit(str, c04131) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    this.this$0.toastTrack(j1j.T0);
                    String str4 = this.$fail$inlined;
                    c04131.label = 4;
                    if (flowCollector2.emit(str4, c04131) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i2 == 1) {
                flowCollector = (FlowCollector) c04131.L$1;
                anonymousClass1 = (AnonymousClass1) c04131.L$0;
                ResultKt.throwOnFailure(obj);
                if (((FdsResult) obj).isSuccess()) {
                    str2 = anonymousClass1.$success$inlined;
                    c04131.L$0 = null;
                    c04131.L$1 = null;
                    c04131.label = 2;
                    if (flowCollector.emit(str2, c04131) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    str = anonymousClass1.$fail$inlined;
                    c04131.L$0 = null;
                    c04131.L$1 = null;
                    c04131.label = 3;
                    if (flowCollector.emit(str, c04131) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2(Flow flow, Continuation continuation, String str, String str2, SportRecordDetailViewModel sportRecordDetailViewModel, Bitmap bitmap) {
        super(2, continuation);
        this.$this_transform = flow;
        this.$success$inlined = str;
        this.$fail$inlined = str2;
        this.this$0 = sportRecordDetailViewModel;
        this.$bitmap$inlined = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2 sportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2 = new SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2(this.$this_transform, continuation, this.$success$inlined, this.$fail$inlined, this.this$0, this.$bitmap$inlined);
        sportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2.L$0 = obj;
        return sportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.$success$inlined, this.$fail$inlined, this.this$0, this.$bitmap$inlined);
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
        return ((SportRecordDetailViewModel$uploadTrack$2$1$invokeSuspend$$inlined$transform$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
