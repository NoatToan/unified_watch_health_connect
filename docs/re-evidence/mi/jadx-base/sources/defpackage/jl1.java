package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class jl1 {
    public static String a(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, "?");
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    public static String[] b(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(next);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject2 == null) {
                jSONObject.put(next, jSONObject2.get(next));
            } else {
                c(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
                jSONObject.put(next, jSONObjectOptJSONObject2);
            }
        }
    }

    public static String d(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorQuery = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getString(0);
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    public static boolean e(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String strD = d(sQLiteDatabase, str);
        if (strD != null) {
            JSONObject jSONObject = new JSONObject(strD);
            c(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return f(sQLiteDatabase, str, str2);
    }

    public static boolean f(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }
}
