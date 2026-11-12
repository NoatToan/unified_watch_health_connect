package d81;

import android.content.Context;
import g81.l0;
import p005kotlin.Unit;
import p3.x1;
import u62.f3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g81.c0 f58350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.a f58351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f58352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f58353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f58354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f58355g;

    public /* synthetic */ o(g81.c0 c0Var, o82.a aVar, int i14, Context context, e23.l lVar, e23.a aVar2, int i15) {
        this.f58349a = i15;
        this.f58350b = c0Var;
        this.f58351c = aVar;
        this.f58352d = i14;
        this.f58353e = context;
        this.f58354f = lVar;
        this.f58355g = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f58349a;
        Context context = this.f58353e;
        o82.a aVar = this.f58351c;
        g81.c0 c0Var = this.f58350b;
        switch (i14) {
            case 0:
                g81.u uVar = c0Var.f76287a;
                int iIntValue = ((Integer) obj2).intValue();
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((h2.c0) obj).getClass();
                x1 x1Var = p3.n.f135158a;
                if (iIntValue == 0) {
                    mVar.C(-131532737);
                    v.a(uVar != null ? uVar.f76407a : null, 6, aVar.f130843a, aVar.f130844b, mVar, 48);
                    mVar.f();
                } else if (iIntValue != 1) {
                    int i15 = this.f58352d;
                    e23.l lVar = this.f58354f;
                    e23.a aVar2 = this.f58355g;
                    if (iIntValue != 2) {
                        mVar.C(-130361154);
                        l0 l0Var = c0Var.f76289c;
                        s62.a.f157643a.getClass();
                        e0.a(l0Var, u62.t.a(t62.a.f162797a), i15, new d02.b(), lVar, aVar2, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-130920239);
                        l0 l0Var2 = c0Var.f76288b;
                        s62.a.f157643a.getClass();
                        e0.a(l0Var2, f3.a(t62.a.f162797a), i15, new d02.e(context, am.j.z(f12.l.f68084a)), lVar, aVar2, mVar, 4096);
                        mVar.f();
                    }
                } else {
                    mVar.C(-131242298);
                    u.a(uVar != null ? uVar.f76408b : null, 6, aVar.f130843a, aVar.f130844b, mVar, 48);
                    mVar.f();
                }
                break;
            default:
                g81.u uVar2 = c0Var.f76287a;
                int iIntValue2 = ((Integer) obj2).intValue();
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((h2.c0) obj).getClass();
                x1 x1Var2 = p3.n.f135158a;
                if (iIntValue2 == 0) {
                    mVar2.C(-180901740);
                    v.a(uVar2 != null ? uVar2.f76407a : null, 10, aVar.f130843a, aVar.f130844b, mVar2, 48);
                    mVar2.f();
                } else if (iIntValue2 != 1) {
                    int i16 = this.f58352d;
                    e23.l lVar2 = this.f58354f;
                    e23.a aVar3 = this.f58355g;
                    if (iIntValue2 != 2) {
                        mVar2.C(-179735086);
                        l0 l0Var3 = c0Var.f76289c;
                        s62.a.f157643a.getClass();
                        e0.a(l0Var3, u62.t.a(t62.a.f162797a), i16, new d02.b(), lVar2, aVar3, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-180293179);
                        l0 l0Var4 = c0Var.f76288b;
                        s62.a.f157643a.getClass();
                        e0.a(l0Var4, f3.a(t62.a.f162797a), i16, new d02.e(context, am.j.z(f12.l.f68084a)), lVar2, aVar3, mVar2, 4096);
                        mVar2.f();
                    }
                } else {
                    mVar2.C(-180613285);
                    u.a(uVar2 != null ? uVar2.f76408b : null, 10, aVar.f130843a, aVar.f130844b, mVar2, 48);
                    mVar2.f();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
