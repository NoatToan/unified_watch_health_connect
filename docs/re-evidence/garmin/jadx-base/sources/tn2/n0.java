package tn2;

import android.content.Context;
import android.text.method.MovementMethod;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l2;
import com.garmin.android.apps.connectmobile.social.share.ui.StickerEditorView;
import com.garmin.feature.garminpay.ui.userwallet.CardDetailsActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment;
import com.garmin.proto.generated.GDIConnectedDevicesReporting;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.t1;
import org.joda.time.DateTime;
import org.joda.time.Days;
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
import u1.o1;
import u1.q1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165604a;

    public /* synthetic */ n0(int i14) {
        this.f165604a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        List list;
        List list2;
        int i14 = 13;
        int i15 = 12;
        int i16 = 11;
        int i17 = 26;
        int i18 = 25;
        int i19 = 18;
        int i24 = 8;
        boolean z14 = true;
        int i25 = 6;
        int i26 = 0;
        Character ch3 = null;
        switch (this.f165604a) {
            case 0:
                c83.a0 a0Var = (c83.a0) obj;
                Logger logger = r0.f165631n;
                a0Var.getClass();
                T t7 = a0Var.f25746b;
                t7.getClass();
                pn2.p pVar = (pn2.p) t7;
                i iVar = new i(a0Var);
                if (iVar.d()) {
                    return (rn2.j) pVar.d();
                }
                throw iVar.c();
            case 1:
                Throwable th3 = (Throwable) obj;
                Logger logger2 = r0.f165631n;
                th3.getClass();
                return r0.r("getCardList()", th3);
            case 2:
                Throwable th4 = (Throwable) obj;
                Logger logger3 = r0.f165631n;
                th4.getClass();
                return r0.r("endRecoverCard()", th4);
            case 3:
                Throwable th5 = (Throwable) obj;
                Logger logger4 = r0.f165631n;
                th5.getClass();
                return r0.r("endPermanentDeleteCard()", th5);
            case 4:
                Throwable th6 = (Throwable) obj;
                Logger logger5 = r0.f165631n;
                th6.getClass();
                return r0.r("beginInitializeChip()", th6);
            case 5:
                y0.d dVar = (y0.d) obj;
                Logger logger6 = y0.f165733f;
                dVar.getClass();
                if (dVar instanceof y0.d.b) {
                    return ((y0.d.b) dVar).f165750a;
                }
                if (dVar instanceof y0.d.a) {
                    throw ((y0.d.a) dVar).f165749a;
                }
                lc.u0.r();
                return null;
            case 6:
                float fFloatValue = ((Float) obj).floatValue();
                int i27 = StickerEditorView.f44707l;
                return Float.valueOf(fFloatValue + 1.0f);
            case 7:
                to2.f.f165901f.debug("getUserStreamEvents: subscribe to event stream");
                return Unit.INSTANCE;
            case 8:
                Logger logger7 = to2.f.f165901f;
                ((Throwable) obj).getClass();
                q03.q qVar = l13.a.f108326a;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                w03.b.a(timeUnit, "unit is null");
                w03.b.a(qVar, "scheduler is null");
                return new d13.x(Math.max(5L, 0L), timeUnit, qVar);
            case 9:
                to2.f.f165901f.info((String) obj);
                return Unit.INSTANCE;
            case 10:
                CardDetailsActivity.f52167o.error("Something went wrong when processing card details item click event (" + ((Throwable) obj) + ")");
                return Unit.INSTANCE;
            case 11:
                PaymentCardDetailsFragment.f52189m.error("Something went wrong when processing card details item click event (" + ((Throwable) obj) + ")");
                return Unit.INSTANCE;
            case 12:
                com.garmin.feature.garminpay.ui.userwallet.e.f52304l.error("Something went wrong when processing card details item click event (" + ((Throwable) obj) + ")");
                return Unit.INSTANCE;
            case 13:
                Module module = (Module) obj;
                ts0.a aVar = ts0.a.f166190a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.t.D.a());
                tr2.e eVar = new tr2.e(i25);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, eVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new tr2.e(7), kind, j0Var), module));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.t.E.a());
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.s.class), stringQualifierNamed2, new tr2.e(i24), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed2, new tr2.e(9), kind, j0Var), module));
                return Unit.INSTANCE;
            case 14:
                Module module2 = (Module) obj;
                ts1.b bVar = ts1.b.f166192a;
                module2.getClass();
                tr2.e eVar2 = new tr2.e(i14);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(ms1.a.class), null, eVar2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(mv0.e.class), null, new tr2.e(16), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ps1.a.class), null, new tr2.e(17), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ps1.b.class), null, new tr2.e(i19), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(d60.a.class), null, new tr2.e(19), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ss1.a.class), null, new tr2.e(20), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ss1.a0.class), null, new tr2.e(21), kind2, j0Var2), module2));
                tr2.e eVar3 = new tr2.e(10);
                StringQualifier rootScopeQualifier3 = companion2.getRootScopeQualifier();
                Kind kind3 = Kind.Singleton;
                SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(rootScopeQualifier3, t0Var2.b(vs1.h.class), null, eVar3, kind3, j0Var2), module2);
                if (module2.get_createdAtStart()) {
                    module2.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module2, singleInstanceFactoryP);
                SingleInstanceFactory<?> singleInstanceFactoryP2 = lc.u0.p(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(vs1.o.class), null, new tr2.e(i16), kind3, j0Var2), module2);
                if (module2.get_createdAtStart()) {
                    module2.prepareForCreationAtStart(singleInstanceFactoryP2);
                }
                new KoinDefinition(module2, singleInstanceFactoryP2);
                SingleInstanceFactory<?> singleInstanceFactoryP3 = lc.u0.p(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(vs1.x.class), null, new tr2.e(i15), kind3, j0Var2), module2);
                if (module2.get_createdAtStart()) {
                    module2.prepareForCreationAtStart(singleInstanceFactoryP3);
                }
                new KoinDefinition(module2, singleInstanceFactoryP3);
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(qt1.a.class), null, new tr2.e(14), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(qt1.k.class), null, new tr2.e(15), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 15:
                GDIConnectedDevicesReporting.ConnectedDevice connectedDevice = (GDIConnectedDevicesReporting.ConnectedDevice) obj;
                connectedDevice.getClass();
                return String.valueOf(ts2.a.b(connectedDevice));
            case 16:
                o13.p pVar2 = (o13.p) obj;
                pVar2.getClass();
                GDIConnectedDevicesReporting.ConnectedDevice connectedDevice2 = (GDIConnectedDevicesReporting.ConnectedDevice) pVar2.f128594a;
                int iIntValue = ((Number) pVar2.f128595b).intValue();
                return ts2.a.b(connectedDevice2) + ": status=" + iIntValue;
            case 17:
                DateTime dateTime = (DateTime) obj;
                int i28 = tt0.f.f166396c;
                return Boolean.valueOf(dateTime != null && Days.daysBetween(DateTime.now(), dateTime).getDays() <= 5);
            case 18:
                Module module3 = (Module) obj;
                tu.b bVar2 = tu.b.f166468a;
                module3.getClass();
                tu.a aVar2 = new tu.a(2);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion3.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var3.b(av.c0.class), null, aVar2, kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(av.e.class), null, new tr2.e(23), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(av.f.class), null, new tr2.e(24), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ru.e.class), null, new tr2.e(i18), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(av.g.class), null, new tr2.e(i17), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(eo1.a.class), null, new tr2.e(27), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(a22.i.class), null, new tr2.e(28), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(uu.q.class), null, new tr2.e(29), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(xu.c.class), null, new tu.a(i26), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(xu.a.class), null, new tu.a(z14 ? 1 : 0), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zu.b.class), null, new tu.a(3), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zu.p.class), null, new tu.a(4), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zu.m.class), null, new tu.a(5), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zu.k.class), null, new tu.a(i25), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zu.i.class), null, new tu.a(7), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zu.g.class), null, new tu.a(i24), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zu.d.class), null, new tu.a(9), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zu.n.class), null, new tu.a(10), kind4, j0Var3), module3));
                return Unit.INSTANCE;
            case 19:
                Module module4 = (Module) obj;
                tu0.a aVar3 = tu0.a.f166470a;
                module4.getClass();
                tu.a aVar4 = new tu.a(i19);
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier5 = companion4.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                p13.j0 j0Var4 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module4, e5.n(new BeanDefinition(rootScopeQualifier5, t0Var4.b(f12.l.class), null, aVar4, kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(ru0.c.class), null, new tu.a(i18), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(ru0.a.class), null, new tu.a(i17), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(MovementMethod.class), null, new tu.a(i16), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(l22.b.class), null, new tu.a(i15), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(su0.u.class), null, new tu.a(i14), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(yu0.d.class), null, new tu.a(14), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(gv0.d.class), null, new tu.a(15), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(kv0.j.class), null, new tu.a(16), kind5, j0Var4), module4));
                SingleInstanceFactory<?> singleInstanceFactoryP4 = lc.u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(uu0.h.class), null, new tu.a(17), Kind.Singleton, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP4);
                }
                new KoinDefinition(module4, singleInstanceFactoryP4);
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(yu0.e.class), null, new tu.a(19), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(su0.z.class), null, new tu.a(20), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(su0.a.class), null, new tu.a(21), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(su0.b0.class), null, new tu.a(22), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(yu0.f.class), null, new tu.a(23), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fv0.g.class), null, new tu.a(24), kind5, j0Var4), module4));
                ee2.a.f63925a.getClass();
                module4.includes(ee2.a.f63926b);
                return Unit.INSTANCE;
            case 20:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                ((Boolean) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                c63.s.d dVar2 = (c63.s.d) obj;
                dVar2.getClass();
                ArrayList arrayList = c63.a1.f24945a;
                c63.z0.f25088a.getClass();
                ArrayList arrayListM = p13.x.m(new ArrayList());
                String str = "";
                int i29 = 0;
                int i30 = 0;
                boolean z15 = false;
                Character chValueOf = null;
                while (i29 < 8) {
                    char cCharAt = "HH:mm:ss".charAt(i29);
                    if (chValueOf != null && cCharAt == chValueOf.charValue()) {
                        i30++;
                    } else if (!z15) {
                        if (i30 > 0) {
                            List list3 = (List) p13.h0.m0(arrayListM);
                            if (list3 != null) {
                                chValueOf.getClass();
                                list3.add(c63.a1.a(chValueOf.charValue(), i30));
                            }
                            i30 = 0;
                            chValueOf = ch3;
                        }
                        if (c63.a1.f24945a.contains(Character.valueOf(cCharAt))) {
                            if (!p005kotlin.jvm.internal.s.g(str, "")) {
                                List list4 = (List) p13.h0.m0(arrayListM);
                                if (list4 != null) {
                                    list4.add(new c63.z0.e(str));
                                }
                                str = "";
                            }
                            if (cCharAt == '\'') {
                                str = "";
                                z15 = true;
                            } else if (cCharAt == '[') {
                                arrayListM.add(new ArrayList());
                            } else if (cCharAt != ']') {
                                chValueOf = Character.valueOf(cCharAt);
                                i30 = 1;
                            } else {
                                List list5 = (List) p13.d0.F(arrayListM);
                                if (list5 == null) {
                                    vb.h.s("Unmatched closing bracket");
                                    return null;
                                }
                                List list6 = (List) p13.h0.m0(arrayListM);
                                if (list6 != null) {
                                    list6.add(new c63.z0.c(new c63.z0.d(list5)));
                                }
                            }
                        } else {
                            str = str + cCharAt;
                        }
                    } else if (cCharAt == '\'') {
                        List list7 = (List) p13.h0.m0(arrayListM);
                        if (list7 != null) {
                            if (str.length() == 0) {
                                str = "'";
                            }
                            list7.add(new c63.z0.e(str));
                        }
                        str = "";
                        z15 = false;
                    } else {
                        str = str + cCharAt;
                    }
                    i29++;
                    ch3 = null;
                    z15 = z15;
                }
                if (i30 > 0 && (list2 = (List) p13.h0.m0(arrayListM)) != null) {
                    chValueOf.getClass();
                    list2.add(c63.a1.a(chValueOf.charValue(), i30));
                }
                if (!p005kotlin.jvm.internal.s.g(str, "") && (list = (List) p13.h0.m0(arrayListM)) != null) {
                    list.add(new c63.z0.e(str));
                }
                List list8 = (List) p13.d0.F(arrayListM);
                if (list8 != null) {
                    c63.a1.d(dVar2, new c63.z0.d(list8));
                    return Unit.INSTANCE;
                }
                vb.h.s("Unmatched opening bracket");
                return null;
            case 24:
                r1.n nVar = (r1.n) obj;
                nVar.getClass();
                r1.n.a.f149168b.getClass();
                int i34 = r1.n.a.f149172f;
                return new r1.l0(nVar.e(i34, s1.l.d(500, 0, null, 6), r1.o.f149178a), nVar.b(i34, s1.l.d(500, 0, null, 6), r1.p.f149188a), 0.0f, null, 12, null);
            case 25:
                r1.n nVar2 = (r1.n) obj;
                nVar2.getClass();
                r1.n.a.f149168b.getClass();
                int i35 = r1.n.a.f149173g;
                return new r1.l0(nVar2.e(i35, s1.l.d(500, 0, null, 6), r1.o.f149178a), nVar2.b(i35, s1.l.d(500, 0, null, 6), r1.p.f149188a), 0.0f, null, 12, null);
            case 26:
                ((q4.c) obj).m1();
                return Unit.INSTANCE;
            case 27:
                u1.y0.a aVar6 = u1.y0.a.f167721a;
                return Unit.INSTANCE;
            case 28:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            default:
                p3.u uVar = (p3.u) obj;
                l2 l2Var = u1.k.f167580b;
                Context context = (Context) uVar.f(AndroidCompositionLocals_androidKt.f6042b);
                g6.c cVar = (g6.c) uVar.f(t1.f91490h);
                o1 o1Var = (o1) uVar.f(q1.f167660a);
                if (o1Var == null) {
                    return null;
                }
                return new u1.j(context, cVar, o1Var.f167648a, o1Var.f167649b, null);
        }
    }
}
