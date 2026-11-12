package com.xiaomi.fitness.account.user;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.account.user.UserDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Database(entities = {UserInfoProfile.class}, exportSchema = false, version = 3)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/account/user/UserDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "getUserDao", "Lcom/xiaomi/fitness/account/user/UserDao;", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDatabase.kt\ncom/xiaomi/fitness/account/user/UserDatabase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,66:1\n20#2,8:67\n*S KotlinDebug\n*F\n+ 1 UserDatabase.kt\ncom/xiaomi/fitness/account/user/UserDatabase\n*L\n55#1:67,8\n*E\n"})
public abstract class UserDatabase extends BaseDatabase {

    @NotNull
    private static final UserDatabase instance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Migration[]> migrations$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qfq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserDatabase.migrations_delegate$lambda$0();
        }
    });

    @NotNull
    private static final UserDatabase$Companion$migration_1_2$1 migration_1_2 = new Migration() { // from class: com.xiaomi.fitness.account.user.UserDatabase$Companion$migration_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE user_info_profile ADD COLUMN daily_sleep_goal INTEGER NOT NULL DEFAULT 0");
        }
    };

    @NotNull
    private static final UserDatabase$Companion$migration_2_3$1 migration_2_3 = new Migration() { // from class: com.xiaomi.fitness.account.user.UserDatabase$Companion$migration_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            boolean z;
            Intrinsics.checkNotNullParameter(database, "database");
            Cursor cursorQuery = database.query("PRAGMA table_info(user_info_profile)");
            int columnIndex = cursorQuery.getColumnIndex("name");
            while (true) {
                if (!cursorQuery.moveToNext()) {
                    z = false;
                    break;
                } else if (Intrinsics.areEqual("wear_medal", cursorQuery.getString(columnIndex))) {
                    z = true;
                    break;
                }
            }
            cursorQuery.close();
            if (z) {
                return;
            }
            database.execSQL("ALTER TABLE user_info_profile ADD COLUMN wear_medal TEXT");
        }
    };

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\f\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/account/user/UserDatabase$Companion;", "", "<init>", "()V", "migrations", "", "Landroidx/room/migration/Migration;", "getMigrations", "()[Landroidx/room/migration/Migration;", "migrations$delegate", "Lkotlin/Lazy;", "migration_1_2", "com/xiaomi/fitness/account/user/UserDatabase$Companion$migration_1_2$1", "Lcom/xiaomi/fitness/account/user/UserDatabase$Companion$migration_1_2$1;", "migration_2_3", "com/xiaomi/fitness/account/user/UserDatabase$Companion$migration_2_3$1", "Lcom/xiaomi/fitness/account/user/UserDatabase$Companion$migration_2_3$1;", "instance", "Lcom/xiaomi/fitness/account/user/UserDatabase;", "getInstance", "()Lcom/xiaomi/fitness/account/user/UserDatabase;", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Migration[] getMigrations() {
            return (Migration[]) UserDatabase.migrations$delegate.getValue();
        }

        @NotNull
        public final UserDatabase getInstance() {
            return UserDatabase.instance;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.fitness.account.user.UserDatabase$Companion$migration_1_2$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.xiaomi.fitness.account.user.UserDatabase$Companion$migration_2_3$1] */
    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = UserConstant.DATABASE_USER;
        instance = (UserDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, UserDatabase>() { // from class: com.xiaomi.fitness.account.user.UserDatabase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r3v5, types: [com.xiaomi.fitness.account.user.UserDatabase, com.xiaomi.fitness.database.BaseDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final UserDatabase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), UserDatabase.class, str);
                builderDatabaseBuilder.enableMultiInstanceInvalidation();
                builderDatabaseBuilder.allowMainThreadQueries();
                Migration[] migrations = UserDatabase.INSTANCE.getMigrations();
                builderDatabaseBuilder.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
                if (ApplicationExtKt.isSameProcess(ApplicationExtKt.getApplication(), ":device")) {
                    builderDatabaseBuilder.addCallback(new UserInfoMigrationCallBack(ApplicationExtKt.getApplication()));
                }
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Migration[] migrations_delegate$lambda$0() {
        return new Migration[]{migration_1_2, migration_2_3};
    }

    @NotNull
    public abstract UserDao getUserDao();
}
