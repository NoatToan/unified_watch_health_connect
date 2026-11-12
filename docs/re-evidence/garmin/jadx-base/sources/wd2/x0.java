package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$stopLivetrackSession$1", f = "LivetrackService.kt", l = {192}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f184666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2 f184667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(LivetrackService livetrackService, long j8, c2 c2Var, t13.d<? super x0> dVar) {
        super(2, dVar);
        this.f184665b = livetrackService;
        this.f184666c = j8;
        this.f184667d = c2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x0(this.f184665b, this.f184666c, this.f184667d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184664a;
        if (i14 == 0) {
            o13.r.b(obj);
            fe2.p1 p1Var = this.f184665b.f50167g.get(this.f184666c);
            if (p1Var != null) {
                fe2.v1.b bVarE = xd2.a.e(this.f184667d);
                this.f184664a = 1;
                if (p1Var.p(bVarE, this) == aVar) {
                    return aVar;
                }
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
