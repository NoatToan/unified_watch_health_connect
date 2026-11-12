package wd;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lwd/b;", "Lvd/c;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "a", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements vd.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f184321b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f184322c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f184323d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f184324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f184325f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f184326a;

    static {
        n nVar = n.PUBLICATION;
        f184324e = m.a(nVar, new w72.f(20));
        f184325f = m.a(nVar, new w72.f(21));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.f184326a = sQLiteDatabase;
    }

    @Override // vd.c
    public final vd.g C1(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.f184326a.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new h(sQLiteStatementCompileStatement);
    }

    @Override // vd.c
    public final boolean D() {
        return this.f184326a.inTransaction();
    }

    @Override // vd.c
    public final void F() {
        this.f184326a.beginTransaction();
    }

    @Override // vd.c
    public final void G() {
        this.f184326a.disableWriteAheadLogging();
    }

    @Override // vd.c
    public final Cursor I(vd.f fVar, CancellationSignal cancellationSignal) {
        Cursor cursorRawQueryWithFactory = this.f184326a.rawQueryWithFactory(new wd.a(fVar, 0), fVar.getF177131a(), f184323d, null, cancellationSignal);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // vd.c
    public final void I1(Object[] objArr) {
        this.f184326a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // vd.c
    public final Cursor J1(vd.f fVar) {
        Cursor cursorRawQueryWithFactory = this.f184326a.rawQueryWithFactory(new wd.a(new a6.c(fVar, 19), 1), fVar.getF177131a(), f184323d, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // vd.c
    public final Cursor X3(String str) {
        return J1(new vd.a(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f184326a.close();
    }

    @Override // vd.c
    public final void g2() {
        this.f184326a.beginTransactionNonExclusive();
    }

    @Override // vd.c
    public final boolean isOpen() {
        return this.f184326a.isOpen();
    }

    @Override // vd.c
    public final boolean j4() {
        return this.f184326a.isWriteAheadLoggingEnabled();
    }

    @Override // vd.c
    public final void k3(String str) {
        this.f184326a.execSQL(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o13.l] */
    @Override // vd.c
    public final void o0() throws IllegalAccessException, InvocationTargetException {
        f184321b.getClass();
        ?? r14 = f184325f;
        if (((Method) r14.getValue()) != null) {
            ?? r15 = f184324e;
            if (((Method) r15.getValue()) != null) {
                Method method = (Method) r14.getValue();
                method.getClass();
                Method method2 = (Method) r15.getValue();
                method2.getClass();
                Object objInvoke = method2.invoke(this.f184326a, null);
                if (objInvoke != null) {
                    method.invoke(objInvoke, 0, null, 0, null);
                    return;
                } else {
                    vb.h.z("Required value was null.");
                    return;
                }
            }
        }
        F();
    }

    @Override // vd.c
    public final boolean s3() {
        return this.f184326a.enableWriteAheadLogging();
    }

    @Override // vd.c
    public final int s4(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            vb.h.s("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb3 = new StringBuilder("UPDATE ");
        sb3.append(f184322c[3]);
        sb3.append("WorkSpec SET ");
        int i14 = 0;
        for (String str : contentValues.keySet()) {
            sb3.append(i14 > 0 ? "," : "");
            sb3.append(str);
            objArr2[i14] = contentValues.get(str);
            sb3.append("=?");
            i14++;
        }
        for (int i15 = size; i15 < length; i15++) {
            objArr2[i15] = objArr[i15 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb3.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        vd.g gVarC1 = C1(sb3.toString());
        vd.a.f177130c.getClass();
        vd.a.C3313a.a(gVarC1, objArr2);
        return ((h) gVarC1).f184356b.executeUpdateDelete();
    }

    @Override // vd.c
    public final void t3() {
        this.f184326a.setTransactionSuccessful();
    }

    @Override // vd.c
    public final long v3(ContentValues contentValues) {
        return this.f184326a.insertWithOnConflict("device_capabilities", null, contentValues, 5);
    }

    @Override // vd.c
    public final void y3() {
        this.f184326a.endTransaction();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lwd/b$a;", "", "<init>", "()V", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
