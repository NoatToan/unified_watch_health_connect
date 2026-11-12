package w11;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.screen.ImageRecognitionAndBarcodeScannerScreenKt$FoodAndBarcodeTabs$2$1", f = "ImageRecognitionAndBarcodeScannerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f181220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1.d f181221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<Integer> f181222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z14, j1.d dVar, x3<Integer> x3Var, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f181220a = z14;
        this.f181221b = dVar;
        this.f181222c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f181220a, this.f181221b, this.f181222c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Integer f182175a;
        Integer f182175a2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        j1.d dVar = this.f181221b;
        x3<Integer> x3Var = this.f181222c;
        boolean z14 = this.f181220a;
        if (z14 && (f182175a2 = x3Var.getF182175a()) != null && f182175a2.intValue() == 0) {
            dVar.g(true);
        } else if (!z14 && (f182175a = x3Var.getF182175a()) != null && f182175a.intValue() == 1) {
            dVar.g(false);
        }
        return Unit.INSTANCE;
    }
}
