package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import java.text.NumberFormat;
import java.util.List;
import kotlin.w3;
import l72.j0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import ty1.h0;
import ty1.h1;
import ty1.i1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/u;", "Lty1/h0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends h0 {
    public static final a A = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f46274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComposeView f46275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InlineUnitsTextFieldView f46276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InlineUnitsTextFieldView f46277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InlineUnitsTextFieldView f46278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f46279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f46280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f46281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f46282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ComposeView f46283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m52.c f46284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f46285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem f46286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f46287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Double f46288r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Double f46289t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public bg0.a.c f46290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public bg0.a.c f46291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f46292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f46293y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f46294z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/u$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            u.A6(u.this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46296a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f46296a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46296a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46298b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46297a = aVar;
            this.f46298b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46297a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46298b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46299a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46299a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46299a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public u() {
        super(R.layout.ti_add_triathlon_event_distance_fragment);
        this.f46273c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new c(this), new e(this), new d(null, this));
        this.f46284n = m52.c.OPEN_WATER_SWIMMING;
        this.f46293y = "";
        this.f46294z = new b();
    }

    public static final void A6(u uVar) {
        uVar.f46294z.f(false);
        List list = (List) ((androidx.lifecycle.s0) uVar.C6().R0.getValue()).d();
        AddTIEventViewModel addTIEventViewModelC6 = uVar.C6();
        if (addTIEventViewModelC6.F2 == null || addTIEventViewModelC6.J2 || list == null) {
            uVar.requireActivity().onBackPressed();
            return;
        }
        AddTIEventViewModel addTIEventViewModelC7 = uVar.C6();
        ((y0) addTIEventViewModelC7.Q0.getValue()).m(list);
        addTIEventViewModelC7.O5().m("TIAddTriathlonEventTypeFragment");
    }

    public final AddTIEventViewModel C6() {
        return (AddTIEventViewModel) this.f46273c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void E6(boolean z14, boolean z15, final InlineUnitsTextFieldView inlineUnitsTextFieldView, TextView textView, final bg0.a.c cVar, final bg0.a.c cVar2, bg0.a.b bVar, Double d14, String str) {
        m52.c cVar3;
        boolean zQ6;
        String string;
        Number number;
        Number number2;
        if (z15) {
            cVar3 = m52.c.RUNNING;
        } else {
            cVar3 = z14 ? m52.c.CYCLING : m52.c.SWIMMING;
        }
        og0.a aVar = og0.a.f131967a;
        lz1.f.a aVar2 = lz1.f.f115404a;
        double dDoubleValue = (cVar2 == null || (number2 = cVar2.f17834a) == null) ? 0.0d : number2.doubleValue();
        aVar2.getClass();
        double dJ = lz1.f.a.j(bVar, dDoubleValue);
        aVar.getClass();
        fg0.v vVarL = og0.a.l(dJ);
        if (C6().D2) {
            fy1.e eVar = fy1.e.f73896a;
            Double dValueOf = (cVar2 == null || (number = cVar2.f17834a) == null) ? null : Double.valueOf(number.doubleValue());
            eVar.getClass();
            cVar3.getClass();
            zQ6 = dValueOf == null ? false : fy1.e.a(cVar3, bVar).contains(dValueOf);
        } else {
            zQ6 = C6().q6(cVar2);
        }
        if (zQ6) {
            inlineUnitsTextFieldView.setHasError(false);
            textView.setText("");
            textView.setVisibility(8);
            if (str != null && d14 != null && !vVarL.b(d14.doubleValue())) {
                androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(requireContext());
                aVar3.setTitle(str);
                aVar3.setMessage(getString(R.string.change_leg_distance_alert_message));
                aVar3.setCancelable(false);
                final int i14 = 1;
                aVar3.setPositiveButton(getString(R.string.lbl_common_continue), new DialogInterface.OnClickListener() { // from class: ty1.g1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        int i16 = i14;
                        bg0.a.c cVar4 = cVar2;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar = this;
                        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = inlineUnitsTextFieldView;
                        switch (i16) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                                InlineUnitsTextFieldView.a currentUnit = inlineUnitsTextFieldView2.getCurrentUnit();
                                if (currentUnit != null) {
                                    inlineUnitsTextFieldView2.m(cVar4 != null ? cVar4.f17834a : null, currentUnit);
                                }
                                uVar.f46292x = false;
                                dialogInterface.dismiss();
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                                InlineUnitsTextFieldView.a currentUnit2 = inlineUnitsTextFieldView2.getCurrentUnit();
                                if (currentUnit2 != null) {
                                    inlineUnitsTextFieldView2.m(cVar4 != null ? cVar4.f17834a : null, currentUnit2);
                                }
                                uVar.f46290v = cVar4;
                                uVar.f46292x = false;
                                dialogInterface.dismiss();
                                break;
                        }
                    }
                });
                final int i15 = 0;
                aVar3.setNegativeButton(getString(R.string.lbl_cancel), new DialogInterface.OnClickListener() { // from class: ty1.g1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i16) {
                        int i17 = i15;
                        bg0.a.c cVar4 = cVar;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar = this;
                        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = inlineUnitsTextFieldView;
                        switch (i17) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                                InlineUnitsTextFieldView.a currentUnit = inlineUnitsTextFieldView2.getCurrentUnit();
                                if (currentUnit != null) {
                                    inlineUnitsTextFieldView2.m(cVar4 != null ? cVar4.f17834a : null, currentUnit);
                                }
                                uVar.f46292x = false;
                                dialogInterface.dismiss();
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                                InlineUnitsTextFieldView.a currentUnit2 = inlineUnitsTextFieldView2.getCurrentUnit();
                                if (currentUnit2 != null) {
                                    inlineUnitsTextFieldView2.m(cVar4 != null ? cVar4.f17834a : null, currentUnit2);
                                }
                                uVar.f46290v = cVar4;
                                uVar.f46292x = false;
                                dialogInterface.dismiss();
                                break;
                        }
                    }
                });
                if (!this.f46292x) {
                    this.f46292x = true;
                    aVar3.create().show();
                }
            } else if (z14) {
                this.f46290v = cVar2;
            } else if (z15) {
                this.f46291w = cVar2;
            }
        } else {
            inlineUnitsTextFieldView.setHasError(true);
            v22.e.q(textView);
            if (C6().D2) {
                fy1.e.f73896a.getClass();
                cVar3.getClass();
                j23.d dVarA = fy1.e.a(cVar3, bVar);
                NumberFormat numberFormat = fy1.e.f73897b;
                o13.p pVar = new o13.p(numberFormat.format(dVarA.f96787a), numberFormat.format(dVarA.f96788b));
                String str2 = (String) pVar.f128594a;
                String str3 = (String) pVar.f128595b;
                androidx.fragment.app.m activity = getActivity();
                if (activity != null) {
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    string = activity.getString(R.string.event_distance_range, str2, str3, bVar.a(contextRequireContext));
                } else {
                    string = null;
                }
            } else {
                androidx.fragment.app.m activity2 = getActivity();
                if (activity2 != null) {
                    Integer numV = og0.a.v(bVar);
                    Context contextRequireContext2 = requireContext();
                    contextRequireContext2.getClass();
                    string = activity2.getString(R.string.event_distance_range, "0", numV, bVar.a(contextRequireContext2));
                } else {
                    string = null;
                }
            }
            textView.setText(string);
            if (z14) {
                this.f46290v = cVar2;
            } else if (z15) {
                this.f46291w = cVar2;
            }
        }
        if (this.f46285o) {
            MenuItem menuItem = this.f46286p;
            if (menuItem != null) {
                menuItem.setEnabled(F6()).getClass();
                return;
            } else {
                p005kotlin.jvm.internal.s.m("saveMenu");
                throw null;
            }
        }
        Button button = this.f46282l;
        if (button != null) {
            button.setEnabled(F6());
        } else {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
    }

    public final boolean F6() {
        InlineUnitsTextFieldView inlineUnitsTextFieldView = this.f46276f;
        if (inlineUnitsTextFieldView == null) {
            p005kotlin.jvm.internal.s.m("swimDistanceView");
            throw null;
        }
        if (inlineUnitsTextFieldView.getEditTextValue().length() == 0) {
            return false;
        }
        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = this.f46276f;
        if (inlineUnitsTextFieldView2 == null) {
            p005kotlin.jvm.internal.s.m("swimDistanceView");
            throw null;
        }
        if (p005kotlin.jvm.internal.s.g(inlineUnitsTextFieldView2.getEditTextValue(), this.f46293y)) {
            return false;
        }
        InlineUnitsTextFieldView inlineUnitsTextFieldView3 = this.f46277g;
        if (inlineUnitsTextFieldView3 == null) {
            p005kotlin.jvm.internal.s.m("bikeDistanceView");
            throw null;
        }
        if (inlineUnitsTextFieldView3.getEditTextValue().length() == 0) {
            return false;
        }
        InlineUnitsTextFieldView inlineUnitsTextFieldView4 = this.f46277g;
        if (inlineUnitsTextFieldView4 == null) {
            p005kotlin.jvm.internal.s.m("bikeDistanceView");
            throw null;
        }
        if (p005kotlin.jvm.internal.s.g(inlineUnitsTextFieldView4.getEditTextValue(), this.f46293y)) {
            return false;
        }
        InlineUnitsTextFieldView inlineUnitsTextFieldView5 = this.f46278h;
        if (inlineUnitsTextFieldView5 == null) {
            p005kotlin.jvm.internal.s.m("runDistanceView");
            throw null;
        }
        if (inlineUnitsTextFieldView5.getEditTextValue().length() == 0) {
            return false;
        }
        InlineUnitsTextFieldView inlineUnitsTextFieldView6 = this.f46278h;
        if (inlineUnitsTextFieldView6 == null) {
            p005kotlin.jvm.internal.s.m("runDistanceView");
            throw null;
        }
        if (p005kotlin.jvm.internal.s.g(inlineUnitsTextFieldView6.getEditTextValue(), this.f46293y)) {
            return false;
        }
        InlineUnitsTextFieldView inlineUnitsTextFieldView7 = this.f46276f;
        if (inlineUnitsTextFieldView7 == null) {
            p005kotlin.jvm.internal.s.m("swimDistanceView");
            throw null;
        }
        if (inlineUnitsTextFieldView7.getHasError()) {
            return false;
        }
        InlineUnitsTextFieldView inlineUnitsTextFieldView8 = this.f46277g;
        if (inlineUnitsTextFieldView8 == null) {
            p005kotlin.jvm.internal.s.m("bikeDistanceView");
            throw null;
        }
        if (inlineUnitsTextFieldView8.getHasError()) {
            return false;
        }
        InlineUnitsTextFieldView inlineUnitsTextFieldView9 = this.f46278h;
        if (inlineUnitsTextFieldView9 != null) {
            return !inlineUnitsTextFieldView9.getHasError();
        }
        p005kotlin.jvm.internal.s.m("runDistanceView");
        throw null;
    }

    public final void G6() {
        bg0.a.c cVar;
        bg0.a.c cVar2;
        InlineUnitsTextFieldView inlineUnitsTextFieldView = this.f46276f;
        bg0.a.c cVar3 = null;
        if (inlineUnitsTextFieldView == null) {
            p005kotlin.jvm.internal.s.m("swimDistanceView");
            throw null;
        }
        Number currentNumber = inlineUnitsTextFieldView.getCurrentNumber();
        if (currentNumber != null) {
            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = this.f46276f;
            if (inlineUnitsTextFieldView2 == null) {
                p005kotlin.jvm.internal.s.m("swimDistanceView");
                throw null;
            }
            InlineUnitsTextFieldView.a currentUnit = inlineUnitsTextFieldView2.getCurrentUnit();
            currentUnit.getClass();
            cVar = new bg0.a.c(currentNumber, ((eg0.b) currentUnit).f63972a);
        } else {
            cVar = null;
        }
        C6().N6(cVar, this.f46284n);
        InlineUnitsTextFieldView inlineUnitsTextFieldView3 = this.f46277g;
        if (inlineUnitsTextFieldView3 == null) {
            p005kotlin.jvm.internal.s.m("bikeDistanceView");
            throw null;
        }
        Number currentNumber2 = inlineUnitsTextFieldView3.getCurrentNumber();
        if (currentNumber2 != null) {
            InlineUnitsTextFieldView inlineUnitsTextFieldView4 = this.f46277g;
            if (inlineUnitsTextFieldView4 == null) {
                p005kotlin.jvm.internal.s.m("bikeDistanceView");
                throw null;
            }
            InlineUnitsTextFieldView.a currentUnit2 = inlineUnitsTextFieldView4.getCurrentUnit();
            currentUnit2.getClass();
            cVar2 = new bg0.a.c(currentNumber2, ((eg0.b) currentUnit2).f63972a);
        } else {
            cVar2 = null;
        }
        C6().N6(cVar2, m52.c.CYCLING);
        InlineUnitsTextFieldView inlineUnitsTextFieldView5 = this.f46278h;
        if (inlineUnitsTextFieldView5 == null) {
            p005kotlin.jvm.internal.s.m("runDistanceView");
            throw null;
        }
        Number currentNumber3 = inlineUnitsTextFieldView5.getCurrentNumber();
        if (currentNumber3 != null) {
            InlineUnitsTextFieldView inlineUnitsTextFieldView6 = this.f46278h;
            if (inlineUnitsTextFieldView6 == null) {
                p005kotlin.jvm.internal.s.m("runDistanceView");
                throw null;
            }
            InlineUnitsTextFieldView.a currentUnit3 = inlineUnitsTextFieldView6.getCurrentUnit();
            currentUnit3.getClass();
            cVar3 = new bg0.a.c(currentNumber3, ((eg0.b) currentUnit3).f63972a);
        }
        C6().N6(cVar3, m52.c.RUNNING);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46272b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddTriathlonEventDistanceFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x026b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:92:0x021d  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Number] */
    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws Throwable {
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVar;
        m52.c cVarH;
        double dDoubleValue;
        Throwable th3;
        Double dValueOf;
        Double value;
        bg0.a.b bVarB;
        double dDoubleValue2;
        Double value2;
        ?? ValueOf;
        bg0.a.b bVarA;
        Double value3;
        ?? ValueOf2;
        bg0.a.b bVarA2;
        gg0.i unit;
        gg0.i unit2;
        gg0.i unit3;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("TRIATHLON_TYPE_DISTANCE", com.garmin.android.apps.connectmobile.workouts.data.model.f.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("TRIATHLON_TYPE_DISTANCE");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.f)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.workouts.data.model.f) parcelable2;
            }
            fVar = (com.garmin.android.apps.connectmobile.workouts.data.model.f) parcelable;
        } else {
            fVar = null;
        }
        Bundle arguments2 = getArguments();
        this.f46285o = arguments2 != null ? arguments2.getBoolean("IS_FROM_REVIEW_ENTRY_SCREEN", false) : false;
        int i14 = C6().D2 ? R.string.set_goals_title : R.string.add_event;
        ry1.a aVar = this.f46272b;
        if (aVar != null) {
            String string = getString(i14);
            string.getClass();
            aVar.g(2, string);
        }
        C6();
        com.garmin.android.apps.connectmobile.courses.model.d dVarE5 = AddTIEventViewModel.e5(C6().l5().d());
        this.f46288r = dVarE5 != null ? Double.valueOf(dVarE5.distanceInMeters) : null;
        C6();
        com.garmin.android.apps.connectmobile.courses.model.d dVarH5 = AddTIEventViewModel.h5(C6().l5().d());
        this.f46289t = dVarH5 != null ? Double.valueOf(dVarH5.distanceInMeters) : null;
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46294z, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.title_view);
        viewFindViewById.getClass();
        this.f46274d = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.fbt_wizard_header_container);
        viewFindViewById2.getClass();
        this.f46275e = (ComposeView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.swim_distance_field);
        viewFindViewById3.getClass();
        this.f46276f = (InlineUnitsTextFieldView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.bike_distance_field);
        viewFindViewById4.getClass();
        this.f46277g = (InlineUnitsTextFieldView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.run_distance_field);
        viewFindViewById5.getClass();
        this.f46278h = (InlineUnitsTextFieldView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.swim_distance_range);
        viewFindViewById6.getClass();
        this.f46279i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.bike_distance_range);
        viewFindViewById7.getClass();
        this.f46280j = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.run_distance_range);
        viewFindViewById8.getClass();
        this.f46281k = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.reset_course_distance);
        viewFindViewById9.getClass();
        View viewFindViewById10 = view2.findViewById(R.id.swim_type_chip);
        viewFindViewById10.getClass();
        this.f46283m = (ComposeView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.fragment_next_button);
        viewFindViewById11.getClass();
        this.f46282l = (Button) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.bottom_layout);
        viewFindViewById12.getClass();
        this.f46287q = (LinearLayout) viewFindViewById12;
        if (fVar == null || (cVarH = fVar.h()) == null) {
            cVarH = m52.c.OPEN_WATER_SWIMMING;
        }
        this.f46284n = cVarH;
        boolean z14 = (fVar != null ? fVar.getName() : null) == m52.i.CUSTOM;
        String string2 = getString(R.string.enter_leg_distance);
        string2.getClass();
        this.f46293y = string2;
        InlineUnitsTextFieldView inlineUnitsTextFieldView = this.f46276f;
        if (inlineUnitsTextFieldView == null) {
            p005kotlin.jvm.internal.s.m("swimDistanceView");
            throw null;
        }
        inlineUnitsTextFieldView.setNumberOfDecimalsAllowed(2);
        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = this.f46277g;
        if (inlineUnitsTextFieldView2 == null) {
            p005kotlin.jvm.internal.s.m("bikeDistanceView");
            throw null;
        }
        inlineUnitsTextFieldView2.setNumberOfDecimalsAllowed(2);
        InlineUnitsTextFieldView inlineUnitsTextFieldView3 = this.f46278h;
        if (inlineUnitsTextFieldView3 == null) {
            p005kotlin.jvm.internal.s.m("runDistanceView");
            throw null;
        }
        inlineUnitsTextFieldView3.setNumberOfDecimalsAllowed(2);
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVarD = fVar != null ? fVar.d(this.f46284n) : null;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVarD2 = fVar != null ? fVar.d(m52.c.CYCLING) : null;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVarD3 = fVar != null ? fVar.d(m52.c.RUNNING) : null;
        double dDoubleValue3 = 0.0d;
        if (z14) {
            if (p005kotlin.jvm.internal.s.c(kVarD != null ? kVarD.getValue() : null, 0.0d)) {
                kVarD = kVarD;
                th3 = null;
                dValueOf = null;
            } else {
                lz1.f.a aVar2 = lz1.f.f115404a;
                if (kVarD != null) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = 0.0d;
                }
                th3 = null;
                aVar2.getClass();
                dValueOf = Double.valueOf(lz1.f.a.o(dDoubleValue, 2));
            }
        } else {
            lz1.f.a aVar3 = lz1.f.f115404a;
            if (kVarD != null || (value = kVarD.getValue()) == null) {
                dDoubleValue = 0.0d;
            } else {
                dDoubleValue = value.doubleValue();
            }
            th3 = null;
            aVar3.getClass();
            dValueOf = Double.valueOf(lz1.f.a.o(dDoubleValue, 2));
        }
        if (kVarD == null || (unit3 = kVarD.getUnit()) == null || (bVarB = unit3.b()) == null) {
            bVarB = bg0.a.b.METER;
        }
        bg0.a.c cVar = new bg0.a.c(dValueOf, bVarB);
        if (z14) {
            if (p005kotlin.jvm.internal.s.c(kVarD2 != null ? kVarD2.getValue() : th3, 0.0d)) {
                ValueOf = th3;
            } else {
                lz1.f.a aVar4 = lz1.f.f115404a;
                if (kVarD2 != null) {
                    dDoubleValue2 = 0.0d;
                } else {
                    dDoubleValue2 = 0.0d;
                }
                aVar4.getClass();
                ValueOf = Double.valueOf(lz1.f.a.o(dDoubleValue2, 2));
            }
        } else {
            lz1.f.a aVar5 = lz1.f.f115404a;
            if (kVarD2 != null || (value2 = kVarD2.getValue()) == null) {
                dDoubleValue2 = 0.0d;
            } else {
                dDoubleValue2 = value2.doubleValue();
            }
            aVar5.getClass();
            ValueOf = Double.valueOf(lz1.f.a.o(dDoubleValue2, 2));
        }
        if (kVarD2 == null || (unit2 = kVarD2.getUnit()) == null || (bVarA = unit2.b()) == null) {
            bg0.a.f17827a.getClass();
            bVarA = bg0.a.C0255a.a();
        }
        this.f46290v = new bg0.a.c(ValueOf, bVarA);
        if (z14) {
            if (p005kotlin.jvm.internal.s.c(kVarD3 != null ? kVarD3.getValue() : th3, 0.0d)) {
                ValueOf2 = th3;
            } else {
                lz1.f.a aVar6 = lz1.f.f115404a;
                if (kVarD3 != null) {
                    dDoubleValue3 = value3.doubleValue();
                }
                aVar6.getClass();
                ValueOf2 = Double.valueOf(lz1.f.a.o(dDoubleValue3, 2));
            }
        } else {
            lz1.f.a aVar7 = lz1.f.f115404a;
            if (kVarD3 != null && (value3 = kVarD3.getValue()) != null) {
                dDoubleValue3 = value3.doubleValue();
            }
            aVar7.getClass();
            ValueOf2 = Double.valueOf(lz1.f.a.o(dDoubleValue3, 2));
        }
        if (kVarD3 == null || (unit = kVarD3.getUnit()) == null || (bVarA2 = unit.b()) == null) {
            bg0.a.f17827a.getClass();
            bVarA2 = bg0.a.C0255a.a();
        }
        this.f46291w = new bg0.a.c(ValueOf2, bVarA2);
        C6().N6(cVar, this.f46284n);
        C6().N6(this.f46290v, m52.c.CYCLING);
        C6().N6(this.f46291w, m52.c.RUNNING);
        InlineUnitsTextFieldView inlineUnitsTextFieldView4 = this.f46276f;
        if (inlineUnitsTextFieldView4 == null) {
            p005kotlin.jvm.internal.s.m("swimDistanceView");
            throw th3;
        }
        if (C6().D2) {
            inlineUnitsTextFieldView4.setActionButtonColor(a7.b.getColor(requireContext(), R.color.gds_data_viz_blue_primary));
        }
        inlineUnitsTextFieldView4.setEditHintText(this.f46293y);
        eg0.a.a(inlineUnitsTextFieldView4, cVar, new h1(this, 2));
        InlineUnitsTextFieldView inlineUnitsTextFieldView5 = this.f46277g;
        if (inlineUnitsTextFieldView5 == null) {
            p005kotlin.jvm.internal.s.m("bikeDistanceView");
            throw th3;
        }
        if (C6().D2) {
            inlineUnitsTextFieldView5.setActionButtonColor(a7.b.getColor(requireContext(), R.color.gds_data_viz_blue_primary));
        }
        inlineUnitsTextFieldView5.setEditHintText(this.f46293y);
        eg0.a.a(inlineUnitsTextFieldView5, this.f46290v, new h1(this, 3));
        InlineUnitsTextFieldView inlineUnitsTextFieldView6 = this.f46278h;
        if (inlineUnitsTextFieldView6 == null) {
            p005kotlin.jvm.internal.s.m("runDistanceView");
            throw th3;
        }
        if (C6().D2) {
            inlineUnitsTextFieldView6.setActionButtonColor(a7.b.getColor(requireContext(), R.color.gds_data_viz_blue_primary));
        }
        inlineUnitsTextFieldView6.setEditHintText(this.f46293y);
        eg0.a.a(inlineUnitsTextFieldView6, this.f46291w, new h1(this, 4));
        if ((kVarD != null ? kVarD.getValue() : th3) == null || p005kotlin.jvm.internal.s.c(kVarD.getValue(), 0.0d)) {
            InlineUnitsTextFieldView inlineUnitsTextFieldView7 = this.f46276f;
            if (inlineUnitsTextFieldView7 == null) {
                p005kotlin.jvm.internal.s.m("swimDistanceView");
                throw th3;
            }
            inlineUnitsTextFieldView7.setEditTextValue(this.f46293y);
        }
        if ((kVarD2 != null ? kVarD2.getValue() : th3) == null || p005kotlin.jvm.internal.s.c(kVarD2.getValue(), 0.0d)) {
            InlineUnitsTextFieldView inlineUnitsTextFieldView8 = this.f46277g;
            if (inlineUnitsTextFieldView8 == null) {
                p005kotlin.jvm.internal.s.m("bikeDistanceView");
                throw th3;
            }
            inlineUnitsTextFieldView8.setEditTextValue(this.f46293y);
        }
        if ((kVarD3 != null ? kVarD3.getValue() : th3) == null || p005kotlin.jvm.internal.s.c(kVarD3.getValue(), 0.0d)) {
            InlineUnitsTextFieldView inlineUnitsTextFieldView9 = this.f46278h;
            if (inlineUnitsTextFieldView9 == null) {
                p005kotlin.jvm.internal.s.m("runDistanceView");
                throw th3;
            }
            inlineUnitsTextFieldView9.setEditTextValue(this.f46293y);
        }
        if (z14 && dValueOf == null) {
            InlineUnitsTextFieldView inlineUnitsTextFieldView10 = this.f46276f;
            if (inlineUnitsTextFieldView10 == null) {
                p005kotlin.jvm.internal.s.m("swimDistanceView");
                throw th3;
            }
            inlineUnitsTextFieldView10.postDelayed(new po.g(this, 26), 25L);
        }
        boolean z15 = this.f46285o;
        Button button = this.f46282l;
        if (z15) {
            if (button == null) {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw th3;
            }
            button.setVisibility(8);
        } else {
            if (button == null) {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw th3;
            }
            button.setVisibility(0);
            Button button2 = this.f46282l;
            if (button2 == null) {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw th3;
            }
            button2.setEnabled(F6());
        }
        if (C6().D2) {
            TextView textView = this.f46274d;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("titleView");
                throw th3;
            }
            textView.setVisibility(8);
            ComposeView composeView = this.f46275e;
            if (composeView == null) {
                p005kotlin.jvm.internal.s.m("fbtWizardHeader");
                throw th3;
            }
            composeView.setVisibility(0);
            composeView.setViewCompositionStrategy(w3.d.f91628b);
            composeView.setContent(new z3.e(1688503056, true, new h1(this, 1)));
            this.f46284n = m52.c.SWIMMING;
            ComposeView composeView2 = this.f46283m;
            if (composeView2 == null) {
                p005kotlin.jvm.internal.s.m("swimType");
                throw th3;
            }
            composeView2.setVisibility(8);
        } else {
            String string3 = requireContext().getString(R.string.lbl_open_water_swim);
            string3.getClass();
            j0 j0Var = new j0(string3, null, null, false, this.f46284n == m52.c.OPEN_WATER_SWIMMING, 14, null);
            String string4 = requireContext().getString(R.string.workout_pool_swim);
            string4.getClass();
            List listK = p13.x.k(j0Var, new j0(string4, null, null, false, this.f46284n == m52.c.LAP_SWIMMING, 14, null));
            ComposeView composeView3 = this.f46283m;
            if (composeView3 == null) {
                p005kotlin.jvm.internal.s.m("swimType");
                throw th3;
            }
            composeView3.setContent(new z3.e(441031215, true, new t21.l(23, listK, this)));
        }
        if (C6().D2) {
            LinearLayout linearLayout = this.f46287q;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("bottomLayout");
                throw th3;
            }
            linearLayout.setBackgroundColor(a7.b.getColor(requireContext(), R.color.surface_2));
            linearLayout.setPadding(0, 0, 0, 0);
        }
        if (this.f46285o) {
            androidx.fragment.app.m activity = getActivity();
            if (activity != null) {
                activity.setTitle(R.string.leg_distances);
            }
            androidx.fragment.app.m activity2 = getActivity();
            activity2.getClass();
            activity2.addMenuProvider(new i1(this), getViewLifecycleOwner(), androidx.lifecycle.b0.b.RESUMED);
        }
        Button button3 = this.f46282l;
        if (button3 != null) {
            button3.setOnClickListener(new t61.m(this, 15));
        } else {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw th3;
        }
    }

    @Override // ty1.h0
    public final int w6() {
        return v6().G2 + 1;
    }

    @Override // ty1.h0
    public final boolean y6() {
        if (C6().D2) {
            return true;
        }
        return super.y6();
    }

    @Override // ty1.h0
    public final boolean z6() {
        return C6().D2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "TRIATHLON_TYPE_DISTANCE", "IS_FROM_REVIEW_ENTRY_SCREEN", "", "MIN_DISTANCE_RANGE", "I", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
