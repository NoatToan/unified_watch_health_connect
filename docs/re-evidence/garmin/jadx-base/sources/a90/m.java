package a90;

import ak0.t;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import b82.d2;
import ca0.o1;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import e23.p;
import kb0.r;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p3.p0;
import p3.x1;
import tb0.q;
import tb0.y;
import y80.a0;
import y80.b0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2033a;

    public /* synthetic */ m(int i14) {
        this.f2033a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f2033a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                n nVar = n.f2034a;
                scope.getClass();
                parametersHolder.getClass();
                t0 t0Var = s0.f105811a;
                boolean zBooleanValue = ((Boolean) parametersHolder.elementAt(0, t0Var.b(Boolean.class))).booleanValue();
                String str = (String) parametersHolder.elementAt(1, t0Var.b(String.class));
                String str2 = (String) parametersHolder.elementAt(2, t0Var.b(String.class));
                String str3 = (String) parametersHolder.elementAt(3, t0Var.b(String.class));
                o90.a aVar2 = (o90.a) parametersHolder.elementAt(4, t0Var.b(o90.a.class));
                u0 u0Var = (u0) u0.f203782n6.get(str);
                if (u0Var == null) {
                    u0Var = u0.f203733h;
                }
                u0 u0Var2 = u0Var;
                return new q(zBooleanValue, str2 != null ? str2 : "Unknown Device", u0Var2, new aa0.e(u0Var2, str3, str2, aVar2, new k22.b(ModuleExtKt.androidContext(scope)), (b0) scope.get((k23.d<?>) t0Var.b(b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 1:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                n nVar2 = n.f2034a;
                scope2.getClass();
                parametersHolder2.getClass();
                t0 t0Var2 = s0.f105811a;
                Long l14 = (Long) parametersHolder2.elementAt(0, t0Var2.b(Long.class));
                String str4 = (String) parametersHolder2.elementAt(1, t0Var2.b(String.class));
                String str5 = (String) parametersHolder2.elementAt(2, t0Var2.b(String.class));
                d90.h hVar = (d90.h) parametersHolder2.elementAt(4, t0Var2.b(d90.h.class));
                u0 u0Var3 = (u0) u0.f203782n6.get(str4);
                if (u0Var3 == null) {
                    u0Var3 = u0.f203733h;
                }
                return new tb0.n(l14, u0Var3, str5 == null ? "Unknown Device" : str5, hVar, (b0) scope2.get((k23.d<?>) t0Var2.b(b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope2.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 2:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                n nVar3 = n.f2034a;
                scope3.getClass();
                parametersHolder3.getClass();
                t0 t0Var3 = s0.f105811a;
                u0 u0Var4 = (u0) u0.f203782n6.get((String) parametersHolder3.elementAt(0, t0Var3.b(String.class)));
                if (u0Var4 == null) {
                    u0Var4 = u0.f203733h;
                }
                return new rb0.i(u0Var4, (b0) scope3.get((k23.d<?>) t0Var3.b(b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 3:
                Scope scope4 = (Scope) obj;
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                n nVar4 = n.f2034a;
                scope4.getClass();
                parametersHolder4.getClass();
                t0 t0Var4 = s0.f105811a;
                return new q(false, "Unknown Device (Testing tutorials)", null, new aa0.g(ModuleExtKt.androidContext(scope4), (Uri) parametersHolder4.elementAt(0, t0Var4.b(Uri.class)), (a0) scope4.get((k23.d<?>) t0Var4.b(a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 4:
                Scope scope5 = (Scope) obj;
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                n nVar5 = n.f2034a;
                scope5.getClass();
                parametersHolder5.getClass();
                t0 t0Var5 = s0.f105811a;
                String str6 = (String) parametersHolder5.elementAt(0, t0Var5.b(String.class));
                String str7 = (String) parametersHolder5.elementAt(1, t0Var5.b(String.class));
                String str8 = (String) parametersHolder5.elementAt(2, t0Var5.b(String.class));
                o90.a aVar3 = (o90.a) parametersHolder5.elementAt(3, t0Var5.b(o90.a.class));
                d90.i iVar = (d90.i) parametersHolder5.elementAt(4, t0Var5.b(d90.i.class));
                u0 u0Var5 = (u0) u0.f203782n6.get(str6);
                if (u0Var5 == null) {
                    u0Var5 = u0.f203733h;
                }
                return new y(iVar, new aa0.e(u0Var5, str8, str7, aVar3, new k22.b(ModuleExtKt.androidContext(scope5)), (b0) scope5.get((k23.d<?>) t0Var5.b(b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 5:
                Scope scope6 = (Scope) obj;
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                n nVar6 = n.f2034a;
                scope6.getClass();
                parametersHolder6.getClass();
                t0 t0Var6 = s0.f105811a;
                return new y(null, new aa0.g(ModuleExtKt.androidContext(scope6), (Uri) parametersHolder6.elementAt(0, t0Var6.b(Uri.class)), (a0) scope6.get((k23.d<?>) t0Var6.b(a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 6:
                Scope scope7 = (Scope) obj;
                ParametersHolder parametersHolder7 = (ParametersHolder) obj2;
                o oVar = o.f2036a;
                scope7.getClass();
                parametersHolder7.getClass();
                t0 t0Var7 = s0.f105811a;
                return new fb0.a((z80.i) parametersHolder7.elementAt(0, t0Var7.b(z80.i.class)), (t90.a) scope7.get((k23.d<?>) t0Var7.b(t90.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 7:
                Scope scope8 = (Scope) obj;
                ParametersHolder parametersHolder8 = (ParametersHolder) obj2;
                o oVar2 = o.f2036a;
                scope8.getClass();
                parametersHolder8.getClass();
                t0 t0Var8 = s0.f105811a;
                return new ob0.h((z80.n) parametersHolder8.elementAt(0, t0Var8.b(z80.n.class)), (x90.a) scope8.get((k23.d<?>) t0Var8.b(x90.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 8:
                Scope scope9 = (Scope) obj;
                o oVar3 = o.f2036a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                return new y80.t0((v90.e) scope9.get((k23.d<?>) s0.f105811a.b(v90.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 9:
                o oVar4 = o.f2036a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new r();
            case 10:
                Scope scope10 = (Scope) obj;
                o oVar5 = o.f2036a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                return new s90.b((x80.b) scope10.get((k23.d<?>) s0.f105811a.b(x80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 11:
                Scope scope11 = (Scope) obj;
                o oVar6 = o.f2036a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                return new s90.c(ModuleExtKt.androidContext(scope11));
            case 12:
                Scope scope12 = (Scope) obj;
                ParametersHolder parametersHolder9 = (ParametersHolder) obj2;
                o oVar7 = o.f2036a;
                scope12.getClass();
                parametersHolder9.getClass();
                t0 t0Var9 = s0.f105811a;
                return new ab0.a((q90.c) parametersHolder9.elementAt(1, t0Var9.b(q90.c.class)), (o1) parametersHolder9.elementAt(0, t0Var9.b(o1.class)), ((Boolean) parametersHolder9.elementAt(2, t0Var9.b(Boolean.class))).booleanValue(), (y80.s0) scope12.get((k23.d<?>) t0Var9.b(y80.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new s90.a((s90.c) scope12.get((k23.d<?>) t0Var9.b(s90.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)), (w90.a) scope12.get((k23.d<?>) t0Var9.b(w90.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s90.b) scope12.get((k23.d<?>) t0Var9.b(s90.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 13:
                Scope scope13 = (Scope) obj;
                o oVar8 = o.f2036a;
                scope13.getClass();
                ((ParametersHolder) obj2).getClass();
                return new v90.b(ModuleExtKt.androidContext(scope13));
            case 14:
                o oVar9 = o.f2036a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new t90.a();
            case 15:
                o oVar10 = o.f2036a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new x90.a();
            case 16:
                Scope scope14 = (Scope) obj;
                ParametersHolder parametersHolder10 = (ParametersHolder) obj2;
                o oVar11 = o.f2036a;
                scope14.getClass();
                parametersHolder10.getClass();
                Context contextAndroidContext = ModuleExtKt.androidContext(scope14);
                t0 t0Var10 = s0.f105811a;
                return new ib0.g(contextAndroidContext, (String) parametersHolder10.getOrNull(t0Var10.b(String.class)), (v90.d) scope14.get((k23.d<?>) t0Var10.b(v90.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v90.e) scope14.get((k23.d<?>) t0Var10.b(v90.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new v90.c(), (v90.b) scope14.get((k23.d<?>) t0Var10.b(v90.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 17:
                ((Integer) obj2).getClass();
                ao1.e.d((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ao1.e.e((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ao1.e.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ao1.k.c((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ao1.k.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                FitPayAddCardActivity.a aVar4 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 23:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                as.a aVar5 = as.a.f12615a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d2.f16532a.d(null, as.a.f12616b, mVar, 48, 1);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                as.b bVar = as.b.f12618a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d2.f16532a.d(null, as.b.f12619b, mVar2, 48, 1);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                as.b bVar2 = as.b.f12618a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    j0 j0Var = j0.f134944a;
                    Object objQ = mVar3.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new t(19);
                        mVar3.K(objQ);
                    }
                    e23.a aVar6 = (e23.a) objQ;
                    Object objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new t(20);
                        mVar3.K(objQ2);
                    }
                    as.m.a(j0Var, true, aVar6, (e23.a) objQ2, mVar3, 3510);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                as.c cVar = as.c.f12621a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    d2.f16532a.d(null, as.c.f12622b, mVar4, 48, 1);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                as.c cVar2 = as.c.f12621a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    j0 j0Var2 = j0.f134944a;
                    Object objQ3 = mVar5.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new t(21);
                        mVar5.K(objQ3);
                    }
                    e23.a aVar7 = (e23.a) objQ3;
                    Object objQ4 = mVar5.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new t(22);
                        mVar5.K(objQ4);
                    }
                    as.o.a(j0Var2, true, aVar7, (e23.a) objQ4, mVar5, 3510);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 28:
                ParametersHolder parametersHolder11 = (ParametersHolder) obj2;
                as0.a aVar8 = as0.a.f12677a;
                ((Scope) obj).getClass();
                parametersHolder11.getClass();
                return new hs0.a(new cs0.b((j70.d) parametersHolder11.elementAt(0, s0.f105811a.b(j70.d.class))));
            default:
                ParametersHolder parametersHolder12 = (ParametersHolder) obj2;
                as0.a aVar9 = as0.a.f12677a;
                ((Scope) obj).getClass();
                parametersHolder12.getClass();
                return new gs0.a((hs0.a) parametersHolder12.elementAt(0, s0.f105811a.b(hs0.a.class)));
        }
    }

    public /* synthetic */ m(int i14, int i15) {
        this.f2033a = i15;
    }
}
