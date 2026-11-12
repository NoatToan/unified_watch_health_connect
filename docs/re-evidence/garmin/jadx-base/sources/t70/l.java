package t70;

import java.util.List;
import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class l implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f162901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f162902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<List<b1>> f162903c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(b1 b1Var, q qVar, x3<? extends List<? extends b1>> x3Var) {
        this.f162901a = b1Var;
        this.f162902b = qVar;
        this.f162903c = x3Var;
    }

    @Override // e23.a
    public final Boolean invoke() {
        List<b1> f182175a = this.f162903c.getF182175a();
        if (f182175a == null) {
            return Boolean.FALSE;
        }
        int iIndexOf = f182175a.indexOf(this.f162901a);
        this.f162902b.B4(iIndexOf, iIndexOf + 1);
        return Boolean.TRUE;
    }
}
