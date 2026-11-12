package n23;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f122512a;

    public j0(p0 p0Var) {
        this.f122512a = p0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        p0 p0Var = this.f122512a;
        List<t23.d1> typeParameters = p0Var.e().getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(typeParameters, 10));
        for (t23.d1 d1Var : typeParameters) {
            d1Var.getClass();
            arrayList.add(new t3(p0Var, d1Var));
        }
        return arrayList;
    }
}
