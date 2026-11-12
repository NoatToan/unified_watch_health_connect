package com.xiaomi.fitness.detail.inner;

import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItemArtist;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItemKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2", f = "SportDetailJustDanceDataFragment.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
public final class SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SwitchSongItem $song;
    int label;
    final /* synthetic */ SportDetailJustDanceDataFragment this$0;
    final /* synthetic */ SportDetailJustDanceDataFragment.JustDanceDataListAdapter.JustDanceListHolder this$1;

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2$1", f = "SportDetailJustDanceDataFragment.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ SwitchSongApiService $apiService;
        final /* synthetic */ String $dynamicApiEndpoint;
        int label;
        final /* synthetic */ SportDetailJustDanceDataFragment.JustDanceDataListAdapter.JustDanceListHolder this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2$1$1", f = "SportDetailJustDanceDataFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SwitchSongItemArtist $switchSongItemArtist;
            int label;
            final /* synthetic */ SportDetailJustDanceDataFragment.JustDanceDataListAdapter.JustDanceListHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03931(SportDetailJustDanceDataFragment.JustDanceDataListAdapter.JustDanceListHolder justDanceListHolder, SwitchSongItemArtist switchSongItemArtist, Continuation<? super C03931> continuation) {
                super(2, continuation);
                this.this$0 = justDanceListHolder;
                this.$switchSongItemArtist = switchSongItemArtist;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03931(this.this$0, this.$switchSongItemArtist, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getBinding().I.setText(this.$switchSongItemArtist.getArtist());
                this.this$0.getBinding().E.setText(this.$switchSongItemArtist.getTitle());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SwitchSongApiService switchSongApiService, String str, SportDetailJustDanceDataFragment.JustDanceDataListAdapter.JustDanceListHolder justDanceListHolder, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$apiService = switchSongApiService;
            this.$dynamicApiEndpoint = str;
            this.this$0 = justDanceListHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$apiService, this.$dynamicApiEndpoint, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SwitchSongApiService switchSongApiService = this.$apiService;
                String str = this.$dynamicApiEndpoint;
                this.label = 1;
                obj = switchSongApiService.getSwitchSongArcInfo(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return AnyExtKt.main$default(null, new C03931(this.this$0, (SwitchSongItemArtist) obj, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2(SwitchSongItem switchSongItem, SportDetailJustDanceDataFragment sportDetailJustDanceDataFragment, SportDetailJustDanceDataFragment.JustDanceDataListAdapter.JustDanceListHolder justDanceListHolder, Continuation<? super SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2> continuation) {
        super(2, continuation);
        this.$song = switchSongItem;
        this.this$0 = sportDetailJustDanceDataFragment;
        this.this$1 = justDanceListHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2(this.$song, this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String arcInfo = SwitchSongItemKt.getArcInfo(this.$song);
                Object objB = this.this$0.retrofit.b(SwitchSongApiService.class);
                Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
                SwitchSongApiService switchSongApiService = (SwitchSongApiService) objB;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(switchSongApiService, arcInfo, this.this$1, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            this.this$1.getBinding().E.setText(this.$song.getSongName());
            Logger.i("Just dance", "getArcInfo exception:" + e);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
