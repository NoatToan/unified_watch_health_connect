package b41;

import android.content.Intent;
import android.location.Location;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.navigation.fragment.NavHostFragment;
import bi1.c;
import bi1.u;
import bl2.r;
import bp.f;
import bp.h;
import bp.i;
import bq0.k;
import c2.h2;
import c42.p;
import c63.z0;
import com.garmin.android.apps.connectmobile.AppConfigurationViewActivity;
import com.garmin.android.apps.connectmobile.GCMCommonDeepLinkHandler;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.photos.GroupPostViewImageActivity;
import com.garmin.android.apps.connectmobile.activities.photos.PostPhotoManagementActivity;
import com.garmin.android.apps.connectmobile.activities.photos.ViewImageActivity;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.devices.setup.GDIAuthPairingAndroidNotificationPressedActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.groupride.GroupRideConsentActivity;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageMultiPickerActivity;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentsSummaryListDTO;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3ClassicWatchFaceSettingsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.ViewMultisportWorkoutActivity;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.android.library.mapsdkadapter.n;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import d80.g;
import e23.l;
import ei0.q0;
import f5.a1;
import g6.o;
import gg1.o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.m2;
import lc.u0;
import o4.d0;
import o4.q;
import o4.w;
import o53.i0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p5.k0;
import ps.j;
import q92.v;
import qz.e;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15708b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f15707a = i14;
        this.f15708b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        Entry entryD;
        ArrayList<j> arrayList;
        j jVarA;
        String str;
        String strValueOf;
        int i14 = this.f15707a;
        int size = 0;
        Object obj2 = this.f15708b;
        switch (i14) {
            case 0:
                Highlight[] highlightArr = (Highlight[]) obj;
                LineDataSet lineDataSet = b.f15709g;
                highlightArr.getClass();
                e eVar = ((b) obj2).f15713d;
                int length = highlightArr.length;
                if (length == 1) {
                    return (eVar == null || (entryD = eVar.d(highlightArr[0])) == null) ? new Entry() : entryD;
                }
                if (length == 2 && eVar != null) {
                    return eVar.g(highlightArr);
                }
                return new Entry();
            case 1:
                GDIAuthPairingAndroidNotificationPressedActivity gDIAuthPairingAndroidNotificationPressedActivity = (GDIAuthPairingAndroidNotificationPressedActivity) obj2;
                int i15 = GDIAuthPairingAndroidNotificationPressedActivity.f34440f;
                if (!((Boolean) obj).booleanValue()) {
                    gDIAuthPairingAndroidNotificationPressedActivity.finish();
                }
                return Unit.INSTANCE;
            case 2:
                c cVar = (c) obj2;
                c.a aVar = c.f18016c;
                int i16 = ((bi1.a) obj).f18014c.f18081b;
                d dVar = new d();
                ConstraintLayout constraintLayout = cVar.f18018b;
                if (constraintLayout == null) {
                    s.m("colorConstraintLayout");
                    throw null;
                }
                dVar.f(constraintLayout);
                dVar.h(R.id.check_icon, 7, i16, 7);
                dVar.h(R.id.check_icon, 4, i16, 4);
                ConstraintLayout constraintLayout2 = cVar.f18018b;
                if (constraintLayout2 != null) {
                    dVar.b(constraintLayout2);
                    return Unit.INSTANCE;
                }
                s.m("colorConstraintLayout");
                throw null;
            case 3:
                Vivomove3ClassicWatchFaceSettingsActivity vivomove3ClassicWatchFaceSettingsActivity = (Vivomove3ClassicWatchFaceSettingsActivity) obj2;
                bi1.a aVar2 = (bi1.a) obj;
                ImageView imageView = vivomove3ClassicWatchFaceSettingsActivity.f43198f;
                if (imageView == null) {
                    s.m("watchFaceTop");
                    throw null;
                }
                bi1.b bVar = bi1.b.f18015a;
                aVar2.getClass();
                u uVar = u.Top;
                bVar.getClass();
                imageView.setImageDrawable(bi1.b.a(vivomove3ClassicWatchFaceSettingsActivity, aVar2, uVar));
                ImageView imageView2 = vivomove3ClassicWatchFaceSettingsActivity.f43199g;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(bi1.b.a(vivomove3ClassicWatchFaceSettingsActivity, aVar2, u.Bottom));
                    return Unit.INSTANCE;
                }
                s.m("watchFaceBottom");
                throw null;
            case 4:
                List<? extends i0<Unit>> list = (List) obj;
                r.a aVar3 = r.f18709p;
                list.getClass();
                ((r) obj2).f18713o = list;
                return Unit.INSTANCE;
            case 5:
                GroupRideShareActivity groupRideShareActivity = (GroupRideShareActivity) obj2;
                v vVar = (v) obj;
                GroupRideShareActivity.a aVar4 = GroupRideShareActivity.f36417i;
                groupRideShareActivity.hideProgressOverlay();
                if (vVar == null) {
                    groupRideShareActivity.displayFailedMessage();
                } else if (vVar.b()) {
                    Intent intentE = groupRideShareActivity.f36426h.e(groupRideShareActivity);
                    f.c<Intent> cVar2 = groupRideShareActivity.f36422d;
                    if (cVar2 == null) {
                        s.m("selectCompatibleDeviceLauncher");
                        throw null;
                    }
                    cVar2.a(intentE, null);
                } else {
                    f.c<Intent> cVar3 = groupRideShareActivity.f36423e;
                    if (cVar3 == null) {
                        s.m("consentLivetrackWithGroupRideLauncher");
                        throw null;
                    }
                    cVar3.a(new Intent(groupRideShareActivity, (Class<?>) GroupRideConsentActivity.class), null);
                }
                return Unit.INSTANCE;
            case 6:
                GroupPostViewImageActivity groupPostViewImageActivity = (GroupPostViewImageActivity) obj2;
                int iIntValue = ((Integer) obj).intValue();
                GroupPostViewImageActivity.a aVar5 = GroupPostViewImageActivity.f29703m;
                ia1.a aVar6 = groupPostViewImageActivity.f82677c;
                j jVar = (aVar6 == null || (arrayList = aVar6.f92438h) == null) ? null : (j) h0.e0(iIntValue, arrayList);
                if (jVar == null) {
                    a2 a2Var = a2.ACTIVITIES;
                    String strH = am.j.h(iIntValue, "Delete image failed, no item for position: ");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "GroupPostViewImageActivity", strH);
                } else {
                    String imageId = jVar.getImageId();
                    if (imageId == null) {
                        i2.f36769a.getClass();
                        i2.a.b(a2.ACTIVITIES, "GroupPostViewImageActivity", "Delete image failed, no image id for image item: " + jVar);
                    } else {
                        bp.e eVar2 = (bp.e) groupPostViewImageActivity.f29706l.getValue();
                        String str2 = groupPostViewImageActivity.f29704j;
                        str2.getClass();
                        dh.b.L(xy2.b.K(eVar2, new f(eVar2, str2, imageId, null)), groupPostViewImageActivity, new GroupPostViewImageActivity.c(new ap.b(groupPostViewImageActivity, iIntValue, 1)));
                    }
                }
                return Unit.INSTANCE;
            case 7:
                PostPhotoManagementActivity postPhotoManagementActivity = (PostPhotoManagementActivity) obj2;
                g3 g3Var = (g3) obj;
                PostPhotoManagementActivity.a aVar7 = PostPhotoManagementActivity.f29721q;
                g3Var.getClass();
                int i17 = PostPhotoManagementActivity.c.f29727a[g3Var.f35300a.ordinal()];
                if (i17 == 1) {
                    postPhotoManagementActivity.hideProgressOverlay();
                } else if (i17 == 2) {
                    postPhotoManagementActivity.hideProgressOverlay();
                    q0.b(postPhotoManagementActivity);
                    postPhotoManagementActivity.da().scrollToPosition(0);
                    postPhotoManagementActivity.ca().t();
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    postPhotoManagementActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            case 8:
                ViewImageActivity viewImageActivity = (ViewImageActivity) obj2;
                Integer num = (Integer) obj;
                ViewImageActivity.a aVar8 = ViewImageActivity.f29734o;
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    ia1.a aVar9 = viewImageActivity.f82677c;
                    if (aVar9 != null && (jVarA = aVar9.a(iIntValue2)) != null) {
                        viewImageActivity.showProgressOverlay();
                        String imageId2 = jVarA.getImageId();
                        if (imageId2 != null) {
                            am.b bVarM = am.b.M();
                            long j8 = viewImageActivity.f29737l;
                            i iVar = new i(viewImageActivity, iIntValue2);
                            bVarM.getClass();
                            d80.f.b bVar2 = new d80.f.b(new Object[]{Long.toString(j8), imageId2}, lj0.a.f112936i);
                            bVar2.f58274d = iVar;
                            bVar2.f58275e = g.NO_PARSING;
                            d80.f<Object> fVarA = bVar2.a();
                            fVarA.b();
                            viewImageActivity.f29735j = fVarA;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 9:
                List<k> list2 = (List) obj;
                bq0.f fVar = ((ImageMultiPickerActivity) obj2).f36772b;
                if (fVar != null) {
                    fVar.z(list2);
                    return Unit.INSTANCE;
                }
                s.m("adapter");
                throw null;
            case 10:
                c02.b bVar3 = (c02.b) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                if (bVar3 == null || (str = bVar3.f22355d) == null) {
                    str = "";
                }
                p5.h0.n(k0Var, str);
                return Unit.INSTANCE;
            case 11:
                q3.c cVar4 = (q3.c) obj2;
                Object[] objArr = cVar4.f142356a;
                int i18 = cVar4.f142358c;
                for (int i19 = 0; i19 < i18; i19++) {
                    ((a1) objArr[i19]).q();
                }
                return Unit.INSTANCE;
            case 12:
                m2 m2Var = (m2) obj;
                m2Var.f91341a = "padding";
                m2Var.f91343c.c((h2) obj2, "paddingValues");
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.onboarding.data.local.a aVar10 = (com.garmin.android.apps.connectmobile.onboarding.data.local.a) obj2;
                ud.a aVar11 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar4 = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar11.getClass();
                ud.c cVarM0 = aVar11.M0("SELECT * FROM device_onboarding_items");
                try {
                    int iB = ge1.b.B(cVarM0, "deviceId");
                    int iB2 = ge1.b.B(cVarM0, "deviceRegistrationSortOrder");
                    int iB3 = ge1.b.B(cVarM0, "deviceName");
                    int iB4 = ge1.b.B(cVarM0, "deviceProductNumber");
                    int iB5 = ge1.b.B(cVarM0, "sortOrder");
                    int iB6 = ge1.b.B(cVarM0, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB7 = ge1.b.B(cVarM0, "associationType");
                    int iB8 = ge1.b.B(cVarM0, "status");
                    int iB9 = ge1.b.B(cVarM0, "coreItem");
                    int iB10 = ge1.b.B(cVarM0, "reminderDate");
                    int iB11 = ge1.b.B(cVarM0, "deviceImageUrl");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarM0.J0()) {
                        long j14 = cVarM0.getLong(iB);
                        ArrayList arrayList3 = arrayList2;
                        int i24 = (int) cVarM0.getLong(iB2);
                        String strM1 = cVarM0.isNull(iB3) ? null : cVarM0.M1(iB3);
                        String strM2 = cVarM0.isNull(iB4) ? null : cVarM0.M1(iB4);
                        int i25 = iB;
                        int i26 = (int) cVarM0.getLong(iB5);
                        String strM3 = cVarM0.M1(iB6);
                        aVar10.f39665c.getClass();
                        arrayList3.add(new d31.a(j14, i24, strM1, strM2, i26, c31.a.d(strM3), c31.a.a(cVarM0.M1(iB7)), c31.a.c(cVarM0.M1(iB8)), ((int) cVarM0.getLong(iB9)) != 0, c31.a.b(cVarM0.isNull(iB10) ? null : cVarM0.M1(iB10)), cVarM0.isNull(iB11) ? null : cVarM0.M1(iB11)));
                        iB = i25;
                        arrayList2 = arrayList3;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarM0.close();
                }
            case 14:
                zd0.k.a aVar12 = (zd0.k.a) obj;
                aVar12.getClass();
                ((p) obj2).invoke(Long.valueOf(aVar12.f204042a), aVar12.f204043b);
                return Unit.INSTANCE;
            case 15:
                c50.i iVar2 = (c50.i) obj2;
                c50.i.a aVar13 = c50.i.f24502a1;
                ((View) obj).getClass();
                iVar2.u6(iVar2.f97019x, iVar2.f148290a);
                return Unit.INSTANCE;
            case 16:
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                geoPointDTO.getClass();
                ((h) obj2).invoke(geoPointDTO);
                return Unit.INSTANCE;
            case 17:
                Intent intent = (Intent) obj2;
                Long l14 = (Long) obj;
                MultiSportsDetailsActivity.a aVar14 = MultiSportsDetailsActivity.f48440z;
                l14.getClass();
                return new o13.p(l14, intent != null ? intent.getStringExtra("KEY_SNACKBAR_MESSAGE") : null);
            case 18:
                com.garmin.android.apps.connectmobile.workouts.presentation.details.d dVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d) obj;
                ViewMultisportWorkoutActivity.a aVar15 = ViewMultisportWorkoutActivity.f48481g;
                dVar2.getClass();
                ((ViewMultisportWorkoutActivity) obj2).fa(dVar2);
                return Unit.INSTANCE;
            case 19:
                c63.s sVar = (c63.s) obj;
                sVar.getClass();
                c63.a1.d(sVar, ((z0.c) obj2).f25160b);
                return Unit.INSTANCE;
            case 20:
                int iIntValue3 = ((Integer) obj).intValue();
                int i27 = na0.r.f125175e;
                ((na0.r) obj2).y4(o0.METRIC, iIntValue3);
                return Unit.INSTANCE;
            case 21:
                com.garmin.android.apps.connectmobile.segments.presentation.b bVar5 = (com.garmin.android.apps.connectmobile.segments.presentation.b) obj2;
                Location location = (Location) obj;
                bVar5.f41427t = location;
                if (bVar5.f41428v) {
                    bVar5.f41428v = false;
                    if (location != null) {
                        bVar5.v6(n.c(location), 13);
                    }
                }
                return Unit.INSTANCE;
            case 22:
                com.garmin.android.apps.connectmobile.segments.presentation.c cVar5 = (com.garmin.android.apps.connectmobile.segments.presentation.c) obj2;
                g3 g3Var2 = (g3) obj;
                com.garmin.android.apps.connectmobile.segments.presentation.c.a aVar16 = com.garmin.android.apps.connectmobile.segments.presentation.c.A;
                g3Var2.getClass();
                fw.p pVar = g3Var2.f35300a;
                SegmentsSummaryListDTO segmentsSummaryListDTO = (SegmentsSummaryListDTO) g3Var2.f35301b;
                String str3 = g3Var2.f35302c;
                Exception exc = g3Var2.f35303d;
                int i28 = com.garmin.android.apps.connectmobile.segments.presentation.c.C0787c.f41434a[pVar.ordinal()];
                if (i28 == 1) {
                    cVar5.S6();
                } else if (i28 == 2) {
                    cVar5.F6();
                    segmentsSummaryListDTO.getClass();
                    ArrayList arrayList4 = segmentsSummaryListDTO.f41248b;
                    if (cVar5.f41432y) {
                        cVar5.f41432y = false;
                        xf1.i iVar3 = cVar5.f41431x;
                        iVar3.getClass();
                        iVar3.clear();
                    }
                    xf1.i iVar4 = cVar5.f41431x;
                    if (iVar4 != null && arrayList4 != null) {
                        if (iVar4.f190687c == null) {
                            iVar4.f190687c = new ArrayList();
                        }
                        ArrayList arrayList5 = iVar4.f190687c;
                        if (arrayList5 != null) {
                            arrayList5.addAll(arrayList4);
                        }
                        iVar4.addAll(arrayList4);
                    }
                    if (arrayList4 != null && arrayList4.size() > 0) {
                        size = arrayList4.size();
                    }
                    cVar5.K6(size);
                    ArrayList arrayList6 = segmentsSummaryListDTO.f41248b;
                    com.garmin.android.apps.connectmobile.segments.presentation.c.b bVar6 = cVar5.f41430w;
                    bVar6.getClass();
                    boolean z14 = cVar5.f41432y;
                    xf1.i iVar5 = cVar5.f41431x;
                    iVar5.getClass();
                    bVar6.D8(arrayList6, z14, true ^ iVar5.isEmpty());
                } else {
                    if (i28 != 3) {
                        u0.r();
                        return null;
                    }
                    cVar5.F6();
                    i2.a.j(i2.f36769a, "MySegmentsListFragment", "Error fetching users segments: " + exc + " Error code: " + str3);
                    com.garmin.android.apps.connectmobile.segments.presentation.c.b bVar7 = cVar5.f41430w;
                    bVar7.getClass();
                    bVar7.P5();
                    if (cVar5.f41432y) {
                        cVar5.f41432y = false;
                    }
                    cVar5.J6(true);
                    lj0.b bVar8 = lj0.b.f112956j;
                    bVar8.getClass();
                    g22.e.b(cVar5, bVar8);
                }
                return Unit.INSTANCE;
            case 23:
                xh0.c cVar6 = (xh0.c) obj2;
                Double d14 = (Double) obj;
                if (d14 != null && (strValueOf = String.valueOf((int) Math.floor(d14.doubleValue()))) != null) {
                    return strValueOf;
                }
                String string = cVar6.f190978a.getString(R.string.no_value);
                string.getClass();
                return string;
            case 24:
                o oVar = (o) obj2;
                q4.c cVar7 = (q4.c) obj;
                cVar7.getClass();
                cVar7.m1();
                w.a aVar17 = w.f129023a;
                Float fValueOf = Float.valueOf(0.0f);
                d0.f128823b.getClass();
                o13.p[] pVarArr = {new o13.p(fValueOf, d0.a(d0.f128831j)), new o13.p(Float.valueOf(0.6f), d0.a(d0.f128824c))};
                o oVar2 = o.Ltr;
                o4.z0 z0VarC = w.a.c(aVar17, pVarArr, oVar == oVar2 ? 0.0f : Float.POSITIVE_INFINITY, oVar == oVar2 ? Float.POSITIVE_INFINITY : 0.0f, 8);
                q.f128930b.getClass();
                q4.f.C0(cVar7, z0VarC, 0L, 0L, 0.0f, null, q.f128936h, 62);
                return Unit.INSTANCE;
            case 25:
                com.garmin.android.apps.connectmobile.a aVar18 = (com.garmin.android.apps.connectmobile.a) obj2;
                b.s sVar2 = (b.s) obj;
                int i29 = com.garmin.android.apps.connectmobile.a.f28720a;
                sVar2.getClass();
                if (aVar18.getSupportFragmentManager().M() > 0) {
                    aVar18.getSupportFragmentManager().Z();
                } else {
                    sVar2.f(false);
                    aVar18.getOnBackPressedDispatcher().d();
                }
                return Unit.INSTANCE;
            case 26:
                ((View) obj).getClass();
                NavHostFragment.f10124e.getClass();
                NavHostFragment.a.a((com.garmin.android.apps.connectmobile.f) obj2).n();
                return Unit.INSTANCE;
            case 27:
                String str4 = (String) obj;
                int i30 = AppConfigurationViewActivity.f28625b;
                str4.getClass();
                ((AppConfigurationViewActivity) obj2).ba().f28627a.k(null, str4);
                return Unit.INSTANCE;
            case 28:
                Intent intent2 = (Intent) obj;
                int i34 = GCMCommonDeepLinkHandler.f28664a;
                intent2.getClass();
                ((GCMCommonDeepLinkHandler) obj2).startActivity(intent2);
                return Unit.INSTANCE;
            default:
                o13.p pVar2 = (o13.p) obj;
                pVar2.getClass();
                return Boolean.valueOf(((Number) pVar2.f128594a).longValue() == ((rs2.c) obj2).getF92746j());
        }
    }
}
