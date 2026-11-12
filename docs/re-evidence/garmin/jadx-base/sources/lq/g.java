package lq;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.IntroFragment;
import com.garmin.android.apps.connectmobile.group.details.ViewGroupImageActivity;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.n0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.s;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.s0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.u0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.v;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.w;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.x0;
import com.garmin.android.apps.connectmobile.leaderboard.model.a0;
import com.garmin.android.apps.connectmobile.leaderboard.model.i0;
import com.garmin.android.apps.connectmobile.leaderboard.model.j;
import com.garmin.android.apps.connectmobile.leaderboard.model.j0;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.PregnancyHistoryActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancySegmentedButton;
import com.garmin.android.apps.connectmobile.settings.devices.CreateEditDeviceAlarmActivity;
import com.garmin.android.apps.connectmobile.settings.devices.Vivosmart3CreateEditDeviceAlarmActivity;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel;
import db1.u;
import e23.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import lx0.k;
import mt0.q0;
import mt0.y;
import n12.v0;
import nq.o;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.h0;
import pk1.t;
import pt0.p;
import pt0.r;
import u62.z;
import vr2.q;
import ww0.i;
import yr0.n;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f114303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f114304c;

    public /* synthetic */ g(int i14, Object obj, Object obj2) {
        this.f114302a = i14;
        this.f114303b = obj;
        this.f114304c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ImageView imageView;
        ArrayList arrayList3;
        Boolean bool;
        ImageView imageView2;
        int absoluteAdapterPosition;
        l<sq.a, Unit> lVar;
        int i14 = this.f114302a;
        int i15 = 0;
        Object obj = this.f114304c;
        Object obj2 = this.f114303b;
        switch (i14) {
            case 0:
                f fVar = (f) obj2;
                f.b bVar = (f.b) obj;
                int i16 = f.b.f114300b;
                List<h> list = fVar.f114295a;
                LinkedHashMap linkedHashMap = fVar.f114299e;
                h hVar = (h) h0.e0(bVar.getBindingAdapterPosition(), list);
                if (hVar != null) {
                    linkedHashMap.put(hVar, Boolean.TRUE);
                    if (fVar.f114298d != bVar.getBindingAdapterPosition()) {
                        linkedHashMap.put(fVar.f114295a.get(fVar.f114298d), Boolean.FALSE);
                        fVar.f114298d = bVar.getBindingAdapterPosition();
                        fVar.notifyDataSetChanged();
                        f.a aVar = fVar.f114296b;
                        if (aVar != null) {
                            aVar.a(hVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q qVar = (q) obj2;
                com.garmin.feature.garminpay.ui.devicesettings.a aVar2 = (com.garmin.feature.garminpay.ui.devicesettings.a) obj;
                if (qVar != null) {
                    aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.b(qVar, false, false, 2, null));
                    return;
                } else {
                    int i17 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                    return;
                }
            case 2:
                lx0.b bVar2 = (lx0.b) obj2;
                int i18 = lx0.b.C2191b.f115145e;
                k kVar = bVar2.f115143d;
                kVar.getClass();
                kVar.f115194j = (i) obj;
                bVar2.notifyDataSetChanged();
                return;
            case 3:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c.f39117f;
                ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c) obj2).w6((ww0.a) obj);
                return;
            case 4:
                mh1.k kVar2 = (mh1.k) obj;
                String strB = z.b(R.string.index_smart_scale_2_manual_software_update_procedure_url, (View) obj2);
                try {
                    kVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strB)));
                    return;
                } catch (ActivityNotFoundException e4) {
                    a2 a2Var = a2.GENERAL;
                    String strConcat = "openExternalUrl ".concat(strB);
                    i2.f36769a.getClass();
                    i2.a.g(a2Var, strConcat, e4);
                    Toast.makeText(kVar2.requireContext(), R.string.txt_error_occurred, 0).show();
                    return;
                }
            case 5:
                com.garmin.android.apps.connectmobile.smartscale.model.e eVar = (com.garmin.android.apps.connectmobile.smartscale.model.e) obj2;
                com.garmin.android.apps.connectmobile.settings.devices.index.b bVar3 = (com.garmin.android.apps.connectmobile.settings.devices.index.b) obj;
                if (eVar.getIsPrimary()) {
                    return;
                }
                bVar3.r(eVar);
                return;
            case 6:
                ((ms0.g) obj2).f120475a.invoke((n) obj);
                return;
            case 7:
                q0 q0Var = (q0) obj2;
                j jVar = (j) obj;
                q0Var.f120819d.a(q0Var.f120816a, jVar.f38211b, jVar.f38213d, jVar.f38212c);
                return;
            case 8:
                p.b bVar4 = (p.b) obj;
                p pVarV6 = ((com.garmin.android.apps.connectmobile.leaderboard.challenges.q) obj2).v6();
                String str = bVar4.f140765a;
                long j8 = bVar4.f140766b;
                pVarV6.getClass();
                xy2.b.L(pVarV6, pVarV6.f140762i, new r(pVarV6, str, j8, null));
                return;
            case 9:
                s sVar = (s) obj;
                Long lG = ((com.garmin.android.apps.connectmobile.leaderboard.model.p) obj2).getBadgeId();
                if (lG != null) {
                    int iLongValue = (int) lG.longValue();
                    kt0.a aVar4 = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);
                    m mVarRequireActivity = sVar.requireActivity();
                    mVarRequireActivity.getClass();
                    aVar4.n(mVarRequireActivity, iLongValue);
                    return;
                }
                return;
            case 10:
                v.a aVar5 = v.f37909g;
                ((v) obj2).u6((com.garmin.android.apps.connectmobile.leaderboard.model.p) obj);
                return;
            case 11:
                String str2 = (String) obj2;
                w wVar = (w) obj;
                if (str2 != null) {
                    wVar.f37933a.p(str2);
                    return;
                } else {
                    w.a aVar6 = w.f37932i;
                    return;
                }
            case 12:
                ((n0) obj2).f37681a.invoke((a0) obj);
                return;
            case 13:
                j0 j0Var = (j0) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.q0.a aVar7 = ((com.garmin.android.apps.connectmobile.leaderboard.challenges.q0) obj2).f37801b;
                if (aVar7 != null) {
                    aVar7.d(j0Var);
                    return;
                }
                return;
            case 14:
                i0 i0Var = (i0) obj;
                s0.a aVar8 = ((s0) obj2).f37883e;
                if (aVar8 != null) {
                    aVar8.x(i0Var);
                    return;
                }
                return;
            case 15:
                i0 i0Var2 = (i0) obj;
                u0.a aVar9 = ((u0) obj2).f37900b;
                if (aVar9 != null) {
                    aVar9.x(i0Var2);
                    return;
                }
                return;
            case 16:
                j0 j0Var2 = (j0) obj;
                x0.a aVar10 = ((x0) obj2).f37959e;
                if (aVar10 != null) {
                    aVar10.d(j0Var2);
                    return;
                }
                return;
            case 17:
                int i19 = n12.n0.c.f122276c;
                ((n12.n0) obj2).f122268a.F0((com.garmin.android.apps.connectmobile.userprofile.model.e) obj);
                return;
            case 18:
                Uri uri = (Uri) obj;
                int i24 = v0.b.f122323c;
                com.garmin.android.apps.connectmobile.userprofile.editimage.b bVar5 = ((v0) obj2).f122320b;
                if (bVar5 != null) {
                    com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar11 = bVar5.f46655a;
                    int i25 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                    EditProfileImageViewModel editProfileImageViewModelW6 = aVar11.w6();
                    com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar2 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) editProfileImageViewModelW6.f46605j.d();
                    if (!uri.equals(fVar2 != null ? fVar2.getF46701a() : null)) {
                        editProfileImageViewModelW6.Z.j(uri);
                        editProfileImageViewModelW6.f46604i.j(new com.garmin.android.apps.connectmobile.userprofile.editimage.f.d(uri));
                    }
                    bVar5.f46656b.r(uri);
                    com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar3 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) aVar11.w6().f46605j.d();
                    if (p005kotlin.jvm.internal.s.g(fVar3 != null ? fVar3.getF46701a() : null, uri)) {
                        return;
                    }
                    aVar11.w6().f46604i.j(new com.garmin.android.apps.connectmobile.userprofile.editimage.f.d(uri));
                    return;
                }
                return;
            case 19:
                ImageView imageView3 = (ImageView) obj2;
                CreateEditDeviceAlarmActivity createEditDeviceAlarmActivity = (CreateEditDeviceAlarmActivity) obj;
                CreateEditDeviceAlarmActivity.a aVar12 = CreateEditDeviceAlarmActivity.f41935r;
                view2.getClass();
                boolean z14 = imageView3.getVisibility() == 0;
                if (!z14 || createEditDeviceAlarmActivity.da().size() > 1) {
                    if (z14 || ((arrayList3 = createEditDeviceAlarmActivity.f41945h) != null && arrayList3.indexOf(view2) == com.garmin.android.apps.connectmobile.devices.model.a.ONCE.ordinal())) {
                        if (!z14 && (arrayList = createEditDeviceAlarmActivity.f41945h) != null && arrayList.indexOf(view2) == com.garmin.android.apps.connectmobile.devices.model.a.ONCE.ordinal() && (arrayList2 = createEditDeviceAlarmActivity.f41945h) != null) {
                            int size = arrayList2.size() - 1;
                            for (int i26 = 0; i26 < size; i26++) {
                                SparseBooleanArray sparseBooleanArray = createEditDeviceAlarmActivity.f41952o;
                                sparseBooleanArray.getClass();
                                sparseBooleanArray.put(i26, false);
                                ArrayList arrayList4 = createEditDeviceAlarmActivity.f41945h;
                                arrayList4.getClass();
                                View view3 = (View) arrayList4.get(i26);
                                if (view3 != null && (imageView = (ImageView) view3.findViewById(R.id.checkable_row_img)) != null) {
                                    imageView.setVisibility(8);
                                }
                            }
                        }
                    } else if (createEditDeviceAlarmActivity.f41945h != null && !CreateEditDeviceAlarmActivity.f41937v.contains(createEditDeviceAlarmActivity.f41953p) && ((bool = createEditDeviceAlarmActivity.f41938a) == null || bool.equals(Boolean.TRUE))) {
                        SparseBooleanArray sparseBooleanArray2 = createEditDeviceAlarmActivity.f41952o;
                        sparseBooleanArray2.getClass();
                        com.garmin.android.apps.connectmobile.devices.model.a aVar13 = com.garmin.android.apps.connectmobile.devices.model.a.ONCE;
                        sparseBooleanArray2.put(aVar13.ordinal(), false);
                        ArrayList arrayList5 = createEditDeviceAlarmActivity.f41945h;
                        arrayList5.getClass();
                        View view4 = (View) arrayList5.get(aVar13.ordinal());
                        if (view4 != null && (imageView2 = (ImageView) view4.findViewById(R.id.checkable_row_img)) != null) {
                            imageView2.setVisibility(8);
                        }
                    }
                    imageView3.setVisibility(z14 ? 8 : 0);
                    SparseBooleanArray sparseBooleanArray3 = createEditDeviceAlarmActivity.f41952o;
                    sparseBooleanArray3.getClass();
                    ArrayList arrayList6 = createEditDeviceAlarmActivity.f41945h;
                    sparseBooleanArray3.put(arrayList6 != null ? arrayList6.indexOf(view2) : 0, !z14);
                    return;
                }
                return;
            case 20:
                ImageView imageView4 = (ImageView) obj2;
                Vivosmart3CreateEditDeviceAlarmActivity vivosmart3CreateEditDeviceAlarmActivity = (Vivosmart3CreateEditDeviceAlarmActivity) obj;
                Vivosmart3CreateEditDeviceAlarmActivity.a aVar14 = Vivosmart3CreateEditDeviceAlarmActivity.f42315o;
                view2.getClass();
                boolean z15 = imageView4.getVisibility() == 0;
                if (!z15 || vivosmart3CreateEditDeviceAlarmActivity.da().size() > 1) {
                    imageView4.setVisibility(z15 ? 8 : 0);
                    SparseBooleanArray sparseBooleanArray4 = vivosmart3CreateEditDeviceAlarmActivity.f42328m;
                    sparseBooleanArray4.getClass();
                    ArrayList arrayList7 = vivosmart3CreateEditDeviceAlarmActivity.f42321f;
                    sparseBooleanArray4.put(arrayList7 != null ? arrayList7.indexOf(view2) : 0, !z15);
                    return;
                }
                return;
            case 21:
                nm0.d dVar = (nm0.d) obj2;
                GroupDetailsDTO groupDetailsDTO = (GroupDetailsDTO) obj;
                ViewGroupImageActivity.a aVar15 = ViewGroupImageActivity.f36170e;
                m mVarRequireActivity2 = dVar.requireActivity();
                mVarRequireActivity2.getClass();
                aVar15.getClass();
                groupDetailsDTO.getClass();
                Intent intent = new Intent(mVarRequireActivity2, (Class<?>) ViewGroupImageActivity.class);
                intent.putExtras(h7.c.a(new o13.p("GCM_extra_connection_group", groupDetailsDTO)));
                dVar.f126553i.a(intent, null);
                return;
            case 22:
                no.e eVar2 = (no.e) obj2;
                no.e.a aVar16 = (no.e.a) obj;
                int i27 = eVar2.f126720e;
                List<fg0.k> list2 = eVar2.f126717b;
                if (i27 == aVar16.getAbsoluteAdapterPosition()) {
                    eVar2.f126718c = null;
                    com.garmin.android.apps.connectmobile.activities.manual.eventType.a aVar17 = eVar2.f126719d;
                    if (aVar17 != null) {
                        aVar17.v6(list2.get(aVar16.getAbsoluteAdapterPosition()), true);
                    }
                    absoluteAdapterPosition = -1;
                } else {
                    eVar2.f126718c = list2.get(aVar16.getAbsoluteAdapterPosition());
                    com.garmin.android.apps.connectmobile.activities.manual.eventType.a aVar18 = eVar2.f126719d;
                    if (aVar18 != null) {
                        aVar18.v6(list2.get(aVar16.getAbsoluteAdapterPosition()), false);
                    }
                    absoluteAdapterPosition = aVar16.getAbsoluteAdapterPosition();
                }
                eVar2.f126720e = absoluteAdapterPosition;
                eVar2.notifyDataSetChanged();
                return;
            case 23:
                nq.d dVar2 = (nq.d) obj2;
                sq.a aVar19 = (sq.a) obj;
                if (dVar2.f126889b.contains(o.f126927a) && (lVar = dVar2.f126891d) != null) {
                    lVar.invoke(sq.a.b(aVar19, null, 7));
                    return;
                }
                return;
            case 24:
                IntroFragment introFragment = (IntroFragment) obj;
                int i28 = IntroFragment.f34814j;
                ((oe.j) obj2).invoke();
                introFragment.w6().setVisibility(0);
                FrameLayout frameLayout = introFragment.f125875f;
                if (frameLayout == null) {
                    p005kotlin.jvm.internal.s.m("setupOverlayContainer");
                    throw null;
                }
                frameLayout.setVisibility(8);
                view2.setOnClickListener(null);
                return;
            case 25:
                com.garmin.android.apps.connectmobile.audioprompts.ui.b bVar6 = (com.garmin.android.apps.connectmobile.audioprompts.ui.b) obj2;
                bVar6.f30282c.r2(((com.garmin.android.apps.connectmobile.audioprompts.ui.b.a) bVar6.f30284e.get(((com.garmin.android.apps.connectmobile.audioprompts.ui.b.c) obj).f30290e)).f30285a);
                return;
            case 26:
                ArrayList arrayList8 = (ArrayList) obj;
                pb1.b.a aVar20 = pb1.b.f136832c;
                m activity = ((pb1.b) obj2).getActivity();
                if (activity != null) {
                    pb1.b.f136833d.info("Launching Pregnancy History Screen");
                    PregnancyHistoryActivity.f40886b.getClass();
                    arrayList8.getClass();
                    Intent intent2 = new Intent(activity, (Class<?>) PregnancyHistoryActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList("extra_pregnancy_history_list", new ArrayList<>(arrayList8));
                    intent2.putExtras(bundle);
                    activity.startActivityForResult(intent2, 1);
                    return;
                }
                return;
            case 27:
                m mVar = (m) obj;
                pb1.l.a aVar21 = pb1.l.f136861l;
                db1.m mVar2 = ((pb1.l) obj2).v6().f107065h;
                if (mVar2 != null) {
                    PregnancyStopTrackingActivity.f41001d.getClass();
                    PregnancyStopTrackingActivity.a.a(mVar, mVar2);
                    return;
                }
                return;
            case 28:
                u uVar = (u) obj2;
                pb1.l lVar2 = (pb1.l) obj;
                GCMPregnancySegmentedButton gCMPregnancySegmentedButton = lVar2.f136867e;
                if (gCMPregnancySegmentedButton == null) {
                    p005kotlin.jvm.internal.s.m("mWeightGainGoalsButton");
                    throw null;
                }
                uVar.j(gCMPregnancySegmentedButton.a());
                tb1.e.f163745a.getClass();
                uVar.i(tb1.e.a.c());
                lVar2.w6(uVar);
                return;
            default:
                pk1.u uVar2 = (pk1.u) obj2;
                String[] strArr = (String[]) obj;
                pk1.u.a aVar22 = pk1.u.E;
                androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(uVar2.requireContext()).setTitle(R.string.lbl_gender);
                ArrayList arrayList9 = new ArrayList(strArr.length);
                for (String str3 : strArr) {
                    str3.getClass();
                    arrayList9.add(uVar2.E6(str3));
                }
                title.setSingleChoiceItems((CharSequence[]) arrayList9.toArray(new CharSequence[0]), p13.u.M(strArr, uVar2.B.w()), new t(i15, strArr, uVar2)).setNegativeButton(R.string.lbl_cancel, new y(16)).create().show();
                return;
        }
    }
}
