package com.huami.watch.companion.config;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import com.huami.passport.user.IAuthService;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.util.URLUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class LvMiConfig {
    public static final String KEY = "LvMi";
    public static final String KEY_ACCESS_TOKEN = "access_token";
    public static final String KEY_REFRESH_TOKEN = "refresh_token";
    public static final String REDIRCTURL = "https://huami-thirdparty-oauth-redirect-uri";
    private static final String a = "LvMiConfig";
    private static StringBuilder b;

    public static String getLvMiAuthourl(Context context) {
        String str;
        String str2;
        b = new StringBuilder("https://aiot-oauth2.aqara.cn/authorize?");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Config.isTestHosts()) {
            str = "14326e58403960870760a273";
            str2 = "https://oauth-connect-staging-cn.huami.com/oauth2/access_token?name=huami-watch-lumi-test";
        } else {
            str = "4c926876032df31428da6712";
            str2 = "https://oauth-connect-cn.huami.com/oauth2/access_token?name=huami-watch-lumi";
        }
        linkedHashMap.put("client_id", str);
        linkedHashMap.put(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "code");
        String uid = Account.getUID(context);
        if (TextUtils.isEmpty(uid)) {
            linkedHashMap.put("state", IAuthService.STATE.STATE);
        } else {
            try {
                linkedHashMap.put("state", URLEncoder.encode("{\"userId\":\"" + uid + "\"}", "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        linkedHashMap.put("redirect_uri", str2);
        b.append(URLUtil.appendParams(linkedHashMap));
        Log.i(a, "getLvMiAuthourl: " + ((Object) b), new Object[0]);
        return b.toString();
    }

    public static boolean getRedDotStatus(Context context) {
        return DeviceUtil.isSupportLvMi(context) && Box.getNoClear().getBoolean("LvMi", true);
    }

    public static boolean isAlreadyAuthor() {
        Box box = Box.get();
        return (TextUtils.isEmpty(box.getString("refresh_token", "")) || TextUtils.isEmpty(box.getString("access_token", ""))) ? false : true;
    }

    public static void saveRedDotStatus(boolean z) {
        Box.getNoClear().put("LvMi", z);
    }

    public static boolean saveToken(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("refresh_token");
        String str2 = map.get("access_token");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        Box box = Box.get();
        box.put("access_token", str2);
        box.put("refresh_token", str);
        return true;
    }

    public static void unbindLvMi() {
        Box box = Box.get();
        box.put("access_token", "");
        box.put("refresh_token", "");
    }
}
