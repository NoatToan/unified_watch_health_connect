package ew0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingOnboardingViewModel$setOnboardingCompleted$2", f = "LifestyleLoggingOnboardingViewModel.kt", l = {197}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f66267b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f66267b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f66267b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Boolean>> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f66266a;
        m mVar = this.f66267b;
        if (i14 == 0) {
            o13.r.b(obj);
            rv0.a aVar2 = mVar.f66240g;
            this.f66266a = 1;
            obj = aVar2.h(this);
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            mVar.f66239f.s();
        }
        return v2Var;
    }
}
