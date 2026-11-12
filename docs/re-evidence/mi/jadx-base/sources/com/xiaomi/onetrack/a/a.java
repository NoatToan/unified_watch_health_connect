package com.xiaomi.onetrack.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.onetrack.b.n;
import com.xiaomi.onetrack.util.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13693a = "AdMonitorManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13694b = 204800;
    private static final int c = 100;
    private static final int d = 4;
    private static final int e = 300;
    private static final String f = "_id ASC";
    private static final int g = 7;
    private static a h;
    private final C0830a i = new C0830a(com.xiaomi.onetrack.f.a.a());

    /* JADX INFO: renamed from: com.xiaomi.onetrack.a.a$a, reason: collision with other inner class name */
    public static class C0830a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f13695a = "onetrack_ad";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f13696b = "monitor";
        public static final String c = "_id";
        public static final String d = "appid";
        public static final String e = "package";
        public static final String f = "event_name";
        public static final String g = "url";
        public static final String h = "timestamp";
        public static final String i = "send_count";
        private static final int j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f13697k = "CREATE TABLE monitor (_id INTEGER PRIMARY KEY AUTOINCREMENT,appid TEXT,package TEXT,event_name TEXT,url TEXT,send_count INTEGER DEFAULT 0,timestamp INTEGER)";

        public C0830a(Context context) {
            super(context, f13695a, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(f13697k);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }
    }

    private a() {
        c();
    }

    private void f() {
        try {
            this.i.getWritableDatabase().delete(C0830a.f13696b, null, null);
            p.a(f13693a, "delete table monitor");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[Catch: all -> 0x00d9, PHI: r10
      0x00ec: PHI (r10v4 android.database.Cursor) = (r10v3 android.database.Cursor), (r10v5 android.database.Cursor) binds: [B:42:0x00ea, B:46:0x00fa] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00d9, blocks: (B:30:0x00d4, B:31:0x00d7, B:51:0x0101, B:52:0x0104, B:43:0x00ec, B:48:0x00fd), top: B:56:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0101 A[Catch: all -> 0x00d9, TryCatch #3 {all -> 0x00d9, blocks: (B:30:0x00d4, B:31:0x00d7, B:51:0x0101, B:52:0x0104, B:43:0x00ec, B:48:0x00fd), top: B:56:0x0006 }] */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0095: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:17:0x0095 */
    public com.xiaomi.onetrack.a.c.a b() {
        Cursor cursorQuery;
        Cursor cursor;
        int i;
        synchronized (this.i) {
            Cursor cursor2 = null;
            try {
                try {
                    try {
                        cursorQuery = this.i.getReadableDatabase().query(C0830a.f13696b, null, null, null, null, null, f);
                        try {
                            int columnIndex = cursorQuery.getColumnIndex("_id");
                            cursorQuery.getColumnIndex("appid");
                            cursorQuery.getColumnIndex("package");
                            cursorQuery.getColumnIndex("event_name");
                            int columnIndex2 = cursorQuery.getColumnIndex("timestamp");
                            int columnIndex3 = cursorQuery.getColumnIndex("url");
                            int columnIndex4 = cursorQuery.getColumnIndex(C0830a.i);
                            ArrayList arrayList = new ArrayList();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int i2 = 0;
                            while (true) {
                                if (!cursorQuery.moveToNext()) {
                                    i = i2;
                                    break;
                                }
                                int i3 = cursorQuery.getInt(columnIndex4);
                                long j = cursorQuery.getLong(columnIndex2);
                                if (a(jCurrentTimeMillis, j, i3)) {
                                    int i4 = cursorQuery.getInt(columnIndex);
                                    String string = cursorQuery.getString(columnIndex3);
                                    com.xiaomi.onetrack.a.b.a aVar = new com.xiaomi.onetrack.a.b.a();
                                    aVar.b(string);
                                    aVar.a(i4);
                                    aVar.a(j);
                                    aVar.b(i3);
                                    arrayList.add(aVar);
                                    i = i2 + 1;
                                    if (i >= 100) {
                                        break;
                                    }
                                    i2 = i;
                                }
                            }
                            boolean z = true;
                            if (arrayList.size() > 0) {
                                p.a(f13693a, "get ad monitor size :" + arrayList.size());
                                if (cursorQuery.isAfterLast()) {
                                    p.a(f13693a, "cursor isAfterLast");
                                } else {
                                    z = false;
                                }
                            }
                            com.xiaomi.onetrack.a.c.a aVar2 = new com.xiaomi.onetrack.a.c.a(i, arrayList, z);
                            cursorQuery.close();
                            return aVar2;
                        } catch (SQLiteBlobTooBigException e2) {
                            e = e2;
                            p.b(f13693a, "blob too big ***", e);
                            f();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        } catch (Exception e3) {
                            e = e3;
                            p.a(f13693a, "", e);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (SQLiteBlobTooBigException e4) {
                    e = e4;
                    cursorQuery = null;
                } catch (Exception e5) {
                    e = e5;
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void c() {
        com.xiaomi.onetrack.a.a.a.a(new c(this));
    }

    public void d() {
        synchronized (this.i) {
            Cursor cursorQuery = null;
            try {
                try {
                    SQLiteDatabase writableDatabase = this.i.getWritableDatabase();
                    String[] strArr = {Long.toString(4L)};
                    cursorQuery = writableDatabase.query(C0830a.f13696b, new String[]{"timestamp"}, "send_count >= ? ", strArr, null, null, f);
                    if (cursorQuery.getCount() != 0) {
                        p.a(f13693a, "*** deleted obsolete ad monitor count=" + writableDatabase.delete(C0830a.f13696b, "send_count >= ? ", strArr));
                    }
                    if (p.f13986a) {
                        p.a(f13693a, "after delete obsolete ad monitor record remains=" + e());
                    }
                } catch (Exception e2) {
                    p.d(f13693a, "remove obsolete ad monitor failed with " + e2);
                    if (cursorQuery != null) {
                    }
                }
                cursorQuery.close();
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
    }

    public long e() {
        return DatabaseUtils.queryNumEntries(this.i.getReadableDatabase(), C0830a.f13696b);
    }

    public static a a() {
        if (h == null) {
            a(com.xiaomi.onetrack.f.a.a());
        }
        return h;
    }

    public static void a(Context context) {
        if (h == null) {
            synchronized (a.class) {
                try {
                    if (h == null) {
                        h = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(com.xiaomi.onetrack.f.b bVar) {
        try {
            com.xiaomi.onetrack.a.a.a.a(new b(this, bVar));
        } catch (Throwable th) {
            p.a(f13693a, "filterAdMonitor Throwable：" + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(com.xiaomi.onetrack.a.b.a aVar) {
        synchronized (this.i) {
            try {
                if (!aVar.h()) {
                    p.c(f13693a, "addAdMonitorToDatabase event is inValid, event:" + aVar.a());
                    return -1L;
                }
                SQLiteDatabase writableDatabase = this.i.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("appid", aVar.e());
                contentValues.put("package", aVar.f());
                contentValues.put("event_name", aVar.a());
                contentValues.put("timestamp", Long.valueOf(aVar.d()));
                contentValues.put("url", aVar.c());
                long jInsert = writableDatabase.insert(C0830a.f13696b, null, contentValues);
                p.a(f13693a, "DB-Thread: AdMonitorManager.addAdMonitorToDatabase , row=" + jInsert);
                if (p.f13986a) {
                    p.a(f13693a, "添加后，ad monitor url 中事件个数为 " + e());
                }
                return jInsert;
            } catch (Throwable th) {
                p.a(f13693a, "addAdMonitorToDatabase Throwable：" + th.getMessage());
                return -1L;
            }
        }
    }

    public int a(ArrayList<Integer> arrayList) {
        synchronized (this.i) {
            if (arrayList != null) {
                try {
                    if (arrayList.size() != 0) {
                        try {
                            SQLiteDatabase writableDatabase = this.i.getWritableDatabase();
                            StringBuilder sb = new StringBuilder(((Long.toString(arrayList.get(0).intValue()).length() + 1) * arrayList.size()) + 16);
                            sb.append("_id");
                            sb.append(" in (");
                            sb.append(arrayList.get(0));
                            int size = arrayList.size();
                            for (int i = 1; i < size; i++) {
                                sb.append(",");
                                sb.append(arrayList.get(i));
                            }
                            sb.append(")");
                            int iDelete = writableDatabase.delete(C0830a.f13696b, sb.toString(), null);
                            p.a(f13693a, "*** *** deleted ad monitor count " + iDelete);
                            if (p.f13986a) {
                                p.a(f13693a, "after delete ad monitor record remains=" + e());
                            }
                            return iDelete;
                        } catch (Exception e2) {
                            p.b(f13693a, "e=" + e2);
                            return 0;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return 0;
        }
    }

    public void b(ArrayList<Integer> arrayList) {
        String str;
        String str2;
        synchronized (this.i) {
            if (arrayList != null) {
                try {
                    try {
                        if (arrayList.size() > 0) {
                            SQLiteDatabase writableDatabase = null;
                            try {
                                try {
                                    writableDatabase = this.i.getWritableDatabase();
                                    writableDatabase.beginTransaction();
                                    for (Integer num : arrayList) {
                                        num.intValue();
                                        writableDatabase.execSQL(String.format("update %s set %s = %s + 1 where %s = %s", C0830a.f13696b, C0830a.i, C0830a.i, "_id", num));
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                    try {
                                        writableDatabase.endTransaction();
                                        writableDatabase.close();
                                    } catch (Exception e2) {
                                        str = f13693a;
                                        str2 = "addAdMonitorsRetryCount endTransaction error: " + e2.getMessage();
                                        p.b(str, str2);
                                    }
                                } catch (Exception e3) {
                                    p.b(f13693a, "addAdMonitorsRetryCount Exception: " + e3.getMessage());
                                    if (writableDatabase != null) {
                                        try {
                                            writableDatabase.endTransaction();
                                            writableDatabase.close();
                                        } catch (Exception e4) {
                                            str = f13693a;
                                            str2 = "addAdMonitorsRetryCount endTransaction error: " + e4.getMessage();
                                            p.b(str, str2);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                if (writableDatabase != null) {
                                    try {
                                        writableDatabase.endTransaction();
                                        writableDatabase.close();
                                    } catch (Exception e5) {
                                        p.b(f13693a, "addAdMonitorsRetryCount endTransaction error: " + e5.getMessage());
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        p.a(f13693a, "addAdMonitorsRetryCount Throwable:" + th2.getMessage());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public boolean a(long j, long j2, int i) {
        if (i <= 0) {
            return true;
        }
        if (i < 4) {
            return Math.abs(j - j2) >= ((long) n.a(i - 1));
        }
        return false;
    }
}
