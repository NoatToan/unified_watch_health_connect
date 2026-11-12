package com.huami.heartrate.usecase;

import com.huami.heartrate.repository.db.IDataBaseDataSource;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/heartrate/usecase/DeleteSyncedMeasureHrUseCase;", "", "", "earliestTime", "latestTime", "", Constant.METHOD_EXECUTE, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/heartrate/repository/db/IDataBaseDataSource;", "a", "Lcom/huami/heartrate/repository/db/IDataBaseDataSource;", "databaseDataSource", "<init>", "(Lcom/huami/heartrate/repository/db/IDataBaseDataSource;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class DeleteSyncedMeasureHrUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDataBaseDataSource databaseDataSource;

    public DeleteSyncedMeasureHrUseCase(@NotNull IDataBaseDataSource iDataBaseDataSource) {
        this.databaseDataSource = iDataBaseDataSource;
    }

    @Nullable
    public final Object execute(long j, long j2, @NotNull Continuation<? super Unit> continuation) {
        Object objDeleteSyncedHeartRate = this.databaseDataSource.deleteSyncedHeartRate(j, j2, continuation);
        return objDeleteSyncedHeartRate == a.getCOROUTINE_SUSPENDED() ? objDeleteSyncedHeartRate : Unit.INSTANCE;
    }
}
