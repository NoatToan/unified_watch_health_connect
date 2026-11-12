package p006l2;

import c80.u;
import e23.l;
import i53.d;
import i53.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l72.i3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p3.p1;
import s5.c;
import sk0.m1;
import uk0.a;
import x5.l0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f108687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f108688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f108689d;

    public /* synthetic */ o(l lVar, p1 p1Var, p1 p1Var2, int i14) {
        this.f108686a = i14;
        this.f108687b = lVar;
        this.f108688c = p1Var;
        this.f108689d = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f108686a) {
            case 0:
                l0 l0Var = (l0) obj;
                this.f108688c.setValue(l0Var);
                p1 p1Var = this.f108689d;
                boolean zG = s.g((String) p1Var.getF182175a(), l0Var.f188878a.f157138b);
                c cVar = l0Var.f188878a;
                p1Var.setValue(cVar.f157138b);
                if (!zG) {
                    this.f108687b.invoke(cVar.f157138b);
                }
                break;
            case 1:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (s.g(i3Var.f111063a, "DONE")) {
                    d<u, i53.c<a>> dVar = ((m1) this.f108688c.getF182175a()).f159758d;
                    ArrayList arrayList = new ArrayList();
                    Iterator<Map.Entry<u, i53.c<a>>> it = dVar.entrySet().iterator();
                    while (it.hasNext()) {
                        d0.v(arrayList, it.next().getValue());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((e) this.f108689d.getF182175a()).contains(((a) obj2).f171795a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    this.f108687b.invoke(arrayList2);
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                this.f108688c.setValue(str);
                this.f108687b.invoke(str);
                this.f108689d.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
