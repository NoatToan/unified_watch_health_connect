package com.garmin.android.apps.connectmobile.activities.intensityintervalsediting;

import am.a2;
import am.x0;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.ActivitiesEditIntervalsActivity;
import com.garmin.android.apps.connectmobile.activities.newmodel.n0;
import com.garmin.android.apps.connectmobile.activities.newmodel.x;
import com.garmin.android.apps.connectmobile.g1;
import e23.l;
import ew1.h1;
import fw.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ko.g;
import ko.j;
import ko.k;
import lc.u0;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import ps.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/intensityintervalsediting/ActivitiesEditIntervalsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivitiesEditIntervalsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f29107m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MenuItem f29108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f29110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayoutManager f29111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f29112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppCompatButton f29113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AppCompatButton f29114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f29115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f29116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f29118k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x0 f29119l;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29120a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29120a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29121a;

        public c(l lVar) {
            lVar.getClass();
            this.f29121a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29121a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29121a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public final void ca(int i14) {
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(new ColorDrawable(a7.b.getColor(this, i14)));
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar_default);
        int childCount = toolbar.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = toolbar.getChildAt(i15);
            if (childAt instanceof ActionMenuView) {
                ((ActionMenuView) childAt).setBackgroundColor(a7.b.getColor(this, i14));
            }
        }
    }

    public final void da() {
        e.a aVar = new e.a(this);
        aVar.setTitle(R.string.message_common_confirm_leaving_screen);
        aVar.setMessage(R.string.dev_dialog_interval_editing).setPositiveButton(R.string.lbl_common_continue, new h1(this, 28)).setNegativeButton(R.string.lbl_cancel, new jm0.c(7));
        aVar.create();
        aVar.show();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f29117j) {
            da();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        y0<Boolean> y0Var;
        y0<Boolean> y0Var2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_edit_intervals);
        initActionBar(true, getString(R.string.lbl_intervals));
        Intent intent = getIntent();
        this.f29116i = (p) a2.c(intent != null ? intent.getExtras() : null, "GCM_extra_activity_splits");
        this.f29118k = getIntent().getBooleanExtra("RUNNING_ACTIVITY", false);
        Intent intent2 = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent2 != null ? intent2.getSerializableExtra("GCM_extra_activity_type", x0.class) : null;
        } else {
            Serializable serializableExtra2 = intent2 != null ? intent2.getSerializableExtra("GCM_extra_activity_type") : null;
            if (!(serializableExtra2 instanceof x0)) {
                serializableExtra2 = null;
            }
            serializableExtra = (x0) serializableExtra2;
        }
        serializableExtra.getClass();
        this.f29119l = (x0) serializableExtra;
        if (this.f29116i == null) {
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.save_layout);
        viewFindViewById.getClass();
        this.f29112e = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.save_button);
        viewFindViewById2.getClass();
        this.f29113f = (AppCompatButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.cancel);
        viewFindViewById3.getClass();
        this.f29114g = (AppCompatButton) viewFindViewById3;
        this.f29111d = new LinearLayoutManager(this);
        this.f29110c = new g(j0.f134944a, false, new kk1.h(this, 3), 2, null);
        View viewFindViewById4 = findViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = this.f29111d;
        if (linearLayoutManager == null) {
            s.m("viewManager");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        g gVar = this.f29110c;
        if (gVar == null) {
            s.m("viewAdapter");
            throw null;
        }
        recyclerView.setAdapter(gVar);
        viewFindViewById4.getClass();
        AppCompatButton appCompatButton = this.f29113f;
        if (appCompatButton == null) {
            s.m("saveButton");
            throw null;
        }
        final int i14 = 0;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: ko.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivitiesEditIntervalsActivity f105699b;

            {
                this.f105699b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        j jVar = this.f105699b.f29115h;
                        if (jVar != null) {
                            w0<m<Object>> w0Var = jVar.f105733d;
                            HashMap<Integer, String> map = jVar.f105739j;
                            if (s.g(map, jVar.f105738i)) {
                                w0Var.m(m.a.g(m.f73767e, null, 3));
                            } else {
                                ArrayList arrayList = new ArrayList(map.size());
                                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                    int iIntValue = entry.getKey().intValue();
                                    String value = entry.getValue();
                                    if (s.g(value, "WALK")) {
                                        qs.n nVar = jVar.f105740k.get(Integer.valueOf(iIntValue));
                                        String strName = nVar != null ? nVar.name() : null;
                                        if (strName != null) {
                                            switch (strName) {
                                                case "WARMUP":
                                                    value = "WARMUP_WALK";
                                                    break;
                                                case "RECOVERY":
                                                    value = "RECOVERY_WALK";
                                                    break;
                                                case "REST":
                                                    value = "REST_WALK";
                                                    break;
                                                case "COOLDOWN":
                                                    value = "COOLDOWN_WALK";
                                                    break;
                                                default:
                                                    value = "OTHER_WALK";
                                                    break;
                                            }
                                        } else {
                                            value = "OTHER_WALK";
                                        }
                                    }
                                    arrayList.add(new x(Integer.valueOf(iIntValue), value));
                                }
                                arrayList.toString();
                                cw.a aVarM = cw.a.M();
                                long activityId = jVar.f105731b.getActivityId();
                                n0 n0Var = new n0(arrayList);
                                aVarM.getClass();
                                w0 w0VarK = new dm.d(activityId, n0Var).k();
                                w0VarK.getClass();
                                w0Var.n(w0VarK, new j.b(new iz1.f(jVar, 29)));
                            }
                        }
                        break;
                    default:
                        ActivitiesEditIntervalsActivity activitiesEditIntervalsActivity = this.f105699b;
                        if (activitiesEditIntervalsActivity.f29117j) {
                            activitiesEditIntervalsActivity.da();
                        }
                        break;
                }
            }
        });
        AppCompatButton appCompatButton2 = this.f29114g;
        if (appCompatButton2 == null) {
            s.m("cancelButton");
            throw null;
        }
        final int i15 = 1;
        appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ko.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivitiesEditIntervalsActivity f105699b;

            {
                this.f105699b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        j jVar = this.f105699b.f29115h;
                        if (jVar != null) {
                            w0<m<Object>> w0Var = jVar.f105733d;
                            HashMap<Integer, String> map = jVar.f105739j;
                            if (s.g(map, jVar.f105738i)) {
                                w0Var.m(m.a.g(m.f73767e, null, 3));
                            } else {
                                ArrayList arrayList = new ArrayList(map.size());
                                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                    int iIntValue = entry.getKey().intValue();
                                    String value = entry.getValue();
                                    if (s.g(value, "WALK")) {
                                        qs.n nVar = jVar.f105740k.get(Integer.valueOf(iIntValue));
                                        String strName = nVar != null ? nVar.name() : null;
                                        if (strName != null) {
                                            switch (strName) {
                                                case "WARMUP":
                                                    value = "WARMUP_WALK";
                                                    break;
                                                case "RECOVERY":
                                                    value = "RECOVERY_WALK";
                                                    break;
                                                case "REST":
                                                    value = "REST_WALK";
                                                    break;
                                                case "COOLDOWN":
                                                    value = "COOLDOWN_WALK";
                                                    break;
                                                default:
                                                    value = "OTHER_WALK";
                                                    break;
                                            }
                                        } else {
                                            value = "OTHER_WALK";
                                        }
                                    }
                                    arrayList.add(new x(Integer.valueOf(iIntValue), value));
                                }
                                arrayList.toString();
                                cw.a aVarM = cw.a.M();
                                long activityId = jVar.f105731b.getActivityId();
                                n0 n0Var = new n0(arrayList);
                                aVarM.getClass();
                                w0 w0VarK = new dm.d(activityId, n0Var).k();
                                w0VarK.getClass();
                                w0Var.n(w0VarK, new j.b(new iz1.f(jVar, 29)));
                            }
                        }
                        break;
                    default:
                        ActivitiesEditIntervalsActivity activitiesEditIntervalsActivity = this.f105699b;
                        if (activitiesEditIntervalsActivity.f29117j) {
                            activitiesEditIntervalsActivity.da();
                        }
                        break;
                }
            }
        });
        p pVar = this.f29116i;
        ko.h hVar = new ko.h(new l22.a(this), this.f29118k);
        x0 x0Var = this.f29119l;
        pVar.getClass();
        j jVar = (j) new x1(this, new k(x0Var, pVar, hVar)).b(s0.f105811a.b(j.class));
        this.f29115h = jVar;
        w0<m<Object>> w0Var = jVar.f105733d;
        if (w0Var != null) {
            final int i16 = 0;
            w0Var.f(this, new c(new l(this) { // from class: ko.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ActivitiesEditIntervalsActivity f105701b;

                {
                    this.f105701b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i17 = i16;
                    boolean z14 = true;
                    ActivitiesEditIntervalsActivity activitiesEditIntervalsActivity = this.f105701b;
                    switch (i17) {
                        case 0:
                            int i18 = ActivitiesEditIntervalsActivity.f29107m;
                            int i19 = ActivitiesEditIntervalsActivity.b.f29120a[((m) obj).f73769b.ordinal()];
                            if (i19 == 1) {
                                activitiesEditIntervalsActivity.showProgressOverlay();
                            } else if (i19 == 2) {
                                activitiesEditIntervalsActivity.hideProgressOverlay();
                                activitiesEditIntervalsActivity.f29117j = false;
                                Intent intent3 = new Intent();
                                intent3.putExtra("GCM_extra_activity_splits", activitiesEditIntervalsActivity.f29116i);
                                activitiesEditIntervalsActivity.setResult(-1, intent3);
                                activitiesEditIntervalsActivity.finish();
                            } else {
                                if (i19 != 3) {
                                    u0.r();
                                    return null;
                                }
                                activitiesEditIntervalsActivity.hideProgressOverlay();
                                g1.b(activitiesEditIntervalsActivity, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                            }
                            return Unit.INSTANCE;
                        case 1:
                            o13.p pVar2 = (o13.p) obj;
                            int i24 = ActivitiesEditIntervalsActivity.f29107m;
                            if (((Boolean) pVar2.f128594a).booleanValue()) {
                                LinearLayout linearLayout = activitiesEditIntervalsActivity.f29112e;
                                if (linearLayout == null) {
                                    s.m("saveLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(0);
                                activitiesEditIntervalsActivity.ca(R.color.gcm_toolbar_background);
                                g gVar2 = activitiesEditIntervalsActivity.f29110c;
                                if (gVar2 == null) {
                                    s.m("viewAdapter");
                                    throw null;
                                }
                                gVar2.f105718b = true;
                            }
                            g gVar3 = activitiesEditIntervalsActivity.f29110c;
                            if (gVar3 == null) {
                                s.m("viewAdapter");
                                throw null;
                            }
                            List<e> list = (List) pVar2.f128595b;
                            list.getClass();
                            gVar3.f105717a = list;
                            g gVar4 = activitiesEditIntervalsActivity.f29110c;
                            if (gVar4 != null) {
                                gVar4.notifyDataSetChanged();
                                return Unit.INSTANCE;
                            }
                            s.m("viewAdapter");
                            throw null;
                        case 2:
                            int i25 = ActivitiesEditIntervalsActivity.f29107m;
                            if (((Boolean) obj).booleanValue()) {
                                com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a.f29122c.getClass();
                                com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a aVar = new com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a();
                                aVar.setCancelable(false);
                                aVar.show(activitiesEditIntervalsActivity.getSupportFragmentManager(), aVar.getTag());
                            }
                            return Unit.INSTANCE;
                        default:
                            int i26 = ActivitiesEditIntervalsActivity.f29107m;
                            if (((Boolean) obj).booleanValue()) {
                                activitiesEditIntervalsActivity.ca(R.color.gcm_toolbar_background);
                                z14 = false;
                            } else {
                                activitiesEditIntervalsActivity.ca(R.color.gcm_surface_3);
                            }
                            activitiesEditIntervalsActivity.f29109b = z14;
                            activitiesEditIntervalsActivity.invalidateOptionsMenu();
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        final j jVar2 = this.f29115h;
        if (jVar2 != null) {
            final w0 w0Var2 = new w0();
            final int i17 = 0;
            w0Var2.n(jVar2.f105736g, new j.b(new l() { // from class: ko.i
                @Override // e23.l
                public final Object invoke(Object obj) {
                    switch (i17) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            List<e> listD = jVar2.f105737h.d();
                            if (listD == null) {
                                listD = j0.f134944a;
                            }
                            w0Var2.m(new o13.p(bool, listD));
                            break;
                        default:
                            List list = (List) obj;
                            Boolean boolD = jVar2.f105736g.d();
                            w0Var2.m(new o13.p(Boolean.valueOf(boolD != null ? boolD.booleanValue() : false), list));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
            final int i18 = 1;
            w0Var2.n(jVar2.f105737h, new j.b(new l() { // from class: ko.i
                @Override // e23.l
                public final Object invoke(Object obj) {
                    switch (i18) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            List<e> listD = jVar2.f105737h.d();
                            if (listD == null) {
                                listD = j0.f134944a;
                            }
                            w0Var2.m(new o13.p(bool, listD));
                            break;
                        default:
                            List list = (List) obj;
                            Boolean boolD = jVar2.f105736g.d();
                            w0Var2.m(new o13.p(Boolean.valueOf(boolD != null ? boolD.booleanValue() : false), list));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
            final int i19 = 1;
            w0Var2.f(this, new c(new l(this) { // from class: ko.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ActivitiesEditIntervalsActivity f105701b;

                {
                    this.f105701b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i110 = i19;
                    boolean z14 = true;
                    ActivitiesEditIntervalsActivity activitiesEditIntervalsActivity = this.f105701b;
                    switch (i110) {
                        case 0:
                            int i111 = ActivitiesEditIntervalsActivity.f29107m;
                            int i112 = ActivitiesEditIntervalsActivity.b.f29120a[((m) obj).f73769b.ordinal()];
                            if (i112 == 1) {
                                activitiesEditIntervalsActivity.showProgressOverlay();
                            } else if (i112 == 2) {
                                activitiesEditIntervalsActivity.hideProgressOverlay();
                                activitiesEditIntervalsActivity.f29117j = false;
                                Intent intent3 = new Intent();
                                intent3.putExtra("GCM_extra_activity_splits", activitiesEditIntervalsActivity.f29116i);
                                activitiesEditIntervalsActivity.setResult(-1, intent3);
                                activitiesEditIntervalsActivity.finish();
                            } else {
                                if (i112 != 3) {
                                    u0.r();
                                    return null;
                                }
                                activitiesEditIntervalsActivity.hideProgressOverlay();
                                g1.b(activitiesEditIntervalsActivity, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                            }
                            return Unit.INSTANCE;
                        case 1:
                            o13.p pVar2 = (o13.p) obj;
                            int i24 = ActivitiesEditIntervalsActivity.f29107m;
                            if (((Boolean) pVar2.f128594a).booleanValue()) {
                                LinearLayout linearLayout = activitiesEditIntervalsActivity.f29112e;
                                if (linearLayout == null) {
                                    s.m("saveLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(0);
                                activitiesEditIntervalsActivity.ca(R.color.gcm_toolbar_background);
                                g gVar2 = activitiesEditIntervalsActivity.f29110c;
                                if (gVar2 == null) {
                                    s.m("viewAdapter");
                                    throw null;
                                }
                                gVar2.f105718b = true;
                            }
                            g gVar3 = activitiesEditIntervalsActivity.f29110c;
                            if (gVar3 == null) {
                                s.m("viewAdapter");
                                throw null;
                            }
                            List<e> list = (List) pVar2.f128595b;
                            list.getClass();
                            gVar3.f105717a = list;
                            g gVar4 = activitiesEditIntervalsActivity.f29110c;
                            if (gVar4 != null) {
                                gVar4.notifyDataSetChanged();
                                return Unit.INSTANCE;
                            }
                            s.m("viewAdapter");
                            throw null;
                        case 2:
                            int i25 = ActivitiesEditIntervalsActivity.f29107m;
                            if (((Boolean) obj).booleanValue()) {
                                com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a.f29122c.getClass();
                                com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a aVar = new com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a();
                                aVar.setCancelable(false);
                                aVar.show(activitiesEditIntervalsActivity.getSupportFragmentManager(), aVar.getTag());
                            }
                            return Unit.INSTANCE;
                        default:
                            int i26 = ActivitiesEditIntervalsActivity.f29107m;
                            if (((Boolean) obj).booleanValue()) {
                                activitiesEditIntervalsActivity.ca(R.color.gcm_toolbar_background);
                                z14 = false;
                            } else {
                                activitiesEditIntervalsActivity.ca(R.color.gcm_surface_3);
                            }
                            activitiesEditIntervalsActivity.f29109b = z14;
                            activitiesEditIntervalsActivity.invalidateOptionsMenu();
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        j jVar3 = this.f29115h;
        if (jVar3 != null && (y0Var2 = jVar3.f105734e) != null) {
            final int i24 = 2;
            y0Var2.f(this, new c(new l(this) { // from class: ko.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ActivitiesEditIntervalsActivity f105701b;

                {
                    this.f105701b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i110 = i24;
                    boolean z14 = true;
                    ActivitiesEditIntervalsActivity activitiesEditIntervalsActivity = this.f105701b;
                    switch (i110) {
                        case 0:
                            int i111 = ActivitiesEditIntervalsActivity.f29107m;
                            int i112 = ActivitiesEditIntervalsActivity.b.f29120a[((m) obj).f73769b.ordinal()];
                            if (i112 == 1) {
                                activitiesEditIntervalsActivity.showProgressOverlay();
                            } else if (i112 == 2) {
                                activitiesEditIntervalsActivity.hideProgressOverlay();
                                activitiesEditIntervalsActivity.f29117j = false;
                                Intent intent3 = new Intent();
                                intent3.putExtra("GCM_extra_activity_splits", activitiesEditIntervalsActivity.f29116i);
                                activitiesEditIntervalsActivity.setResult(-1, intent3);
                                activitiesEditIntervalsActivity.finish();
                            } else {
                                if (i112 != 3) {
                                    u0.r();
                                    return null;
                                }
                                activitiesEditIntervalsActivity.hideProgressOverlay();
                                g1.b(activitiesEditIntervalsActivity, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                            }
                            return Unit.INSTANCE;
                        case 1:
                            o13.p pVar2 = (o13.p) obj;
                            int i25 = ActivitiesEditIntervalsActivity.f29107m;
                            if (((Boolean) pVar2.f128594a).booleanValue()) {
                                LinearLayout linearLayout = activitiesEditIntervalsActivity.f29112e;
                                if (linearLayout == null) {
                                    s.m("saveLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(0);
                                activitiesEditIntervalsActivity.ca(R.color.gcm_toolbar_background);
                                g gVar2 = activitiesEditIntervalsActivity.f29110c;
                                if (gVar2 == null) {
                                    s.m("viewAdapter");
                                    throw null;
                                }
                                gVar2.f105718b = true;
                            }
                            g gVar3 = activitiesEditIntervalsActivity.f29110c;
                            if (gVar3 == null) {
                                s.m("viewAdapter");
                                throw null;
                            }
                            List<e> list = (List) pVar2.f128595b;
                            list.getClass();
                            gVar3.f105717a = list;
                            g gVar4 = activitiesEditIntervalsActivity.f29110c;
                            if (gVar4 != null) {
                                gVar4.notifyDataSetChanged();
                                return Unit.INSTANCE;
                            }
                            s.m("viewAdapter");
                            throw null;
                        case 2:
                            int i26 = ActivitiesEditIntervalsActivity.f29107m;
                            if (((Boolean) obj).booleanValue()) {
                                com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a.f29122c.getClass();
                                com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a aVar = new com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a();
                                aVar.setCancelable(false);
                                aVar.show(activitiesEditIntervalsActivity.getSupportFragmentManager(), aVar.getTag());
                            }
                            return Unit.INSTANCE;
                        default:
                            int i27 = ActivitiesEditIntervalsActivity.f29107m;
                            if (((Boolean) obj).booleanValue()) {
                                activitiesEditIntervalsActivity.ca(R.color.gcm_toolbar_background);
                                z14 = false;
                            } else {
                                activitiesEditIntervalsActivity.ca(R.color.gcm_surface_3);
                            }
                            activitiesEditIntervalsActivity.f29109b = z14;
                            activitiesEditIntervalsActivity.invalidateOptionsMenu();
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        j jVar4 = this.f29115h;
        if (jVar4 == null || (y0Var = jVar4.f105735f) == null) {
            return;
        }
        final int i25 = 3;
        y0Var.f(this, new c(new l(this) { // from class: ko.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivitiesEditIntervalsActivity f105701b;

            {
                this.f105701b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i110 = i25;
                boolean z14 = true;
                ActivitiesEditIntervalsActivity activitiesEditIntervalsActivity = this.f105701b;
                switch (i110) {
                    case 0:
                        int i111 = ActivitiesEditIntervalsActivity.f29107m;
                        int i112 = ActivitiesEditIntervalsActivity.b.f29120a[((m) obj).f73769b.ordinal()];
                        if (i112 == 1) {
                            activitiesEditIntervalsActivity.showProgressOverlay();
                        } else if (i112 == 2) {
                            activitiesEditIntervalsActivity.hideProgressOverlay();
                            activitiesEditIntervalsActivity.f29117j = false;
                            Intent intent3 = new Intent();
                            intent3.putExtra("GCM_extra_activity_splits", activitiesEditIntervalsActivity.f29116i);
                            activitiesEditIntervalsActivity.setResult(-1, intent3);
                            activitiesEditIntervalsActivity.finish();
                        } else {
                            if (i112 != 3) {
                                u0.r();
                                return null;
                            }
                            activitiesEditIntervalsActivity.hideProgressOverlay();
                            g1.b(activitiesEditIntervalsActivity, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        o13.p pVar2 = (o13.p) obj;
                        int i26 = ActivitiesEditIntervalsActivity.f29107m;
                        if (((Boolean) pVar2.f128594a).booleanValue()) {
                            LinearLayout linearLayout = activitiesEditIntervalsActivity.f29112e;
                            if (linearLayout == null) {
                                s.m("saveLayout");
                                throw null;
                            }
                            linearLayout.setVisibility(0);
                            activitiesEditIntervalsActivity.ca(R.color.gcm_toolbar_background);
                            g gVar2 = activitiesEditIntervalsActivity.f29110c;
                            if (gVar2 == null) {
                                s.m("viewAdapter");
                                throw null;
                            }
                            gVar2.f105718b = true;
                        }
                        g gVar3 = activitiesEditIntervalsActivity.f29110c;
                        if (gVar3 == null) {
                            s.m("viewAdapter");
                            throw null;
                        }
                        List<e> list = (List) pVar2.f128595b;
                        list.getClass();
                        gVar3.f105717a = list;
                        g gVar4 = activitiesEditIntervalsActivity.f29110c;
                        if (gVar4 != null) {
                            gVar4.notifyDataSetChanged();
                            return Unit.INSTANCE;
                        }
                        s.m("viewAdapter");
                        throw null;
                    case 2:
                        int i27 = ActivitiesEditIntervalsActivity.f29107m;
                        if (((Boolean) obj).booleanValue()) {
                            com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a.f29122c.getClass();
                            com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a aVar = new com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a();
                            aVar.setCancelable(false);
                            aVar.show(activitiesEditIntervalsActivity.getSupportFragmentManager(), aVar.getTag());
                        }
                        return Unit.INSTANCE;
                    default:
                        int i28 = ActivitiesEditIntervalsActivity.f29107m;
                        if (((Boolean) obj).booleanValue()) {
                            activitiesEditIntervalsActivity.ca(R.color.gcm_toolbar_background);
                            z14 = false;
                        } else {
                            activitiesEditIntervalsActivity.ca(R.color.gcm_surface_3);
                        }
                        activitiesEditIntervalsActivity.f29109b = z14;
                        activitiesEditIntervalsActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit, menu);
        MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.menu_item_edit_done) : null;
        this.f29108a = menuItemFindItem;
        if (menuItemFindItem != null) {
            menuItemFindItem.setTitle(getString(R.string.lbl_change));
        }
        MenuItem menuItem = this.f29108a;
        if (menuItem == null) {
            return true;
        }
        menuItem.setEnabled(this.f29109b);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_edit_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        j jVar = this.f29115h;
        if (jVar == null) {
            return true;
        }
        jVar.f105734e.m(Boolean.TRUE);
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/intensityintervalsediting/ActivitiesEditIntervalsActivity$a;", "", "<init>", "()V", "", "REQUEST_CODE", "I", "", "RUNNING_ACTIVITY", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
