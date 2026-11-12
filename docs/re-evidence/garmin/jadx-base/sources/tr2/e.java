package tr2;

import android.content.Context;
import android.content.DialogInterface;
import av.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import f72.ae;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.x1;
import ss1.a0;
import ss1.v0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166138a;

    public /* synthetic */ e(int i14) {
        this.f166138a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 1;
        switch (this.f166138a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                f fVar = f.f166139a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    b82.n.c(ae.a(t62.c.f162799a), gl1.y.Q(mVar, R.string.lbl_wallet_not_supported), gl1.y.Q(mVar, R.string.msg_feature_not_supported), null, null, mVar, 0, 24);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                f fVar2 = f.f166139a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, f.f166140b, mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                Logger logger = PaymentCardDetailsFragment.f52189m;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 3:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                Logger logger2 = PaymentCardDetailsFragment.f52189m;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 4:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                UserWalletActivity.a aVar = UserWalletActivity.f52217q;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                return Unit.INSTANCE;
            case 5:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
                dialogInterface4.getClass();
                dialogInterface4.dismiss();
                return Unit.INSTANCE;
            case 6:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                ts0.a aVar3 = ts0.a.f166190a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                r53.i iVar = (r53.i) parametersHolder.elementAt(0, s0.f105811a.b(r53.i.class));
                xs0.a aVar4 = xs0.a.RUNNING;
                return new ss0.a(new qs0.e(iVar, aVar4), aVar4);
            case 7:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                ts0.a aVar5 = ts0.a.f166190a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new rs0.a((ss0.a) parametersHolder2.elementAt(0, s0.f105811a.b(ss0.a.class)));
            case 8:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                ts0.a aVar6 = ts0.a.f166190a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                r53.i iVar2 = (r53.i) parametersHolder3.elementAt(0, s0.f105811a.b(r53.i.class));
                xs0.a aVar7 = xs0.a.ROWING;
                return new ss0.a(new qs0.e(iVar2, aVar7), aVar7);
            case 9:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                ts0.a aVar8 = ts0.a.f166190a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new rs0.a((ss0.a) parametersHolder4.elementAt(0, s0.f105811a.b(ss0.a.class)));
            case 10:
                ts1.b bVar = ts1.b.f166192a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new vs1.h();
            case 11:
                ts1.b bVar2 = ts1.b.f166192a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new vs1.o();
            case 12:
                Scope scope = (Scope) obj;
                ts1.b bVar3 = ts1.b.f166192a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new vs1.x((a0) scope.get((k23.d<?>) s0.f105811a.b(a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 13:
                Scope scope2 = (Scope) obj;
                ts1.b bVar4 = ts1.b.f166192a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ms1.b((f12.l) scope2.get((k23.d<?>) s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                Scope scope3 = (Scope) obj;
                ts1.b bVar5 = ts1.b.f166192a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var = s0.f105811a;
                return new qt1.a((Context) scope3.get((k23.d<?>) t0Var.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ss1.a) scope3.get((k23.d<?>) t0Var.b(ss1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (a0) scope3.get((k23.d<?>) t0Var.b(a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mv0.e) scope3.get((k23.d<?>) t0Var.b(mv0.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vs1.h) scope3.get((k23.d<?>) t0Var.b(vs1.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vs1.o) scope3.get((k23.d<?>) t0Var.b(vs1.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope4 = (Scope) obj;
                ts1.b bVar6 = ts1.b.f166192a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new qt1.k((ss1.a) scope4.get((k23.d<?>) t0Var2.b(ss1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (a0) scope4.get((k23.d<?>) t0Var2.b(a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vs1.h) scope4.get((k23.d<?>) t0Var2.b(vs1.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vs1.x) scope4.get((k23.d<?>) t0Var2.b(vs1.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vs1.o) scope4.get((k23.d<?>) t0Var2.b(vs1.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                Scope scope5 = (Scope) obj;
                ts1.b bVar7 = ts1.b.f166192a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new mv0.d(ModuleExtKt.androidContext(scope5), !((Boolean) scope5.get((k23.d<?>) s0.f105811a.b(Boolean.class), QualifierKt.named("IsChinaEnvironment"), (e23.a<? extends ParametersHolder>) null)).booleanValue());
            case 17:
                ts1.b bVar8 = ts1.b.f166192a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (ps1.a) ez0.b.a(ez0.b.f67468a, ez0.c.TRAILS, ps1.a.class, new c83.h.a[0], null, null, null, 120);
            case 18:
                ts1.b bVar9 = ts1.b.f166192a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (ps1.b) ez0.b.a(ez0.b.f67468a, ez0.c.TRAILS, ps1.b.class, new c83.h.a[0], null, null, null, 120);
            case 19:
                ts1.b bVar10 = ts1.b.f166192a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (d60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, d60.a.class, new c83.h.a[0], null, null, null, 120);
            case 20:
                Scope scope6 = (Scope) obj;
                ts1.b bVar11 = ts1.b.f166192a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var3 = s0.f105811a;
                return new ss1.z((ps1.a) scope6.get((k23.d<?>) t0Var3.b(ps1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (d60.a) scope6.get((k23.d<?>) t0Var3.b(d60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 21:
                Scope scope7 = (Scope) obj;
                ts1.b bVar12 = ts1.b.f166192a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                return new v0((ps1.b) scope7.get((k23.d<?>) s0.f105811a.b(ps1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tt1.l lVar = tt1.l.f166459a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    f12.l.f68084a.getClass();
                    z02.b.a(false, null, null, null, false, z3.f.c(1008462512, new mh1.g(f12.l.a.a().W0(), i14), mVar3), mVar3, 196608, 31);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 23:
                Scope scope8 = (Scope) obj;
                tu.b bVar13 = tu.b.f166468a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                return new av.e((c0) scope8.get((k23.d<?>) t0Var4.b(c0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope8.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ru.e) scope8.get((k23.d<?>) t0Var4.b(ru.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 24:
                tu.b bVar14 = tu.b.f166468a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (av.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, av.f.class, new c83.h.a[0], null, null, null, 120);
            case 25:
                Scope scope9 = (Scope) obj;
                tu.b bVar15 = tu.b.f166468a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ru.f((f12.l) scope9.get((k23.d<?>) s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                Scope scope10 = (Scope) obj;
                tu.b bVar16 = tu.b.f166468a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var5 = s0.f105811a;
                return new av.g((av.f) scope10.get((k23.d<?>) t0Var5.b(av.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ru.a) scope10.get((k23.d<?>) t0Var5.b(ru.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ru.e) scope10.get((k23.d<?>) t0Var5.b(ru.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var5.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 27:
                tu.b bVar17 = tu.b.f166468a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (eo1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, eo1.a.class, new c83.h.a[0], null, null, null, 120);
            case 28:
                Scope scope11 = (Scope) obj;
                tu.b bVar18 = tu.b.f166468a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                return new a22.i((eo1.a) scope11.get((k23.d<?>) s0.f105811a.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            default:
                Scope scope12 = (Scope) obj;
                tu.b bVar19 = tu.b.f166468a;
                scope12.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var6 = s0.f105811a;
                return new uu.q((zu.i) scope12.get((k23.d<?>) t0Var6.b(zu.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zu.p) scope12.get((k23.d<?>) t0Var6.b(zu.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zu.g) scope12.get((k23.d<?>) t0Var6.b(zu.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zu.d) scope12.get((k23.d<?>) t0Var6.b(zu.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zu.m) scope12.get((k23.d<?>) t0Var6.b(zu.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (av.g) scope12.get((k23.d<?>) t0Var6.b(av.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zu.n) scope12.get((k23.d<?>) t0Var6.b(zu.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (a22.i) scope12.get((k23.d<?>) t0Var6.b(a22.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ru.d) scope12.get((k23.d<?>) t0Var6.b(ru.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
        }
    }
}
