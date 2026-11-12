package com.huami.watch.companion.about;

import android.content.Context;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class AboutUrlManager {
    private static final String A = "&";
    private static final String a = "t/posts?";
    private static final String b = "platform";
    private static final String c = "watch";
    private static final String d = "category";
    private static final int e = 35;
    private static final int f = 12;
    private static final int g = 3;
    private static final int h = 14;
    private static final int i = 5;
    private static final String j = "meta_key";
    private static final String k = "device";
    private static final String l = "tag";
    private static final String m = "meta_value";
    private static final String n = "privacy";
    private static final String o = "eur";
    private static final String p = "ux";
    private static final int q = 20;
    private static final int r = 21;
    private static final int s = 22;
    private static final int t = 23;
    private static final String u = "lang";
    private static final String v = "country";
    private static final String w = "userid";
    private static final String x = "os";
    private static final String y = "1";
    private static final String z = "=";

    private static String a(int i2) {
        String str = HMServerDef.getHost() + a;
        StringBuilder sb = new StringBuilder();
        sb.append("category");
        sb.append("=");
        switch (i2) {
            case 20:
                sb.append(12);
                break;
            case 21:
                sb.append(3);
                break;
            case 22:
                sb.append(14);
                break;
            case 23:
                sb.append(5);
                break;
        }
        sb.append("&");
        sb.append(j);
        sb.append("=");
        sb.append("tag");
        sb.append("&");
        sb.append(m);
        sb.append("=");
        switch (i2) {
            case 20:
            case 21:
                sb.append("privacy");
                break;
            case 22:
                sb.append(o);
                break;
            case 23:
                sb.append(p);
                break;
        }
        return str + sb.toString();
    }

    public static String assembleDeviceFaqUrl(Context context, String str) {
        String uid = Account.getUID(context);
        String str2 = HMServerDef.getHost() + a;
        StringBuilder sb = new StringBuilder();
        sb.append("platform");
        sb.append("=");
        sb.append("watch");
        sb.append("&");
        sb.append("lang");
        sb.append("=");
        StringBuilder sb2 = new StringBuilder();
        String language = Locale.getDefault().getLanguage();
        Locale locale = Locale.US;
        sb2.append(language.toUpperCase(locale));
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb2.append(Locale.getDefault().getCountry().toUpperCase(locale));
        sb.append(sb2.toString());
        sb.append("&");
        sb.append("country");
        sb.append("=");
        if ("unknown".equals(str)) {
            str = Locale.getDefault().getCountry();
        }
        sb.append(str.toUpperCase(locale));
        sb.append("&");
        sb.append("userid");
        sb.append("=");
        if (uid == null) {
            uid = "";
        }
        sb.append(uid);
        sb.append("&");
        sb.append("os");
        sb.append("=");
        sb.append("1");
        sb.append("&");
        sb.append("category");
        sb.append("=");
        sb.append(35);
        sb.append("&");
        sb.append(j);
        sb.append("=");
        sb.append("device");
        sb.append("&");
        sb.append(m);
        sb.append("=");
        sb.append(b(context));
        return str2 + sb.toString();
    }

    private static String b(Context context) {
        String strValueOf;
        String huamiModel;
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice != null) {
            huamiModel = currentDevice.info().getHuamiModel();
            strValueOf = String.valueOf(DeviceSource.getDeviceSource(currentDevice));
        } else {
            strValueOf = "";
            huamiModel = strValueOf;
        }
        return huamiModel + "..4." + strValueOf;
    }
}
