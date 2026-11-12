package xe2;

import android.content.Context;
import android.widget.Button;
import android.widget.CheckBox;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag$checkNextButtonState$1", f = "TermsOfUseFrag.kt", l = {}, m = "invokeSuspend")
public final class q0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f190536b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.garmin.android.library.mobileauth.ui.e eVar, Boolean bool, t13.d<? super q0> dVar) {
        super(2, dVar);
        this.f190535a = eVar;
        this.f190536b = bool;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q0(this.f190535a, this.f190536b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean zE;
        boolean zIsChecked;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.library.mobileauth.ui.e eVar = this.f190535a;
        Button button = eVar.f50429a;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("buttonNext");
            throw null;
        }
        Boolean bool = this.f190536b;
        if (bool != null) {
            zE = bool.booleanValue();
        } else {
            re2.l0 l0Var = re2.l0.f152316a;
            Context contextRequireContext = eVar.requireContext();
            contextRequireContext.getClass();
            l0Var.getClass();
            zE = re2.l0.e(contextRequireContext);
        }
        if (zE) {
            CheckBox checkBox = eVar.f50430b;
            if (checkBox == null) {
                p005kotlin.jvm.internal.s.m("eulaCheckBox");
                throw null;
            }
            if (checkBox.isChecked()) {
                com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a = com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a.SIGN_IN;
                com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a2 = eVar.f50433e;
                if (enumC1005a2 == null) {
                    p005kotlin.jvm.internal.s.m("flow");
                    throw null;
                }
                if ((enumC1005a == enumC1005a2 || com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a.CONTINUE_AS == enumC1005a2) && eVar.getMobileAuthConfig$mobile_auth_release().f177770k) {
                    CheckBox checkBox2 = eVar.f50431c;
                    if (checkBox2 == null) {
                        p005kotlin.jvm.internal.s.m("ageCheckBox");
                        throw null;
                    }
                    zIsChecked = checkBox2.isChecked();
                } else {
                    zIsChecked = true;
                }
            } else {
                zIsChecked = false;
            }
        } else {
            zIsChecked = false;
        }
        button.setEnabled(zIsChecked);
        return Unit.INSTANCE;
    }
}
