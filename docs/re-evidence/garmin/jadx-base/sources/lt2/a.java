package lt2;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Llt2/a;", "", "Lmt2/c;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "value", "Lmt2/b;", "prefix", "Lmt2/a;", "preferredUnit", "<init>", "(Lmt2/c;DLmt2/b;Lmt2/a;)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt2.c f114866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f114867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mt2.b f114868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mt2.a f114869d;

    public /* synthetic */ a(mt2.c cVar, double d14, mt2.b bVar, mt2.a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? 0.0d : d14, (i14 & 4) != 0 ? null : bVar, (i14 & 8) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f114866a == aVar.f114866a && Double.compare(this.f114867b, aVar.f114867b) == 0 && this.f114868c == aVar.f114868c && this.f114869d == aVar.f114869d;
    }

    public final int hashCode() {
        mt2.c cVar = this.f114866a;
        int iB = org.apache.commons.lang3.e.b((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.f114867b);
        mt2.b bVar = this.f114868c;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        mt2.a aVar = this.f114869d;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CommonEndCondition(type=" + this.f114866a + ", value=" + this.f114867b + ", prefix=" + this.f114868c + ", preferredUnit=" + this.f114869d + ")";
    }

    public a(mt2.c cVar, double d14, mt2.b bVar, mt2.a aVar) {
        this.f114866a = cVar;
        this.f114867b = d14;
        this.f114868c = bVar;
        this.f114869d = aVar;
    }

    public a() {
        this(null, 0.0d, null, null, 15, null);
    }
}
