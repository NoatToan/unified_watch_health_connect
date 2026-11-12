package jg2;

import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljg2/d;", "", "Ljava/util/UUID;", "sessionUuid", "Lyf2/a;", "valueEstimationType", "<init>", "(Ljava/util/UUID;Lyf2/a;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f98736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf2.a f98737b;

    public d(UUID uuid, yf2.a aVar) {
        uuid.getClass();
        aVar.getClass();
        this.f98736a = uuid;
        this.f98737b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f98736a.equals(dVar.f98736a) && this.f98737b == dVar.f98737b;
    }

    public final int hashCode() {
        return this.f98737b.hashCode() + (this.f98736a.hashCode() * 31);
    }

    public final String toString() {
        return "ValueEstimationSessionInfo(sessionUuid=" + this.f98736a + ", valueEstimationType=" + this.f98737b + ")";
    }
}
