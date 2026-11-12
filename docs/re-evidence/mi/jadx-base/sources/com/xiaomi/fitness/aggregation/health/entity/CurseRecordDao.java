package com.xiaomi.fitness.aggregation.health.entity;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.xiaomi.fitness.repo.curse.CurseUtilKt;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH'J!\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004H'¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004H'¢\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000bH'J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0006H'J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H'J!\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004H'¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH'J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH'J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH'J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\tH'J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\tH'J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH'¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/entity/CurseRecordDao;", "", "getLatestByPage", "", "Lcom/xiaomi/fitness/aggregation/health/entity/CurseRecordEntity;", "pageOffset", "", "pageNum", "endSec", "", "insert", "", "record", "", "([Lcom/xiaomi/fitness/aggregation/health/entity/CurseRecordEntity;)V", "update", CervicalMucusRecord.Appearance.CLEAR, "getById", "id", "delete", "getByRange", "start0TZ", "end0TZ", "getLatestEnded", "startSec", "limit", "getLatest", "getFirstAfter", "time0TZ", "getFirstBefore", "observerChange", "Lkotlinx/coroutines/flow/Flow;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CurseRecordDao {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ CurseRecordEntity getFirstAfter$default(CurseRecordDao curseRecordDao, long j, long j2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFirstAfter");
            }
            if ((i & 2) != 0) {
                j2 = CurseUtilKt.getToday0TZ();
            }
            return curseRecordDao.getFirstAfter(j, j2);
        }

        public static /* synthetic */ List getLatest$default(CurseRecordDao curseRecordDao, long j, int i, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLatest");
            }
            if ((i2 & 4) != 0) {
                j2 = CurseUtilKt.getToday0TZ();
            }
            return curseRecordDao.getLatest(j, i, j2);
        }

        public static /* synthetic */ List getLatestByPage$default(CurseRecordDao curseRecordDao, int i, int i2, long j, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLatestByPage");
            }
            if ((i3 & 4) != 0) {
                j = CurseUtilKt.getToday0TZ();
            }
            return curseRecordDao.getLatestByPage(i, i2, j);
        }

        public static /* synthetic */ List getLatestEnded$default(CurseRecordDao curseRecordDao, long j, int i, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLatestEnded");
            }
            if ((i2 & 4) != 0) {
                j2 = CurseUtilKt.getToday0TZ();
            }
            return curseRecordDao.getLatestEnded(j, i, j2);
        }
    }

    @Query("delete from curse_record")
    void clear();

    @Query("delete from curse_record where id =:id")
    int delete(int id);

    @Delete
    void delete(@NotNull CurseRecordEntity... record);

    @Query("select * from curse_record where id =:id")
    @Nullable
    CurseRecordEntity getById(int id);

    @Query("select * from curse_record  where startSec0TZ<=:end0TZ and endSec0TZ>=:start0TZ order by startSec0TZ asc ")
    @NotNull
    List<CurseRecordEntity> getByRange(long start0TZ, long end0TZ);

    @Query("select * from curse_record where startSec0TZ > :time0TZ and startSec0TZ <=:endSec order by startSec0TZ asc limit 1")
    @Nullable
    CurseRecordEntity getFirstAfter(long time0TZ, long endSec);

    @Query("select * from curse_record where endSec0TZ < :time0TZ order by endSec0TZ desc limit 1")
    @Nullable
    CurseRecordEntity getFirstBefore(long time0TZ);

    @Query("select * from curse_record  where endSec0TZ>=:startSec and startSec0TZ <=:endSec order by startSec0TZ desc limit :limit")
    @NotNull
    List<CurseRecordEntity> getLatest(long startSec, int limit, long endSec);

    @Query("select * from curse_record where startSec0TZ <=:endSec order by startSec0TZ desc limit :pageNum offset :pageOffset")
    @NotNull
    List<CurseRecordEntity> getLatestByPage(int pageOffset, int pageNum, long endSec);

    @Query("select * from curse_record  where endSec0TZ>=:startSec and endSec0TZ <=:endSec order by startSec0TZ desc limit :limit")
    @NotNull
    List<CurseRecordEntity> getLatestEnded(long startSec, int limit, long endSec);

    @Insert(onConflict = 1)
    void insert(@NotNull CurseRecordEntity... record);

    @Query("select count(*) from curse_record")
    @NotNull
    Flow<Integer> observerChange();

    @Update(onConflict = 1)
    void update(@NotNull CurseRecordEntity... record);
}
