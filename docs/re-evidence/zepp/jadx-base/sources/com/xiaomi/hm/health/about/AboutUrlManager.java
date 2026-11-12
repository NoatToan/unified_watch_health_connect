package com.xiaomi.hm.health.about;

import com.huami.account.HMLoginManager;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class AboutUrlManager {
    private static final String a = "t/posts?";
    private static final String b = "platform";
    private static final String c = "watch";
    private static final String d = "category";
    private static final int e = 35;
    private static final String f = "meta_key";
    private static final String g = "device";
    private static final String h = "meta_value";
    private static final String i = "lang";
    private static final String j = "country";
    private static final String k = "userid";
    private static final String l = "os";
    private static final String m = "1";
    private static final String n = "=";
    private static final String o = "&";

    private static String a(DeviceInfo deviceInfo) {
        return (deviceInfo.getProductId() == -1 ? "" : String.valueOf(deviceInfo.getProductId())) + "." + (deviceInfo.getProductVersion() != -1 ? String.valueOf(deviceInfo.getProductVersion()) : "") + "." + String.valueOf(deviceInfo.getDeviceSource().getType().getValue()) + "." + String.valueOf(deviceInfo.getDeviceSource().getValue());
    }

    public static String assembleDeviceFaqUrl(DeviceInfo deviceInfo) {
        String huamiId = HMLoginManager.getHuamiId();
        String str = HMServerDef.getHost() + a;
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
        sb.append(("unknown".equals(SelectAreaHelper.getArea().getValue()) ? Locale.getDefault().getCountry() : SelectAreaHelper.getArea().getValue()).toUpperCase(locale));
        sb.append("&");
        sb.append("userid");
        sb.append("=");
        if (huamiId == null) {
            huamiId = "";
        }
        sb.append(huamiId);
        sb.append("&");
        sb.append("os");
        sb.append("=");
        sb.append("1");
        sb.append("&");
        sb.append("category");
        sb.append("=");
        sb.append(35);
        sb.append("&");
        sb.append(f);
        sb.append("=");
        sb.append("device");
        sb.append("&");
        sb.append(h);
        sb.append("=");
        sb.append(a(deviceInfo));
        return str + sb.toString();
    }
}
