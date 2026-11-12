package com.xiaomi.hm.health.bt.profile.gdsp.common.callback;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/callback/IGdspAnalyticCallback;", "", "", "dataType", "dataSize", "", "onStart", "onSuccess", "errorCode", "", "reason", "onError", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IGdspAnalyticCallback {
    void onError(int dataType, int errorCode, @NotNull String reason);

    void onStart(int dataType, int dataSize);

    void onSuccess(int dataType);
}
