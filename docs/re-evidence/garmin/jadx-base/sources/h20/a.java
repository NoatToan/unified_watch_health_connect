package h20;

import android.content.Context;
import b31.f;
import c2.l;
import c83.h;
import com.garmin.android.apps.connectmobile.onboarding.data.local.OnboardingDatabase;
import e23.p;
import ez0.c;
import g20.i;
import h21.k;
import h4.r;
import i31.c0;
import i31.e0;
import i31.v;
import i31.x;
import jw.w;
import k23.d;
import m20.b0;
import m20.e;
import m20.g;
import m20.g0;
import m20.k0;
import m20.l0;
import m20.n0;
import m20.z;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.m;
import p3.n;
import p3.x1;
import rd2.j;
import re0.o;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81028a;

    public /* synthetic */ a(int i14) {
        this.f81028a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f81028a) {
            case 0:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                b bVar = b.f81029a;
                scope.getClass();
                parametersHolder.getClass();
                hl.a aVar = (hl.a) parametersHolder.get(0);
                if (aVar == null) {
                    aVar = hl.a.c.f84256b;
                }
                t0 t0Var = s0.f105811a;
                return new i((z) scope.get((d<?>) t0Var.b(z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (o) scope.get((d<?>) t0Var.b(o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), aVar);
            case 1:
                b bVar2 = b.f81029a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (b0) ez0.b.a(ez0.b.f67468a, c.GCS_API, b0.class, new h.a[0], null, null, null, 120);
            case 2:
                b bVar3 = b.f81029a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new w();
            case 3:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                b bVar4 = b.f81029a;
                scope2.getClass();
                parametersHolder2.getClass();
                t0 t0Var2 = s0.f105811a;
                return s.g((Boolean) parametersHolder2.getOrNull(t0Var2.b(Boolean.class)), Boolean.TRUE) ? new k0((g) scope2.get((d<?>) t0Var2.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m20.a) scope2.get((d<?>) t0Var2.b(m20.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)) : new g0((g) scope2.get((d<?>) t0Var2.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m20.a) scope2.get((d<?>) t0Var2.b(m20.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 4:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                b bVar5 = b.f81029a;
                scope3.getClass();
                parametersHolder3.getClass();
                t0 t0Var3 = s0.f105811a;
                return new z((g) scope3.get((d<?>) t0Var3.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b0) scope3.get((d<?>) t0Var3.b(b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope3.get((d<?>) t0Var3.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (e) scope3.get((d<?>) t0Var3.b(e.class), (Qualifier) null, new fe2.z((Boolean) parametersHolder3.getOrNull(t0Var3.b(Boolean.class)), 26)), null, 16, null);
            case 5:
                b bVar6 = b.f81029a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (l0) ez0.b.a(ez0.b.f67468a, c.COMMUNICATION_SERVICES, l0.class, new h.a[0], null, null, null, 120);
            case 6:
                Scope scope4 = (Scope) obj;
                b bVar7 = b.f81029a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new n0((l0) scope4.get((d<?>) s0.f105811a.b(l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 7:
                b bVar8 = b.f81029a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (m20.a) ez0.b.a(ez0.b.f67468a, c.GC_WEB_URL, m20.a.class, new h.a[0], null, null, null, 120);
            case 8:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                h21.a aVar2 = h21.a.f81031a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    k.a(l.y(aVar3, j92.b.f97899b.f97920e), mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 9:
                h31.a aVar4 = h31.a.f81290a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new i31.s();
            case 10:
                Scope scope5 = (Scope) obj;
                h31.a aVar5 = h31.a.f81290a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                b31.a aVar6 = (b31.a) scope5.get((d<?>) t0Var4.b(b31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                f fVar = (f) scope5.get((d<?>) t0Var4.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                i31.c cVar = (i31.c) scope5.get((d<?>) t0Var4.b(i31.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                j jVar = rd2.f.a().f152045a;
                jVar.getClass();
                return new i31.f(aVar6, fVar, cVar, jVar, (i31.s) scope5.get((d<?>) t0Var4.b(i31.s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope5.get((d<?>) t0Var4.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 11:
                Scope scope6 = (Scope) obj;
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                h31.a aVar7 = h31.a.f81290a;
                scope6.getClass();
                parametersHolder4.getClass();
                t0 t0Var5 = s0.f105811a;
                return new s31.c((r53.i) parametersHolder4.elementAt(0, t0Var5.b(r53.i.class)), (e0) scope6.get((d<?>) t0Var5.b(e0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i31.b0) scope6.get((d<?>) t0Var5.b(i31.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 8, null);
            case 12:
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                h31.a aVar8 = h31.a.f81290a;
                ((Scope) obj).getClass();
                parametersHolder5.getClass();
                return new com.garmin.android.apps.connectmobile.onboarding.presentation.a((s31.c) parametersHolder5.elementAt(0, s0.f105811a.b(s31.c.class)));
            case 13:
                Scope scope7 = (Scope) obj;
                h31.c cVar2 = h31.c.f81292a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var6 = s0.f105811a;
                return new b31.b((l80.a) scope7.get((d<?>) t0Var6.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c31.c) scope7.get((d<?>) t0Var6.b(c31.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f31.a) scope7.get((d<?>) t0Var6.b(f31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                Scope scope8 = (Scope) obj;
                h31.c cVar3 = h31.c.f81292a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var7 = s0.f105811a;
                return new b31.i((c31.j) scope8.get((d<?>) t0Var7.b(c31.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f31.a) scope8.get((d<?>) t0Var7.b(f31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope9 = (Scope) obj;
                h31.c cVar4 = h31.c.f81292a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var8 = s0.f105811a;
                return new b31.g((f12.l) scope9.get((d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b31.a) scope9.get((d<?>) t0Var8.b(b31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (e0) scope9.get((d<?>) t0Var8.b(e0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i31.s) scope9.get((d<?>) t0Var8.b(i31.s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 16, null);
            case 16:
                Scope scope10 = (Scope) obj;
                h31.c cVar5 = h31.c.f81292a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                return new v((h31.b) scope10.get((d<?>) s0.f105811a.b(h31.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 17:
                Scope scope11 = (Scope) obj;
                h31.c cVar6 = h31.c.f81292a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var9 = s0.f105811a;
                v vVar = (v) scope11.get((d<?>) t0Var9.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                b31.a aVar9 = (b31.a) scope11.get((d<?>) t0Var9.b(b31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                kg1.a.f104701a.getClass();
                return new i31.c(vVar, aVar9, kg1.a.C2003a.a());
            case 18:
                Scope scope12 = (Scope) obj;
                h31.c cVar7 = h31.c.f81292a;
                scope12.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var10 = s0.f105811a;
                return new e0((b31.a) scope12.get((d<?>) t0Var10.b(b31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope12.get((d<?>) t0Var10.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                Scope scope13 = (Scope) obj;
                h31.c cVar8 = h31.c.f81292a;
                scope13.getClass();
                ((ParametersHolder) obj2).getClass();
                return new i31.b0((b31.a) scope13.get((d<?>) s0.f105811a.b(b31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                h31.c cVar9 = h31.c.f81292a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (f31.a) ez0.b.a(ez0.b.f67468a, c.GC, f31.a.class, new h.a[0], null, null, null, 88);
            case 21:
                Scope scope14 = (Scope) obj;
                h31.c cVar10 = h31.c.f81292a;
                scope14.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var11 = s0.f105811a;
                return new c0((b31.a) scope14.get((d<?>) t0Var11.b(b31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f) scope14.get((d<?>) t0Var11.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (e0) scope14.get((d<?>) t0Var11.b(e0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i31.s) scope14.get((d<?>) t0Var11.b(i31.s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                Scope scope15 = (Scope) obj;
                h31.c cVar11 = h31.c.f81292a;
                scope15.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var12 = s0.f105811a;
                return new i31.b((b31.a) scope15.get((d<?>) t0Var12.b(b31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b31.h) scope15.get((d<?>) t0Var12.b(b31.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 23:
                Scope scope16 = (Scope) obj;
                h31.c cVar12 = h31.c.f81292a;
                scope16.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var13 = s0.f105811a;
                return new x((b31.h) scope16.get((d<?>) t0Var13.b(b31.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope16.get((d<?>) t0Var13.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 24:
                Scope scope17 = (Scope) obj;
                h31.c cVar13 = h31.c.f81292a;
                scope17.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var14 = s0.f105811a;
                return new i31.z((b31.h) scope17.get((d<?>) t0Var14.b(b31.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope17.get((d<?>) t0Var14.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 25:
                Scope scope18 = (Scope) obj;
                h31.c cVar14 = h31.c.f81292a;
                scope18.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var15 = s0.f105811a;
                b31.a aVar10 = (b31.a) scope18.get((d<?>) t0Var15.b(b31.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                j jVar2 = rd2.f.a().f152045a;
                jVar2.getClass();
                return new i31.r(aVar10, jVar2, (i31.s) scope18.get((d<?>) t0Var15.b(i31.s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope18.get((d<?>) t0Var15.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                Scope scope19 = (Scope) obj;
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                h31.c cVar15 = h31.c.f81292a;
                scope19.getClass();
                parametersHolder6.getClass();
                t0 t0Var16 = s0.f105811a;
                return new r31.g(((Number) parametersHolder6.elementAt(0, t0Var16.b(Long.class))).longValue(), (i31.r) scope19.get((d<?>) t0Var16.b(i31.r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (e0) scope19.get((d<?>) t0Var16.b(e0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c0) scope19.get((d<?>) t0Var16.b(c0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i31.b0) scope19.get((d<?>) t0Var16.b(i31.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 27:
                Scope scope20 = (Scope) obj;
                h31.c cVar16 = h31.c.f81292a;
                scope20.getClass();
                ((ParametersHolder) obj2).getClass();
                OnboardingDatabase.a aVar11 = OnboardingDatabase.f39657a;
                Context contextAndroidContext = ModuleExtKt.androidContext(scope20);
                aVar11.getClass();
                contextAndroidContext.getClass();
                OnboardingDatabase onboardingDatabase = OnboardingDatabase.f39658b;
                if (onboardingDatabase == null) {
                    Context applicationContext = contextAndroidContext.getApplicationContext();
                    applicationContext.getClass();
                    onboardingDatabase = (OnboardingDatabase) androidx.room.x.a(applicationContext, OnboardingDatabase.class, "onboarding_database").b();
                    OnboardingDatabase.f39658b = onboardingDatabase;
                }
                return onboardingDatabase.e();
            case 28:
                Scope scope21 = (Scope) obj;
                h31.c cVar17 = h31.c.f81292a;
                scope21.getClass();
                ((ParametersHolder) obj2).getClass();
                OnboardingDatabase.a aVar12 = OnboardingDatabase.f39657a;
                Context contextAndroidContext2 = ModuleExtKt.androidContext(scope21);
                aVar12.getClass();
                contextAndroidContext2.getClass();
                OnboardingDatabase onboardingDatabase2 = OnboardingDatabase.f39658b;
                if (onboardingDatabase2 == null) {
                    Context applicationContext2 = contextAndroidContext2.getApplicationContext();
                    applicationContext2.getClass();
                    onboardingDatabase2 = (OnboardingDatabase) androidx.room.x.a(applicationContext2, OnboardingDatabase.class, "onboarding_database").b();
                    OnboardingDatabase.f39658b = onboardingDatabase2;
                }
                return onboardingDatabase2.f();
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                h50.a aVar13 = h50.a.f82029a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
