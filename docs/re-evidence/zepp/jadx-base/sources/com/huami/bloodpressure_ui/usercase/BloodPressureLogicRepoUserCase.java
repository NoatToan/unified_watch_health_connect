package com.huami.bloodpressure_ui.usercase;

import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_core.repo.IBloodPressureLogicRepo;
import com.huami.bloodpressure_core.repo.IBloodPressureRepo;
import com.huami.bloodpressure_ui.ext.TimeEx;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0006\u0010\n\u001a\u00020\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/huami/bloodpressure_ui/usercase/BloodPressureLogicRepoUserCase;", "", "", "timeStamp", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "getWeekDataByTimeStamp", "getDayDataByTimeStamp", "", "dateString", "getDateFlowByUserId", "getMaxTimeByUserId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTime", "endTime", "getBetweenData", "dateStr", "", "day", "", "getRemoteNightData", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodpressure_core/repo/IBloodPressureLogicRepo;", "a", "Lcom/huami/bloodpressure_core/repo/IBloodPressureLogicRepo;", "localDataRepo", "Lcom/huami/bloodpressure_core/repo/IBloodPressureRepo;", "b", "Lcom/huami/bloodpressure_core/repo/IBloodPressureRepo;", "remoteRepo", "<init>", "(Lcom/huami/bloodpressure_core/repo/IBloodPressureLogicRepo;Lcom/huami/bloodpressure_core/repo/IBloodPressureRepo;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureLogicRepoUserCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureLogicRepo localDataRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureRepo remoteRepo;

    public BloodPressureLogicRepoUserCase(@NotNull IBloodPressureLogicRepo iBloodPressureLogicRepo, @NotNull IBloodPressureRepo iBloodPressureRepo) {
        this.localDataRepo = iBloodPressureLogicRepo;
        this.remoteRepo = iBloodPressureRepo;
    }

    @NotNull
    public final Flow<List<BloodPressureDbVo>> getBetweenData(long startTime, long endTime) {
        return this.localDataRepo.getDataBetween(UserEx.getUserId(), startTime, endTime);
    }

    @NotNull
    public final Flow<List<BloodPressureDbVo>> getDateFlowByUserId(@NotNull String dateString) {
        return this.localDataRepo.getDateFlowByUserId(UserEx.getUserId(), dateString);
    }

    @NotNull
    public final Flow<List<BloodPressureDbVo>> getDayDataByTimeStamp(long timeStamp) {
        TimeEx timeEx = TimeEx.INSTANCE;
        return this.localDataRepo.getDataBetween(UserEx.getUserId(), timeEx.getDayStartTime(timeStamp), timeEx.getDayEndTime(timeStamp));
    }

    @Nullable
    public final Object getMaxTimeByUserId(@NotNull Continuation<? super Long> continuation) {
        return this.localDataRepo.getMaxTimeByUserId(UserEx.getUserId(), continuation);
    }

    @Nullable
    public final Object getRemoteNightData(@NotNull String str, int i, @NotNull Continuation<? super Unit> continuation) {
        Object remoteNightData = this.remoteRepo.getRemoteNightData(str, i, continuation);
        return remoteNightData == a.getCOROUTINE_SUSPENDED() ? remoteNightData : Unit.INSTANCE;
    }

    @NotNull
    public final Flow<List<BloodPressureDbVo>> getWeekDataByTimeStamp(long timeStamp) {
        TimeEx timeEx = TimeEx.INSTANCE;
        return this.localDataRepo.getDataBetween(UserEx.getUserId(), timeEx.getFirstDayOfWeekTime(timeStamp), timeEx.getLastDayOfWeekTime(timeStamp));
    }
}
