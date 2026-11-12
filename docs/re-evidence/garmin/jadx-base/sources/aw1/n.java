package aw1;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$checkGCPlusSubscription$1", f = "FBTPlanWizardViewModel.kt", l = {548}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f13510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f13512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h hVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f13512c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f13512c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p2 p2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13511b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var2 = this.f13512c.f13392y1;
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            this.f13510a = p2Var2;
            this.f13511b = 1;
            Object objI = j1Var.i(this);
            if (objI == aVar) {
                return aVar;
            }
            p2Var = p2Var2;
            obj = objI;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p2Var = this.f13510a;
            o13.r.b(obj);
        }
        p2Var.setValue(Boolean.valueOf(obj instanceof c80.s.a));
        return Unit.INSTANCE;
    }
}
