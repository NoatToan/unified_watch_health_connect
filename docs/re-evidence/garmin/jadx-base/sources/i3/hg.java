package i3;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class hg implements f5.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f88352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f88353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ig f88354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nb f88356e;

    public hg(float f14, float f15, ig igVar, int i14, nb nbVar) {
        this.f88352a = f14;
        this.f88353b = f15;
        this.f88354c = igVar;
        this.f88355d = i14;
        this.f88356e = nbVar;
    }

    @Override // f5.e1
    public final f5.a1 f(final f5.b1 b1Var, List<? extends List<? extends f5.y0>> list, long j8) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        float f14 = this.f88352a;
        final int iF0 = b1Var.f0(f14);
        int size = list2.size();
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((f5.y0) list2.get(i14)).a0(Integer.MAX_VALUE)));
        }
        final int iIntValue = numValueOf.intValue();
        int i15 = iF0 * 2;
        float f15 = this.f88353b;
        long jC = g6.a.c(b1Var.f0(f15), 0, iIntValue, iIntValue, 2, j8);
        final p005kotlin.jvm.internal.o0 o0Var = new p005kotlin.jvm.internal.o0();
        o0Var.f105806a = f14;
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i16 = 0; i16 < size3; i16++) {
            arrayList2.add(((f5.y0) list2.get(i16)).Q(jC));
        }
        p1.h0 h0Var = new p1.h0(0, 1, null);
        int size4 = list2.size();
        for (int i17 = 0; i17 < size4; i17++) {
            h0Var.d(((f5.y0) list2.get(i17)).l0(Integer.MAX_VALUE));
        }
        final ArrayList arrayList3 = new ArrayList(size);
        int iF1 = i15;
        int i18 = 0;
        while (i18 < size) {
            float f16 = ((g6.f) r13.b.d(g6.f.a(f15), g6.f.a(b1Var.c1(((f5.v1) arrayList2.get(i18)).f69144a)))).f75997a;
            iF1 += b1Var.f0(f16);
            wf wfVar = new wf(o0Var.f105806a, f16, ((g6.f) r13.b.d(g6.f.a(b1Var.c1(h0Var.a(i18)) - (uf.f89933c * 2)), g6.f.a(24))).f75997a, null);
            o0Var.f105806a += f16;
            arrayList3.add(wfVar);
            i18++;
            h0Var = h0Var;
        }
        this.f88354c.f88457a.setValue(arrayList3);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int i19 = 0;
        for (int size5 = list3.size(); i19 < size5; size5 = size5) {
            arrayList4.add(((f5.y0) list3.get(i19)).Q(g6.a.b(0, b1Var.f0(((wf) arrayList3.get(this.f88355d)).contentWidth), 0, iIntValue)));
            i19++;
            list3 = list3;
        }
        final float f17 = this.f88352a;
        final nb nbVar = this.f88356e;
        final int i24 = this.f88355d;
        return f5.b1.h0(b1Var, iF1, iIntValue, new e23.l() { // from class: i3.gg
            @Override // e23.l
            public final Object invoke(Object obj) {
                f5.b1 b1Var2;
                ArrayList arrayList5;
                f5.v1.a aVar = (f5.v1.a) obj;
                p005kotlin.jvm.internal.o0 o0Var2 = o0Var;
                o0Var2.f105806a = f17;
                ArrayList arrayList6 = arrayList2;
                int size6 = arrayList6.size();
                int i25 = 0;
                while (true) {
                    b1Var2 = b1Var;
                    arrayList5 = arrayList3;
                    if (i25 >= size6) {
                        break;
                    }
                    f5.v1.a.B(aVar, (f5.v1) arrayList6.get(i25), b1Var2.f0(o0Var2.f105806a), 0);
                    float f18 = o0Var2.f105806a + ((wf) arrayList5.get(i25)).f90135b;
                    g6.f.a aVar2 = g6.f.f75994b;
                    o0Var2.f105806a = f18;
                    i25++;
                }
                ArrayList arrayList7 = arrayList4;
                int size7 = arrayList7.size();
                int i26 = 0;
                while (true) {
                    int i27 = i24;
                    if (i26 >= size7) {
                        nbVar.a(b1Var2, iF0, arrayList5, i27);
                        return Unit.INSTANCE;
                    }
                    f5.v1 v1Var = (f5.v1) arrayList7.get(i26);
                    f5.v1.a.B(aVar, v1Var, Math.max(0, (b1Var2.f0(((wf) arrayList5.get(i27)).f90135b) - v1Var.f69144a) / 2), iIntValue - v1Var.f69145b);
                    i26++;
                }
            }
        });
    }
}
