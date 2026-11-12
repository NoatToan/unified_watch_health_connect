package wd;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lwd/d;", "Lvd/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Lvd/d$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$a;ZZ)V", "c", "a", "b", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements vd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f184329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vd.d.a f184331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f184332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f184333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f184334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f184335g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwd/d$b;", "", "Lwd/b;", "db", "<init>", "(Lwd/b;)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public wd.b f184336a;

        public b(wd.b bVar) {
            this.f184336a = bVar;
        }
    }

    static {
        new a(null);
    }

    public d(Context context, String str, vd.d.a aVar, boolean z14, boolean z15) {
        context.getClass();
        aVar.getClass();
        this.f184329a = context;
        this.f184330b = str;
        this.f184331c = aVar;
        this.f184332d = z14;
        this.f184333e = z15;
        this.f184334f = m.b(new wd.c(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f184334f;
        if (tVar.isInitialized()) {
            ((c) tVar.getValue()).close();
        }
    }

    @Override // vd.d
    /* JADX INFO: renamed from: getDatabaseName, reason: from getter */
    public final String getF184330b() {
        return this.f184330b;
    }

    @Override // vd.d
    public final vd.c getWritableDatabase() {
        return ((c) this.f184334f.getValue()).a(true);
    }

    @Override // vd.d
    public final void setWriteAheadLoggingEnabled(boolean z14) {
        t tVar = this.f184334f;
        if (tVar.isInitialized()) {
            ((c) tVar.getValue()).setWriteAheadLoggingEnabled(z14);
        }
        this.f184335g = z14;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lwd/d$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Lwd/d$b;", "dbRef", "Lvd/d$a;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lwd/d$b;Lvd/d$a;Z)V", "a", "b", "c", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C3416c f184337h = new C3416c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f184338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f184339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final vd.d.a f184340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f184341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f184342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final yd.a f184343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f184344g;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwd/d$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lwd/d$c$b;", "callbackName", "", "cause", "<init>", "(Lwd/d$c$b;Ljava/lang/Throwable;)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f184345a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Throwable f184346b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th3) {
                super(th3);
                bVar.getClass();
                th3.getClass();
                this.f184345a = bVar;
                this.f184346b = th3;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f184346b;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwd/d$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: wd.d$c$d, reason: collision with other inner class name */
        public static final /* synthetic */ class C3417d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f184353a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f184353a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b bVar, final vd.d.a aVar, boolean z14) {
            super(context, str, null, aVar.f177134a, new DatabaseErrorHandler(aVar, bVar) { // from class: wd.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ d.b f184354a;

                {
                    this.f184354a = bVar;
                }

                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.C3416c c3416c = d.c.f184337h;
                    sQLiteDatabase.getClass();
                    c3416c.getClass();
                    d.b bVar2 = this.f184354a;
                    b bVar3 = bVar2.f184336a;
                    if (bVar3 == null || !bVar3.f184326a.equals(sQLiteDatabase)) {
                        bVar3 = new b(sQLiteDatabase);
                        bVar2.f184336a = bVar3;
                    }
                    SQLiteDatabase sQLiteDatabase2 = bVar3.f184326a;
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            vd.d.a.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } catch (SQLiteException unused) {
                        }
                        try {
                            bVar3.close();
                        } catch (IOException unused2) {
                        }
                        if (attachedDbs != null) {
                            return;
                        }
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                vd.d.a.a((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                vd.d.a.a(path2);
                            }
                        }
                    }
                }
            });
            context.getClass();
            bVar.getClass();
            aVar.getClass();
            this.f184338a = context;
            this.f184339b = bVar;
            this.f184340c = aVar;
            this.f184341d = z14;
            this.f184343f = new yd.a(str == null ? kg.f.c() : str, context.getCacheDir(), false);
        }

        public final vd.c a(boolean z14) {
            yd.a aVar = this.f184343f;
            try {
                aVar.a((this.f184344g || getDatabaseName() == null) ? false : true);
                this.f184342e = false;
                SQLiteDatabase sQLiteDatabaseE = e(z14);
                if (!this.f184342e) {
                    return c(sQLiteDatabaseE);
                }
                close();
                return a(z14);
            } finally {
                aVar.b();
            }
        }

        public final wd.b c(SQLiteDatabase sQLiteDatabase) {
            f184337h.getClass();
            b bVar = this.f184339b;
            bVar.getClass();
            wd.b bVar2 = bVar.f184336a;
            if (bVar2 != null && bVar2.f184326a.equals(sQLiteDatabase)) {
                return bVar2;
            }
            wd.b bVar3 = new wd.b(sQLiteDatabase);
            bVar.f184336a = bVar3;
            return bVar3;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            yd.a aVar = this.f184343f;
            try {
                aVar.a(aVar.f196750a);
                super.close();
                this.f184339b.f184336a = null;
                this.f184344g = false;
            } finally {
                aVar.b();
            }
        }

        public final SQLiteDatabase e(boolean z14) throws Throwable {
            SQLiteDatabase readableDatabase;
            SQLiteDatabase readableDatabase2;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z15 = this.f184344g;
            Context context = this.f184338a;
            if (databaseName != null && !z15 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    parentFile.toString();
                }
            }
            try {
                if (z14) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    writableDatabase.getClass();
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase3 = getReadableDatabase();
                readableDatabase3.getClass();
                return readableDatabase3;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z14) {
                        readableDatabase2 = getWritableDatabase();
                        readableDatabase2.getClass();
                    } else {
                        readableDatabase2 = getReadableDatabase();
                        readableDatabase2.getClass();
                    }
                    return readableDatabase2;
                } catch (Throwable th3) {
                    th = th3;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        int i14 = C3417d.f184353a[aVar.f184345a.ordinal()];
                        th = aVar.f184346b;
                        if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
                            throw th;
                        }
                        if (i14 != 5) {
                            u0.r();
                            return null;
                        }
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.f184341d) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        if (z14) {
                            readableDatabase = getWritableDatabase();
                            readableDatabase.getClass();
                        } else {
                            readableDatabase = getReadableDatabase();
                            readableDatabase.getClass();
                        }
                        return readableDatabase;
                    } catch (a e4) {
                        throw e4.f184346b;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            boolean z14 = this.f184342e;
            vd.d.a aVar = this.f184340c;
            if (!z14 && aVar.f177134a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                aVar.b(c(sQLiteDatabase));
            } catch (Throwable th3) {
                throw new a(b.ON_CONFIGURE, th3);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            try {
                this.f184340c.c(c(sQLiteDatabase));
            } catch (Throwable th3) {
                throw new a(b.ON_CREATE, th3);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i14, int i15) {
            sQLiteDatabase.getClass();
            this.f184342e = true;
            try {
                this.f184340c.d(c(sQLiteDatabase), i14, i15);
            } catch (Throwable th3) {
                throw new a(b.ON_DOWNGRADE, th3);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            if (!this.f184342e) {
                try {
                    this.f184340c.e(c(sQLiteDatabase));
                } catch (Throwable th3) {
                    throw new a(b.ON_OPEN, th3);
                }
            }
            this.f184344g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i14, int i15) {
            sQLiteDatabase.getClass();
            this.f184342e = true;
            try {
                this.f184340c.f(c(sQLiteDatabase), i14, i15);
            } catch (Throwable th3) {
                throw new a(b.ON_UPGRADE, th3);
            }
        }

        /* JADX INFO: renamed from: wd.d$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwd/d$c$c;", "", "<init>", "()V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C3416c {
            public /* synthetic */ C3416c(j jVar) {
                this();
            }

            private C3416c() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwd/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, vd.d.a aVar, boolean z14) {
        this(context, str, aVar, z14, false, 16, null);
        context.getClass();
        aVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, vd.d.a aVar) {
        this(context, str, aVar, false, false, 24, null);
        context.getClass();
        aVar.getClass();
    }

    public /* synthetic */ d(Context context, String str, vd.d.a aVar, boolean z14, boolean z15, int i14, j jVar) {
        this(context, str, aVar, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15);
    }
}
