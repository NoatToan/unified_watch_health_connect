package tr2;

import android.content.DialogInterface;
import androidx.lifecycle.i0;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import o53.b0;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity$showUserForRemoveCardDialog$1$1", f = "UserWalletActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f166180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserWalletActivity f166181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vr2.q f166182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(DialogInterface dialogInterface, UserWalletActivity userWalletActivity, vr2.q qVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f166180a = dialogInterface;
        this.f166181b = userWalletActivity;
        this.f166182c = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f166180a, this.f166181b, this.f166182c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f166180a.dismiss();
        Boolean bool = Boolean.TRUE;
        UserWalletActivity userWalletActivity = this.f166181b;
        hn2.c.ba(userWalletActivity, bool, null, null, 14);
        UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
        userWalletActivity.getClass();
        i0 i0VarW = f0.w(userWalletActivity);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, u53.o.f168762a, null, new u(this.f166182c, userWalletActivity, null), 2);
        return Unit.INSTANCE;
    }
}
