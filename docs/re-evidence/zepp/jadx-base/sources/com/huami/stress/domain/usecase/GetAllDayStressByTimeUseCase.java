package com.huami.stress.domain.usecase;

import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.service.StressService;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/huami/stress/domain/usecase/GetAllDayStressByTimeUseCase;", "", "", "time", "Lcom/huami/stress/domain/model/AllDayStress;", Constant.METHOD_EXECUTE, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "a", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "mRepository", "<init>", "(Lcom/huami/stress/domain/repository/AllDayStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class GetAllDayStressByTimeUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AllDayStressRepository mRepository;

    public GetAllDayStressByTimeUseCase(@NotNull AllDayStressRepository allDayStressRepository) {
        this.mRepository = allDayStressRepository;
    }

    @Nullable
    public final Object execute(long j, @NotNull Continuation<? super AllDayStress> continuation) {
        HMLog.i(LogTagUtilsKt.getTAG(this), Intrinsics.stringPlus("GetAllDayStressByTimeUseCase execute ", Boxing.boxLong(j)), new Object[0]);
        return this.mRepository.getAllDayStressFromLocalByTimestamp(StressService.INSTANCE.getAllDayStressTimestamp(j), continuation);
    }
}
