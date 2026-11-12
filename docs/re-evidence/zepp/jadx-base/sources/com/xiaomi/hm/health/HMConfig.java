package com.xiaomi.hm.health;

import android.text.TextUtils;
import com.huami.account.HMLoginManager;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.injection.AppStateApi;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Lazy;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class HMConfig implements GlobalConfig.IGlobalConfig {
    private static final String a = "HMConfig";
    private static final Lazy<BuildConfigApi> b = KoinJavaComponent.inject(BuildConfigApi.class);
    private static final Lazy<AppStateApi> c = KoinJavaComponent.inject(AppStateApi.class);

    public static class Channel {
        public static boolean isInner() {
            return name().equals("internal") || name().equals("temp");
        }

        public static boolean isNormal() {
            return name().equals(StatEvent.VALUE_NORMAL);
        }

        public static boolean isPlay() {
            return name().equals("play");
        }

        public static String name() {
            return ((BuildConfigApi) HMConfig.b.getValue()).getFlavorChannel();
        }

        public static String production() {
            return ((BuildConfigApi) HMConfig.b.getValue()).getFlavorProduction();
        }
    }

    public static class Log {
        public static boolean isLogData() {
            return DeviceXBuilder.INSTANCE.isDebug();
        }

        public static boolean isLogFile() {
            return true;
        }

        public static boolean isLogTerminal() {
            return ((BuildConfigApi) HMConfig.b.getValue()).isDebug() || GlobalConfig.get().isBuildInner();
        }
    }

    public static String getAppHost() {
        return b.getValue().getApplicationId();
    }

    public static String getScheme() {
        return GlobalConfig.get().isBuildMidong() ? "amazfit" : "mifit";
    }

    @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
    public boolean isBuildAmazfit() {
        return "amazfit".equals(b.getValue().getFlavorProduction());
    }

    @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
    public boolean isBuildDebug() {
        return DeviceXBuilder.INSTANCE.isDebug();
    }

    @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
    public boolean isBuildInner() {
        Lazy<BuildConfigApi> lazy = b;
        return "internal".equals(lazy.getValue().getFlavorChannel()) || "temp".equals(lazy.getValue().getFlavorChannel());
    }

    @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
    public boolean isBuildMidong() {
        Lazy<BuildConfigApi> lazy = b;
        return "midong".equals(lazy.getValue().getFlavorProduction()) || "amazfit".equals(lazy.getValue().getFlavorProduction()) || "zepp".equals(lazy.getValue().getFlavorProduction());
    }

    @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
    public boolean isBuildPlay() {
        return "play".equals(b.getValue().getFlavorChannel());
    }

    public static class Url {
        private static final String a = "lang";
        private static final String b = "channel";
        private static final String c = "userId";
        private static final String d = "cv";
        private static final String e = "t";
        private static final String f = "redirectType";
        private static final String g = "appplatform";
        private static final String h = "help";
        private static final String i = "buy";
        private static final String j = "agreement";
        private static final String k = "experience";
        private static final String l = "privacy";
        private static final String m = "appName";
        private static final String n = "v1/redirectPage.do";
        private static final String o = "apps/redirectPages";

        private static String a(String str) {
            return b(str, Language.getDefault());
        }

        public static String agreementUrl(String str) {
            return TextUtils.isEmpty(str) ? b(j, ((AppStateApi) HMConfig.c.getValue()).getAreaBySave()) : b(j, str);
        }

        private static String b(String str, String str2) {
            String str3;
            long validUid = HMLoginManager.getValidUid();
            StringBuilder sb = new StringBuilder();
            sb.append(HMServerDef.getHost());
            sb.append(o);
            sb.append("?");
            sb.append("lang");
            sb.append(SearchCriteria.EQ);
            sb.append(str2);
            sb.append(com.alipay.sdk.m.s.a.l);
            if (validUid > 0) {
                str3 = "userId=" + validUid + com.alipay.sdk.m.s.a.l;
            } else {
                str3 = "";
            }
            sb.append(str3);
            sb.append("channel");
            sb.append(SearchCriteria.EQ);
            sb.append(Channel.name());
            sb.append(com.alipay.sdk.m.s.a.l);
            sb.append("redirectType");
            sb.append(SearchCriteria.EQ);
            sb.append(str);
            sb.append(com.alipay.sdk.m.s.a.l);
            sb.append("appName");
            sb.append(SearchCriteria.EQ);
            sb.append(HMAppConfig.getPackageName());
            sb.append(com.alipay.sdk.m.s.a.l);
            sb.append("appplatform");
            sb.append(SearchCriteria.EQ);
            sb.append(HMAppConfig.getDeviceType());
            sb.append(com.alipay.sdk.m.s.a.l);
            sb.append("cv");
            sb.append(SearchCriteria.EQ);
            sb.append(HMAppConfig.getVersionCode());
            sb.append("_");
            sb.append(HMAppConfig.getVersionName());
            sb.append(com.alipay.sdk.m.s.a.l);
            sb.append("t");
            sb.append(SearchCriteria.EQ);
            sb.append(System.currentTimeMillis());
            String string = sb.toString();
            HMLog.d(HMConfig.a, "getUrl:" + string, new Object[0]);
            return string;
        }

        public static String buyUrl() {
            return a(i);
        }

        public static String experienceUrl(String str) {
            return TextUtils.isEmpty(str) ? b(k, ((AppStateApi) HMConfig.c.getValue()).getAreaBySave()) : b(k, str);
        }

        public static String helpUrl() {
            return a(h);
        }

        public static String privacyUrl(String str) {
            return TextUtils.isEmpty(str) ? b("privacy", ((AppStateApi) HMConfig.c.getValue()).getAreaBySave()) : b("privacy", str);
        }

        public static String agreementUrl(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return b(str, ((AppStateApi) HMConfig.c.getValue()).getAreaBySave());
            }
            return b(str, str2);
        }
    }
}
