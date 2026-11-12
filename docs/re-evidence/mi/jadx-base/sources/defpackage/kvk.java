package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.PluginUtils;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class kvk implements IRnRuntimeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gwc f24341a;

    public final gwc a() {
        DeviceStat deviceStat = getDeviceStat();
        gwc gwcVar = this.f24341a;
        if (gwcVar == null || gwcVar.getDevice() == null || b(deviceStat, this.f24341a.getDevice())) {
            this.f24341a = z1i.a(deviceStat, getPluginRecord());
        }
        return this.f24341a;
    }

    public final boolean b(DeviceStat deviceStat, DeviceStat deviceStat2) {
        if (deviceStat == null && deviceStat2 == null) {
            return true;
        }
        if (deviceStat == null || deviceStat2 == null) {
            return false;
        }
        String str = deviceStat.did;
        return str != null && str.equals(deviceStat2.did);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public void closeCurrentPage(ReadableMap readableMap) {
        mvk.e().g().closeCurrentPage(readableMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public Bundle getActivityBundle() {
        return mvk.e().g().getActivityBundle();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public IRNRuntime getCurrentRuntime() {
        return mvk.e().g().getCurrentRuntime();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public DeviceStat getDeviceStat() {
        return mvk.e().g().getDeviceStat();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public String getLanguageStr() {
        return mvk.e().g().getLanguageStr();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public String getPluginBundlePath() {
        PluginPackageInfo pluginRecord = getPluginRecord();
        if (pluginRecord == null) {
            return "";
        }
        return PluginUtils.getRnPackageRealPath(pluginRecord.getPackagePath()) + File.separator;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public File getPluginDir(Context context, PluginPackageInfo pluginPackageInfo) {
        return a().getPluginDir(context, pluginPackageInfo);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public File getPluginDirWithDid(Context context, PluginPackageInfo pluginPackageInfo, String str) {
        return a().getPluginDirWithDid(context, pluginPackageInfo, str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public File getPluginFilesPath(Context context, PluginPackageInfo pluginPackageInfo, DeviceStat deviceStat) {
        return a().getPluginFilesPath(context, pluginPackageInfo, deviceStat);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public RnPluginDeviceInfo getPluginInfo() {
        return mvk.e().g().getPluginInfo();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public PluginPackageInfo getPluginRecord() {
        return mvk.e().g().getPluginRecord();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public String getSdkBundlePath() {
        return mvk.e().g().getSdkBundlePath();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public SharedPreferences getSharedPreferences() {
        return a().getSharedPreferences();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public SharedPreferences getSharedPreferencesV2() {
        return a().getSharedPreferencesV2();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public String getStringfyPluginDeviceInfo(String str) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public File getTempFilesPath() {
        return a().getTempFilesPath();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public WritableMap handleEntryExtraMessage(IRNRuntime iRNRuntime) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        WritableMap sceneExtra = iRNRuntime.getSceneExtra();
        writableMapCreateMap.putString("entrance", FaceSchema.FACE_PAGE_MAIN);
        writableMapCreateMap2.putString("extra", MIOTUtils.getString(sceneExtra, "extra"));
        writableMapCreateMap.putMap("info", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public boolean isInPlugin() {
        return false;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public boolean isRNPluginHasDarkMode() {
        return true;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public boolean isReleaseBuildType() {
        return mvk.e().g().isReleaseBuildType();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public void sendEvent(String str, Object obj) {
        mvk.e().g().sendEvent(str, obj);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider
    public void setHideSystemSlider(boolean z) {
    }
}
