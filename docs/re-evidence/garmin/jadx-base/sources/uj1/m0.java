package uj1;

import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f f171546b;

    public /* synthetic */ m0(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f fVar, int i14) {
        this.f171545a = i14;
        this.f171546b = fVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f171545a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f fVar = this.f171546b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                fVar.u6().S4();
                break;
            case 1:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                fVar.u6().S4();
                break;
            case 2:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                fVar.u6().S4();
                break;
            case 3:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                pj1.s.c5(fVar.u6());
                break;
            case 4:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                fVar.u6().X4();
                break;
            case 5:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                pj1.s sVarU6 = fVar.u6();
                int i15 = pj1.s.f137969j1;
                sVarU6.Y4(GDIRealtimeSettingsProto.WellKnownCompositionId.INCIDENT_DETECTION_MENU_VALUE, null);
                break;
            case 6:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                pj1.s sVarU7 = fVar.u6();
                int i16 = pj1.s.f137969j1;
                sVarU7.Y4(GDIRealtimeSettingsProto.WellKnownCompositionId.FALL_DETECTION_MENU_VALUE, null);
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar8 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                fVar.u6().T4();
                break;
        }
        return Unit.INSTANCE;
    }
}
