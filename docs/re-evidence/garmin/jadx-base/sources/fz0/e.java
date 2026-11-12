package fz0;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfz0/e;", "", "Lorg/joda/time/DateTime;", "date", "<init>", "(Lorg/joda/time/DateTime;)V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f73972a;

    public e(DateTime dateTime) {
        dateTime.getClass();
        this.f73972a = dateTime;
    }

    public final String toString() {
        String string = this.f73972a.toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
        string.getClass();
        return string;
    }
}
