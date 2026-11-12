package i91;

import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import i3.mc;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dashboard.PersonalizedInsightsSectionKt$IndividualMessage$3$3$closeBottomSheet$1", f = "PersonalizedInsightsSection.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f92354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f92355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mc mcVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f92355b = mcVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f92355b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f92354a;
        if (i14 == 0) {
            r.b(obj);
            this.f92354a = 1;
            if (this.f92355b.d(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
