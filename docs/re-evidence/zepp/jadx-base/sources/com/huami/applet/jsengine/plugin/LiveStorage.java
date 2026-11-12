package com.huami.applet.jsengine.plugin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\f"}, d2 = {"Lcom/huami/applet/jsengine/plugin/LiveStorage;", "Lcom/huami/applet/jsengine/plugin/AbsStorage;", "", "", "moduleName", "()[Ljava/lang/String;", "actionNames", "Lcom/huami/applet/jsengine/plugin/StorageBean;", "storageBean", "fileName", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class LiveStorage extends AbsStorage {
    @Override // com.huami.applet.jsengine.plugin.AbsStorage, com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] actionNames() {
        return new String[]{"getLiveStorage", "setLiveStorage", "removeLiveStorage", "clearLiveStorage"};
    }

    @Override // com.huami.applet.jsengine.plugin.AbsStorage
    @NotNull
    public String fileName(@NotNull StorageBean storageBean) {
        return "live-" + storageBean.getParams().getDevId() + '-' + ((Object) storageBean.getParams().getLId());
    }

    @Override // com.huami.applet.jsengine.plugin.AbsStorage, com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] moduleName() {
        return new String[]{"worker.service.liveStorage"};
    }
}
