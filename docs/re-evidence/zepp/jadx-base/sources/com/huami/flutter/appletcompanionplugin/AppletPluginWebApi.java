package com.huami.flutter.appletcompanionplugin;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/huami/flutter/appletcompanionplugin/AppletPluginWebApi;", "", "", "deviceSource", "idListStr", "", "Lcom/huami/flutter/appletcompanionplugin/Datum;", "getJsAppListInfoFromCloud", "hostUrl", "Lcom/huami/flutter/appletcompanionplugin/JsAppDeveloperInfoData;", "getJsAppDeveloperInfo", "applet_companion_plugin_release"}, k = 1, mv = {1, 5, 1})
public interface AppletPluginWebApi {
    @Nullable
    JsAppDeveloperInfoData getJsAppDeveloperInfo(@NotNull String hostUrl);

    @Nullable
    List<Datum> getJsAppListInfoFromCloud(@NotNull String deviceSource, @NotNull String idListStr);
}
