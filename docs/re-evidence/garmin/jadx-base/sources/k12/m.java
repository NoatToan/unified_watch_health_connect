package k12;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo$editWheelchairPushLength$2", f = "UsersRepo.kt", l = {230}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wi1.i f102355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d dVar, wi1.i iVar, t13.d<? super m> dVar2) {
        super(1, dVar2);
        this.f102354b = dVar;
        this.f102355c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f102354b, this.f102355c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102353a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<Unit>> i0VarQ = this.f102354b.f102316a.q(this.f102355c);
        this.f102353a = 1;
        Object objAwait = i0VarQ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
