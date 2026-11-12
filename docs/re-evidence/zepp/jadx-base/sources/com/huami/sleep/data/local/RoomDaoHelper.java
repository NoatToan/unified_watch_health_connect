package com.huami.sleep.data.local;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.huami.sleep.data.local.tonality.RatingCacheBean;
import com.huami.sleep.data.local.tonality.RatingCacheDao;
import com.huami.sleep.ext.KoinExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Database(entities = {RatingCacheBean.class}, exportSchema = false, version = 1)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/sleep/data/local/RoomDaoHelper;", "Landroidx/room/RoomDatabase;", "Lcom/huami/sleep/data/local/tonality/RatingCacheDao;", "getRatingCacheDao", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public abstract class RoomDaoHelper extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "sleep_db";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/sleep/data/local/RoomDaoHelper$Companion;", "", "Lcom/huami/sleep/data/local/RoomDaoHelper;", "buildDatabase", "", "DATABASE_NAME", "Ljava/lang/String;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RoomDaoHelper buildDatabase() {
            return (RoomDaoHelper) Room.databaseBuilder(KoinExtKt.getAppContext(), RoomDaoHelper.class, RoomDaoHelper.a).build();
        }
    }

    @NotNull
    public abstract RatingCacheDao getRatingCacheDao();
}
