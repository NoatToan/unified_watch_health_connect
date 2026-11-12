package li0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import rk0.d1;
import s5.w0;
import sk0.b1;
import sk0.n1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112883a;

    public /* synthetic */ x(int i14) {
        this.f112883a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 11;
        int i15 = 10;
        int i16 = 9;
        int i17 = 8;
        int i18 = 3;
        int i19 = 26;
        int i24 = 25;
        int i25 = 24;
        byte b14 = 0;
        switch (this.f112883a) {
            case 0:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.l.f136032b.getClass();
                p5.h0.w(k0Var, p5.l.f136038h);
                return Unit.INSTANCE;
            case 1:
                p5.k0 k0Var2 = (p5.k0) obj;
                k0Var2.getClass();
                p5.l.f136032b.getClass();
                p5.h0.w(k0Var2, p5.l.f136038h);
                return Unit.INSTANCE;
            case 2:
                p5.k0 k0Var3 = (p5.k0) obj;
                k0Var3.getClass();
                p5.l.f136032b.getClass();
                p5.h0.w(k0Var3, p5.l.f136038h);
                return Unit.INSTANCE;
            case 3:
                p5.k0 k0Var4 = (p5.k0) obj;
                k0Var4.getClass();
                p5.l.f136032b.getClass();
                p5.h0.w(k0Var4, p5.l.f136038h);
                return Unit.INSTANCE;
            case 4:
                p5.k0 k0Var5 = (p5.k0) obj;
                k0Var5.getClass();
                p5.h0.E(k0Var5, 1.0f);
                return Unit.INSTANCE;
            case 5:
                p5.k0 k0Var6 = (p5.k0) obj;
                k0Var6.getClass();
                p5.h0.D(k0Var6);
                return Unit.INSTANCE;
            case 6:
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                String str = d0Var.f112650c;
                return str == null ? Integer.valueOf(d0Var.hashCode()) : str;
            case 7:
                p5.k0 k0Var7 = (p5.k0) obj;
                k0Var7.getClass();
                p5.h0.g(k0Var7);
                return Unit.INSTANCE;
            case 8:
                d0 d0Var2 = (d0) obj;
                d0Var2.getClass();
                String str2 = d0Var2.f112650c;
                return str2 == null ? "" : str2;
            case 9:
                return Unit.INSTANCE;
            case 10:
                Module module = (Module) obj;
                lk0.b bVar = lk0.b.f113140a;
                module.getClass();
                lk0.a aVar = new lk0.a((byte) 0, 9);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(vk0.c.class), null, aVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(kk0.a.class), null, new lk0.a((byte) 0, 1), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(kk0.i0.class), null, new lk0.a((byte) 0, 2), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(kk0.b.class), null, new lk0.a((byte) 0, 3), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(kk0.j0.class), null, new lk0.a((byte) 0, 4), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(mk0.g.class), null, new lk0.a((byte) 0, 5), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(mk0.l.class), null, new lk0.a((byte) 0, 6), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(b1.class), null, new lk0.a((byte) 0, 7), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(rk0.h0.class), null, new lk0.a((byte) 0, 8), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(rk0.k.class), null, new lk0.a((byte) 0, 10), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(sk0.r.class), null, new lk0.a((byte) 0, 11), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(sk0.i.class), null, new lk0.a((byte) 0, 12), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ok0.t.class), null, new lk0.a((byte) 0, 13), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(n1.class), null, new lk0.a((byte) 0, 14), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(sk0.q0.class), null, new lk0.a((byte) 0, 15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(sk0.p0.class), null, new lk0.a((byte) 0, 16), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(d1.class), null, new lk0.a((byte) 0, 17), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(rk0.t0.class), null, new lk0.a((byte) 0, 18), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(rk0.s0.class), null, new l71.i(29), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(qk0.f.class), null, new lk0.a((byte) 0, 0), kind, j0Var), module));
                return Unit.INSTANCE;
            case 11:
                ((r1.n) obj).getClass();
                return r1.b.c(r1.u0.d(s1.l.d(150, 0, null, 6), 2), r1.u0.e(s1.l.d(150, 0, null, 6), 2));
            case 12:
                p5.k0 k0Var8 = (p5.k0) obj;
                k0Var8.getClass();
                p5.h0.g(k0Var8);
                return Unit.INSTANCE;
            case 13:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                String str3 = l0Var.f188878a.f157138b;
                long j8 = l0Var.f188879b;
                if (d53.u.y(str3, "@", false)) {
                    return x5.l0.b(l0Var, null, og.a.x(1, str3.length(), j8), 5);
                }
                String strConcat = "@".concat(str3);
                w0.a aVar2 = w0.f157315b;
                return x5.l0.a(l0Var, strConcat, og.a.x(1, strConcat.length(), og.a.l(((int) (j8 >> 32)) + 1, ((int) (j8 & 4294967295L)) + 1)), 4);
            case 14:
                x5.l0 l0Var2 = (x5.l0) obj;
                l0Var2.getClass();
                return l0Var2;
            case 15:
                x5.l0 l0Var3 = (x5.l0) obj;
                l0Var3.getClass();
                if (g22.n.c(l0Var3.f188878a.f157138b) <= 200) {
                    return l0Var3;
                }
                return null;
            case 16:
                x5.l0 l0Var4 = (x5.l0) obj;
                l0Var4.getClass();
                return l0Var4;
            case 17:
                x5.l0 l0Var5 = (x5.l0) obj;
                l0Var5.getClass();
                return l0Var5;
            case 18:
                Module module2 = (Module) obj;
                ln0.a aVar3 = ln0.a.f113644a;
                module2.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.t.f130076t.a());
                lk0.a aVar4 = new lk0.a((byte) 0, 24);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(r70.s.class), stringQualifierNamed, aVar4, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed, new lk0.a((byte) 0, 25), kind2, j0Var2), module2));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.i.f130000h.a());
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed2, new lk0.a((byte) 0, 26), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed2, new lk0.a((byte) 0, 27), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 19:
                Module module3 = (Module) obj;
                ln0.c cVar = ln0.c.f113647a;
                module3.getClass();
                ln0.b bVar2 = new ln0.b(b14, i18);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(jn0.a.class), null, bVar2, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(hn0.a.class), null, new ln0.b(b14, i17), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(v31.a.class), null, new ln0.b(b14, i16), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(v31.a.class), null, new ln0.b(b14, i15), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(m41.a.class), null, new ln0.b(b14, i14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(kn0.a.class), null, new lk0.a((byte) 0, 28), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(mn0.i.class), null, new lk0.a((byte) 0, 29), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(mn0.h.class), null, new ln0.b(b14, b14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(mn0.m.class), null, new ln0.b(b14, 1), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(mn0.d.class), null, new ln0.b(b14, 2), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(mn0.c.class), null, new ln0.b(b14, 4), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(mn0.o.class), null, new ln0.b(b14, 5), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zd0.h0.class), null, new ln0.b(b14, 6), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(wn0.l.class), null, new ln0.b(b14, 7), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 20:
                Context context = (Context) obj;
                context.getClass();
                return LayoutInflater.from(context).inflate(R.layout.sleep_custom_combined_chart, (ViewGroup) null);
            case 21:
                p5.k0 k0Var9 = (p5.k0) obj;
                k0Var9.getClass();
                p5.h0.h(k0Var9);
                return Unit.INSTANCE;
            case 22:
                Context context2 = (Context) obj;
                context2.getClass();
                return LayoutInflater.from(context2).inflate(R.layout.sleep_custom_combined_chart, (ViewGroup) null);
            case 23:
                Context context3 = (Context) obj;
                context3.getClass();
                return LayoutInflater.from(context3).inflate(R.layout.sleep_custom_bar_chart, (ViewGroup) null);
            case 24:
                List list = (List) obj;
                ln2.b bVar3 = ln2.a.f113680b;
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
                return p13.h0.C0(arrayListL, arrayList);
            case 25:
                InetAddress inetAddress = (InetAddress) obj;
                ln2.b bVar4 = ln2.a.f113680b;
                inetAddress.getClass();
                String hostAddress = inetAddress.getHostAddress();
                hostAddress.getClass();
                return hostAddress;
            case 26:
                InetAddress inetAddress2 = (InetAddress) obj;
                int i26 = ln2.f.f113694h;
                inetAddress2.getClass();
                String hostAddress2 = inetAddress2.getHostAddress();
                hostAddress2.getClass();
                return hostAddress2;
            case 27:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                Module module4 = (Module) obj;
                lp0.a aVar5 = lp0.a.f114124a;
                module4.getClass();
                StringQualifier stringQualifierNamed3 = QualifierKt.named(o70.t.B.a());
                ln0.b bVar5 = new ln0.b(b14, 20);
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                p13.j0 j0Var4 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module4, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var4.b(r70.s.class), stringQualifierNamed3, bVar5, kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(r70.r.class), stringQualifierNamed3, new ln0.b(b14, 21), kind4, j0Var4), module4));
                return Unit.INSTANCE;
            default:
                Module module5 = (Module) obj;
                lp0.c cVar2 = lp0.c.f114126a;
                module5.getClass();
                ln0.b bVar6 = new ln0.b(b14, 22);
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier5 = companion5.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                p13.j0 j0Var5 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module5, e5.n(new BeanDefinition(rootScopeQualifier5, t0Var5.b(ip0.a.class), null, bVar6, kind5, j0Var5), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(kp0.j.class), null, new ln0.b(b14, 23), kind5, j0Var5), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(vp0.a.class), null, new ln0.b(b14, i25), kind5, j0Var5), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(pp0.c.class), null, new ln0.b(b14, i24), kind5, j0Var5), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(mp0.a.class), null, new ln0.b(b14, i19), kind5, j0Var5), module5));
                return Unit.INSTANCE;
        }
    }
}
