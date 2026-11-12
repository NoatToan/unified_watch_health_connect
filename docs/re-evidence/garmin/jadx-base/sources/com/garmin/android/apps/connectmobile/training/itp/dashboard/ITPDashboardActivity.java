package com.garmin.android.apps.connectmobile.training.itp.dashboard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import f12.l;
import fw.p;
import fy1.i;
import iz1.g;
import kotlin.w3;
import ng1.c1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import pw1.h;
import tw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u0014\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/itp/dashboard/ITPDashboardActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/g3;", "Lsw1/a;", "dashboardData", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ITPDashboardActivity extends r0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f45618m = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f45622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ComposeView f45623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wt1.b f45624j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45619e = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w1 f45625k = new w1(s0.f105811a.b(pw1.d.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f45626l = new g(this, 14);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45627a;

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
            f45627a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45628a;

        public c(b.g gVar) {
            this.f45628a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45628a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45629a;

        public d(b.g gVar) {
            this.f45629a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45629a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f45631b;

        public e(e23.a aVar, b.g gVar) {
            this.f45630a = aVar;
            this.f45631b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45630a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45631b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (isTopNavigation()) {
            return this.f45622h;
        }
        return null;
    }

    public final void ma(boolean z14, e23.a aVar) {
        ComposeView composeView = this.f45623i;
        if (composeView == null) {
            s.m("composeView");
            throw null;
        }
        composeView.setVisibility(8);
        wt1.b bVar = this.f45624j;
        if (bVar == null) {
            s.m("errorViewHolder");
            throw null;
        }
        bVar.g();
        wt1.b bVar2 = this.f45624j;
        if (bVar2 == null) {
            s.m("errorViewHolder");
            throw null;
        }
        bVar2.c(aVar);
        wt1.b bVar3 = this.f45624j;
        if (!z14) {
            if (bVar3 != null) {
                bVar3.a();
                return;
            } else {
                s.m("errorViewHolder");
                throw null;
            }
        }
        if (bVar3 == null) {
            s.m("errorViewHolder");
            throw null;
        }
        Button button = bVar3.f187030e;
        if (button != null) {
            button.setVisibility(0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void na() {
        pw1.d dVarOa = oa();
        ge1.b.T(v1.a(dVarOa), null, null, new h(dVarOa, this.f45619e, vw1.c.d(this), null), 3);
    }

    public final pw1.d oa() {
        return (pw1.d) this.f45625k.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 101) {
            na();
        }
        if (i15 == 208) {
            i.f73924a.getClass();
            i.a.s(500L);
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        Bundle extras4;
        super.onCreate(bundle);
        setContentView(R.layout.itp_dashboard_compose);
        initActionBar(true);
        Intent intent = getIntent();
        long j8 = (intent == null || (extras4 = intent.getExtras()) == null) ? -1L : extras4.getLong("TRAINING_PLAN_ID", -1L);
        this.f45619e = j8;
        if (j8 == -1) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "ITPDashboardActivity", "Missing required training plan id.");
            finish();
            return;
        }
        Intent intent2 = getIntent();
        boolean z14 = false;
        this.f45620f = (intent2 == null || (extras3 = intent2.getExtras()) == null) ? false : extras3.getBoolean("GCM_tp_display_only_cycling_plans", false);
        Intent intent3 = getIntent();
        if (intent3 != null && (extras2 = intent3.getExtras()) != null) {
            z14 = extras2.getBoolean("GCM_tp_display_as_genesis_state", false);
        }
        this.f45621g = z14;
        Intent intent4 = getIntent();
        this.f45622h = (intent4 == null || (extras = intent4.getExtras()) == null) ? null : extras.getString("GCM_tp_sel_navigation_item");
        if (isTopNavigation() && (str = this.f45622h) != null) {
            ca(str);
        }
        wt1.b bVar = new wt1.b(findViewById(R.id.training_error_layout));
        this.f45624j = bVar;
        bVar.b();
        bVar.f();
        bVar.d(new pw1.a(this, 4));
        na();
        oa().f141717k0.f(this, this.f45626l);
        View viewFindViewById = findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f45623i = composeView;
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-53702204, true, new pw1.b(this, 0)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.itp_dashboard_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_remove_plan) {
            return super.onOptionsItemSelected(menuItem);
        }
        ra();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        sw1.a aVar;
        m mVar;
        g3 g3Var = (g3) ((androidx.lifecycle.s0) oa().Y.getValue()).d();
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_item_remove_plan)) != null) {
            menuItemFindItem.setTitle((g3Var == null || (aVar = (sw1.a) g3Var.f35301b) == null || (mVar = aVar.f161085a) == null || !mVar.e0()) ? getString(R.string.atp_quit_plan) : getString(R.string.itp_remove_plan));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final void pa() {
        i.f73924a.getClass();
        i.a.s(500L);
        ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).b1(true);
        hideProgressOverlay();
        boolean z14 = this.f45621g;
        if (z14) {
            ActiveTrainingPlansActivity.a.d(ActiveTrainingPlansActivity.f45098w, this, this.f45620f, z14, isTopNavigation(), this.f45622h, 66);
        } else {
            Intent intent = new Intent();
            intent.putExtra("GCM_tp_removed_plan_id", this.f45619e);
            setResult(-1, intent);
        }
        finish();
    }

    public final void qa() {
        pw1.d dVarOa = oa();
        long j8 = this.f45619e;
        pw1.a aVar = new pw1.a(this, 3);
        dVarOa.a5().m(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(dVarOa), null, null, new pw1.i(dVarOa, j8, aVar, null), 3);
    }

    public final void ra() {
        new androidx.appcompat.app.e.a(this).setTitle(R.string.msg_quit_plan).setMessage(R.string.msg_quit_plan_info).setPositiveButton(R.string.common_yes, new c1(this, 17)).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null).show();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/itp/dashboard/ITPDashboardActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_TRAINING_PLAN_ID", "", "WORKOUT_DETAILS_REQUEST_CODE", "I", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, String str, boolean z14) {
            Bundle bundle = new Bundle();
            bundle.putLong("TRAINING_PLAN_ID", j8);
            bundle.putBoolean("GCM_tp_display_only_cycling_plans", false);
            bundle.putBoolean("GCM_tp_display_as_genesis_state", false);
            bundle.putBoolean("GCM_extra_top_navigation", z14);
            bundle.putString("GCM_tp_sel_navigation_item", str);
            Intent intent = new Intent(context, (Class<?>) ITPDashboardActivity.class);
            intent.putExtras(bundle);
            if (z14) {
                intent.addFlags(335544320);
            }
            return intent;
        }

        private a() {
        }
    }
}
