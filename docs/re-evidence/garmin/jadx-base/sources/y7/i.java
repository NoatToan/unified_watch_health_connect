package y7;

import e23.p;
import java.util.LinkedHashMap;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly7/g;", "it", "<anonymous>", "(Ly7/g;)Ly7/g;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
public final class i extends v13.i implements p<g, t13.d<? super g>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f194641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<b, t13.d<? super Unit>, Object> f194642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(p<? super b, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f194642c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f194642c, dVar);
        iVar.f194641b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(g gVar, t13.d<? super g> dVar) {
        return ((i) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f194640a;
        if (i14 == 0) {
            r.b(obj);
            b bVar = new b(new LinkedHashMap(((g) this.f194641b).a()), false);
            this.f194641b = bVar;
            this.f194640a = 1;
            return this.f194642c.invoke(bVar, this) == aVar ? aVar : bVar;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b bVar2 = (b) this.f194641b;
        r.b(obj);
        return bVar2;
    }
}
