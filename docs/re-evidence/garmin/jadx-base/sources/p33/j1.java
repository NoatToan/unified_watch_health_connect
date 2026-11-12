package p33;

/* JADX INFO: loaded from: classes3.dex */
public class j1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.j1 f135465a;

    public j1(t23.j1 j1Var) {
        this.f135465a = j1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        t23.b bVar = (t23.b) obj;
        bVar.getClass();
        p43.n0 type = bVar.f().get(this.f135465a.getIndex()).getType();
        type.getClass();
        return type;
    }
}
