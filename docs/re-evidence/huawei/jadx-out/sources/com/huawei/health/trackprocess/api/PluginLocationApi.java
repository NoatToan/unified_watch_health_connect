package com.huawei.health.trackprocess.api;

import android.content.Context;
import com.huawei.health.trackprocess.callback.PluginCloudTrackCallback;
import com.huawei.health.trackprocess.callback.PluginTrackMapCallback;
import defpackage.ile;
import defpackage.ilg;
import defpackage.ilh;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface PluginLocationApi {
    void getCloudTrack(PluginCloudTrackCallback pluginCloudTrackCallback);

    ile getEphRequest(List<String> list);

    Map<String, String> getEphResponse(ilh ilhVar);

    int getOptimizedTrack(String str, String str2, boolean z, PluginTrackMapCallback pluginTrackMapCallback, boolean z2, String str3, String str4);

    void pluginRxnGenerateEphemeris();

    void pluginRxnNativeInit();

    void postMotionPath(List<ilg> list);

    void setContext(Context context);

    void setExtraData(boolean z, boolean z2, Context context, String str);

    void setSerCountry(String str);
}
