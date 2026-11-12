package com.xiaomi.smarthome.core.entity.plugin;

import android.content.Context;
import com.xiaomi.smarthome.core.entity.Error;
import com.xiaomi.smarthome.plugin.update.PluginError;
import com.xiaomi.smarthome.plugin_update.R;

/* JADX INFO: loaded from: classes10.dex */
public class WearPluginErrorTips {
    public static String getCodeString(Context context, int i) {
        switch (i) {
            case PluginError.START_STD_PLUGIN_ERROR_NO_PLUGIN /* -713 */:
                return context.getString(R.string.error_open_noplugin);
            case PluginError.INSTALLERROR_DYNAMICFEATURE /* -712 */:
                return context.getString(R.string.installerror_dynamicfeature);
            case PluginError.INSTALLERROR_TYPEINVAILD /* -711 */:
                return context.getString(R.string.installerror_typeinvaild);
            case PluginError.INSTALLERROR_INSTALLED /* -710 */:
                return context.getString(R.string.installerror_installed);
            case PluginError.INSTALLERROR_MODELVAILD /* -709 */:
                return context.getString(R.string.installerror_modelvaild);
            case PluginError.DOWNERROR_PLATFORM /* -708 */:
                return context.getString(R.string.installerror_platform);
            case PluginError.INSTALLERROR_MINLEVEL /* -707 */:
                return context.getString(R.string.installerror_minlevel);
            case PluginError.INSTALLERROR_DEVELOPER /* -706 */:
                return context.getString(R.string.installerror_developer);
            case PluginError.INSTALLERROR_NOEXITINFO /* -705 */:
                return context.getString(R.string.installerror_noexitinfo);
            case PluginError.INSTALLERROR_INSTALL /* -704 */:
                return context.getString(R.string.installerror_install);
            case PluginError.INSTALLERROR_INFOERROR /* -703 */:
                return context.getString(R.string.installerror_infoerror);
            case PluginError.INSTALLERROR_NOINFO /* -702 */:
                return context.getString(R.string.installerror_noinfo);
            case PluginError.INSTALLERROR_NODOWN /* -701 */:
                return context.getString(R.string.installerror_nodown);
            default:
                switch (i) {
                    case PluginError.DOWNERROR_APPVERSION /* -666 */:
                        return context.getString(R.string.downerror_appversion_wear);
                    case PluginError.DOWNERROR_DOWNED /* -665 */:
                        return context.getString(R.string.downerror_downed);
                    case PluginError.DOWNERROR_DOWNING /* -664 */:
                        return context.getString(R.string.downerror_downing);
                    case PluginError.DOWNERROR_DOWNERROR /* -663 */:
                        return context.getString(R.string.downerror_downerror);
                    case PluginError.DOWNERROR_INFOERROR /* -662 */:
                        return context.getString(R.string.downerror_infoerror);
                    case PluginError.DOWNERROR_NOPLUGIN /* -661 */:
                        return context.getString(R.string.downerror_noplugin);
                    default:
                        return getDefaultCodeString(context, i);
                }
        }
    }

    private static String getDefaultCodeString(Context context, int i) {
        switch (i) {
            case -99:
                return context.getString(R.string.code_infonull_error);
            case Error.CODE_CORE_MODEL_NULL /* -98 */:
                return context.getString(R.string.code_modelnull_error);
            case Error.CODE_CORE_SERVICE_STREAM_TOO_MUCH /* -97 */:
                return context.getString(R.string.code_streammuch_error);
            default:
                switch (i) {
                    case -6:
                        return context.getString(R.string.code_cancel_error);
                    case -5:
                        return context.getString(R.string.code_whitelist_error);
                    case -4:
                        return context.getString(R.string.code_offline_error);
                    case -3:
                        return context.getString(R.string.code_permissiondeny_error);
                    case -2:
                        return context.getString(R.string.code_serviceregister_error);
                    case -1:
                        return context.getString(R.string.code_unknown_error);
                    default:
                        return context.getString(R.string.code_default_error);
                }
        }
    }
}
