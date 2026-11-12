package com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.apps.connectmobile.training.view.TrainingPlansTwoLineButton;
import fw.p;
import fy1.c;
import o53.f0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import tt1.g;
import tt1.h;
import tt1.i;
import tt1.j;
import tt1.k;
import ut1.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/activeplans/presentation/activity/ActiveTrainingPlansActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActiveTrainingPlansActivity extends r0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f45098w = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f45099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f45100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComposeView f45101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ComposeView f45102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ComposeView f45103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ComposeView f45104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TrainingPlansTwoLineButton f45105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gy1.a f45106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public wt1.b f45107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f45108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f45111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f45112r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f45113t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final pi0.e f45114v = new pi0.e(this);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45115a;

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
            f45115a = iArr;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (isTopNavigation()) {
            return this.f45113t;
        }
        return null;
    }

    public final boolean ma() {
        if (this.f45110p || !this.f45109o) {
            return false;
        }
        e eVar = this.f45108n;
        if (eVar != null) {
            return s.g(eVar.f172586e.f150540a.getValue(), Boolean.FALSE);
        }
        s.m("viewModel");
        throw null;
    }

    public final void na() {
        setTitle(R.string.lbl_training_plans);
        View view2 = this.f45099e;
        if (view2 == null) {
            s.m("trainingPlansContainer");
            throw null;
        }
        v22.e.j(view2);
        wt1.b bVar = this.f45107m;
        if (bVar != null) {
            bVar.g();
        } else {
            s.m("errorViewHolder");
            throw null;
        }
    }

    public final void oa() {
        e eVar = this.f45108n;
        if (eVar != null) {
            ge1.b.T(v1.a(eVar), null, null, new ut1.a(eVar, null), 3);
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            oa();
            if (!s3.b() || intent == null || !intent.getBooleanExtra("EXTRA_REFRESH_CHILD_COACH", false)) {
                if (intent == null || !intent.getBooleanExtra("EXTRA_CLOSE_COACH_SCREEN", false)) {
                    return;
                }
                finish();
                return;
            }
            e eVar = this.f45108n;
            if (eVar == null) {
                s.m("viewModel");
                throw null;
            }
            ge1.b.T(v1.a(eVar), null, null, new ut1.b(eVar, null), 3);
            ge1.b.T(f0.w(this), null, null, new g(this, null), 3);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_active_training_plans);
        initActionBar(true);
        if (isTopNavigation() && (str = this.f45113t) != null) {
            ca(str);
        }
        this.f45108n = (e) new x1(this).b(s0.f105811a.b(e.class));
        View viewFindViewById = findViewById(R.id.training_plans_container);
        viewFindViewById.getClass();
        this.f45099e = viewFindViewById;
        oa();
        if (s3.b()) {
            ge1.b.T(f0.w(this), null, null, new g(this, null), 3);
        } else {
            ra();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.atp_training_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (ma() && menuItem.getItemId() == R.id.menu_item_data_privacy) {
            ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).p(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_item_data_privacy)) != null) {
            menuItemFindItem.setVisible(ma());
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final String pa(int i14, int i15, String str, boolean z14) {
        String string = getString(R.string.string_space_bullet_string_pattern, getString(R.string.lbl_current_week, z14 ? getString(R.string.no_value) : String.valueOf(i14), String.valueOf(i15)), getString(R.string.lbl_group_challenge_ends, str));
        string.getClass();
        return string;
    }

    public final String qa(DateTime dateTime) {
        return dateTime != null ? this.f45114v.a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY) : "";
    }

    public final void ra() {
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        Bundle extras4;
        Bundle extras5;
        Bundle extras6;
        c.f73884a.getClass();
        c.a();
        Intent intent = getIntent();
        boolean z14 = false;
        if (intent != null && (extras6 = intent.getExtras()) != null) {
            extras6.getBoolean("GCM_tp_display_only_running_plans", false);
        }
        Intent intent2 = getIntent();
        if (intent2 != null && (extras5 = intent2.getExtras()) != null) {
            extras5.getBoolean("GCM_tp_display_only_cycling_plans", false);
        }
        Intent intent3 = getIntent();
        this.f45110p = (intent3 == null || (extras4 = intent3.getExtras()) == null) ? false : extras4.getBoolean("GCM_tp_display_as_genesis_state", false);
        Intent intent4 = getIntent();
        this.f45113t = (intent4 == null || (extras3 = intent4.getExtras()) == null) ? null : extras3.getString("GCM_tp_sel_navigation_item");
        this.f45109o = bo1.a.a().c().c();
        Intent intent5 = getIntent();
        this.f45111q = (intent5 == null || (extras2 = intent5.getExtras()) == null) ? false : extras2.getBoolean("GCM_tp_should_show_active_plan_details", false);
        Intent intent6 = getIntent();
        if (intent6 != null && (extras = intent6.getExtras()) != null) {
            z14 = extras.getBoolean("GCM_tp_should_launch_preferences", false);
        }
        this.f45112r = z14;
        ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).d();
        View viewFindViewById = findViewById(R.id.active_plan_text_view);
        viewFindViewById.getClass();
        this.f45100f = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.active_static_plans_container);
        viewFindViewById2.getClass();
        this.f45101g = (ComposeView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.active_cycling_plan_btn);
        viewFindViewById3.getClass();
        this.f45102h = (ComposeView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.active_running_plan_btn);
        viewFindViewById4.getClass();
        this.f45103i = (ComposeView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.single_active_plan_btn);
        viewFindViewById5.getClass();
        this.f45104j = (ComposeView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.find_plan_btn);
        viewFindViewById6.getClass();
        this.f45105k = (TrainingPlansTwoLineButton) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.completed_plans_btn);
        viewFindViewById7.getClass();
        this.f45106l = new gy1.a((TrainingPlansTwoLineButton) viewFindViewById7);
        wt1.b bVar = new wt1.b(findViewById(R.id.training_error_layout));
        this.f45107m = bVar;
        bVar.b();
        wt1.b bVar2 = this.f45107m;
        if (bVar2 == null) {
            s.m("errorViewHolder");
            throw null;
        }
        bVar2.a();
        wt1.b bVar3 = this.f45107m;
        if (bVar3 == null) {
            s.m("errorViewHolder");
            throw null;
        }
        bVar3.c(new tt1.a(this, 0));
        ge1.b.T(f0.w(this), null, null, new h(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new i(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new j(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new k(this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/activeplans/presentation/activity/ActiveTrainingPlansActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "ITP_DASHBOARD_REQUEST_CODE", "I", "ATP_DASHBOARD_REQUEST_CODE", "FIND_PLAN_REQUEST_CODE", "SELECT_RUNNING_PLAN_REQUEST_CODE", "SELECT_CYCLING_PLAN_REQUEST_CODE", "COMPLETED_PLANS_REQUEST_CODE", "FBT_DASHBOARD_REQUEST_CODE", "STP_DASHBOARD_REQUEST_CODE", "EXTRA_REFRESH_CHILD_COACH", "EXTRA_CLOSE_COACH_SCREEN", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, boolean z14, boolean z15, boolean z16, String str, boolean z17, boolean z18) {
            Intent intent = new Intent(context, (Class<?>) ActiveTrainingPlansActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("GCM_tp_display_only_running_plans", false);
            bundle.putBoolean("GCM_tp_display_only_cycling_plans", z14);
            bundle.putBoolean("GCM_tp_display_as_genesis_state", z15);
            bundle.putBoolean("GCM_extra_top_navigation", z16);
            bundle.putString("GCM_tp_sel_navigation_item", str);
            bundle.putBoolean("GCM_tp_should_show_active_plan_details", z17);
            bundle.putBoolean("GCM_tp_should_launch_preferences", z18);
            intent.putExtras(bundle);
            intent.addFlags(335544320);
            return intent;
        }

        public static Intent b(a aVar, Context context, boolean z14) {
            aVar.getClass();
            return a(context, false, true, false, null, z14, false);
        }

        public static /* synthetic */ Intent c(a aVar, Context context, boolean z14, boolean z15, boolean z16, String str, int i14) {
            aVar.getClass();
            return a(context, z14, z15, z16, str, false, false);
        }

        public static void d(a aVar, Context context, boolean z14, boolean z15, boolean z16, String str, int i14) {
            if ((i14 & 4) != 0) {
                z14 = false;
            }
            if ((i14 & 8) != 0) {
                z15 = false;
            }
            if ((i14 & 16) != 0) {
                z16 = true;
            }
            if ((i14 & 32) != 0) {
                str = null;
            }
            aVar.getClass();
            Intent intentA = a(context, z14, z15, z16, str, false, false);
            if (context != null) {
                context.startActivity(intentA);
            }
        }

        private a() {
        }
    }
}
