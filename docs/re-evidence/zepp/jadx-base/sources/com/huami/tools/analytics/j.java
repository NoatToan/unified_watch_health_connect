package com.huami.tools.analytics;

import androidx.annotation.NonNull;
import com.huami.tools.analytics.internal.function.Function;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
class j implements Tracker {
    @Override // com.huami.tools.analytics.Tracker
    public void enableAutoTrackPage(boolean z) {
    }

    @Override // com.huami.tools.analytics.Tracker
    @NonNull
    public String getOriginalUploadHost() {
        return "";
    }

    @Override // com.huami.tools.analytics.Tracker
    public void record(HitEvent hitEvent) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void recordPageEnd(@NonNull String str) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void recordPageEnd(@NonNull String str, Map<String, String> map) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void recordPageStart(@NonNull String str) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setDebug(boolean z) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setRegion(String str) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setUid(String str) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setUploadHostMapper(@NonNull Function<String, String> function) {
    }
}
