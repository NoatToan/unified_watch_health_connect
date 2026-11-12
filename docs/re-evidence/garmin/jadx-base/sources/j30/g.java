package j30;

import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import k30.n;
import k30.o;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f96857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f96858c;

    public /* synthetic */ g(n nVar, l lVar, int i14) {
        this.f96856a = i14;
        this.f96857b = nVar;
        this.f96858c = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f96856a) {
            case 0:
                i53.c<o> cVar = this.f96857b.f102576b;
                ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                Iterator<o> it = cVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(o.b(it.next(), true, 1));
                }
                this.f96858c.invoke(i53.a.j(arrayList));
                break;
            default:
                i53.c<o> cVar2 = this.f96857b.f102576b;
                ArrayList arrayList2 = new ArrayList(y.r(cVar2, 10));
                Iterator<o> it3 = cVar2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(o.b(it3.next(), true, 1));
                }
                this.f96858c.invoke(i53.a.e(arrayList2));
                break;
        }
        return Unit.INSTANCE;
    }
}
