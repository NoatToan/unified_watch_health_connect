package com.garmin.android.apps.connectmobile.activities.advancedactivityediting;

import am.x0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import bm.a0;
import c22.g2;
import c22.l3;
import c22.m3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.ActivitiesTrimActivity;
import com.garmin.android.apps.connectmobile.activities.newmodel.i0;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.q1;
import e23.l;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o13.m;
import o13.n;
import o13.u;
import org.apache.commons.lang3.StringUtils;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.b1;
import p3.c2;
import p3.p0;
import ps.a1;
import ps.p;
import ps.x1;
import qs.x;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/ActivitiesTrimActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivitiesTrimActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f28809p = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ComposeView f28811b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f28818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f28819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f28820k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f28821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f28822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f28823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28824o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28810a = m.a(n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f28812c = p0.n("");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f28813d = p0.n("");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f28814e = p0.n("");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f28815f = p0.n("");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f28816g = p0.n("");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c2 f28817h = p0.n("");

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/ActivitiesTrimActivity$b;", "Landroidx/fragment/app/e0;", "Landroidx/fragment/app/v;", "supportFragmentManager", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/ActivitiesTrimActivity;Landroidx/fragment/app/v;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends e0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ActivitiesTrimActivity f28825h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ActivitiesTrimActivity activitiesTrimActivity, v vVar) {
            super(vVar);
            vVar.getClass();
            this.f28825h = activitiesTrimActivity;
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF44034e() {
            return 2;
        }

        @Override // androidx.fragment.app.e0
        public final Fragment getItem(int i14) {
            if (i14 == 0) {
                f.f28907h.getClass();
                return new f();
            }
            e.f28888i.getClass();
            return new e();
        }

        @Override // fe.a
        public final CharSequence getPageTitle(int i14) {
            ActivitiesTrimActivity activitiesTrimActivity = this.f28825h;
            return i14 == 0 ? activitiesTrimActivity.getString(R.string.lbl_time) : activitiesTrimActivity.getString(R.string.lbl_distance);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f28826a;

        public c(l lVar) {
            lVar.getClass();
            this.f28826a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f28826a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28826a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f28827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f28828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f28829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f28830d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f28827a = gVar;
            this.f28828b = qualifier;
            this.f28829c = aVar;
            this.f28830d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f28827a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f28829c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.class), viewModelStore, null, defaultViewModelCreationExtras, this.f28828b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f28830d, 4, null);
        }
    }

    public ActivitiesTrimActivity() {
        this.f28820k = !mg0.b.c() ? R.string.lbl_miles : R.string.lbl_kilometers;
        this.f28821l = q2.a(Boolean.FALSE);
        this.f28822m = q2.a(new u(null, null, null));
    }

    public static void da(final ActivitiesTrimActivity activitiesTrimActivity, int i14, int i15, int i16) {
        final boolean z14 = (i16 & 4) == 0;
        final boolean z15 = (i16 & 8) == 0;
        activitiesTrimActivity.f28824o = false;
        activitiesTrimActivity.hideProgressOverlay();
        u20.e eVarU6 = u20.e.u6(i14, i15);
        eVarU6.f167882a = new DialogInterface.OnClickListener() { // from class: bm.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                ActivitiesTrimActivity.a aVar = ActivitiesTrimActivity.f28809p;
                boolean z16 = z14;
                ActivitiesTrimActivity activitiesTrimActivity2 = activitiesTrimActivity;
                if (z16) {
                    activitiesTrimActivity2.setResult(0);
                    activitiesTrimActivity2.finish();
                } else {
                    if (z15) {
                        return;
                    }
                    activitiesTrimActivity2.fa();
                }
            }
        };
        eVarU6.g(activitiesTrimActivity.getSupportFragmentManager());
    }

    public final void ca() {
        Set<String> setE;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = ga().f28869g;
        String strValueOf = hVar != null ? String.valueOf(hVar.f29448a) : null;
        if (strValueOf != null) {
            SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.aae_trimmed_or_edited_legs_activity_set_key), 0);
            Set<String> stringSet = sharedPreferences.getStringSet(getString(R.string.aae_trimmed_activity_list_key), null);
            if (stringSet == null) {
                setE = b1.e(strValueOf);
            } else {
                HashSet hashSet = new HashSet(stringSet);
                hashSet.add(strValueOf);
                setE = hashSet;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putStringSet(getString(R.string.aae_trimmed_activity_list_key), setE);
            editorEdit.apply();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final void displayErrorBannerNoInternetConnection() {
        super.displayErrorBannerNoInternetConnection();
        Button button = this.f28818i;
        if (button != null) {
            button.setEnabled(false);
        } else {
            s.m("mSaveButton");
            throw null;
        }
    }

    public final void ea() {
        boolean zC4 = ga().C4();
        Button button = this.f28818i;
        if (button == null) {
            s.m("mSaveButton");
            throw null;
        }
        button.setEnabled(zC4);
        Button button2 = this.f28819j;
        if (button2 == null) {
            s.m("mResetButton");
            throw null;
        }
        button2.setEnabled(zC4);
        ja(ga().f28869g, ga().f28870h);
    }

    public final void fa() {
        setResult(-1);
        finish();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d ga() {
        return (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) this.f28810a.getValue();
    }

    public final void ha() {
        x0 x0VarC;
        if (!ga().H4()) {
            fa();
            return;
        }
        String str = null;
        if (this.f28823n) {
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = ga().f28869g;
            if (hVar != null && (x0VarC = hVar.C()) != null) {
                str = x0VarC.f4358a;
            }
            if (am.z0.H(str)) {
                fa();
                return;
            } else {
                da(this, R.string.activities_trim_in_progress, R.string.activities_trim_in_progress_message, 12);
                return;
            }
        }
        if (this.f28824o) {
            ca();
            fa();
            return;
        }
        if (!ga().C4()) {
            fa();
            return;
        }
        if (!ga().C4()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "TrimActivityCancel");
            finish();
            return;
        }
        q1.b bVar = q1.f41066b;
        String string = getString(R.string.message_common_confirm_leaving_screen);
        string.getClass();
        String string2 = getString(R.string.activities_cancel_delete);
        string2.getClass();
        bm.c cVar = new bm.c(this, 2);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, string2, R.string.lbl_common_continue, R.string.lbl_cancel, cVar);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final void hideStatusBanner() {
        super.hideStatusBanner();
        ea();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public final void ia() {
        boolean z14;
        String string;
        if (bo1.a.a().c().H0()) {
            bv.b.f21239a.getClass();
            bv.b.a();
            if (k1.f37122a.D()) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        q1.b bVar = q1.f41066b;
        String string2 = getString(R.string.lbl_save_changes);
        string2.getClass();
        if (z14) {
            c22.x0.f23314a.getClass();
            String str = c22.x0.f23613rd;
            str.getClass();
            string = g2.f(str);
        } else {
            string = getString(R.string.activities_save_changes_message);
            string.getClass();
        }
        bm.c cVar = new bm.c(this, 1);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string2, string, R.string.lbl_save, R.string.lbl_cancel, cVar);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    public final void ja(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, p pVar) {
        x1 x1Var;
        p2 p2Var;
        Object value;
        boolean z14;
        String str;
        String string;
        p2 p2Var2;
        Object value2;
        DecimalFormat decimalFormat;
        x0 x0VarC;
        List<x1> listI;
        Object next;
        a1 a1Var;
        Boolean isActivityTrimmed = (hVar == null || (a1Var = hVar.f29459l) == null) ? null : a1Var.getIsActivityTrimmed();
        if (pVar == null || (listI = pVar.i()) == null) {
            x1Var = null;
        } else {
            Iterator<T> it = listI.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((x1) next).a2() != x.PROVISIONAL_END);
            x1Var = (x1) next;
        }
        do {
            p2Var = this.f28821l;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
            if (s.g(isActivityTrimmed, Boolean.TRUE) || x1Var == null || ga().C4()) {
                z14 = false;
            } else {
                ga().getClass();
                if (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.G4()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
        } while (!p2Var.b(value, Boolean.valueOf(z14)));
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        l22.a aVar = new l22.a(applicationContext);
        if (hVar == null || (x0VarC = hVar.C()) == null || (str = x0VarC.f4358a) == null) {
            str = x0.f4304m.f4358a;
        }
        Double distance = x1Var != null ? x1Var.getDistance() : null;
        str.getClass();
        if (distance == null || Double.isNaN(distance.doubleValue())) {
            string = null;
        } else {
            m3 m3VarB = ar.b.b(am.z0.m(str), null);
            m3VarB.getClass();
            StringBuilder sb3 = new StringBuilder();
            m3 m3Var = m3.METER;
            if (p13.u.z(new m3[]{m3Var, m3.FOOT}, m3VarB)) {
                l3.f23124b.getClass();
                decimalFormat = l3.f23131i;
            } else {
                decimalFormat = l3.f23129g;
            }
            l3.a aVar2 = l3.f23124b;
            double dDoubleValue = distance.doubleValue();
            aVar2.getClass();
            sb3.append(decimalFormat.format(l3.a.g(dDoubleValue, m3Var, m3VarB)).toString());
            sb3.append(StringUtils.SPACE);
            sb3.append(aVar.getString(m3VarB.f23164e));
            string = sb3.toString();
        }
        String strW = wq.f.w(x1Var != null ? x1Var.getDuration() : null);
        do {
            p2Var2 = this.f28822m;
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, new u(string, strW, x1Var != null ? x1Var.getDistance() : null)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ha();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        Parcelable parcelable;
        m3 m3Var;
        x0 x0VarC;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_trim_activities);
        int i14 = 3;
        initActionBar(R.string.activities_trim_activity, 3);
        ht.a.f85464a.getClass();
        ht.a.a(null, "AdvancedActivityEditing");
        showProgressOverlay();
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa = ga();
        ((y0) dVarGa.f28879q.getValue()).f(this, new c(new bm.a(this, 4)));
        ((y0) dVarGa.f28885y.getValue()).f(this, new c(new bm.a(this, 5)));
        final int i15 = 0;
        ((y0) dVarGa.f28878p.getValue()).f(this, new c(new bm.a(this, i15)));
        final int i16 = 1;
        ((y0) dVarGa.f28877o.getValue()).f(this, new c(new bm.a(this, i16)));
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) bundleA.getParcelable("GCM_extra_activity_summary", com.garmin.android.apps.connectmobile.activities.newmodel.h.class);
            } else {
                Parcelable parcelable3 = bundleA.getParcelable("GCM_extra_activity_summary");
                if (!(parcelable3 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.h)) {
                    parcelable3 = null;
                }
                parcelable2 = (com.garmin.android.apps.connectmobile.activities.newmodel.h) parcelable3;
            }
            hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) parcelable2;
        } else {
            hVar = null;
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = hVar != null ? hVar : null;
        if (hVar2 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundleA != null ? (Parcelable) bundleA.getParcelable("GCM_extra_activity_splits", p.class) : null;
        } else {
            Parcelable parcelable4 = bundleA != null ? bundleA.getParcelable("GCM_extra_activity_splits") : null;
            if (!(parcelable4 instanceof p)) {
                parcelable4 = null;
            }
            parcelable = (p) parcelable4;
        }
        p pVar = (p) parcelable;
        boolean z14 = bundleA.getBoolean("GCM_extra_has_trim_time_fragment", false);
        boolean z15 = bundleA.getBoolean("GCM_extra_has_trim_distance_fragment", false);
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa2 = ga();
        dVarGa2.getClass();
        dVarGa2.f28869g = hVar2;
        dVarGa2.f28870h = pVar;
        if (am.z0.H(hVar2.C().f4358a)) {
            long j8 = hVar2.f29448a;
            w9.a aVarA = v1.a(dVarGa2);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new a0(dVarGa2, j8, null), 2);
        }
        String string = getString(R.string.lbl_time);
        string.getClass();
        this.f28814e.setValue(string);
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = ga().f28869g;
        if (am.z0.b(x0.I0, (hVar3 == null || (x0VarC = hVar3.C()) == null) ? null : x0VarC.f4358a)) {
            m3Var = m3.METER;
        } else {
            m3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
        }
        String string2 = getString(R.string.chart_distance_title, getString(m3Var.f23164e));
        string2.getClass();
        this.f28816g.setValue(string2);
        i0 i0Var = hVar2.f29460m;
        if (i0Var != null) {
            q3 q3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
            l3.a aVar2 = l3.f23124b;
            double d14 = i0Var.f29538p;
            DecimalFormat decimalFormat = l3.f23129g;
            aVar2.getClass();
            this.f28813d.setValue(l3.a.L0(d14, q3Var, decimalFormat));
        }
        View viewFindViewById = findViewById(R.id.trim_activity_preview_section);
        viewFindViewById.getClass();
        this.f28811b = (ComposeView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.trim_activity_save_button);
        viewFindViewById2.getClass();
        this.f28818i = (Button) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.trim_activity_reset_button);
        viewFindViewById3.getClass();
        this.f28819j = (Button) viewFindViewById3;
        ComposeView composeView = this.f28811b;
        if (composeView == null) {
            s.m("mTrimActivityPreview");
            throw null;
        }
        composeView.setContent(new z3.e(817641714, true, new bm.b(this, i14)));
        View viewFindViewById4 = findViewById(R.id.provisional_endpoint_banner);
        viewFindViewById4.getClass();
        ((ComposeView) viewFindViewById4).setContent(new z3.e(-1795138877, true, new bm.b(this, i15)));
        Button button = this.f28818i;
        if (button == null) {
            s.m("mSaveButton");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: bm.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivitiesTrimActivity f18802b;

            {
                this.f18802b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x0 x0VarC2;
                int i17 = i15;
                String str = null;
                ActivitiesTrimActivity activitiesTrimActivity = this.f18802b;
                switch (i17) {
                    case 0:
                        ActivitiesTrimActivity.a aVar3 = ActivitiesTrimActivity.f28809p;
                        if (activitiesTrimActivity.hasInternetConnection()) {
                            if (activitiesTrimActivity.ga().H4()) {
                                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa3 = activitiesTrimActivity.ga();
                                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar4 = dVarGa3.f28869g;
                                if (hVar4 != null && (x0VarC2 = hVar4.C()) != null) {
                                    str = x0VarC2.f4358a;
                                }
                                if (am.z0.H(str)) {
                                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START;
                                    n nVar = n.SUM_DURATION_TO_TIME_STAMP;
                                    Double dA4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.A4(dVarGa3, "SUMDURATION", bVar, null, nVar, null, 16);
                                    long jDoubleValue = dA4 != null ? (long) dA4.doubleValue() : 0L;
                                    Double dA5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.A4(dVarGa3, "SUMDURATION", com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END, null, nVar, null, 16);
                                    long jDoubleValue2 = dA5 != null ? (long) dA5.doubleValue() : 0L;
                                    yo.w wVar = dVarGa3.D;
                                    if (wVar != null) {
                                        List<yo.c> listA = wVar.f().getReconstruct().a();
                                        List<yo.c> listA2 = wVar.f().getReconstruct().a();
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : listA2) {
                                            yo.c cVar2 = (yo.c) obj;
                                            long startTime = cVar2.getStartTime();
                                            if (jDoubleValue > startTime || startTime > jDoubleValue2) {
                                                long endTime = cVar2.getEndTime();
                                                if (jDoubleValue > endTime || endTime > jDoubleValue2) {
                                                }
                                            }
                                            arrayList.add(obj);
                                        }
                                        if (listA.size() != arrayList.size()) {
                                            q1.b bVar2 = q1.f41066b;
                                            String string3 = activitiesTrimActivity.getString(R.string.remove_leg_title);
                                            string3.getClass();
                                            String string4 = activitiesTrimActivity.getString(R.string.remove_leg_description);
                                            string4.getClass();
                                            c cVar3 = new c(activitiesTrimActivity, 0);
                                            bVar2.getClass();
                                            q1 q1VarC = q1.b.c(string3, string4, R.string.lbl_delete, R.string.lbl_cancel, cVar3);
                                            androidx.fragment.app.v supportFragmentManager = activitiesTrimActivity.getSupportFragmentManager();
                                            supportFragmentManager.getClass();
                                            q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
                                        }
                                    }
                                }
                                activitiesTrimActivity.ia();
                            } else {
                                ActivitiesTrimActivity.da(activitiesTrimActivity, R.string.multisport_edit_leg_blocked_title, R.string.multisport_edit_leg_blocked_message, 4);
                                activitiesTrimActivity.ga().I4(activitiesTrimActivity);
                            }
                        }
                        break;
                    default:
                        ActivitiesTrimActivity.a aVar4 = ActivitiesTrimActivity.f28809p;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "TrimActivityReset");
                        activitiesTrimActivity.ga().I4(activitiesTrimActivity);
                        break;
                }
            }
        });
        Button button2 = this.f28819j;
        if (button2 == null) {
            s.m("mResetButton");
            throw null;
        }
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: bm.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivitiesTrimActivity f18802b;

            {
                this.f18802b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x0 x0VarC2;
                int i17 = i16;
                String str = null;
                ActivitiesTrimActivity activitiesTrimActivity = this.f18802b;
                switch (i17) {
                    case 0:
                        ActivitiesTrimActivity.a aVar3 = ActivitiesTrimActivity.f28809p;
                        if (activitiesTrimActivity.hasInternetConnection()) {
                            if (activitiesTrimActivity.ga().H4()) {
                                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa3 = activitiesTrimActivity.ga();
                                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar4 = dVarGa3.f28869g;
                                if (hVar4 != null && (x0VarC2 = hVar4.C()) != null) {
                                    str = x0VarC2.f4358a;
                                }
                                if (am.z0.H(str)) {
                                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START;
                                    n nVar = n.SUM_DURATION_TO_TIME_STAMP;
                                    Double dA4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.A4(dVarGa3, "SUMDURATION", bVar, null, nVar, null, 16);
                                    long jDoubleValue = dA4 != null ? (long) dA4.doubleValue() : 0L;
                                    Double dA5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.A4(dVarGa3, "SUMDURATION", com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END, null, nVar, null, 16);
                                    long jDoubleValue2 = dA5 != null ? (long) dA5.doubleValue() : 0L;
                                    yo.w wVar = dVarGa3.D;
                                    if (wVar != null) {
                                        List<yo.c> listA = wVar.f().getReconstruct().a();
                                        List<yo.c> listA2 = wVar.f().getReconstruct().a();
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : listA2) {
                                            yo.c cVar2 = (yo.c) obj;
                                            long startTime = cVar2.getStartTime();
                                            if (jDoubleValue > startTime || startTime > jDoubleValue2) {
                                                long endTime = cVar2.getEndTime();
                                                if (jDoubleValue > endTime || endTime > jDoubleValue2) {
                                                }
                                            }
                                            arrayList.add(obj);
                                        }
                                        if (listA.size() != arrayList.size()) {
                                            q1.b bVar2 = q1.f41066b;
                                            String string3 = activitiesTrimActivity.getString(R.string.remove_leg_title);
                                            string3.getClass();
                                            String string4 = activitiesTrimActivity.getString(R.string.remove_leg_description);
                                            string4.getClass();
                                            c cVar3 = new c(activitiesTrimActivity, 0);
                                            bVar2.getClass();
                                            q1 q1VarC = q1.b.c(string3, string4, R.string.lbl_delete, R.string.lbl_cancel, cVar3);
                                            androidx.fragment.app.v supportFragmentManager = activitiesTrimActivity.getSupportFragmentManager();
                                            supportFragmentManager.getClass();
                                            q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
                                        }
                                    }
                                }
                                activitiesTrimActivity.ia();
                            } else {
                                ActivitiesTrimActivity.da(activitiesTrimActivity, R.string.multisport_edit_leg_blocked_title, R.string.multisport_edit_leg_blocked_message, 4);
                                activitiesTrimActivity.ga().I4(activitiesTrimActivity);
                            }
                        }
                        break;
                    default:
                        ActivitiesTrimActivity.a aVar4 = ActivitiesTrimActivity.f28809p;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "TrimActivityReset");
                        activitiesTrimActivity.ga().I4(activitiesTrimActivity);
                        break;
                }
            }
        });
        ga().D4(hVar2.f29448a).f(this, new c(new bm.f(this, z14, z15, hVar2, pVar)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z14;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            ha();
            return true;
        }
        if (itemId != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        i.a aVar = i.f32968g;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = ga().f28869g;
        x0 x0VarC = hVar != null ? hVar.C() : null;
        aVar.getClass();
        i.a.a(x0VarC);
        cm.b.a aVar2 = cm.b.f27956g;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = ga().f28869g;
        if (i.a.a(hVar2 != null ? hVar2.C() : null) != i.OTHER) {
            ga().getClass();
            if (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.G4()) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = ga().f28869g;
            if ((hVar3 != null ? hVar3.C() : null) == x0.C) {
                ga().getClass();
                if (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.G4()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
        }
        aVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("SHOW_PROVISIONAL_END_EXTRA", z14);
        HelpActivity.a aVar3 = HelpActivity.f36653a;
        ro0.l lVar = ro0.l.ACTIVITY_TRIM;
        aVar3.getClass();
        HelpActivity.a.d(this, lVar, null, bundle);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/ActivitiesTrimActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
