package vz0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvz0/c;", "", "", "modifiedEventKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    EVENT_DATE("EVENT_DATE"),
    EVENT_TIME("EVENT_TIME"),
    EVENT_LOCATION("EVENT_LOCATION"),
    EVENT_WEBSITE("EVENT_WEBSITE"),
    EVENT_NAME("EVENT_NAME"),
    EVENT_TYPE("EVENT_TYPE"),
    EVENT_NOTES("EVENT_NOTES"),
    COMPLETION_TARGET("COMPLETION_TARGET");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180889a;

    c(String str) {
        this.f180889a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF180889a() {
        return this.f180889a;
    }
}
