package j91;

import a91.x;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import d91.t;
import n70.h7;
import n70.k1;
import o13.r;
import o53.c0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.i;
import r53.j;
import r53.k2;
import r53.s;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lj91/f;", "Landroidx/lifecycle/u1;", "La91/x;", "provider", "La80/a;", "insightsPreferences", "Ln70/k1;", "getDashboardSectionVisibilityUseCase", "Ln70/h7;", "setDashboardSectionVisibilityUseCase", "<init>", "(La91/x;La80/a;Ln70/k1;Ln70/h7;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f97885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a80.a f97886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h7 f97887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f97888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f97889e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements i<g3<? extends Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f97890a;

        /* JADX INFO: renamed from: j91.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1870a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f97891a;

            /* JADX INFO: renamed from: j91.f$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuViewModel$special$$inlined$map$1$2", f = "PersonalizedInsightsDevMenuViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1871a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f97892a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f97893b;

                public C1871a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f97892a = obj;
                    this.f97893b |= Integer.MIN_VALUE;
                    return C1870a.this.emit(null, this);
                }
            }

            public C1870a(j jVar) {
                this.f97891a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1871a c1871a;
                if (dVar instanceof C1871a) {
                    c1871a = (C1871a) dVar;
                    int i14 = c1871a.f97893b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1871a.f97893b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1871a = new C1871a(dVar);
                    }
                } else {
                    c1871a = new C1871a(dVar);
                }
                Object obj2 = c1871a.f97892a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1871a.f97893b;
                if (i15 == 0) {
                    r.b(obj2);
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    g3.f35298f.getClass();
                    g3 g3VarD = g3.a.d(bool);
                    c1871a.f97893b = 1;
                    if (this.f97891a.emit(g3VarD, c1871a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(i iVar) {
            this.f97890a = iVar;
        }

        @Override // r53.i
        public final Object collect(j<? super g3<? extends Boolean>> jVar, t13.d dVar) {
            Object objCollect = this.f97890a.collect(new C1870a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public f(x xVar, a80.a aVar, k1 k1Var, h7 h7Var) {
        xVar.getClass();
        aVar.getClass();
        k1Var.getClass();
        h7Var.getClass();
        this.f97885a = xVar;
        this.f97886b = aVar;
        this.f97887c = h7Var;
        a aVar2 = new a(k1Var.a(o70.f.PERSONALIZED_INSIGHTS));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f97888d = s.K(aVar2, aVarA, k2.a.f150705b, g3.a.c(g3.f35298f));
        this.f97889e = s.K(xVar.getF2053o(), c0.a(x53.b.f189152a), k2.a.f150706c, t.d.f58594b);
    }

    public f() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ f(x xVar, a80.a aVar, k1 k1Var, h7 h7Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (x) KoinJavaComponent.get$default(x.class, null, null, 6, null) : xVar, (i14 & 2) != 0 ? (a80.a) KoinJavaComponent.get$default(a80.a.class, null, null, 6, null) : aVar, (i14 & 4) != 0 ? (k1) KoinJavaComponent.get$default(k1.class, null, null, 6, null) : k1Var, (i14 & 8) != 0 ? (h7) KoinJavaComponent.get$default(h7.class, null, null, 6, null) : h7Var);
    }
}
