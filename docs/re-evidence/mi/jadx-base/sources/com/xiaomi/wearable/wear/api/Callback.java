package com.xiaomi.wearable.wear.api;

import com.xiaomi.wearable.core.WearApiResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/wearable/wear/api/Callback;", "", "onCallback", "", "result", "Lcom/xiaomi/wearable/core/WearApiResult;", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Callback {
    void onCallback(@Nullable WearApiResult result);
}
