package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lu7/y1;", "", "<anonymous>", "(Lu7/y1;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
public final class g0 extends v13.i implements e23.p<y1<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.p0 f169136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.p0 f169139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f169141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f169142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p005kotlin.jvm.internal.p0 p0Var, m<Object> mVar, Object obj, boolean z14, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f169139d = p0Var;
        this.f169140e = mVar;
        this.f169141f = obj;
        this.f169142g = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f169139d, this.f169140e, this.f169141f, this.f169142g, dVar);
        g0Var.f169138c = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(y1<Object> y1Var, t13.d<? super Unit> dVar) {
        return ((g0) create(y1Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r7.b(r3, r8) == r0) goto L16;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y1 y1Var;
        p005kotlin.jvm.internal.p0 p0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169137b;
        Object obj2 = this.f169141f;
        m<Object> mVar = this.f169140e;
        p005kotlin.jvm.internal.p0 p0Var2 = this.f169139d;
        if (i14 != 0) {
            if (i14 == 1) {
                p0Var = this.f169136a;
                y1Var = (y1) this.f169138c;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (this.f169142g) {
                mVar.f169195h.b(new e(obj2, obj2 != null ? obj2.hashCode() : 0, p0Var2.f105807a));
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        y1 y1Var2 = (y1) this.f169138c;
        int i15 = m.f169187m;
        t0 t0VarG = mVar.g();
        this.f169138c = y1Var2;
        this.f169136a = p0Var2;
        this.f169137b = 1;
        Object objB = t0VarG.b(this);
        if (objB != aVar) {
            y1Var = y1Var2;
            obj = objB;
            p0Var = p0Var2;
        }
        return aVar;
        p0Var.f105807a = ((Number) obj).intValue();
        this.f169138c = null;
        this.f169136a = null;
        this.f169137b = 2;
    }
}
