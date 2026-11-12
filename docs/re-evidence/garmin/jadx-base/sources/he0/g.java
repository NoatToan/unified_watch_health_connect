package he0;

import c80.m0;
import c80.n0;
import c80.s;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z70.a0;
import zd0.e0;
import zd0.j1;
import zd0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhe0/g;", "Lzd0/e0;", "Lz70/a0;", "promosPreferences", "<init>", "(Lz70/a0;)V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements e0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f83503k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m0 f83504l = m0.f25440d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f83505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f83506j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.domain.validators.PromosGCPlusValidator", f = "PromosGCPlusValidator.kt", l = {27}, m = "setup", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f83507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f83508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f83509c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f83511e;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f83509c = obj;
            this.f83511e |= Integer.MIN_VALUE;
            return g.this.c(this);
        }
    }

    public g(a0 a0Var) {
        a0Var.getClass();
        this.f83505i = a0Var;
    }

    @Override // zd0.e0
    public final m0 a() {
        return f83504l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        b bVar;
        g gVar;
        g gVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f83511e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f83511e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objI = bVar.f83509c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f83511e;
        s sVar = null;
        if (i15 == 0) {
            r.b(objI);
            try {
                j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                bVar.f83507a = this;
                bVar.f83508b = this;
                bVar.f83511e = 1;
                objI = j1Var.i(bVar);
                if (objI == aVar) {
                    return aVar;
                }
                gVar = this;
                gVar2 = gVar;
            } catch (Exception unused) {
                gVar = this;
                gVar2 = gVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar2 = bVar.f83508b;
            gVar = bVar.f83507a;
            try {
                r.b(objI);
            } catch (Exception unused2) {
                gVar2 = gVar;
            }
        }
        sVar = (s) objI;
        gVar2.f83506j = sVar;
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "PromosGCPlusValidator", "conditionsProvider: " + n0Var);
        Boolean bool = n0Var.f25477b;
        if (bool == null) {
            i2.a.k(a2Var, "PromosGCPlusValidator", "conditionsProvider.hasGCPlusSubscription == null");
            return l0.HIDE;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (this.f83505i.a()) {
            i2.a.k(a2Var, "PromosGCPlusValidator", "Dev setting: should ignore subscription status is true.");
            return l0.SHOW;
        }
        s sVar = this.f83506j;
        if (sVar == null) {
            i2.a.k(a2Var, "PromosGCPlusValidator", "Missing subscription status.");
            return l0.HIDE;
        }
        if (sVar instanceof s.a) {
            return e0.b(zBooleanValue);
        }
        if (sVar instanceof s.b) {
            return e0.b(!zBooleanValue);
        }
        if (sVar instanceof s.c) {
            return l0.HIDE;
        }
        u0.r();
        return null;
    }

    @Override // zd0.e0
    public final String e() {
        s sVar = this.f83506j;
        if (sVar instanceof s.a) {
            return "hasGCPlusSubscription: true";
        }
        return ((sVar instanceof s.b) || (sVar instanceof s.c)) ? "hasGCPlusSubscription: false" : "hasGCPlusSubscription: null";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhe0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
