package z70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.data.DefaultPromosPreferences$getShouldIgnoreSubscriptionValidator$1", f = "PromosPreferences.kt", l = {192}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<q53.t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f202818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f202819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f202820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f202820c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f202820c, dVar);
        gVar.f202819b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((g) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f202819b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f202818a;
        if (i14 == 0) {
            o13.r.b(obj);
            d dVar = this.f202820c;
            tVar.i(Boolean.valueOf(dVar.a()));
            e eVar = new e(dVar, tVar, 1);
            dVar.f202789b.registerOnSharedPreferenceChangeListener(eVar);
            z10.d dVar2 = new z10.d(7, dVar, eVar);
            this.f202819b = null;
            this.f202818a = 1;
            if (q53.r.a(tVar, dVar2, this) == aVar) {
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
