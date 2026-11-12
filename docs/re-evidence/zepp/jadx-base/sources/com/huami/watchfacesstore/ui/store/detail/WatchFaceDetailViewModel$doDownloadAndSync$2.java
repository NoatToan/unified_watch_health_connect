package com.huami.watchfacesstore.ui.store.detail;

import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.WatchFaceDetailBean;
import com.huami.watchfacesstore.ui.DownLoadState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$doDownloadAndSync$2", f = "WatchFaceDetailViewModel.kt", i = {}, l = {491}, m = "invokeSuspend", n = {}, s = {})
public final class WatchFaceDetailViewModel$doDownloadAndSync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ WatchFaceDetailViewModel b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WatchFaceDetailViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WatchFaceDetailViewModel watchFaceDetailViewModel) {
            super(0);
            this.a = watchFaceDetailViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            WatchFaceDetailBean detailData = this.a.getDetailData();
            Integer numValueOf = detailData == null ? null : Integer.valueOf(detailData.getId());
            WatchFaceDetailBean detailData2 = this.a.getDetailData();
            return "doDownloadAndSync start " + numValueOf + "  " + (detailData2 != null ? detailData2.getName() : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ WatchFaceDetailViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WatchFaceDetailViewModel watchFaceDetailViewModel) {
            super(0);
            this.a = watchFaceDetailViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            WatchFaceDetailBean detailData = this.a.getDetailData();
            Integer numValueOf = detailData == null ? null : Integer.valueOf(detailData.getId());
            WatchFaceDetailBean detailData2 = this.a.getDetailData();
            return "doDownloadAndSync SUCCESS " + numValueOf + "  " + (detailData2 != null ? detailData2.getName() : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ WatchFaceDetailViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WatchFaceDetailViewModel watchFaceDetailViewModel) {
            super(0);
            this.a = watchFaceDetailViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            WatchFaceDetailBean detailData = this.a.getDetailData();
            Integer numValueOf = detailData == null ? null : Integer.valueOf(detailData.getId());
            WatchFaceDetailBean detailData2 = this.a.getDetailData();
            return "doDownloadAndSync FAIL " + numValueOf + "  " + (detailData2 != null ? detailData2.getName() : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ DownLoadState a;
        public final /* synthetic */ WatchFaceDetailViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DownLoadState downLoadState, WatchFaceDetailViewModel watchFaceDetailViewModel) {
            super(0);
            this.a = downLoadState;
            this.b = watchFaceDetailViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            DownLoadState downLoadState = this.a;
            WatchFaceDetailBean detailData = this.b.getDetailData();
            Integer numValueOf = detailData == null ? null : Integer.valueOf(detailData.getId());
            WatchFaceDetailBean detailData2 = this.b.getDetailData();
            return "doDownloadAndSync " + downLoadState + " " + numValueOf + "  " + (detailData2 != null ? detailData2.getName() : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchFaceDetailViewModel$doDownloadAndSync$2(WatchFaceDetailViewModel watchFaceDetailViewModel, Continuation<? super WatchFaceDetailViewModel$doDownloadAndSync$2> continuation) {
        super(2, continuation);
        this.b = watchFaceDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WatchFaceDetailViewModel$doDownloadAndSync$2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WatchFaceDetailViewModel$doDownloadAndSync$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info("WatchFaceDetailViewModel", new a(this.b));
            Flow flowI = this.b.i();
            if (flowI == null) {
                return null;
            }
            WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1 watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1 = new WatchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1(this.b);
            this.a = 1;
            if (flowI.collect(watchFaceDetailViewModel$doDownloadAndSync$2$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
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
}
