package pn0;

import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import mn0.o;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.c;
import v13.e;
import vb.h;
import zd0.e0;
import zd0.h0;
import zd0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpn0/a;", "Lzd0/h0;", "Lmn0/o;", "hasViewedHealthStatusFeatureUseCase", "<init>", "(Lmn0/o;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements h0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f138645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f138646j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.promo.PromoHealthStatusViewedValidatorImpl", f = "PromoHealthStatusViewedValidatorImpl.kt", l = {21}, m = "setup", v = 2)
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f138647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f138648b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f138650d;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f138648b = obj;
            this.f138650d |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    static {
        new C2621a(null);
    }

    public a(o oVar) {
        oVar.getClass();
        this.f138645i = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.e0
    public final Object c(d<? super Unit> dVar) {
        b bVar;
        a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f138650d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f138650d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objA = bVar.f138648b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f138650d;
        if (i15 == 0) {
            r.b(objA);
            bVar.f138647a = this;
            bVar.f138650d = 1;
            objA = this.f138645i.a(bVar);
            if (objA == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = bVar.f138647a;
            r.b(objA);
        }
        aVar.f138646j = (Boolean) objA;
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        Boolean bool = n0Var.f25492q;
        if (bool != null) {
            return e0.b(s.g(this.f138646j, bool));
        }
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "PromoHealthStatusViewedValidator", "conditionsProvider.hasViewedHealthStatus == null");
        return l0.SHOW;
    }

    @Override // zd0.e0
    public final String e() {
        Boolean bool = this.f138646j;
        if (s.g(bool, Boolean.TRUE)) {
            return "hasViewedHealthStatusFeature: true";
        }
        if (s.g(bool, Boolean.FALSE)) {
            return "hasViewedHealthStatusFeature: false";
        }
        if (bool == null) {
            return "hasViewedHealthStatusFeature: null";
        }
        u0.r();
        return null;
    }

    /* JADX INFO: renamed from: pn0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpn0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2621a {
        public /* synthetic */ C2621a(j jVar) {
            this();
        }

        private C2621a() {
        }
    }
}
