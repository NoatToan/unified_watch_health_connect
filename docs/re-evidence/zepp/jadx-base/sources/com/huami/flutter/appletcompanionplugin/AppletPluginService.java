package com.huami.flutter.appletcompanionplugin;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/flutter/appletcompanionplugin/AppletPluginService;", "", "", "deviceSource", "", "hasJsAppNeedUpgrade", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hostUrl", "isJsAppDeveloper", "appId", "Lcom/huami/flutter/appletcompanionplugin/HasJsAppInstalledCallback;", "hasJsAppInstalledCallback", "", "hasJsAppInstalled", "applet_companion_plugin_release"}, k = 1, mv = {1, 5, 1})
public interface AppletPluginService {
    void hasJsAppInstalled(@NotNull String appId, @NotNull HasJsAppInstalledCallback hasJsAppInstalledCallback);

    @Nullable
    Object hasJsAppNeedUpgrade(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    boolean isJsAppDeveloper(@NotNull String hostUrl);
}
