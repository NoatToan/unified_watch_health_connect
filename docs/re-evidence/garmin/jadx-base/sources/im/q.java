package im;

import am.x0;
import am.z0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.m;
import aq.o3;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.q0;
import com.garmin.android.apps.connectmobile.activities.stats.DragWCdAHelpActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import ro0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lim/q;", "Lcom/garmin/android/apps/connectmobile/activities/charts/b;", "Landroid/view/View;", "chartRow", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends com.garmin.android.apps.connectmobile.activities.charts.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AppCompatSpinner f94173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f94174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f94175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f94176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bq.c f94177p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(View view2) {
        super(view2);
        view2.getClass();
        this.f94173l = (AppCompatSpinner) view2.findViewById(R.id.chart_title_dropdown);
        Context context = view2.getContext();
        context.getClass();
        this.f94174m = new i(context);
        this.f94175n = view2.getResources().getDimension(R.dimen.gcm3_activity_chart_height);
        this.f94176o = new ArrayList();
        Context context2 = view2.getContext();
        context2.getClass();
        this.f94177p = new bq.c((androidx.fragment.app.m) context2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:167:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:168:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:171:0x050b  */
    /* JADX WARN: Code duplicated, block: B:172:0x051b  */
    /* JADX WARN: Code duplicated, block: B:173:0x051f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x0521  */
    /* JADX WARN: Code duplicated, block: B:175:0x052c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0530  */
    /* JADX WARN: Code duplicated, block: B:178:0x053a  */
    /* JADX WARN: Code duplicated, block: B:183:0x057f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0195  */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.os.Bundle, java.lang.String] */
    public final void l(String str, SparseArray<q0> sparseArray, fz.c cVar) throws Throwable {
        Object next;
        Throwable th3;
        double dV;
        Iterator it = this.f94176o.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((zm.p) next).W0(), str));
        final zm.p pVar = (zm.p) next;
        if (pVar != null) {
            final bq.c cVar2 = this.f94177p;
            androidx.fragment.app.m mVar = cVar2.f19475a;
            cVar.getClass();
            cVar2.f19478d = sparseArray;
            LinearLayout linearLayout = this.f28970i;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            LinearLayout linearLayout2 = this.f28971j;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
            }
            String strW0 = pVar.W0();
            TextView textView = this.f28964c;
            if (textView != null) {
                textView.setText(strW0);
            }
            int iG1 = pVar.g1();
            final int i14 = 1;
            final int i15 = 6;
            final int i16 = 0;
            if (p13.x.k(1, 50, 52, 64, 12, 14, 19, 15, 86, 9, 16, 13, 96, 21, 22, 23, 24, 25, 26, 27, 36, 37, 38, 39, 40, 41, 43, 46, 48, 82).contains(Integer.valueOf(iG1))) {
                th3 = null;
            } else {
                String strI3 = pVar.i3();
                if (strI3 != null) {
                    if (iG1 == 6) {
                        f12.l.f68084a.getClass();
                        th3 = null;
                        strI3 = tn.k.g(strI3, mVar.getString(f12.l.a.a().c() ? R.string.lbl_fahrenheit : R.string.lbl_celsius));
                    } else {
                        th3 = null;
                    }
                    f(strI3, pVar.x2());
                } else {
                    th3 = null;
                    if (iG1 == 35) {
                        p005kotlin.jvm.internal.s.m("noData");
                        throw null;
                    }
                    i(false);
                }
            }
            String strE4 = pVar.e4();
            double dH4 = pVar.h4();
            if (iG1 == 56) {
                h(false);
                i(false);
            } else if (iG1 == 71) {
                cVar2.b(this, pVar);
            } else if (iG1 != 82) {
                if (iG1 == 86) {
                    if (z0.v(pVar.U())) {
                        HelpActivity.a aVar = HelpActivity.f36653a;
                        ro0.l lVar = ro0.l.SKI_GLIDE_LENGTH;
                        aVar.getClass();
                        ?? r14 = th3;
                        HelpActivity.a.d(mVar, lVar, r14, r14);
                    }
                    cVar2.b(this, pVar);
                } else if (iG1 != 87) {
                    switch (iG1) {
                        case -1:
                        case 0:
                        case 3:
                        case 4:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 16:
                            cVar2.b(this, pVar);
                            break;
                        case 1:
                            if (Double.isNaN(dH4)) {
                                h(false);
                            } else {
                                d(l3.f23124b.p0((int) dH4, mVar), cVar2.a(R.string.lbl_average));
                            }
                            dV = pVar.V();
                            if (!Double.isNaN(dV)) {
                                f(l3.f23124b.p0((int) dV, mVar), pVar.x2());
                            } else {
                                i(false);
                            }
                            break;
                        case 2:
                            if (strE4 == null) {
                                h(false);
                            } else {
                                d(strE4, cVar2.a(R.string.lbl_minimum));
                            }
                            break;
                        case 5:
                            if (z0.v(pVar.U())) {
                                final int i17 = 2;
                                k(new e23.a() { // from class: bq.a
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i18 = i17;
                                        c cVar3 = cVar2;
                                        switch (i18) {
                                            case 0:
                                                HelpActivity.a aVar2 = HelpActivity.f36653a;
                                                m mVar2 = cVar3.f19475a;
                                                l lVar2 = l.RESPIRATION_RATE;
                                                aVar2.getClass();
                                                HelpActivity.a.d(mVar2, lVar2, null, null);
                                                break;
                                            case 1:
                                                HelpActivity.a.e(HelpActivity.f36653a, cVar3.f19475a, l.IMPACT_LOAD, null, null, 12);
                                                break;
                                            case 2:
                                                HelpActivity.a aVar3 = HelpActivity.f36653a;
                                                m mVar3 = cVar3.f19475a;
                                                l lVar3 = l.SKI_POWER;
                                                aVar3.getClass();
                                                HelpActivity.a.d(mVar3, lVar3, null, null);
                                                break;
                                            case 3:
                                                HelpActivity.a aVar4 = HelpActivity.f36653a;
                                                m mVar4 = cVar3.f19475a;
                                                l lVar4 = l.STAMINA;
                                                aVar4.getClass();
                                                HelpActivity.a.d(mVar4, lVar4, null, null);
                                                break;
                                            case 4:
                                                HelpActivity.a aVar5 = HelpActivity.f36653a;
                                                m mVar5 = cVar3.f19475a;
                                                l lVar5 = l.PERFORMANCE_CONDITION;
                                                aVar5.getClass();
                                                HelpActivity.a.d(mVar5, lVar5, null, null);
                                                break;
                                            case 5:
                                                m mVar6 = cVar3.f19475a;
                                                int i19 = DragWCdAHelpActivity.f29762c;
                                                mVar6.startActivity(new Intent(mVar6, (Class<?>) DragWCdAHelpActivity.class));
                                                break;
                                            case 6:
                                                HelpActivity.a aVar6 = HelpActivity.f36653a;
                                                m mVar7 = cVar3.f19475a;
                                                l lVar6 = l.ACTIVITY_LAP_RACING;
                                                aVar6.getClass();
                                                HelpActivity.a.d(mVar7, lVar6, null, null);
                                                break;
                                            case 7:
                                                HelpActivity.a.e(HelpActivity.f36653a, cVar3.f19475a, l.GRIT_FLOW, "FLOW", null, 8);
                                                break;
                                            default:
                                                HelpActivity.a.e(HelpActivity.f36653a, cVar3.f19475a, l.GRIT_FLOW, "GRIT", null, 8);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                            cVar2.b(this, pVar);
                            break;
                        case 6:
                            if (strE4 == null) {
                                f12.l.f68084a.getClass();
                                f12.l lVarA = f12.l.a.a();
                                l3.a aVar2 = l3.f23124b;
                                l22.a aVar3 = new l22.a(mVar);
                                boolean zC = lVarA.c();
                                aVar2.getClass();
                                d(l3.a.U0(aVar3, dH4, zC, false, true), cVar2.a(R.string.lbl_average));
                            } else {
                                f12.l.f68084a.getClass();
                                d(strE4.concat(f12.l.a.a().c() ? cVar2.a(R.string.lbl_fahrenheit) : cVar2.a(R.string.lbl_celsius)), cVar2.a(R.string.lbl_minimum));
                            }
                            break;
                        case 14:
                            double dH5 = pVar.h4();
                            if (!Double.isNaN(dH5)) {
                                l3.f23124b.getClass();
                                d(l3.a.A0(mVar, ((double) 100) - dH5, 1), cVar2.a(R.string.lbl_left_balance));
                                f(l3.a.A0(mVar, dH5, 1), cVar2.a(R.string.lbl_right_balance));
                            } else {
                                j(false);
                            }
                            break;
                        case 15:
                            if (z0.v(pVar.U())) {
                                HelpActivity.a aVar4 = HelpActivity.f36653a;
                                ro0.l lVar2 = ro0.l.SKI_GLIDE_LENGTH;
                                aVar4.getClass();
                                ?? r15 = th3;
                                HelpActivity.a.d(mVar, lVar2, r15, r15);
                            }
                            cVar2.b(this, pVar);
                            break;
                        default:
                            final int i18 = 5;
                            switch (iG1) {
                                case 19:
                                    double dS0 = pVar.s0();
                                    double dY = pVar.Y();
                                    if (Double.isNaN(dS0) || Double.isNaN(dY)) {
                                        j(false);
                                    } else {
                                        l3.f23124b.getClass();
                                        d(l3.a.A0(mVar, dS0, 1), cVar2.a(R.string.lbl_left_balance));
                                        f(l3.a.A0(mVar, dY, 1), cVar2.a(R.string.lbl_right_balance));
                                    }
                                    break;
                                case 20:
                                    j(false);
                                    ImageView imageView = this.f28968g;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                    }
                                    break;
                                case 21:
                                case 22:
                                    j(false);
                                    break;
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 38:
                                    j(false);
                                    break;
                                case 27:
                                    com.garmin.android.apps.connectmobile.activities.newmodel.o oVarQ1 = pVar.Q1();
                                    if (!(oVarQ1 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.c)) {
                                        j(false);
                                    } else {
                                        com.garmin.android.apps.connectmobile.activities.newmodel.o.c cVar3 = (com.garmin.android.apps.connectmobile.activities.newmodel.o.c) oVarQ1;
                                        double d14 = cVar3.f29617m;
                                        double d15 = cVar3.f29618n;
                                        if (Double.isNaN(d14) || Double.isNaN(d15)) {
                                            j(false);
                                        } else {
                                            d(androidx.core.view.j.f(MathKt.b(d14), "%"), cVar2.a(R.string.lbl_left_balance));
                                            f(androidx.core.view.j.f(MathKt.b(d15), "%"), cVar2.a(R.string.lbl_right_balance));
                                        }
                                    }
                                    break;
                                case 28:
                                case 30:
                                case 31:
                                case 44:
                                    cVar2.b(this, pVar);
                                    break;
                                case 29:
                                    cVar2.f19476b *= 1.2f;
                                    j(false);
                                    break;
                                case 32:
                                    j(false);
                                    cVar2.f19476b = -2.0f;
                                    d0 d0VarC3 = pVar.C3();
                                    final double d16 = d0VarC3 != null ? d0VarC3.f94139a : Double.NaN;
                                    d0 d0VarD2 = pVar.D2();
                                    final double d17 = d0VarD2 != null ? d0VarD2.f94139a : Double.NaN;
                                    e23.a<Unit> aVar5 = new e23.a() { // from class: bq.b
                                        @Override // e23.a
                                        public final Object invoke() {
                                            o3.b bVar = (Double.isNaN(d16) || Double.isNaN(d17)) ? o3.b.TRAINING_EFFECT_HELP_AEROBIC : o3.b.TRAINING_EFFECT_HELP_BOTH;
                                            String strH3 = pVar.h3();
                                            boolean z14 = strH3 != null ? !w.J(strH3) : false;
                                            Bundle bundle = new Bundle();
                                            bundle.putSerializable("help_mode_key", bVar);
                                            bundle.putBoolean("has_primary_benefit", z14);
                                            HelpActivity.a aVar6 = HelpActivity.f36653a;
                                            m mVar2 = cVar2.f19475a;
                                            l lVar3 = l.TRAINING_EFFECT;
                                            aVar6.getClass();
                                            HelpActivity.a.d(mVar2, lVar3, "DEFAULT_ACTION", bundle);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    pVar = pVar;
                                    k(aVar5);
                                    break;
                                case 33:
                                    j(false);
                                    final int i19 = 4;
                                    k(new e23.a() { // from class: bq.a
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i110 = i19;
                                            c cVar4 = cVar2;
                                            switch (i110) {
                                                case 0:
                                                    HelpActivity.a aVar6 = HelpActivity.f36653a;
                                                    m mVar2 = cVar4.f19475a;
                                                    l lVar3 = l.RESPIRATION_RATE;
                                                    aVar6.getClass();
                                                    HelpActivity.a.d(mVar2, lVar3, null, null);
                                                    break;
                                                case 1:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.IMPACT_LOAD, null, null, 12);
                                                    break;
                                                case 2:
                                                    HelpActivity.a aVar7 = HelpActivity.f36653a;
                                                    m mVar3 = cVar4.f19475a;
                                                    l lVar4 = l.SKI_POWER;
                                                    aVar7.getClass();
                                                    HelpActivity.a.d(mVar3, lVar4, null, null);
                                                    break;
                                                case 3:
                                                    HelpActivity.a aVar8 = HelpActivity.f36653a;
                                                    m mVar4 = cVar4.f19475a;
                                                    l lVar5 = l.STAMINA;
                                                    aVar8.getClass();
                                                    HelpActivity.a.d(mVar4, lVar5, null, null);
                                                    break;
                                                case 4:
                                                    HelpActivity.a aVar9 = HelpActivity.f36653a;
                                                    m mVar5 = cVar4.f19475a;
                                                    l lVar6 = l.PERFORMANCE_CONDITION;
                                                    aVar9.getClass();
                                                    HelpActivity.a.d(mVar5, lVar6, null, null);
                                                    break;
                                                case 5:
                                                    m mVar6 = cVar4.f19475a;
                                                    int i111 = DragWCdAHelpActivity.f29762c;
                                                    mVar6.startActivity(new Intent(mVar6, (Class<?>) DragWCdAHelpActivity.class));
                                                    break;
                                                case 6:
                                                    HelpActivity.a aVar10 = HelpActivity.f36653a;
                                                    m mVar7 = cVar4.f19475a;
                                                    l lVar7 = l.ACTIVITY_LAP_RACING;
                                                    aVar10.getClass();
                                                    HelpActivity.a.d(mVar7, lVar7, null, null);
                                                    break;
                                                case 7:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "FLOW", null, 8);
                                                    break;
                                                default:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "GRIT", null, 8);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    break;
                                case 34:
                                    double dH6 = pVar.h4();
                                    if (Double.isNaN(dH6)) {
                                        h(false);
                                    } else {
                                        d(l3.f23126d.format(dH6), cVar2.a(R.string.lbl_average));
                                    }
                                    double dV2 = pVar.V();
                                    if (!Double.isNaN(dV2)) {
                                        f(l3.f23126d.format(dV2), pVar.x2());
                                    } else {
                                        i(false);
                                    }
                                    break;
                                case 35:
                                    if (Double.isNaN(dH4)) {
                                        p005kotlin.jvm.internal.s.m("noData");
                                        throw th3;
                                    }
                                    l3.f23124b.getClass();
                                    d(l3.a.B(dH4), cVar2.a(R.string.lbl_average));
                                    break;
                                case 36:
                                case 37:
                                    j(false);
                                    k(new e23.a() { // from class: bq.a
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i110 = i18;
                                            c cVar4 = cVar2;
                                            switch (i110) {
                                                case 0:
                                                    HelpActivity.a aVar6 = HelpActivity.f36653a;
                                                    m mVar2 = cVar4.f19475a;
                                                    l lVar3 = l.RESPIRATION_RATE;
                                                    aVar6.getClass();
                                                    HelpActivity.a.d(mVar2, lVar3, null, null);
                                                    break;
                                                case 1:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.IMPACT_LOAD, null, null, 12);
                                                    break;
                                                case 2:
                                                    HelpActivity.a aVar7 = HelpActivity.f36653a;
                                                    m mVar3 = cVar4.f19475a;
                                                    l lVar4 = l.SKI_POWER;
                                                    aVar7.getClass();
                                                    HelpActivity.a.d(mVar3, lVar4, null, null);
                                                    break;
                                                case 3:
                                                    HelpActivity.a aVar8 = HelpActivity.f36653a;
                                                    m mVar4 = cVar4.f19475a;
                                                    l lVar5 = l.STAMINA;
                                                    aVar8.getClass();
                                                    HelpActivity.a.d(mVar4, lVar5, null, null);
                                                    break;
                                                case 4:
                                                    HelpActivity.a aVar9 = HelpActivity.f36653a;
                                                    m mVar5 = cVar4.f19475a;
                                                    l lVar6 = l.PERFORMANCE_CONDITION;
                                                    aVar9.getClass();
                                                    HelpActivity.a.d(mVar5, lVar6, null, null);
                                                    break;
                                                case 5:
                                                    m mVar6 = cVar4.f19475a;
                                                    int i111 = DragWCdAHelpActivity.f29762c;
                                                    mVar6.startActivity(new Intent(mVar6, (Class<?>) DragWCdAHelpActivity.class));
                                                    break;
                                                case 6:
                                                    HelpActivity.a aVar10 = HelpActivity.f36653a;
                                                    m mVar7 = cVar4.f19475a;
                                                    l lVar7 = l.ACTIVITY_LAP_RACING;
                                                    aVar10.getClass();
                                                    HelpActivity.a.d(mVar7, lVar7, null, null);
                                                    break;
                                                case 7:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "FLOW", null, 8);
                                                    break;
                                                default:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "GRIT", null, 8);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    break;
                                case 39:
                                    j(false);
                                    final int i24 = 7;
                                    k(new e23.a() { // from class: bq.a
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i110 = i24;
                                            c cVar4 = cVar2;
                                            switch (i110) {
                                                case 0:
                                                    HelpActivity.a aVar6 = HelpActivity.f36653a;
                                                    m mVar2 = cVar4.f19475a;
                                                    l lVar3 = l.RESPIRATION_RATE;
                                                    aVar6.getClass();
                                                    HelpActivity.a.d(mVar2, lVar3, null, null);
                                                    break;
                                                case 1:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.IMPACT_LOAD, null, null, 12);
                                                    break;
                                                case 2:
                                                    HelpActivity.a aVar7 = HelpActivity.f36653a;
                                                    m mVar3 = cVar4.f19475a;
                                                    l lVar4 = l.SKI_POWER;
                                                    aVar7.getClass();
                                                    HelpActivity.a.d(mVar3, lVar4, null, null);
                                                    break;
                                                case 3:
                                                    HelpActivity.a aVar8 = HelpActivity.f36653a;
                                                    m mVar4 = cVar4.f19475a;
                                                    l lVar5 = l.STAMINA;
                                                    aVar8.getClass();
                                                    HelpActivity.a.d(mVar4, lVar5, null, null);
                                                    break;
                                                case 4:
                                                    HelpActivity.a aVar9 = HelpActivity.f36653a;
                                                    m mVar5 = cVar4.f19475a;
                                                    l lVar6 = l.PERFORMANCE_CONDITION;
                                                    aVar9.getClass();
                                                    HelpActivity.a.d(mVar5, lVar6, null, null);
                                                    break;
                                                case 5:
                                                    m mVar6 = cVar4.f19475a;
                                                    int i111 = DragWCdAHelpActivity.f29762c;
                                                    mVar6.startActivity(new Intent(mVar6, (Class<?>) DragWCdAHelpActivity.class));
                                                    break;
                                                case 6:
                                                    HelpActivity.a aVar10 = HelpActivity.f36653a;
                                                    m mVar7 = cVar4.f19475a;
                                                    l lVar7 = l.ACTIVITY_LAP_RACING;
                                                    aVar10.getClass();
                                                    HelpActivity.a.d(mVar7, lVar7, null, null);
                                                    break;
                                                case 7:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "FLOW", null, 8);
                                                    break;
                                                default:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "GRIT", null, 8);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    break;
                                case 40:
                                    j(false);
                                    final int i25 = 8;
                                    k(new e23.a() { // from class: bq.a
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i110 = i25;
                                            c cVar4 = cVar2;
                                            switch (i110) {
                                                case 0:
                                                    HelpActivity.a aVar6 = HelpActivity.f36653a;
                                                    m mVar2 = cVar4.f19475a;
                                                    l lVar3 = l.RESPIRATION_RATE;
                                                    aVar6.getClass();
                                                    HelpActivity.a.d(mVar2, lVar3, null, null);
                                                    break;
                                                case 1:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.IMPACT_LOAD, null, null, 12);
                                                    break;
                                                case 2:
                                                    HelpActivity.a aVar7 = HelpActivity.f36653a;
                                                    m mVar3 = cVar4.f19475a;
                                                    l lVar4 = l.SKI_POWER;
                                                    aVar7.getClass();
                                                    HelpActivity.a.d(mVar3, lVar4, null, null);
                                                    break;
                                                case 3:
                                                    HelpActivity.a aVar8 = HelpActivity.f36653a;
                                                    m mVar4 = cVar4.f19475a;
                                                    l lVar5 = l.STAMINA;
                                                    aVar8.getClass();
                                                    HelpActivity.a.d(mVar4, lVar5, null, null);
                                                    break;
                                                case 4:
                                                    HelpActivity.a aVar9 = HelpActivity.f36653a;
                                                    m mVar5 = cVar4.f19475a;
                                                    l lVar6 = l.PERFORMANCE_CONDITION;
                                                    aVar9.getClass();
                                                    HelpActivity.a.d(mVar5, lVar6, null, null);
                                                    break;
                                                case 5:
                                                    m mVar6 = cVar4.f19475a;
                                                    int i111 = DragWCdAHelpActivity.f29762c;
                                                    mVar6.startActivity(new Intent(mVar6, (Class<?>) DragWCdAHelpActivity.class));
                                                    break;
                                                case 6:
                                                    HelpActivity.a aVar10 = HelpActivity.f36653a;
                                                    m mVar7 = cVar4.f19475a;
                                                    l lVar7 = l.ACTIVITY_LAP_RACING;
                                                    aVar10.getClass();
                                                    HelpActivity.a.d(mVar7, lVar7, null, null);
                                                    break;
                                                case 7:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "FLOW", null, 8);
                                                    break;
                                                default:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "GRIT", null, 8);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    break;
                                case 41:
                                    if (Double.isNaN(dH4)) {
                                        h(false);
                                    } else {
                                        d(pVar.N(), cVar2.a(R.string.lbl_average));
                                    }
                                    String strU = pVar.U();
                                    z0 z0Var = z0.f4390a;
                                    if (z0.b(x0.f4344w2, strU)) {
                                        if (strE4 != null) {
                                            f(strE4, pVar.F0());
                                        } else {
                                            i(false);
                                        }
                                    } else if (Double.isNaN(pVar.V())) {
                                        i(false);
                                    } else {
                                        f(pVar.i3(), pVar.x2());
                                    }
                                    k(new e23.a() { // from class: bq.a
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i110 = i16;
                                            c cVar4 = cVar2;
                                            switch (i110) {
                                                case 0:
                                                    HelpActivity.a aVar6 = HelpActivity.f36653a;
                                                    m mVar2 = cVar4.f19475a;
                                                    l lVar3 = l.RESPIRATION_RATE;
                                                    aVar6.getClass();
                                                    HelpActivity.a.d(mVar2, lVar3, null, null);
                                                    break;
                                                case 1:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.IMPACT_LOAD, null, null, 12);
                                                    break;
                                                case 2:
                                                    HelpActivity.a aVar7 = HelpActivity.f36653a;
                                                    m mVar3 = cVar4.f19475a;
                                                    l lVar4 = l.SKI_POWER;
                                                    aVar7.getClass();
                                                    HelpActivity.a.d(mVar3, lVar4, null, null);
                                                    break;
                                                case 3:
                                                    HelpActivity.a aVar8 = HelpActivity.f36653a;
                                                    m mVar4 = cVar4.f19475a;
                                                    l lVar5 = l.STAMINA;
                                                    aVar8.getClass();
                                                    HelpActivity.a.d(mVar4, lVar5, null, null);
                                                    break;
                                                case 4:
                                                    HelpActivity.a aVar9 = HelpActivity.f36653a;
                                                    m mVar5 = cVar4.f19475a;
                                                    l lVar6 = l.PERFORMANCE_CONDITION;
                                                    aVar9.getClass();
                                                    HelpActivity.a.d(mVar5, lVar6, null, null);
                                                    break;
                                                case 5:
                                                    m mVar6 = cVar4.f19475a;
                                                    int i111 = DragWCdAHelpActivity.f29762c;
                                                    mVar6.startActivity(new Intent(mVar6, (Class<?>) DragWCdAHelpActivity.class));
                                                    break;
                                                case 6:
                                                    HelpActivity.a aVar10 = HelpActivity.f36653a;
                                                    m mVar7 = cVar4.f19475a;
                                                    l lVar7 = l.ACTIVITY_LAP_RACING;
                                                    aVar10.getClass();
                                                    HelpActivity.a.d(mVar7, lVar7, null, null);
                                                    break;
                                                case 7:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "FLOW", null, 8);
                                                    break;
                                                default:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "GRIT", null, 8);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    break;
                                case 42:
                                    j(false);
                                    k(new e23.a() { // from class: bq.a
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i110 = i15;
                                            c cVar4 = cVar2;
                                            switch (i110) {
                                                case 0:
                                                    HelpActivity.a aVar6 = HelpActivity.f36653a;
                                                    m mVar2 = cVar4.f19475a;
                                                    l lVar3 = l.RESPIRATION_RATE;
                                                    aVar6.getClass();
                                                    HelpActivity.a.d(mVar2, lVar3, null, null);
                                                    break;
                                                case 1:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.IMPACT_LOAD, null, null, 12);
                                                    break;
                                                case 2:
                                                    HelpActivity.a aVar7 = HelpActivity.f36653a;
                                                    m mVar3 = cVar4.f19475a;
                                                    l lVar4 = l.SKI_POWER;
                                                    aVar7.getClass();
                                                    HelpActivity.a.d(mVar3, lVar4, null, null);
                                                    break;
                                                case 3:
                                                    HelpActivity.a aVar8 = HelpActivity.f36653a;
                                                    m mVar4 = cVar4.f19475a;
                                                    l lVar5 = l.STAMINA;
                                                    aVar8.getClass();
                                                    HelpActivity.a.d(mVar4, lVar5, null, null);
                                                    break;
                                                case 4:
                                                    HelpActivity.a aVar9 = HelpActivity.f36653a;
                                                    m mVar5 = cVar4.f19475a;
                                                    l lVar6 = l.PERFORMANCE_CONDITION;
                                                    aVar9.getClass();
                                                    HelpActivity.a.d(mVar5, lVar6, null, null);
                                                    break;
                                                case 5:
                                                    m mVar6 = cVar4.f19475a;
                                                    int i111 = DragWCdAHelpActivity.f29762c;
                                                    mVar6.startActivity(new Intent(mVar6, (Class<?>) DragWCdAHelpActivity.class));
                                                    break;
                                                case 6:
                                                    HelpActivity.a aVar10 = HelpActivity.f36653a;
                                                    m mVar7 = cVar4.f19475a;
                                                    l lVar7 = l.ACTIVITY_LAP_RACING;
                                                    aVar10.getClass();
                                                    HelpActivity.a.d(mVar7, lVar7, null, null);
                                                    break;
                                                case 7:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "FLOW", null, 8);
                                                    break;
                                                default:
                                                    HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "GRIT", null, 8);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    break;
                                case 43:
                                    if (Double.isNaN(dH4)) {
                                        h(false);
                                    } else {
                                        d(pVar.N(), cVar2.a(R.string.chart_starting_stress_level_lbl));
                                    }
                                    if (!Double.isNaN(pVar.V())) {
                                        f(pVar.i3(), cVar2.a(R.string.chart_ending_stress_level_lbl));
                                    } else {
                                        i(false);
                                    }
                                    break;
                                default:
                                    switch (iG1) {
                                        case 46:
                                        case 48:
                                            j(false);
                                            if (linearLayout != null) {
                                                linearLayout.setVisibility(0);
                                            }
                                            break;
                                        case 47:
                                            h(true);
                                            i(true);
                                            d(pVar.N(), cVar2.a(R.string.challenge_leaderboard_header_total_label));
                                            f(pVar.i3(), cVar2.a(R.string.lbl_maximum));
                                            break;
                                        case 49:
                                            k(new bb0.d(i18, pVar, cVar2));
                                            j(false);
                                            break;
                                        case 50:
                                        case 52:
                                            if (Double.isNaN(dH4)) {
                                                d(l3.f23124b.p0((int) dH4, mVar), cVar2.a(R.string.lbl_average));
                                            } else {
                                                h(false);
                                            }
                                            dV = pVar.V();
                                            if (!Double.isNaN(dV)) {
                                                i(false);
                                            } else {
                                                f(l3.f23124b.p0((int) dV, mVar), pVar.x2());
                                            }
                                            break;
                                        case 51:
                                            double dH7 = pVar.h4();
                                            double dV3 = pVar.V();
                                            if (Double.isNaN(dH7) || Double.isNaN(dV3)) {
                                                j(false);
                                            } else {
                                                j(true);
                                                d(pVar.N(), cVar2.a(R.string.lbl_average));
                                                f(pVar.i3(), cVar2.a(R.string.lbl_maximum));
                                            }
                                            break;
                                        case 53:
                                            if (Double.isNaN(dH4)) {
                                                h(false);
                                            } else {
                                                d(pVar.N(), cVar2.a(R.string.chart_average_title));
                                            }
                                            i(false);
                                            break;
                                        case 54:
                                            j(true);
                                            if (pVar.e4() == null) {
                                                p005kotlin.jvm.internal.s.m("noData");
                                                throw th3;
                                            }
                                            d(pVar.e4(), cVar2.a(R.string.lbl_stamina_beginning_potential_abr));
                                            if (pVar.i3() == null) {
                                                p005kotlin.jvm.internal.s.m("noData");
                                                throw th3;
                                            }
                                            f(pVar.i3(), cVar2.a(R.string.lbl_stamina_ending_potential_abr));
                                            final int i26 = 3;
                                            k(new e23.a() { // from class: bq.a
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i110 = i26;
                                                    c cVar4 = cVar2;
                                                    switch (i110) {
                                                        case 0:
                                                            HelpActivity.a aVar6 = HelpActivity.f36653a;
                                                            m mVar2 = cVar4.f19475a;
                                                            l lVar3 = l.RESPIRATION_RATE;
                                                            aVar6.getClass();
                                                            HelpActivity.a.d(mVar2, lVar3, null, null);
                                                            break;
                                                        case 1:
                                                            HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.IMPACT_LOAD, null, null, 12);
                                                            break;
                                                        case 2:
                                                            HelpActivity.a aVar7 = HelpActivity.f36653a;
                                                            m mVar3 = cVar4.f19475a;
                                                            l lVar4 = l.SKI_POWER;
                                                            aVar7.getClass();
                                                            HelpActivity.a.d(mVar3, lVar4, null, null);
                                                            break;
                                                        case 3:
                                                            HelpActivity.a aVar8 = HelpActivity.f36653a;
                                                            m mVar4 = cVar4.f19475a;
                                                            l lVar5 = l.STAMINA;
                                                            aVar8.getClass();
                                                            HelpActivity.a.d(mVar4, lVar5, null, null);
                                                            break;
                                                        case 4:
                                                            HelpActivity.a aVar9 = HelpActivity.f36653a;
                                                            m mVar5 = cVar4.f19475a;
                                                            l lVar6 = l.PERFORMANCE_CONDITION;
                                                            aVar9.getClass();
                                                            HelpActivity.a.d(mVar5, lVar6, null, null);
                                                            break;
                                                        case 5:
                                                            m mVar6 = cVar4.f19475a;
                                                            int i111 = DragWCdAHelpActivity.f29762c;
                                                            mVar6.startActivity(new Intent(mVar6, (Class<?>) DragWCdAHelpActivity.class));
                                                            break;
                                                        case 6:
                                                            HelpActivity.a aVar10 = HelpActivity.f36653a;
                                                            m mVar7 = cVar4.f19475a;
                                                            l lVar7 = l.ACTIVITY_LAP_RACING;
                                                            aVar10.getClass();
                                                            HelpActivity.a.d(mVar7, lVar7, null, null);
                                                            break;
                                                        case 7:
                                                            HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "FLOW", null, 8);
                                                            break;
                                                        default:
                                                            HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "GRIT", null, 8);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            });
                                            break;
                                            break;
                                        default:
                                            switch (iG1) {
                                                case 64:
                                                case 67:
                                                case 68:
                                                case 69:
                                                    if (Double.isNaN(dH4)) {
                                                        d(l3.f23124b.p0((int) dH4, mVar), cVar2.a(R.string.lbl_average));
                                                    } else {
                                                        h(false);
                                                    }
                                                    dV = pVar.V();
                                                    if (!Double.isNaN(dV)) {
                                                        i(false);
                                                    } else {
                                                        f(l3.f23124b.p0((int) dV, mVar), pVar.x2());
                                                    }
                                                    break;
                                                case 65:
                                                case 66:
                                                    cVar2.b(this, pVar);
                                                    break;
                                                default:
                                                    cVar2.b(this, pVar);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else if (strE4 == null) {
                    d(strE4, cVar2.a(R.string.lbl_minimum));
                } else {
                    h(false);
                }
            } else if (z0.v(pVar.U())) {
                k(new e23.a() { // from class: bq.a
                    @Override // e23.a
                    public final Object invoke() {
                        int i110 = i14;
                        c cVar4 = cVar2;
                        switch (i110) {
                            case 0:
                                HelpActivity.a aVar6 = HelpActivity.f36653a;
                                m mVar2 = cVar4.f19475a;
                                l lVar3 = l.RESPIRATION_RATE;
                                aVar6.getClass();
                                HelpActivity.a.d(mVar2, lVar3, null, null);
                                break;
                            case 1:
                                HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.IMPACT_LOAD, null, null, 12);
                                break;
                            case 2:
                                HelpActivity.a aVar7 = HelpActivity.f36653a;
                                m mVar3 = cVar4.f19475a;
                                l lVar4 = l.SKI_POWER;
                                aVar7.getClass();
                                HelpActivity.a.d(mVar3, lVar4, null, null);
                                break;
                            case 3:
                                HelpActivity.a aVar8 = HelpActivity.f36653a;
                                m mVar4 = cVar4.f19475a;
                                l lVar5 = l.STAMINA;
                                aVar8.getClass();
                                HelpActivity.a.d(mVar4, lVar5, null, null);
                                break;
                            case 4:
                                HelpActivity.a aVar9 = HelpActivity.f36653a;
                                m mVar5 = cVar4.f19475a;
                                l lVar6 = l.PERFORMANCE_CONDITION;
                                aVar9.getClass();
                                HelpActivity.a.d(mVar5, lVar6, null, null);
                                break;
                            case 5:
                                m mVar6 = cVar4.f19475a;
                                int i111 = DragWCdAHelpActivity.f29762c;
                                mVar6.startActivity(new Intent(mVar6, (Class<?>) DragWCdAHelpActivity.class));
                                break;
                            case 6:
                                HelpActivity.a aVar10 = HelpActivity.f36653a;
                                m mVar7 = cVar4.f19475a;
                                l lVar7 = l.ACTIVITY_LAP_RACING;
                                aVar10.getClass();
                                HelpActivity.a.d(mVar7, lVar7, null, null);
                                break;
                            case 7:
                                HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "FLOW", null, 8);
                                break;
                            default:
                                HelpActivity.a.e(HelpActivity.f36653a, cVar4.f19475a, l.GRIT_FLOW, "GRIT", null, 8);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                h(true);
                i(true);
                d(pVar.N(), cVar2.a(R.string.impact_load));
                f(pVar.N(), cVar2.a(R.string.actual_distance));
            }
            int iG2 = pVar.g1();
            if (iG2 != 32 && iG2 != 93 && iG2 != 94) {
                this.itemView.setOnClickListener(new a61.d0(18, pVar, cVar2));
            }
            ar.e.f(cVar2.f19475a, this.f28969h, this.f28970i, this.f28971j, pVar, (int) cVar2.f19476b, null, cVar2.f19478d, false, null, cVar2.f19477c.get(iG1), cVar);
        }
    }
}
