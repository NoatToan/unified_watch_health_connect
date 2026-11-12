package com.amap.api.col.p0003sl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.MapKeyNames;
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
public final class ke {
    private static Map<Class<? extends kd>, kd> d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kh f2951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SQLiteDatabase f2952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kd f2953c;

    public static kd a(Class<? extends kd> cls) throws IllegalAccessException, InstantiationException {
        kd kdVar;
        synchronized (ke.class) {
            if (d.get(cls) == null) {
                d.put(cls, cls.newInstance());
            }
            kdVar = d.get(cls);
        }
        return kdVar;
    }

    public ke(Context context, kd kdVar) {
        try {
            this.f2951a = new kh(context.getApplicationContext(), kdVar.b(), kdVar.c(), kdVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f2953c = kdVar;
    }

    public final <T> void a(String str, Class<T> cls) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f2953c) {
            String strA = a(b((Class) cls));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            SQLiteDatabase sQLiteDatabaseB = b();
            this.f2952b = sQLiteDatabaseB;
            if (sQLiteDatabaseB == null) {
                return;
            }
            try {
                sQLiteDatabaseB.delete(strA, str, null);
                sQLiteDatabase = this.f2952b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    this.f2952b = null;
                }
            } catch (Throwable th) {
                try {
                    js.a(th, "dbs", "dld");
                    sQLiteDatabase = this.f2952b;
                    if (sQLiteDatabase != null) {
                    }
                } catch (Throwable th2) {
                    SQLiteDatabase sQLiteDatabase2 = this.f2952b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                        this.f2952b = null;
                    }
                    throw th2;
                }
            }
        }
    }

    private <T> void a(String str, Object obj) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f2953c) {
            if (obj == null) {
                return;
            }
            kf kfVarB = b((Class) obj.getClass());
            String strA = a(kfVarB);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            ContentValues contentValuesA = a(obj, kfVarB);
            SQLiteDatabase sQLiteDatabaseB = b();
            this.f2952b = sQLiteDatabaseB;
            if (sQLiteDatabaseB == null) {
                return;
            }
            try {
                sQLiteDatabaseB.update(strA, contentValuesA, str, null);
                sQLiteDatabase = this.f2952b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    this.f2952b = null;
                }
            } catch (Throwable th) {
                try {
                    js.a(th, "dbs", "udd");
                    sQLiteDatabase = this.f2952b;
                    if (sQLiteDatabase != null) {
                    }
                } catch (Throwable th2) {
                    SQLiteDatabase sQLiteDatabase2 = this.f2952b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                        this.f2952b = null;
                    }
                    throw th2;
                }
            }
        }
    }

    private <T> void b(String str, Object obj) {
        a(str, obj);
    }

    public final void a(Object obj, String str) {
        synchronized (this.f2953c) {
            List listB = b(str, (Class) obj.getClass());
            if (listB == null || listB.size() == 0) {
                a(obj);
            } else {
                b(str, obj);
            }
        }
    }

    private <T> void a(T t) {
        b(t);
    }

    private <T> void b(T t) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f2953c) {
            SQLiteDatabase sQLiteDatabaseB = b();
            this.f2952b = sQLiteDatabaseB;
            if (sQLiteDatabaseB == null) {
                return;
            }
            try {
                a(sQLiteDatabaseB, t);
                sQLiteDatabase = this.f2952b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    this.f2952b = null;
                }
            } catch (Throwable th) {
                try {
                    js.a(th, "dbs", "itd");
                    sQLiteDatabase = this.f2952b;
                    if (sQLiteDatabase != null) {
                    }
                } catch (Throwable th2) {
                    SQLiteDatabase sQLiteDatabase2 = this.f2952b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                        this.f2952b = null;
                    }
                    throw th2;
                }
            }
        }
    }

    private static <T> void a(SQLiteDatabase sQLiteDatabase, T t) {
        kf kfVarB = b((Class) t.getClass());
        String strA = a(kfVarB);
        if (TextUtils.isEmpty(strA) || t == null || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.insert(strA, null, a(t, kfVarB));
    }

    public final <T> void a(List<T> list) {
        synchronized (this.f2953c) {
            if (list.size() == 0) {
                return;
            }
            SQLiteDatabase sQLiteDatabaseB = b();
            this.f2952b = sQLiteDatabaseB;
            if (sQLiteDatabaseB == null) {
                return;
            }
            try {
                try {
                    sQLiteDatabaseB.beginTransaction();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        a(this.f2952b, it.next());
                    }
                    this.f2952b.setTransactionSuccessful();
                    try {
                        if (this.f2952b.inTransaction()) {
                            this.f2952b.endTransaction();
                        }
                    } catch (Throwable th) {
                        js.a(th, "dbs", "ild");
                    }
                    this.f2952b.close();
                } catch (Throwable th2) {
                    js.a(th2, "dbs", "ild");
                }
            } catch (Throwable th3) {
                try {
                    js.a(th3, "dbs", "ild");
                    try {
                        if (this.f2952b.inTransaction()) {
                            this.f2952b.endTransaction();
                        }
                    } catch (Throwable th4) {
                        js.a(th4, "dbs", "ild");
                    }
                    this.f2952b.close();
                } catch (Throwable th5) {
                    try {
                        if (this.f2952b.inTransaction()) {
                            this.f2952b.endTransaction();
                            try {
                                this.f2952b.close();
                                this.f2952b = null;
                                throw th5;
                            } catch (Throwable th6) {
                                js.a(th6, "dbs", "ild");
                                throw th5;
                            }
                        }
                        this.f2952b.close();
                        this.f2952b = null;
                        throw th5;
                    } catch (Throwable th7) {
                        js.a(th7, "dbs", "ild");
                    }
                }
            }
            this.f2952b = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[Catch: all -> 0x00df, SYNTHETIC, TryCatch #10 {, blocks: (B:4:0x0003, B:6:0x0014, B:7:0x001a, B:9:0x001e, B:28:0x0060, B:27:0x0058, B:21:0x0045, B:61:0x00b7, B:60:0x00af, B:38:0x0077, B:55:0x009f, B:75:0x00dc, B:74:0x00d4, B:68:0x00c1, B:76:0x00dd, B:65:0x00bc, B:69:0x00c9, B:71:0x00cd, B:18:0x0040, B:35:0x0072, B:22:0x004d, B:24:0x0051, B:50:0x0090, B:39:0x007f, B:41:0x0083, B:42:0x0086, B:56:0x00a7, B:58:0x00ab, B:52:0x009a), top: B:99:0x0003, inners: #0, #1, #2, #3, #4, #5, #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #1 {all -> 0x00d3, blocks: (B:69:0x00c9, B:71:0x00cd), top: B:83:0x00c9, outer: #10 }] */
    private <T> List<T> c(String str, Class<T> cls) {
        Throwable th;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f2953c) {
            ArrayList arrayList = new ArrayList();
            kf kfVarB = b((Class) cls);
            String strA = a(kfVarB);
            if (this.f2952b == null) {
                this.f2952b = a();
            }
            if (this.f2952b == null || TextUtils.isEmpty(strA) || str == null) {
                return arrayList;
            }
            try {
                try {
                    cursorQuery = this.f2952b.query(strA, null, str, null, null, null, null);
                    try {
                        if (cursorQuery != null) {
                            while (cursorQuery.moveToNext()) {
                                arrayList.add(a(cursorQuery, cls, kfVarB));
                            }
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th2) {
                                    js.a(th2, "dbs", MapKeyNames.SLD);
                                }
                            }
                            SQLiteDatabase sQLiteDatabase2 = this.f2952b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.close();
                                this.f2952b = null;
                            }
                            return arrayList;
                        }
                        this.f2952b.close();
                        this.f2952b = null;
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th3) {
                                js.a(th3, "dbs", MapKeyNames.SLD);
                            }
                        }
                        try {
                            SQLiteDatabase sQLiteDatabase3 = this.f2952b;
                            if (sQLiteDatabase3 != null) {
                                sQLiteDatabase3.close();
                                this.f2952b = null;
                            }
                        } catch (Throwable th4) {
                            js.a(th4, "dbs", MapKeyNames.SLD);
                        }
                        return arrayList;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            js.a(th, "dbs", MapKeyNames.SLD);
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th6) {
                                    js.a(th6, "dbs", MapKeyNames.SLD);
                                }
                            }
                            SQLiteDatabase sQLiteDatabase4 = this.f2952b;
                            if (sQLiteDatabase4 != null) {
                                sQLiteDatabase4.close();
                            }
                            return arrayList;
                        } catch (Throwable th7) {
                            if (cursorQuery == null) {
                                sQLiteDatabase = this.f2952b;
                                if (sQLiteDatabase != null) {
                                    throw th7;
                                }
                                sQLiteDatabase.close();
                                this.f2952b = null;
                                throw th7;
                            }
                            try {
                                cursorQuery.close();
                            } catch (Throwable th8) {
                                js.a(th8, "dbs", MapKeyNames.SLD);
                            }
                            try {
                                sQLiteDatabase = this.f2952b;
                                if (sQLiteDatabase != null) {
                                    throw th7;
                                }
                                sQLiteDatabase.close();
                                this.f2952b = null;
                                throw th7;
                            } catch (Throwable th9) {
                                js.a(th9, "dbs", MapKeyNames.SLD);
                                throw th7;
                            }
                        }
                    }
                } catch (Throwable th10) {
                    js.a(th10, "dbs", MapKeyNames.SLD);
                }
            } catch (Throwable th11) {
                th = th11;
                cursorQuery = null;
            }
            throw th;
        }
    }

    public final <T> List<T> b(String str, Class<T> cls) {
        return c(str, cls);
    }

    private static <T> T a(Cursor cursor, Class<T> cls, kf kfVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Field[] fieldArrA = a((Class<?>) cls, kfVar.b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T tNewInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : fieldArrA) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(kg.class);
            if (annotation != null) {
                kg kgVar = (kg) annotation;
                int iB = kgVar.b();
                int columnIndex = cursor.getColumnIndex(kgVar.a());
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

    private static void a(Object obj, Field field, ContentValues contentValues) {
        Annotation annotation = field.getAnnotation(kg.class);
        if (annotation == null) {
            return;
        }
        kg kgVar = (kg) annotation;
        try {
            switch (kgVar.b()) {
                case 1:
                    contentValues.put(kgVar.a(), Short.valueOf(field.getShort(obj)));
                    break;
                case 2:
                    contentValues.put(kgVar.a(), Integer.valueOf(field.getInt(obj)));
                    break;
                case 3:
                    contentValues.put(kgVar.a(), Float.valueOf(field.getFloat(obj)));
                    break;
                case 4:
                    contentValues.put(kgVar.a(), Double.valueOf(field.getDouble(obj)));
                    break;
                case 5:
                    contentValues.put(kgVar.a(), Long.valueOf(field.getLong(obj)));
                    break;
                case 6:
                    contentValues.put(kgVar.a(), (String) field.get(obj));
                    break;
                case 7:
                    contentValues.put(kgVar.a(), (byte[]) field.get(obj));
                    break;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static ContentValues a(Object obj, kf kfVar) {
        ContentValues contentValues = new ContentValues();
        for (Field field : a(obj.getClass(), kfVar.b())) {
            field.setAccessible(true);
            a(obj, field, contentValues);
        }
        return contentValues;
    }

    private static Field[] a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        if (z) {
            return cls.getSuperclass().getDeclaredFields();
        }
        return cls.getDeclaredFields();
    }

    private SQLiteDatabase a() {
        try {
            if (this.f2952b == null) {
                this.f2952b = this.f2951a.getReadableDatabase();
            }
        } catch (Throwable th) {
            js.a(th, "dbs", "grd");
        }
        return this.f2952b;
    }

    private SQLiteDatabase b() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f2952b;
            if (sQLiteDatabase == null || sQLiteDatabase.isReadOnly()) {
                SQLiteDatabase sQLiteDatabase2 = this.f2952b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.close();
                }
                this.f2952b = this.f2951a.getWritableDatabase();
            }
        } catch (Throwable th) {
            js.a(th, "dbs", "gwd");
        }
        return this.f2952b;
    }

    private static <T> String a(kf kfVar) {
        if (kfVar == null) {
            return null;
        }
        return kfVar.a();
    }

    private static <T> kf b(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(kf.class);
        if (annotation != null) {
            return (kf) annotation;
        }
        return null;
    }
}
