package sa1;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.PowerGuideRepo$createStrategyDeviceMessage$2", f = "PowerGuideRepo.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f158290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f158291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f158292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, long j8, long j14, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f158290b = mVar;
        this.f158291c = j8;
        this.f158292d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f158290b, this.f158291c, this.f158292d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158289a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<Unit>> i0VarF = this.f158290b.f158285a.f(this.f158291c, this.f158292d);
        this.f158289a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
