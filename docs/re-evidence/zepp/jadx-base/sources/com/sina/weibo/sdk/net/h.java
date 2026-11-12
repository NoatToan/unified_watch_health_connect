package com.sina.weibo.sdk.net;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public final class h {
    private HashMap<String, String> q = new HashMap<>();

    public final String j() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : this.q.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(com.alipay.sdk.m.s.a.l);
            }
            String str2 = this.q.get(str);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    sb.append(URLEncoder.encode(str, "UTF-8"));
                    sb.append(SearchCriteria.EQ);
                    sb.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public final void put(String str, String str2) {
        this.q.put(str, str2);
    }
}
