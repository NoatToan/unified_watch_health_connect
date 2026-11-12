package defpackage;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class rrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, a> f32836a = new ConcurrentHashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f32838b;
        public String c;
    }

    public static o4h<a> b(final String str) {
        return f32836a.containsKey(str) ? o4h.E(f32836a.get(str)) : o4h.f(new j5h() { // from class: qrr
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws Exception {
                rrr.c(str, v4hVar);
            }
        }).c(b6l.c());
    }

    public static /* synthetic */ void c(String str, v4h v4hVar) throws Exception {
        String strString = new OkHttpClient.Builder().build().newCall(new Request.Builder().url(String.format("https://api.account.xiaomi.com/pass/usersCard?ids=%s", str)).build()).execute().body().string();
        Logger.i("XMAccountProfile", "usersCard resp:" + strString);
        JSONObject jSONObject = new JSONObject(strString).getJSONObject("data").getJSONArray("list").getJSONObject(0);
        String strOptString = jSONObject.optString("miliaoNick");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObject.optString("aliasNick");
        }
        String strOptString2 = jSONObject.optString("miliaoIcon");
        if (!TextUtils.isEmpty(strOptString2)) {
            int iLastIndexOf = strOptString2.lastIndexOf(".");
            strOptString2 = strOptString2.substring(0, iLastIndexOf) + "_320" + strOptString2.substring(iLastIndexOf);
        }
        a aVar = new a();
        aVar.f32837a = str;
        aVar.f32838b = strOptString;
        aVar.c = strOptString2;
        f32836a.put(str, aVar);
        try {
            v4hVar.onNext(aVar);
        } catch (Throwable th) {
            try {
                v4hVar.onError(th);
                Logger.i("XMAccountProfile", "get user profile failed:" + th);
            } finally {
                v4hVar.onComplete();
            }
        }
    }
}
