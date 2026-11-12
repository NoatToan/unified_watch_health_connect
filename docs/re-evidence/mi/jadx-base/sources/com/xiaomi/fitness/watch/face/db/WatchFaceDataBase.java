package com.xiaomi.fitness.watch.face.db;

import android.app.Application;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@TypeConverters({FaceTypeConverter.class})
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/WatchFaceDataBase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "watchFaceDao", "Lcom/xiaomi/fitness/watch/face/db/WatchFaceDao;", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Database(entities = {FaceBlePhoto.class, FaceHuaMiRealm.class, PhotoBean.class, FaceCommonEntity.class}, exportSchema = false, version = 2)
@SourceDebugExtension({"SMAP\nWatchFaceDataBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDataBase.kt\ncom/xiaomi/fitness/watch/face/db/WatchFaceDataBase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,29:1\n20#2,8:30\n*S KotlinDebug\n*F\n+ 1 WatchFaceDataBase.kt\ncom/xiaomi/fitness/watch/face/db/WatchFaceDataBase\n*L\n25#1:30,8\n*E\n"})
public abstract class WatchFaceDataBase extends BaseDatabase {
    public static final int CURRENT_VERSION = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DB_NAME = "face";

    @NotNull
    private static final WatchFaceDataBase instance;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/WatchFaceDataBase$Companion;", "", "<init>", "()V", "DB_NAME", "", "CURRENT_VERSION", "", "instance", "Lcom/xiaomi/fitness/watch/face/db/WatchFaceDataBase;", "getInstance", "()Lcom/xiaomi/fitness/watch/face/db/WatchFaceDataBase;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WatchFaceDataBase getInstance() {
            return WatchFaceDataBase.instance;
        }
    }

    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = DB_NAME;
        instance = (WatchFaceDataBase) ((BaseDatabase) new SingleHolder(new Function1<Context, WatchFaceDataBase>() { // from class: com.xiaomi.fitness.watch.face.db.WatchFaceDataBase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r3v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.watch.face.db.WatchFaceDataBase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final WatchFaceDataBase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), WatchFaceDataBase.class, str);
                Migration[] migrations = WatchFaceMigration.INSTANCE.getMigrations();
                builderDatabaseBuilder.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    @NotNull
    public abstract WatchFaceDao watchFaceDao();
}
