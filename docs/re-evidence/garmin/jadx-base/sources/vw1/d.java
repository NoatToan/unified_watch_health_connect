package vw1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import j23.g;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvw1/d;", "", "Lj23/g;", "Lorg/joda/time/LocalDate;", TtmlNode.RUBY_BASE, "build", "peak", "<init>", "(Lj23/g;Lj23/g;Lj23/g;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<LocalDate> f180564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<LocalDate> f180565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g<LocalDate> f180566c;

    public /* synthetic */ d(g gVar, g gVar2, g gVar3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : gVar, (i14 & 2) != 0 ? null : gVar2, (i14 & 4) != 0 ? null : gVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f180564a, dVar.f180564a) && s.g(this.f180565b, dVar.f180565b) && s.g(this.f180566c, dVar.f180566c);
    }

    public final int hashCode() {
        g<LocalDate> gVar = this.f180564a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        g<LocalDate> gVar2 = this.f180565b;
        int iHashCode2 = (iHashCode + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
        g<LocalDate> gVar3 = this.f180566c;
        return iHashCode2 + (gVar3 != null ? gVar3.hashCode() : 0);
    }

    public final String toString() {
        return "ITPPhaseDateRanges(base=" + this.f180564a + ", build=" + this.f180565b + ", peak=" + this.f180566c + ")";
    }

    public d(g<LocalDate> gVar, g<LocalDate> gVar2, g<LocalDate> gVar3) {
        this.f180564a = gVar;
        this.f180565b = gVar2;
        this.f180566c = gVar3;
    }

    public d() {
        this(null, null, null, 7, null);
    }
}
