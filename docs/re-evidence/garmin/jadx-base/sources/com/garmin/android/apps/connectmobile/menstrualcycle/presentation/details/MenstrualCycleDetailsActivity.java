package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.a1;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.j;
import androidx.fragment.app.e0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleReminderSettingsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2.MenstrualCycleTrackingActivity;
import com.garmin.android.apps.connectmobile.view.InfiniteViewPager;
import com.garmin.android.apps.connectmobile.x;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import e23.l;
import fw.p;
import ht1.v;
import hx0.o0;
import hx0.p0;
import hx0.u0;
import hx0.y;
import java.util.Collection;
import java.util.List;
import jx0.k;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r22.b0;
import z10.d1;
import z10.l0;
import zd0.g1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/MenstrualCycleDetailsActivity;", "Lx22/d;", "Lhx0/u0;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MenstrualCycleDetailsActivity extends x22.d implements u0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f38784t = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f38785v = View.generateViewId();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f38786w = View.generateViewId();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f38787x = View.generateViewId();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f38788y = View.generateViewId();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final t f38789z = m.b(new v(9));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f38790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f38791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f38792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f38793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f38794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f38795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f38796r;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38797a;

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
            f38797a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f38798a;

        public c(l lVar) {
            lVar.getClass();
            this.f38798a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f38798a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38798a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<hx0.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f38799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38802d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f38799a = gVar;
            this.f38800b = qualifier;
            this.f38801c = aVar;
            this.f38802d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, hx0.s] */
        @Override // e23.a
        public final hx0.s invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f38799a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f38801c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hx0.s.class), viewModelStore, null, defaultViewModelCreationExtras, this.f38800b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f38802d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f38803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38806d;

        public e(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f38803a = gVar;
            this.f38804b = qualifier;
            this.f38805c = aVar;
            this.f38806d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, jx0.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f38803a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f38805c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), viewModelStore, null, defaultViewModelCreationExtras, this.f38804b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f38806d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f38807a;

        public f(b.g gVar) {
            this.f38807a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f38807a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f38808a;

        public g(b.g gVar) {
            this.f38808a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f38808a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f38809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f38810b;

        public h(e23.a aVar, b.g gVar) {
            this.f38809a = aVar;
            this.f38810b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f38809a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f38810b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public MenstrualCycleDetailsActivity() {
        o13.n nVar = o13.n.NONE;
        this.f38790l = m.a(nVar, new d(this, null, null, null));
        this.f38791m = m.a(nVar, new e(this, null, null, null));
        this.f38792n = new w1(s0.f105811a.b(o0.class), new g(this), new f(this), new h(null, this));
        this.f38793o = m.b(new hx0.p(this, 2));
        this.f38794p = m.b(new hx0.p(this, 3));
        this.f38796r = m.b(new hx0.p(this, 4));
    }

    @Override // x22.d, com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (isTopNavigation()) {
            return "MENSTRUAL_CYCLE";
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    @Override // hx0.u0
    public final void l0(LocalDate localDate) {
        localDate.getClass();
        sa(1, localDate);
    }

    @Override // x22.d
    public final e0 ma() {
        return (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f) this.f38796r.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 201) {
            ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).getClass();
            if (intent != null && intent.getBooleanExtra("CYCLE_PREDICTIONS_ALTERED_KEY", false)) {
                ta();
            }
            if (intent == null || !intent.getBooleanExtra("PREGNANCY_DATA_ALTERED", false)) {
                return;
            }
            ta();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0214  */
    /* JADX WARN: Code duplicated, block: B:55:0x0247  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o13.l] */
    @Override // x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        va(false);
        initActionBar(true, R.string.mct_menstrual_cycle);
        qa().setOffscreenPageLimit(3);
        qa().setImportantForAccessibility(2);
        m0 m0Var = new m0();
        if (bundle == null) {
            ra(((Boolean) this.f38794p.getValue()).booleanValue() ? 1 : 0);
        }
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        boolean z14 = bundleA != null ? bundleA.getBoolean("SHOULD_SHOW_READY_DIALOG_KEY") : false;
        this.f38795q = bundle != null ? bundle.getBoolean("HAS_SHOWN_READY_DIALOG_KEY") : false;
        ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).x();
        ComposeView composeView = (ComposeView) findViewById(R.id.tabbed_activity_promo);
        g1 g1Var = (g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null);
        composeView.setContent(new z3.e(1146666417, true, new gw1.c(g1Var, 9, composeView, m0Var)));
        boolean z15 = g1.u(g1Var, c80.s0.MCT_REPORT, null, 6) != null;
        m0Var.f105804a = z15;
        if (!z15) {
            ax0.a aVar2 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
            f38784t.getClass();
            Logger loggerC = a.c();
            boolean z16 = this.f38795q;
            i52.a.f91796a.getClass();
            String strA = i52.a.l().a(this);
            SharedPreferences sharedPreferences = i52.a.f91797b;
            boolean z17 = sharedPreferences.getBoolean(i52.a.c(R.string.key_has_user_seen_what_to_expect_banner), false);
            boolean z18 = sharedPreferences.getBoolean(i52.a.c(R.string.key_has_user_seen_awareness_banner), false);
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Checking for banners: shouldShowDialog=", ", mHasShownReadyDialog=", ", cycleType=", z14, z16);
            v.h.C(strA, ", hasUserSeenWhatToExpectBanner=", ", hasUserSeenFeatureAwarenessBanner=", sbM, z17);
            sbM.append(z18);
            loggerC.debug(sbM.toString());
            if (i52.a.l() == ww0.a.PREGNANT && !sharedPreferences.getBoolean(i52.a.c(R.string.key_has_user_seen_what_to_expect_banner), false)) {
                a.c().debug("showWhatToExpectBanner: ");
                x.a aVar3 = x.f49750f;
                String string = getString(R.string.pregnancy_what_to_expect);
                String string2 = getString(R.string.pregnancy_pregnancy_impact_message);
                string2.getClass();
                x xVarA = x.a.a(aVar3, string, string2, getString(R.string.common_learn_more), 0, 56);
                xVarA.f49751a = new hx0.p(this, 1);
                xVarA.f49752b = new v(8);
                androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                aVarB.j(R.id.notification_layout, xVarA, null, 1);
                aVarB.e();
            } else if (aVar2.k() && !sharedPreferences.getBoolean(i52.a.c(R.string.key_has_user_seen_awareness_banner), false)) {
                f12.l.f68084a.getClass();
                if (!f12.l.a.a().q0()) {
                    a.c().debug("showFeatureAwarenessBanner: ");
                    x.a aVar4 = x.f49750f;
                    String string3 = getString(R.string.pregnancy_tracking);
                    String string4 = getString(R.string.pregnancy_tracking_message);
                    string4.getClass();
                    String string5 = getString(R.string.common_learn_more);
                    aVar4.getClass();
                    x xVar = new x();
                    xVar.setArguments(new Bundle());
                    Bundle arguments = xVar.getArguments();
                    if (arguments != null) {
                        arguments.putString("keyHeadline", string3);
                    }
                    Bundle arguments2 = xVar.getArguments();
                    if (arguments2 != null) {
                        arguments2.putCharSequence("keyBody", string4);
                    }
                    Bundle arguments3 = xVar.getArguments();
                    if (arguments3 != null) {
                        arguments3.putString("keyActionPrimary", string5);
                    }
                    Bundle arguments4 = xVar.getArguments();
                    if (arguments4 != null) {
                        arguments4.putString("keyActionSecondary", null);
                    }
                    Bundle arguments5 = xVar.getArguments();
                    if (arguments5 != null) {
                        arguments5.putInt("keyIcon", R.drawable.pregnancy);
                    }
                    Bundle arguments6 = xVar.getArguments();
                    if (arguments6 != null) {
                        arguments6.putInt("keyTint", R.color.gcm_icon_on_color);
                    }
                    Bundle arguments7 = xVar.getArguments();
                    if (arguments7 != null) {
                        arguments7.putInt(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, R.color.gcm_pregnancy_icon_color);
                    }
                    xVar.f49751a = new hx0.p(this, 0);
                    xVar.f49752b = new v(7);
                    androidx.fragment.app.v supportFragmentManager2 = getSupportFragmentManager();
                    androidx.fragment.app.a aVarB2 = j.b(supportFragmentManager2, supportFragmentManager2);
                    aVarB2.j(R.id.notification_layout, xVar, null, 1);
                    aVarB2.e();
                } else if (z14) {
                    ua();
                } else {
                    ua();
                }
            } else if (z14 || this.f38795q) {
                ua();
            } else {
                a.c().debug("showTrackingDialog: ");
                u20.e eVarV6 = u20.e.v6(getString(R.string.mct_ready_to_log), getString(R.string.mct_start_logging_and_tracking));
                eVarV6.f167883b = new af2.b(this, 2);
                eVarV6.g(getSupportFragmentManager());
                this.f38795q = true;
            }
        }
        hx0.s sVar = (hx0.s) this.f38790l.getValue();
        sVar.getClass();
        y0 y0Var = new y0();
        y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
        ge1.b.T(v1.a(sVar), null, null, new y(sVar, y0Var, null), 3);
        dh.b.L(y0Var, this, new c(new ho0.g(this, 6)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd;
        MenuItem menuItemAdd2;
        MenuItem menuItemAdd3;
        MenuItem menuItemAdd4;
        ax0.a aVar = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
        if (aVar.d()) {
            if (menu != null && (menuItemAdd4 = menu.add(0, f38785v, 0, R.string.lbl_settings)) != null) {
                menuItemAdd4.setShowAsActionFlags(0);
            }
            if (aVar.c() && menu != null && (menuItemAdd3 = menu.add(0, f38788y, 0, R.string.pregnancy_log_delivery_date)) != null) {
                menuItemAdd3.setShowAsActionFlags(0);
            }
            if (menu != null && (menuItemAdd2 = menu.add(0, f38786w, 0, R.string.settings_challenge_reminders_notifications)) != null) {
                menuItemAdd2.setShowAsActionFlags(0);
            }
            if (menu != null && (menuItemAdd = menu.add(0, f38787x, 0, R.string.lbl_help)) != null) {
                menuItemAdd.setShowAsActionFlags(0);
            }
        }
        if (!new LocalDate((DateTime) this.f38793o.getValue()).equals(new LocalDate())) {
            return true;
        }
        i52.a.f91796a.getClass();
        return (i52.a.l() == ww0.a.PREGNANT && ((o0) this.f38792n.getValue()).A4(new LocalDate()) == null) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Integer predictedCycleLength;
        ww0.c cVar;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        LocalDate localDatePlusDays = null;
        if (itemId == f38785v) {
            startActivityForResult(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).t(this), 201);
            return true;
        }
        if (itemId == f38788y) {
            ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).r(this);
            return true;
        }
        if (itemId != f38786w) {
            if (itemId != f38787x) {
                return super.onOptionsItemSelected(menuItem);
            }
            HelpActivity.a aVar = HelpActivity.f36653a;
            ro0.l lVar = ro0.l.MENSTRUAL_CYCLE;
            aVar.getClass();
            HelpActivity.a.d(this, lVar, null, null);
            return true;
        }
        i52.a.f91796a.getClass();
        if (i52.a.l() == ww0.a.PREGNANT) {
            ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).w(this);
            return true;
        }
        hx0.s sVar = (hx0.s) this.f38790l.getValue();
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        cx0.a<ww0.c> aVarD = sVar.A4(localDateNow).d();
        ww0.l lVarB = (aVarD == null || (cVar = aVarD.f56599a) == null) ? null : cVar.getCycleSummary();
        if (lVarB != null && (predictedCycleLength = lVarB.getPredictedCycleLength()) != null) {
            localDatePlusDays = lVarB.getStartDate().plusDays(predictedCycleLength.intValue());
        }
        MenstrualCycleReminderSettingsActivity.f39014o.getClass();
        Intent intent = new Intent(this, (Class<?>) MenstrualCycleReminderSettingsActivity.class);
        intent.putExtra("NEXT_PERIOD_KEY", localDatePlusDays);
        startActivity(intent);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        if (menu != null && (menuItemFindItem2 = menu.findItem(f38785v)) != null) {
            menuItemFindItem2.setVisible(d1.i(q92.x.DI_CONNECT_UPLOAD));
        }
        if (menu != null && (menuItemFindItem = menu.findItem(f38788y)) != null) {
            hx0.s sVar = (hx0.s) this.f38790l.getValue();
            sVar.getClass();
            i52.a.f91796a.getClass();
            menuItemFindItem.setVisible(i52.a.l() == ww0.a.PREGNANT && sVar.f86147k);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (isTopNavigation()) {
            ca("MENSTRUAL_CYCLE");
        }
        final m0 m0Var = new m0();
        final m0 m0Var2 = new m0();
        hx0.s sVar = (hx0.s) this.f38790l.getValue();
        String str = hx0.s.f86136o;
        final int i14 = 1;
        final int i15 = 0;
        dh.b.L(sVar.B4(true), this, new c(new l(this) { // from class: hx0.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenstrualCycleDetailsActivity f86123b;

            {
                this.f86123b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                p005kotlin.jvm.internal.m0 m0Var3 = m0Var2;
                p005kotlin.jvm.internal.m0 m0Var4 = m0Var;
                MenstrualCycleDetailsActivity menstrualCycleDetailsActivity = this.f86123b;
                switch (i16) {
                    case 0:
                        cx0.a aVar = (cx0.a) obj;
                        MenstrualCycleDetailsActivity.a aVar2 = MenstrualCycleDetailsActivity.f38784t;
                        if (aVar == null) {
                            menstrualCycleDetailsActivity.showProgressOverlay();
                            m0Var4.f105804a = true;
                        } else {
                            m0Var4.f105804a = false;
                            if (!m0Var3.f105804a) {
                                menstrualCycleDetailsActivity.hideProgressOverlay();
                            }
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f fVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f) menstrualCycleDetailsActivity.f38796r.getValue();
                            boolean zG = p005kotlin.jvm.internal.s.g(aVar.f56599a, Boolean.TRUE);
                            if (fVar.f38945k != zG) {
                                fVar.f38945k = zG;
                                fVar.notifyDataSetChanged();
                            }
                            if (!aVar.f56602d) {
                                com.garmin.android.apps.connectmobile.g1.b(menstrualCycleDetailsActivity, cx0.b.a(aVar.f56600b));
                                aVar.f56602d = true;
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar = (fw.m) obj;
                        MenstrualCycleDetailsActivity.a aVar3 = MenstrualCycleDetailsActivity.f38784t;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        int i17 = MenstrualCycleDetailsActivity.b.f38797a[mVar.f73769b.ordinal()];
                        if (i17 == 1) {
                            menstrualCycleDetailsActivity.showProgressOverlay();
                            m0Var4.f105804a = true;
                            menstrualCycleDetailsActivity.invalidateOptionsMenu();
                        } else if (i17 == 2) {
                            m0Var4.f105804a = false;
                            if (!m0Var3.f105804a) {
                                if (t7 != 0 && !((Collection) t7).isEmpty()) {
                                    i52.a.f91796a.getClass();
                                    if (i52.a.l() != ww0.a.PREGNANT) {
                                        for (db1.m mVar2 : (List) t7) {
                                            if ((mVar2 != null ? mVar2.getDeliveryDate() : null) == null) {
                                                if ((mVar2 != null ? mVar2.getEndDate() : null) == null) {
                                                    o0 o0Var = (o0) menstrualCycleDetailsActivity.f38792n.getValue();
                                                    ge1.b.T(v1.a(o0Var), null, null, new r0(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).getUserSettings(), o0Var, null), 3);
                                                    i52.a aVar4 = i52.a.f91796a;
                                                    ww0.a aVar5 = ww0.a.PREGNANT;
                                                    aVar4.getClass();
                                                    i52.a.t(aVar5);
                                                }
                                            }
                                        }
                                    }
                                }
                                menstrualCycleDetailsActivity.hideProgressOverlay();
                            }
                            menstrualCycleDetailsActivity.invalidateOptionsMenu();
                        } else {
                            if (i17 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            m0Var4.f105804a = false;
                            if (!m0Var3.f105804a) {
                                menstrualCycleDetailsActivity.hideProgressOverlay();
                            }
                            g22.a.a(menstrualCycleDetailsActivity, mVar.f73771d);
                            menstrualCycleDetailsActivity.invalidateOptionsMenu();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        w1 w1Var = this.f38792n;
        dh.b.L((androidx.lifecycle.s0) ((o0) w1Var.getValue()).f86114d.getValue(), this, new c(new l(this) { // from class: hx0.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenstrualCycleDetailsActivity f86123b;

            {
                this.f86123b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i14;
                p005kotlin.jvm.internal.m0 m0Var3 = m0Var;
                p005kotlin.jvm.internal.m0 m0Var4 = m0Var2;
                MenstrualCycleDetailsActivity menstrualCycleDetailsActivity = this.f86123b;
                switch (i16) {
                    case 0:
                        cx0.a aVar = (cx0.a) obj;
                        MenstrualCycleDetailsActivity.a aVar2 = MenstrualCycleDetailsActivity.f38784t;
                        if (aVar == null) {
                            menstrualCycleDetailsActivity.showProgressOverlay();
                            m0Var4.f105804a = true;
                        } else {
                            m0Var4.f105804a = false;
                            if (!m0Var3.f105804a) {
                                menstrualCycleDetailsActivity.hideProgressOverlay();
                            }
                            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f fVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f) menstrualCycleDetailsActivity.f38796r.getValue();
                            boolean zG = p005kotlin.jvm.internal.s.g(aVar.f56599a, Boolean.TRUE);
                            if (fVar.f38945k != zG) {
                                fVar.f38945k = zG;
                                fVar.notifyDataSetChanged();
                            }
                            if (!aVar.f56602d) {
                                com.garmin.android.apps.connectmobile.g1.b(menstrualCycleDetailsActivity, cx0.b.a(aVar.f56600b));
                                aVar.f56602d = true;
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar = (fw.m) obj;
                        MenstrualCycleDetailsActivity.a aVar3 = MenstrualCycleDetailsActivity.f38784t;
                        mVar.getClass();
                        T t7 = mVar.f73770c;
                        int i17 = MenstrualCycleDetailsActivity.b.f38797a[mVar.f73769b.ordinal()];
                        if (i17 == 1) {
                            menstrualCycleDetailsActivity.showProgressOverlay();
                            m0Var4.f105804a = true;
                            menstrualCycleDetailsActivity.invalidateOptionsMenu();
                        } else if (i17 == 2) {
                            m0Var4.f105804a = false;
                            if (!m0Var3.f105804a) {
                                if (t7 != 0 && !((Collection) t7).isEmpty()) {
                                    i52.a.f91796a.getClass();
                                    if (i52.a.l() != ww0.a.PREGNANT) {
                                        for (db1.m mVar2 : (List) t7) {
                                            if ((mVar2 != null ? mVar2.getDeliveryDate() : null) == null) {
                                                if ((mVar2 != null ? mVar2.getEndDate() : null) == null) {
                                                    o0 o0Var = (o0) menstrualCycleDetailsActivity.f38792n.getValue();
                                                    ge1.b.T(v1.a(o0Var), null, null, new r0(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).getUserSettings(), o0Var, null), 3);
                                                    i52.a aVar4 = i52.a.f91796a;
                                                    ww0.a aVar5 = ww0.a.PREGNANT;
                                                    aVar4.getClass();
                                                    i52.a.t(aVar5);
                                                }
                                            }
                                        }
                                    }
                                }
                                menstrualCycleDetailsActivity.hideProgressOverlay();
                            }
                            menstrualCycleDetailsActivity.invalidateOptionsMenu();
                        } else {
                            if (i17 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            m0Var4.f105804a = false;
                            if (!m0Var3.f105804a) {
                                menstrualCycleDetailsActivity.hideProgressOverlay();
                            }
                            g22.a.a(menstrualCycleDetailsActivity, mVar.f73771d);
                            menstrualCycleDetailsActivity.invalidateOptionsMenu();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        o0 o0Var = (o0) w1Var.getValue();
        fw.m<List<db1.m>> mVarD = o0Var.z4().d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            o0Var.z4().m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(o0Var), null, null, new p0(o0Var, null), 3);
        }
    }

    @Override // x22.d, androidx.fragment.app.m
    public final void onResumeFragments() {
        super.onResumeFragments();
        fe.a adapter = qa().getAdapter();
        if (adapter != null) {
            int f44034e = adapter.getF44052d();
            for (int i14 = 0; i14 < f44034e; i14++) {
                fe.a adapter2 = qa().getAdapter();
                if (adapter2 instanceof com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f) {
                    TabLayout.Tab tabAt = pa().getTabAt(i14);
                    if (tabAt != null) {
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f fVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f) adapter2;
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f.a aVarA = fVar.a(i14);
                        tabAt.setContentDescription(aVarA != null ? aVarA.k(fVar.f38942h) : null);
                    }
                    if (tabAt != null) {
                        a1.a(tabAt.f53250view, null);
                    }
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("HAS_SHOWN_READY_DIALOG_KEY", this.f38795q);
        super.onSaveInstanceState(bundle);
    }

    public final void sa(int i14, LocalDate localDate) {
        ra(i14);
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f fVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f) this.f38796r.getValue();
        Object objA = fVar.a(fVar.f38944j.getCurrentItem());
        if (objA instanceof com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.g) {
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.g gVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.g) objA;
            DateTime dateTime = localDate.toDateTime(LocalTime.now());
            InfiniteViewPager infiniteViewPagerW6 = gVar.w6();
            b0 b0VarV6 = gVar.v6();
            if (dateTime == null) {
                dateTime = DateTime.now();
            }
            dateTime.getClass();
            infiniteViewPagerW6.C(b0VarV6.c(dateTime), false);
        } else if (objA instanceof jx0.d) {
            ((jx0.d) objA).G6(localDate);
        }
        View viewFindViewById = findViewById(R.id.app_bar_layout);
        viewFindViewById.getClass();
        ((AppBarLayout) viewFindViewById).setExpanded(true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
    public final void ta() {
        Intent intent = new Intent();
        intent.putExtra("CYCLE_DATA_ALTERED", true);
        setResult(-1, intent);
        ((hx0.s) this.f38790l.getValue()).y4();
        ((k) this.f38791m.getValue()).f101495c.clear();
        ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f) this.f38796r.getValue()).notifyDataSetChanged();
    }

    public final void ua() {
        f38784t.getClass();
        a.c().debug("showNavBarTooltip: ");
        com.garmin.android.apps.connectmobile.navigation.h hVar = com.garmin.android.apps.connectmobile.navigation.h.f39377a;
        String string = getString(R.string.mct_want_a_quick_way_to);
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        hVar.getClass();
        bv.b.f21239a.getClass();
        if (((kd0.m) bv.b.a()).q("MENSTRUAL_CYCLE")) {
            String string2 = getString(R.string.mct_customize_nav_bar, com.garmin.android.apps.connectmobile.navigation.h.b("MENSTRUAL_CYCLE", new l22.a(this)));
            string2.getClass();
            String string3 = getString(R.string.mct_add_to_nav_bar);
            string3.getClass();
            x xVarA = (x) supportFragmentManager.G("BannerFragment");
            if (xVarA == null) {
                xVarA = x.a.a(x.f49750f, string, string2, string3, 0, 56);
            }
            xVarA.f49751a = new hx0.p(this, 5);
            xVarA.f49752b = new tk0.a(28);
            if (xVarA.isAdded()) {
                return;
            }
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.j(R.id.notification_layout, xVarA, "BannerFragment", 1);
            aVar.e();
        }
    }

    public final void va(boolean z14) {
        View viewFindViewById = findViewById(R.id.promotion_container);
        viewFindViewById.getClass();
        View viewFindViewById2 = findViewById(R.id.root_layout);
        viewFindViewById2.getClass();
        View viewFindViewById3 = findViewById(R.id.notification_layout);
        viewFindViewById3.getClass();
        v22.e.s(viewFindViewById, z14);
        v22.e.s(viewFindViewById3, z14);
        v22.e.s(viewFindViewById2, z14);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/MenstrualCycleDetailsActivity$a;", "", "<init>", "()V", "", "SHOULD_SHOW_READY_DIALOG_KEY", "Ljava/lang/String;", "HAS_SHOWN_READY_DIALOG_KEY", "OPEN_TO_REPORTS_KEY", "", "SETTINGS_ID", "I", "REMINDERS_ID", "HELP_ID", "SETTINGS_REQUEST_CODE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, boolean z14, boolean z15, DateTime dateTime) {
            context.getClass();
            kg1.a.f104701a.getClass();
            if (kg1.a.C2003a.a().e()) {
                MenstrualCycleTrackingActivity.f39197e.getClass();
                return new Intent(context, (Class<?>) MenstrualCycleTrackingActivity.class);
            }
            if (!((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).d()) {
                c().debug("getIntent: User not pregnant and Menstrual Cycle is not configured");
                MenstrualCycleGenesisActivity.f38811e.getClass();
                return new Intent(context, (Class<?>) MenstrualCycleGenesisActivity.class);
            }
            c().debug("getIntent: Default case");
            Intent intent = new Intent(context, (Class<?>) MenstrualCycleDetailsActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra.date.time", dateTime);
            bundle.putBoolean("SHOULD_SHOW_READY_DIALOG_KEY", z14);
            bundle.putBoolean("GCM_extra_top_navigation", z15);
            bundle.putBoolean("OPEN_TO_REPORTS_KEY", false);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, boolean z14, DateTime dateTime, int i14) {
            if ((i14 & 2) != 0) {
                z14 = false;
            }
            boolean z15 = (i14 & 4) == 0;
            if ((i14 & 8) != 0) {
                dateTime = null;
            }
            aVar.getClass();
            return a(context, z14, z15, dateTime);
        }

        public static Logger c() {
            return (Logger) MenstrualCycleDetailsActivity.f38789z.getValue();
        }

        private a() {
        }
    }
}
