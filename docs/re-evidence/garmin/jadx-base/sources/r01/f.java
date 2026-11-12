package r01;

import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import vb.h;
import x01.i;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lr01/f;", "Lfe0/f;", "Lx01/i;", "stateProvider", "<init>", "(Lx01/i;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements fe0.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f148816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x01.e f148817j;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148818a;

        static {
            int[] iArr = new int[x01.f.values().length];
            try {
                iArr[x01.f.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x01.f.PREVIOUSLY_SET_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f148818a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.promo.PromosNutritionHasSetupValidatorImpl", f = "PromosNutritionHasSetupValidatorImpl.kt", l = {21}, m = "setup", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f148819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f148820b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f148822d;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f148820b = obj;
            this.f148822d |= Integer.MIN_VALUE;
            return f.this.c(this);
        }
    }

    static {
        new a(null);
    }

    public f(i iVar) {
        iVar.getClass();
        this.f148816i = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        c cVar;
        f fVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f148822d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f148822d = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objA = cVar.f148820b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f148822d;
        if (i15 == 0) {
            r.b(objA);
            cVar.f148819a = this;
            cVar.f148822d = 1;
            objA = this.f148816i.a(true, cVar);
            if (objA == aVar) {
                return aVar;
            }
            fVar = this;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = cVar.f148819a;
            r.b(objA);
        }
        fVar.f148817j = (x01.e) objA;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        boolean z14;
        Boolean bool = n0Var.f25487l;
        if (bool == null) {
            a2 a2Var = a2.PROMOTIONS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, "PromoNutritionHasSetupValidator", "conditionsProvider.hasSetupNutrition == null");
            return l0.SHOW;
        }
        boolean zBooleanValue = bool.booleanValue();
        x01.e eVar = this.f148817j;
        if ((eVar != null ? eVar.f188255d : null) == x01.f.ACTIVE) {
            z14 = true;
        } else {
            if ((eVar != null ? eVar.f188255d : null) == x01.f.PREVIOUSLY_SET_UP) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        return e0.b(z14 == zBooleanValue);
    }

    @Override // zd0.e0
    public final String e() {
        x01.e eVar = this.f148817j;
        x01.f fVar = eVar != null ? eVar.f188255d : null;
        int i14 = fVar == null ? -1 : b.f148818a[fVar.ordinal()];
        if (i14 != -1) {
            return (i14 == 1 || i14 == 2) ? "hasSetupNutrition: true" : "hasSetupNutrition: false";
        }
        return "hasSetupNutrition: null";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr01/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
