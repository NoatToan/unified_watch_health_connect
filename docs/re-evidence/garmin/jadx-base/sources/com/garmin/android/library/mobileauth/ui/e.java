package com.garmin.android.library.mobileauth.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.i0;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import java.util.Set;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import o53.s0;
import o53.t1;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import re2.g0;
import re2.l0;
import u53.o;
import v13.i;
import vb.h;
import xa1.j;
import xe2.p0;
import xe2.q0;
import xe2.r0;
import xe2.t0;
import xe2.w0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/e;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthBgBlurCapableFrag;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends MobileAuthBgBlurCapableFrag implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f50426m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f50427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f50428o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Button f50429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckBox f50430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckBox f50431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentLoadingProgressBar f50432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.EnumC1005a f50433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f50434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressBar f50435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f50436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f50437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f50438j = "16";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f50439k = "16";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f50440l = m.b(new j(29));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag", f = "TermsOfUseFrag.kt", l = {94}, m = "constructToolbarTitle$mobile_auth_release")
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50446a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50448c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f50446a = obj;
            this.f50448c |= Integer.MIN_VALUE;
            return e.this.constructToolbarTitle$mobile_auth_release(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag$constructToolbarTitle$2", f = "TermsOfUseFrag.kt", l = {}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super String>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return e.this.getString(R.string.ssoTouTitle);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/mobileauth/ui/e$d", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f50450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f50451b;

        public d(View view2, e eVar) {
            this.f50450a = view2;
            this.f50451b = eVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view2 = this.f50450a;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            Set<Integer> setC1 = this.f50451b.getFragListener$mobile_auth_release().c1();
            if (setC1.size() >= 2) {
                Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Set<Integer> set = setC1;
                marginLayoutParams.topMargin = ((Number) h0.W(set, 0)).intValue();
                toolbar.setLayoutParams(marginLayoutParams);
                NestedScrollView nestedScrollView = (NestedScrollView) view2.findViewById(R.id.scrollable_content);
                ViewGroup.LayoutParams layoutParams2 = nestedScrollView.getLayoutParams();
                layoutParams2.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = ((Number) h0.W(set, 1)).intValue();
                nestedScrollView.setLayoutParams(marginLayoutParams2);
            }
            return true;
        }
    }

    public static final Logger logger_delegate$lambda$0() {
        l0.f152316a.getClass();
        return l0.c("TermsOfUseFrag");
    }

    public static final Object y6(e eVar, i iVar) {
        eVar.getClass();
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(o.f168762a, new w0(eVar, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final Object constructToolbarTitle$mobile_auth_release(t13.d<? super String> dVar) throws Throwable {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f50448c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f50448c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE0 = bVar.f50446a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f50448c;
        if (i15 == 0) {
            r.b(objE0);
            x53.c cVar = s0.f129406a;
            t1 t1Var = o.f168762a;
            c cVar2 = new c(null);
            bVar.f50448c = 1;
            objE0 = ge1.b.e0(t1Var, cVar2, bVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        objE0.getClass();
        return objE0;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        i0 i0VarW = f0.w(viewLifecycleOwner);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, o.f168762a, null, new q0(this, null, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = requireArguments().getString("arg.flow");
        string.getClass();
        this.f50433e = a.EnumC1005a.valueOf(string);
        this.f50437i = Integer.valueOf(a7.b.getColor(requireContext(), R.color.ssoTouText));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.mobileauth_terms_of_use_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g0.c(new p0(this, 0), this);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final void onToolbarBackPressed$mobile_auth_release() {
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        ((AuthenticationActivity) activity).onBackPressed();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Drawable drawable;
        Drawable drawable2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        view2.getViewTreeObserver().addOnPreDrawListener(new d(view2, this));
        Drawable background = view2.findViewById(R.id.tos_divider_1).getBackground();
        background.mutate();
        background.setAlpha(51);
        Drawable background2 = view2.findViewById(R.id.tos_divider_2).getBackground();
        background2.mutate();
        background2.setAlpha(51);
        this.f50435g = (ProgressBar) view2.findViewById(R.id.progress_bar);
        View viewFindViewById = view2.findViewById(R.id.terms_of_use_content_holder);
        this.f50436h = viewFindViewById;
        if (viewFindViewById == null) {
            s.m("contentHolder");
            throw null;
        }
        Button button = (Button) viewFindViewById.findViewById(R.id.terms_of_use_button_next);
        this.f50429a = button;
        if (button == null) {
            s.m("buttonNext");
            throw null;
        }
        final int i14 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190526b;

            {
                this.f190526b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.library.mobileauth.ui.e eVar = this.f190526b;
                switch (i15) {
                    case 0:
                        View view4 = eVar.f50436h;
                        if (view4 == null) {
                            p005kotlin.jvm.internal.s.m("contentHolder");
                            throw null;
                        }
                        view4.setVisibility(4);
                        ProgressBar progressBar = eVar.f50435g;
                        if (progressBar == null) {
                            p005kotlin.jvm.internal.s.m("progressBar");
                            throw null;
                        }
                        progressBar.setVisibility(0);
                        com.garmin.android.library.mobileauth.ui.b fragListener$mobile_auth_release = eVar.getFragListener$mobile_auth_release();
                        com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a = eVar.f50433e;
                        if (enumC1005a == null) {
                            p005kotlin.jvm.internal.s.m("flow");
                            throw null;
                        }
                        Bundle arguments = eVar.getArguments();
                        fragListener$mobile_auth_release.k3(enumC1005a, arguments != null ? arguments.getString("arg.social_platform") : null);
                        return;
                    default:
                        com.garmin.android.library.mobileauth.ui.e.a aVar = com.garmin.android.library.mobileauth.ui.e.f50426m;
                        lc2.a aVar2 = lc2.a.APP_EULA;
                        androidx.lifecycle.n0 viewLifecycleOwner = eVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        androidx.lifecycle.i0 i0VarW = o53.f0.w(viewLifecycleOwner);
                        x53.c cVar = o53.s0.f129406a;
                        ge1.b.T(i0VarW, x53.b.f189152a, null, new u0(eVar, aVar2, null), 2);
                        return;
                }
            }
        });
        View view3 = this.f50436h;
        if (view3 == null) {
            s.m("contentHolder");
            throw null;
        }
        Button button2 = (Button) view3.findViewById(R.id.tos_eula_button);
        if (button2 == null) {
            s.m("eulaButton");
            throw null;
        }
        final int i15 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190526b;

            {
                this.f190526b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i16 = i15;
                com.garmin.android.library.mobileauth.ui.e eVar = this.f190526b;
                switch (i16) {
                    case 0:
                        View view5 = eVar.f50436h;
                        if (view5 == null) {
                            p005kotlin.jvm.internal.s.m("contentHolder");
                            throw null;
                        }
                        view5.setVisibility(4);
                        ProgressBar progressBar = eVar.f50435g;
                        if (progressBar == null) {
                            p005kotlin.jvm.internal.s.m("progressBar");
                            throw null;
                        }
                        progressBar.setVisibility(0);
                        com.garmin.android.library.mobileauth.ui.b fragListener$mobile_auth_release = eVar.getFragListener$mobile_auth_release();
                        com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a = eVar.f50433e;
                        if (enumC1005a == null) {
                            p005kotlin.jvm.internal.s.m("flow");
                            throw null;
                        }
                        Bundle arguments = eVar.getArguments();
                        fragListener$mobile_auth_release.k3(enumC1005a, arguments != null ? arguments.getString("arg.social_platform") : null);
                        return;
                    default:
                        com.garmin.android.library.mobileauth.ui.e.a aVar = com.garmin.android.library.mobileauth.ui.e.f50426m;
                        lc2.a aVar2 = lc2.a.APP_EULA;
                        androidx.lifecycle.n0 viewLifecycleOwner = eVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        androidx.lifecycle.i0 i0VarW = o53.f0.w(viewLifecycleOwner);
                        x53.c cVar = o53.s0.f129406a;
                        ge1.b.T(i0VarW, x53.b.f189152a, null, new u0(eVar, aVar2, null), 2);
                        return;
                }
            }
        });
        View view4 = this.f50436h;
        if (view4 == null) {
            s.m("contentHolder");
            throw null;
        }
        CheckBox checkBox = (CheckBox) view4.findViewById(R.id.tos_eula_checkbox);
        this.f50430b = checkBox;
        if (checkBox == null) {
            s.m("eulaCheckBox");
            throw null;
        }
        if (getMobileAuthConfig$mobile_auth_release().f177774o) {
            drawable = a7.b.getDrawable(requireContext(), R.drawable.mobileauth_checkbox_dark_theme);
            drawable.getClass();
        } else {
            drawable = a7.b.getDrawable(requireContext(), R.drawable.mobileauth_checkbox_light_theme);
            drawable.getClass();
        }
        checkBox.setButtonDrawable(drawable);
        checkBox.setOnCheckedChangeListener(this);
        a.EnumC1005a enumC1005a = a.EnumC1005a.SIGN_IN;
        a.EnumC1005a enumC1005a2 = this.f50433e;
        if (enumC1005a2 == null) {
            s.m("flow");
            throw null;
        }
        if ((enumC1005a == enumC1005a2 || a.EnumC1005a.CONTINUE_AS == enumC1005a2) && getMobileAuthConfig$mobile_auth_release().f177770k) {
            View view5 = this.f50436h;
            if (view5 == null) {
                s.m("contentHolder");
                throw null;
            }
            CheckBox checkBox2 = (CheckBox) view5.findViewById(R.id.tos_age_checkbox);
            this.f50431c = checkBox2;
            if (checkBox2 == null) {
                s.m("ageCheckBox");
                throw null;
            }
            if (getMobileAuthConfig$mobile_auth_release().f177774o) {
                drawable2 = a7.b.getDrawable(requireContext(), R.drawable.mobileauth_checkbox_dark_theme);
                drawable2.getClass();
            } else {
                drawable2 = a7.b.getDrawable(requireContext(), R.drawable.mobileauth_checkbox_light_theme);
                drawable2.getClass();
            }
            checkBox2.setButtonDrawable(drawable2);
            CheckBox checkBox3 = this.f50431c;
            if (checkBox3 == null) {
                s.m("ageCheckBox");
                throw null;
            }
            checkBox3.setOnCheckedChangeListener(this);
            View view6 = this.f50436h;
            if (view6 == null) {
                s.m("contentHolder");
                throw null;
            }
            View viewFindViewById2 = view6.findViewById(R.id.tos_age_checkbox_spinner);
            viewFindViewById2.getClass();
            ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) viewFindViewById2;
            this.f50432d = contentLoadingProgressBar;
            contentLoadingProgressBar.post(new p7.b(contentLoadingProgressBar, 2));
            n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            i0 i0VarW = f0.w(viewLifecycleOwner);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, x53.b.f189152a, null, new r0(this, null), 2);
        }
        View view7 = this.f50436h;
        if (view7 == null) {
            s.m("contentHolder");
            throw null;
        }
        this.f50434f = (TextView) view7.findViewById(R.id.tos_privacy_text);
        String string = getString(R.string.ssoPrivacyPolicyButtonText);
        string.getClass();
        String string2 = getString(R.string.mobile_auth_privacy_statement, string);
        string2.getClass();
        int iLastIndexOf = string2.lastIndexOf(string, string2.length() - 1);
        f fVar = new f(this);
        t0 t0Var = new t0(this);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        spannableStringBuilder.setSpan(fVar, 0, iLastIndexOf, 33);
        spannableStringBuilder.setSpan(t0Var, iLastIndexOf, string2.length(), 33);
        TextView textView = this.f50434f;
        if (textView == null) {
            s.m("privacyUIComponent");
            throw null;
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        i0 i0VarW2 = f0.w(viewLifecycleOwner2);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(i0VarW2, o.f168762a, null, new q0(this, null, null), 2);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean shouldBlurBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177779t;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean useBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177778s;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/e$a;", "", "<init>", "()V", "", "ARG_FLOW", "Ljava/lang/String;", "ARG_SOCIAL_PLATFORM", "DEFAULT_AGE", "", "nbrEasterEggClicks", "I", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.library.mobileauth.ui.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/e$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC1005a {
            SIGN_IN,
            CREATE_ACCT,
            CONTINUE_AS,
            SOCIAL_SIGN_IN
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
