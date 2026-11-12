package com.activeandroid.util;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.activeandroid.Cache;
import com.activeandroid.Model;
import com.activeandroid.TableInfo;
import com.activeandroid.annotation.Column;
import com.activeandroid.serializer.TypeSerializer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteUtils {
    public static final boolean FOREIGN_KEYS_SUPPORTED;
    private static final HashMap<Class<?>, SQLiteType> TYPE_MAP;
    private static HashMap<String, List<String>> sIndexGroupMap;
    private static HashMap<String, Column.ConflictAction> sOnUniqueConflictsMap;
    private static HashMap<String, List<String>> sUniqueGroupMap;

    public enum SQLiteType {
        INTEGER,
        REAL,
        TEXT,
        BLOB
    }

    static {
        FOREIGN_KEYS_SUPPORTED = Build.VERSION.SDK_INT >= 8;
        TYPE_MAP = new HashMap<Class<?>, SQLiteType>() { // from class: com.activeandroid.util.SQLiteUtils.1
            {
                Class cls = Byte.TYPE;
                SQLiteType sQLiteType = SQLiteType.INTEGER;
                put(cls, sQLiteType);
                put(Short.TYPE, sQLiteType);
                put(Integer.TYPE, sQLiteType);
                put(Long.TYPE, sQLiteType);
                Class cls2 = Float.TYPE;
                SQLiteType sQLiteType2 = SQLiteType.REAL;
                put(cls2, sQLiteType2);
                put(Double.TYPE, sQLiteType2);
                put(Boolean.TYPE, sQLiteType);
                Class cls3 = Character.TYPE;
                SQLiteType sQLiteType3 = SQLiteType.TEXT;
                put(cls3, sQLiteType3);
                SQLiteType sQLiteType4 = SQLiteType.BLOB;
                put(byte[].class, sQLiteType4);
                put(Byte.class, sQLiteType);
                put(Short.class, sQLiteType);
                put(Integer.class, sQLiteType);
                put(Long.class, sQLiteType);
                put(Float.class, sQLiteType2);
                put(Double.class, sQLiteType2);
                put(Boolean.class, sQLiteType);
                put(Character.class, sQLiteType3);
                put(String.class, sQLiteType3);
                put(Byte[].class, sQLiteType4);
            }
        };
    }

    public static String createColumnDefinition(TableInfo tableInfo, Field field) {
        StringBuilder sb = new StringBuilder();
        Class<?> type = field.getType();
        String columnName = tableInfo.getColumnName(field);
        TypeSerializer parserForType = Cache.getParserForType(field.getType());
        Column column = (Column) field.getAnnotation(Column.class);
        if (parserForType != null) {
            type = parserForType.getSerializedType();
        }
        HashMap<Class<?>, SQLiteType> map = TYPE_MAP;
        if (map.containsKey(type)) {
            sb.append(columnName);
            sb.append(" ");
            sb.append(map.get(type).toString());
        } else if (ReflectionUtils.isModel(type)) {
            sb.append(columnName);
            sb.append(" ");
            sb.append(SQLiteType.INTEGER.toString());
        } else if (ReflectionUtils.isSubclassOf(type, Enum.class)) {
            sb.append(columnName);
            sb.append(" ");
            sb.append(SQLiteType.TEXT.toString());
        }
        if (TextUtils.isEmpty(sb)) {
            Log.e("No type mapping for: " + type.toString());
        } else {
            if (columnName.equals(tableInfo.getIdName())) {
                sb.append(" PRIMARY KEY AUTOINCREMENT");
            } else if (column != null) {
                if (column.length() > -1) {
                    sb.append("(");
                    sb.append(column.length());
                    sb.append(")");
                }
                if (column.notNull()) {
                    sb.append(" NOT NULL ON CONFLICT ");
                    sb.append(column.onNullConflict().toString());
                }
                if (column.unique()) {
                    sb.append(" UNIQUE ON CONFLICT ");
                    sb.append(column.onUniqueConflict().toString());
                }
            }
            if (FOREIGN_KEYS_SUPPORTED && ReflectionUtils.isModel(type)) {
                sb.append(" REFERENCES ");
                sb.append(Cache.getTableInfo(type).getTableName());
                sb.append("(" + tableInfo.getIdName() + ")");
                sb.append(" ON DELETE ");
                sb.append(column.onDelete().toString().replace("_", " "));
                sb.append(" ON UPDATE ");
                sb.append(column.onUpdate().toString().replace("_", " "));
            }
        }
        return sb.toString();
    }

    public static void createIndexColumnDefinition(TableInfo tableInfo, Field field) {
        String columnName = tableInfo.getColumnName(field);
        Column column = (Column) field.getAnnotation(Column.class);
        if (field.getName().equals("mId")) {
            return;
        }
        if (column.index()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(columnName);
            sIndexGroupMap.put(columnName, arrayList);
        }
        for (String str : column.indexGroups()) {
            if (!TextUtils.isEmpty(str)) {
                List<String> arrayList2 = sIndexGroupMap.get(str);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                arrayList2.add(columnName);
                sIndexGroupMap.put(str, arrayList2);
            }
        }
    }

    public static String[] createIndexDefinition(TableInfo tableInfo) {
        ArrayList arrayList = new ArrayList();
        sIndexGroupMap = new HashMap<>();
        Iterator<Field> it2 = tableInfo.getFields().iterator();
        while (it2.hasNext()) {
            createIndexColumnDefinition(tableInfo, it2.next());
        }
        if (sIndexGroupMap.isEmpty()) {
            return new String[0];
        }
        for (Map.Entry<String, List<String>> entry : sIndexGroupMap.entrySet()) {
            arrayList.add(String.format("CREATE INDEX IF NOT EXISTS %s on %s(%s);", androidx.room.util.TableInfo.Index.DEFAULT_PREFIX + tableInfo.getTableName() + "_" + entry.getKey(), tableInfo.getTableName(), TextUtils.join(", ", entry.getValue())));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String createTableDefinition(TableInfo tableInfo) {
        ArrayList arrayList = new ArrayList();
        Iterator<Field> it2 = tableInfo.getFields().iterator();
        while (it2.hasNext()) {
            String strCreateColumnDefinition = createColumnDefinition(tableInfo, it2.next());
            if (!TextUtils.isEmpty(strCreateColumnDefinition)) {
                arrayList.add(strCreateColumnDefinition);
            }
        }
        arrayList.addAll(createUniqueDefinition(tableInfo));
        return String.format("CREATE TABLE IF NOT EXISTS %s (%s);", tableInfo.getTableName(), TextUtils.join(", ", arrayList));
    }

    public static void createUniqueColumnDefinition(TableInfo tableInfo, Field field) {
        String columnName = tableInfo.getColumnName(field);
        Column column = (Column) field.getAnnotation(Column.class);
        if (field.getName().equals("mId")) {
            return;
        }
        String[] strArrUniqueGroups = column.uniqueGroups();
        Column.ConflictAction[] conflictActionArrOnUniqueConflicts = column.onUniqueConflicts();
        if (strArrUniqueGroups.length != conflictActionArrOnUniqueConflicts.length) {
            return;
        }
        for (int i = 0; i < strArrUniqueGroups.length; i++) {
            String str = strArrUniqueGroups[i];
            Column.ConflictAction conflictAction = conflictActionArrOnUniqueConflicts[i];
            if (!TextUtils.isEmpty(str)) {
                List<String> arrayList = sUniqueGroupMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(columnName);
                sUniqueGroupMap.put(str, arrayList);
                sOnUniqueConflictsMap.put(str, conflictAction);
            }
        }
    }

    public static ArrayList<String> createUniqueDefinition(TableInfo tableInfo) {
        ArrayList<String> arrayList = new ArrayList<>();
        sUniqueGroupMap = new HashMap<>();
        sOnUniqueConflictsMap = new HashMap<>();
        Iterator<Field> it2 = tableInfo.getFields().iterator();
        while (it2.hasNext()) {
            createUniqueColumnDefinition(tableInfo, it2.next());
        }
        if (sUniqueGroupMap.isEmpty()) {
            return arrayList;
        }
        for (String str : sUniqueGroupMap.keySet()) {
            arrayList.add(String.format("UNIQUE (%s) ON CONFLICT %s", TextUtils.join(", ", sUniqueGroupMap.get(str)), sOnUniqueConflictsMap.get(str).toString()));
        }
        return arrayList;
    }

    public static void execSql(String str) {
        Cache.openDatabase().execSQL(str);
    }

    public static int intQuery(String str, String[] strArr) {
        Cursor cursorRawQuery = Cache.openDatabase().rawQuery(str, strArr);
        int iProcessIntCursor = processIntCursor(cursorRawQuery);
        cursorRawQuery.close();
        return iProcessIntCursor;
    }

    public static List<String> lexSqlScript(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(100);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ';' || z || z2) {
                if (cCharAt == '\'' && !z2) {
                    z = !z;
                }
                z2 = cCharAt == '\\' && !z2;
                sb.append(cCharAt);
            } else {
                arrayList.add(sb.toString());
                sb = new StringBuilder(100);
                z = false;
                z2 = false;
            }
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static <T extends Model> List<T> processCursor(Class<? extends Model> cls, Cursor cursor) {
        String idName = Cache.getTableInfo(cls).getIdName();
        ArrayList arrayList = new ArrayList();
        try {
            Constructor<? extends Model> constructor = cls.getConstructor(new Class[0]);
            if (cursor.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList(Arrays.asList(cursor.getColumnNames()));
                do {
                    Model entity = Cache.getEntity(cls, cursor.getLong(arrayList2.indexOf(idName)));
                    if (entity == null) {
                        entity = constructor.newInstance(new Object[0]);
                    }
                    entity.loadFromCursor(cursor);
                    arrayList.add(entity);
                } while (cursor.moveToNext());
            }
        } catch (NoSuchMethodException unused) {
            throw new RuntimeException("Your model " + cls.getName() + " does not define a default constructor. The default constructor is required for now in ActiveAndroid models, as the process to populate the ORM model is : 1. instantiate default model 2. populate fields");
        } catch (Exception e) {
            Log.e("Failed to process cursor.", e);
        }
        return arrayList;
    }

    private static int processIntCursor(Cursor cursor) {
        if (cursor.moveToFirst()) {
            return cursor.getInt(0);
        }
        return 0;
    }

    public static <T extends Model> List<T> rawQuery(Class<? extends Model> cls, String str, String[] strArr) {
        Cursor cursorRawQuery = Cache.openDatabase().rawQuery(str, strArr);
        List<T> listProcessCursor = processCursor(cls, cursorRawQuery);
        cursorRawQuery.close();
        return listProcessCursor;
    }

    public static <T extends Model> T rawQuerySingle(Class<? extends Model> cls, String str, String[] strArr) {
        List listRawQuery = rawQuery(cls, str, strArr);
        if (listRawQuery.size() > 0) {
            return (T) listRawQuery.get(0);
        }
        return null;
    }

    public static void execSql(String str, Object[] objArr) {
        Cache.openDatabase().execSQL(str, objArr);
    }
}
