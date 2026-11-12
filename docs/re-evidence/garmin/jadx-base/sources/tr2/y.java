package tr2;

import am.x0;
import am.z0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.i0;
import androidx.lifecycle.j1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.badges.redesign.a.c;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.floors.presentation.FloorsActivity;
import com.garmin.android.apps.connectmobile.gcplus.presentation.dev.SubscriptionDevMenuActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.LivetrackGroupRideConsentActivity;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestFullListActivity;
import com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestListFragment;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.samd.presentation.mfa.MfaSetupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.edge520Plus.Edge520PlusActivityOptionsSettingActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.b0;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardActivity;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import java.util.ArrayList;
import java.util.List;
import lc.m0;
import o53.f0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import ps.d1;
import r53.p2;
import zb0.c1;
import zb0.g0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class y implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f166188b;

    public /* synthetic */ y(Object obj, int i14) {
        this.f166187a = i14;
        this.f166188b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r1v124, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // f.b
    public final void a(Object obj) {
        Context context;
        androidx.fragment.app.m activity;
        String str;
        nj1.d dVar;
        nj1.c subcategoryDetails;
        x0 x0Var;
        m0 m0Var;
        lc.v vVarI;
        j1 j1VarA;
        Parcelable parcelable;
        Intent intent;
        Bundle extras;
        Parcelable parcelable2;
        ab1.f fVar;
        InboxRequestListFragment inboxRequestListFragment;
        Object value;
        l20.a aVar;
        l20.r rVar;
        Bundle extras2;
        Bundle extras3;
        Parcelable parcelable3;
        Bundle extras4;
        Parcelable parcelable4;
        int i14 = this.f166187a;
        Object obj2 = null;
        com.garmin.feature.garminpay.ui.addcard.b.c cVar = null;
        boolValueOf = null;
        Boolean boolValueOf = null;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = null;
        Object obj3 = this.f166188b;
        switch (i14) {
            case 0:
                com.garmin.feature.garminpay.ui.userwallet.e eVar2 = (com.garmin.feature.garminpay.ui.userwallet.e) obj3;
                f.a aVar2 = (f.a) obj;
                com.garmin.feature.garminpay.ui.userwallet.e.a aVar3 = com.garmin.feature.garminpay.ui.userwallet.e.f52303k;
                aVar2.getClass();
                Logger logger = com.garmin.feature.garminpay.ui.userwallet.e.f52304l;
                int i15 = aVar2.f67585a;
                u62.z.i("resultActivityLauncher: resultCode=", i15, logger);
                Intent intent2 = aVar2.f67586b;
                String stringExtra = intent2 != null ? intent2.getStringExtra("card.display.name") : null;
                ArrayList<String> stringArrayListExtra = intent2 != null ? intent2.getStringArrayListExtra("watch.display.names") : null;
                if (i15 == 100) {
                    Context context2 = eVar2.getContext();
                    if (context2 != null) {
                        or2.b bVar = or2.b.f133424a;
                        RecyclerView recyclerView = eVar2.f52310f;
                        if (recyclerView == null) {
                            p005kotlin.jvm.internal.s.m("userWalletRecyclerView");
                            throw null;
                        }
                        or2.b.c(bVar, context2, recyclerView, wr2.q.b.REMOVED_COMPLETELY, stringExtra, stringArrayListExtra);
                    }
                } else if (i15 == 101 && (context = eVar2.getContext()) != null) {
                    or2.b bVar2 = or2.b.f133424a;
                    RecyclerView recyclerView2 = eVar2.f52310f;
                    if (recyclerView2 == null) {
                        p005kotlin.jvm.internal.s.m("userWalletRecyclerView");
                        throw null;
                    }
                    or2.b.c(bVar2, context, recyclerView2, wr2.q.b.REMOVED_PARTIALLY, stringExtra, stringArrayListExtra);
                }
                androidx.fragment.app.m activity2 = eVar2.getActivity();
                UserWalletActivity userWalletActivity = activity2 instanceof UserWalletActivity ? (UserWalletActivity) activity2 : null;
                if (userWalletActivity != null) {
                    vr2.e eVar3 = userWalletActivity.f52219g;
                    if (eVar3 != null) {
                        eVar3.d0();
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                    }
                }
                return;
            case 1:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar4 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a) obj3;
                f.a aVar5 = (f.a) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                aVar5.getClass();
                if (aVar5.f67585a == -1) {
                    androidx.fragment.app.m activity3 = aVar4.getActivity();
                    activity3.getClass();
                    ((EventDetailsActivity) activity3).ma();
                    return;
                }
                return;
            case 2:
                b0 b0Var = (b0) obj3;
                f.a aVar6 = (f.a) obj;
                b0.a aVar7 = b0.f45848e;
                aVar6.getClass();
                int i16 = aVar6.f67585a;
                if (i16 != -1 || (activity = b0Var.getActivity()) == null) {
                    return;
                }
                activity.setResult(i16, aVar6.f67586b);
                activity.finish();
                return;
            case 3:
                u12.h hVar = (u12.h) obj3;
                f.a aVar8 = (f.a) obj;
                aVar8.getClass();
                if (aVar8.f67585a == -1) {
                    Intent intent3 = aVar8.f67586b;
                    String stringExtra2 = intent3 != null ? intent3.getStringExtra("GCM_extra_privacy_type") : null;
                    m12.r rVar2 = hVar.f167783e;
                    ip.a aVar9 = hVar.f167782d;
                    if (aVar9 == null || (x0Var = aVar9.f94639a) == null || (str = x0Var.f4358a) == null) {
                        str = x0.f4346x.f4358a;
                    }
                    int iB = rVar2.B(str);
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b bVar3 = (com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) hVar.f167781c.getValue();
                    PrivacyType privacyTypeB = PrivacyType.Companion.b(PrivacyType.INSTANCE, stringExtra2);
                    bVar3.getClass();
                    y0<nj1.b> y0Var = bVar3.f47148b;
                    nj1.b bVarD = y0Var.d();
                    if (bVarD != null) {
                        for (Object obj4 : bVarD.d()) {
                            List<Integer> listB = ((nj1.d) obj4).b();
                            if (listB != null && listB.contains(Integer.valueOf(iB))) {
                                obj2 = obj4;
                                dVar = (nj1.d) obj2;
                                if (dVar != null && (subcategoryDetails = dVar.getSubcategoryDetails()) != null) {
                                    subcategoryDetails.d(privacyTypeB.getCategoryAccessRule());
                                }
                                y0Var.m(bVarD);
                                bVar3.z4(bVarD);
                                return;
                            }
                        }
                        dVar = (nj1.d) obj2;
                        if (dVar != null) {
                            subcategoryDetails.d(privacyTypeB.getCategoryAccessRule());
                        }
                        y0Var.m(bVarD);
                        bVar3.z4(bVarD);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                com.garmin.android.apps.connectmobile.badges.redesign.a aVar10 = (com.garmin.android.apps.connectmobile.badges.redesign.a) obj3;
                com.garmin.android.apps.connectmobile.badges.redesign.a.C0476a c0476a = com.garmin.android.apps.connectmobile.badges.redesign.a.f30373x;
                ((f.a) obj).getClass();
                ge1.b.T(g22.f.b(aVar10), null, null, aVar10.new c(null), 3);
                return;
            case 5:
                ((com.garmin.android.apps.connectmobile.settings.devices.common.f) obj3).J6();
                return;
            case 6:
                MoreActivity moreActivity = (MoreActivity) obj3;
                f.a aVar11 = (f.a) obj;
                int i17 = MoreActivity.f39378g;
                aVar11.getClass();
                if (aVar11.f67585a == -1) {
                    moreActivity.onActivityResult(59465, -1, new Intent());
                    return;
                }
                return;
            case 7:
                w50.d dVar2 = (w50.d) obj3;
                if (!((Boolean) obj).booleanValue()) {
                    dVar2.f182193h = false;
                    qe2.h hVar2 = dVar2.f148294e;
                    if (hVar2 != null) {
                        hVar2.setMyLocationEnabled(false);
                    }
                    i2.a aVar12 = i2.f36769a;
                    a2 a2Var = a2.COURSES;
                    aVar12.getClass();
                    i2.a.b(a2Var, "CoursesMapFragment", "requestPermissionLauncher:location perm off, no location client will be created");
                    return;
                }
                int i18 = w50.d.f182192w;
                qe2.h hVar3 = dVar2.f148294e;
                if (hVar3 != null) {
                    hVar3.setMyLocationEnabled(true);
                }
                dVar2.A6();
                i2.a aVar13 = i2.f36769a;
                a2 a2Var2 = a2.COURSES;
                aVar13.getClass();
                i2.a.b(a2Var2, "CoursesMapFragment", "requestPermissionLauncher:location perm on, creating the location client");
                return;
            case 8:
                PendingActivitiesActivity pendingActivitiesActivity = (PendingActivitiesActivity) obj3;
                f.a aVar14 = (f.a) obj;
                PendingActivitiesActivity.a aVar15 = PendingActivitiesActivity.f39793d;
                aVar14.getClass();
                if (aVar14.f67585a == -1) {
                    Intent intent4 = aVar14.f67586b;
                    String stringExtra3 = intent4 != null ? intent4.getStringExtra("GCM_extra_activity_type") : null;
                    if (stringExtra3 == null || (m0Var = pendingActivitiesActivity.f39795b) == null || (vVarI = m0Var.f111904b.i()) == null || (j1VarA = vVarI.a()) == null) {
                        return;
                    }
                    j1VarA.f(stringExtra3, "activityTypeResultKey");
                    return;
                }
                return;
            case 9:
                MfaSetupActivity mfaSetupActivity = (MfaSetupActivity) obj3;
                f.a aVar16 = (f.a) obj;
                MfaSetupActivity.a aVar17 = MfaSetupActivity.f41181c;
                aVar16.getClass();
                a2 a2Var3 = a2.USER;
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "MfaSetupActivity", "[mfaFlowLauncher] MFA flow result");
                int i19 = aVar16.f67585a;
                if (i19 == -1) {
                    i2.a.b(a2Var3, "MfaSetupActivity", "[mfaFlowLauncher] MFA flow completed successfully");
                    ((vf1.a) KoinJavaComponent.get$default(vf1.a.class, null, null, 6, null)).g();
                    ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                } else if (i19 != 0) {
                    Intent intent5 = aVar16.f67586b;
                    Exception excF = intent5 != null ? mfaSetupActivity.f41182a.f(intent5) : null;
                    if (excF instanceof NoNetworkException) {
                        i2.a.f(a2Var3, "MfaSetupActivity", "[mfaFlowLauncher] no internet");
                    } else {
                        i2.a.f(a2Var3, "MfaSetupActivity", "[mfaFlowLauncher] error: " + (excF != null ? excF.getMessage() : null));
                        g22.a.a(mfaSetupActivity, new fw.r());
                    }
                } else {
                    i2.a.b(a2Var3, "MfaSetupActivity", "[mfaFlowLauncher] MFA flow result cancelled");
                }
                mfaSetupActivity.finish();
                return;
            case 10:
                LivetrackGroupRideConsentActivity livetrackGroupRideConsentActivity = (LivetrackGroupRideConsentActivity) obj3;
                LivetrackGroupRideConsentActivity.a aVar18 = LivetrackGroupRideConsentActivity.f38667k;
                ((f.a) obj).getClass();
                if (livetrackGroupRideConsentActivity.f38671i) {
                    livetrackGroupRideConsentActivity.finish();
                    return;
                } else {
                    bv.b.f21239a.getClass();
                    ((kd0.m) bv.b.a()).a(livetrackGroupRideConsentActivity, new Bundle(), 268468224);
                    return;
                }
            case 11:
                CreateCustomCourseActivity createCustomCourseActivity = (CreateCustomCourseActivity) obj3;
                f.a aVar19 = (f.a) obj;
                CreateCustomCourseActivity.a aVar20 = CreateCustomCourseActivity.f33013f;
                aVar19.getClass();
                if (aVar19.f67585a == -1) {
                    l2.a aVar21 = l2.f37135b;
                    Intent intent6 = aVar19.f67586b;
                    aVar21.getClass();
                    Bundle bundleA = l2.a.a(intent6);
                    if (bundleA != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_course_detail", com.garmin.android.apps.connectmobile.courses.model.e.class);
                        } else {
                            Parcelable parcelable5 = bundleA.getParcelable("GCM_extra_course_detail");
                            parcelable = (com.garmin.android.apps.connectmobile.courses.model.e) (parcelable5 instanceof com.garmin.android.apps.connectmobile.courses.model.e ? parcelable5 : null);
                        }
                        eVar = (com.garmin.android.apps.connectmobile.courses.model.e) parcelable;
                    }
                    if (eVar != null) {
                        createCustomCourseActivity.ha(new a50.c.h0(eVar));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) obj3;
                f.a aVar22 = (f.a) obj;
                EditPowerGuideStrategyActivity.a aVar23 = EditPowerGuideStrategyActivity.f40384t;
                aVar22.getClass();
                if (aVar22.f67585a != -1 || (intent = aVar22.f67586b) == null || (extras = intent.getExtras()) == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = (Parcelable) extras.getParcelable("GCM_extra_nutrition_hydration_details", w01.c.class);
                } else {
                    Parcelable parcelable6 = extras.getParcelable("GCM_extra_nutrition_hydration_details");
                    if (!(parcelable6 instanceof w01.c)) {
                        parcelable6 = null;
                    }
                    parcelable2 = (w01.c) parcelable6;
                }
                w01.c cVar2 = (w01.c) parcelable2;
                if (cVar2 == null || (fVar = editPowerGuideStrategyActivity.f40390f) == null) {
                    return;
                }
                fVar.f2566d = cVar2;
                com.garmin.android.apps.connectmobile.courses.model.e eVar4 = fVar.f2564b;
                double dQ = eVar4 != null ? eVar4.q() : 0.0d;
                ya1.r rVar3 = editPowerGuideStrategyActivity.f40385a;
                if (rVar3 == null) {
                    p005kotlin.jvm.internal.s.m("summaryViewHolder");
                    throw null;
                }
                z21.i iVar = rVar3.f195608s;
                if (iVar != null) {
                    iVar.a(cVar2, dQ);
                    return;
                }
                return;
            case 13:
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) obj3;
                f.a aVar24 = (f.a) obj;
                AuthenticationActivity.a aVar25 = AuthenticationActivity.f50343v;
                if (aVar24.f67585a == -1) {
                    i0 i0VarW = f0.w(authenticationActivity);
                    x53.c cVar3 = s0.f129406a;
                    ge1.b.T(i0VarW, x53.b.f189152a, null, new AuthenticationActivity.c(aVar24, authenticationActivity, null), 2);
                    return;
                }
                return;
            case 14:
                FloorsActivity floorsActivity = (FloorsActivity) obj3;
                f.a aVar26 = (f.a) obj;
                int i24 = FloorsActivity.f35229c;
                aVar26.getClass();
                if (aVar26.f67585a == -1) {
                    ((xh0.h) floorsActivity.f35230a.getValue()).f191014g.g();
                    return;
                }
                return;
            case 15:
                InboxRequestFullListActivity inboxRequestFullListActivity = (InboxRequestFullListActivity) obj3;
                f.a aVar27 = (f.a) obj;
                int i25 = InboxRequestFullListActivity.f39559b;
                aVar27.getClass();
                if (aVar27.f67585a != -1 || (inboxRequestListFragment = (InboxRequestListFragment) inboxRequestFullListActivity.getSupportFragmentManager().F(R.id.inbox_request_fragment_container_view)) == null) {
                    return;
                }
                inboxRequestListFragment.E6();
                return;
            case 16:
                SubscriptionDevMenuActivity subscriptionDevMenuActivity = (SubscriptionDevMenuActivity) obj3;
                f.a aVar28 = (f.a) obj;
                int i26 = SubscriptionDevMenuActivity.f35309d;
                aVar28.getClass();
                if (aVar28.f67585a == 0) {
                    a2 a2Var4 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, "SubscriptionDevMenuActivity", "User cancelled their subscription purchase.");
                    return;
                } else {
                    a2 a2Var5 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var5, "SubscriptionDevMenuActivity", "User successful or failed at purchasing a subscription. Refreshing.");
                    ((yj0.f) subscriptionDevMenuActivity.f35311b.getValue()).x4();
                    return;
                }
            case 17:
                com.garmin.realtimesettings.app.presentationlayer.c cVar4 = (com.garmin.realtimesettings.app.presentationlayer.c) obj3;
                cx2.h hVar4 = cVar4.f52642b;
                f.a aVar29 = (f.a) obj;
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar30 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                aVar29.getClass();
                int i27 = aVar29.f67585a;
                if (i27 == -1) {
                    hVar4.getClass();
                    cVar4.F6(false);
                    return;
                } else if (i27 == 0) {
                    hVar4.getClass();
                    return;
                } else {
                    if (i27 != 1) {
                        return;
                    }
                    hVar4.getClass();
                    cVar4.F6(true);
                    return;
                }
            case 18:
                ((zb0.o) obj3).J6();
                return;
            case 19:
                g0 g0Var = (g0) obj3;
                if (((f.a) obj).f67585a == -1) {
                    g0Var.y6();
                    return;
                }
                return;
            case 20:
                f.a aVar31 = (f.a) obj;
                int i28 = c1.f203441z;
                aVar31.getClass();
                wn1.g gVarY6 = ((c1) obj3).y6();
                int i29 = aVar31.f67585a;
                gVarY6.f186225h.X(i29);
                p2 p2Var = gVarY6.f186226i;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, wn1.d.a((wn1.d) value, null, null, null, null, null, Integer.valueOf(i29), 31)));
                return;
            case 21:
                int i30 = Edge520PlusActivityOptionsSettingActivity.f42944j;
                ((Edge520PlusActivityOptionsSettingActivity) obj3).o2(0);
                return;
            case 22:
                w1 w1Var = ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a) obj3).f43867a;
                f.a aVar32 = (f.a) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a.C0817a c0817a = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a.f43866c;
                aVar32.getClass();
                Intent intent7 = aVar32.f67586b;
                if (aVar32.f67585a == -1) {
                    if (intent7 == null || (extras4 = intent7.getExtras()) == null) {
                        aVar = null;
                    } else {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable4 = (Parcelable) extras4.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                        } else {
                            Parcelable parcelable7 = extras4.getParcelable("RESULT_CONTACT_DTO");
                            if (!(parcelable7 instanceof l20.a)) {
                                parcelable7 = null;
                            }
                            parcelable4 = (l20.a) parcelable7;
                        }
                        aVar = (l20.a) parcelable4;
                    }
                    if (intent7 == null || (extras3 = intent7.getExtras()) == null) {
                        rVar = null;
                    } else {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable3 = (Parcelable) extras3.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO", l20.r.class);
                        } else {
                            Parcelable parcelable8 = extras3.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO");
                            if (!(parcelable8 instanceof l20.r)) {
                                parcelable8 = null;
                            }
                            parcelable3 = (l20.r) parcelable8;
                        }
                        rVar = (l20.r) parcelable3;
                    }
                    if (intent7 != null && (extras2 = intent7.getExtras()) != null) {
                        boolValueOf = Boolean.valueOf(extras2.getBoolean("IS_CONTACT_UPDATED", true));
                    }
                    if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.FALSE) || aVar == null) {
                        return;
                    }
                    if (rVar != null) {
                        ((pj1.s) w1Var.getValue()).h5(rVar);
                    }
                    ((pj1.s) w1Var.getValue()).R4(aVar);
                    ((pj1.s) w1Var.getValue()).J0.m("SafetyFeaturesReviewEmergencyContactsFragment");
                    return;
                }
                return;
            case 23:
                wi1.e eVar5 = (wi1.e) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar33 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                eVar5.getClass();
                pj1.s sVarU6 = ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b) obj3).u6();
                ge1.b.T(v1.a(sVarU6), null, null, new pj1.v(eVar5, sVarU6, null), 3);
                return;
            case 24:
                zo.d dVar3 = (zo.d) obj3;
                f.a aVar34 = (f.a) obj;
                aVar34.getClass();
                if (aVar34.f67585a == -1) {
                    Intent intent8 = aVar34.f67586b;
                    String stringExtra4 = intent8 != null ? intent8.getStringExtra("GCM_extra_activity_type") : null;
                    if (stringExtra4 != null) {
                        x0 x0VarL = z0.l(x0.f4308n, stringExtra4);
                        i2.a aVar35 = i2.f36769a;
                        aVar35.getClass();
                        i2.a.a(a2.ACTIVITIES, "Selected " + x0VarL);
                        ap.d dVarE6 = dVar3.E6();
                        int i34 = dVar3.f206024g;
                        yo.e eVar6 = dVarE6.f11593e;
                        eVar6.getClass();
                        yo.w wVar = eVar6.f198237g;
                        wVar.getClass();
                        d1 d1Var = (d1) ((ArrayList) wVar.e()).get(i34);
                        d1Var.getClass();
                        d1Var.f139790f = x0VarL;
                        wVar.f198318h.j(wVar.e());
                        return;
                    }
                    return;
                }
                return;
            case 25:
                com.garmin.feature.garminpay.ui.addcard.b bVar4 = (com.garmin.feature.garminpay.ui.addcard.b) obj3;
                e23.l<com.garmin.feature.garminpay.ui.addcard.b.c, Unit> lVar = bVar4.f51840b;
                f.a aVar36 = (f.a) obj;
                com.garmin.feature.garminpay.ui.addcard.b.C1079b c1079b = com.garmin.feature.garminpay.ui.addcard.b.f51838f;
                aVar36.getClass();
                int i35 = aVar36.f67585a;
                if (i35 != -1) {
                    if (i35 != 0) {
                        lVar.invoke(new com.garmin.feature.garminpay.ui.addcard.b.c.C1080b());
                        return;
                    } else {
                        bVar4.f51842d.invoke();
                        return;
                    }
                }
                Intent intent9 = aVar36.f67586b;
                if (intent9 != null) {
                    com.garmin.feature.garminpay.ui.addcard.b.c.Q.getClass();
                    cVar = (com.garmin.feature.garminpay.ui.addcard.b.c) intent9.getParcelableExtra("extra.error");
                }
                if (cVar == null) {
                    bVar4.f51841c.invoke();
                    return;
                } else {
                    lVar.invoke(cVar);
                    return;
                }
            case 26:
                zu1.c cVar5 = (zu1.c) obj3;
                zu1.c.a aVar37 = zu1.c.f207075i;
                ((f.a) obj).getClass();
                p92.o oVar = p92.o.f136619a;
                q92.x xVar = q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
                oVar.getClass();
                q92.v vVarN = p92.o.n(xVar);
                if (!cVar5.f207080e || vVarN == null || vVarN.b() || q92.c.a(vVarN)) {
                    return;
                }
                Intent intent10 = new Intent();
                intent10.putExtra("EXTRA_REFRESH_CHILD_COACH", true);
                cVar5.requireActivity().setResult(-1, intent10);
                cVar5.requireActivity().finish();
                return;
            default:
                EventDashBoardActivity eventDashBoardActivity = (EventDashBoardActivity) obj3;
                f.a aVar38 = (f.a) obj;
                int i36 = EventDashBoardActivity.f45898f;
                aVar38.getClass();
                Intent intent11 = aVar38.f67586b;
                if (aVar38.f67585a != -1 || intent11 == null) {
                    return;
                }
                boolean booleanExtra = intent11.getBooleanExtra("GCM_extra_event_created", false);
                String stringExtra5 = intent11.getStringExtra("GCM_extra_event_name");
                if (intent11.hasExtra("extra_event_dashboard_refresh_needed")) {
                    eventDashBoardActivity.ca().c5(Boolean.valueOf(intent11.getBooleanExtra("extra_event_dashboard_refresh_needed", false)));
                    if (!booleanExtra || stringExtra5 == null) {
                        return;
                    }
                    View viewFindViewById = eventDashBoardActivity.findViewById(android.R.id.content);
                    viewFindViewById.getClass();
                    String string = eventDashBoardActivity.getString(R.string.event_added_to_calendar, stringExtra5);
                    string.getClass();
                    eg0.c.c(viewFindViewById, string);
                    return;
                }
                if (intent11.getBooleanExtra("extra_event_unsubscribed", false) || intent11.getBooleanExtra("GCM_extra_event_deleted", false)) {
                    eventDashBoardActivity.ca().c5(Boolean.TRUE);
                    if (stringExtra5 != null) {
                        View viewFindViewById2 = eventDashBoardActivity.findViewById(android.R.id.content);
                        viewFindViewById2.getClass();
                        String string2 = eventDashBoardActivity.getString(R.string.event_removed_from_calendar, stringExtra5);
                        string2.getClass();
                        eg0.c.c(viewFindViewById2, string2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
