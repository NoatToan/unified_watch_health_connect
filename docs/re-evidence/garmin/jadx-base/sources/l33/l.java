package l33;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f109769a;

    public l(m mVar) {
        this.f109769a = mVar;
    }

    @Override // e23.a
    public final Object invoke() {
        m mVar = this.f109769a;
        ArrayList<o33.u> typeParameters = mVar.f109772j.getTypeParameters();
        ArrayList arrayList = new ArrayList(p13.y.r(typeParameters, 10));
        for (o33.u uVar : typeParameters) {
            t23.d1 d1VarA = mVar.f109774l.f102786b.a(uVar);
            if (d1VarA == null) {
                StringBuilder sb3 = new StringBuilder("Parameter ");
                sb3.append(uVar);
                o33.f fVar = mVar.f109772j;
                sb3.append(" surely belongs to class ");
                sb3.append(fVar);
                sb3.append(", so it must be resolved");
                throw new AssertionError(sb3.toString());
            }
            arrayList.add(d1VarA);
        }
        return arrayList;
    }
}
