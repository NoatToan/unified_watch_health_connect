package fd1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfd1/b;", "", "Li53/c;", "Lfd1/a;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "formattedDate", "<init>", "(Li53/c;Ljava/lang/String;)V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<a> f70479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70480b;

    public b(i53.c<a> cVar, String str) {
        cVar.getClass();
        str.getClass();
        this.f70479a = cVar;
        this.f70480b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f70479a.equals(bVar.f70479a) && this.f70480b.equals(bVar.f70480b);
    }

    public final int hashCode() {
        return this.f70480b.hashCode() + (this.f70479a.hashCode() * 31);
    }

    public final String toString() {
        return "RacePredictorChartHoverEntries(entries=" + this.f70479a + ", formattedDate=" + this.f70480b + ")";
    }
}
