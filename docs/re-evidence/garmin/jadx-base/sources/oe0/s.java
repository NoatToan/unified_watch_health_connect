package oe0;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import ne0.b0;
import ne0.i0;
import ne0.j0;
import ne0.k0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Loe0/s;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f131405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f131406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f131407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f131408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f131409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f131410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f131411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f131412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f131413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f131414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f131415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f131416l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131419c;

        public a(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131417a = koinComponent;
            this.f131418b = qualifier;
            this.f131419c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.i0] */
        @Override // e23.a
        public final i0 invoke() {
            KoinComponent koinComponent = this.f131417a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(i0.class), this.f131418b, this.f131419c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<ne0.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131422c;

        public b(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131420a = koinComponent;
            this.f131421b = qualifier;
            this.f131422c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.r] */
        @Override // e23.a
        public final ne0.r invoke() {
            KoinComponent koinComponent = this.f131420a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(ne0.r.class), this.f131421b, this.f131422c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<ne0.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131425c;

        public c(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131423a = koinComponent;
            this.f131424b = qualifier;
            this.f131425c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.t] */
        @Override // e23.a
        public final ne0.t invoke() {
            KoinComponent koinComponent = this.f131423a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(ne0.t.class), this.f131424b, this.f131425c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131428c;

        public d(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131426a = koinComponent;
            this.f131427b = qualifier;
            this.f131428c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.b0] */
        @Override // e23.a
        public final b0 invoke() {
            KoinComponent koinComponent = this.f131426a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(b0.class), this.f131427b, this.f131428c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131431c;

        public e(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131429a = koinComponent;
            this.f131430b = qualifier;
            this.f131431c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.j0] */
        @Override // e23.a
        public final j0 invoke() {
            KoinComponent koinComponent = this.f131429a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(j0.class), this.f131430b, this.f131431c);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements r53.i<i53.c<? extends pe0.d>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f131432a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f131433a;

            /* JADX INFO: renamed from: oe0.s$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.EditDogViewModel$special$$inlined$map$1$2", f = "EditDogViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2499a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f131434a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f131435b;

                public C2499a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f131434a = obj;
                    this.f131435b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f131433a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2499a c2499a;
                if (dVar instanceof C2499a) {
                    c2499a = (C2499a) dVar;
                    int i14 = c2499a.f131435b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2499a.f131435b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2499a = new C2499a(dVar);
                    }
                } else {
                    c2499a = new C2499a(dVar);
                }
                Object obj2 = c2499a.f131434a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2499a.f131435b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    i53.c cVarE = i53.a.e((List) obj);
                    c2499a.f131435b = 1;
                    if (this.f131433a.emit(cVarE, c2499a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public f(r53.i iVar) {
            this.f131432a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super i53.c<? extends pe0.d>> jVar, t13.d dVar) {
            Object objCollect = this.f131432a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public s() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this.f131405a = o13.m.a(koinPlatformTools.defaultLazyMode(), new a(this, null, null));
        this.f131406b = o13.m.a(koinPlatformTools.defaultLazyMode(), new b(this, null, null));
        this.f131407c = o13.m.a(koinPlatformTools.defaultLazyMode(), new c(this, null, null));
        this.f131408d = o13.m.a(koinPlatformTools.defaultLazyMode(), new d(this, null, null));
        this.f131409e = o13.m.a(koinPlatformTools.defaultLazyMode(), new e(this, null, null));
        p2 p2VarA = q2.a(new o(false, false, false, false, false, false, false, false, 255, null));
        this.f131410f = p2VarA;
        this.f131411g = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(new pe0.j(null, null, null, null, null, 0.0d, null, null, false, null, null, 2047, null));
        this.f131412h = p2VarA2;
        this.f131413i = r53.s.d(p2VarA2);
        p13.j0 j0Var = p13.j0.f134944a;
        p2 p2VarA3 = q2.a(j0Var);
        this.f131414j = p2VarA3;
        f fVar = new f(p2VarA3);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f131415k = r53.s.K(fVar, aVarA, k2.a.f150706c, i53.a.e(j0Var));
        this.f131416l = -1L;
        ge1.b.T(v1.a(this), null, null, new p(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, o13.l] */
    public static final Object x4(s sVar, je0.f fVar, pe0.j jVar, Context context, v13.c cVar) throws Throwable {
        u uVar;
        Object value;
        sVar.getClass();
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f131443c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f131443c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(sVar, cVar);
            }
        } else {
            uVar = new u(sVar, cVar);
        }
        Object objE0 = uVar.f131441a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f131443c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objE0);
            Uri uri = jVar.f137461k;
            if (uri != null && context != null) {
                j0 j0Var = (j0) sVar.f131409e.getValue();
                long j8 = fVar.f98501a;
                uVar.f131443c = 1;
                j0Var.getClass();
                x53.c cVar2 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new k0(j0Var, context, uri, j8, null), uVar);
                if (objE0 == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z14);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objE0);
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            p2 p2Var = sVar.f131412h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, pe0.j.a((pe0.j) value, null, null, null, null, null, 0.0d, null, null, false, (String) ((v2.b) v2Var).f47386a, null, 511)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void y4(String str) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f131412h;
            value = p2Var.getValue();
        } while (!p2Var.b(value, pe0.j.a((pe0.j) value, null, null, null, null, null, 0.0d, str, null, false, null, null, 1983)));
    }
}
