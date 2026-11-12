package pi2;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpi2/f;", "", "", "eventName", "Landroid/os/Bundle;", "eventData", "", "eventCount", "", "eventTimestampMillis", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;IJ)V", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getEventData", "()Landroid/os/Bundle;", "I", "getEventCount", "()I", "J", "getEventTimestampMillis", "()J", "application-events_release"}, k = 1, mv = {1, 4, 0})
public abstract class f {
    private final int eventCount;
    private final Bundle eventData;
    private final String eventName;
    private final long eventTimestampMillis;

    public /* synthetic */ f(String str, Bundle bundle, int i14, long j8, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, (i15 & 2) != 0 ? null : bundle, (i15 & 4) != 0 ? 1 : i14, (i15 & 8) != 0 ? System.currentTimeMillis() : j8);
    }

    public final int getEventCount() {
        return this.eventCount;
    }

    public final Bundle getEventData() {
        return this.eventData;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final long getEventTimestampMillis() {
        return this.eventTimestampMillis;
    }

    public f(String str, Bundle bundle, int i14, long j8) {
        str.getClass();
        this.eventName = str;
        this.eventData = bundle;
        this.eventCount = i14;
        this.eventTimestampMillis = j8;
    }
}
