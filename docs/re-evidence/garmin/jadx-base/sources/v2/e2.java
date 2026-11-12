package v2;

import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lv2/e2;", "Lh5/m;", "Lh5/c0;", "Lh5/u;", "Lh5/h;", "Lv2/g2;", "textLayoutState", "Lv2/h2;", "textFieldState", "Ls5/x0;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Lg6/c;", "Lkotlin/Function0;", "Ls5/q0;", "", "onTextLayout", "Ll2/a2;", "keyboardOptions", "<init>", "(Lv2/g2;Lv2/h2;Ls5/x0;ZLe23/p;Ll2/a2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e2 extends h5.m implements h5.c0, h5.u, h5.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g2 f174973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f174974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i2.e f174975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<f5.a, Integer> f174976f;

    public e2(g2 g2Var, h2 h2Var, s5.x0 x0Var, boolean z14, e23.p<? super g6.c, ? super e23.a<s5.q0>, Unit> pVar, p006l2.a2 a2Var) {
        this.f174973c = g2Var;
        this.f174974d = z14;
        i2.e eVar = new i2.e(g2Var.f175002h);
        U1(eVar);
        this.f174975e = eVar;
        g2 g2Var2 = this.f174973c;
        g2Var2.f174996b = pVar;
        boolean z15 = this.f174974d;
        g2Var2.g(h2Var, x0Var, z15, !z15, a2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        float fC1;
        g2 g2Var = this.f174973c;
        g6.o f68910b = b1Var.getF68910b();
        w5.q.b bVar = (w5.q.b) h5.i.a(this, kotlin.t1.f91493k);
        c2 c2Var = g2Var.f174995a;
        c2Var.getClass();
        c2.b bVar2 = new c2.b(b1Var, f68910b, bVar, j8, null);
        c2Var.f174911b.setValue(bVar2);
        c2.c cVar = (c2.c) c2Var.f174910a.getF182175a();
        if (cVar == null) {
            b2.e.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            o2.c.f();
            return null;
        }
        s5.q0 q0VarA = c2Var.a(cVar, bVar2);
        long j14 = q0VarA.f157282c;
        e23.p<? super g6.c, ? super e23.a<s5.q0>, Unit> pVar = g2Var.f174996b;
        if (pVar != null) {
            pVar.invoke(b1Var, new ty1.f1(g2Var, 24));
        }
        int i14 = (int) (j14 >> 32);
        int i15 = (int) (j14 & 4294967295L);
        g6.a.f75987b.getClass();
        f5.v1 v1VarQ = y0Var.Q(g6.a.C1525a.b(i14, i14, i15, i15));
        g2 g2Var2 = this.f174973c;
        if (this.f174974d) {
            fC1 = b1Var.c1(o2.a(q0VarA.f157281b.b(0)));
        } else {
            fC1 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        g2Var2.f175001g.setValue(g6.f.a(fC1));
        Map<f5.a, Integer> linkedHashMap = this.f174976f;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(2);
        }
        linkedHashMap.put(f5.b.f68892a, Integer.valueOf(Math.round(q0VarA.f157283d)));
        linkedHashMap.put(f5.b.f68893b, Integer.valueOf(Math.round(q0VarA.f157284e)));
        this.f174976f = linkedHashMap;
        return b1Var.H1(i14, i15, linkedHashMap, new a03.k0(v1VarQ, 22));
    }

    @Override // h5.u
    public final void o(h5.c1 c1Var) {
        this.f174973c.f174998d.setValue(c1Var);
    }
}
