package com.xiaomi.hm.health.device.webapi.earbud;

import com.xiaomi.hm.health.databases.model.EarbudDateData;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface DownloadEarbudHealthDataCallback {
    void downloadHealthDataResult(boolean z, List<EarbudDateData> list);
}
