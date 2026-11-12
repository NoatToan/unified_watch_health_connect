package vb1;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaTopUpActivity;
import com.google.common.base.Optional;
import com.google.firebase.perf.util.Constants;
import e23.l;
import i3.e5;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import lh2.u;
import o13.p;
import o70.t;
import oj0.x;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p5.h0;
import p5.k0;
import qj0.m;
import r1.l0;
import r1.u0;
import r70.r;
import tn2.y0;
import ty1.o;
import vc0.w;
import vn2.b0;
import vn2.g0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176869a;

    public /* synthetic */ d(w wVar) {
        this.f176869a = 9;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 28;
        switch (this.f176869a) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.D(k0Var);
                return Unit.INSTANCE;
            case 1:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.E(k0Var2, 1.0f);
                return Unit.INSTANCE;
            case 2:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                h0.D(k0Var3);
                return Unit.INSTANCE;
            case 3:
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                h0.D(k0Var4);
                return Unit.INSTANCE;
            case 4:
                k0 k0Var5 = (k0) obj;
                k0Var5.getClass();
                h0.E(k0Var5, 1.0f);
                return Unit.INSTANCE;
            case 5:
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                h0.E(k0Var6, 1.0f);
                return Unit.INSTANCE;
            case 6:
                uc.c cVar = (uc.c) obj;
                return new p(s0.f105811a.b(cVar.getClass()), cVar.getF169931a());
            case 7:
                return new l0(u0.d(s1.l.d(Constants.FROZEN_FRAME_TIME, 0, null, 6), 2), u0.e(s1.l.d(Constants.FROZEN_FRAME_TIME, 0, null, 6), 2), 0.0f, null, 12, null);
            case 8:
                return new l0(u0.d(s1.l.d(Constants.FROZEN_FRAME_TIME, 0, null, 6), 2), u0.e(s1.l.d(Constants.FROZEN_FRAME_TIME, 0, null, 6), 2), 0.0f, null, 12, null);
            case 9:
                al2.c cVar2 = (al2.c) obj;
                Logger logger = w.f177025g;
                cVar2.getClass();
                al2.b bVar = cVar2.f3777c;
                Logger logger2 = w.f177025g;
                com.airbnb.lottie.animation.keyframe.a.u("handleSyncNowStatus: handling sync now response status: ", bVar.name(), ".", logger2);
                int i15 = w.b.f177031a[bVar.ordinal()];
                if (i15 != 1 && i15 != 2) {
                    if (i15 != 3) {
                        com.airbnb.lottie.animation.keyframe.a.z("handleSyncStatus: sync failed with ", bVar.name(), ".", logger2);
                        u uVar = w.f177026h;
                        if (uVar == null) {
                            s.m("syncListener");
                            throw null;
                        }
                        bVar.name().getClass();
                        uVar.f112558c.getClass();
                        View viewA = uVar.a();
                        if (viewA != null) {
                            viewA.clearAnimation();
                            viewA.setClickable(true);
                        }
                    } else {
                        logger2.debug("handleSyncNowStatus: handling sync now status: " + bVar + ".");
                        u uVar2 = w.f177026h;
                        if (uVar2 == null) {
                            s.m("syncListener");
                            throw null;
                        }
                        uVar2.c();
                    }
                }
                return Unit.INSTANCE;
            case 10:
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj;
                activityListItemDTO.getClass();
                return Long.valueOf(activityListItemDTO.f29250b);
            case 11:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                ((pe0.g) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                pe0.e eVar = (pe0.e) obj;
                eVar.getClass();
                if (eVar instanceof pe0.e.b) {
                    return fb1.c.n("header_", ((pe0.e.b) eVar).f137419a);
                }
                if (eVar instanceof pe0.e.a) {
                    return org.apache.commons.lang3.e.e(((pe0.e.a) eVar).f137418a.f29250b, "activity_");
                }
                lc.u0.r();
                return null;
            case 15:
                pe0.d dVar = (pe0.d) obj;
                if (dVar != null) {
                    return Long.valueOf(dVar.f137416a);
                }
                return -1L;
            case 16:
                pe0.d dVar2 = (pe0.d) obj;
                if (dVar2 != null) {
                    return Long.valueOf(dVar2.f137416a);
                }
                return -1L;
            case 17:
                Module module = (Module) obj;
                vh0.a aVar = vh0.a.f178404a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(t.f130075r.a());
                vc0.i iVar = new vc0.i(14);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, iVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed, new vc0.i(15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(xh0.h.class), null, new vc0.i(16), kind, j0Var), module));
                return Unit.INSTANCE;
            case 18:
                Module module2 = (Module) obj;
                vh0.b bVar2 = vh0.b.f178406a;
                module2.getClass();
                new KoinDefinition(module2, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(th0.a.class), null, new vc0.i(17), Kind.Factory, j0.f134944a), module2));
                return Unit.INSTANCE;
            case 19:
                Module module3 = (Module) obj;
                vj0.a aVar2 = vj0.a.f178448a;
                module3.getClass();
                vc0.i iVar2 = new vc0.i(20);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(m.class), null, iVar2, kind2, j0Var2), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(oj0.a.class), null, new vc0.i(22), kind2, j0Var2), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(x.class), null, new vc0.i(23), kind2, j0Var2), module3));
                vc0.i iVar3 = new vc0.i(24);
                StringQualifier rootScopeQualifier3 = companion2.getRootScopeQualifier();
                Kind kind3 = Kind.Singleton;
                SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(rootScopeQualifier3, t0Var2.b(oj0.f.class), null, iVar3, kind3, j0Var2), module3);
                if (module3.get_createdAtStart()) {
                    module3.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module3, singleInstanceFactoryP);
                SingleInstanceFactory<?> singleInstanceFactoryP2 = lc.u0.p(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(oj0.w.class), null, new vc0.i(25), kind3, j0Var2), module3);
                if (module3.get_createdAtStart()) {
                    module3.prepareForCreationAtStart(singleInstanceFactoryP2);
                }
                new KoinDefinition(module3, singleInstanceFactoryP2);
                SingleInstanceFactory<?> singleInstanceFactoryP3 = lc.u0.p(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ht.i.class), null, new vc0.i(26), kind3, j0Var2), module3);
                if (module3.get_createdAtStart()) {
                    module3.prepareForCreationAtStart(singleInstanceFactoryP3);
                }
                new KoinDefinition(module3, singleInstanceFactoryP3);
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(yj0.f.class), null, new vc0.i(27), kind2, j0Var2), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.e.class), null, new vc0.i(i14), kind2, j0Var2), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ck0.m.class), null, new vc0.i(18), kind2, j0Var2), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ub1.g.class), null, new vc0.i(19), kind2, j0Var2), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(zj0.e.class), null, new vc0.i(21), kind2, j0Var2), module3));
                return Unit.INSTANCE;
            case 20:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                k0 k0Var7 = (k0) obj;
                k0Var7.getClass();
                h0.n(k0Var7, "");
                return Unit.INSTANCE;
            case 22:
                return vn2.i.c1((y0.c) obj);
            case 23:
                return vn2.s.I1((fs2.a) obj);
            case 24:
                b0.f178864c.error("getBalance failed: ", (Throwable) obj);
                return Unit.INSTANCE;
            case 25:
                androidx.appcompat.app.e.a aVar3 = (androidx.appcompat.app.e.a) obj;
                FelicaTopUpActivity.a aVar4 = FelicaTopUpActivity.f50969p;
                aVar3.getClass();
                aVar3.setTitle(R.string.wallet_title_error_empty_recharge_amount);
                aVar3.setMessage(R.string.wallet_message_error_empty_recharge_amount);
                aVar3.setPositiveButton(R.string.lbl_ok, new o(28));
                return Unit.INSTANCE;
            case 26:
                return g0.b1((Optional) obj);
            case 27:
                return g0.Z0((Optional) obj);
            case 28:
                vn2.k0.f178905d.error("Get Balance Failed: ", (Throwable) obj);
                return Unit.INSTANCE;
            default:
                DecimalFormatSymbols decimalFormatSymbols = (DecimalFormatSymbols) obj;
                decimalFormatSymbols.getClass();
                return new DecimalFormat("+¤###,###,###;-¤###,###,###", decimalFormatSymbols);
        }
    }

    public /* synthetic */ d(int i14) {
        this.f176869a = i14;
    }
}
