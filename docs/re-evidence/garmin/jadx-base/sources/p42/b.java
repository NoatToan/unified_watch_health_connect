package p42;

import b63.o;
import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g22.l;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m42.k;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lp42/b;", "Lce0/b;", "Lm42/b;", "repository", "<init>", "(Lm42/b;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements ce0.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m42.b f135781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f135782j;

    /* JADX INFO: renamed from: p42.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.weighttracker.domain.promo.IndexS1ToS2PromoValidatorImpl", f = "IndexS1ToS2PromoValidatorImpl.kt", l = {36, 46}, m = "setup", v = 2)
    public static final class C2570b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f135783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f135784b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f135786d;

        public C2570b(d<? super C2570b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f135784b = obj;
            this.f135786d |= Integer.MIN_VALUE;
            return b.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lbm2/d;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.weighttracker.domain.promo.IndexS1ToS2PromoValidatorImpl$setup$pairedDevices$1", f = "IndexS1ToS2PromoValidatorImpl.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super List<? extends bm2.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f135787a;

        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super List<? extends bm2.d>> dVar) {
            return new c(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f135787a;
            if (i14 == 0) {
                r.b(obj);
                this.f135787a = 1;
                Serializable serializableH = ed0.a.h(this);
                return serializableH == aVar ? aVar : serializableH;
            }
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    static {
        new a(null);
    }

    public b(m42.b bVar) {
        bVar.getClass();
        this.f135781i = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zd0.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(d<? super Unit> dVar) throws Throwable {
        C2570b c2570b;
        boolean zP0;
        Object next;
        if (dVar instanceof C2570b) {
            c2570b = (C2570b) dVar;
            int i14 = c2570b.f135786d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2570b.f135786d = i14 - Integer.MIN_VALUE;
            } else {
                c2570b = new C2570b(dVar);
            }
        } else {
            c2570b = new C2570b(dVar);
        }
        Object objE0 = c2570b.f135784b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c2570b.f135786d;
        if (i15 == 0) {
            r.b(objE0);
            zP0 = bo1.a.a().c().P0();
            if (!zP0) {
                a2 a2Var = a2.PROMOTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "PromoIndexS1ToS2Validator", "User has no weight scale device");
                return Unit.INSTANCE;
            }
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            c cVar2 = new c(null);
            c2570b.f135783a = zP0;
            c2570b.f135786d = 1;
            objE0 = ge1.b.e0(bVar, cVar2, c2570b);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            zP0 = c2570b.f135783a;
            r.b(objE0);
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            this.f135782j = (Boolean) ((v2.b) v2Var).f47386a;
            return Unit.INSTANCE;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        a2 a2Var2 = a2.PROMOTIONS;
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to check all recent weights from Index S1 for promo validator: ");
        i2.f36769a.getClass();
        i2.a.f(a2Var2, "PromoIndexS1ToS2Validator", strD);
        return Unit.INSTANCE;
        Iterator it = ((List) objE0).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zb0.u0.n(String.valueOf(((bm2.d) next).getF92744h()), zb0.u0.P5));
        if (((bm2.d) next) == null) {
            a2 a2Var3 = a2.PROMOTIONS;
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "PromoIndexS1ToS2Validator", "User doesn't have an Index S2 paired to their account");
            return Unit.INSTANCE;
        }
        o oVarD = l.d(o.INSTANCE);
        c2570b.f135783a = zP0;
        c2570b.f135786d = 2;
        objE0 = f0.J(this.f135781i, new k(oVarD, null), c2570b);
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        Boolean bool = n0Var.f25493r;
        if (bool != null) {
            return e0.b(s.g(this.f135782j, bool));
        }
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "PromoIndexS1ToS2Validator", "conditionsProvider.hasRecentIndexScale1WeighIn == null");
        return l0.HIDE;
    }

    @Override // zd0.e0
    public final String e() {
        Boolean bool = this.f135782j;
        if (s.g(bool, Boolean.TRUE)) {
            return "hasOnlyIndexS1RecentWeights: true";
        }
        if (s.g(bool, Boolean.FALSE)) {
            return "hasOnlyIndexS1RecentWeights: false";
        }
        if (bool == null) {
            return "hasOnlyIndexS1RecentWeights: null";
        }
        u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp42/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
