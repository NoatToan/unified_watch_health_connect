package com.huami.device.core.agps.impl.upgrade;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/huami/device/core/agps/impl/upgrade/Listener;", "", "", "onStart", "onStop", "", "isSuccess", "", "errorCode", "onResult", "(ZLjava/lang/Integer;)V", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public interface Listener {
    void onProgress(@NotNull Progress progress);

    void onResult(boolean isSuccess, @Nullable Integer errorCode);

    void onStart();

    void onStop();
}
