package com.huawei.hms.network.file.a.k.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.network.file.core.util.FLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f15698a;

    public abstract ContentValues a(T t, String str);

    public abstract T a(Cursor cursor);

    public abstract String a();

    public T c(String str, String[] strArr) {
        List<T> listA = a(null, str, strArr, null, null, null, "1");
        if (listA.size() > 0) {
            return listA.get(0);
        }
        return null;
    }

    public boolean b(List<T> list, String str) {
        try {
            if (list == null) {
                return false;
            }
            this.f15698a.beginTransaction();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f15698a.replace(a(), null, a(it.next(), str)) == -1) {
                    FLogger.w("DBDao", "for replace error", new Object[0]);
                }
            }
            this.f15698a.setTransactionSuccessful();
            return true;
        } catch (Exception e) {
            FLogger.logException(e);
            return false;
        } finally {
            f.a(this.f15698a, "when endTransaction has error!,this time is replace");
        }
    }

    public boolean b(T t, String str) {
        try {
            if (t == null) {
                return false;
            }
            this.f15698a.beginTransaction();
            if (this.f15698a.insert(a(), null, a(t, str)) == -1) {
                FLogger.w("DBDao", "insert error", new Object[0]);
            }
            this.f15698a.setTransactionSuccessful();
            return true;
        } catch (Exception e) {
            FLogger.logException(e);
            return false;
        } finally {
            f.a(this.f15698a, "when endTransaction has error!,this time is insert");
        }
    }

    public List<T> b(String str, String[] strArr) {
        return a(null, str, strArr, null, null, null, null);
    }

    protected byte[] a(Cursor cursor, String str) {
        byte[] blob = null;
        try {
            blob = cursor.getBlob(cursor.getColumnIndex(str));
            return blob != null ? com.huawei.hms.network.file.a.k.b.j.b.a(blob) : blob;
        } catch (Exception e) {
            FLogger.w("DBDao", "getBytesBoException exception for:" + str, new Object[0]);
            FLogger.logException(e);
            return blob;
        }
    }

    public boolean a(List<T> list, String str) {
        try {
            if (list == null) {
                return false;
            }
            this.f15698a.beginTransaction();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f15698a.insert(a(), null, a(it.next(), str)) == -1) {
                    FLogger.w("DBDao", "for insert error", new Object[0]);
                }
            }
            this.f15698a.setTransactionSuccessful();
            return true;
        } catch (Exception e) {
            FLogger.logException(e);
            return false;
        } finally {
            f.a(this.f15698a, "when endTransaction has error!,this time is insert list");
        }
    }

    public boolean a(String str, String[] strArr) {
        try {
            this.f15698a.beginTransaction();
            if (this.f15698a.delete(a(), str, strArr) < 1) {
                FLogger.w("DBDao", "delete error", new Object[0]);
            }
            this.f15698a.setTransactionSuccessful();
            return true;
        } catch (Exception e) {
            FLogger.logException(e);
            return false;
        } finally {
            f.a(this.f15698a, "when endTransaction has error!,this time is delete");
        }
    }

    public boolean a(ContentValues contentValues, String str, String[] strArr) {
        try {
            FLogger.v("DBDao", "update " + str + "," + contentValues);
            this.f15698a.beginTransaction();
            int iUpdate = this.f15698a.update(a(), contentValues, str, strArr);
            if (iUpdate < 1) {
                FLogger.w("DBDao", "update error:" + iUpdate + ",tableName:" + a(), new Object[0]);
            }
            this.f15698a.setTransactionSuccessful();
            return true;
        } catch (Exception e) {
            FLogger.logException(e);
            return false;
        } finally {
            f.a(this.f15698a, "when endTransaction has error!,this time is update");
        }
    }

    public Set<Long> a(String str, String str2, String[] strArr, String str3) {
        HashSet hashSet = new HashSet();
        Cursor cursorQuery = null;
        try {
            try {
                this.f15698a.beginTransaction();
                cursorQuery = this.f15698a.query(a(), new String[]{str}, str2, strArr, null, null, null, str3);
                while (!cursorQuery.isClosed() && cursorQuery.moveToNext()) {
                    hashSet.add(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex(str))));
                }
                this.f15698a.setTransactionSuccessful();
            } catch (Exception e) {
                FLogger.logException(e);
            }
            return hashSet;
        } finally {
            f.a(cursorQuery);
            f.a(this.f15698a, "when endTransaction has error!,this time is queryRequuestIds");
        }
    }

    public List<T> a(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.f15698a.beginTransaction();
                cursorQuery = this.f15698a.query(a(), strArr, str, strArr2, str2, str3, str4, str5);
                while (!cursorQuery.isClosed() && cursorQuery.moveToNext()) {
                    arrayList.add(a(cursorQuery));
                }
                this.f15698a.setTransactionSuccessful();
            } catch (Exception e) {
                FLogger.logException(e);
            }
            return arrayList;
        } finally {
            f.a(cursorQuery);
            f.a(this.f15698a, "when endTransaction has error!,this time is query");
        }
    }

    protected static void a(ContentValues contentValues, String str, byte[] bArr) {
        try {
            contentValues.put(str, com.huawei.hms.network.file.a.k.b.j.b.b(bArr));
        } catch (Exception unused) {
            FLogger.e("DBDao", "putBlobWithEncrypt exception");
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f15698a = sQLiteDatabase;
    }
}
