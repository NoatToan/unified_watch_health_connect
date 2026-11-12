package d33;

/* JADX INFO: loaded from: classes3.dex */
public final class a<Node> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.j<Node, Integer> f57392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f57393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57394c;

    public a(k23.j<Node, Integer> jVar, l lVar) {
        jVar.getClass();
        lVar.getClass();
        this.f57392a = jVar;
        this.f57393b = lVar;
        if (lVar.f57408b == 1 && lVar.f57409c == 1) {
            this.f57394c = 1 << lVar.f57407a;
        } else {
            androidx.core.view.j.s("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", lVar, " was passed");
            throw null;
        }
    }

    public final boolean a(Node node, k23.l<?> lVar) {
        lVar.getClass();
        int iIntValue = this.f57392a.get(node).intValue();
        l lVar2 = this.f57393b;
        return ((iIntValue >>> lVar2.f57407a) & ((1 << lVar2.f57408b) - 1)) == lVar2.f57409c;
    }
}
