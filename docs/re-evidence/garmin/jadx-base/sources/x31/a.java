package x31;

import p005kotlin.Metadata;
import q6.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx31/a;", "", "", "weeklyAverage", "", "markerValue", "Lx31/b;", "status", "<init>", "(IFLx31/b;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f188574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f188575c;

    public a(int i14, float f14, b bVar) {
        bVar.getClass();
        this.f188573a = i14;
        this.f188574b = f14;
        this.f188575c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f188573a == aVar.f188573a && Float.compare(this.f188574b, aVar.f188574b) == 0 && this.f188575c == aVar.f188575c;
    }

    public final int hashCode() {
        return this.f188575c.hashCode() + f.d(this.f188574b, Integer.hashCode(this.f188573a) * 31, 31);
    }

    public final String toString() {
        return "OHRVMarkerStatus(weeklyAverage=" + this.f188573a + ", markerValue=" + this.f188574b + ", status=" + this.f188575c + ")";
    }
}
