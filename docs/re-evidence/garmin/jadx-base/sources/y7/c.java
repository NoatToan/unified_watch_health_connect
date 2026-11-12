package y7;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly7/g;", "it", "<anonymous>", "(Ly7/g;)Ly7/g;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
public final class c extends v13.i implements p<g, t13.d<? super g>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f194630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<g, t13.d<? super g>, Object> f194631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p<? super g, ? super t13.d<? super g>, ? extends Object> pVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f194631c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f194631c, dVar);
        cVar.f194630b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(g gVar, t13.d<? super g> dVar) {
        return ((c) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f194629a;
        if (i14 == 0) {
            r.b(obj);
            g gVar = (g) this.f194630b;
            this.f194629a = 1;
            obj = this.f194631c.invoke(gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        g gVar2 = (g) obj;
        gVar2.getClass();
        ((b) gVar2).f194627b.f194625a.set(true);
        return gVar2;
    }
}
