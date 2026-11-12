package com.xiaomi.fit.fitness.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.db.dao.CgmGlucoseDao;
import com.xiaomi.fit.fitness.db.dao.CgmGlucoseEntity;
import com.xiaomi.fit.fitness.db.dao.DataSyncEntity;
import com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Database(entities = {DataSyncEntity.class, CgmGlucoseEntity.class}, exportSchema = false, version = 3)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fit/fitness/db/FitnessSyncDataBase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "deviceDataSyncDao", "Lcom/xiaomi/fit/fitness/db/dao/DeviceDataSyncDao;", "cgmGlucoseDao", "Lcom/xiaomi/fit/fitness/db/dao/CgmGlucoseDao;", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessSyncDataBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessSyncDataBase.kt\ncom/xiaomi/fit/fitness/db/FitnessSyncDataBase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,60:1\n20#2,8:61\n*S KotlinDebug\n*F\n+ 1 FitnessSyncDataBase.kt\ncom/xiaomi/fit/fitness/db/FitnessSyncDataBase\n*L\n53#1:61,8\n*E\n"})
public abstract class FitnessSyncDataBase extends BaseDatabase {

    @NotNull
    private static final FitnessSyncDataBase instance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "FitnessSyncDataBase";

    @NotNull
    private static final FitnessSyncDataBase$Companion$migration_2_3$1 migration_2_3 = new Migration() { // from class: com.xiaomi.fit.fitness.db.FitnessSyncDataBase$Companion$migration_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            try {
                database.execSQL("CREATE TABLE IF NOT EXISTS `cgm_glucose` (`did` TEXT NOT NULL, `time` INTEGER NOT NULL, `dataType` INTEGER NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`did`, `time`, `dataType`))");
            } catch (Exception e) {
                FitnessLogUtils.e(FitnessSyncDataBase.TAG, "migration_2_3", e);
            }
        }
    };

    @NotNull
    private static final FitnessSyncDataBase$Companion$migration_1_2$1 migration_1_2 = new Migration() { // from class: com.xiaomi.fit.fitness.db.FitnessSyncDataBase$Companion$migration_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            try {
                database.execSQL("ALTER TABLE `device_sync` ADD `forceSync` INTEGER NOT NULL DEFAULT 1; ");
            } catch (Exception e) {
                FitnessLogUtils.e(FitnessSyncDataBase.TAG, "migration_1_2", e);
            }
        }
    };

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\u0007\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/db/FitnessSyncDataBase$Companion;", "", "<init>", "()V", "TAG", "", "migration_2_3", "com/xiaomi/fit/fitness/db/FitnessSyncDataBase$Companion$migration_2_3$1", "Lcom/xiaomi/fit/fitness/db/FitnessSyncDataBase$Companion$migration_2_3$1;", "migration_1_2", "com/xiaomi/fit/fitness/db/FitnessSyncDataBase$Companion$migration_1_2$1", "Lcom/xiaomi/fit/fitness/db/FitnessSyncDataBase$Companion$migration_1_2$1;", "instance", "Lcom/xiaomi/fit/fitness/db/FitnessSyncDataBase;", "getInstance", "()Lcom/xiaomi/fit/fitness/db/FitnessSyncDataBase;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessSyncDataBase getInstance() {
            return FitnessSyncDataBase.instance;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.fit.fitness.db.FitnessSyncDataBase$Companion$migration_2_3$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.fit.fitness.db.FitnessSyncDataBase$Companion$migration_1_2$1] */
    static {
        final String str = "fitness_sync";
        instance = (FitnessSyncDataBase) ((BaseDatabase) new SingleHolder(new Function1<Context, FitnessSyncDataBase>() { // from class: com.xiaomi.fit.fitness.db.FitnessSyncDataBase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r5v5, types: [com.xiaomi.fit.fitness.db.FitnessSyncDataBase, com.xiaomi.fitness.database.BaseDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final FitnessSyncDataBase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), FitnessSyncDataBase.class, str);
                builderDatabaseBuilder.addMigrations(FitnessSyncDataBase.migration_1_2, FitnessSyncDataBase.migration_2_3);
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(ApplicationExtKt.getApplication()));
    }

    @NotNull
    public abstract CgmGlucoseDao cgmGlucoseDao();

    @NotNull
    public abstract DeviceDataSyncDao deviceDataSyncDao();
}
