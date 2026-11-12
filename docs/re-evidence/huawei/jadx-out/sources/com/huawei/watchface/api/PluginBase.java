package com.huawei.watchface.api;

import android.content.Context;
import com.huawei.watchface.v3;

/* JADX INFO: loaded from: classes20.dex */
public class PluginBase {
    private PluginBaseAdapter mAdapter;

    public void finish() {
    }

    public PluginBaseAdapter getAdapter() {
        return (PluginBaseAdapter) v3.a(this.mAdapter);
    }

    public void init(Context context) {
    }

    public void setAdapter(PluginBaseAdapter pluginBaseAdapter) {
        this.mAdapter = (PluginBaseAdapter) v3.a(pluginBaseAdapter);
    }
}
