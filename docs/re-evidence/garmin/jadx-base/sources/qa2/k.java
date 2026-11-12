package qa2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqa2/k;", "", "", "status", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum k {
    DATA_NOT_FOUND("DATA_NOT_FOUND"),
    DEFAULT_STATE("DEFAULT_STATE"),
    GENERIC_ERROR("ERROR"),
    IN_PROGRESS("IN_PROGRESS"),
    READY("READY"),
    SUCCESS("SUCCESS"),
    TOO_MANY_REQUESTS("TOO_MANY_REQUESTS");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143942a;

    k(String str) {
        this.f143942a = str;
    }
}
