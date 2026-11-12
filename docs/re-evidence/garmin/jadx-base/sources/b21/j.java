package b21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.h f14758b;

    public /* synthetic */ j(u21.h hVar, int i14) {
        this.f14757a = i14;
        this.f14758b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0143  */
    /* JADX WARN: Code duplicated, block: B:44:0x014e  */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        boolean z14;
        boolean z15;
        Object value2;
        u21.g gVar;
        u21.i1 i1Var;
        Object value3;
        Object value4;
        switch (this.f14757a) {
            case 0:
                u21.h hVar = this.f14758b;
                r53.p2 p2Var = hVar.f167985h;
                u21.d0 d0VarX4 = hVar.x4(((u21.g) p2Var.getValue()).f167962b);
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, u21.g.a((u21.g) value, null, d0VarX4, null, null, null, 991)));
                return Unit.INSTANCE;
            case 1:
                u21.h hVar2 = this.f14758b;
                r53.p2 p2Var2 = hVar2.f167985h;
                if (((u21.g) p2Var2.getValue()).f167965e) {
                    u21.g gVar2 = (u21.g) p2Var2.getValue();
                    String str = gVar2.f167962b;
                    u21.i1 i1Var2 = gVar2.f167969i;
                    u21.d0 d0VarX5 = hVar2.x4(str);
                    boolean z16 = hVar2.f167980c;
                    if (!z16) {
                        z14 = true;
                    } else if ((i1Var2 != null ? i1Var2.f168006a : null) != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z16) {
                        z15 = (i1Var2 != null ? i1Var2.f168009d : null) != null;
                    }
                    if (d0VarX5 == null && z14 && z15) {
                        do {
                            value3 = p2Var2.getValue();
                        } while (!p2Var2.b(value3, u21.g.a((u21.g) value3, null, null, null, null, null, 511)));
                    } else {
                        do {
                            value2 = p2Var2.getValue();
                            gVar = (u21.g) value2;
                            i1Var = gVar.f167969i;
                        } while (!p2Var2.b(value2, u21.g.a(gVar, null, d0VarX5, null, null, i1Var != null ? u21.i1.a(i1Var, null, !z14, null, !z15, null, 109) : null, 735)));
                    }
                } else {
                    do {
                        value4 = p2Var2.getValue();
                    } while (!p2Var2.b(value4, u21.g.a((u21.g) value4, null, null, null, null, null, 511)));
                }
                return Unit.INSTANCE;
            case 2:
                u21.h hVar3 = this.f14758b;
                v01.n0 n0Var = hVar3.f167981d;
                List<q01.e> list = hVar3.f167979b;
                q01.e eVar = hVar3.f167978a;
                n0Var.getClass();
                l22.b bVar = n0Var.f174477a;
                list.getClass();
                eVar.getClass();
                ArrayList<q01.e> arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((q01.e) obj).f141993a != eVar.f141993a) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                for (q01.e eVar2 : arrayList) {
                    b11.c.a aVar = b11.c.f14245d;
                    String str2 = eVar2.f141995c;
                    boolean z17 = eVar2.f141998f;
                    aVar.getClass();
                    arrayList2.add(b11.c.a.b(str2, bVar, z17));
                }
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((q01.e) it.next()).f141995c);
                }
                String str3 = b11.c.UNCATEGORIZED.f14250a;
                List listC = p13.w.c(str3);
                b11.c.f14245d.getClass();
                p13.h0.D0(listC, b11.c.a.b(str3, bVar, false));
                return p13.h0.b1(p13.h0.f1(p13.h0.C0(p13.h0.C0(arrayList2, arrayList3), p13.j0.f134944a)));
            default:
                v01.n0 n0Var2 = this.f14758b.f167981d;
                n0Var2.getClass();
                String str4 = b11.c.UNCATEGORIZED.f14250a;
                List listC2 = p13.w.c(str4);
                b11.c.a aVar2 = b11.c.f14245d;
                l22.b bVar2 = n0Var2.f174477a;
                aVar2.getClass();
                ArrayList arrayListD0 = p13.h0.D0(listC2, b11.c.a.b(str4, bVar2, false));
                w13.c cVar = b11.c.f14249h;
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it3 = cVar.iterator();
                while (it3.hasNext()) {
                    String str5 = ((b11.c) it3.next()).f14250a;
                    b11.c.f14245d.getClass();
                    p13.d0.v(arrayList4, p13.x.k(str5, b11.c.a.b(str5, bVar2, false)));
                }
                return arrayListD0;
        }
    }
}
