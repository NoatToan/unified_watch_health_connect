package com.xiaomi.smarthome.update;

import android.app.NotificationManager;
import android.content.Context;
import com.xiaomi.smarthome.core.entity.externalload.LoadInfo;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.core.server.internal.plugin.util.Callback;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IPluginUpdateProvider {
    void addInnerPackage();

    void addStatRecord(String str, String str2);

    void downExternal(String str, Callback<LoadInfo, Integer> callback);

    void downloadRnExtModules(Callback<Integer, Integer> callback);

    String getDeveloperInfo(long j);

    ServerBean getGlobalSettingServer();

    int getLoadInfoStatus(String str);

    String getMid();

    String getPluginChannelId(NotificationManager notificationManager, Context context);

    void getXmPluginPackage(PluginPackageInfo pluginPackageInfo);

    boolean isWhiteListContained(String str);

    void loadExternal(String str, Callback<LoadInfo, Integer> callback);

    void reportDownloadRes(String str, String str2, String str3, int i, long j);

    void reportRNDownloadErr(String str, String str2, Map<String, Object> map);

    void reportRealDownloadRes(String str, String str2, String str3, String str4, String str5, int i);

    void reportRnData(String str, Map<Object, Object> map);

    void reportRnInstallDetailRes(String str, String str2, int i);

    void reportRnPluginInstallRes(String str, String str2, int i);

    void startCopySoTask(String str, String str2);
}
