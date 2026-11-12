package com.huami.ecg.core.db;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.dao.EcgCacheTimeDao;
import com.huami.ecg.core.db.dao.EcgDao;
import com.huami.ecg.core.db.dao.EcgTagDao;
import com.huami.ecg.core.db.entity.EcgCacheTime;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Database(entities = {EcgData.class, EcgTag.class, EcgCacheTime.class}, version = 4)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/ecg/core/db/EcgDataBase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/ecg/core/db/dao/EcgDao;", "ecgDao", "Lcom/huami/ecg/core/db/dao/EcgTagDao;", "ecgTagDao", "Lcom/huami/ecg/core/db/dao/EcgCacheTimeDao;", "ecgCacheTimeDao", "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public abstract class EcgDataBase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);
    private static final Migration b;
    private static final Migration c;
    private static final Migration d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/ecg/core/db/EcgDataBase$Companion;", "", "Lcom/huami/ecg/core/db/EcgDataBase;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/huami/ecg/core/db/EcgDataBase;", DefaultSettingsSpiCall.n, "Landroidx/room/migration/Migration;", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "MIGRATION_2_3", "MIGRATION_3_4", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final EcgDataBase getInstance() {
            Lazy lazy = EcgDataBase.a;
            Companion companion = EcgDataBase.INSTANCE;
            return (EcgDataBase) lazy.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ecg/core/db/EcgDataBase;", "a", "()Lcom/huami/ecg/core/db/EcgDataBase;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<EcgDataBase> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgDataBase invoke() {
            return (EcgDataBase) Room.databaseBuilder(EcgCore.INSTANCE.getContext(), EcgDataBase.class, "ecg.db").addMigrations(EcgDataBase.b).addMigrations(EcgDataBase.c).addMigrations(EcgDataBase.d).allowMainThreadQueries().build();
        }
    }

    static {
        final int i = 1;
        final int i2 = 2;
        b = new Migration(i, i2) { // from class: com.huami.ecg.core.db.EcgDataBase$Companion$MIGRATION_1_2$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase database) {
                database.execSQL("ALTER TABLE ecg_data ADD COLUMN userId TEXT NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE ecg_data ADD COLUMN deviceId TEXT NOT NULL DEFAULT ''");
                database.execSQL("ALTER TABLE ecg_data ADD COLUMN sn TEXT NOT NULL DEFAULT ''");
            }
        };
        final int i3 = 3;
        c = new Migration(i2, i3) { // from class: com.huami.ecg.core.db.EcgDataBase$Companion$MIGRATION_2_3$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase database) {
                database.execSQL("ALTER TABLE ecg_data ADD COLUMN extraStatus TEXT");
            }
        };
        final int i4 = 4;
        d = new Migration(i3, i4) { // from class: com.huami.ecg.core.db.EcgDataBase$Companion$MIGRATION_3_4$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase database) {
                database.execSQL("CREATE TABLE `ecg_sync_time` (`userId` TEXT NOT NULL DEFAULT '' , `cacheStartDay` INTEGER NOT NULL DEFAULT -1 , `cacheEndDay` INTEGER NOT NULL DEFAULT -1 , PRIMARY KEY(`userId`))");
            }
        };
    }

    @NotNull
    public abstract EcgCacheTimeDao ecgCacheTimeDao();

    @NotNull
    public abstract EcgDao ecgDao();

    @NotNull
    public abstract EcgTagDao ecgTagDao();
}
