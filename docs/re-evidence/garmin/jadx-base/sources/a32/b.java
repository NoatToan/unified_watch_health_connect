package a32;

import a73.j;
import am.b1;
import am.x0;
import am.z0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import aq.c2;
import au1.h;
import c22.q0;
import c22.s3;
import c32.k;
import c62.p;
import ch1.w1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.TrimActivityChartFullScreenActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppDetailsActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppStoreActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDeviceListActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDeviceRedirectActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity;
import com.garmin.android.apps.connectmobile.connectiq.o;
import com.garmin.android.apps.connectmobile.devices.setup.BLEDeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.devices.setup.DeviceSetupProgressListViewFragment;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.WheelPicker;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.f;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.fragments.EventListFragment;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import fu1.r;
import hb2.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m52.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p13.y;
import r22.p0;
import wt1.q;
import z10.e1;
import z10.h1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f926b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f925a = i14;
        this.f926b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:184:0x0519  */
    /* JADX WARN: Code duplicated, block: B:187:0x0528  */
    /* JADX WARN: Code duplicated, block: B:193:0x054e A[LOOP:3: B:191:0x0548->B:193:0x054e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:256:0x0535 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, o13.l] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        yt1.c cVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        h hVar;
        h hVar2;
        h hVar3;
        q atpDay;
        String str;
        yt1.c cVar2;
        yt1.c cVar3;
        WorkoutDetailsDTO workoutDetailsDTO;
        String str2;
        List<h0> arrayList3;
        l lVar;
        v supportFragmentManager;
        int i14 = this.f925a;
        int i15 = 6;
        int i16 = 2;
        int i17 = 4;
        boolean z14 = true;
        h hVar4 = null;
        Object obj = this.f926b;
        switch (i14) {
            case 0:
                c cVar4 = (c) obj;
                int i18 = c.f927f;
                cVar4.f929b = ((c.b) view2.getTag()).f938e;
                cVar4.notifyDataSetChanged();
                return;
            case 1:
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                j22.b bVar = j22.b.f96736a;
                m mVarRequireActivity = ((com.garmin.android.apps.connectmobile.settings.notifications.b) obj).requireActivity();
                mVarRequireActivity.getClass();
                bVar.getClass();
                j22.b.r(mVarRequireActivity);
                return;
            case 2:
                com.garmin.android.apps.connectmobile.settings.thirdparty.a aVar2 = (com.garmin.android.apps.connectmobile.settings.thirdparty.a) obj;
                com.garmin.android.apps.connectmobile.settings.thirdparty.a.C0822a c0822a = com.garmin.android.apps.connectmobile.settings.thirdparty.a.f43960g;
                q1.b bVar2 = q1.f41066b;
                String string = aVar2.getString(R.string.social_office365_settings_disconnect_message);
                string.getClass();
                j jVar = new j(aVar2, i15);
                bVar2.getClass();
                q1 q1VarA = q1.b.a(0, string, R.string.common_disconnect, R.string.lbl_close, jVar);
                aVar2.f43963c = q1VarA;
                v childFragmentManager = aVar2.getChildFragmentManager();
                childFragmentManager.getClass();
                q1VarA.v6(childFragmentManager, "office_disconnect_cancellation");
                return;
            case 3:
                ak1.c cVar5 = ((com.garmin.android.apps.connectmobile.settings.thirdparty.c) obj).f43973a;
                if (cVar5 != null) {
                    cVar5.R2();
                    return;
                }
                return;
            case 4:
                b1 b1Var = (b1) obj;
                int i19 = b1Var.f3872g;
                if (i19 == -1) {
                    z14 = false;
                } else {
                    x0 x0Var = (x0) b1Var.getItem(i19);
                    x0 x0Var2 = (x0) b1Var.getItem(((b1.c) view2.getTag()).f3879f);
                    boolean z15 = b1Var.f3867b;
                    if (z15 && b1Var.f3868c) {
                        x0 x0VarD = z0.d(x0Var, x0Var);
                        x0 x0VarD2 = z0.d(x0Var2, x0Var2);
                        if (x0VarD != x0VarD2) {
                            b1Var.f3869d = true;
                        } else if (x0VarD == x0VarD2 && x0Var != x0Var2) {
                            b1Var.f3869d = false;
                        }
                        z14 = b1Var.f3869d;
                    } else if (!z15 || x0Var == x0Var2) {
                        z14 = false;
                    }
                }
                if (z14) {
                    new e.a(view2.getContext()).setTitle(R.string.lbl_change_activity_type_title).setMessage(b1Var.f3869d ? R.string.change_event_type_message : R.string.lbl_change_activity_type_message).setNegativeButton(R.string.common_cancel, new ag0.e(b1Var)).setPositiveButton(R.string.lbl_common_continue, new ag0.d(i16, b1Var, view2)).show();
                    return;
                } else {
                    b1Var.a(view2);
                    return;
                }
            case 5:
                ((c2) obj).T();
                return;
            case 6:
                com.garmin.android.apps.connectmobile.startup.a aVar3 = (com.garmin.android.apps.connectmobile.startup.a) obj;
                com.garmin.android.apps.connectmobile.startup.a.b bVar3 = aVar3.f44799a;
                if (bVar3 != null) {
                    String str3 = aVar3.f44800b;
                    aVar3.getArguments();
                    bVar3.X1(str3);
                    return;
                }
                return;
            case 7:
                com.garmin.android.apps.connectmobile.startup.m mVar = (com.garmin.android.apps.connectmobile.startup.m) obj;
                EditText editText = mVar.f44903a;
                if (editText == null) {
                    s.m("userNameEditText");
                    throw null;
                }
                String string2 = editText.getText().toString();
                com.garmin.android.apps.connectmobile.userprofile.model.m mVar2 = mVar.f44904b;
                if (mVar2 != null) {
                    if (TextUtils.isEmpty(string2)) {
                        string2 = mVar2.getDisplayName();
                    }
                    ((com.garmin.android.apps.connectmobile.startup.e) mVar.f44905c.getValue()).x4(com.garmin.android.apps.connectmobile.userprofile.model.m.b(mVar2, string2));
                    return;
                }
                return;
            case 8:
                com.garmin.android.apps.connectmobile.training.atp.create.steps.e eVar = (com.garmin.android.apps.connectmobile.training.atp.create.steps.e) obj;
                com.garmin.android.apps.connectmobile.training.atp.create.steps.e.a aVar4 = com.garmin.android.apps.connectmobile.training.atp.create.steps.e.f45264m;
                ArrayList<h> arrayList4 = eVar.f13023j;
                int size = arrayList4.size();
                for (int i24 = 0; i24 < size; i24++) {
                    h hVar5 = arrayList4.get(i24);
                    hVar5.getClass();
                    h hVar6 = hVar5;
                    if (i24 == 0) {
                        h hVar7 = arrayList4.get(arrayList4.size() - 1);
                        hVar7.getClass();
                        hVar = hVar7;
                        h hVar8 = arrayList4.get(i24 + 1);
                        hVar8.getClass();
                        hVar2 = hVar8;
                    } else if (i24 == arrayList4.size() - 1) {
                        h hVar9 = arrayList4.get(i24 - 1);
                        hVar9.getClass();
                        hVar = hVar9;
                        h hVar10 = arrayList4.get(0);
                        hVar10.getClass();
                        hVar2 = hVar10;
                    } else {
                        h hVar11 = arrayList4.get(i24 - 1);
                        hVar11.getClass();
                        hVar = hVar11;
                        h hVar12 = arrayList4.get(i24 + 1);
                        hVar12.getClass();
                        hVar2 = hVar12;
                    }
                    if (hVar.isChecked() && hVar6.isChecked() && hVar2.isChecked()) {
                        if (eVar.G6() <= 4 && eVar.f45266l) {
                            String string3 = eVar.getString(R.string.lbl_consecutive_workouts, "3");
                            string3.getClass();
                            String string4 = eVar.getString(R.string.msg_consecutive_workouts, "3");
                            string4.getClass();
                            new e.a(eVar.requireActivity()).setTitle(string3).setMessage(string4).setPositiveButton(R.string.lbl_dismiss, (DialogInterface.OnClickListener) null).show();
                            eVar.f45266l = false;
                            return;
                        }
                        cVar = eVar.f45248a;
                        if (cVar != null) {
                            arrayList = new ArrayList();
                            for (h hVar13 : arrayList4) {
                                if (hVar13.isChecked()) {
                                    arrayList.add(hVar13);
                                }
                            }
                            arrayList2 = new ArrayList(y.r(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((h) it.next()).getAtpDay().f187130a);
                            }
                            cVar.i(arrayList2);
                            return;
                        }
                        return;
                    }
                }
                cVar = eVar.f45248a;
                if (cVar != null) {
                    arrayList = new ArrayList();
                    while (r11.hasNext()) {
                        if (hVar13.isChecked()) {
                            arrayList.add(hVar13);
                        }
                    }
                    arrayList2 = new ArrayList(y.r(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((h) it.next()).getAtpDay().f187130a);
                    }
                    cVar.i(arrayList2);
                    return;
                }
                return;
            case 9:
                f fVar = (f) obj;
                f.a aVar5 = f.f45267k;
                for (h hVar14 : fVar.f13023j) {
                    if (hVar14.isChecked()) {
                        hVar4 = hVar14;
                        hVar3 = hVar4;
                        if (hVar3 != null || (atpDay = hVar3.getAtpDay()) == null || (str = atpDay.f187130a) == null || (cVar2 = fVar.f45248a) == null) {
                            return;
                        }
                        cVar2.h(str);
                        return;
                    }
                }
                hVar3 = hVar4;
                if (hVar3 != null) {
                    return;
                } else {
                    return;
                }
            case 10:
                com.garmin.android.apps.connectmobile.training.atp.create.steps.j jVar2 = (com.garmin.android.apps.connectmobile.training.atp.create.steps.j) obj;
                r rVar = jVar2.f45302l;
                if (rVar == null) {
                    s.m("data");
                    throw null;
                }
                List<Integer> listB = rVar.b();
                if (listB == null || (cVar3 = jVar2.f45248a) == null) {
                    return;
                }
                WheelPicker wheelPicker = jVar2.f45300j;
                if (wheelPicker != null) {
                    cVar3.a(listB.get(wheelPicker.getCurrentItemPosition()).intValue());
                    return;
                } else {
                    s.m("wheelPicker");
                    throw null;
                }
            case 11:
                EventListFragment.a aVar6 = EventListFragment.f45910l;
                zy1.d dVar = (zy1.d) ((EventListFragment) obj).f45912b.getValue();
                dg0.a aVar7 = dg0.a.SUPPORTING_EVENT;
                aVar7.getClass();
                dVar.I = aVar7;
                dVar.a5().m("EventDashBoardPriorityListFragment");
                return;
            case 12:
                BLEDeviceSetupActivity bLEDeviceSetupActivity = (BLEDeviceSetupActivity) obj;
                Button button = bLEDeviceSetupActivity.f34398k;
                if (button != null) {
                    String str4 = (String) button.getTag();
                    DeviceSetupProgressListViewFragment deviceSetupProgressListViewFragmentJa = bLEDeviceSetupActivity.ja();
                    if (deviceSetupProgressListViewFragmentJa != null) {
                        if (str4.equals("show")) {
                            v supportFragmentManager2 = bLEDeviceSetupActivity.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            androidx.fragment.app.a aVar8 = new androidx.fragment.app.a(supportFragmentManager2);
                            aVar8.x(deviceSetupProgressListViewFragmentJa);
                            aVar8.s(true, true);
                            bLEDeviceSetupActivity.f34398k.setTag("hide");
                            bLEDeviceSetupActivity.f34398k.setText(R.string.lbl_details_hide);
                            return;
                        }
                        if (str4.equals("hide")) {
                            v supportFragmentManager3 = bLEDeviceSetupActivity.getSupportFragmentManager();
                            supportFragmentManager3.getClass();
                            androidx.fragment.app.a aVar9 = new androidx.fragment.app.a(supportFragmentManager3);
                            aVar9.v(deviceSetupProgressListViewFragmentJa);
                            aVar9.s(true, true);
                            bLEDeviceSetupActivity.f34398k.setTag("show");
                            bLEDeviceSetupActivity.f34398k.setText(R.string.lbl_details_show);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                int i25 = BLEScanningActivity.A;
                ((BLEScanningActivity) obj).ga();
                return;
            case 14:
                bi2.f fVar2 = (bi2.f) obj;
                EditText editText2 = fVar2.f18144i;
                editText2.setText(String.valueOf(fVar2.getF18289s()));
                editText2.setSelection(editText2.getText().length());
                return;
            case 15:
                int i26 = bl0.c.f18581h;
                ((k) obj).invoke();
                return;
            case 16:
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar2 = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e) obj;
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar10 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                TrimActivityChartFullScreenActivity.a aVar11 = TrimActivityChartFullScreenActivity.f28831c;
                Context contextRequireContext = eVar2.requireContext();
                contextRequireContext.getClass();
                im.b bVar4 = eVar2.f28895f;
                Integer numD = eVar2.v6().F4().d();
                Integer numD2 = eVar2.v6().E4().d();
                int iOrdinal = fz.c.DISTANCE.ordinal();
                aVar11.getClass();
                TrimActivityChartFullScreenActivity.a.a(contextRequireContext, bVar4, numD, numD2, iOrdinal);
                return;
            case 17:
                GroupRideShareActivity groupRideShareActivity = (GroupRideShareActivity) obj;
                GroupRideShareActivity.a aVar12 = GroupRideShareActivity.f36417i;
                groupRideShareActivity.showProgressOverlay();
                e1 e1Var = (e1) groupRideShareActivity.f36420b.getValue();
                q92.d dVar2 = q92.d.LIVETRACK_GROUP_RIDE;
                dVar2.getClass();
                y0 y0Var = new y0();
                ge1.b.T(v1.a(e1Var), null, null, new h1(y0Var, dVar2, null), 3);
                y0Var.f(groupRideShareActivity, new GroupRideShareActivity.c(new b41.a(groupRideShareActivity, 5)));
                return;
            case 18:
                ((bo1.b) obj).f19239a.w4("TIP_OVERLAY");
                return;
            case 19:
                ((bp2.a) obj).f19422b.c(bp2.a.e.C0288a.f19430a);
                return;
            case 20:
                br2.j.b bVar5 = ((br2.j) obj).f19637e;
                if (bVar5 != null) {
                    bVar5.a();
                    return;
                }
                return;
            case 21:
                int i27 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                ((com.garmin.android.apps.connectmobile.view.reusablecomponents.b.a) obj).f47723b.invoke();
                return;
            case 22:
                MultiSportsDetailsActivity multiSportsDetailsActivity = (MultiSportsDetailsActivity) obj;
                MultiSportsDetailsActivity.a aVar13 = MultiSportsDetailsActivity.f48440z;
                if (multiSportsDetailsActivity.ea().f48605r == null || (workoutDetailsDTO = multiSportsDetailsActivity.ea().f48605r) == null || (str2 = workoutDetailsDTO.f48041b) == null || multiSportsDetailsActivity.ea().f48605r == null) {
                    return;
                }
                m52.k kVarR4 = multiSportsDetailsActivity.ea().R4(multiSportsDetailsActivity.ea().f48605r, Boolean.FALSE);
                WorkoutDetailsDTO workoutDetailsDTO2 = new WorkoutDetailsDTO();
                WorkoutDetailsDTO workoutDetailsDTO3 = multiSportsDetailsActivity.ea().f48605r;
                workoutDetailsDTO2.f48049j = workoutDetailsDTO3 != null ? workoutDetailsDTO3.f48049j : null;
                WorkoutDetailsDTO workoutDetailsDTO4 = multiSportsDetailsActivity.ea().f48605r;
                workoutDetailsDTO2.f48050k = workoutDetailsDTO4 != null ? workoutDetailsDTO4.f48050k : null;
                WorkoutDetailsDTO workoutDetailsDTO5 = multiSportsDetailsActivity.ea().f48605r;
                workoutDetailsDTO2.f48052l = workoutDetailsDTO5 != null ? workoutDetailsDTO5.f48052l : null;
                WorkoutDetailsDTO workoutDetailsDTO6 = multiSportsDetailsActivity.ea().f48605r;
                workoutDetailsDTO2.f48053m = workoutDetailsDTO6 != null ? workoutDetailsDTO6.f48053m : null;
                workoutDetailsDTO2.f48041b = str2;
                WorkoutDetailsDTO workoutDetailsDTO7 = multiSportsDetailsActivity.ea().f48605r;
                workoutDetailsDTO2.f48046g = workoutDetailsDTO7 != null ? workoutDetailsDTO7.f48046g : null;
                WorkoutDetailsDTO workoutDetailsDTO8 = multiSportsDetailsActivity.ea().f48605r;
                workoutDetailsDTO2.D = workoutDetailsDTO8 != null ? workoutDetailsDTO8.D : null;
                WorkoutDetailsDTO workoutDetailsDTO9 = multiSportsDetailsActivity.ea().f48605r;
                workoutDetailsDTO2.E = workoutDetailsDTO9 != null ? workoutDetailsDTO9.E : null;
                if (kVarR4 == null) {
                    kVarR4 = m52.k.f116756p;
                }
                kVarR4.getClass();
                workoutDetailsDTO2.f48044e = kVarR4;
                WorkoutDetailsDTO workoutDetailsDTO10 = multiSportsDetailsActivity.ea().f48605r;
                if (workoutDetailsDTO10 == null || (arrayList3 = workoutDetailsDTO10.Q0) == null) {
                    arrayList3 = new ArrayList<>();
                }
                workoutDetailsDTO2.Q0 = arrayList3;
                WorkoutDetailsDTO workoutDetailsDTO11 = multiSportsDetailsActivity.ea().f48605r;
                if (workoutDetailsDTO11 == null || (lVar = workoutDetailsDTO11.f48045f) == null) {
                    lVar = l.GENERIC;
                }
                lVar.getClass();
                workoutDetailsDTO2.f48045f = lVar;
                p0 p0Var = new p0();
                multiSportsDetailsActivity.f48448h = p0Var;
                p0Var.show(multiSportsDetailsActivity.getSupportFragmentManager(), (String) null);
                p pVarEa = multiSportsDetailsActivity.ea();
                ge1.b.T(v1.a(pVarEa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.h(pVarEa, workoutDetailsDTO2, null), 3);
                return;
            case 23:
                com.garmin.android.apps.connectmobile.segments.presentation.d dVar3 = (com.garmin.android.apps.connectmobile.segments.presentation.d) obj;
                com.garmin.android.apps.connectmobile.segments.presentation.d.a aVar14 = com.garmin.android.apps.connectmobile.segments.presentation.d.f41436b;
                if (!s3.b()) {
                    ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).k(dVar3.getContext());
                    return;
                }
                e.a aVar15 = new e.a(dVar3.requireContext());
                hk1.v vVar = hk1.v.f84200f;
                aVar15.setTitle(dVar3.getString(R.string.lbl_unable_to_connect_to_app, vVar.f84204a)).setMessage(dVar3.getString(R.string.msg_unable_to_connect_to_app, vVar.f84204a)).setPositiveButton(R.string.lbl_ok, new ag0.e(25)).setCancelable(false).create().show();
                return;
            case 24:
                com.garmin.android.apps.connectmobile.segments.presentation.h hVar15 = (com.garmin.android.apps.connectmobile.segments.presentation.h) obj;
                com.garmin.android.apps.connectmobile.segments.presentation.h.a aVar16 = com.garmin.android.apps.connectmobile.segments.presentation.h.f41449b;
                m activity = hVar15.getActivity();
                activity.getClass();
                PackageManager packageManager = activity.getPackageManager();
                g.a aVar17 = g.a.STRAVA;
                if (packageManager.getLaunchIntentForPackage(aVar17.f82804a) != null) {
                    m activity2 = hVar15.getActivity();
                    activity2.getClass();
                    activity2.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("strava://athlete/segments/starred")), 2);
                    return;
                }
                m activity3 = hVar15.getActivity();
                activity3.getClass();
                q0.a aVar18 = q0.f23203a;
                String str5 = aVar17.f82804a;
                str5.getClass();
                aVar18.getClass();
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=".concat(str5));
                uri.getClass();
                activity3.startActivityForResult(new Intent("android.intent.action.VIEW", uri), 2);
                return;
            case 25:
                ch1.k.p((ch1.k) obj);
                return;
            case 26:
                int i28 = w1.f27490e;
                Context context = ((w1) obj).f70343a;
                m mVar3 = context instanceof m ? (m) context : null;
                if (mVar3 == null || (supportFragmentManager = mVar3.getSupportFragmentManager()) == null) {
                    return;
                }
                new mh1.k().show(supportFragmentManager, mh1.k.class.getSimpleName());
                return;
            case 27:
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity = (ConnectIQAppDetailsActivity) obj;
                int i29 = ConnectIQAppDetailsActivity.C;
                com.garmin.android.apps.connectmobile.l.g().getClass();
                if (com.garmin.android.apps.connectmobile.l.i()) {
                    com.garmin.android.apps.connectmobile.l.g().getClass();
                    if (!TextUtils.isEmpty(com.garmin.android.apps.connectmobile.l.f())) {
                        long j8 = connectIQAppDetailsActivity.f31712h;
                        String str6 = connectIQAppDetailsActivity.f31713i;
                        String str7 = connectIQAppDetailsActivity.f31714j;
                        String str8 = connectIQAppDetailsActivity.f31709e.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String();
                        int internalVersion = connectIQAppDetailsActivity.f31709e.getInternalVersion();
                        Intent intent = new Intent(connectIQAppDetailsActivity, (Class<?>) ConnectIQDeviceRedirectActivity.class);
                        intent.putExtra("GCM_deviceUnitID", j8);
                        intent.putExtra("GCM_macAddress", str7);
                        intent.putExtra("GCM_deviceProductNbr", str6);
                        intent.putExtra("CONNECT_IQ_APP_ID", str8);
                        intent.putExtra("GCM_app_version", internalVersion);
                        intent.putExtra("deepLinkType", ConnectIQDeviceRedirectActivity.a.SETTINGS.ordinal());
                        connectIQAppDetailsActivity.startActivity(intent);
                        return;
                    }
                }
                Toast.makeText(connectIQAppDetailsActivity, connectIQAppDetailsActivity.getText(R.string.txt_error_occurred), 0).show();
                return;
            case 28:
                o.b bVar6 = (o.b) obj;
                o oVar = bVar6.f31929c;
                o.a aVar19 = oVar.f31925a;
                if (aVar19 != null) {
                    sd2.f fVar3 = oVar.f31926b.get(bVar6.getBindingAdapterPosition());
                    ConnectIQDeviceListActivity connectIQDeviceListActivity = (ConnectIQDeviceListActivity) aVar19;
                    if (fVar3.isMultiLinkSupported()) {
                        connectIQDeviceListActivity.ma();
                        return;
                    }
                    long unitID = fVar3.getUnitID();
                    Bundle extras = connectIQDeviceListActivity.getIntent().getExtras();
                    Intent intent2 = new Intent(connectIQDeviceListActivity, (Class<?>) ConnectIQAppStoreActivity.class);
                    if (extras != null) {
                        intent2.putExtras(extras);
                    }
                    intent2.putExtra("GCM_deviceUnitID", unitID);
                    connectIQDeviceListActivity.startActivity(intent2);
                    return;
                }
                return;
            default:
                ConnectIQDownloadListActivity connectIQDownloadListActivity = (ConnectIQDownloadListActivity) obj;
                ConnectIQDownloadListActivity.a aVar20 = ConnectIQDownloadListActivity.f31779o;
                if (connectIQDownloadListActivity.fa().H4()) {
                    connectIQDownloadListActivity.showProgressOverlay(connectIQDownloadListActivity.getString(R.string.txt_saving));
                }
                connectIQDownloadListActivity.fa().K4(null, new com.garmin.android.apps.connectmobile.connectiq.q(connectIQDownloadListActivity, i17));
                return;
        }
    }
}
