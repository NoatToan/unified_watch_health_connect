package w11;

import androidx.lifecycle.n0;
import j0.u;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.screen.ImageRecognitionAndBarcodeScannerScreenKt$FoodAndBarcodeTabs$3$1", f = "ImageRecognitionAndBarcodeScannerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1.d f181223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f181224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j1.d dVar, n0 n0Var, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f181223a = dVar;
        this.f181224b = n0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f181223a, this.f181224b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        j1.d dVar = this.f181223a;
        dVar.getClass();
        u.a();
        dVar.G = this.f181224b;
        dVar.p(null);
        return Unit.INSTANCE;
    }
}
