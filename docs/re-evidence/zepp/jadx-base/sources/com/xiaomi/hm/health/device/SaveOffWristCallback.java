package com.xiaomi.hm.health.device;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/SaveOffWristCallback;", "", "", "onStart", "", "result", "onFinish", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface SaveOffWristCallback {
    void onFinish(boolean result);

    void onStart();
}
