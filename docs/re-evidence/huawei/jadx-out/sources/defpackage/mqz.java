package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.CalendarSyncStateBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.RunOnTransaction;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SecurityCalendarDbHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
public class mqz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42224c = new Object();
    private static volatile mqz e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecurityCalendarDbHelper f42225b;

    private mqz(Context context) {
        this.f42225b = SecurityCalendarDbHelper.e(context);
        c();
    }

    public static mqz b(Context context) {
        mqz mqzVar;
        if (context == null) {
            context = BaseApplication.getContext();
        }
        synchronized (f42224c) {
            if (e == null) {
                e = new mqz(context);
            }
            mqzVar = e;
        }
        return mqzVar;
    }

    private void c() {
        if (b()) {
            return;
        }
        LogUtil.a("DeviceSyncStateDao", "createSyncStateTable: has no table.");
        this.f42225b.a();
    }

    public void a(final List<CalendarSyncStateBean> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceSyncStateDao", "insert: insert failure. list is null or empty.");
        } else if (!b()) {
            LogUtil.a("DeviceSyncStateDao", "insert: device state table do not existed.");
        } else {
            final SQLiteDatabase sQLiteDatabaseD = this.f42225b.d();
            new RunOnTransaction(sQLiteDatabaseD) { // from class: mqz.4
                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.RunOnTransaction
                public void run() {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mqz.this.e((CalendarSyncStateBean) it.next(), sQLiteDatabaseD);
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(CalendarSyncStateBean calendarSyncStateBean, SQLiteDatabase sQLiteDatabase) {
        long jInsert;
        if (calendarSyncStateBean == null) {
            LogUtil.j("DeviceSyncStateDao", "insert: insert failure. bean is null.");
            return;
        }
        if (sQLiteDatabase == null) {
            LogUtil.j("DeviceSyncStateDao", "insert: insert failure. database is null.");
            return;
        }
        try {
            jInsert = sQLiteDatabase.insert("calendar_sync_state", (String) null, c(calendarSyncStateBean));
        } catch (SQLiteException | IllegalStateException unused) {
            LogUtil.e("DeviceSyncStateDao", "insert: occurred IllegalStateException or SQLException.");
            jInsert = 0;
        }
        if (jInsert == -1) {
            LogUtil.j("DeviceSyncStateDao", "insert: insert failure.");
        }
    }

    public void d(final List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceSyncStateDao", "delete: delete failure. deviceIdList is null or empty.");
        } else if (!b()) {
            LogUtil.j("DeviceSyncStateDao", "delete: device state table do not existed.");
        } else {
            final SQLiteDatabase sQLiteDatabaseD = this.f42225b.d();
            new RunOnTransaction(sQLiteDatabaseD) { // from class: mqz.5
                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.RunOnTransaction
                public void run() {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mqz.this.e((String) it.next(), sQLiteDatabaseD);
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, SQLiteDatabase sQLiteDatabase) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceSyncStateDao", "delete: delete failure. deviceId is null.");
            return;
        }
        if (sQLiteDatabase == null) {
            LogUtil.j("DeviceSyncStateDao", "delete: delete failure. database is null.");
            return;
        }
        try {
            if (sQLiteDatabase.delete("calendar_sync_state", "device_id = ?", new String[]{str}) != 0) {
                return;
            }
        } catch (SQLiteException | IllegalStateException unused) {
            LogUtil.e("DeviceSyncStateDao", "delete: occurred IllegalStateException or SQLException.");
        }
        LogUtil.j("DeviceSyncStateDao", "delete: delete failure.");
    }

    public void b(final List<CalendarSyncStateBean> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceSyncStateDao", "update: update failure. beanList is null or empty.");
        } else if (!b()) {
            LogUtil.j("DeviceSyncStateDao", "update: device state table do not existed.");
        } else {
            final SQLiteDatabase sQLiteDatabaseD = this.f42225b.d();
            new RunOnTransaction(sQLiteDatabaseD) { // from class: mqz.2
                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.RunOnTransaction
                public void run() {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mqz.this.b((CalendarSyncStateBean) it.next(), sQLiteDatabaseD);
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CalendarSyncStateBean calendarSyncStateBean, SQLiteDatabase sQLiteDatabase) {
        if (calendarSyncStateBean == null) {
            LogUtil.j("DeviceSyncStateDao", "update: update failure. bean is null");
            return;
        }
        if (sQLiteDatabase == null) {
            LogUtil.j("DeviceSyncStateDao", "update: update failure. database is null.");
            return;
        }
        try {
            if (sQLiteDatabase.update("calendar_sync_state", c(calendarSyncStateBean), "device_id = ?", new String[]{calendarSyncStateBean.getDeviceIdentify()}) != 0) {
                return;
            }
        } catch (SQLiteException | IllegalStateException unused) {
            LogUtil.e("DeviceSyncStateDao", "update: occurred IllegalStateException or SQLException.");
        }
        LogUtil.j("DeviceSyncStateDao", "update: update failure.");
    }

    public List<CalendarSyncStateBean> c(List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceSyncStateDao", "query: failed, deviceIdList is null or empty.");
            return Collections.EMPTY_LIST;
        }
        if (!b()) {
            LogUtil.j("DeviceSyncStateDao", "query: device state table do not existed.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        SQLiteDatabase sQLiteDatabaseD = this.f42225b.d();
        if (sQLiteDatabaseD == null) {
            LogUtil.j("DeviceSyncStateDao", "query: query failure. database is null.");
            return Collections.EMPTY_LIST;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(d(it.next(), sQLiteDatabaseD));
        }
        return arrayList;
    }

    private List<CalendarSyncStateBean> d(String str, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(0);
        try {
            Cursor cursorQuery = sQLiteDatabase.query("calendar_sync_state", null, "device_id = ?", new String[]{str}, null, null, null);
            try {
                arrayList = new ArrayList(e(cursorQuery));
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (SQLiteException | IllegalStateException unused) {
                        arrayList2 = arrayList;
                        LogUtil.e("DeviceSyncStateDao", "query: occurred IllegalStateException or SQLException.");
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
        return arrayList;
    }

    public List<String> e() {
        if (!b()) {
            LogUtil.j("DeviceSyncStateDao", "queryAllDeviceId: device state table do not existed.");
            return new ArrayList(0);
        }
        SQLiteDatabase sQLiteDatabaseD = this.f42225b.d();
        if (sQLiteDatabaseD == null) {
            LogUtil.j("DeviceSyncStateDao", "queryAllDeviceId: query failure. database is null.");
            return new ArrayList(0);
        }
        String[] strArr = {"device_id"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = sQLiteDatabaseD.query("calendar_sync_state", strArr, null, null, null, null, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    do {
                        arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndex("device_id")));
                    } while (cursorQuery.moveToNext());
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
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
        } catch (SQLiteException | IllegalArgumentException unused) {
            LogUtil.e("DeviceSyncStateDao", "queryAllDeviceId: occurred Exception.");
        }
        mtv.e(arrayList);
        return arrayList;
    }

    private boolean b() {
        return this.f42225b.d(this.f42225b.d(), "calendar_sync_state");
    }

    private ContentValues c(CalendarSyncStateBean calendarSyncStateBean) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("device_id", calendarSyncStateBean.getDeviceIdentify());
        contentValues.put("device_table_name", calendarSyncStateBean.getDeviceTableName());
        contentValues.put("device_sync_flag", Integer.valueOf(calendarSyncStateBean.getSyncAllFlag()));
        contentValues.put("minor", Long.valueOf(calendarSyncStateBean.getMinor()));
        return contentValues;
    }

    private List<CalendarSyncStateBean> e(Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            LogUtil.j("DeviceSyncStateDao", "getDeviceSyncStateBeansFromCursor: invalid cursor. ", cursor == null ? Constants.NULL : Integer.valueOf(cursor.getCount()));
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new CalendarSyncStateBean(cursor.getString(cursor.getColumnIndex("device_id")), cursor.getString(cursor.getColumnIndex("device_table_name")), cursor.getInt(cursor.getColumnIndex("device_sync_flag")), cursor.getLong(cursor.getColumnIndex("minor"))));
        } while (cursor.moveToNext());
        return arrayList;
    }
}
