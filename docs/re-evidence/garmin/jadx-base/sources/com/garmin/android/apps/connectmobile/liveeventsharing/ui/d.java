package com.garmin.android.apps.connectmobile.liveeventsharing.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import c22.b1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.z1;
import com.github.mikephil.chartingv2.BuildConfig;
import com.google.android.material.textfield.TextInputEditText;
import cu0.i;
import f12.l;
import fw.p;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import mh1.q;
import mt0.b2;
import mt0.y;
import o13.h;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f38580q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f38581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f38582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f38583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f38584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f38585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f38586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f38587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f38588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexTwoLineButton f38589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f38590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextInputEditText f38591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ScrollView f38592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f38593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f38594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f38595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f38596p;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/liveeventsharing/ui/d$b", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            String string;
            d dVar = d.this;
            TextInputEditText textInputEditText = dVar.f38591k;
            if (textInputEditText == null) {
                p005kotlin.jvm.internal.s.m("editTextBox");
                throw null;
            }
            double dB = b1.b(String.valueOf(textInputEditText.getText()));
            LinearLayout linearLayout = dVar.f38587g;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("distanceLayout");
                throw null;
            }
            if (!v22.e.d(linearLayout) || dB > 0.0d) {
                f(false);
                dVar.requireActivity().onBackPressed();
                return;
            }
            if (((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y()) {
                String string2 = dVar.getString(R.string.lbl_kilometers);
                string2.getClass();
                String lowerCase = string2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                string = dVar.getString(R.string.lbl_incorrect_distance_msg, ".8", "32", lowerCase);
            } else {
                String string3 = dVar.getString(R.string.lbl_miles);
                string3.getClass();
                String lowerCase2 = string3.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                string = dVar.getString(R.string.lbl_incorrect_distance_msg, ".5", "20", lowerCase2);
            }
            string.getClass();
            dVar.y6(R.string.live_event_sharing_invalid_distance, string);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f38598a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f38598a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f38598a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38598a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.liveeventsharing.ui.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0682d implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38599a;

        public C0682d(Fragment fragment) {
            this.f38599a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f38599a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f38604e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f38600a = fragment;
            this.f38601b = qualifier;
            this.f38602c = aVar;
            this.f38603d = aVar2;
            this.f38604e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, cu0.i] */
        @Override // e23.a
        public final i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f38602c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f38600a;
            e23.a aVar = this.f38603d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i.class), viewModelStore, null, defaultViewModelCreationExtras, this.f38601b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f38604e, 4, null);
        }
    }

    public d() {
        super(R.layout.gcm_live_event_sharing_message_triggers);
        this.f38594n = o13.m.a(o13.n.NONE, new e(this, null, new C0682d(this), null, null));
        this.f38595o = o13.m.b(new q(16));
        this.f38596p = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, getString(R.string.live_event_sharing_msg_triggers));
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f38596p, viewLifecycleOwner);
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f38581a;
        if (gCMComplexOneLineButton == null) {
            p005kotlin.jvm.internal.s.m("startButton");
            throw null;
        }
        final int i14 = 0;
        gCMComplexOneLineButton.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.d f121108b;

            {
                this.f121108b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ju0.q qVar;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = this.f121108b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerStartClicked");
                        dVar.v6().y4(ju0.c.START);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTransitionsClicked");
                        dVar.v6().y4(ju0.c.EVERY_TRANSITION);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerEndClicked");
                        dVar.v6().y4(ju0.c.END);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerLapClicked");
                        dVar.v6().F4(ju0.c.EVERY_LAP);
                        TextInputEditText textInputEditText = dVar.f38591k;
                        if (textInputEditText != null) {
                            v22.e.b(textInputEditText);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerDistanceClicked");
                        dVar.v6().F4(ju0.c.DISTANCE);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTimeClicked");
                        dVar.v6().F4(ju0.c.TIME);
                        TextInputEditText textInputEditText2 = dVar.f38591k;
                        if (textInputEditText2 != null) {
                            v22.e.b(textInputEditText2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar7 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        cu0.i iVarV6 = dVar.v6();
                        fw.m<ju0.q> mVarD = iVarV6.A4().d();
                        iVarV6.f55592j.m(new w61.f<>(Integer.valueOf((mVarD == null || (qVar = mVarD.f73770c) == null) ? (int) 1200 : qVar.k())));
                        return;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f38582b;
        if (gCMComplexOneLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("transitionsButton");
            throw null;
        }
        final int i15 = 1;
        gCMComplexOneLineButton2.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.d f121108b;

            {
                this.f121108b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ju0.q qVar;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = this.f121108b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerStartClicked");
                        dVar.v6().y4(ju0.c.START);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTransitionsClicked");
                        dVar.v6().y4(ju0.c.EVERY_TRANSITION);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerEndClicked");
                        dVar.v6().y4(ju0.c.END);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerLapClicked");
                        dVar.v6().F4(ju0.c.EVERY_LAP);
                        TextInputEditText textInputEditText = dVar.f38591k;
                        if (textInputEditText != null) {
                            v22.e.b(textInputEditText);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerDistanceClicked");
                        dVar.v6().F4(ju0.c.DISTANCE);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTimeClicked");
                        dVar.v6().F4(ju0.c.TIME);
                        TextInputEditText textInputEditText2 = dVar.f38591k;
                        if (textInputEditText2 != null) {
                            v22.e.b(textInputEditText2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar7 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        cu0.i iVarV6 = dVar.v6();
                        fw.m<ju0.q> mVarD = iVarV6.A4().d();
                        iVarV6.f55592j.m(new w61.f<>(Integer.valueOf((mVarD == null || (qVar = mVarD.f73770c) == null) ? (int) 1200 : qVar.k())));
                        return;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f38583c;
        if (gCMComplexOneLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("endButton");
            throw null;
        }
        final int i16 = 2;
        gCMComplexOneLineButton3.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.d f121108b;

            {
                this.f121108b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ju0.q qVar;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = this.f121108b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerStartClicked");
                        dVar.v6().y4(ju0.c.START);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTransitionsClicked");
                        dVar.v6().y4(ju0.c.EVERY_TRANSITION);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerEndClicked");
                        dVar.v6().y4(ju0.c.END);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerLapClicked");
                        dVar.v6().F4(ju0.c.EVERY_LAP);
                        TextInputEditText textInputEditText = dVar.f38591k;
                        if (textInputEditText != null) {
                            v22.e.b(textInputEditText);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerDistanceClicked");
                        dVar.v6().F4(ju0.c.DISTANCE);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTimeClicked");
                        dVar.v6().F4(ju0.c.TIME);
                        TextInputEditText textInputEditText2 = dVar.f38591k;
                        if (textInputEditText2 != null) {
                            v22.e.b(textInputEditText2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar7 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        cu0.i iVarV6 = dVar.v6();
                        fw.m<ju0.q> mVarD = iVarV6.A4().d();
                        iVarV6.f55592j.m(new w61.f<>(Integer.valueOf((mVarD == null || (qVar = mVarD.f73770c) == null) ? (int) 1200 : qVar.k())));
                        return;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f38584d;
        if (gCMComplexOneLineButton4 == null) {
            p005kotlin.jvm.internal.s.m("lapsButton");
            throw null;
        }
        final int i17 = 3;
        gCMComplexOneLineButton4.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.d f121108b;

            {
                this.f121108b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ju0.q qVar;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = this.f121108b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerStartClicked");
                        dVar.v6().y4(ju0.c.START);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTransitionsClicked");
                        dVar.v6().y4(ju0.c.EVERY_TRANSITION);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerEndClicked");
                        dVar.v6().y4(ju0.c.END);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerLapClicked");
                        dVar.v6().F4(ju0.c.EVERY_LAP);
                        TextInputEditText textInputEditText = dVar.f38591k;
                        if (textInputEditText != null) {
                            v22.e.b(textInputEditText);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerDistanceClicked");
                        dVar.v6().F4(ju0.c.DISTANCE);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTimeClicked");
                        dVar.v6().F4(ju0.c.TIME);
                        TextInputEditText textInputEditText2 = dVar.f38591k;
                        if (textInputEditText2 != null) {
                            v22.e.b(textInputEditText2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar7 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        cu0.i iVarV6 = dVar.v6();
                        fw.m<ju0.q> mVarD = iVarV6.A4().d();
                        iVarV6.f55592j.m(new w61.f<>(Integer.valueOf((mVarD == null || (qVar = mVarD.f73770c) == null) ? (int) 1200 : qVar.k())));
                        return;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton5 = this.f38586f;
        if (gCMComplexOneLineButton5 == null) {
            p005kotlin.jvm.internal.s.m("distanceButton");
            throw null;
        }
        final int i18 = 4;
        gCMComplexOneLineButton5.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.d f121108b;

            {
                this.f121108b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ju0.q qVar;
                int i19 = i18;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = this.f121108b;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerStartClicked");
                        dVar.v6().y4(ju0.c.START);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTransitionsClicked");
                        dVar.v6().y4(ju0.c.EVERY_TRANSITION);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerEndClicked");
                        dVar.v6().y4(ju0.c.END);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerLapClicked");
                        dVar.v6().F4(ju0.c.EVERY_LAP);
                        TextInputEditText textInputEditText = dVar.f38591k;
                        if (textInputEditText != null) {
                            v22.e.b(textInputEditText);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerDistanceClicked");
                        dVar.v6().F4(ju0.c.DISTANCE);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTimeClicked");
                        dVar.v6().F4(ju0.c.TIME);
                        TextInputEditText textInputEditText2 = dVar.f38591k;
                        if (textInputEditText2 != null) {
                            v22.e.b(textInputEditText2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar7 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        cu0.i iVarV6 = dVar.v6();
                        fw.m<ju0.q> mVarD = iVarV6.A4().d();
                        iVarV6.f55592j.m(new w61.f<>(Integer.valueOf((mVarD == null || (qVar = mVarD.f73770c) == null) ? (int) 1200 : qVar.k())));
                        return;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton6 = this.f38588h;
        if (gCMComplexOneLineButton6 == null) {
            p005kotlin.jvm.internal.s.m("timeButton");
            throw null;
        }
        final int i19 = 5;
        gCMComplexOneLineButton6.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.d f121108b;

            {
                this.f121108b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ju0.q qVar;
                int i110 = i19;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = this.f121108b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerStartClicked");
                        dVar.v6().y4(ju0.c.START);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTransitionsClicked");
                        dVar.v6().y4(ju0.c.EVERY_TRANSITION);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerEndClicked");
                        dVar.v6().y4(ju0.c.END);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerLapClicked");
                        dVar.v6().F4(ju0.c.EVERY_LAP);
                        TextInputEditText textInputEditText = dVar.f38591k;
                        if (textInputEditText != null) {
                            v22.e.b(textInputEditText);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerDistanceClicked");
                        dVar.v6().F4(ju0.c.DISTANCE);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTimeClicked");
                        dVar.v6().F4(ju0.c.TIME);
                        TextInputEditText textInputEditText2 = dVar.f38591k;
                        if (textInputEditText2 != null) {
                            v22.e.b(textInputEditText2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar7 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        cu0.i iVarV6 = dVar.v6();
                        fw.m<ju0.q> mVarD = iVarV6.A4().d();
                        iVarV6.f55592j.m(new w61.f<>(Integer.valueOf((mVarD == null || (qVar = mVarD.f73770c) == null) ? (int) 1200 : qVar.k())));
                        return;
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f38589i;
        if (gCMComplexTwoLineButton == null) {
            p005kotlin.jvm.internal.s.m("timeButtonLabel");
            throw null;
        }
        final int i24 = 6;
        gCMComplexTwoLineButton.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.d f121108b;

            {
                this.f121108b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ju0.q qVar;
                int i110 = i24;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = this.f121108b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerStartClicked");
                        dVar.v6().y4(ju0.c.START);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTransitionsClicked");
                        dVar.v6().y4(ju0.c.EVERY_TRANSITION);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerEndClicked");
                        dVar.v6().y4(ju0.c.END);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerLapClicked");
                        dVar.v6().F4(ju0.c.EVERY_LAP);
                        TextInputEditText textInputEditText = dVar.f38591k;
                        if (textInputEditText != null) {
                            v22.e.b(textInputEditText);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerDistanceClicked");
                        dVar.v6().F4(ju0.c.DISTANCE);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        dVar.w6("MessageTriggerTimeClicked");
                        dVar.v6().F4(ju0.c.TIME);
                        TextInputEditText textInputEditText2 = dVar.f38591k;
                        if (textInputEditText2 != null) {
                            v22.e.b(textInputEditText2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("editTextBox");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar7 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        cu0.i iVarV6 = dVar.v6();
                        fw.m<ju0.q> mVarD = iVarV6.A4().d();
                        iVarV6.f55592j.m(new w61.f<>(Integer.valueOf((mVarD == null || (qVar = mVarD.f73770c) == null) ? (int) 1200 : qVar.k())));
                        return;
                }
            }
        });
        TextInputEditText textInputEditText = this.f38591k;
        if (textInputEditText == null) {
            p005kotlin.jvm.internal.s.m("editTextBox");
            throw null;
        }
        textInputEditText.setOnEditorActionListener(new bl0.a(this, 8));
        TextInputEditText textInputEditText2 = this.f38591k;
        if (textInputEditText2 != null) {
            textInputEditText2.setOnFocusChangeListener(new c32.f(this, 8));
        } else {
            p005kotlin.jvm.internal.s.m("editTextBox");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        i iVarV6 = v6();
        int i14 = i.f55582o;
        iVarV6.C4(null);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.live_event_start);
        viewFindViewById.getClass();
        this.f38581a = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.live_event_transitions);
        viewFindViewById2.getClass();
        this.f38582b = (GCMComplexOneLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.live_event_end);
        viewFindViewById3.getClass();
        this.f38583c = (GCMComplexOneLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.live_event_laps);
        viewFindViewById4.getClass();
        this.f38584d = (GCMComplexOneLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.footer_label);
        viewFindViewById5.getClass();
        this.f38585e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.live_event_distance);
        viewFindViewById6.getClass();
        this.f38586f = (GCMComplexOneLineButton) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.distance_layout);
        viewFindViewById7.getClass();
        this.f38587g = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.live_event_time);
        viewFindViewById8.getClass();
        this.f38588h = (GCMComplexOneLineButton) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.time_button_label);
        viewFindViewById9.getClass();
        this.f38589i = (GCMComplexTwoLineButton) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.custom_distance_metric_label);
        viewFindViewById10.getClass();
        this.f38590j = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.triggers_scrollview);
        viewFindViewById11.getClass();
        this.f38592l = (ScrollView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.distance_edit_text);
        viewFindViewById12.getClass();
        this.f38591k = (TextInputEditText) viewFindViewById12;
        char decimalSeparator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        TextInputEditText textInputEditText = this.f38591k;
        if (textInputEditText == null) {
            p005kotlin.jvm.internal.s.m("editTextBox");
            throw null;
        }
        final int i14 = 1;
        final int i15 = 0;
        textInputEditText.setFilters(new InputFilter[]{new mu0.b(5, 1, decimalSeparator)});
        TextInputEditText textInputEditText2 = this.f38591k;
        if (textInputEditText2 == null) {
            p005kotlin.jvm.internal.s.m("editTextBox");
            throw null;
        }
        textInputEditText2.setKeyListener(DigitsKeyListener.getInstance("0123456789" + decimalSeparator));
        Drawable drawable = a7.b.getDrawable(view2.getContext(), 2131232298);
        this.f38593m = drawable;
        if (drawable != null) {
            drawable.setAlpha(255);
        }
        v6().f55589g.f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: mu0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.d f121110b;

            {
                this.f121110b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String strD;
                String string;
                StringBuilder sb3;
                String string2;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = this.f121110b;
                switch (i16) {
                    case 0:
                        Float fValueOf = Float.valueOf(16.0f);
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        iu0.f fVar = (iu0.f) g3Var.f35301b;
                        p pVar = g3Var.f35300a;
                        if (pVar == p.SUCCESS && fVar != null) {
                            g22.e.f(dVar);
                            GCMComplexOneLineButton gCMComplexOneLineButton = dVar.f38581a;
                            if (gCMComplexOneLineButton == null) {
                                p005kotlin.jvm.internal.s.m("startButton");
                                throw null;
                            }
                            boolean z14 = fVar.f95033a;
                            int i17 = fVar.f95040h;
                            dVar.u6(gCMComplexOneLineButton, z14);
                            GCMComplexOneLineButton gCMComplexOneLineButton2 = dVar.f38583c;
                            if (gCMComplexOneLineButton2 == null) {
                                p005kotlin.jvm.internal.s.m("endButton");
                                throw null;
                            }
                            dVar.u6(gCMComplexOneLineButton2, fVar.f95034b);
                            Boolean bool = fVar.f95035c;
                            GCMComplexOneLineButton gCMComplexOneLineButton3 = dVar.f38582b;
                            if (bool == null) {
                                if (gCMComplexOneLineButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("transitionsButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton3.setVisibility(8);
                            } else {
                                if (gCMComplexOneLineButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("transitionsButton");
                                    throw null;
                                }
                                dVar.u6(gCMComplexOneLineButton3, bool.booleanValue());
                            }
                            GCMComplexOneLineButton gCMComplexOneLineButton4 = dVar.f38584d;
                            if (gCMComplexOneLineButton4 == null) {
                                p005kotlin.jvm.internal.s.m("lapsButton");
                                throw null;
                            }
                            gCMComplexOneLineButton4.c(null, fValueOf);
                            GCMComplexOneLineButton gCMComplexOneLineButton5 = dVar.f38586f;
                            if (gCMComplexOneLineButton5 == null) {
                                p005kotlin.jvm.internal.s.m("distanceButton");
                                throw null;
                            }
                            gCMComplexOneLineButton5.c(null, fValueOf);
                            GCMComplexOneLineButton gCMComplexOneLineButton6 = dVar.f38588h;
                            if (gCMComplexOneLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("timeButton");
                                throw null;
                            }
                            gCMComplexOneLineButton6.c(null, fValueOf);
                            if (fVar.f95036d) {
                                GCMComplexOneLineButton gCMComplexOneLineButton7 = dVar.f38584d;
                                if (gCMComplexOneLineButton7 == null) {
                                    p005kotlin.jvm.internal.s.m("lapsButton");
                                    throw null;
                                }
                                dVar.u6(gCMComplexOneLineButton7, true);
                                TextView textView = dVar.f38585e;
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("footerLabel");
                                    throw null;
                                }
                                textView.setText(dVar.getString(R.string.live_event_sharing_laps_desc));
                                LinearLayout linearLayout = dVar.f38587g;
                                if (linearLayout == null) {
                                    p005kotlin.jvm.internal.s.m("distanceLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton = dVar.f38589i;
                                if (gCMComplexTwoLineButton == null) {
                                    p005kotlin.jvm.internal.s.m("timeButtonLabel");
                                    throw null;
                                }
                                gCMComplexTwoLineButton.setVisibility(8);
                            } else if (fVar.f95037e) {
                                GCMComplexOneLineButton gCMComplexOneLineButton8 = dVar.f38586f;
                                if (gCMComplexOneLineButton8 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceButton");
                                    throw null;
                                }
                                dVar.u6(gCMComplexOneLineButton8, true);
                                String string3 = fVar.f95039g;
                                if (string3 == null) {
                                    string3 = dVar.getString(R.string.symbol_double_dash);
                                    string3.getClass();
                                }
                                TextInputEditText textInputEditText3 = dVar.f38591k;
                                if (textInputEditText3 == null) {
                                    p005kotlin.jvm.internal.s.m("editTextBox");
                                    throw null;
                                }
                                textInputEditText3.setText(string3);
                                if (string3.equals(BuildConfig.VERSION_NAME)) {
                                    if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                                        TextView textView2 = dVar.f38590j;
                                        if (textView2 == null) {
                                            p005kotlin.jvm.internal.s.m("metricLabel");
                                            throw null;
                                        }
                                        textView2.setText(dVar.getString(R.string.lbl_kilometers));
                                        string2 = dVar.getString(R.string.live_event_sharing_recipients_distance_unit_desc, dVar.getString(R.string.lbl_kilometer_singular));
                                        string2.getClass();
                                    } else {
                                        string2 = dVar.getString(R.string.live_event_sharing_recipients_distance_unit_desc, dVar.getString(R.string.common_mile));
                                        string2.getClass();
                                    }
                                } else if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                                    TextView textView3 = dVar.f38590j;
                                    if (textView3 == null) {
                                        p005kotlin.jvm.internal.s.m("metricLabel");
                                        throw null;
                                    }
                                    textView3.setText(dVar.getString(R.string.lbl_kilometers));
                                    string2 = dVar.getString(R.string.live_event_sharing_recipients_distance_desc, string3, dVar.getString(R.string.common_lbl_kilometers));
                                    string2.getClass();
                                } else {
                                    string2 = dVar.getString(R.string.live_event_sharing_recipients_distance_desc, string3, dVar.getString(R.string.common_lbl_miles));
                                    string2.getClass();
                                }
                                TextView textView4 = dVar.f38585e;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("footerLabel");
                                    throw null;
                                }
                                textView4.setText(string2);
                                LinearLayout linearLayout2 = dVar.f38587g;
                                if (linearLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceLayout");
                                    throw null;
                                }
                                linearLayout2.setVisibility(0);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = dVar.f38589i;
                                if (gCMComplexTwoLineButton2 == null) {
                                    p005kotlin.jvm.internal.s.m("timeButtonLabel");
                                    throw null;
                                }
                                gCMComplexTwoLineButton2.setVisibility(8);
                            } else {
                                GCMComplexOneLineButton gCMComplexOneLineButton9 = dVar.f38588h;
                                if (gCMComplexOneLineButton9 == null) {
                                    p005kotlin.jvm.internal.s.m("timeButton");
                                    throw null;
                                }
                                dVar.u6(gCMComplexOneLineButton9, true);
                                l3.a aVar2 = l3.f23124b;
                                Context contextRequireContext = dVar.requireContext();
                                contextRequireContext.getClass();
                                aVar2.getClass();
                                String strV = d53.u.v(l3.a.i1(i17, contextRequireContext), ".", "", false);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = dVar.f38589i;
                                if (gCMComplexTwoLineButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("timeButtonLabel");
                                    throw null;
                                }
                                gCMComplexTwoLineButton3.setButtonBottomLeftLabel(strV);
                                if (i17 == 60) {
                                    TextView textView5 = dVar.f38585e;
                                    if (textView5 == null) {
                                        p005kotlin.jvm.internal.s.m("footerLabel");
                                        throw null;
                                    }
                                    textView5.setText(dVar.getString(R.string.live_event_sharing_time_frequency_single_desc));
                                } else {
                                    Context contextRequireContext2 = dVar.requireContext();
                                    contextRequireContext2.getClass();
                                    int i18 = i17 / DateTimeConstants.SECONDS_PER_HOUR;
                                    int i19 = i17 % DateTimeConstants.SECONDS_PER_HOUR;
                                    int i24 = i19 / 60;
                                    int i25 = i19 % 60;
                                    if (i18 != 0) {
                                        if (i18 != 1) {
                                            String string4 = contextRequireContext2.getString(R.string.lbl_time_unit_hours);
                                            string = contextRequireContext2.getString(R.string.lbl_time_unit_minutes);
                                            sb3 = new StringBuilder();
                                            sb3.append(i18);
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(string4);
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(i24);
                                        } else {
                                            String string5 = contextRequireContext2.getString(R.string.lbl_time_unit_an_hour);
                                            string = contextRequireContext2.getString(R.string.lbl_time_unit_minutes);
                                            sb3 = new StringBuilder();
                                            sb3.append(i18);
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(string5);
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(i24);
                                        }
                                        strD = am.j.o(StringUtils.SPACE, string, sb3);
                                    } else {
                                        strD = i24 == 0 ? org.apache.commons.lang3.e.d(i25, StringUtils.SPACE, contextRequireContext2.getString(R.string.lbl_time_unit_seconds)) : org.apache.commons.lang3.e.d(i24, StringUtils.SPACE, contextRequireContext2.getString(R.string.lbl_time_unit_minutes));
                                    }
                                    TextView textView6 = dVar.f38585e;
                                    if (textView6 == null) {
                                        p005kotlin.jvm.internal.s.m("footerLabel");
                                        throw null;
                                    }
                                    textView6.setText(dVar.getString(R.string.live_event_sharing_time_frequency_desc, strD));
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton4 = dVar.f38589i;
                                if (gCMComplexTwoLineButton4 == null) {
                                    p005kotlin.jvm.internal.s.m("timeButtonLabel");
                                    throw null;
                                }
                                gCMComplexTwoLineButton4.setVisibility(0);
                                LinearLayout linearLayout3 = dVar.f38587g;
                                if (linearLayout3 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceLayout");
                                    throw null;
                                }
                                linearLayout3.setVisibility(8);
                            }
                        } else if (pVar == p.LOADING) {
                            g22.e.l(dVar);
                        } else {
                            g22.e.f(dVar);
                            g22.e.c(dVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.g.W0.getClass();
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.g gVar = new com.garmin.android.apps.connectmobile.liveeventsharing.ui.g();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("EXTRA_SECONDS", iIntValue);
                        bundle2.putInt("EXTRA_MAX_HOURS", 1);
                        bundle2.putBoolean("EXTRA_DISABLE_HOURS", false);
                        gVar.setArguments(bundle2);
                        gVar.T = new b2(dVar, 4);
                        gVar.show(dVar.getChildFragmentManager(), gVar.getTag());
                        return Unit.INSTANCE;
                }
            }
        }));
        v6().f55592j.f(getViewLifecycleOwner(), new w61.g(new e23.l(this) { // from class: mu0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.d f121110b;

            {
                this.f121110b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String strD;
                String string;
                StringBuilder sb3;
                String string2;
                int i16 = i14;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = this.f121110b;
                switch (i16) {
                    case 0:
                        Float fValueOf = Float.valueOf(16.0f);
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        iu0.f fVar = (iu0.f) g3Var.f35301b;
                        p pVar = g3Var.f35300a;
                        if (pVar == p.SUCCESS && fVar != null) {
                            g22.e.f(dVar);
                            GCMComplexOneLineButton gCMComplexOneLineButton = dVar.f38581a;
                            if (gCMComplexOneLineButton == null) {
                                p005kotlin.jvm.internal.s.m("startButton");
                                throw null;
                            }
                            boolean z14 = fVar.f95033a;
                            int i17 = fVar.f95040h;
                            dVar.u6(gCMComplexOneLineButton, z14);
                            GCMComplexOneLineButton gCMComplexOneLineButton2 = dVar.f38583c;
                            if (gCMComplexOneLineButton2 == null) {
                                p005kotlin.jvm.internal.s.m("endButton");
                                throw null;
                            }
                            dVar.u6(gCMComplexOneLineButton2, fVar.f95034b);
                            Boolean bool = fVar.f95035c;
                            GCMComplexOneLineButton gCMComplexOneLineButton3 = dVar.f38582b;
                            if (bool == null) {
                                if (gCMComplexOneLineButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("transitionsButton");
                                    throw null;
                                }
                                gCMComplexOneLineButton3.setVisibility(8);
                            } else {
                                if (gCMComplexOneLineButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("transitionsButton");
                                    throw null;
                                }
                                dVar.u6(gCMComplexOneLineButton3, bool.booleanValue());
                            }
                            GCMComplexOneLineButton gCMComplexOneLineButton4 = dVar.f38584d;
                            if (gCMComplexOneLineButton4 == null) {
                                p005kotlin.jvm.internal.s.m("lapsButton");
                                throw null;
                            }
                            gCMComplexOneLineButton4.c(null, fValueOf);
                            GCMComplexOneLineButton gCMComplexOneLineButton5 = dVar.f38586f;
                            if (gCMComplexOneLineButton5 == null) {
                                p005kotlin.jvm.internal.s.m("distanceButton");
                                throw null;
                            }
                            gCMComplexOneLineButton5.c(null, fValueOf);
                            GCMComplexOneLineButton gCMComplexOneLineButton6 = dVar.f38588h;
                            if (gCMComplexOneLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("timeButton");
                                throw null;
                            }
                            gCMComplexOneLineButton6.c(null, fValueOf);
                            if (fVar.f95036d) {
                                GCMComplexOneLineButton gCMComplexOneLineButton7 = dVar.f38584d;
                                if (gCMComplexOneLineButton7 == null) {
                                    p005kotlin.jvm.internal.s.m("lapsButton");
                                    throw null;
                                }
                                dVar.u6(gCMComplexOneLineButton7, true);
                                TextView textView = dVar.f38585e;
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("footerLabel");
                                    throw null;
                                }
                                textView.setText(dVar.getString(R.string.live_event_sharing_laps_desc));
                                LinearLayout linearLayout = dVar.f38587g;
                                if (linearLayout == null) {
                                    p005kotlin.jvm.internal.s.m("distanceLayout");
                                    throw null;
                                }
                                linearLayout.setVisibility(8);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton = dVar.f38589i;
                                if (gCMComplexTwoLineButton == null) {
                                    p005kotlin.jvm.internal.s.m("timeButtonLabel");
                                    throw null;
                                }
                                gCMComplexTwoLineButton.setVisibility(8);
                            } else if (fVar.f95037e) {
                                GCMComplexOneLineButton gCMComplexOneLineButton8 = dVar.f38586f;
                                if (gCMComplexOneLineButton8 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceButton");
                                    throw null;
                                }
                                dVar.u6(gCMComplexOneLineButton8, true);
                                String string3 = fVar.f95039g;
                                if (string3 == null) {
                                    string3 = dVar.getString(R.string.symbol_double_dash);
                                    string3.getClass();
                                }
                                TextInputEditText textInputEditText3 = dVar.f38591k;
                                if (textInputEditText3 == null) {
                                    p005kotlin.jvm.internal.s.m("editTextBox");
                                    throw null;
                                }
                                textInputEditText3.setText(string3);
                                if (string3.equals(BuildConfig.VERSION_NAME)) {
                                    if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                                        TextView textView2 = dVar.f38590j;
                                        if (textView2 == null) {
                                            p005kotlin.jvm.internal.s.m("metricLabel");
                                            throw null;
                                        }
                                        textView2.setText(dVar.getString(R.string.lbl_kilometers));
                                        string2 = dVar.getString(R.string.live_event_sharing_recipients_distance_unit_desc, dVar.getString(R.string.lbl_kilometer_singular));
                                        string2.getClass();
                                    } else {
                                        string2 = dVar.getString(R.string.live_event_sharing_recipients_distance_unit_desc, dVar.getString(R.string.common_mile));
                                        string2.getClass();
                                    }
                                } else if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                                    TextView textView3 = dVar.f38590j;
                                    if (textView3 == null) {
                                        p005kotlin.jvm.internal.s.m("metricLabel");
                                        throw null;
                                    }
                                    textView3.setText(dVar.getString(R.string.lbl_kilometers));
                                    string2 = dVar.getString(R.string.live_event_sharing_recipients_distance_desc, string3, dVar.getString(R.string.common_lbl_kilometers));
                                    string2.getClass();
                                } else {
                                    string2 = dVar.getString(R.string.live_event_sharing_recipients_distance_desc, string3, dVar.getString(R.string.common_lbl_miles));
                                    string2.getClass();
                                }
                                TextView textView4 = dVar.f38585e;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("footerLabel");
                                    throw null;
                                }
                                textView4.setText(string2);
                                LinearLayout linearLayout2 = dVar.f38587g;
                                if (linearLayout2 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceLayout");
                                    throw null;
                                }
                                linearLayout2.setVisibility(0);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = dVar.f38589i;
                                if (gCMComplexTwoLineButton2 == null) {
                                    p005kotlin.jvm.internal.s.m("timeButtonLabel");
                                    throw null;
                                }
                                gCMComplexTwoLineButton2.setVisibility(8);
                            } else {
                                GCMComplexOneLineButton gCMComplexOneLineButton9 = dVar.f38588h;
                                if (gCMComplexOneLineButton9 == null) {
                                    p005kotlin.jvm.internal.s.m("timeButton");
                                    throw null;
                                }
                                dVar.u6(gCMComplexOneLineButton9, true);
                                l3.a aVar2 = l3.f23124b;
                                Context contextRequireContext = dVar.requireContext();
                                contextRequireContext.getClass();
                                aVar2.getClass();
                                String strV = d53.u.v(l3.a.i1(i17, contextRequireContext), ".", "", false);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = dVar.f38589i;
                                if (gCMComplexTwoLineButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("timeButtonLabel");
                                    throw null;
                                }
                                gCMComplexTwoLineButton3.setButtonBottomLeftLabel(strV);
                                if (i17 == 60) {
                                    TextView textView5 = dVar.f38585e;
                                    if (textView5 == null) {
                                        p005kotlin.jvm.internal.s.m("footerLabel");
                                        throw null;
                                    }
                                    textView5.setText(dVar.getString(R.string.live_event_sharing_time_frequency_single_desc));
                                } else {
                                    Context contextRequireContext2 = dVar.requireContext();
                                    contextRequireContext2.getClass();
                                    int i18 = i17 / DateTimeConstants.SECONDS_PER_HOUR;
                                    int i19 = i17 % DateTimeConstants.SECONDS_PER_HOUR;
                                    int i24 = i19 / 60;
                                    int i25 = i19 % 60;
                                    if (i18 != 0) {
                                        if (i18 != 1) {
                                            String string4 = contextRequireContext2.getString(R.string.lbl_time_unit_hours);
                                            string = contextRequireContext2.getString(R.string.lbl_time_unit_minutes);
                                            sb3 = new StringBuilder();
                                            sb3.append(i18);
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(string4);
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(i24);
                                        } else {
                                            String string5 = contextRequireContext2.getString(R.string.lbl_time_unit_an_hour);
                                            string = contextRequireContext2.getString(R.string.lbl_time_unit_minutes);
                                            sb3 = new StringBuilder();
                                            sb3.append(i18);
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(string5);
                                            sb3.append(StringUtils.SPACE);
                                            sb3.append(i24);
                                        }
                                        strD = am.j.o(StringUtils.SPACE, string, sb3);
                                    } else {
                                        strD = i24 == 0 ? org.apache.commons.lang3.e.d(i25, StringUtils.SPACE, contextRequireContext2.getString(R.string.lbl_time_unit_seconds)) : org.apache.commons.lang3.e.d(i24, StringUtils.SPACE, contextRequireContext2.getString(R.string.lbl_time_unit_minutes));
                                    }
                                    TextView textView6 = dVar.f38585e;
                                    if (textView6 == null) {
                                        p005kotlin.jvm.internal.s.m("footerLabel");
                                        throw null;
                                    }
                                    textView6.setText(dVar.getString(R.string.live_event_sharing_time_frequency_desc, strD));
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton4 = dVar.f38589i;
                                if (gCMComplexTwoLineButton4 == null) {
                                    p005kotlin.jvm.internal.s.m("timeButtonLabel");
                                    throw null;
                                }
                                gCMComplexTwoLineButton4.setVisibility(0);
                                LinearLayout linearLayout3 = dVar.f38587g;
                                if (linearLayout3 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceLayout");
                                    throw null;
                                }
                                linearLayout3.setVisibility(8);
                            }
                        } else if (pVar == p.LOADING) {
                            g22.e.l(dVar);
                        } else {
                            g22.e.f(dVar);
                            g22.e.c(dVar);
                        }
                        return Unit.INSTANCE;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.g.W0.getClass();
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.g gVar = new com.garmin.android.apps.connectmobile.liveeventsharing.ui.g();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("EXTRA_SECONDS", iIntValue);
                        bundle2.putInt("EXTRA_MAX_HOURS", 1);
                        bundle2.putBoolean("EXTRA_DISABLE_HOURS", false);
                        gVar.setArguments(bundle2);
                        gVar.T = new b2(dVar, 4);
                        gVar.show(dVar.getChildFragmentManager(), gVar.getTag());
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final void u6(GCMComplexOneLineButton gCMComplexOneLineButton, boolean z14) {
        if (z14) {
            gCMComplexOneLineButton.c(this.f38593m, Float.valueOf(16.0f));
        } else {
            gCMComplexOneLineButton.c(null, Float.valueOf(16.0f));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i v6() {
        return (i) this.f38594n.getValue();
    }

    public final void w6(String str) {
        ((ht.a) this.f38595o.getValue()).getClass();
        ht.a.a(null, str);
    }

    public final void y6(int i14, String str) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext());
        aVar.setTitle(getString(i14));
        aVar.setMessage(str);
        aVar.setCancelable(false);
        aVar.setPositiveButton(getString(R.string.lbl_ok), new y(5));
        aVar.create().show();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
