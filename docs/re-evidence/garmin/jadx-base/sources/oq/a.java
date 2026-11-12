package oq;

import ab1.h;
import ab1.k;
import ak0.m;
import am.j;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.deeplink.GarminDiveDeepLinkActivity;
import com.garmin.android.apps.connectmobile.activities.map.LocationPickerMapActivity;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.pickers.ExerciseWeightPickerActivity;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppStoreActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDeviceListActivity;
import com.garmin.android.apps.connectmobile.consent.InsightsConsentActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgCompleteSetupTwoStepVerificationFragment;
import com.garmin.android.apps.connectmobile.golf.DownloadGolfAppDeepLinkActivity;
import com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostActivity;
import com.garmin.android.apps.connectmobile.home.MyDeviceActivity;
import com.garmin.android.apps.connectmobile.l;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2.MenstrualCycleTrackingActivity;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideListActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyGenesisActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupGenesisActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupValidationActivity;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.apps.connectmobile.segments.presentation.MySegmentsActivity;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.view.BottomNavigationLayout;
import com.garmin.android.apps.connectmobile.view.GCMComplexBanner;
import com.garmin.android.apps.connectmobile.view.LocationTextPickerActivity;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.StyledInlineButtonFieldViewDark;
import com.garmin.android.apps.connectmobile.view.banner.GCMTextBanner;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkExerciseDetailsFragment;
import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import com.garmin.androiddynamicsettings.app.features.controlsmenu.boundedcontrolsupport.presenter.BoundedControlsMenuActivity;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.fragment.FitPayAdditionalInformationFragment;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import com.garmin.feature.garminpay.ui.passcode.ResetWalletActivity;
import com.google.android.material.textfield.TextInputLayout;
import d53.w;
import iz1.g;
import java.util.Iterator;
import n82.i;
import ng1.c1;
import o13.p;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import po.a0;
import qi1.f;
import qm.p0;
import qm0.x;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133260b;

    public /* synthetic */ a(m mVar, GCMTextBanner gCMTextBanner) {
        this.f133259a = 29;
        this.f133260b = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0399  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:188:0x0409  */
    /* JADX WARN: Code duplicated, block: B:191:0x041d  */
    /* JADX WARN: Code duplicated, block: B:263:0x042c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:? A[LOOP:0: B:189:0x0414->B:265:?, LOOP_END, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Bundle bundle;
        Object obj;
        Bundle bundle2;
        int i14 = this.f133259a;
        int i15 = 8;
        int i16 = 1;
        Object obj2 = null;
        obj2 = null;
        Object obj3 = null;
        obj2 = null;
        bundle = null;
        obj2 = null;
        bundle = null;
        obj2 = null;
        bundle = null;
        obj2 = null;
        obj2 = null;
        bundle = null;
        obj2 = null;
        bundle = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        bundle = null;
        obj2 = null;
        bundle = null;
        bundle = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        bundle = null;
        bundle = null;
        bundle = null;
        obj2 = null;
        obj2 = null;
        bundle = null;
        obj2 = null;
        obj2 = null;
        bundle = null;
        obj2 = null;
        bundle = null;
        obj2 = null;
        obj2 = null;
        Bundle bundle3 = null;
        obj2 = null;
        obj2 = null;
        Object obj4 = this.f133260b;
        switch (i14) {
            case 0:
                ExerciseWeightPickerActivity exerciseWeightPickerActivity = (ExerciseWeightPickerActivity) obj4;
                ExerciseWeightPickerActivity.a aVar = ExerciseWeightPickerActivity.f29943f;
                exerciseWeightPickerActivity.da().setVisibility(0);
                exerciseWeightPickerActivity.ca().setHint("");
                return;
            case 1:
                int i17 = EcgCompleteSetupTwoStepVerificationFragment.f34861c;
                ((EcgCompleteSetupTwoStepVerificationFragment) obj4).u6();
                return;
            case 2:
                BoundedControlsMenuActivity boundedControlsMenuActivity = (BoundedControlsMenuActivity) obj4;
                int i18 = BoundedControlsMenuActivity.f50595z;
                ph2.d dVar = boundedControlsMenuActivity.f50601q;
                if (dVar != null) {
                    dVar.a(255, boundedControlsMenuActivity.f50605w, true);
                    return;
                } else {
                    s.m("controlsMenuAdapter");
                    throw null;
                }
            case 3:
                ((a0.a) obj4).f138818b.toggle();
                return;
            case 4:
                PasscodeEntryActivity.a aVar2 = PasscodeEntryActivity.f52121n;
                ((PasscodeEntryActivity) obj4).da();
                return;
            case 5:
                ResetWalletActivity resetWalletActivity = (ResetWalletActivity) obj4;
                qr2.e eVar = resetWalletActivity.f52135g;
                g gVar = resetWalletActivity.f52138j;
                if (eVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                boolean zE = eVar.S1().e();
                qr2.e eVar2 = resetWalletActivity.f52135g;
                if (zE) {
                    if (eVar2 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    eVar2.S1().k(gVar);
                } else {
                    if (eVar2 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    eVar2.S1().f(resetWalletActivity, gVar);
                }
                resetWalletActivity.f52139k.a();
                return;
            case 6:
                int i19 = ItemPickerActivity.d.f39987b;
                ((a83.a) obj4).invoke();
                return;
            case 7:
                ((i) obj4).invoke();
                return;
            case 8:
                PregnancySetupGenesisActivity pregnancySetupGenesisActivity = (PregnancySetupGenesisActivity) obj4;
                PregnancySetupGenesisActivity.a aVar3 = PregnancySetupGenesisActivity.f40944a;
                PregnancySetupValidationActivity.f40945c.getClass();
                pregnancySetupGenesisActivity.startActivity(new Intent(pregnancySetupGenesisActivity, (Class<?>) PregnancySetupValidationActivity.class));
                return;
            case 9:
                qh0.a aVar4 = (qh0.a) obj4;
                aVar4.f144691b.setText(String.valueOf(10).trim());
                aVar4.v6(true);
                return;
            case 10:
                com.garmin.android.apps.connectmobile.settings.lte.a.C0804a c0804a = com.garmin.android.apps.connectmobile.settings.lte.a.f43463f;
                ((f) ((com.garmin.android.apps.connectmobile.settings.lte.a) obj4).f43467d.getValue()).f144865g.m(new w61.f<>(Unit.INSTANCE));
                return;
            case 11:
                p0 p0Var = (p0) obj4;
                ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).q(p0Var.f145435a, p0Var.f145438d, p0Var.f145437c, p0Var.f145436b);
                return;
            case 12:
                x xVar = (x) obj4;
                int i24 = x.f145575g;
                CreatePostActivity.a aVar5 = CreatePostActivity.f36357a;
                androidx.fragment.app.m mVarRequireActivity = xVar.requireActivity();
                mVarRequireActivity.getClass();
                long jB4 = ((mm0.e) xVar.f145576a.getValue()).B4();
                aVar5.getClass();
                Intent intent = new Intent(mVarRequireActivity, (Class<?>) CreatePostActivity.class);
                Bundle bundle4 = new Bundle();
                bundle4.putLong("GCM_extra_connection_group_id", jB4);
                intent.putExtras(bundle4);
                xVar.f145581f.a(intent, new z6.b.a(ActivityOptions.makeCustomAnimation(xVar.requireContext(), R.anim.slide_in_up, R.anim.fade_out_animation)));
                return;
            case 13:
                BottomNavigationLayout bottomNavigationLayout = (BottomNavigationLayout) obj4;
                int i25 = BottomNavigationLayout.f47390d;
                Object tag = view2.getTag();
                tag.getClass();
                String str = (String) tag;
                if (!TextUtils.isEmpty(bottomNavigationLayout.mSelectedItem) && s.g(bottomNavigationLayout.mSelectedItem, str)) {
                    r0.b bVar = bottomNavigationLayout.f47391a;
                    if (bVar != null) {
                        r0.this.ia(str);
                        return;
                    } else {
                        s.m("mItemClickCallback");
                        throw null;
                    }
                }
                bottomNavigationLayout.a(view2, str);
                r0.b bVar2 = bottomNavigationLayout.f47391a;
                if (bVar2 == null) {
                    s.m("mItemClickCallback");
                    throw null;
                }
                r0 r0Var = r0.this;
                bv.b.f21239a.getClass();
                bv.b.a();
                com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                switch (str) {
                    case "MY_DEVICE_CUSTOMIZABLE":
                        bundle3 = new Bundle();
                        bundle3.putBoolean("GCM_device_settings_with_bottom_navigation", true);
                        obj = MyDeviceActivity.class;
                        Bundle bundle5 = bundle3;
                        obj2 = obj;
                        bundle = bundle5;
                        break;
                    case "NUTRITION":
                        obj = NutritionActivity.class;
                        Bundle bundle6 = bundle3;
                        obj2 = obj;
                        bundle = bundle6;
                        break;
                    case "ACTIVITIES":
                        bundle = new Bundle();
                        Iterator<T> it = ty0.b.f166900n3.iterator();
                        while (true) {
                            p13.c.b bVar3 = (p13.c.b) it;
                            if (bVar3.hasNext()) {
                                Object next = bVar3.next();
                                if (s.g(((ty0.b) next).f166942h, str)) {
                                    obj3 = next;
                                }
                            }
                        }
                        bundle.putSerializable("MORE_START_DESTINATION_EXTRA", (ty0.b) obj3);
                        obj2 = MoreActivity.class;
                        break;
                    case "LIFESTYLE_LOGGING":
                        obj = LifestyleLoggingActivity.class;
                        Bundle bundle7 = bundle3;
                        obj2 = obj;
                        bundle = bundle7;
                        break;
                    case "GARMIN_DIVE":
                        obj = GarminDiveDeepLinkActivity.class;
                        Bundle bundle8 = bundle3;
                        obj2 = obj;
                        bundle = bundle8;
                        break;
                    case "GARMIN_GOLF":
                        ht.a aVar6 = ht.a.f85464a;
                        Bundle bundleA = h7.c.a(new p("RedirectEntrance", "Home_Tab"));
                        aVar6.getClass();
                        ht.a.a(bundleA, "GolfRedirect");
                        bundle2 = new Bundle();
                        bundle2.putString("action", "play.screen");
                        bundle = bundle2;
                        obj2 = DownloadGolfAppDeepLinkActivity.class;
                        break;
                    case "NEWS_FEED":
                        obj = NewsFeedActivity.class;
                        Bundle bundle9 = bundle3;
                        obj2 = obj;
                        bundle = bundle9;
                        break;
                    case "MY_DEVICE":
                        obj = DashboardActivity.class;
                        Bundle bundle10 = bundle3;
                        obj2 = obj;
                        bundle = bundle10;
                        break;
                    case "CIQ_STORE":
                        l.g().getClass();
                        if (l.i()) {
                            l.g().getClass();
                            if (TextUtils.isEmpty(l.f())) {
                                obj = ConnectIQAppStoreActivity.class;
                            } else {
                                obj = ConnectIQDeviceListActivity.class;
                            }
                        } else {
                            obj = ConnectIQAppStoreActivity.class;
                        }
                        Bundle bundle11 = bundle3;
                        obj2 = obj;
                        bundle = bundle11;
                        break;
                    case "HOME":
                        obj = DashboardActivity.class;
                        Bundle bundle12 = bundle3;
                        obj2 = obj;
                        bundle = bundle12;
                        break;
                    case "MORE":
                        bundle = null;
                        obj2 = MoreActivity.class;
                        break;
                    case "GOLF_SCORECARD":
                        ht.a aVar7 = ht.a.f85464a;
                        Bundle bundleA2 = h7.c.a(new p("RedirectEntrance", "ScorecardList_Tab"));
                        aVar7.getClass();
                        ht.a.a(bundleA2, "GolfRedirect");
                        bundle2 = new Bundle();
                        bundle2.putString("action", "scorecard.list");
                        bundle = bundle2;
                        obj2 = DownloadGolfAppDeepLinkActivity.class;
                        break;
                    case "GOLF_COURSES":
                        ht.a aVar8 = ht.a.f85464a;
                        Bundle bundleA3 = h7.c.a(new p("RedirectEntrance", "CourseStats_Tab"));
                        aVar8.getClass();
                        ht.a.a(bundleA3, "GolfRedirect");
                        bundle2 = new Bundle();
                        bundle2.putString("action", "course.stats");
                        bundle = bundle2;
                        obj2 = DownloadGolfAppDeepLinkActivity.class;
                        break;
                    case "MENSTRUAL_CYCLE":
                        MenstrualCycleDetailsActivity.f38784t.getClass();
                        kg1.a.f104701a.getClass();
                        obj = kg1.a.C2003a.a().e() ? MenstrualCycleTrackingActivity.class : MenstrualCycleDetailsActivity.class;
                        Bundle bundle13 = bundle3;
                        obj2 = obj;
                        bundle = bundle13;
                        break;
                    case "CALENDAR":
                        obj = GCMCalendarActivity.class;
                        Bundle bundle14 = bundle3;
                        obj2 = obj;
                        bundle = bundle14;
                        break;
                    case "PERFORMANCE":
                        bundle = new Bundle();
                        Iterator<T> it3 = ty0.b.f166900n3.iterator();
                        while (true) {
                            p13.c.b bVar4 = (p13.c.b) it3;
                            if (bVar4.hasNext()) {
                                Object next2 = bVar4.next();
                                if (s.g(((ty0.b) next2).f166942h, str)) {
                                    obj3 = next2;
                                }
                            }
                        }
                        bundle.putSerializable("MORE_START_DESTINATION_EXTRA", (ty0.b) obj3);
                        obj2 = MoreActivity.class;
                        break;
                    case "GARMIN_COACH":
                        bundle3 = new Bundle();
                        bundle3.putString("GCM_tp_sel_navigation_item", str);
                        bundle3.putBoolean("GCM_tp_should_show_active_plan_details", true);
                        obj = ActiveTrainingPlansActivity.class;
                        Bundle bundle15 = bundle3;
                        obj2 = obj;
                        bundle = bundle15;
                        break;
                    case "WORKOUTS":
                        obj = WorkoutListActivity.class;
                        Bundle bundle16 = bundle3;
                        obj2 = obj;
                        bundle = bundle16;
                        break;
                    case "CHALLENGES":
                        obj = LeaderboardActivity.class;
                        Bundle bundle17 = bundle3;
                        obj2 = obj;
                        bundle = bundle17;
                        break;
                    case "INSIGHTS":
                        bundle3 = j.e(1, "extra_insights_redirect");
                        obj = InsightsConsentActivity.class;
                        Bundle bundle18 = bundle3;
                        obj2 = obj;
                        bundle = bundle18;
                        break;
                    case "PREGNANCY":
                        obj = PregnancyGenesisActivity.class;
                        Bundle bundle19 = bundle3;
                        obj2 = obj;
                        bundle = bundle19;
                        break;
                    case "COURSES":
                        obj = CoursesActivity.class;
                        Bundle bundle110 = bundle3;
                        obj2 = obj;
                        bundle = bundle110;
                        break;
                    case "SEGMENTS":
                        obj = MySegmentsActivity.class;
                        Bundle bundle111 = bundle3;
                        obj2 = obj;
                        bundle = bundle111;
                        break;
                    case "GOLF_STATS":
                        ht.a aVar9 = ht.a.f85464a;
                        Bundle bundleA4 = h7.c.a(new p("RedirectEntrance", "PerformanceStats_Tab"));
                        aVar9.getClass();
                        ht.a.a(bundleA4, "GolfRedirect");
                        bundle2 = new Bundle();
                        bundle2.putString("action", "performance.stats");
                        bundle = bundle2;
                        obj2 = DownloadGolfAppDeepLinkActivity.class;
                        break;
                    case "HEALTH":
                        bundle = new Bundle();
                        Iterator<T> it4 = ty0.b.f166900n3.iterator();
                        while (true) {
                            p13.c.b bVar5 = (p13.c.b) it4;
                            if (bVar5.hasNext()) {
                                Object next3 = bVar5.next();
                                if (s.g(((ty0.b) next3).f166942h, str)) {
                                    obj3 = next3;
                                }
                            }
                        }
                        bundle.putSerializable("MORE_START_DESTINATION_EXTRA", (ty0.b) obj3);
                        obj2 = MoreActivity.class;
                        break;
                    default:
                        bundle = null;
                        break;
                }
                obj2.getClass();
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Pair pair = new Pair(obj2, bundle);
                Class cls = (Class) pair.first;
                Bundle bundle20 = (Bundle) pair.second;
                if (cls != null) {
                    Intent intent2 = new Intent(r0Var, (Class<?>) cls);
                    if (bundle20 != null) {
                        intent2.putExtras(bundle20);
                    }
                    intent2.putExtra("GCM_extra_top_navigation", true);
                    intent2.putExtra("GCM_extra_navigation_item_unread_bubbles", r0Var.f41074c);
                    if (str.equals("HOME")) {
                        intent2.addFlags(603979776);
                    } else {
                        intent2.addFlags(335544320);
                    }
                    r0Var.startActivity(intent2);
                    return;
                }
                return;
            case 14:
                GCMComplexBanner gCMComplexBanner = (GCMComplexBanner) obj4;
                if (gCMComplexBanner.f47423j.getVisibility() == 0) {
                    gCMComplexBanner.setMinimized(true);
                    return;
                } else {
                    gCMComplexBanner.setVisibility(8);
                    return;
                }
            case 15:
                LocationTextPickerActivity locationTextPickerActivity = (LocationTextPickerActivity) obj4;
                LocationTextPickerActivity.a aVar10 = LocationTextPickerActivity.f47490f;
                LocationPickerMapActivity.a aVar11 = LocationPickerMapActivity.f29227b;
                TextView textView = locationTextPickerActivity.f47495e;
                if (textView == null) {
                    s.m("setEntryLocationButton");
                    throw null;
                }
                String string = textView.getText().toString();
                po.x xVar2 = locationTextPickerActivity.f47491a;
                po.x xVar3 = locationTextPickerActivity.f47492b;
                aVar11.getClass();
                string.getClass();
                Intent intent3 = new Intent(locationTextPickerActivity, (Class<?>) LocationPickerMapActivity.class);
                intent3.putExtra("title", string);
                intent3.putExtra("EXTRA_LOCATION_EDITABLE", xVar2);
                intent3.putExtra("EXTRA_LOCATION_READONLY", xVar3);
                locationTextPickerActivity.startActivityForResult(intent3, 150);
                return;
            case 16:
                MultiLineImeEditText.c((MultiLineImeEditText) obj4, view2);
                return;
            case 17:
                int i26 = StyledInlineButtonFieldViewDark.B;
                e23.a<Unit> onClickActionCallback = ((StyledInlineButtonFieldViewDark) obj4).getOnClickActionCallback();
                if (onClickActionCallback != null) {
                    onClickActionCallback.invoke();
                    return;
                }
                return;
            case 18:
                int i27 = rm0.d.X;
                ((rm0.d) obj4).Y6().f145568c.j(Unit.INSTANCE);
                return;
            case 19:
                UCropImageActivity uCropImageActivity = (UCropImageActivity) obj4;
                UCropImageActivity.a aVar12 = UCropImageActivity.f44623o;
                new androidx.appcompat.app.e.a(uCropImageActivity).setTitle(R.string.lbl_select_another_photo_title).setMessage(R.string.lbl_select_another_photo_description).setPositiveButton(R.string.lbl_common_continue, new c1(uCropImageActivity, 27)).setNegativeButton(R.string.lbl_cancel, new qh1.j(i15)).show();
                return;
            case 20:
                ((rw.g) obj4).f154809w.clearFocus();
                return;
            case 21:
                int i28 = BenchmarkExerciseDetailsFragment.f48362v;
                ((s52.c) obj4).invoke();
                return;
            case 22:
                PowerGuideListActivity powerGuideListActivity = (PowerGuideListActivity) obj4;
                k kVar = powerGuideListActivity.f40352g;
                if (kVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                y0 y0Var = new y0();
                w9.a aVarA = v1.a(kVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new h(y0Var, kVar, null), 2);
                y0Var.f(powerGuideListActivity, new PowerGuideListActivity.d(new sa1.k(powerGuideListActivity, i16)));
                return;
            case 23:
                ((sf0.e.a) obj4).f158832c.invoke();
                return;
            case 24:
                ((so2.a.b) obj4).d();
                return;
            case 25:
                ((so2.a.d) obj4).d();
                return;
            case 26:
                so2.c cVar2 = (so2.c) obj4;
                if (cVar2.f160482c.length() != 11) {
                    View view3 = cVar2.getView();
                    if (view3 != null) {
                        TextInputLayout textInputLayout = (TextInputLayout) view3.findViewById(R.id.layout_phone_number);
                        textInputLayout.setError(cVar2.getString(R.string.wallet_error_invalid_phone_number));
                        textInputLayout.setErrorEnabled(true);
                        return;
                    }
                    return;
                }
                SnowballAddCardActivity.j jVar = cVar2.f160480a;
                if (jVar != null) {
                    String str2 = cVar2.f160482c;
                    str2.getClass();
                    SnowballAddCardActivity.this.b().B(str2);
                    return;
                }
                return;
            case 27:
                SnowballAddCardActivity.d dVar2 = ((so2.e) obj4).f160486a;
                if (dVar2 != null) {
                    SnowballAddCardActivity.this.b().C();
                    return;
                }
                return;
            case 28:
                FitPayAdditionalInformationFragment fitPayAdditionalInformationFragment = (FitPayAdditionalInformationFragment) obj4;
                String string2 = w.i0(fitPayAdditionalInformationFragment.f51661f).toString();
                if (string2 == null || string2.length() == 0 || string2.length() < fitPayAdditionalInformationFragment.f51662g) {
                    TextInputLayout textInputLayout2 = fitPayAdditionalInformationFragment.f51658c;
                    if (textInputLayout2 != null) {
                        textInputLayout2.setError(fitPayAdditionalInformationFragment.getString(R.string.cvv_not_valid));
                        return;
                    } else {
                        s.m("addInfoCvvEditTextLayout");
                        throw null;
                    }
                }
                TextInputLayout textInputLayout3 = fitPayAdditionalInformationFragment.f51658c;
                if (textInputLayout3 == null) {
                    s.m("addInfoCvvEditTextLayout");
                    throw null;
                }
                textInputLayout3.setError(null);
                Bundle bundleA5 = h7.c.a(new p("keyFitpayAdditionalInfoCvv", string2));
                NavHostFragment.f10124e.getClass();
                NavHostFragment.a.a(fitPayAdditionalInformationFragment).g(R.id.action_fitPayAdditionalInformationFragment_to_fitPayIssuerBankTermsConditionFragment, bundleA5);
                return;
            default:
                int i29 = GCMTextBanner.f47621c;
                ((m) obj4).invoke();
                return;
        }
    }

    public /* synthetic */ a(Object obj, int i14) {
        this.f133259a = i14;
        this.f133260b = obj;
    }
}
