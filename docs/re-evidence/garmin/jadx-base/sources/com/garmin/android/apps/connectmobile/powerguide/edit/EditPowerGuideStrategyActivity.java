package com.garmin.android.apps.connectmobile.powerguide.edit;

import ab1.f;
import ab1.g;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import as2.d;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.x;
import e23.l;
import fw.p;
import g.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import m72.m;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.j0;
import sa1.j;
import tr2.y;
import xa1.i;
import xa1.k;
import xa1.q;
import xa1.t;
import xa1.w;
import ya1.r;
import ya1.u;
import ya1.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/EditPowerGuideStrategyActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditPowerGuideStrategyActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f40384t = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f40385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f40386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f40387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f40388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f40389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f40390f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f40394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MenuItem f40395k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f40400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f40401q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40391g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40392h = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.k f40396l = new com.garmin.android.apps.connectmobile.k(this, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f40397m = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f40398n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f40399o = Double.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f.c<Intent> f40402r = registerForActivityResult(new h(), new y(this, 12));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40403a;

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
            f40403a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40404a;

        public c(l lVar) {
            lVar.getClass();
            this.f40404a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40404a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40404a.invoke(obj);
        }
    }

    public static void ca(EditPowerGuideStrategyActivity editPowerGuideStrategyActivity) {
        super.onBackPressed();
    }

    public static void fa(TextView textView) {
        Context context = textView.getContext();
        context.getClass();
        textView.setTextSize(0, c22.b.b(context, textView.getResources().getDimension(R.dimen.andfont_body_2), 1.5f));
    }

    public static void ja(TextView textView, String str) {
        textView.setContentDescription(textView.getContext().getString(R.string.lbl_table_header) + StringUtils.SPACE + str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    public final void da(boolean z14) {
        k kVar = this.f40389e;
        if (kVar == null) {
            s.m("viewModel");
            throw null;
        }
        y0 y0Var = new y0();
        y0<f> y0Var2 = kVar.f189760i;
        f fVarD = y0Var2.d();
        if ((fVarD != null ? fVarD.f2563a : null) == null) {
            y0Var.j(g3.a.c(g3.f35298f));
            kVar.f189757f.o(String.valueOf(kVar.f189752a.f2570c), new ta1.a(new wn2.f(new f(null, null, null, null, 15, null), 7, kVar, y0Var), new i(y0Var, 0)));
        } else {
            f fVarD2 = y0Var2.d();
            if ((fVarD2 != null ? fVarD2.f2564b : null) == null) {
                y0Var.j(g3.a.c(g3.f35298f));
                kVar.f189757f.o(String.valueOf(kVar.f189752a.f2570c), new ta1.a(new wn2.f(new f(null, null, null, null, 15, null), 7, kVar, y0Var), new i(y0Var, 0)));
            } else {
                f fVarD3 = y0Var2.d();
                if ((fVarD3 != null ? fVarD3.f2565c : null) != null) {
                    g3.a aVar = g3.f35298f;
                    f fVarD4 = y0Var2.d();
                    aVar.getClass();
                    y0Var.j(g3.a.d(fVarD4));
                } else {
                    y0Var.j(g3.a.c(g3.f35298f));
                    kVar.f189757f.o(String.valueOf(kVar.f189752a.f2570c), new ta1.a(new wn2.f(new f(null, null, null, null, 15, null), 7, kVar, y0Var), new i(y0Var, 0)));
                }
            }
        }
        y0Var.f(this, new c(new d(this, z14, 20)));
    }

    public final boolean ea() {
        return this.f40391g > 0;
    }

    public final void ga() {
        if (Double.isNaN(this.f40399o)) {
            ha();
        } else {
            new e.a(this).setTitle(R.string.lbl_power_guide_saved).setMessage(getString(R.string.lbl_power_guide_save_message)).setPositiveButton(R.string.lbl_ok, new xa1.c(this, 0)).show();
        }
    }

    public final void ha() {
        f fVar = this.f40390f;
        if (fVar == null) {
            s.m("powerGuideStrategyDetails");
            throw null;
        }
        ab1.d dVar = fVar.f2563a;
        if (dVar == null) {
            return;
        }
        k kVar = this.f40389e;
        if (kVar == null) {
            s.m("viewModel");
            throw null;
        }
        Long powerGuidancePk = dVar.getPowerGuidancePk();
        (powerGuidancePk == null ? xy2.b.K(kVar, new xa1.p(kVar, dVar, null)) : xy2.b.K(kVar, new q(kVar, powerGuidancePk, dVar, null))).f(this, new c(new xa1.b(this, 11)));
    }

    public final void ia() {
        Long powerGuidancePk;
        k kVar = this.f40389e;
        if (kVar == null) {
            s.m("viewModel");
            throw null;
        }
        f fVar = this.f40390f;
        if (fVar == null) {
            s.m("powerGuideStrategyDetails");
            throw null;
        }
        y0 y0Var = new y0();
        ab1.d dVar = fVar.f2563a;
        if (dVar != null && (powerGuidancePk = dVar.getPowerGuidancePk()) != null) {
            long jLongValue = powerGuidancePk.longValue();
            com.garmin.android.apps.connectmobile.courses.model.e eVar = fVar.f2564b;
            if (eVar != null) {
                y0Var.j(g3.a.c(g3.f35298f));
                w9.a aVarA = v1.a(kVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new xa1.r(dVar, eVar, kVar, jLongValue, fVar, y0Var, null), 2);
            }
        }
        y0Var.f(this, new c(new xa1.b(this, 12)));
    }

    public final void ka(ab1.a aVar) {
        ab1.a.b bVar;
        ab1.a.b bVar2;
        Object next;
        Object next2;
        ab1.a.AbstractC0027a abstractC0027a = aVar.f2533b;
        if (abstractC0027a == null) {
            return;
        }
        List<? extends ab1.a.b> list = aVar.f2532a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!(((ab1.a.b) next2) instanceof ab1.a.b.C0033b));
            bVar = (ab1.a.b) next2;
        } else {
            bVar = null;
        }
        ab1.a.b.C0033b c0033b = bVar instanceof ab1.a.b.C0033b ? (ab1.a.b.C0033b) bVar : null;
        List<? extends ab1.a.b> list2 = aVar.f2532a;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!(((ab1.a.b) next) instanceof ab1.a.b.C0031a));
            bVar2 = (ab1.a.b) next;
        } else {
            bVar2 = null;
        }
        ab1.a.b.C0031a c0031a = bVar2 instanceof ab1.a.b.C0031a ? (ab1.a.b.C0031a) bVar2 : null;
        if (c0033b != null && c0031a != null) {
            int i14 = c0031a.f2536a;
            boolean z14 = abstractC0027a instanceof ab1.a.AbstractC0027a.C0028a;
            float f14 = c0033b.f2537a;
            if (z14) {
                na(f14, i14);
                return;
            }
            String string = getString(R.string.rider_weight_and_ftp_changed_banner);
            string.getClass();
            la(new xa1.d(this, f14, i14), string, getString(R.string.lbl_view_changes));
            return;
        }
        if (c0033b != null) {
            boolean z15 = abstractC0027a instanceof ab1.a.AbstractC0027a.C0028a;
            float f15 = c0033b.f2537a;
            if (z15) {
                oa(f15);
                return;
            }
            String string2 = getString(R.string.rider_weight_changed_banner);
            string2.getClass();
            la(new m(this, f15, 1), string2, getString(R.string.lbl_view_changes));
            return;
        }
        if (c0031a != null) {
            boolean z16 = abstractC0027a instanceof ab1.a.AbstractC0027a.C0028a;
            int i15 = c0031a.f2536a;
            if (z16) {
                ma(i15);
                return;
            }
            String string3 = getString(R.string.ftp_changed_banner);
            string3.getClass();
            la(new ag0.a(this, i15, 14), string3, getString(R.string.lbl_view_changes));
        }
    }

    public final void la(e23.a aVar, String str, String str2) {
        x xVarA = x.a.a(x.f49750f, null, str, str2, 0, 57);
        xVarA.f49751a = new wz1.c(14, aVar, xVarA);
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        aVarB.j(R.id.banner_layout, xVarA, "BannerFragment", 1);
        aVarB.e();
    }

    public final void ma(final int i14) {
        ab1.d dVar;
        g powerGuidanceSummary;
        Integer num;
        f fVar = this.f40390f;
        if (fVar == null || (dVar = fVar.f2563a) == null || (powerGuidanceSummary = dVar.getPowerGuidanceSummary()) == null || (num = powerGuidanceSummary.f2573f) == null) {
            return;
        }
        final int i15 = 0;
        e.a positiveButton = new e.a(this).setTitle(R.string.update_power_guide_strategy_dialog_title).setMessage(getString(R.string.ftp_changed_message, num, Integer.valueOf(i14))).setPositiveButton(R.string.lbl_update, new DialogInterface.OnClickListener(this) { // from class: xa1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditPowerGuideStrategyActivity f189742b;

            {
                this.f189742b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                ab1.d dVar2;
                ab1.a alertUserSettingsChanges;
                switch (i15) {
                    case 0:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = this.f189742b;
                        com.garmin.android.apps.connectmobile.k kVar = editPowerGuideStrategyActivity.f40396l;
                        ab1.f fVar2 = editPowerGuideStrategyActivity.f40390f;
                        if (fVar2 == null || (dVar2 = fVar2.f2563a) == null) {
                            return;
                        }
                        dVar2.h(null);
                        ab1.g powerGuidanceSummary2 = dVar2.getPowerGuidanceSummary();
                        powerGuidanceSummary2.deleteObserver(kVar);
                        powerGuidanceSummary2.j(Integer.valueOf(i14));
                        powerGuidanceSummary2.addObserver(kVar);
                        editPowerGuideStrategyActivity.ia();
                        return;
                    default:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity2 = this.f189742b;
                        ab1.f fVar3 = editPowerGuideStrategyActivity2.f40390f;
                        if (fVar3 == null) {
                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                            throw null;
                        }
                        ab1.d dVar3 = fVar3.f2563a;
                        if (dVar3 != null && (alertUserSettingsChanges = dVar3.getAlertUserSettingsChanges()) != null) {
                            alertUserSettingsChanges.f2533b = ab1.a.AbstractC0027a.b.f2535a;
                        }
                        String string = editPowerGuideStrategyActivity2.getString(R.string.ftp_changed_banner);
                        string.getClass();
                        editPowerGuideStrategyActivity2.la(new ag0.a(editPowerGuideStrategyActivity2, i14, 14), string, editPowerGuideStrategyActivity2.getString(R.string.lbl_view_changes));
                        return;
                }
            }
        });
        final int i16 = 1;
        positiveButton.setNegativeButton(R.string.lbl_keep_existing, new DialogInterface.OnClickListener(this) { // from class: xa1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditPowerGuideStrategyActivity f189742b;

            {
                this.f189742b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                ab1.d dVar2;
                ab1.a alertUserSettingsChanges;
                switch (i16) {
                    case 0:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = this.f189742b;
                        com.garmin.android.apps.connectmobile.k kVar = editPowerGuideStrategyActivity.f40396l;
                        ab1.f fVar2 = editPowerGuideStrategyActivity.f40390f;
                        if (fVar2 == null || (dVar2 = fVar2.f2563a) == null) {
                            return;
                        }
                        dVar2.h(null);
                        ab1.g powerGuidanceSummary2 = dVar2.getPowerGuidanceSummary();
                        powerGuidanceSummary2.deleteObserver(kVar);
                        powerGuidanceSummary2.j(Integer.valueOf(i14));
                        powerGuidanceSummary2.addObserver(kVar);
                        editPowerGuideStrategyActivity.ia();
                        return;
                    default:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity2 = this.f189742b;
                        ab1.f fVar3 = editPowerGuideStrategyActivity2.f40390f;
                        if (fVar3 == null) {
                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                            throw null;
                        }
                        ab1.d dVar3 = fVar3.f2563a;
                        if (dVar3 != null && (alertUserSettingsChanges = dVar3.getAlertUserSettingsChanges()) != null) {
                            alertUserSettingsChanges.f2533b = ab1.a.AbstractC0027a.b.f2535a;
                        }
                        String string = editPowerGuideStrategyActivity2.getString(R.string.ftp_changed_banner);
                        string.getClass();
                        editPowerGuideStrategyActivity2.la(new ag0.a(editPowerGuideStrategyActivity2, i14, 14), string, editPowerGuideStrategyActivity2.getString(R.string.lbl_view_changes));
                        return;
                }
            }
        }).setCancelable(false).show();
    }

    public final void na(final float f14, final int i14) {
        ab1.d dVar;
        g powerGuidanceSummary;
        Float f15;
        g powerGuidanceSummary2;
        Integer num;
        f fVar = this.f40390f;
        if (fVar == null || (dVar = fVar.f2563a) == null || (powerGuidanceSummary = dVar.getPowerGuidanceSummary()) == null || (f15 = powerGuidanceSummary.f2577j) == null) {
            return;
        }
        double dFloatValue = f15.floatValue();
        f fVar2 = this.f40390f;
        if (fVar2 == null) {
            s.m("powerGuideStrategyDetails");
            throw null;
        }
        ab1.d dVar2 = fVar2.f2563a;
        if (dVar2 == null || (powerGuidanceSummary2 = dVar2.getPowerGuidanceSummary()) == null || (num = powerGuidanceSummary2.f2573f) == null) {
            return;
        }
        e.a message = new e.a(this).setTitle(R.string.update_power_guide_strategy_dialog_title).setMessage(getString(R.string.rider_weight_and_ftp_changed_message, xa1.h.a(this, dFloatValue), xa1.h.a(this, f14), num, Integer.valueOf(i14)));
        final int i15 = 0;
        e.a positiveButton = message.setPositiveButton(R.string.lbl_update, new DialogInterface.OnClickListener(this) { // from class: xa1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditPowerGuideStrategyActivity f189745b;

            {
                this.f189745b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                ab1.d dVar3;
                ab1.a alertUserSettingsChanges;
                switch (i15) {
                    case 0:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = this.f189745b;
                        com.garmin.android.apps.connectmobile.k kVar = editPowerGuideStrategyActivity.f40396l;
                        ab1.f fVar3 = editPowerGuideStrategyActivity.f40390f;
                        if (fVar3 == null || (dVar3 = fVar3.f2563a) == null) {
                            return;
                        }
                        dVar3.h(null);
                        ab1.g powerGuidanceSummary3 = dVar3.getPowerGuidanceSummary();
                        powerGuidanceSummary3.deleteObserver(kVar);
                        powerGuidanceSummary3.j(Integer.valueOf(i14));
                        powerGuidanceSummary3.h(Float.valueOf(f14));
                        powerGuidanceSummary3.addObserver(kVar);
                        editPowerGuideStrategyActivity.ia();
                        return;
                    default:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity2 = this.f189745b;
                        ab1.f fVar4 = editPowerGuideStrategyActivity2.f40390f;
                        if (fVar4 == null) {
                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                            throw null;
                        }
                        ab1.d dVar4 = fVar4.f2563a;
                        if (dVar4 != null && (alertUserSettingsChanges = dVar4.getAlertUserSettingsChanges()) != null) {
                            alertUserSettingsChanges.f2533b = ab1.a.AbstractC0027a.b.f2535a;
                        }
                        String string = editPowerGuideStrategyActivity2.getString(R.string.rider_weight_and_ftp_changed_banner);
                        string.getClass();
                        editPowerGuideStrategyActivity2.la(new d(editPowerGuideStrategyActivity2, f14, i14), string, editPowerGuideStrategyActivity2.getString(R.string.lbl_view_changes));
                        return;
                }
            }
        });
        final int i16 = 1;
        positiveButton.setNegativeButton(R.string.lbl_keep_existing, new DialogInterface.OnClickListener(this) { // from class: xa1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditPowerGuideStrategyActivity f189745b;

            {
                this.f189745b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                ab1.d dVar3;
                ab1.a alertUserSettingsChanges;
                switch (i16) {
                    case 0:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = this.f189745b;
                        com.garmin.android.apps.connectmobile.k kVar = editPowerGuideStrategyActivity.f40396l;
                        ab1.f fVar3 = editPowerGuideStrategyActivity.f40390f;
                        if (fVar3 == null || (dVar3 = fVar3.f2563a) == null) {
                            return;
                        }
                        dVar3.h(null);
                        ab1.g powerGuidanceSummary3 = dVar3.getPowerGuidanceSummary();
                        powerGuidanceSummary3.deleteObserver(kVar);
                        powerGuidanceSummary3.j(Integer.valueOf(i14));
                        powerGuidanceSummary3.h(Float.valueOf(f14));
                        powerGuidanceSummary3.addObserver(kVar);
                        editPowerGuideStrategyActivity.ia();
                        return;
                    default:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity2 = this.f189745b;
                        ab1.f fVar4 = editPowerGuideStrategyActivity2.f40390f;
                        if (fVar4 == null) {
                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                            throw null;
                        }
                        ab1.d dVar4 = fVar4.f2563a;
                        if (dVar4 != null && (alertUserSettingsChanges = dVar4.getAlertUserSettingsChanges()) != null) {
                            alertUserSettingsChanges.f2533b = ab1.a.AbstractC0027a.b.f2535a;
                        }
                        String string = editPowerGuideStrategyActivity2.getString(R.string.rider_weight_and_ftp_changed_banner);
                        string.getClass();
                        editPowerGuideStrategyActivity2.la(new d(editPowerGuideStrategyActivity2, f14, i14), string, editPowerGuideStrategyActivity2.getString(R.string.lbl_view_changes));
                        return;
                }
            }
        }).setCancelable(false).show();
    }

    public final void oa(final float f14) {
        ab1.d dVar;
        g powerGuidanceSummary;
        Float f15;
        f fVar = this.f40390f;
        if (fVar == null || (dVar = fVar.f2563a) == null || (powerGuidanceSummary = dVar.getPowerGuidanceSummary()) == null || (f15 = powerGuidanceSummary.f2577j) == null) {
            return;
        }
        final int i14 = 0;
        e.a positiveButton = new e.a(this).setTitle(R.string.update_power_guide_strategy_dialog_title).setMessage(getString(R.string.rider_weight_changed_message, xa1.h.a(this, f15.floatValue()), xa1.h.a(this, f14))).setPositiveButton(R.string.lbl_update, new DialogInterface.OnClickListener(this) { // from class: xa1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditPowerGuideStrategyActivity f189739b;

            {
                this.f189739b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                ab1.d dVar2;
                ab1.a alertUserSettingsChanges;
                switch (i14) {
                    case 0:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = this.f189739b;
                        com.garmin.android.apps.connectmobile.k kVar = editPowerGuideStrategyActivity.f40396l;
                        ab1.f fVar2 = editPowerGuideStrategyActivity.f40390f;
                        if (fVar2 == null || (dVar2 = fVar2.f2563a) == null) {
                            return;
                        }
                        dVar2.h(null);
                        ab1.g powerGuidanceSummary2 = dVar2.getPowerGuidanceSummary();
                        powerGuidanceSummary2.deleteObserver(kVar);
                        powerGuidanceSummary2.h(Float.valueOf(f14));
                        powerGuidanceSummary2.addObserver(kVar);
                        editPowerGuideStrategyActivity.ia();
                        return;
                    default:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity2 = this.f189739b;
                        ab1.f fVar3 = editPowerGuideStrategyActivity2.f40390f;
                        if (fVar3 == null) {
                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                            throw null;
                        }
                        ab1.d dVar3 = fVar3.f2563a;
                        if (dVar3 != null && (alertUserSettingsChanges = dVar3.getAlertUserSettingsChanges()) != null) {
                            alertUserSettingsChanges.f2533b = ab1.a.AbstractC0027a.b.f2535a;
                        }
                        String string = editPowerGuideStrategyActivity2.getString(R.string.rider_weight_changed_banner);
                        string.getClass();
                        editPowerGuideStrategyActivity2.la(new m72.m(editPowerGuideStrategyActivity2, f14, 1), string, editPowerGuideStrategyActivity2.getString(R.string.lbl_view_changes));
                        return;
                }
            }
        });
        final int i15 = 1;
        positiveButton.setNegativeButton(R.string.lbl_keep_existing, new DialogInterface.OnClickListener(this) { // from class: xa1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditPowerGuideStrategyActivity f189739b;

            {
                this.f189739b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                ab1.d dVar2;
                ab1.a alertUserSettingsChanges;
                switch (i15) {
                    case 0:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = this.f189739b;
                        com.garmin.android.apps.connectmobile.k kVar = editPowerGuideStrategyActivity.f40396l;
                        ab1.f fVar2 = editPowerGuideStrategyActivity.f40390f;
                        if (fVar2 == null || (dVar2 = fVar2.f2563a) == null) {
                            return;
                        }
                        dVar2.h(null);
                        ab1.g powerGuidanceSummary2 = dVar2.getPowerGuidanceSummary();
                        powerGuidanceSummary2.deleteObserver(kVar);
                        powerGuidanceSummary2.h(Float.valueOf(f14));
                        powerGuidanceSummary2.addObserver(kVar);
                        editPowerGuideStrategyActivity.ia();
                        return;
                    default:
                        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity2 = this.f189739b;
                        ab1.f fVar3 = editPowerGuideStrategyActivity2.f40390f;
                        if (fVar3 == null) {
                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                            throw null;
                        }
                        ab1.d dVar3 = fVar3.f2563a;
                        if (dVar3 != null && (alertUserSettingsChanges = dVar3.getAlertUserSettingsChanges()) != null) {
                            alertUserSettingsChanges.f2533b = ab1.a.AbstractC0027a.b.f2535a;
                        }
                        String string = editPowerGuideStrategyActivity2.getString(R.string.rider_weight_changed_banner);
                        string.getClass();
                        editPowerGuideStrategyActivity2.la(new m72.m(editPowerGuideStrategyActivity2, f14, 1), string, editPowerGuideStrategyActivity2.getString(R.string.lbl_view_changes));
                        return;
                }
            }
        }).setCancelable(false).show();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        f fVar;
        g powerGuidanceSummary;
        Bundle extras;
        g powerGuidanceSummary2;
        Bundle extras2;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 3333 && ea()) {
            f fVar2 = this.f40390f;
            if (fVar2 != null) {
                fVar2.f2563a = null;
                fVar2.f2564b = null;
                fVar2.f2565c = null;
                fVar2.f2566d = null;
            }
            da(true);
            setResult(-1);
        }
        if (i15 == -1) {
            if (i14 == 1) {
                Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("extra_terrain");
                ab1.p pVar = obj instanceof ab1.p ? (ab1.p) obj : null;
                if (pVar == null || (fVar = this.f40390f) == null) {
                    return;
                }
                ab1.d dVar = fVar.f2563a;
                if (dVar != null && (powerGuidanceSummary = dVar.getPowerGuidanceSummary()) != null) {
                    powerGuidanceSummary.i(pVar);
                }
                r rVar = this.f40385a;
                if (rVar == null) {
                    s.m("summaryViewHolder");
                    throw null;
                }
                ya1.x xVar = rVar.f195602m;
                if (xVar != null) {
                    xVar.a(pVar);
                    return;
                }
                return;
            }
            if (i14 != 2) {
                if (i14 != 123) {
                    return;
                }
                long jA = this.f40397m.a();
                if (jA > -1) {
                    long j8 = this.f40391g;
                    if (j8 > -1) {
                        k kVar = this.f40389e;
                        if (kVar != null) {
                            xy2.b.K(kVar, new t(kVar, j8, jA, null)).f(this, new c(new bb2.b(this, jA, 14)));
                            return;
                        } else {
                            s.m("viewModel");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
            Object obj2 = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.get("riding_position");
            ab1.l lVar = obj2 instanceof ab1.l ? (ab1.l) obj2 : null;
            if (lVar != null) {
                f fVar3 = this.f40390f;
                if (fVar3 == null) {
                    s.m("powerGuideStrategyDetails");
                    throw null;
                }
                ab1.d dVar2 = fVar3.f2563a;
                if (dVar2 != null && (powerGuidanceSummary2 = dVar2.getPowerGuidanceSummary()) != null) {
                    powerGuidanceSummary2.d(lVar);
                }
                r rVar2 = this.f40385a;
                if (rVar2 == null) {
                    s.m("summaryViewHolder");
                    throw null;
                }
                u uVar = rVar2.f195607r;
                if (uVar != null) {
                    uVar.a(lVar);
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        k kVar = this.f40389e;
        if (kVar == null) {
            s.m("viewModel");
            throw null;
        }
        Boolean boolD = kVar.f189761j.d();
        if (boolD != null ? boolD.booleanValue() : false) {
            new e.a(this).setTitle(R.string.title_exit_without_saving).setMessage(getString(R.string.save_strategy_details_confirmation_msg)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.lbl_exit, new xa1.c(this, 2)).show();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        Bundle extras;
        Parcelable parcelable;
        Bundle extras2;
        Bundle extras3;
        Bundle extras4;
        Bundle extras5;
        String string;
        Long lJ;
        Bundle extras6;
        super.onCreate(bundle);
        setContentView(R.layout.edit_power_guide_strategy_activity);
        int i14 = 1;
        initActionBar(true, R.string.power_guide_title);
        Intent intent = getIntent();
        this.f40391g = (intent == null || (extras6 = intent.getExtras()) == null) ? -1L : extras6.getLong("POWER_GUIDE_STRATEGY_ID", -1L);
        Intent intent2 = getIntent();
        long jLongValue = (intent2 == null || (extras5 = intent2.getExtras()) == null || (string = extras5.getString("POWER_GUIDE_COURSE_ID")) == null || (lJ = d53.t.j(string)) == null) ? -1L : lJ.longValue();
        this.f40392h = jLongValue;
        if (this.f40391g <= 0 || jLongValue <= 0) {
            Intent intent3 = getIntent();
            if (intent3 == null || (extras = intent3.getExtras()) == null) {
                gVar = null;
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras.getParcelable("POWER_GUIDE_SUMMARY", g.class);
                } else {
                    Parcelable parcelable2 = extras.getParcelable("POWER_GUIDE_SUMMARY");
                    if (!(parcelable2 instanceof g)) {
                        parcelable2 = null;
                    }
                    parcelable = (g) parcelable2;
                }
                gVar = (g) parcelable;
            }
        } else {
            gVar = new g();
            gVar.f2568a = Long.valueOf(this.f40391g);
            gVar.f2570c = Long.valueOf(this.f40392h);
        }
        if (gVar == null) {
            finish();
            return;
        }
        Intent intent4 = getIntent();
        int i15 = 0;
        this.f40393i = (intent4 == null || (extras4 = intent4.getExtras()) == null) ? false : extras4.getBoolean("GCM_extra_navigate_from_course_details");
        Intent intent5 = getIntent();
        this.f40398n = (intent5 == null || (extras3 = intent5.getExtras()) == null) ? -1L : extras3.getLong("GCM_extra_power_guide_id_to_replace", -1L);
        Intent intent6 = getIntent();
        double d14 = Double.NaN;
        if (intent6 != null && (extras2 = intent6.getExtras()) != null) {
            d14 = extras2.getDouble("GCM_extra_event_distance", Double.NaN);
        }
        this.f40399o = d14;
        long j8 = this.f40398n;
        this.f40389e = (k) new x1(this, new w(gVar, j8 == -1 ? null : Long.valueOf(j8))).b(p005kotlin.jvm.internal.s0.f105811a.b(k.class));
        View viewFindViewById = findViewById(R.id.strategy_details_container);
        viewFindViewById.getClass();
        this.f40387c = viewFindViewById;
        viewFindViewById.setVisibility(8);
        vy0.e eVar = new vy0.e(this, 16);
        xa1.b bVar = new xa1.b(this, i15);
        xa1.b bVar2 = new xa1.b(this, i14);
        xa1.b bVar3 = new xa1.b(this, 2);
        xa1.b bVar4 = new xa1.b(this, 3);
        xa1.b bVar5 = new xa1.b(this, 4);
        xa1.b bVar6 = new xa1.b(this, 5);
        int i16 = 6;
        xa1.b bVar7 = new xa1.b(this, i16);
        int i17 = 7;
        xa1.b bVar8 = new xa1.b(this, i17);
        View view2 = this.f40387c;
        if (view2 == null) {
            s.m("rootView");
            throw null;
        }
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        this.f40385a = new r(view2, supportFragmentManager, eVar, bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
        this.f40386b = new v();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        v vVar = this.f40386b;
        if (vVar == null) {
            s.m("adapter");
            throw null;
        }
        recyclerView.setAdapter(vVar);
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.power_guide_split_header, (ViewGroup) recyclerView, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.split_distance_unit);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.split_elev_change_unit);
        boolean z14 = am.j.z(f12.l.f68084a);
        l3.f23124b.getClass();
        textView.setText(l3.a.E1(this, z14, true));
        v22.d.d(textView, new x91.j(i16));
        textView2.setText(l3.a.E1(this, z14, false));
        v22.d.d(textView2, new x91.j(i17));
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.split_table_header);
        textView3.getClass();
        String string2 = getString(R.string.lbl_split);
        string2.getClass();
        ja(textView3, string2);
        fa(textView3);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.distance_table_header);
        textView4.getClass();
        String string3 = getString(R.string.lbl_distance);
        string3.getClass();
        ja(textView4, string3);
        fa(textView4);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.time_table_header);
        textView5.getClass();
        String string4 = getString(R.string.lbl_time_estimate);
        string4.getClass();
        ja(textView5, string4);
        fa(textView5);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.target_power_table_header);
        textView6.getClass();
        String string5 = getString(R.string.lbl_target_power);
        string5.getClass();
        ja(textView6, string5);
        fa(textView6);
        TextView textView7 = (TextView) viewInflate.findViewById(R.id.avg_grade_table_header);
        textView7.getClass();
        String string6 = getString(R.string.lbl_average_grade);
        string6.getClass();
        ja(textView7, string6);
        fa(textView7);
        TextView textView8 = (TextView) viewInflate.findViewById(R.id.ftp_table_header);
        textView8.getClass();
        String string7 = getString(R.string.device_settings_functional_threshold_power);
        string7.getClass();
        ja(textView8, string7);
        fa(textView8);
        TextView textView9 = (TextView) viewInflate.findViewById(R.id.elev_change_table_header);
        textView9.getClass();
        String string8 = getString(R.string.pacepro_splits_elevation_changes);
        string8.getClass();
        ja(textView9, string8);
        fa(textView9);
        v vVar2 = this.f40386b;
        if (vVar2 == null) {
            s.m("adapter");
            throw null;
        }
        vVar2.t(viewInflate);
        View viewInflate2 = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.orientation_hint, (ViewGroup) recyclerView, false);
        if (getResources().getConfiguration().orientation == 2) {
            hideToolBar();
            v vVar3 = this.f40386b;
            if (vVar3 == null) {
                s.m("adapter");
                throw null;
            }
            ArrayList arrayList = vVar3.f34943b;
            if (arrayList.contains(viewInflate2)) {
                vVar3.notifyItemRemoved(arrayList.indexOf(viewInflate2) + vVar3.f195617c.size() + vVar3.f34942a.size());
                arrayList.remove(viewInflate2);
            }
            View viewFindViewById2 = findViewById(R.id.content_frame);
            wr.g gVar2 = new wr.g(6);
            WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
            androidx.core.view.s0.d.c(viewFindViewById2, gVar2);
        } else {
            showToolBar();
            v vVar4 = this.f40386b;
            if (vVar4 == null) {
                s.m("adapter");
                throw null;
            }
            vVar4.r(viewInflate2);
        }
        View viewFindViewById3 = findViewById(R.id.save_btn);
        viewFindViewById3.getClass();
        this.f40388d = (Button) viewFindViewById3;
        boolean zEa = ea();
        Button button = this.f40388d;
        if (zEa) {
            if (button == null) {
                s.m("saveBtn");
                throw null;
            }
            button.setText(R.string.lbl_update);
            k kVar = this.f40389e;
            if (kVar == null) {
                s.m("viewModel");
                throw null;
            }
            kVar.f189761j.f(this, new c(new xa1.b(this, 13)));
        } else {
            if (button == null) {
                s.m("saveBtn");
                throw null;
            }
            button.setText(R.string.lbl_save);
        }
        Button button2 = this.f40388d;
        if (button2 != null) {
            button2.setOnClickListener(new vg1.z0(this, 15));
        } else {
            s.m("saveBtn");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.power_guide_menu, menu);
        this.f40394j = menu.findItem(R.id.power_guide_send_to_device);
        this.f40395k = menu.findItem(R.id.power_guide_delete);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        g powerGuidanceSummary;
        super.onDestroy();
        f fVar = this.f40390f;
        if (fVar != null) {
            if (fVar == null) {
                s.m("powerGuideStrategyDetails");
                throw null;
            }
            ab1.d dVar = fVar.f2563a;
            if (dVar == null || (powerGuidanceSummary = dVar.getPowerGuidanceSummary()) == null) {
                return;
            }
            powerGuidanceSummary.deleteObservers();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId != R.id.power_guide_send_to_device) {
            if (itemId != R.id.power_guide_delete) {
                return super.onOptionsItemSelected(menuItem);
            }
            new e.a(this).setTitle(R.string.delete_power_guide_title).setMessage(getString(R.string.delete_power_guide_msg)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.lbl_delete, new xa1.c(this, 1)).show();
            return true;
        }
        f fVar = this.f40390f;
        if (fVar == null) {
            s.m("powerGuideStrategyDetails");
            throw null;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar = fVar.f2564b;
        this.f40397m.n(this, eVar != null ? eVar.z() : null);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        boolean z14 = this.f40390f != null && ea();
        MenuItem menuItem = this.f40394j;
        if (menuItem != null) {
            menuItem.setVisible(z14);
        }
        MenuItem menuItem2 = this.f40395k;
        if (menuItem2 != null) {
            menuItem2.setVisible(z14);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        Fragment fragment;
        super.onResume();
        if (this.f40390f == null) {
            da(false);
            return;
        }
        r rVar = this.f40385a;
        if (rVar == null) {
            s.m("summaryViewHolder");
            throw null;
        }
        ya1.n nVar = rVar.f195601l;
        if (nVar == null || (fragment = nVar.f195579d) == null) {
            return;
        }
        nVar.f195580e.m(fragment);
    }

    public final void pa() {
        g powerGuidanceSummary;
        Integer num;
        List<ab1.e> listF;
        g powerGuidanceSummary2;
        Float f14;
        ab1.d dVar;
        List<ab1.e> listF2;
        PowerZonesDTO powerZonesDTO;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        r rVar = this.f40385a;
        if (rVar == null) {
            s.m("summaryViewHolder");
            throw null;
        }
        f fVar = this.f40390f;
        if (fVar == null) {
            s.m("powerGuideStrategyDetails");
            throw null;
        }
        View view2 = rVar.f195590a;
        ab1.d dVar2 = fVar.f2563a;
        if (dVar2 != null && (powerGuidanceSummary2 = dVar2.getPowerGuidanceSummary()) != null && (f14 = powerGuidanceSummary2.f2579l) != null) {
            float fFloatValue = f14.floatValue();
            Float f15 = powerGuidanceSummary2.f2580m;
            if (f15 != null) {
                float fFloatValue2 = f15.floatValue();
                Integer num2 = powerGuidanceSummary2.f2581n;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    w01.c cVar = fVar.f2566d;
                    ya1.g gVar = rVar.f195604o;
                    if (gVar != null) {
                        gVar.a(new j23.e(fFloatValue, fFloatValue2));
                        ya1.g gVar2 = rVar.f195604o;
                        if (gVar2 == null) {
                            s.m("effortLevelItemViewHolder");
                            throw null;
                        }
                        gVar2.b(iIntValue);
                    }
                    ya1.n nVar = rVar.f195601l;
                    if (nVar != null && (dVar = fVar.f2563a) != null && (listF2 = dVar.f()) != null && (powerZonesDTO = fVar.f2565c) != null && (eVar = fVar.f2564b) != null) {
                        nVar.f195581f = eVar;
                        Iterable<GeoPointDTO> iterable = eVar.geoPoints;
                        if (iterable == null) {
                            iterable = j0.f134944a;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (GeoPointDTO geoPointDTO : iterable) {
                            if (geoPointDTO != null) {
                                arrayList.add(geoPointDTO);
                            }
                        }
                        ArrayList arrayListC = xa1.h.c(arrayList, listF2);
                        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = nVar.f195581f;
                        if (eVar2 == null) {
                            s.m("courseDetailDTO");
                            throw null;
                        }
                        List<com.garmin.android.apps.connectmobile.courses.model.g> list = eVar2.intervalMarkers;
                        ArrayList arrayList2 = list instanceof ArrayList ? (ArrayList) list : null;
                        if (arrayList2 != null) {
                            arrayList2.clear();
                        }
                        com.garmin.android.apps.connectmobile.courses.model.e eVar3 = nVar.f195581f;
                        if (eVar3 == null) {
                            s.m("courseDetailDTO");
                            throw null;
                        }
                        List<com.garmin.android.apps.connectmobile.courses.model.g> list2 = eVar3.intervalMarkers;
                        ArrayList arrayList3 = list2 instanceof ArrayList ? (ArrayList) list2 : null;
                        if (arrayList3 != null) {
                            arrayList3.addAll(arrayListC);
                        }
                        Context context = nVar.f195578c;
                        context.getClass();
                        ArrayList arrayListB = xa1.h.b(context, listF2, powerZonesDTO);
                        nVar.f195582g = arrayListB;
                        Fragment fragment = nVar.f195579d;
                        if (fragment != null) {
                            j jVar = nVar.f195580e;
                            com.garmin.android.apps.connectmobile.courses.model.e eVar4 = nVar.f195581f;
                            if (eVar4 == null) {
                                s.m("courseDetailDTO");
                                throw null;
                            }
                            jVar.i(fragment, eVar4, arrayListB);
                        }
                    }
                    if (rVar.f195603n != null) {
                        Context context2 = view2.getContext();
                        context2.getClass();
                        za1.c cVarA = za1.d.a(fVar, context2);
                        String strValueOf = String.valueOf(cVarA != null ? Integer.valueOf(cVarA.f203289b) : null);
                        String strValueOf2 = String.valueOf(cVarA != null ? Integer.valueOf(cVarA.f203290c) : null);
                        ya1.g gVar3 = rVar.f195604o;
                        if (gVar3 == null) {
                            s.m("effortLevelItemViewHolder");
                            throw null;
                        }
                        String string = view2.getContext().getString(R.string.lbl_power_guide_avg_max_power, strValueOf, strValueOf2);
                        string.getClass();
                        gVar3.f195557e.setContentDescription(string);
                        ya1.d dVar3 = rVar.f195603n;
                        if (dVar3 == null) {
                            s.m("chartItemViewHolder");
                            throw null;
                        }
                        dVar3.a(fVar);
                    }
                    if (rVar.f195608s != null) {
                        com.garmin.android.apps.connectmobile.courses.model.e eVar5 = fVar.f2564b;
                        double dQ = eVar5 != null ? eVar5.q() : 0.0d;
                        z21.i iVar = rVar.f195608s;
                        if (iVar == null) {
                            s.m("nutritionAndHydrationViewHolder");
                            throw null;
                        }
                        iVar.a(cVar, dQ);
                    }
                }
            }
        }
        f fVar2 = this.f40390f;
        if (fVar2 == null) {
            s.m("powerGuideStrategyDetails");
            throw null;
        }
        ab1.d dVar4 = fVar2.f2563a;
        if (dVar4 == null || (powerGuidanceSummary = dVar4.getPowerGuidanceSummary()) == null || (num = powerGuidanceSummary.f2573f) == null) {
            return;
        }
        int iIntValue2 = num.intValue();
        f fVar3 = this.f40390f;
        if (fVar3 == null) {
            s.m("powerGuideStrategyDetails");
            throw null;
        }
        ab1.d dVar5 = fVar3.f2563a;
        if (dVar5 == null || (listF = dVar5.f()) == null) {
            return;
        }
        ArrayList arrayListF = xa1.h.f(iIntValue2, listF);
        v vVar = this.f40386b;
        if (vVar == null) {
            s.m("adapter");
            throw null;
        }
        ArrayList arrayList4 = vVar.f195617c;
        arrayList4.clear();
        arrayList4.addAll(arrayListF);
        vVar.notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/EditPowerGuideStrategyActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_POWER_GUIDE_SUMMARY", "EXTRA_POWER_GUIDE_STRATEGY_ID", "EXTRA_POWER_GUIDE_COURSE_ID", "", "EDIT_TERRAIN_REQUEST_CODE", "I", "EDIT_RIDING_POSITION_REQUEST_CODE", "EDIT_COURSE_REQUEST_CODE", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Activity activity, long j8, String str, int i14) {
            activity.getClass();
            str.getClass();
            Intent intent = new Intent(activity, (Class<?>) EditPowerGuideStrategyActivity.class);
            intent.putExtra("POWER_GUIDE_STRATEGY_ID", j8);
            intent.putExtra("POWER_GUIDE_COURSE_ID", str);
            activity.startActivityForResult(intent, i14);
        }

        private a() {
        }
    }
}
