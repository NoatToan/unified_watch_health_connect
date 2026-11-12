package com.xiaomi.smarthome.core.server.internal.util;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.crypto.SHA1Util;
import defpackage.e54;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes10.dex */
public class UserAgentUtil {
    private static final String APP_KEY_WORD = "SmartHome";
    private static final String APP_VERSION_PREFIX = "";
    private static final Object sLock = new Object();
    private static volatile String sUserAgent;

    public static boolean checkValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!isValidOkHttpHeaderValue(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void clear() {
        synchronized (sLock) {
            sUserAgent = null;
        }
    }

    public static String getCPUArcDesc() {
        if (MiJiaEnvironment.getCPUArcType() == -1) {
            return "0";
        }
        if (MiJiaEnvironment.getCPUArcType() == 0) {
            return "32And64";
        }
        if (MiJiaEnvironment.getCPUArcType() == 1) {
            return "32";
        }
        return MiJiaEnvironment.getCPUArcType() == 2 ? "64" : "0";
    }

    public static String getUserAgent(Context context) {
        String str;
        synchronized (sLock) {
            try {
                if (sUserAgent == null) {
                    boolean zIsEurope = ServerCompact.isEurope(context);
                    String imei = SystemApi.getInstance().getImei(context);
                    ServerBean currentServer = ServerCompact.getCurrentServer(context);
                    String str2 = currentServer != null ? currentServer.countryCode : "";
                    StringBuilder sb = new StringBuilder();
                    sb.append(SystemApi.getInstance().getOsName().replace("-", ""));
                    sb.append("-");
                    sb.append(SystemApi.getInstance().getOsVersion().replace("-", ""));
                    sb.append("-");
                    sb.append(SystemApi.getInstance().getAppVersion(context).replace("-", ""));
                    sb.append("-");
                    sb.append(SystemApi.getInstance().getDeviceBrand().replace("-", ""));
                    sb.append("-");
                    sb.append(SystemApi.getInstance().getDeviceModel().replace("-", ""));
                    sb.append("-");
                    sb.append(SystemApi.getInstance().getOsIncremental().replace("-", ""));
                    sb.append("-");
                    sb.append(SystemApi.getInstance().getDeviceId(context, zIsEurope).replace("-", ""));
                    sb.append("-");
                    sb.append(str2.replace("-", ""));
                    sb.append("-");
                    sb.append((zIsEurope ? SHA1Util.getSHA2Digest(imei) : StringUtil.getMd5Digest(imei)).replace("-", ""));
                    sb.append("-");
                    sb.append(StringUtil.getMd5Digest(AccountDepApi.getInstance().getMiId()));
                    sb.append("-");
                    sb.append("SmartHome");
                    sb.append("-");
                    sb.append(MiJiaEnvironment.getChannel());
                    sb.append("-");
                    sb.append(e54.a(context));
                    sb.append("-");
                    sb.append(getCPUArcDesc());
                    sUserAgent = sanitizeUA(sb.toString());
                }
                str = sUserAgent;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    private static boolean isValidOkHttpHeaderValue(char c) {
        return c > 31 && c < 127;
    }

    public static String sanitizeUA(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (checkValid(str)) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder(str.length());
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (isValidOkHttpHeaderValue(cCharAt)) {
                    sb.append(cCharAt);
                } else {
                    sb.append(URLEncoder.encode(cCharAt + "", "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
