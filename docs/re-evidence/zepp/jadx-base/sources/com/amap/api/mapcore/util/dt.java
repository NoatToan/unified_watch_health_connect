package com.amap.api.mapcore.util;

import android.content.Context;
import android.util.Log;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
public final class dt {
    public static String a;

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append(SearchCriteria.EQ);
        }
        a = sb.toString();
    }

    public static void a() {
        Log.i("authErrLog", a);
        Log.i("authErrLog", "当前使用的自定义地图样式文件和目前版本不匹配，请到官网(lbs.amap.com)更新新版样式文件");
        Log.i("authErrLog", a);
    }

    private static void b(String str) {
        int i;
        while (true) {
            if (str.length() < 78) {
                break;
            }
            Log.i("authErrLog", AESEncryptionHelper.SEPARATOR + str.substring(0, 78) + AESEncryptionHelper.SEPARATOR);
            str = str.substring(78);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AESEncryptionHelper.SEPARATOR);
        sb.append(str);
        for (i = 0; i < 78 - str.length(); i++) {
            sb.append(" ");
        }
        sb.append(AESEncryptionHelper.SEPARATOR);
        Log.i("authErrLog", sb.toString());
    }

    public static void a(String str) {
        Log.i("authErrLog", a);
        Log.i("authErrLog", str);
        Log.i("authErrLog", a);
    }

    public static void a(Context context, String str) {
        Log.i("authErrLog", a);
        if (context != null) {
            b("key:" + gj.f(context));
        }
        Log.i("authErrLog", str);
        Log.i("authErrLog", a);
    }
}
