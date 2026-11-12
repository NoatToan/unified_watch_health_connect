package com.xiaomi.fitness.electronic.scale.dao;

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
import com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import defpackage.qal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Database(entities = {VirtualAccount.class}, exportSchema = false, version = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/dao/VirtualAccountDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "getVirtualAccountDao", "Lcom/xiaomi/fitness/electronic/scale/dao/dao/VirtualAccountDao;", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVirtualAccountDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualAccountDatabase.kt\ncom/xiaomi/fitness/electronic/scale/dao/VirtualAccountDatabase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,50:1\n20#2,8:51\n*S KotlinDebug\n*F\n+ 1 VirtualAccountDatabase.kt\ncom/xiaomi/fitness/electronic/scale/dao/VirtualAccountDatabase\n*L\n30#1:51,8\n*E\n"})
public abstract class VirtualAccountDatabase extends BaseDatabase {

    @NotNull
    public static final String DB_NAME = "db_virtual_account";

    @NotNull
    private static final VirtualAccountDatabase instance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Migration MIGRATION_V1_V2 = new Migration() { // from class: com.xiaomi.fitness.electronic.scale.dao.VirtualAccountDatabase$Companion$MIGRATION_V1_V2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE virtual_account ADD COLUMN sn TEXT not null default ''");
            database.execSQL("ALTER TABLE virtual_account ADD COLUMN dataVersion INTEGER not null default 0");
            database.execSQL("ALTER TABLE virtual_account ADD COLUMN sex INTEGER not null default -1");
            database.execSQL("ALTER TABLE virtual_account ADD COLUMN birth INTEGER not null default 0");
            database.execSQL("ALTER TABLE virtual_account ADD COLUMN height INTEGER not null default 0");
            database.execSQL("ALTER TABLE virtual_account ADD COLUMN weightTarget REAL not null default 0");
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/dao/VirtualAccountDatabase$Companion;", "", "<init>", "()V", "DB_NAME", "", "MIGRATION_V1_V2", "Landroidx/room/migration/Migration;", "instance", "Lcom/xiaomi/fitness/electronic/scale/dao/VirtualAccountDatabase;", "getInstance", "()Lcom/xiaomi/fitness/electronic/scale/dao/VirtualAccountDatabase;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VirtualAccountDatabase getInstance() {
            return VirtualAccountDatabase.instance;
        }
    }

    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = DB_NAME;
        instance = (VirtualAccountDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, VirtualAccountDatabase>() { // from class: com.xiaomi.fitness.electronic.scale.dao.VirtualAccountDatabase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r3v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.electronic.scale.dao.VirtualAccountDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final VirtualAccountDatabase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), VirtualAccountDatabase.class, str);
                builderDatabaseBuilder.addMigrations(VirtualAccountDatabase.MIGRATION_V1_V2);
                builderDatabaseBuilder.addCallback(new RoomDatabase.Callback() { // from class: com.xiaomi.fitness.electronic.scale.dao.VirtualAccountDatabase$Companion$instance$1$1
                    @Override // androidx.room.RoomDatabase.Callback
                    public void onCreate(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onCreate(db);
                        qal.c("db_virtual_account db is created");
                    }

                    @Override // androidx.room.RoomDatabase.Callback
                    public void onOpen(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onOpen(db);
                        qal.c("db_virtual_account db is opened");
                    }
                });
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    @NotNull
    public abstract VirtualAccountDao getVirtualAccountDao();
}
