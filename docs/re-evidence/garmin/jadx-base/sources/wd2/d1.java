package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$updateLivetrackSettings$1", f = "LivetrackService.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "invokeSuspend", v = 2)
public final class d1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f184428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ge2.e f184429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f184430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(LivetrackService livetrackService, long j8, ge2.e eVar, l lVar, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f184427b = livetrackService;
        this.f184428c = j8;
        this.f184429d = eVar;
        this.f184430e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d1(this.f184427b, this.f184428c, this.f184429d, this.f184430e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        d1 d1Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184426a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f184426a = 1;
            d1Var = this;
            obj = this.f184427b.g(this.f184428c, this.f184429d, this.f184430e, d1Var);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            d1Var = this;
        }
        if (!((Boolean) obj).booleanValue()) {
            androidx.lifecycle.w0<ge2.e> w0Var = d1Var.f184427b.f50169i;
            w0Var.m(w0Var.d());
        }
        return Unit.INSTANCE;
    }
}
