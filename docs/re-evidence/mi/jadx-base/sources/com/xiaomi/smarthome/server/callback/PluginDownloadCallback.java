package com.xiaomi.smarthome.server.callback;

import com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PluginDownloadCallback {
    public abstract void onCancel(String str);

    public abstract void onDownInfoSuccess(ArrayList<PluginDownloadTask> arrayList);

    public abstract void onFailure(String str, int i);

    public abstract void onProgress(String str, float f);

    public abstract void onStart(ArrayList<PluginDownloadTask> arrayList);

    public abstract void onSuccess(String str);
}
