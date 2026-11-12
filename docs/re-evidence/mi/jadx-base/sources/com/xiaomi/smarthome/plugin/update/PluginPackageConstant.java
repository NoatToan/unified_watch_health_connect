package com.xiaomi.smarthome.plugin.update;

import com.xiaomi.smarthome.newui.utils.NumberUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.File;
import java.util.Comparator;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes2.dex */
public class PluginPackageConstant {
    public static final String ACTION_DEVICE_DELETED = "device_was_deleted";
    public static final String ACTION_DOWNRNSDK = "downrnsdk_action";
    public static final String ACTION_RN_PLUGIN_SWITCH_CHANGED = "rn_plugin_darkmode_switch_changed";
    public static final long CHECK_ALL_PLUGIN_DELAY = 120000;
    public static final Comparator<? super String> COM_S2B = new Comparator() { // from class: a2i
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return PluginPackageConstant.lambda$static$0((String) obj, (String) obj2);
        }
    };
    public static final String KEY_RNSDK_API_LEVEL = "sdk_api_level";
    public static final String KEY_RNSDK_PATH = "path";
    public static final String KEY_RNSDK_TIMESTAMP = "timestamp";
    public static final String KEY_RN_SDK_IS_FORBIDDEN = "rn_sdk_is_forbidden";
    public static final String KEY_RN_SDK_MAX_API_LEVEL = "max_rn_sdk";
    public static final int MSG_DELETE_OLD_PLUGIN = 27;
    public static final int MSG_DELETE_PLUGIN = 26;
    public static final int MSG_DOWNLOAD_DEBUG_PLUGIN = 18;
    public static final int MSG_ON_SERVER_CHANGED = 4;
    public static final int MSG_PROCESS_AFTER_RN_INSTALLED = 25;
    public static final int MSG_PROCESS_RN_SDK = 24;
    public static final String PLUGIN_RECORD_LIST_PREF = "plugin_record_list.parcel2";
    public static final String PLUGIN_TYPE_APK = "apk";
    public static final String PLUGIN_TYPE_H5 = "h5";
    public static final String PLUGIN_TYPE_MPK = "mpk";
    public static final String PLUGIN_TYPE_RN = "rn";
    public static final String PLUGIN_TYPE_RN_SDK = "rnsdk";
    public static final String RN_BUNDLE_HASH_ALGORITHM = "SHA-256";
    public static final String RN_BUNDLE_SIGNATURE_ALGORITHM = "SHA256withECDSA";
    public static final String RN_CERT_FLAG = "-----BEGIN ";
    public static final String RN_CONF_A = "conf.json";
    public static final String RN_CONF_B = "_conf.json";
    public static final String RN_DIR_A = "android";
    public static final String RN_DIR_B = "_android";
    public static final String RN_DOWNLOAD_DIR_KEY = "download";
    public static final String RN_INSTALL_DIR_KEY = "install";
    public static final String RN_PROJECT_JSON = "project.json";
    public static final String RN_SDK_CONFIG_FILE_PATH_SUFFIX;
    public static final String RN_SDK_DIR_KEY = "rnsdk";
    public static final int RN_SDK_DOWNLOADED = 5;
    public static final int RN_SDK_DOWNLOADING = 4;
    public static final int RN_SDK_FAILURE = 1;
    public static final int RN_SDK_FORBIDDEN = 10;
    public static final int RN_SDK_INSTALLED = 7;
    public static final int RN_SDK_INSTALLING = 6;
    public static final String RN_SDK_INSTALL_PATH_SUFFIX;
    public static final String RN_SDK_TIMESTAMP_FORBIDDEN = "!";
    public static final String RN_SDK_TIMESTAMP_PREFIX = "#";
    public static final int RN_SDK_UNKNOWN = 0;
    public static final int RN_SDK_UPDATED = 3;
    public static final int RN_SDK_UPDATING = 2;
    public static final int RN_SIGNATURE_LEN_MIN = 1024;

    static {
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append("plugin");
        sb.append(str);
        sb.append("rnsdk");
        String string = sb.toString();
        RN_SDK_INSTALL_PATH_SUFFIX = string;
        RN_SDK_CONFIG_FILE_PATH_SUFFIX = string + "_config";
    }

    public static final boolean IS_VALID_RN_PACKAGE_ID(long j) {
        return j >= FolmeCore.NANOS_TO_MS;
    }

    public static final boolean IS_VALID_RN_PLUGIN_ID(long j) {
        return j >= FolmeCore.NANOS_TO_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(String str, String str2) {
        return NumberUtils.valueOf((Object) str.replaceAll("\\D+", ""), 0) - NumberUtils.valueOf((Object) str2.replaceAll("\\D+", ""), 0);
    }
}
