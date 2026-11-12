package com.huami.applet.jsengine.plugin;

import com.huami.applet.extension.BooleanExt;
import com.huami.applet.extension.JavascriptExecuteExtKt;
import com.huami.applet.extension.Otherwise;
import com.huami.applet.extension.WithData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0014J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0014"}, d2 = {"Lcom/huami/applet/jsengine/plugin/SettingsStorage;", "Lcom/huami/applet/jsengine/plugin/AbsStorage;", "Lcom/huami/applet/jsengine/plugin/Params;", "params", "", "f", "g", "", "", "moduleName", "()[Ljava/lang/String;", "actionNames", "Lcom/huami/applet/jsengine/plugin/StorageBean;", "storageBean", "fileName", "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "result", "packSetRemoveClearNotify", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class SettingsStorage extends AbsStorage {
    private final void f(Params params) {
        String str = "{\"jsonrpc\": \"hmV1.0\",\"method\": {\"module\": \"message.notification.launch\",\"action\": \"settingsChanged\"},\"params\":" + ((Object) getGson().toJson(params)) + '}';
        JavascriptExecuteExtKt.onRpcMainMessage(str);
        JavascriptExecuteExtKt.onRpcSampleMessage(str);
    }

    private final void g(Params params) {
        String str = "{\"jsonrpc\": \"hmV1.0\",\"method\": {\"module\": \"message.notification.settingsStorage\",\"action\": \"settingsChanged\"},\"params\":" + ((Object) getGson().toJson(params)) + '}';
        JavascriptExecuteExtKt.onRpcSettingMessage(str);
        JavascriptExecuteExtKt.onRpcSampleMessage(str);
    }

    @Override // com.huami.applet.jsengine.plugin.AbsStorage, com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] actionNames() {
        return new String[]{"getSettingsStorage", "setSettingsStorage", "removeSettingsStorage", "clearSettingsStorage"};
    }

    @Override // com.huami.applet.jsengine.plugin.AbsStorage
    @NotNull
    public String fileName(@NotNull StorageBean storageBean) {
        return Intrinsics.stringPlus("setting-", Integer.valueOf(storageBean.getParams().getAppId()));
    }

    @Override // com.huami.applet.jsengine.plugin.AbsStorage, com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] moduleName() {
        return new String[]{"appSettings.framework.settingsStorage", "worker.framework.settingsStorage"};
    }

    @Override // com.huami.applet.jsengine.plugin.AbsStorage
    public void packSetRemoveClearNotify(@NotNull JavascriptExecuteInterface result, @NotNull Params params) {
        BooleanExt withData;
        if (Intrinsics.areEqual("main", result.getName())) {
            g(params);
            withData = new WithData(Unit.INSTANCE);
        } else {
            withData = Otherwise.INSTANCE;
        }
        if (withData instanceof Otherwise) {
            f(params);
        } else {
            if (!(withData instanceof WithData)) {
                throw new NoWhenBranchMatchedException();
            }
            ((WithData) withData).getData();
        }
    }
}
