package zo0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzo0/v;", "Lzo0/p;", "Lzo0/q;", "navigator", "<init>", "(Lzo0/q;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f206199b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206200a;

    static {
        new a(null);
    }

    public v(q qVar) {
        qVar.getClass();
        this.f206200a = qVar;
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.i)) {
            return null;
        }
        a2 a2Var = a2.SAFETY_FEATURES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "OnboardingSafetyFeaturesDialogHandler", "showSafetyFeaturesDayOneDialog: creating dialog");
        xp0.d dVar = new xp0.d(this, 27);
        do1.l lVar = new do1.l(4);
        m0.a aVar = m0.f149759e;
        q qVar = this.f206200a;
        return m0.a.d(aVar, R.drawable.icon_review_emergency_contacts, qVar.u5().getString(R.string.complete_assistance_contact_setup), qVar.u5().getString(R.string.complete_assistance_contact_setup_message), R.string.assistance_contacts_validation_my_day_card_title, dVar, R.string.lbl_dismiss, lVar, null, 1920);
    }

    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        db2.d.f59098a.getClass();
        db2.d.f59099b.getClass();
        f12.l lVar = db2.a.f59091b;
        if (lVar == null) {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
        boolean zW0 = false;
        if (lVar.W2("KeyEmergencyContactsShowDayOneDialog", true)) {
            f12.l lVar2 = db2.a.f59091b;
            if (lVar2 == null) {
                p005kotlin.jvm.internal.s.m("prefs");
                throw null;
            }
            lVar2.O2("KeyEmergencyContactsShowDayOneDialog", false);
            long millis = DateTime.now().getMillis();
            f12.l lVar3 = db2.a.f59091b;
            if (lVar3 == null) {
                p005kotlin.jvm.internal.s.m("prefs");
                throw null;
            }
            lVar3.h2(millis, "KeyEmergencyContactsCacheTimestamp");
            zW0 = bo1.a.a().c().W0();
        }
        if (zW0) {
            return n.i.f206180a;
        }
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/v$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
