package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public interface gwc {
    String a();

    DeviceStat getDevice();

    File getPluginDir(Context context, PluginPackageInfo pluginPackageInfo);

    File getPluginDirWithDid(Context context, PluginPackageInfo pluginPackageInfo, String str);

    File getPluginFilesPath(Context context, PluginPackageInfo pluginPackageInfo, DeviceStat deviceStat);

    SharedPreferences getSharedPreferences();

    SharedPreferences getSharedPreferencesV2();

    File getTempFilesPath();
}
