package og2;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f0<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f132034a;

    public f0(v vVar) {
        this.f132034a = vVar;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        Object objA;
        v vVar = this.f132034a;
        pg2.a aVar = (pg2.a) ((Map) obj).get(vVar.f132106a);
        return (aVar == null || (objA = v.a(vVar, aVar, dVar)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objA;
    }
}
