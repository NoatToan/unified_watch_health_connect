package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class ldo extends x92 {
    public final PluginPackageInfo c;

    public ldo(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo) {
        super(deviceStat);
        this.c = pluginPackageInfo;
    }

    public static File f(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        String strB = x92.b(context);
        StringBuilder sb = new StringBuilder();
        sb.append("plugin");
        String str2 = File.separator;
        sb.append(str2);
        sb.append(PluginPackageConstant.RN_INSTALL_DIR_KEY);
        sb.append(str2);
        sb.append("rn");
        sb.append(str2);
        sb.append(FileUtils.STD_PLUGIN_STORAGE_PATH_KEY);
        sb.append(str2);
        sb.append("data");
        sb.append(str2);
        File file = new File(new File(strB, sb.toString()), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // defpackage.gwc
    public String a() {
        PluginPackageInfo pluginPackageInfo = this.c;
        return pluginPackageInfo != null ? pluginPackageInfo.getPackagePath() : "";
    }

    public final File d() {
        return e(c(), getDevice());
    }

    public final File e(Context context, DeviceStat deviceStat) {
        String str;
        if (deviceStat == null || TextUtils.isEmpty(deviceStat.did)) {
            MRnLog.w("StdPluginFileManager", "getDeviceId: device is null or did is empty");
            str = "0";
        } else {
            str = deviceStat.did;
        }
        return f(context, str);
    }

    @Override // defpackage.gwc
    public File getPluginDir(Context context, PluginPackageInfo pluginPackageInfo) {
        return e(context, getDevice());
    }

    @Override // defpackage.gwc
    public File getPluginDirWithDid(Context context, PluginPackageInfo pluginPackageInfo, String str) {
        return f(context, str);
    }

    @Override // defpackage.gwc
    public File getPluginFilesPath(Context context, PluginPackageInfo pluginPackageInfo, DeviceStat deviceStat) {
        File file = new File(e(c(), deviceStat), "files");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // defpackage.gwc
    public SharedPreferences getSharedPreferences() {
        return getSharedPreferencesV2();
    }

    @Override // defpackage.gwc
    public SharedPreferences getSharedPreferencesV2() {
        return nam.r(new File(d(), "config.xml"));
    }

    @Override // defpackage.gwc
    public File getTempFilesPath() {
        File file = new File(d(), "plugin_temp_files");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
