package com.xiaomi.fitness.route.track.push;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/route/track/push/TrackPushCallback;", "", LifecycleConstantKt.ON_START, "", "onProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "success", "", "code", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TrackPushCallback {
    void onFinish(boolean success, int code);

    void onProgress(int progress);

    void onStart();
}
