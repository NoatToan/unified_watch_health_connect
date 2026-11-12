package t70;

import java.util.List;
import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f162897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f162898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<List<b1>> f162899c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(b1 b1Var, q qVar, x3<? extends List<? extends b1>> x3Var) {
        this.f162897a = b1Var;
        this.f162898b = qVar;
        this.f162899c = x3Var;
    }

    @Override // e23.a
    public final Boolean invoke() {
        List<b1> f182175a = this.f162899c.getF182175a();
        if (f182175a == null) {
            return Boolean.FALSE;
        }
        int iIndexOf = f182175a.indexOf(this.f162897a);
        this.f162898b.B4(iIndexOf, iIndexOf - 1);
        return Boolean.TRUE;
    }
}
