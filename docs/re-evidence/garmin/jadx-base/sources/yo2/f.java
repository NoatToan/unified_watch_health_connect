package yo2;

import fo2.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyo2/f;", "", "Lfo2/p;", "creditCardsLink", "", "totalResults", "", "Lyo2/b;", "creditCards", "<init>", "(Lfo2/p;Ljava/lang/Long;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f198596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f198597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f198598c;

    public /* synthetic */ f(p pVar, Long l14, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : pVar, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f198596a, fVar.f198596a) && s.g(this.f198597b, fVar.f198597b) && s.g(this.f198598c, fVar.f198598c);
    }

    public final int hashCode() {
        p pVar = this.f198596a;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        Long l14 = this.f198597b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        List<b> list = this.f198598c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NewFitPayCreditCardCollection(creditCardsLink=");
        sb3.append(this.f198596a);
        sb3.append(", totalResults=");
        sb3.append(this.f198597b);
        sb3.append(", creditCards=");
        return z.c(sb3, this.f198598c, ")");
    }

    public f(p pVar, Long l14, List<b> list) {
        this.f198596a = pVar;
        this.f198597b = l14;
        this.f198598c = list;
    }

    public f() {
        this(null, null, null, 7, null);
    }
}
