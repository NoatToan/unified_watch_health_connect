package com.huawei.hms.framework.network.grs.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.g.j.d;
import com.huawei.hms.framework.network.grs.h.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13324a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f13325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f13326c = new Object();

    public static d a(Context context) {
        ArrayList arrayList;
        synchronized (f13326c) {
            if (f13325b != null) {
                Logger.i(f13324a, "getGrsServerBean pkg:%s, GrsServerBean exists.", context == null ? "" : context.getPackageName());
                return f13325b;
            }
            if (context == null) {
                Logger.i(f13324a, "getGrsServerBean context is invalid.");
            } else {
                String str = f13324a;
                Logger.i(str, "getGrsServerBean parse ServerConfig");
                String strA = c.a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
                StringBuilder sb = new StringBuilder("getGrsServerBean got Content:");
                sb.append(StringUtils.anonymizeMessage(strA));
                Logger.i(str, sb.toString());
                if (!TextUtils.isEmpty(strA)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strA).getJSONObject("grs_server");
                        JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                        if (jSONArray == null || jSONArray.length() <= 0) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                arrayList.add(jSONArray.get(i).toString());
                            }
                        }
                        String str2 = f13324a;
                        Logger.i(str2, "getGrsServerBean create GrsServerBean");
                        d dVar = new d();
                        f13325b = dVar;
                        dVar.a(arrayList);
                        f13325b.a(jSONObject.getString("grs_query_endpoint_2.0"));
                        f13325b.a(jSONObject.getInt("grs_query_timeout"));
                        Logger.i(str2, "getGrsServerBean end, package:%s", context.getPackageName());
                    } catch (JSONException e) {
                        Logger.w(f13324a, "getGrsServerBean catch JSONException: %s   ___ package:%s ____ content:%s", StringUtils.anonymizeMessage(e.getMessage()), context.getPackageName(), StringUtils.anonymizeMessage(strA));
                        f13325b = null;
                    }
                    return f13325b;
                }
            }
            return null;
        }
    }
}
