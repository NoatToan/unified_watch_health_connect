package tt1;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import e23.p;
import h4.r;
import h5.e0;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f166420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166421c;

    public /* synthetic */ d(List list, ActiveTrainingPlansActivity activeTrainingPlansActivity, int i14) {
        this.f166419a = i14;
        this.f166420b = list;
        this.f166421c = activeTrainingPlansActivity;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x015a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        x0 x0VarB;
        String strPa;
        int i14 = this.f166419a;
        ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166421c;
        List<ww1.e> list = this.f166420b;
        int i15 = 0;
        m mVar = (m) obj;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                ActiveTrainingPlansActivity.a aVar = ActiveTrainingPlansActivity.f45098w;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    r rVarF = x2.f(r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    mVar.C(-1687044579);
                    for (ww1.e eVar : list) {
                        DateTime dateTime = eVar.f187759e;
                        DateTime dateTime2 = eVar.f187746g;
                        String strQa = activeTrainingPlansActivity.qa(dateTime);
                        String strQa2 = activeTrainingPlansActivity.qa(dateTime2);
                        o oVar = eVar.f187747h;
                        if (oVar == null || (x0VarB = oVar.b()) == null) {
                            x0VarB = x0.f4308n;
                        }
                        if (dateTime2 == null || !dateTime2.isAfterNow()) {
                            strPa = activeTrainingPlansActivity.pa(eVar.f187757c, eVar.f187758d, strQa, false);
                        } else {
                            strPa = activeTrainingPlansActivity.getString(R.string.string_space_bullet_string_pattern, activeTrainingPlansActivity.getString(R.string.lbl_starts, strQa2), activeTrainingPlansActivity.getString(R.string.lbl_group_challenge_ends, strQa));
                            strPa.getClass();
                        }
                        String str = strPa;
                        u4.d dVar = x0VarB.f4362e;
                        String str2 = eVar.f187756b;
                        boolean zR = mVar.r(context);
                        Object objQ = mVar.q();
                        if (zR) {
                            objQ = new s70.r(context, 25);
                            mVar.K(objQ);
                        } else {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new s70.r(context, 25);
                                mVar.K(objQ);
                            }
                        }
                        ku1.n.b(null, dVar, null, str2, str, (e23.a) objQ, mVar, 384);
                    }
                    mVar.f();
                    mVar.y();
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                ActiveTrainingPlansActivity.a aVar3 = ActiveTrainingPlansActivity.f45098w;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1331645345, new d(list, activeTrainingPlansActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
