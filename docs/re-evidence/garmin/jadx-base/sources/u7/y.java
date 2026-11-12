package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "Lo13/p;", "Lu7/r1;", "<anonymous>", "(Z)Lo13/p;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
public final class y extends v13.i implements e23.p<Boolean, t13.d<? super o13.p<? extends r1<Object>, ? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f169367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f169369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f169371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m<Object> mVar, int i14, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f169370d = mVar;
        this.f169371e = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y yVar = new y(this.f169370d, this.f169371e, dVar);
        yVar.f169369c = ((Boolean) obj).booleanValue();
        return yVar;
    }

    @Override // e23.p
    public final Object invoke(Boolean bool, t13.d<? super o13.p<? extends r1<Object>, ? extends Boolean>> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((y) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Throwable th3;
        int iIntValue;
        ?? r14;
        ?? r15;
        r1 r1Var;
        ?? r16;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r17 = this.f169368b;
        m<Object> mVar = this.f169370d;
        try {
            if (r17 == 0) {
                o13.r.b(obj);
                boolean z14 = this.f169369c;
                this.f169369c = z14;
                this.f169368b = 1;
                obj = m.f(mVar, z14, this);
                r17 = z14;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (r17 != 1) {
                    if (r17 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z15 = this.f169369c;
                    th3 = this.f169367a;
                    o13.r.b(obj);
                    r15 = z15;
                    iIntValue = ((Number) obj).intValue();
                    r14 = r15;
                    g1 g1Var = new g1(th3, iIntValue);
                    r16 = r14;
                    r1Var = g1Var;
                    return new o13.p(r1Var, Boolean.valueOf((boolean) r16));
                }
                boolean z16 = this.f169369c;
                o13.r.b(obj);
                r17 = z16;
            }
            r1Var = (r1) obj;
            r16 = r17;
        } catch (Throwable th4) {
            if (r17 != 0) {
                int i14 = m.f169187m;
                t0 t0VarG = mVar.g();
                this.f169367a = th4;
                this.f169369c = r17;
                this.f169368b = 2;
                Object objE = t0VarG.e(this);
                if (objE != aVar) {
                    r15 = r17;
                    th3 = th4;
                    obj = objE;
                }
                return aVar;
            }
            ?? r18 = r17;
            th3 = th4;
            iIntValue = this.f169371e;
            r14 = r18 == true ? 1 : 0;
        }
        return new o13.p(r1Var, Boolean.valueOf((boolean) r16));
    }
}
