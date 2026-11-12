package vv0;

import android.content.Context;
import androidx.lifecycle.v1;
import c22.a4;
import c80.y0;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.navigation.more.TestSearchActivity;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import com.garmin.uisynthesizer.synthesize.SynthesizerException;
import i3.k4;
import org.koin.core.instance.ResolutionContext;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.a2;
import p3.m1;
import p3.p1;
import p3.x3;
import z10.a1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f180467c;

    public /* synthetic */ n(com.garmin.android.apps.connectmobile.pending.activities.presentation.a.b bVar, b63.o oVar) {
        this.f180465a = 12;
        this.f180467c = bVar;
        this.f180466b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Object bVar;
        dy1.q qVar;
        a4 a4Var;
        int i14 = this.f180465a;
        boolean z14 = true;
        int i15 = 0;
        Object obj = null;
        Object obj2 = this.f180467c;
        Object obj3 = this.f180466b;
        switch (i14) {
            case 0:
                return ParametersHolderKt.parametersOf((b63.o) obj3, (o82.g) obj2);
            case 1:
                ((e23.l) obj3).invoke(((k4) obj2).g());
                return Unit.INSTANCE;
            case 2:
                int i16 = vx1.e.f180659j;
                ((vx1.e) obj3).e(((ix1.g) obj2).name());
                return Unit.INSTANCE;
            case 3:
                vy0.a0 a0Var = (vy0.a0) obj3;
                com.garmin.android.apps.connectmobile.navigation.more.b bVar2 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj2;
                bVar2.getClass();
                ge1.b.T(v1.a(a0Var), null, null, new vy0.z(a0Var, bVar2, null), 3);
                return Unit.INSTANCE;
            case 4:
                vy0.n nVar = (vy0.n) obj3;
                com.garmin.android.apps.connectmobile.navigation.more.b bVar3 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj2;
                bVar3.getClass();
                ge1.b.T(v1.a(nVar), null, null, new vy0.m(nVar, bVar3, null), 3);
                return Unit.INSTANCE;
            case 5:
                int i17 = TestSearchActivity.f39390b;
                ((TestSearchActivity) obj3).ea().i((int) ((m1) obj2).getFloatValue());
                return Unit.INSTANCE;
            case 6:
                vy2.e eVar = (vy2.e) obj3;
                xy2.d dVar = (xy2.d) obj2;
                ArgumentType argumenttype = dVar.f192723b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                try {
                    Object objQ = p13.u.Q(((vy2.i) argumenttype).f180852d);
                    objQ.getClass();
                    oi0.c.W(-1, new n((t13.d) objQ, eVar, dVar));
                    return aVar;
                } catch (Throwable th3) {
                    throw new SynthesizerException("Failed to resume coroutine for " + ((vy2.i) argumenttype).f180851c, th3);
                }
            case 7:
                xy2.d dVar2 = (xy2.d) obj2;
                t13.d dVarB = u13.f.b((t13.d) obj3);
                try {
                    int i18 = o13.q.f128596b;
                    bVar = ((uy2.c) dVar2.a()).a();
                    break;
                } catch (Throwable th4) {
                    int i19 = o13.q.f128596b;
                    bVar = new o13.q.b(th4);
                }
                u53.g.a(bVar, dVarB);
                return Unit.INSTANCE;
            case 8:
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj3, ((w02.r) obj2).f181127f.getF182175a()));
            case 9:
                ((e23.l) obj3).invoke(new com.garmin.android.apps.connectmobile.userprofile.presentation.f.a(((m12.s.c) obj2).f115862a));
                return Unit.INSTANCE;
            case 10:
                m12.s.e eVar2 = (m12.s.e) obj2;
                ((e23.l) obj3).invoke(new com.garmin.android.apps.connectmobile.userprofile.presentation.f.c(eVar2.f115865a, true ^ eVar2.f115867c));
                return Unit.INSTANCE;
            case 11:
                PendingActivitiesActivity pendingActivitiesActivity = (PendingActivitiesActivity) obj2;
                PendingActivitiesActivity.a aVar2 = PendingActivitiesActivity.f39793d;
                if (!((lc.m0) obj3).m()) {
                    pendingActivitiesActivity.onNavigateUp();
                }
                return Unit.INSTANCE;
            case 12:
                return ParametersHolderKt.parametersOf(((com.garmin.android.apps.connectmobile.pending.activities.presentation.a.b) obj2).f39802a, (b63.o) obj3, null);
            case 13:
                w51.h0 h0Var = (w51.h0) obj3;
                ((p1) obj2).setValue(Boolean.FALSE);
                h0Var.getClass();
                ge1.b.T(v1.a(h0Var), null, null, new w51.b0(h0Var, null), 3);
                return Unit.INSTANCE;
            case 14:
                p1 p1Var = (p1) obj2;
                if (!(((x3) obj3).getF182175a() instanceof v52.c.b) && !((Boolean) p1Var.getF182175a()).booleanValue()) {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 15:
                m4.q qVar2 = (m4.q) obj3;
                if (((Boolean) ((p1) obj2).getF182175a()).booleanValue()) {
                    qVar2.y(false);
                }
                return Unit.INSTANCE;
            case 16:
                w70.g gVar = (w70.g) obj3;
                Context context = (Context) obj2;
                if (!p005kotlin.jvm.internal.s.g(gVar.f183496i, gVar.f183497j.getValue())) {
                    gVar.y4(false);
                }
                context.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).b(context));
                return Unit.INSTANCE;
            case 17:
                ((e23.l) obj3).invoke((w72.e) obj2);
                return Unit.INSTANCE;
            case 18:
                return ScopedInstanceFactory.get$lambda$1((ScopedInstanceFactory) obj3, (ResolutionContext) obj2);
            case 19:
                return SingleInstanceFactory.get$lambda$0((SingleInstanceFactory) obj3, (ResolutionContext) obj2);
            case 20:
                ((e23.l) obj3).invoke((y0) obj2);
                return Unit.INSTANCE;
            case 21:
                ((e23.l) obj3).invoke((c80.s0) obj2);
                return Unit.INSTANCE;
            case 22:
                ((e23.l) obj3).invoke(Long.valueOf(((yl.a) obj2).f197624a));
                return Unit.INSTANCE;
            case 23:
                ((nk0.l) obj3).invoke();
                ((e23.a) obj2).invoke();
                return Unit.INSTANCE;
            case 24:
                ((e23.l) obj3).invoke(((in0.h) obj2).f94446a);
                return Unit.INSTANCE;
            case 25:
                ((wn0.l) obj3).f186143n.i((o82.a) obj2, true);
                return Unit.INSTANCE;
            case 26:
                ((e23.l) obj3).invoke(Boolean.valueOf(!((CustomBarChart) obj2).isFullyZoomedOut()));
                return Unit.INSTANCE;
            case 27:
                ((wu0.d) obj3).f187243a.z4(((a1.f) ((a1) obj2)).f200881a);
                return Unit.INSTANCE;
            case 28:
                int i24 = com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a.f38674f;
                ((com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a) obj3).ca().z4(((a1.f) ((a1) obj2)).f200881a);
                return Unit.INSTANCE;
            default:
                dy1.v vVar = (dy1.v) obj2;
                for (Object obj4 : (i53.c) obj3) {
                    if (((dy1.q) obj4).f61606b == vVar.f61640a) {
                        obj = obj4;
                        qVar = (dy1.q) obj;
                        if (qVar != null && (a4Var = qVar.f61605a) != null) {
                            i15 = a4Var.f23006b;
                        }
                        return new a2(i15);
                    }
                }
                qVar = (dy1.q) obj;
                if (qVar != null) {
                    i15 = a4Var.f23006b;
                }
                return new a2(i15);
        }
    }

    public /* synthetic */ n(int i14, Object obj, Object obj2) {
        this.f180465a = i14;
        this.f180466b = obj;
        this.f180467c = obj2;
    }

    public /* synthetic */ n(t13.d dVar, vy2.e eVar, xy2.d dVar2) {
        this.f180465a = 7;
        this.f180466b = dVar;
        this.f180467c = dVar2;
    }
}
