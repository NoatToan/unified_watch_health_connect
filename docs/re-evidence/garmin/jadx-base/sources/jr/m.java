package jr;

import am.x0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljr/m;", "", "Lam/x0;", "legType", "", "Ljr/r;", "statRows", "<init>", "(Lam/x0;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f100196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<r> f100197b;

    public m(x0 x0Var, List<r> list) {
        x0Var.getClass();
        this.f100196a = x0Var;
        this.f100197b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f100196a == mVar.f100196a && p005kotlin.jvm.internal.s.g(this.f100197b, mVar.f100197b);
    }

    public final int hashCode() {
        int iHashCode = this.f100196a.hashCode() * 31;
        List<r> list = this.f100197b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "LegStatConfiguration(legType=" + this.f100196a + ", statRows=" + this.f100197b + ")";
    }
}
