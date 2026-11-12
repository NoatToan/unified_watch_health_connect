package com.xiaomi.onetrack.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.onetrack.util.p;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f13705a;

    public c(a aVar) {
        this.f13705a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f13705a.i) {
            Cursor cursorQuery = null;
            try {
                try {
                    SQLiteDatabase writableDatabase = this.f13705a.i.getWritableDatabase();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    calendar.set(6, calendar.get(6) - 7);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    String[] strArr = {Long.toString(calendar.getTimeInMillis())};
                    cursorQuery = writableDatabase.query(a.C0830a.f13696b, new String[]{"timestamp"}, "timestamp < ? ", strArr, null, null, "timestamp ASC");
                    if (cursorQuery.getCount() != 0) {
                        p.a("AdMonitorManager", "*** deleted obsolete ad monitor count=" + writableDatabase.delete(a.C0830a.f13696b, "timestamp < ? ", strArr));
                    }
                    if (p.f13986a) {
                        p.a("AdMonitorManager", "after delete obsolete ad monitor record remains=" + this.f13705a.e());
                    }
                } catch (Exception e) {
                    p.d("AdMonitorManager", "remove obsolete ad monitor failed with " + e);
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
}
