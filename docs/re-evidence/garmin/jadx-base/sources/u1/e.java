package u1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1750, 1752, 1759, 1760, 1770}, m = "invokeSuspend", v = 1)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f167442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f167443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f167444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p008y1.c2 f167445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f167446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2.j f167447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f167448g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1744, 1747}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a2.l.b f167449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f167450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f167451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f167452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a2.j f167453e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, a2.j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f167451c = bVar;
            this.f167452d = j8;
            this.f167453e = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f167451c, this.f167452d, this.f167453e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a2.l.b bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167450b;
            b bVar2 = this.f167451c;
            if (i14 == 0) {
                o13.r.b(obj);
                b.C3147b c3147b = b.f167347z;
                if (bVar2.Z1()) {
                    long j8 = z.f167723a;
                    this.f167450b = 1;
                    if (o53.m0.b(j8, this) != aVar) {
                    }
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
                bVar = this.f167449a;
                o13.r.b(obj);
            }
            bVar2.f167359n = bVar;
            return Unit.INSTANCE;
            a2.l.b bVar3 = new a2.l.b(this.f167452d, null);
            this.f167449a = bVar3;
            this.f167450b = 2;
            if (this.f167453e.b(bVar3, this) != aVar) {
                bVar = bVar3;
                bVar2.f167359n = bVar;
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p008y1.c2 c2Var, long j8, a2.j jVar, b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f167445d = c2Var;
        this.f167446e = j8;
        this.f167447f = jVar;
        this.f167448g = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f167445d, this.f167446e, this.f167447f, this.f167448g, dVar);
        eVar.f167444c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r9.b(r2, r17) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (r9.b(r5, r17) == r1) goto L40;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.l1 l1VarT;
        Object objC;
        boolean z14;
        a2.l.b bVar;
        a2.l.c cVar;
        a2.l.c cVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167443b;
        b bVar2 = this.f167448g;
        a2.j jVar = this.f167447f;
        if (i14 == 0) {
            o13.r.b(obj);
            l1VarT = ge1.b.T((o53.b0) this.f167444c, null, null, new a(this.f167448g, this.f167446e, this.f167447f, null), 3);
            this.f167444c = l1VarT;
            this.f167443b = 1;
            objC = this.f167445d.C(this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            l1VarT = (o53.l1) this.f167444c;
            o13.r.b(obj);
            objC = obj;
        } else if (i14 == 2) {
            z14 = this.f167442a;
            o13.r.b(obj);
            if (z14) {
                bVar = new a2.l.b(this.f167446e, null);
                cVar = new a2.l.c(bVar);
                this.f167444c = cVar;
                this.f167443b = 3;
                if (jVar.b(bVar, this) != aVar) {
                    cVar2 = cVar;
                    this.f167444c = null;
                    this.f167443b = 4;
                }
                return aVar;
            }
        } else if (i14 == 3) {
            cVar2 = (a2.l.c) this.f167444c;
            o13.r.b(obj);
            this.f167444c = null;
            this.f167443b = 4;
        } else {
            if (i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        bVar2.f167359n = null;
        return Unit.INSTANCE;
        boolean zBooleanValue = ((Boolean) objC).booleanValue();
        if (!l1VarT.isActive()) {
            a2.l.b bVar3 = bVar2.f167359n;
            if (bVar3 != null) {
                a2.h cVar3 = zBooleanValue ? new a2.l.c(bVar3) : new a2.l.a(bVar3);
                this.f167444c = null;
                this.f167443b = 5;
            }
            bVar2.f167359n = null;
            return Unit.INSTANCE;
        }
        this.f167444c = null;
        this.f167442a = zBooleanValue;
        this.f167443b = 2;
        if (g8.i.r(l1VarT, this) != aVar) {
            z14 = zBooleanValue;
            if (z14) {
                bVar = new a2.l.b(this.f167446e, null);
                cVar = new a2.l.c(bVar);
                this.f167444c = cVar;
                this.f167443b = 3;
                if (jVar.b(bVar, this) != aVar) {
                    cVar2 = cVar;
                    this.f167444c = null;
                    this.f167443b = 4;
                }
            }
            bVar2.f167359n = null;
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
