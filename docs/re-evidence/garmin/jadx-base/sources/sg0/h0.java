package sg0;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageChildViewModel$checkPrivacyPolicy$1", f = "ManageChildViewModel.kt", l = {254}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f159096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f0 f0Var, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f159096b = f0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f159096b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long userId;
        String str;
        Object objM;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159095a;
        f0 f0Var = this.f159096b;
        if (i14 == 0) {
            o13.r.b(obj);
            ue0.l lVar = ((u) f0Var.f159087f.getValue()).f159156a;
            if (lVar == null || (userId = lVar.getUserId()) == null) {
                return Unit.INSTANCE;
            }
            long jLongValue = userId.longValue();
            ue0.l lVar2 = ((u) f0Var.f159087f.getValue()).f159156a;
            if (lVar2 == null || (str = lVar2.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String()) == null) {
                return Unit.INSTANCE;
            }
            ve0.b bVar = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);
            this.f159095a = 1;
            objM = bVar.m(jLongValue, str, this);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objM = obj;
        }
        boolean zBooleanValue = ((Boolean) objM).booleanValue();
        p2 p2Var = f0Var.f159087f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, u.b((u) value, null, null, null, null, false, null, false, false, zBooleanValue, null, null, 7167)));
        return Unit.INSTANCE;
    }
}
