package ty1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.z f167260b;

    public /* synthetic */ w1(com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar, int i14) {
        this.f167259a = i14;
        this.f167260b = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        List<com.garmin.android.apps.connectmobile.courses.model.d> listD;
        Number number;
        int i14 = this.f167259a;
        int i15 = 2;
        int i16 = 1;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = this.f167260b;
        switch (i14) {
            case 0:
                o13.p pVar = (o13.p) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                pVar.getClass();
                Integer num = (Integer) pVar.f128594a;
                Integer num2 = (Integer) pVar.f128595b;
                if (num != null && num2 != null) {
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2.intValue();
                    androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(zVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                    aVar2.setTitle(iIntValue);
                    aVar2.setMessage(iIntValue2);
                    aVar2.setCancelable(false);
                    aVar2.setPositiveButton(R.string.lbl_exit, new x1(zVar, i16));
                    aVar2.setNegativeButton(R.string.lbl_cancel, new o(7));
                    zVar.f46370d.f(false);
                    zVar.requireActivity().onBackPressed();
                }
                return Unit.INSTANCE;
            case 1:
                fw.m mVar = (fw.m) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                fw.p pVar2 = mVar.f73769b;
                List<com.garmin.android.apps.connectmobile.courses.model.d> list = (List) mVar.f73770c;
                int i17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.b.f46390b[pVar2.ordinal()];
                if (i17 == 1) {
                    g22.e.f(zVar);
                    zVar.A6();
                    if (AddTIEventViewModel.g6(zVar.A6().l5().d(), list) && ((listD = zVar.A6().l5().d()) == null || listD.isEmpty())) {
                        zVar.A6().e6(list);
                    }
                    zVar.A6().Y5().f(zVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.traininginitiative.ui.z.d(new w1(zVar, i15)));
                } else if (i17 == 2) {
                    g22.e.f(zVar);
                    g22.e.c(zVar);
                } else {
                    if (i17 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.l(zVar);
                }
                return Unit.INSTANCE;
            case 2:
                fw.m mVar2 = (fw.m) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                fw.p pVar3 = mVar2.f73769b;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list2 = (List) mVar2.f73770c;
                int i18 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.b.f46390b[pVar3.ordinal()];
                if (i18 == 1) {
                    g22.e.f(zVar);
                    if (list2 != null) {
                        AddTIEventViewModel addTIEventViewModelA6 = zVar.A6();
                        String[] strArr = AddTIEventViewModel.V2;
                        bg0.a.c cVarD = addTIEventViewModelA6.r5().d();
                        double dDoubleValue = (cVarD == null || (number = cVarD.f17834a) == null) ? 0.0d : number.doubleValue();
                        lz1.f.a aVar5 = lz1.f.f115404a;
                        bg0.a.c cVarD2 = addTIEventViewModelA6.r5().d();
                        aVar5.getClass();
                        qs.y yVarD = lz1.f.a.i(cVarD2).d();
                        if (yVarD == null) {
                            yVarD = qs.y.UNIT_DISTANCE_KILOMETER;
                        }
                        addTIEventViewModelA6.f6(list2, dDoubleValue, yVarD);
                        zVar.F6();
                    }
                } else if (i18 == 2) {
                    g22.e.f(zVar);
                } else {
                    if (i18 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.l(zVar);
                }
                return Unit.INSTANCE;
            default:
                gg0.f fVar = (gg0.f) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                if (fVar != null) {
                    switch (com.garmin.android.apps.connectmobile.traininginitiative.ui.z.b.f46389a[fVar.ordinal()]) {
                        case 1:
                            GCMComplexButton gCMComplexButton = zVar.f46372f;
                            if (gCMComplexButton == null) {
                                p005kotlin.jvm.internal.s.m("runningButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton);
                            break;
                            break;
                        case 2:
                            GCMComplexButton gCMComplexButton2 = zVar.f46373g;
                            if (gCMComplexButton2 == null) {
                                p005kotlin.jvm.internal.s.m("trailRunningButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton2);
                            break;
                            break;
                        case 3:
                            GCMComplexButton gCMComplexButton3 = zVar.f46374h;
                            if (gCMComplexButton3 == null) {
                                p005kotlin.jvm.internal.s.m("cyclingButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton3);
                            break;
                            break;
                        case 4:
                            GCMComplexButton gCMComplexButton4 = zVar.f46375i;
                            if (gCMComplexButton4 == null) {
                                p005kotlin.jvm.internal.s.m("gravelCyclingButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton4);
                            break;
                            break;
                        case 5:
                            GCMComplexButton gCMComplexButton5 = zVar.f46376j;
                            if (gCMComplexButton5 == null) {
                                p005kotlin.jvm.internal.s.m("mountainBikingButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton5);
                            break;
                            break;
                        case 6:
                            GCMComplexButton gCMComplexButton6 = zVar.f46377k;
                            if (gCMComplexButton6 == null) {
                                p005kotlin.jvm.internal.s.m("swimmingButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton6);
                            break;
                            break;
                        case 7:
                            GCMComplexButton gCMComplexButton7 = zVar.f46378l;
                            if (gCMComplexButton7 == null) {
                                p005kotlin.jvm.internal.s.m("triathlonButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton7);
                            break;
                            break;
                        case 8:
                            GCMComplexButton gCMComplexButton8 = zVar.f46379m;
                            if (gCMComplexButton8 == null) {
                                p005kotlin.jvm.internal.s.m("multiSportButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton8);
                            break;
                            break;
                        case 9:
                            GCMComplexButton gCMComplexButton9 = zVar.f46380n;
                            if (gCMComplexButton9 == null) {
                                p005kotlin.jvm.internal.s.m("hikingButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton9);
                            break;
                            break;
                        case 10:
                            GCMComplexButton gCMComplexButton10 = zVar.f46381o;
                            if (gCMComplexButton10 == null) {
                                p005kotlin.jvm.internal.s.m("walkingButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton10);
                            break;
                            break;
                        case 11:
                            GCMComplexButton gCMComplexButton11 = zVar.f46382p;
                            if (gCMComplexButton11 == null) {
                                p005kotlin.jvm.internal.s.m("fitnessEquipmentButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton11);
                            break;
                            break;
                        case 12:
                        case 13:
                            GCMComplexButton gCMComplexButton12 = zVar.f46383q;
                            if (gCMComplexButton12 == null) {
                                p005kotlin.jvm.internal.s.m("motorcyclingButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton12);
                            break;
                            break;
                        case 14:
                            GCMComplexButton gCMComplexButton13 = zVar.f46384r;
                            if (gCMComplexButton13 == null) {
                                p005kotlin.jvm.internal.s.m("winterSportsButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton13);
                            break;
                            break;
                        default:
                            GCMComplexButton gCMComplexButton14 = zVar.f46385t;
                            if (gCMComplexButton14 == null) {
                                p005kotlin.jvm.internal.s.m("otherButton");
                                throw null;
                            }
                            zVar.G6(gCMComplexButton14);
                            break;
                            break;
                    }
                    if (zVar.A6().f46439u2) {
                        if (fVar.f()) {
                            GCMComplexButton gCMComplexButton15 = zVar.f46374h;
                            if (gCMComplexButton15 == null) {
                                p005kotlin.jvm.internal.s.m("cyclingButton");
                                throw null;
                            }
                            gCMComplexButton15.setVisibility(8);
                            GCMComplexButton gCMComplexButton16 = zVar.f46375i;
                            if (gCMComplexButton16 == null) {
                                p005kotlin.jvm.internal.s.m("gravelCyclingButton");
                                throw null;
                            }
                            gCMComplexButton16.setVisibility(8);
                            GCMComplexButton gCMComplexButton17 = zVar.f46376j;
                            if (gCMComplexButton17 == null) {
                                p005kotlin.jvm.internal.s.m("mountainBikingButton");
                                throw null;
                            }
                            gCMComplexButton17.setVisibility(8);
                            GCMComplexButton gCMComplexButton18 = zVar.f46377k;
                            if (gCMComplexButton18 == null) {
                                p005kotlin.jvm.internal.s.m("swimmingButton");
                                throw null;
                            }
                            gCMComplexButton18.setVisibility(8);
                            GCMComplexButton gCMComplexButton19 = zVar.f46378l;
                            if (gCMComplexButton19 == null) {
                                p005kotlin.jvm.internal.s.m("triathlonButton");
                                throw null;
                            }
                            gCMComplexButton19.setVisibility(8);
                            GCMComplexButton gCMComplexButton20 = zVar.f46379m;
                            if (gCMComplexButton20 == null) {
                                p005kotlin.jvm.internal.s.m("multiSportButton");
                                throw null;
                            }
                            gCMComplexButton20.setVisibility(8);
                            GCMComplexButton gCMComplexButton21 = zVar.f46380n;
                            if (gCMComplexButton21 == null) {
                                p005kotlin.jvm.internal.s.m("hikingButton");
                                throw null;
                            }
                            gCMComplexButton21.setVisibility(8);
                            GCMComplexButton gCMComplexButton22 = zVar.f46381o;
                            if (gCMComplexButton22 == null) {
                                p005kotlin.jvm.internal.s.m("walkingButton");
                                throw null;
                            }
                            gCMComplexButton22.setVisibility(8);
                            GCMComplexButton gCMComplexButton23 = zVar.f46382p;
                            if (gCMComplexButton23 == null) {
                                p005kotlin.jvm.internal.s.m("fitnessEquipmentButton");
                                throw null;
                            }
                            gCMComplexButton23.setVisibility(8);
                            GCMComplexButton gCMComplexButton24 = zVar.f46383q;
                            if (gCMComplexButton24 == null) {
                                p005kotlin.jvm.internal.s.m("motorcyclingButton");
                                throw null;
                            }
                            gCMComplexButton24.setVisibility(8);
                            GCMComplexButton gCMComplexButton25 = zVar.f46384r;
                            if (gCMComplexButton25 == null) {
                                p005kotlin.jvm.internal.s.m("winterSportsButton");
                                throw null;
                            }
                            gCMComplexButton25.setVisibility(8);
                            GCMComplexButton gCMComplexButton26 = zVar.f46385t;
                            if (gCMComplexButton26 == null) {
                                p005kotlin.jvm.internal.s.m("otherButton");
                                throw null;
                            }
                            gCMComplexButton26.setVisibility(8);
                        } else if (fVar.e()) {
                            GCMComplexButton gCMComplexButton27 = zVar.f46372f;
                            if (gCMComplexButton27 == null) {
                                p005kotlin.jvm.internal.s.m("runningButton");
                                throw null;
                            }
                            gCMComplexButton27.setVisibility(8);
                            GCMComplexButton gCMComplexButton28 = zVar.f46373g;
                            if (gCMComplexButton28 == null) {
                                p005kotlin.jvm.internal.s.m("trailRunningButton");
                                throw null;
                            }
                            gCMComplexButton28.setVisibility(8);
                            GCMComplexButton gCMComplexButton29 = zVar.f46377k;
                            if (gCMComplexButton29 == null) {
                                p005kotlin.jvm.internal.s.m("swimmingButton");
                                throw null;
                            }
                            gCMComplexButton29.setVisibility(8);
                            GCMComplexButton gCMComplexButton30 = zVar.f46378l;
                            if (gCMComplexButton30 == null) {
                                p005kotlin.jvm.internal.s.m("triathlonButton");
                                throw null;
                            }
                            gCMComplexButton30.setVisibility(8);
                            GCMComplexButton gCMComplexButton31 = zVar.f46379m;
                            if (gCMComplexButton31 == null) {
                                p005kotlin.jvm.internal.s.m("multiSportButton");
                                throw null;
                            }
                            gCMComplexButton31.setVisibility(8);
                            GCMComplexButton gCMComplexButton32 = zVar.f46380n;
                            if (gCMComplexButton32 == null) {
                                p005kotlin.jvm.internal.s.m("hikingButton");
                                throw null;
                            }
                            gCMComplexButton32.setVisibility(8);
                            GCMComplexButton gCMComplexButton33 = zVar.f46381o;
                            if (gCMComplexButton33 == null) {
                                p005kotlin.jvm.internal.s.m("walkingButton");
                                throw null;
                            }
                            gCMComplexButton33.setVisibility(8);
                            GCMComplexButton gCMComplexButton34 = zVar.f46382p;
                            if (gCMComplexButton34 == null) {
                                p005kotlin.jvm.internal.s.m("fitnessEquipmentButton");
                                throw null;
                            }
                            gCMComplexButton34.setVisibility(8);
                            GCMComplexButton gCMComplexButton35 = zVar.f46383q;
                            if (gCMComplexButton35 == null) {
                                p005kotlin.jvm.internal.s.m("motorcyclingButton");
                                throw null;
                            }
                            gCMComplexButton35.setVisibility(8);
                            GCMComplexButton gCMComplexButton36 = zVar.f46384r;
                            if (gCMComplexButton36 == null) {
                                p005kotlin.jvm.internal.s.m("winterSportsButton");
                                throw null;
                            }
                            gCMComplexButton36.setVisibility(8);
                            GCMComplexButton gCMComplexButton37 = zVar.f46385t;
                            if (gCMComplexButton37 == null) {
                                p005kotlin.jvm.internal.s.m("otherButton");
                                throw null;
                            }
                            gCMComplexButton37.setVisibility(8);
                        } else if (fVar == gg0.f.f77137m) {
                            GCMComplexButton gCMComplexButton38 = zVar.f46372f;
                            if (gCMComplexButton38 == null) {
                                p005kotlin.jvm.internal.s.m("runningButton");
                                throw null;
                            }
                            gCMComplexButton38.setVisibility(8);
                            GCMComplexButton gCMComplexButton39 = zVar.f46373g;
                            if (gCMComplexButton39 == null) {
                                p005kotlin.jvm.internal.s.m("trailRunningButton");
                                throw null;
                            }
                            gCMComplexButton39.setVisibility(8);
                            GCMComplexButton gCMComplexButton40 = zVar.f46374h;
                            if (gCMComplexButton40 == null) {
                                p005kotlin.jvm.internal.s.m("cyclingButton");
                                throw null;
                            }
                            gCMComplexButton40.setVisibility(8);
                            GCMComplexButton gCMComplexButton41 = zVar.f46375i;
                            if (gCMComplexButton41 == null) {
                                p005kotlin.jvm.internal.s.m("gravelCyclingButton");
                                throw null;
                            }
                            gCMComplexButton41.setVisibility(8);
                            GCMComplexButton gCMComplexButton42 = zVar.f46376j;
                            if (gCMComplexButton42 == null) {
                                p005kotlin.jvm.internal.s.m("mountainBikingButton");
                                throw null;
                            }
                            gCMComplexButton42.setVisibility(8);
                            GCMComplexButton gCMComplexButton43 = zVar.f46377k;
                            if (gCMComplexButton43 == null) {
                                p005kotlin.jvm.internal.s.m("swimmingButton");
                                throw null;
                            }
                            gCMComplexButton43.setVisibility(8);
                            GCMComplexButton gCMComplexButton44 = zVar.f46380n;
                            if (gCMComplexButton44 == null) {
                                p005kotlin.jvm.internal.s.m("hikingButton");
                                throw null;
                            }
                            gCMComplexButton44.setVisibility(8);
                            GCMComplexButton gCMComplexButton45 = zVar.f46381o;
                            if (gCMComplexButton45 == null) {
                                p005kotlin.jvm.internal.s.m("walkingButton");
                                throw null;
                            }
                            gCMComplexButton45.setVisibility(8);
                            GCMComplexButton gCMComplexButton46 = zVar.f46382p;
                            if (gCMComplexButton46 == null) {
                                p005kotlin.jvm.internal.s.m("fitnessEquipmentButton");
                                throw null;
                            }
                            gCMComplexButton46.setVisibility(8);
                            GCMComplexButton gCMComplexButton47 = zVar.f46383q;
                            if (gCMComplexButton47 == null) {
                                p005kotlin.jvm.internal.s.m("motorcyclingButton");
                                throw null;
                            }
                            gCMComplexButton47.setVisibility(8);
                            GCMComplexButton gCMComplexButton48 = zVar.f46384r;
                            if (gCMComplexButton48 == null) {
                                p005kotlin.jvm.internal.s.m("winterSportsButton");
                                throw null;
                            }
                            gCMComplexButton48.setVisibility(8);
                            GCMComplexButton gCMComplexButton49 = zVar.f46385t;
                            if (gCMComplexButton49 == null) {
                                p005kotlin.jvm.internal.s.m("otherButton");
                                throw null;
                            }
                            gCMComplexButton49.setVisibility(8);
                        } else if (fVar.g()) {
                            GCMComplexButton gCMComplexButton50 = zVar.f46372f;
                            if (gCMComplexButton50 == null) {
                                p005kotlin.jvm.internal.s.m("runningButton");
                                throw null;
                            }
                            gCMComplexButton50.setVisibility(8);
                            GCMComplexButton gCMComplexButton51 = zVar.f46373g;
                            if (gCMComplexButton51 == null) {
                                p005kotlin.jvm.internal.s.m("trailRunningButton");
                                throw null;
                            }
                            gCMComplexButton51.setVisibility(8);
                            GCMComplexButton gCMComplexButton52 = zVar.f46374h;
                            if (gCMComplexButton52 == null) {
                                p005kotlin.jvm.internal.s.m("cyclingButton");
                                throw null;
                            }
                            gCMComplexButton52.setVisibility(8);
                            GCMComplexButton gCMComplexButton53 = zVar.f46375i;
                            if (gCMComplexButton53 == null) {
                                p005kotlin.jvm.internal.s.m("gravelCyclingButton");
                                throw null;
                            }
                            gCMComplexButton53.setVisibility(8);
                            GCMComplexButton gCMComplexButton54 = zVar.f46376j;
                            if (gCMComplexButton54 == null) {
                                p005kotlin.jvm.internal.s.m("mountainBikingButton");
                                throw null;
                            }
                            gCMComplexButton54.setVisibility(8);
                            GCMComplexButton gCMComplexButton55 = zVar.f46377k;
                            if (gCMComplexButton55 == null) {
                                p005kotlin.jvm.internal.s.m("swimmingButton");
                                throw null;
                            }
                            gCMComplexButton55.setVisibility(8);
                            GCMComplexButton gCMComplexButton56 = zVar.f46380n;
                            if (gCMComplexButton56 == null) {
                                p005kotlin.jvm.internal.s.m("hikingButton");
                                throw null;
                            }
                            gCMComplexButton56.setVisibility(8);
                            GCMComplexButton gCMComplexButton57 = zVar.f46381o;
                            if (gCMComplexButton57 == null) {
                                p005kotlin.jvm.internal.s.m("walkingButton");
                                throw null;
                            }
                            gCMComplexButton57.setVisibility(8);
                            GCMComplexButton gCMComplexButton58 = zVar.f46382p;
                            if (gCMComplexButton58 == null) {
                                p005kotlin.jvm.internal.s.m("fitnessEquipmentButton");
                                throw null;
                            }
                            gCMComplexButton58.setVisibility(8);
                            GCMComplexButton gCMComplexButton59 = zVar.f46383q;
                            if (gCMComplexButton59 == null) {
                                p005kotlin.jvm.internal.s.m("motorcyclingButton");
                                throw null;
                            }
                            gCMComplexButton59.setVisibility(8);
                            GCMComplexButton gCMComplexButton60 = zVar.f46384r;
                            if (gCMComplexButton60 == null) {
                                p005kotlin.jvm.internal.s.m("winterSportsButton");
                                throw null;
                            }
                            gCMComplexButton60.setVisibility(8);
                            GCMComplexButton gCMComplexButton61 = zVar.f46385t;
                            if (gCMComplexButton61 == null) {
                                p005kotlin.jvm.internal.s.m("otherButton");
                                throw null;
                            }
                            gCMComplexButton61.setVisibility(8);
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
