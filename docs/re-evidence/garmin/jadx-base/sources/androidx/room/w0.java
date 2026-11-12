package androidx.room;

import android.content.res.Resources;
import b21.eb;
import b21.fb;
import b21.l4;
import i3.e5;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10971a;

    public /* synthetic */ w0(aw1.h hVar) {
        this.f10971a = 12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        jv1.m mVar;
        jv1.m mVar2;
        fg0.j eventCustomization;
        int i14 = 2;
        int i15 = 14;
        boolean z14 = true;
        byte b14 = 0;
        switch (this.f10971a) {
            case 0:
                ud.c cVar = (ud.c) obj;
                x0.a aVar = x0.f10973l;
                cVar.getClass();
                q13.g gVar = new q13.g();
                while (cVar.J0()) {
                    gVar.add(Integer.valueOf((int) cVar.getLong(0)));
                }
                return p13.a1.a(gVar);
            case 1:
                int i16 = aq.i.f11989a;
                aq.d dVar = (aq.d) ((fw.m) obj).f73770c;
                if (dVar != null) {
                    return dVar.f11879a;
                }
                return null;
            case 2:
                oi0.b bVar = (oi0.b) obj;
                aq.m mVar3 = aq.m.f12045a;
                bVar.getClass();
                bVar.p();
                return Unit.INSTANCE;
            case 3:
                Module module = (Module) obj;
                as0.a aVar2 = as0.a.f12677a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.y.JET_LAG.a());
                a90.m mVar4 = new a90.m(28);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, mVar4, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new a90.m(29), kind, j0Var), module));
                return Unit.INSTANCE;
            case 4:
                Module module2 = (Module) obj;
                as0.c cVar2 = as0.c.f12680a;
                module2.getClass();
                as0.b bVar2 = new as0.b(b14, b14);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(xr0.a.class), null, bVar2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(zr0.a.class), null, new as0.b(b14, z14 ? 1 : 0), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(wr0.a.class), null, new as0.b(b14, i14), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(uo0.b.class), null, new as0.b(b14, 3), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 5:
                as2.f.f12699e.error("Something wrong when sync balance", (Throwable) obj);
                return Unit.INSTANCE;
            case 6:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                o4.d0.f128823b.getClass();
                q4.f.A0(fVar, o4.d0.c(0.6f, o4.d0.f128824c, 14), 0L, 0L, 0.0f, null, null, 126);
                return Unit.INSTANCE;
            case 7:
                Byte b15 = (Byte) obj;
                b15.byteValue();
                Set<Integer> set = at2.a.f12795m;
                return String.format("%02x", Arrays.copyOf(new Object[]{b15}, 1));
            case 8:
                Byte b16 = (Byte) obj;
                b16.byteValue();
                Set<Integer> set2 = at2.a.f12795m;
                return String.format("%02x", Arrays.copyOf(new Object[]{b16}, 1));
            case 9:
                b63.j jVar = (b63.j) obj;
                jVar.getClass();
                DayOfWeek dayOfWeekOf = DayOfWeek.of(jVar.ordinal() + 1);
                dayOfWeekOf.getClass();
                String displayName = dayOfWeekOf.getDisplayName(TextStyle.FULL, Locale.getDefault());
                displayName.getClass();
                return displayName;
            case 10:
                b63.j jVar2 = (b63.j) obj;
                jVar2.getClass();
                DayOfWeek dayOfWeekOf2 = DayOfWeek.of(jVar2.ordinal() + 1);
                dayOfWeekOf2.getClass();
                String displayName2 = dayOfWeekOf2.getDisplayName(TextStyle.FULL, Locale.getDefault());
                displayName2.getClass();
                return displayName2;
            case 11:
                b63.j jVar3 = (b63.j) obj;
                jVar3.getClass();
                DayOfWeek dayOfWeekOf3 = DayOfWeek.of(jVar3.ordinal() + 1);
                dayOfWeekOf3.getClass();
                String displayName3 = dayOfWeekOf3.getDisplayName(TextStyle.FULL, Locale.getDefault());
                displayName3.getClass();
                return displayName3;
            case 12:
                jv1.s sVar = (jv1.s) obj;
                int i17 = aw1.h.S1;
                sVar.getClass();
                vt1.o oVar = sVar.f101125d;
                jv1.h hVar = sVar.f101127f;
                fg0.k kVar = sVar.f101124c;
                fg0.d completionTarget = kVar != null ? kVar.getCompletionTarget() : null;
                fg0.d customGoal = (kVar == null || (eventCustomization = kVar.getEventCustomization()) == null) ? null : eventCustomization.getCustomGoal();
                jv1.m mVarA = sVar.f101129h;
                if (mVarA != null) {
                    mVar = mVarA;
                } else if (customGoal != null) {
                    jv1.m.f101075d.getClass();
                    mVarA = jv1.m.a.a(customGoal);
                    mVar = mVarA;
                } else {
                    mVar = null;
                }
                if (customGoal != null && completionTarget != null) {
                    mVar2 = new jv1.m(completionTarget.getValue(), completionTarget.getUnit(), completionTarget.getUnitType());
                } else if (hVar instanceof jv1.g) {
                    jv1.g gVar2 = (jv1.g) hVar;
                    mVar2 = new jv1.m(gVar2.f101057a, gVar2.f101058b, gg0.h.DISTANCE);
                } else {
                    mVar2 = new jv1.m(hVar != null ? hVar.f101057a : null, hVar != null ? hVar.f101058b : null, gg0.h.TIME);
                }
                return new jv1.r(sVar.f101122a, oVar, hVar, sVar.f101124c, mVar2, mVar);
            case 13:
                int i18 = aw1.h.d.a.f13407a[((fg0.k) obj).v1().ordinal()];
                return Boolean.valueOf((i18 == 1 || i18 == 2) ? false : true);
            case 14:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 15:
                lc.p0 p0Var = (lc.p0) obj;
                k23.d<?> dVarB = p005kotlin.jvm.internal.s0.f105811a.b(l4.z0.class);
                p0Var.getClass();
                p0Var.f111835h = dVarB;
                p0Var.f111833f = false;
                lc.y0 y0VarI = kg.f.i(p0Var, -1);
                y0VarI.f111914a = true;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = true;
                p0Var.f111834g = y0VarI.f111915b;
                return Unit.INSTANCE;
            case 16:
                lc.p0 p0Var2 = (lc.p0) obj;
                k23.d<?> dVarB2 = p005kotlin.jvm.internal.s0.f105811a.b(l4.h0.class);
                p0Var2.getClass();
                p0Var2.f111835h = dVarB2;
                p0Var2.f111833f = false;
                lc.y0 y0VarI2 = kg.f.i(p0Var2, -1);
                y0VarI2.f111914a = true;
                Unit unit2 = Unit.INSTANCE;
                p0Var2.f111833f = true;
                p0Var2.f111834g = y0VarI2.f111915b;
                return Unit.INSTANCE;
            case 17:
                lc.p0 p0Var3 = (lc.p0) obj;
                k23.d<?> dVarB3 = p005kotlin.jvm.internal.s0.f105811a.b(l4.h0.class);
                p0Var3.getClass();
                p0Var3.f111835h = dVarB3;
                p0Var3.f111833f = false;
                lc.y0 y0VarI3 = kg.f.i(p0Var3, -1);
                y0VarI3.f111914a = true;
                Unit unit3 = Unit.INSTANCE;
                p0Var3.f111833f = true;
                p0Var3.f111834g = y0VarI3.f111915b;
                return Unit.INSTANCE;
            case 18:
                lc.p0 p0Var4 = (lc.p0) obj;
                k23.d<?> dVarB4 = p005kotlin.jvm.internal.s0.f105811a.b(l4.h0.class);
                p0Var4.getClass();
                p0Var4.f111835h = dVarB4;
                p0Var4.f111833f = false;
                lc.y0 y0VarI4 = kg.f.i(p0Var4, -1);
                y0VarI4.f111914a = true;
                Unit unit4 = Unit.INSTANCE;
                p0Var4.f111833f = true;
                p0Var4.f111834g = y0VarI4.f111915b;
                return Unit.INSTANCE;
            case 19:
                lc.p0 p0Var5 = (lc.p0) obj;
                k23.d<?> dVarB5 = p005kotlin.jvm.internal.s0.f105811a.b(l4.h0.class);
                p0Var5.getClass();
                p0Var5.f111835h = dVarB5;
                p0Var5.f111833f = false;
                lc.y0 y0VarI5 = kg.f.i(p0Var5, -1);
                y0VarI5.f111914a = true;
                Unit unit5 = Unit.INSTANCE;
                p0Var5.f111833f = true;
                p0Var5.f111834g = y0VarI5.f111915b;
                return Unit.INSTANCE;
            case 20:
                lc.p0 p0Var6 = (lc.p0) obj;
                k23.d<?> dVarB6 = p005kotlin.jvm.internal.s0.f105811a.b(l4.h0.class);
                p0Var6.getClass();
                p0Var6.f111835h = dVarB6;
                p0Var6.f111833f = false;
                lc.y0 y0VarI6 = kg.f.i(p0Var6, -1);
                y0VarI6.f111914a = true;
                Unit unit6 = Unit.INSTANCE;
                p0Var6.f111833f = true;
                p0Var6.f111834g = y0VarI6.f111915b;
                return Unit.INSTANCE;
            case 21:
                lc.p0 p0Var7 = (lc.p0) obj;
                k23.d<?> dVarB7 = p005kotlin.jvm.internal.s0.f105811a.b(l4.h0.class);
                p0Var7.getClass();
                p0Var7.f111835h = dVarB7;
                p0Var7.f111833f = false;
                lc.y0 y0VarI7 = kg.f.i(p0Var7, -1);
                y0VarI7.f111914a = true;
                Unit unit7 = Unit.INSTANCE;
                p0Var7.f111833f = true;
                p0Var7.f111834g = y0VarI7.f111915b;
                return Unit.INSTANCE;
            case 22:
                lc.p0 p0Var8 = (lc.p0) obj;
                k23.d<?> dVarB8 = p005kotlin.jvm.internal.s0.f105811a.b(l4.h0.class);
                p0Var8.getClass();
                p0Var8.f111835h = dVarB8;
                p0Var8.f111833f = false;
                lc.y0 y0VarI8 = kg.f.i(p0Var8, -1);
                y0VarI8.f111914a = true;
                Unit unit8 = Unit.INSTANCE;
                p0Var8.f111833f = true;
                p0Var8.f111834g = y0VarI8.f111915b;
                return Unit.INSTANCE;
            case 23:
                lc.p0 p0Var9 = (lc.p0) obj;
                p0Var9.getClass();
                p0Var9.f111835h = p005kotlin.jvm.internal.s0.f105811a.b(l4.e0.class);
                p0Var9.f111833f = false;
                lc.y0 y0VarI9 = kg.f.i(p0Var9, -1);
                y0VarI9.f111914a = true;
                Unit unit9 = Unit.INSTANCE;
                p0Var9.f111833f = true;
                p0Var9.f111834g = y0VarI9.f111915b;
                return Unit.INSTANCE;
            case 24:
                lc.p0 p0Var10 = (lc.p0) obj;
                p0Var10.getClass();
                eb ebVar = eb.f14653a;
                k23.d<?> dVarB9 = p005kotlin.jvm.internal.s0.f105811a.b(l4.e0.class);
                ebVar.getClass();
                p0Var10.f111835h = dVarB9;
                p0Var10.f111833f = false;
                p0Var10.b(-1);
                lc.y0 y0Var = new lc.y0();
                ebVar.invoke(y0Var);
                p0Var10.f111833f = y0Var.f111914a;
                p0Var10.f111834g = y0Var.f111915b;
                return Unit.INSTANCE;
            case 25:
                lc.p0 p0Var11 = (lc.p0) obj;
                k23.d<?> dVarB10 = p005kotlin.jvm.internal.s0.f105811a.b(fb.e.class);
                p0Var11.getClass();
                p0Var11.f111835h = dVarB10;
                p0Var11.f111833f = false;
                lc.y0 y0VarI10 = kg.f.i(p0Var11, -1);
                y0VarI10.f111914a = false;
                Unit unit10 = Unit.INSTANCE;
                p0Var11.f111833f = false;
                p0Var11.f111834g = y0VarI10.f111915b;
                return Unit.INSTANCE;
            case 26:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 27:
                Module module3 = (Module) obj;
                b52.a aVar3 = b52.a.f16109a;
                module3.getClass();
                as0.b bVar3 = new as0.b(b14, i15);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(y42.a.class), null, bVar3, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(a52.a.class), null, new as0.b(b14, 15), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(x42.a.class), null, new as0.b(b14, 16), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(d52.q.class), null, new as0.b(b14, 17), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 28:
                ww1.x xVar = (ww1.x) obj;
                int i19 = b70.g.f16300d;
                xVar.getClass();
                return Boolean.valueOf(xVar.getTrainingPhase() == ww1.a0.TARGET_EVENT_DAY);
            default:
                o13.p pVar = (o13.p) obj;
                b71.j.a aVar4 = b71.j.f16342m;
                pVar.getClass();
                return Boolean.valueOf(!((a71.d) pVar.f128594a).f1746j);
        }
    }

    public /* synthetic */ w0(int i14) {
        this.f10971a = i14;
    }
}
