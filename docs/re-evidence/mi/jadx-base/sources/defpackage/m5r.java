package defpackage;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.FaceTypeConverter;
import com.xiaomi.fitness.watch.face.db.PhotoBean;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class m5r implements WatchFaceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f25788a;
    public final FaceTypeConverter c = new FaceTypeConverter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<FaceCommonEntity> f25789b = new a();

    public class a extends EntityInsertAdapter<FaceCommonEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, FaceCommonEntity faceCommonEntity) {
            if (faceCommonEntity.getCombineId() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, faceCommonEntity.getCombineId());
            }
            if (faceCommonEntity.getTimestamp() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo50bindLong(2, faceCommonEntity.getTimestamp().longValue());
            }
            if (faceCommonEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, faceCommonEntity.getDid());
            }
            if (faceCommonEntity.getFaceId() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, faceCommonEntity.getFaceId());
            }
            if (faceCommonEntity.getName() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, faceCommonEntity.getName());
            }
            if (faceCommonEntity.getUpperColor() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, faceCommonEntity.getUpperColor());
            }
            if (faceCommonEntity.getBackgroundColor() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, faceCommonEntity.getBackgroundColor());
            }
            if (faceCommonEntity.getMd5() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, faceCommonEntity.getMd5());
            }
            if (faceCommonEntity.getPath() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, faceCommonEntity.getPath());
            }
            String json = m5r.this.c.toJson(faceCommonEntity.getMultiPhotoDataList());
            if (json == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, json);
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `face_common_table` (`combineId`,`timestamp`,`did`,`faceId`,`name`,`upperColor`,`backgroundColor`,`md5`,`path`,`multiPhotoDataList`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public m5r(RoomDatabase roomDatabase) {
        this.f25788a = roomDatabase;
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Unit l(String str, String str2, Collection collection, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str2);
            }
            Iterator it = collection.iterator();
            int i = 2;
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3 == null) {
                    sQLiteStatementPrepare.mo51bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo52bindText(i, str3);
                }
                i++;
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

    public static /* synthetic */ Unit m(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM face_common_table WHERE combineId = ?");
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

    public static /* synthetic */ Unit n(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM face_common_table WHERE did = ? AND faceId = ?");
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
            sQLiteStatementPrepare.step();
            Unit unit = Unit.INSTANCE;
            sQLiteStatementPrepare.close();
            return unit;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Unit o(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM face_common_table WHERE did = ?");
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

    public static /* synthetic */ List p(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM photo_bean WHERE nodeId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cropPath");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "oriPath");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nodeId");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                arrayList.add(new PhotoBean(text2, text3, text));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDao
    public Object deleteOtherWatchFace(final String str, final Collection<String> collection, Continuation<? super Unit> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM face_common_table WHERE did = ");
        sb.append("?");
        sb.append(" AND faceId not in (");
        StringUtil.appendPlaceholders(sb, collection.size());
        sb.append(")");
        final String string = sb.toString();
        return DBUtil.performSuspending(this.f25788a, false, true, new Function1() { // from class: l5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return m5r.l(string, str, collection, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDao
    public Object deleteWatchFace(final String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f25788a, false, true, new Function1() { // from class: i5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return m5r.m(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDao
    public Object deleteWatchFacesByDid(final String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f25788a, false, true, new Function1() { // from class: f5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return m5r.o(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDao
    public Object getPhotos(final String str, Continuation<? super List<PhotoBean>> continuation) {
        return DBUtil.performSuspending(this.f25788a, true, false, new Function1() { // from class: g5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return m5r.p(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDao
    public Object getWatchFace(final String str, Continuation<? super FaceCommonEntity> continuation) {
        return DBUtil.performSuspending(this.f25788a, true, false, new Function1() { // from class: d5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15117a.q(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDao
    public Object getWatchFacesByDid(final String str, Continuation<? super List<FaceCommonEntity>> continuation) {
        return DBUtil.performSuspending(this.f25788a, true, false, new Function1() { // from class: j5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f22448a.s(str, (SQLiteConnection) obj);
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
    public final /* synthetic */ FaceCommonEntity q(String str, SQLiteConnection sQLiteConnection) throws Throwable {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM face_common_table WHERE combineId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "combineId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FaceInfoBase.FACE_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upperColor");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundColor");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "path");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "multiPhotoDataList");
            FaceCommonEntity faceCommonEntity = null;
            if (sQLiteStatementPrepare.step()) {
                try {
                    faceCommonEntity = new FaceCommonEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow2)), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), this.c.fromJson(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return faceCommonEntity;
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
    public final /* synthetic */ FaceCommonEntity r(String str, String str2, SQLiteConnection sQLiteConnection) throws Throwable {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM face_common_table WHERE did = ? AND faceId = ?");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "combineId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FaceInfoBase.FACE_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upperColor");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundColor");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "path");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "multiPhotoDataList");
            FaceCommonEntity faceCommonEntity = null;
            if (sQLiteStatementPrepare.step()) {
                try {
                    faceCommonEntity = new FaceCommonEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow2)), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), this.c.fromJson(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return faceCommonEntity;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final /* synthetic */ List s(String str, SQLiteConnection sQLiteConnection) throws Throwable {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM face_common_table WHERE did = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "combineId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FaceInfoBase.FACE_ID);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upperColor");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundColor");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "md5");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "path");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "multiPhotoDataList");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                try {
                    arrayList.add(new FaceCommonEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow2)), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), this.c.fromJson(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10))));
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDao
    public Object saveWatchFace(final FaceCommonEntity faceCommonEntity, Continuation<? super Unit> continuation) {
        faceCommonEntity.getClass();
        return DBUtil.performSuspending(this.f25788a, false, true, new Function1() { // from class: k5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23499a.t(faceCommonEntity, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit t(FaceCommonEntity faceCommonEntity, SQLiteConnection sQLiteConnection) {
        this.f25789b.insert(sQLiteConnection, faceCommonEntity);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDao
    public Object deleteWatchFace(final String str, final String str2, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f25788a, false, true, new Function1() { // from class: e5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return m5r.n(str, str2, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDao
    public Object getWatchFace(final String str, final String str2, Continuation<? super FaceCommonEntity> continuation) {
        return DBUtil.performSuspending(this.f25788a, true, false, new Function1() { // from class: h5r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f19726a.r(str, str2, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
