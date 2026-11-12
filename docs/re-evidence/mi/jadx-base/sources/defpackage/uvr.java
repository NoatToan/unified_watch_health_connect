package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class uvr {
    public static String a(String str, int i) {
        List<String> pathSegments;
        if (!TextUtils.isEmpty(str) && i >= 0) {
            try {
                Uri uri = Uri.parse(str);
                if (uri != null && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() > i) {
                    return pathSegments.get(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String b(String str) {
        String strA = a(str, 0);
        ConcurrentHashMap<String, String> urlToRNAppNameMapping = lwr.b().getInfoProvider() != null ? lwr.b().getInfoProvider().getUrlToRNAppNameMapping() : new ConcurrentHashMap<>();
        return (urlToRNAppNameMapping == null || TextUtils.isEmpty(strA) || !urlToRNAppNameMapping.containsKey(strA)) ? strA : urlToRNAppNameMapping.get(strA);
    }

    public static String c(String str) {
        String strA = a(str, 1);
        ConcurrentHashMap<String, String> urlToRNModuleMapping = lwr.b().getInfoProvider() != null ? lwr.b().getInfoProvider().getUrlToRNModuleMapping() : new ConcurrentHashMap<>();
        return (urlToRNModuleMapping == null || TextUtils.isEmpty(strA) || !urlToRNModuleMapping.containsKey(strA)) ? strA : urlToRNModuleMapping.get(strA);
    }

    public static String d(String str) {
        return a(str, 2);
    }
}
