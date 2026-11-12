package kotlin;

import java.util.List;
import p1.j0;
import p1.n;
import p5.a0;
import p5.q;
import p5.y;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li5/j3;", "", "Lp5/y;", "semanticsNode", "Lp1/n;", "Lp5/a0;", "currentSemanticsNodes", "<init>", "(Lp5/y;Lp1/n;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f91234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f91235b;

    public j3(y yVar, n<a0> nVar) {
        this.f91234a = yVar.f136098d;
        List listJ = y.j(4, yVar);
        this.f91235b = new j0(listJ.size());
        int size = listJ.size();
        for (int i14 = 0; i14 < size; i14++) {
            y yVar2 = (y) listJ.get(i14);
            if (nVar.a(yVar2.f136100f)) {
                this.f91235b.b(yVar2.f136100f);
            }
        }
    }
}
