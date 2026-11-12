package com.huami.pai.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.huami.pai.db.dao.FitnessAgeDao;
import com.huami.pai.db.dao.PaiDao;
import com.huami.pai.db.po.FitnessAge;
import com.huami.pai.db.po.Pai;
import com.huami.pai.db.userpai.PaiUserDao;
import com.huami.pai.vo.PAIDataVo;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Database(entities = {Pai.class, FitnessAge.class, PAIDataVo.class}, exportSchema = false, version = 9)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/pai/db/PaiDb;", "Landroidx/room/RoomDatabase;", "Lcom/huami/pai/db/dao/PaiDao;", "paiDao", "Lcom/huami/pai/db/dao/FitnessAgeDao;", "fitnessAgeDao", "Lcom/huami/pai/db/userpai/PaiUserDao;", "paiUserDB", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class PaiDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/pai/db/PaiDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dbName", "Lcom/huami/pai/db/PaiDb;", "create", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PaiDb create(@NotNull Context context, @NotNull String dbName) {
            return (PaiDb) Room.databaseBuilder(context, PaiDb.class, dbName).fallbackToDestructiveMigration().build();
        }
    }

    @NotNull
    public abstract FitnessAgeDao fitnessAgeDao();

    @NotNull
    public abstract PaiDao paiDao();

    @NotNull
    public abstract PaiUserDao paiUserDB();
}
