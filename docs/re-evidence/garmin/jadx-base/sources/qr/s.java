package qr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146474b;

    public /* synthetic */ s(t tVar, int i14) {
        this.f146473a = i14;
        this.f146474b = tVar;
    }

    @Override // e23.a
    public final Object invoke() {
        nr.p value;
        int i14 = this.f146473a;
        t tVar = this.f146474b;
        switch (i14) {
            case 0:
                f12.l lVar = tVar.f146547p;
                long j8 = tVar.f146575z;
                List<nr.m0> list = tVar.a5().getValue().f127277a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    nr.m0 m0Var = (nr.m0) obj;
                    if (m0Var.f127260c || m0Var.f127259b) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((nr.m0) it.next()).f127258a));
                }
                lVar.Q0(j8, arrayList2);
                tVar.C = false;
                r53.z1<nr.p> z1VarA5 = tVar.a5();
                do {
                    value = z1VarA5.getValue();
                } while (!z1VarA5.b(value, nr.p.a(value, null, false, false, 29)));
                break;
            default:
                int i15 = t.A2;
                tVar.E4(nr.w0.v0.f127557a);
                break;
        }
        return Unit.INSTANCE;
    }
}
