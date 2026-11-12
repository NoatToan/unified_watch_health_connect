package com.huawei.openalliance.ad;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class es {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f18718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected gk f18719b;

    public void e() {
    }

    protected <T extends com.huawei.openalliance.ad.db.bean.a> void c(List<dh> list) {
        dg dgVarA = dg.a(this.f18718a);
        try {
            dgVarA.a(list);
        } finally {
            a(dgVarA);
        }
    }

    protected <T extends com.huawei.openalliance.ad.db.bean.a> void a(Class<T> cls, ContentValues contentValues, fq fqVar, List<String> list) {
        if (this.f18719b.bf()) {
            dg dgVarA = dg.a(this.f18718a);
            try {
                dgVarA.a(cls.getSimpleName(), contentValues, fqVar.a(), list);
            } finally {
                a(dgVarA);
            }
        }
    }

    protected void a(dg dgVar) {
        if (dgVar != null) {
            dgVar.a();
        }
    }

    protected void a(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Throwable unused) {
            hw.d("BaseDao", "closeCursor exception");
        }
    }

    protected <T extends com.huawei.openalliance.ad.db.bean.a> List<T> a(Class<T> cls, String[] strArr, fq fqVar, String[] strArr2, String str, String str2) throws Throwable {
        dg dgVarA;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        String strA = fqVar == null ? null : fqVar.a();
        try {
            dgVarA = dg.a(this.f18718a);
            try {
                Cursor cursorA = dgVarA.a(cls.getSimpleName(), strArr, strA, strArr2, str, str2);
                try {
                    a(cls, arrayList, cursorA);
                    a(cursorA);
                    a(dgVarA);
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorA;
                    a(cursor);
                    a(dgVarA);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            dgVarA = null;
        }
    }

    protected <T extends com.huawei.openalliance.ad.db.bean.a> List<T> a(Class<T> cls, String str, String[] strArr) {
        dg dgVarA;
        ArrayList arrayList = new ArrayList();
        Cursor cursorA = null;
        try {
            dgVarA = dg.a(this.f18718a);
            try {
                cursorA = dgVarA.a(str, strArr);
                a(cls, arrayList, cursorA);
            } catch (Throwable th) {
                th = th;
                try {
                    hw.d("BaseDao", "query db exception: %s", th.getClass().getSimpleName());
                } finally {
                    a(cursorA);
                    a(dgVarA);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            dgVarA = null;
        }
        return arrayList;
    }

    protected <T extends com.huawei.openalliance.ad.db.bean.a> long a(Class<T> cls, List<ContentValues> list) {
        dg dgVarA = dg.a(this.f18718a);
        try {
            return dgVarA.a(cls.getSimpleName(), list);
        } finally {
            a(dgVarA);
        }
    }

    protected <T extends com.huawei.openalliance.ad.db.bean.a> long a(Class<T> cls, ContentValues contentValues) {
        if (!this.f18719b.bf()) {
            return 0L;
        }
        dg dgVarA = dg.a(this.f18718a);
        try {
            return dgVarA.a(cls.getSimpleName(), contentValues);
        } finally {
            a(dgVarA);
        }
    }

    protected long a(Class cls) {
        dg dgVarA = null;
        try {
            dgVarA = dg.a(this.f18718a);
            return dgVarA.g(cls.getSimpleName());
        } finally {
            a(dgVarA);
        }
    }

    protected <T extends com.huawei.openalliance.ad.db.bean.a> int a(Class<T> cls, fq fqVar, String[] strArr) {
        dg dgVarA = dg.a(this.f18718a);
        try {
            return dgVarA.a(cls.getSimpleName(), fqVar == null ? null : fqVar.a(), strArr);
        } finally {
            a(dgVarA);
        }
    }

    protected <T extends com.huawei.openalliance.ad.db.bean.a> int a(Class<T> cls, fq fqVar, List<String> list) {
        dg dgVarA = dg.a(this.f18718a);
        try {
            return dgVarA.a(cls.getSimpleName(), fqVar.a(), list);
        } finally {
            a(dgVarA);
        }
    }

    protected <T extends com.huawei.openalliance.ad.db.bean.a> int a(Class<T> cls, ContentValues contentValues, fq fqVar, String[] strArr) {
        if (!this.f18719b.bf()) {
            return 0;
        }
        dg dgVarA = dg.a(this.f18718a);
        try {
            return dgVarA.a(cls.getSimpleName(), contentValues, fqVar.a(), strArr);
        } finally {
            a(dgVarA);
        }
    }

    private <T extends com.huawei.openalliance.ad.db.bean.a> void a(Class<T> cls, List<T> list, Cursor cursor) {
        String str;
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    T tNewInstance = cls.newInstance();
                    tNewInstance.a(cursor);
                    list.add(tNewInstance);
                } catch (IllegalAccessException unused) {
                    str = "query IllegalAccessException";
                    hw.d("BaseDao", str);
                } catch (InstantiationException unused2) {
                    str = "query InstantiationException";
                    hw.d("BaseDao", str);
                } catch (Exception unused3) {
                    str = "query exception";
                    hw.d("BaseDao", str);
                }
            }
        }
    }

    protected es(Context context) {
        this.f18718a = context.getApplicationContext();
        this.f18719b = fp.b(context);
    }
}
