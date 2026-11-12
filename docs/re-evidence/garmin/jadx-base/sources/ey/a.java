package ey;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import c22.e1;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.dashboard.version2.RegisteredUnPairedDeviceActivity;
import com.garmin.android.apps.connectmobile.devices.sensors.SensorsActivity;
import com.garmin.android.apps.connectmobile.golf.truswing.ClubSelectionDrawerFragment;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.o0;
import com.garmin.device.pairing.devices.PrimaryApp;
import com.roomorama.caldroid.CaldroidListener;
import com.roomorama.caldroid.CalendarHelper;
import hc0.k.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import mt0.h2;
import org.koin.java.KoinJavaComponent;
import zb0.a0;
import zb0.u0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f67061b;

    public /* synthetic */ a(Fragment fragment, int i14) {
        this.f67060a = i14;
        this.f67061b = fragment;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view2, int i14, long j8) {
        h03.a aVar;
        hc0.b.d dVar;
        hc0.b bVar;
        sd2.f fVar;
        List<PrimaryApp> listU;
        int i15 = this.f67060a;
        Fragment fragment = this.f67061b;
        switch (i15) {
            case 0:
                com.garmin.android.apps.connectmobile.calendar.presentation.a aVar2 = (com.garmin.android.apps.connectmobile.calendar.presentation.a) fragment;
                ArrayList<h03.a> arrayList = aVar2.f31119n;
                if (arrayList != null && (aVar = arrayList.get(i14)) != null && aVar2.C != null) {
                    if (!aVar2.f31128y) {
                        h03.a aVar3 = aVar2.f31117l;
                        if (aVar3 == null || !aVar.r(aVar3)) {
                            h03.a aVar4 = aVar2.f31118m;
                            if (aVar4 == null || !aVar.o(aVar4)) {
                                ArrayList<h03.a> arrayList2 = aVar2.f31115j;
                                if (arrayList2 != null && arrayList2.indexOf(aVar) != -1) {
                                }
                            }
                        }
                    }
                    Date dateConvertDateTimeToDate = CalendarHelper.convertDateTimeToDate(aVar);
                    CaldroidListener caldroidListener = aVar2.C;
                    if (caldroidListener != null) {
                        caldroidListener.onSelectDate(dateConvertDateTimeToDate, view2);
                    }
                    break;
                }
                break;
            case 1:
                hc0.k kVar = (hc0.k) fragment;
                if (kVar.getActivity() != null && kVar.U6() && (dVar = (hc0.b.d) view2.getTag()) != null && !dVar.f83229j && (bVar = kVar.f83255x) != null) {
                    if (!dVar.f83230k) {
                        gc0.e eVar = (gc0.e) bVar.f83208a.get(i14);
                        if (eVar != null && (fVar = eVar.f76845a) != null) {
                            if (fVar.O() && (fVar instanceof sd2.j)) {
                                sd2.j jVar = (sd2.j) fVar;
                                new a0(kVar.requireContext(), new bd0.a(jVar.J0, jVar.O0), eVar.f76846b).a();
                            } else if (!hc0.k.V6(fVar)) {
                                boolean zContains = false;
                                if (u0.p(fVar.getProductNumber(), false)) {
                                    new nl0.b(kVar.getActivity(), false, "play.screen", fVar.getProductNumber(), fVar.getDisplayName()).a().execute();
                                } else if (u0.o(fVar.getProductNumber())) {
                                    com.garmin.android.apps.connectmobile.devices.model.l lVar = eVar.f76846b;
                                    new en.j(kVar.getActivity(), fVar.getProductNumber(), fVar.getDisplayName(), lVar != null ? Long.valueOf(lVar.o()) : null, ve2.f.b(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h())).execute();
                                } else if (!fVar.T()) {
                                    DeviceDetailsActivity.na(kVar.getActivity(), fVar.getUnitID());
                                } else {
                                    long unitID = fVar.getUnitID();
                                    if (unitID == -1) {
                                        i2.i("DevicesDashboardFragment", "Unit ID of the device was found to be null.");
                                        com.garmin.android.apps.connectmobile.devices.model.l lVar2 = eVar.f76846b;
                                        if (lVar2 != null) {
                                            unitID = lVar2.o();
                                        }
                                    }
                                    com.garmin.android.apps.connectmobile.devices.model.l lVar3 = eVar.f76846b;
                                    if (lVar3 != null && (listU = lVar3.u()) != null) {
                                        zContains = listU.contains(PrimaryApp.GCM);
                                    }
                                    androidx.fragment.app.m activity = kVar.getActivity();
                                    String applicationKey = fVar.getApplicationKey();
                                    String productDisplayName = fVar.getProductDisplayName();
                                    String imageURL = fVar.getImageURL();
                                    int i16 = RegisteredUnPairedDeviceActivity.f33842j;
                                    if (activity != null) {
                                        Intent intent = new Intent(activity, (Class<?>) RegisteredUnPairedDeviceActivity.class);
                                        intent.putExtra("GCM_deviceUnitID", unitID);
                                        intent.putExtra("GCM_deviceName", applicationKey);
                                        intent.putExtra("GCM_deviceDisplayName", productDisplayName);
                                        intent.putExtra("GCM_extra_device_image_url", imageURL);
                                        intent.putExtra("GCM_extra_device_incompatible_app", zContains);
                                        activity.startActivity(intent);
                                    }
                                }
                            } else {
                                j22.b bVar2 = j22.b.f96736a;
                                Context contextRequireContext = kVar.requireContext();
                                bVar2.getClass();
                                if (!j22.b.b(contextRequireContext)) {
                                    kVar.I0.a();
                                } else if (!e1.a()) {
                                    new gc0.r(kVar.getActivity(), kVar.new c());
                                } else {
                                    DeviceDetailsActivity.na(kVar.getActivity(), fVar.getUnitID());
                                }
                            }
                        }
                    } else {
                        kVar.startActivity(new Intent(kVar.getActivity(), (Class<?>) SensorsActivity.class));
                    }
                    break;
                }
                break;
            case 2:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar2 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.f) fragment;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f.a aVar5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f.R0;
                adapterView.getClass();
                if (!fVar2.v7().f37437b) {
                    fVar2.T6(adapterView, i14);
                } else {
                    fVar2.E7(i14);
                }
                break;
            case 3:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar2 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.k) fragment;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.k.a aVar6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.k.O0;
                if (!kVar2.u7().f37624i) {
                    adapterView.getClass();
                    kVar2.T6(adapterView, i14);
                } else {
                    kVar2.z7(i14);
                }
                break;
            case 4:
                adapterView.getClass();
                ((h2) fragment).T6(adapterView, i14);
                break;
            case 5:
                int i17 = o0.X;
                adapterView.getClass();
                ((o0) fragment).T6(adapterView, i14);
                break;
            case 6:
                com.garmin.android.apps.connectmobile.social.share.f fVar3 = (com.garmin.android.apps.connectmobile.social.share.f) fragment;
                com.garmin.android.apps.connectmobile.social.share.f.a aVar7 = com.garmin.android.apps.connectmobile.social.share.f.f44683j;
                adapterView.getClass();
                if (adapterView.getAdapter().getItemViewType(i14) == 2) {
                    Object itemAtPosition = adapterView.getItemAtPosition(i14);
                    itemAtPosition.getClass();
                    bq0.k kVar3 = (bq0.k) itemAtPosition;
                    ro1.r rVar = fVar3.f44690g;
                    if (rVar != null) {
                        rVar.O7(kVar3.f19509a);
                    }
                } else if (adapterView.getAdapter().getItemViewType(i14) != 1) {
                    j22.b bVar3 = j22.b.f96736a;
                    j22.a[] aVarArr = fVar3.f44692i;
                    j22.a[] aVarArr2 = (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
                    bVar3.getClass();
                    if (!j22.b.k(aVarArr2)) {
                        j22.b.z(fVar3, 2, (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
                    } else {
                        Context contextRequireContext2 = fVar3.requireContext();
                        contextRequireContext2.getClass();
                        File file = new File(pi1.b.a(contextRequireContext2, null), "captured_image.jpg");
                        fVar3.f44686c = file;
                        yy.a.b(fVar3, file);
                    }
                } else {
                    fVar3.u6();
                }
                break;
            default:
                ClubSelectionDrawerFragment clubSelectionDrawerFragment = (ClubSelectionDrawerFragment) fragment;
                int i18 = i14 - 1;
                com.garmin.android.apps.connectmobile.golf.truswing.model.a aVar8 = (com.garmin.android.apps.connectmobile.golf.truswing.model.a) clubSelectionDrawerFragment.f35766n.getItem(i18);
                clubSelectionDrawerFragment.f35769q.J(clubSelectionDrawerFragment.getActivity(), aVar8.f35890b, new com.garmin.android.apps.connectmobile.golf.truswing.b(clubSelectionDrawerFragment, i18, aVar8));
                break;
        }
    }
}
