package g11;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.dashboard.PolylineView;
import com.garmin.android.apps.connectmobile.activities.stats.ebike.EBikePerformanceChartsActivity;
import com.garmin.android.gfdi.framework.FileManagerCompat;
import d53.y;
import g02.c1;
import gs1.q;
import hl0.u;
import hl0.x;
import i3.e5;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o4.q1;
import o53.f0;
import o70.t;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.g0;
import p13.h0;
import p13.j0;
import p5.k0;
import r70.r;
import r70.s;
import s5.i0;
import s5.w;
import w2.a0;
import w5.b0;
import w5.c0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74846a;

    public /* synthetic */ e(int i14) {
        this.f74846a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 10;
        int i15 = 2;
        char c14 = 1;
        byte b14 = 0;
        switch (this.f74846a) {
            case 0:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                g21.f fVar = (g21.f) obj;
                fVar.getClass();
                return fVar.f75416b;
            case 3:
                g21.o oVar = (g21.o) obj;
                oVar.getClass();
                return new g0(oVar.f75470h);
            case 4:
                b11.i iVar = (b11.i) obj;
                iVar.getClass();
                return iVar.getF14315a();
            case 5:
                String str = (String) obj;
                str.getClass();
                if (!g22.n.d(str) || !Character.isLowerCase(y.p0(str)) || str.length() <= 0) {
                    return str;
                }
                return ((Object) d53.b.e(str.charAt(0))) + str.substring(1);
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() <= 0) {
                    return str2;
                }
                return ((Object) d53.b.e(str2.charAt(0))) + str2.substring(1);
            case 7:
                oi0.b bVar = (oi0.b) obj;
                g40.d.a aVar = g40.d.f75763t;
                bVar.getClass();
                bVar.M();
                bVar.G();
                bVar.F();
                return Unit.INSTANCE;
            case 8:
                oi0.b bVar2 = (oi0.b) obj;
                g40.d.a aVar2 = g40.d.f75763t;
                bVar2.getClass();
                bVar2.M();
                return Unit.INSTANCE;
            case 9:
                oi0.b bVar3 = (oi0.b) obj;
                g40.f.a aVar3 = g40.f.f75776f;
                bVar3.getClass();
                bVar3.p();
                return Unit.INSTANCE;
            case 10:
                sd2.f fVar2 = (sd2.f) obj;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.a.C0932a c0932a = com.garmin.android.apps.connectmobile.weather.defaultlocation.a.f47906o;
                fVar2.getClass();
                return a0.i(fVar2);
            case 11:
                g63.h hVar = (g63.h) obj;
                hVar.getClass();
                StringBuilder sb3 = new StringBuilder("position ");
                sb3.append(hVar.f76140a);
                sb3.append(": '");
                return androidx.room.a0.m(sb3, hVar.f76141b.invoke(), CoreConstants.SINGLE_QUOTE_CHAR);
            case 12:
                List list = (List) obj;
                gd2.b bVar4 = gd2.a.f76980b;
                ArrayList arrayListL = androidx.core.view.j.l(list);
                for (Object obj2 : list) {
                    if (obj2 instanceof Inet4Address) {
                        arrayListL.add(obj2);
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof Inet6Address) {
                        arrayList.add(obj3);
                    }
                }
                return h0.C0(arrayListL, arrayList);
            case 13:
                InetAddress inetAddress = (InetAddress) obj;
                gd2.b bVar5 = gd2.a.f76980b;
                inetAddress.getClass();
                String hostAddress = inetAddress.getHostAddress();
                return hostAddress != null ? hostAddress : "";
            case 14:
                Module module = (Module) obj;
                gf1.a aVar4 = gf1.a.f77073a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(t.f130078w.a());
                c1 c1Var = new c1(i14);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(s.class), stringQualifierNamed, c1Var, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed, new c1(11), kind, j0Var), module));
                return Unit.INSTANCE;
            case 15:
                Module module2 = (Module) obj;
                gf1.b bVar6 = gf1.b.f77075a;
                module2.getClass();
                c1 c1Var2 = new c1(12);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(df1.a.class), null, c1Var2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ff1.a.class), null, new c1(13), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(jf1.b.class), null, new c1(14), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 16:
                Module module3 = (Module) obj;
                gl0.a aVar5 = gl0.a.f77821a;
                module3.getClass();
                c1 c1Var3 = new c1(18);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(el0.b.class), null, c1Var3, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(el0.c.class), null, new c1(21), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(u.class), null, new c1(22), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(hl0.f.class), null, new c1(23), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(hl0.a.class), null, new c1(24), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(hl0.n.class), null, new c1(25), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(hl0.k.class), null, new c1(26), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(hl0.o.class), null, new c1(15), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(x.class), null, new c1(16), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ll0.f.class), null, new c1(17), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ml0.p.class), null, new c1(19), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(kl0.d.class), null, new c1(20), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 17:
                String str3 = (String) obj;
                gl2.a.b bVar7 = gl2.a.f77873r;
                str3.getClass();
                return cl2.c.o(str3);
            case 18:
                Context context = (Context) obj;
                EBikePerformanceChartsActivity.a aVar6 = EBikePerformanceChartsActivity.f29816a;
                context.getClass();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                layoutInflaterFrom.getClass();
                return layoutInflaterFrom.inflate(R.layout.activity_details_charts_tab, (ViewGroup) null);
            case 19:
                Module module4 = (Module) obj;
                gq1.b bVar8 = gq1.b.f78507a;
                module4.getClass();
                gq1.a aVar7 = new gq1.a(b14, i15);
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                j0 j0Var4 = j0.f134944a;
                t0 t0Var4 = s0.f105811a;
                new KoinDefinition(module4, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var4.b(fq1.n.class), null, aVar7, kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.p.class), null, new gq1.a(b14, 7), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.d.class), null, new gq1.a(b14, 8), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.h.class), null, new gq1.a(b14, 9), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.k.class), null, new gq1.a(b14, i14), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.e.class), null, new c1(27), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.f.class), null, new c1(28), kind4, j0Var4), module4));
                SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.b.class), null, new c1(29), Kind.Singleton, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module4, singleInstanceFactoryP);
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.l.class), null, new gq1.a(b14, b14), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.m.class), null, new gq1.a(b14, c14 == true ? 1 : 0), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.c.class), null, new gq1.a(b14, 3), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.r.class), null, new gq1.a(b14, 4), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.g.class), null, new gq1.a(b14, 5), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fq1.a.class), null, new gq1.a(b14, 6), kind4, j0Var4), module4));
                return Unit.INSTANCE;
            case 20:
                Context context2 = (Context) obj;
                context2.getClass();
                LottieAnimationView lottieAnimationView = new LottieAnimationView(context2);
                lottieAnimationView.setAnimation(R.raw.muscle_map_share);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.setContentDescription(context2.getString(R.string.lbl_muscle_map));
                return lottieAnimationView;
            case 21:
                Context context3 = (Context) obj;
                context3.getClass();
                return new PolylineView(context3, null, 0, 6, null);
            case 22:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                oi0.b bVar9 = (oi0.b) obj;
                bVar9.getClass();
                bVar9.M();
                return Unit.INSTANCE;
            case 24:
                List list2 = (List) obj;
                Parcelable.Creator<q.b> creator = q.b.CREATOR;
                list2.getClass();
                return Boolean.valueOf(list2.size() >= 2);
            case 25:
                List list3 = (List) obj;
                Parcelable.Creator<q.b> creator2 = q.b.CREATOR;
                list3.getClass();
                Object obj4 = list3.get(0);
                Double d14 = obj4 instanceof Double ? (Double) obj4 : null;
                if (d14 == null) {
                    return null;
                }
                long jDoubleValue = (long) d14.doubleValue();
                Object obj5 = list3.get(1);
                Double d15 = obj5 instanceof Double ? (Double) obj5 : null;
                if (d15 != null) {
                    return new o13.p(new DateTime(jDoubleValue, DateTimeZone.UTC), Long.valueOf((long) d15.doubleValue()));
                }
                return null;
            case 26:
                s5.c.b bVar10 = (s5.c.b) obj;
                bVar10.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                int iJ = bVar10.j(new i0(0L, f0.H(j92.b.f97899b.f97918c, 4294967296L), (w5.f0) null, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX, (p005kotlin.jvm.internal.j) null));
                try {
                    int i16 = bVar10.i(new w(0, 0, f0.B(0), (d6.n) null, (s5.a0) null, (d6.f) null, 0, 0, (d6.o) null, 507, (p005kotlin.jvm.internal.j) null));
                    try {
                        bVar10.b(StringUtils.SPACE);
                        Unit unit = Unit.INSTANCE;
                        bVar10.f(i16);
                        bVar10.f(iJ);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        bVar10.f(i16);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bVar10.f(iJ);
                    throw th4;
                }
            case 27:
                ((b63.o) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                p5.h0.g(k0Var);
                return Unit.INSTANCE;
            default:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                p5.h0.g(k0Var2);
                return Unit.INSTANCE;
        }
    }
}
