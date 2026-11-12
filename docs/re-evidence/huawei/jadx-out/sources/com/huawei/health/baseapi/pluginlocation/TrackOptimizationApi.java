package com.huawei.health.baseapi.pluginlocation;

import android.content.Context;
import com.huawei.health.baseapi.pluginlocation.callback.HwPluginCloudTrackCallback;
import com.huawei.health.baseapi.pluginlocation.callback.HwPluginTrackMapCallback;
import defpackage.gqm;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public interface TrackOptimizationApi {
    void getCloudTrack(HwPluginCloudTrackCallback hwPluginCloudTrackCallback);

    int getOptimizedTrack(String str, String str2, String str3, boolean z, HwPluginTrackMapCallback hwPluginTrackMapCallback, boolean z2, String str4);

    void postMotionPath(List<gqm> list);

    void setExtraData(boolean z, boolean z2, Context context, String str);
}
