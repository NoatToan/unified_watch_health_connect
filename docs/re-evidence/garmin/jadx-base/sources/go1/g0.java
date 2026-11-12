package go1;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.lifecycle.n0;
import b21.s4;
import c22.s3;
import ca0.o1;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.dashboard.version2.RegisteredUnPairedDeviceActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity.b;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleGenesisActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupActivity;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSingleLineEditTextView;
import ew1.h1;
import java.util.HashSet;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Unit;
import z10.d1;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f78240b;

    public /* synthetic */ g0(Object obj, int i14) {
        this.f78239a = i14;
        this.f78240b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) throws Throwable {
        View.OnClickListener onClickListener;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.d0> listK;
        String video;
        int i14 = this.f78239a;
        boolean z14 = false;
        Object obj = this.f78240b;
        switch (i14) {
            case 0:
                int i15 = h0.f78243a;
                ((v) obj).x2();
                return;
            case 1:
                GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) obj;
                int i16 = GCMComplexTwoLineButton.f47780n;
                if (!gCMComplexTwoLineButton.isEnabled() || (onClickListener = gCMComplexTwoLineButton.f47793m) == null) {
                    return;
                }
                onClickListener.onClick(view2);
                return;
            case 2:
                int i17 = h32.e.f81301w;
                ((h32.e.a) obj).f81323b.invoke();
                return;
            case 3:
                int i18 = h32.h.A;
                ((h32.h.a) obj).f81366b.invoke();
                return;
            case 4:
                int i19 = GCMSingleLineEditTextView.f47803y;
                ((GCMSingleLineEditTextView.a) obj).f47827b.invoke();
                return;
            case 5:
                ((RegisteredUnPairedDeviceActivity) obj).onDeviceSupportCenterClicked(view2);
                return;
            case 6:
                RegisteredUnPairedDeviceActivity registeredUnPairedDeviceActivity = ((hc0.n) obj).f83267c;
                registeredUnPairedDeviceActivity.getClass();
                int i24 = RegisteredUnPairedDeviceActivity.a.f33852a[registeredUnPairedDeviceActivity.f33845c.ordinal()];
                if (i24 != 1) {
                    if (i24 != 2) {
                        return;
                    }
                    androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(registeredUnPairedDeviceActivity);
                    aVar.setTitle(registeredUnPairedDeviceActivity.getString(R.string.app_upgrade_needed_title));
                    aVar.setMessage(registeredUnPairedDeviceActivity.getString(R.string.update_application_message)).setCancelable(false).setPositiveButton(R.string.txt_update_application, new h1(registeredUnPairedDeviceActivity, 14)).setNegativeButton(R.string.lbl_cancel, new f20.i(17));
                    aVar.create().show();
                    return;
                }
                hk0.p pVar = hk0.p.f84079d;
                sd2.f fVar = registeredUnPairedDeviceActivity.f33844b;
                if (fVar == null || TextUtils.isEmpty(fVar.getProductNumber())) {
                    return;
                }
                if (u0.u(registeredUnPairedDeviceActivity.f33844b.getProductNumber(), false)) {
                    new nl0.b(registeredUnPairedDeviceActivity, false, "golf.app.pairing.screen", registeredUnPairedDeviceActivity.f33844b.getProductNumber(), registeredUnPairedDeviceActivity.f33844b.getDisplayName(), registeredUnPairedDeviceActivity.f33844b.getSku()).a().execute();
                    return;
                }
                o1 o1Var = o1.ADD_DEVICE;
                l90.d dVar = new l90.d(Long.valueOf(registeredUnPairedDeviceActivity.f33844b.getUnitID()), registeredUnPairedDeviceActivity.f33844b.getProductNumber(), registeredUnPairedDeviceActivity.f33844b.getApplicationKey(), false);
                DeviceSetupActivity.a aVar2 = DeviceSetupActivity.f33758b;
                aVar2.getClass();
                o1Var.getClass();
                aVar2.c(registeredUnPairedDeviceActivity, o1Var, dVar, 0);
                registeredUnPairedDeviceActivity.finish();
                return;
            case 7:
                Logger logger = hn2.c.f84546f;
                ((hn2.c) obj).onBackPressed();
                return;
            case 8:
                com.garmin.android.apps.connectmobile.activities.stats.exercises.a.C0457a c0457a = com.garmin.android.apps.connectmobile.activities.stats.exercises.a.f29847i;
                ((ImageView) obj).setVisibility(0);
                return;
            case 9:
                com.garmin.android.apps.connectmobile.bic.device.a aVar3 = (com.garmin.android.apps.connectmobile.bic.device.a) obj;
                com.garmin.android.apps.connectmobile.bic.device.a.C0488a c0488a = com.garmin.android.apps.connectmobile.bic.device.a.f30744f;
                aVar3.requireActivity().setResult(0);
                aVar3.requireActivity().finish();
                return;
            case 10:
                hx0.r.a aVar4 = (hx0.r.a) obj;
                LottieAnimationView lottieAnimationView = aVar4.f86129a;
                ex0.a.f66914i.getClass();
                j23.l lVar = ex0.a.f66917l;
                lottieAnimationView.setMinAndMaxFrame(lVar.f96796a, lVar.f96797b);
                lottieAnimationView.playAnimation();
                lottieAnimationView.addAnimatorListener(new hx0.r.a.C1711a(aVar4));
                return;
            case 11:
                MenstrualCycleGenesisActivity menstrualCycleGenesisActivity = (MenstrualCycleGenesisActivity) obj;
                MenstrualCycleGenesisActivity.a aVar5 = MenstrualCycleGenesisActivity.f38811e;
                if (d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                    menstrualCycleGenesisActivity.startActivityForResult(MCTSetupActivity.a.a(MCTSetupActivity.f39100c, menstrualCycleGenesisActivity, 6), 201);
                    return;
                } else {
                    DataStorageConsentActivity.a.d(DataStorageConsentActivity.f32194t, menstrualCycleGenesisActivity, 101);
                    return;
                }
            case 12:
                hy.f fVar2 = (hy.f) obj;
                fVar2.d(!fVar2.f86329d.b());
                return;
            case 13:
                NewsFeedListFragment newsFeedListFragment = (NewsFeedListFragment) obj;
                int i25 = NewsFeedListFragment.Y;
                if (s3.b()) {
                    Context contextRequireContext = newsFeedListFragment.requireContext();
                    contextRequireContext.getClass();
                    hz0.x.a(contextRequireContext);
                    return;
                } else {
                    iz0.a aVarY6 = newsFeedListFragment.Y6();
                    Context contextRequireContext2 = newsFeedListFragment.requireContext();
                    contextRequireContext2.getClass();
                    aVarY6.e(contextRequireContext2);
                    return;
                }
            case 14:
                i10.c cVar = (i10.c) obj;
                i10.c.a aVar6 = i10.c.A;
                androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new i10.j((i10.h) cVar.f87003h.getValue(), null), 3);
                n0 viewLifecycleOwner = cVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                dh.b.L(jVarA, viewLifecycleOwner, new i10.c.g(new i10.d(cVar)));
                return;
            case 15:
                int i26 = com.garmin.android.apps.connectmobile.contacts.edit.a.g.f32540a;
                com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar3 = ((com.garmin.android.apps.connectmobile.contacts.edit.a) obj).f32525a;
                if (fVar3 != null) {
                    fVar3.i3();
                    return;
                }
                return;
            case 16:
                com.garmin.android.apps.connectmobile.workouts.presentation.msn.a aVar7 = (com.garmin.android.apps.connectmobile.workouts.presentation.msn.a) obj;
                if (aVar7.f49477v != null) {
                    Object tag = view2.getTag(R.id.tag_key_thumbnail_index);
                    tag.getClass();
                    int iIntValue = ((Integer) tag).intValue();
                    androidx.media3.exoplayer.v vVar = aVar7.f49477v;
                    if (vVar == null) {
                        p005kotlin.jvm.internal.s.m("player");
                        throw null;
                    }
                    vVar.i(vVar.getCurrentPosition(), iIntValue, false);
                    com.garmin.android.apps.connectmobile.workouts.data.model.o oVar = aVar7.f49478w;
                    if (oVar != null && (listK = oVar.k()) != null && (video = listK.get(iIntValue).getCom.google.android.exoplayer2.util.MimeTypes.BASE_TYPE_VIDEO java.lang.String()) != null) {
                        aVar7.I = video;
                    }
                }
                view2.setSelected(true);
                View view3 = aVar7.f49476t;
                if (view3 != null) {
                    view3.setSelected(false);
                }
                aVar7.f49476t = view2;
                return;
            case 17:
                i80.a.c cVar2 = (i80.a.c) obj;
                Object tag2 = view2.getTag();
                tag2.getClass();
                i80.a.b bVar = (i80.a.b) tag2;
                String str = bVar.f92219b;
                Object tag3 = view2.getTag(R.id.tag_key_for_recycler_view_position);
                tag3.getClass();
                int iIntValue2 = ((Integer) tag3).intValue();
                boolean z15 = bVar.f92218a;
                bVar.f92218a = !z15;
                HashSet hashSet = cVar2.f92221b;
                if (z15) {
                    hashSet.remove(str);
                } else {
                    hashSet.add(str);
                }
                cVar2.f92220a.v4(hashSet.size());
                cVar2.notifyItemChanged(iIntValue2);
                return;
            case 18:
                i80.h hVar = (i80.h) obj;
                i80.g gVar = hVar.f92242a;
                Object tag4 = view2.getTag();
                tag4.getClass();
                i80.f fVar4 = (i80.f) tag4;
                if (fVar4.f92237a) {
                    gVar.R2(fVar4, true, view2);
                    return;
                }
                for (i80.f fVar5 : hVar.f92244c) {
                    if (fVar5.f92238b.equals(fVar4.f92238b) && fVar5.f92237a) {
                        z14 = true;
                    }
                }
                gVar.R2(fVar4, z14, view2);
                return;
            case 19:
                int i27 = id1.b.c.f93017d;
                AuthorizedViewersActivity authorizedViewersActivity = (AuthorizedViewersActivity) ((r22.a) ((id1.b.C1774b) obj).f93016b).f149546b;
                AuthorizedViewersActivity.a aVar8 = AuthorizedViewersActivity.f34974m;
                ge1.b.W(t13.h.f161748a, authorizedViewersActivity.new b(null));
                return;
            case 20:
                ig1.s sVar = (ig1.s) obj;
                int i28 = ig1.s.f93399e;
                sVar.f70343a.startActivity(new Intent(sVar.f70343a, (Class<?>) UpdateBirthdateActivity.class));
                return;
            case 21:
                int i29 = ip2.a.f94706d;
                ((s4) obj).invoke();
                return;
            case 22:
                int i30 = ip2.b.f94710m;
                ((bp2.b) obj).invoke();
                return;
            case 23:
                int i34 = ip2.b.f94710m;
                ((bp2.b) obj).invoke();
                return;
            case 24:
                iv2.g gVar2 = (iv2.g) obj;
                EditText editText = gVar2.f95239g;
                if (editText == null) {
                    p005kotlin.jvm.internal.s.m("inputField");
                    throw null;
                }
                editText.setText(String.valueOf(gVar2.f95247o));
                EditText editText2 = gVar2.f95239g;
                if (editText2 != null) {
                    editText2.setSelection(editText2.getText().length());
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("inputField");
                    throw null;
                }
            case 25:
                j10.a aVar9 = (j10.a) obj;
                int i35 = j10.a.f96339d;
                aVar9.a(((j10.a.C1841a) view2.getTag()).f96345d);
                aVar9.notifyDataSetChanged();
                return;
            case 26:
                com.garmin.android.apps.connectmobile.connections.groups.details.d dVar2 = (com.garmin.android.apps.connectmobile.connections.groups.details.d) obj;
                int i36 = com.garmin.android.apps.connectmobile.connections.groups.details.d.f31487h;
                Object tag5 = view2.getTag();
                tag5.getClass();
                dVar2.a(((com.garmin.android.apps.connectmobile.connections.groups.details.c.b) tag5).f31486b);
                com.garmin.android.apps.connectmobile.connections.groups.details.d.c cVar3 = dVar2.f31491g;
                if (cVar3 != null) {
                    StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = cVar3.f31492a;
                    EditText editText3 = styledInlineTextFieldViewDark.editText;
                    editText3.clearFocus();
                    v22.e.c(editText3, styledInlineTextFieldViewDark);
                }
                dVar2.notifyDataSetChanged();
                return;
            case 27:
                com.garmin.android.apps.connectmobile.contacts.emergency.g gVar3 = (com.garmin.android.apps.connectmobile.contacts.emergency.g) obj;
                com.garmin.android.apps.connectmobile.contacts.emergency.g.a aVar10 = com.garmin.android.apps.connectmobile.contacts.emergency.g.f32695h;
                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarU6 = gVar3.u6();
                dVarU6.H4(true, dVarU6.f32659r);
                g22.e.l(gVar3);
                return;
            case 28:
                j22.b bVar2 = j22.b.f96736a;
                ((androidx.appcompat.app.e) obj).dismiss();
                return;
            default:
                j22.e eVar = (j22.e) obj;
                String str2 = eVar.f96745a;
                i2.a aVar11 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar11.getClass();
                i2.a.b(a2Var, str2, "showBluetoothPermissionDeniedDialog: negative button clicked");
                e23.a<Unit> aVar12 = eVar.f96748d;
                if (aVar12 != null) {
                    aVar12.invoke();
                    return;
                }
                return;
        }
    }
}
