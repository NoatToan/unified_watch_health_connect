package oe0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lc.u0;
import ne0.d0;
import ne0.v;
import o53.b0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Loe0/l;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f131343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f131344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f131345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f131346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f131347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f131348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f131349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f131350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f131351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f131352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f131353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f131354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f131355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f131356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f131357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f131358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f131359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f131360r;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131361a;

        static {
            int[] iArr = new int[pe0.g.values().length];
            try {
                iArr[pe0.g.MOST_RECENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pe0.g.LEAST_RECENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pe0.g.A_TO_Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pe0.g.Z_TO_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f131361a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            je0.j jVar = ((pe0.h) t7).f137444c;
            je0.j jVar2 = je0.j.ACTIVE;
            return r13.a.b(Boolean.valueOf(jVar != jVar2), Boolean.valueOf(((pe0.h) t14).f137444c != jVar2));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            je0.j jVar = ((pe0.h) t7).f137444c;
            je0.j jVar2 = je0.j.ACTIVE;
            return r13.a.b(Boolean.valueOf(jVar != jVar2), Boolean.valueOf(((pe0.h) t14).f137444c != jVar2));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            je0.j jVar = ((pe0.h) t7).f137444c;
            je0.j jVar2 = je0.j.ACTIVE;
            return r13.a.b(Boolean.valueOf(jVar != jVar2), Boolean.valueOf(((pe0.h) t14).f137444c != jVar2));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f131362a;

        public e(Comparator comparator) {
            this.f131362a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f131362a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(((pe0.h) t7).f137443b, ((pe0.h) t14).f137443b);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f131363a;

        public f(Comparator comparator) {
            this.f131363a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f131363a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(((pe0.h) t14).f137443b, ((pe0.h) t7).f137443b);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f131364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f131365b;

        public g(Comparator comparator, boolean z14) {
            this.f131364a = comparator;
            this.f131365b = z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f131364a.compare(t7, t14);
            if (iCompare != 0) {
                return iCompare;
            }
            pe0.h hVar = (pe0.h) t14;
            pe0.h hVar2 = (pe0.h) t7;
            b63.u uVar = hVar2.f137446e;
            if (uVar == null && hVar.f137446e == null) {
                return hVar2.f137443b.compareTo(hVar.f137443b);
            }
            if (uVar == null) {
                return 1;
            }
            b63.u uVar2 = hVar.f137446e;
            if (uVar2 == null) {
                return -1;
            }
            int iCompareTo = uVar.compareTo(uVar2);
            return this.f131365b ? -iCompareTo : iCompareTo;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogsListViewModel$loadDogs$1", f = "DogsListViewModel.kt", l = {76, 80}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f131366a;

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new h(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        
            if (r9 == r0) goto L23;
         */
        /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            p2 p2Var;
            Object value;
            Object value2;
            Object value3;
            Object value4;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f131366a;
            l lVar = l.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    p2 p2Var2 = lVar.f131351i;
                    do {
                        value2 = p2Var2.getValue();
                        ((Boolean) value2).getClass();
                    } while (!p2Var2.b(value2, Boolean.TRUE));
                    v vVar = (v) lVar.f131345c.getValue();
                    this.f131366a = 1;
                    obj = vVar.a(this);
                    if (obj != aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                i53.c cVar = (i53.c) obj;
                p2 p2Var3 = lVar.f131347e;
                do {
                    value4 = p2Var3.getValue();
                } while (!p2Var3.b(value4, cVar));
                lVar.x4();
                ge1.b.T(v1.a(lVar), null, null, new m(lVar, null), 3);
                p2Var = lVar.f131351i;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
                return Unit.INSTANCE;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                p2 p2Var4 = lVar.f131353k;
                do {
                    value3 = p2Var4.getValue();
                    ((Boolean) value3).getClass();
                } while (!p2Var4.b(value3, bool));
                if (zBooleanValue) {
                    ne0.n nVar = (ne0.n) lVar.f131343a.getValue();
                    this.f131366a = 2;
                    obj = ge1.b.e0(nVar.f125506b, new ne0.m(nVar, null), this);
                }
            } catch (Exception unused) {
            }
            p2Var = lVar.f131351i;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.FALSE));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<ne0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131370c;

        public i(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131368a = koinComponent;
            this.f131369b = qualifier;
            this.f131370c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.n] */
        @Override // e23.a
        public final ne0.n invoke() {
            KoinComponent koinComponent = this.f131368a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(ne0.n.class), this.f131369b, this.f131370c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<ne0.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131373c;

        public j(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131371a = koinComponent;
            this.f131372b = qualifier;
            this.f131373c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.p] */
        @Override // e23.a
        public final ne0.p invoke() {
            KoinComponent koinComponent = this.f131371a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(ne0.p.class), this.f131372b, this.f131373c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.a<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131376c;

        public k(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131374a = koinComponent;
            this.f131375b = qualifier;
            this.f131376c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.v] */
        @Override // e23.a
        public final v invoke() {
            KoinComponent koinComponent = this.f131374a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(v.class), this.f131375b, this.f131376c);
        }
    }

    /* JADX INFO: renamed from: oe0.l$l, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2498l implements e23.a<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131379c;

        public C2498l(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131377a = koinComponent;
            this.f131378b = qualifier;
            this.f131379c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.d0] */
        @Override // e23.a
        public final d0 invoke() {
            KoinComponent koinComponent = this.f131377a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(d0.class), this.f131378b, this.f131379c);
        }
    }

    public l() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this.f131343a = o13.m.a(koinPlatformTools.defaultLazyMode(), new i(this, null, null));
        this.f131344b = o13.m.a(koinPlatformTools.defaultLazyMode(), new j(this, null, null));
        this.f131345c = o13.m.a(koinPlatformTools.defaultLazyMode(), new k(this, null, null));
        this.f131346d = o13.m.a(koinPlatformTools.defaultLazyMode(), new C2498l(this, null, null));
        p2 p2VarA = q2.a(j53.l.b());
        this.f131347e = p2VarA;
        this.f131348f = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(j53.l.b());
        this.f131349g = p2VarA2;
        this.f131350h = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(Boolean.TRUE);
        this.f131351i = p2VarA3;
        this.f131352j = r53.s.d(p2VarA3);
        p2 p2VarA4 = q2.a(Boolean.FALSE);
        this.f131353k = p2VarA4;
        this.f131354l = r53.s.d(p2VarA4);
        p2 p2VarA5 = q2.a(null);
        this.f131355m = p2VarA5;
        this.f131356n = r53.s.d(p2VarA5);
        p2 p2VarA6 = q2.a(pe0.g.MOST_RECENT);
        this.f131357o = p2VarA6;
        this.f131358p = r53.s.d(p2VarA6);
        p2 p2VarA7 = q2.a(new pe0.i(null, null, null, 7, null));
        this.f131359q = p2VarA7;
        this.f131360r = r53.s.d(p2VarA7);
        y4();
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        List listN0;
        je0.j jVar = (je0.j) this.f131355m.getValue();
        do {
            p2Var = this.f131349g;
            value = p2Var.getValue();
            Iterable iterable = (Iterable) this.f131347e.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                pe0.h hVar = (pe0.h) obj;
                if (jVar == null || hVar.f137444c == jVar) {
                    arrayList.add(obj);
                }
            }
            p2 p2Var2 = this.f131357o;
            int i14 = a.f131361a[((pe0.g) p2Var2.getValue()).ordinal()];
            if (i14 == 1 || i14 == 2) {
                listN0 = h0.N0(arrayList, new g(new b(), p2Var2.getValue() == pe0.g.MOST_RECENT));
            } else if (i14 == 3) {
                listN0 = h0.N0(arrayList, new e(new c()));
            } else {
                if (i14 != 4) {
                    u0.r();
                    return;
                }
                listN0 = h0.N0(arrayList, new f(new d()));
            }
        } while (!p2Var.b(value, i53.a.j(listN0)));
    }

    public final void y4() {
        ge1.b.T(v1.a(this), null, null, new h(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o13.l] */
    public final Object z4(v13.c cVar) {
        n nVar;
        p2 p2Var;
        Object value;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f131388c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f131388c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f131386a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f131388c;
        if (i15 == 0) {
            o13.r.b(obj);
            d0 d0Var = (d0) this.f131346d.getValue();
            nVar.f131388c = 1;
            if (d0Var.a(nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        do {
            p2Var = this.f131353k;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.TRUE));
        return Unit.INSTANCE;
    }
}
