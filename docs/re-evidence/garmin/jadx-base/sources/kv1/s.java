package kv1;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.FBTPlansRepo$updateTrainingLevel$2", f = "FBTPlansRepo.kt", l = {142}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f106792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tw1.l f106793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b bVar, long j8, tw1.l lVar, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f106791b = bVar;
        this.f106792c = j8;
        this.f106793d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f106791b, this.f106792c, this.f106793d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106790a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<Unit>> i0VarE = this.f106791b.f106720a.e(this.f106792c, this.f106793d);
        this.f106790a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
