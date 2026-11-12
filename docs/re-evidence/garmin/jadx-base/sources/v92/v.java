package v92;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$confirmDataDeletion$1", f = "ConsentViewModel.kt", l = {466}, m = "invokeSuspend")
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f176531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f176532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f176533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q92.x f176534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s92.g f176535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r rVar, String str, q92.x xVar, s92.g gVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f176532b = rVar;
        this.f176533c = str;
        this.f176534d = xVar;
        this.f176535e = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f176532b, this.f176533c, this.f176534d, this.f176535e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176531a;
        r rVar = this.f176532b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f176531a = 1;
            obj = r.y4(rVar, this.f176533c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        d0 d0Var = (d0) obj;
        if (d0Var instanceof d0.d) {
            r.z4(rVar, this.f176534d, this.f176535e, ((d0.d) d0Var).f176342a);
        } else {
            rVar.f176472g.m(d0Var);
        }
        return Unit.INSTANCE;
    }
}
