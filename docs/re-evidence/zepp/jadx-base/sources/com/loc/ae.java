package com.loc;

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
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class ae {
    private static Map<Class<? extends ad>, ad> d = new HashMap();
    private ah a;
    private SQLiteDatabase b;
    private ad c;

    public ae(Context context, ad adVar) {
        try {
            this.a = new ah(context.getApplicationContext(), adVar.a(), adVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.c = adVar;
    }

    private static ContentValues a(Object obj, af afVar) {
        ContentValues contentValues = new ContentValues();
        for (Field field : a(obj.getClass(), afVar.b())) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(ag.class);
            if (annotation != null) {
                ag agVar = (ag) annotation;
                switch (agVar.b()) {
                    case 1:
                        contentValues.put(agVar.a(), Short.valueOf(field.getShort(obj)));
                        break;
                    case 2:
                        contentValues.put(agVar.a(), Integer.valueOf(field.getInt(obj)));
                        break;
                    case 3:
                        contentValues.put(agVar.a(), Float.valueOf(field.getFloat(obj)));
                        break;
                    case 4:
                        contentValues.put(agVar.a(), Double.valueOf(field.getDouble(obj)));
                        break;
                    case 5:
                        contentValues.put(agVar.a(), Long.valueOf(field.getLong(obj)));
                        break;
                    case 6:
                        contentValues.put(agVar.a(), (String) field.get(obj));
                        break;
                    case 7:
                        try {
                            contentValues.put(agVar.a(), (byte[]) field.get(obj));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }
        }
        return contentValues;
    }

    private SQLiteDatabase a() {
        try {
            if (this.b == null) {
                this.b = this.a.getReadableDatabase();
            }
        } catch (Throwable th) {
            y.a(th, "dbs", "grd");
        }
        return this.b;
    }

    public static synchronized ad a(Class<? extends ad> cls) throws IllegalAccessException, InstantiationException {
        if (d.get(cls) == null) {
            d.put(cls, cls.newInstance());
        }
        return d.get(cls);
    }

    private static <T> T a(Cursor cursor, Class<T> cls, af afVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objValueOf;
        Field[] fieldArrA = a((Class<?>) cls, afVar.b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T tNewInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : fieldArrA) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(ag.class);
            if (annotation != null) {
                ag agVar = (ag) annotation;
                int iB = agVar.b();
                int columnIndex = cursor.getColumnIndex(agVar.a());
                switch (iB) {
                    case 1:
                        objValueOf = Short.valueOf(cursor.getShort(columnIndex));
                        break;
                    case 2:
                        objValueOf = Integer.valueOf(cursor.getInt(columnIndex));
                        break;
                    case 3:
                        objValueOf = Float.valueOf(cursor.getFloat(columnIndex));
                        break;
                    case 4:
                        objValueOf = Double.valueOf(cursor.getDouble(columnIndex));
                        break;
                    case 5:
                        objValueOf = Long.valueOf(cursor.getLong(columnIndex));
                        break;
                    case 6:
                        objValueOf = cursor.getString(columnIndex);
                        break;
                    case 7:
                        field.set(tNewInstance, cursor.getBlob(columnIndex));
                        continue;
                    default:
                        continue;
                }
                field.set(tNewInstance, objValueOf);
            }
        }
        return tNewInstance;
    }

    private static <T> String a(af afVar) {
        if (afVar == null) {
            return null;
        }
        return afVar.a();
    }

    private static Field[] a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        return z ? cls.getSuperclass().getDeclaredFields() : cls.getDeclaredFields();
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
            y.a(th, "dbs", "gwd");
        }
        return this.b;
    }

    private static <T> af b(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(af.class);
        if (annotation != null) {
            return (af) annotation;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[Catch: all -> 0x00dc, SYNTHETIC, TryCatch #7 {, blocks: (B:4:0x0003, B:6:0x0014, B:7:0x001a, B:9:0x001e, B:28:0x005e, B:27:0x0057, B:21:0x0045, B:62:0x00b6, B:44:0x0089, B:37:0x0073, B:55:0x009f, B:76:0x00d9, B:75:0x00d2, B:69:0x00c0, B:77:0x00da, B:70:0x00c7, B:72:0x00cb, B:34:0x006e, B:18:0x0040, B:22:0x004c, B:24:0x0050, B:50:0x0091, B:52:0x009a, B:66:0x00bb), top: B:96:0x0003, inners: #1, #2, #4, #5, #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0050 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #5 {all -> 0x0056, blocks: (B:22:0x004c, B:24:0x0050), top: B:92:0x004c, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #1 {all -> 0x00d1, blocks: (B:70:0x00c7, B:72:0x00cb), top: B:84:0x00c7, outer: #7 }] */
    public final <T> List<T> a(String str, Class<T> cls) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase;
        String str2;
        String str3;
        SQLiteDatabase sQLiteDatabase2;
        synchronized (this.c) {
            ArrayList arrayList = new ArrayList();
            af afVarB = b(cls);
            String strA = a(afVarB);
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
                            arrayList.add(a(cursorQuery, cls, afVarB));
                        }
                        try {
                            cursorQuery.close();
                        } catch (Throwable th) {
                            y.a(th, "dbs", "sld");
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
                            y.a(th, str2, str3);
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
                        y.a(th3, "dbs", "sld");
                    }
                    try {
                        sQLiteDatabase2 = this.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                            this.b = null;
                        }
                    } catch (Throwable th4) {
                        y.a(th4, "dbs", "sld");
                    }
                    return arrayList;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        y.a(th, "dbs", "sld");
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th6) {
                                y.a(th6, "dbs", "sld");
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
                            y.a(th, str2, str3);
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
                            y.a(th9, "dbs", "sld");
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
                            y.a(th10, "dbs", "sld");
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
            if (a(str, obj.getClass()).size() == 0) {
                synchronized (this.c) {
                    SQLiteDatabase sQLiteDatabaseB = b();
                    this.b = sQLiteDatabaseB;
                    if (sQLiteDatabaseB != null) {
                        try {
                            af afVarB = b(obj.getClass());
                            String strA = a(afVarB);
                            if (!TextUtils.isEmpty(strA) && sQLiteDatabaseB != null) {
                                sQLiteDatabaseB.insert(strA, null, a(obj, afVarB));
                            }
                            SQLiteDatabase sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                                this.b = null;
                            }
                        } catch (Throwable th) {
                            try {
                                y.a(th, "dbs", "itd");
                                SQLiteDatabase sQLiteDatabase2 = this.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.close();
                                    this.b = null;
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
                    af afVarB2 = b(obj.getClass());
                    String strA2 = a(afVarB2);
                    if (!TextUtils.isEmpty(strA2)) {
                        ContentValues contentValuesA = a(obj, afVarB2);
                        SQLiteDatabase sQLiteDatabaseB2 = b();
                        this.b = sQLiteDatabaseB2;
                        if (sQLiteDatabaseB2 != null) {
                            try {
                                sQLiteDatabaseB2.update(strA2, contentValuesA, str, null);
                                SQLiteDatabase sQLiteDatabase4 = this.b;
                                if (sQLiteDatabase4 != null) {
                                    sQLiteDatabase4.close();
                                    this.b = null;
                                }
                            } catch (Throwable th3) {
                                try {
                                    y.a(th3, "dbs", "udd");
                                    SQLiteDatabase sQLiteDatabase5 = this.b;
                                    if (sQLiteDatabase5 != null) {
                                        sQLiteDatabase5.close();
                                        this.b = null;
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
}
