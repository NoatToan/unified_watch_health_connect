package ub1;

import android.content.Context;
import c80.l0;
import c80.q0;
import h4.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lub1/c;", "Lub1/l;", "Lc80/l0;", "cardData", "Lr53/i;", "Lc80/q0;", "promoEventFlow", "Lkotlin/Function0;", "", "onFirstComposition", "onCloseClicked", "Lkotlin/Function1;", "Landroid/content/Context;", "onPrimaryButtonClicked", "<init>", "(Lc80/l0;Lr53/i;Le23/a;Le23/a;Le23/l;)V", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f169791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.i<q0> f169792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f169793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f169794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<Context, Unit> f169795e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(l0 l0Var, r53.i<? extends q0> iVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super Context, Unit> lVar) {
        l0Var.getClass();
        iVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        this.f169791a = l0Var;
        this.f169792b = iVar;
        this.f169793c = aVar;
        this.f169794d = aVar2;
        this.f169795e = lVar;
    }

    @Override // ub1.l
    public final void a(r rVar, p3.m mVar, int i14) {
        int i15;
        r rVar2;
        rVar.getClass();
        o0 o0VarE = mVar.E(-1015905693);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            l0 l0Var = this.f169791a;
            boolean z14 = l0Var instanceof l0.c;
            e23.l<Context, Unit> lVar = this.f169795e;
            r53.i<q0> iVar = this.f169792b;
            e23.a<Unit> aVar = this.f169794d;
            e23.a<Unit> aVar2 = this.f169793c;
            if (z14) {
                o0VarE.C(1788175460);
                int i17 = i16 & 14;
                l0.a aVar3 = l0.f25408c;
                rVar2 = rVar;
                vb1.f.c(rVar2, (l0.c) l0Var, iVar, aVar2, aVar, lVar, o0VarE, i17);
                o0VarE.g0(false);
            } else {
                rVar2 = rVar;
                if (l0Var instanceof l0.e) {
                    o0VarE.C(1788603663);
                    l0.a aVar4 = l0.f25408c;
                    vb1.i.d(rVar2, (l0.e) l0Var, iVar, aVar2, aVar, lVar, o0VarE, i16 & 14);
                    o0VarE.g0(false);
                } else if (l0Var instanceof l0.d) {
                    o0VarE.C(1789021326);
                    l0.a aVar5 = l0.f25408c;
                    vb1.g.a(rVar2, (l0.d) l0Var, iVar, aVar2, aVar, lVar, o0VarE, i16 & 14);
                    o0VarE.g0(false);
                } else {
                    if (!(l0Var instanceof l0.b)) {
                        throw kg.f.h(o0VarE, -1327791648, false);
                    }
                    o0VarE.C(1789439051);
                    l0.a aVar6 = l0.f25408c;
                    vb1.a.a(rVar2, (l0.b) l0Var, iVar, aVar2, aVar, lVar, o0VarE, i16 & 14);
                    o0VarE.g0(false);
                }
            }
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(this, rVar2, i14, 21);
        }
    }
}
