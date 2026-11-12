package zd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager$dismissPromo$1", f = "PromosProvider.kt", l = {630}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c80.y0 f204206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f204207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c80.s0 f204208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f204209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f204210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c80.y0 y0Var, u0 u0Var, c80.s0 s0Var, boolean z14, boolean z15, t13.d<? super y0> dVar) {
        super(2, dVar);
        this.f204206b = y0Var;
        this.f204207c = u0Var;
        this.f204208d = s0Var;
        this.f204209e = z14;
        this.f204210f = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y0(this.f204206b, this.f204207c, this.f204208d, this.f204209e, this.f204210f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204205a;
        if (i14 == 0) {
            o13.r.b(obj);
            c80.y0 y0Var = this.f204206b;
            String str = y0Var.f25637a;
            c80.w0 w0Var = y0Var.f25649m;
            this.f204205a = 1;
            if (u0.B(this.f204207c, str, this.f204208d, w0Var, this.f204209e, this.f204210f, null, this, 32) == aVar) {
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
