package cz2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@v13.e(c = "com.garmin.util.coroutines.Monitor$run$result$1", f = "Monitor.kt", l = {52}, m = "invokeSuspend")
public final class f extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g<Object> f56896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g<Object> gVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f56896b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f56896b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56895a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.s sVar = this.f56896b.f56901e;
        this.f56895a = 1;
        Object objC = sVar.C(this);
        return objC == aVar ? aVar : objC;
    }
}
