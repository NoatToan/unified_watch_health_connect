package com.huami.heartrate.repository.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {HeartRateEntity.class}, exportSchema = false, version = 1)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/heartrate/repository/db/HeartRateDb;", "Landroidx/room/RoomDatabase;", "Lcom/huami/heartrate/repository/db/HeartRateDao;", "manualHeartRateDao", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public abstract class HeartRateDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static HeartRateDb a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/heartrate/repository/db/HeartRateDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/heartrate/repository/db/HeartRateDb;", "create", DefaultSettingsSpiCall.n, "Lcom/huami/heartrate/repository/db/HeartRateDb;", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized HeartRateDb create(@NotNull Context context) {
            HeartRateDb heartRateDb;
            heartRateDb = HeartRateDb.a;
            if (heartRateDb == null) {
                heartRateDb = (HeartRateDb) Room.databaseBuilder(context, HeartRateDb.class, "heart_rate_data.db").addMigrations(new a()).build();
            }
            return heartRateDb;
        }
    }

    @NotNull
    public abstract HeartRateDao manualHeartRateDao();
}
