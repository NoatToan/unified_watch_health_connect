package com.huawei.openalliance.ad.db.bean;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.openalliance.ad.annotations.b;
import com.huawei.openalliance.ad.annotations.c;
import com.huawei.openalliance.ad.annotations.e;
import com.huawei.openalliance.ad.annotations.f;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.cr;
import com.huawei.openalliance.ad.utils.cw;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    private static final boolean DEBUG = false;
    public static final String ID = "_id";
    public static final String TAG = "RecordBean";
    private static Map<Class, String> dbTypeMap;

    @f
    @e
    private byte[] key;

    public ContentValues d(Context context) {
        String strB;
        Field[] fieldArrA = cr.a((Class) getClass());
        ContentValues contentValues = new ContentValues();
        int length = fieldArrA.length;
        for (int i = 0; i < length; i++) {
            try {
                Field fieldA = cr.a(fieldArrA[i], true);
                fieldArrA[i] = fieldA;
                if (!a(fieldA)) {
                    Object obj = fieldArrA[i].get(this);
                    String strD = d(fieldArrA[i]);
                    if (obj instanceof String) {
                        strB = (String) obj;
                    } else if (obj instanceof Integer) {
                        contentValues.put(strD, (Integer) obj);
                    } else if (obj instanceof Long) {
                        contentValues.put(strD, (Long) obj);
                    } else if (obj instanceof Float) {
                        contentValues.put(strD, (Float) obj);
                    } else if (obj instanceof EncryptionField) {
                        EncryptionField encryptionField = (EncryptionField) obj;
                        if (this.key == null) {
                            this.key = cw.b(context);
                        }
                        strB = encryptionField.b(this.key);
                    } else {
                        strB = bk.b(obj);
                    }
                    contentValues.put(strD, strB);
                }
            } catch (IllegalAccessException unused) {
                hw.c(TAG, "toRecord IllegalAccessException");
            }
        }
        return contentValues;
    }

    public String bz() {
        return getClass().getSimpleName();
    }

    public String by() {
        return aj(bz());
    }

    public List<String> bx() {
        Field[] fieldArrA = cr.a((Class) getClass());
        ArrayList arrayList = new ArrayList();
        int length = fieldArrA.length;
        for (int i = 0; i < length; i++) {
            Field fieldA = cr.a(fieldArrA[i], true);
            fieldArrA[i] = fieldA;
            if (!a(fieldA)) {
                arrayList.add(d(fieldArrA[i]));
            }
        }
        return arrayList;
    }

    public byte[] bw() {
        return this.key;
    }

    public String aj(String str) {
        Field[] fieldArrA = cr.a((Class) getClass());
        StringBuilder sb = new StringBuilder("create table ");
        sb.append(str);
        sb.append(" ( _id INTEGER primary key autoincrement ");
        int length = fieldArrA.length;
        for (int i = 0; i < length; i++) {
            Field fieldA = cr.a(fieldArrA[i], true);
            fieldArrA[i] = fieldA;
            if (!a(fieldA)) {
                String str2 = dbTypeMap.get(fieldArrA[i].getType());
                if (str2 == null) {
                    str2 = "TEXT";
                }
                String strD = d(fieldArrA[i]);
                sb.append(" , ");
                sb.append(strD);
                sb.append(' ');
                sb.append(str2);
                if (a_() != null && a_().equals(strD)) {
                    sb.append(" unique");
                }
            }
        }
        sb.append(" ) ");
        return sb.toString();
    }

    public String a_() {
        return "";
    }

    public void a(byte[] bArr) {
        if (bArr == null) {
            this.key = null;
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.key = bArr2;
    }

    public void a(Cursor cursor) {
        String str;
        Field field;
        Object objValueOf;
        Field[] fieldArrA = cr.a((Class) getClass());
        int length = fieldArrA.length;
        for (int i = 0; i < length; i++) {
            try {
                Field fieldA = cr.a(fieldArrA[i], true);
                fieldArrA[i] = fieldA;
                String name = fieldA.getName();
                if (!Modifier.isStatic(fieldArrA[i].getModifiers()) && "_id".equals(name)) {
                    int columnIndex = cursor.getColumnIndex(name);
                    if (columnIndex != -1) {
                        fieldArrA[i].set(this, cursor.getString(columnIndex));
                    }
                } else if (b(fieldArrA[i])) {
                    Class<?> type = fieldArrA[i].getType();
                    int columnIndex2 = cursor.getColumnIndex(d(fieldArrA[i]));
                    if (columnIndex2 != -1) {
                        if (String.class == type) {
                            field = fieldArrA[i];
                            objValueOf = cursor.getString(columnIndex2);
                        } else if (Integer.TYPE == type) {
                            field = fieldArrA[i];
                            objValueOf = Integer.valueOf(cursor.getInt(columnIndex2));
                        } else if (Long.TYPE == type) {
                            field = fieldArrA[i];
                            objValueOf = Long.valueOf(cursor.getLong(columnIndex2));
                        } else if (Float.TYPE == type) {
                            field = fieldArrA[i];
                            objValueOf = Float.valueOf(cursor.getFloat(columnIndex2));
                        } else if (EncryptionField.class == type) {
                            a(cursor.getString(columnIndex2), fieldArrA[i]);
                        } else {
                            a(cursor.getString(columnIndex2), fieldArrA[i], type);
                        }
                        field.set(this, objValueOf);
                    }
                }
            } catch (IllegalAccessException unused) {
                str = "toBean IllegalAccessException";
                hw.c(TAG, str);
            } catch (Exception e) {
                str = "toBean " + e.getClass().getSimpleName();
                hw.c(TAG, str);
            }
        }
    }

    private String d(Field field) {
        b bVar = (b) field.getAnnotation(b.class);
        return (bVar == null || TextUtils.isEmpty(bVar.a())) ? a(field.getName()) : bVar.a();
    }

    private boolean c(Field field) {
        if (field == null) {
            return false;
        }
        String name = field.getName();
        return (Modifier.isStatic(field.getModifiers()) || name == null || name.contains(SampleEvent.SEPARATOR) || !field.isAnnotationPresent(c.class)) ? false : true;
    }

    private boolean b(Field field) {
        if (field == null) {
            return false;
        }
        String name = field.getName();
        return (Modifier.isStatic(field.getModifiers()) || name == null || name.contains(SampleEvent.SEPARATOR) || field.isAnnotationPresent(e.class)) ? false : true;
    }

    private boolean a(Field field) {
        return !b(field) || c(field);
    }

    private void a(String str, Field field, Class cls) {
        try {
            field.set(this, bk.a(str, cls, cr.a(field)));
        } catch (JSONException unused) {
        } catch (Exception unused2) {
            hw.c(TAG, "toBean - other field injection Exception");
        }
    }

    private void a(String str, Field field) throws IllegalAccessException {
        Class<?> clsA;
        Type genericType = field.getGenericType();
        Class<?> cls = null;
        if (genericType instanceof ParameterizedType) {
            Type typeA = cr.a(0, (ParameterizedType) genericType);
            Class<?> clsA2 = cr.a(typeA);
            clsA = typeA instanceof ParameterizedType ? cr.a(cr.a(0, (ParameterizedType) typeA)) : null;
            cls = clsA2;
        } else {
            clsA = null;
        }
        if (cls != null) {
            EncryptionField encryptionField = new EncryptionField(cls, clsA);
            encryptionField.a(str);
            field.set(this, encryptionField);
        } else {
            hw.c(TAG, "Cannot find member class from " + field);
        }
    }

    private String a(String str) {
        return str.endsWith("_") ? str.substring(0, str.length() - 1) : str;
    }

    static {
        HashMap map = new HashMap(4);
        dbTypeMap = map;
        map.put(String.class, "TEXT");
        dbTypeMap.put(Long.TYPE, "INTEGER");
        dbTypeMap.put(Integer.TYPE, "INTEGER");
        dbTypeMap.put(Float.TYPE, "REAL");
        dbTypeMap.put(EncryptionField.class, "TEXT");
    }
}
