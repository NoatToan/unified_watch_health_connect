package com.xiaomi.smarthome.setting;

import android.content.Context;
import android.text.TextUtils;
import com.mi.health.uri_parser.links.UriMapKt;
import com.xiaomi.smarthome.core.server.ServerApi;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingConst;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;

/* JADX INFO: loaded from: classes2.dex */
public class ServerRouteUtil {
    private static final String HOME_MI_COM_PREVIEW = "home.mi.com";
    private static final String HOME_MI_COM_RELEASE = "home.mi.com";
    private static final String SMART_HOME_API_PREVIEW = "api.io.mi.com";
    private static final String SMART_HOME_API_RELEASE = "api.io.mi.com";

    public static String buildHomeMIHost(Context context) {
        return buildHost(context, UriMapKt.linkMijiaHost, UriMapKt.linkMijiaHost);
    }

    public static String buildHost(Context context, String str, String str2) {
        ServerBean currentServer = ServerCompact.getCurrentServer(context);
        String serverEnv = getServerEnv(context);
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
            serverEnv = "release";
        }
        if (currentServer == null || ServerCompact.isChinaMainLand(currentServer)) {
            if (TextUtils.isEmpty(serverEnv) || serverEnv.equalsIgnoreCase("release") || !serverEnv.equalsIgnoreCase(ServerSetting.SERVER_ENV_PREVIEW)) {
                return "https://" + str;
            }
            if (str.startsWith(UriMapKt.linkMijiaHost)) {
                return "https://preview." + str2;
            }
            return "https://pv." + str2;
        }
        if (!TextUtils.isEmpty(serverEnv) && !serverEnv.equalsIgnoreCase("release") && serverEnv.equalsIgnoreCase(ServerSetting.SERVER_ENV_PREVIEW)) {
            return "https://pv-" + currentServer.machineCode + "." + str2;
        }
        if (TextUtils.equals("st", currentServer.machineCode.toLowerCase()) && (str.startsWith(UriMapKt.linkMijiaHost) || str.startsWith("mi.com"))) {
            return "http://" + currentServer.machineCode + ".iot." + str;
        }
        return "https://" + currentServer.machineCode + "." + str;
    }

    public static String buildSmartHomeHost(Context context) {
        return buildHost(context, "api.io.mi.com", "api.io.mi.com");
    }

    private static String getServerEnv(Context context) {
        if (ServerApi.getInstance().isCoreReady()) {
            return ServerApi.getInstance().getGlobalSettingServerEnv();
        }
        return context != null ? context.getSharedPreferences("com.xiaomi.smarthome.globaldynamicsetting", 0).getString(GlobalDynamicSettingConst.SERVER_ENV, "release") : "release";
    }
}
