package com.huami.watchfacesstore.ui.store.detail;

import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ui.DownLoadState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1 implements FlowCollector<DownLoadState> {
    public final /* synthetic */ WatchFaceDetailViewModel a;

    /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1", f = "WatchFaceDetailViewModel.kt", i = {0, 0, 1}, l = {135, 142, 144}, m = "emit", n = {"this", "it", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1(WatchFaceDetailViewModel watchFaceDetailViewModel) {
        this.a = watchFaceDetailViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(DownLoadState downLoadState, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        DownLoadState downLoadState2;
        WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1 watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1;
        WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1 watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$2;
        WatchFaceDetailViewModel watchFaceDetailViewModel;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.b = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.b;
        if (i2 != 0) {
            if (i2 == 1) {
                downLoadState2 = (DownLoadState) anonymousClass1.e;
                watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1 = (WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1) anonymousClass1.d;
                ResultKt.throwOnFailure(obj);
            } else if (i2 == 2) {
                watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$2 = (WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1) anonymousClass1.d;
                ResultKt.throwOnFailure(obj);
                watchFaceDetailViewModel = watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$2.a;
                anonymousClass1.d = null;
                anonymousClass1.b = 3;
                if (watchFaceDetailViewModel.s(anonymousClass1) == coroutine_suspended) {
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
        downLoadState2 = downLoadState;
        MutableSharedFlow mutableSharedFlow = this.a._downloadStatusFlow;
        anonymousClass1.d = this;
        anonymousClass1.e = downLoadState2;
        anonymousClass1.b = 1;
        if (mutableSharedFlow.emit(downLoadState2, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1 = this;
        if (Intrinsics.areEqual(downLoadState2, DownLoadState.SUCCESS.INSTANCE)) {
            HMLog.info("WatchFaceDetailViewModel", new WatchFaceDetailViewModel$doDownloadAndSync$2.b(watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1.a));
            WatchFaceDetailViewModel watchFaceDetailViewModel2 = watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1.a;
            anonymousClass1.d = watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1;
            anonymousClass1.e = null;
            anonymousClass1.b = 2;
            if (watchFaceDetailViewModel2.r(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$2 = watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1;
            watchFaceDetailViewModel = watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$2.a;
            anonymousClass1.d = null;
            anonymousClass1.b = 3;
            if (watchFaceDetailViewModel.s(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (Intrinsics.areEqual(downLoadState2, DownLoadState.FAIL.INSTANCE)) {
            HMLog.info("WatchFaceDetailViewModel", new WatchFaceDetailViewModel$doDownloadAndSync$2.c(watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1.a));
        } else {
            HMLog.info("WatchFaceDetailViewModel", new WatchFaceDetailViewModel$doDownloadAndSync$2.d(downLoadState2, watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1.a));
        }
        return Unit.INSTANCE;
    }
}
