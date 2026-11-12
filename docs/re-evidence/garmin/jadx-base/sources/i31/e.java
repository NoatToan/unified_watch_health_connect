package i31;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.onboarding.domain.FetchDevicesOnboardingWorker;
import com.garmin.android.apps.connectmobile.webtranslation.WebTranslationDatabase;
import i3.bf;
import id0.f2;
import id0.u2;
import m63.y1;
import o53.e2;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90667a;

    public /* synthetic */ e(int i14) {
        this.f90667a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        Scope rootScope;
        switch (this.f90667a) {
            case 0:
                FetchDevicesOnboardingWorker.a aVar = FetchDevicesOnboardingWorker.f39672j;
                return (b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null);
            case 1:
                s.a.Companion companion = s.a.INSTANCE;
                return new m63.e(s.c.a.f90757a);
            case 2:
                s.c.Companion companion2 = s.c.INSTANCE;
                return new m63.e(y1.f117048a);
            case 3:
                KoinComponent koinComponent = WebTranslationDatabase.f47964a;
                if (koinComponent instanceof KoinScopeComponent) {
                    rootScope = ((KoinScopeComponent) koinComponent).getScope();
                } else {
                    koinComponent.getClass();
                    rootScope = KoinComponent.DefaultImpls.getKoin(koinComponent).getScopeRegistry().getRootScope();
                }
                androidx.room.b0.a aVarA = androidx.room.x.a((Context) rootScope.get((k23.d<?>) s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), WebTranslationDatabase.class, "on_demand_resources_database");
                aVarA.f10727e.add(new WebTranslationDatabase.a());
                return (WebTranslationDatabase) aVarA.b();
            case 4:
                i51.d dVar = i51.d.f91791a;
                return Unit.INSTANCE;
            case 5:
                i51.d dVar2 = i51.d.f91791a;
                return Unit.INSTANCE;
            case 6:
                return p0.n(Boolean.FALSE);
            case 7:
                return p0.n(Boolean.FALSE);
            case 8:
                return p0.n(Boolean.FALSE);
            case 9:
                Bundle bundleD = tn.k.d("Screen", "CssReports", "ReportsAction", "chartHover");
                ht.a.f85464a.getClass();
                ht.a.a(bundleD, "UserAction");
                return Unit.INSTANCE;
            case 10:
                i91.a aVar2 = i91.a.f92320a;
                return Float.valueOf(0.0f);
            case 11:
                i91.a aVar3 = i91.a.f92320a;
                return Unit.INSTANCE;
            case 12:
                i91.a aVar4 = i91.a.f92320a;
                return Unit.INSTANCE;
            case 13:
                i91.a aVar5 = i91.a.f92320a;
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                int i14 = ic0.f.f92589f;
                return n63.p.a(new bf(28));
            case 16:
                f2 f2Var = f2.f92728a;
                rd2.f fVarA = rd2.f.a();
                fVarA.getClass();
                return fVarA;
            case 17:
                u2 u2Var = u2.f92944a;
                return Boolean.valueOf(!wd2.m.a().isEmpty());
            case 18:
                u2 u2Var2 = u2.f92944a;
                return Boolean.valueOf(!wd2.m.a().isEmpty());
            case 19:
                id2.i.a aVar6 = id2.i.f93051e;
                e2 e2VarH = ge1.b.h();
                x53.c cVar = o53.s0.f129406a;
                return o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH));
            case 20:
                id2.i.a aVar7 = id2.i.f93051e;
                return "Bearer";
            case 21:
                return "Bearer";
            case 22:
                return Unit.INSTANCE;
            case 23:
                int i15 = ij1.g.f93833m;
                return new y0();
            case 24:
                int i16 = ij1.g.f93833m;
                return new y0();
            case 25:
                int i17 = ij1.g.f93833m;
                return new y0();
            case 26:
                int i18 = ij1.g.f93833m;
                return new y0();
            case 27:
                int i19 = ij1.g.f93833m;
                return new y0();
            case 28:
                int i24 = ij1.g.f93833m;
                return new y0();
            default:
                int i25 = ij1.g.f93833m;
                return new y0();
        }
    }
}
