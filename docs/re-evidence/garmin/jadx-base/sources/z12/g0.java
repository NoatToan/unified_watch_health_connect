package z12;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import com.garmin.android.apps.connectmobile.g3;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lz12/g0;", "Lb32/a;", "Lb32/e;", "<init>", "()V", "b", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends b32.a implements b32.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f201403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Integer> f201404c = new ArrayList<>();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/g0$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {
        public b(ViewGroup viewGroup) {
            super(e5.e(viewGroup, R.layout.user_profile_stats_section_header, viewGroup, false));
            ((TextView) this.itemView.findViewById(R.id.section_header)).setText(R.string.concept_personal_records);
        }
    }

    static {
        new a(null);
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        switch (i14) {
            case 0:
                return new b(viewGroup);
            case 1:
                return new h0(viewGroup);
            case 2:
                return new f0(viewGroup);
            case 3:
                return new b0(viewGroup);
            case 4:
                return new k0(viewGroup);
            case 5:
                return new j0(viewGroup);
            case 6:
                return new d0(viewGroup);
            case 7:
                return new e0(viewGroup);
            default:
                return new b32.b(viewGroup);
        }
    }

    @Override // b32.d
    public final int b() {
        return 8;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        if (cVar instanceof g12.e) {
            this.f201403b = new c0((g12.e) cVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        j12.m mVar;
        f0Var.getClass();
        c0 c0Var = this.f201403b;
        if (c0Var != null) {
            com.garmin.android.apps.connectmobile.userprofile.i iVar = c0Var.f201377a;
            boolean z14 = false;
            switch (getItemViewType(i14)) {
                case 1:
                    h0 h0Var = f0Var instanceof h0 ? (h0) f0Var : null;
                    if (h0Var != null) {
                        TextView textView = h0Var.f61662g;
                        textView.getClass();
                        if (!iVar.y4() && c0Var.d()) {
                            z14 = true;
                        }
                        v22.e.r(textView, z14);
                        CardSummaryRowView cardSummaryRowView = h0Var.f201406h;
                        if (cardSummaryRowView == null) {
                            p005kotlin.jvm.internal.s.m("bestDay");
                            throw null;
                        }
                        a0.a(cardSummaryRowView, c0Var.a(q91.d.f143573t));
                        CardSummaryRowView cardSummaryRowView2 = h0Var.f201407i;
                        if (cardSummaryRowView2 == null) {
                            p005kotlin.jvm.internal.s.m("bestWeek");
                            throw null;
                        }
                        a0.a(cardSummaryRowView2, c0Var.a(q91.d.f143574v));
                        CardSummaryRowView cardSummaryRowView3 = h0Var.f201408j;
                        if (cardSummaryRowView3 == null) {
                            p005kotlin.jvm.internal.s.m("bestMonth");
                            throw null;
                        }
                        a0.a(cardSummaryRowView3, c0Var.a(q91.d.f143575w));
                        CardSummaryRowView cardSummaryRowView4 = h0Var.f201409k;
                        if (cardSummaryRowView4 == null) {
                            p005kotlin.jvm.internal.s.m("currentStreak");
                            throw null;
                        }
                        a0.a(cardSummaryRowView4, c0Var.a(q91.d.f143577y));
                        CardSummaryRowView cardSummaryRowView5 = h0Var.f201410l;
                        if (cardSummaryRowView5 != null) {
                            a0.a(cardSummaryRowView5, c0Var.a(q91.d.f143576x));
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("longestStreak");
                            throw null;
                        }
                    }
                    return;
                case 2:
                    f0 f0Var2 = f0Var instanceof f0 ? (f0) f0Var : null;
                    if (f0Var2 != null) {
                        TextView textView2 = f0Var2.f61662g;
                        textView2.getClass();
                        if (!iVar.y4() && c0Var.d()) {
                            z14 = true;
                        }
                        v22.e.r(textView2, z14);
                        CardSummaryRowView cardSummaryRowView6 = f0Var2.f201395h;
                        if (cardSummaryRowView6 == null) {
                            p005kotlin.jvm.internal.s.m("farthestView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView6, c0Var.a(q91.d.f143568n));
                        CardSummaryRowView cardSummaryRowView7 = f0Var2.f201396i;
                        if (cardSummaryRowView7 == null) {
                            p005kotlin.jvm.internal.s.m("run1KView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView7, c0Var.a(q91.d.f143561h));
                        CardSummaryRowView cardSummaryRowView8 = f0Var2.f201397j;
                        if (cardSummaryRowView8 == null) {
                            p005kotlin.jvm.internal.s.m("runMileView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView8, c0Var.a(q91.d.f143562i));
                        CardSummaryRowView cardSummaryRowView9 = f0Var2.f201398k;
                        if (cardSummaryRowView9 == null) {
                            p005kotlin.jvm.internal.s.m("run5KView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView9, c0Var.a(q91.d.f143563j));
                        CardSummaryRowView cardSummaryRowView10 = f0Var2.f201399l;
                        if (cardSummaryRowView10 == null) {
                            p005kotlin.jvm.internal.s.m("run10KView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView10, c0Var.a(q91.d.f143564k));
                        CardSummaryRowView cardSummaryRowView11 = f0Var2.f201400m;
                        if (cardSummaryRowView11 == null) {
                            p005kotlin.jvm.internal.s.m("runHalfMarathonView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView11, c0Var.a(q91.d.f143566l));
                        CardSummaryRowView cardSummaryRowView12 = f0Var2.f201401n;
                        if (cardSummaryRowView12 != null) {
                            a0.a(cardSummaryRowView12, c0Var.a(q91.d.f143567m));
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("runFullMarathonView");
                            throw null;
                        }
                    }
                    return;
                case 3:
                    b0 b0Var = f0Var instanceof b0 ? (b0) f0Var : null;
                    if (b0Var != null) {
                        TextView textView3 = b0Var.f61662g;
                        textView3.getClass();
                        if (!iVar.y4() && c0Var.d()) {
                            z14 = true;
                        }
                        v22.e.r(textView3, z14);
                        CardSummaryRowView cardSummaryRowView13 = b0Var.f201365h;
                        if (cardSummaryRowView13 == null) {
                            p005kotlin.jvm.internal.s.m("farthestView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView13, c0Var.a(q91.d.f143569o));
                        CardSummaryRowView cardSummaryRowView14 = b0Var.f201366i;
                        if (cardSummaryRowView14 == null) {
                            p005kotlin.jvm.internal.s.m("cycle40KView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView14, c0Var.a(q91.d.f143572r));
                        CardSummaryRowView cardSummaryRowView15 = b0Var.f201367j;
                        if (cardSummaryRowView15 == null) {
                            p005kotlin.jvm.internal.s.m("elevationGainView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView15, c0Var.a(q91.d.f143570p));
                        CardSummaryRowView cardSummaryRowView16 = b0Var.f201368k;
                        if (cardSummaryRowView16 != null) {
                            a0.a(cardSummaryRowView16, c0Var.a(q91.d.f143571q));
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("maxPowerView");
                            throw null;
                        }
                    }
                    return;
                case 4:
                    k0 k0Var = f0Var instanceof k0 ? (k0) f0Var : null;
                    if (k0Var != null) {
                        TextView textView4 = k0Var.f61662g;
                        textView4.getClass();
                        if (!iVar.y4() && c0Var.d()) {
                            z14 = true;
                        }
                        v22.e.r(textView4, z14);
                        CardSummaryRowView cardSummaryRowView17 = k0Var.f201424h;
                        if (cardSummaryRowView17 == null) {
                            p005kotlin.jvm.internal.s.m("swimLongest");
                            throw null;
                        }
                        Context context = cardSummaryRowView17.getContext();
                        context.getClass();
                        q91.d dVar = q91.d.f143578z;
                        String strB = q91.e.b(context, dVar);
                        if (strB == null) {
                            strB = "";
                        }
                        cardSummaryRowView17.setRowName(strB);
                        CardSummaryRowView cardSummaryRowView18 = k0Var.f201424h;
                        if (cardSummaryRowView18 == null) {
                            p005kotlin.jvm.internal.s.m("swimLongest");
                            throw null;
                        }
                        a0.a(cardSummaryRowView18, c0Var.a(dVar));
                        CardSummaryRowView cardSummaryRowView19 = k0Var.f201425i;
                        if (cardSummaryRowView19 == null) {
                            p005kotlin.jvm.internal.s.m("swim100M");
                            throw null;
                        }
                        Context context2 = cardSummaryRowView19.getContext();
                        context2.getClass();
                        q91.d dVar2 = q91.d.A;
                        String strB2 = q91.e.b(context2, dVar2);
                        if (strB2 == null) {
                            strB2 = "";
                        }
                        cardSummaryRowView19.setRowName(strB2);
                        CardSummaryRowView cardSummaryRowView20 = k0Var.f201425i;
                        if (cardSummaryRowView20 == null) {
                            p005kotlin.jvm.internal.s.m("swim100M");
                            throw null;
                        }
                        a0.a(cardSummaryRowView20, c0Var.a(dVar2));
                        CardSummaryRowView cardSummaryRowView21 = k0Var.f201426j;
                        if (cardSummaryRowView21 == null) {
                            p005kotlin.jvm.internal.s.m("swim100Yd");
                            throw null;
                        }
                        Context context3 = cardSummaryRowView21.getContext();
                        context3.getClass();
                        q91.d dVar3 = q91.d.B;
                        String strB3 = q91.e.b(context3, dVar3);
                        if (strB3 == null) {
                            strB3 = "";
                        }
                        cardSummaryRowView21.setRowName(strB3);
                        CardSummaryRowView cardSummaryRowView22 = k0Var.f201426j;
                        if (cardSummaryRowView22 == null) {
                            p005kotlin.jvm.internal.s.m("swim100Yd");
                            throw null;
                        }
                        a0.a(cardSummaryRowView22, c0Var.a(dVar3));
                        CardSummaryRowView cardSummaryRowView23 = k0Var.f201427k;
                        if (cardSummaryRowView23 == null) {
                            p005kotlin.jvm.internal.s.m("swim400M");
                            throw null;
                        }
                        Context context4 = cardSummaryRowView23.getContext();
                        context4.getClass();
                        q91.d dVar4 = q91.d.C;
                        String strB4 = q91.e.b(context4, dVar4);
                        if (strB4 == null) {
                            strB4 = "";
                        }
                        cardSummaryRowView23.setRowName(strB4);
                        CardSummaryRowView cardSummaryRowView24 = k0Var.f201427k;
                        if (cardSummaryRowView24 == null) {
                            p005kotlin.jvm.internal.s.m("swim400M");
                            throw null;
                        }
                        a0.a(cardSummaryRowView24, c0Var.a(dVar4));
                        CardSummaryRowView cardSummaryRowView25 = k0Var.f201428l;
                        if (cardSummaryRowView25 == null) {
                            p005kotlin.jvm.internal.s.m("swim500Yd");
                            throw null;
                        }
                        Context context5 = cardSummaryRowView25.getContext();
                        context5.getClass();
                        q91.d dVar5 = q91.d.D;
                        String strB5 = q91.e.b(context5, dVar5);
                        if (strB5 == null) {
                            strB5 = "";
                        }
                        cardSummaryRowView25.setRowName(strB5);
                        CardSummaryRowView cardSummaryRowView26 = k0Var.f201428l;
                        if (cardSummaryRowView26 == null) {
                            p005kotlin.jvm.internal.s.m("swim500Yd");
                            throw null;
                        }
                        a0.a(cardSummaryRowView26, c0Var.a(dVar5));
                        CardSummaryRowView cardSummaryRowView27 = k0Var.f201429m;
                        if (cardSummaryRowView27 == null) {
                            p005kotlin.jvm.internal.s.m("swim750M");
                            throw null;
                        }
                        Context context6 = cardSummaryRowView27.getContext();
                        context6.getClass();
                        q91.d dVar6 = q91.d.E;
                        String strB6 = q91.e.b(context6, dVar6);
                        if (strB6 == null) {
                            strB6 = "";
                        }
                        cardSummaryRowView27.setRowName(strB6);
                        CardSummaryRowView cardSummaryRowView28 = k0Var.f201429m;
                        if (cardSummaryRowView28 == null) {
                            p005kotlin.jvm.internal.s.m("swim750M");
                            throw null;
                        }
                        a0.a(cardSummaryRowView28, c0Var.a(dVar6));
                        CardSummaryRowView cardSummaryRowView29 = k0Var.f201430n;
                        if (cardSummaryRowView29 == null) {
                            p005kotlin.jvm.internal.s.m("swim1000M");
                            throw null;
                        }
                        Context context7 = cardSummaryRowView29.getContext();
                        context7.getClass();
                        q91.d dVar7 = q91.d.F;
                        String strB7 = q91.e.b(context7, dVar7);
                        if (strB7 == null) {
                            strB7 = "";
                        }
                        cardSummaryRowView29.setRowName(strB7);
                        CardSummaryRowView cardSummaryRowView30 = k0Var.f201430n;
                        if (cardSummaryRowView30 == null) {
                            p005kotlin.jvm.internal.s.m("swim1000M");
                            throw null;
                        }
                        a0.a(cardSummaryRowView30, c0Var.a(dVar7));
                        CardSummaryRowView cardSummaryRowView31 = k0Var.f201431o;
                        if (cardSummaryRowView31 == null) {
                            p005kotlin.jvm.internal.s.m("swim1000Yd");
                            throw null;
                        }
                        Context context8 = cardSummaryRowView31.getContext();
                        context8.getClass();
                        q91.d dVar8 = q91.d.I;
                        String strB8 = q91.e.b(context8, dVar8);
                        if (strB8 == null) {
                            strB8 = "";
                        }
                        cardSummaryRowView31.setRowName(strB8);
                        CardSummaryRowView cardSummaryRowView32 = k0Var.f201431o;
                        if (cardSummaryRowView32 == null) {
                            p005kotlin.jvm.internal.s.m("swim1000Yd");
                            throw null;
                        }
                        a0.a(cardSummaryRowView32, c0Var.a(dVar8));
                        CardSummaryRowView cardSummaryRowView33 = k0Var.f201432p;
                        if (cardSummaryRowView33 == null) {
                            p005kotlin.jvm.internal.s.m("swim1500M");
                            throw null;
                        }
                        Context context9 = cardSummaryRowView33.getContext();
                        context9.getClass();
                        q91.d dVar9 = q91.d.P;
                        String strB9 = q91.e.b(context9, dVar9);
                        if (strB9 == null) {
                            strB9 = "";
                        }
                        cardSummaryRowView33.setRowName(strB9);
                        CardSummaryRowView cardSummaryRowView34 = k0Var.f201432p;
                        if (cardSummaryRowView34 == null) {
                            p005kotlin.jvm.internal.s.m("swim1500M");
                            throw null;
                        }
                        a0.a(cardSummaryRowView34, c0Var.a(dVar9));
                        CardSummaryRowView cardSummaryRowView35 = k0Var.f201433q;
                        if (cardSummaryRowView35 == null) {
                            p005kotlin.jvm.internal.s.m("swim1650Yd");
                            throw null;
                        }
                        CardSummaryRowView cardSummaryRowView36 = k0Var.f201426j;
                        if (cardSummaryRowView36 == null) {
                            p005kotlin.jvm.internal.s.m("swim100Yd");
                            throw null;
                        }
                        Context context10 = cardSummaryRowView36.getContext();
                        context10.getClass();
                        q91.d dVar10 = q91.d.T;
                        String strB10 = q91.e.b(context10, dVar10);
                        cardSummaryRowView35.setRowName(strB10 != null ? strB10 : "");
                        CardSummaryRowView cardSummaryRowView37 = k0Var.f201433q;
                        if (cardSummaryRowView37 != null) {
                            a0.a(cardSummaryRowView37, c0Var.a(dVar10));
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("swim1650Yd");
                            throw null;
                        }
                    }
                    return;
                case 5:
                    j0 j0Var = f0Var instanceof j0 ? (j0) f0Var : null;
                    if (j0Var != null) {
                        if (iVar.y4() || !c0Var.d()) {
                            j0Var.f61662g.setVisibility(8);
                        } else {
                            j0Var.f61662g.setVisibility(0);
                        }
                        g3 g3Var = (g3) iVar.f46759k.d();
                        com.garmin.android.apps.connectmobile.repcounting.model.f exerciseTranslations = (g3Var == null || (mVar = (j12.m) g3Var.f35301b) == null) ? null : mVar.getExerciseTranslations();
                        List<q91.d> listK = p13.x.k(q91.d.X, q91.d.Y, q91.d.Z, q91.d.f143565k0, q91.d.H0, q91.d.U0, q91.d.Z0, q91.d.f143555a1, q91.d.V0, q91.d.X0, q91.d.W0, q91.d.Y0);
                        ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
                        for (q91.d dVar11 : listK) {
                            arrayList.add(new o13.p(dVar11, q91.e.a(dVar11, exerciseTranslations)));
                        }
                        for (o13.p pVar : p13.h0.N0(arrayList, new i0())) {
                            LinearLayout linearLayout = j0Var.f201422h;
                            if (linearLayout == null) {
                                p005kotlin.jvm.internal.s.m("rowViewsContainer");
                                throw null;
                            }
                            CardSummaryRowView cardSummaryRowView38 = new CardSummaryRowView(linearLayout.getContext());
                            cardSummaryRowView38.setRowType(1);
                            LinearLayout linearLayout2 = j0Var.f201422h;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("rowViewsContainer");
                                throw null;
                            }
                            linearLayout2.addView(cardSummaryRowView38, new LinearLayout.LayoutParams(-1, -2));
                            q91.d dVar12 = (q91.d) pVar.f128594a;
                            cardSummaryRowView38.setRowName((String) pVar.f128595b);
                            a0.a(cardSummaryRowView38, c0Var.a(dVar12));
                        }
                        return;
                    }
                    return;
                case 6:
                    d0 d0Var = f0Var instanceof d0 ? (d0) f0Var : null;
                    if (d0Var != null) {
                        if (!iVar.y4() && c0Var.d()) {
                            z14 = true;
                        }
                        TextView textView5 = d0Var.f61662g;
                        textView5.getClass();
                        v22.e.v(textView5, z14);
                        CardSummaryRowView cardSummaryRowView39 = d0Var.f201378h;
                        if (cardSummaryRowView39 == null) {
                            p005kotlin.jvm.internal.s.m("oneKView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView39, c0Var.a(q91.d.N0));
                        CardSummaryRowView cardSummaryRowView40 = d0Var.f201379i;
                        if (cardSummaryRowView40 == null) {
                            p005kotlin.jvm.internal.s.m("oneMileView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView40, c0Var.a(q91.d.O0));
                        CardSummaryRowView cardSummaryRowView41 = d0Var.f201380j;
                        if (cardSummaryRowView41 == null) {
                            p005kotlin.jvm.internal.s.m("fiveKView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView41, c0Var.a(q91.d.P0));
                        CardSummaryRowView cardSummaryRowView42 = d0Var.f201381k;
                        if (cardSummaryRowView42 == null) {
                            p005kotlin.jvm.internal.s.m("tenKView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView42, c0Var.a(q91.d.Q0));
                        CardSummaryRowView cardSummaryRowView43 = d0Var.f201382l;
                        if (cardSummaryRowView43 == null) {
                            p005kotlin.jvm.internal.s.m("halfMarathonView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView43, c0Var.a(q91.d.R0));
                        CardSummaryRowView cardSummaryRowView44 = d0Var.f201383m;
                        if (cardSummaryRowView44 == null) {
                            p005kotlin.jvm.internal.s.m("marathonView");
                            throw null;
                        }
                        a0.a(cardSummaryRowView44, c0Var.a(q91.d.S0));
                        CardSummaryRowView cardSummaryRowView45 = d0Var.f201384n;
                        if (cardSummaryRowView45 != null) {
                            a0.a(cardSummaryRowView45, c0Var.a(q91.d.T0));
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("farthestView");
                            throw null;
                        }
                    }
                    return;
                case 7:
                    e0 e0Var = f0Var instanceof e0 ? (e0) f0Var : null;
                    if (e0Var != null) {
                        if (!iVar.y4() && c0Var.d()) {
                            z14 = true;
                        }
                        TextView textView6 = e0Var.f61662g;
                        textView6.getClass();
                        v22.e.v(textView6, z14);
                        CardSummaryRowView cardSummaryRowView46 = e0Var.f201388h;
                        if (cardSummaryRowView46 == null) {
                            p005kotlin.jvm.internal.s.m("bestDay");
                            throw null;
                        }
                        a0.a(cardSummaryRowView46, c0Var.a(q91.d.I0));
                        CardSummaryRowView cardSummaryRowView47 = e0Var.f201389i;
                        if (cardSummaryRowView47 == null) {
                            p005kotlin.jvm.internal.s.m("bestWeek");
                            throw null;
                        }
                        a0.a(cardSummaryRowView47, c0Var.a(q91.d.J0));
                        CardSummaryRowView cardSummaryRowView48 = e0Var.f201390j;
                        if (cardSummaryRowView48 == null) {
                            p005kotlin.jvm.internal.s.m("bestMonth");
                            throw null;
                        }
                        a0.a(cardSummaryRowView48, c0Var.a(q91.d.K0));
                        CardSummaryRowView cardSummaryRowView49 = e0Var.f201391k;
                        if (cardSummaryRowView49 == null) {
                            p005kotlin.jvm.internal.s.m("currentStreak");
                            throw null;
                        }
                        a0.a(cardSummaryRowView49, c0Var.a(q91.d.M0));
                        CardSummaryRowView cardSummaryRowView50 = e0Var.f201392l;
                        if (cardSummaryRowView50 != null) {
                            a0.a(cardSummaryRowView50, c0Var.a(q91.d.L0));
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("longestStreak");
                            throw null;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // b32.a, b32.d
    public final void e(b32.c cVar) {
        cVar.getClass();
        ArrayList<Integer> arrayList = this.f201404c;
        arrayList.clear();
        c0 c0Var = this.f201403b;
        if (c0Var != null && c0Var.c(q91.g.PUSHES)) {
            arrayList.add(7);
        }
        c0 c0Var2 = this.f201403b;
        if (c0Var2 != null && c0Var2.c(q91.g.PARASPORTS)) {
            arrayList.add(6);
        }
        c0 c0Var3 = this.f201403b;
        if (c0Var3 != null && c0Var3.c(q91.g.STEPS)) {
            arrayList.add(1);
        }
        c0 c0Var4 = this.f201403b;
        if (c0Var4 != null && c0Var4.c(q91.g.RUNNING)) {
            arrayList.add(2);
        }
        c0 c0Var5 = this.f201403b;
        if (c0Var5 != null && c0Var5.c(q91.g.CYCLING)) {
            arrayList.add(3);
        }
        c0 c0Var6 = this.f201403b;
        if (c0Var6 != null && c0Var6.c(q91.g.SWIMMING)) {
            arrayList.add(4);
        }
        c0 c0Var7 = this.f201403b;
        if (c0Var7 != null && c0Var7.c(q91.g.TRAINING)) {
            arrayList.add(5);
        }
        if (arrayList.size() > 0) {
            arrayList.add(0, 0);
        }
    }

    @Override // b32.d
    public final int getItemCount() {
        return this.f201404c.size();
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        Integer num = this.f201404c.get(i14);
        num.getClass();
        return num.intValue();
    }

    @Override // b32.a, b32.d
    /* JADX INFO: renamed from: isVisible */
    public final boolean getF120672c() {
        j12.j jVarB;
        c0 c0Var = this.f201403b;
        return (c0Var == null || (jVarB = c0Var.b()) == null || (!c0Var.f201377a.x4() && !jVarB.getIsShowPersonalRecords())) ? false : true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lz12/g0$a;", "", "<init>", "()V", "", "ITEM_HEADER", "I", "ITEM_STEPS", "ITEM_RUNNING", "ITEM_CYCLING", "ITEM_SWIMMING", "ITEM_STRENGTH", "ITEM_PARASPORTS", "ITEM_PUSHES", "ITEM_TYPE_COUNT", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
