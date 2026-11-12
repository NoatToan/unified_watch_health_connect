package t70;

import java.util.List;
import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class z implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f163078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f163079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<List<c1>> f163080c;

    /* JADX WARN: Multi-variable type inference failed */
    public z(c1 c1Var, l0 l0Var, x3<? extends List<? extends c1>> x3Var) {
        this.f163078a = c1Var;
        this.f163079b = l0Var;
        this.f163080c = x3Var;
    }

    @Override // e23.a
    public final Boolean invoke() {
        List<c1> f182175a = this.f163080c.getF182175a();
        if (f182175a == null) {
            return Boolean.FALSE;
        }
        int iIndexOf = f182175a.indexOf(this.f163078a);
        this.f163079b.B4(iIndexOf, iIndexOf + 1);
        return Boolean.TRUE;
    }
}
