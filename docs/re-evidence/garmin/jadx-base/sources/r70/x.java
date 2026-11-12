package r70;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.k2;
import r53.m1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lr70/x;", "Landroidx/lifecycle/u1;", "Ln70/x;", "getDailyStatsItemsUseCase", "Ln70/h;", "dashboardRefreshNeededListenerUseCase", "<init>", "(Ln70/x;Ln70/h;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<Boolean> f151111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f151112b;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.SecondaryStatsViewModel$1", f = "SecondaryStatsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n70.x f151113a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n70.x xVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151113a = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f151113a, dVar);
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f151113a.f124720a.z2();
            return Unit.INSTANCE;
        }
    }

    public x(n70.x xVar, n70.h hVar) {
        xVar.getClass();
        hVar.getClass();
        this.f151111a = (r53.i) xVar.f124726g.getValue();
        n70.y yVar = new n70.y(xVar.f124720a.p(), xVar);
        x53.c cVar = s0.f129406a;
        r53.i iVarA = r53.s.A(r53.s.A(yVar, cVar), cVar);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f151112b = r53.s.K(iVarA, aVarA, k2.a.f150705b, j0.f134944a);
        r53.s.C(new m1(r53.s.A(r53.s.f(new n70.i(hVar, null)), cVar), new a(xVar, null)), v1.a(this));
    }
}
