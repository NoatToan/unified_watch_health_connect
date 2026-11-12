package com.huami.devicex.injection.data;

import androidx.p008lifecycle.LiveData;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OdiEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaEventEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaProcessEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.PSpo2Entity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH&J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\u0011H&J\b\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&J#\u0010\u0018\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0002\"\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b0\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0017H&J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b0\u0011H&J\b\u0010\u001e\u001a\u00020\u0013H&J#\u0010 \u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u0002\"\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\n\u0010#\u001a\u0004\u0018\u00010\u001fH&J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\u0011H&J\b\u0010%\u001a\u00020\u0013H&J#\u0010'\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0\u0002\"\u00020&H&¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0012\u0010,\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*H&J\n\u0010-\u001a\u0004\u0018\u00010&H&J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u000b0\u0011H&J\b\u0010/\u001a\u00020\u0013H&J\b\u00100\u001a\u00020\u0013H&¨\u00061"}, d2 = {"Lcom/huami/devicex/injection/data/Spo2DaoApi;", "", "", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/PSpo2Entity;", "entity", "", "insertPSpo2", "([Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/PSpo2Entity;)[J", "", "start", "end", "", "queryPSpo2", "queryAllPSpo2", "time", "", "deletePSpo2", "Landroidx/lifecycle/LiveData;", "getPSpo2ShouldUpload", "", "clearPSpo2", "queryLatestPSpo2LiveData", "queryLatestPSpo2", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaProcessEntity;", "insertOsaProcess", "([Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaProcessEntity;)[J", "queryOsaProcess", "queryOsaProcessLiveData", "queryLatestOsaProcess", "getOsaProcessShouldUpload", "clearOsaProcess", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaEventEntity;", "insertOsaEvent", "([Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaEventEntity;)[J", "queryOsaEvent", "queryLatestOsaEvent", "getOsaEventShouldUpload", "clearOsaEvent", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OdiEntity;", "insertOdi", "([Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OdiEntity;)[J", "queryOdiByBetweenStamp", "", "date", "queryOdiByDate", "queryLatestOdi", "getOdiShouldUpload", "clearOdi", WorkoutExercises.CLEAN, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface Spo2DaoApi {
    void clean();

    void clearOdi();

    void clearOsaEvent();

    void clearOsaProcess();

    void clearPSpo2();

    int deletePSpo2(long time);

    @NotNull
    LiveData<List<OdiEntity>> getOdiShouldUpload();

    @NotNull
    LiveData<List<OsaEventEntity>> getOsaEventShouldUpload();

    @NotNull
    LiveData<List<OsaProcessEntity>> getOsaProcessShouldUpload();

    @NotNull
    LiveData<List<PSpo2Entity>> getPSpo2ShouldUpload();

    @NotNull
    long[] insertOdi(@NotNull OdiEntity... entity);

    @NotNull
    long[] insertOsaEvent(@NotNull OsaEventEntity... entity);

    @NotNull
    long[] insertOsaProcess(@NotNull OsaProcessEntity... entity);

    @NotNull
    long[] insertPSpo2(@NotNull PSpo2Entity... entity);

    @NotNull
    List<PSpo2Entity> queryAllPSpo2();

    @Nullable
    OdiEntity queryLatestOdi();

    @Nullable
    OsaEventEntity queryLatestOsaEvent();

    @Nullable
    OsaProcessEntity queryLatestOsaProcess();

    @Nullable
    PSpo2Entity queryLatestPSpo2();

    @NotNull
    LiveData<PSpo2Entity> queryLatestPSpo2LiveData();

    @NotNull
    List<OdiEntity> queryOdiByBetweenStamp(long start, long end);

    @Nullable
    OdiEntity queryOdiByDate(@NotNull String date);

    @NotNull
    List<OsaEventEntity> queryOsaEvent(long start, long end);

    @NotNull
    List<OsaProcessEntity> queryOsaProcess(long start, long end);

    @NotNull
    LiveData<List<OsaProcessEntity>> queryOsaProcessLiveData(long start, long end);

    @NotNull
    List<PSpo2Entity> queryPSpo2(long start, long end);
}
