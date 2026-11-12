package com.xiaomi.hm.health.temperature.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.temperature.local.dao.AllDayTempDao;
import com.xiaomi.hm.health.temperature.local.dao.ManualTempDao;
import com.xiaomi.hm.health.temperature.local.dao.SingleTempDao;
import com.xiaomi.hm.health.temperature.local.entity.AllDayTempEntity;
import com.xiaomi.hm.health.temperature.local.entity.ManualTempEntity;
import com.xiaomi.hm.health.temperature.local.entity.SingleTempEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Database(entities = {ManualTempEntity.class, AllDayTempEntity.class, SingleTempEntity.class}, exportSchema = false, version = 1)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/temperature/local/TemperatureDb;", "Landroidx/room/RoomDatabase;", "Lcom/xiaomi/hm/health/temperature/local/dao/AllDayTempDao;", "allDayTempDao", "Lcom/xiaomi/hm/health/temperature/local/dao/SingleTempDao;", "singleTempDao", "Lcom/xiaomi/hm/health/temperature/local/dao/ManualTempDao;", "manualTempDao", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class TemperatureDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/temperature/local/TemperatureDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dbName", "Lcom/xiaomi/hm/health/temperature/local/TemperatureDb;", "create", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TemperatureDb create(@NotNull Context context, @NotNull String dbName) {
            return (TemperatureDb) Room.databaseBuilder(context, TemperatureDb.class, dbName).fallbackToDestructiveMigration().build();
        }
    }

    @NotNull
    public abstract AllDayTempDao allDayTempDao();

    @NotNull
    public abstract ManualTempDao manualTempDao();

    @NotNull
    public abstract SingleTempDao singleTempDao();
}
