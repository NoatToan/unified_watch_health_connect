package com.garmin.android.apps.connectmobile.training.fbtap.dashboard;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c22.j0;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.CoachConsentActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity;
import fw.p;
import fy1.i;
import g.h;
import jv1.n;
import lc.u0;
import n23.j;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q92.v;
import q92.x;
import tw1.k;
import tw1.m;
import vu1.l;
import vu1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/dashboard/FBTDashBoardActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FBTDashBoardActivity extends r0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f45458n = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f45459e = new w1(s0.f105811a.b(o.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f45462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f45464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f45465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Intent> f45466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.c<Intent> f45467m;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45468a;

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
            f45468a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45469a;

        public c(g gVar) {
            this.f45469a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45469a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45470a;

        public d(g gVar) {
            this.f45470a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45470a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45472b;

        public e(e23.a aVar, g gVar) {
            this.f45471a = aVar;
            this.f45472b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45471a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45472b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [vu1.l] */
    /* JADX WARN: Type inference failed for: r0v5, types: [vu1.l] */
    public FBTDashBoardActivity() {
        p92.o oVar = p92.o.f136619a;
        x xVar = x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
        oVar.getClass();
        this.f45462h = p92.o.n(xVar);
        this.f45463i = s3.b();
        final int i14 = 0;
        this.f45464j = new z0(this) { // from class: vu1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTDashBoardActivity f180348b;

            {
                this.f180348b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                int i16 = 1;
                FBTDashBoardActivity fBTDashBoardActivity = this.f180348b;
                switch (i15) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        FBTDashBoardActivity.a aVar = FBTDashBoardActivity.f45458n;
                        pVar.getClass();
                        String str = (String) pVar.f128594a;
                        B b14 = pVar.f128595b;
                        switch (str.hashCode()) {
                            case -1616504802:
                                if (str.equals("FBTTrainingGuidanceArticleFrag")) {
                                    if (!(b14 instanceof String)) {
                                        i2.a aVar2 = i2.f36769a;
                                        a2 a2Var = a2.GENERAL;
                                        aVar2.getClass();
                                        i2.a.f(a2Var, "FBTDashBoardActivity", "TrainingGuidance article page expected string values as arguments");
                                    } else {
                                        zu1.i.f207108c.getClass();
                                        zu1.i iVar = new zu1.i();
                                        Bundle bundle = new Bundle();
                                        bundle.putString("extra_content_ref_url", (String) b14);
                                        iVar.setArguments(bundle);
                                        fBTDashBoardActivity.oa(iVar, str);
                                    }
                                    break;
                                }
                                break;
                            case -1424763590:
                                if (str.equals("FBTTrainingGuidancePlayerActivity")) {
                                    b14.getClass();
                                    o13.p pVar2 = (o13.p) b14;
                                    A a14 = pVar2.f128594a;
                                    B b15 = pVar2.f128595b;
                                    if ((a14 instanceof String) && (b15 instanceof String)) {
                                        FBTTrainingGuidancePlayerActivity.f45483c.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("extra_content_ref_url", (String) a14);
                                        Intent intentPutExtras = new Intent(fBTDashBoardActivity, (Class<?>) FBTTrainingGuidancePlayerActivity.class).putExtras(bundle2);
                                        intentPutExtras.getClass();
                                        fBTDashBoardActivity.startActivity(intentPutExtras);
                                    } else {
                                        i2.a aVar3 = i2.f36769a;
                                        a2 a2Var2 = a2.GENERAL;
                                        aVar3.getClass();
                                        i2.a.f(a2Var2, "FBTDashBoardActivity", "TrainingGuidance video preview page expected string values as arguments");
                                    }
                                    break;
                                }
                                break;
                            case -172312726:
                                if (str.equals("FBTTrainingGuidanceDetailsFrag")) {
                                    zu1.k.f207122d.getClass();
                                    fBTDashBoardActivity.oa(new zu1.k(), str);
                                    break;
                                }
                                break;
                            case 1256771434:
                                if (str.equals("FBTPlanOverviewFragment")) {
                                    zu1.e.f207093e.getClass();
                                    fBTDashBoardActivity.oa(new zu1.e(), str);
                                    break;
                                }
                                break;
                            case 1954402476:
                                if (str.equals("FBTDashBoardFragment")) {
                                    zu1.c.f207075i.getClass();
                                    fBTDashBoardActivity.oa(new zu1.c(null, i16, 0 == true ? 1 : 0), str);
                                    break;
                                }
                                break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        FBTDashBoardActivity.a aVar4 = FBTDashBoardActivity.f45458n;
                        g3Var.getClass();
                        int i17 = FBTDashBoardActivity.b.f45468a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            fBTDashBoardActivity.invalidateOptionsMenu();
                            break;
                        } else if (i17 != 2 && i17 != 3) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f45465k = new z0(this) { // from class: vu1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTDashBoardActivity f180348b;

            {
                this.f180348b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                int i17 = 1;
                FBTDashBoardActivity fBTDashBoardActivity = this.f180348b;
                switch (i16) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        FBTDashBoardActivity.a aVar = FBTDashBoardActivity.f45458n;
                        pVar.getClass();
                        String str = (String) pVar.f128594a;
                        B b14 = pVar.f128595b;
                        switch (str.hashCode()) {
                            case -1616504802:
                                if (str.equals("FBTTrainingGuidanceArticleFrag")) {
                                    if (!(b14 instanceof String)) {
                                        i2.a aVar2 = i2.f36769a;
                                        a2 a2Var = a2.GENERAL;
                                        aVar2.getClass();
                                        i2.a.f(a2Var, "FBTDashBoardActivity", "TrainingGuidance article page expected string values as arguments");
                                    } else {
                                        zu1.i.f207108c.getClass();
                                        zu1.i iVar = new zu1.i();
                                        Bundle bundle = new Bundle();
                                        bundle.putString("extra_content_ref_url", (String) b14);
                                        iVar.setArguments(bundle);
                                        fBTDashBoardActivity.oa(iVar, str);
                                    }
                                    break;
                                }
                                break;
                            case -1424763590:
                                if (str.equals("FBTTrainingGuidancePlayerActivity")) {
                                    b14.getClass();
                                    o13.p pVar2 = (o13.p) b14;
                                    A a14 = pVar2.f128594a;
                                    B b15 = pVar2.f128595b;
                                    if ((a14 instanceof String) && (b15 instanceof String)) {
                                        FBTTrainingGuidancePlayerActivity.f45483c.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("extra_content_ref_url", (String) a14);
                                        Intent intentPutExtras = new Intent(fBTDashBoardActivity, (Class<?>) FBTTrainingGuidancePlayerActivity.class).putExtras(bundle2);
                                        intentPutExtras.getClass();
                                        fBTDashBoardActivity.startActivity(intentPutExtras);
                                    } else {
                                        i2.a aVar3 = i2.f36769a;
                                        a2 a2Var2 = a2.GENERAL;
                                        aVar3.getClass();
                                        i2.a.f(a2Var2, "FBTDashBoardActivity", "TrainingGuidance video preview page expected string values as arguments");
                                    }
                                    break;
                                }
                                break;
                            case -172312726:
                                if (str.equals("FBTTrainingGuidanceDetailsFrag")) {
                                    zu1.k.f207122d.getClass();
                                    fBTDashBoardActivity.oa(new zu1.k(), str);
                                    break;
                                }
                                break;
                            case 1256771434:
                                if (str.equals("FBTPlanOverviewFragment")) {
                                    zu1.e.f207093e.getClass();
                                    fBTDashBoardActivity.oa(new zu1.e(), str);
                                    break;
                                }
                                break;
                            case 1954402476:
                                if (str.equals("FBTDashBoardFragment")) {
                                    zu1.c.f207075i.getClass();
                                    fBTDashBoardActivity.oa(new zu1.c(null, i17, 0 == true ? 1 : 0), str);
                                    break;
                                }
                                break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        FBTDashBoardActivity.a aVar4 = FBTDashBoardActivity.f45458n;
                        g3Var.getClass();
                        int i18 = FBTDashBoardActivity.b.f45468a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            fBTDashBoardActivity.invalidateOptionsMenu();
                            break;
                        } else if (i18 != 2 && i18 != 3) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i16 = 0;
        this.f45466l = registerForActivityResult(new h(), new f.b(this) { // from class: vu1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTDashBoardActivity f180350b;

            {
                this.f180350b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i17 = i16;
                FBTDashBoardActivity fBTDashBoardActivity = this.f180350b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        FBTDashBoardActivity.a aVar2 = FBTDashBoardActivity.f45458n;
                        aVar.getClass();
                        p92.o oVar2 = p92.o.f136619a;
                        q92.x xVar2 = q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
                        oVar2.getClass();
                        q92.v vVarN = p92.o.n(xVar2);
                        if (fBTDashBoardActivity.f45463i && vVarN != null && !vVarN.b() && !q92.c.a(vVarN)) {
                            Intent intent = new Intent();
                            intent.putExtra("EXTRA_REFRESH_CHILD_COACH", true);
                            fBTDashBoardActivity.setResult(-1, intent);
                            fBTDashBoardActivity.finish();
                            break;
                        }
                        break;
                    default:
                        FBTDashBoardActivity.a aVar3 = FBTDashBoardActivity.f45458n;
                        aVar.getClass();
                        o oVarMa = fBTDashBoardActivity.ma();
                        Long l14 = oVarMa.f180261k0;
                        if (l14 != null) {
                            ge1.b.T(v1.a(oVarMa), null, null, new v(true, oVarMa, l14.longValue(), new tw1.p(null, "Scheduled"), null), 3);
                        }
                        break;
                }
            }
        });
        final int i17 = 1;
        this.f45467m = registerForActivityResult(new h(), new f.b(this) { // from class: vu1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTDashBoardActivity f180350b;

            {
                this.f180350b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i18 = i17;
                FBTDashBoardActivity fBTDashBoardActivity = this.f180350b;
                f.a aVar = (f.a) obj;
                switch (i18) {
                    case 0:
                        FBTDashBoardActivity.a aVar2 = FBTDashBoardActivity.f45458n;
                        aVar.getClass();
                        p92.o oVar2 = p92.o.f136619a;
                        q92.x xVar2 = q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
                        oVar2.getClass();
                        q92.v vVarN = p92.o.n(xVar2);
                        if (fBTDashBoardActivity.f45463i && vVarN != null && !vVarN.b() && !q92.c.a(vVarN)) {
                            Intent intent = new Intent();
                            intent.putExtra("EXTRA_REFRESH_CHILD_COACH", true);
                            fBTDashBoardActivity.setResult(-1, intent);
                            fBTDashBoardActivity.finish();
                            break;
                        }
                        break;
                    default:
                        FBTDashBoardActivity.a aVar3 = FBTDashBoardActivity.f45458n;
                        aVar.getClass();
                        o oVarMa = fBTDashBoardActivity.ma();
                        Long l14 = oVarMa.f180261k0;
                        if (l14 != null) {
                            ge1.b.T(v1.a(oVarMa), null, null, new v(true, oVarMa, l14.longValue(), new tw1.p(null, "Scheduled"), null), 3);
                        }
                        break;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (isTopNavigation()) {
            return this.f45460f;
        }
        return null;
    }

    public final o ma() {
        return (o) this.f45459e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void na() {
        k kVarB;
        n nVar;
        m mVar;
        tw1.l trainingLevel;
        Long l14 = ma().f180261k0;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            vt1.o oVar = ma().H0;
            if (oVar != null) {
                FBTEditPreferencesActivity.a aVar = FBTEditPreferencesActivity.f45500c;
                g3 g3Var = (g3) ma().J0.d();
                if (g3Var == null || (nVar = (n) g3Var.f35301b) == null || (mVar = nVar.f101079a) == null || (trainingLevel = mVar.getTrainingLevel()) == null || (kVarB = trainingLevel.b()) == null) {
                    kVarB = k.INTERMEDIATE;
                }
                aVar.getClass();
                kVarB.getClass();
                Intent intent = new Intent(this, (Class<?>) FBTEditPreferencesActivity.class);
                Bundle bundle = new Bundle();
                bundle.putLong("EXTRA_ATHLETE_PLAN_ID", jLongValue);
                bundle.putString("EXTRA_PLAN_TYPE", oVar.name());
                bundle.putInt("EXTRA_TRAINING_LEVEL", kVarB.f166747a);
                intent.putExtras(bundle);
                startActivityForResult(intent, 1002);
            }
        }
    }

    public final void oa(Fragment fragment, String str) {
        if (!getSupportFragmentManager().f7372c.f().isEmpty()) {
            androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarC = j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
            aVarC.d(str);
            aVarC.e();
            return;
        }
        androidx.fragment.app.v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager2);
        aVar.l(R.id.content_frame, fragment, str);
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 != 300) {
            if (i14 == 1002 && i15 == -1) {
                ma().c5();
            }
        } else if (i15 == 11) {
            setResult(i15);
            finish();
        } else if (i15 == 12) {
            this.f45461g = true;
            setResult(i15, intent);
            long longExtra = intent != null ? intent.getLongExtra("progress_report_new_plan_id", 0L) : 0L;
            o oVarMa = ma();
            oVarMa.f180261k0 = Long.valueOf(longExtra);
            oVarMa.c5();
        }
        if (i15 == 208) {
            i.f73924a.getClass();
            i.a.s(500L);
            finish();
        }
        if (i15 == 209) {
            ma().c5();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (!this.f45461g) {
            setResult(0);
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        String str;
        Bundle extras2;
        Bundle extras3;
        String string;
        super.onCreate(bundle);
        setContentView();
        rt1.l.f154545a.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "TrainingDashboardAnalytics", "Initialize training dashboard logging session");
        rt1.l.f154546b.clear();
        o oVarMa = ma();
        Bundle extras4 = getIntent().getExtras();
        oVarMa.f180261k0 = extras4 != null ? Long.valueOf(extras4.getLong("EXTRA_ATHLETE_PLAN_ID")) : null;
        o oVarMa2 = ma();
        Intent intent = getIntent();
        oVarMa2.H0 = (intent == null || (extras3 = intent.getExtras()) == null || (string = extras3.getString("EXTRA_PLAN_TYPE")) == null) ? null : vt1.o.valueOf(string);
        Intent intent2 = getIntent();
        this.f45460f = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : extras2.getString("GCM_tp_sel_navigation_item");
        ma().c5();
        vt1.o oVar = ma().H0;
        initActionBar(true, oVar != null ? oVar.e(this) : null);
        ma().O0.f(this, this.f45464j);
        ma().J0.f(this, this.f45465k);
        if (isTopNavigation() && (str = this.f45460f) != null) {
            ca(str);
        }
        Intent intent3 = getIntent();
        if (intent3 == null || (extras = intent3.getExtras()) == null || !extras.getBoolean("extra_launch_edit_preferences")) {
            return;
        }
        na();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        n nVar;
        v vVar;
        getMenuInflater().inflate(R.menu.fbt_dashboard_menu, menu);
        if (menu != null) {
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_help);
            MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_pause_plan);
            MenuItem menuItemFindItem3 = menu.findItem(R.id.menu_item_resume_plan);
            MenuItem menuItemFindItem4 = menu.findItem(R.id.menu_item_edit_preferences);
            MenuItem menuItemFindItem5 = menu.findItem(R.id.menu_item_quit_plan);
            MenuItem menuItemFindItem6 = menu.findItem(R.id.menu_item_review_consent);
            menuItemFindItem6.setTitle(getString(R.string.lbl_review_consent));
            boolean z14 = this.f45463i && (vVar = this.f45462h) != null && q92.c.a(vVar);
            menuItemFindItem.setVisible(!z14);
            menuItemFindItem2.setVisible(false);
            menuItemFindItem3.setVisible(false);
            menuItemFindItem4.setVisible(false);
            menuItemFindItem2.setVisible(false);
            menuItemFindItem6.setVisible(false);
            g3 g3Var = (g3) ma().J0.d();
            if (g3Var != null && (nVar = (n) g3Var.f35301b) != null) {
                boolean z15 = nVar.f101094p;
                boolean z16 = nVar.f101095q;
                menuItemFindItem3.setVisible(z16 && !z14);
                menuItemFindItem2.setVisible((z16 || z15) ? false : true);
                menuItemFindItem6.setVisible(z16 && z14);
                menuItemFindItem4.setVisible((z15 || z16) ? false : true);
                menuItemFindItem5.setTitle(z15 ? getString(R.string.itp_remove_plan) : getString(R.string.atp_quit_plan));
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0107 A[PHI: r1
      0x0107: PHI (r1v23 org.joda.time.DateTime) = (r1v16 org.joda.time.DateTime), (r1v26 org.joda.time.DateTime) binds: [B:59:0x0104, B:55:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:64:0x0118  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        n nVar;
        m mVar;
        DateTime dateTime;
        fg0.k kVar;
        LocalDate date;
        hv1.d dVar;
        n nVar2;
        m mVar2;
        n nVar3;
        m mVar3;
        tw1.l trainingLevel;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_edit_preferences) {
            na();
            return true;
        }
        Object objB = null;
        if (itemId == R.id.menu_item_help) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_run_walk_benchmark_text_key", ma().H0 != vt1.o.f180176g);
            o oVarMa = ma();
            g3 g3Var = (g3) oVarMa.J0.d();
            if (g3Var != null && (nVar3 = (n) g3Var.f35301b) != null && (mVar3 = nVar3.f101079a) != null && (trainingLevel = mVar3.getTrainingLevel()) != null) {
                objB = trainingLevel.b();
            }
            bundle.putBoolean("show_recovery_workouts_text_key", objB == k.BEGINNER && oVarMa.H0 == vt1.o.f180175f);
            g3 g3Var2 = (g3) ma().J0.d();
            if (g3Var2 == null || (nVar2 = (n) g3Var2.f35301b) == null || (mVar2 = nVar2.f101079a) == null || !mVar2.q0()) {
                i.f73924a.getClass();
                e12.a deviceBasedIndicators = bo1.a.a().c().getDeviceBasedIndicators();
                dVar = !(deviceBasedIndicators != null ? s.g(deviceBasedIndicators.getHasScreenlessDeviceCapableDevice(), Boolean.TRUE) : false) ? hv1.d.NO_SCREENLESS : hv1.d.BOTH_SCREENED_AND_SCREENLESS;
            } else {
                dVar = hv1.d.ONLY_SCREENLESS;
            }
            bundle.putInt("device_screen_type_ordinal_key", dVar.ordinal());
            HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.TRAINING_PLANS, null, bundle, 4);
        } else if (itemId == R.id.menu_item_pause_plan) {
            rt1.l.f154545a.getClass();
            rt1.l.a("GarminCoachPlanPaused");
            g3 g3Var3 = (g3) ma().J0.d();
            n nVar4 = g3Var3 != null ? (n) g3Var3.f35301b : null;
            if (nVar4 == null || (kVar = nVar4.f101088j) == null || (date = kVar.getDate()) == null || (dateTime = date.toDateTime(LocalTime.now())) == null) {
                dateTime = nVar4 != null ? nVar4.f101086h : null;
                if (dateTime != null) {
                    if (g22.k.j(dateTime, DateTime.now())) {
                        objB = j0.b(dateTime, "MMM d", null);
                    } else {
                        objB = j0.b(dateTime, "MMM d, yyyy", null);
                    }
                }
            } else if (g22.k.j(dateTime, DateTime.now())) {
                objB = j0.b(dateTime, "MMM d", null);
            } else {
                objB = j0.b(dateTime, "MMM d, yyyy", null);
            }
            String string = getString(R.string.training_status_pause_message, objB);
            string.getClass();
            final int i14 = 1;
            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(this).setTitle(getString(R.string.msg_pause_plan)).setMessage(string).setPositiveButton(R.string.common_confirm, new DialogInterface.OnClickListener(this) { // from class: vu1.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FBTDashBoardActivity f180343b;

                {
                    this.f180343b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i15) {
                    jv1.n nVar5;
                    av1.a aVar;
                    int i16 = i14;
                    FBTDashBoardActivity fBTDashBoardActivity = this.f180343b;
                    fg0.k kVar2 = null;
                    switch (i16) {
                        case 0:
                            FBTDashBoardActivity.a aVar2 = FBTDashBoardActivity.f45458n;
                            g3 g3Var4 = (g3) fBTDashBoardActivity.ma().J0.d();
                            if (g3Var4 != null && (nVar5 = (jv1.n) g3Var4.f35301b) != null && nVar5.f101088j != null) {
                                g3<av1.a> g3VarD = fBTDashBoardActivity.ma().d5().d();
                                if (g3VarD != null && (aVar = g3VarD.f35301b) != null) {
                                    kVar2 = aVar.f13227b;
                                }
                                if (kVar2 != null) {
                                    Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                                    String strR = kVar2.r(false);
                                    if (strR != null) {
                                        boolean zP0 = kVar2.p0();
                                        String string2 = zP0 ? fBTDashBoardActivity.getString(R.string.keep_training_plan_with_event_subscribed, strR) : fBTDashBoardActivity.getString(R.string.keep_training_plan_with_event_created, strR);
                                        string2.getClass();
                                        int i17 = zP0 ? R.string.workout_remove_from_calendar : R.string.delete_event;
                                        androidx.fragment.app.v supportFragmentManager = fBTDashBoardActivity.getSupportFragmentManager();
                                        supportFragmentManager.getClass();
                                        rt1.n.d(fBTDashBoardActivity, supportFragmentManager, string2, i17, new ad0.f(fBTDashBoardActivity, zP0, kVar2, 29));
                                        break;
                                    }
                                }
                            } else {
                                fBTDashBoardActivity.ma().j5(new j(fBTDashBoardActivity, 1));
                                break;
                            }
                            break;
                        default:
                            FBTDashBoardActivity.a aVar3 = FBTDashBoardActivity.f45458n;
                            o oVarMa2 = fBTDashBoardActivity.ma();
                            Long l14 = oVarMa2.f180261k0;
                            if (l14 != null) {
                                ge1.b.T(v1.a(oVarMa2), null, null, new v(false, oVarMa2, l14.longValue(), new tw1.p(null, "Paused"), null), 3);
                            }
                            dialogInterface.dismiss();
                            break;
                    }
                }
            }).setNegativeButton(R.string.confirm_cancellation_dialog, new vu1.k(1)).create();
            eVarCreate.getClass();
            eVarCreate.show();
        } else if (itemId == R.id.menu_item_review_consent) {
            this.f45466l.a(CoachConsentActivity.a.a(CoachConsentActivity.f32153p, this, null, 6), null);
        } else if (itemId == R.id.menu_item_resume_plan) {
            g3 g3Var4 = (g3) ma().J0.d();
            ge1.b.T(f0.w(this), null, null, new vu1.n((g3Var4 == null || (nVar = (n) g3Var4.f35301b) == null || (mVar = nVar.f101079a) == null || !mVar.q0()) ? false : true, this, null), 3);
        } else if (itemId == R.id.menu_item_quit_plan) {
            rt1.l.f154545a.getClass();
            rt1.l.a("GarminCoachPlanQuit");
            final int i15 = 0;
            androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(this).setTitle(getString(R.string.msg_quit_plan)).setMessage(getString(R.string.msg_quit_plan_info)).setPositiveButton(R.string.common_confirm, new DialogInterface.OnClickListener(this) { // from class: vu1.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FBTDashBoardActivity f180343b;

                {
                    this.f180343b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i16) {
                    jv1.n nVar5;
                    av1.a aVar;
                    int i17 = i15;
                    FBTDashBoardActivity fBTDashBoardActivity = this.f180343b;
                    fg0.k kVar2 = null;
                    switch (i17) {
                        case 0:
                            FBTDashBoardActivity.a aVar2 = FBTDashBoardActivity.f45458n;
                            g3 g3Var5 = (g3) fBTDashBoardActivity.ma().J0.d();
                            if (g3Var5 != null && (nVar5 = (jv1.n) g3Var5.f35301b) != null && nVar5.f101088j != null) {
                                g3<av1.a> g3VarD = fBTDashBoardActivity.ma().d5().d();
                                if (g3VarD != null && (aVar = g3VarD.f35301b) != null) {
                                    kVar2 = aVar.f13227b;
                                }
                                if (kVar2 != null) {
                                    Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                                    String strR = kVar2.r(false);
                                    if (strR != null) {
                                        boolean zP0 = kVar2.p0();
                                        String string2 = zP0 ? fBTDashBoardActivity.getString(R.string.keep_training_plan_with_event_subscribed, strR) : fBTDashBoardActivity.getString(R.string.keep_training_plan_with_event_created, strR);
                                        string2.getClass();
                                        int i18 = zP0 ? R.string.workout_remove_from_calendar : R.string.delete_event;
                                        androidx.fragment.app.v supportFragmentManager = fBTDashBoardActivity.getSupportFragmentManager();
                                        supportFragmentManager.getClass();
                                        rt1.n.d(fBTDashBoardActivity, supportFragmentManager, string2, i18, new ad0.f(fBTDashBoardActivity, zP0, kVar2, 29));
                                        break;
                                    }
                                }
                            } else {
                                fBTDashBoardActivity.ma().j5(new j(fBTDashBoardActivity, 1));
                                break;
                            }
                            break;
                        default:
                            FBTDashBoardActivity.a aVar3 = FBTDashBoardActivity.f45458n;
                            o oVarMa2 = fBTDashBoardActivity.ma();
                            Long l14 = oVarMa2.f180261k0;
                            if (l14 != null) {
                                ge1.b.T(v1.a(oVarMa2), null, null, new v(false, oVarMa2, l14.longValue(), new tw1.p(null, "Paused"), null), 3);
                            }
                            dialogInterface.dismiss();
                            break;
                    }
                }
            }).setNegativeButton(R.string.confirm_cancellation_dialog, new vu1.k(0)).create();
            eVarCreate2.getClass();
            eVarCreate2.show();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/dashboard/FBTDashBoardActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_ATHLETE_PLAN_ID", "EXTRA_PLAN_TYPE", "EXTRA_LAUNCH_EDIT_PREFERENCES", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, vt1.o oVar, boolean z14, String str) {
            context.getClass();
            oVar.getClass();
            Intent intent = new Intent(context, (Class<?>) FBTDashBoardActivity.class);
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_ATHLETE_PLAN_ID", j8);
            bundle.putString("EXTRA_PLAN_TYPE", oVar.name());
            bundle.putBoolean("GCM_extra_top_navigation", z14);
            bundle.putString("GCM_tp_sel_navigation_item", str);
            intent.putExtras(bundle);
            if (z14) {
                intent.addFlags(335544320);
            }
            return intent;
        }

        public static void b(Context context, long j8, String str) {
            context.getClass();
            vt1.o.a aVar = vt1.o.f180174e;
            String str2 = str == null ? "" : str;
            aVar.getClass();
            vt1.o oVarA = vt1.o.a.a(str2);
            if (oVarA != null) {
                context.startActivity(a(context, j8, oVarA, false, null));
            } else {
                vb.h.s(fb1.c.n("Invalid training type: ", str));
            }
        }

        public static void c(a aVar, Activity activity, long j8, vt1.o oVar, int i14, int i15) {
            aVar.getClass();
            activity.getClass();
            oVar.getClass();
            activity.startActivityForResult(a(activity, j8, oVar, false, null).putExtra("extra_launch_edit_preferences", false), i14);
        }

        private a() {
        }
    }
}
