package n12;

import a3.a1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import p3.y3;
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f122286b;

    public /* synthetic */ o0(u0 u0Var, int i14) {
        this.f122285a = i14;
        this.f122286b = u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        c2.u uVar;
        int i14 = this.f122285a;
        u0 u0Var = this.f122286b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1984944113, new o0(u0Var, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    Context context = (Context) mVar2.A(y3Var);
                    h4.r.a aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.u uVar2 = c2.u.f22885a;
                    p1 p1VarC = p3.p0.c(u0Var.f122315d, mVar2, 0);
                    wf.f.a aVar3 = new wf.f.a(context);
                    aVar3.f184930c = p1VarC.getF182175a();
                    wf.c cVar = wf.c.DISABLED;
                    aVar3.f184942o = cVar;
                    aVar3.f184943p = cVar;
                    wf.f fVarA = aVar3.a();
                    float fQ = gl.b.q(mVar2, R.dimen.profile_avatar_size_medium);
                    String strQ = gl1.y.Q(mVar2, R.string.image_content_description);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    jf.t.a(fVarA, strQ, l4.k.b(x2.q(c2.l.y(aVar, j92.b.f97899b.f97918c), fQ), k2.i.f102406a), null, null, z3.f.c(-1830783242, new a1(fQ, 4), mVar2), mVar2, 0, 2040);
                    p3.m mVar3 = mVar2;
                    p1 p1VarC2 = p3.p0.c(u0Var.f122316e, mVar3, 0);
                    Drawable drawableA = j.a.a((Context) mVar3.A(y3Var), R.drawable.gcm_circle_layer_check);
                    if (((Boolean) p1VarC2.getF182175a()).booleanValue()) {
                        mVar3.C(478942858);
                        uVar = uVar2;
                        jf.r.a(drawableA, gl1.y.Q(mVar3, R.string.image_content_description), x2.d(aVar, 1.0f), null, null, null, null, mVar3, 384, 2040);
                        mVar3 = mVar3;
                        mVar3.f();
                    } else {
                        uVar = uVar2;
                        mVar3.C(479213581);
                        mVar3.f();
                    }
                    if (((Boolean) p3.p0.c(u0Var.f122317f, mVar3, 0).getF182175a()).booleanValue()) {
                        mVar3.C(479349206);
                        g6.f.a aVar4 = g6.f.f75994b;
                        h4.r rVarC2 = uVar.c(x2.q(aVar, 28), h4.d.a.f81528f);
                        u4.d.b bVar2 = u4.d.f168373k;
                        y0.b(n5.e.b(R.drawable.lock, mVar3, 6), gl1.y.Q(mVar3, R.string.image_content_description), rVarC2, o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().b()), mVar3, 0, 56);
                        mVar3.f();
                    } else {
                        mVar3.C(479823661);
                        mVar3.f();
                    }
                    mVar3.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
