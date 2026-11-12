package uj1;

import androidx.lifecycle.w0;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e f171493b;

    public /* synthetic */ b0(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e eVar, int i14) {
        this.f171492a = i14;
        this.f171493b = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f171492a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e eVar = this.f171493b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                eVar.v6().S4();
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                eVar.v6().S4();
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                eVar.v6().S4();
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                eVar.v6().Y4(GDIRealtimeSettingsProto.WellKnownCompositionId.INCIDENT_DETECTION_MENU_VALUE, Long.valueOf(eVar.u6()));
                return Unit.INSTANCE;
            case 4:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                eVar.v6().Y4(GDIRealtimeSettingsProto.WellKnownCompositionId.FALL_DETECTION_MENU_VALUE, Long.valueOf(eVar.u6()));
                return Unit.INSTANCE;
            case 5:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                eVar.v6().T4();
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                return Long.valueOf(eVar.requireArguments().getLong("ARGS_UNIT_ID"));
            default:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar8 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                final pj1.s sVarV6 = eVar.v6();
                final long jU6 = eVar.u6();
                final w0 w0Var = new w0();
                final int i15 = 0;
                w0Var.n(sVarV6.H0, new pj1.s.d(new e23.l() { // from class: pj1.r
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                s.I4(sVarV6, w0Var, jU6);
                                break;
                            case 1:
                                s.I4(sVarV6, w0Var, jU6);
                                break;
                            default:
                                s.I4(sVarV6, w0Var, jU6);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i16 = 1;
                w0Var.n(sVarV6.f137979k0, new pj1.s.d(new e23.l() { // from class: pj1.r
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                s.I4(sVarV6, w0Var, jU6);
                                break;
                            case 1:
                                s.I4(sVarV6, w0Var, jU6);
                                break;
                            default:
                                s.I4(sVarV6, w0Var, jU6);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i17 = 2;
                w0Var.n(sVarV6.D, new pj1.s.d(new e23.l() { // from class: pj1.r
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                s.I4(sVarV6, w0Var, jU6);
                                break;
                            case 1:
                                s.I4(sVarV6, w0Var, jU6);
                                break;
                            default:
                                s.I4(sVarV6, w0Var, jU6);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                return w0Var;
        }
    }
}
