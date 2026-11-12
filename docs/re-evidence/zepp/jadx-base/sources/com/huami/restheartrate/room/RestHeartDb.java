package com.huami.restheartrate.room;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.restheartrate.entity.MaxHeartEntity;
import com.huami.restheartrate.entity.RestHeartEntity;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Database(entities = {RestHeartEntity.class, MaxHeartEntity.class}, exportSchema = false, version = 2)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/restheartrate/room/RestHeartDb;", "Landroidx/room/RoomDatabase;", "Lcom/huami/restheartrate/room/RestHeartDao;", "getRestHeartDao", "Lcom/huami/restheartrate/room/MaxHeartDao;", "getMaxHeartDao", "<init>", "()V", "Companion", "restheartrate_release"}, k = 1, mv = {1, 5, 1})
public abstract class RestHeartDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "RestHeartDb";

    @Nullable
    private static volatile RestHeartDb b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/restheartrate/room/RestHeartDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/restheartrate/room/RestHeartDb;", "a", "getInstance", "", "DATABASE_NAME", "Ljava/lang/String;", DefaultSettingsSpiCall.n, "Lcom/huami/restheartrate/room/RestHeartDb;", "<init>", "()V", "restheartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final RestHeartDb a(Context context) {
            return (RestHeartDb) Room.databaseBuilder(context, RestHeartDb.class, RestHeartDb.a).fallbackToDestructiveMigration().build();
        }

        @NotNull
        public final RestHeartDb getInstance(@NotNull Context context) {
            RestHeartDb restHeartDb = RestHeartDb.b;
            if (restHeartDb == null) {
                synchronized (this) {
                    restHeartDb = RestHeartDb.b;
                    if (restHeartDb == null) {
                        RestHeartDb restHeartDbA = RestHeartDb.INSTANCE.a(context);
                        RestHeartDb.b = restHeartDbA;
                        restHeartDb = restHeartDbA;
                    }
                }
            }
            return restHeartDb;
        }
    }

    @NotNull
    public abstract MaxHeartDao getMaxHeartDao();

    @NotNull
    public abstract RestHeartDao getRestHeartDao();
}
