package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.xiaomi.ai.edge.EdgeNluFacade;
import com.xiaomi.ai.edge.resourcesmanager.EdgeResourcesDownloadManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class jug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23142a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EdgeNluFacade.b f23143b = new a();
    public Context c;
    public boolean d;

    public class a implements EdgeNluFacade.b {
        public a() {
        }

        @Override // com.xiaomi.ai.edge.EdgeNluFacade.b
        public String a(String str) {
            return EdgeResourcesDownloadManager.a().b(jug.this.c).a(str);
        }

        @Override // com.xiaomi.ai.edge.EdgeNluFacade.b
        public File b(String str) {
            return EdgeResourcesDownloadManager.a().b(jug.this.c).b(str);
        }

        @Override // com.xiaomi.ai.edge.EdgeNluFacade.b
        public void c(String str, String str2) {
            EdgeResourcesDownloadManager.a().b(jug.this.c).c(str, str2);
        }
    }

    public jug(Context context) {
        this.c = context;
    }

    public static long b(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
        long j = 0;
        int i = 0;
        while (cursorQuery.moveToNext()) {
            j += (long) cursorQuery.getInt(cursorQuery.getColumnIndex("version"));
            i++;
        }
        long j2 = (j * 10000) + ((long) i);
        cursorQuery.close();
        return j2;
    }

    public static JSONObject d(Context context) {
        String str = "data2";
        String str2 = "data4";
        if (context.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            Logger.e("NlpDataLoader", "读写联系人权限未被授予");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"contact_id", "display_name", "data4", "data2"}, null, null, null);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            JSONArray jSONArray = new JSONArray();
            while (cursorQuery != null && cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("contact_id"));
                Object string2 = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                String string3 = cursorQuery.getString(cursorQuery.getColumnIndex(str2));
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex(str));
                str = str;
                if (map.containsKey(string)) {
                    Set set = (Set) map2.get(string);
                    if (!set.contains(string3)) {
                        set.add(string3);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(RealNameWebViewActivity.NUMBER, string3);
                        jSONObject2.put("type", i);
                        ((JSONArray) map.get(string)).put(jSONObject2);
                    }
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONArray.put(jSONObject3);
                    jSONObject3.put("user_id", string);
                    jSONObject3.put("name", string2);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONObject3.put("phone_list", jSONArray2);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONArray2.put(jSONObject4);
                    jSONObject4.put(RealNameWebViewActivity.NUMBER, string3);
                    jSONObject4.put("type", i);
                    map2.put(string, new HashSet(Arrays.asList(string3)));
                    map.put(string, jSONArray2);
                }
                str2 = str2;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            jSONObject.put("contacts", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            Logger.e("NlpDataLoader", "get getUserContactsJsonData error:" + e);
            return null;
        }
    }

    public final long c(Context context) {
        try {
            return context.getSharedPreferences("offline_config", 0).getLong("local_contact_version", -1L);
        } catch (Exception e) {
            Logger.e("NlpDataLoader", "getLocalContactsVersion error:" + e);
            return 0L;
        }
    }

    public final boolean e(Context context) {
        long jC;
        if (this.d) {
            jC = c(context);
            this.f23142a = b(context);
            if (this.d && jC == -1) {
                Logger.i("NlpDataLoader", "isDataChange org null ");
                return true;
            }
        } else {
            jC = 0;
        }
        Logger.i("NlpDataLoader", "isDataChange local-cur ContactsVersion :" + jC + " - " + this.f23142a);
        return this.d && this.f23142a != jC;
    }

    public boolean f(boolean z) throws Exception {
        g();
        if (this.d && this.c.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            Logger.e("NlpDataLoader", "读写联系人权限未被授予");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = e(this.c) || z;
        Logger.d("NlpDataLoader", "isDataChange: " + z2 + " isForced :" + z + " time " + (System.currentTimeMillis() - jCurrentTimeMillis));
        if (!z2 && EdgeNluFacade.getInstance().loadModelByCache(this.c.openFileInput("nlp_model_persist"))) {
            Logger.d("NlpDataLoader", "loadCache" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return true;
        }
        i08 i08Var = new i08();
        if (this.d) {
            JSONObject jSONObjectD = d(this.c);
            if (jSONObjectD == null) {
                Logger.e("NlpDataLoader", "获取联系人数据失败");
                jSONObjectD = new JSONObject();
                jSONObjectD.put("contacts", new JSONArray());
            }
            Logger.i("NlpDataLoader", "load phone call data");
            i08Var.d(jSONObjectD);
        }
        boolean zLoadModelByDataWithCouldResources = EdgeNluFacade.getInstance().loadModelByDataWithCouldResources(i08Var, this.c.openFileOutput("nlp_model_persist", 0), this.f23143b);
        Logger.d("NlpDataLoader", "init data time create Data:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        if (!zLoadModelByDataWithCouldResources) {
            return false;
        }
        if (!this.d) {
            this.f23142a = -1L;
        }
        h(this.c, this.f23142a);
        return true;
    }

    public final void g() {
        this.d = true;
    }

    public final void h(Context context, long j) {
        context.getSharedPreferences("offline_config", 0).edit().putLong("local_contact_version", j).apply();
    }
}
