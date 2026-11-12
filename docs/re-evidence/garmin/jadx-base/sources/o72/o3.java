package o72;

import android.content.Context;
import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130516a;

    public /* synthetic */ o3(int i14) {
        this.f130516a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f130516a) {
            case 0:
                ((Integer) obj2).getClass();
                p3.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                q3.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                r3.b((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                s3.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                t3.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                u3.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                w3.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 7:
                Scope scope = (Scope) obj;
                o80.a aVar = o80.a.f130832a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                rd2.f fVarA = rd2.f.a();
                fVarA.getClass();
                return new m80.b(contextAndroidContext, fVarA, (f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 8, null);
            case 8:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                o80.a aVar2 = o80.a.f130832a;
                scope2.getClass();
                parametersHolder.getClass();
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new p80.f((n80.a) parametersHolder.elementAt(0, t0Var.b(n80.a.class)), ((Boolean) parametersHolder.elementAt(1, t0Var.b(Boolean.class))).booleanValue(), (m80.a) scope2.get((k23.d<?>) t0Var.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ic0.b) scope2.get((k23.d<?>) t0Var.b(ic0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 9:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                ob1.a.C2490a c2490a = ob1.a.f131136m;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 10:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                ob1.a.C2490a c2490a2 = ob1.a.f131136m;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 11:
                oe2.e eVar = (oe2.e) obj2;
                oe2.e.a aVar3 = oe2.e.f131472d;
                ((d4.n) obj).getClass();
                eVar.getClass();
                return eVar.f98597a;
            case 12:
                boolean z14 = false;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ok0.l lVar = ok0.l.f132499a;
                if ((iIntValue & 3) != 2) {
                    z14 = true;
                }
                if (mVar.n(iIntValue & 1, z14)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = c2.x2.q(aVar4, j92.b.f97901d.f97904c);
                    s62.a.f157643a.getClass();
                    i7.b(v62.e1.a(t62.b.f162798a), null, rVarQ, androidx.room.a0.c(mVar), mVar, 48, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 13:
                boolean z15 = false;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ok0.l lVar2 = ok0.l.f132499a;
                if ((iIntValue2 & 3) != 2) {
                    z15 = true;
                }
                if (mVar2.n(iIntValue2 & 1, z15)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ2 = c2.x2.q(aVar5, j92.b.f97901d.f97905d);
                    s62.a.f157643a.getClass();
                    i7.b(f72.l1.a(t62.c.f162799a), null, rVarQ2, lc.u0.f(mVar2), mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.p1 p1Var = (p3.p1) obj2;
                ((d4.n) obj).getClass();
                p1Var.getClass();
                return p13.h0.b1((Iterable) p1Var.getF182175a());
            case 15:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                om0.a aVar6 = om0.a.f132894a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    mh.c(gl1.y.Q(mVar3, R.string.lbl_admin), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar3, 0, 0, 262142);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                om0.a aVar7 = om0.a.f132894a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    mh.c(gl1.y.Q(mVar4, R.string.lbl_member), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar4, 0, 0, 262142);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                om0.a aVar8 = om0.a.f132894a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar5, R.string.lbl_remove_from_group);
                    d92.b.f58623a.getClass();
                    mh.c(strQ, null, d92.b.a(mVar5).k().e(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar5, 0, 0, 262138);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                om0.a aVar9 = om0.a.f132894a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 19:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                om1.a aVar10 = om1.a.f132968a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new dn1.a(new qm1.e((j70.d) parametersHolder2.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(j70.d.class))));
            case 20:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                om1.a aVar11 = om1.a.f132968a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                return new cn1.f((dn1.a) parametersHolder3.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(dn1.a.class)));
            case 21:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                om1.b bVar = om1.b.f132970a;
                scope3.getClass();
                parametersHolder4.getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                return new dn1.c(new qm1.j((r53.i) parametersHolder4.elementAt(0, t0Var2.b(r53.i.class)), (bv.d) Scope.get$default(scope3, t0Var2.b(bv.d.class), (Qualifier) null, (e23.a) null, 6, (Object) null)));
            case 22:
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                om1.b bVar2 = om1.b.f132970a;
                ((Scope) obj).getClass();
                parametersHolder5.getClass();
                return new cn1.l((dn1.c) parametersHolder5.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(dn1.c.class)));
            case 23:
                Scope scope4 = (Scope) obj;
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                om1.b bVar3 = om1.b.f132970a;
                scope4.getClass();
                parametersHolder6.getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                return new dn1.d(new qm1.j((r53.i) parametersHolder6.elementAt(0, t0Var3.b(r53.i.class)), (bv.d) Scope.get$default(scope4, t0Var3.b(bv.d.class), (Qualifier) null, (e23.a) null, 6, (Object) null)));
            case 24:
                ParametersHolder parametersHolder7 = (ParametersHolder) obj2;
                om1.b bVar4 = om1.b.f132970a;
                ((Scope) obj).getClass();
                parametersHolder7.getClass();
                return new cn1.s((dn1.d) parametersHolder7.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(dn1.d.class)));
            case 25:
                Scope scope5 = (Scope) obj;
                ParametersHolder parametersHolder8 = (ParametersHolder) obj2;
                om1.b bVar5 = om1.b.f132970a;
                scope5.getClass();
                parametersHolder8.getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                return new dn1.b(new qm1.j((r53.i) parametersHolder8.elementAt(0, t0Var4.b(r53.i.class)), (bv.d) Scope.get$default(scope5, t0Var4.b(bv.d.class), (Qualifier) null, (e23.a) null, 6, (Object) null)));
            case 26:
                ParametersHolder parametersHolder9 = (ParametersHolder) obj2;
                om1.b bVar6 = om1.b.f132970a;
                ((Scope) obj).getClass();
                parametersHolder9.getClass();
                return new cn1.h((dn1.b) parametersHolder9.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(dn1.b.class)));
            case 27:
                Scope scope6 = (Scope) obj;
                om1.b bVar7 = om1.b.f132970a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                return new sm1.s((nm1.a) scope6.get((k23.d<?>) t0Var5.b(nm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pm1.g) scope6.get((k23.d<?>) t0Var5.b(pm1.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pm1.f) scope6.get((k23.d<?>) t0Var5.b(pm1.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pm1.a) scope6.get((k23.d<?>) t0Var5.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t60.h) scope6.get((k23.d<?>) t0Var5.b(t60.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 28:
                om1.d dVar = om1.d.f132973a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (im1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, im1.a.class, new c83.h.a[0], null, null, null, 120);
            default:
                Scope scope7 = (Scope) obj;
                om1.d dVar2 = om1.d.f132973a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nm1.b((im1.a) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(im1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
        }
    }

    public /* synthetic */ o3(int i14, int i15) {
        this.f130516a = i15;
    }
}
