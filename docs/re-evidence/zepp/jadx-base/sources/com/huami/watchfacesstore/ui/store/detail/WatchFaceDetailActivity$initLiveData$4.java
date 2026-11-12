package com.huami.watchfacesstore.ui.store.detail;

import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.DownLoadState;
import com.huami.widget.toast.IconToast;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$initLiveData$4", f = "WatchFaceDetailActivity.kt", i = {}, l = {887}, m = "invokeSuspend", n = {}, s = {})
public final class WatchFaceDetailActivity$initLiveData$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ WatchFaceDetailActivity b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$initLiveData$4$1", f = "WatchFaceDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<FlowCollector<? super DownLoadState>, Throwable, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$initLiveData$4$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0701a extends Lambda implements Function0<String> {
            public static final C0701a a = new C0701a();

            public C0701a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "error";
            }
        }

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super DownLoadState> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            return new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.error$default("WatchFaceDetailActivity", null, null, C0701a.a, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchFaceDetailActivity$initLiveData$4(WatchFaceDetailActivity watchFaceDetailActivity, Continuation<? super WatchFaceDetailActivity$initLiveData$4> continuation) {
        super(2, continuation);
        this.b = watchFaceDetailActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WatchFaceDetailActivity$initLiveData$4(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WatchFaceDetailActivity$initLiveData$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowM4456catch = FlowKt.m4456catch(this.b.v().getDownloadStatusFlow(), new a(null));
            final WatchFaceDetailActivity watchFaceDetailActivity = this.b;
            FlowCollector<DownLoadState> flowCollector = new FlowCollector<DownLoadState>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$initLiveData$4$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(DownLoadState downLoadState, @NotNull Continuation<? super Unit> continuation) {
                    DownLoadState downLoadState2 = downLoadState;
                    if (Intrinsics.areEqual(downLoadState2, DownLoadState.START.INSTANCE)) {
                        watchFaceDetailActivity.P(false);
                        watchFaceDetailActivity.q().btnSync.setDoneColor(R.color.wf_done_color);
                        watchFaceDetailActivity.q().btnSync.setState(3, R.string.wf_watch_face_download_start);
                    } else if (downLoadState2 instanceof DownLoadState.PROGRESS) {
                        int iIntValue = Boxing.boxInt(((DownLoadState.PROGRESS) downLoadState2).getProgress()).intValue();
                        watchFaceDetailActivity.q().btnSync.setState(3, watchFaceDetailActivity.getString(R.string.wf_watch_face_downloading, new Object[]{iIntValue + "%"}));
                        watchFaceDetailActivity.q().btnSync.setProgress(((float) iIntValue) / 100.0f);
                    } else if (Intrinsics.areEqual(downLoadState2, DownLoadState.SUCCESS.INSTANCE)) {
                        watchFaceDetailActivity.l("WF_Download_Success");
                        watchFaceDetailActivity.v().reportDownload(watchFaceDetailActivity.mWatchFaceId);
                    } else if (Intrinsics.areEqual(downLoadState2, DownLoadState.FAIL.INSTANCE)) {
                        watchFaceDetailActivity.l("WF_Download_Fail");
                        watchFaceDetailActivity.P(true);
                        IconToast.showError(KoinExtKt.getAppContext(), R.string.wf_watch_face_download_fail);
                        watchFaceDetailActivity.q().btnSync.setState(1, R.string.wf_watch_face_download_retry);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.a = 1;
            if (flowM4456catch.collect(flowCollector, this) == coroutine_suspended) {
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
