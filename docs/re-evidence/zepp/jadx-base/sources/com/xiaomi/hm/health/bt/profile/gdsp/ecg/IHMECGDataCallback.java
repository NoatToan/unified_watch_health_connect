package com.xiaomi.hm.health.bt.profile.gdsp.ecg;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/ecg/IHMECGDataCallback;", "", "", "onStart", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/ecg/EcgData;", "data", "onData", "", "result", "onFinish", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IHMECGDataCallback {
    void onData(@NotNull List<EcgData> data);

    void onFinish(boolean result);

    void onProgress(@NotNull Progress progress);

    void onStart();
}
