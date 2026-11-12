package com.huami.ecg.core.db.dao;

import android.text.TextUtils;
import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.training.ui.course.TrainingFilterListActivity;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\bg\u0018\u0000 02\u00020\u0001:\u00010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H'¢\u0006\u0004\b\u0005\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\u001d\u0010\t\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H'¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH'J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH'J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rH'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH'J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH'J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH'J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH'J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH'J\u001a\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH'J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH'J\b\u0010\u0019\u001a\u00020\u0004H'J\u0012\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rH'J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001bH'J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH'J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J:\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0016Jz\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\u0006\u0010'\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010)\u001a\u00020(2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010*2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0016J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u000fH'J>\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u000f2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0016J~\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u000f2\b\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\u0006\u0010'\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010)\u001a\u00020(2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010*2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0016J\u0011\u0010-\u001a\u0004\u0018\u00010\"H'¢\u0006\u0004\b-\u0010.Jr\u0010/\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\u0006\u0010'\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010)\u001a\u00020(2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010*2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0002¨\u00061"}, d2 = {"Lcom/huami/ecg/core/db/dao/EcgDao;", "", "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "", "insertOrReplace", "", "", "([Lcom/huami/ecg/core/db/entity/EcgData;)V", "insertIgnore", "", "id", "get", "", "userId", "Landroidx/lifecycle/LiveData;", "getData", "getLatest", "getLatestData", "getPre", "getPreData", "getNext", "getNextData", "getUnSyncData", "delete", "clear", "clearFriendData", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "query", "rawQuery", "rawQueryData", "getAll", "fromTime", "toTime", "", "limit", "userIds", "measureType", "timestamp", "offset", "", "asc", "", "equalWhere", "getAllData", "loadCount", "()Ljava/lang/Integer;", "buildQuery", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface EcgDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/ecg/core/db/dao/EcgDao$Companion;", "", "", "a", "Ljava/lang/String;", "TABLE_NAME", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static final String TABLE_NAME = "ecg_data";
        public static final /* synthetic */ Companion b = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        private static SimpleSQLiteQuery a(EcgDao ecgDao, String str, long j, long j2, List<Long> list, int i, int i2, boolean z, Map<String, String> map, List<String> list2) {
            Set<Map.Entry<String, String>> setEntrySet;
            StringBuilder sb = new StringBuilder("select * from ecg_data");
            sb.append(" where type != 'CHEST_HEART_SUBTYPE'");
            if (str != null) {
                sb.append(" and type = '" + str + '\'');
            }
            if (j >= 0) {
                sb.append(" and generatedTime >= " + j);
            }
            if (j2 >= 0) {
                sb.append(" and generatedTime <= " + j2);
            }
            if (!(list == null || list.isEmpty())) {
                sb.append(" and generatedTime in (" + TextUtils.join(",", list) + ')');
            }
            if (map != null && (setEntrySet = map.entrySet()) != null) {
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    sb.append(" and " + ((String) entry.getKey()) + " = " + ((String) entry.getValue()));
                }
            }
            if (!(list2 == null || list2.isEmpty())) {
                sb.append(" and userId in (" + TextUtils.join(",", list2) + ')');
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" order by generatedTime ");
            sb2.append(z ? TrainingFilterListActivity.FILTER_MODE_ORDER_ASC : "Desc");
            sb.append(sb2.toString());
            if (i2 >= 0) {
                sb.append(" limit " + i2);
            }
            if (i >= 0) {
                sb.append(" offset " + i);
            }
            return new SimpleSQLiteQuery(sb.toString());
        }

        public static /* synthetic */ SimpleSQLiteQuery b(EcgDao ecgDao, String str, long j, long j2, List list, int i, int i2, boolean z, Map map, List list2, int i3, Object obj) {
            if (obj == null) {
                return a(ecgDao, str, j, j2, list, i, i2, z, map, (i3 & 256) != 0 ? null : list2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildQuery");
        }

        public static /* synthetic */ void clearFriendData$default(EcgDao ecgDao, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFriendData");
            }
            if ((i & 1) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            ecgDao.clearFriendData(str);
        }

        public static /* synthetic */ EcgData get$default(EcgDao ecgDao, long j, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 2) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            return ecgDao.get(j, str);
        }

        @Nullable
        public static List<EcgData> getAll(EcgDao ecgDao, long j, long j2, int i, @Nullable List<String> list) {
            return ecgDao.getAll(null, j, j2, null, -1, i, true, null, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List getAll$default(EcgDao ecgDao, long j, long j2, int i, List list, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
            }
            if ((i2 & 8) != 0) {
                list = null;
            }
            return ecgDao.getAll(j, j2, i, list);
        }

        @NotNull
        public static LiveData<List<EcgData>> getAllData(EcgDao ecgDao, long j, long j2, int i, @Nullable List<String> list) {
            return ecgDao.getAllData(null, j, j2, null, -1, i, true, null, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData getAllData$default(EcgDao ecgDao, long j, long j2, int i, List list, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllData");
            }
            if ((i2 & 8) != 0) {
                list = null;
            }
            return ecgDao.getAllData(j, j2, i, list);
        }

        public static /* synthetic */ EcgData getLatest$default(EcgDao ecgDao, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLatest");
            }
            if ((i & 1) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            return ecgDao.getLatest(str);
        }

        public static /* synthetic */ LiveData getLatestData$default(EcgDao ecgDao, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLatestData");
            }
            if ((i & 1) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            return ecgDao.getLatestData(str);
        }

        public static /* synthetic */ EcgData getNext$default(EcgDao ecgDao, long j, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNext");
            }
            if ((i & 2) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            return ecgDao.getNext(j, str);
        }

        public static /* synthetic */ LiveData getNextData$default(EcgDao ecgDao, long j, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextData");
            }
            if ((i & 2) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            return ecgDao.getNextData(j, str);
        }

        public static /* synthetic */ EcgData getPre$default(EcgDao ecgDao, long j, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPre");
            }
            if ((i & 2) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            return ecgDao.getPre(j, str);
        }

        public static /* synthetic */ LiveData getPreData$default(EcgDao ecgDao, long j, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPreData");
            }
            if ((i & 2) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            return ecgDao.getPreData(j, str);
        }

        public static /* synthetic */ List getUnSyncData$default(EcgDao ecgDao, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnSyncData");
            }
            if ((i & 1) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            return ecgDao.getUnSyncData(str);
        }

        @Nullable
        public static List<EcgData> getAll(EcgDao ecgDao, @Nullable String str, long j, long j2, @Nullable List<Long> list, int i, int i2, boolean z, @Nullable Map<String, String> map, @Nullable List<String> list2) {
            return ecgDao.rawQuery(a(ecgDao, str, j, j2, list, i, i2, z, map, list2));
        }

        @NotNull
        public static LiveData<List<EcgData>> getAllData(EcgDao ecgDao, @Nullable String str, long j, long j2, @Nullable List<Long> list, int i, int i2, boolean z, @Nullable Map<String, String> map, @Nullable List<String> list2) {
            return ecgDao.rawQueryData(a(ecgDao, str, j, j2, list, i, i2, z, map, list2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List getAll$default(EcgDao ecgDao, String str, long j, long j2, List list, int i, int i2, boolean z, Map map, List list2, int i3, Object obj) {
            if (obj == null) {
                return ecgDao.getAll(str, j, j2, list, i, i2, z, map, (i3 & 256) != 0 ? null : list2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData getAllData$default(EcgDao ecgDao, String str, long j, long j2, List list, int i, int i2, boolean z, Map map, List list2, int i3, Object obj) {
            if (obj == null) {
                return ecgDao.getAllData(str, j, j2, list, i, i2, z, map, (i3 & 256) != 0 ? null : list2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllData");
        }
    }

    @Query("delete from ecg_data")
    void clear();

    @Query("delete from ecg_data where userId != :userId")
    void clearFriendData(@NotNull String userId);

    @Query("delete from ecg_data where generatedTime = :id")
    void delete(long id);

    @Delete
    void delete(@NotNull EcgData ecg);

    @Query("select * from ecg_data where generatedTime = :id limit 1")
    @Nullable
    EcgData get(long id);

    @Query("select * from ecg_data where generatedTime = :id AND userId = :userId limit 1")
    @Nullable
    EcgData get(long id, @NotNull String userId);

    @Query("select * from ecg_data order by generatedTime asc")
    @NotNull
    List<EcgData> getAll();

    @Nullable
    List<EcgData> getAll(long fromTime, long toTime, int limit, @Nullable List<String> userIds);

    @Nullable
    List<EcgData> getAll(@Nullable String measureType, long fromTime, long toTime, @Nullable List<Long> timestamp, int offset, int limit, boolean asc, @Nullable Map<String, String> equalWhere, @Nullable List<String> userIds);

    @Query("select * from ecg_data order by generatedTime asc")
    @NotNull
    LiveData<List<EcgData>> getAllData();

    @NotNull
    LiveData<List<EcgData>> getAllData(long fromTime, long toTime, int limit, @Nullable List<String> userIds);

    @NotNull
    LiveData<List<EcgData>> getAllData(@Nullable String measureType, long fromTime, long toTime, @Nullable List<Long> timestamp, int offset, int limit, boolean asc, @Nullable Map<String, String> equalWhere, @Nullable List<String> userIds);

    @Query("select * from ecg_data where generatedTime = :id limit 1")
    @NotNull
    LiveData<EcgData> getData(long id);

    @Query("select * from ecg_data where userId = :userId order by generatedTime desc limit 1")
    @Nullable
    EcgData getLatest(@NotNull String userId);

    @Query("select * from ecg_data where userId = :userId and userId = :userId order by generatedTime desc limit 1")
    @NotNull
    LiveData<EcgData> getLatestData(@NotNull String userId);

    @Query("select * from ecg_data where userId = :userId and userId = :userId and generatedTime > :id order by generatedTime asc limit 1")
    @Nullable
    EcgData getNext(long id, @NotNull String userId);

    @Query("select * from ecg_data where userId = :userId and generatedTime > :id order by generatedTime asc limit 1")
    @NotNull
    LiveData<EcgData> getNextData(long id, @NotNull String userId);

    @Query("select * from ecg_data where userId = :userId and generatedTime < :id order by generatedTime desc limit 1")
    @Nullable
    EcgData getPre(long id, @NotNull String userId);

    @Query("select * from ecg_data where userId = :userId and generatedTime < :id order by generatedTime desc limit 1")
    @NotNull
    LiveData<EcgData> getPreData(long id, @NotNull String userId);

    @Query("select * from ecg_data where userId = :userId and localUpdatedTime > updateTime or updateTime < 0")
    @Nullable
    List<EcgData> getUnSyncData(@NotNull String userId);

    @Insert(onConflict = 5)
    void insertIgnore(@NotNull EcgData ecg);

    @Insert(onConflict = 5)
    void insertIgnore(@NotNull List<EcgData> ecg);

    @Insert(onConflict = 5)
    void insertIgnore(@NotNull EcgData[] ecg);

    @Insert(onConflict = 1)
    void insertOrReplace(@NotNull EcgData ecg);

    @Insert(onConflict = 1)
    void insertOrReplace(@NotNull List<EcgData> ecg);

    @Insert(onConflict = 1)
    void insertOrReplace(@NotNull EcgData[] ecg);

    @Query("select count(generatedTime) from ecg_data")
    @Nullable
    Integer loadCount();

    @RawQuery(observedEntities = {EcgData.class})
    @Nullable
    List<EcgData> rawQuery(@NotNull SimpleSQLiteQuery query);

    @RawQuery(observedEntities = {EcgData.class})
    @NotNull
    LiveData<List<EcgData>> rawQueryData(@NotNull SimpleSQLiteQuery query);
}
