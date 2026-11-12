package i82;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li82/b;", "", "Lo3/b;", "windowSize", "", "Loe/a;", "displayFeatures", "<init>", "(Lo3/b;Ljava/util/List;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3.b f92266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<oe.a> f92267b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(o3.b bVar, List<? extends oe.a> list) {
        bVar.getClass();
        list.getClass();
        this.f92266a = bVar;
        this.f92267b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f92266a.equals(bVar.f92266a) && this.f92267b.equals(bVar.f92267b);
    }

    public final int hashCode() {
        return this.f92267b.hashCode() + (this.f92266a.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceLayoutState(windowSize=" + this.f92266a + ", displayFeatures=" + this.f92267b + ")";
    }
}
