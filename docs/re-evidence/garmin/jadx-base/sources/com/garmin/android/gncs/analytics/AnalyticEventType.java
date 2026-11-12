package com.garmin.android.gncs.analytics;

import p005kotlin.Metadata;
import w13.a;
import w13.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/gncs/analytics/AnalyticEventType;", "", "eventName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "GNCS_SERVICE_NOT_BINDING", "NOT_IN_USE", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum AnalyticEventType {
    GNCS_SERVICE_NOT_BINDING("GNCS_SERVICE_NOT_BINDING"),
    NOT_IN_USE("GNCS_MAP_FIELDS_USED");

    private static final /* synthetic */ a $ENTRIES = b.g(values());
    private final String eventName;

    AnalyticEventType(String str) {
        this.eventName = str;
    }

    public static a<AnalyticEventType> getEntries() {
        return $ENTRIES;
    }

    public final String getEventName() {
        return this.eventName;
    }
}
