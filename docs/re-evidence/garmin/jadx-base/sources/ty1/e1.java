package ty1;

import android.content.Intent;
import android.os.Bundle;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.t f167098b;

    public /* synthetic */ e1(com.garmin.android.apps.connectmobile.traininginitiative.ui.t tVar, int i14) {
        this.f167097a = i14;
        this.f167098b = tVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f167097a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.t tVar = this.f167098b;
        int minuteOfHour = 0;
        fg0.y yVar = null;
        switch (i14) {
            case 0:
                fw.m mVar = (fw.m) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.t.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.t.f46255f;
                fw.p pVar = mVar.f73769b;
                List<com.garmin.android.apps.connectmobile.courses.model.d> list = (List) mVar.f73770c;
                int i15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.t.b.f46260a[pVar.ordinal()];
                if (i15 == 1) {
                    g22.e.f(tVar);
                    if (tVar.A6().C2) {
                        tVar.A6();
                        if (AddTIEventViewModel.g6(tVar.A6().l5().d(), list)) {
                            List<com.garmin.android.apps.connectmobile.courses.model.d> listD = tVar.A6().l5().d();
                            if (listD == null || listD.isEmpty()) {
                                tVar.A6().e6(list);
                                tVar.f46258d = tVar.A6().I5();
                                tVar.A6().C2 = false;
                                tVar.C6();
                            } else {
                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(tVar.requireContext());
                                aVar2.setTitle(tVar.getString(R.string.change_location_alert_title));
                                aVar2.setMessage(R.string.change_location_alert_msg);
                                aVar2.setCancelable(false);
                                aVar2.setPositiveButton(tVar.getString(R.string.lbl_common_continue), new pk1.t(12, tVar, list));
                                aVar2.setNegativeButton(tVar.getString(R.string.lbl_cancel), new o(3));
                                aVar2.create().show();
                            }
                        } else {
                            tVar.A6().C2 = false;
                            tVar.C6();
                        }
                    } else {
                        AddTIEventViewModel addTIEventViewModelA6 = tVar.A6();
                        androidx.fragment.app.m mVarRequireActivity = tVar.requireActivity();
                        mVarRequireActivity.getClass();
                        ((androidx.lifecycle.y0) addTIEventViewModelA6.f46405e1.getValue()).m(list);
                        if (list == null || list.isEmpty()) {
                            addTIEventViewModelA6.v6();
                        } else if (addTIEventViewModelA6.p6()) {
                            androidx.lifecycle.y0<List<am.x0>> y0VarK5 = addTIEventViewModelA6.k5();
                            lz1.f.a aVar3 = lz1.f.f115404a;
                            gg0.f fVarD = addTIEventViewModelA6.E5().d();
                            aVar3.getClass();
                            y0VarK5.m(new ArrayList(addTIEventViewModelA6.h6(list, lz1.f.a.g(fVarD))));
                            List<am.x0> listD2 = addTIEventViewModelA6.k5().d();
                            if (listD2 == null || listD2.isEmpty()) {
                                addTIEventViewModelA6.v6();
                            } else {
                                addTIEventViewModelA6.O5().m("TIAddACourseGenesisFragment");
                            }
                        } else {
                            lz1.f.a aVar4 = lz1.f.f115404a;
                            gg0.f fVarD2 = addTIEventViewModelA6.E5().d();
                            aVar4.getClass();
                            if (((ArrayList) addTIEventViewModelA6.h6(list, lz1.f.a.g(fVarD2))).isEmpty()) {
                                addTIEventViewModelA6.v6();
                            } else {
                                addTIEventViewModelA6.u6(mVarRequireActivity);
                            }
                        }
                    }
                } else if (i15 == 2) {
                    g22.e.f(tVar);
                    g22.e.c(tVar);
                    if (tVar.A6().P4()) {
                        AddTIEventViewModel addTIEventViewModelA7 = tVar.A6();
                        if (addTIEventViewModelA7.P5() != ny1.g.IN_PERSON || addTIEventViewModelA7.G5().d() == null) {
                            addTIEventViewModelA7.c6().j(null);
                            addTIEventViewModelA7.w6();
                        } else {
                            addTIEventViewModelA7.a5();
                        }
                    } else {
                        tVar.A6().v6();
                    }
                } else {
                    if (i15 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.l(tVar);
                }
                return Unit.INSTANCE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.t.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.t.f46255f;
                if (tVar.A6().f46443w2) {
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    AddTIEventViewModel addTIEventViewModelA8 = tVar.A6();
                    fg0.r rVar = new fg0.r(null, null, 3, null);
                    DateTime dateTimeD = addTIEventViewModelA8.S5().d();
                    int hourOfDay = dateTimeD != null ? dateTimeD.getHourOfDay() : 8;
                    DateTime dateTimeD2 = addTIEventViewModelA8.S5().d();
                    minuteOfHour = dateTimeD2 != null ? dateTimeD2.getMinuteOfHour() : 0;
                    l3.f23124b.getClass();
                    String strD1 = l3.a.d1((hourOfDay * 60) + minuteOfHour);
                    if (strD1 == null) {
                        strD1 = "";
                    }
                    rVar.i(strD1);
                    my1.g gVarD = addTIEventViewModelA8.R5().d();
                    rVar.j(gVarD != null ? gVarD.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String() : null);
                    DateTime dateTimeD3 = addTIEventViewModelA8.S5().d();
                    com.garmin.android.library.mapsdkadapter.f fVarD3 = addTIEventViewModelA8.H5().d();
                    if (fVarD3 != null) {
                        LatLng latLng = fVarD3.f50283a;
                        yVar = new fg0.y(Double.valueOf(latLng.latitude), Double.valueOf(latLng.longitude));
                    }
                    bundle.putParcelable("extra_fbt_location_time_dto", new ww1.v(dateTimeD3, rVar, addTIEventViewModelA8.M5().d(), yVar, zBooleanValue));
                    com.garmin.android.apps.connectmobile.m2.a(intent, bundle);
                    androidx.fragment.app.m activity = tVar.getActivity();
                    if (activity != null) {
                        activity.setResult(-1, intent);
                        activity.finish();
                    }
                    g22.e.l(tVar);
                } else {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "EventLocationInfoAdded");
                    if (tVar.A6().o6()) {
                        tVar.A6().N5().f(tVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.traininginitiative.ui.t.d(new e1(tVar, minuteOfHour)));
                    } else {
                        tVar.A6().v6();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
