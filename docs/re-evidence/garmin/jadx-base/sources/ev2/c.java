package ev2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lev2/c;", "", "Ltv2/c;", "subtext", "", "lightColor", "darkColor", "<init>", "(Ltv2/c;Ljava/lang/Long;Ljava/lang/Long;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv2.c f66166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f66167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f66168c;

    public /* synthetic */ c(tv2.c cVar, Long l14, Long l15, int i14, j jVar) {
        this(cVar, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : l15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f66166a, cVar.f66166a) && s.g(this.f66167b, cVar.f66167b) && s.g(this.f66168c, cVar.f66168c);
    }

    public final int hashCode() {
        int iHashCode = this.f66166a.hashCode() * 31;
        Long l14 = this.f66167b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f66168c;
        return iHashCode2 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DoubleLabelOptions(subtext=");
        sb3.append(this.f66166a);
        sb3.append(", lightColor=");
        sb3.append(this.f66167b);
        sb3.append(", darkColor=");
        return p6.b.g(sb3, this.f66168c, ")");
    }

    public c(tv2.c cVar, Long l14, Long l15) {
        cVar.getClass();
        this.f66166a = cVar;
        this.f66167b = l14;
        this.f66168c = l15;
    }
}
