package defpackage;

import android.content.Context;
import com.huawei.pluginbase.PluginBaseAdapter;

/* JADX INFO: loaded from: classes.dex */
public class pbx {
    private PluginBaseAdapter mAdapter;

    public void finish() {
    }

    public void init(Context context) {
    }

    public PluginBaseAdapter getAdapter() {
        return (PluginBaseAdapter) lst.d(this.mAdapter);
    }

    public void setAdapter(PluginBaseAdapter pluginBaseAdapter) {
        this.mAdapter = (PluginBaseAdapter) lst.d(pluginBaseAdapter);
    }
}
