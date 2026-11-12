package com.huami.bluetooth.profile.step;

import com.huami.bluetooth.profile.data.DataCallback;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/step/RealtimeStepController;", "", "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "getStep", "Lcom/huami/bluetooth/profile/data/DataCallback;", "callback", "", "setStepCallback", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface RealtimeStepController {
    @Nullable
    RealtimeStep getStep();

    boolean setStepCallback(@Nullable DataCallback<? super RealtimeStep> callback);
}
