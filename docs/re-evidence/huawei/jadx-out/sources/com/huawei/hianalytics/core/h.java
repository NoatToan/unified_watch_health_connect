package com.huawei.hianalytics.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hianalytics.core.common.AesGcmKsWrapper;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.Property;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends a {
    public static final Property e;
    public static final Property f;
    public static final Property g;
    public static final Property h;
    public static final Property i;
    public static final Property j;
    public static final String k;

    static {
        Property property = new Property(Integer.TYPE, "_id", 0);
        e = property;
        Property property2 = new Property(String.class, "item_id", 1);
        f = property2;
        Property property3 = new Property(String.class, "metric_tag", 2);
        g = property3;
        Property property4 = new Property(String.class, "event_time", 3);
        h = property4;
        Property property5 = new Property(String.class, "content_type", 4);
        i = property5;
        Property property6 = new Property(String.class, "content_code", 5);
        j = property6;
        k = "CREATE TABLE IF NOT EXISTS METRIC_MC_TAG (" + property.columnName + " INTEGER PRIMARY KEY NOT NULL," + property2.columnName + " TEXT," + property3.columnName + " TEXT," + property4.columnName + " TEXT," + property5.columnName + " TEXT," + property6.columnName + " TEXT);";
    }

    public h(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase, "METRIC_MC_TAG");
    }

    @Override // com.huawei.hianalytics.core.a
    public final void a(ContentValues contentValues, Object obj) {
        String str = (String) obj;
        contentValues.clear();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Property property = f;
            String strOptString = jSONObject.optString(property.columnName, "");
            Property property2 = g;
            String strEncrypt = AesGcmKsWrapper.encrypt("HiAnalytics_Sdk_Public_Sp_Key", jSONObject.optString(property2.columnName, ""));
            Property property3 = h;
            String strOptString2 = jSONObject.optString(property3.columnName, String.valueOf(System.currentTimeMillis()));
            Property property4 = i;
            String strOptString3 = jSONObject.optString(property4.columnName, "MC");
            Property property5 = j;
            String strOptString4 = jSONObject.optString(property5.columnName, "");
            contentValues.put(property.columnName, strOptString);
            contentValues.put(property2.columnName, strEncrypt);
            contentValues.put(property3.columnName, strOptString2);
            contentValues.put(property4.columnName, strOptString3);
            contentValues.put(property5.columnName, strOptString4);
        } catch (JSONException unused) {
            HiLog.w("MetricMcTagDao", "parse mcTag failed");
            contentValues.clear();
        }
    }

    @Override // com.huawei.hianalytics.core.a
    public final Object a(Cursor cursor) {
        Property property = e;
        int i2 = cursor.getInt(property.index);
        Property property2 = f;
        String string = cursor.getString(property2.index);
        Property property3 = g;
        String string2 = cursor.getString(property3.index);
        Property property4 = h;
        String string3 = cursor.getString(property4.index);
        Property property5 = i;
        String string4 = cursor.getString(property5.index);
        Property property6 = j;
        String string5 = cursor.getString(property6.index);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(property.columnName, i2);
            jSONObject.put(property2.columnName, string);
            jSONObject.put(property3.columnName, AesGcmKsWrapper.decrypt("HiAnalytics_Sdk_Public_Sp_Key", string2));
            jSONObject.put(property4.columnName, string3);
            jSONObject.put(property5.columnName, string4);
            jSONObject.put(property6.columnName, string5);
        } catch (JSONException e2) {
            HiLog.e("MetricMcTagDao", e2.getMessage());
        }
        return jSONObject.toString();
    }

    public final int a(List list, String str) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = (String) list.get(i2);
            sb.append("?");
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        return b(str + " in( " + ((Object) sb) + " )", strArr);
    }
}
