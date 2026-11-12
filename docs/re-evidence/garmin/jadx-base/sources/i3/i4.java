package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class i4 implements e23.q<c2.t2, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f88396b;

    /* JADX WARN: Multi-variable type inference failed */
    public i4(e23.p<? super p3.m, ? super Integer, Unit> pVar, boolean z14) {
        this.f88395a = pVar;
        this.f88396b = z14;
    }

    @Override // e23.q
    public final Unit invoke(c2.t2 t2Var, p3.m mVar, Integer num) {
        String strH;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            this.f88395a.invoke(mVar2, 0);
            h4.r.a aVar = h4.r.S;
            c1.f87691a.getClass();
            c2.l.f(c2.x2.q(aVar, c1.f87696f), mVar2);
            l3.z0.f109502a.getClass();
            u4.d dVarC = l3.z0.f109506e;
            if (dVarC == null) {
                g6.f.a aVar2 = g6.f.f75994b;
                u4.d.a aVar3 = new u4.d.a("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
                p13.j0 j0Var = u4.m.f168519a;
                o4.d0.f128823b.getClass();
                o4.t1 t1Var = new o4.t1(o4.d0.f128824c, null);
                o4.u1.f129010b.getClass();
                o4.v1.f129019b.getClass();
                int i14 = o4.v1.f129021d;
                u4.e eVar = new u4.e();
                eVar.k(7.0f, 10.0f);
                eVar.j(5.0f, 5.0f);
                eVar.j(5.0f, -5.0f);
                eVar.c();
                u4.d.a.b(aVar3, eVar.f168407a, 0, t1Var, 1.0f, null, 1.0f, i14, 1.0f);
                dVarC = aVar3.c();
                l3.z0.f109506e = dVarC;
            }
            boolean z14 = this.f88396b;
            if (z14) {
                mVar2.C(1509384391);
                int i15 = l3.n1.f109367b;
                strH = l3.k.h(mVar2, R.string.m3c_date_picker_switch_to_day_selection);
                mVar2.f();
            } else {
                mVar2.C(1509478662);
                int i16 = l3.n1.f109367b;
                strH = l3.k.h(mVar2, R.string.m3c_date_picker_switch_to_year_selection);
                mVar2.f();
            }
            i7.b(dVarC, strH, l4.k.g(aVar, z14 ? 180.0f : 0.0f), 0L, mVar2, 0, 8);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
