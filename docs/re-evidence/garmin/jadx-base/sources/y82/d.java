package y82;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"ValueType", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.ui.patterns.reports.repository.ReportsPageRequestRepository$getPageData$2", f = "ReportsPageRequestRepository.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e<Object, Object> f195237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f195238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e<Object, Object> eVar, Object obj, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f195237b = eVar;
        this.f195238c = obj;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f195237b, this.f195238c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195236a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        p<Object, t13.d<? super Object>, Object> pVar = this.f195237b.f195239a.f195235a;
        this.f195236a = 1;
        Object objInvoke = pVar.invoke(this.f195238c, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
