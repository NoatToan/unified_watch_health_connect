package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/room/k0;", "Lvd/d$a;", "Landroidx/room/c;", "configuration", "Landroidx/room/k0$b;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/c;Landroidx/room/k0$b;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/room/c;Landroidx/room/k0$b;Ljava/lang/String;)V", "b", "c", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class k0 extends vd.d.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f10859g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.room.c f10860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b0.b> f10861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f10862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10864f;

    @o13.e
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/room/k0$b;", "", "", "version", "<init>", "(I)V", "Lvd/c;", "db", "", "dropAllTables", "(Lvd/c;)V", "createAllTables", "onOpen", "onCreate", "validateMigration", "Landroidx/room/k0$c;", "onValidateSchema", "(Lvd/c;)Landroidx/room/k0$c;", "onPreMigrate", "onPostMigrate", "I", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {
        public final int version;

        public b(int i14) {
            this.version = i14;
        }

        public abstract void createAllTables(vd.c db3);

        public abstract void dropAllTables(vd.c db3);

        public abstract void onCreate(vd.c db3);

        public abstract void onOpen(vd.c db3);

        public void onPostMigrate(vd.c db3) {
            db3.getClass();
        }

        public void onPreMigrate(vd.c db3) {
            db3.getClass();
        }

        public c onValidateSchema(vd.c db3) {
            db3.getClass();
            validateMigration(db3);
            return new c(true, null);
        }

        @o13.e
        public void validateMigration(vd.c db3) {
            db3.getClass();
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @o13.e
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/room/k0$c;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10866b;

        public c(boolean z14, String str) {
            this.f10865a = z14;
            this.f10866b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.room.c cVar, b bVar, String str, String str2) {
        super(bVar.version);
        cVar.getClass();
        bVar.getClass();
        str.getClass();
        str2.getClass();
        this.f10861c = cVar.f10774e;
        this.f10860b = cVar;
        this.f10862d = bVar;
        this.f10863e = str;
        this.f10864f = str2;
    }

    @Override // vd.d.a
    public final void b(wd.b bVar) {
    }

    @Override // vd.d.a
    public final void c(wd.b bVar) throws IOException {
        f10859g.getClass();
        Cursor cursorJ1 = bVar.J1(new vd.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            Cursor cursor = cursorJ1;
            boolean z14 = false;
            if (cursor.moveToFirst() && cursor.getInt(0) == 0) {
                z14 = true;
            }
            cursorJ1.close();
            b bVar2 = this.f10862d;
            bVar2.createAllTables(bVar);
            if (!z14) {
                c cVarOnValidateSchema = bVar2.onValidateSchema(bVar);
                if (!cVarOnValidateSchema.f10865a) {
                    a0.s(cVarOnValidateSchema.f10866b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = bVar.f184326a;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            int i14 = h0.f10846a;
            String str = this.f10863e;
            str.getClass();
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
            bVar2.onCreate(bVar);
            List<b0.b> list = this.f10861c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((b0.b) it.next()).getClass();
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(cursorJ1, th3);
                throw th4;
            }
        }
    }

    @Override // vd.d.a
    public final void d(wd.b bVar, int i14, int i15) throws IOException {
        f(bVar, i14, i15);
    }

    @Override // vd.d.a
    public final void e(wd.b bVar) throws IOException {
        f10859g.getClass();
        Cursor cursorJ1 = bVar.J1(new vd.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            Cursor cursor = cursorJ1;
            boolean z14 = cursor.moveToFirst() && cursor.getInt(0) != 0;
            cursorJ1.close();
            b bVar2 = this.f10862d;
            String str = this.f10863e;
            if (z14) {
                Cursor cursorJ2 = bVar.J1(new vd.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    Cursor cursor2 = cursorJ2;
                    String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
                    cursorJ2.close();
                    if (!p005kotlin.jvm.internal.s.g(str, string) && !p005kotlin.jvm.internal.s.g(this.f10864f, string)) {
                        vb.h.z(a0.j("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", string));
                        return;
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(cursorJ2, th3);
                        throw th4;
                    }
                }
            } else {
                c cVarOnValidateSchema = bVar2.onValidateSchema(bVar);
                if (!cVarOnValidateSchema.f10865a) {
                    a0.s(cVarOnValidateSchema.f10866b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
                bVar2.onPostMigrate(bVar);
                SQLiteDatabase sQLiteDatabase = bVar.f184326a;
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                int i14 = h0.f10846a;
                str.getClass();
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
            }
            bVar2.onOpen(bVar);
            List<b0.b> list = this.f10861c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((b0.b) it.next()).a(bVar);
                }
            }
            this.f10860b = null;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jg.b.l(cursorJ1, th5);
                throw th6;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vd.d.a
    public final void f(wd.b bVar, int i14, int i15) throws IOException {
        SQLiteDatabase sQLiteDatabase = bVar.f184326a;
        androidx.room.c cVar = this.f10860b;
        b bVar2 = this.f10862d;
        if (cVar != null) {
            b0.e eVar = cVar.f10773d;
            eVar.getClass();
            List<kd.a> listA = md.l.a(eVar, i14, i15);
            if (listA != null) {
                bVar2.onPreMigrate(bVar);
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    ((kd.a) it.next()).migrate(new xd.a(bVar));
                }
                c cVarOnValidateSchema = bVar2.onValidateSchema(bVar);
                if (!cVarOnValidateSchema.f10865a) {
                    a0.s(cVarOnValidateSchema.f10866b, "Migration didn't properly handle: ");
                    return;
                }
                bVar2.onPostMigrate(bVar);
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                int i16 = h0.f10846a;
                String str = this.f10863e;
                str.getClass();
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
                return;
            }
        }
        androidx.room.c cVar2 = this.f10860b;
        if (cVar2 == null || md.l.b(cVar2, i14, i15)) {
            vb.h.z(am.j.g(i14, i15, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (cVar2.f10789t) {
            f10859g.getClass();
            Cursor cursorJ1 = bVar.J1(new vd.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                Cursor cursor = cursorJ1;
                q13.b bVarB = p13.w.b();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    string.getClass();
                    if (!d53.u.y(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        bVarB.add(new o13.p(string, Boolean.valueOf(p005kotlin.jvm.internal.s.g(cursor.getString(1), "view"))));
                    }
                }
                q13.b bVarA = p13.w.a(bVarB);
                cursorJ1.close();
                ListIterator listIterator = bVarA.listIterator(0);
                while (true) {
                    q13.b.c cVar3 = (q13.b.c) listIterator;
                    if (!cVar3.hasNext()) {
                        break;
                    }
                    o13.p pVar = (o13.p) cVar3.next();
                    String str2 = (String) pVar.f128594a;
                    if (((Boolean) pVar.f128595b).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str2);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(cursorJ1, th3);
                    throw th4;
                }
            }
        } else {
            bVar2.dropAllTables(bVar);
        }
        List<b0.b> list = this.f10861c;
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                ((b0.b) it3.next()).getClass();
            }
        }
        bVar2.createAllTables(bVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/k0$a;", "", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(androidx.room.c cVar, b bVar, String str) {
        this(cVar, bVar, "", str);
        cVar.getClass();
        bVar.getClass();
        str.getClass();
    }
}
