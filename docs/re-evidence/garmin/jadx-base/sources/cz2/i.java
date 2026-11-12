package cz2;

import o53.b0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@v13.e(c = "com.garmin.util.coroutines.OperationQueue$queue$3", f = "OperationQueue.kt", l = {145, 123}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1 f56909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f56911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f56912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f56913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f56914f;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.j<Unit> f56915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o53.j<? super Unit> jVar) {
            super(0);
            this.f56915a = jVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            int i14 = o13.q.f128596b;
            Unit unit = Unit.INSTANCE;
            this.f56915a.resumeWith(unit);
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(e23.l<? super t13.d<Object>, ? extends Object> lVar, int i14, h hVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f56912d = lVar;
        this.f56913e = i14;
        this.f56914f = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f56912d, this.f56913e, this.f56914f, dVar);
        iVar.f56911c = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #4 {, blocks: (B:43:0x00ad, B:46:0x00bb), top: B:79:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #0 {, blocks: (B:61:0x00e0, B:64:0x00ee), top: B:72:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, cz2.h$b, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r14;
        h.b bVar;
        h hVar;
        ?? r15;
        ?? r16;
        h.b bVar2;
        h hVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r0Var = this.f56910b;
        h.b bVarPoll = null;
        try {
            if (r0Var == 0) {
                o13.r.b(obj);
                b0 b0Var = (b0) this.f56911c;
                r0Var = new r0();
                t13.g.a aVar2 = b0Var.getF195311f().get(l1.f129368i0);
                aVar2.getClass();
                l1 l1Var = (l1) aVar2;
                int i14 = this.f56913e;
                h hVar3 = this.f56914f;
                this.f56911c = r0Var;
                this.f56909a = l1Var;
                this.f56910b = 1;
                o53.k kVar = new o53.k(u13.f.b(this), 1);
                kVar.q();
                ?? bVar3 = new h.b(i14, l1Var, new a(kVar));
                r0Var.f105810a = bVar3;
                synchronized (hVar3.f56902a) {
                    try {
                        if (!hVar3.f56903b) {
                            g8.i.q("OperationQueue is closed", l1Var);
                        }
                        if (hVar3.f56904c == null) {
                            hVar3.f56904c = bVar3;
                            bVar3.f56907c.invoke();
                        } else {
                            hVar3.f56902a.add((h.b) bVar3);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                r15 = r0Var;
                if (kVar.p() == aVar) {
                }
                return aVar;
            }
            if (r0Var == 1) {
                r0 r0Var2 = (r0) this.f56911c;
                o13.r.b(obj);
                r15 = r0Var2;
            } else {
                if (r0Var != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r14 = (r0) this.f56911c;
                try {
                    o13.r.b(obj);
                    r16 = r14;
                } catch (Throwable th4) {
                    th = th4;
                    bVar = (h.b) r14.f105810a;
                    if (bVar != null) {
                        hVar = this.f56914f;
                        synchronized (hVar.f56902a) {
                            hVar.f56902a.remove(bVar);
                            if (!p005kotlin.jvm.internal.s.g(hVar.f56904c, bVar)) {
                                bVarPoll = hVar.f56902a.poll();
                                hVar.f56904c = bVarPoll;
                            }
                        }
                        if (bVarPoll != null) {
                            bVarPoll.f56907c.invoke();
                        }
                    }
                    throw th;
                }
            }
            bVar2 = (h.b) r16.f105810a;
            if (bVar2 != null) {
                hVar2 = this.f56914f;
                synchronized (hVar2.f56902a) {
                    hVar2.f56902a.remove(bVar2);
                    if (!p005kotlin.jvm.internal.s.g(hVar2.f56904c, bVar2)) {
                        bVarPoll = hVar2.f56902a.poll();
                        hVar2.f56904c = bVarPoll;
                    }
                }
                if (bVarPoll != null) {
                    bVarPoll.f56907c.invoke();
                    return obj;
                }
            }
            return obj;
            e23.l<t13.d<Object>, Object> lVar = this.f56912d;
            this.f56911c = r15;
            this.f56909a = null;
            this.f56910b = 2;
            obj = lVar.invoke(this);
            if (obj != aVar) {
                r16 = r15;
                bVar2 = (h.b) r16.f105810a;
                if (bVar2 != null) {
                    hVar2 = this.f56914f;
                    synchronized (hVar2.f56902a) {
                        hVar2.f56902a.remove(bVar2);
                        if (!p005kotlin.jvm.internal.s.g(hVar2.f56904c, bVar2)) {
                            bVarPoll = hVar2.f56902a.poll();
                            hVar2.f56904c = bVarPoll;
                        }
                        if (bVarPoll != null) {
                            bVarPoll.f56907c.invoke();
                            return obj;
                        }
                    }
                }
                return obj;
            }
            return aVar;
        } catch (Throwable th5) {
            th = th5;
            r14 = r0Var;
            bVar = (h.b) r14.f105810a;
            if (bVar != null) {
                hVar = this.f56914f;
                synchronized (hVar.f56902a) {
                    hVar.f56902a.remove(bVar);
                    if (!p005kotlin.jvm.internal.s.g(hVar.f56904c, bVar)) {
                        bVarPoll = hVar.f56902a.poll();
                        hVar.f56904c = bVarPoll;
                    }
                    if (bVarPoll != null) {
                        bVarPoll.f56907c.invoke();
                    }
                }
            }
            throw th;
        }
    }
}
