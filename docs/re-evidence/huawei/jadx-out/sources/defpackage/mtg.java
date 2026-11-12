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
public class mtg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile mtg f42397c;
    private static final Object d = new Object();
    private final SecurityContactsDbHelper e;

    private mtg(Context context) {
        this.e = SecurityContactsDbHelper.d(context);
    }

    public static mtg a(Context context) {
        mtg mtgVar;
        if (context == null) {
            context = BaseApplication.getContext();
        }
        synchronized (d) {
            if (f42397c == null) {
                f42397c = new mtg(context);
            }
            mtgVar = f42397c;
        }
        return mtgVar;
    }

    public void e(String str) {
        if (c(str)) {
            return;
        }
        this.e.c(str);
    }

    public void c(final List<msz> list, final String str) {
        LogUtil.a("SimpleContactsSportDao", "insert: ");
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsSportDao", "insert: failure, list/tableName is null or empty.");
            return;
        }
        e(str);
        final SQLiteDatabase sQLiteDatabaseC = this.e.c();
        new RunOnTransaction(sQLiteDatabaseC) { // from class: mtg.4
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mtg.this.b((msz) it.next(), str, sQLiteDatabaseC);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(msz mszVar, String str, SQLiteDatabase sQLiteDatabase) {
        long jInsert;
        if (mszVar == null || TextUtils.isEmpty(str) || sQLiteDatabase == null) {
            LogUtil.j("SimpleContactsSportDao", "insert: failure, input parameters contain null.");
            return;
        }
        try {
            jInsert = sQLiteDatabase.insert(str, (String) null, c(mszVar));
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("SimpleContactsSportDao", "insert: occurred IllegalStateException or SQLException.");
            jInsert = -1;
        }
        LogUtil.a("SimpleContactsSportDao", "insert: result: ", Long.valueOf(jInsert));
    }

    public void a(final List<String> list, final String str) {
        LogUtil.a("SimpleContactsSportDao", "delete: ");
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsSportDao", "delete: rawContactUidList/tableName is null or empty.");
            return;
        }
        e(str);
        final SQLiteDatabase sQLiteDatabaseC = this.e.c();
        new RunOnTransaction(sQLiteDatabaseC) { // from class: mtg.5
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mtg.this.b((String) it.next(), str, sQLiteDatabaseC);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || sQLiteDatabase == null) {
            LogUtil.j("SimpleContactsSportDao", "delete: delete failure. input parameters contain null.");
            return;
        }
        try {
            sQLiteDatabase.delete(str2, "raw_contact_uid = ?", new String[]{str});
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("SimpleContactsSportDao", "delete: occurred IllegalStateException or SQLException. result:-1");
        }
    }

    public void d(String str) {
        int iDelete;
        SQLiteDatabase sQLiteDatabaseC = this.e.c();
        if (sQLiteDatabaseC == null) {
            LogUtil.j("SimpleContactsSportDao", "delete: delete failure. database is null.");
            return;
        }
        try {
            iDelete = sQLiteDatabaseC.delete(str, "", new String[0]);
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("SimpleContactsSportDao", "delete: occurred IllegalStateException or SQLException. result:-1");
            iDelete = -1;
        }
        LogUtil.a("SimpleContactsSportDao", "deleteAll: result: ", Integer.valueOf(iDelete));
    }

    private void d(msz mszVar, String str, SQLiteDatabase sQLiteDatabase) {
        int iUpdate;
        if (mszVar == null || TextUtils.isEmpty(str) || sQLiteDatabase == null) {
            LogUtil.j("SimpleContactsSportDao", "update: failure, input parameters contains null.");
            return;
        }
        try {
            iUpdate = sQLiteDatabase.update(str, c(mszVar), "raw_contact_uid = ?", new String[]{mszVar.a()});
        } catch (SQLException | IllegalStateException unused) {
            LogUtil.e("SimpleContactsSportDao", "update: occurred IllegalStateException or SQLException.");
            iUpdate = -1;
        }
        LogUtil.a("SimpleContactsSportDao", "update: result: ", Integer.valueOf(iUpdate));
    }

    public void d(final List<msz> list, final String str) {
        LogUtil.a("SimpleContactsSportDao", "updateOrInsert: ");
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsSportDao", "updateOrInsert: failure, bean/tableName is null.");
            return;
        }
        LogUtil.a("SimpleContactsSportDao", "updateOrInsert beans size: ", Integer.valueOf(list.size()));
        e(str);
        final SQLiteDatabase sQLiteDatabaseC = this.e.c();
        new RunOnTransaction(sQLiteDatabaseC) { // from class: mtg.1
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.db.RunOnTransaction
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mtg.this.c((msz) it.next(), str, sQLiteDatabaseC);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(msz mszVar, String str, SQLiteDatabase sQLiteDatabase) {
        if (mszVar == null || TextUtils.isEmpty(str) || sQLiteDatabase == null) {
            LogUtil.j("SimpleContactsSportDao", "updateOrInsert: failure, input parameters contain null.");
        } else if (e(mszVar.a(), str, sQLiteDatabase).isEmpty()) {
            b(mszVar, str, sQLiteDatabase);
        } else {
            d(mszVar, str, sQLiteDatabase);
        }
    }

    private List<msz> e(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(0);
        try {
            Cursor cursorQuery = sQLiteDatabase.query(str2, null, "raw_contact_uid = ?", new String[]{str}, null, null, null);
            try {
                arrayList = new ArrayList(e(cursorQuery));
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (SQLException | IllegalStateException e) {
                        e = e;
                        arrayList2 = arrayList;
                        LogUtil.e("SimpleContactsSportDao", "query: occurred IllegalStateException or SQLException.", e);
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
        } catch (SQLException e2) {
            e = e2;
            LogUtil.e("SimpleContactsSportDao", "query: occurred IllegalStateException or SQLException.", e);
            arrayList = arrayList2;
            mtv.e(arrayList);
            return new ArrayList(arrayList);
        } catch (IllegalStateException e3) {
            e = e3;
            LogUtil.e("SimpleContactsSportDao", "query: occurred IllegalStateException or SQLException.", e);
            arrayList = arrayList2;
            mtv.e(arrayList);
            return new ArrayList(arrayList);
        }
        mtv.e(arrayList);
        return new ArrayList(arrayList);
    }

    public List<msz> a(String str) {
        ArrayList arrayList;
        LogUtil.a("SimpleContactsSportDao", "queryAll:");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsSportDao", "queryAll: failure, tableName is null or empty");
            return new ArrayList(0);
        }
        e(str);
        SQLiteDatabase sQLiteDatabaseC = this.e.c();
        ArrayList arrayList2 = new ArrayList(0);
        if (sQLiteDatabaseC == null) {
            LogUtil.j("SimpleContactsSportDao", "queryAll failure database is null.");
            return arrayList2;
        }
        try {
            Cursor cursorQuery = sQLiteDatabaseC.query(str, null, null, null, null, null, null);
            try {
                arrayList = new ArrayList(e(cursorQuery));
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (SQLException | IllegalStateException e) {
                        e = e;
                        arrayList2 = arrayList;
                        LogUtil.e("SimpleContactsSportDao", "queryAll: occurred IllegalStateException or SQLException.", e);
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
        } catch (SQLException e2) {
            e = e2;
            LogUtil.e("SimpleContactsSportDao", "queryAll: occurred IllegalStateException or SQLException.", e);
            arrayList = arrayList2;
            mtv.e(arrayList);
            return new ArrayList(arrayList);
        } catch (IllegalStateException e3) {
            e = e3;
            LogUtil.e("SimpleContactsSportDao", "queryAll: occurred IllegalStateException or SQLException.", e);
            arrayList = arrayList2;
            mtv.e(arrayList);
            return new ArrayList(arrayList);
        }
        mtv.e(arrayList);
        return new ArrayList(arrayList);
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SimpleContactsSportDao", "hasTable: deviceId is null or empty.");
            return false;
        }
        return this.e.a(this.e.c(), str);
    }

    private List<msz> e(Cursor cursor) {
        if (ContactsDatabaseUtils.d(cursor)) {
            LogUtil.j("SimpleContactsSportDao", "getSimpleContactSportBeansFromCursor: cursor is null or cannot move.");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new msz(cursor.getInt(cursor.getColumnIndex("raw_contact_id")), cursor.getString(cursor.getColumnIndex("raw_contact_uid")), cursor.getString(cursor.getColumnIndex("raw_contact_feature")), cursor.getString(cursor.getColumnIndex("raw_contact_sortletter"))));
        } while (cursor.moveToNext());
        return arrayList;
    }

    private ContentValues c(msz mszVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("raw_contact_id", Integer.valueOf(mszVar.b()));
        contentValues.put("raw_contact_uid", mszVar.a());
        contentValues.put("raw_contact_feature", mszVar.e());
        contentValues.put("raw_contact_sortletter", mszVar.c());
        return contentValues;
    }
}
