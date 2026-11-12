package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.CalendarDbBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.RunOnTransaction;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SecurityCalendarDbHelper;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
public class mrb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42233c = new Object();
    private static volatile mrb e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecurityCalendarDbHelper f42234a;

    private mrb(Context context) {
        this.f42234a = SecurityCalendarDbHelper.e(context);
    }

    public static mrb e(Context context) {
        mrb mrbVar;
        if (context == null) {
            context = BaseApplication.getContext();
        }
        synchronized (f42233c) {
            if (e == null) {
                e = new mrb(context);
            }
            mrbVar = e;
        }
        return mrbVar;
    }

    public void d(String str) {
        if (b(str)) {
            return;
        }
        this.f42234a.c(str);
    }

    public void e(final List<CalendarDbBean> list, final String str) {
        LogUtil.a("SimpleCalendarDao", "insert: ");
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleCalendarDao", "insert: failure, list/tableName is null or empty.");
            return;
        }
        d(str);
        final SQLiteDatabase sQLiteDatabaseD = this.f42234a.d();
        new RunOnTransaction(sQLiteDatabaseD) { // from class: mrb.1
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.RunOnTransaction
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mrb.this.c((CalendarDbBean) it.next(), str, sQLiteDatabaseD);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CalendarDbBean calendarDbBean, String str, SQLiteDatabase sQLiteDatabase) {
        long jInsert;
        if (calendarDbBean == null || TextUtils.isEmpty(str) || sQLiteDatabase == null) {
            LogUtil.j("SimpleCalendarDao", "insert: failure, input parameters contain null.");
            return;
        }
        try {
            jInsert = sQLiteDatabase.insert(str, (String) null, b(calendarDbBean));
        } catch (SQLiteException | IllegalStateException unused) {
            LogUtil.e("SimpleCalendarDao", "insert: occurred IllegalStateException or SQLiteException.");
            jInsert = -1;
        }
        LogUtil.a("SimpleCalendarDao", "insert: result: ", Long.valueOf(jInsert));
    }

    public void c(final String str, final String str2) {
        LogUtil.a("SimpleCalendarDao", "delete: ");
        if (str == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("SimpleCalendarDao", "delete: rawContactUidList/tableName is null or empty.");
            return;
        }
        d(str2);
        final SQLiteDatabase sQLiteDatabaseD = this.f42234a.d();
        new RunOnTransaction(sQLiteDatabaseD) { // from class: mrb.4
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.RunOnTransaction
            public void run() {
                mrb.this.c(str, str2, sQLiteDatabaseD);
            }
        }.start();
    }

    public void c(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        int iDelete;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || sQLiteDatabase == null) {
            LogUtil.j("SimpleCalendarDao", "delete: delete failure. input parameters contain null.");
            return;
        }
        try {
            iDelete = sQLiteDatabase.delete(str2, "event_uuid = ?", new String[]{str});
        } catch (SQLiteException | IllegalStateException unused) {
            LogUtil.e("SimpleCalendarDao", "delete: occurred IllegalStateException or SQLiteException.");
            iDelete = -1;
        }
        LogUtil.a("SimpleCalendarDao", "delete: result: ", Integer.valueOf(iDelete));
    }

    private void e(CalendarDbBean calendarDbBean, String str, SQLiteDatabase sQLiteDatabase) {
        int iUpdate;
        if (calendarDbBean == null || TextUtils.isEmpty(str) || sQLiteDatabase == null) {
            LogUtil.j("SimpleCalendarDao", "update: failure, input parameters contains null.");
            return;
        }
        try {
            iUpdate = sQLiteDatabase.update(str, b(calendarDbBean), "event_uuid = ?", new String[]{calendarDbBean.getEventUuid()});
        } catch (SQLiteException | IllegalStateException unused) {
            LogUtil.e("SimpleCalendarDao", "update: occurred IllegalStateException or SQLiteException.");
            iUpdate = -1;
        }
        LogUtil.a("SimpleCalendarDao", "update: result: ", Integer.valueOf(iUpdate));
    }

    public void a(final List<CalendarDbBean> list, final String str) {
        LogUtil.a("SimpleCalendarDao", "updateOrInsert: ");
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleCalendarDao", "updateOrInsert: failure, bean/tableName is null.");
            return;
        }
        LogUtil.a("SimpleCalendarDao", "updateOrInsert beans size: ", Integer.valueOf(list.size()));
        d(str);
        final SQLiteDatabase sQLiteDatabaseD = this.f42234a.d();
        new RunOnTransaction(sQLiteDatabaseD) { // from class: mrb.5
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.RunOnTransaction
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mrb.this.b((CalendarDbBean) it.next(), str, sQLiteDatabaseD);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CalendarDbBean calendarDbBean, String str, SQLiteDatabase sQLiteDatabase) {
        if (calendarDbBean == null || TextUtils.isEmpty(str) || sQLiteDatabase == null) {
            LogUtil.j("SimpleCalendarDao", "updateOrInsert: failure, input parameters contain null.");
        } else if (d(calendarDbBean.getEventUuid(), str, sQLiteDatabase).isEmpty()) {
            c(calendarDbBean, str, sQLiteDatabase);
        } else {
            e(calendarDbBean, str, sQLiteDatabase);
        }
    }

    private List<CalendarDbBean> d(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(0);
        try {
            Cursor cursorQuery = sQLiteDatabase.query(str2, null, "event_uuid = ?", new String[]{str}, null, null, null);
            try {
                arrayList = new ArrayList(a(cursorQuery));
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (SQLiteException | IllegalStateException unused) {
                        arrayList2 = arrayList;
                        LogUtil.e("SimpleCalendarDao", "query: occurred IllegalStateException or SQLiteException.");
                        arrayList = arrayList2;
                    }
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException | IllegalStateException unused2) {
        }
        mtv.e(arrayList);
        return new ArrayList(arrayList);
    }

    public List<CalendarDbBean> c(String str) {
        LogUtil.a("SimpleCalendarDao", "queryAll:");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleCalendarDao", "queryAll: failure, tableName is null or empty");
            return new ArrayList(0);
        }
        d(str);
        SQLiteDatabase sQLiteDatabaseD = this.f42234a.d();
        ArrayList arrayList = new ArrayList(0);
        try {
            Cursor cursorQuery = sQLiteDatabaseD.query(str, null, null, null, null, null, null);
            try {
                ArrayList arrayList2 = new ArrayList(a(cursorQuery));
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (SQLiteException | IllegalStateException unused) {
                        arrayList = arrayList2;
                        LogUtil.e("SimpleCalendarDao", "queryAll: occurred IllegalStateException or SQLiteException.");
                        arrayList2 = arrayList;
                    }
                }
                mtv.e(arrayList2);
                return new ArrayList(arrayList2);
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException | IllegalStateException unused2) {
        }
    }

    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleCalendarDao", "hasTable: deviceId is null or empty.");
            return false;
        }
        return this.f42234a.d(this.f42234a.d(), str);
    }

    private List<CalendarDbBean> a(Cursor cursor) {
        if (d(cursor)) {
            LogUtil.j("SimpleCalendarDao", "getSimpleContactBeansFromCursor: cursor is null or cannot move.");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new CalendarDbBean(cursor.getString(cursor.getColumnIndex("event_uuid")), cursor.getInt(cursor.getColumnIndex("operation")), cursor.getString(cursor.getColumnIndex(HeaderType.EVENT_ID)), cursor.getLong(cursor.getColumnIndex("dtstart")), cursor.getLong(cursor.getColumnIndex("dtend")), cursor.getInt(cursor.getColumnIndex("all_day")), cursor.getString(cursor.getColumnIndex("calendarFeature"))));
        } while (cursor.moveToNext());
        return arrayList;
    }

    public static boolean d(Cursor cursor) {
        return cursor == null || !cursor.moveToFirst();
    }

    private ContentValues b(CalendarDbBean calendarDbBean) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_uuid", calendarDbBean.getEventUuid());
        contentValues.put("operation", Integer.valueOf(calendarDbBean.getOperation()));
        contentValues.put(HeaderType.EVENT_ID, calendarDbBean.getEventId());
        contentValues.put("dtstart", Long.valueOf(calendarDbBean.getDtstart()));
        contentValues.put("dtend", Long.valueOf(calendarDbBean.getDtend()));
        contentValues.put("all_day", Integer.valueOf(calendarDbBean.getAllDay()));
        contentValues.put("calendarFeature", calendarDbBean.getCalendarFeature());
        return contentValues;
    }
}
