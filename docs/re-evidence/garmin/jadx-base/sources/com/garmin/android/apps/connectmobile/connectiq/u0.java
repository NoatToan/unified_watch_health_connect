package com.garmin.android.apps.connectmobile.connectiq;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile u0 f32026c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ConcurrentHashMap f32027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ConcurrentHashMap f32028b;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f32030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f32031c;

        public a(u0 u0Var, String str, String str2, String str3) {
            this.f32029a = str;
            this.f32030b = str2;
            this.f32031c = str3;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f32033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f32034c;

        public b(u0 u0Var, String str, String str2, String str3) {
            this.f32032a = str;
            this.f32033b = str2;
            this.f32034c = new c(str3);
        }
    }

    private u0() {
        this.f32027a = new ConcurrentHashMap();
        this.f32028b = new ConcurrentHashMap();
        SharedPreferences sharedPreferences = GarminConnectMobileApp.f28688j.getSharedPreferences("MBAppRegistry", 0);
        String string = sharedPreferences.getString("registry", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    String string2 = jSONObject.getString("applicationId");
                    String string3 = jSONObject.getString("notificationAction");
                    String string4 = jSONObject.getString("notificationPackage");
                    concurrentHashMap.put(a(string2, string4), new a(this, string2, string3, string4));
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
        this.f32027a = new ConcurrentHashMap(concurrentHashMap);
        String string5 = sharedPreferences.getString("binderServiceApps", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        try {
            JSONArray jSONArray2 = new JSONArray(string5);
            for (int i15 = 0; i15 < jSONArray2.length(); i15++) {
                try {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i15);
                    String string6 = jSONObject2.getString("applicationId");
                    String string7 = jSONObject2.getString("notificationPackage");
                    concurrentHashMap2.put(a(string6, string7), new b(this, string6, string7, jSONObject2.getString("companionAppServiceAction")));
                } catch (JSONException unused3) {
                }
            }
        } catch (JSONException unused4) {
        }
        this.f32028b = new ConcurrentHashMap(concurrentHashMap2);
        Iterator it = this.f32027a.entrySet().iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            try {
                GarminConnectMobileApp.f28688j.getPackageManager().getPackageInfo(((a) ((Map.Entry) it.next()).getValue()).f32031c, 0);
            } catch (PackageManager.NameNotFoundException unused5) {
                it.remove();
                z14 = true;
            }
        }
        Iterator it3 = this.f32028b.entrySet().iterator();
        boolean z15 = false;
        while (it3.hasNext()) {
            b bVar = (b) ((Map.Entry) it3.next()).getValue();
            try {
                GarminConnectMobileApp.f28688j.getPackageManager().getPackageInfo(bVar.f32033b, 0);
            } catch (PackageManager.NameNotFoundException unused6) {
                it3.remove();
                bVar.f32034c.b();
                z15 = true;
            }
        }
        if (z14 || z15) {
            d();
        }
    }

    public static String a(String str, String str2) {
        return tn.k.g(str, str2);
    }

    public static u0 b() {
        if (f32026c == null) {
            synchronized (u0.class) {
                try {
                    if (f32026c == null) {
                        f32026c = new u0();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f32026c;
    }

    public final b c(String str) {
        for (b bVar : this.f32028b.values()) {
            if (bVar.f32032a.equalsIgnoreCase(str)) {
                try {
                    GarminConnectMobileApp.f28688j.getPackageManager().getPackageInfo(bVar.f32033b, 0);
                    return bVar;
                } catch (PackageManager.NameNotFoundException unused) {
                    break;
                }
            }
        }
        return null;
    }

    public final void d() {
        SharedPreferences.Editor editorEdit = GarminConnectMobileApp.f28688j.getSharedPreferences("MBAppRegistry", 0).edit();
        JSONArray jSONArray = new JSONArray();
        for (a aVar : this.f32027a.values()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("applicationId", aVar.f32029a);
                jSONObject.put("notificationAction", aVar.f32030b);
                jSONObject.put("notificationPackage", aVar.f32031c);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        editorEdit.putString("registry", jSONArray.toString());
        JSONArray jSONArray2 = new JSONArray();
        for (b bVar : this.f32028b.values()) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("applicationId", bVar.f32032a);
                jSONObject2.put("notificationPackage", bVar.f32033b);
                jSONObject2.put("companionAppServiceAction", bVar.f32034c.f31837a);
                jSONArray2.put(jSONObject2);
            } catch (JSONException unused2) {
            }
        }
        editorEdit.putString("binderServiceApps", jSONArray2.toString());
        editorEdit.apply();
    }
}
