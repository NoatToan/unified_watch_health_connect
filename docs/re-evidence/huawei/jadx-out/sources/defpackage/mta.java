package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.SecurityContactsDbHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
public class mta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile mta f42369a;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecurityContactsDbHelper f42370c;

    private mta(Context context) {
        this.f42370c = SecurityContactsDbHelper.d(context);
        c();
    }

    public static mta b(Context context) {
        mta mtaVar;
        if (context == null) {
            context = BaseApplication.getContext();
        }
        synchronized (e) {
            if (f42369a == null) {
                f42369a = new mta(context);
            }
            mtaVar = f42369a;
        }
        return mtaVar;
    }

    private void c() {
        if (a()) {
            return;
        }
        LogUtil.a("DeviceSyncStateDao", "createSyncStateTable: has no table.");
        this.f42370c.d();
    }

    public void b(final List<msv> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceSyncStateDao", "insert: insert failure. list is null or empty.");
        } else if (!a()) {
            LogUtil.a("DeviceSyncStateDao", "insert: device state table do not existed.");
        } else {
            final SQLiteDatabase sQLiteDatabaseC = this.f42370c.c();
            new RunOnTransaction(sQLiteDatabaseC) { // from class: mta.1
                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
                public void run() {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mta.this.c((msv) it.next(), sQLiteDatabaseC);
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(msv msvVar, SQLiteDatabase sQLiteDatabase) {
        long jInsert;
        if (msvVar == null) {
            LogUtil.j("DeviceSyncStateDao", "insert: insert failure. bean is null.");
            return;
        }
        if (sQLiteDatabase == null) {
            LogUtil.j("DeviceSyncStateDao", "insert: insert failure. database is null.");
            return;
        }
        try {
            jInsert = sQLiteDatabase.insert("contact_sync_state", (String) null, d(msvVar));
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("DeviceSyncStateDao", "insert: occurred IllegalStateException or SQLException.");
            jInsert = 0;
        }
        if (jInsert == -1) {
            LogUtil.j("DeviceSyncStateDao", "insert: insert failure.");
        }
    }

    public void a(final List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceSyncStateDao", "delete: delete failure. deviceIdList is null or empty.");
        } else if (!a()) {
            LogUtil.j("DeviceSyncStateDao", "delete: device state table do not existed.");
        } else {
            final SQLiteDatabase sQLiteDatabaseC = this.f42370c.c();
            new RunOnTransaction(sQLiteDatabaseC) { // from class: mta.2
                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
                public void run() {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mta.this.b((String) it.next(), sQLiteDatabaseC);
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, SQLiteDatabase sQLiteDatabase) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceSyncStateDao", "delete: delete failure. deviceId is null.");
            return;
        }
        if (sQLiteDatabase == null) {
            LogUtil.j("DeviceSyncStateDao", "delete: delete failure. database is null.");
            return;
        }
        try {
            if (sQLiteDatabase.delete("contact_sync_state", "device_id = ?", new String[]{str}) != 0) {
                return;
            }
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("DeviceSyncStateDao", "delete: occurred IllegalStateException or SQLException.");
        }
        LogUtil.j("DeviceSyncStateDao", "delete: delete failure.");
    }

    public void c(final List<msv> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceSyncStateDao", "update: update failure. beanList is null or empty.");
        } else if (!a()) {
            LogUtil.j("DeviceSyncStateDao", "update: device state table do not existed.");
        } else {
            final SQLiteDatabase sQLiteDatabaseC = this.f42370c.c();
            new RunOnTransaction(sQLiteDatabaseC) { // from class: mta.5
                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
                public void run() {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mta.this.a((msv) it.next(), sQLiteDatabaseC);
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(msv msvVar, SQLiteDatabase sQLiteDatabase) {
        if (msvVar == null) {
            LogUtil.j("DeviceSyncStateDao", "update: update failure. bean is null");
            return;
        }
        if (sQLiteDatabase == null) {
            LogUtil.j("DeviceSyncStateDao", "update: update failure. database is null.");
            return;
        }
        try {
            if (sQLiteDatabase.update("contact_sync_state", d(msvVar), "device_id = ?", new String[]{msvVar.e()}) != 0) {
                return;
            }
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("DeviceSyncStateDao", "update: occurred IllegalStateException or SQLException.");
        }
        LogUtil.j("DeviceSyncStateDao", "update: update failure.");
    }

    public void e(final List<msv> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceSyncStateDao", "updateOrInsert: updateOrInsert failure. beanList is null or empty.");
        } else if (!a()) {
            LogUtil.j("DeviceSyncStateDao", "updateOrInsert: device state table do not existed.");
        } else {
            final SQLiteDatabase sQLiteDatabaseC = this.f42370c.c();
            new RunOnTransaction(sQLiteDatabaseC) { // from class: mta.3
                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
                public void run() {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mta.this.b((msv) it.next(), sQLiteDatabaseC);
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(msv msvVar, SQLiteDatabase sQLiteDatabase) {
        if (msvVar == null) {
            LogUtil.j("DeviceSyncStateDao", "updateOrInsert: failed, bean is null");
            return;
        }
        if (sQLiteDatabase == null) {
            LogUtil.j("DeviceSyncStateDao", "updateOrInsert: updateOrInsert failure. database is null.");
        } else if (d(msvVar.e(), sQLiteDatabase).isEmpty()) {
            c(msvVar, sQLiteDatabase);
        } else {
            a(msvVar, sQLiteDatabase);
        }
    }

    public List<msv> d(List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceSyncStateDao", "query: failed, deviceIdList is null or empty.");
            return Collections.EMPTY_LIST;
        }
        if (!a()) {
            LogUtil.j("DeviceSyncStateDao", "query: device state table do not existed.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        SQLiteDatabase sQLiteDatabaseC = this.f42370c.c();
        if (sQLiteDatabaseC == null) {
            LogUtil.j("DeviceSyncStateDao", "query: query failure. database is null.");
            return Collections.EMPTY_LIST;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(d(it.next(), sQLiteDatabaseC));
        }
        return arrayList;
    }

    private List<msv> d(String str, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList(0);
        try {
            Cursor cursorQuery = sQLiteDatabase.query("contact_sync_state", null, "device_id = ?", new String[]{str}, null, null, null);
            try {
                ArrayList arrayList2 = new ArrayList(a(cursorQuery));
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (SQLException | IllegalStateException unused) {
                        arrayList = arrayList2;
                        LogUtil.e("DeviceSyncStateDao", "query: occurred IllegalStateException or SQLException.");
                        arrayList2 = arrayList;
                    }
                }
                mtv.e(arrayList2);
                return arrayList2;
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
        } catch (SQLException | IllegalStateException unused2) {
        }
    }

    public List<String> d() {
        if (!a()) {
            LogUtil.j("DeviceSyncStateDao", "queryAllDeviceId: device state table do not existed.");
            return new ArrayList(0);
        }
        SQLiteDatabase sQLiteDatabaseC = this.f42370c.c();
        if (sQLiteDatabaseC == null) {
            LogUtil.j("DeviceSyncStateDao", "queryAllDeviceId: query failure. database is null.");
            return new ArrayList(0);
        }
        String[] strArr = {"device_id"};
        ArrayList arrayList = new ArrayList(16);
        try {
            Cursor cursorQuery = sQLiteDatabaseC.query("contact_sync_state", strArr, null, null, null, null, null);
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
        } catch (SQLException | IllegalArgumentException unused) {
            LogUtil.e("DeviceSyncStateDao", "queryAllDeviceId: occurred Exception.");
        }
        mtv.e(arrayList);
        return arrayList;
    }

    private boolean a() {
        return this.f42370c.a(this.f42370c.c(), "contact_sync_state");
    }

    private ContentValues d(msv msvVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("device_id", msvVar.e());
        contentValues.put("device_table_name", msvVar.c());
        contentValues.put("device_sync_flag", Integer.valueOf(msvVar.b()));
        contentValues.put("device_sync_state", Integer.valueOf(msvVar.a()));
        contentValues.put("device_last_sync_time", Long.valueOf(msvVar.d()));
        return contentValues;
    }

    private List<msv> a(Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            LogUtil.j("DeviceSyncStateDao", "getDeviceSyncStateBeansFromCursor: invalid cursor. ", cursor == null ? Constants.NULL : Integer.valueOf(cursor.getCount()));
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new msv(cursor.getString(cursor.getColumnIndex("device_id")), cursor.getString(cursor.getColumnIndex("device_table_name")), cursor.getInt(cursor.getColumnIndex("device_sync_flag")), cursor.getInt(cursor.getColumnIndex("device_sync_state")), cursor.getLong(cursor.getColumnIndex("device_last_sync_time"))));
        } while (cursor.moveToNext());
        return arrayList;
    }
}
