package dh0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldh0/n;", "", "Ldh0/l;", TtmlNode.START, TtmlNode.CENTER, TtmlNode.END, "<init>", "(Ldh0/l;Ldh0/l;Ldh0/l;)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f59614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f59615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f59616c;

    public /* synthetic */ n(l lVar, l lVar2, l lVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : lVar, (i14 & 2) != 0 ? null : lVar2, (i14 & 4) != 0 ? null : lVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f59614a, nVar.f59614a) && s.g(this.f59615b, nVar.f59615b) && s.g(this.f59616c, nVar.f59616c);
    }

    public final int hashCode() {
        l lVar = this.f59614a;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.f59615b;
        int iHashCode2 = (iHashCode + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        l lVar3 = this.f59616c;
        return iHashCode2 + (lVar3 != null ? lVar3.hashCode() : 0);
    }

    public final String toString() {
        return "RangeValues(start=" + this.f59614a + ", center=" + this.f59615b + ", end=" + this.f59616c + ")";
    }

    public n(l lVar, l lVar2, l lVar3) {
        this.f59614a = lVar;
        this.f59615b = lVar2;
        this.f59616c = lVar3;
    }

    public n() {
        this(null, null, null, 7, null);
    }
}
