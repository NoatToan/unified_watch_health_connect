package sf;

import coil3.network.HttpException;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"T", "Lsf/p;", "response", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<p, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f158793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p, t13.d<Object>, Object> f158794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(e23.p<? super p, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f158794c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f158794c, dVar);
        jVar.f158793b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(p pVar, t13.d<Object> dVar) {
        return ((j) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p pVar = (p) this.f158793b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158792a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        int i15 = pVar.f158814a;
        if ((200 > i15 || i15 >= 300) && i15 != 304) {
            throw new HttpException(pVar);
        }
        this.f158793b = null;
        this.f158792a = 1;
        Object objInvoke = this.f158794c.invoke(pVar, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
