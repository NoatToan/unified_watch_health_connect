package com.google.androidbrowserhelper.trusted;

import android.content.Intent;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.common.HttpHeaders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.b;

/* JADX INFO: loaded from: classes14.dex */
public class SharingUtils {
    private SharingUtils() {
    }

    public static boolean isShareIntent(Intent intent) {
        String action = intent.getAction();
        return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
    }

    private static List<String> parseAcceptedTypes(Object obj) {
        if (!(obj instanceof JSONArray)) {
            return Collections.singletonList(obj.toString());
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            arrayList.add(jSONArray.getString(i14));
        }
        return arrayList;
    }

    private static List<b.a> parseFiles(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i14);
            arrayList.add(new b.a(jSONObject.getString("name"), parseAcceptedTypes(jSONObject.get(HttpHeaders.ACCEPT))));
        }
        return arrayList;
    }

    public static b parseShareTargetJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("action");
        String strOptString = jSONObject.optString(FirebaseAnalytics.Param.METHOD, null);
        String strOptString2 = jSONObject.optString("enctype", null);
        JSONObject jSONObject2 = jSONObject.getJSONObject("params");
        return new b(string, strOptString, strOptString2, new b.C2944b(jSONObject2.optString("title", "title"), jSONObject2.optString("text", "text"), parseFiles(jSONObject2.optJSONArray("files"))));
    }

    public static s.a retrieveShareDataFromIntent(Intent intent) {
        List parcelableArrayListExtra = null;
        if (!isShareIntent(intent)) {
            return null;
        }
        if ("android.intent.action.SEND".equals(intent.getAction())) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
            if (uri != null) {
                parcelableArrayListExtra = Collections.singletonList(uri);
            }
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        }
        return new s.a(intent.getStringExtra("android.intent.extra.SUBJECT"), intent.getStringExtra("android.intent.extra.TEXT"), parcelableArrayListExtra);
    }
}
