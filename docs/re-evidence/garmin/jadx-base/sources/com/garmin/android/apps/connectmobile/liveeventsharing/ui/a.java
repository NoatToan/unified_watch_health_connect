package com.garmin.android.apps.connectmobile.liveeventsharing.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.view.View;
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
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.z1;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import cu0.i;
import e23.l;
import java.text.DecimalFormatSymbols;
import mh1.x;
import mt0.y;
import o13.h;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0679a f38531q = new C0679a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f38532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f38533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f38534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f38535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f38536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f38537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f38538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f38539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f38540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextInputLayout f38541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextInputEditText f38542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f38543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m3 f38544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f38545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f38546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f38547p;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38548a;

        static {
            int[] iArr = new int[iu0.b.values().length];
            try {
                iArr[iu0.b.FIVE_K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iu0.b.TEN_K.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iu0.b.HALF_MARATHON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[iu0.b.MARATHON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[iu0.b.METRIC_CENTURY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[iu0.b.CENTURY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f38548a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/liveeventsharing/ui/a$c", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = a.this;
            TextInputEditText textInputEditText = aVar.f38542k;
            if (textInputEditText == null) {
                p005kotlin.jvm.internal.s.m("editTextBox");
                throw null;
            }
            double dB = b1.b(String.valueOf(textInputEditText.getText()));
            TextInputEditText textInputEditText2 = aVar.f38542k;
            if (textInputEditText2 == null) {
                p005kotlin.jvm.internal.s.m("editTextBox");
                throw null;
            }
            if (!textInputEditText2.isEnabled() || dB > 0.0d) {
                f(false);
                aVar.requireActivity().onBackPressed();
                return;
            }
            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(aVar.requireContext());
            aVar2.setTitle(aVar.getString(R.string.live_event_sharing_invalid_distance));
            aVar2.setMessage(aVar.getString(R.string.live_event_sharing_enter_custom_distance_desc));
            aVar2.setCancelable(false);
            aVar2.setPositiveButton(aVar.getString(R.string.lbl_ok), new y(4));
            aVar2.create().show();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f38550a;

        public d(l lVar) {
            lVar.getClass();
            this.f38550a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f38550a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38550a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38551a;

        public e(Fragment fragment) {
            this.f38551a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f38551a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f38556e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f38552a = fragment;
            this.f38553b = qualifier;
            this.f38554c = aVar;
            this.f38555d = aVar2;
            this.f38556e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, cu0.i] */
        @Override // e23.a
        public final i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f38554c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getViewModelStore();
            Fragment fragment = this.f38552a;
            e23.a aVar = this.f38555d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i.class), viewModelStore, null, defaultViewModelCreationExtras, this.f38553b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f38556e, 4, null);
        }
    }

    public a() {
        super(R.layout.gcm_live_event_sharing_completion_time);
        this.f38546o = o13.m.a(o13.n.NONE, new f(this, null, new e(this), null, null));
        this.f38547p = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, getString(R.string.live_event_sharing_completion_time));
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f38547p, viewLifecycleOwner);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        m3 m3Var;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
            String string = getString(R.string.lbl_kilometers);
            string.getClass();
            this.f38545n = string;
            m3Var = m3.KILOMETER;
        } else {
            String string2 = getString(R.string.lbl_miles);
            string2.getClass();
            this.f38545n = string2;
            m3Var = m3.MILE;
        }
        this.f38544m = m3Var;
        this.f38540i = a7.b.getDrawable(view2.getContext(), 2131232298);
        View viewFindViewById = view2.findViewById(R.id.completion_time_toggle);
        viewFindViewById.getClass();
        this.f38532a = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.completion_time_5k);
        viewFindViewById2.getClass();
        this.f38533b = (GCMComplexOneLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.completion_time_10k);
        viewFindViewById3.getClass();
        this.f38534c = (GCMComplexOneLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.completion_time_half_marathon);
        viewFindViewById4.getClass();
        this.f38535d = (GCMComplexOneLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.completion_time_marathon);
        viewFindViewById5.getClass();
        this.f38536e = (GCMComplexOneLineButton) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.completion_time_metric_century);
        viewFindViewById6.getClass();
        this.f38537f = (GCMComplexOneLineButton) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.completion_time_century);
        viewFindViewById7.getClass();
        this.f38538g = (GCMComplexOneLineButton) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.completion_time_custom);
        viewFindViewById8.getClass();
        this.f38539h = (GCMComplexOneLineButton) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.text_input_layout);
        viewFindViewById9.getClass();
        this.f38541j = (TextInputLayout) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.completion_time_custom_edit_text);
        viewFindViewById10.getClass();
        this.f38542k = (TextInputEditText) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.custom_distance_metric_label);
        viewFindViewById11.getClass();
        this.f38543l = (TextView) viewFindViewById11;
        char decimalSeparator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        TextInputEditText textInputEditText = this.f38542k;
        if (textInputEditText == null) {
            p005kotlin.jvm.internal.s.m("editTextBox");
            throw null;
        }
        textInputEditText.setFilters(new InputFilter[]{new mu0.b(5, 1, decimalSeparator)});
        TextInputEditText textInputEditText2 = this.f38542k;
        if (textInputEditText2 == null) {
            p005kotlin.jvm.internal.s.m("editTextBox");
            throw null;
        }
        textInputEditText2.setKeyListener(DigitsKeyListener.getInstance("0123456789" + decimalSeparator));
        TextView textView = this.f38543l;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("editTextBoxUomLabel");
            throw null;
        }
        String str = this.f38545n;
        if (str == null) {
            p005kotlin.jvm.internal.s.m("customDistanceLabel");
            throw null;
        }
        textView.setText(str);
        ht.a.f85464a.getClass();
        ht.a.a(null, "LiveEventMessageCompletionTimeActivity");
        u6().f55588f.f(getViewLifecycleOwner(), new d(new x(this, 15)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i u6() {
        return (i) this.f38546o.getValue();
    }

    public final void v6(boolean z14) {
        m3 m3Var = this.f38544m;
        if (m3Var == null) {
            p005kotlin.jvm.internal.s.m("unitOfMeasure");
            throw null;
        }
        if (m3Var == m3.KILOMETER) {
            double d14 = z14 ? 40.0d : 16.1d;
            TextInputEditText textInputEditText = this.f38542k;
            if (textInputEditText == null) {
                p005kotlin.jvm.internal.s.m("editTextBox");
                throw null;
            }
            l3.f23124b.getClass();
            textInputEditText.setText(l3.f23130h.format(d14));
            return;
        }
        if (m3Var == null) {
            p005kotlin.jvm.internal.s.m("unitOfMeasure");
            throw null;
        }
        if (m3Var == m3.MILE) {
            double d15 = z14 ? 30.0d : 10.0d;
            TextInputEditText textInputEditText2 = this.f38542k;
            if (textInputEditText2 == null) {
                p005kotlin.jvm.internal.s.m("editTextBox");
                throw null;
            }
            l3.f23124b.getClass();
            textInputEditText2.setText(l3.f23130h.format(d15));
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.liveeventsharing.ui.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_CUSTOM_DISTANCE_KM", "D", "DEFAULT_CUSTOM_DISTANCE_MI", "DEFAULT_CYCLING_CUSTOM_DISTANCE_KM", "DEFAULT_CYCLING_CUSTOM_DISTANCE_MI", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0679a {
        public /* synthetic */ C0679a(j jVar) {
            this();
        }

        private C0679a() {
        }
    }
}
