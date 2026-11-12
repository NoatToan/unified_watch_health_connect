package aq2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laq2/g;", "", "", "Laq2/f;", "fitPayStates", "<init>", "(Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f> f12476a;

    public g(List<f> list) {
        list.getClass();
        this.f12476a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f12476a.equals(((g) obj).f12476a);
    }

    public final int hashCode() {
        return this.f12476a.hashCode();
    }

    public final String toString() {
        return tn.k.h("FitPayStateCollection(fitPayStates=", ")", this.f12476a);
    }
}
