package com.huami.bloodpressure_core.repo;

import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodpressure_core/repo/IBloodPressureLogicRepo;", "", "", "userId", "dateString", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "getDateFlowByUserId", "", "getMaxTimeByUserId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTime", "endTime", "getDataBetween", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressureLogicRepo {
    @NotNull
    Flow<List<BloodPressureDbVo>> getDataBetween(@NotNull String userId, long startTime, long endTime);

    @NotNull
    Flow<List<BloodPressureDbVo>> getDateFlowByUserId(@NotNull String userId, @NotNull String dateString);

    @Nullable
    Object getMaxTimeByUserId(@NotNull String str, @NotNull Continuation<? super Long> continuation);
}
