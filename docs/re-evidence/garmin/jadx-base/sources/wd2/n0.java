package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$getLivetrackSettings$1", f = "LivetrackService.kt", l = {283, 284}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f184535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f184536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(LivetrackService livetrackService, boolean z14, long j8, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f184534b = livetrackService;
        this.f184535c = z14;
        this.f184536d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n0(this.f184534b, this.f184535c, this.f184536d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184533a;
        LivetrackService livetrackService = this.f184534b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f184533a = 1;
            int i15 = LivetrackService.f50160k;
            if (livetrackService.d(this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        livetrackService.f50169i.n((androidx.lifecycle.s0) obj, livetrackService.f50170j);
        return Unit.INSTANCE;
        xd2.a1 a1Var = livetrackService.f50166f;
        if (a1Var == null) {
            p005kotlin.jvm.internal.s.m("repository");
            throw null;
        }
        this.f184533a = 2;
        obj = a1Var.F(this.f184536d, this, this.f184535c);
    }
}
