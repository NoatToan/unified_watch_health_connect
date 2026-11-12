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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lr01/e;", "Lfe0/e;", "Lx01/i;", "stateProvider", "<init>", "(Lx01/i;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements fe0.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f148809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x01.e f148810j;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148811a;

        static {
            int[] iArr = new int[x01.f.values().length];
            try {
                iArr[x01.f.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f148811a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.promo.PromosNutritionCurrentlySetupValidatorImpl", f = "PromosNutritionCurrentlySetupValidatorImpl.kt", l = {21}, m = "setup", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f148812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f148813b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f148815d;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f148813b = obj;
            this.f148815d |= Integer.MIN_VALUE;
            return e.this.c(this);
        }
    }

    static {
        new a(null);
    }

    public e(i iVar) {
        iVar.getClass();
        this.f148809i = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        c cVar;
        e eVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f148815d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f148815d = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objA = cVar.f148813b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f148815d;
        if (i15 == 0) {
            r.b(objA);
            cVar.f148812a = this;
            cVar.f148815d = 1;
            objA = this.f148809i.a(true, cVar);
            if (objA == aVar) {
                return aVar;
            }
            eVar = this;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = cVar.f148812a;
            r.b(objA);
        }
        eVar.f148810j = (x01.e) objA;
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        Boolean bool = n0Var.f25488m;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            x01.e eVar = this.f148810j;
            return e0.b(((eVar != null ? eVar.f188255d : null) == x01.f.ACTIVE) == zBooleanValue);
        }
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "PromoNutritionCurrentlySetupValidator", "conditionsProvider.isNutritionSetup == null");
        return l0.SHOW;
    }

    @Override // zd0.e0
    public final String e() {
        x01.e eVar = this.f148810j;
        x01.f fVar = eVar != null ? eVar.f188255d : null;
        int i14 = fVar == null ? -1 : b.f148811a[fVar.ordinal()];
        if (i14 != -1) {
            return i14 != 1 ? "isNutritionSetup: false" : "isNutritionSetup: true";
        }
        return "isNutritionSetup: null";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr01/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
