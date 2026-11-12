package t70;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import l72.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i0 implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f162887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j02.h0 f162888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f162889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3 f162890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f162891e;

    public i0(List list, j02.h0 h0Var, l0 l0Var, x3 x3Var, float f14) {
        this.f162887a = list;
        this.f162888b = h0Var;
        this.f162889c = l0Var;
        this.f162890d = x3Var;
        this.f162891e = f14;
    }

    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = (c1) this.f162887a.get(iIntValue);
            mVar2.C(-477403737);
            if (c1Var instanceof c1.a) {
                mVar2.C(-477527335);
                r1.b(gl1.y.Q(mVar2, ((c1.a) c1Var).f162820b), null, mVar2, 0, 2);
                mVar2.f();
            } else {
                if (!(c1Var instanceof c1.b)) {
                    throw n23.j.m(mVar2, 677336540);
                }
                mVar2.C(-477221582);
                c1.b bVar = (c1.b) c1Var;
                boolean z14 = bVar.f162823c;
                int i15 = z14 ? R.drawable.ic_remove_red : R.drawable.ic_add_round;
                mVar2.C(677342396);
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                int i16 = R.string.lbl_add;
                c0235a.f16962a.put("onClickLabel", gl1.y.Q(mVar2, z14 ? R.string.lbl_remove : R.string.lbl_add));
                mVar2.f();
                String strQ = gl1.y.Q(mVar2, R.string.move_up);
                String strQ2 = gl1.y.Q(mVar2, R.string.move_down);
                if (z14) {
                    i16 = R.string.lbl_remove;
                }
                j02.d0.a(dVar2, this.f162888b, c1Var.f162819a, null, bVar.f162823c, null, z3.f.c(-1619843351, new e0(c1Var, this.f162889c, this.f162890d, gl1.y.Q(mVar2, i16), strQ, strQ2, c0235a, this.f162891e, i15), mVar2), mVar2, (i14 & 14) | 1572864, 20);
                mVar2.f();
            }
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
