package vo1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lyo1/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getSocialGroupRideResultsAsync$2", f = "SocialGroupRideRepo.kt", l = {51}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super a0<yo1.j>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f179096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f179097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f179098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f179099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c cVar, String str, String str2, Long l14, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f179096b = cVar;
        this.f179097c = str;
        this.f179098d = str2;
        this.f179099e = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f179096b, this.f179097c, this.f179098d, this.f179099e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<yo1.j>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179095a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<yo1.j>> i0VarC = this.f179096b.f179029a.c(this.f179097c, this.f179098d, this.f179099e);
        this.f179095a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
