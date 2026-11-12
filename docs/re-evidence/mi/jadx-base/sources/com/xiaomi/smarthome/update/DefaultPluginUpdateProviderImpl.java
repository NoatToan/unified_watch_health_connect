package com.xiaomi.smarthome.update;

import android.app.NotificationManager;
import android.content.Context;
import com.xiaomi.smarthome.core.entity.externalload.LoadInfo;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.core.server.internal.plugin.util.Callback;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultPluginUpdateProviderImpl implements IPluginUpdateProvider {
    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void addInnerPackage() {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void addStatRecord(String str, String str2) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void downExternal(String str, Callback<LoadInfo, Integer> callback) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void downloadRnExtModules(Callback<Integer, Integer> callback) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public String getDeveloperInfo(long j) {
        return null;
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public ServerBean getGlobalSettingServer() {
        return null;
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public int getLoadInfoStatus(String str) {
        return 0;
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public String getMid() {
        return null;
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public String getPluginChannelId(NotificationManager notificationManager, Context context) {
        return null;
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void getXmPluginPackage(PluginPackageInfo pluginPackageInfo) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public boolean isWhiteListContained(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void loadExternal(String str, Callback<LoadInfo, Integer> callback) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void reportDownloadRes(String str, String str2, String str3, int i, long j) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void reportRNDownloadErr(String str, String str2, Map<String, Object> map) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void reportRealDownloadRes(String str, String str2, String str3, String str4, String str5, int i) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void reportRnData(String str, Map<Object, Object> map) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void reportRnInstallDetailRes(String str, String str2, int i) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void reportRnPluginInstallRes(String str, String str2, int i) {
    }

    @Override // com.xiaomi.smarthome.update.IPluginUpdateProvider
    public void startCopySoTask(String str, String str2) {
    }
}
