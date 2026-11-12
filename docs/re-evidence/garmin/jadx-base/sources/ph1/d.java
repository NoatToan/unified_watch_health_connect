package ph1;

import android.content.Context;
import android.location.Location;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.a0;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import com.garmin.android.apps.connectmobile.badges.service.model.r;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.connections.LeaderboardConnectionsActivity;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.IndexScale2UserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.usersettings.GCMDatePicker;
import com.garmin.android.library.mapsdkadapter.e;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.InvalidAppletException;
import com.garmin.feature.garminpay.ui.passcode.ResetWalletActivity;
import e23.l;
import e23.p;
import f5.v1;
import h5.e2;
import i3.mc;
import j31.z0;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import l72.i3;
import lc.u0;
import mt0.k4;
import ng1.c1;
import nr.w0;
import o53.b0;
import ok2.y;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p3.c2;
import p3.i0;
import p3.n1;
import p3.p1;
import p5.h0;
import p5.k0;
import pk1.t;
import po2.x;
import ps2.n;
import qe2.k;
import r02.m;
import r2.j;
import t82.f;
import uu.q;
import wk2.h;
import wk2.i;
import zb0.s0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f137714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f137715c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f137713a = i14;
        this.f137714b = obj;
        this.f137715c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0369  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        MenuItem item;
        int i14 = this.f137713a;
        int i15 = 6;
        boolean z14 = false;
        int i16 = 1;
        Object obj2 = this.f137715c;
        Object obj3 = this.f137714b;
        switch (i14) {
            case 0:
                return IndexScale2UserSettingsActivity.fa((IndexScale2UserSettingsActivity) obj3, (UserSettingsDTO) obj2, (g3) obj);
            case 1:
                LocalDate localDateL1 = (LocalDate) obj3;
                GCMDatePicker gCMDatePicker = (GCMDatePicker) ((View) obj).findViewById(R.id.birthday_picker);
                gCMDatePicker.setImportantForAccessibility(4);
                gCMDatePicker.setOnDateChangedListener(new com.garmin.android.apps.connectmobile.settings.usersettings.a.C0825a((p1) obj2));
                if (localDateL1 == null) {
                    f12.l.f68084a.getClass();
                    localDateL1 = f12.l.a.a().l1();
                }
                if (localDateL1 != null) {
                    int year = localDateL1.getYear();
                    int monthOfYear = localDateL1.getMonthOfYear() - 1;
                    int dayOfMonth = localDateL1.getDayOfMonth();
                    if (gCMDatePicker.com.roomorama.caldroid.CaldroidFragment.YEAR java.lang.String != year || gCMDatePicker.com.roomorama.caldroid.CaldroidFragment.MONTH java.lang.String != monthOfYear || gCMDatePicker.dayOfMonth != dayOfMonth) {
                        gCMDatePicker.com.roomorama.caldroid.CaldroidFragment.YEAR java.lang.String = year;
                        gCMDatePicker.com.roomorama.caldroid.CaldroidFragment.MONTH java.lang.String = monthOfYear;
                        gCMDatePicker.dayOfMonth = dayOfMonth;
                        gCMDatePicker.f();
                        String[] months = new DateFormatSymbols().getMonths();
                        months.getClass();
                        gCMDatePicker.d(months);
                        gCMDatePicker.c();
                    }
                }
                gCMDatePicker.setImportantForAccessibility(1);
                return Unit.INSTANCE;
            case 2:
                pk2.b bVar = (pk2.b) obj3;
                y yVar = (y) obj2;
                i iVar = (i) obj;
                int i17 = pk2.b.f138357m;
                iVar.getClass();
                Collection<String> collection = yVar != null ? yVar.f132807a : null;
                if (iVar.getDirection() == h.DEVICE_TO_PHONE && bVar.f138358a.j(iVar.getF205152b(), collection)) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 3:
                com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d c0641d = (com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d) obj3;
                k0 k0Var = (k0) obj;
                int i18 = com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d.f36330d;
                k0Var.getClass();
                jm0.b bVar2 = c0641d.f36332b;
                Context context = c0641d.itemView.getContext();
                context.getClass();
                h0.n(k0Var, bVar2.e(context, (GroupChallengeDTO) obj2));
                return Unit.INSTANCE;
            case 4:
                int i19 = po.h.E1;
                ((po.h) obj3).E7(((Integer) obj).intValue(), (ArrayList) obj2);
                return Unit.INSTANCE;
            case 5:
                po.h hVar = (po.h) obj3;
                GCMMapView gCMMapView = (GCMMapView) obj2;
                po.h.a aVar = hVar.C1;
                if (gCMMapView != null) {
                    boolean b14 = gCMMapView.getMapProxy().f144584a.getB();
                    boolean z15 = !b14;
                    if (b14) {
                        aVar.a(z15);
                    } else {
                        com.garmin.android.library.mapsdkadapter.i.d mapProvider = gCMMapView.getMapProvider();
                        com.garmin.android.library.mapsdkadapter.i.d dVar = com.garmin.android.library.mapsdkadapter.i.d.MAPBOX;
                        if (mapProvider != dVar) {
                            e a14 = gCMMapView.getMapProxy().f144584a.getA();
                            aVar.b(dVar);
                            hVar.f148294e.A(new p62.e(hVar, i15, gCMMapView, a14));
                        } else {
                            aVar.a(z15);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                x xVar = (x) obj3;
                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj;
                aVar2.getClass();
                aVar2.setTitle(R.string.title_error_occurred);
                aVar2.setMessage(R.string.wallet_error_contact_garmin_china_support_center);
                aVar2.setCancelable(false);
                aVar2.setPositiveButton(R.string.wallet_call, new t(i16, xVar, (com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) obj2));
                aVar2.setNegativeButton(R.string.lbl_cancel, new c1(xVar, i15));
                return Unit.INSTANCE;
            case 7:
                androidx.appcompat.app.e.a aVar3 = (androidx.appcompat.app.e.a) obj;
                aVar3.getClass();
                aVar3.setTitle(R.string.dialog_title_error);
                aVar3.setMessage(((InvalidAppletException.a) obj3).f51226a);
                aVar3.setCancelable(false);
                aVar3.setNegativeButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e((l) obj2, 9));
                return Unit.INSTANCE;
            case 8:
                Boolean bool = (Boolean) obj;
                ResetWalletActivity.a aVar4 = ResetWalletActivity.f52134l;
                hn2.c.ba((ResetWalletActivity) obj3, bool, null, null, 14);
                ((Button) obj2).setEnabled(!s.g(bool, Boolean.TRUE));
                return Unit.INSTANCE;
            case 9:
                b0 b0Var = (b0) obj3;
                p1 p1Var = (p1) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (s.g(i3Var.f111063a, "settings")) {
                    ge1.b.T(b0Var, null, null, new q72.h.a(p1Var, null), 3);
                }
                return Unit.INSTANCE;
            case 10:
                b0 b0Var2 = (b0) obj3;
                q82.b bVar3 = (q82.b) obj2;
                f fVar = (f) obj;
                fVar.getClass();
                int i24 = q82.a.c.f143361a[fVar.ordinal()];
                if (i24 == 1) {
                    ge1.b.T(b0Var2, null, null, new q82.a.C2699a(bVar3, null), 3);
                } else {
                    if (i24 != 2) {
                        u0.r();
                        return null;
                    }
                    ge1.b.T(b0Var2, null, null, new q82.a.b(bVar3, null), 3);
                }
                return Unit.INSTANCE;
            case 11:
                ((Boolean) obj).getClass();
                ((l) obj3).invoke((sg1.c) obj2);
                return Unit.INSTANCE;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((p) obj3).invoke((sg1.c) obj2, bool2);
                return Unit.INSTANCE;
            case 13:
                k kVar = (k) obj3;
                com.garmin.android.library.mapsdkadapter.i iVar2 = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar2.getClass();
                ie2.s sVarF = iVar2.F((ie2.t) obj2);
                kVar.f144594b = sVarF;
                if (kVar.f144593a) {
                    sVarF.remove();
                }
                return Unit.INSTANCE;
            case 14:
                Context context2 = (Context) obj2;
                vn0.a aVar5 = (vn0.a) obj;
                aVar5.getClass();
                ((mn0.p) obj3).d();
                context2.getClass();
                sd2.f fVar2 = aVar5.f178837a;
                ni1.a.C2424a c2424a = ni1.a.f126196a;
                DeviceSettingsActivityTrackerSetupDefault.a aVar6 = DeviceSettingsActivityTrackerSetupDefault.a.PULSE_OX_SETTINGS;
                long unitID = fVar2.getUnitID();
                String productNumber = fVar2.getProductNumber();
                productNumber.getClass();
                String productDisplayName = fVar2.getProductDisplayName();
                productDisplayName.getClass();
                c2424a.getClass();
                context2.startActivity(ni1.a.C2424a.a(context2, aVar6, unitID, productNumber, productDisplayName));
                return Unit.INSTANCE;
            case 15:
                int i25 = ActivityDetailsFragment.I;
                ((mc) obj).getClass();
                ((ComposeView) obj3).disposeComposition();
                ((m0) obj2).f105804a = false;
                return Unit.INSTANCE;
            case 16:
                int i26 = qr.t.A2;
                ((PrivacyType) obj).getClass();
                ((qr.t) obj3).E4(new w0.q0((PrivacyType) obj2));
                return Unit.INSTANCE;
            case 17:
                qr2.d dVar2 = (qr2.d) obj3;
                dVar2.f146947l.m(Boolean.FALSE);
                com.airbnb.lottie.animation.keyframe.a.z("Failed to get most recent passcode data. Falling back on previously cached data. (cause: ", ((Throwable) obj).getMessage(), ")", qr2.d.f146935v);
                dVar2.z4(((n) obj2).f140513p);
                return Unit.INSTANCE;
            case 18:
                TextView textView = (TextView) obj3;
                LeaderboardConnectionsActivity leaderboardConnectionsActivity = (LeaderboardConnectionsActivity) obj2;
                k4 k4Var = (k4) obj;
                int i27 = LeaderboardConnectionsActivity.f37970h;
                k4Var.getClass();
                k4 k4Var2 = k4.CurrentWeek;
                textView.setText(k4Var != k4Var2 ? R.string.lbl_last_week : R.string.lbl_this_week);
                Menu menu = leaderboardConnectionsActivity.f37977g;
                if (menu != null && (item = menu.getItem(0)) != null) {
                    item.setTitle(leaderboardConnectionsActivity.getString(k4Var != k4Var2 ? R.string.lbl_view_current_week : R.string.lbl_view_last_week));
                }
                return Unit.INSTANCE;
            case 19:
                Location location = (Location) obj;
                qw0.b.a aVar7 = qw0.b.f148296j;
                ((qw0.b.InterfaceC2796b) obj3).onLocationChanged(location);
                a2 a2Var = a2.LOCATION;
                String str = ((qw0.b) obj2).f148298b + " getLastKnownLocation: FUSE Client - new location: " + location + ".";
                i2.f36769a.getClass();
                i2.a.b(a2Var, "GCMBackgroundLocationClient", str);
                return Unit.INSTANCE;
            case 20:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ((p) obj3).invoke(((dy1.h) obj2).f61556a, bool3);
                return Unit.INSTANCE;
            case 21:
                m mVar = (m) obj2;
                v1.a aVar8 = (v1.a) obj;
                aVar8.getClass();
                int iC = MathKt.c(mVar.d());
                c2 c2Var = mVar.f148901i;
                v1.a.K(aVar8, (v1) obj3, iC - ((int) (((g6.k) c2Var.getF182175a()).f76005a >> 32)), (MathKt.c(mVar.e()) - ((int) (((g6.k) c2Var.getF182175a()).f76005a & 4294967295L))) + MathKt.c(((Number) mVar.f148903k.getF182175a()).floatValue()), null, 12);
                return Unit.INSTANCE;
            case 22:
                ge1.b.T((b0) obj3, null, null, new r02.i.a.C2807a((m) obj2, (n4.c) obj, null), 3);
                return Unit.INSTANCE;
            case 23:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                ((p) obj3).invoke((b11.i) obj2, bool4);
                return Unit.INSTANCE;
            case 24:
                qw0.y yVar2 = (qw0.y) obj3;
                j.a aVar9 = (j.a) obj2;
                e2 e2Var = (e2) obj;
                if (e2Var instanceof r2.a) {
                    yVar2.invoke(((r2.a) e2Var).f149431a);
                } else {
                    if (!(e2Var instanceof r2.d)) {
                        vb.h.z("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                        return null;
                    }
                    aVar9.invoke(((r2.d) e2Var).f149434a);
                }
                return Boolean.TRUE;
            case 25:
                r rVar = (r) obj;
                rVar.getClass();
                ((q) obj3).f172749n.k(null, rVar);
                ((zc.d) obj2).e();
                return Unit.INSTANCE;
            case 26:
                n0 n0Var = (n0) obj3;
                DeviceOnboardingActivity.a aVar10 = DeviceOnboardingActivity.f39726b;
                ((i0) obj).getClass();
                a0 a0Var = new a0((DeviceOnboardingActivity) obj2, 10);
                n0Var.getF158016a().a(a0Var);
                return new DeviceOnboardingActivity.c(n0Var, a0Var);
            case 27:
                Context context3 = (Context) obj3;
                r31.j jVar = (r31.j) obj2;
                d31.d dVar3 = (d31.d) obj;
                dVar3.getClass();
                z0 z0VarA = h31.d.a(dVar3);
                if (z0VarA != null) {
                    z0.b(z0VarA, context3, null, jVar.f150028a, jVar.f150029b, jVar.f150030c, 2);
                }
                return Unit.INSTANCE;
            case 28:
                Context context4 = (Context) obj3;
                k31.a aVar11 = (k31.a) obj2;
                d31.d dVar4 = (d31.d) obj;
                dVar4.getClass();
                ht.s sVar = ht.s.f85508a;
                jt.a aVar12 = new jt.a(dVar4.f57377a, "OnboardingFeatureSetupClicked");
                sVar.getClass();
                ht.s.a(aVar12);
                z0 z0VarA2 = h31.d.a(dVar4);
                if (z0VarA2 != null) {
                    z0.b(z0VarA2, context4, null, aVar11.f102603a, aVar11.f102604b, aVar11.f102605c, 2);
                }
                return Unit.INSTANCE;
            default:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                ((n1) obj2).t(((ArrayList) obj3).indexOf(s0Var));
                return Unit.INSTANCE;
        }
    }
}
