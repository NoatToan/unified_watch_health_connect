package com.huami.treadmill.data.source.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.data.TdLine;
import com.huami.treadmill.data.TdPromotionLine;
import com.huami.treadmill.data.TdRecord;
import com.huami.treadmill.data.TdSpeedKingBean;
import com.huami.treadmill.data.TdkingBean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Database(entities = {TdPromotionLine.class, TdLine.class, TdRecord.class, TdkingBean.class, TdSpeedKingBean.class}, exportSchema = false, version = 6)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\u000f"}, d2 = {"Lcom/huami/treadmill/data/source/db/TreadmillDb;", "Landroidx/room/RoomDatabase;", "Lcom/huami/treadmill/data/source/db/TdPromotionLineDao;", "promotionLines", "Lcom/huami/treadmill/data/source/db/TdlineDao;", "lines", "Lcom/huami/treadmill/data/source/db/TdRecordDao;", "records", "Lcom/huami/treadmill/data/source/db/TdKingDiligentDao;", "kingsDiligent", "Lcom/huami/treadmill/data/source/db/TdKingSpeedDao;", "kingsSpeed", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public abstract class TreadmillDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/data/source/db/TreadmillDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "useInMemory", "Lcom/huami/treadmill/data/source/db/TreadmillDb;", "create", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TreadmillDb create(@NotNull Context context, boolean useInMemory) {
            return (TreadmillDb) (useInMemory ? Room.inMemoryDatabaseBuilder(context, TreadmillDb.class) : Room.databaseBuilder(context, TreadmillDb.class, "treadmill.db")).fallbackToDestructiveMigration().build();
        }
    }

    @NotNull
    public abstract TdKingDiligentDao kingsDiligent();

    @NotNull
    public abstract TdKingSpeedDao kingsSpeed();

    @NotNull
    public abstract TdlineDao lines();

    @NotNull
    public abstract TdPromotionLineDao promotionLines();

    @NotNull
    public abstract TdRecordDao records();
}
