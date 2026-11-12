package ew1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import c22.l3;
import c22.q3;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.events.components.GCMEditTextTrainingInitiative;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import i3.e5;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.w3;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lew1/n;", "Lew1/u;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u {
    public static final a C = new a(null);
    public static int D = 1740;
    public final h A;
    public final c B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ComposeView f66591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f66592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMEditTextTrainingInitiative f66593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexTwoLineButton f66594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexTwoLineButton f66595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexTwoLineButton f66596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f66597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f66598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f66599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f66600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f66601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AppCompatButton f66602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f66603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f66604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f66605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f66606r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f66607t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f66608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f66609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t41.a f66610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h f66611y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final h f66612z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f66614b;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66613a = iArr;
            int[] iArr2 = new int[gg0.h.values().length];
            try {
                iArr2[gg0.h.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[gg0.h.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f66614b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/n$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = n.C;
            n nVar = n.this;
            if (!nVar.y6().f13385r1) {
                nVar.y6().E7(null);
            }
            nVar.B.f(false);
            nVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66616a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66616a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66616a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66617a = aVar;
            this.f66618b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66617a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66618b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f66619a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66619a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [ew1.h] */
    /* JADX WARN: Type inference failed for: r0v12, types: [ew1.h] */
    /* JADX WARN: Type inference failed for: r0v13, types: [ew1.h] */
    public n() {
        super(R.layout.fbta_goal_setup_frag);
        this.f66590b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new d(this), new f(this), new e(null, this));
        this.f66605q = AbstractComponentTracker.LINGERING_TIMEOUT;
        this.f66608v = 600L;
        this.f66609w = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? 2.5833d : 2.68224d;
        this.f66610x = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? t41.a.KILOMETER : t41.a.MILE;
        final int i14 = 0;
        this.f66611y = new androidx.lifecycle.z0(this) { // from class: ew1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f66492b;

            {
                this.f66492b = this;
            }

            /* JADX WARN: Code duplicated, block: B:147:0x02b1  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                String string;
                double dDoubleValue;
                double d14;
                Object objValueOf;
                String strC;
                int i15 = i14;
                boolean z14 = true;
                n nVar = this.f66492b;
                switch (i15) {
                    case 0:
                        jv1.r rVar = (jv1.r) obj;
                        n.a aVar = n.C;
                        rVar.getClass();
                        nVar.f66608v = nVar.y6().f13384q1 ? 374L : 600L;
                        vt1.e eVar = rVar.f101116a;
                        jv1.h hVar = rVar.f101118c;
                        jv1.m mVar = rVar.f101121f;
                        if (eVar == vt1.e.ACHIEVE_A_MILESTONE) {
                            AppCompatButton appCompatButton = nVar.f66602n;
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("nextButton");
                                throw null;
                            }
                            appCompatButton.setText(nVar.getString(R.string.lbl_next));
                        }
                        vt1.o oVar = rVar.f101117b;
                        vt1.o oVar2 = vt1.o.f180175f;
                        GCMComplexTwoLineButton gCMComplexTwoLineButton = nVar.f66595g;
                        int i16 = 0;
                        if (oVar == oVar2) {
                            if (gCMComplexTwoLineButton == null) {
                                p005kotlin.jvm.internal.s.m("goalPace");
                                throw null;
                            }
                            gCMComplexTwoLineButton.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = nVar.f66596h;
                            if (gCMComplexTwoLineButton2 == null) {
                                p005kotlin.jvm.internal.s.m("goalSpeed");
                                throw null;
                            }
                            gCMComplexTwoLineButton2.setVisibility(8);
                            boolean z15 = hVar instanceof jv1.i;
                            TextView textView = nVar.f66601m;
                            if (z15) {
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView.setText(nVar.getString(R.string.enter_goal_distance_or_pace));
                                string = nVar.getString(R.string.goal_distance_question);
                                string.getClass();
                            } else {
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView.setText(nVar.getString(R.string.enter_goal_time_or_pace));
                                string = nVar.getString(R.string.goal_finish_time_question);
                                string.getClass();
                            }
                        } else {
                            if (gCMComplexTwoLineButton == null) {
                                p005kotlin.jvm.internal.s.m("goalPace");
                                throw null;
                            }
                            gCMComplexTwoLineButton.setVisibility(8);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = nVar.f66596h;
                            if (gCMComplexTwoLineButton3 == null) {
                                p005kotlin.jvm.internal.s.m("goalSpeed");
                                throw null;
                            }
                            gCMComplexTwoLineButton3.setVisibility(0);
                            boolean z16 = hVar instanceof jv1.i;
                            TextView textView2 = nVar.f66601m;
                            if (z16) {
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView2.setText(nVar.getString(R.string.enter_goal_distance_or_speed));
                                string = nVar.getString(R.string.goal_distance_question);
                                string.getClass();
                            } else {
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView2.setText(nVar.getString(R.string.enter_goal_time_or_speed));
                                string = nVar.getString(R.string.goal_finish_time_question);
                                string.getClass();
                            }
                        }
                        ComposeView composeView = nVar.f66591c;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("wizardHeaderContainer");
                            throw null;
                        }
                        composeView.setViewCompositionStrategy(w3.d.f91628b);
                        composeView.setContent(new z3.e(-2056637410, true, new j(nVar, string, i16)));
                        jv1.m mVar2 = rVar.f101120e;
                        Double d15 = mVar2 != null ? mVar2.f101076a : null;
                        gg0.i iVar = mVar2 != null ? mVar2.f101077b : null;
                        if (d15 == null || iVar == null) {
                            return;
                        }
                        gg0.h hVar2 = mVar2.f101078c;
                        int i17 = hVar2 == null ? -1 : n.b.f66614b[hVar2.ordinal()];
                        if (i17 == 1) {
                            double dDoubleValue2 = d15.doubleValue();
                            og0.a aVar2 = og0.a.f131967a;
                            aVar2.getClass();
                            double dG = og0.a.g(dDoubleValue2, iVar);
                            nVar.f66606r = dG;
                            TextView textView3 = nVar.f66600l;
                            if (textView3 == null) {
                                p005kotlin.jvm.internal.s.m("textViewUnitValue");
                                throw null;
                            }
                            textView3.setText(og0.a.i(aVar2, dG));
                            TextView textView4 = nVar.f66599k;
                            if (textView4 == null) {
                                p005kotlin.jvm.internal.s.m("textViewUnitType");
                                throw null;
                            }
                            Context contextRequireContext = nVar.requireContext();
                            contextRequireContext.getClass();
                            textView4.setText(og0.a.q(contextRequireContext));
                            TextView textView5 = nVar.f66598j;
                            if (textView5 == null) {
                                p005kotlin.jvm.internal.s.m("textViewUnit");
                                throw null;
                            }
                            textView5.setText(nVar.getString(R.string.event_distance));
                            nVar.H6();
                            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = nVar.f66592d;
                            if (gCMComplexTwoLineButton4 == null) {
                                p005kotlin.jvm.internal.s.m("goalTimeView");
                                throw null;
                            }
                            gCMComplexTwoLineButton4.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton5 = nVar.f66592d;
                            if (gCMComplexTwoLineButton5 == null) {
                                p005kotlin.jvm.internal.s.m("goalTimeView");
                                throw null;
                            }
                            gCMComplexTwoLineButton5.setButtonTopLabel(nVar.getString(R.string.lbl_goal_time));
                            GCMComplexTwoLineButton gCMComplexTwoLineButton6 = nVar.f66592d;
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("goalTimeView");
                                throw null;
                            }
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(nVar.getString(R.string.enter_goal_time));
                            n.D = (int) (((double) 600) * ((nVar.f66606r / ((double) 1000)) / ((nVar.f66610x == t41.a.KILOMETER ? 1 : 0) != 0 ? 1.0d : 1.609344d)));
                            if (mVar != null) {
                                Double d16 = mVar.f101076a;
                                double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
                                nVar.f66607t = dDoubleValue3;
                                nVar.G6((long) dDoubleValue3);
                                nVar.F6(true);
                                return;
                            }
                            return;
                        }
                        if (i17 != 2) {
                            return;
                        }
                        double dDoubleValue4 = d15.doubleValue();
                        og0.a.f131967a.getClass();
                        double dJ = og0.a.j(dDoubleValue4, iVar);
                        nVar.f66607t = dJ;
                        TextView textView6 = nVar.f66600l;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("textViewUnitValue");
                            throw null;
                        }
                        l3.f23124b.getClass();
                        textView6.setText(l3.a.e1((long) dJ));
                        TextView textView7 = nVar.f66600l;
                        if (textView7 == null) {
                            p005kotlin.jvm.internal.s.m("textViewUnitValue");
                            throw null;
                        }
                        Context contextRequireContext2 = nVar.requireContext();
                        contextRequireContext2.getClass();
                        textView7.setContentDescription(l3.a.k1(new l22.a(contextRequireContext2), true, (int) nVar.f66607t));
                        TextView textView8 = nVar.f66598j;
                        if (textView8 == null) {
                            p005kotlin.jvm.internal.s.m("textViewUnit");
                            throw null;
                        }
                        textView8.setText(nVar.getString(R.string.event_time));
                        nVar.H6();
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = nVar.f66594f;
                        if (gCMComplexTwoLineButton7 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton7.setButtonBottomLeftLabel(nVar.getString(R.string.enter_goal_distance));
                        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = nVar.f66594f;
                        if (gCMComplexTwoLineButton8 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton8.setVisibility(0);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton9 = nVar.f66594f;
                        if (gCMComplexTwoLineButton9 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton9.setButtonBottomLeftLabel(nVar.getString(R.string.enter_goal_distance));
                        if (mVar != null) {
                            Double d17 = mVar.f101076a;
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                dDoubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                                d14 = 1000.0d;
                            } else {
                                dDoubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                                d14 = 1609.344d;
                            }
                            nVar.f66606r = dDoubleValue * d14;
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = nVar.f66594f;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("goalDistance");
                                throw null;
                            }
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            if (d17 != null) {
                                objValueOf = new DecimalFormat("0.00").format(d17.doubleValue());
                                objValueOf.getClass();
                            } else {
                                objValueOf = Double.valueOf(0.0d);
                            }
                            gg0.i iVar2 = mVar.f101077b;
                            if (iVar2 != null) {
                                Context contextRequireContext3 = nVar.requireContext();
                                contextRequireContext3.getClass();
                                strC = iVar2.c(contextRequireContext3);
                            } else {
                                strC = null;
                            }
                            gCMComplexTwoLineButton10.setButtonBottomLeftLabel(String.format("%s %s", Arrays.copyOf(new Object[]{objValueOf, strC}, 2)));
                        }
                        nVar.F6(false);
                        AppCompatButton appCompatButton2 = nVar.f66602n;
                        if (appCompatButton2 == null) {
                            p005kotlin.jvm.internal.s.m("nextButton");
                            throw null;
                        }
                        if (nVar.y6().O6()) {
                            if (nVar.f66607t <= 0.0d || nVar.f66606r <= 0.0d) {
                                z14 = false;
                            }
                        } else if (mVar == null || nVar.f66606r <= 0.0d) {
                            z14 = false;
                        } else {
                            Double d18 = mVar.f101076a;
                            if (!n.C6(d18 != null ? d18.doubleValue() : 0.0d, mVar.f101077b == gg0.i.KILOMETER)) {
                                z14 = false;
                            }
                        }
                        appCompatButton2.setEnabled(z14);
                        return;
                    case 1:
                        g3 g3Var = (g3) obj;
                        n.a aVar3 = n.C;
                        if (g3Var != null) {
                            int i18 = n.b.f66613a[g3Var.f35300a.ordinal()];
                            if (i18 == 1) {
                                jv1.e eVar2 = (jv1.e) g3Var.f35301b;
                                if (eVar2 == null || !eVar2.f101032a) {
                                    nVar.w6();
                                } else {
                                    nVar.y6().g7();
                                }
                                g22.e.f(nVar);
                            } else if (i18 == 2) {
                                g22.e.f(nVar);
                            } else {
                                if (i18 != 3) {
                                    lc.u0.r();
                                    return;
                                }
                                g22.e.l(nVar);
                            }
                            nVar.y6().s7();
                            return;
                        }
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        n.a aVar4 = n.C;
                        fw.p pVar = g3Var2 != null ? g3Var2.f35300a : null;
                        int i19 = pVar == null ? -1 : n.b.f66613a[pVar.ordinal()];
                        if (i19 == 1) {
                            g22.e.f(nVar);
                            jv1.f fVar = (jv1.f) g3Var2.f35301b;
                            if (fVar != null) {
                                nVar.y6().r7(fVar);
                                return;
                            }
                            return;
                        }
                        if (i19 != 2) {
                            if (i19 != 3) {
                                return;
                            }
                            g22.e.l(nVar);
                            return;
                        } else {
                            g22.e.f(nVar);
                            g22.e.a(nVar, null);
                            nVar.y6().l5();
                            return;
                        }
                }
            }
        };
        final int i15 = 1;
        this.f66612z = new androidx.lifecycle.z0(this) { // from class: ew1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f66492b;

            {
                this.f66492b = this;
            }

            /* JADX WARN: Code duplicated, block: B:147:0x02b1  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                String string;
                double dDoubleValue;
                double d14;
                Object objValueOf;
                String strC;
                int i16 = i15;
                boolean z14 = true;
                n nVar = this.f66492b;
                switch (i16) {
                    case 0:
                        jv1.r rVar = (jv1.r) obj;
                        n.a aVar = n.C;
                        rVar.getClass();
                        nVar.f66608v = nVar.y6().f13384q1 ? 374L : 600L;
                        vt1.e eVar = rVar.f101116a;
                        jv1.h hVar = rVar.f101118c;
                        jv1.m mVar = rVar.f101121f;
                        if (eVar == vt1.e.ACHIEVE_A_MILESTONE) {
                            AppCompatButton appCompatButton = nVar.f66602n;
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("nextButton");
                                throw null;
                            }
                            appCompatButton.setText(nVar.getString(R.string.lbl_next));
                        }
                        vt1.o oVar = rVar.f101117b;
                        vt1.o oVar2 = vt1.o.f180175f;
                        GCMComplexTwoLineButton gCMComplexTwoLineButton = nVar.f66595g;
                        int i17 = 0;
                        if (oVar == oVar2) {
                            if (gCMComplexTwoLineButton == null) {
                                p005kotlin.jvm.internal.s.m("goalPace");
                                throw null;
                            }
                            gCMComplexTwoLineButton.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = nVar.f66596h;
                            if (gCMComplexTwoLineButton2 == null) {
                                p005kotlin.jvm.internal.s.m("goalSpeed");
                                throw null;
                            }
                            gCMComplexTwoLineButton2.setVisibility(8);
                            boolean z15 = hVar instanceof jv1.i;
                            TextView textView = nVar.f66601m;
                            if (z15) {
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView.setText(nVar.getString(R.string.enter_goal_distance_or_pace));
                                string = nVar.getString(R.string.goal_distance_question);
                                string.getClass();
                            } else {
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView.setText(nVar.getString(R.string.enter_goal_time_or_pace));
                                string = nVar.getString(R.string.goal_finish_time_question);
                                string.getClass();
                            }
                        } else {
                            if (gCMComplexTwoLineButton == null) {
                                p005kotlin.jvm.internal.s.m("goalPace");
                                throw null;
                            }
                            gCMComplexTwoLineButton.setVisibility(8);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = nVar.f66596h;
                            if (gCMComplexTwoLineButton3 == null) {
                                p005kotlin.jvm.internal.s.m("goalSpeed");
                                throw null;
                            }
                            gCMComplexTwoLineButton3.setVisibility(0);
                            boolean z16 = hVar instanceof jv1.i;
                            TextView textView2 = nVar.f66601m;
                            if (z16) {
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView2.setText(nVar.getString(R.string.enter_goal_distance_or_speed));
                                string = nVar.getString(R.string.goal_distance_question);
                                string.getClass();
                            } else {
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView2.setText(nVar.getString(R.string.enter_goal_time_or_speed));
                                string = nVar.getString(R.string.goal_finish_time_question);
                                string.getClass();
                            }
                        }
                        ComposeView composeView = nVar.f66591c;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("wizardHeaderContainer");
                            throw null;
                        }
                        composeView.setViewCompositionStrategy(w3.d.f91628b);
                        composeView.setContent(new z3.e(-2056637410, true, new j(nVar, string, i17)));
                        jv1.m mVar2 = rVar.f101120e;
                        Double d15 = mVar2 != null ? mVar2.f101076a : null;
                        gg0.i iVar = mVar2 != null ? mVar2.f101077b : null;
                        if (d15 == null || iVar == null) {
                            return;
                        }
                        gg0.h hVar2 = mVar2.f101078c;
                        int i18 = hVar2 == null ? -1 : n.b.f66614b[hVar2.ordinal()];
                        if (i18 == 1) {
                            double dDoubleValue2 = d15.doubleValue();
                            og0.a aVar2 = og0.a.f131967a;
                            aVar2.getClass();
                            double dG = og0.a.g(dDoubleValue2, iVar);
                            nVar.f66606r = dG;
                            TextView textView3 = nVar.f66600l;
                            if (textView3 == null) {
                                p005kotlin.jvm.internal.s.m("textViewUnitValue");
                                throw null;
                            }
                            textView3.setText(og0.a.i(aVar2, dG));
                            TextView textView4 = nVar.f66599k;
                            if (textView4 == null) {
                                p005kotlin.jvm.internal.s.m("textViewUnitType");
                                throw null;
                            }
                            Context contextRequireContext = nVar.requireContext();
                            contextRequireContext.getClass();
                            textView4.setText(og0.a.q(contextRequireContext));
                            TextView textView5 = nVar.f66598j;
                            if (textView5 == null) {
                                p005kotlin.jvm.internal.s.m("textViewUnit");
                                throw null;
                            }
                            textView5.setText(nVar.getString(R.string.event_distance));
                            nVar.H6();
                            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = nVar.f66592d;
                            if (gCMComplexTwoLineButton4 == null) {
                                p005kotlin.jvm.internal.s.m("goalTimeView");
                                throw null;
                            }
                            gCMComplexTwoLineButton4.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton5 = nVar.f66592d;
                            if (gCMComplexTwoLineButton5 == null) {
                                p005kotlin.jvm.internal.s.m("goalTimeView");
                                throw null;
                            }
                            gCMComplexTwoLineButton5.setButtonTopLabel(nVar.getString(R.string.lbl_goal_time));
                            GCMComplexTwoLineButton gCMComplexTwoLineButton6 = nVar.f66592d;
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("goalTimeView");
                                throw null;
                            }
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(nVar.getString(R.string.enter_goal_time));
                            n.D = (int) (((double) 600) * ((nVar.f66606r / ((double) 1000)) / ((nVar.f66610x == t41.a.KILOMETER ? 1 : 0) != 0 ? 1.0d : 1.609344d)));
                            if (mVar != null) {
                                Double d16 = mVar.f101076a;
                                double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
                                nVar.f66607t = dDoubleValue3;
                                nVar.G6((long) dDoubleValue3);
                                nVar.F6(true);
                                return;
                            }
                            return;
                        }
                        if (i18 != 2) {
                            return;
                        }
                        double dDoubleValue4 = d15.doubleValue();
                        og0.a.f131967a.getClass();
                        double dJ = og0.a.j(dDoubleValue4, iVar);
                        nVar.f66607t = dJ;
                        TextView textView6 = nVar.f66600l;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("textViewUnitValue");
                            throw null;
                        }
                        l3.f23124b.getClass();
                        textView6.setText(l3.a.e1((long) dJ));
                        TextView textView7 = nVar.f66600l;
                        if (textView7 == null) {
                            p005kotlin.jvm.internal.s.m("textViewUnitValue");
                            throw null;
                        }
                        Context contextRequireContext2 = nVar.requireContext();
                        contextRequireContext2.getClass();
                        textView7.setContentDescription(l3.a.k1(new l22.a(contextRequireContext2), true, (int) nVar.f66607t));
                        TextView textView8 = nVar.f66598j;
                        if (textView8 == null) {
                            p005kotlin.jvm.internal.s.m("textViewUnit");
                            throw null;
                        }
                        textView8.setText(nVar.getString(R.string.event_time));
                        nVar.H6();
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = nVar.f66594f;
                        if (gCMComplexTwoLineButton7 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton7.setButtonBottomLeftLabel(nVar.getString(R.string.enter_goal_distance));
                        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = nVar.f66594f;
                        if (gCMComplexTwoLineButton8 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton8.setVisibility(0);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton9 = nVar.f66594f;
                        if (gCMComplexTwoLineButton9 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton9.setButtonBottomLeftLabel(nVar.getString(R.string.enter_goal_distance));
                        if (mVar != null) {
                            Double d17 = mVar.f101076a;
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                dDoubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                                d14 = 1000.0d;
                            } else {
                                dDoubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                                d14 = 1609.344d;
                            }
                            nVar.f66606r = dDoubleValue * d14;
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = nVar.f66594f;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("goalDistance");
                                throw null;
                            }
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            if (d17 != null) {
                                objValueOf = new DecimalFormat("0.00").format(d17.doubleValue());
                                objValueOf.getClass();
                            } else {
                                objValueOf = Double.valueOf(0.0d);
                            }
                            gg0.i iVar2 = mVar.f101077b;
                            if (iVar2 != null) {
                                Context contextRequireContext3 = nVar.requireContext();
                                contextRequireContext3.getClass();
                                strC = iVar2.c(contextRequireContext3);
                            } else {
                                strC = null;
                            }
                            gCMComplexTwoLineButton10.setButtonBottomLeftLabel(String.format("%s %s", Arrays.copyOf(new Object[]{objValueOf, strC}, 2)));
                        }
                        nVar.F6(false);
                        AppCompatButton appCompatButton2 = nVar.f66602n;
                        if (appCompatButton2 == null) {
                            p005kotlin.jvm.internal.s.m("nextButton");
                            throw null;
                        }
                        if (nVar.y6().O6()) {
                            if (nVar.f66607t <= 0.0d || nVar.f66606r <= 0.0d) {
                                z14 = false;
                            }
                        } else if (mVar == null || nVar.f66606r <= 0.0d) {
                            z14 = false;
                        } else {
                            Double d18 = mVar.f101076a;
                            if (!n.C6(d18 != null ? d18.doubleValue() : 0.0d, mVar.f101077b == gg0.i.KILOMETER)) {
                                z14 = false;
                            }
                        }
                        appCompatButton2.setEnabled(z14);
                        return;
                    case 1:
                        g3 g3Var = (g3) obj;
                        n.a aVar3 = n.C;
                        if (g3Var != null) {
                            int i19 = n.b.f66613a[g3Var.f35300a.ordinal()];
                            if (i19 == 1) {
                                jv1.e eVar2 = (jv1.e) g3Var.f35301b;
                                if (eVar2 == null || !eVar2.f101032a) {
                                    nVar.w6();
                                } else {
                                    nVar.y6().g7();
                                }
                                g22.e.f(nVar);
                            } else if (i19 == 2) {
                                g22.e.f(nVar);
                            } else {
                                if (i19 != 3) {
                                    lc.u0.r();
                                    return;
                                }
                                g22.e.l(nVar);
                            }
                            nVar.y6().s7();
                            return;
                        }
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        n.a aVar4 = n.C;
                        fw.p pVar = g3Var2 != null ? g3Var2.f35300a : null;
                        int i110 = pVar == null ? -1 : n.b.f66613a[pVar.ordinal()];
                        if (i110 == 1) {
                            g22.e.f(nVar);
                            jv1.f fVar = (jv1.f) g3Var2.f35301b;
                            if (fVar != null) {
                                nVar.y6().r7(fVar);
                                return;
                            }
                            return;
                        }
                        if (i110 != 2) {
                            if (i110 != 3) {
                                return;
                            }
                            g22.e.l(nVar);
                            return;
                        } else {
                            g22.e.f(nVar);
                            g22.e.a(nVar, null);
                            nVar.y6().l5();
                            return;
                        }
                }
            }
        };
        final int i16 = 2;
        this.A = new androidx.lifecycle.z0(this) { // from class: ew1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f66492b;

            {
                this.f66492b = this;
            }

            /* JADX WARN: Code duplicated, block: B:147:0x02b1  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                String string;
                double dDoubleValue;
                double d14;
                Object objValueOf;
                String strC;
                int i17 = i16;
                boolean z14 = true;
                n nVar = this.f66492b;
                switch (i17) {
                    case 0:
                        jv1.r rVar = (jv1.r) obj;
                        n.a aVar = n.C;
                        rVar.getClass();
                        nVar.f66608v = nVar.y6().f13384q1 ? 374L : 600L;
                        vt1.e eVar = rVar.f101116a;
                        jv1.h hVar = rVar.f101118c;
                        jv1.m mVar = rVar.f101121f;
                        if (eVar == vt1.e.ACHIEVE_A_MILESTONE) {
                            AppCompatButton appCompatButton = nVar.f66602n;
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("nextButton");
                                throw null;
                            }
                            appCompatButton.setText(nVar.getString(R.string.lbl_next));
                        }
                        vt1.o oVar = rVar.f101117b;
                        vt1.o oVar2 = vt1.o.f180175f;
                        GCMComplexTwoLineButton gCMComplexTwoLineButton = nVar.f66595g;
                        int i18 = 0;
                        if (oVar == oVar2) {
                            if (gCMComplexTwoLineButton == null) {
                                p005kotlin.jvm.internal.s.m("goalPace");
                                throw null;
                            }
                            gCMComplexTwoLineButton.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = nVar.f66596h;
                            if (gCMComplexTwoLineButton2 == null) {
                                p005kotlin.jvm.internal.s.m("goalSpeed");
                                throw null;
                            }
                            gCMComplexTwoLineButton2.setVisibility(8);
                            boolean z15 = hVar instanceof jv1.i;
                            TextView textView = nVar.f66601m;
                            if (z15) {
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView.setText(nVar.getString(R.string.enter_goal_distance_or_pace));
                                string = nVar.getString(R.string.goal_distance_question);
                                string.getClass();
                            } else {
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView.setText(nVar.getString(R.string.enter_goal_time_or_pace));
                                string = nVar.getString(R.string.goal_finish_time_question);
                                string.getClass();
                            }
                        } else {
                            if (gCMComplexTwoLineButton == null) {
                                p005kotlin.jvm.internal.s.m("goalPace");
                                throw null;
                            }
                            gCMComplexTwoLineButton.setVisibility(8);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = nVar.f66596h;
                            if (gCMComplexTwoLineButton3 == null) {
                                p005kotlin.jvm.internal.s.m("goalSpeed");
                                throw null;
                            }
                            gCMComplexTwoLineButton3.setVisibility(0);
                            boolean z16 = hVar instanceof jv1.i;
                            TextView textView2 = nVar.f66601m;
                            if (z16) {
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView2.setText(nVar.getString(R.string.enter_goal_distance_or_speed));
                                string = nVar.getString(R.string.goal_distance_question);
                                string.getClass();
                            } else {
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("helperNoteTV");
                                    throw null;
                                }
                                textView2.setText(nVar.getString(R.string.enter_goal_time_or_speed));
                                string = nVar.getString(R.string.goal_finish_time_question);
                                string.getClass();
                            }
                        }
                        ComposeView composeView = nVar.f66591c;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("wizardHeaderContainer");
                            throw null;
                        }
                        composeView.setViewCompositionStrategy(w3.d.f91628b);
                        composeView.setContent(new z3.e(-2056637410, true, new j(nVar, string, i18)));
                        jv1.m mVar2 = rVar.f101120e;
                        Double d15 = mVar2 != null ? mVar2.f101076a : null;
                        gg0.i iVar = mVar2 != null ? mVar2.f101077b : null;
                        if (d15 == null || iVar == null) {
                            return;
                        }
                        gg0.h hVar2 = mVar2.f101078c;
                        int i19 = hVar2 == null ? -1 : n.b.f66614b[hVar2.ordinal()];
                        if (i19 == 1) {
                            double dDoubleValue2 = d15.doubleValue();
                            og0.a aVar2 = og0.a.f131967a;
                            aVar2.getClass();
                            double dG = og0.a.g(dDoubleValue2, iVar);
                            nVar.f66606r = dG;
                            TextView textView3 = nVar.f66600l;
                            if (textView3 == null) {
                                p005kotlin.jvm.internal.s.m("textViewUnitValue");
                                throw null;
                            }
                            textView3.setText(og0.a.i(aVar2, dG));
                            TextView textView4 = nVar.f66599k;
                            if (textView4 == null) {
                                p005kotlin.jvm.internal.s.m("textViewUnitType");
                                throw null;
                            }
                            Context contextRequireContext = nVar.requireContext();
                            contextRequireContext.getClass();
                            textView4.setText(og0.a.q(contextRequireContext));
                            TextView textView5 = nVar.f66598j;
                            if (textView5 == null) {
                                p005kotlin.jvm.internal.s.m("textViewUnit");
                                throw null;
                            }
                            textView5.setText(nVar.getString(R.string.event_distance));
                            nVar.H6();
                            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = nVar.f66592d;
                            if (gCMComplexTwoLineButton4 == null) {
                                p005kotlin.jvm.internal.s.m("goalTimeView");
                                throw null;
                            }
                            gCMComplexTwoLineButton4.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton5 = nVar.f66592d;
                            if (gCMComplexTwoLineButton5 == null) {
                                p005kotlin.jvm.internal.s.m("goalTimeView");
                                throw null;
                            }
                            gCMComplexTwoLineButton5.setButtonTopLabel(nVar.getString(R.string.lbl_goal_time));
                            GCMComplexTwoLineButton gCMComplexTwoLineButton6 = nVar.f66592d;
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("goalTimeView");
                                throw null;
                            }
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(nVar.getString(R.string.enter_goal_time));
                            n.D = (int) (((double) 600) * ((nVar.f66606r / ((double) 1000)) / ((nVar.f66610x == t41.a.KILOMETER ? 1 : 0) != 0 ? 1.0d : 1.609344d)));
                            if (mVar != null) {
                                Double d16 = mVar.f101076a;
                                double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
                                nVar.f66607t = dDoubleValue3;
                                nVar.G6((long) dDoubleValue3);
                                nVar.F6(true);
                                return;
                            }
                            return;
                        }
                        if (i19 != 2) {
                            return;
                        }
                        double dDoubleValue4 = d15.doubleValue();
                        og0.a.f131967a.getClass();
                        double dJ = og0.a.j(dDoubleValue4, iVar);
                        nVar.f66607t = dJ;
                        TextView textView6 = nVar.f66600l;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("textViewUnitValue");
                            throw null;
                        }
                        l3.f23124b.getClass();
                        textView6.setText(l3.a.e1((long) dJ));
                        TextView textView7 = nVar.f66600l;
                        if (textView7 == null) {
                            p005kotlin.jvm.internal.s.m("textViewUnitValue");
                            throw null;
                        }
                        Context contextRequireContext2 = nVar.requireContext();
                        contextRequireContext2.getClass();
                        textView7.setContentDescription(l3.a.k1(new l22.a(contextRequireContext2), true, (int) nVar.f66607t));
                        TextView textView8 = nVar.f66598j;
                        if (textView8 == null) {
                            p005kotlin.jvm.internal.s.m("textViewUnit");
                            throw null;
                        }
                        textView8.setText(nVar.getString(R.string.event_time));
                        nVar.H6();
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = nVar.f66594f;
                        if (gCMComplexTwoLineButton7 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton7.setButtonBottomLeftLabel(nVar.getString(R.string.enter_goal_distance));
                        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = nVar.f66594f;
                        if (gCMComplexTwoLineButton8 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton8.setVisibility(0);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton9 = nVar.f66594f;
                        if (gCMComplexTwoLineButton9 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton9.setButtonBottomLeftLabel(nVar.getString(R.string.enter_goal_distance));
                        if (mVar != null) {
                            Double d17 = mVar.f101076a;
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                dDoubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                                d14 = 1000.0d;
                            } else {
                                dDoubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                                d14 = 1609.344d;
                            }
                            nVar.f66606r = dDoubleValue * d14;
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = nVar.f66594f;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("goalDistance");
                                throw null;
                            }
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            if (d17 != null) {
                                objValueOf = new DecimalFormat("0.00").format(d17.doubleValue());
                                objValueOf.getClass();
                            } else {
                                objValueOf = Double.valueOf(0.0d);
                            }
                            gg0.i iVar2 = mVar.f101077b;
                            if (iVar2 != null) {
                                Context contextRequireContext3 = nVar.requireContext();
                                contextRequireContext3.getClass();
                                strC = iVar2.c(contextRequireContext3);
                            } else {
                                strC = null;
                            }
                            gCMComplexTwoLineButton10.setButtonBottomLeftLabel(String.format("%s %s", Arrays.copyOf(new Object[]{objValueOf, strC}, 2)));
                        }
                        nVar.F6(false);
                        AppCompatButton appCompatButton2 = nVar.f66602n;
                        if (appCompatButton2 == null) {
                            p005kotlin.jvm.internal.s.m("nextButton");
                            throw null;
                        }
                        if (nVar.y6().O6()) {
                            if (nVar.f66607t <= 0.0d || nVar.f66606r <= 0.0d) {
                                z14 = false;
                            }
                        } else if (mVar == null || nVar.f66606r <= 0.0d) {
                            z14 = false;
                        } else {
                            Double d18 = mVar.f101076a;
                            if (!n.C6(d18 != null ? d18.doubleValue() : 0.0d, mVar.f101077b == gg0.i.KILOMETER)) {
                                z14 = false;
                            }
                        }
                        appCompatButton2.setEnabled(z14);
                        return;
                    case 1:
                        g3 g3Var = (g3) obj;
                        n.a aVar3 = n.C;
                        if (g3Var != null) {
                            int i110 = n.b.f66613a[g3Var.f35300a.ordinal()];
                            if (i110 == 1) {
                                jv1.e eVar2 = (jv1.e) g3Var.f35301b;
                                if (eVar2 == null || !eVar2.f101032a) {
                                    nVar.w6();
                                } else {
                                    nVar.y6().g7();
                                }
                                g22.e.f(nVar);
                            } else if (i110 == 2) {
                                g22.e.f(nVar);
                            } else {
                                if (i110 != 3) {
                                    lc.u0.r();
                                    return;
                                }
                                g22.e.l(nVar);
                            }
                            nVar.y6().s7();
                            return;
                        }
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        n.a aVar4 = n.C;
                        fw.p pVar = g3Var2 != null ? g3Var2.f35300a : null;
                        int i111 = pVar == null ? -1 : n.b.f66613a[pVar.ordinal()];
                        if (i111 == 1) {
                            g22.e.f(nVar);
                            jv1.f fVar = (jv1.f) g3Var2.f35301b;
                            if (fVar != null) {
                                nVar.y6().r7(fVar);
                                return;
                            }
                            return;
                        }
                        if (i111 != 2) {
                            if (i111 != 3) {
                                return;
                            }
                            g22.e.l(nVar);
                            return;
                        } else {
                            g22.e.f(nVar);
                            g22.e.a(nVar, null);
                            nVar.y6().l5();
                            return;
                        }
                }
            }
        };
        this.B = new c();
    }

    public static boolean C6(double d14, boolean z14) {
        if (z14) {
            return d14 <= 1609.0d;
        }
        return d14 <= 1000.0d;
    }

    public final boolean A6() {
        aw1.h hVarY6 = y6();
        if (hVarY6.b7() && hVarY6.V5()) {
            return true;
        }
        return hVarY6.O6() && hVarY6.U5();
    }

    public final void E6(double d14, boolean z14) {
        long j8;
        long j14;
        boolean z15 = this.f66610x == t41.a.KILOMETER;
        if (z15) {
            j8 = A6() ? 149L : 264L;
        } else {
            j8 = A6() ? 240L : 425L;
        }
        if (z15) {
            j14 = A6() ? 779L : 450L;
        } else {
            j14 = A6() ? 1200L : 724L;
        }
        ag0.b bVarB = ag0.b.a.b(ag0.b.Z0, this.f66608v, j8, j14, z15);
        String string = getString(R.string.lbl_ok);
        string.getClass();
        bVarB.U6(string, new p(z14, d14, z15, this));
        bVarB.show(getParentFragmentManager(), "GoalPacePicker");
    }

    public final void F6(boolean z14) {
        if (y6().O6()) {
            double d14 = this.f66607t;
            if (d14 > 0.0d) {
                this.f66609w = this.f66606r / d14;
                K6(this.f66609w, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y());
                AppCompatButton appCompatButton = this.f66602n;
                if (appCompatButton != null) {
                    appCompatButton.setEnabled(true);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("nextButton");
                    throw null;
                }
            }
            return;
        }
        if (z14) {
            bg0.a.f17827a.getClass();
            String string = bg0.a.C0255a.e() ? getString(R.string.lbl_pace_unit_km) : getString(R.string.lbl_pace_unit_mi);
            string.getClass();
            og0.a aVar = og0.a.f131967a;
            double d15 = this.f66607t;
            double d16 = this.f66606r;
            aVar.getClass();
            String strG = e5.g(og0.a.b(d15, d16), StringUtils.SPACE, string);
            String strZ6 = z6((int) og0.a.d(this.f66607t, this.f66606r), bg0.a.C0255a.e());
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f66595g;
            if (gCMComplexTwoLineButton == null) {
                p005kotlin.jvm.internal.s.m("goalPace");
                throw null;
            }
            gCMComplexTwoLineButton.b(strG, strZ6);
            AppCompatButton appCompatButton2 = this.f66602n;
            if (appCompatButton2 != null) {
                appCompatButton2.setEnabled(true);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw null;
            }
        }
        double d17 = this.f66606r;
        if (d17 > 0.0d) {
            double d18 = this.f66607t / d17;
            bg0.a.f17827a.getClass();
            if (bg0.a.C0255a.e()) {
                og0.a.f131967a.getClass();
                long jD = MathKt.d(og0.a.A(d18 * 1000.0d, 2));
                this.f66608v = jD;
                l3.f23124b.getClass();
                String strG2 = e5.g(d53.u.v(String.valueOf(l3.a.e1(jD)), ".", ":", false), StringUtils.SPACE, getString(R.string.lbl_pace_unit_km));
                String strZ7 = z6((int) this.f66608v, true);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f66595g;
                if (gCMComplexTwoLineButton2 == null) {
                    p005kotlin.jvm.internal.s.m("goalPace");
                    throw null;
                }
                gCMComplexTwoLineButton2.b(strG2, strZ7);
            } else {
                og0.a.f131967a.getClass();
                long jD2 = MathKt.d(og0.a.A(d18 * 1609.344d, 2));
                this.f66608v = jD2;
                l3.f23124b.getClass();
                String strG3 = e5.g(d53.u.v(String.valueOf(l3.a.e1(jD2)), ".", ":", false), StringUtils.SPACE, getString(R.string.lbl_pace_unit_mi));
                String strZ8 = z6((int) this.f66608v, false);
                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f66595g;
                if (gCMComplexTwoLineButton3 == null) {
                    p005kotlin.jvm.internal.s.m("goalPace");
                    throw null;
                }
                gCMComplexTwoLineButton3.b(strG3, strZ8);
            }
            AppCompatButton appCompatButton3 = this.f66602n;
            if (appCompatButton3 != null) {
                appCompatButton3.setEnabled(true);
            } else {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G6(long j8) {
        o13.p pVar;
        if (j8 > 0) {
            l3.f23124b.getClass();
            String strE1 = l3.a.e1(j8);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            pVar = new o13.p(strE1, l3.a.k1(new l22.a(contextRequireContext), true, (int) j8));
        } else {
            pVar = new o13.p(getString(R.string.enter_goal_time), getString(R.string.enter_goal_time));
        }
        String str = (String) pVar.f128594a;
        String str2 = (String) pVar.f128595b;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f66592d;
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.b(str, str2);
        } else {
            p005kotlin.jvm.internal.s.m("goalTimeView");
            throw null;
        }
    }

    public final void H6() {
        CharSequence text;
        String str;
        TextView textView = this.f66600l;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("textViewUnitValue");
            throw null;
        }
        CharSequence contentDescription = textView.getContentDescription();
        if (contentDescription == null || d53.w.J(contentDescription)) {
            TextView textView2 = this.f66600l;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("textViewUnitValue");
                throw null;
            }
            text = textView2.getText();
        } else {
            TextView textView3 = this.f66600l;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("textViewUnitValue");
                throw null;
            }
            text = textView3.getContentDescription();
        }
        LinearLayout linearLayout = this.f66597i;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("unitValueContainer");
            throw null;
        }
        TextView textView4 = this.f66599k;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("textViewUnitType");
            throw null;
        }
        CharSequence text2 = textView4.getText();
        if (text2 == null || d53.w.J(text2)) {
            TextView textView5 = this.f66598j;
            if (textView5 == null) {
                p005kotlin.jvm.internal.s.m("textViewUnit");
                throw null;
            }
            str = ((Object) textView5.getText()) + StringUtils.SPACE + ((Object) text);
        } else {
            TextView textView6 = this.f66598j;
            if (textView6 == null) {
                p005kotlin.jvm.internal.s.m("textViewUnit");
                throw null;
            }
            CharSequence text3 = textView6.getText();
            TextView textView7 = this.f66599k;
            if (textView7 == null) {
                p005kotlin.jvm.internal.s.m("textViewUnitType");
                throw null;
            }
            str = ((Object) text3) + StringUtils.SPACE + ((Object) text) + StringUtils.SPACE + ((Object) textView7.getText());
        }
        linearLayout.setContentDescription(str);
    }

    public final void I6() {
        String strC;
        bg0.a.f17827a.getClass();
        int i14 = bg0.a.C0255a.e() ? 1609 : 1000;
        if (bg0.a.C0255a.e()) {
            gg0.i iVar = gg0.i.KILOMETER;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            strC = iVar.c(contextRequireContext);
        } else {
            gg0.i iVar2 = gg0.i.MILE;
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            strC = iVar2.c(contextRequireContext2);
        }
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        String string = getString(R.string.please_enter_distance_between_values, "0", e5.g(String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1)), StringUtils.SPACE, strC));
        string.getClass();
        new androidx.appcompat.app.e.a(requireContext()).setTitle(R.string.live_event_sharing_invalid_distance).setMessage(string).setCancelable(false).setPositiveButton(R.string.lbl_ok, new k(this, i14, strC, 0)).show();
    }

    public final void J6(double d14, boolean z14) {
        String strC;
        if (z14) {
            gg0.i iVar = gg0.i.KILOMETER;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            strC = iVar.c(contextRequireContext);
        } else {
            gg0.i iVar2 = gg0.i.MILE;
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            strC = iVar2.c(contextRequireContext2);
        }
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        og0.a.f131967a.getClass();
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(og0.a.A(d14, 2))}, 1));
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f66594f;
        if (gCMComplexTwoLineButton == null) {
            p005kotlin.jvm.internal.s.m("goalDistance");
            throw null;
        }
        gCMComplexTwoLineButton.setRightIcon(null);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f66594f;
        if (gCMComplexTwoLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("goalDistance");
            throw null;
        }
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(this.f66606r > 0.0d ? e5.g(str, StringUtils.SPACE, strC) : getString(R.string.enter_goal_distance));
        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = this.f66593e;
        if (gCMEditTextTrainingInitiative != null) {
            gCMEditTextTrainingInitiative.getF34926b().setText(str);
        } else {
            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
            throw null;
        }
    }

    public final void K6(double d14, boolean z14) {
        q3 q3Var = z14 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
        l3.a aVar = l3.f23124b;
        Context context = getContext();
        aVar.getClass();
        String strN0 = l3.a.N0(context, d14, q3Var, l3.f23130h, true, getString(R.string.enter_goal_speed));
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f66596h;
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(strN0);
        } else {
            p005kotlin.jvm.internal.s.m("goalSpeed");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.B, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.wizard_header_container);
        viewFindViewById.getClass();
        this.f66591c = (ComposeView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.event_goal_time);
        viewFindViewById2.getClass();
        this.f66592d = (GCMComplexTwoLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.event_goal_pace);
        viewFindViewById3.getClass();
        this.f66595g = (GCMComplexTwoLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.event_goal_distance);
        viewFindViewById4.getClass();
        this.f66594f = (GCMComplexTwoLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.event_goal_distance_edit_text);
        viewFindViewById5.getClass();
        this.f66593e = (GCMEditTextTrainingInitiative) viewFindViewById5;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f66595g;
        if (gCMComplexTwoLineButton == null) {
            p005kotlin.jvm.internal.s.m("goalPace");
            throw null;
        }
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.enter_goal_pace));
        View viewFindViewById6 = view2.findViewById(R.id.event_goal_speed);
        viewFindViewById6.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) viewFindViewById6;
        this.f66596h = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(getString(R.string.enter_goal_speed));
        View viewFindViewById7 = view2.findViewById(R.id.unit_value_container);
        viewFindViewById7.getClass();
        this.f66597i = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.text_view_unit);
        viewFindViewById8.getClass();
        this.f66598j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.text_view_unit_type);
        viewFindViewById9.getClass();
        this.f66599k = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.text_view_unit_value);
        viewFindViewById10.getClass();
        this.f66600l = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.bottom_layout);
        viewFindViewById11.getClass();
        View viewFindViewById12 = view2.findViewById(R.id.next_button);
        viewFindViewById12.getClass();
        this.f66602n = (AppCompatButton) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.helper_note_view);
        viewFindViewById13.getClass();
        this.f66601m = (TextView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.goal_distance_view);
        viewFindViewById14.getClass();
        this.f66604p = (RelativeLayout) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.distance_clear_image_view);
        viewFindViewById15.getClass();
        this.f66603o = (ImageView) viewFindViewById15;
        AppCompatButton appCompatButton = this.f66602n;
        if (appCompatButton == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        appCompatButton.setEnabled(false);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f66594f;
        if (gCMComplexTwoLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("goalDistance");
            throw null;
        }
        final int i14 = 2;
        gCMComplexTwoLineButton3.setOnClickListener(new View.OnClickListener(this) { // from class: ew1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f66511b;

            {
                this.f66511b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                double d14;
                long j8;
                int iMax;
                long j14;
                int iMin;
                double dX;
                double dX2;
                double dX3;
                double dX4;
                double dI;
                double dI2;
                int i15 = i14;
                n nVar = this.f66511b;
                switch (i15) {
                    case 0:
                        n.a aVar = n.C;
                        fy1.c.f73884a.getClass();
                        fy1.c.b("GarminCoachGoalValueSelected");
                        if (nVar.y6().c7()) {
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                og0.a aVar2 = og0.a.f131967a;
                                l3.a aVar3 = l3.f23124b;
                                double d15 = nVar.f66606r;
                                aVar3.getClass();
                                aVar2.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d16 = nVar.f66606r;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(nVar.f66607t);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        nVar.y6().E7(new jv1.m(dValueOf, iVar, hVar));
                        jv1.s sVar = (jv1.s) nVar.y6().j6().d();
                        jv1.h hVar2 = sVar != null ? sVar.f101127f : null;
                        if (!(hVar2 instanceof jv1.g)) {
                            nVar.w6();
                            return;
                        }
                        tu1.i.f166483a.getClass();
                        o13.p pVarM = tu1.i.a.m(nVar.y6().b7(), (jv1.g) hVar2);
                        boolean zBooleanValue = ((Boolean) pVarM.f128594a).booleanValue();
                        vt1.n nVar2 = (vt1.n) pVarM.f128595b;
                        if (!zBooleanValue || nVar.y6().f13385r1) {
                            nVar.w6();
                            return;
                        }
                        aw1.h hVarY6 = nVar.y6();
                        if (hVarY6.L6()) {
                            jv1.s sVarI6 = hVarY6.i6();
                            hVarY6.G1 = sVarI6 != null ? sVarI6.B : null;
                        }
                        nVar.y6().j5(nVar2, false, false);
                        return;
                    case 1:
                        double d17 = nVar.f66607t;
                        int i16 = d17 > 0.0d ? (int) d17 : n.D;
                        boolean z14 = nVar.f66610x == t41.a.KILOMETER;
                        if (z14) {
                            d14 = nVar.f66606r / 1000.0d;
                        } else {
                            l3.a aVar6 = l3.f23124b;
                            double d18 = nVar.f66606r;
                            aVar6.getClass();
                            d14 = d18 / 1609.344d;
                        }
                        if (nVar.y6().O6()) {
                            double d19 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar7 = l3.f23124b;
                                q3 q3Var = q3.KILOMETER_PER_HOUR;
                                aVar7.getClass();
                                dX2 = l3.a.x(130.0d, q3Var);
                            } else {
                                l3.a aVar8 = l3.f23124b;
                                q3 q3Var2 = q3.MILE_PER_HOUR;
                                aVar8.getClass();
                                dX2 = l3.a.x(80.0d, q3Var2);
                            }
                            iMax = Math.max(1, (int) (d19 / dX2));
                        } else {
                            if (z14) {
                                j8 = nVar.A6() ? 149L : 264L;
                            } else {
                                j8 = nVar.A6() ? 240L : 425L;
                            }
                            iMax = (int) (j8 * d14);
                        }
                        if (nVar.y6().O6()) {
                            double d24 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar9 = l3.f23124b;
                                q3 q3Var3 = q3.KILOMETER_PER_HOUR;
                                aVar9.getClass();
                                dX = l3.a.x(0.1d, q3Var3);
                            } else {
                                l3.a aVar10 = l3.f23124b;
                                q3 q3Var4 = q3.MILE_PER_HOUR;
                                aVar10.getClass();
                                dX = l3.a.x(0.1d, q3Var4);
                            }
                            iMin = Math.min(172800, (int) (d24 / dX));
                        } else {
                            if (z14) {
                                j14 = nVar.A6() ? 779L : 450L;
                            } else {
                                j14 = nVar.A6() ? 1200L : 724L;
                            }
                            iMin = (int) (j14 * d14);
                        }
                        int i17 = iMin;
                        String string = nVar.getString(R.string.pacepro_lbl_plan_goal_time);
                        string.getClass();
                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                        r22.f1 f1VarA = r22.f1.a.a(r22.f1.f149645b1, i16, iMax, i17, String.format("%s (%s)", Arrays.copyOf(new Object[]{string, nVar.getString(R.string.hour_minute_second_format)}, 2)), am.j.o(StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_seconds), e5.l(string, StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_hours), StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_minutes))), 8);
                        f1VarA.V0 = new ds0.g(nVar, 14);
                        c22.f1.Y0.getClass();
                        String str = c22.f1.Z0;
                        androidx.fragment.app.v childFragmentManager = nVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 2:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = nVar.f66594f;
                        if (gCMComplexTwoLineButton4 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton4.setVisibility(8);
                        RelativeLayout relativeLayout = nVar.f66604p;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative != null) {
                            gCMEditTextTrainingInitiative.getF34926b().requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 4:
                        n.a aVar11 = n.C;
                        int i18 = 6;
                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                        tu1.i.f166483a.getClass();
                        if (zY) {
                            l3.a aVar12 = l3.f23124b;
                            q3 q3Var5 = q3.KILOMETER_PER_HOUR;
                            aVar12.getClass();
                            dX3 = l3.a.x(0.1d, q3Var5);
                        } else {
                            l3.a aVar13 = l3.f23124b;
                            q3 q3Var6 = q3.MILE_PER_HOUR;
                            aVar13.getClass();
                            dX3 = l3.a.x(0.1d, q3Var6);
                        }
                        if (zY) {
                            l3.a aVar14 = l3.f23124b;
                            q3 q3Var7 = q3.KILOMETER_PER_HOUR;
                            aVar14.getClass();
                            dX4 = l3.a.x(130.0d, q3Var7);
                        } else {
                            l3.a aVar15 = l3.f23124b;
                            q3 q3Var8 = q3.MILE_PER_HOUR;
                            aVar15.getClass();
                            dX4 = l3.a.x(80.0d, q3Var8);
                        }
                        double d25 = nVar.f66606r;
                        if (d25 != 0) {
                            dX3 = Math.max(dX3, d25 / ((double) 172800));
                            dX4 = Math.min(dX4, nVar.f66606r / ((double) 1));
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.MILE_PER_HOUR);
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.MILE_PER_HOUR);
                        }
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                        DecimalFormat decimalFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
                        String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
                        decimalFormat.setRoundingMode(RoundingMode.CEILING);
                        String str2 = decimalFormat.format(dI);
                        str2.getClass();
                        List listW = d53.w.W(str2, new String[]{strValueOf});
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            Integer numI = d53.t.i((String) it.next());
                            if (numI != null) {
                                arrayList.add(numI);
                            }
                        }
                        String str3 = decimalFormat.format(dI2);
                        str3.getClass();
                        List listW2 = d53.w.W(str3, new String[]{strValueOf});
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = listW2.iterator();
                        while (it3.hasNext()) {
                            Integer numI2 = d53.t.i((String) it3.next());
                            if (numI2 != null) {
                                arrayList2.add(numI2);
                            }
                        }
                        ag0.h hVar3 = new ag0.h(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                        Context contextRequireContext = nVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.g(contextRequireContext, zY, nVar.f66609w, hVar3, new as2.d(nVar, zY, i18)).show();
                        return;
                    default:
                        n.a aVar16 = n.C;
                        Context context = nVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative3 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative3.getWindowToken(), 0);
                        if (nVar.y6().c7()) {
                            nVar.E6(0.0d, false);
                            return;
                        } else {
                            nVar.E6(nVar.f66606r, true);
                            return;
                        }
                }
            }
        });
        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = this.f66593e;
        if (gCMEditTextTrainingInitiative == null) {
            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
            throw null;
        }
        gCMEditTextTrainingInitiative.getF34925a().setTextColor(gCMEditTextTrainingInitiative.getResources().getColor(R.color.gcm_text_secondary, null));
        MultiLineImeEditText f34926b = gCMEditTextTrainingInitiative.getF34926b();
        f34926b.setInputType(8194);
        f34926b.setText("");
        f34926b.setTextColor(f34926b.getResources().getColor(R.color.gcm_text_primary, null));
        int i15 = 0;
        f34926b.setOnFocusChangeListener(new l(i15, f34926b, this));
        f34926b.addTextChangedListener(new o(this));
        f34926b.setOnEditorActionListener(new m(this, f34926b, view2, i15));
        ImageView imageView = this.f66603o;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("distanceClearImageView");
            throw null;
        }
        final int i16 = 3;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ew1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f66511b;

            {
                this.f66511b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                double d14;
                long j8;
                int iMax;
                long j14;
                int iMin;
                double dX;
                double dX2;
                double dX3;
                double dX4;
                double dI;
                double dI2;
                int i17 = i16;
                n nVar = this.f66511b;
                switch (i17) {
                    case 0:
                        n.a aVar = n.C;
                        fy1.c.f73884a.getClass();
                        fy1.c.b("GarminCoachGoalValueSelected");
                        if (nVar.y6().c7()) {
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                og0.a aVar2 = og0.a.f131967a;
                                l3.a aVar3 = l3.f23124b;
                                double d15 = nVar.f66606r;
                                aVar3.getClass();
                                aVar2.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d16 = nVar.f66606r;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(nVar.f66607t);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        nVar.y6().E7(new jv1.m(dValueOf, iVar, hVar));
                        jv1.s sVar = (jv1.s) nVar.y6().j6().d();
                        jv1.h hVar2 = sVar != null ? sVar.f101127f : null;
                        if (!(hVar2 instanceof jv1.g)) {
                            nVar.w6();
                            return;
                        }
                        tu1.i.f166483a.getClass();
                        o13.p pVarM = tu1.i.a.m(nVar.y6().b7(), (jv1.g) hVar2);
                        boolean zBooleanValue = ((Boolean) pVarM.f128594a).booleanValue();
                        vt1.n nVar2 = (vt1.n) pVarM.f128595b;
                        if (!zBooleanValue || nVar.y6().f13385r1) {
                            nVar.w6();
                            return;
                        }
                        aw1.h hVarY6 = nVar.y6();
                        if (hVarY6.L6()) {
                            jv1.s sVarI6 = hVarY6.i6();
                            hVarY6.G1 = sVarI6 != null ? sVarI6.B : null;
                        }
                        nVar.y6().j5(nVar2, false, false);
                        return;
                    case 1:
                        double d17 = nVar.f66607t;
                        int i18 = d17 > 0.0d ? (int) d17 : n.D;
                        boolean z14 = nVar.f66610x == t41.a.KILOMETER;
                        if (z14) {
                            d14 = nVar.f66606r / 1000.0d;
                        } else {
                            l3.a aVar6 = l3.f23124b;
                            double d18 = nVar.f66606r;
                            aVar6.getClass();
                            d14 = d18 / 1609.344d;
                        }
                        if (nVar.y6().O6()) {
                            double d19 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar7 = l3.f23124b;
                                q3 q3Var = q3.KILOMETER_PER_HOUR;
                                aVar7.getClass();
                                dX2 = l3.a.x(130.0d, q3Var);
                            } else {
                                l3.a aVar8 = l3.f23124b;
                                q3 q3Var2 = q3.MILE_PER_HOUR;
                                aVar8.getClass();
                                dX2 = l3.a.x(80.0d, q3Var2);
                            }
                            iMax = Math.max(1, (int) (d19 / dX2));
                        } else {
                            if (z14) {
                                j8 = nVar.A6() ? 149L : 264L;
                            } else {
                                j8 = nVar.A6() ? 240L : 425L;
                            }
                            iMax = (int) (j8 * d14);
                        }
                        if (nVar.y6().O6()) {
                            double d24 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar9 = l3.f23124b;
                                q3 q3Var3 = q3.KILOMETER_PER_HOUR;
                                aVar9.getClass();
                                dX = l3.a.x(0.1d, q3Var3);
                            } else {
                                l3.a aVar10 = l3.f23124b;
                                q3 q3Var4 = q3.MILE_PER_HOUR;
                                aVar10.getClass();
                                dX = l3.a.x(0.1d, q3Var4);
                            }
                            iMin = Math.min(172800, (int) (d24 / dX));
                        } else {
                            if (z14) {
                                j14 = nVar.A6() ? 779L : 450L;
                            } else {
                                j14 = nVar.A6() ? 1200L : 724L;
                            }
                            iMin = (int) (j14 * d14);
                        }
                        int i19 = iMin;
                        String string = nVar.getString(R.string.pacepro_lbl_plan_goal_time);
                        string.getClass();
                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                        r22.f1 f1VarA = r22.f1.a.a(r22.f1.f149645b1, i18, iMax, i19, String.format("%s (%s)", Arrays.copyOf(new Object[]{string, nVar.getString(R.string.hour_minute_second_format)}, 2)), am.j.o(StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_seconds), e5.l(string, StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_hours), StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_minutes))), 8);
                        f1VarA.V0 = new ds0.g(nVar, 14);
                        c22.f1.Y0.getClass();
                        String str = c22.f1.Z0;
                        androidx.fragment.app.v childFragmentManager = nVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 2:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = nVar.f66594f;
                        if (gCMComplexTwoLineButton4 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton4.setVisibility(8);
                        RelativeLayout relativeLayout = nVar.f66604p;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 4:
                        n.a aVar11 = n.C;
                        int i110 = 6;
                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                        tu1.i.f166483a.getClass();
                        if (zY) {
                            l3.a aVar12 = l3.f23124b;
                            q3 q3Var5 = q3.KILOMETER_PER_HOUR;
                            aVar12.getClass();
                            dX3 = l3.a.x(0.1d, q3Var5);
                        } else {
                            l3.a aVar13 = l3.f23124b;
                            q3 q3Var6 = q3.MILE_PER_HOUR;
                            aVar13.getClass();
                            dX3 = l3.a.x(0.1d, q3Var6);
                        }
                        if (zY) {
                            l3.a aVar14 = l3.f23124b;
                            q3 q3Var7 = q3.KILOMETER_PER_HOUR;
                            aVar14.getClass();
                            dX4 = l3.a.x(130.0d, q3Var7);
                        } else {
                            l3.a aVar15 = l3.f23124b;
                            q3 q3Var8 = q3.MILE_PER_HOUR;
                            aVar15.getClass();
                            dX4 = l3.a.x(80.0d, q3Var8);
                        }
                        double d25 = nVar.f66606r;
                        if (d25 != 0) {
                            dX3 = Math.max(dX3, d25 / ((double) 172800));
                            dX4 = Math.min(dX4, nVar.f66606r / ((double) 1));
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.MILE_PER_HOUR);
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.MILE_PER_HOUR);
                        }
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                        DecimalFormat decimalFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
                        String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
                        decimalFormat.setRoundingMode(RoundingMode.CEILING);
                        String str2 = decimalFormat.format(dI);
                        str2.getClass();
                        List listW = d53.w.W(str2, new String[]{strValueOf});
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            Integer numI = d53.t.i((String) it.next());
                            if (numI != null) {
                                arrayList.add(numI);
                            }
                        }
                        String str3 = decimalFormat.format(dI2);
                        str3.getClass();
                        List listW2 = d53.w.W(str3, new String[]{strValueOf});
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = listW2.iterator();
                        while (it3.hasNext()) {
                            Integer numI2 = d53.t.i((String) it3.next());
                            if (numI2 != null) {
                                arrayList2.add(numI2);
                            }
                        }
                        ag0.h hVar3 = new ag0.h(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                        Context contextRequireContext = nVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.g(contextRequireContext, zY, nVar.f66609w, hVar3, new as2.d(nVar, zY, i110)).show();
                        return;
                    default:
                        n.a aVar16 = n.C;
                        Context context = nVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (nVar.y6().c7()) {
                            nVar.E6(0.0d, false);
                            return;
                        } else {
                            nVar.E6(nVar.f66606r, true);
                            return;
                        }
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f66596h;
        if (gCMComplexTwoLineButton4 == null) {
            p005kotlin.jvm.internal.s.m("goalSpeed");
            throw null;
        }
        final int i17 = 4;
        gCMComplexTwoLineButton4.setOnClickListener(new View.OnClickListener(this) { // from class: ew1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f66511b;

            {
                this.f66511b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                double d14;
                long j8;
                int iMax;
                long j14;
                int iMin;
                double dX;
                double dX2;
                double dX3;
                double dX4;
                double dI;
                double dI2;
                int i18 = i17;
                n nVar = this.f66511b;
                switch (i18) {
                    case 0:
                        n.a aVar = n.C;
                        fy1.c.f73884a.getClass();
                        fy1.c.b("GarminCoachGoalValueSelected");
                        if (nVar.y6().c7()) {
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                og0.a aVar2 = og0.a.f131967a;
                                l3.a aVar3 = l3.f23124b;
                                double d15 = nVar.f66606r;
                                aVar3.getClass();
                                aVar2.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d16 = nVar.f66606r;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(nVar.f66607t);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        nVar.y6().E7(new jv1.m(dValueOf, iVar, hVar));
                        jv1.s sVar = (jv1.s) nVar.y6().j6().d();
                        jv1.h hVar2 = sVar != null ? sVar.f101127f : null;
                        if (!(hVar2 instanceof jv1.g)) {
                            nVar.w6();
                            return;
                        }
                        tu1.i.f166483a.getClass();
                        o13.p pVarM = tu1.i.a.m(nVar.y6().b7(), (jv1.g) hVar2);
                        boolean zBooleanValue = ((Boolean) pVarM.f128594a).booleanValue();
                        vt1.n nVar2 = (vt1.n) pVarM.f128595b;
                        if (!zBooleanValue || nVar.y6().f13385r1) {
                            nVar.w6();
                            return;
                        }
                        aw1.h hVarY6 = nVar.y6();
                        if (hVarY6.L6()) {
                            jv1.s sVarI6 = hVarY6.i6();
                            hVarY6.G1 = sVarI6 != null ? sVarI6.B : null;
                        }
                        nVar.y6().j5(nVar2, false, false);
                        return;
                    case 1:
                        double d17 = nVar.f66607t;
                        int i19 = d17 > 0.0d ? (int) d17 : n.D;
                        boolean z14 = nVar.f66610x == t41.a.KILOMETER;
                        if (z14) {
                            d14 = nVar.f66606r / 1000.0d;
                        } else {
                            l3.a aVar6 = l3.f23124b;
                            double d18 = nVar.f66606r;
                            aVar6.getClass();
                            d14 = d18 / 1609.344d;
                        }
                        if (nVar.y6().O6()) {
                            double d19 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar7 = l3.f23124b;
                                q3 q3Var = q3.KILOMETER_PER_HOUR;
                                aVar7.getClass();
                                dX2 = l3.a.x(130.0d, q3Var);
                            } else {
                                l3.a aVar8 = l3.f23124b;
                                q3 q3Var2 = q3.MILE_PER_HOUR;
                                aVar8.getClass();
                                dX2 = l3.a.x(80.0d, q3Var2);
                            }
                            iMax = Math.max(1, (int) (d19 / dX2));
                        } else {
                            if (z14) {
                                j8 = nVar.A6() ? 149L : 264L;
                            } else {
                                j8 = nVar.A6() ? 240L : 425L;
                            }
                            iMax = (int) (j8 * d14);
                        }
                        if (nVar.y6().O6()) {
                            double d24 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar9 = l3.f23124b;
                                q3 q3Var3 = q3.KILOMETER_PER_HOUR;
                                aVar9.getClass();
                                dX = l3.a.x(0.1d, q3Var3);
                            } else {
                                l3.a aVar10 = l3.f23124b;
                                q3 q3Var4 = q3.MILE_PER_HOUR;
                                aVar10.getClass();
                                dX = l3.a.x(0.1d, q3Var4);
                            }
                            iMin = Math.min(172800, (int) (d24 / dX));
                        } else {
                            if (z14) {
                                j14 = nVar.A6() ? 779L : 450L;
                            } else {
                                j14 = nVar.A6() ? 1200L : 724L;
                            }
                            iMin = (int) (j14 * d14);
                        }
                        int i110 = iMin;
                        String string = nVar.getString(R.string.pacepro_lbl_plan_goal_time);
                        string.getClass();
                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                        r22.f1 f1VarA = r22.f1.a.a(r22.f1.f149645b1, i19, iMax, i110, String.format("%s (%s)", Arrays.copyOf(new Object[]{string, nVar.getString(R.string.hour_minute_second_format)}, 2)), am.j.o(StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_seconds), e5.l(string, StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_hours), StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_minutes))), 8);
                        f1VarA.V0 = new ds0.g(nVar, 14);
                        c22.f1.Y0.getClass();
                        String str = c22.f1.Z0;
                        androidx.fragment.app.v childFragmentManager = nVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 2:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = nVar.f66594f;
                        if (gCMComplexTwoLineButton5 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton5.setVisibility(8);
                        RelativeLayout relativeLayout = nVar.f66604p;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 4:
                        n.a aVar11 = n.C;
                        int i111 = 6;
                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                        tu1.i.f166483a.getClass();
                        if (zY) {
                            l3.a aVar12 = l3.f23124b;
                            q3 q3Var5 = q3.KILOMETER_PER_HOUR;
                            aVar12.getClass();
                            dX3 = l3.a.x(0.1d, q3Var5);
                        } else {
                            l3.a aVar13 = l3.f23124b;
                            q3 q3Var6 = q3.MILE_PER_HOUR;
                            aVar13.getClass();
                            dX3 = l3.a.x(0.1d, q3Var6);
                        }
                        if (zY) {
                            l3.a aVar14 = l3.f23124b;
                            q3 q3Var7 = q3.KILOMETER_PER_HOUR;
                            aVar14.getClass();
                            dX4 = l3.a.x(130.0d, q3Var7);
                        } else {
                            l3.a aVar15 = l3.f23124b;
                            q3 q3Var8 = q3.MILE_PER_HOUR;
                            aVar15.getClass();
                            dX4 = l3.a.x(80.0d, q3Var8);
                        }
                        double d25 = nVar.f66606r;
                        if (d25 != 0) {
                            dX3 = Math.max(dX3, d25 / ((double) 172800));
                            dX4 = Math.min(dX4, nVar.f66606r / ((double) 1));
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.MILE_PER_HOUR);
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.MILE_PER_HOUR);
                        }
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                        DecimalFormat decimalFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
                        String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
                        decimalFormat.setRoundingMode(RoundingMode.CEILING);
                        String str2 = decimalFormat.format(dI);
                        str2.getClass();
                        List listW = d53.w.W(str2, new String[]{strValueOf});
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            Integer numI = d53.t.i((String) it.next());
                            if (numI != null) {
                                arrayList.add(numI);
                            }
                        }
                        String str3 = decimalFormat.format(dI2);
                        str3.getClass();
                        List listW2 = d53.w.W(str3, new String[]{strValueOf});
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = listW2.iterator();
                        while (it3.hasNext()) {
                            Integer numI2 = d53.t.i((String) it3.next());
                            if (numI2 != null) {
                                arrayList2.add(numI2);
                            }
                        }
                        ag0.h hVar3 = new ag0.h(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                        Context contextRequireContext = nVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.g(contextRequireContext, zY, nVar.f66609w, hVar3, new as2.d(nVar, zY, i111)).show();
                        return;
                    default:
                        n.a aVar16 = n.C;
                        Context context = nVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (nVar.y6().c7()) {
                            nVar.E6(0.0d, false);
                            return;
                        } else {
                            nVar.E6(nVar.f66606r, true);
                            return;
                        }
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f66595g;
        if (gCMComplexTwoLineButton5 == null) {
            p005kotlin.jvm.internal.s.m("goalPace");
            throw null;
        }
        final int i18 = 5;
        gCMComplexTwoLineButton5.setOnClickListener(new View.OnClickListener(this) { // from class: ew1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f66511b;

            {
                this.f66511b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                double d14;
                long j8;
                int iMax;
                long j14;
                int iMin;
                double dX;
                double dX2;
                double dX3;
                double dX4;
                double dI;
                double dI2;
                int i19 = i18;
                n nVar = this.f66511b;
                switch (i19) {
                    case 0:
                        n.a aVar = n.C;
                        fy1.c.f73884a.getClass();
                        fy1.c.b("GarminCoachGoalValueSelected");
                        if (nVar.y6().c7()) {
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                og0.a aVar2 = og0.a.f131967a;
                                l3.a aVar3 = l3.f23124b;
                                double d15 = nVar.f66606r;
                                aVar3.getClass();
                                aVar2.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d16 = nVar.f66606r;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(nVar.f66607t);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        nVar.y6().E7(new jv1.m(dValueOf, iVar, hVar));
                        jv1.s sVar = (jv1.s) nVar.y6().j6().d();
                        jv1.h hVar2 = sVar != null ? sVar.f101127f : null;
                        if (!(hVar2 instanceof jv1.g)) {
                            nVar.w6();
                            return;
                        }
                        tu1.i.f166483a.getClass();
                        o13.p pVarM = tu1.i.a.m(nVar.y6().b7(), (jv1.g) hVar2);
                        boolean zBooleanValue = ((Boolean) pVarM.f128594a).booleanValue();
                        vt1.n nVar2 = (vt1.n) pVarM.f128595b;
                        if (!zBooleanValue || nVar.y6().f13385r1) {
                            nVar.w6();
                            return;
                        }
                        aw1.h hVarY6 = nVar.y6();
                        if (hVarY6.L6()) {
                            jv1.s sVarI6 = hVarY6.i6();
                            hVarY6.G1 = sVarI6 != null ? sVarI6.B : null;
                        }
                        nVar.y6().j5(nVar2, false, false);
                        return;
                    case 1:
                        double d17 = nVar.f66607t;
                        int i110 = d17 > 0.0d ? (int) d17 : n.D;
                        boolean z14 = nVar.f66610x == t41.a.KILOMETER;
                        if (z14) {
                            d14 = nVar.f66606r / 1000.0d;
                        } else {
                            l3.a aVar6 = l3.f23124b;
                            double d18 = nVar.f66606r;
                            aVar6.getClass();
                            d14 = d18 / 1609.344d;
                        }
                        if (nVar.y6().O6()) {
                            double d19 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar7 = l3.f23124b;
                                q3 q3Var = q3.KILOMETER_PER_HOUR;
                                aVar7.getClass();
                                dX2 = l3.a.x(130.0d, q3Var);
                            } else {
                                l3.a aVar8 = l3.f23124b;
                                q3 q3Var2 = q3.MILE_PER_HOUR;
                                aVar8.getClass();
                                dX2 = l3.a.x(80.0d, q3Var2);
                            }
                            iMax = Math.max(1, (int) (d19 / dX2));
                        } else {
                            if (z14) {
                                j8 = nVar.A6() ? 149L : 264L;
                            } else {
                                j8 = nVar.A6() ? 240L : 425L;
                            }
                            iMax = (int) (j8 * d14);
                        }
                        if (nVar.y6().O6()) {
                            double d24 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar9 = l3.f23124b;
                                q3 q3Var3 = q3.KILOMETER_PER_HOUR;
                                aVar9.getClass();
                                dX = l3.a.x(0.1d, q3Var3);
                            } else {
                                l3.a aVar10 = l3.f23124b;
                                q3 q3Var4 = q3.MILE_PER_HOUR;
                                aVar10.getClass();
                                dX = l3.a.x(0.1d, q3Var4);
                            }
                            iMin = Math.min(172800, (int) (d24 / dX));
                        } else {
                            if (z14) {
                                j14 = nVar.A6() ? 779L : 450L;
                            } else {
                                j14 = nVar.A6() ? 1200L : 724L;
                            }
                            iMin = (int) (j14 * d14);
                        }
                        int i111 = iMin;
                        String string = nVar.getString(R.string.pacepro_lbl_plan_goal_time);
                        string.getClass();
                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                        r22.f1 f1VarA = r22.f1.a.a(r22.f1.f149645b1, i110, iMax, i111, String.format("%s (%s)", Arrays.copyOf(new Object[]{string, nVar.getString(R.string.hour_minute_second_format)}, 2)), am.j.o(StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_seconds), e5.l(string, StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_hours), StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_minutes))), 8);
                        f1VarA.V0 = new ds0.g(nVar, 14);
                        c22.f1.Y0.getClass();
                        String str = c22.f1.Z0;
                        androidx.fragment.app.v childFragmentManager = nVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 2:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = nVar.f66594f;
                        if (gCMComplexTwoLineButton6 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton6.setVisibility(8);
                        RelativeLayout relativeLayout = nVar.f66604p;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 4:
                        n.a aVar11 = n.C;
                        int i112 = 6;
                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                        tu1.i.f166483a.getClass();
                        if (zY) {
                            l3.a aVar12 = l3.f23124b;
                            q3 q3Var5 = q3.KILOMETER_PER_HOUR;
                            aVar12.getClass();
                            dX3 = l3.a.x(0.1d, q3Var5);
                        } else {
                            l3.a aVar13 = l3.f23124b;
                            q3 q3Var6 = q3.MILE_PER_HOUR;
                            aVar13.getClass();
                            dX3 = l3.a.x(0.1d, q3Var6);
                        }
                        if (zY) {
                            l3.a aVar14 = l3.f23124b;
                            q3 q3Var7 = q3.KILOMETER_PER_HOUR;
                            aVar14.getClass();
                            dX4 = l3.a.x(130.0d, q3Var7);
                        } else {
                            l3.a aVar15 = l3.f23124b;
                            q3 q3Var8 = q3.MILE_PER_HOUR;
                            aVar15.getClass();
                            dX4 = l3.a.x(80.0d, q3Var8);
                        }
                        double d25 = nVar.f66606r;
                        if (d25 != 0) {
                            dX3 = Math.max(dX3, d25 / ((double) 172800));
                            dX4 = Math.min(dX4, nVar.f66606r / ((double) 1));
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.MILE_PER_HOUR);
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.MILE_PER_HOUR);
                        }
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                        DecimalFormat decimalFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
                        String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
                        decimalFormat.setRoundingMode(RoundingMode.CEILING);
                        String str2 = decimalFormat.format(dI);
                        str2.getClass();
                        List listW = d53.w.W(str2, new String[]{strValueOf});
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            Integer numI = d53.t.i((String) it.next());
                            if (numI != null) {
                                arrayList.add(numI);
                            }
                        }
                        String str3 = decimalFormat.format(dI2);
                        str3.getClass();
                        List listW2 = d53.w.W(str3, new String[]{strValueOf});
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = listW2.iterator();
                        while (it3.hasNext()) {
                            Integer numI2 = d53.t.i((String) it3.next());
                            if (numI2 != null) {
                                arrayList2.add(numI2);
                            }
                        }
                        ag0.h hVar3 = new ag0.h(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                        Context contextRequireContext = nVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.g(contextRequireContext, zY, nVar.f66609w, hVar3, new as2.d(nVar, zY, i112)).show();
                        return;
                    default:
                        n.a aVar16 = n.C;
                        Context context = nVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (nVar.y6().c7()) {
                            nVar.E6(0.0d, false);
                            return;
                        } else {
                            nVar.E6(nVar.f66606r, true);
                            return;
                        }
                }
            }
        });
        AppCompatButton appCompatButton2 = this.f66602n;
        if (appCompatButton2 == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        final int i19 = 0;
        appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ew1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f66511b;

            {
                this.f66511b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                double d14;
                long j8;
                int iMax;
                long j14;
                int iMin;
                double dX;
                double dX2;
                double dX3;
                double dX4;
                double dI;
                double dI2;
                int i110 = i19;
                n nVar = this.f66511b;
                switch (i110) {
                    case 0:
                        n.a aVar = n.C;
                        fy1.c.f73884a.getClass();
                        fy1.c.b("GarminCoachGoalValueSelected");
                        if (nVar.y6().c7()) {
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                og0.a aVar2 = og0.a.f131967a;
                                l3.a aVar3 = l3.f23124b;
                                double d15 = nVar.f66606r;
                                aVar3.getClass();
                                aVar2.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d16 = nVar.f66606r;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(nVar.f66607t);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        nVar.y6().E7(new jv1.m(dValueOf, iVar, hVar));
                        jv1.s sVar = (jv1.s) nVar.y6().j6().d();
                        jv1.h hVar2 = sVar != null ? sVar.f101127f : null;
                        if (!(hVar2 instanceof jv1.g)) {
                            nVar.w6();
                            return;
                        }
                        tu1.i.f166483a.getClass();
                        o13.p pVarM = tu1.i.a.m(nVar.y6().b7(), (jv1.g) hVar2);
                        boolean zBooleanValue = ((Boolean) pVarM.f128594a).booleanValue();
                        vt1.n nVar2 = (vt1.n) pVarM.f128595b;
                        if (!zBooleanValue || nVar.y6().f13385r1) {
                            nVar.w6();
                            return;
                        }
                        aw1.h hVarY6 = nVar.y6();
                        if (hVarY6.L6()) {
                            jv1.s sVarI6 = hVarY6.i6();
                            hVarY6.G1 = sVarI6 != null ? sVarI6.B : null;
                        }
                        nVar.y6().j5(nVar2, false, false);
                        return;
                    case 1:
                        double d17 = nVar.f66607t;
                        int i111 = d17 > 0.0d ? (int) d17 : n.D;
                        boolean z14 = nVar.f66610x == t41.a.KILOMETER;
                        if (z14) {
                            d14 = nVar.f66606r / 1000.0d;
                        } else {
                            l3.a aVar6 = l3.f23124b;
                            double d18 = nVar.f66606r;
                            aVar6.getClass();
                            d14 = d18 / 1609.344d;
                        }
                        if (nVar.y6().O6()) {
                            double d19 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar7 = l3.f23124b;
                                q3 q3Var = q3.KILOMETER_PER_HOUR;
                                aVar7.getClass();
                                dX2 = l3.a.x(130.0d, q3Var);
                            } else {
                                l3.a aVar8 = l3.f23124b;
                                q3 q3Var2 = q3.MILE_PER_HOUR;
                                aVar8.getClass();
                                dX2 = l3.a.x(80.0d, q3Var2);
                            }
                            iMax = Math.max(1, (int) (d19 / dX2));
                        } else {
                            if (z14) {
                                j8 = nVar.A6() ? 149L : 264L;
                            } else {
                                j8 = nVar.A6() ? 240L : 425L;
                            }
                            iMax = (int) (j8 * d14);
                        }
                        if (nVar.y6().O6()) {
                            double d24 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar9 = l3.f23124b;
                                q3 q3Var3 = q3.KILOMETER_PER_HOUR;
                                aVar9.getClass();
                                dX = l3.a.x(0.1d, q3Var3);
                            } else {
                                l3.a aVar10 = l3.f23124b;
                                q3 q3Var4 = q3.MILE_PER_HOUR;
                                aVar10.getClass();
                                dX = l3.a.x(0.1d, q3Var4);
                            }
                            iMin = Math.min(172800, (int) (d24 / dX));
                        } else {
                            if (z14) {
                                j14 = nVar.A6() ? 779L : 450L;
                            } else {
                                j14 = nVar.A6() ? 1200L : 724L;
                            }
                            iMin = (int) (j14 * d14);
                        }
                        int i112 = iMin;
                        String string = nVar.getString(R.string.pacepro_lbl_plan_goal_time);
                        string.getClass();
                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                        r22.f1 f1VarA = r22.f1.a.a(r22.f1.f149645b1, i111, iMax, i112, String.format("%s (%s)", Arrays.copyOf(new Object[]{string, nVar.getString(R.string.hour_minute_second_format)}, 2)), am.j.o(StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_seconds), e5.l(string, StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_hours), StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_minutes))), 8);
                        f1VarA.V0 = new ds0.g(nVar, 14);
                        c22.f1.Y0.getClass();
                        String str = c22.f1.Z0;
                        androidx.fragment.app.v childFragmentManager = nVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 2:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = nVar.f66594f;
                        if (gCMComplexTwoLineButton6 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton6.setVisibility(8);
                        RelativeLayout relativeLayout = nVar.f66604p;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 4:
                        n.a aVar11 = n.C;
                        int i113 = 6;
                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                        tu1.i.f166483a.getClass();
                        if (zY) {
                            l3.a aVar12 = l3.f23124b;
                            q3 q3Var5 = q3.KILOMETER_PER_HOUR;
                            aVar12.getClass();
                            dX3 = l3.a.x(0.1d, q3Var5);
                        } else {
                            l3.a aVar13 = l3.f23124b;
                            q3 q3Var6 = q3.MILE_PER_HOUR;
                            aVar13.getClass();
                            dX3 = l3.a.x(0.1d, q3Var6);
                        }
                        if (zY) {
                            l3.a aVar14 = l3.f23124b;
                            q3 q3Var7 = q3.KILOMETER_PER_HOUR;
                            aVar14.getClass();
                            dX4 = l3.a.x(130.0d, q3Var7);
                        } else {
                            l3.a aVar15 = l3.f23124b;
                            q3 q3Var8 = q3.MILE_PER_HOUR;
                            aVar15.getClass();
                            dX4 = l3.a.x(80.0d, q3Var8);
                        }
                        double d25 = nVar.f66606r;
                        if (d25 != 0) {
                            dX3 = Math.max(dX3, d25 / ((double) 172800));
                            dX4 = Math.min(dX4, nVar.f66606r / ((double) 1));
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.MILE_PER_HOUR);
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.MILE_PER_HOUR);
                        }
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                        DecimalFormat decimalFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
                        String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
                        decimalFormat.setRoundingMode(RoundingMode.CEILING);
                        String str2 = decimalFormat.format(dI);
                        str2.getClass();
                        List listW = d53.w.W(str2, new String[]{strValueOf});
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            Integer numI = d53.t.i((String) it.next());
                            if (numI != null) {
                                arrayList.add(numI);
                            }
                        }
                        String str3 = decimalFormat.format(dI2);
                        str3.getClass();
                        List listW2 = d53.w.W(str3, new String[]{strValueOf});
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = listW2.iterator();
                        while (it3.hasNext()) {
                            Integer numI2 = d53.t.i((String) it3.next());
                            if (numI2 != null) {
                                arrayList2.add(numI2);
                            }
                        }
                        ag0.h hVar3 = new ag0.h(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                        Context contextRequireContext = nVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.g(contextRequireContext, zY, nVar.f66609w, hVar3, new as2.d(nVar, zY, i113)).show();
                        return;
                    default:
                        n.a aVar16 = n.C;
                        Context context = nVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (nVar.y6().c7()) {
                            nVar.E6(0.0d, false);
                            return;
                        } else {
                            nVar.E6(nVar.f66606r, true);
                            return;
                        }
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f66592d;
        if (gCMComplexTwoLineButton6 == null) {
            p005kotlin.jvm.internal.s.m("goalTimeView");
            throw null;
        }
        final int i24 = 1;
        gCMComplexTwoLineButton6.setOnClickListener(new View.OnClickListener(this) { // from class: ew1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f66511b;

            {
                this.f66511b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Double dValueOf;
                gg0.i iVar;
                gg0.h hVar;
                double d14;
                long j8;
                int iMax;
                long j14;
                int iMin;
                double dX;
                double dX2;
                double dX3;
                double dX4;
                double dI;
                double dI2;
                int i110 = i24;
                n nVar = this.f66511b;
                switch (i110) {
                    case 0:
                        n.a aVar = n.C;
                        fy1.c.f73884a.getClass();
                        fy1.c.b("GarminCoachGoalValueSelected");
                        if (nVar.y6().c7()) {
                            bg0.a.f17827a.getClass();
                            if (bg0.a.C0255a.e()) {
                                og0.a aVar2 = og0.a.f131967a;
                                l3.a aVar3 = l3.f23124b;
                                double d15 = nVar.f66606r;
                                aVar3.getClass();
                                aVar2.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d15 / 1000.0d, 2));
                            } else {
                                og0.a aVar4 = og0.a.f131967a;
                                l3.a aVar5 = l3.f23124b;
                                double d16 = nVar.f66606r;
                                aVar5.getClass();
                                aVar4.getClass();
                                dValueOf = Double.valueOf(og0.a.A(d16 / 1609.344d, 2));
                            }
                            iVar = bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE;
                            hVar = gg0.h.DISTANCE;
                        } else {
                            dValueOf = Double.valueOf(nVar.f66607t);
                            iVar = gg0.i.SECOND;
                            hVar = gg0.h.TIME;
                        }
                        nVar.y6().E7(new jv1.m(dValueOf, iVar, hVar));
                        jv1.s sVar = (jv1.s) nVar.y6().j6().d();
                        jv1.h hVar2 = sVar != null ? sVar.f101127f : null;
                        if (!(hVar2 instanceof jv1.g)) {
                            nVar.w6();
                            return;
                        }
                        tu1.i.f166483a.getClass();
                        o13.p pVarM = tu1.i.a.m(nVar.y6().b7(), (jv1.g) hVar2);
                        boolean zBooleanValue = ((Boolean) pVarM.f128594a).booleanValue();
                        vt1.n nVar2 = (vt1.n) pVarM.f128595b;
                        if (!zBooleanValue || nVar.y6().f13385r1) {
                            nVar.w6();
                            return;
                        }
                        aw1.h hVarY6 = nVar.y6();
                        if (hVarY6.L6()) {
                            jv1.s sVarI6 = hVarY6.i6();
                            hVarY6.G1 = sVarI6 != null ? sVarI6.B : null;
                        }
                        nVar.y6().j5(nVar2, false, false);
                        return;
                    case 1:
                        double d17 = nVar.f66607t;
                        int i111 = d17 > 0.0d ? (int) d17 : n.D;
                        boolean z14 = nVar.f66610x == t41.a.KILOMETER;
                        if (z14) {
                            d14 = nVar.f66606r / 1000.0d;
                        } else {
                            l3.a aVar6 = l3.f23124b;
                            double d18 = nVar.f66606r;
                            aVar6.getClass();
                            d14 = d18 / 1609.344d;
                        }
                        if (nVar.y6().O6()) {
                            double d19 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar7 = l3.f23124b;
                                q3 q3Var = q3.KILOMETER_PER_HOUR;
                                aVar7.getClass();
                                dX2 = l3.a.x(130.0d, q3Var);
                            } else {
                                l3.a aVar8 = l3.f23124b;
                                q3 q3Var2 = q3.MILE_PER_HOUR;
                                aVar8.getClass();
                                dX2 = l3.a.x(80.0d, q3Var2);
                            }
                            iMax = Math.max(1, (int) (d19 / dX2));
                        } else {
                            if (z14) {
                                j8 = nVar.A6() ? 149L : 264L;
                            } else {
                                j8 = nVar.A6() ? 240L : 425L;
                            }
                            iMax = (int) (j8 * d14);
                        }
                        if (nVar.y6().O6()) {
                            double d24 = nVar.f66606r;
                            tu1.i.f166483a.getClass();
                            if (z14) {
                                l3.a aVar9 = l3.f23124b;
                                q3 q3Var3 = q3.KILOMETER_PER_HOUR;
                                aVar9.getClass();
                                dX = l3.a.x(0.1d, q3Var3);
                            } else {
                                l3.a aVar10 = l3.f23124b;
                                q3 q3Var4 = q3.MILE_PER_HOUR;
                                aVar10.getClass();
                                dX = l3.a.x(0.1d, q3Var4);
                            }
                            iMin = Math.min(172800, (int) (d24 / dX));
                        } else {
                            if (z14) {
                                j14 = nVar.A6() ? 779L : 450L;
                            } else {
                                j14 = nVar.A6() ? 1200L : 724L;
                            }
                            iMin = (int) (j14 * d14);
                        }
                        int i112 = iMin;
                        String string = nVar.getString(R.string.pacepro_lbl_plan_goal_time);
                        string.getClass();
                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                        r22.f1 f1VarA = r22.f1.a.a(r22.f1.f149645b1, i111, iMax, i112, String.format("%s (%s)", Arrays.copyOf(new Object[]{string, nVar.getString(R.string.hour_minute_second_format)}, 2)), am.j.o(StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_seconds), e5.l(string, StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_hours), StringUtils.SPACE, nVar.getString(R.string.lbl_time_unit_minutes))), 8);
                        f1VarA.V0 = new ds0.g(nVar, 14);
                        c22.f1.Y0.getClass();
                        String str = c22.f1.Z0;
                        androidx.fragment.app.v childFragmentManager = nVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f1VarA.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 2:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = nVar.f66594f;
                        if (gCMComplexTwoLineButton7 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistance");
                            throw null;
                        }
                        gCMComplexTwoLineButton7.setVisibility(8);
                        RelativeLayout relativeLayout = nVar.f66604p;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceContainer");
                            throw null;
                        }
                        relativeLayout.setVisibility(0);
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative2 != null) {
                            gCMEditTextTrainingInitiative2.getF34926b().requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 3:
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative3 != null) {
                            gCMEditTextTrainingInitiative3.getF34926b().setText("");
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                    case 4:
                        n.a aVar11 = n.C;
                        int i113 = 6;
                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                        tu1.i.f166483a.getClass();
                        if (zY) {
                            l3.a aVar12 = l3.f23124b;
                            q3 q3Var5 = q3.KILOMETER_PER_HOUR;
                            aVar12.getClass();
                            dX3 = l3.a.x(0.1d, q3Var5);
                        } else {
                            l3.a aVar13 = l3.f23124b;
                            q3 q3Var6 = q3.MILE_PER_HOUR;
                            aVar13.getClass();
                            dX3 = l3.a.x(0.1d, q3Var6);
                        }
                        if (zY) {
                            l3.a aVar14 = l3.f23124b;
                            q3 q3Var7 = q3.KILOMETER_PER_HOUR;
                            aVar14.getClass();
                            dX4 = l3.a.x(130.0d, q3Var7);
                        } else {
                            l3.a aVar15 = l3.f23124b;
                            q3 q3Var8 = q3.MILE_PER_HOUR;
                            aVar15.getClass();
                            dX4 = l3.a.x(80.0d, q3Var8);
                        }
                        double d25 = nVar.f66606r;
                        if (d25 != 0) {
                            dX3 = Math.max(dX3, d25 / ((double) 172800));
                            dX4 = Math.min(dX4, nVar.f66606r / ((double) 1));
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI = l3.a.i(dX3, q3.MILE_PER_HOUR);
                        }
                        if (zY) {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.KILOMETER_PER_HOUR);
                        } else {
                            l3.f23124b.getClass();
                            dI2 = l3.a.i(dX4, q3.MILE_PER_HOUR);
                        }
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                        DecimalFormat decimalFormat = new DecimalFormat("#0.0", decimalFormatSymbols);
                        String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
                        decimalFormat.setRoundingMode(RoundingMode.CEILING);
                        String str2 = decimalFormat.format(dI);
                        str2.getClass();
                        List listW = d53.w.W(str2, new String[]{strValueOf});
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            Integer numI = d53.t.i((String) it.next());
                            if (numI != null) {
                                arrayList.add(numI);
                            }
                        }
                        String str3 = decimalFormat.format(dI2);
                        str3.getClass();
                        List listW2 = d53.w.W(str3, new String[]{strValueOf});
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = listW2.iterator();
                        while (it3.hasNext()) {
                            Integer numI2 = d53.t.i((String) it3.next());
                            if (numI2 != null) {
                                arrayList2.add(numI2);
                            }
                        }
                        ag0.h hVar3 = new ag0.h(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                        Context contextRequireContext = nVar.requireContext();
                        contextRequireContext.getClass();
                        new ag0.g(contextRequireContext, zY, nVar.f66609w, hVar3, new as2.d(nVar, zY, i113)).show();
                        return;
                    default:
                        n.a aVar16 = n.C;
                        Context context = nVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = nVar.f66593e;
                        if (gCMEditTextTrainingInitiative4 == null) {
                            p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                            throw null;
                        }
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        if (nVar.y6().c7()) {
                            nVar.E6(0.0d, false);
                            return;
                        } else {
                            nVar.E6(nVar.f66606r, true);
                            return;
                        }
                }
            }
        });
        if (!y6().f13385r1) {
            y6().A5().f(getViewLifecycleOwner(), this.A);
            ((androidx.lifecycle.s0) y6().f13367a1.getValue()).f(getViewLifecycleOwner(), this.f66612z);
        }
        y6().N0.f(getViewLifecycleOwner(), this.f66611y);
    }

    public final void w6() {
        androidx.fragment.app.v supportFragmentManager;
        if (!y6().f13385r1) {
            aw1.h hVarY6 = y6();
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            hVarY6.z5(vw1.c.d(contextRequireContext));
            return;
        }
        androidx.fragment.app.m activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.a0(0, "FBTReviewInformationFragCompose");
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTAddGoalDataFragment";
    }

    public final aw1.h y6() {
        return (aw1.h) this.f66590b.getValue();
    }

    public final String z6(int i14, boolean z14) {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        l22.a aVar = new l22.a(contextRequireContext);
        l3.f23124b.getClass();
        return e5.g(l3.a.r1(aVar, i14), StringUtils.SPACE, aVar.getString(l3.a.N1(z14)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lew1/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "defaultDurationTime", "I", "FORMATTED_DISTANCE_PATTERN", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
