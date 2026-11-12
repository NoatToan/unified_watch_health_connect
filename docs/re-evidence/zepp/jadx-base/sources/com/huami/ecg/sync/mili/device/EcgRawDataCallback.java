package com.huami.ecg.sync.mili.device;

import com.huami.ecg.sync.mili.model.EcgSyncInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/huami/ecg/sync/mili/device/EcgRawDataCallback;", "", "", "onStart", "Lcom/huami/ecg/sync/mili/model/EcgSyncInfo;", "data", "onData", "", "result", "onFinish", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface EcgRawDataCallback {
    void onData(@Nullable EcgSyncInfo data);

    void onFinish(boolean result);

    void onStart();
}
