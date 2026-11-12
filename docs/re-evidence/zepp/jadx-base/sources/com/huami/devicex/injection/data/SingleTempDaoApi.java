package com.huami.devicex.injection.data;

import com.google.android.gms.fitness.data.WorkoutExercises;
import com.xiaomi.hm.health.temperature.local.entity.SingleTempEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/huami/devicex/injection/data/SingleTempDaoApi;", "", "", "Lcom/xiaomi/hm/health/temperature/local/entity/SingleTempEntity;", "data", "", "insertOrUpdateSingleTemp", "getLatestSingleTemp", "", "start", "end", "getSingleTempBetweenTimestamp", WorkoutExercises.CLEAN, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface SingleTempDaoApi {
    void clean();

    @Nullable
    SingleTempEntity getLatestSingleTemp();

    @NotNull
    List<SingleTempEntity> getSingleTempBetweenTimestamp(long start, long end);

    void insertOrUpdateSingleTemp(@NotNull List<SingleTempEntity> data);
}
