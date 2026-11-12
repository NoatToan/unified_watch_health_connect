package nk1;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lhk1/a0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.repo.ThirdPartyRepo$getUserPartnerConnection$2", f = "ThirdPartyRepo.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super a0<List<? extends hk1.a0>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f126444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g gVar, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f126444b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f126444b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends hk1.a0>>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126443a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<hk1.a0>>> i0VarF = this.f126444b.f126422a.f();
        this.f126443a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
