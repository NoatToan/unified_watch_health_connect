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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lr01/c;", "Lfe0/c;", "Lx01/i;", "stateProvider", "<init>", "(Lx01/i;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements fe0.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f148796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x01.e f148797j;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148798a;

        static {
            int[] iArr = new int[x01.f.values().length];
            try {
                iArr[x01.f.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f148798a = iArr;
        }
    }

    /* JADX INFO: renamed from: r01.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.promo.PromosIntegratedWithMFPValidatorImpl", f = "PromosIntegratedWithMFPValidatorImpl.kt", l = {20}, m = "setup", v = 2)
    public static final class C2805c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f148799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f148800b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f148802d;

        public C2805c(t13.d<? super C2805c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f148800b = obj;
            this.f148802d |= Integer.MIN_VALUE;
            return c.this.c(this);
        }
    }

    static {
        new a(null);
    }

    public c(i iVar) {
        iVar.getClass();
        this.f148796i = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        C2805c c2805c;
        c cVar;
        if (dVar instanceof C2805c) {
            c2805c = (C2805c) dVar;
            int i14 = c2805c.f148802d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2805c.f148802d = i14 - Integer.MIN_VALUE;
            } else {
                c2805c = new C2805c(dVar);
            }
        } else {
            c2805c = new C2805c(dVar);
        }
        Object objA = c2805c.f148800b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c2805c.f148802d;
        if (i15 == 0) {
            r.b(objA);
            c2805c.f148799a = this;
            c2805c.f148802d = 1;
            objA = this.f148796i.a(true, c2805c);
            if (objA == aVar) {
                return aVar;
            }
            cVar = this;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = c2805c.f148799a;
            r.b(objA);
        }
        cVar.f148797j = (x01.e) objA;
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        Boolean bool = n0Var.f25490o;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            x01.e eVar = this.f148797j;
            return e0.b(((eVar != null ? eVar.f188254c : null) == x01.f.ACTIVE) == zBooleanValue);
        }
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "PromosIntegratedWithMFPValidator", "conditionsProvider.isIntegratedWithMFP == null");
        return l0.SHOW;
    }

    @Override // zd0.e0
    public final String e() {
        x01.e eVar = this.f148797j;
        x01.f fVar = eVar != null ? eVar.f188254c : null;
        int i14 = fVar == null ? -1 : b.f148798a[fVar.ordinal()];
        if (i14 != -1) {
            return i14 != 1 ? "isIntegratedWithMFP: false" : "isIntegratedWithMFP: true";
        }
        return "isIntegratedWithMFP: null";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr01/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
