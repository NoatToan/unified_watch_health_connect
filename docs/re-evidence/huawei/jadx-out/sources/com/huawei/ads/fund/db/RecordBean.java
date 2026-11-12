package com.huawei.ads.fund.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.ads.fund.anno.DbField;
import com.huawei.ads.fund.anno.DbFieldReadOnly;
import com.huawei.ads.fund.anno.NoDbField;
import com.huawei.ads.fund.e;
import com.huawei.ads.fund.util.JsonUtil;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.openalliance.ad.db.bean.a;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RecordBean implements Table, TableRecord, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class, String> f4780a;

    public ContentValues toRecord(Context context) {
        String jsonNoException;
        Field[] fieldArrA = e.a(getClass());
        ContentValues contentValues = new ContentValues();
        int length = fieldArrA.length;
        for (int i = 0; i < length; i++) {
            try {
                Field fieldA = e.a(fieldArrA[i], true);
                fieldArrA[i] = fieldA;
                if (!d(fieldA)) {
                    Object obj = fieldArrA[i].get(this);
                    String strA = a(fieldArrA[i]);
                    if (obj instanceof String) {
                        jsonNoException = (String) obj;
                    } else if (obj instanceof Integer) {
                        contentValues.put(strA, (Integer) obj);
                    } else if (obj instanceof Long) {
                        contentValues.put(strA, (Long) obj);
                    } else if (obj instanceof Float) {
                        contentValues.put(strA, (Float) obj);
                    } else if (obj instanceof Double) {
                        contentValues.put(strA, (Double) obj);
                    } else if (obj instanceof Boolean) {
                        contentValues.put(strA, (Boolean) obj);
                    } else {
                        jsonNoException = JsonUtil.toJsonNoException(obj);
                    }
                    contentValues.put(strA, jsonNoException);
                }
            } catch (IllegalAccessException unused) {
                HiAdLog.w(a.TAG, "toRecord IllegalAccessException");
            }
        }
        return contentValues;
    }

    @Override // com.huawei.ads.fund.db.TableRecord
    public ContentValues toRecord() {
        return toRecord(null);
    }

    @Override // com.huawei.ads.fund.db.TableRecord
    public void toBean(Cursor cursor) {
        Field field;
        Object objValueOf;
        Field field2;
        String string;
        Field[] fieldArrA = e.a(getClass());
        int length = fieldArrA.length;
        for (int i = 0; i < length; i++) {
            try {
                boolean z = true;
                Field fieldA = e.a(fieldArrA[i], true);
                fieldArrA[i] = fieldA;
                String name = fieldA.getName();
                if (!Modifier.isStatic(fieldArrA[i].getModifiers()) && "_id".equals(name)) {
                    int columnIndex = cursor.getColumnIndex(name);
                    if (columnIndex != -1) {
                        field2 = fieldArrA[i];
                        string = cursor.getString(columnIndex);
                        field2.set(this, string);
                    }
                } else if (b(fieldArrA[i])) {
                    Class<?> type = fieldArrA[i].getType();
                    int columnIndex2 = cursor.getColumnIndex(a(fieldArrA[i]));
                    if (columnIndex2 != -1) {
                        if (String.class == type) {
                            field2 = fieldArrA[i];
                            string = cursor.getString(columnIndex2);
                            field2.set(this, string);
                        } else {
                            if (Integer.TYPE == type) {
                                field = fieldArrA[i];
                                objValueOf = Integer.valueOf(cursor.getInt(columnIndex2));
                            } else if (Long.TYPE == type) {
                                field = fieldArrA[i];
                                objValueOf = Long.valueOf(cursor.getLong(columnIndex2));
                            } else if (Float.TYPE == type) {
                                field = fieldArrA[i];
                                objValueOf = Float.valueOf(cursor.getFloat(columnIndex2));
                            } else if (Double.TYPE == type) {
                                field = fieldArrA[i];
                                objValueOf = Double.valueOf(cursor.getDouble(columnIndex2));
                            } else if (Boolean.class == type) {
                                field = fieldArrA[i];
                                if (cursor.getInt(columnIndex2) == 0) {
                                    z = false;
                                }
                                objValueOf = Boolean.valueOf(z);
                            } else {
                                a(cursor.getString(columnIndex2), fieldArrA[i], type);
                            }
                            field.set(this, objValueOf);
                        }
                    }
                }
            } catch (Throwable th) {
                HiAdLog.w(a.TAG, "toBean " + th.getClass().getSimpleName());
            }
        }
    }

    public String getUnique() {
        return "";
    }

    @Override // com.huawei.ads.fund.db.Table
    public String getTableScheme() {
        return b(getTableName());
    }

    @Override // com.huawei.ads.fund.db.Table
    public String getTableName() {
        return getClass().getSimpleName();
    }

    @Override // com.huawei.ads.fund.db.Table
    public String[] getExpireCleanWhereArgs() {
        return new String[]{String.valueOf(System.currentTimeMillis() - getMaxStoreTime())};
    }

    public RecordBean copy() {
        try {
            return (RecordBean) super.clone();
        } catch (CloneNotSupportedException unused) {
            HiAdLog.e(a.TAG, "copy failed");
            return null;
        }
    }

    private boolean d(Field field) {
        return !b(field) || c(field);
    }

    private boolean c(Field field) {
        if (field == null) {
            return false;
        }
        String name = field.getName();
        return (Modifier.isStatic(field.getModifiers()) || name == null || name.contains(SampleEvent.SEPARATOR) || !field.isAnnotationPresent(DbFieldReadOnly.class)) ? false : true;
    }

    private boolean b(Field field) {
        if (field == null) {
            return false;
        }
        String name = field.getName();
        return (Modifier.isStatic(field.getModifiers()) || name == null || name.contains(SampleEvent.SEPARATOR) || field.isAnnotationPresent(NoDbField.class)) ? false : true;
    }

    private String b(String str) {
        Field[] fieldArrA = e.a(getClass());
        StringBuilder sb = new StringBuilder("create table ");
        sb.append(str);
        sb.append(" ( _id INTEGER primary key autoincrement ");
        int length = fieldArrA.length;
        for (int i = 0; i < length; i++) {
            Field fieldA = e.a(fieldArrA[i], true);
            fieldArrA[i] = fieldA;
            if (!d(fieldA)) {
                String str2 = f4780a.get(fieldArrA[i].getType());
                if (str2 == null) {
                    str2 = "TEXT";
                }
                String strA = a(fieldArrA[i]);
                sb.append(" , ");
                sb.append(strA);
                sb.append(' ');
                sb.append(str2);
                if (getUnique() != null && getUnique().equals(strA)) {
                    sb.append(" unique");
                }
            }
        }
        sb.append(" ) ");
        return sb.toString();
    }

    private void a(String str, Field field, Class cls) {
        try {
            field.set(this, JsonUtil.toObject(str, cls, e.a(field)));
        } catch (JSONException unused) {
        } catch (Exception unused2) {
            HiAdLog.w(a.TAG, "toBean - other field injection Exception");
        }
    }

    private String a(Field field) {
        DbField dbField = (DbField) field.getAnnotation(DbField.class);
        return (dbField == null || TextUtils.isEmpty(dbField.value())) ? a(field.getName()) : dbField.value();
    }

    private String a(String str) {
        return str.endsWith("_") ? str.substring(0, str.length() - 1) : str;
    }

    static {
        HashMap map = new HashMap(4);
        f4780a = map;
        map.put(String.class, "TEXT");
        map.put(Long.TYPE, "INTEGER");
        map.put(Integer.TYPE, "INTEGER");
        map.put(Float.TYPE, "REAL");
        map.put(Double.TYPE, "REAL");
        map.put(Boolean.TYPE, "BOOLEAN");
    }
}
