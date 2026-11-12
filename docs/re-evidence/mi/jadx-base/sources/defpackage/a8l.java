package defpackage;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a8l {
    public static void a(StringBuilder sb, String str, String str2, boolean z) {
        sb.append("`");
        sb.append(str);
        sb.append("` ");
        sb.append(str2);
        if (z) {
            return;
        }
        sb.append(", ");
    }

    public static void b(StringBuilder sb, String str, List<String> list) {
        int size = list.size() - 1;
        for (int i = 0; i <= size; i++) {
            if (str != null) {
                sb.append(str);
                sb.append(list.get(i));
            } else {
                sb.append("`");
                sb.append(list.get(i));
                sb.append("`");
            }
            if (i != size) {
                sb.append(", ");
            }
        }
    }

    public static boolean c(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = supportSQLiteDatabase.query(String.format("SELECT COUNT(*) FROM sqlite_master WHERE type='table' AND name='%s'", str));
            cursorQuery.moveToFirst();
            return cursorQuery.getInt(0) == 1;
        } finally {
            f(cursorQuery);
        }
    }

    public static List<String> d(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        try {
            boolean zC = c(supportSQLiteDatabase, str);
            Cursor cursorQuery = supportSQLiteDatabase.query(String.format("PRAGMA table_info(%s)", str));
            if (cursorQuery.getCount() == 0) {
                throw new IllegalStateException("table exist( " + zC + ")" + str);
            }
            LinkedList linkedList = new LinkedList();
            int columnIndex = cursorQuery.getColumnIndex("name");
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndex);
                if (z || !string.startsWith(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)) {
                    linkedList.add(string);
                }
            }
            f(cursorQuery);
            return linkedList;
        } catch (Throwable th) {
            f(null);
            throw th;
        }
    }

    public static String e(Class<?> cls) {
        if (cls == String.class) {
            return "TEXT";
        }
        if ((cls.isArray() && cls.getComponentType() == Byte.TYPE) || cls.getComponentType() == Byte.class) {
            return "BLOB";
        }
        if (cls == Byte.TYPE || cls == Byte.class || cls == Short.TYPE || cls == Short.class || cls == Integer.TYPE || cls == Integer.class || cls == Long.TYPE || cls == Long.class) {
            return "INTEGER";
        }
        if (cls == Float.TYPE || cls == Float.class || cls == Double.TYPE || cls == Double.class) {
            return "REAL";
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return "INTEGER";
        }
        throw new IllegalArgumentException("not support " + cls);
    }

    public static void f(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Exception unused) {
        }
    }
}
