package com.xiaomi.fitness.motion.recognition.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import com.xiaomi.fitness.motion.recognition.convert.SceneConverters;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.ScenePressureEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@TypeConverters({SceneConverters.class})
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/db/SceneRecogDb;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "sceneEventDao", "Lcom/xiaomi/fitness/motion/recognition/db/SceneEventDao;", "getSceneEventDao", "()Lcom/xiaomi/fitness/motion/recognition/db/SceneEventDao;", "sceneResultDao", "Lcom/xiaomi/fitness/motion/recognition/db/SceneResultDao;", "getSceneResultDao", "()Lcom/xiaomi/fitness/motion/recognition/db/SceneResultDao;", "Companion", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Database(entities = {SceneEvent.class, SceneResult.class, ScenePressureEvent.class}, version = 4)
@SourceDebugExtension({"SMAP\nSceneRecogDb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneRecogDb.kt\ncom/xiaomi/fitness/motion/recognition/db/SceneRecogDb\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,77:1\n20#2,8:78\n*S KotlinDebug\n*F\n+ 1 SceneRecogDb.kt\ncom/xiaomi/fitness/motion/recognition/db/SceneRecogDb\n*L\n72#1:78,8\n*E\n"})
public abstract class SceneRecogDb extends BaseDatabase {

    @NotNull
    private static final String ADD_SCENE_EVENT_SQL = "CREATE UNIQUE INDEX scene_event_index ON scene_event (scene_time)";

    @NotNull
    private static final String ADD_SCENE_RESULT_POSSIBLE_SQL = "ALTER TABLE scene_result ADD COLUMN possible INTEGER NOT NULL DEFAULT 0";

    @NotNull
    private static final String ADD_SCENE_RESULT_SQL = "CREATE UNIQUE INDEX scene_result_index ON scene_result (start)";
    public static final int CURRENT_VERSION = 4;

    @NotNull
    private static final String DB_NAME = "scene_recognition";

    @NotNull
    private static final String DELETE_SCENE_EVENT_SQL = "DELETE FROM scene_event";

    @NotNull
    private static final String DELETE_SCENE_RESULT_SQL = "DELETE FROM scene_result";

    @NotNull
    private static final SceneRecogDb instance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Migration MIGRATION_V1_V2 = new Migration() { // from class: com.xiaomi.fitness.motion.recognition.db.SceneRecogDb$Companion$MIGRATION_V1_V2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("DELETE FROM scene_event");
            database.execSQL("DELETE FROM scene_result");
            database.execSQL("CREATE UNIQUE INDEX scene_event_index ON scene_event (scene_time)");
            database.execSQL("CREATE UNIQUE INDEX scene_result_index ON scene_result (start)");
        }
    };

    @NotNull
    private static final Migration MIGRATION_V2_V3 = new Migration() { // from class: com.xiaomi.fitness.motion.recognition.db.SceneRecogDb$Companion$MIGRATION_V2_V3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE scene_result ADD COLUMN possible INTEGER NOT NULL DEFAULT 0");
        }
    };

    @NotNull
    private static final Migration MIGRATION_V3_V4 = new Migration() { // from class: com.xiaomi.fitness.motion.recognition.db.SceneRecogDb$Companion$MIGRATION_V3_V4$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS scene_pressure_event (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, time INTEGER NOT NULL, pressure REAL NOT NULL)");
            database.execSQL("CREATE UNIQUE INDEX scene_pressure_event_index ON scene_pressure_event (time, pressure)");
            database.execSQL("ALTER TABLE scene_result ADD COLUMN pressure_segment TEXT");
            database.execSQL("ALTER TABLE scene_event ADD  COLUMN scene_pressure REAL NOT NULL DEFAULT 0");
        }
    };

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/db/SceneRecogDb$Companion;", "", "<init>", "()V", "CURRENT_VERSION", "", "DB_NAME", "", "ADD_SCENE_EVENT_SQL", "DELETE_SCENE_EVENT_SQL", "ADD_SCENE_RESULT_SQL", "ADD_SCENE_RESULT_POSSIBLE_SQL", "DELETE_SCENE_RESULT_SQL", "MIGRATION_V1_V2", "Landroidx/room/migration/Migration;", "MIGRATION_V2_V3", "MIGRATION_V3_V4", "instance", "Lcom/xiaomi/fitness/motion/recognition/db/SceneRecogDb;", "getInstance", "()Lcom/xiaomi/fitness/motion/recognition/db/SceneRecogDb;", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SceneRecogDb getInstance() {
            return SceneRecogDb.instance;
        }
    }

    static {
        final String str = "scene_recognition";
        instance = (SceneRecogDb) ((BaseDatabase) new SingleHolder(new Function1<Context, SceneRecogDb>() { // from class: com.xiaomi.fitness.motion.recognition.db.SceneRecogDb$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r4v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.motion.recognition.db.SceneRecogDb] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final SceneRecogDb invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), SceneRecogDb.class, str);
                builderDatabaseBuilder.addMigrations(SceneRecogDb.MIGRATION_V1_V2, SceneRecogDb.MIGRATION_V2_V3, SceneRecogDb.MIGRATION_V3_V4);
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(ApplicationExtKt.getApplication()));
    }

    @NotNull
    public abstract SceneEventDao getSceneEventDao();

    @NotNull
    public abstract SceneResultDao getSceneResultDao();
}
