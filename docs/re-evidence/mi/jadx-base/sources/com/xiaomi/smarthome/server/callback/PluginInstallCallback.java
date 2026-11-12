package com.xiaomi.smarthome.server.callback;

/* JADX INFO: loaded from: classes2.dex */
public interface PluginInstallCallback {
    void onCancel(String str);

    void onFailure(String str, int i);

    void onStart(String str);

    void onSuccess(String str);
}
