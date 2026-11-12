package com.amap.api.mapcore.util;

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

/* JADX INFO: loaded from: classes2.dex */
public final class hr {
    private static Map<Class<? extends hq>, hq> d = new HashMap();
    private hu a;
    private SQLiteDatabase b;
    private hq c;

    public hr(Context context, hq hqVar) {
        try {
            this.a = new hu(context.getApplicationContext(), hqVar.b(), hqVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.c = hqVar;
    }

    public final <T> void a(String str, Class<T> cls) {
        synchronized (this.c) {
            String strA = a(a(cls));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            SQLiteDatabase sQLiteDatabaseB = b();
            this.b = sQLiteDatabaseB;
            if (sQLiteDatabaseB == null) {
                return;
            }
            try {
                sQLiteDatabaseB.delete(strA, str, null);
                SQLiteDatabase sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    this.b = null;
                }
            } catch (Throwable th) {
                try {
                    hk.a(th, "dbs", "dld");
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                } catch (Throwable th2) {
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.b = null;
                    }
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[Catch: all -> 0x00dc, SYNTHETIC, TryCatch #7 {, blocks: (B:4:0x0003, B:6:0x0014, B:7:0x001a, B:9:0x001e, B:28:0x005e, B:27:0x0057, B:21:0x0045, B:62:0x00b6, B:44:0x0089, B:37:0x0073, B:55:0x009f, B:76:0x00d9, B:75:0x00d2, B:69:0x00c0, B:77:0x00da, B:70:0x00c7, B:72:0x00cb, B:34:0x006e, B:18:0x0040, B:22:0x004c, B:24:0x0050, B:50:0x0091, B:52:0x009a, B:66:0x00bb), top: B:96:0x0003, inners: #1, #2, #4, #5, #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0050 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #5 {all -> 0x0056, blocks: (B:22:0x004c, B:24:0x0050), top: B:92:0x004c, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #1 {all -> 0x00d1, blocks: (B:70:0x00c7, B:72:0x00cb), top: B:84:0x00c7, outer: #7 }] */
    public final <T> List<T> b(String str, Class<T> cls) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase;
        String str2;
        String str3;
        SQLiteDatabase sQLiteDatabase2;
        synchronized (this.c) {
            ArrayList arrayList = new ArrayList();
            hs hsVarA = a(cls);
            String strA = a(hsVarA);
            if (this.b == null) {
                this.b = a();
            }
            if (this.b == null || TextUtils.isEmpty(strA) || str == null) {
                return arrayList;
            }
            try {
                cursorQuery = this.b.query(strA, null, str, null, null, null, null);
                try {
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(a(cursorQuery, cls, hsVarA));
                        }
                        try {
                            cursorQuery.close();
                        } catch (Throwable th) {
                            hk.a(th, "dbs", "sld");
                        }
                        try {
                            SQLiteDatabase sQLiteDatabase3 = this.b;
                            if (sQLiteDatabase3 != null) {
                                sQLiteDatabase3.close();
                                this.b = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = "dbs";
                            str3 = "sld";
                            hk.a(th, str2, str3);
                        }
                        return arrayList;
                    }
                    this.b.close();
                    this.b = null;
                    if (cursorQuery == null) {
                        sQLiteDatabase2 = this.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                            this.b = null;
                        }
                        return arrayList;
                    }
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        hk.a(th3, "dbs", "sld");
                    }
                    try {
                        sQLiteDatabase2 = this.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                            this.b = null;
                        }
                    } catch (Throwable th4) {
                        hk.a(th4, "dbs", "sld");
                    }
                    return arrayList;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        hk.a(th, "dbs", "sld");
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th6) {
                                hk.a(th6, "dbs", "sld");
                            }
                        }
                        try {
                            SQLiteDatabase sQLiteDatabase4 = this.b;
                            if (sQLiteDatabase4 != null) {
                                sQLiteDatabase4.close();
                                this.b = null;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            str2 = "dbs";
                            str3 = "sld";
                            hk.a(th, str2, str3);
                        }
                    } catch (Throwable th8) {
                        if (cursorQuery == null) {
                            sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                throw th8;
                            }
                            sQLiteDatabase.close();
                            this.b = null;
                            throw th8;
                        }
                        try {
                            cursorQuery.close();
                        } catch (Throwable th9) {
                            hk.a(th9, "dbs", "sld");
                        }
                        try {
                            sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                throw th8;
                            }
                            sQLiteDatabase.close();
                            this.b = null;
                            throw th8;
                        } catch (Throwable th10) {
                            hk.a(th10, "dbs", "sld");
                            throw th8;
                        }
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                cursorQuery = null;
            }
            throw th;
        }
    }

    public final void a(Object obj, String str) {
        synchronized (this.c) {
            if (b(str, obj.getClass()).size() == 0) {
                synchronized (this.c) {
                    SQLiteDatabase sQLiteDatabaseB = b();
                    this.b = sQLiteDatabaseB;
                    if (sQLiteDatabaseB != null) {
                        try {
                            a(sQLiteDatabaseB, obj);
                            SQLiteDatabase sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                                this.b = null;
                            }
                        } catch (Throwable th) {
                            try {
                                hk.a(th, "dbs", "itd");
                                SQLiteDatabase sQLiteDatabase2 = this.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.close();
                                }
                            } catch (Throwable th2) {
                                SQLiteDatabase sQLiteDatabase3 = this.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.close();
                                    this.b = null;
                                }
                                throw th2;
                            }
                        }
                    }
                }
            } else {
                synchronized (this.c) {
                    hs hsVarA = a(obj.getClass());
                    String strA = a(hsVarA);
                    if (!TextUtils.isEmpty(strA)) {
                        ContentValues contentValuesA = a(obj, hsVarA);
                        SQLiteDatabase sQLiteDatabaseB2 = b();
                        this.b = sQLiteDatabaseB2;
                        if (sQLiteDatabaseB2 != null) {
                            try {
                                sQLiteDatabaseB2.update(strA, contentValuesA, str, null);
                                SQLiteDatabase sQLiteDatabase4 = this.b;
                                if (sQLiteDatabase4 != null) {
                                    sQLiteDatabase4.close();
                                    this.b = null;
                                }
                            } catch (Throwable th3) {
                                try {
                                    hk.a(th3, "dbs", "udd");
                                    SQLiteDatabase sQLiteDatabase5 = this.b;
                                    if (sQLiteDatabase5 != null) {
                                        sQLiteDatabase5.close();
                                    }
                                } catch (Throwable th4) {
                                    SQLiteDatabase sQLiteDatabase6 = this.b;
                                    if (sQLiteDatabase6 != null) {
                                        sQLiteDatabase6.close();
                                        this.b = null;
                                    }
                                    throw th4;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private SQLiteDatabase b() {
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null || sQLiteDatabase.isReadOnly()) {
                SQLiteDatabase sQLiteDatabase2 = this.b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.close();
                }
                this.b = this.a.getWritableDatabase();
            }
        } catch (Throwable th) {
            hk.a(th, "dbs", "gwd");
        }
        return this.b;
    }

    private static <T> void a(SQLiteDatabase sQLiteDatabase, T t) {
        hs hsVarA = a(t.getClass());
        String strA = a(hsVarA);
        if (TextUtils.isEmpty(strA) || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.insert(strA, null, a(t, hsVarA));
    }

    public final <T> void a(List<T> list) {
        String str;
        String str2;
        synchronized (this.c) {
            if (list.size() == 0) {
                return;
            }
            SQLiteDatabase sQLiteDatabaseB = b();
            this.b = sQLiteDatabaseB;
            if (sQLiteDatabaseB == null) {
                return;
            }
            try {
                sQLiteDatabaseB.beginTransaction();
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    a(this.b, it2.next());
                }
                this.b.setTransactionSuccessful();
                try {
                    if (this.b.inTransaction()) {
                        this.b.endTransaction();
                    }
                } catch (Throwable th) {
                    hk.a(th, "dbs", "ild");
                }
                try {
                    this.b.close();
                    this.b = null;
                } catch (Throwable th2) {
                    th = th2;
                    str = "dbs";
                    str2 = "ild";
                    hk.a(th, str, str2);
                }
            } catch (Throwable th3) {
                try {
                    hk.a(th3, "dbs", "ild");
                    try {
                        if (this.b.inTransaction()) {
                            this.b.endTransaction();
                        }
                    } catch (Throwable th4) {
                        hk.a(th4, "dbs", "ild");
                    }
                    try {
                        this.b.close();
                        this.b = null;
                    } catch (Throwable th5) {
                        th = th5;
                        str = "dbs";
                        str2 = "ild";
                        hk.a(th, str, str2);
                    }
                } catch (Throwable th6) {
                    try {
                        if (this.b.inTransaction()) {
                            this.b.endTransaction();
                            try {
                                this.b.close();
                                this.b = null;
                                throw th6;
                            } catch (Throwable th7) {
                                hk.a(th7, "dbs", "ild");
                                throw th6;
                            }
                        }
                        this.b.close();
                        this.b = null;
                        throw th6;
                    } catch (Throwable th8) {
                        hk.a(th8, "dbs", "ild");
                    }
                }
            }
        }
    }

    private static <T> T a(Cursor cursor, Class<T> cls, hs hsVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Field[] fieldArrA = a((Class<?>) cls, hsVar.b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T tNewInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : fieldArrA) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(ht.class);
            if (annotation != null) {
                ht htVar = (ht) annotation;
                int iB = htVar.b();
                int columnIndex = cursor.getColumnIndex(htVar.a());
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
        Annotation annotation = field.getAnnotation(ht.class);
        if (annotation == null) {
        }
        ht htVar = (ht) annotation;
        try {
            switch (htVar.b()) {
                case 1:
                    contentValues.put(htVar.a(), Short.valueOf(field.getShort(obj)));
                    break;
                case 2:
                    contentValues.put(htVar.a(), Integer.valueOf(field.getInt(obj)));
                    break;
                case 3:
                    contentValues.put(htVar.a(), Float.valueOf(field.getFloat(obj)));
                    break;
                case 4:
                    contentValues.put(htVar.a(), Double.valueOf(field.getDouble(obj)));
                    break;
                case 5:
                    contentValues.put(htVar.a(), Long.valueOf(field.getLong(obj)));
                    break;
                case 6:
                    contentValues.put(htVar.a(), (String) field.get(obj));
                    break;
                case 7:
                    contentValues.put(htVar.a(), (byte[]) field.get(obj));
                    break;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static ContentValues a(Object obj, hs hsVar) {
        ContentValues contentValues = new ContentValues();
        for (Field field : a(obj.getClass(), hsVar.b())) {
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
            if (this.b == null) {
                this.b = this.a.getReadableDatabase();
            }
        } catch (Throwable th) {
            hk.a(th, "dbs", "grd");
        }
        return this.b;
    }

    private static <T> String a(hs hsVar) {
        if (hsVar == null) {
            return null;
        }
        return hsVar.a();
    }

    private static <T> hs a(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(hs.class);
        if (annotation != null) {
            return (hs) annotation;
        }
        return null;
    }
}
