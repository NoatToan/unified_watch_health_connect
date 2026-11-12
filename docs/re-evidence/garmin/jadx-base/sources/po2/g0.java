package po2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lpo2/g0;", "", "", "Lpo2/h0;", "historyList", "", "historyUnavailableReason", "<init>", "(Ljava/util/List;Ljava/lang/Throwable;)V", "(Ljava/util/List;)V", "(Ljava/lang/Throwable;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h0> f139197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f139198b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(Throwable th3) {
        this(p13.j0.f134944a, th3);
        th3.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p005kotlin.jvm.internal.s.g(this.f139197a, g0Var.f139197a) && p005kotlin.jvm.internal.s.g(this.f139198b, g0Var.f139198b);
    }

    public final int hashCode() {
        int iHashCode = this.f139197a.hashCode() * 31;
        Throwable th3 = this.f139198b;
        return iHashCode + (th3 == null ? 0 : th3.hashCode());
    }

    public final String toString() {
        return "SnowballTransactionInfo(historyList=" + this.f139197a + ", historyUnavailableReason=" + this.f139198b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(List<h0> list) {
        this(list, null);
        list.getClass();
    }

    private g0(List<h0> list, Throwable th3) {
        this.f139197a = list;
        this.f139198b = th3;
    }
}
