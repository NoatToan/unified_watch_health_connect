package og2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Log2/k0;", "", "Log2/l0;", "renderer", "", "Log2/j0;", "xAxisPositionsAndLabels", "<init>", "(Log2/l0;Ljava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f132051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j0> f132052b;

    public k0(l0 l0Var, List<j0> list) {
        l0Var.getClass();
        list.getClass();
        this.f132051a = l0Var;
        this.f132052b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f132051a.equals(k0Var.f132051a) && this.f132052b.equals(k0Var.f132052b);
    }

    public final int hashCode() {
        return this.f132052b.hashCode() + (this.f132051a.hashCode() * 31);
    }

    public final String toString() {
        return "XAxisLabelsRenderer(renderer=" + this.f132051a + ", xAxisPositionsAndLabels=" + this.f132052b + ")";
    }
}
