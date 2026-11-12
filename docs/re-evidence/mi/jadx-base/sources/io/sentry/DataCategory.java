package io.sentry;

import com.google.android.gms.common.Scopes;
import com.mibi.sdk.common.CommonConstants;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public enum DataCategory {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session(CommonConstants.KEY_SESSION),
    Attachment("attachment"),
    Monitor(com.xiaomi.onetrack.a.a.C0830a.f13696b),
    Profile(Scopes.PROFILE),
    MetricBucket("metric_bucket"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    DataCategory(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
