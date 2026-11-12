package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class zrq {
    public static Uri a(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static void c(Uri.Builder builder, String str, Object obj) {
        if (obj == null || obj.toString() == null) {
            return;
        }
        builder.appendQueryParameter(str, obj.toString());
    }

    public static Long b(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return Long.valueOf(Long.parseLong(queryParameter));
        }
        return null;
    }

    public static String c(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + e(entry.getValue()));
        }
        return TextUtils.join("&", arrayList);
    }

    public static String e(String str) {
        zre.c(str);
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException("Unable to encode using UTF-8");
        }
    }
}
