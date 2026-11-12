package li0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowItemViewKt$SuggestedFollowItemViewDismissed$1$1", f = "FollowItemView.kt", l = {535}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f112768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f112769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(f fVar, d0 d0Var, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f112768b = fVar;
        this.f112769c = d0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f112768b, this.f112769c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112767a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f112767a = 1;
            if (o53.m0.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f112768b.f(this.f112769c.f112650c);
        return Unit.INSTANCE;
    }
}
