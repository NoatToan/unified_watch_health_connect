package com.huami.tools.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.tools.analytics.internal.function.Function;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface Tracker {
    void enableAutoTrackPage(boolean z);

    @NonNull
    String getOriginalUploadHost();

    void record(HitEvent hitEvent);

    void recordPageEnd(@NonNull String str);

    void recordPageEnd(@NonNull String str, @Nullable Map<String, String> map);

    void recordPageStart(@NonNull String str);

    void setDebug(boolean z);

    @Deprecated
    void setRegion(String str);

    void setUid(String str);

    void setUploadHostMapper(@NonNull Function<String, String> function);
}
