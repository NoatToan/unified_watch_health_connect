package com.huami.femalehealth.logiclib.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.db.dao.DeleteHistoryDao;
import com.huami.femalehealth.logiclib.db.dao.HistoryDao;
import com.huami.femalehealth.logiclib.db.dao.HistoryItemDao;
import com.huami.femalehealth.logiclib.db.po.DeletedMenstruationSection;
import com.huami.femalehealth.logiclib.db.po.MenstruationHistory;
import com.huami.femalehealth.logiclib.db.po.MenstruationRecord;
import com.huami.femalehealth.logiclib.db.po.Symptom;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@TypeConverters({PrimitiveListConverter.class, DateConverter.class, DegreeConverter.class, SymptomTypeConverter.class})
@Database(entities = {MenstruationRecord.class, Symptom.class, MenstruationHistory.class, DeletedMenstruationSection.class, HistoryItemBean.class}, exportSchema = false, version = 15)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;", "Landroidx/room/RoomDatabase;", "Lcom/huami/femalehealth/logiclib/db/dao/HistoryDao;", "historyDao", "Lcom/huami/femalehealth/logiclib/db/dao/DeleteHistoryDao;", "deleteHistoryDao", "Lcom/huami/femalehealth/logiclib/db/dao/HistoryItemDao;", "historyItemDao", "<init>", "()V", "Companion", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public abstract class FemaleHealthDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dbName", "Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;", "create", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("create, dbName=", this.a);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FemaleHealthDb create(@NotNull Context context, @NotNull String dbName) {
            HMLog.info("FemaleHealthDb", new a(dbName));
            return (FemaleHealthDb) Room.databaseBuilder(context, FemaleHealthDb.class, dbName).fallbackToDestructiveMigration().build();
        }
    }

    @NotNull
    public abstract DeleteHistoryDao deleteHistoryDao();

    @NotNull
    public abstract HistoryDao historyDao();

    @NotNull
    public abstract HistoryItemDao historyItemDao();
}
