package n70;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "dismissedCards", "", "", "isCardAllowedToShow"}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetEmergencyContactsStateUseCase$invoke$1", f = "GetEmergencyContactsStateUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s1 extends v13.i implements e23.q<List<? extends String>, Boolean, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f124544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f124545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f124546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(r1 r1Var, t13.d<? super s1> dVar) {
        super(3, dVar);
        this.f124546c = r1Var;
    }

    @Override // e23.q
    public final Object invoke(List<? extends String> list, Boolean bool, t13.d<? super Boolean> dVar) {
        boolean zBooleanValue = bool.booleanValue();
        s1 s1Var = new s1(this.f124546c, dVar);
        s1Var.f124544a = list;
        s1Var.f124545b = zBooleanValue;
        return s1Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = this.f124544a;
        boolean z14 = this.f124545b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int i14 = r1.f124523d;
        r1 r1Var = this.f124546c;
        r1Var.getClass();
        boolean z15 = false;
        if (!km2.a.f(SupportedCapability.INCIDENT_DETECT_AND_ASSISTANCE.ordinal()) || list.contains(o70.f.EMERGENCY_CONTACTS.f129989a)) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetEmergencyContactsStateUseCase", "Missing INCIDENT_DETECT_AND_ASSISTANCE capability skip Review Emergency Contacts check");
        } else {
            boolean zW0 = r1Var.f124526c.c().W0();
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String strE = com.airbnb.lottie.animation.keyframe.a.e("isShowEmergencyContactAlert[", "] isCardAllowedToShow[", "]", zW0, z14);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "GetEmergencyContactsStateUseCase", strE);
            if (zW0 && z14) {
                z15 = true;
            }
        }
        return Boolean.valueOf(z15);
    }
}
