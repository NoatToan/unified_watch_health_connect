package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$handleGrouptrackGetMessagesRequest$1", f = "LivetrackService.kt", l = {377}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f184579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f184581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f184582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(LivetrackService livetrackService, long j8, int i14, String str, long j14, t13.d<? super q0> dVar) {
        super(2, dVar);
        this.f184578b = livetrackService;
        this.f184579c = j8;
        this.f184580d = i14;
        this.f184581e = str;
        this.f184582f = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q0(this.f184578b, this.f184579c, this.f184580d, this.f184581e, this.f184582f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184577a;
        if (i14 == 0) {
            o13.r.b(obj);
            fe2.p1 p1Var = this.f184578b.f50167g.get(this.f184579c);
            if (p1Var != null) {
                this.f184577a = 1;
                if (p1Var.i(this.f184580d, this.f184579c, this.f184581e, this.f184582f, this) == aVar) {
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
