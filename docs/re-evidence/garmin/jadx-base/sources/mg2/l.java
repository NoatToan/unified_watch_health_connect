package mg2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.composable.DeviceAlertSnackbarHostKt$animatedOpacity$2$1", f = "DeviceAlertSnackbarHost.kt", l = {314}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b<Float, s1.n> f118404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f118405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f118406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f118407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s1.b<Float, s1.n> bVar, boolean z14, s1.k<Float> kVar, e23.a<Unit> aVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f118404b = bVar;
        this.f118405c = z14;
        this.f118406d = kVar;
        this.f118407e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f118404b, this.f118405c, this.f118406d, this.f118407e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118403a;
        if (i14 == 0) {
            o13.r.b(obj);
            Float f14 = new Float(this.f118405c ? 1.0f : 0.0f);
            this.f118403a = 1;
            lVar = this;
            if (s1.b.c(this.f118404b, f14, this.f118406d, null, lVar, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            lVar = this;
        }
        lVar.f118407e.invoke();
        return Unit.INSTANCE;
    }
}
