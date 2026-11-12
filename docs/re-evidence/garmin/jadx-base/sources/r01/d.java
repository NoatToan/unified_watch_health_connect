package r01;

import b63.o;
import b63.q;
import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import g22.l;
import java.util.Iterator;
import java.util.List;
import k01.h;
import k01.k;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import x01.i;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lr01/d;", "Lfe0/d;", "Lx01/i;", "stateProvider", "Lm01/g;", "repository", "<init>", "(Lx01/i;Lm01/g;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements fe0.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f148803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m01.g f148804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f148805k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.promo.PromosLoggedWithMFPValidatorImpl", f = "PromosLoggedWithMFPValidatorImpl.kt", l = {30, 41}, m = "setup", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f148806a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f148808c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f148806a = obj;
            this.f148808c |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    static {
        new a(null);
    }

    public d(i iVar, m01.g gVar) {
        iVar.getClass();
        gVar.getClass();
        this.f148803i = iVar;
        this.f148804j = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zd0.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t13.d<? super Unit> dVar) {
        b bVar;
        Boolean boolValueOf;
        List<h> list;
        Integer num;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f148808c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f148808c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objA = bVar.f148806a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f148808c;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(objA);
            bVar.f148808c = 1;
            objA = this.f148803i.a(true, bVar);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            r.b(objA);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.PROMOTIONS;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to get reports for promo validator: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "PromosLoggedWithMFPValidator", strD);
            return Unit.INSTANCE;
        }
        k01.c cVar = (k01.c) ((v2.b) v2Var).f47386a;
        if (cVar == null || (list = cVar.f102019d) == null) {
            boolValueOf = Boolean.FALSE;
        } else {
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                    h hVar = (h) it.next();
                    v21.f fVar = v21.f.f175333a;
                    k kVar = hVar.f102061b;
                    num = kVar != null ? kVar.f102072a : null;
                    fVar.getClass();
                } while (!v21.f.s(num));
            } else {
                z14 = false;
                break;
            }
            boolValueOf = Boolean.valueOf(z14);
        }
        this.f148805k = boolValueOf;
        return Unit.INSTANCE;
        x01.e eVar = (x01.e) objA;
        if (eVar.f188254c != x01.f.ACTIVE || eVar.f188255d != x01.f.NEVER) {
            this.f148805k = Boolean.FALSE;
            return Unit.INSTANCE;
        }
        o oVarD = l.d(o.INSTANCE);
        o oVarD2 = q.d(oVarD, new b63.d(0, 0, 90, 3, null));
        bVar.f148808c = 2;
        objA = this.f148804j.q(oVarD2, oVarD, oVarD, bVar);
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        Boolean bool = n0Var.f25491p;
        if (bool != null) {
            return e0.b(s.g(this.f148805k, bool));
        }
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "PromosLoggedWithMFPValidator", "conditionsProvider.loggedToMFPInLast90Days == null");
        return l0.SHOW;
    }

    @Override // zd0.e0
    public final String e() {
        return "hasLoggedLast90Days: " + this.f148805k;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr01/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
