package com.huami.moving.ui.utils;

import android.text.TextUtils;
import java.lang.reflect.Array;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class TriathlonChildSportUtil {
    private static final String a = "trackid";
    private static final String b = "type";

    public static long[][] anaChildSport(String str) {
        long[][] jArr = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) long.class, 2, jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    long j = jSONArray.getJSONObject(i).getLong("trackid");
                    int i2 = jSONArray.getJSONObject(i).getInt("type");
                    jArr2[0][i] = j;
                    long[] jArr3 = jArr2[1];
                    if (!SportTypeIdentifier.isChildSportType(i2)) {
                        i2 += 1000;
                    }
                    jArr3[i] = i2;
                } catch (JSONException e) {
                    e = e;
                    jArr = jArr2;
                    e.printStackTrace();
                    return jArr;
                }
            }
            return jArr2;
        } catch (JSONException e2) {
            e = e2;
        }
    }
}
