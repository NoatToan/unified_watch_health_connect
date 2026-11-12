package tj1;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltj1/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.network.EccRepository$getCountriesInfo$2", f = "EccRepository.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super a0<g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f165145b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f165145b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f165145b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<g>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f165144a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<g>> i0VarA = this.f165145b.f165143a.a("AssistancePlus");
        this.f165144a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
