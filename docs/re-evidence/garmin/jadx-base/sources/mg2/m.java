package mg2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.composable.DeviceAlertSnackbarHostKt$animatedScale$1$1", f = "DeviceAlertSnackbarHost.kt", l = {324}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b<Float, s1.n> f118409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f118410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f118411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s1.b<Float, s1.n> bVar, boolean z14, s1.k<Float> kVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f118409b = bVar;
        this.f118410c = z14;
        this.f118411d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f118409b, this.f118410c, this.f118411d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118408a;
        if (i14 == 0) {
            o13.r.b(obj);
            Float f14 = new Float(this.f118410c ? 1.0f : 0.8f);
            this.f118408a = 1;
            if (s1.b.c(this.f118409b, f14, this.f118411d, null, this, 12) == aVar) {
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
