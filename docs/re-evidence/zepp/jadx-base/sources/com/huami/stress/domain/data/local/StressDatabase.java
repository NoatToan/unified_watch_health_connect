package com.huami.stress.domain.data.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.huami.stress.domain.data.local.bean.AllDayStressDaoBean;
import com.huami.stress.domain.data.local.bean.SingleStressDaoBean;
import com.huami.stress.domain.data.local.dao.AllDayStressDao;
import com.huami.stress.domain.data.local.dao.SingleStressDao;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Database(entities = {AllDayStressDaoBean.class, SingleStressDaoBean.class}, exportSchema = false, version = 1)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/stress/domain/data/local/StressDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/stress/domain/data/local/dao/AllDayStressDao;", "allDayStressDao", "Lcom/huami/stress/domain/data/local/dao/SingleStressDao;", "singleStressDao", "<init>", "()V", "Companion", "domain_release"}, k = 1, mv = {1, 5, 1})
public abstract class StressDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/stress/domain/data/local/StressDatabase$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dbName", "Lcom/huami/stress/domain/data/local/StressDatabase;", "create", "<init>", "()V", "domain_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StressDatabase create(@NotNull Context context, @NotNull String dbName) {
            return (StressDatabase) Room.databaseBuilder(context, StressDatabase.class, dbName).fallbackToDestructiveMigration().build();
        }
    }

    @NotNull
    public abstract AllDayStressDao allDayStressDao();

    @NotNull
    public abstract SingleStressDao singleStressDao();
}
