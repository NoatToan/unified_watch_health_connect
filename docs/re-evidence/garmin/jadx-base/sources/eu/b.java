package eu;

import h21.n;
import i3.c9;
import i3.m8;
import i3.mc;
import i3.pc;
import i3.u8;
import i3.y8;
import i3.z8;
import iv0.l;
import o53.b0;
import p005kotlin.Unit;
import p40.u;
import rx1.j;
import rx1.m;
import rx1.r;
import rx1.v;
import ug0.i;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f66052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f66053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f66054d;

    public /* synthetic */ b(e23.a aVar, b0 b0Var, mc mcVar) {
        this.f66051a = 12;
        this.f66054d = aVar;
        this.f66053c = b0Var;
        this.f66052b = mcVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f66051a;
        int i15 = 2;
        int i16 = 1;
        e23.a aVar = this.f66054d;
        mc mcVar = this.f66052b;
        b0 b0Var = this.f66053c;
        switch (i14) {
            case 0:
                c cVar = c.f66055a;
                ge1.b.T(b0Var, null, null, new e(mcVar, null), 3);
                aVar.invoke();
                break;
            case 1:
                if (mcVar.f88996e.f109322d.invoke(pc.Hidden).booleanValue()) {
                    ge1.b.T(b0Var, null, null, new u8(mcVar, null), 3).J(new n(mcVar, aVar, 1));
                }
                break;
            case 2:
                int i17 = c9.a.f87738a[mcVar.c().ordinal()];
                if (i17 == 1) {
                    aVar.invoke();
                    Unit unit = Unit.INSTANCE;
                } else if (i17 != 2) {
                    ge1.b.T(b0Var, null, null, new z8(mcVar, null), 3);
                } else {
                    ge1.b.T(b0Var, null, null, new y8(mcVar, null), 3);
                }
                break;
            case 3:
                ge1.b.T(b0Var, null, null, new l(aVar, mcVar, null), 3);
                break;
            case 4:
                ge1.b.T(b0Var, null, null, new kb0.l(mcVar, null), 3).J(new n(mcVar, aVar, 3));
                break;
            case 5:
                ge1.b.T(b0Var, null, null, new oy0.f.d(mcVar, aVar, null), 3);
                break;
            case 6:
                ge1.b.T(b0Var, null, null, new u.a(mcVar, null), 3).J(new n(mcVar, aVar, 4));
                break;
            case 7:
                ge1.b.T(b0Var, null, null, new p50.e.b(mcVar, null), 3).J(new m8(aVar, 25));
                break;
            case 8:
                ge1.b.T(b0Var, null, null, new j.a(mcVar, null), 3).J(new m8(aVar, 29));
                break;
            case 9:
                ge1.b.T(b0Var, null, null, new rx1.n.e(mcVar, null), 3).J(new m(aVar, 0));
                break;
            case 10:
                ge1.b.T(b0Var, null, null, new r(mcVar, null), 3).J(new m(aVar, i16));
                break;
            case 11:
                ge1.b.T(b0Var, null, null, new v.b(mcVar, null), 3).J(new m(aVar, i15));
                break;
            case 12:
                aVar.invoke();
                ge1.b.T(b0Var, null, null, new sd0.b(mcVar, null), 3);
                break;
            case 13:
                ge1.b.T(b0Var, null, null, new ug0.h(mcVar, null), 3);
                aVar.invoke();
                break;
            case 14:
                ge1.b.T(b0Var, null, null, new i(mcVar, null), 3);
                aVar.invoke();
                break;
            case 15:
                ge1.b.T(b0Var, null, null, new zo1.m(mcVar, null), 3);
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                ge1.b.T(b0Var, null, null, new zo1.l(mcVar, aVar, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(mc mcVar, e23.a aVar, b0 b0Var) {
        this.f66051a = 2;
        this.f66052b = mcVar;
        this.f66054d = aVar;
        this.f66053c = b0Var;
    }

    public /* synthetic */ b(mc mcVar, b0 b0Var, e23.a aVar) {
        this.f66051a = 1;
        this.f66052b = mcVar;
        this.f66053c = b0Var;
        this.f66054d = aVar;
    }

    public /* synthetic */ b(b0 b0Var, e23.a aVar, mc mcVar, int i14) {
        this.f66051a = i14;
        this.f66053c = b0Var;
        this.f66054d = aVar;
        this.f66052b = mcVar;
    }

    public /* synthetic */ b(b0 b0Var, mc mcVar, e23.a aVar, int i14) {
        this.f66051a = i14;
        this.f66053c = b0Var;
        this.f66052b = mcVar;
        this.f66054d = aVar;
    }
}
