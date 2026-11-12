package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import b.s;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.q1;
import d53.u;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import o13.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import pj1.d0;
import tr2.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f43873n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f43874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f43875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f43876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f43877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f43878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f43879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f43880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f43881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f43882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f.c<Long> f43883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w1 f43885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f43886m;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/b$c", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() throws Exception {
            b bVar = b.this;
            Bundle arguments = bVar.getArguments();
            if (arguments == null || !arguments.getBoolean("ARG_SHOW_EXIT_DIALOG", true)) {
                e();
                bVar.requireActivity().getOnBackPressedDispatcher().d();
                return;
            }
            q1.b bVar2 = q1.f41066b;
            String string = bVar.getString(R.string.safety_features_wizard_exit_title);
            string.getClass();
            String string2 = bVar.getString(R.string.safety_features_wizard_exit_message);
            string2.getClass();
            xw.b bVar3 = new xw.b(bVar, 8);
            bVar2.getClass();
            q1 q1VarC = q1.b.c(string, string2, R.string.lbl_exit, R.string.lbl_cancel, bVar3);
            q1VarC.setCancelable(false);
            v childFragmentManager = bVar.getChildFragmentManager();
            childFragmentManager.getClass();
            q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43892a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43892a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43893a = aVar;
            this.f43894b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43893a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43894b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43895a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f43895a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43895a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b() {
        super(R.layout.safety_feature_setup_assistance_type_fragment);
        this.f43884k = true;
        this.f43885l = new w1(s0.f105811a.b(pj1.s.class), new d(this), new f(this), new e(null, this));
        this.f43886m = new c();
    }

    public static void v6(TextView textView, String str) {
        String strV = u.v(str, "• ", "", false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(strV);
        spannableString.setSpan(new BulletSpan(16), 0, strV.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView.setText(spannableStringBuilder);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.assistance_plus_checkbox_view);
        viewFindViewById.getClass();
        this.f43879f = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.assistance_checkbox_view);
        viewFindViewById2.getClass();
        this.f43880g = viewFindViewById2;
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.checkmark_cell_check_icon);
        viewFindViewById3.getClass();
        this.f43881h = (ImageView) viewFindViewById3;
        View view3 = this.f43879f;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("assistancePlusView");
            throw null;
        }
        View viewFindViewById4 = view3.findViewById(R.id.checkmark_cell_check_icon);
        viewFindViewById4.getClass();
        this.f43882i = (ImageView) viewFindViewById4;
        Button button = (Button) view2.findViewById(R.id.button_next);
        View viewFindViewById5 = view2.findViewById(R.id.assistance_select_note1);
        viewFindViewById5.getClass();
        this.f43874a = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.assistance_select_note2);
        viewFindViewById6.getClass();
        this.f43875b = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.assistance_select_note3);
        viewFindViewById7.getClass();
        this.f43876c = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.assistance_select_note4);
        viewFindViewById8.getClass();
        this.f43877d = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.assistance_select_note5);
        viewFindViewById9.getClass();
        this.f43878e = (TextView) viewFindViewById9;
        View view4 = this.f43879f;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("assistancePlusView");
            throw null;
        }
        ((TextView) view4.findViewById(R.id.checkmark_cell_text)).setText(getString(R.string.incident_detection_assistance_plus));
        View view5 = this.f43880g;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("assistanceView");
            throw null;
        }
        ((TextView) view5.findViewById(R.id.checkmark_cell_text)).setText(getString(R.string.incident_detection_assistance));
        y6(u6().N4());
        View view6 = this.f43880g;
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("assistanceView");
            throw null;
        }
        final int i14 = 1;
        view6.setOnClickListener(new View.OnClickListener(this) { // from class: zj1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b f204908b;

            {
                this.f204908b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x007c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                boolean z14;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar = this.f204908b;
                switch (i15) {
                    case 0:
                        if (bVar.f43884k) {
                            pj1.s sVarU6 = bVar.u6();
                            Integer numValueOf = Integer.valueOf(R.string.safety_features_wizard_lte_activation_2);
                            Integer numValueOf2 = Integer.valueOf(R.string.lte_not_activated);
                            y0<w61.f<p<Integer, Integer>>> y0Var = sVarU6.L0;
                            vi1.b bVar2 = sVarU6.f137903e;
                            if (!sVarU6.f137983t) {
                                sVarU6.f137983t = true;
                            }
                            ArrayList arrayList = sVarU6.P;
                            if (arrayList != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (((sd2.f) obj).y0()) {
                                        arrayList2.add(obj);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    z14 = false;
                                } else {
                                    Iterator it = arrayList2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z14 = false;
                                        } else if (bVar2.k(((sd2.f) it.next()).getUnitID())) {
                                            z14 = true;
                                        }
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            boolean z15 = sVarU6.f137911m;
                            if (!z15 && z14) {
                                y0Var.m(new w61.f<>(new p(numValueOf2, numValueOf)));
                            } else if (!z15) {
                                y0Var.m(new w61.f<>(new p(numValueOf2, numValueOf)));
                            } else if (p005kotlin.jvm.internal.s.g(bVar2.b(), Boolean.FALSE)) {
                                sVarU6.b5(false);
                            } else {
                                sVarU6.b5(true);
                            }
                        } else {
                            bVar.u6().b5(bVar.f43884k);
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                        bVar.y6(false);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                        bVar.y6(true);
                        break;
                }
            }
        });
        View view7 = this.f43879f;
        if (view7 == null) {
            p005kotlin.jvm.internal.s.m("assistancePlusView");
            throw null;
        }
        final int i15 = 2;
        view7.setOnClickListener(new View.OnClickListener(this) { // from class: zj1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b f204908b;

            {
                this.f204908b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x007c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                boolean z14;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar = this.f204908b;
                switch (i16) {
                    case 0:
                        if (bVar.f43884k) {
                            pj1.s sVarU6 = bVar.u6();
                            Integer numValueOf = Integer.valueOf(R.string.safety_features_wizard_lte_activation_2);
                            Integer numValueOf2 = Integer.valueOf(R.string.lte_not_activated);
                            y0<w61.f<p<Integer, Integer>>> y0Var = sVarU6.L0;
                            vi1.b bVar2 = sVarU6.f137903e;
                            if (!sVarU6.f137983t) {
                                sVarU6.f137983t = true;
                            }
                            ArrayList arrayList = sVarU6.P;
                            if (arrayList != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (((sd2.f) obj).y0()) {
                                        arrayList2.add(obj);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    z14 = false;
                                } else {
                                    Iterator it = arrayList2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z14 = false;
                                        } else if (bVar2.k(((sd2.f) it.next()).getUnitID())) {
                                            z14 = true;
                                        }
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            boolean z15 = sVarU6.f137911m;
                            if (!z15 && z14) {
                                y0Var.m(new w61.f<>(new p(numValueOf2, numValueOf)));
                            } else if (!z15) {
                                y0Var.m(new w61.f<>(new p(numValueOf2, numValueOf)));
                            } else if (p005kotlin.jvm.internal.s.g(bVar2.b(), Boolean.FALSE)) {
                                sVarU6.b5(false);
                            } else {
                                sVarU6.b5(true);
                            }
                        } else {
                            bVar.u6().b5(bVar.f43884k);
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                        bVar.y6(false);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                        bVar.y6(true);
                        break;
                }
            }
        });
        final int i16 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: zj1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b f204908b;

            {
                this.f204908b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x007c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                boolean z14;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar = this.f204908b;
                switch (i17) {
                    case 0:
                        if (bVar.f43884k) {
                            pj1.s sVarU6 = bVar.u6();
                            Integer numValueOf = Integer.valueOf(R.string.safety_features_wizard_lte_activation_2);
                            Integer numValueOf2 = Integer.valueOf(R.string.lte_not_activated);
                            y0<w61.f<p<Integer, Integer>>> y0Var = sVarU6.L0;
                            vi1.b bVar2 = sVarU6.f137903e;
                            if (!sVarU6.f137983t) {
                                sVarU6.f137983t = true;
                            }
                            ArrayList arrayList = sVarU6.P;
                            if (arrayList != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (((sd2.f) obj).y0()) {
                                        arrayList2.add(obj);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    z14 = false;
                                } else {
                                    Iterator it = arrayList2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z14 = false;
                                        } else if (bVar2.k(((sd2.f) it.next()).getUnitID())) {
                                            z14 = true;
                                        }
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            boolean z15 = sVarU6.f137911m;
                            if (!z15 && z14) {
                                y0Var.m(new w61.f<>(new p(numValueOf2, numValueOf)));
                            } else if (!z15) {
                                y0Var.m(new w61.f<>(new p(numValueOf2, numValueOf)));
                            } else if (p005kotlin.jvm.internal.s.g(bVar2.b(), Boolean.FALSE)) {
                                sVarU6.b5(false);
                            } else {
                                sVarU6.b5(true);
                            }
                        } else {
                            bVar.u6().b5(bVar.f43884k);
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                        bVar.y6(false);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                        bVar.y6(true);
                        break;
                }
            }
        });
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f43886m, viewLifecycleOwner);
        final int i17 = 0;
        u6().M0.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: zj1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b f204906b;

            {
                this.f204906b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                final com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar = this.f204906b;
                switch (i18) {
                    case 0:
                        p pVar = (p) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                        pVar.getClass();
                        Integer num = (Integer) pVar.f128594a;
                        Integer num2 = (Integer) pVar.f128595b;
                        if (num != null && num2 != null) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(bVar.requireContext());
                            aVar2.setTitle(iIntValue);
                            aVar2.setMessage(iIntValue2);
                            final int i19 = 0;
                            aVar2.setCancelable(false);
                            if ((iIntValue == R.string.more_information_needed_title && iIntValue2 == R.string.more_information_and_assistance_contact_needed_desc) || (iIntValue == R.string.lte_activation_in_progress_dialog_title && iIntValue2 == R.string.lte_activation_in_progress_dialog_desc)) {
                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                aVar2.create().show();
                            } else if (iIntValue == R.string.lte_not_activated && iIntValue2 == R.string.safety_features_wizard_lte_activation_2) {
                                aVar2.setPositiveButton(R.string.lte_set_up_button_title, new DialogInterface.OnClickListener() { // from class: zj1.c
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i24) {
                                        int i25 = i19;
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar2 = bVar;
                                        switch (i25) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                                                bVar2.u6().L4();
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                                                pj1.s.Z4(bVar2.u6(), null, 3);
                                                bVar2.f43886m.f(false);
                                                dialogInterface.dismiss();
                                                bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                    }
                                });
                                aVar2.setNegativeButton(R.string.lbl_cancel, new xk1.v(28));
                                aVar2.create().show();
                            } else {
                                final int i24 = 1;
                                aVar2.setPositiveButton(R.string.lbl_exit, new DialogInterface.OnClickListener() { // from class: zj1.c
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i25) {
                                        int i26 = i24;
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar2 = bVar;
                                        switch (i26) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                                                bVar2.u6().L4();
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                                                pj1.s.Z4(bVar2.u6(), null, 3);
                                                bVar2.f43886m.f(false);
                                                dialogInterface.dismiss();
                                                bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                    }
                                });
                                aVar2.setNegativeButton(R.string.lbl_cancel, new xk1.v(29));
                                aVar2.create().show();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Long l14 = (Long) obj;
                        l14.getClass();
                        f.c<Long> cVar = bVar.f43883j;
                        if (cVar != null) {
                            cVar.a(l14, null);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("activityResultLauncher");
                        throw null;
                }
            }
        }));
        final int i18 = 1;
        u6().Y0.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: zj1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b f204906b;

            {
                this.f204906b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                final com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar = this.f204906b;
                switch (i19) {
                    case 0:
                        p pVar = (p) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                        pVar.getClass();
                        Integer num = (Integer) pVar.f128594a;
                        Integer num2 = (Integer) pVar.f128595b;
                        if (num != null && num2 != null) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(bVar.requireContext());
                            aVar2.setTitle(iIntValue);
                            aVar2.setMessage(iIntValue2);
                            final int i110 = 0;
                            aVar2.setCancelable(false);
                            if ((iIntValue == R.string.more_information_needed_title && iIntValue2 == R.string.more_information_and_assistance_contact_needed_desc) || (iIntValue == R.string.lte_activation_in_progress_dialog_title && iIntValue2 == R.string.lte_activation_in_progress_dialog_desc)) {
                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                aVar2.create().show();
                            } else if (iIntValue == R.string.lte_not_activated && iIntValue2 == R.string.safety_features_wizard_lte_activation_2) {
                                aVar2.setPositiveButton(R.string.lte_set_up_button_title, new DialogInterface.OnClickListener() { // from class: zj1.c
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i25) {
                                        int i26 = i110;
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar2 = bVar;
                                        switch (i26) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                                                bVar2.u6().L4();
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                                                pj1.s.Z4(bVar2.u6(), null, 3);
                                                bVar2.f43886m.f(false);
                                                dialogInterface.dismiss();
                                                bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                    }
                                });
                                aVar2.setNegativeButton(R.string.lbl_cancel, new xk1.v(28));
                                aVar2.create().show();
                            } else {
                                final int i24 = 1;
                                aVar2.setPositiveButton(R.string.lbl_exit, new DialogInterface.OnClickListener() { // from class: zj1.c
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i25) {
                                        int i26 = i24;
                                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar2 = bVar;
                                        switch (i26) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                                                bVar2.u6().L4();
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                                                pj1.s.Z4(bVar2.u6(), null, 3);
                                                bVar2.f43886m.f(false);
                                                dialogInterface.dismiss();
                                                bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                                break;
                                        }
                                    }
                                });
                                aVar2.setNegativeButton(R.string.lbl_cancel, new xk1.v(29));
                                aVar2.create().show();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        Long l14 = (Long) obj;
                        l14.getClass();
                        f.c<Long> cVar = bVar.f43883j;
                        if (cVar != null) {
                            cVar.a(l14, null);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("activityResultLauncher");
                        throw null;
                }
            }
        }));
        f.c<Long> cVarRegisterForActivityResult = registerForActivityResult(((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).d(), new y(this, 23));
        cVarRegisterForActivityResult.getClass();
        this.f43883j = cVarRegisterForActivityResult;
    }

    public final pj1.s u6() {
        return (pj1.s) this.f43885l.getValue();
    }

    public final void w6(TextView textView, String str, boolean z14) {
        String strSubstring = str.substring(d53.w.H(str, "<link>", 0, false, 6) + 6, d53.w.H(str, "</link>", 0, false, 6));
        String strV = u.v(u.v(str, str.substring(d53.w.H(str, "<link>", 0, false, 6), d53.w.H(str, "</link>", 0, false, 6) + 7), "", false), "• ", "", false);
        String strConcat = strV.concat(strSubstring);
        SpannableString spannableString = new SpannableString(strConcat);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        spannableString.setSpan(new C0818b(contextRequireContext, Boolean.valueOf(z14), false, false, 12, null), strV.length(), strConcat.length(), 33);
        spannableString.setSpan(new BulletSpan(16), 0, strConcat.length(), 33);
        textView.setTag("help");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    public final void y6(boolean z14) {
        this.f43884k = z14;
        ImageView imageView = this.f43881h;
        if (!z14) {
            if (imageView == null) {
                p005kotlin.jvm.internal.s.m("assistanceCheckboxView");
                throw null;
            }
            imageView.setVisibility(0);
            ImageView imageView2 = this.f43882i;
            if (imageView2 == null) {
                p005kotlin.jvm.internal.s.m("assistancePlusCheckboxView");
                throw null;
            }
            imageView2.setVisibility(4);
            TextView textView = this.f43877d;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("note4");
                throw null;
            }
            textView.setVisibility(8);
            TextView textView2 = this.f43878e;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("note5");
                throw null;
            }
            textView2.setVisibility(8);
            TextView textView3 = this.f43874a;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("note1");
                throw null;
            }
            String string = getString(R.string.safety_features_wizard_type_assistance_features_notify_assistance_contacts);
            string.getClass();
            v6(textView3, string);
            TextView textView4 = this.f43875b;
            if (textView4 == null) {
                p005kotlin.jvm.internal.s.m("note2");
                throw null;
            }
            String string2 = getString(R.string.safety_features_wizard_type_features_incident_detection_included);
            string2.getClass();
            v6(textView4, string2);
            TextView textView5 = this.f43876c;
            if (textView5 == null) {
                p005kotlin.jvm.internal.s.m("note3");
                throw null;
            }
            String string3 = getString(R.string.safety_features_wizard_type_features_learn_more);
            string3.getClass();
            w6(textView5, string3, z14);
            return;
        }
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("assistanceCheckboxView");
            throw null;
        }
        imageView.setVisibility(4);
        ImageView imageView3 = this.f43882i;
        if (imageView3 == null) {
            p005kotlin.jvm.internal.s.m("assistancePlusCheckboxView");
            throw null;
        }
        imageView3.setVisibility(0);
        TextView textView6 = this.f43877d;
        if (textView6 == null) {
            p005kotlin.jvm.internal.s.m("note4");
            throw null;
        }
        textView6.setVisibility(0);
        TextView textView7 = this.f43878e;
        if (textView7 == null) {
            p005kotlin.jvm.internal.s.m("note5");
            throw null;
        }
        textView7.setVisibility(0);
        TextView textView8 = this.f43874a;
        if (textView8 == null) {
            p005kotlin.jvm.internal.s.m("note1");
            throw null;
        }
        String string4 = getString(R.string.safety_features_wizard_type_aplus_features_call_center);
        string4.getClass();
        String strSubstring = string4.substring(d53.w.H(string4, "<link>", 0, false, 6) + 6, d53.w.H(string4, "</link>", 0, false, 6));
        String strV = u.v(u.v(string4, string4.substring(d53.w.H(string4, "<link>", 0, false, 6), d53.w.H(string4, "</link>", 0, false, 6) + 7), strSubstring, false), "• ", "", false);
        SpannableString spannableString = new SpannableString(strV);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        spannableString.setSpan(new C0818b(contextRequireContext, null, false, false, 14, null), d53.w.H(strV, strSubstring, 0, false, 6), strSubstring.length() + d53.w.H(strV, strSubstring, 0, false, 6), 33);
        spannableString.setSpan(new BulletSpan(16), 0, strV.length(), 33);
        textView8.setTag("country");
        textView8.setMovementMethod(LinkMovementMethod.getInstance());
        textView8.setText(spannableString);
        TextView textView9 = this.f43875b;
        if (textView9 == null) {
            p005kotlin.jvm.internal.s.m("note2");
            throw null;
        }
        String string5 = getString(R.string.safety_features_wizard_type_aplus_features_assistance_contacts_included);
        string5.getClass();
        v6(textView9, string5);
        TextView textView10 = this.f43876c;
        if (textView10 == null) {
            p005kotlin.jvm.internal.s.m("note3");
            throw null;
        }
        String string6 = getString(R.string.safety_features_wizard_type_features_incident_detection_included);
        string6.getClass();
        v6(textView10, string6);
        TextView textView11 = this.f43877d;
        if (textView11 == null) {
            p005kotlin.jvm.internal.s.m("note4");
            throw null;
        }
        String string7 = getString(R.string.safety_features_wizard_type_aplus_features_free_with_lte);
        string7.getClass();
        v6(textView11, string7);
        TextView textView12 = this.f43878e;
        if (textView12 == null) {
            p005kotlin.jvm.internal.s.m("note5");
            throw null;
        }
        String string8 = getString(R.string.safety_features_wizard_type_features_learn_more);
        string8.getClass();
        w6(textView12, string8, z14);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LINK_SUPPORTED_COUNTRIES", "ARG_SHOW_EXIT_DIALOG", "", "DEFAULT_SHOW_EXIT_DIALOG", "Z", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/b$b;", "Landroid/text/style/ClickableSpan;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isAplusSelected", "isEmergencyCallingCapable", "isFallDetectionCapable", "<init>", "(Landroid/content/Context;Ljava/lang/Boolean;ZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0818b extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f43887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f43888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f43889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f43890d;

        public /* synthetic */ C0818b(Context context, Boolean bool, boolean z14, boolean z15, int i14, j jVar) {
            this(context, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15);
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            boolean zEquals = view2.getTag().equals("help");
            Context context = this.f43890d;
            if (!zEquals) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/LTECoverage")));
                return;
            }
            Boolean bool = this.f43887a;
            if (bool != null) {
                d0.m(context, bool.booleanValue(), this.f43888b, this.f43889c, false);
            }
        }

        public C0818b(Context context, Boolean bool, boolean z14, boolean z15) {
            context.getClass();
            this.f43887a = bool;
            this.f43888b = z14;
            this.f43889c = z15;
            this.f43890d = context;
        }
    }
}
