package aj1;

import androidx.fragment.app.v;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.o1;
import com.garmin.android.apps.connectmobile.v2;
import k12.x;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.EmailNotificationSettingsFragment$configEmailNotifications$1$1", f = "EmailNotificationSettingsFragment.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.notifications.a f3423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.android.apps.connectmobile.settings.notifications.a aVar, boolean z14, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f3423b = aVar;
        this.f3424c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f3423b, this.f3424c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3422a;
        com.garmin.android.apps.connectmobile.settings.notifications.a aVar2 = this.f3423b;
        if (i14 == 0) {
            r.b(obj);
            com.garmin.android.apps.connectmobile.settings.notifications.a.C0807a c0807a = com.garmin.android.apps.connectmobile.settings.notifications.a.Q0;
            p pVar = (p) aVar2.f43575i.getValue();
            this.f3422a = 1;
            k12.d dVar = pVar.f3486g;
            dVar.getClass();
            objJ = f0.J(dVar, new x(dVar, null), this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objJ = obj;
        }
        v2 v2Var = (v2) objJ;
        g22.e.f(aVar2);
        if (!(v2Var instanceof v2.b)) {
            g22.e.c(aVar2);
        } else if (StringUtils.isEmpty(((j12.n) ((v2.b) v2Var).f47386a).getCom.google.android.gms.common.Scopes.EMAIL java.lang.String())) {
            com.garmin.android.apps.connectmobile.settings.notifications.a.C0807a c0807a2 = com.garmin.android.apps.connectmobile.settings.notifications.a.Q0;
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "EmailNotificationSettingsFragment", "showNoEmailAddressDialog");
            o1 o1VarA = o1.b.a(o1.f39651c, R.string.no_email_address_alert_title, aVar2.getString(R.string.no_email_address_alert_description), R.string.lbl_add_email_address, R.string.lbl_cancel, new c(aVar2), null, null, null, 448);
            v parentFragmentManager = aVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            o1VarA.show(parentFragmentManager, "GCMFeatureInfoDialog");
        } else {
            com.garmin.android.apps.connectmobile.settings.notifications.a.C0807a c0807a3 = com.garmin.android.apps.connectmobile.settings.notifications.a.Q0;
            aVar2.w6(this.f3424c);
        }
        return Unit.INSTANCE;
    }
}
