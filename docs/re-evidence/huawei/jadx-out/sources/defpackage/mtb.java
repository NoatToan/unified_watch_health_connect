package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.SecurityContactsDbHelper;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
public class mtb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42379a = new Object();
    private static volatile mtb d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecurityContactsDbHelper f42380b;

    private mtb(Context context) {
        this.f42380b = SecurityContactsDbHelper.d(context);
    }

    public static mtb e(Context context) {
        mtb mtbVar;
        if (context == null) {
            context = BaseApplication.getContext();
        }
        synchronized (f42379a) {
            if (d == null) {
                d = new mtb(context);
            }
            mtbVar = d;
        }
        return mtbVar;
    }

    public void b(String str) {
        if (c(str)) {
            return;
        }
        this.f42380b.e(str);
    }

    public void a(final List<msy> list, final String str) {
        LogUtil.a("SimpleContactsDao", "insert: ");
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsDao", "insert: failure, list/tableName is null or empty.");
            return;
        }
        b(str);
        final SQLiteDatabase sQLiteDatabaseC = this.f42380b.c();
        new RunOnTransaction(sQLiteDatabaseC) { // from class: mtb.4
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mtb.this.d((msy) it.next(), str, sQLiteDatabaseC);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(msy msyVar, String str, SQLiteDatabase sQLiteDatabase) {
        long jInsert;
        if (msyVar == null || TextUtils.isEmpty(str) || sQLiteDatabase == null) {
            LogUtil.j("SimpleContactsDao", "insert: failure, input parameters contain null.");
            return;
        }
        try {
            jInsert = sQLiteDatabase.insert(str, (String) null, b(msyVar));
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("SimpleContactsDao", "insert: occurred IllegalStateException or SQLException.");
            jInsert = -1;
        }
        LogUtil.a("SimpleContactsDao", "insert: result: ", Long.valueOf(jInsert));
    }

    public void e(final List<String> list, final String str) {
        LogUtil.a("SimpleContactsDao", "delete: ");
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsDao", "delete: rawContactUidList/tableName is null or empty.");
            return;
        }
        b(str);
        final SQLiteDatabase sQLiteDatabaseC = this.f42380b.c();
        new RunOnTransaction(sQLiteDatabaseC) { // from class: mtb.2
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mtb.this.e((String) it.next(), str, sQLiteDatabaseC);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        int iDelete;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || sQLiteDatabase == null) {
            LogUtil.j("SimpleContactsDao", "delete: delete failure. input parameters contain null.");
            return;
        }
        try {
            iDelete = sQLiteDatabase.delete(str2, "raw_contact_uid = ?", new String[]{str});
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("SimpleContactsDao", "delete: occurred IllegalStateException or SQLException.");
            iDelete = -1;
        }
        LogUtil.a("SimpleContactsDao", "delete: result: ", Integer.valueOf(iDelete));
    }

    private void a(msy msyVar, String str, SQLiteDatabase sQLiteDatabase) {
        int iUpdate;
        if (msyVar == null || TextUtils.isEmpty(str) || sQLiteDatabase == null) {
            LogUtil.j("SimpleContactsDao", "update: failure, input parameters contains null.");
            return;
        }
        try {
            iUpdate = sQLiteDatabase.update(str, b(msyVar), "raw_contact_uid = ?", new String[]{msyVar.c()});
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("SimpleContactsDao", "update: occurred IllegalStateException or SQLException.");
            iUpdate = -1;
        }
        LogUtil.a("SimpleContactsDao", "update: result: ", Integer.valueOf(iUpdate));
    }

    public void c(final List<msy> list, final String str) {
        LogUtil.a("SimpleContactsDao", "updateOrInsert: ");
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsDao", "updateOrInsert: failure, bean/tableName is null.");
            return;
        }
        LogUtil.a("SimpleContactsDao", "updateOrInsert beans size: ", Integer.valueOf(list.size()));
        b(str);
        final SQLiteDatabase sQLiteDatabaseC = this.f42380b.c();
        new RunOnTransaction(sQLiteDatabaseC) { // from class: mtb.3
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mtb.this.b((msy) it.next(), str, sQLiteDatabaseC);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(msy msyVar, String str, SQLiteDatabase sQLiteDatabase) {
        if (msyVar == null || TextUtils.isEmpty(str) || sQLiteDatabase == null) {
            LogUtil.j("SimpleContactsDao", "updateOrInsert: failure, input parameters contain null.");
        } else if (d(msyVar.c(), str, sQLiteDatabase).isEmpty()) {
            d(msyVar, str, sQLiteDatabase);
        } else {
            a(msyVar, str, sQLiteDatabase);
        }
    }

    private List<msy> d(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList(0);
        try {
            Cursor cursorQuery = sQLiteDatabase.query(str2, null, "raw_contact_uid = ?", new String[]{str}, null, null, null);
            try {
                ArrayList arrayList2 = new ArrayList(d(cursorQuery));
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (SQLException | IllegalStateException unused) {
                        arrayList = arrayList2;
                        LogUtil.e("SimpleContactsDao", "query: occurred IllegalStateException or SQLException.");
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
        } catch (SQLException | IllegalStateException unused2) {
        }
    }

    public List<msy> d(String str) {
        LogUtil.a("SimpleContactsDao", "queryAll:");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsDao", "queryAll: failure, tableName is null or empty");
            return new ArrayList(0);
        }
        b(str);
        SQLiteDatabase sQLiteDatabaseC = this.f42380b.c();
        ArrayList arrayList = new ArrayList(0);
        try {
            Cursor cursorQuery = sQLiteDatabaseC.query(str, null, null, null, null, null, null);
            try {
                ArrayList arrayList2 = new ArrayList(d(cursorQuery));
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (SQLException | IllegalStateException unused) {
                        arrayList = arrayList2;
                        LogUtil.e("SimpleContactsDao", "queryAll: occurred IllegalStateException or SQLException.");
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
        } catch (SQLException | IllegalStateException unused2) {
        }
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsDao", "hasTable: deviceId is null or empty.");
            return false;
        }
        return this.f42380b.a(this.f42380b.c(), str);
    }

    private List<msy> d(Cursor cursor) {
        if (ContactsDatabaseUtils.d(cursor)) {
            LogUtil.j("SimpleContactsDao", "getSimpleContactBeansFromCursor: cursor is null or cannot move.");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new msy(cursor.getInt(cursor.getColumnIndex("raw_contact_id")), cursor.getString(cursor.getColumnIndex("raw_contact_uid")), cursor.getString(cursor.getColumnIndex("raw_contact_feature"))));
        } while (cursor.moveToNext());
        return arrayList;
    }

    private ContentValues b(msy msyVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("raw_contact_id", Integer.valueOf(msyVar.a()));
        contentValues.put("raw_contact_uid", msyVar.c());
        contentValues.put("raw_contact_feature", msyVar.e());
        return contentValues;
    }
}
