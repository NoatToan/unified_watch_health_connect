package l72;

import com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.PregnancyRemindersActivity;
import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.garmin.proto.generated.GDISimpleSetup;
import java.lang.annotation.Annotation;
import org.koin.java.KoinJavaComponent;
import org.slf4j.LoggerFactory;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111201a;

    public /* synthetic */ o2(int i14) {
        this.f111201a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f111201a) {
            case 0:
                p2 p2Var = p2.f111205a;
                return Unit.INSTANCE;
            case 1:
                p2 p2Var2 = p2.f111205a;
                return Unit.INSTANCE;
            case 2:
                y2 y2Var = y2.f111386a;
                return Float.valueOf(1.0f);
            case 3:
                l90.b.Companion companion = l90.b.INSTANCE;
                return new m63.e(m63.y1.f117048a);
            case 4:
                l90.b.Companion companion2 = l90.b.INSTANCE;
                l90.j[] jVarArrValues = l90.j.values();
                jVarArrValues.getClass();
                return new m63.b0("com.garmin.android.apps.connectmobile.device.setup.domain.discovery.model.PrimaryApplication", jVarArrValues);
            case 5:
                l90.b.Companion companion3 = l90.b.INSTANCE;
                l90.i[] iVarArrValues = l90.i.values();
                iVarArrValues.getClass();
                return new m63.b0("com.garmin.android.apps.connectmobile.device.setup.domain.discovery.model.ExternalDeviceSetup", iVarArrValues);
            case 6:
                l90.b.Companion companion4 = l90.b.INSTANCE;
                yl2.b[] bVarArrValues = yl2.b.values();
                bVarArrValues.getClass();
                return new m63.b0("com.garmin.device.pairing.GarminDeviceType", bVarArrValues);
            case 7:
                la0.a.Companion companion5 = la0.a.INSTANCE;
                GDISimpleSetup.SensorType[] sensorTypeArrValues = GDISimpleSetup.SensorType.values();
                sensorTypeArrValues.getClass();
                return new m63.e(new m63.b0("com.garmin.proto.generated.GDISimpleSetup.SensorType", sensorTypeArrValues));
            case 8:
                la0.a.Companion companion6 = la0.a.INSTANCE;
                return new m63.e(j90.n.a.f97844a);
            case 9:
                PregnancyRemindersActivity.a aVar = PregnancyRemindersActivity.f40928d;
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PregnancyRemindersActivity");
            case 10:
                LegalGatewayActivity.a aVar2 = LegalGatewayActivity.f49928n;
                return LoggerFactory.getLogger("LegalGatewayActivity");
            case 11:
                return (me0.w) KoinJavaComponent.get$default(me0.w.class, null, null, 6, null);
            case 12:
                return (me0.w) KoinJavaComponent.get$default(me0.w.class, null, null, 6, null);
            case 13:
                int i15 = TestGoogleAgeSignalsActivity.f41746b;
                int i16 = gt2.c.f79010a;
                return gt2.b.f79005a.h("TestGoogleAgeSignalsActivity");
            case 14:
                lg2.i iVar = lg2.i.f112327a;
                return Unit.INSTANCE;
            case 15:
                lg2.i iVar2 = lg2.i.f112327a;
                return Unit.INSTANCE;
            case 16:
                lg2.j jVar = lg2.j.f112330a;
                return Unit.INSTANCE;
            case 17:
                lg2.j jVar2 = lg2.j.f112330a;
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return new li0.c();
            case 23:
                return p3.p0.n(Boolean.FALSE);
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return Unit.INSTANCE;
            case 27:
                return new m63.f1("com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.navigation.AllConnectedApps", lk1.a.INSTANCE, new Annotation[0]);
            case 28:
                return new m63.f1("com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.navigation.ConnectedAppsNotSupported", lk1.c.INSTANCE, new Annotation[0]);
            default:
                lk1.d.a aVar3 = lk1.d.Companion;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new i63.g("com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.navigation.ConnectedAppsRoute", t0Var.b(lk1.d.class), new k23.d[]{t0Var.b(lk1.a.class), t0Var.b(lk1.c.class), t0Var.b(lk1.f.class)}, new i63.c[]{new m63.f1("com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.navigation.AllConnectedApps", lk1.a.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.navigation.ConnectedAppsNotSupported", lk1.c.INSTANCE, new Annotation[0]), lk1.f.a.f113150a}, new Annotation[0]);
        }
    }
}
