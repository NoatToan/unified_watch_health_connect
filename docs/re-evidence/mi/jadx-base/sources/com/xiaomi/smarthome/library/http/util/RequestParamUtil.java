package com.xiaomi.smarthome.library.http.util;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.apache.http.NameValuePair;
import com.xiaomi.smarthome.library.apache.http.client.utils.URLEncodedUtils;
import defpackage.gv5;
import java.util.List;
import okhttp3.FormBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public class RequestParamUtil {
    public static RequestBody getRequestBody(List<NameValuePair> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        FormBody.Builder builder = new FormBody.Builder();
        for (NameValuePair nameValuePair : list) {
            String name = nameValuePair.getName();
            String value = nameValuePair.getValue();
            if (!TextUtils.isEmpty(name) && value != null) {
                builder.add(name, value);
            }
        }
        return builder.build();
    }

    public static String getUrlWithQueryString(String str, List<NameValuePair> list) {
        if (list == null || list.isEmpty()) {
            return str;
        }
        String str2 = URLEncodedUtils.format(list, "UTF-8");
        if (str.contains("?")) {
            return str + gv5.CONNECT_STR + str2;
        }
        return str + "?" + str2;
    }
}
