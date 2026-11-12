package n61;

import com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.notifications.PregnancyAlarmReceiver;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Annotation;
import m63.b0;
import m63.d0;
import m63.f1;
import n63.a0;
import n63.k;
import n63.r;
import n63.v;
import n63.y;
import na0.s;
import ne0.j0;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123864a;

    public /* synthetic */ h(int i14) {
        this.f123864a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        j jVar = null;
        int i14 = 0;
        switch (this.f123864a) {
            case 0:
                i.Companion bVar = i.INSTANCE;
                return new m63.e(d0.f116930a);
            case 1:
                i.Companion bVar2 = i.INSTANCE;
                return new m63.e(d0.f116930a);
            case 2:
                i.Companion bVar3 = i.INSTANCE;
                return new m63.e(d0.f116930a);
            case 3:
                i.Companion bVar4 = i.INSTANCE;
                return new m63.e(d0.f116930a);
            case 4:
                k kVar = k.f123936a;
                a0.f123890a.getClass();
                return a0.f123891b;
            case 5:
                k kVar2 = k.f123936a;
                v.f123945a.getClass();
                return v.f123946b;
            case 6:
                k kVar3 = k.f123936a;
                r.f123942a.getClass();
                return r.f123943b;
            case 7:
                k kVar4 = k.f123936a;
                y.f123949a.getClass();
                return y.f123950b;
            case 8:
                k kVar5 = k.f123936a;
                n63.d.f123897a.getClass();
                return n63.d.f123898b;
            case 9:
                return DateTimeFormat.forPattern("MMM");
            case 10:
                return DateTimeFormat.forPattern("d");
            case 11:
                return DateTimeFormat.forPattern("MMM d, yyyy");
            case 12:
                return DateTimeFormat.forPattern("MMM d");
            case 13:
                return DateTimeFormat.forPattern("MMMM d");
            case 14:
                return DateTimeFormat.forPattern("MMMM yyyy");
            case 15:
                n90.b[] bVarArrValues = n90.b.values();
                bVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.device.setup.domain.launchpad.LaunchpadItemType", bVarArrValues);
            case 16:
                n91.a.Companion bVar5 = n91.a.INSTANCE;
                return q91.c.INSTANCE.serializer();
            case 17:
                s sVar = s.f125195a;
                return Unit.INSTANCE;
            case 18:
                s sVar2 = s.f125195a;
                return Unit.INSTANCE;
            case 19:
                int i15 = PregnancyAlarmReceiver.f40932b;
                int i16 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PregnancyAlarmReceiver");
            case 20:
                int i17 = j0.f125481c;
                return new bq0.c(5, i14, 2, jVar);
            case 21:
                return Unit.INSTANCE;
            case 22:
                int i18 = nj2.a.A;
                int i19 = gt2.c.f79010a;
                return gt2.b.f79005a.i("CM#CustomerManagementViewModel");
            case 23:
                Logger logger = nk2.b.f126460g;
                return new ByteArrayOutputStream(66560);
            case 24:
                no2.a.C2438a c2438a = no2.a.f126725b;
                return DateTimeFormat.forPattern("YYYYMMdd");
            case 25:
                return (nq.g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nq.g.class, new c83.h.a[0], null, null, null, 120);
            case 26:
                int i24 = nu0.e.f127899e;
                ju0.e.f100881g.getClass();
                return ju0.e.a.a();
            case 27:
                return p0.n(null);
            case 28:
                return new f1("com.garmin.android.apps.connectmobile.training.findplan.presentation.navigation.FindTrainingPlanRoute.SelectPlan", nw1.d.a.INSTANCE, new Annotation[0]);
            default:
                return new f1("com.garmin.android.apps.connectmobile.training.findplan.presentation.navigation.FindTrainingPlanRoute.Start", nw1.d.b.INSTANCE, new Annotation[0]);
        }
    }
}
