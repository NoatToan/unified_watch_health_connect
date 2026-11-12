package j10;

import am.c1;
import b63.v;
import c2.b0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsPrivacyActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.EditRepsActivity;
import f5.z0;
import h5.e0;
import i3.v2;
import java.util.List;
import l72.r1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import r1.c0;
import r1.u0;
import r1.v1;
import r1.w1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f96397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f96398c;

    public /* synthetic */ q(m40.g gVar, p1 p1Var, p1 p1Var2) {
        this.f96396a = 1;
        this.f96397b = p1Var;
        this.f96398c = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96396a;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f96398c;
        p1 p1Var2 = this.f96397b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GroupSettingsPrivacyActivity.a aVar2 = GroupSettingsPrivacyActivity.f31458b;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    c2.l.f(x2.q(aVar3, eVar.f97920e), mVar);
                    GroupDTO.e eVar2 = (GroupDTO.e) p1Var2.getF182175a();
                    eVar2.getClass();
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new c1(p1Var2, p1Var, 12);
                        mVar.K(objQ);
                    }
                    lm0.q.a(eVar2, (e23.l) objQ, mVar, 48);
                    c2.l.f(x2.q(aVar3, eVar.f97920e), mVar);
                    r1.b(gl1.y.Q(mVar, R.string.lbl_group_privacy_join_header), null, mVar, 0, 2);
                    GroupDTO.d dVar = (GroupDTO.d) p1Var.getF182175a();
                    dVar.getClass();
                    GroupDTO.e eVar3 = (GroupDTO.e) p1Var2.getF182175a();
                    eVar3.getClass();
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new v2(p1Var, 11);
                        mVar.K(objQ2);
                    }
                    lm0.h.a(dVar, eVar3, (e23.l) objQ2, mVar, 384);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                List list = (List) obj2;
                m40.g.a aVar5 = m40.g.f116591h;
                list.getClass();
                if (((Boolean) p1Var2.getF182175a()).booleanValue() != zBooleanValue) {
                    m40.g.C6("TogglePointsOfInterest", zBooleanValue);
                }
                p1Var2.setValue(bool);
                p1Var.setValue(list);
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                EditRepsActivity.a aVar6 = EditRepsActivity.f49554a;
                str.getClass();
                p1Var2.setValue(str);
                p1Var.setValue(bool2);
                return Unit.INSTANCE;
            case 3:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    g6.f.a aVar7 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(h4.r.S, 16);
                    d92.b.f58623a.getClass();
                    h4.r rVarA = u1.q.a(rVarY, u1.n.a(2, d92.b.a(mVar2).j().c()));
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarA, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    u uVar = u.f22885a;
                    String str2 = (String) p1Var2.getF182175a();
                    Object objQ3 = mVar2.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new c1(p1Var2, p1Var, 22);
                        mVar2.K(objQ3);
                    }
                    l72.p1.a(str2, null, "Text Input", null, false, false, null, 0L, null, null, null, null, null, (e23.l) objQ3, mVar2, 384, 24576, 16378);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zBooleanValue2 = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    v1 v1VarB = u0.l().b(u0.d(null, 3));
                    w1.f149304a.getClass();
                    c0.e(zBooleanValue2, null, v1VarB, w1.f149305b, null, z3.f.c(-1519632443, new eb0.a(p1Var, 10), mVar3), mVar3, 196992, 18);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                p1Var2.setValue(Boolean.FALSE);
                p1Var.setValue(new v(iIntValue4, iIntValue5, 0, 0));
                return Unit.INSTANCE;
            default:
                p1Var2.setValue((DateTime) obj);
                p1Var.setValue((my1.g) obj2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q(p1 p1Var, p1 p1Var2, int i14) {
        this.f96396a = i14;
        this.f96397b = p1Var;
        this.f96398c = p1Var2;
    }
}
