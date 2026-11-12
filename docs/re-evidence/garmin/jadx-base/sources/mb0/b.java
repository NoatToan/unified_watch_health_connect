package mb0;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmb0/b;", "", "Lmb0/h;", "weekday", "Lmb0/c;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Lmb0/h;Lmb0/c;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f117715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f117716b;

    public b(h hVar, c cVar) {
        hVar.getClass();
        cVar.getClass();
        this.f117715a = hVar;
        this.f117716b = cVar;
    }

    public static b a(b bVar, c cVar) {
        h hVar = bVar.f117715a;
        cVar.getClass();
        return new b(hVar, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f117715a == bVar.f117715a && this.f117716b == bVar.f117716b;
    }

    public final int hashCode() {
        return this.f117716b.hashCode() + (this.f117715a.hashCode() * 31);
    }

    public final String toString() {
        return "DayOfWeekItem(weekday=" + this.f117715a + ", state=" + this.f117716b + ")";
    }
}
