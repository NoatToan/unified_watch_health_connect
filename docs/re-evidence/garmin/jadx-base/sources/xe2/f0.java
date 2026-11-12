package xe2;

import com.garmin.android.library.mobileauth.ui.DeleteAccountActivity;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.DeleteAccountActivity$handleURLTicket$1", f = "DeleteAccountActivity.kt", l = {210}, m = "invokeSuspend")
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.v f190470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MobileAuthAbstractWebFrag f190471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountActivity f190472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.fragment.app.v vVar, MobileAuthAbstractWebFrag mobileAuthAbstractWebFrag, DeleteAccountActivity deleteAccountActivity, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f190470b = vVar;
        this.f190471c = mobileAuthAbstractWebFrag;
        this.f190472d = deleteAccountActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f190470b, this.f190471c, this.f190472d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190469a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f190469a = 1;
            if (o53.m0.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        androidx.fragment.app.v vVar = this.f190470b;
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(vVar, vVar);
        aVarB.x(this.f190471c);
        aVarB.e();
        this.f190472d.T9();
        return Unit.INSTANCE;
    }
}
