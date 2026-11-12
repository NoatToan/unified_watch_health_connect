package com.garmin.android.apps.connectmobile.jet_lag.presentation.setup;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.k1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupActivity;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import lc.u0;
import ls0.a0;
import ls0.d0;
import ls0.w;
import o13.h;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p006l2.v0;
import p13.j0;
import r22.o0;
import r22.p0;
import yr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/TripSetupActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lls0/c;", "<init>", "()V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TripSetupActivity extends com.garmin.android.apps.connectmobile.c implements ls0.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f37081g = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<String[]> f37084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f37085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f37086e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37082a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wr0.a f37083b = (wr0.a) KoinJavaComponent.get$default(wr0.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f37087f = m.b(new v0(this, 14));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37088a;

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
            f37088a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f37089a;

        public c(l lVar) {
            lVar.getClass();
            this.f37089a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f37089a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37089a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f37090a;

        public d(g gVar) {
            this.f37090a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37090a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f37091a;

        public e(g gVar) {
            this.f37091a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37091a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f37093b;

        public f(e23.a aVar, g gVar) {
            this.f37092a = aVar;
            this.f37093b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37092a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37093b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public TripSetupActivity() {
        final int i14 = 0;
        this.f37084c = registerForActivityResult(new g.f(), new f.b(this) { // from class: ls0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripSetupActivity f114777b;

            {
                this.f114777b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                TripSetupActivity tripSetupActivity = this.f114777b;
                switch (i15) {
                    case 0:
                        Map map = (Map) obj;
                        TripSetupActivity.a aVar = TripSetupActivity.f37081g;
                        map.getClass();
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    a2 a2Var = a2.JET_LAG;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var, "TripSetupActivity", "[requestPermissionLauncher] location permission granted");
                                    tripSetupActivity.ca().B4(tripSetupActivity.f37083b.b());
                                    break;
                                }
                            }
                        }
                        a2 a2Var2 = a2.JET_LAG;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "TripSetupActivity", "[requestPermissionLauncher] location permission not granted");
                        tripSetupActivity.da();
                        break;
                    case 1:
                        TripSetupActivity.a aVar2 = TripSetupActivity.f37081g;
                        ((f.a) obj).getClass();
                        a2 a2Var3 = a2.JET_LAG;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "TripSetupActivity", "[applicationDetails] returned from application details");
                        if (!tripSetupActivity.ca().y4()) {
                            i2.a.b(a2Var3, "TripSetupActivity", "[applicationDetails] location permission not granted by user");
                            tripSetupActivity.ca().A4();
                        } else {
                            i2.a.b(a2Var3, "TripSetupActivity", "[applicationDetails] location permission granted by suer");
                            tripSetupActivity.ca().B4(true);
                        }
                        break;
                    default:
                        TripSetupActivity.a aVar3 = TripSetupActivity.f37081g;
                        ((f.a) obj).getClass();
                        a2 a2Var4 = a2.JET_LAG;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var4, "TripSetupActivity", "[locationSettings] returned from location settings");
                        if (!tripSetupActivity.ca().f37106d.a("TripSetupViewModel")) {
                            i2.a.b(a2Var4, "TripSetupActivity", "[locationSettings] location is disabled by user");
                            tripSetupActivity.ca().A4();
                        } else {
                            i2.a.b(a2Var4, "TripSetupActivity", "[locationSettings] location is enabled by user");
                            tripSetupActivity.ca().B4(tripSetupActivity.f37083b.b());
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f37085d = registerForActivityResult(new g.h(), new f.b(this) { // from class: ls0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripSetupActivity f114777b;

            {
                this.f114777b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                TripSetupActivity tripSetupActivity = this.f114777b;
                switch (i16) {
                    case 0:
                        Map map = (Map) obj;
                        TripSetupActivity.a aVar = TripSetupActivity.f37081g;
                        map.getClass();
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    a2 a2Var = a2.JET_LAG;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var, "TripSetupActivity", "[requestPermissionLauncher] location permission granted");
                                    tripSetupActivity.ca().B4(tripSetupActivity.f37083b.b());
                                    break;
                                }
                            }
                        }
                        a2 a2Var2 = a2.JET_LAG;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "TripSetupActivity", "[requestPermissionLauncher] location permission not granted");
                        tripSetupActivity.da();
                        break;
                    case 1:
                        TripSetupActivity.a aVar2 = TripSetupActivity.f37081g;
                        ((f.a) obj).getClass();
                        a2 a2Var3 = a2.JET_LAG;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "TripSetupActivity", "[applicationDetails] returned from application details");
                        if (!tripSetupActivity.ca().y4()) {
                            i2.a.b(a2Var3, "TripSetupActivity", "[applicationDetails] location permission not granted by user");
                            tripSetupActivity.ca().A4();
                        } else {
                            i2.a.b(a2Var3, "TripSetupActivity", "[applicationDetails] location permission granted by suer");
                            tripSetupActivity.ca().B4(true);
                        }
                        break;
                    default:
                        TripSetupActivity.a aVar3 = TripSetupActivity.f37081g;
                        ((f.a) obj).getClass();
                        a2 a2Var4 = a2.JET_LAG;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var4, "TripSetupActivity", "[locationSettings] returned from location settings");
                        if (!tripSetupActivity.ca().f37106d.a("TripSetupViewModel")) {
                            i2.a.b(a2Var4, "TripSetupActivity", "[locationSettings] location is disabled by user");
                            tripSetupActivity.ca().A4();
                        } else {
                            i2.a.b(a2Var4, "TripSetupActivity", "[locationSettings] location is enabled by user");
                            tripSetupActivity.ca().B4(tripSetupActivity.f37083b.b());
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        this.f37086e = registerForActivityResult(new g.h(), new f.b(this) { // from class: ls0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripSetupActivity f114777b;

            {
                this.f114777b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i17 = i16;
                TripSetupActivity tripSetupActivity = this.f114777b;
                switch (i17) {
                    case 0:
                        Map map = (Map) obj;
                        TripSetupActivity.a aVar = TripSetupActivity.f37081g;
                        map.getClass();
                        if (!map.isEmpty()) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    a2 a2Var = a2.JET_LAG;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var, "TripSetupActivity", "[requestPermissionLauncher] location permission granted");
                                    tripSetupActivity.ca().B4(tripSetupActivity.f37083b.b());
                                    break;
                                }
                            }
                        }
                        a2 a2Var2 = a2.JET_LAG;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "TripSetupActivity", "[requestPermissionLauncher] location permission not granted");
                        tripSetupActivity.da();
                        break;
                    case 1:
                        TripSetupActivity.a aVar2 = TripSetupActivity.f37081g;
                        ((f.a) obj).getClass();
                        a2 a2Var3 = a2.JET_LAG;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "TripSetupActivity", "[applicationDetails] returned from application details");
                        if (!tripSetupActivity.ca().y4()) {
                            i2.a.b(a2Var3, "TripSetupActivity", "[applicationDetails] location permission not granted by user");
                            tripSetupActivity.ca().A4();
                        } else {
                            i2.a.b(a2Var3, "TripSetupActivity", "[applicationDetails] location permission granted by suer");
                            tripSetupActivity.ca().B4(true);
                        }
                        break;
                    default:
                        TripSetupActivity.a aVar3 = TripSetupActivity.f37081g;
                        ((f.a) obj).getClass();
                        a2 a2Var4 = a2.JET_LAG;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var4, "TripSetupActivity", "[locationSettings] returned from location settings");
                        if (!tripSetupActivity.ca().f37106d.a("TripSetupViewModel")) {
                            i2.a.b(a2Var4, "TripSetupActivity", "[locationSettings] location is disabled by user");
                            tripSetupActivity.ca().A4();
                        } else {
                            i2.a.b(a2Var4, "TripSetupActivity", "[locationSettings] location is enabled by user");
                            tripSetupActivity.ca().B4(tripSetupActivity.f37083b.b());
                        }
                        break;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final void applyBottomContentInsets() {
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final void applyTopInsets(View view2) {
    }

    public final com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e ca() {
        return (com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e) this.f37082a.getValue();
    }

    public final void da() {
        o0.a aVar = o0.f149771c;
        String string = getString(R.string.weather_location_permission_needed);
        String string2 = getString(R.string.allow_access_to_phone_settings);
        w wVar = new w(this, 0);
        w wVar2 = new w(this, 1);
        aVar.getClass();
        o0.a.a(string, string2, R.string.lbl_settings, wVar, R.string.lbl_cancel, wVar2).show(getSupportFragmentManager(), (String) null);
    }

    @Override // ls0.c
    public final void f7(final boolean z14) {
        int i14;
        final p0 p0Var = new p0();
        p0Var.showNow(getSupportFragmentManager(), null);
        if (ca().z4()) {
            i14 = R.string.msg_trip_edited_successfully;
        } else {
            i14 = ((Boolean) this.f37087f.getValue()).booleanValue() ? R.string.msg_trip_added_to_calendar_successfully : R.string.msg_trip_added_successfully;
        }
        p0Var.y6(R.string.lbl_ready_to_go, i14);
        Dialog dialog = p0Var.getDialog();
        if (dialog != null) {
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ls0.x
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TripSetupActivity.a aVar = TripSetupActivity.f37081g;
                    p0Var.dismissAllowingStateLoss();
                    boolean z15 = z14;
                    TripSetupActivity tripSetupActivity = this;
                    boolean z16 = false;
                    if (z15) {
                        bv.b.f21239a.getClass();
                        ((kd0.m) bv.b.a()).a(tripSetupActivity, null, 0);
                        return;
                    }
                    JetLagActivity.a aVar2 = JetLagActivity.f36950d;
                    Bundle extras = tripSetupActivity.getIntent().getExtras();
                    if (extras != null && extras.getBoolean("EXTRA_SHOW_DRAWER")) {
                        z16 = true;
                    }
                    aVar2.getClass();
                    tripSetupActivity.startActivity(JetLagActivity.a.a(tripSetupActivity, z16));
                    tripSetupActivity.finish();
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    @Override // b.g, androidx.lifecycle.y
    public final x1.c getDefaultViewModelProviderFactory() {
        List parcelableArrayList;
        Parcelable parcelable;
        Bundle extras = getIntent().getExtras();
        o oVar = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("EXTRA_EDITED_TRIP", o.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("EXTRA_EDITED_TRIP");
                parcelable = (o) (parcelable2 instanceof o ? parcelable2 : null);
            }
            oVar = (o) parcelable;
        }
        if (extras == null) {
            parcelableArrayList = j0.f134944a;
        } else {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("EXTRA_NOT_EDITED_TRIPS", o.class) : extras.getParcelableArrayList("EXTRA_NOT_EDITED_TRIPS");
            if (parcelableArrayList == null) {
                parcelableArrayList = j0.f134944a;
            }
        }
        return new d0(oVar, parcelableArrayList);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.trip_setup_activity);
        final int i14 = 1;
        initActionBar(true, ca().z4() ? R.string.lbl_edit_trip : R.string.lbl_add_a_trip);
        final int i15 = 0;
        k1.a(getWindow(), false);
        View viewFindViewById = findViewById(R.id.toolbar_actionbar);
        u0 u0Var = new u0(16);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, u0Var);
        androidx.core.view.s0.d.c(findViewById(R.id.complex_status_banner), new u0(17));
        ca().f37114l.f(this, new c(new l(this) { // from class: ls0.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripSetupActivity f114779b;

            {
                this.f114779b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                TripSetupActivity tripSetupActivity = this.f114779b;
                switch (i16) {
                    case 0:
                        wr0.a aVar = tripSetupActivity.f37083b;
                        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b bVar = (com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b) obj;
                        TripSetupActivity.a aVar2 = TripSetupActivity.f37081g;
                        if (bVar instanceof com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.a) {
                            a2 a2Var = a2.JET_LAG;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "TripSetupActivity", "[observeLocationStatus] location is enabled and permission granted -> get location");
                        } else if (bVar instanceof com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.c) {
                            String[] strArr = tripSetupActivity.ca().f37109g;
                            for (String str : strArr) {
                                if (tripSetupActivity.shouldShowRequestPermissionRationale(str)) {
                                    if (((com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.c) bVar).f37097a) {
                                        aVar.a();
                                        a2 a2Var2 = a2.JET_LAG;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var2, "TripSetupActivity", "[observeLocationStatus] location permission not granted -> show rationale");
                                        tripSetupActivity.da();
                                    }
                                }
                            }
                            a2 a2Var3 = a2.JET_LAG;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "TripSetupActivity", "[observeLocationStatus] location permission not granted -> request permission");
                            tripSetupActivity.f37084c.a(strArr, null);
                        } else if ((bVar instanceof com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.C0665b) && ((com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.C0665b) bVar).f37096a) {
                            aVar.a();
                            a2 a2Var4 = a2.JET_LAG;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var4, "TripSetupActivity", "[observeLocationStatus] location is disabled -> show dialog");
                            o0.a aVar3 = o0.f149771c;
                            String string = tripSetupActivity.getString(R.string.lbl_location_access_needed);
                            String string2 = tripSetupActivity.getString(R.string.msg_turn_on_location_in_phone_settings);
                            w wVar = new w(tripSetupActivity, 2);
                            w wVar2 = new w(tripSetupActivity, 3);
                            aVar3.getClass();
                            o0.a.a(string, string2, R.string.lbl_settings, wVar, R.string.lbl_cancel, wVar2).show(tripSetupActivity.getSupportFragmentManager(), (String) null);
                        }
                        return Unit.INSTANCE;
                    default:
                        TripSetupActivity.a aVar4 = TripSetupActivity.f37081g;
                        int i17 = TripSetupActivity.b.f37088a[((g3) obj).f35300a.ordinal()];
                        if (i17 == 1) {
                            tripSetupActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            tripSetupActivity.hideProgressOverlay();
                        } else {
                            if (i17 != 3) {
                                u0.r();
                                return null;
                            }
                            tripSetupActivity.hideProgressOverlay();
                            tripSetupActivity.displayFailedMessage();
                            tripSetupActivity.onBackPressed();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ca().B4(this.f37083b.b());
        if (((Boolean) this.f37087f.getValue()).booleanValue() && !ca().z4()) {
            ca().f37112j.f(this, new c(new l(this) { // from class: ls0.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TripSetupActivity f114779b;

                {
                    this.f114779b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i14;
                    TripSetupActivity tripSetupActivity = this.f114779b;
                    switch (i16) {
                        case 0:
                            wr0.a aVar = tripSetupActivity.f37083b;
                            com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b bVar = (com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b) obj;
                            TripSetupActivity.a aVar2 = TripSetupActivity.f37081g;
                            if (bVar instanceof com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.a) {
                                a2 a2Var = a2.JET_LAG;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var, "TripSetupActivity", "[observeLocationStatus] location is enabled and permission granted -> get location");
                            } else if (bVar instanceof com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.c) {
                                String[] strArr = tripSetupActivity.ca().f37109g;
                                for (String str : strArr) {
                                    if (tripSetupActivity.shouldShowRequestPermissionRationale(str)) {
                                        if (((com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.c) bVar).f37097a) {
                                            aVar.a();
                                            a2 a2Var2 = a2.JET_LAG;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var2, "TripSetupActivity", "[observeLocationStatus] location permission not granted -> show rationale");
                                            tripSetupActivity.da();
                                        }
                                    }
                                }
                                a2 a2Var3 = a2.JET_LAG;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var3, "TripSetupActivity", "[observeLocationStatus] location permission not granted -> request permission");
                                tripSetupActivity.f37084c.a(strArr, null);
                            } else if ((bVar instanceof com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.C0665b) && ((com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.b.C0665b) bVar).f37096a) {
                                aVar.a();
                                a2 a2Var4 = a2.JET_LAG;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var4, "TripSetupActivity", "[observeLocationStatus] location is disabled -> show dialog");
                                o0.a aVar3 = o0.f149771c;
                                String string = tripSetupActivity.getString(R.string.lbl_location_access_needed);
                                String string2 = tripSetupActivity.getString(R.string.msg_turn_on_location_in_phone_settings);
                                w wVar = new w(tripSetupActivity, 2);
                                w wVar2 = new w(tripSetupActivity, 3);
                                aVar3.getClass();
                                o0.a.a(string, string2, R.string.lbl_settings, wVar, R.string.lbl_cancel, wVar2).show(tripSetupActivity.getSupportFragmentManager(), (String) null);
                            }
                            return Unit.INSTANCE;
                        default:
                            TripSetupActivity.a aVar4 = TripSetupActivity.f37081g;
                            int i17 = TripSetupActivity.b.f37088a[((g3) obj).f35300a.ordinal()];
                            if (i17 == 1) {
                                tripSetupActivity.showProgressOverlay();
                            } else if (i17 == 2) {
                                tripSetupActivity.hideProgressOverlay();
                            } else {
                                if (i17 != 3) {
                                    u0.r();
                                    return null;
                                }
                                tripSetupActivity.hideProgressOverlay();
                                tripSetupActivity.displayFailedMessage();
                                tripSetupActivity.onBackPressed();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
            com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVarCa = ca();
            w9.a aVarA = v1.a(eVarCa);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new a0(eVarCa, null), 2);
        }
        ((bs0.a) KoinJavaComponent.get$default(bs0.a.class, null, null, 6, null)).a();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/TripSetupActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_EDITED_TRIP", "EXTRA_NOT_EDITED_TRIPS", "EXTRA_FROM_CALENDAR", "EXTRA_SHOW_DRAWER", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, o oVar, List list, boolean z14, boolean z15, int i14) {
            if ((i14 & 2) != 0) {
                oVar = null;
            }
            if ((i14 & 4) != 0) {
                list = j0.f134944a;
            }
            if ((i14 & 8) != 0) {
                z14 = false;
            }
            if ((i14 & 16) != 0) {
                z15 = true;
            }
            aVar.getClass();
            list.getClass();
            Intent intent = new Intent(context, (Class<?>) TripSetupActivity.class);
            intent.putExtra("EXTRA_EDITED_TRIP", oVar);
            intent.putParcelableArrayListExtra("EXTRA_NOT_EDITED_TRIPS", new ArrayList<>(list));
            intent.putExtra("EXTRA_FROM_CALENDAR", z14);
            intent.putExtra("EXTRA_SHOW_DRAWER", z15);
            return intent;
        }

        private a() {
        }
    }
}
