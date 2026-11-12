package my1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmy1/a;", "", "Lab1/g;", "powerGuide", "Lw01/c;", "nutritionAndHydrationDetails", "<init>", "(Lab1/g;Lw01/c;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab1.g f121476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w01.c f121477b;

    public /* synthetic */ a(ab1.g gVar, w01.c cVar, int i14, j jVar) {
        this(gVar, (i14 & 2) != 0 ? null : cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f121476a, aVar.f121476a) && s.g(this.f121477b, aVar.f121477b);
    }

    public final int hashCode() {
        ab1.g gVar = this.f121476a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        w01.c cVar = this.f121477b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "CyclingEventStrategyData(powerGuide=" + this.f121476a + ", nutritionAndHydrationDetails=" + this.f121477b + ")";
    }

    public a(ab1.g gVar, w01.c cVar) {
        this.f121476a = gVar;
        this.f121477b = cVar;
    }
}
