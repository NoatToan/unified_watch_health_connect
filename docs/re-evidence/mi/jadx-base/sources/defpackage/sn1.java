package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordConverter;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDao;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class sn1 implements AudioRecordDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f33797a;
    public final AudioRecordConverter c = new AudioRecordConverter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<AudioRecordEntity> f33798b = new a();
    public final EntityDeleteOrUpdateAdapter<AudioRecordEntity> d = new b();
    public final EntityDeleteOrUpdateAdapter<AudioRecordEntity> e = new c();

    public class a extends EntityInsertAdapter<AudioRecordEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, AudioRecordEntity audioRecordEntity) {
            sQLiteStatement.mo50bindLong(1, audioRecordEntity.getTimestamp());
            if (audioRecordEntity.getTitle() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, audioRecordEntity.getTitle());
            }
            if (audioRecordEntity.getNewTitle() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, audioRecordEntity.getNewTitle());
            }
            if (audioRecordEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, audioRecordEntity.getDid());
            }
            sQLiteStatement.mo50bindLong(5, audioRecordEntity.getDuration());
            sQLiteStatement.mo50bindLong(6, audioRecordEntity.getStatus());
            sQLiteStatement.mo50bindLong(7, audioRecordEntity.getFormat());
            if (audioRecordEntity.getFdsName() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, audioRecordEntity.getFdsName());
            }
            String strAsrResultItemListToString = sn1.this.c.asrResultItemListToString(audioRecordEntity.getContentList());
            if (strAsrResultItemListToString == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, strAsrResultItemListToString);
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `audio_record` (`timestamp`,`title`,`newTitle`,`did`,`duration`,`status`,`format`,`fdsName`,`contentList`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<AudioRecordEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, AudioRecordEntity audioRecordEntity) {
            if (audioRecordEntity.getTitle() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, audioRecordEntity.getTitle());
            }
            if (audioRecordEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, audioRecordEntity.getDid());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `audio_record` WHERE `title` = ? AND `did` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<AudioRecordEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, AudioRecordEntity audioRecordEntity) {
            sQLiteStatement.mo50bindLong(1, audioRecordEntity.getTimestamp());
            if (audioRecordEntity.getTitle() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, audioRecordEntity.getTitle());
            }
            if (audioRecordEntity.getNewTitle() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, audioRecordEntity.getNewTitle());
            }
            if (audioRecordEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, audioRecordEntity.getDid());
            }
            sQLiteStatement.mo50bindLong(5, audioRecordEntity.getDuration());
            sQLiteStatement.mo50bindLong(6, audioRecordEntity.getStatus());
            sQLiteStatement.mo50bindLong(7, audioRecordEntity.getFormat());
            if (audioRecordEntity.getFdsName() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, audioRecordEntity.getFdsName());
            }
            String strAsrResultItemListToString = sn1.this.c.asrResultItemListToString(audioRecordEntity.getContentList());
            if (strAsrResultItemListToString == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, strAsrResultItemListToString);
            }
            if (audioRecordEntity.getTitle() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, audioRecordEntity.getTitle());
            }
            if (audioRecordEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, audioRecordEntity.getDid());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `audio_record` SET `timestamp` = ?,`title` = ?,`newTitle` = ?,`did` = ?,`duration` = ?,`status` = ?,`format` = ?,`fdsName` = ?,`contentList` = ? WHERE `title` = ? AND `did` = ?";
        }
    }

    public sn1(RoomDatabase roomDatabase) {
        this.f33797a = roomDatabase;
    }

    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Unit k(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM audio_record where did=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            Unit unit = Unit.INSTANCE;
            sQLiteStatementPrepare.close();
            return unit;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDao
    public Object add(final AudioRecordEntity audioRecordEntity, Continuation<? super Unit> continuation) {
        audioRecordEntity.getClass();
        return DBUtil.performSuspending(this.f33797a, false, true, new Function1() { // from class: on1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f29308a.j(audioRecordEntity, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDao
    public Object delete(final String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f33797a, false, true, new Function1() { // from class: rn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return sn1.k(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDao
    public Object deleteOne(final AudioRecordEntity audioRecordEntity, Continuation<? super Unit> continuation) {
        audioRecordEntity.getClass();
        return DBUtil.performSuspending(this.f33797a, false, true, new Function1() { // from class: nn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f28081a.l(audioRecordEntity, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDao
    public Object findById(final String str, final String str2, Continuation<? super AudioRecordEntity> continuation) {
        return DBUtil.performSuspending(this.f33797a, true, false, new Function1() { // from class: mn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27018a.m(str, str2, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDao
    public Object get(final long j, Continuation<? super AudioRecordEntity> continuation) {
        return DBUtil.performSuspending(this.f33797a, true, false, new Function1() { // from class: ln1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f25232a.n(j, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit j(AudioRecordEntity audioRecordEntity, SQLiteConnection sQLiteConnection) {
        this.f33798b.insert(sQLiteConnection, audioRecordEntity);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Unit l(AudioRecordEntity audioRecordEntity, SQLiteConnection sQLiteConnection) {
        this.d.handle(sQLiteConnection, audioRecordEntity);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDao
    public Object list(final String str, Continuation<? super List<AudioRecordEntity>> continuation) {
        return DBUtil.performSuspending(this.f33797a, true, false, new Function1() { // from class: qn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31671a.o(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ AudioRecordEntity m(String str, String str2, SQLiteConnection sQLiteConnection) throws Throwable {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM audio_record where did=? and title=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str2);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "newTitle");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "format");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fdsName");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contentList");
            AudioRecordEntity audioRecordEntity = null;
            if (sQLiteStatementPrepare.step()) {
                try {
                    audioRecordEntity = new AudioRecordEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), this.c.stringToAsrResultItemList(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return audioRecordEntity;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ AudioRecordEntity n(long j, SQLiteConnection sQLiteConnection) throws Throwable {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM audio_record where timestamp=?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "newTitle");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "format");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fdsName");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contentList");
            AudioRecordEntity audioRecordEntity = null;
            if (sQLiteStatementPrepare.step()) {
                try {
                    audioRecordEntity = new AudioRecordEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), this.c.stringToAsrResultItemList(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return audioRecordEntity;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final /* synthetic */ List o(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM audio_record where did=? ORDER BY timestamp DESC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "newTitle");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "format");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fdsName");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contentList");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow;
                arrayList.add(new AudioRecordEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), this.c.stringToAsrResultItemList(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9))));
                columnIndexOrThrow = i;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ Integer p(AudioRecordEntity audioRecordEntity, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.e.handle(sQLiteConnection, audioRecordEntity));
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDao
    public Object update(final AudioRecordEntity audioRecordEntity, Continuation<? super Integer> continuation) {
        audioRecordEntity.getClass();
        return DBUtil.performSuspending(this.f33797a, false, true, new Function1() { // from class: pn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30552a.p(audioRecordEntity, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
