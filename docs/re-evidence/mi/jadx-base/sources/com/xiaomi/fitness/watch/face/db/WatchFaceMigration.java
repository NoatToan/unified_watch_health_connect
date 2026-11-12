package com.xiaomi.fitness.watch.face.db;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.watch.face.db.WatchFaceMigration;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/WatchFaceMigration;", "", "<init>", "()V", "migrations", "", "Landroidx/room/migration/Migration;", "getMigrations", "()[Landroidx/room/migration/Migration;", "migrations$delegate", "Lkotlin/Lazy;", "MIGRATION_1_2", "MIGRATION_2_3", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WatchFaceMigration {

    @NotNull
    public static final WatchFaceMigration INSTANCE = new WatchFaceMigration();

    /* JADX INFO: renamed from: migrations$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy migrations = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n5r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WatchFaceMigration.migrations_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Migration MIGRATION_1_2 = new Migration() { // from class: com.xiaomi.fitness.watch.face.db.WatchFaceMigration$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("create table if not exists face_common_table ( combineId TEXT PRIMARY KEY NOT NULL, timestamp INTEGER default 0, did TEXT, faceId TEXT, name Text, upperColor TEXT, backgroundColor TEXT, md5 TEXT, path TEXT, multiPhotoDataList TEXT)");
            database.execSQL("insert into face_common_table(combineId, timestamp, did, faceId, name, upperColor) select did||id, timestamp, did, id, name, spiritColor from face_huami_realm");
            database.execSQL("insert or ignore into face_common_table(combineId, path, md5, multiPhotoDataList) select id, path, md5, list from face_ble_photo");
            database.execSQL("update face_common_table set path = (select path from face_ble_photo where combineId = face_ble_photo.id)");
            database.execSQL("update face_common_table set md5 = (select md5 from face_ble_photo where combineId = face_ble_photo.id)");
            database.execSQL("update face_common_table set multiPhotoDataList = (select list from face_ble_photo where combineId = face_ble_photo.id)");
        }
    };

    @NotNull
    private static final Migration MIGRATION_2_3 = new Migration() { // from class: com.xiaomi.fitness.watch.face.db.WatchFaceMigration$MIGRATION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER face_common_table ADD COLUMN ");
        }
    };

    private WatchFaceMigration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Migration[] migrations_delegate$lambda$0() {
        return new Migration[]{MIGRATION_1_2};
    }

    @NotNull
    public final Migration[] getMigrations() {
        return (Migration[]) migrations.getValue();
    }
}
