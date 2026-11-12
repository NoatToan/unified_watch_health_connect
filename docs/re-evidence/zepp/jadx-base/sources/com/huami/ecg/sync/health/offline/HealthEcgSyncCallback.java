package com.huami.ecg.sync.health.offline;

import com.huami.ecg.sync.health.model.EcgInput;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/huami/ecg/sync/health/offline/HealthEcgSyncCallback;", "", "", "onStart", "", "progress", "onProgress", "", "Lcom/huami/ecg/sync/health/model/EcgInput;", "data", "onData", "", "result", "onFinish", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface HealthEcgSyncCallback {
    void onData(@Nullable List<EcgInput> data);

    void onFinish(boolean result);

    void onProgress(int progress);

    void onStart();
}
