package androidx.room;

import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/room/a;", "", "<init>", "()V", "b", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10713b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/a$b;", "Lud/b;", "actual", "<init>", "(Landroidx/room/a;Lud/b;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b implements ud.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ud.b f10714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f10715b;

        public b(a aVar, ud.b bVar) {
            bVar.getClass();
            this.f10715b = aVar;
            this.f10714a = bVar;
        }

        @Override // ud.b
        public final ud.a a(String str) {
            FileChannel fileChannel;
            FileChannel fileChannel2;
            str.getClass();
            a aVar = this.f10715b;
            String strI = aVar.i(str);
            boolean z14 = false;
            id.b bVar = new id.b(strI, (aVar.f10712a || aVar.f10713b || strI.equals(":memory:")) ? false : true);
            androidx.room.b bVar2 = new androidx.room.b(strI);
            ReentrantLock reentrantLock = bVar.f92650a;
            reentrantLock.lock();
            id.c cVar = bVar.f92651b;
            if (cVar != null) {
                try {
                    cVar.a();
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            try {
                try {
                    if (aVar.f10713b) {
                        throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                    }
                    ud.a aVarA = this.f10714a.a(strI);
                    if (aVar.f10712a) {
                        a.b(aVarA);
                        if (aVar.getF10990c().f10776g == b0.d.WRITE_AHEAD_LOGGING) {
                            oe2.f.o(aVarA, "PRAGMA synchronous = NORMAL");
                        } else {
                            oe2.f.o(aVarA, "PRAGMA synchronous = FULL");
                        }
                        aVar.getF10991d().d(aVarA);
                    } else {
                        try {
                            aVar.f10713b = true;
                            a.a(aVar, aVarA);
                            aVar.f10713b = false;
                        } catch (Throwable th4) {
                            aVar.f10713b = false;
                            throw th4;
                        }
                    }
                    if (cVar != null && (fileChannel2 = cVar.f92653b) != null) {
                        try {
                            fileChannel2.close();
                            cVar.f92653b = null;
                        } catch (Throwable th5) {
                            cVar.f92653b = null;
                            throw th5;
                        }
                    }
                    reentrantLock.unlock();
                    return aVarA;
                } catch (Throwable th6) {
                    if (cVar != null && (fileChannel = cVar.f92653b) != null) {
                        try {
                            fileChannel.close();
                        } finally {
                            cVar.f92653b = null;
                        }
                    }
                    throw th6;
                }
            } catch (Throwable th7) {
                th = th7;
                z14 = true;
            }
            th = th7;
            z14 = true;
            try {
                if (z14) {
                    throw th;
                }
                bVar2.invoke(th);
                throw null;
            } catch (Throwable th8) {
                reentrantLock.unlock();
                throw th8;
            }
        }

        @Override // ud.b
        public final boolean b() {
            return this.f10714a.b();
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10716a;

        static {
            int[] iArr = new int[b0.d.values().length];
            try {
                iArr[b0.d.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.d.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10716a = iArr;
        }
    }

    static {
        new C0149a(null);
    }

    public static final void a(a aVar, ud.a aVar2) throws Throwable {
        Object bVar;
        aVar.getClass();
        b(aVar2);
        b0.d dVar = aVar.getF10990c().f10776g;
        b0.d dVar2 = b0.d.WRITE_AHEAD_LOGGING;
        if (dVar == dVar2) {
            oe2.f.o(aVar2, "PRAGMA journal_mode = WAL");
        } else {
            oe2.f.o(aVar2, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar.getF10990c().f10776g == dVar2) {
            oe2.f.o(aVar2, "PRAGMA synchronous = NORMAL");
        } else {
            oe2.f.o(aVar2, "PRAGMA synchronous = FULL");
        }
        ud.c cVarM0 = aVar2.M0("PRAGMA user_version");
        try {
            cVarM0.J0();
            int i14 = (int) cVarM0.getLong(0);
            zf.b.h(cVarM0, null);
            if (i14 != aVar.getF10991d().f10849a) {
                oe2.f.o(aVar2, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    int i15 = o13.q.f128596b;
                    if (i14 == 0) {
                        aVar.f(aVar2);
                    } else {
                        aVar.g(aVar2, i14, aVar.getF10991d().f10849a);
                    }
                    oe2.f.o(aVar2, "PRAGMA user_version = " + aVar.getF10991d().f10849a);
                    bVar = Unit.INSTANCE;
                } catch (Throwable th3) {
                    int i16 = o13.q.f128596b;
                    bVar = new o13.q.b(th3);
                }
                if (!(bVar instanceof o13.q.b)) {
                    oe2.f.o(aVar2, "END TRANSACTION");
                }
                Throwable thB = o13.q.b(bVar);
                if (thB != null) {
                    oe2.f.o(aVar2, "ROLLBACK TRANSACTION");
                    throw thB;
                }
            }
            aVar.h(aVar2);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                zf.b.h(cVarM0, th4);
                throw th5;
            }
        }
    }

    public static void b(ud.a aVar) {
        ud.c cVarM0 = aVar.M0("PRAGMA busy_timeout");
        try {
            cVarM0.J0();
            long j8 = cVarM0.getLong(0);
            zf.b.h(cVarM0, null);
            if (j8 < 3000) {
                oe2.f.o(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zf.b.h(cVarM0, th3);
                throw th4;
            }
        }
    }

    public abstract List<b0.b> c();

    /* JADX INFO: renamed from: d */
    public abstract androidx.room.c getF10990c();

    /* JADX INFO: renamed from: e */
    public abstract i0 getF10991d();

    public final void f(ud.a aVar) {
        aVar.getClass();
        ud.c cVarM0 = aVar.M0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z14 = false;
            if (cVarM0.J0() && cVarM0.getLong(0) == 0) {
                z14 = true;
            }
            zf.b.h(cVarM0, null);
            getF10991d().a(aVar);
            if (!z14) {
                i0.a aVarG = getF10991d().g(aVar);
                if (!aVarG.f10852a) {
                    androidx.core.view.j.x(aVarG.f10853b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            j(aVar);
            getF10991d().c(aVar);
            Iterator<T> it = c().iterator();
            while (it.hasNext()) {
                ((b0.b) it.next()).getClass();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zf.b.h(cVarM0, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ud.a aVar, int i14, int i15) {
        aVar.getClass();
        List<kd.a> listA = md.l.a(getF10990c().f10773d, i14, i15);
        if (listA != null) {
            getF10991d().f(aVar);
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                ((kd.a) it.next()).migrate(aVar);
            }
            i0.a aVarG = getF10991d().g(aVar);
            if (!aVarG.f10852a) {
                androidx.core.view.j.x(aVarG.f10853b, "Migration didn't properly handle: ");
                return;
            } else {
                getF10991d().e(aVar);
                j(aVar);
                return;
            }
        }
        if (md.l.b(getF10990c(), i14, i15)) {
            throw new IllegalStateException(("A migration from " + i14 + " to " + i15 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (getF10990c().f10789t) {
            ud.c cVarM0 = aVar.M0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                q13.b bVarB = p13.w.b();
                while (cVarM0.J0()) {
                    String strM1 = cVarM0.M1(0);
                    if (!d53.u.y(strM1, "sqlite_", false) && !strM1.equals("android_metadata")) {
                        bVarB.add(new o13.p(strM1, Boolean.valueOf(p005kotlin.jvm.internal.s.g(cVarM0.M1(1), "view"))));
                    }
                }
                q13.b bVarA = p13.w.a(bVarB);
                zf.b.h(cVarM0, null);
                ListIterator listIterator = bVarA.listIterator(0);
                while (true) {
                    q13.b.c cVar = (q13.b.c) listIterator;
                    if (!cVar.hasNext()) {
                        break;
                    }
                    o13.p pVar = (o13.p) cVar.next();
                    String str = (String) pVar.f128594a;
                    if (((Boolean) pVar.f128595b).booleanValue()) {
                        oe2.f.o(aVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        oe2.f.o(aVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    zf.b.h(cVarM0, th3);
                    throw th4;
                }
            }
        } else {
            getF10991d().b(aVar);
        }
        Iterator<T> it3 = c().iterator();
        while (it3.hasNext()) {
            ((b0.b) it3.next()).getClass();
        }
        getF10991d().a(aVar);
    }

    public final void h(ud.a aVar) {
        Object bVar;
        aVar.getClass();
        ud.c cVarM0 = aVar.M0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z14 = cVarM0.J0() && cVarM0.getLong(0) != 0;
            zf.b.h(cVarM0, null);
            if (z14) {
                ud.c cVarM1 = aVar.M0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strM1 = cVarM1.J0() ? cVarM1.M1(0) : null;
                    zf.b.h(cVarM1, null);
                    if (!getF10991d().f10850b.equals(strM1) && !getF10991d().f10851c.equals(strM1)) {
                        androidx.core.view.j.B("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", getF10991d().f10850b, ", found: ", strM1);
                        return;
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        zf.b.h(cVarM1, th3);
                        throw th4;
                    }
                }
            } else {
                oe2.f.o(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    int i14 = o13.q.f128596b;
                    i0.a aVarG = getF10991d().g(aVar);
                    if (!aVarG.f10852a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarG.f10853b).toString());
                    }
                    getF10991d().e(aVar);
                    j(aVar);
                    bVar = Unit.INSTANCE;
                    if (!(bVar instanceof o13.q.b)) {
                        oe2.f.o(aVar, "END TRANSACTION");
                    }
                    Throwable thB = o13.q.b(bVar);
                    if (thB != null) {
                        oe2.f.o(aVar, "ROLLBACK TRANSACTION");
                        throw thB;
                    }
                    o13.q.a(bVar);
                } catch (Throwable th5) {
                    int i15 = o13.q.f128596b;
                    bVar = new o13.q.b(th5);
                }
            }
            getF10991d().d(aVar);
            for (b0.b bVar2 : c()) {
                bVar2.getClass();
                if (aVar instanceof xd.a) {
                    bVar2.a(((xd.a) aVar).f189967a);
                }
            }
            this.f10712a = true;
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                zf.b.h(cVarM0, th6);
                throw th7;
            }
        }
    }

    public String i(String str) {
        str.getClass();
        return str;
    }

    public final void j(ud.a aVar) {
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = getF10991d().f10850b;
        int i14 = h0.f10846a;
        oe2.f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    /* JADX INFO: renamed from: androidx.room.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/a$a;", "", "<init>", "()V", "", "BUSY_TIMEOUT_MS", "I", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0149a {
        public /* synthetic */ C0149a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0149a() {
        }
    }
}
