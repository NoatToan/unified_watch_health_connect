package com.xiaomi.fitness.sport_eco_manager.db;

import android.app.Application;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao;
import defpackage.mcn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Database(entities = {mcn.class}, exportSchema = false, version = 3)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/db/SCMDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "scmDao", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SCMDao;", "Companion", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSCMDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SCMDatabase.kt\ncom/xiaomi/fitness/sport_eco_manager/db/SCMDatabase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,48:1\n20#2,8:49\n*S KotlinDebug\n*F\n+ 1 SCMDatabase.kt\ncom/xiaomi/fitness/sport_eco_manager/db/SCMDatabase\n*L\n33#1:49,8\n*E\n"})
public abstract class SCMDatabase extends BaseDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Migration MIGRATION_V1_V2 = new Migration() { // from class: com.xiaomi.fitness.sport_eco_manager.db.SCMDatabase$Companion$MIGRATION_V1_V2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE eco_scm_table ADD COLUMN isAutoPause INTEGER NOT NULL DEFAULT 1");
        }
    };

    @NotNull
    private static final SCMDatabase instance;
    public static final int version = 3;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/db/SCMDatabase$Companion;", "", "<init>", "()V", "version", "", "MIGRATION_V1_V2", "Landroidx/room/migration/Migration;", "instance", "Lcom/xiaomi/fitness/sport_eco_manager/db/SCMDatabase;", "getInstance", "()Lcom/xiaomi/fitness/sport_eco_manager/db/SCMDatabase;", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SCMDatabase getInstance() {
            return SCMDatabase.instance;
        }
    }

    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = SCMConstants.scm_table;
        instance = (SCMDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, SCMDatabase>() { // from class: com.xiaomi.fitness.sport_eco_manager.db.SCMDatabase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r3v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.sport_eco_manager.db.SCMDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final SCMDatabase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), SCMDatabase.class, str);
                builderDatabaseBuilder.addMigrations(SCMDatabase.MIGRATION_V1_V2);
                builderDatabaseBuilder.addCallback(new RoomDatabase.Callback() { // from class: com.xiaomi.fitness.sport_eco_manager.db.SCMDatabase$Companion$instance$1$1
                    @Override // androidx.room.RoomDatabase.Callback
                    public void onCreate(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onCreate(db);
                    }

                    @Override // androidx.room.RoomDatabase.Callback
                    public void onOpen(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onOpen(db);
                    }
                });
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    @NotNull
    public abstract SCMDao scmDao();
}
