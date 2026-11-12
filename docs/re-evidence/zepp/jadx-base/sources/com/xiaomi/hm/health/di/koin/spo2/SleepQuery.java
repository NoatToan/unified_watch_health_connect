package com.xiaomi.hm.health.di.koin.spo2;

import com.huami.bloodoxygen.core.koin.BoSleepInfo;
import com.huami.bloodoxygen.core.koin.ISleepQuery;
import com.xiaomi.hm.health.sleep.usercase.GetSleepTimeUseCase;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000b\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/spo2/SleepQuery;", "Lcom/huami/bloodoxygen/core/koin/ISleepQuery;", "", "date", "Lcom/huami/bloodoxygen/core/koin/BoSleepInfo;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/sleep/usercase/GetSleepTimeUseCase;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/sleep/usercase/GetSleepTimeUseCase;", "getSleepTimeUseCase", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepQuery implements ISleepQuery {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy getSleepTimeUseCase = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/sleep/usercase/GetSleepTimeUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<GetSleepTimeUseCase> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GetSleepTimeUseCase invoke() {
            return new GetSleepTimeUseCase();
        }
    }

    private final GetSleepTimeUseCase a() {
        return (GetSleepTimeUseCase) this.getSleepTimeUseCase.getValue();
    }

    @Override // com.huami.bloodoxygen.core.koin.ISleepQuery
    @Nullable
    public Object invoke(@NotNull String str, @NotNull Continuation<? super BoSleepInfo> continuation) {
        Pair<Long, Long> pairExecute = a().execute(str);
        if (pairExecute == null) {
            return null;
        }
        return new BoSleepInfo(str, pairExecute.getFirst().longValue(), pairExecute.getSecond().longValue(), null, 8, null);
    }
}
