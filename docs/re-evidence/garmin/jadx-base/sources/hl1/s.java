package hl1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Unit;
import p13.a1;
import p13.h0;
import p13.j0;
import p13.y;
import p3.p1;
import sk0.l0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f84461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f84462c;

    public /* synthetic */ s(p1 p1Var, e23.p pVar) {
        this.f84460a = 3;
        this.f84462c = p1Var;
        this.f84461b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f84460a) {
            case 0:
                p1 p1Var = this.f84462c;
                o13.p pVar = (o13.p) p1Var.getF182175a();
                zf2.i iVar = pVar != null ? (zf2.i) pVar.f128594a : null;
                o13.p pVar2 = (o13.p) p1Var.getF182175a();
                this.f84461b.invoke(iVar, pVar2 != null ? (String) pVar2.f128595b : null);
                break;
            case 1:
                p1 p1Var2 = this.f84462c;
                this.f84461b.invoke(Integer.valueOf(((na0.i) p1Var2.getF182175a()).f125126b), ((na0.i) p1Var2.getF182175a()).f125125a);
                break;
            case 2:
                p1 p1Var3 = this.f84462c;
                this.f84461b.invoke(Integer.valueOf(((na0.n) p1Var3.getF182175a()).f125156b), ((na0.n) p1Var3.getF182175a()).f125155a);
                break;
            case 3:
                rk0.h.d(this.f84462c, this.f84461b, j0.f134944a);
                break;
            case 4:
                qk0.c.Companion companion = qk0.c.INSTANCE;
                p1 p1Var4 = this.f84462c;
                i53.c<uk0.a> cVar = ((l0) p1Var4.getF182175a()).f159722c;
                ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                Iterator<uk0.a> it = cVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f171796b);
                }
                Set setG1 = h0.g1(arrayList);
                i53.c<uk0.a> cVar2 = ((l0) p1Var4.getF182175a()).f159722c;
                ArrayList arrayList2 = new ArrayList(y.r(cVar2, 10));
                Iterator<uk0.a> it3 = cVar2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().f171795a);
                }
                Set setG2 = h0.g1(arrayList2);
                String str = ((l0) p1Var4.getF182175a()).f159720a;
                Set setB = str != null ? a1.b(str) : p13.l0.f134950a;
                companion.getClass();
                this.f84461b.invoke(((l0) p1Var4.getF182175a()).f159724e, qk0.c.Companion.a(setG1, setG2, setB));
                break;
            default:
                qk0.c.Companion companion2 = qk0.c.INSTANCE;
                p1 p1Var5 = this.f84462c;
                i53.c<uk0.a> cVar3 = ((l0) p1Var5.getF182175a()).f159722c;
                ArrayList arrayList3 = new ArrayList(y.r(cVar3, 10));
                Iterator<uk0.a> it4 = cVar3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(it4.next().f171796b);
                }
                Set setG3 = h0.g1(arrayList3);
                i53.c<uk0.a> cVar4 = ((l0) p1Var5.getF182175a()).f159722c;
                ArrayList arrayList4 = new ArrayList(y.r(cVar4, 10));
                Iterator<uk0.a> it5 = cVar4.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(it5.next().f171795a);
                }
                Set setG4 = h0.g1(arrayList4);
                String str2 = ((l0) p1Var5.getF182175a()).f159720a;
                Set setB2 = str2 != null ? a1.b(str2) : p13.l0.f134950a;
                companion2.getClass();
                this.f84461b.invoke(((l0) p1Var5.getF182175a()).f159724e, qk0.c.Companion.a(setG3, setG4, setB2));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(e23.p pVar, p1 p1Var, int i14) {
        this.f84460a = i14;
        this.f84461b = pVar;
        this.f84462c = p1Var;
    }
}
