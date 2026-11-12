package bv2;

import am.x0;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AutoChallengeActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.TeamChallengeActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.c0;
import com.garmin.android.apps.connectmobile.leaderboard.model.a0;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts.ElevationChartFullscreenActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.settings.devices.index.InviteByEmailActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.androiddynamicsettings.app.features.controlsmenu.boundedcontrolsupport.presenter.BoundedControlsMenuActivity;
import com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.ControlsMenuActivity;
import com.garmin.androiddynamicsettings.app.features.wifi.presenter.SavedNetworksActivity;
import com.garmin.androiddynamicsettings.app.presentationlayer.SettingsActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nimbusds.jose.jwk.JWKParameterNames;
import db1.r;
import db1.t;
import h10.q;
import ig1.a1;
import ig1.b1;
import ig1.t0;
import ig1.u0;
import ig1.z0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mh1.w;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p13.u;
import p13.y;
import r22.f2;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21506d;

    public /* synthetic */ j(InviteByEmailActivity inviteByEmailActivity, String str, EditText editText) {
        this.f21503a = 21;
        this.f21504b = inviteByEmailActivity;
        this.f21506d = str;
        this.f21505c = editText;
    }

    /* JADX WARN: Code duplicated, block: B:338:0x0aeb A[PHI: r1
      0x0aeb: PHI (r1v21 org.joda.time.DateTime) = (r1v17 org.joda.time.DateTime), (r1v24 org.joda.time.DateTime) binds: [B:344:0x0afd, B:336:0x0ae8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0595, code lost:
    
        if (((uc0.d) zh2.e.a()).i() != false) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v44, types: [T, java.util.Calendar] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view2) {
        DateTime dateTimeK;
        long jLongValue;
        Unit unit;
        Unit unit2;
        Integer numValueOf;
        DateTime dateTimeAtStartOfDay;
        DateTime dateTimeAtStartOfDay2;
        List<Integer> list;
        int i14 = this.f21503a;
        int i15 = 4;
        int i16 = 10;
        int i17 = 8;
        int i18 = 2;
        boolean z14 = true;
        z14 = true;
        byte b14 = 0;
        Object obj = this.f21506d;
        Object obj2 = this.f21505c;
        Object obj3 = this.f21504b;
        switch (i14) {
            case 0:
                k kVar = (k) obj3;
                kVar.f21508a.getClass();
                String string = kVar.getContext().getString(R.string.devices_help_how_to_connect_title);
                string.getClass();
                String string2 = kVar.getContext().getString(R.string.lbl_close);
                string2.getClass();
                String string3 = kVar.getContext().getString(R.string.devices_generic_help_connect_device, (String) obj, kVar.getContext().getString(R.string.android_title));
                string3.getClass();
                androidx.fragment.app.m activity = ((Fragment) obj2).getActivity();
                if (activity == null || !cx2.g.e(activity)) {
                    return;
                }
                ew2.e.a aVar = ew2.e.f66901a;
                Context context = kVar.getContext();
                context.getClass();
                Dialog dialogA = ew2.e.a.a(aVar, context, string, string3, new o13.p(string2, new bb1.a(b14, 18)), null, 1008);
                kVar.f21514g = dialogA;
                dialogA.show();
                return;
            case 1:
                Long l14 = (Long) obj2;
                xw1.j jVar = (xw1.j) obj;
                cu1.g gVar = ((cu1.h) obj3).f55676b;
                if (gVar != null) {
                    gVar.j5(l14.longValue(), jVar);
                    return;
                }
                return;
            case 2:
                Activity activity2 = (Activity) obj3;
                PrivacyType privacyType = (PrivacyType) obj2;
                eg1.j jVar2 = eg1.j.f64004a;
                new androidx.appcompat.app.e.a(activity2).setTitle(R.string.title_activity_privacy).setMessage(activity2.getString(R.string.privacy_message_best_time, activity2.getString(privacyType.getF28797a()))).setNegativeButton(R.string.edit_activity_privacy, new bi2.k(activity2, i16, privacyType, (SegmentLeaderboardRowDTO) obj)).setPositiveButton(R.string.lbl_close, new com.garmin.android.apps.connectmobile.connectiq.i(16)).show();
                return;
            case 3:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h hVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h) obj3;
                DateTime dateTime = (DateTime) obj2;
                DateTime dateTime2 = (DateTime) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                hVar.v6();
                if (hVar.f40648p) {
                    t tVar = hVar.f40645m;
                    if (tVar == null) {
                        s.m("mUserGlucoseInputDTO");
                        throw null;
                    }
                    dateTimeK = tVar.getUserMeasurementTimestamp();
                    if (dateTimeK != null) {
                        dateTime = dateTimeK;
                    }
                } else {
                    r rVar = hVar.f40643k;
                    if (rVar == null) {
                        s.m("mUserGlucoseDTO");
                        throw null;
                    }
                    dateTimeK = rVar.getUserMeasurementTimestamp();
                    if (dateTimeK != null) {
                        dateTime = dateTimeK;
                    }
                }
                fb1.f fVar = new fb1.f(dateTime, dateTime2, hVar, i18);
                DateTime dateTime3 = new DateTime();
                Days daysDaysBetween = Days.daysBetween(dateTime, dateTime3);
                f2 f2Var = new f2(hVar.requireContext(), fVar, hVar.f40648p ? dateTime3.getHourOfDay() : dateTime.getHourOfDay(), hVar.f40648p ? dateTime3.getMinuteOfHour() : dateTime.getMinuteOfHour(), 0, 0, daysDaysBetween.getDays() > 0 ? 23 : dateTime3.getHourOfDay(), daysDaysBetween.getDays() > 0 ? 59 : dateTime3.getMinuteOfHour(), DateFormat.is24HourFormat(hVar.requireContext()));
                f2Var.show();
                Context contextRequireContext = hVar.requireContext();
                contextRequireContext.getClass();
                og.a.W(f2Var, contextRequireContext);
                Context contextRequireContext2 = hVar.requireContext();
                contextRequireContext2.getClass();
                og.a.w(f2Var, contextRequireContext2);
                return;
            case 4:
                GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) obj3;
                com.garmin.android.apps.connectmobile.strava.m mVar = (com.garmin.android.apps.connectmobile.strava.m) obj2;
                String str = (String) obj;
                com.garmin.android.apps.connectmobile.strava.m.a aVar3 = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                if (gCMComplexOneLineButton.f47771k.isChecked()) {
                    gCMComplexOneLineButton.j();
                    mVar.f45003p.add(str);
                } else {
                    gCMComplexOneLineButton.k();
                    mVar.f45003p.remove(str);
                }
                String str2 = mVar.f45004q;
                if (str2 != null) {
                    com.garmin.android.apps.connectmobile.strava.j jVar3 = new com.garmin.android.apps.connectmobile.strava.j(mVar.f45009x, str2, new hk1.o(mVar.f45003p));
                    mVar.f45008w = jVar3;
                    jVar3.b();
                    return;
                }
                return;
            case 5:
                ew2.g.a aVar4 = ew2.g.f66907a;
                String str3 = ((gw2.f) obj3).f79889a;
                aVar4.getClass();
                ew2.g.a.c(str3, (Map) obj2, (com.garmin.realtimesettings.app.presentationlayer.c) obj);
                return;
            case 6:
                m0 m0Var = (m0) obj2;
                e23.a aVar5 = (e23.a) obj;
                ((BubbleLayout) obj3).setVisibility(8);
                if (m0Var.f105804a) {
                    return;
                }
                m0Var.f105804a = true;
                aVar5.invoke();
                return;
            case 7:
                h10.f fVar2 = (h10.f) obj3;
                GroupDTO groupDTO = (GroupDTO) obj2;
                h10.c cVar = (h10.c) obj;
                ArrayList arrayList = fVar2.f80758f;
                h10.f.a aVar6 = fVar2.f80757e;
                if (aVar6 != null) {
                    if (fVar2.c(groupDTO)) {
                        fVar2.d(cVar, groupDTO.f31558a);
                        Iterator it = fVar2.f80760h.iterator();
                        while (true) {
                            jLongValue = 0;
                            if (it.hasNext()) {
                                uz0.b bVar = (uz0.b) it.next();
                                if (bVar.getGroupId() != null && bVar.getGroupId().toString().equals(groupDTO.f31558a)) {
                                    Long groupInviteId = bVar.getGroupInviteId();
                                    if (groupInviteId != null) {
                                        jLongValue = groupInviteId.longValue();
                                    }
                                }
                            }
                        }
                        long j8 = jLongValue;
                        h10.r rVar2 = (h10.r) aVar6;
                        try {
                            long j14 = Long.parseLong(groupDTO.f31558a);
                            h10.o oVar = rVar2.f80815i;
                            oVar.getClass();
                            dh.b.L(androidx.lifecycle.m.a(null, new h10.i(oVar, j14, j8, null), 3), rVar2.getViewLifecycleOwner(), new q(rVar2, groupDTO, arrayList, true ? 1 : 0));
                            return;
                        } catch (NumberFormatException unused) {
                            i2.a(a2.GENERAL, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Group Id is in a parsable long");
                            Toast.makeText(rVar2.getContext(), rVar2.getString(R.string.txt_error_occurred), 0).show();
                            return;
                        }
                    }
                    jm0.e eVar = jm0.e.f99565a;
                    GroupDTO.c cVar2 = groupDTO.f31578w;
                    GroupDTO.d dVar = groupDTO.f31568k;
                    GroupDTO.c cVar3 = GroupDTO.c.NOT_DEFINED;
                    if ((cVar2 == cVar3 || cVar2 == GroupDTO.c.INVITE_SENT) && dVar == GroupDTO.d.PUBLIC) {
                        fVar2.d(cVar, groupDTO.f31558a);
                        h10.r rVar3 = (h10.r) aVar6;
                        h10.o oVar2 = rVar3.f80815i;
                        String str4 = groupDTO.f31558a;
                        oVar2.getClass();
                        str4.getClass();
                        xy2.b.K(oVar2, new h10.l(oVar2, str4, null)).f(rVar3.getViewLifecycleOwner(), new q(rVar3, groupDTO, arrayList, b14));
                        return;
                    }
                    if (cVar2 == cVar3) {
                        GroupDTO.d dVar2 = GroupDTO.d.NOT_DEFINED;
                    }
                    i.c cVar4 = fVar2.f80753a;
                    String string4 = cVar4.getString(R.string.msg_group_join_request_approval_required);
                    a73.f fVar3 = new a73.f(fVar2, 19, cVar, groupDTO);
                    q1.f41066b.getClass();
                    q1 q1VarA = q1.b.a(R.string.lbl_approval_required, string4, R.string.lbl_request, R.string.lbl_cancel, fVar3);
                    fVar2.f80759g = q1VarA;
                    q1VarA.show(cVar4.getSupportFragmentManager(), "request_invite_dialog_tag");
                    return;
                }
                return;
            case 8:
                u0 u0Var = (u0) obj3;
                String[] strArr = (String[]) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar4 = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i19 = u0.f93414j;
                rk1.b.e eVar2 = new rk1.b.e(u0Var.f70343a);
                eVar2.h(strArr, false);
                eVar2.e(0);
                Object obj4 = fVar4.f34132b.get("cadenceAlertCustomHighValue");
                eVar2.c(Integer.valueOf(u.M(strArr, String.valueOf(obj4 instanceof Integer ? (Integer) obj4 : null))));
                eVar2.d(strArr.length - 1);
                eVar2.f153344b.f153345a = 1;
                eVar2.f153344b.f153346b = u0Var.b(R.string.lbl_strokes_per_minute);
                eVar2.f(new t0(strArr, b14, fVar4, u0Var));
                eVar2.b().show();
                return;
            case 9:
                z0 z0Var = (z0) obj3;
                String[] strArr2 = (String[]) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar5 = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i24 = z0.f93431j;
                rk1.b.e eVar3 = new rk1.b.e(z0Var.f70343a);
                eVar3.h(strArr2, false);
                eVar3.e(0);
                Object obj5 = fVar5.f34132b.get("cadenceAlertCustomLowValue");
                eVar3.c(Integer.valueOf(u.M(strArr2, String.valueOf(obj5 instanceof Integer ? (Integer) obj5 : null))));
                eVar3.d(strArr2.length - 1);
                rk1.b.d dVar3 = eVar3.f153344b;
                dVar3.f153345a = 1;
                dVar3.f153346b = z0Var.b(R.string.lbl_strokes_per_minute);
                eVar3.f(new t0(strArr2, true ? 1 : 0, fVar5, z0Var));
                eVar3.b().show();
                return;
            case 10:
                b1 b1Var = (b1) obj3;
                com.garmin.android.apps.connectmobile.devices.model.f fVar6 = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i25 = b1.f93287k;
                rk1.b.e eVar4 = new rk1.b.e(b1Var.f70343a);
                eVar4.h((String[]) ((ArrayList) obj2).toArray(new String[0]), true);
                eVar4.g(fVar6.f34132b.containsKey("caloriesAlertValue") ? "100" : String.valueOf(fVar6.H()));
                eVar4.i("500");
                eVar4.j("50");
                rk1.b.d dVar4 = eVar4.f153344b;
                dVar4.f153345a = 1;
                dVar4.f153346b = b1Var.b(R.string.lbl_calories);
                eVar4.f(new a1(b14, b1Var, fVar6));
                eVar4.b().show();
                return;
            case 11:
                ig1.f2 f2Var2 = (ig1.f2) obj3;
                lo.i iVarT6 = lo.i.T6(f2Var2.f93318k, 5, x0.f4313o1, null, lo.i.b.SWIM_PACE);
                iVarT6.Y0 = new hc0.c(6, f2Var2, (com.garmin.android.apps.connectmobile.devices.model.f) obj);
                iVarT6.show(((i.c) obj2).getSupportFragmentManager(), iVarT6.getTag());
                return;
            case 12:
                com.garmin.feature.garminpay.ui.dev.devices.a aVar7 = (com.garmin.feature.garminpay.ui.dev.devices.a) obj3;
                ImageView imageView = ((com.garmin.feature.garminpay.ui.dev.devices.a.c) obj2).f51940m;
                Logger logger = com.garmin.feature.garminpay.ui.dev.devices.a.f51918i;
                aVar7.getClass();
                PopupMenu popupMenu = new PopupMenu(aVar7.f51919a, imageView);
                popupMenu.getMenuInflater().inflate(R.menu.menu_device_card_item, popupMenu.getMenu());
                popupMenu.show();
                return;
            case 13:
                Context context2 = (Context) obj3;
                sy0.l lVar = (sy0.l) obj2;
                i53.c cVar5 = (i53.c) obj;
                ElevationChartFullscreenActivity.f39227a.getClass();
                context2.getClass();
                lVar.getClass();
                Intent intent = new Intent(context2, (Class<?>) ElevationChartFullscreenActivity.class);
                intent.putExtra("extra_elevation_data", lVar);
                if (cVar5 != null) {
                    intent.putParcelableArrayListExtra("extra_activities", new ArrayList<>(cVar5));
                }
                context2.startActivity(intent);
                return;
            case 14:
                com.garmin.android.apps.connectmobile.contacts.emergency.b.C0535b c0535b = (com.garmin.android.apps.connectmobile.contacts.emergency.b.C0535b) obj3;
                com.garmin.android.apps.connectmobile.contacts.a aVar8 = (com.garmin.android.apps.connectmobile.contacts.a) obj;
                ImageView imageView2 = c0535b.f32624c;
                imageView2.getClass();
                imageView2.setVisibility(0);
                TextView textView = c0535b.f32625d;
                textView.getClass();
                textView.setVisibility(8);
                com.garmin.android.apps.connectmobile.contacts.emergency.b.c cVar6 = ((com.garmin.android.apps.connectmobile.contacts.emergency.b) obj2).f32620a;
                if (cVar6 != null) {
                    cVar6.q5(aVar8);
                    return;
                }
                return;
            case 15:
                com.garmin.android.apps.connectmobile.c cVar7 = (com.garmin.android.apps.connectmobile.c) obj3;
                j22.a[] aVarArr = (j22.a[]) obj2;
                androidx.appcompat.app.e eVar5 = (androidx.appcompat.app.e) obj;
                j22.b bVar2 = j22.b.f96736a;
                ArrayList arrayList2 = new ArrayList(aVarArr.length);
                for (j22.a aVar9 : aVarArr) {
                    arrayList2.add(aVar9.f96735b);
                }
                bVar2.getClass();
                j22.b.s(cVar7, arrayList2, 1);
                j22.b.f96738c = System.currentTimeMillis();
                z6.a.a(cVar7, (String[]) arrayList2.toArray(new String[0]), 1);
                eVar5.dismiss();
                return;
            case 16:
                LocalDate localDate = (LocalDate) obj2;
                db1.m mVar2 = (db1.m) obj;
                jx0.g.a aVar10 = jx0.g.E;
                ax0.a aVar11 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                Context contextRequireContext3 = ((jx0.g) obj3).requireContext();
                contextRequireContext3.getClass();
                if (mVar2.getDeliveryDate() == null && mVar2.getEndDate() == null) {
                    z14 = false;
                }
                aVar11.C(contextRequireContext3, localDate, z14, mVar2);
                return;
            case 17:
                Fragment fragment = (Fragment) obj2;
                ii2.b bVar3 = (ii2.b) obj3;
                Map<String, ? extends Object> map = (Map) obj;
                bVar3.getClass();
                androidx.fragment.app.m activity3 = fragment.getActivity();
                if (!(activity3 instanceof com.garmin.androiddynamicsettings.app.presentationlayer.b)) {
                    activity3 = null;
                }
                com.garmin.androiddynamicsettings.app.presentationlayer.b bVar4 = (com.garmin.androiddynamicsettings.app.presentationlayer.b) activity3;
                if (bVar4 == null || !bVar4.S9()) {
                    if (bVar4 == null) {
                        zh2.e.f204807a.getClass();
                        break;
                    }
                    kh2.d.f104785b.getClass();
                    return;
                }
                String strD4 = bVar3.D4(map);
                if (strD4 != null) {
                    kh2.d.f104785b.a("setSingleLabelClickListener: External " + strD4 + " clicked.");
                    kh2.k.f104801a.getClass();
                    kh2.k.a.b(strD4, map, bVar3, fragment);
                    Unit unit3 = Unit.INSTANCE;
                    return;
                }
                Map<String, Object> mapZ4 = bVar3.z4(map);
                if (mapZ4 != null) {
                    kh2.d.f104785b.a("setSingleLabelClickListener: Children Options clicked.");
                    kh2.k.f104801a.getClass();
                    kh2.k.a.a(fragment, bVar3, map, mapZ4);
                    Unit unit4 = Unit.INSTANCE;
                    return;
                }
                String strF4 = bVar3.F4(map);
                if (strF4 != null) {
                    kh2.d.f104785b.a("setSingleLabelClickListener: Section " + strF4 + " clicked.");
                    kh2.k.f104801a.getClass();
                    kh2.k.a.c(fragment, strF4);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    Object obj6 = map.get(mh2.i.NAVIGATION.f118617a);
                    if (!(obj6 instanceof Map)) {
                        obj6 = null;
                    }
                    Map map2 = (Map) obj6;
                    Object obj7 = map2 != null ? map2.get(mh2.i.CUSTOM.f118617a) : null;
                    String string5 = obj7 != null ? obj7.toString() : null;
                    bVar3.f93792b.getClass();
                    if (string5 != null) {
                        kh2.d.f104785b.a("setSingleLabelClickListener: Custom " + string5 + " clicked.");
                        kh2.k.f104801a.getClass();
                        nh2.d dVar5 = bVar3.f93791a;
                        kh2.k.f104802b.getClass();
                        androidx.fragment.app.m activity4 = fragment.getActivity();
                        if (activity4 != null) {
                            if (string5.equals(mh2.d.CONTROLS.f118541a)) {
                                Intent intent2 = new Intent(activity4, (Class<?>) ControlsMenuActivity.class);
                                Object objD = dVar5.d(mh2.i.CONTROLS_MENU_LIST.f118617a);
                                if (!(objD instanceof List)) {
                                    objD = null;
                                }
                                List<Map> list2 = (List) objD;
                                ArrayList arrayList3 = new ArrayList();
                                if (list2 != null) {
                                    for (Map map3 : list2) {
                                        Object obj8 = map3.get(mh2.i.ID.f118617a);
                                        if (!(obj8 instanceof String)) {
                                            obj8 = null;
                                        }
                                        String str5 = (String) obj8;
                                        String str6 = str5 == null ? "" : str5;
                                        Object obj9 = map3.get(mh2.i.INDEX.f118617a);
                                        if (obj9 != null) {
                                            hi2.a.C1658a c1658a = hi2.a.f83879a;
                                            String string6 = obj9.toString();
                                            c1658a.getClass();
                                            numValueOf = Integer.valueOf(hi2.a.C1658a.h(string6));
                                        } else {
                                            numValueOf = null;
                                        }
                                        Object obj10 = map3.get(mh2.i.REQUIRED.f118617a);
                                        if (!(obj10 instanceof Boolean)) {
                                            obj10 = null;
                                        }
                                        arrayList3.add(new sh2.a(str6, numValueOf, (Boolean) obj10, null, null, 24, null));
                                    }
                                }
                                intent2.putExtra("SETTINGS_CONTROLS_MENU_BUNDLE", arrayList3);
                                intent2.putExtra("VIEW_ATTR_BUNDLE", bVar3.A4(map));
                                activity4.startActivityForResult(intent2, 9631);
                            } else if (string5.equals(mh2.d.CONTROLS_BOUNDED.f118541a)) {
                                Intent intent3 = new Intent(activity4, (Class<?>) BoundedControlsMenuActivity.class);
                                Object objD2 = dVar5.d(mh2.i.CONTROLS_MENU_LIST.f118617a);
                                if (!(objD2 instanceof List)) {
                                    objD2 = null;
                                }
                                oh2.b.f132168a.getClass();
                                intent3.putExtra("SETTINGS_CONTROLS_MENU_BUNDLE", oh2.b.a((List) objD2));
                                intent3.putExtra("VIEW_ATTR_BUNDLE", bVar3.A4(map));
                                activity4.startActivityForResult(intent3, 9631);
                            } else if (string5.equals(mh2.d.WIFI.f118541a)) {
                                SavedNetworksActivity.f50668m.getClass();
                                activity4.startActivity(new Intent(activity4, (Class<?>) SavedNetworksActivity.class));
                            } else {
                                activity4.startActivity(new Intent(activity4, (Class<?>) SettingsActivity.class));
                            }
                            unit2 = Unit.INSTANCE;
                        } else {
                            unit2 = null;
                        }
                        if (unit2 == null) {
                            Toast.makeText(fragment.requireContext(), fragment.getString(R.string.txt_something_went_wrong_try_again), 0).show();
                        }
                        Unit unit5 = Unit.INSTANCE;
                        return;
                    }
                    return;
                }
                return;
            case 18:
                Fragment fragment2 = (Fragment) obj2;
                ei2.j jVar4 = (ei2.j) obj3;
                lh2.r rVar4 = (lh2.r) obj;
                androidx.fragment.app.m activity5 = fragment2.getActivity();
                com.garmin.androiddynamicsettings.app.presentationlayer.b bVar5 = (com.garmin.androiddynamicsettings.app.presentationlayer.b) (activity5 instanceof com.garmin.androiddynamicsettings.app.presentationlayer.b ? activity5 : null);
                if (bVar5 == null || !bVar5.S9()) {
                    if (bVar5 != null) {
                        return;
                    }
                    zh2.e.f204807a.getClass();
                    if (!((uc0.d) zh2.e.a()).i()) {
                        return;
                    }
                }
                kh2.d.f104785b.a("setSingleLabelViewWithAccessoryClickListener: " + s0.f105811a.b(jVar4.getClass()).D());
                jVar4.s(fragment2, rVar4);
                return;
            case 19:
                View view3 = (View) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a.C0772a c0772a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a.f40930t;
                ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a) obj3).A6().debug("Hiding pregnancy tooltip");
                i52.a.f91796a.getClass();
                i52.a.f91797b.edit().putBoolean(i52.a.c(R.string.key_pregnancy_show_tool_tip), false).apply();
                ((BubbleLayout) obj2).setVisibility(8);
                view3.setOnClickListener(null);
                view3.setVisibility(8);
                return;
            case 20:
                lh2.e eVar6 = (lh2.e) obj3;
                int i26 = lh2.e.f112471j;
                String str7 = ((ei2.i.a) ((ei2.i) obj)).f64390a;
                String string7 = eVar6.getContext().getString(R.string.devices_help_how_to_connect_title);
                string7.getClass();
                String string8 = eVar6.getContext().getString(R.string.lbl_close);
                string8.getClass();
                String string9 = eVar6.getContext().getString(R.string.devices_generic_help_connect_device, str7, eVar6.getContext().getString(R.string.os_name_android));
                string9.getClass();
                androidx.fragment.app.m activity6 = ((Fragment) obj2).getActivity();
                if (activity6 == null || !hi2.c.a(activity6)) {
                    return;
                }
                kh2.g.a aVar12 = kh2.g.f104792a;
                Context context3 = eVar6.getContext();
                context3.getClass();
                Dialog dialogA2 = kh2.g.a.a(aVar12, context3, string7, string9, new o13.p(string8, lh2.f.f112490a), null, 496);
                eVar6.f112478h = dialogA2;
                dialogA2.show();
                return;
            case 21:
                InviteByEmailActivity inviteByEmailActivity = (InviteByEmailActivity) obj3;
                String str8 = (String) obj;
                EditText editText = (EditText) obj2;
                InviteByEmailActivity.a aVar13 = InviteByEmailActivity.f43034c;
                String str9 = str8 == null ? "" : str8;
                String string10 = editText.getText().toString();
                if (string10 == null || string10.length() == 0) {
                    inviteByEmailActivity.ca();
                    return;
                } else {
                    ((w) inviteByEmailActivity.f43036b.getValue()).y4(new com.garmin.android.apps.connectmobile.smartscale.model.b(null, str9, Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), null, null, null, string10, com.garmin.android.apps.connectmobile.smartscale.model.d.INVITED, null, null, null, null, null, null, null, null, 65337, null), new hi0.a(null, string10, null, null, null, null, null, null, null, 509, null), false);
                    return;
                }
            case 22:
                Context context4 = (Context) obj3;
                a0 a0Var = (a0) obj2;
                c0.a aVar14 = (c0.a) obj;
                int i27 = c0.a.f37386n;
                Activity activity7 = context4 instanceof Activity ? (Activity) context4 : null;
                if (activity7 == null) {
                    return;
                }
                switch (c0.a.C0669a.f37400a[a0Var.G().ordinal()]) {
                    case 1:
                        String strH = a0Var.getUuid();
                        if (strH == null) {
                            return;
                        }
                        activity7.startActivityForResult(AdHocChallengeDetailsActivity.a.b(AdHocChallengeDetailsActivity.f37168h, activity7, strH, null, 12), 7);
                        return;
                    case 2:
                        String strH2 = a0Var.getUuid();
                        if (strH2 == null) {
                            return;
                        }
                        AdHocChallengeDetailsActivity.a aVar15 = AdHocChallengeDetailsActivity.f37168h;
                        boolean zG0 = a0Var.g0();
                        aVar15.getClass();
                        AdHocChallengeDetailsActivity.a.d(activity7, strH2, null, zG0, true);
                        return;
                    case 3:
                        AutoChallengeActivity.f37184c.getClass();
                        Intent intent4 = new Intent(activity7, (Class<?>) AutoChallengeActivity.class);
                        intent4.putExtra("GCM_show_current_challenge", false);
                        activity7.startActivity(intent4);
                        return;
                    case 4:
                        String strH3 = a0Var.getUuid();
                        if (strH3 == null) {
                            return;
                        }
                        aVar14.f37397k.k(activity7, strH3);
                        return;
                    case 5:
                        String strH4 = a0Var.getUuid();
                        if (strH4 == null) {
                            return;
                        }
                        TeamChallengeActivity.a aVar16 = TeamChallengeActivity.f37278g;
                        String strU = a0Var.getInviteId();
                        boolean zG1 = a0Var.g0();
                        boolean zI0 = a0Var.i0();
                        aVar16.getClass();
                        TeamChallengeActivity.a.c(activity7, strH4, strU, zG1, zI0);
                        return;
                    case 6:
                        BadgeChallengeDetailsActivity.a aVar17 = BadgeChallengeDetailsActivity.f37204e;
                        String strH5 = a0Var.getUuid();
                        aVar17.getClass();
                        activity7.startActivityForResult(BadgeChallengeDetailsActivity.a.a(activity7, strH5), 7);
                        return;
                    default:
                        return;
                }
            case 23:
                np2.c cVar8 = (np2.c) obj3;
                Context context5 = (Context) obj2;
                kp2.a aVar18 = (kp2.a) obj;
                TextInputEditText textInputEditText = cVar8.f126873b;
                TextInputLayout textInputLayout = cVar8.f126872a;
                Editable editableText = textInputEditText.getEditableText();
                String string11 = editableText != null ? editableText.toString() : null;
                textInputLayout.requestFocus();
                if (string11 == null || string11.length() == 0) {
                    textInputLayout.setError(context5.getString(R.string.verification_empty_code));
                    return;
                }
                textInputLayout.setError(null);
                view2.getBackground().setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
                view2.setClickable(false);
                textInputEditText.setEnabled(false);
                aVar18.invoke(string11);
                return;
            case 24:
                db1.m mVar3 = (db1.m) obj3;
                pb1.l lVar2 = (pb1.l) obj2;
                androidx.fragment.app.m mVar4 = (androidx.fragment.app.m) obj;
                pb1.l.a aVar19 = pb1.l.f136861l;
                if (mVar3.getDueDate() != null) {
                    LocalDate pregnancyCycleStart = mVar3.getPregnancyCycleStart();
                    if (pregnancyCycleStart == null || (dateTimeAtStartOfDay = pregnancyCycleStart.toDateTimeAtStartOfDay()) == null) {
                        dateTimeAtStartOfDay = LocalDate.now().toDateTimeAtStartOfDay();
                    }
                    int days = Days.daysBetween(dateTimeAtStartOfDay, LocalDate.now().toDateTimeAtStartOfDay()).getDays();
                    String.valueOf(days);
                    if (days > 293) {
                        String string12 = lVar2.getString(R.string.pregnancy_old_due_date);
                        string12.getClass();
                        String string13 = lVar2.getString(R.string.pregnancy_old_due_date_message);
                        string13.getClass();
                        o13.p pVar = new o13.p(lVar2.getString(R.string.lbl_cancel), new pa0.a(i15));
                        o13.p pVar2 = new o13.p("Stop Tracking", new ov1.q(lVar2, i17));
                        c22.f fVar7 = c22.f.f23050a;
                        Context contextRequireContext4 = lVar2.requireContext();
                        contextRequireContext4.getClass();
                        fVar7.getClass();
                        androidx.appcompat.app.e eVarB = c22.f.b(contextRequireContext4, string12, string13, pVar2, pVar, null, false);
                        eVarB.setOnShowListener(new c22.e(lVar2, i15));
                        eVarB.show();
                        return;
                    }
                    LocalDate pregnancyCycleStart2 = mVar3.getPregnancyCycleStart();
                    if (pregnancyCycleStart2 == null || (dateTimeAtStartOfDay2 = pregnancyCycleStart2.toDateTimeAtStartOfDay()) == null) {
                        dateTimeAtStartOfDay2 = LocalDate.now().toDateTimeAtStartOfDay();
                    }
                    LocalDate dueDate = mVar3.getDueDate();
                    DateTime dateTimeAtStartOfDay3 = dueDate != null ? dueDate.toDateTimeAtStartOfDay() : null;
                    DateTime dateTimeAtStartOfDay4 = LocalDate.now().toDateTimeAtStartOfDay();
                    r0 r0Var = new r0();
                    r0Var.f105810a = dateTimeAtStartOfDay4 != null ? dateTimeAtStartOfDay4.toCalendar(Locale.getDefault()) : 0;
                    MutableDateTime mutableDateTime = LocalDate.now().toDateTimeAtStartOfDay().toMutableDateTime();
                    mutableDateTime.getClass();
                    new MutableDateTime();
                    LocalDate pregnancyCycleStart3 = mVar3.getPregnancyCycleStart();
                    if (pregnancyCycleStart3 != null) {
                        DateTime dateTimeAtStartOfDay5 = pregnancyCycleStart3.toDateTimeAtStartOfDay();
                        MutableDateTime mutableDateTime2 = dateTimeAtStartOfDay5 != null ? dateTimeAtStartOfDay5.toMutableDateTime() : null;
                        mutableDateTime2.getClass();
                        int days2 = Days.daysBetween(dateTimeAtStartOfDay2, dateTimeAtStartOfDay3).getDays();
                        mutableDateTime2.addDays(days2 < 14 ? 293 - (14 - days2) : 293);
                        mutableDateTime = mutableDateTime2;
                    } else {
                        mutableDateTime.addDays(279);
                    }
                    long millis = LocalDate.now().toDateTimeAtStartOfDay().getMillis();
                    long jMax = Math.max(millis, mutableDateTime.getMillis());
                    if (dateTimeAtStartOfDay3 != null && dateTimeAtStartOfDay3.compareTo((ReadableInstant) mutableDateTime) < 0) {
                        r0Var.f105810a = dateTimeAtStartOfDay3.toCalendar(Locale.getDefault());
                    }
                    Calendar calendar = (Calendar) r0Var.f105810a;
                    if (calendar != null) {
                        Calendar calendar2 = Calendar.getInstance(Locale.getDefault());
                        calendar.set(10, calendar2.get(10));
                        calendar.set(12, calendar2.get(12));
                        calendar.set(13, calendar2.get(13));
                        calendar.set(9, calendar2.get(9));
                    }
                    new r22.c0(mVar4, millis, jMax, (Calendar) r0Var.f105810a, new p62.e(lVar2, 5, r0Var, mVar3)).show();
                    return;
                }
                return;
            case 25:
                pk1.u uVar = (pk1.u) obj3;
                gg1.m[] mVarArr = (gg1.m[]) obj;
                pk1.u.a aVar20 = pk1.u.E;
                rk1.b.e eVar7 = new rk1.b.e(uVar.getActivity());
                eVar7.h((String[]) obj2, false);
                String string14 = uVar.getString(R.string.lbl_first_day_of_the_week);
                rk1.b.d dVar6 = eVar7.f153344b;
                dVar6.f153346b = string14;
                eVar7.e(0);
                eVar7.d(2);
                dVar6.f153345a = 1;
                eVar7.c(Integer.valueOf(u.M(mVarArr, uVar.B.e1())));
                eVar7.f(new a1(i18, mVarArr, uVar));
                eVar7.a();
                return;
            case 26:
                ((qh1.o) obj3).f144754d.invoke((Double) obj2, (String) obj);
                return;
            case 27:
                androidx.appcompat.app.e eVar8 = (androidx.appcompat.app.e) obj3;
                int i28 = DashboardActivity.f33444q;
                eVar8.getClass();
                ge1.b.T(f0.w(eVar8), null, null, new r70.m((s92.g) obj, null), 3);
                eVar8.dismiss();
                ((e23.a) obj2).invoke();
                return;
            case 28:
                sv2.a aVar21 = (sv2.a) obj3;
                rv2.a aVar22 = (rv2.a) obj2;
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                int i29 = rv2.a.b.f154760c;
                if (aVar21.f161032c) {
                    return;
                }
                dx2.c cVar9 = aVar22.f154758g;
                Context context6 = appCompatImageView.getContext();
                context6.getClass();
                cVar9.c5(context6, gw2.j.WATCH_FACE_GRID, aVar22.f154754c, Integer.valueOf(aVar21.f161030a), new dv0.n(i18));
                return;
            default:
                td1.d dVar7 = (td1.d) obj3;
                pd1.b bVar6 = (pd1.b) obj2;
                int i30 = ((wd1.a) obj).f184373b;
                boolean z15 = dVar7.f163900c;
                dVar7.f163900c = !z15;
                dVar7.f163899b.setVisibility(z15 ? 4 : 0);
                if (s.g(bVar6.getOccurrence(), "DAILY")) {
                    ArrayList arrayList4 = new ArrayList();
                    w13.c cVar10 = wd1.a.f184371l;
                    ArrayList arrayList5 = new ArrayList(y.r(cVar10, 10));
                    Iterator<T> it3 = cVar10.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(Integer.valueOf(((wd1.a) it3.next()).f184373b));
                    }
                    arrayList4.addAll(arrayList5);
                    arrayList4.remove(Integer.valueOf(i30));
                    bVar6.q(arrayList4);
                    bVar6.o("WEEKLY");
                    return;
                }
                List<Integer> listF = bVar6.f();
                if (listF != null && listF.contains(Integer.valueOf(i30))) {
                    ArrayList arrayList6 = new ArrayList();
                    List<Integer> listF2 = bVar6.f();
                    if (listF2 == null) {
                        list = listF2;
                        list = j0.f134944a;
                    }
                    list = listF2;
                    arrayList6.addAll(list);
                    arrayList6.remove(Integer.valueOf(i30));
                    if (arrayList6.size() == 0) {
                        arrayList6.add(0);
                    }
                    bVar6.q(arrayList6);
                    return;
                }
                ArrayList arrayList7 = new ArrayList();
                List<Integer> listF3 = bVar6.f();
                if (listF3 != null) {
                    arrayList7.addAll(listF3);
                    arrayList7.add(Integer.valueOf(i30));
                    arrayList7.remove((Object) 0);
                }
                bVar6.q(arrayList7);
                List<Integer> listF4 = bVar6.f();
                if (listF4 != null) {
                    w13.c cVar11 = wd1.a.f184371l;
                    ArrayList arrayList8 = new ArrayList(y.r(cVar11, 10));
                    Iterator<T> it4 = cVar11.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(Integer.valueOf(((wd1.a) it4.next()).f184373b));
                    }
                    if (listF4.containsAll(arrayList8)) {
                        bVar6.o("DAILY");
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ j(Fragment fragment, Object obj, Object obj2, int i14) {
        this.f21503a = i14;
        this.f21505c = fragment;
        this.f21504b = obj;
        this.f21506d = obj2;
    }

    public /* synthetic */ j(Object obj, int i14, Object obj2, Object obj3) {
        this.f21503a = i14;
        this.f21504b = obj;
        this.f21505c = obj2;
        this.f21506d = obj3;
    }

    public /* synthetic */ j(lh2.e eVar, Fragment fragment, ei2.i iVar, ei2.d dVar) {
        this.f21503a = 20;
        this.f21504b = eVar;
        this.f21505c = fragment;
        this.f21506d = iVar;
    }
}
