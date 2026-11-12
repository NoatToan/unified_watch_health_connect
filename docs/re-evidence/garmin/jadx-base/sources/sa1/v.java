package sa1;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lab1/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.PowerGuideRepo$updatePowerGuideStrategy$2", f = "PowerGuideRepo.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.l<t13.d<? super c83.a0<ab1.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f158310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f158311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab1.d f158312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(m mVar, long j8, ab1.d dVar, t13.d<? super v> dVar2) {
        super(1, dVar2);
        this.f158310b = mVar;
        this.f158311c = j8;
        this.f158312d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v(this.f158310b, this.f158311c, this.f158312d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ab1.d>> dVar) {
        return ((v) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158309a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<ab1.d>> i0VarE = this.f158310b.f158285a.e(this.f158311c, this.f158312d);
        this.f158309a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
