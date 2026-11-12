package u7;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu7/s0;", "api", "", "<anonymous>", "(Lu7/s0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<s0<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f169134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<f<Object>> f169135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends f<Object>> list, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f169135c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f169135c, dVar);
        gVar.f169134b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(s0<Object> s0Var, t13.d<? super Unit> dVar) {
        return ((g) create(s0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169133a;
        if (i14 == 0) {
            o13.r.b(obj);
            s0 s0Var = (s0) this.f169134b;
            j.a aVar2 = j.f169169a;
            this.f169133a = 1;
            if (j.a.a(aVar2, this.f169135c, s0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
