package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.a1;
import androidx.core.view.j;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.EditPregnancyActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.logdelivery.PregnancyLogDeliveryDateActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.PregnancyRemindersActivity;
import com.garmin.android.apps.connectmobile.x;
import com.google.android.material.tabs.TabLayout;
import e23.l;
import fw.p;
import g02.c1;
import gb1.i;
import java.util.ArrayList;
import jx0.k;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import z10.d1;
import z10.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/PregnancyDetailsActivity;", "Lx22/d;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyDetailsActivity extends x22.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f40492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f40493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f40494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f40495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f40496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f40497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f40498r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f40499t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f40500v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f40501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f40489x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f40490y = View.generateViewId();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f40491z = View.generateViewId();
    public static final int A = View.generateViewId();
    public static final int B = View.generateViewId();
    public static final int C = View.generateViewId();
    public static final int D = View.generateViewId();
    public static final int E = View.generateViewId();
    public static final t F = m.b(new g12.m(13));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40502a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40502a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40503a;

        public c(l lVar) {
            lVar.getClass();
            this.f40503a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40503a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40503a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<hx0.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f40504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f40505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f40506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f40507d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f40504a = gVar;
            this.f40505b = qualifier;
            this.f40506c = aVar;
            this.f40507d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, hx0.s] */
        @Override // e23.a
        public final hx0.s invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f40504a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f40506c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hx0.s.class), viewModelStore, null, defaultViewModelCreationExtras, this.f40505b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f40507d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f40508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f40509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f40510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f40511d;

        public e(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f40508a = gVar;
            this.f40509b = qualifier;
            this.f40510c = aVar;
            this.f40511d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, jx0.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f40508a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f40510c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), viewModelStore, null, defaultViewModelCreationExtras, this.f40509b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f40511d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f40512a;

        public f(b.g gVar) {
            this.f40512a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40512a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f40513a;

        public g(b.g gVar) {
            this.f40513a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40513a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f40515b;

        public h(e23.a aVar, b.g gVar) {
            this.f40514a = aVar;
            this.f40515b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40514a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40515b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public PregnancyDetailsActivity() {
        o13.n nVar = o13.n.NONE;
        this.f40492l = m.a(nVar, new d(this, null, null, null));
        this.f40493m = m.a(nVar, new e(this, null, null, null));
        this.f40494n = new w1(s0.f105811a.b(gb1.l.class), new g(this), new f(this), new h(null, this));
        this.f40495o = m.b(new gb1.h(this, 5));
        this.f40496p = m.b(new gb1.h(this, 6));
        this.f40497q = m.b(new gb1.h(this, 0));
        this.f40498r = m.b(new gb1.h(this, 1));
        this.f40501w = m.b(new gb1.h(this, 2));
    }

    @Override // x22.d, com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (isTopNavigation()) {
            return "PREGNANCY";
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    @Override // x22.d
    public final e0 ma() {
        return (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a) this.f40501w.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 201) {
            if (intent != null && intent.getBooleanExtra("CYCLE_PREDICTIONS_ALTERED_KEY", false)) {
                ua();
            }
            if (intent == null || !intent.getBooleanExtra("PREGNANCY_DATA_ALTERED", false)) {
                return;
            }
            ua();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        tb1.e.a aVar = tb1.e.f163745a;
        db1.m mVarTa = ta();
        aVar.getClass();
        if (tb1.e.a.g(mVarTa)) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.pregnancy_title);
        qa().setOffscreenPageLimit(3);
        if (bundle == null) {
            ra(((Boolean) this.f40496p.getValue()).booleanValue() ? 1 : 0);
        }
        int i14 = 0;
        boolean booleanExtra = getIntent().getBooleanExtra("SHOULD_SHOW_READY_DIALOG_KEY", false);
        this.f40499t = bundle != null ? bundle.getBoolean("HAS_SHOWN_READY_DIALOG_KEY") : false;
        f40489x.getClass();
        t tVar = F;
        Logger logger = (Logger) tVar.getValue();
        boolean z14 = this.f40499t;
        i52.a.f91796a.getClass();
        String strA = i52.a.l().a(this);
        SharedPreferences sharedPreferences = i52.a.f91797b;
        boolean z15 = sharedPreferences.getBoolean(i52.a.c(R.string.key_has_user_seen_what_to_expect_banner), false);
        boolean z16 = sharedPreferences.getBoolean(i52.a.c(R.string.key_has_user_seen_awareness_banner), false);
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Checking for banners: shouldShowDialog=", ", mHasShownReadyDialog=", ", cycleType=", booleanExtra, z14);
        v.h.C(strA, ", hasUserSeenWhatToExpectBanner=", ", hasUserSeenFeatureAwarenessBanner=", sbM, z15);
        sbM.append(z16);
        logger.debug(sbM.toString());
        if (i52.a.l() != ww0.a.PREGNANT || sharedPreferences.getBoolean(i52.a.c(R.string.key_has_user_seen_what_to_expect_banner), false)) {
            ((Logger) tVar.getValue()).debug("showNavBarTooltip: ");
            String string = getString(R.string.pregnancy_tracking_made_easy);
            string.getClass();
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            bv.b.f21239a.getClass();
            if (((kd0.m) bv.b.a()).q("PREGNANCY")) {
                com.garmin.android.apps.connectmobile.navigation.h hVar = com.garmin.android.apps.connectmobile.navigation.h.f39377a;
                l22.a aVar = new l22.a(this);
                hVar.getClass();
                String string2 = getString(R.string.mct_customize_nav_bar, com.garmin.android.apps.connectmobile.navigation.h.b("PREGNANCY", aVar));
                string2.getClass();
                String string3 = getString(R.string.mct_add_to_nav_bar);
                string3.getClass();
                x xVarA = (x) supportFragmentManager.G("BannerFragment");
                if (xVarA == null) {
                    xVarA = x.a.a(x.f49750f, string, string2, string3, 0, 56);
                }
                xVarA.f49751a = new gb1.h(this, 4);
                xVarA.f49752b = new g12.m(15);
                if (!xVarA.isAdded()) {
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                    aVar2.j(R.id.notification_layout, xVarA, "BannerFragment", 1);
                    aVar2.e();
                }
            }
        } else {
            ((Logger) tVar.getValue()).debug("showWhatToExpectBanner: ");
            x.a aVar3 = x.f49750f;
            String string4 = getString(R.string.pregnancy_what_to_expect);
            String string5 = getString(R.string.pregnancy_pregnancy_impact_message);
            string5.getClass();
            x xVarA2 = x.a.a(aVar3, string4, string5, getString(R.string.common_learn_more), 0, 56);
            xVarA2.f49751a = new gb1.h(this, 3);
            xVarA2.f49752b = new g12.m(14);
            v supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager2, supportFragmentManager2);
            aVarB.j(R.id.notification_layout, xVarA2, null, 1);
            aVarB.e();
        }
        fe.a aVarOa = oa();
        if (aVarOa != null) {
            int f149591t = aVarOa.getF44034e();
            if (f149591t == 1) {
                i14 = R.dimen.gcm_progress_view_height_width;
            } else if (f149591t == 2) {
                i14 = R.dimen.two_tab_width;
            } else if (f149591t == 3) {
                i14 = R.dimen.three_tab_width;
            }
            if (i14 > 0) {
                pa().getLayoutParams().width = getResources().getDimensionPixelSize(i14);
            }
        }
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_MENSTRUAL_CYCLE_TRACKING);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            String string = getString(R.string.lbl_settings);
            string.getClass();
            MenuItem menuItemAdd = menu.add(0, f40490y, 0, c22.c.b(string, getResources().getDimension(R.dimen.andfont_body_1), this, 1.8f));
            if (menuItemAdd != null) {
                menuItemAdd.setShowAsActionFlags(0);
            }
            if (k1.f37122a.c()) {
                String string2 = getString(R.string.pregnancy_log_delivery_date);
                string2.getClass();
                MenuItem menuItemAdd2 = menu.add(0, C, 0, c22.c.b(string2, getResources().getDimension(R.dimen.andfont_body_1), this, 1.8f));
                if (menuItemAdd2 != null) {
                    menuItemAdd2.setShowAsActionFlags(0);
                }
            }
            String string3 = getString(R.string.pregnancy_reminders);
            string3.getClass();
            MenuItem menuItemAdd3 = menu.add(0, f40491z, 0, c22.c.b(string3, getResources().getDimension(R.dimen.andfont_body_1), this, 1.8f));
            if (menuItemAdd3 != null) {
                menuItemAdd3.setShowAsActionFlags(0);
            }
            String string4 = getString(R.string.pregnancy_all_pregnancies);
            string4.getClass();
            MenuItem menuItemAdd4 = menu.add(0, B, 0, c22.c.b(string4, getResources().getDimension(R.dimen.andfont_body_1), this, 1.8f));
            if (menuItemAdd4 != null) {
                menuItemAdd4.setShowAsActionFlags(0);
            }
            String string5 = getString(R.string.pregnancy_edit_record);
            string5.getClass();
            MenuItem menuItemAdd5 = menu.add(0, D, 0, c22.c.b(string5, getResources().getDimension(R.dimen.andfont_body_1), this, 1.8f));
            if (menuItemAdd5 != null) {
                menuItemAdd5.setShowAsActionFlags(0);
            }
            String string6 = getString(R.string.pregnancy_delete_record);
            string6.getClass();
            MenuItem menuItemAdd6 = menu.add(0, E, 0, c22.c.b(string6, getResources().getDimension(R.dimen.andfont_body_1), this, 1.8f));
            if (menuItemAdd6 != null) {
                menuItemAdd6.setShowAsActionFlags(0);
            }
            String string7 = getString(R.string.lbl_help);
            string7.getClass();
            MenuItem menuItemAdd7 = menu.add(0, A, 0, c22.c.b(string7, getResources().getDimension(R.dimen.andfont_body_1), this, 1.8f));
            if (menuItemAdd7 != null) {
                menuItemAdd7.setShowAsActionFlags(0);
            }
        }
        return ta() != null;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return super.onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == f40490y) {
            MenstrualCycleSettingsActivity.a aVar = MenstrualCycleSettingsActivity.f39030c;
            aVar.getClass();
            startActivityForResult(MenstrualCycleSettingsActivity.a.a(aVar, this, null, false, false, false, 48), 201);
        } else if (itemId == C) {
            if (d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                PregnancyLogDeliveryDateActivity.f40875e.getClass();
                startActivity(new Intent(this, (Class<?>) PregnancyLogDeliveryDateActivity.class));
            } else {
                DataStorageConsentActivity.a.d(DataStorageConsentActivity.f32194t, this, 101);
            }
        } else if (itemId == f40491z) {
            PregnancyRemindersActivity.f40928d.getClass();
            startActivity(new Intent(this, (Class<?>) PregnancyRemindersActivity.class));
        } else if (itemId == B) {
            PregnancyListActivity.a aVar2 = PregnancyListActivity.f40524f;
            tb1.e.f163745a.getClass();
            boolean zH = tb1.e.a.h();
            String string = getString(R.string.pregnancy_all_pregnancies);
            aVar2.getClass();
            PregnancyListActivity.a.a(this, zH, string);
        } else if (itemId == D) {
            db1.m mVarTa = ta();
            if (mVarTa != null) {
                EditPregnancyActivity.a aVar3 = EditPregnancyActivity.f40574e;
                boolean z14 = this.f40500v;
                aVar3.getClass();
                Intent intent = new Intent(this, (Class<?>) EditPregnancyActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("PREGNANCY_SNAPSHOT_DTO_KEY", mVarTa);
                bundle.putBoolean("IS_LAST_PREGNANCY_KEY", z14);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        } else if (itemId == E) {
            o13.p pVar = new o13.p(getString(R.string.lbl_delete), new i(this, 1));
            o13.p pVar2 = new o13.p(getString(R.string.lbl_cancel), new c1(9));
            c22.f fVar = c22.f.f23050a;
            int i14 = this.f40500v ? R.string.pregnancy_delete_record_message : R.string.pregnancy_delete_record_message_short;
            fVar.getClass();
            androidx.appcompat.app.e eVarA = c22.f.a(this, R.string.pregnancy_delete_record_question, i14, pVar, pVar2);
            eVarA.setOnShowListener(new c22.e(this, 3));
            eVarA.show();
        } else {
            if (itemId != A) {
                return super.onOptionsItemSelected(menuItem);
            }
            HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.PREGNANCY_SETTINGS_HELP, null, null, 12);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, o13.l] */
    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        MenuItem menuItemFindItem3;
        ArrayList arrayList;
        MenuItem menuItemFindItem4;
        MenuItem menuItemFindItem5;
        boolean z14;
        MenuItem menuItemFindItem6;
        tb1.e.a aVar = tb1.e.f163745a;
        db1.m mVarTa = ta();
        aVar.getClass();
        boolean zG = tb1.e.a.g(mVarTa);
        boolean z15 = false;
        if (menu != null && (menuItemFindItem6 = menu.findItem(f40490y)) != null) {
            menuItemFindItem6.setVisible(d1.i(q92.x.DI_CONNECT_UPLOAD) && !zG);
        }
        if (menu != null && (menuItemFindItem5 = menu.findItem(C)) != null) {
            if (d1.i(q92.x.DI_CONNECT_UPLOAD)) {
                hx0.s sVar = (hx0.s) this.f40492l.getValue();
                sVar.getClass();
                i52.a.f91796a.getClass();
                if (i52.a.l() == ww0.a.PREGNANT && sVar.f86147k && !zG) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            menuItemFindItem5.setVisible(z14);
        }
        if (menu != null && (menuItemFindItem4 = menu.findItem(f40491z)) != null) {
            menuItemFindItem4.setVisible(d1.i(q92.x.DI_CONNECT_UPLOAD) && !zG);
        }
        if (menu != null && (menuItemFindItem3 = menu.findItem(B)) != null) {
            menuItemFindItem3.setVisible((zG || (arrayList = sa().f76684b) == null || arrayList.isEmpty()) ? false : true);
        }
        if (menu != null && (menuItemFindItem2 = menu.findItem(D)) != null) {
            menuItemFindItem2.setVisible(d1.i(q92.x.DI_CONNECT_UPLOAD) && zG && ta() != null);
        }
        if (menu != null && (menuItemFindItem = menu.findItem(E)) != null) {
            if (d1.i(q92.x.DI_CONNECT_UPLOAD) && zG && ta() != null) {
                z15 = true;
            }
            menuItemFindItem.setVisible(z15);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (isTopNavigation()) {
            ca("PREGNANCY");
        }
        m0 m0Var = new m0();
        m0 m0Var2 = new m0();
        sa().A4();
        ((androidx.lifecycle.s0) sa().f76686d.getValue()).f(this, new c(new gb1.j(m0Var, this, m0Var2)));
        hx0.s sVar = (hx0.s) this.f40492l.getValue();
        String str = hx0.s.f86136o;
        dh.b.L(sVar.B4(true), this, new c(new gb1.j(this, m0Var2, m0Var)));
        sa().f76688f.f(this, new c(new g12.f(this, 9)));
    }

    @Override // x22.d, androidx.fragment.app.m
    public final void onResumeFragments() {
        super.onResumeFragments();
        fe.a adapter = qa().getAdapter();
        if (adapter != null) {
            int f149591t = adapter.getF44034e();
            for (int i14 = 0; i14 < f149591t; i14++) {
                fe.a adapter2 = qa().getAdapter();
                if (adapter2 instanceof com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a) {
                    TabLayout.Tab tabAt = pa().getTabAt(i14);
                    if (tabAt != null) {
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a aVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a) adapter2;
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a.InterfaceC0763a interfaceC0763aA = aVar.a(i14);
                        tabAt.setContentDescription(interfaceC0763aA != null ? interfaceC0763aA.k(aVar.f40532h) : null);
                    }
                    if (tabAt != null) {
                        a1.a(tabAt.f53250view, null);
                    }
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("HAS_SHOWN_READY_DIALOG_KEY", this.f40499t);
        super.onSaveInstanceState(bundle);
    }

    public final gb1.l sa() {
        return (gb1.l) this.f40494n.getValue();
    }

    public final db1.m ta() {
        return (db1.m) this.f40497q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
    public final void ua() {
        Intent intent = new Intent();
        intent.putExtra("CYCLE_DATA_ALTERED", true);
        setResult(-1, intent);
        ((hx0.s) this.f40492l.getValue()).y4();
        ((k) this.f40493m.getValue()).f101495c.clear();
    }

    public final void va() {
        LocalDate originalDueDate;
        db1.m mVarTa = ta();
        if (mVarTa == null || (originalDueDate = mVarTa.getOriginalDueDate()) == null) {
            return;
        }
        gb1.l lVarSa = sa();
        y0<fw.m<LocalDate>> y0Var = lVarSa.f76688f;
        fw.m<LocalDate> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(lVarSa), null, null, new gb1.m(originalDueDate, lVarSa, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/PregnancyDetailsActivity$a;", "", "<init>", "()V", "", "CYCLE_DATA_ALTERED", "Ljava/lang/String;", "SHOULD_SHOW_READY_DIALOG_KEY", "HAS_SHOWN_READY_DIALOG_KEY", "PREGNANCY_SNAPSHOT_DTO_KEY", "OPEN_TO_REPORTS_KEY", "OPEN_TO_TIPS_KEY", "", "SETTINGS_ID", "I", "REMINDERS_ID", "HELP_ID", "ALL_PREGNANCIES_ID", "LOG_DELIVERY_DATE_ID", "EDIT_PREGNANCY_RECORD", "DELETE_PREGNANCY_RECORD", "SETTINGS_REQUEST_CODE", "CONSENT_REQUEST_CODE", "EDIT_TAB_BAR_ACTIVITY_CODE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, boolean z14, boolean z15, DateTime dateTime, boolean z16, db1.m mVar, boolean z17) {
            Intent intent = new Intent(context, (Class<?>) PregnancyDetailsActivity.class);
            intent.putExtra("extra.date.time", dateTime);
            intent.putExtra("SHOULD_SHOW_READY_DIALOG_KEY", z14);
            intent.putExtra("GCM_extra_top_navigation", z15);
            intent.putExtra("OPEN_TO_REPORTS_KEY", z16);
            intent.putExtra("PREGNANCY_SNAPSHOT_DTO_KEY", mVar);
            intent.putExtra("OPEN_TO_TIPS_KEY", z17);
            if (z15) {
                intent.addFlags(335544320);
            }
            return intent;
        }

        private a() {
        }
    }
}
