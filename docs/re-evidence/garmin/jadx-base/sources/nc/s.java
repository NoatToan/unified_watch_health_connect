package nc;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.z1;
import s1.a1;
import s1.b2;
import s1.t1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {644, 651}, m = "invokeSuspend")
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1<lc.v> f125334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.v f125335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1<lc.v> f125336e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {659, 663}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f125338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a1<lc.v> f125339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lc.v f125340d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f14, a1<lc.v> a1Var, lc.v vVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f125338b = f14;
            this.f125339c = a1Var;
            this.f125340d = vVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f125338b, this.f125339c, this.f125340d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        
            if (r2.q(r7.f125340d, r7) == r0) goto L19;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125337a;
            a1<lc.v> a1Var = this.f125339c;
            float f14 = this.f125338b;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            if (f14 > 0.0f) {
                this.f125337a = 1;
                if (a1Var.n(f14, a1Var.f155462b.getF182175a(), this) != aVar) {
                }
                return aVar;
            }
            if (f14 == 0.0f) {
                this.f125337a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a1<lc.v> a1Var, lc.v vVar, t1<lc.v> t1Var, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f125334c = a1Var;
        this.f125335d = vVar;
        this.f125336e = t1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f125334c, this.f125335d, this.f125336e, dVar);
        sVar.f125333b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (s1.a1.k(r1, r6, r13) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (s1.q1.c(r7, 0.0f, r9, r10, r13, 4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125332a;
        if (i14 == 0) {
            o13.r.b(obj);
            b0 b0Var = (b0) this.f125333b;
            a1<lc.v> a1Var = this.f125334c;
            c2 c2Var = a1Var.f155463c;
            z1 z1Var = a1Var.f155468h;
            T f182175a = c2Var.getF182175a();
            lc.v vVar = this.f125335d;
            if (p005kotlin.jvm.internal.s.g(f182175a, vVar)) {
                long jG = this.f125336e.g() / ((long) 1000000);
                float floatValue = z1Var.getFloatValue();
                b2 b2VarD = s1.l.d((int) (z1Var.getFloatValue() * jG), 0, null, 6);
                mw1.b bVar = new mw1.b(b0Var, 8, a1Var, vVar);
                this.f125332a = 2;
            } else {
                this.f125332a = 1;
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
