package bo2;

import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import o53.l1;
import o53.m0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Laq2/l;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletFlow$1", f = "AlipayAppletInstallationViewModel.kt", l = {128, 130, 131, 133}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<t<? super aq2.l<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1 f19274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f19278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f19279f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$downloadAppletFlow$1$progressUpdateJob$1", f = "AlipayAppletInstallationViewModel.kt", l = {124, 125}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t<aq2.l<Unit>> f19282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super aq2.l<Unit>> tVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f19282c = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f19282c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0027  */
        /* JADX WARN: Code duplicated, block: B:16:0x0034  */
        /* JADX WARN: Code duplicated, block: B:21:0x004a  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        
            if (r6.f19282c.h(r7, r6) == r0) goto L19;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0044 -> B:20:0x0047). Please report as a decompilation issue!!! */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i14;
            int i15;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f19281b;
            if (i16 == 0) {
                r.b(obj);
                i14 = 0;
                if (i14 < 96) {
                    return Unit.INSTANCE;
                }
                this.f19280a = i14;
                this.f19281b = 1;
                if (m0.b(31L, this) != aVar) {
                    i15 = i14;
                    aq2.l.c cVar = new aq2.l.c(i15);
                    this.f19280a = i15;
                    this.f19281b = 2;
                }
                return aVar;
            }
            if (i16 == 1) {
                i15 = this.f19280a;
                r.b(obj);
                aq2.l.c cVar2 = new aq2.l.c(i15);
                this.f19280a = i15;
                this.f19281b = 2;
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i15 = this.f19280a;
                r.b(obj);
            }
            i14 = i15 + 1;
            if (i14 < 96) {
                return Unit.INSTANCE;
            }
            this.f19280a = i14;
            this.f19281b = 1;
            if (m0.b(31L, this) != aVar) {
                i15 = i14;
                aq2.l.c cVar3 = new aq2.l.c(i15);
                this.f19280a = i15;
                this.f19281b = 2;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f19279f = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f19279f, dVar);
        kVar.f19278e = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super aq2.l<? extends Unit>> tVar, t13.d<? super Unit> dVar) {
        return ((k) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [o53.c2, o53.l1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14, types: [o53.l1] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [o53.l1] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5, types: [o53.l1] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [o53.l1] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [o53.l1] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        ?? r14;
        ?? r15;
        Object obj2;
        int i14;
        aq2.l.d dVar;
        ?? r16;
        ?? r17;
        Throwable thB;
        aq2.l.a aVar;
        ?? r18;
        ?? r19;
        t tVar = (t) this.f19278e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        ?? T = this.f19277d;
        try {
            if (T == 0) {
                r.b(obj);
                T = ge1.b.T(tVar, null, null, new a(tVar, null), 3);
                e eVar = this.f19279f;
                int i15 = q.f128596b;
                this.f19278e = tVar;
                this.f19274a = T;
                this.f19275b = null;
                this.f19276c = 0;
                this.f19277d = 1;
                e.a aVar3 = e.f19250d;
                eVar.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a.plus(ge1.b.h()), new l(eVar, null), this);
                if (objE0 != aVar2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == aVar2) {
                }
                return aVar2;
            }
            if (T == 1) {
                T = this.f19274a;
                r.b(obj);
            } else {
                if (T == 2) {
                    int i16 = this.f19276c;
                    Object obj3 = this.f19275b;
                    l1 l1Var = this.f19274a;
                    r.b(obj);
                    i14 = i16;
                    obj2 = obj3;
                    r15 = l1Var;
                    dVar = new aq2.l.d(Unit.INSTANCE);
                    this.f19278e = tVar;
                    this.f19274a = r15;
                    this.f19275b = obj2;
                    this.f19276c = i14;
                    this.f19277d = 3;
                    if (tVar.h(dVar, this) != aVar2) {
                        r16 = r15;
                        bVar = obj2;
                        r17 = r16;
                        thB = q.b(bVar);
                        r19 = r17;
                        if (thB != null) {
                            aVar = new aq2.l.a(thB);
                            this.f19278e = tVar;
                            this.f19274a = r17;
                            this.f19275b = bVar;
                            this.f19276c = 0;
                            this.f19277d = 4;
                            if (tVar.h(aVar, this) != aVar2) {
                                r18 = r17;
                            }
                        }
                        r19.c(null);
                        tVar.q(null);
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                }
                if (T == 3) {
                    obj2 = this.f19275b;
                    l1 l1Var2 = this.f19274a;
                    r.b(obj);
                    r16 = l1Var2;
                    bVar = obj2;
                    r17 = r16;
                    thB = q.b(bVar);
                    r19 = r17;
                    if (thB != null) {
                        aVar = new aq2.l.a(thB);
                        this.f19278e = tVar;
                        this.f19274a = r17;
                        this.f19275b = bVar;
                        this.f19276c = 0;
                        this.f19277d = 4;
                        if (tVar.h(aVar, this) != aVar2) {
                            r18 = r17;
                        }
                        return aVar2;
                    }
                    r19.c(null);
                    tVar.q(null);
                    return Unit.INSTANCE;
                }
                if (T != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l1 l1Var3 = this.f19274a;
                r.b(obj);
                r18 = l1Var3;
            }
            r19 = r18;
            r19.c(null);
            tVar.q(null);
            return Unit.INSTANCE;
            bVar = Unit.INSTANCE;
            int i17 = q.f128596b;
            r14 = T;
        } catch (Throwable th3) {
            int i18 = q.f128596b;
            bVar = new q.b(th3);
            r14 = T;
        }
        r17 = r14;
        if (bVar instanceof q.b) {
            thB = q.b(bVar);
            r19 = r17;
            if (thB != null) {
                aVar = new aq2.l.a(thB);
                this.f19278e = tVar;
                this.f19274a = r17;
                this.f19275b = bVar;
                this.f19276c = 0;
                this.f19277d = 4;
                if (tVar.h(aVar, this) != aVar2) {
                    r18 = r17;
                    r19 = r18;
                }
            }
            r19.c(null);
            tVar.q(null);
            return Unit.INSTANCE;
        }
        aq2.l.c cVar2 = new aq2.l.c(100);
        this.f19278e = tVar;
        this.f19274a = r14;
        this.f19275b = bVar;
        this.f19276c = 0;
        this.f19277d = 2;
        if (tVar.h(cVar2, this) != aVar2) {
            r15 = r14;
            obj2 = bVar;
            i14 = 0;
            dVar = new aq2.l.d(Unit.INSTANCE);
            this.f19278e = tVar;
            this.f19274a = r15;
            this.f19275b = obj2;
            this.f19276c = i14;
            this.f19277d = 3;
            if (tVar.h(dVar, this) != aVar2) {
                r16 = r15;
                bVar = obj2;
                r17 = r16;
                thB = q.b(bVar);
                r19 = r17;
                if (thB != null) {
                    aVar = new aq2.l.a(thB);
                    this.f19278e = tVar;
                    this.f19274a = r17;
                    this.f19275b = bVar;
                    this.f19276c = 0;
                    this.f19277d = 4;
                    if (tVar.h(aVar, this) != aVar2) {
                        r18 = r17;
                        r19 = r18;
                    }
                }
                r19.c(null);
                tVar.q(null);
                return Unit.INSTANCE;
            }
        }
        return aVar2;
    }
}
