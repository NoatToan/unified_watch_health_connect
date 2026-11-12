package f12;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lf12/w;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.user.OptionalFeatureRepositoryImpl$setOptionalFeature$2", f = "OptionalFeatureRepositoryImpl.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super a0<w>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f68095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f68096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f68097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, s sVar, v vVar, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f68095b = rVar;
        this.f68096c = sVar;
        this.f68097d = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f68095b, this.f68096c, this.f68097d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<w>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68094a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<w>> i0VarA = this.f68095b.f68098a.a(this.f68096c.f68101a, this.f68097d.f68118a);
        this.f68094a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
