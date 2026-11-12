package ff0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.v2;
import cw1.g0;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import o53.s0;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.j0;
import yc.h2;
import yc.i2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lff0/c;", "Ls51/c;", "", "Lgf0/a;", "Lrf0/a;", "filterData", "Lo53/b0;", "coroutineScope", "Lff0/l;", "repository", "", "cachedActivities", "<init>", "(Lrf0/a;Lo53/b0;Lff0/l;Ljava/util/List;)V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends s51.c<String, gf0.a> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f71034l = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rf0.a f71035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f71036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f71037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<gf0.a> f71038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Logger f71039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e23.a<? extends Object> f71040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f71041k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgDataSource$loadAfter$1", f = "EcgDataSource.kt", l = {116, 129}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f71042a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f71044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h2.d<String> f71045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h2.a<String, gf0.a> f71046e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lff0/g;", "<anonymous>", "(Lo53/b0;)Lff0/g;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgDataSource$loadAfter$1$initialActivitiesResult$1", f = "EcgDataSource.kt", l = {118}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super g>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f71047a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f71048b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f71049c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h2.d<String> f71050d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, String str, h2.d<String> dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f71048b = cVar;
                this.f71049c = str;
                this.f71050d = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f71048b, this.f71049c, this.f71050d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super g> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f71047a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    c cVar = this.f71048b;
                    rf0.a aVar2 = cVar.f71035e;
                    rf0.a aVar3 = cVar.f71035e;
                    o13.p pVarZ = og.a.z(aVar2);
                    LocalDate localDate = (LocalDate) pVarZ.f128594a;
                    LocalDate localDate2 = (LocalDate) pVarZ.f128595b;
                    l lVar = cVar.f71037g;
                    String string = localDate != null ? localDate.toString("yyyy-MM-dd") : null;
                    String string2 = localDate2 != null ? localDate2.toString("yyyy-MM-dd") : null;
                    ArrayList arrayListM = og.a.M(aVar3);
                    ArrayList arrayListL = og.a.L(aVar3);
                    Integer num = new Integer(this.f71050d.f196004b);
                    this.f71047a = 1;
                    obj = lVar.c(string, string2, arrayListM, arrayListL, this.f71049c, num, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    return (g) ((v2.b) v2Var).f47386a;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, h2.d<String> dVar, h2.a<String, gf0.a> aVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f71044c = str;
            this.f71045d = dVar;
            this.f71046e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(this.f71044c, this.f71045d, this.f71046e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            if (r12 == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f71042a;
            h2.d<String> dVar = this.f71045d;
            c cVar = c.this;
            if (i14 == 0) {
                o13.r.b(obj);
                Logger logger = cVar.f71039i;
                int i15 = dVar.f196004b;
                String str = this.f71044c;
                logger.debug(c22.t.e(i15, "HealthSnapshotDataSource loadAfter() -> pageKey=[", str, "] , pageSize=[", "]"));
                x53.c cVar2 = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(cVar, str, dVar, null);
                this.f71042a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
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
            g gVar = (g) obj;
            h2.a<String, gf0.a> aVar3 = this.f71046e;
            if (gVar != null) {
                List<gf0.a> listA = gVar.a();
                cVar.f71039i.debug("HealthSnapshotDataSource - loadAfter() -> activities[" + listA + "]");
                if (listA == null || listA.isEmpty()) {
                    aVar3.a(null, j0.f134944a);
                } else {
                    cVar.f71038h.addAll(listA);
                    String next = gVar.getNext();
                    cVar.f71041k = next;
                    aVar3.a(next, listA);
                }
                cVar.f157379c.j(s51.e.LOADED);
            } else {
                cVar.f71040j = new g0(cVar, 28, dVar, aVar3);
                cVar.f157379c.j(s51.e.FAILED);
            }
            return Unit.INSTANCE;
            g gVar2 = (g) obj;
            cVar.f71039i.debug("HealthSnapshotDataSource loadAfter() -> result[" + gVar2 + "]");
            int i16 = dVar.f196004b;
            this.f71042a = 2;
            obj = c.j(cVar, gVar2, i16, this);
        }
    }

    /* JADX INFO: renamed from: ff0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgDataSource$loadInitial$1", f = "EcgDataSource.kt", l = {61, 73}, m = "invokeSuspend", v = 2)
    public static final class C1452c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f71051a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h2.c<String> f71053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h2.b<String, gf0.a> f71054d;

        /* JADX INFO: renamed from: ff0.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lff0/g;", "<anonymous>", "(Lo53/b0;)Lff0/g;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgDataSource$loadInitial$1$initialActivitiesResult$1", f = "EcgDataSource.kt", l = {63}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super g>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f71055a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f71056b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h2.c<String> f71057c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, h2.c<String> cVar2, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f71056b = cVar;
                this.f71057c = cVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f71056b, this.f71057c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super g> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f71055a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    c cVar = this.f71056b;
                    rf0.a aVar2 = cVar.f71035e;
                    rf0.a aVar3 = cVar.f71035e;
                    o13.p pVarZ = og.a.z(aVar2);
                    LocalDate localDate = (LocalDate) pVarZ.f128594a;
                    LocalDate localDate2 = (LocalDate) pVarZ.f128595b;
                    l lVar = cVar.f71037g;
                    String string = localDate != null ? localDate.toString("yyyy-MM-dd") : null;
                    String string2 = localDate2 != null ? localDate2.toString("yyyy-MM-dd") : null;
                    ArrayList arrayListM = og.a.M(aVar3);
                    ArrayList arrayListL = og.a.L(aVar3);
                    Integer num = new Integer(this.f71057c.f196002a);
                    this.f71055a = 1;
                    obj = lVar.c(string, string2, arrayListM, arrayListL, null, num, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    return (g) ((v2.b) v2Var).f47386a;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1452c(h2.c<String> cVar, h2.b<String, gf0.a> bVar, t13.d<? super C1452c> dVar) {
            super(2, dVar);
            this.f71053c = cVar;
            this.f71054d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C1452c(this.f71053c, this.f71054d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1452c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f71051a;
            h2.c<String> cVar = this.f71053c;
            c cVar2 = c.this;
            if (i14 == 0) {
                o13.r.b(obj);
                com.airbnb.lottie.animation.keyframe.a.r("HealthSnapshotDataSource - loadInitial() -> pageKey=null , pageSize=[", cVar.f196002a, "]", cVar2.f71039i);
                x53.c cVar3 = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(cVar2, cVar, null);
                this.f71051a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
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
            g gVar = (g) obj;
            h2.b<String, gf0.a> bVar2 = this.f71054d;
            if (gVar != null) {
                List<gf0.a> listA = gVar.a();
                cVar2.f71039i.debug("HealthSnapshotDataSource - loadInitial() -> activities[" + listA + "]");
                if (listA == null || listA.isEmpty()) {
                    bVar2.a(null, j0.f134944a);
                } else {
                    cVar2.f71038h.addAll(listA);
                    String next = gVar.getNext();
                    cVar2.f71041k = next;
                    bVar2.a(next, listA);
                }
                cVar2.f157380d.j(s51.e.LOADED);
            } else {
                cVar2.f71040j = new g0(cVar2, 29, cVar, bVar2);
                cVar2.f157380d.j(s51.e.FAILED);
            }
            return Unit.INSTANCE;
            g gVar2 = (g) obj;
            cVar2.f71039i.debug("HealthSnapshotDataSource - loadInitial() -> activities[" + gVar2 + "]");
            int i15 = cVar.f196002a;
            this.f71051a = 2;
            obj = c.j(cVar2, gVar2, i15, this);
        }
    }

    static {
        new a(null);
    }

    public c(rf0.a aVar, b0 b0Var, l lVar, List<gf0.a> list) {
        aVar.getClass();
        b0Var.getClass();
        lVar.getClass();
        list.getClass();
        this.f71035e = aVar;
        this.f71036f = b0Var;
        this.f71037g = lVar;
        this.f71038h = list;
        this.f71039i = gt2.c.b(a2.ACTIVITIES.f28756a);
    }

    public static final Object j(c cVar, g gVar, int i14, v13.i iVar) {
        String next;
        String str = null;
        if (gVar != null) {
            cVar.getClass();
            List<gf0.a> listA = gVar.a();
            g gVar2 = (listA == null || listA.isEmpty()) ? gVar : null;
            if (gVar2 != null && (next = gVar2.getNext()) != null && next.length() > 0) {
                str = next;
            }
        }
        if (str != null) {
            cVar.f71039i.debug("HealthSnapshotDataSource getFirstPageWithData() -> load more pages (no data, next page key is available)");
            return cVar.k(i14, str, iVar);
        }
        cVar.getClass();
        return gVar;
    }

    @Override // yc.h2
    public final void d(h2.d<String> dVar, h2.a<String, gf0.a> aVar) {
        dVar.getClass();
        aVar.getClass();
        String str = dVar.f196003a;
        if (str.length() == 0) {
            return;
        }
        this.f157379c.j(s51.e.LOADING);
        ge1.b.T(this.f71036f, null, null, new b(str, dVar, aVar, null), 3);
    }

    @Override // yc.h2
    public final void e(h2.d dVar, i2 i2Var) {
    }

    @Override // yc.h2
    public final void f(h2.c<String> cVar, h2.b<String, gf0.a> bVar) {
        cVar.getClass();
        bVar.getClass();
        List<gf0.a> list = this.f71038h;
        if (list.size() == 0) {
            this.f157380d.j(s51.e.LOADING);
            ge1.b.T(this.f71036f, null, null, new C1452c(cVar, bVar, null), 3);
            return;
        }
        this.f71039i.debug("HealthSnapshotDataSource loadInitial() -> cached[" + list + "]");
        bVar.a(this.f71041k, new ArrayList(list));
    }

    @Override // s51.c
    public final void g() {
        this.f71039i.debug("HealthSnapshotDataSource - refresh()");
        this.f71038h.clear();
        b();
    }

    @Override // s51.c
    public final void h(gf0.a aVar) {
        gf0.a aVar2 = aVar;
        this.f71039i.debug("HealthSnapshotDataSource - remove() -> [" + aVar2 + "]");
        this.f71038h.remove(aVar2);
        b();
    }

    @Override // s51.c
    public final void i() {
        e23.a<? extends Object> aVar = this.f71040j;
        this.f71040j = null;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [T] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:12:0x0034). Please report as a decompilation issue!!! */
    public final Object k(int i14, String str, v13.c cVar) throws Throwable {
        d dVar;
        r0 r0VarS;
        ?? r14;
        Object objE0;
        d dVar2;
        r0 r0Var;
        ?? r15;
        ?? r16;
        List<gf0.a> listA;
        String next;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i15 = dVar.f71063f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar.f71063f = i15 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f71061d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar.f71063f;
        Logger logger = this.f71039i;
        if (i16 == 0) {
            r0VarS = wr.g.s(obj);
            r0VarS.f105810a = str;
            r14 = str;
            com.airbnb.lottie.animation.keyframe.a.u("HealthSnapshotDataSource getFirstPageWithData() -> load page with key[", r14, "]", logger);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            e eVar = new e(this, r0VarS, i14, null);
            dVar.f71058a = r14;
            dVar.f71059b = r0VarS;
            dVar.f71060c = i14;
            dVar.f71063f = 1;
            objE0 = ge1.b.e0(bVar, eVar, dVar);
            if (objE0 == aVar) {
                return aVar;
            }
            dVar2 = dVar;
            r0Var = r0VarS;
            obj = objE0;
            r15 = r14;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = dVar.f71060c;
            r0 r0Var2 = dVar.f71059b;
            String str2 = dVar.f71058a;
            o13.r.b(obj);
            dVar2 = dVar;
            r0Var = r0Var2;
            r15 = str2;
        }
        d dVar3 = dVar2;
        g gVar = (g) obj;
        logger.debug("HealthSnapshotDataSource getFirstPageWithData() -> activities[" + gVar + "]");
        if (gVar != null || (next = gVar.getNext()) == null || next.length() <= 0) {
            r16 = next;
            r16 = 0;
        }
        r16 = next;
        r0Var.f105810a = r16;
        if (gVar != null || (!((listA = gVar.a()) == null || listA.isEmpty()) || r0Var.f105810a == null)) {
            return gVar;
        }
        r0VarS = r0Var;
        dVar = dVar3;
        r14 = r15;
        com.airbnb.lottie.animation.keyframe.a.u("HealthSnapshotDataSource getFirstPageWithData() -> load page with key[", r14, "]", logger);
        x53.c cVar3 = s0.f129406a;
        x53.b bVar2 = x53.b.f189152a;
        e eVar2 = new e(this, r0VarS, i14, null);
        dVar.f71058a = r14;
        dVar.f71059b = r0VarS;
        dVar.f71060c = i14;
        dVar.f71063f = 1;
        objE0 = ge1.b.e0(bVar2, eVar2, dVar);
        if (objE0 == aVar) {
            return aVar;
        }
        dVar2 = dVar;
        r0Var = r0VarS;
        obj = objE0;
        r15 = r14;
        d dVar4 = dVar2;
        g gVar2 = (g) obj;
        logger.debug("HealthSnapshotDataSource getFirstPageWithData() -> activities[" + gVar2 + "]");
        if (gVar2 != null) {
            r16 = next;
            r16 = 0;
        } else {
            r16 = next;
            r16 = 0;
        }
        r16 = next;
        r0Var.f105810a = r16;
        return gVar2 != null ? gVar2 : gVar2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lff0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DATE_FORMAT", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
