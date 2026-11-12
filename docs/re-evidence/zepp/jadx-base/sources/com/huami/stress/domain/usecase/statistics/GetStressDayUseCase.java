package com.huami.stress.domain.usecase.statistics;

import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.service.StressService;
import com.huami.stress.domain.service.StressStatisticsService;
import com.huami.stress.domain.usecase.statistics.bean.StressStatistics;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/stress/domain/usecase/statistics/GetStressDayUseCase;", "", "", "time", "Lcom/huami/stress/domain/usecase/statistics/bean/StressStatistics;", Constant.METHOD_EXECUTE, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "a", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "allDayStressRepository", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "b", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "singleStressRepository", "<init>", "(Lcom/huami/stress/domain/repository/AllDayStressRepository;Lcom/huami/stress/domain/repository/SingleStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class GetStressDayUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AllDayStressRepository allDayStressRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository singleStressRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.usecase.statistics.GetStressDayUseCase", f = "GetStressDayUseCase.kt", i = {0, 0, 1}, l = {19, 23}, m = Constant.METHOD_EXECUTE, n = {"this", "allDayStressTimestamp", "allDayStressDay"}, s = {"L$0", "J$0", "L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public long b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return GetStressDayUseCase.this.execute(0L, this);
        }
    }

    public GetStressDayUseCase(@NotNull AllDayStressRepository allDayStressRepository, @NotNull SingleStressRepository singleStressRepository) {
        this.allDayStressRepository = allDayStressRepository;
        this.singleStressRepository = singleStressRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object execute(long j, @NotNull Continuation<? super StressStatistics> continuation) {
        a aVar;
        long allDayStressTimestamp;
        GetStressDayUseCase getStressDayUseCase;
        AllDayStress allDayStress;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object allDayStressFromLocalByTimestamp = aVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                allDayStressTimestamp = aVar2.b;
                getStressDayUseCase = (GetStressDayUseCase) aVar2.a;
                ResultKt.throwOnFailure(allDayStressFromLocalByTimestamp);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                allDayStress = (AllDayStress) aVar2.a;
                ResultKt.throwOnFailure(allDayStressFromLocalByTimestamp);
            }
            return StressStatisticsService.INSTANCE.statisticsStressByDay(allDayStress, (List) allDayStressFromLocalByTimestamp);
        }
        ResultKt.throwOnFailure(allDayStressFromLocalByTimestamp);
        allDayStressTimestamp = StressService.INSTANCE.getAllDayStressTimestamp(j);
        AllDayStressRepository allDayStressRepository = this.allDayStressRepository;
        aVar2.a = this;
        aVar2.b = allDayStressTimestamp;
        aVar2.e = 1;
        allDayStressFromLocalByTimestamp = allDayStressRepository.getAllDayStressFromLocalByTimestamp(allDayStressTimestamp, aVar2);
        if (allDayStressFromLocalByTimestamp == coroutine_suspended) {
            return coroutine_suspended;
        }
        getStressDayUseCase = this;
        AllDayStress allDayStress2 = (AllDayStress) allDayStressFromLocalByTimestamp;
        SingleStressRepository singleStressRepository = getStressDayUseCase.singleStressRepository;
        aVar2.a = allDayStress2;
        aVar2.e = 2;
        Object singleStressListFromLocalBetweenStamp = singleStressRepository.getSingleStressListFromLocalBetweenStamp(allDayStressTimestamp, (((long) 86400000) + allDayStressTimestamp) - 1, aVar2);
        if (singleStressListFromLocalBetweenStamp == coroutine_suspended) {
            return coroutine_suspended;
        }
        allDayStressFromLocalByTimestamp = singleStressListFromLocalBetweenStamp;
        allDayStress = allDayStress2;
        return StressStatisticsService.INSTANCE.statisticsStressByDay(allDayStress, (List) allDayStressFromLocalByTimestamp);
    }
}
