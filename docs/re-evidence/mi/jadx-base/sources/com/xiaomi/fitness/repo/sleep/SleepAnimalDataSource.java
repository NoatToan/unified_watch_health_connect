package com.xiaomi.fitness.repo.sleep;

import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.repo.BaseDataSource;
import com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/SleepAnimalDataSource;", "Lcom/xiaomi/fitness/repo/BaseDataSource;", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "<init>", "(Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;)V", "getDataRecord", "", "startTime", "", "endTime", "zoneOffsetInSec", "", "pageSize", "reverse", "", "(JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepAnimalDataSource extends BaseDataSource<SleepAnimalReport> {
    public SleepAnimalDataSource(@Nullable PagingSourceParams pagingSourceParams) {
        super(pagingSourceParams);
    }

    @Override // com.xiaomi.fitness.repo.BaseDataSource
    @Nullable
    public Object getDataRecord(long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<SleepAnimalReport>> continuation) {
        return SleepStatDataRequest.INSTANCE.getInstance().getLimitedSleepAnimal(j, j2, i, i2, z, continuation);
    }
}
