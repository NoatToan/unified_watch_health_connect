package vp2;

import fo2.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvp2/d;", "", "Lfo2/p;", "transactionsLink", "", "Lvp2/c;", "fitPayCardTransactionList", "<init>", "(Lfo2/p;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f179418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f179419b;

    public d(p pVar, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? new p(null, false, 3, null) : pVar, (i14 & 2) != 0 ? j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f179418a, dVar.f179418a) && s.g(this.f179419b, dVar.f179419b);
    }

    public final int hashCode() {
        return this.f179419b.hashCode() + (this.f179418a.hashCode() * 31);
    }

    public final String toString() {
        return "FitPayCardTransactionsCollection(transactionsLink=" + this.f179418a + ", fitPayCardTransactionList=" + this.f179419b + ")";
    }

    public d(p pVar, List<c> list) {
        pVar.getClass();
        list.getClass();
        this.f179418a = pVar;
        this.f179419b = list;
    }

    public d() {
        this(null, null, 3, null);
    }
}
