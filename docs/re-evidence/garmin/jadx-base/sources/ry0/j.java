package ry0;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import gy0.j0;
import gy0.k0;
import gy0.n0;
import gy0.t;
import gy0.v;
import gy0.x0;
import gy0.z0;
import java.util.List;
import o13.n;
import o13.r;
import o53.b0;
import o53.c0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lry0/j;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", "applicationContext", "Lc22/k;", "appConfigurationDelegate", "<init>", "(Landroid/content/Context;Lc22/k;)V", "b", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f155100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c22.k f155101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f155103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f155104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f155105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f155106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f155107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f155108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f155109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f155110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f155111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f155112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f155113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f155114o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f155115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f155116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f155117r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f155118t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b2 f155119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p2 f155120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b2 f155121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p2 f155122y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b2 f155123z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListViewModel$1", f = "MultiDayActivitiesListViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155124a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155124a;
            if (i14 == 0) {
                r.b(obj);
                this.f155124a = 1;
                if (j.this.x4(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListViewModel", f = "MultiDayActivitiesListViewModel.kt", l = {113, 116}, m = "loadNextPage", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f155126a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f155128c;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f155126a = obj;
            this.f155128c |= Integer.MIN_VALUE;
            return j.this.y4(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<z0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f155129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f155130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f155131c;

        public d(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f155129a = scope;
            this.f155130b = qualifier;
            this.f155131c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.z0, java.lang.Object] */
        @Override // e23.a
        public final z0 invoke() {
            return this.f155129a.get(s0.f105811a.b(z0.class), this.f155130b, this.f155131c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f155132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f155133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f155134c;

        public e(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f155132a = scope;
            this.f155133b = qualifier;
            this.f155134c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.x0, java.lang.Object] */
        @Override // e23.a
        public final x0 invoke() {
            return this.f155132a.get(s0.f105811a.b(x0.class), this.f155133b, this.f155134c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f155135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f155136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f155137c;

        public f(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f155135a = scope;
            this.f155136b = qualifier;
            this.f155137c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.n0, java.lang.Object] */
        @Override // e23.a
        public final n0 invoke() {
            return this.f155135a.get(s0.f105811a.b(n0.class), this.f155136b, this.f155137c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f155138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f155139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f155140c;

        public g(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f155138a = scope;
            this.f155139b = qualifier;
            this.f155140c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.k0, java.lang.Object] */
        @Override // e23.a
        public final k0 invoke() {
            return this.f155138a.get(s0.f105811a.b(k0.class), this.f155139b, this.f155140c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f155141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f155142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f155143c;

        public h(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f155141a = scope;
            this.f155142b = qualifier;
            this.f155143c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.j0, java.lang.Object] */
        @Override // e23.a
        public final j0 invoke() {
            return this.f155141a.get(s0.f105811a.b(j0.class), this.f155142b, this.f155143c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f155144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f155145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f155146c;

        public i(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f155144a = scope;
            this.f155145b = qualifier;
            this.f155146c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.v, java.lang.Object] */
        @Override // e23.a
        public final v invoke() {
            return this.f155144a.get(s0.f105811a.b(v.class), this.f155145b, this.f155146c);
        }
    }

    /* JADX INFO: renamed from: ry0.j$j, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2938j implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f155147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f155148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f155149c;

        public C2938j(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f155147a = scope;
            this.f155148b = qualifier;
            this.f155149c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.t, java.lang.Object] */
        @Override // e23.a
        public final t invoke() {
            return this.f155147a.get(s0.f105811a.b(t.class), this.f155148b, this.f155149c);
        }
    }

    static {
        new b(null);
    }

    public j(Context context, c22.k kVar) {
        context.getClass();
        kVar.getClass();
        this.f155100a = context;
        this.f155101b = kVar;
        Scope scopeV = xy2.b.v();
        n nVar = n.SYNCHRONIZED;
        this.f155103d = o13.m.a(nVar, new d(scopeV, null, null));
        this.f155104e = o13.m.a(nVar, new e(scopeV, null, null));
        this.f155105f = o13.m.a(nVar, new f(scopeV, null, null));
        this.f155106g = o13.m.a(nVar, new g(scopeV, null, null));
        this.f155107h = o13.m.a(nVar, new h(scopeV, null, null));
        this.f155108i = o13.m.a(nVar, new i(scopeV, null, null));
        this.f155109j = o13.m.a(nVar, new C2938j(scopeV, null, null));
        p2 p2VarA = q2.a(j53.l.b());
        this.f155110k = p2VarA;
        this.f155111l = s.d(p2VarA);
        p2 p2VarA2 = q2.a(p13.j0.f134944a);
        this.f155112m = p2VarA2;
        this.f155113n = s.d(p2VarA2);
        p2 p2VarA3 = q2.a(null);
        this.f155114o = p2VarA3;
        this.f155115p = s.d(p2VarA3);
        p2 p2VarA4 = q2.a(new yc.z0.c(true));
        this.f155116q = p2VarA4;
        this.f155117r = s.d(p2VarA4);
        p2 p2VarA5 = q2.a(Boolean.FALSE);
        this.f155118t = p2VarA5;
        this.f155119v = s.d(p2VarA5);
        p2 p2VarA6 = q2.a(Boolean.TRUE);
        this.f155120w = p2VarA6;
        this.f155121x = s.d(p2VarA6);
        p2 p2VarA7 = q2.a(null);
        this.f155122y = p2VarA7;
        this.f155123z = s.d(p2VarA7);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[PHI: r15
      0x003e: PHI (r15v20 java.lang.Object) = (r15v19 java.lang.Object), (r15v1 java.lang.Object) binds: [B:39:0x0105, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[PHI: r2 r9
      0x0078: PHI (r2v4 int) = (r2v3 int), (r2v5 int) binds: [B:24:0x0074, B:33:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r9v1 r53.z1) = (r9v0 r53.z1), (r9v2 r53.z1) binds: [B:24:0x0074, B:33:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad A[LOOP:2: B:26:0x00a7->B:28:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0 A[PHI: r2 r8 r9 r15
      0x00d0: PHI (r2v5 int) = (r2v4 int), (r2v17 int) binds: [B:30:0x00cc, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r8v7 java.lang.Object) = (r8v6 java.lang.Object), (r8v10 java.lang.Object) binds: [B:30:0x00cc, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r9v2 r53.z1) = (r9v1 r53.z1), (r9v6 r53.z1) binds: [B:30:0x00cc, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r15v13 java.lang.Object) = (r15v12 java.lang.Object), (r15v1 java.lang.Object) binds: [B:30:0x00cc, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00cc -> B:32:0x00d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object x4(v13.c r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry0.j.x4(v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, o13.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y4(t13.d<? super Unit> dVar) {
        c cVar;
        Object value;
        p2 p2Var;
        Object value2;
        Object value3;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f155128c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f155128c = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objA = cVar.f155126a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f155128c;
        p2 p2Var2 = this.f155118t;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objA);
            }
            return Unit.INSTANCE;
        }
        r.b(objA);
        do {
            value = p2Var2.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var2.b(value, Boolean.TRUE));
        z0 z0Var = (z0) this.f155103d.getValue();
        Integer num = new Integer(this.f155102c);
        int iD = (int) this.f155101b.d("mda_list_fetch_limit");
        if (iD <= 0) {
            iD = 5;
        }
        Integer num2 = new Integer(iD);
        cVar.f155128c = 1;
        objA = z0Var.a(num, num2, cVar);
        if (objA != aVar) {
        }
        return aVar;
        List list = (List) objA;
        this.f155102c += list != null ? list.size() : 0;
        if (list != null) {
            cVar.f155128c = 2;
            Object objE = c0.e(new l(list, this, false, null), cVar);
            if (objE != u13.a.COROUTINE_SUSPENDED) {
                objE = Unit.INSTANCE;
            }
        } else {
            do {
                p2Var = this.f155120w;
                value2 = p2Var.getValue();
                ((Boolean) value2).getClass();
            } while (!p2Var.b(value2, Boolean.FALSE));
            do {
                value3 = p2Var2.getValue();
                ((Boolean) value3).getClass();
            } while (!p2Var2.b(value3, Boolean.FALSE));
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lry0/j$b;", "", "<init>", "()V", "", "DEFAULT_PAGE_SIZE", "I", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
