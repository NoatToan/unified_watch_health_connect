package com.huami.bloodpressure_core.dc.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Database(entities = {BloodPressureDbVo.class}, exportSchema = false, version = 1)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/bloodpressure_core/dc/local/BloodPressureDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/bloodpressure_core/dc/local/IBloodPressureDao;", "bpDao", "<init>", "()V", "Companion", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodPressureDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile BloodPressureDatabase a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/bloodpressure_core/dc/local/BloodPressureDatabase$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dbName", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDatabase;", "create", "INSTANCE", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDatabase;", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BloodPressureDatabase create$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "blood_pressure";
            }
            return companion.create(context, str);
        }

        @NotNull
        public final BloodPressureDatabase create(@NotNull Context context, @NotNull String dbName) {
            BloodPressureDatabase bloodPressureDatabase = BloodPressureDatabase.a;
            if (bloodPressureDatabase == null) {
                synchronized (this) {
                    bloodPressureDatabase = (BloodPressureDatabase) Room.databaseBuilder(context, BloodPressureDatabase.class, dbName).fallbackToDestructiveMigration().build();
                    Companion companion = BloodPressureDatabase.INSTANCE;
                    BloodPressureDatabase.a = bloodPressureDatabase;
                }
            }
            return bloodPressureDatabase;
        }
    }

    @NotNull
    public abstract IBloodPressureDao bpDao();
}
