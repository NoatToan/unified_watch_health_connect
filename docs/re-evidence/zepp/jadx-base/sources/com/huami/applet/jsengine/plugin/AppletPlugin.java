package com.huami.applet.jsengine.plugin;

import androidx.annotation.WorkerThread;
import kotlin.Metadata;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH'¨\u0006\f"}, d2 = {"Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "", "", "", "moduleName", "()[Ljava/lang/String;", "actionNames", Argument.ELEM_NAME, "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "result", "", "invokeMethod", "applet_release"}, k = 1, mv = {1, 5, 1})
public interface AppletPlugin {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static String[] actionNames(@NotNull AppletPlugin appletPlugin) {
            return new String[0];
        }

        @NotNull
        public static String[] moduleName(@NotNull AppletPlugin appletPlugin) {
            return new String[0];
        }
    }

    @NotNull
    String[] actionNames();

    @WorkerThread
    void invokeMethod(@NotNull String argument, @NotNull JavascriptExecuteInterface result);

    @NotNull
    String[] moduleName();
}
