package ml2;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.b f119303b;

    public /* synthetic */ b(b0.b bVar, int i14) {
        this.f119302a = i14;
        this.f119303b = bVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i14 = this.f119302a;
        b0.b bVar = this.f119303b;
        o oVar = (o) obj;
        switch (i14) {
            case 0:
                int i15 = c.f119306h;
                return oVar.f119410a == bVar.f119305a;
            default:
                int i16 = h0.f119352l;
                return oVar.f119410a == bVar.f119305a;
        }
    }
}
