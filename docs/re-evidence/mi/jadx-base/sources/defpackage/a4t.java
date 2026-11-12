package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a4t {
    public static Map<Class<? extends x3t>, x3t> d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g4t f621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f622b;
    public x3t c;

    public a4t(Context context, x3t x3tVar) {
        try {
            this.f621a = new g4t(context.getApplicationContext(), x3tVar.b(), x3tVar.c(), x3tVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.c = x3tVar;
    }

    public static ContentValues a(Object obj, c4t c4tVar) {
        ContentValues contentValues = new ContentValues();
        for (Field field : m(obj.getClass(), c4tVar.b())) {
            field.setAccessible(true);
            i(obj, field, contentValues);
        }
        return contentValues;
    }

    public static <T> T c(Cursor cursor, Class<T> cls, c4t c4tVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Field[] fieldArrM = m(cls, c4tVar.b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T tNewInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : fieldArrM) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(e4t.class);
            if (annotation != null) {
                e4t e4tVar = (e4t) annotation;
                int iB = e4tVar.b();
                int columnIndex = cursor.getColumnIndex(e4tVar.a());
                switch (iB) {
                    case 1:
                        field.set(tNewInstance, Short.valueOf(cursor.getShort(columnIndex)));
                        break;
                    case 2:
                        field.set(tNewInstance, Integer.valueOf(cursor.getInt(columnIndex)));
                        break;
                    case 3:
                        field.set(tNewInstance, Float.valueOf(cursor.getFloat(columnIndex)));
                        break;
                    case 4:
                        field.set(tNewInstance, Double.valueOf(cursor.getDouble(columnIndex)));
                        break;
                    case 5:
                        field.set(tNewInstance, Long.valueOf(cursor.getLong(columnIndex)));
                        break;
                    case 6:
                        field.set(tNewInstance, cursor.getString(columnIndex));
                        break;
                    case 7:
                        field.set(tNewInstance, cursor.getBlob(columnIndex));
                        break;
                }
            }
        }
        return tNewInstance;
    }

    public static <T> String d(c4t c4tVar) {
        if (c4tVar == null) {
            return null;
        }
        return c4tVar.a();
    }

    public static synchronized x3t e(Class<? extends x3t> cls) throws IllegalAccessException, InstantiationException {
        try {
            if (d.get(cls) == null) {
                d.put(cls, cls.newInstance());
            }
        } catch (Throwable th) {
            throw th;
        }
        return d.get(cls);
    }

    public static <T> void f(SQLiteDatabase sQLiteDatabase, T t) {
        c4t c4tVarP = p(t.getClass());
        String strD = d(c4tVarP);
        if (TextUtils.isEmpty(strD) || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.insert(strD, null, a(t, c4tVarP));
    }

    public static void i(Object obj, Field field, ContentValues contentValues) {
        Annotation annotation = field.getAnnotation(e4t.class);
        if (annotation == null) {
        }
        e4t e4tVar = (e4t) annotation;
        try {
            switch (e4tVar.b()) {
                case 1:
                    contentValues.put(e4tVar.a(), Short.valueOf(field.getShort(obj)));
                    break;
                case 2:
                    contentValues.put(e4tVar.a(), Integer.valueOf(field.getInt(obj)));
                    break;
                case 3:
                    contentValues.put(e4tVar.a(), Float.valueOf(field.getFloat(obj)));
                    break;
                case 4:
                    contentValues.put(e4tVar.a(), Double.valueOf(field.getDouble(obj)));
                    break;
                case 5:
                    contentValues.put(e4tVar.a(), Long.valueOf(field.getLong(obj)));
                    break;
                case 6:
                    contentValues.put(e4tVar.a(), (String) field.get(obj));
                    break;
                case 7:
                    contentValues.put(e4tVar.a(), (byte[]) field.get(obj));
                    break;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Field[] m(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        return z ? cls.getSuperclass().getDeclaredFields() : cls.getDeclaredFields();
    }

    public static <T> c4t p(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(c4t.class);
        if (annotation != null) {
            return (c4t) annotation;
        }
        return null;
    }

    public final SQLiteDatabase b() {
        try {
            if (this.f622b == null) {
                this.f622b = this.f621a.getReadableDatabase();
            }
        } catch (Throwable th) {
            j2t.e(th, "dbs", "grd");
        }
        return this.f622b;
    }

    public final <T> void g(T t) {
        q(t);
    }

    public final void h(Object obj, String str) {
        synchronized (this.c) {
            try {
                List listO = o(str, obj.getClass());
                if (listO == null || listO.size() == 0) {
                    g(obj);
                } else {
                    r(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T> void j(String str, Class<T> cls) {
        synchronized (this.c) {
            try {
                String strD = d(p(cls));
                if (TextUtils.isEmpty(strD)) {
                    return;
                }
                SQLiteDatabase sQLiteDatabaseN = n();
                this.f622b = sQLiteDatabaseN;
                if (sQLiteDatabaseN == null) {
                    return;
                }
                try {
                    sQLiteDatabaseN.delete(strD, str, null);
                    SQLiteDatabase sQLiteDatabase = this.f622b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        this.f622b = null;
                    }
                } catch (Throwable th) {
                    try {
                        j2t.e(th, "dbs", "dld");
                        SQLiteDatabase sQLiteDatabase2 = this.f622b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                        }
                    } catch (Throwable th2) {
                        SQLiteDatabase sQLiteDatabase3 = this.f622b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.close();
                            this.f622b = null;
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final <T> void k(String str, Object obj) {
        synchronized (this.c) {
            try {
                if (obj == null) {
                    return;
                }
                c4t c4tVarP = p(obj.getClass());
                String strD = d(c4tVarP);
                if (TextUtils.isEmpty(strD)) {
                    return;
                }
                ContentValues contentValuesA = a(obj, c4tVarP);
                SQLiteDatabase sQLiteDatabaseN = n();
                this.f622b = sQLiteDatabaseN;
                if (sQLiteDatabaseN == null) {
                    return;
                }
                try {
                    sQLiteDatabaseN.update(strD, contentValuesA, str, null);
                    SQLiteDatabase sQLiteDatabase = this.f622b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        this.f622b = null;
                    }
                } catch (Throwable th) {
                    try {
                        j2t.e(th, "dbs", "udd");
                        SQLiteDatabase sQLiteDatabase2 = this.f622b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                        }
                    } catch (Throwable th2) {
                        SQLiteDatabase sQLiteDatabase3 = this.f622b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.close();
                            this.f622b = null;
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final <T> void l(List<T> list) {
        String str;
        String str2;
        synchronized (this.c) {
            try {
                if (list.size() == 0) {
                    return;
                }
                SQLiteDatabase sQLiteDatabaseN = n();
                this.f622b = sQLiteDatabaseN;
                if (sQLiteDatabaseN == null) {
                    return;
                }
                try {
                    sQLiteDatabaseN.beginTransaction();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        f(this.f622b, it.next());
                    }
                    this.f622b.setTransactionSuccessful();
                    try {
                        if (this.f622b.inTransaction()) {
                            this.f622b.endTransaction();
                        }
                    } catch (Throwable th) {
                        j2t.e(th, "dbs", "ild");
                    }
                    try {
                        this.f622b.close();
                        this.f622b = null;
                    } catch (Throwable th2) {
                        th = th2;
                        str = "dbs";
                        str2 = "ild";
                        j2t.e(th, str, str2);
                    }
                } catch (Throwable th3) {
                    try {
                        j2t.e(th3, "dbs", "ild");
                        try {
                            if (this.f622b.inTransaction()) {
                                this.f622b.endTransaction();
                            }
                        } catch (Throwable th4) {
                            j2t.e(th4, "dbs", "ild");
                        }
                        try {
                            this.f622b.close();
                            this.f622b = null;
                        } catch (Throwable th5) {
                            th = th5;
                            str = "dbs";
                            str2 = "ild";
                            j2t.e(th, str, str2);
                        }
                    } catch (Throwable th6) {
                        try {
                            if (this.f622b.inTransaction()) {
                                this.f622b.endTransaction();
                            }
                        } catch (Throwable th7) {
                            j2t.e(th7, "dbs", "ild");
                        }
                        try {
                            this.f622b.close();
                            this.f622b = null;
                            throw th6;
                        } catch (Throwable th8) {
                            j2t.e(th8, "dbs", "ild");
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th9) {
                throw th9;
            }
        }
    }

    public final SQLiteDatabase n() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f622b;
            if (sQLiteDatabase == null || sQLiteDatabase.isReadOnly()) {
                SQLiteDatabase sQLiteDatabase2 = this.f622b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.close();
                }
                this.f622b = this.f621a.getWritableDatabase();
            }
        } catch (Throwable th) {
            j2t.e(th, "dbs", "gwd");
        }
        return this.f622b;
    }

    public final <T> List<T> o(String str, Class<T> cls) {
        return s(str, cls);
    }

    public final <T> void q(T t) {
        synchronized (this.c) {
            SQLiteDatabase sQLiteDatabaseN = n();
            this.f622b = sQLiteDatabaseN;
            if (sQLiteDatabaseN == null) {
                return;
            }
            try {
                f(sQLiteDatabaseN, t);
                SQLiteDatabase sQLiteDatabase = this.f622b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    this.f622b = null;
                }
            } catch (Throwable th) {
                try {
                    j2t.e(th, "dbs", "itd");
                    SQLiteDatabase sQLiteDatabase2 = this.f622b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                } catch (Throwable th2) {
                    SQLiteDatabase sQLiteDatabase3 = this.f622b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.f622b = null;
                    }
                    throw th2;
                }
            }
        }
    }

    public final <T> void r(String str, Object obj) {
        k(str, obj);
    }

    public final <T> List<T> s(String str, Class<T> cls) {
        Cursor cursorQuery;
        String str2;
        String str3;
        synchronized (this.c) {
            try {
                ArrayList arrayList = new ArrayList();
                c4t c4tVarP = p(cls);
                String strD = d(c4tVarP);
                if (this.f622b == null) {
                    this.f622b = b();
                }
                if (this.f622b == null || TextUtils.isEmpty(strD) || str == null) {
                    return arrayList;
                }
                try {
                    cursorQuery = this.f622b.query(strD, null, str, null, null, null, null);
                    try {
                        if (cursorQuery == null) {
                            this.f622b.close();
                            this.f622b = null;
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th) {
                                    j2t.e(th, "dbs", "sld");
                                }
                            }
                            try {
                                SQLiteDatabase sQLiteDatabase = this.f622b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                    this.f622b = null;
                                }
                            } catch (Throwable th2) {
                                j2t.e(th2, "dbs", "sld");
                            }
                            return arrayList;
                        }
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(c(cursorQuery, cls, c4tVarP));
                        }
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            j2t.e(th3, "dbs", "sld");
                        }
                        try {
                            SQLiteDatabase sQLiteDatabase2 = this.f622b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.close();
                                this.f622b = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str2 = "dbs";
                            str3 = "sld";
                            j2t.e(th, str2, str3);
                        }
                        return arrayList;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            j2t.e(th, "dbs", "sld");
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th6) {
                                    j2t.e(th6, "dbs", "sld");
                                }
                            }
                            try {
                                SQLiteDatabase sQLiteDatabase3 = this.f622b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.close();
                                    this.f622b = null;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                str2 = "dbs";
                                str3 = "sld";
                                j2t.e(th, str2, str3);
                            }
                        } catch (Throwable th8) {
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th9) {
                                    j2t.e(th9, "dbs", "sld");
                                }
                            }
                            try {
                                SQLiteDatabase sQLiteDatabase4 = this.f622b;
                                if (sQLiteDatabase4 == null) {
                                    throw th8;
                                }
                                sQLiteDatabase4.close();
                                this.f622b = null;
                                throw th8;
                            } catch (Throwable th10) {
                                j2t.e(th10, "dbs", "sld");
                                throw th8;
                            }
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    cursorQuery = null;
                }
                throw th;
            } catch (Throwable th12) {
                throw th12;
            }
        }
    }
}
