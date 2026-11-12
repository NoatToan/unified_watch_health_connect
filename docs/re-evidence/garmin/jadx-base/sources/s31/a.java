package s31;

import e23.p;
import i31.e0;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.onboarding.presentation.stateholder.OnboardingStateHolder$dismissOnboardingItem$1", f = "OnboardingStateHolder.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f156446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f156447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f156448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d31.d f156449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, long j8, d31.d dVar, d<? super a> dVar2) {
        super(2, dVar2);
        this.f156447b = cVar;
        this.f156448c = j8;
        this.f156449d = dVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f156447b, this.f156448c, this.f156449d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f156446a;
        if (i14 == 0) {
            r.b(obj);
            e0 e0Var = this.f156447b.f156454b;
            d31.c cVar = d31.c.IGNORED;
            this.f156446a = 1;
            if (e0Var.a(this.f156448c, this.f156449d, cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ((q) obj).getClass();
        }
        return Unit.INSTANCE;
    }
}
