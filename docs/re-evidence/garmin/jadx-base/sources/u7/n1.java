package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
public final class n1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.p f169249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1<Object> f169251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(m1<Object> m1Var, t13.d<? super n1> dVar) {
        super(2, dVar);
        this.f169251c = m1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n1(this.f169251c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044 A[PHI: r1 r7
      0x0044: PHI (r1v1 e23.p<java.lang.Object, t13.d<? super kotlin.Unit>, java.lang.Object>) = 
      (r1v2 e23.p<java.lang.Object, t13.d<? super kotlin.Unit>, java.lang.Object>)
      (r1v3 e23.p<java.lang.Object, t13.d<? super kotlin.Unit>, java.lang.Object>)
     binds: [B:14:0x0041, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r7v6 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:14:0x0041, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:19:0x0050). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e23.p<Object, t13.d<? super Unit>, Object> pVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169250b;
        m1<Object> m1Var = this.f169251c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (m1Var.f169234d.f169086a.get() <= 0) {
                vb.h.z("Check failed.");
                return null;
            }
            g8.i.v(m1Var.f169231a.getF195311f());
            pVar = m1Var.f169232b;
            q53.b bVar = m1Var.f169233c;
            this.f169249a = pVar;
            this.f169250b = 1;
            obj = bVar.g(this);
            if (obj != aVar) {
                this.f169249a = null;
                this.f169250b = 2;
            }
            return aVar;
        }
        if (i14 == 1) {
            pVar = this.f169249a;
            o13.r.b(obj);
            this.f169249a = null;
            this.f169250b = 2;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (m1Var.f169234d.f169086a.decrementAndGet() == 0) {
            return Unit.INSTANCE;
        }
        g8.i.v(m1Var.f169231a.getF195311f());
        pVar = m1Var.f169232b;
        q53.b bVar2 = m1Var.f169233c;
        this.f169249a = pVar;
        this.f169250b = 1;
        obj = bVar2.g(this);
        if (obj != aVar) {
            this.f169249a = null;
            this.f169250b = 2;
        }
        return aVar;
    }
}
