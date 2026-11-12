package com.huami.sky.ui.realtime;

import com.huami.sky.lib.entity.RelaxInfo;
import com.huami.sky.lib.entity.UserRelaxScore;
import com.huami.tools.log.HMLog;
import java.util.List;
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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.sky.ui.realtime.SkyRealTimeViewModel$getRelaxScoreFromLocal$1", f = "SkyRealTimeViewModel.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
public final class SkyRealTimeViewModel$getRelaxScoreFromLocal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SkyRealTimeViewModel b;
    public final /* synthetic */ long c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<UserRelaxScore> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<UserRelaxScore> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "放松指数图表更新值, 数据库更新: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<RelaxInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<RelaxInfo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "放松指数图表更新值, 数据库更新后发送: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "本地返回放松得分失败: " + this.a.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkyRealTimeViewModel$getRelaxScoreFromLocal$1(SkyRealTimeViewModel skyRealTimeViewModel, long j, Continuation<? super SkyRealTimeViewModel$getRelaxScoreFromLocal$1> continuation) {
        super(2, continuation);
        this.b = skyRealTimeViewModel;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SkyRealTimeViewModel$getRelaxScoreFromLocal$1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SkyRealTimeViewModel$getRelaxScoreFromLocal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<UserRelaxScore>> relaxScoreFromLocal = this.b.skyRepo.getRelaxScoreFromLocal(this.c);
                SkyRealTimeViewModel$getRelaxScoreFromLocal$1$invokeSuspend$$inlined$collect$1 skyRealTimeViewModel$getRelaxScoreFromLocal$1$invokeSuspend$$inlined$collect$1 = new SkyRealTimeViewModel$getRelaxScoreFromLocal$1$invokeSuspend$$inlined$collect$1(this.b);
                this.a = 1;
                if (relaxScoreFromLocal.collect(skyRealTimeViewModel$getRelaxScoreFromLocal$1$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            HMLog.info("SkyRealTimeViewModel", new c(e));
        }
        return Unit.INSTANCE;
    }
}
