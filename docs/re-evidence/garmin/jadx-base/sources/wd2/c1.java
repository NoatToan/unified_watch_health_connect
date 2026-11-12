package wd2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$updateLivetrackSession$2$1", f = "LivetrackService.kt", l = {425}, m = "invokeSuspend", v = 2)
public final class c1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe2.p1 f184407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f184408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(fe2.p1 p1Var, String str, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f184407b = p1Var;
        this.f184408c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c1(this.f184407b, this.f184408c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184406a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f184406a = 1;
            if (this.f184407b.e(this.f184408c, this) == aVar) {
                return aVar;
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
