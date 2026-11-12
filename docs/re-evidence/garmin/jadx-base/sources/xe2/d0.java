package xe2;

import com.garmin.android.library.mobileauth.ui.DeleteAccountActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.DeleteAccountActivity$handleURLThankYou$1", f = "DeleteAccountActivity.kt", l = {231}, m = "invokeSuspend")
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountActivity f190459b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(DeleteAccountActivity deleteAccountActivity, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f190459b = deleteAccountActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f190459b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190458a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f190458a = 1;
            if (o53.m0.b(6000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        re2.b bVar = re2.b.f152215a;
        if (this.f190459b.f50393n == null) {
            p005kotlin.jvm.internal.s.m("customerGUID");
            throw null;
        }
        bVar.getClass();
        int i15 = re2.b.e.f152247a[re2.b.f152226l.ordinal()];
        if (i15 == 1) {
            ge1.b.T(re2.b.f152217c, null, null, new re2.p(null), 3);
        } else if (i15 != 2) {
            lc.u0.r();
            return null;
        }
        return Unit.INSTANCE;
    }
}
