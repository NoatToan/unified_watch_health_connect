package defpackage;

import android.text.TextUtils;
import com.huawei.appgallery.marketinstallerservice.api.InstallCallback;
import com.huawei.appgallery.marketinstallerservice.api.MarketInfo;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes23.dex */
public class bie {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, InstallCallback> f1123b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, MarketInfo> f1124c = new ConcurrentHashMap();

    public static void c(String str) {
        if (str == null) {
            return;
        }
        f1124c.remove(str);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f1123b.remove(str);
    }

    public static MarketInfo b(String str) {
        if (str == null) {
            return null;
        }
        return f1124c.get(str);
    }

    public static void c(String str, MarketInfo marketInfo) {
        if (str == null) {
            return;
        }
        f1124c.put(str, marketInfo);
    }

    public static String b(InstallCallback installCallback) {
        if (installCallback == null) {
            return "";
        }
        String string = UUID.randomUUID().toString();
        f1123b.put(string, installCallback);
        return string;
    }

    public static InstallCallback d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f1123b.get(str);
    }
}
