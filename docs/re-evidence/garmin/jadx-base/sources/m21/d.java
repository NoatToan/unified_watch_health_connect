package m21;

import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm21/d;", "", "Lb11/u;", "message", "", "formatArgs", "<init>", "(Lb11/u;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b11.u f116082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b11.u> f116083b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(b11.u uVar, List<? extends b11.u> list) {
        uVar.getClass();
        list.getClass();
        this.f116082a = uVar;
        this.f116083b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f116082a, dVar.f116082a) && p005kotlin.jvm.internal.s.g(this.f116083b, dVar.f116083b);
    }

    public final int hashCode() {
        return this.f116083b.hashCode() + (this.f116082a.hashCode() * 31);
    }

    public final String toString() {
        return "FoodSearchSnackbar(message=" + this.f116082a + ", formatArgs=" + this.f116083b + ")";
    }

    public d(b11.u uVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uVar, (i14 & 2) != 0 ? j0.f134944a : list);
    }
}
