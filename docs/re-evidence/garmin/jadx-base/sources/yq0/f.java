package yq0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.k0;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lyq0/f;", "Landroidx/lifecycle/u1;", "Lrq0/d;", "getDemographicSelectionUseCase", "Lrq0/e;", "getInsightsCompareHistogramUseCase", "<init>", "(Lrq0/d;Lrq0/e;)V", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f198746g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq0.e f198747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f198748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f198749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f198750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f198751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f198752f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyq0/c;", "insightsDemographicFiltersUiState", "Lyq0/b;", "demographicFilters", "<anonymous>", "(Lyq0/c;Lyq0/b;)Lyq0/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.insights.presentation.home.InsightsHistogramViewModel$insightsDemographicFiltersUiState$1", f = "InsightsHistogramViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements q<yq0.c, yq0.b, t13.d<? super yq0.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ yq0.c f198753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ yq0.b f198754b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(yq0.c cVar, yq0.b bVar, t13.d<? super yq0.c> dVar) {
            b bVar2 = f.this.new b(dVar);
            bVar2.f198753a = cVar;
            bVar2.f198754b = bVar;
            return bVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            tq0.l lVar;
            yq0.c cVar = this.f198753a;
            yq0.b bVar = this.f198754b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = f.f198746g;
            f fVar = f.this;
            fVar.getClass();
            List<tq0.l> list = bVar.f198736d;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (tq0.l lVar2 : list) {
                e eVar = (e) ((Map) fVar.f198750d.f150540a.getValue()).get(lVar2.f166099a.f166036a);
                if (eVar != null && (lVar = eVar.f198743b) != null) {
                    lVar2 = lVar;
                }
                arrayList.add(lVar2);
            }
            ge1.b.T(v1.a(fVar), null, null, new g(arrayList, fVar, bVar, null), 3);
            return new yq0.c(cVar.f198738a, bVar, cVar.f198740c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lyq0/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.insights.presentation.home.InsightsHistogramViewModel$insightsDemographicFiltersUiState$2", f = "InsightsHistogramViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<r53.j<? super yq0.c>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rq0.d f198757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f198758c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(rq0.d dVar, f fVar, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f198757b = dVar;
            this.f198758c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f198757b, this.f198758c, dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super yq0.c> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            yq0.c cVar;
            Object value2;
            yq0.b bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198756a;
            if (i14 == 0) {
                r.b(obj);
                this.f198756a = 1;
                rq0.d dVar = this.f198757b;
                dVar.getClass();
                x53.c cVar2 = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new rq0.c(dVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            f fVar = this.f198758c;
            p2 p2Var = fVar.f198751e;
            do {
                value = p2Var.getValue();
                if (v2Var instanceof v2.b) {
                    p2 p2Var2 = fVar.f198748b;
                    do {
                        value2 = p2Var2.getValue();
                        bVar = (yq0.b) ((v2.b) v2Var).f47386a;
                    } while (!p2Var2.b(value2, bVar));
                    cVar = new yq0.c(false, bVar, false, 5, null);
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    cVar = new yq0.c(false, null, true, 3, null);
                }
            } while (!p2Var.b(value, cVar));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public f(rq0.d dVar, rq0.e eVar) {
        dVar.getClass();
        eVar.getClass();
        this.f198747a = eVar;
        p2 p2VarA = q2.a(new yq0.b(null, null, null, null, null, 31, null));
        this.f198748b = p2VarA;
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        p2 p2VarA2 = q2.a(k0Var);
        this.f198749c = p2VarA2;
        this.f198750d = s.d(p2VarA2);
        p005kotlin.jvm.internal.j jVar = null;
        boolean z14 = false;
        p2 p2VarA3 = q2.a(new yq0.c(false, null, z14, 7, jVar));
        this.f198751e = p2VarA3;
        v vVar = new v(new c(dVar, this, null), new r53.u1(p2VarA3, p2VarA, new b(null)));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f198752f = s.K(vVar, aVarA, k2.a.f150706c, new yq0.c(true, null, z14, 6, jVar));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lyq0/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "INSIGHT_DEMOGRAPHIC_AGE_ALL", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
