package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.internal.SwitchSongDao;
import com.xiaomi.fit.fitness.persist.db.internal.SwitchSongEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class wro implements SwitchSongDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f38291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SwitchSongEntity> f38292b = new a();
    public final EntityDeleteOrUpdateAdapter<SwitchSongEntity> c = new b();

    public class a extends EntityInsertAdapter<SwitchSongEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SwitchSongEntity switchSongEntity) {
            sQLiteStatement.mo50bindLong(1, switchSongEntity.getTime());
            if (switchSongEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, switchSongEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(3, switchSongEntity.isUpload());
            if (switchSongEntity.getExtra() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, switchSongEntity.getExtra());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `switch_song_dao` (`time`,`value`,`isUpload`,`extra`) VALUES (?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<SwitchSongEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SwitchSongEntity switchSongEntity) {
            sQLiteStatement.mo50bindLong(1, switchSongEntity.getTime());
            if (switchSongEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, switchSongEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(3, switchSongEntity.isUpload());
            if (switchSongEntity.getExtra() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, switchSongEntity.getExtra());
            }
            sQLiteStatement.mo50bindLong(5, switchSongEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `switch_song_dao` SET `time` = ?,`value` = ?,`isUpload` = ?,`extra` = ? WHERE `time` = ?";
        }
    }

    public wro(RoomDatabase roomDatabase) {
        this.f38291a = roomDatabase;
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public static /* synthetic */ SwitchSongEntity f(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM switch_song_dao WHERE time = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            SwitchSongEntity switchSongEntity = null;
            if (sQLiteStatementPrepare.step()) {
                switchSongEntity = new SwitchSongEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
            }
            return switchSongEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List g(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM switch_song_dao WHERE isUpload = 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new SwitchSongEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SwitchSongDao
    public SwitchSongEntity getEntityByTimeStamp(final long j) {
        return (SwitchSongEntity) DBUtil.performBlocking(this.f38291a, true, false, new Function1() { // from class: sro
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return wro.f(j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SwitchSongDao
    public List<SwitchSongEntity> getNotUploadEntities() {
        return (List) DBUtil.performBlocking(this.f38291a, true, false, new Function1() { // from class: vro
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return wro.g((SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object h(SwitchSongEntity[] switchSongEntityArr, SQLiteConnection sQLiteConnection) {
        this.f38292b.insert(sQLiteConnection, switchSongEntityArr);
        return null;
    }

    public final /* synthetic */ Object i(SwitchSongEntity[] switchSongEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, switchSongEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SwitchSongDao
    public void insert(final SwitchSongEntity... switchSongEntityArr) {
        switchSongEntityArr.getClass();
        DBUtil.performBlocking(this.f38291a, false, true, new Function1() { // from class: uro
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36063a.h(switchSongEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SwitchSongDao
    public void update(final SwitchSongEntity... switchSongEntityArr) {
        switchSongEntityArr.getClass();
        DBUtil.performBlocking(this.f38291a, false, true, new Function1() { // from class: tro
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f34972a.i(switchSongEntityArr, (SQLiteConnection) obj);
            }
        });
    }
}
