package z10;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentViewModel$checkExistingChildContacts$1", f = "BaseConsentViewModel.kt", l = {141}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f201167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f201168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar, long j8, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f201167b = jVar;
        this.f201168c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f201167b, this.f201168c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201166a;
        long j8 = this.f201168c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (p005kotlin.jvm.internal.s.g(((c1) this.f201167b.f201060c.getValue()).f200932c, Boolean.TRUE)) {
                bv.a aVar2 = (bv.a) KoinJavaComponent.get$default(bv.a.class, null, null, 6, null);
                this.f201166a = 1;
                obj = aVar2.d(j8, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        if (((Boolean) obj).booleanValue()) {
            f12.l.f68084a.getClass();
            f12.l.a.a().u0(j8, true);
        }
        return Unit.INSTANCE;
    }
}
