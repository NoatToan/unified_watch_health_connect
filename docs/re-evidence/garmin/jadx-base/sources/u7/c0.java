package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "Lu7/r1;", "<anonymous>", "(Lo53/b0;)Lu7/r1;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super r1<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f169101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(m<Object> mVar, boolean z14, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f169100b = mVar;
        this.f169101c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f169100b, this.f169101c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super r1<Object>> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169099a;
        m<Object> mVar = this.f169100b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                if (mVar.f169195h.a() instanceof r0) {
                    return mVar.f169195h.a();
                }
                this.f169099a = 1;
                if (mVar.h(this) != aVar) {
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
            return (r1) obj;
            this.f169099a = 2;
            obj = m.e(mVar, this.f169101c, this);
        } catch (Throwable th3) {
            return new g1(th3, -1);
        }
    }
}
