package z10;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ConsentViewModel$updateDeviceUploadConsent$1", f = "ConsentViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f201152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f201153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<Boolean> f201154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(boolean z14, boolean z15, androidx.lifecycle.y0<Boolean> y0Var, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f201152b = z14;
        this.f201153c = z15;
        this.f201154d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m1(this.f201152b, this.f201153c, this.f201154d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201151a;
        if (i14 == 0) {
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            this.f201151a = 1;
            obj = oVar.A(this.f201152b, this.f201153c, this);
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
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            this.f201154d.m(bool);
            ((bv.a) KoinJavaComponent.get$default(bv.a.class, null, null, 6, null)).a(zBooleanValue);
        }
        return Unit.INSTANCE;
    }
}
