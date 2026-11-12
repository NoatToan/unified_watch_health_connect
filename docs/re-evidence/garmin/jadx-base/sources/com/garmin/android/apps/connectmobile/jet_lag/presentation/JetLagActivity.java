package com.garmin.android.apps.connectmobile.jet_lag.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.JetLagSummaryActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.ManageTripsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupActivity;
import com.garmin.android.apps.connectmobile.k1;
import ds0.m;
import ds0.o;
import e32.l;
import fw.p;
import java.util.List;
import lc.u0;
import o13.h;
import o13.t;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/JetLagActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Le32/l;", "Lds0/m;", "<init>", "()V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JetLagActivity extends com.garmin.android.apps.connectmobile.c implements l<m> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36950d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public os0.c f36952b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f36951a = new w1(s0.f105811a.b(o.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f36953c = o13.m.b(new ds0.f(this, 1));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36954a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36954a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f36955a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f36955a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36955a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36955a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36956a;

        public d(g gVar) {
            this.f36956a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36956a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36957a;

        public e(g gVar) {
            this.f36957a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36957a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f36959b;

        public f(e23.a aVar, g gVar) {
            this.f36958a = aVar;
            this.f36959b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36958a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36959b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // e32.l
    /* JADX INFO: renamed from: ca, reason: merged with bridge method [inline-methods] */
    public final void I8(m mVar) {
        List<yr0.o> list;
        Intent intentA;
        mVar.getClass();
        if (mVar.equals(ds0.b.f61067a)) {
            HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.JET_LAG, null, null, 12);
            return;
        }
        if (mVar.equals(ds0.e.f61070a)) {
            TripSetupActivity.a aVar = TripSetupActivity.f37081g;
            Bundle extras = getIntent().getExtras();
            startActivity(TripSetupActivity.a.a(aVar, this, null, null, false, extras != null && extras.getBoolean("GCM_extra_top_navigation"), 14));
            return;
        }
        if (!(mVar instanceof ds0.c)) {
            if (!mVar.equals(ds0.d.f61069a)) {
                u0.r();
                return;
            }
            JetLagSummaryActivity.a aVar2 = JetLagSummaryActivity.f36977o;
            Bundle extras2 = getIntent().getExtras();
            startActivity(JetLagSummaryActivity.a.b(aVar2, this, extras2 != null && extras2.getBoolean("GCM_extra_top_navigation"), null, 12));
            finish();
            return;
        }
        if (((ds0.c) mVar).f61068a) {
            ManageTripsActivity.a aVar3 = ManageTripsActivity.f36985h;
            boolean zBooleanValue = ((Boolean) this.f36953c.getValue()).booleanValue();
            aVar3.getClass();
            intentA = ManageTripsActivity.a.a(this, false, null);
            intentA.setAction("ACTION_ADD_TRIP");
            intentA.putExtra("EXTRA_FROM_CALENDAR", zBooleanValue);
        } else {
            ManageTripsActivity.a aVar4 = ManageTripsActivity.f36985h;
            Bundle extras3 = getIntent().getExtras();
            boolean z14 = extras3 != null && extras3.getBoolean("GCM_extra_top_navigation");
            g3<List<yr0.o>> g3VarD = ((o) this.f36951a.getValue()).f61089b.d();
            if (g3VarD == null || (list = g3VarD.f35301b) == null) {
                list = j0.f134944a;
            }
            aVar4.getClass();
            intentA = ManageTripsActivity.a.a(this, z14, list);
        }
        startActivity(intentA);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jet_lag_activity);
        initActionBar(true, R.string.lbl_jet_lag_advisor);
        View viewFindViewById = findViewById(R.id.root_view);
        viewFindViewById.getClass();
        this.f36952b = new os0.c((ConstraintLayout) viewFindViewById, new ds0.f(this, 0));
        bv.b.f21239a.getClass();
        bv.b.a();
        if (k1.f37122a.i()) {
            ((o) this.f36951a.getValue()).f61089b.f(this, new c(new ds0.g(this, 0)));
        } else {
            I8(ds0.d.f61069a);
        }
        ((bs0.a) KoinJavaComponent.get$default(bs0.a.class, null, null, 6, null)).a();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd;
        if (menu == null || (menuItemAdd = menu.add(0, 100, 0, R.string.lbl_help)) == null) {
            return true;
        }
        menuItemAdd.setShowAsActionFlags(2);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 100) {
            return super.onOptionsItemSelected(menuItem);
        }
        I8(ds0.b.f61067a);
        return true;
    }

    @Override // e32.l
    public final void p4(e32.o oVar, DateTime dateTime) {
        dateTime.getClass();
        oVar.getClass();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/JetLagActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_HELP", "I", "", "EXTRA_FROM_CALENDAR", "Ljava/lang/String;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, boolean z14) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) JetLagActivity.class);
            intent.putExtra("GCM_extra_top_navigation", z14);
            intent.setFlags(335544320);
            return intent;
        }

        private a() {
        }
    }
}
