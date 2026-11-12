package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import ty1.c1;
import ty1.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/s;", "Lty1/h0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends h0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f46227x = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f46230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f46231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f46232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f46233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EditText f46234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f46235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f46236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f46237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f46238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f46239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f46240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f46241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f46242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f46243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f46244r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AppCompatButton f46245t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f46246v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f46247w;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46248a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46248a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/s$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            s sVar = s.this;
            sVar.G6();
            sVar.f46230d.f(false);
            sVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f46250a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f46250a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46250a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46250a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46251a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46251a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46253b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46252a = aVar;
            this.f46253b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46252a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46253b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46254a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46254a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46254a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public s() {
        super(R.layout.ti_add_event_website_notes);
        this.f46229c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new e(this), new g(this), new f(null, this));
        this.f46230d = new c();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0.getText().toString().length() > 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A6() {
        EditText editText;
        View view2;
        EditText editText2;
        EditText editText3 = this.f46234h;
        if (editText3 == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        if (editText3.getText().toString().length() != 0) {
            editText = this.f46234h;
            if (editText != null) {
                p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                throw null;
            }
            if (editText.getText().toString().length() > 0) {
                editText2 = this.f46233g;
                if (editText2 != null) {
                    p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                    throw null;
                }
            }
            view2 = this.f46244r;
            if (view2 != null) {
                view2.setVisibility(0);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mView");
                throw null;
            }
        }
        EditText editText4 = this.f46233g;
        if (editText4 == null) {
            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
            throw null;
        }
        if (editText4.getText().toString().length() != 0) {
            editText = this.f46234h;
            if (editText != null) {
                p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                throw null;
            }
            if (editText.getText().toString().length() > 0) {
                editText2 = this.f46233g;
                if (editText2 != null) {
                    p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                    throw null;
                }
            }
            view2 = this.f46244r;
            if (view2 != null) {
                view2.setVisibility(0);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mView");
                throw null;
            }
        }
        View view3 = this.f46244r;
        if (view3 != null) {
            view3.setVisibility(8);
        } else {
            p005kotlin.jvm.internal.s.m("mView");
            throw null;
        }
    }

    public final AddTIEventViewModel C6() {
        return (AddTIEventViewModel) this.f46229c.getValue();
    }

    public final void E6() {
        EditText editText = this.f46234h;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        if (editText.getText().toString().length() <= 0) {
            View view2 = this.f46231e;
            if (view2 == null) {
                p005kotlin.jvm.internal.s.m("mAddNotesOption");
                throw null;
            }
            view2.setVisibility(0);
            LinearLayout linearLayout = this.f46235i;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("mNotesLayout");
                throw null;
            }
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.f46238l;
            if (linearLayout2 == null) {
                p005kotlin.jvm.internal.s.m("mNotesPreview");
                throw null;
            }
            linearLayout2.setVisibility(8);
            TextView textView = this.f46241o;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mCharacterCount");
                throw null;
            }
        }
        TextView textView2 = this.f46243q;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("mTextviewNotes");
            throw null;
        }
        EditText editText2 = this.f46234h;
        if (editText2 == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        textView2.setText(editText2.getText().toString());
        AddTIEventViewModel addTIEventViewModelC6 = C6();
        EditText editText3 = this.f46234h;
        if (editText3 == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        addTIEventViewModelC6.z6(editText3.getText().toString());
        View view3 = this.f46231e;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("mAddNotesOption");
            throw null;
        }
        view3.setVisibility(8);
        LinearLayout linearLayout3 = this.f46235i;
        if (linearLayout3 == null) {
            p005kotlin.jvm.internal.s.m("mNotesLayout");
            throw null;
        }
        linearLayout3.setVisibility(8);
        LinearLayout linearLayout4 = this.f46238l;
        if (linearLayout4 == null) {
            p005kotlin.jvm.internal.s.m("mNotesPreview");
            throw null;
        }
        linearLayout4.setVisibility(0);
        TextView textView3 = this.f46241o;
        if (textView3 != null) {
            textView3.setVisibility(8);
        } else {
            p005kotlin.jvm.internal.s.m("mCharacterCount");
            throw null;
        }
    }

    public final void F6() {
        EditText editText = this.f46233g;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
            throw null;
        }
        if (editText.getText().toString().length() > 0) {
            TextView textView = this.f46242p;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                throw null;
            }
            EditText editText2 = this.f46233g;
            if (editText2 == null) {
                p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                throw null;
            }
            textView.setText(editText2.getText().toString());
            AddTIEventViewModel addTIEventViewModelC6 = C6();
            EditText editText3 = this.f46233g;
            if (editText3 == null) {
                p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                throw null;
            }
            addTIEventViewModelC6.A6(editText3.getText().toString());
            View view2 = this.f46232f;
            if (view2 == null) {
                p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                throw null;
            }
            view2.setVisibility(8);
            LinearLayout linearLayout = this.f46236j;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                throw null;
            }
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.f46237k;
            if (linearLayout2 == null) {
                p005kotlin.jvm.internal.s.m("mWebsitePreview");
                throw null;
            }
            linearLayout2.setVisibility(0);
        } else {
            View view3 = this.f46232f;
            if (view3 == null) {
                p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                throw null;
            }
            view3.setVisibility(0);
            LinearLayout linearLayout3 = this.f46236j;
            if (linearLayout3 == null) {
                p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                throw null;
            }
            linearLayout3.setVisibility(8);
            LinearLayout linearLayout4 = this.f46237k;
            if (linearLayout4 == null) {
                p005kotlin.jvm.internal.s.m("mWebsitePreview");
                throw null;
            }
            linearLayout4.setVisibility(8);
        }
        TextView textView2 = this.f46246v;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
            throw null;
        }
        textView2.setVisibility(8);
        AddTIEventViewModel addTIEventViewModelC7 = C6();
        EditText editText4 = this.f46233g;
        if (editText4 != null) {
            addTIEventViewModelC7.T6(editText4.getText().toString());
        } else {
            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
            throw null;
        }
    }

    public final void G6() {
        AddTIEventViewModel addTIEventViewModelC6 = C6();
        EditText editText = this.f46233g;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
            throw null;
        }
        addTIEventViewModelC6.A6(editText.getEditableText().toString());
        AddTIEventViewModel addTIEventViewModelC7 = C6();
        EditText editText2 = this.f46234h;
        if (editText2 != null) {
            addTIEventViewModelC7.z6(editText2.getEditableText().toString());
        } else {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46228b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventMainFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46228b;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        c cVar = this.f46230d;
        onBackPressedDispatcher.b(cVar, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.add_notes_option);
        viewFindViewById.getClass();
        this.f46231e = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.add_website_option);
        viewFindViewById2.getClass();
        this.f46232f = viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.website_edit_text);
        viewFindViewById3.getClass();
        this.f46233g = (EditText) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.website_clear_button);
        viewFindViewById4.getClass();
        this.f46239m = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.notes_clear_button);
        viewFindViewById5.getClass();
        this.f46240n = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.notes_edit_text);
        viewFindViewById6.getClass();
        this.f46234h = (EditText) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.add_notes_layout);
        viewFindViewById7.getClass();
        this.f46235i = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.add_website_layout);
        viewFindViewById8.getClass();
        this.f46236j = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.in_line_edit_character_count_under);
        viewFindViewById9.getClass();
        this.f46241o = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.textview_website);
        viewFindViewById10.getClass();
        this.f46242p = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.textview_notes);
        viewFindViewById11.getClass();
        this.f46243q = (TextView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.f28708view);
        viewFindViewById12.getClass();
        this.f46244r = viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.fragment_next_button);
        viewFindViewById13.getClass();
        this.f46245t = (AppCompatButton) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.ll_website);
        viewFindViewById14.getClass();
        this.f46237k = (LinearLayout) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.ll_notes);
        viewFindViewById15.getClass();
        this.f46238l = (LinearLayout) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.url_error_text);
        viewFindViewById16.getClass();
        this.f46246v = (TextView) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.url_error_img);
        viewFindViewById17.getClass();
        this.f46247w = (ImageView) viewFindViewById17;
        View view3 = this.f46231e;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("mAddNotesOption");
            throw null;
        }
        ((TextView) view3.findViewById(R.id.left_option_label)).setText(getString(R.string.workout_add_notes));
        View view4 = this.f46232f;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
            throw null;
        }
        ((TextView) view4.findViewById(R.id.left_option_label)).setText(getString(R.string.add_a_website));
        cVar.f(true);
        EditText editText = this.f46233g;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
            throw null;
        }
        final int i14 = 1;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ty1.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167067b;

            {
                this.f167067b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view5, boolean z14) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167067b;
                switch (i15) {
                    case 0:
                        if (!z14) {
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                            return;
                        }
                        EditText editText2 = sVar.f46234h;
                        if (editText2 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText2.setSelection(editText2.getText().length());
                        Context context = sVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        EditText editText3 = sVar.f46234h;
                        if (editText3 != null) {
                            inputMethodManager.showSoftInput(editText3, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (z14) {
                            sVar.E6();
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (z14) {
                            sVar.F6();
                            return;
                        }
                        return;
                    default:
                        if (!z14) {
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                            if (sVar.C6().i6()) {
                                return;
                            }
                            AppCompatButton appCompatButton = sVar.f46245t;
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                throw null;
                            }
                            appCompatButton.setEnabled(false);
                            TextView textView = sVar.f46242p;
                            if (textView != null) {
                                textView.setFocusable(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                throw null;
                            }
                        }
                        EditText editText4 = sVar.f46233g;
                        if (editText4 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText4.setSelection(editText4.getText().length());
                        Context context2 = sVar.getContext();
                        Object systemService2 = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService2.getClass();
                        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService2;
                        EditText editText5 = sVar.f46233g;
                        if (editText5 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        inputMethodManager2.showSoftInput(editText5, 0);
                        AppCompatButton appCompatButton2 = sVar.f46245t;
                        if (appCompatButton2 == null) {
                            p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(false);
                        TextView textView2 = sVar.f46242p;
                        if (textView2 != null) {
                            textView2.setFocusable(false);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                            throw null;
                        }
                }
            }
        });
        EditText editText2 = this.f46234h;
        if (editText2 == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        final int i15 = 2;
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ty1.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167067b;

            {
                this.f167067b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view5, boolean z14) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167067b;
                switch (i16) {
                    case 0:
                        if (!z14) {
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                            return;
                        }
                        EditText editText3 = sVar.f46234h;
                        if (editText3 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText3.setSelection(editText3.getText().length());
                        Context context = sVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        EditText editText4 = sVar.f46234h;
                        if (editText4 != null) {
                            inputMethodManager.showSoftInput(editText4, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (z14) {
                            sVar.E6();
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (z14) {
                            sVar.F6();
                            return;
                        }
                        return;
                    default:
                        if (!z14) {
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                            if (sVar.C6().i6()) {
                                return;
                            }
                            AppCompatButton appCompatButton = sVar.f46245t;
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                throw null;
                            }
                            appCompatButton.setEnabled(false);
                            TextView textView = sVar.f46242p;
                            if (textView != null) {
                                textView.setFocusable(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                throw null;
                            }
                        }
                        EditText editText5 = sVar.f46233g;
                        if (editText5 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText5.setSelection(editText5.getText().length());
                        Context context2 = sVar.getContext();
                        Object systemService2 = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService2.getClass();
                        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService2;
                        EditText editText6 = sVar.f46233g;
                        if (editText6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        inputMethodManager2.showSoftInput(editText6, 0);
                        AppCompatButton appCompatButton2 = sVar.f46245t;
                        if (appCompatButton2 == null) {
                            p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(false);
                        TextView textView2 = sVar.f46242p;
                        if (textView2 != null) {
                            textView2.setFocusable(false);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                            throw null;
                        }
                }
            }
        });
        View view5 = this.f46232f;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
            throw null;
        }
        final int i16 = 6;
        view5.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167278b;

            {
                this.f167278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167278b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view7 = sVar.f46231e;
                        if (view7 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view7.setVisibility(8);
                        LinearLayout linearLayout = sVar.f46235i;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        TextView textView = sVar.f46241o;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView.setVisibility(0);
                        EditText editText3 = sVar.f46234h;
                        if (editText3 != null) {
                            editText3.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view8 = sVar.f46232f;
                        if (view8 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view8.setVisibility(8);
                        LinearLayout linearLayout2 = sVar.f46236j;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        LinearLayout linearLayout3 = sVar.f46237k;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsitePreview");
                            throw null;
                        }
                        linearLayout3.setVisibility(8);
                        ImageView imageView = sVar.f46247w;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                        imageView.setVisibility(8);
                        EditText editText4 = sVar.f46233g;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view9 = sVar.f46231e;
                        if (view9 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view9.setVisibility(8);
                        LinearLayout linearLayout4 = sVar.f46235i;
                        if (linearLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout4.setVisibility(0);
                        LinearLayout linearLayout5 = sVar.f46238l;
                        if (linearLayout5 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesPreview");
                            throw null;
                        }
                        linearLayout5.setVisibility(8);
                        TextView textView2 = sVar.f46241o;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView2.setVisibility(0);
                        EditText editText5 = sVar.f46234h;
                        if (editText5 != null) {
                            editText5.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 3:
                        EditText editText6 = sVar.f46233g;
                        if (editText6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText6.setText("");
                        sVar.C6().A6("");
                        return;
                    case 4:
                        EditText editText7 = sVar.f46234h;
                        if (editText7 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText7.setText("");
                        sVar.C6().z6("");
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventWebsiteAndNotesAdded");
                        sVar.F6();
                        sVar.E6();
                        Object systemService = sVar.requireActivity().getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(sVar.requireView().getWindowToken(), 0);
                        sVar.G6();
                        sVar.C6().O5().m("TIReviewEntriesFragment");
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view10 = sVar.f46232f;
                        if (view10 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view10.setVisibility(8);
                        LinearLayout linearLayout6 = sVar.f46236j;
                        if (linearLayout6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout6.setVisibility(0);
                        EditText editText8 = sVar.f46233g;
                        if (editText8 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText8.requestFocus();
                        View view11 = sVar.f46244r;
                        if (view11 == null) {
                            p005kotlin.jvm.internal.s.m("mView");
                            throw null;
                        }
                        view11.setVisibility(0);
                        TextView textView3 = sVar.f46246v;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                            throw null;
                        }
                        textView3.setVisibility(0);
                        ImageView imageView2 = sVar.f46247w;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                }
            }
        });
        EditText editText3 = this.f46233g;
        if (editText3 == null) {
            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
            throw null;
        }
        final int i17 = 3;
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ty1.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167067b;

            {
                this.f167067b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view6, boolean z14) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167067b;
                switch (i18) {
                    case 0:
                        if (!z14) {
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                            return;
                        }
                        EditText editText4 = sVar.f46234h;
                        if (editText4 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText4.setSelection(editText4.getText().length());
                        Context context = sVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        EditText editText5 = sVar.f46234h;
                        if (editText5 != null) {
                            inputMethodManager.showSoftInput(editText5, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (z14) {
                            sVar.E6();
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (z14) {
                            sVar.F6();
                            return;
                        }
                        return;
                    default:
                        if (!z14) {
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                            if (sVar.C6().i6()) {
                                return;
                            }
                            AppCompatButton appCompatButton = sVar.f46245t;
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                throw null;
                            }
                            appCompatButton.setEnabled(false);
                            TextView textView = sVar.f46242p;
                            if (textView != null) {
                                textView.setFocusable(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                throw null;
                            }
                        }
                        EditText editText6 = sVar.f46233g;
                        if (editText6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText6.setSelection(editText6.getText().length());
                        Context context2 = sVar.getContext();
                        Object systemService2 = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService2.getClass();
                        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService2;
                        EditText editText7 = sVar.f46233g;
                        if (editText7 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        inputMethodManager2.showSoftInput(editText7, 0);
                        AppCompatButton appCompatButton2 = sVar.f46245t;
                        if (appCompatButton2 == null) {
                            p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(false);
                        TextView textView2 = sVar.f46242p;
                        if (textView2 != null) {
                            textView2.setFocusable(false);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                            throw null;
                        }
                }
            }
        });
        View view6 = this.f46231e;
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("mAddNotesOption");
            throw null;
        }
        final int i18 = 0;
        view6.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167278b;

            {
                this.f167278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167278b;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view8 = sVar.f46231e;
                        if (view8 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view8.setVisibility(8);
                        LinearLayout linearLayout = sVar.f46235i;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        TextView textView = sVar.f46241o;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView.setVisibility(0);
                        EditText editText4 = sVar.f46234h;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view9 = sVar.f46232f;
                        if (view9 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view9.setVisibility(8);
                        LinearLayout linearLayout2 = sVar.f46236j;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        LinearLayout linearLayout3 = sVar.f46237k;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsitePreview");
                            throw null;
                        }
                        linearLayout3.setVisibility(8);
                        ImageView imageView = sVar.f46247w;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                        imageView.setVisibility(8);
                        EditText editText5 = sVar.f46233g;
                        if (editText5 != null) {
                            editText5.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view10 = sVar.f46231e;
                        if (view10 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view10.setVisibility(8);
                        LinearLayout linearLayout4 = sVar.f46235i;
                        if (linearLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout4.setVisibility(0);
                        LinearLayout linearLayout5 = sVar.f46238l;
                        if (linearLayout5 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesPreview");
                            throw null;
                        }
                        linearLayout5.setVisibility(8);
                        TextView textView2 = sVar.f46241o;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView2.setVisibility(0);
                        EditText editText6 = sVar.f46234h;
                        if (editText6 != null) {
                            editText6.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 3:
                        EditText editText7 = sVar.f46233g;
                        if (editText7 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText7.setText("");
                        sVar.C6().A6("");
                        return;
                    case 4:
                        EditText editText8 = sVar.f46234h;
                        if (editText8 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText8.setText("");
                        sVar.C6().z6("");
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventWebsiteAndNotesAdded");
                        sVar.F6();
                        sVar.E6();
                        Object systemService = sVar.requireActivity().getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(sVar.requireView().getWindowToken(), 0);
                        sVar.G6();
                        sVar.C6().O5().m("TIReviewEntriesFragment");
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view11 = sVar.f46232f;
                        if (view11 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view11.setVisibility(8);
                        LinearLayout linearLayout6 = sVar.f46236j;
                        if (linearLayout6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout6.setVisibility(0);
                        EditText editText9 = sVar.f46233g;
                        if (editText9 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText9.requestFocus();
                        View view12 = sVar.f46244r;
                        if (view12 == null) {
                            p005kotlin.jvm.internal.s.m("mView");
                            throw null;
                        }
                        view12.setVisibility(0);
                        TextView textView3 = sVar.f46246v;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                            throw null;
                        }
                        textView3.setVisibility(0);
                        ImageView imageView2 = sVar.f46247w;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                }
            }
        });
        EditText editText4 = this.f46234h;
        if (editText4 == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        final int i19 = 0;
        editText4.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ty1.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167067b;

            {
                this.f167067b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view7, boolean z14) {
                int i110 = i19;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167067b;
                switch (i110) {
                    case 0:
                        if (!z14) {
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                            return;
                        }
                        EditText editText5 = sVar.f46234h;
                        if (editText5 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText5.setSelection(editText5.getText().length());
                        Context context = sVar.getContext();
                        Object systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        EditText editText6 = sVar.f46234h;
                        if (editText6 != null) {
                            inputMethodManager.showSoftInput(editText6, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (z14) {
                            sVar.E6();
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (z14) {
                            sVar.F6();
                            return;
                        }
                        return;
                    default:
                        if (!z14) {
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                            if (sVar.C6().i6()) {
                                return;
                            }
                            AppCompatButton appCompatButton = sVar.f46245t;
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                throw null;
                            }
                            appCompatButton.setEnabled(false);
                            TextView textView = sVar.f46242p;
                            if (textView != null) {
                                textView.setFocusable(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                throw null;
                            }
                        }
                        EditText editText7 = sVar.f46233g;
                        if (editText7 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText7.setSelection(editText7.getText().length());
                        Context context2 = sVar.getContext();
                        Object systemService2 = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService2.getClass();
                        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService2;
                        EditText editText8 = sVar.f46233g;
                        if (editText8 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        inputMethodManager2.showSoftInput(editText8, 0);
                        AppCompatButton appCompatButton2 = sVar.f46245t;
                        if (appCompatButton2 == null) {
                            p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(false);
                        TextView textView2 = sVar.f46242p;
                        if (textView2 != null) {
                            textView2.setFocusable(false);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                            throw null;
                        }
                }
            }
        });
        EditText editText5 = this.f46233g;
        if (editText5 == null) {
            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
            throw null;
        }
        final int i24 = 0;
        editText5.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ty1.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167077b;

            {
                this.f167077b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i25, KeyEvent keyEvent) {
                Object systemService;
                int i26 = i24;
                View view7 = view2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167077b;
                switch (i26) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (i25 == 6) {
                            Context context = sVar.getContext();
                            systemService = context != null ? context.getSystemService("input_method") : null;
                            systemService.getClass();
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(view7.getWindowToken(), 0);
                            sVar.E6();
                            sVar.F6();
                            sVar.A6();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (i25 == 6) {
                            Context context2 = sVar.getContext();
                            systemService = context2 != null ? context2.getSystemService("input_method") : null;
                            systemService.getClass();
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(view7.getWindowToken(), 0);
                            sVar.E6();
                            sVar.F6();
                            sVar.A6();
                        }
                        break;
                }
                return false;
            }
        });
        TextView textView = this.f46242p;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mTextviewWebsite");
            throw null;
        }
        final int i25 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167278b;

            {
                this.f167278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                int i110 = i25;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167278b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view8 = sVar.f46231e;
                        if (view8 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view8.setVisibility(8);
                        LinearLayout linearLayout = sVar.f46235i;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        TextView textView2 = sVar.f46241o;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView2.setVisibility(0);
                        EditText editText6 = sVar.f46234h;
                        if (editText6 != null) {
                            editText6.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view9 = sVar.f46232f;
                        if (view9 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view9.setVisibility(8);
                        LinearLayout linearLayout2 = sVar.f46236j;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        LinearLayout linearLayout3 = sVar.f46237k;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsitePreview");
                            throw null;
                        }
                        linearLayout3.setVisibility(8);
                        ImageView imageView = sVar.f46247w;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                        imageView.setVisibility(8);
                        EditText editText7 = sVar.f46233g;
                        if (editText7 != null) {
                            editText7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view10 = sVar.f46231e;
                        if (view10 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view10.setVisibility(8);
                        LinearLayout linearLayout4 = sVar.f46235i;
                        if (linearLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout4.setVisibility(0);
                        LinearLayout linearLayout5 = sVar.f46238l;
                        if (linearLayout5 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesPreview");
                            throw null;
                        }
                        linearLayout5.setVisibility(8);
                        TextView textView3 = sVar.f46241o;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView3.setVisibility(0);
                        EditText editText8 = sVar.f46234h;
                        if (editText8 != null) {
                            editText8.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 3:
                        EditText editText9 = sVar.f46233g;
                        if (editText9 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText9.setText("");
                        sVar.C6().A6("");
                        return;
                    case 4:
                        EditText editText10 = sVar.f46234h;
                        if (editText10 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText10.setText("");
                        sVar.C6().z6("");
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventWebsiteAndNotesAdded");
                        sVar.F6();
                        sVar.E6();
                        Object systemService = sVar.requireActivity().getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(sVar.requireView().getWindowToken(), 0);
                        sVar.G6();
                        sVar.C6().O5().m("TIReviewEntriesFragment");
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view11 = sVar.f46232f;
                        if (view11 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view11.setVisibility(8);
                        LinearLayout linearLayout6 = sVar.f46236j;
                        if (linearLayout6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout6.setVisibility(0);
                        EditText editText11 = sVar.f46233g;
                        if (editText11 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText11.requestFocus();
                        View view12 = sVar.f46244r;
                        if (view12 == null) {
                            p005kotlin.jvm.internal.s.m("mView");
                            throw null;
                        }
                        view12.setVisibility(0);
                        TextView textView4 = sVar.f46246v;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                            throw null;
                        }
                        textView4.setVisibility(0);
                        ImageView imageView2 = sVar.f46247w;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                }
            }
        });
        EditText editText6 = this.f46234h;
        if (editText6 == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        final int i26 = 1;
        editText6.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ty1.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167077b;

            {
                this.f167077b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i27, KeyEvent keyEvent) {
                Object systemService;
                int i28 = i26;
                View view7 = view2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167077b;
                switch (i28) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (i27 == 6) {
                            Context context = sVar.getContext();
                            systemService = context != null ? context.getSystemService("input_method") : null;
                            systemService.getClass();
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(view7.getWindowToken(), 0);
                            sVar.E6();
                            sVar.F6();
                            sVar.A6();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (i27 == 6) {
                            Context context2 = sVar.getContext();
                            systemService = context2 != null ? context2.getSystemService("input_method") : null;
                            systemService.getClass();
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(view7.getWindowToken(), 0);
                            sVar.E6();
                            sVar.F6();
                            sVar.A6();
                        }
                        break;
                }
                return false;
            }
        });
        TextView textView2 = this.f46243q;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("mTextviewNotes");
            throw null;
        }
        final int i27 = 2;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167278b;

            {
                this.f167278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                int i110 = i27;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167278b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view8 = sVar.f46231e;
                        if (view8 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view8.setVisibility(8);
                        LinearLayout linearLayout = sVar.f46235i;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        TextView textView3 = sVar.f46241o;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView3.setVisibility(0);
                        EditText editText7 = sVar.f46234h;
                        if (editText7 != null) {
                            editText7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view9 = sVar.f46232f;
                        if (view9 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view9.setVisibility(8);
                        LinearLayout linearLayout2 = sVar.f46236j;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        LinearLayout linearLayout3 = sVar.f46237k;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsitePreview");
                            throw null;
                        }
                        linearLayout3.setVisibility(8);
                        ImageView imageView = sVar.f46247w;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                        imageView.setVisibility(8);
                        EditText editText8 = sVar.f46233g;
                        if (editText8 != null) {
                            editText8.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view10 = sVar.f46231e;
                        if (view10 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view10.setVisibility(8);
                        LinearLayout linearLayout4 = sVar.f46235i;
                        if (linearLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout4.setVisibility(0);
                        LinearLayout linearLayout5 = sVar.f46238l;
                        if (linearLayout5 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesPreview");
                            throw null;
                        }
                        linearLayout5.setVisibility(8);
                        TextView textView4 = sVar.f46241o;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView4.setVisibility(0);
                        EditText editText9 = sVar.f46234h;
                        if (editText9 != null) {
                            editText9.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 3:
                        EditText editText10 = sVar.f46233g;
                        if (editText10 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText10.setText("");
                        sVar.C6().A6("");
                        return;
                    case 4:
                        EditText editText11 = sVar.f46234h;
                        if (editText11 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText11.setText("");
                        sVar.C6().z6("");
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventWebsiteAndNotesAdded");
                        sVar.F6();
                        sVar.E6();
                        Object systemService = sVar.requireActivity().getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(sVar.requireView().getWindowToken(), 0);
                        sVar.G6();
                        sVar.C6().O5().m("TIReviewEntriesFragment");
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view11 = sVar.f46232f;
                        if (view11 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view11.setVisibility(8);
                        LinearLayout linearLayout6 = sVar.f46236j;
                        if (linearLayout6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout6.setVisibility(0);
                        EditText editText12 = sVar.f46233g;
                        if (editText12 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText12.requestFocus();
                        View view12 = sVar.f46244r;
                        if (view12 == null) {
                            p005kotlin.jvm.internal.s.m("mView");
                            throw null;
                        }
                        view12.setVisibility(0);
                        TextView textView5 = sVar.f46246v;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                            throw null;
                        }
                        textView5.setVisibility(0);
                        ImageView imageView2 = sVar.f46247w;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                }
            }
        });
        ImageView imageView = this.f46239m;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("mWebsiteImageViewClear");
            throw null;
        }
        final int i28 = 3;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167278b;

            {
                this.f167278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                int i110 = i28;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167278b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view8 = sVar.f46231e;
                        if (view8 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view8.setVisibility(8);
                        LinearLayout linearLayout = sVar.f46235i;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        TextView textView3 = sVar.f46241o;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView3.setVisibility(0);
                        EditText editText7 = sVar.f46234h;
                        if (editText7 != null) {
                            editText7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view9 = sVar.f46232f;
                        if (view9 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view9.setVisibility(8);
                        LinearLayout linearLayout2 = sVar.f46236j;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        LinearLayout linearLayout3 = sVar.f46237k;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsitePreview");
                            throw null;
                        }
                        linearLayout3.setVisibility(8);
                        ImageView imageView2 = sVar.f46247w;
                        if (imageView2 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                        imageView2.setVisibility(8);
                        EditText editText8 = sVar.f46233g;
                        if (editText8 != null) {
                            editText8.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view10 = sVar.f46231e;
                        if (view10 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view10.setVisibility(8);
                        LinearLayout linearLayout4 = sVar.f46235i;
                        if (linearLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout4.setVisibility(0);
                        LinearLayout linearLayout5 = sVar.f46238l;
                        if (linearLayout5 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesPreview");
                            throw null;
                        }
                        linearLayout5.setVisibility(8);
                        TextView textView4 = sVar.f46241o;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView4.setVisibility(0);
                        EditText editText9 = sVar.f46234h;
                        if (editText9 != null) {
                            editText9.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 3:
                        EditText editText10 = sVar.f46233g;
                        if (editText10 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText10.setText("");
                        sVar.C6().A6("");
                        return;
                    case 4:
                        EditText editText11 = sVar.f46234h;
                        if (editText11 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText11.setText("");
                        sVar.C6().z6("");
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventWebsiteAndNotesAdded");
                        sVar.F6();
                        sVar.E6();
                        Object systemService = sVar.requireActivity().getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(sVar.requireView().getWindowToken(), 0);
                        sVar.G6();
                        sVar.C6().O5().m("TIReviewEntriesFragment");
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view11 = sVar.f46232f;
                        if (view11 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view11.setVisibility(8);
                        LinearLayout linearLayout6 = sVar.f46236j;
                        if (linearLayout6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout6.setVisibility(0);
                        EditText editText12 = sVar.f46233g;
                        if (editText12 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText12.requestFocus();
                        View view12 = sVar.f46244r;
                        if (view12 == null) {
                            p005kotlin.jvm.internal.s.m("mView");
                            throw null;
                        }
                        view12.setVisibility(0);
                        TextView textView5 = sVar.f46246v;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                            throw null;
                        }
                        textView5.setVisibility(0);
                        ImageView imageView3 = sVar.f46247w;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                }
            }
        });
        ImageView imageView2 = this.f46240n;
        if (imageView2 == null) {
            p005kotlin.jvm.internal.s.m("mNotesImageViewClear");
            throw null;
        }
        final int i29 = 4;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167278b;

            {
                this.f167278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                int i110 = i29;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167278b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view8 = sVar.f46231e;
                        if (view8 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view8.setVisibility(8);
                        LinearLayout linearLayout = sVar.f46235i;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        TextView textView3 = sVar.f46241o;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView3.setVisibility(0);
                        EditText editText7 = sVar.f46234h;
                        if (editText7 != null) {
                            editText7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view9 = sVar.f46232f;
                        if (view9 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view9.setVisibility(8);
                        LinearLayout linearLayout2 = sVar.f46236j;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        LinearLayout linearLayout3 = sVar.f46237k;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsitePreview");
                            throw null;
                        }
                        linearLayout3.setVisibility(8);
                        ImageView imageView3 = sVar.f46247w;
                        if (imageView3 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                        imageView3.setVisibility(8);
                        EditText editText8 = sVar.f46233g;
                        if (editText8 != null) {
                            editText8.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view10 = sVar.f46231e;
                        if (view10 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view10.setVisibility(8);
                        LinearLayout linearLayout4 = sVar.f46235i;
                        if (linearLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout4.setVisibility(0);
                        LinearLayout linearLayout5 = sVar.f46238l;
                        if (linearLayout5 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesPreview");
                            throw null;
                        }
                        linearLayout5.setVisibility(8);
                        TextView textView4 = sVar.f46241o;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView4.setVisibility(0);
                        EditText editText9 = sVar.f46234h;
                        if (editText9 != null) {
                            editText9.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 3:
                        EditText editText10 = sVar.f46233g;
                        if (editText10 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText10.setText("");
                        sVar.C6().A6("");
                        return;
                    case 4:
                        EditText editText11 = sVar.f46234h;
                        if (editText11 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText11.setText("");
                        sVar.C6().z6("");
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventWebsiteAndNotesAdded");
                        sVar.F6();
                        sVar.E6();
                        Object systemService = sVar.requireActivity().getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(sVar.requireView().getWindowToken(), 0);
                        sVar.G6();
                        sVar.C6().O5().m("TIReviewEntriesFragment");
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view11 = sVar.f46232f;
                        if (view11 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view11.setVisibility(8);
                        LinearLayout linearLayout6 = sVar.f46236j;
                        if (linearLayout6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout6.setVisibility(0);
                        EditText editText12 = sVar.f46233g;
                        if (editText12 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText12.requestFocus();
                        View view12 = sVar.f46244r;
                        if (view12 == null) {
                            p005kotlin.jvm.internal.s.m("mView");
                            throw null;
                        }
                        view12.setVisibility(0);
                        TextView textView5 = sVar.f46246v;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                            throw null;
                        }
                        textView5.setVisibility(0);
                        ImageView imageView4 = sVar.f46247w;
                        if (imageView4 != null) {
                            imageView4.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                }
            }
        });
        AppCompatButton appCompatButton = this.f46245t;
        if (appCompatButton == null) {
            p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
            throw null;
        }
        final int i30 = 5;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167278b;

            {
                this.f167278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                int i110 = i30;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167278b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view8 = sVar.f46231e;
                        if (view8 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view8.setVisibility(8);
                        LinearLayout linearLayout = sVar.f46235i;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        TextView textView3 = sVar.f46241o;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView3.setVisibility(0);
                        EditText editText7 = sVar.f46234h;
                        if (editText7 != null) {
                            editText7.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view9 = sVar.f46232f;
                        if (view9 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view9.setVisibility(8);
                        LinearLayout linearLayout2 = sVar.f46236j;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        LinearLayout linearLayout3 = sVar.f46237k;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsitePreview");
                            throw null;
                        }
                        linearLayout3.setVisibility(8);
                        ImageView imageView3 = sVar.f46247w;
                        if (imageView3 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                        imageView3.setVisibility(8);
                        EditText editText8 = sVar.f46233g;
                        if (editText8 != null) {
                            editText8.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.F6();
                        View view10 = sVar.f46231e;
                        if (view10 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view10.setVisibility(8);
                        LinearLayout linearLayout4 = sVar.f46235i;
                        if (linearLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        linearLayout4.setVisibility(0);
                        LinearLayout linearLayout5 = sVar.f46238l;
                        if (linearLayout5 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesPreview");
                            throw null;
                        }
                        linearLayout5.setVisibility(8);
                        TextView textView4 = sVar.f46241o;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("mCharacterCount");
                            throw null;
                        }
                        textView4.setVisibility(0);
                        EditText editText9 = sVar.f46234h;
                        if (editText9 != null) {
                            editText9.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    case 3:
                        EditText editText10 = sVar.f46233g;
                        if (editText10 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText10.setText("");
                        sVar.C6().A6("");
                        return;
                    case 4:
                        EditText editText11 = sVar.f46234h;
                        if (editText11 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        editText11.setText("");
                        sVar.C6().z6("");
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "EventWebsiteAndNotesAdded");
                        sVar.F6();
                        sVar.E6();
                        Object systemService = sVar.requireActivity().getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(sVar.requireView().getWindowToken(), 0);
                        sVar.G6();
                        sVar.C6().O5().m("TIReviewEntriesFragment");
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        sVar.E6();
                        View view11 = sVar.f46232f;
                        if (view11 == null) {
                            p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                            throw null;
                        }
                        view11.setVisibility(8);
                        LinearLayout linearLayout6 = sVar.f46236j;
                        if (linearLayout6 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                            throw null;
                        }
                        linearLayout6.setVisibility(0);
                        EditText editText12 = sVar.f46233g;
                        if (editText12 == null) {
                            p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                            throw null;
                        }
                        editText12.requestFocus();
                        View view12 = sVar.f46244r;
                        if (view12 == null) {
                            p005kotlin.jvm.internal.s.m("mView");
                            throw null;
                        }
                        view12.setVisibility(0);
                        TextView textView5 = sVar.f46246v;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                            throw null;
                        }
                        textView5.setVisibility(0);
                        ImageView imageView4 = sVar.f46247w;
                        if (imageView4 != null) {
                            imageView4.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                            throw null;
                        }
                }
            }
        });
        EditText editText7 = this.f46234h;
        if (editText7 == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        editText7.setImeOptions(6);
        EditText editText8 = this.f46234h;
        if (editText8 == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        editText8.setRawInputType(1);
        EditText editText9 = this.f46234h;
        if (editText9 == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        editText9.addTextChangedListener(new c1(this));
        final int i34 = 0;
        ((androidx.lifecycle.s0) C6().W1.getValue()).f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167271b;

            {
                this.f167271b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i35 = i34;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167271b;
                switch (i35) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (g3Var != null) {
                            int i36 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.b.f46248a[g3Var.f35300a.ordinal()];
                            if (i36 == 1) {
                                g22.e.l(sVar);
                            } else if (i36 == 2) {
                                g22.e.f(sVar);
                                fg0.s sVar2 = (fg0.s) g3Var.f35301b;
                                if (sVar2 != null) {
                                    AddTIEventViewModel addTIEventViewModelC6 = sVar.C6();
                                    String strB = sVar2.b();
                                    if (strB == null) {
                                        strB = "";
                                    }
                                    addTIEventViewModelC6.A6(strB);
                                }
                                AppCompatButton appCompatButton2 = sVar.f46245t;
                                if (appCompatButton2 == null) {
                                    p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                    throw null;
                                }
                                appCompatButton2.setEnabled(true);
                                TextView textView3 = sVar.f46242p;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                    throw null;
                                }
                                textView3.setFocusable(false);
                                TextView textView4 = sVar.f46246v;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                                    throw null;
                                }
                                textView4.setVisibility(8);
                                ImageView imageView3 = sVar.f46247w;
                                if (imageView3 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                                    throw null;
                                }
                                imageView3.setVisibility(8);
                            } else {
                                if (i36 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                AppCompatButton appCompatButton3 = sVar.f46245t;
                                if (appCompatButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                    throw null;
                                }
                                appCompatButton3.setEnabled(false);
                                TextView textView5 = sVar.f46242p;
                                if (textView5 == null) {
                                    p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                    throw null;
                                }
                                textView5.setFocusable(false);
                                TextView textView6 = sVar.f46246v;
                                if (textView6 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                                    throw null;
                                }
                                textView6.setVisibility(0);
                                ImageView imageView4 = sVar.f46247w;
                                if (imageView4 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                                    throw null;
                                }
                                imageView4.setVisibility(0);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        String str = (String) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (str != null && str.length() > 0) {
                            EditText editText10 = sVar.f46233g;
                            if (editText10 == null) {
                                p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                                throw null;
                            }
                            editText10.setText(str);
                            TextView textView7 = sVar.f46242p;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                throw null;
                            }
                            textView7.setText(str);
                            View view7 = sVar.f46232f;
                            if (view7 == null) {
                                p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                                throw null;
                            }
                            view7.setVisibility(8);
                            LinearLayout linearLayout = sVar.f46236j;
                            if (linearLayout == null) {
                                p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                            LinearLayout linearLayout2 = sVar.f46237k;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("mWebsitePreview");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                        }
                        return Unit.INSTANCE;
                    default:
                        String str2 = (String) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (str2 != null && str2.length() > 0) {
                            EditText editText11 = sVar.f46234h;
                            if (editText11 == null) {
                                p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                                throw null;
                            }
                            editText11.setText(str2);
                            TextView textView8 = sVar.f46243q;
                            if (textView8 == null) {
                                p005kotlin.jvm.internal.s.m("mTextviewNotes");
                                throw null;
                            }
                            textView8.setText(str2);
                            View view8 = sVar.f46231e;
                            if (view8 == null) {
                                p005kotlin.jvm.internal.s.m("mAddNotesOption");
                                throw null;
                            }
                            view8.setVisibility(8);
                            LinearLayout linearLayout3 = sVar.f46235i;
                            if (linearLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("mNotesLayout");
                                throw null;
                            }
                            linearLayout3.setVisibility(8);
                            LinearLayout linearLayout4 = sVar.f46238l;
                            if (linearLayout4 == null) {
                                p005kotlin.jvm.internal.s.m("mNotesPreview");
                                throw null;
                            }
                            linearLayout4.setVisibility(0);
                            TextView textView9 = sVar.f46241o;
                            if (textView9 == null) {
                                p005kotlin.jvm.internal.s.m("mCharacterCount");
                                throw null;
                            }
                            textView9.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i35 = 1;
        C6().Y1.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167271b;

            {
                this.f167271b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i36 = i35;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167271b;
                switch (i36) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (g3Var != null) {
                            int i37 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.b.f46248a[g3Var.f35300a.ordinal()];
                            if (i37 == 1) {
                                g22.e.l(sVar);
                            } else if (i37 == 2) {
                                g22.e.f(sVar);
                                fg0.s sVar2 = (fg0.s) g3Var.f35301b;
                                if (sVar2 != null) {
                                    AddTIEventViewModel addTIEventViewModelC6 = sVar.C6();
                                    String strB = sVar2.b();
                                    if (strB == null) {
                                        strB = "";
                                    }
                                    addTIEventViewModelC6.A6(strB);
                                }
                                AppCompatButton appCompatButton2 = sVar.f46245t;
                                if (appCompatButton2 == null) {
                                    p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                    throw null;
                                }
                                appCompatButton2.setEnabled(true);
                                TextView textView3 = sVar.f46242p;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                    throw null;
                                }
                                textView3.setFocusable(false);
                                TextView textView4 = sVar.f46246v;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                                    throw null;
                                }
                                textView4.setVisibility(8);
                                ImageView imageView3 = sVar.f46247w;
                                if (imageView3 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                                    throw null;
                                }
                                imageView3.setVisibility(8);
                            } else {
                                if (i37 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                AppCompatButton appCompatButton3 = sVar.f46245t;
                                if (appCompatButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                    throw null;
                                }
                                appCompatButton3.setEnabled(false);
                                TextView textView5 = sVar.f46242p;
                                if (textView5 == null) {
                                    p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                    throw null;
                                }
                                textView5.setFocusable(false);
                                TextView textView6 = sVar.f46246v;
                                if (textView6 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                                    throw null;
                                }
                                textView6.setVisibility(0);
                                ImageView imageView4 = sVar.f46247w;
                                if (imageView4 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                                    throw null;
                                }
                                imageView4.setVisibility(0);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        String str = (String) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (str != null && str.length() > 0) {
                            EditText editText10 = sVar.f46233g;
                            if (editText10 == null) {
                                p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                                throw null;
                            }
                            editText10.setText(str);
                            TextView textView7 = sVar.f46242p;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                throw null;
                            }
                            textView7.setText(str);
                            View view7 = sVar.f46232f;
                            if (view7 == null) {
                                p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                                throw null;
                            }
                            view7.setVisibility(8);
                            LinearLayout linearLayout = sVar.f46236j;
                            if (linearLayout == null) {
                                p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                            LinearLayout linearLayout2 = sVar.f46237k;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("mWebsitePreview");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                        }
                        return Unit.INSTANCE;
                    default:
                        String str2 = (String) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (str2 != null && str2.length() > 0) {
                            EditText editText11 = sVar.f46234h;
                            if (editText11 == null) {
                                p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                                throw null;
                            }
                            editText11.setText(str2);
                            TextView textView8 = sVar.f46243q;
                            if (textView8 == null) {
                                p005kotlin.jvm.internal.s.m("mTextviewNotes");
                                throw null;
                            }
                            textView8.setText(str2);
                            View view8 = sVar.f46231e;
                            if (view8 == null) {
                                p005kotlin.jvm.internal.s.m("mAddNotesOption");
                                throw null;
                            }
                            view8.setVisibility(8);
                            LinearLayout linearLayout3 = sVar.f46235i;
                            if (linearLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("mNotesLayout");
                                throw null;
                            }
                            linearLayout3.setVisibility(8);
                            LinearLayout linearLayout4 = sVar.f46238l;
                            if (linearLayout4 == null) {
                                p005kotlin.jvm.internal.s.m("mNotesPreview");
                                throw null;
                            }
                            linearLayout4.setVisibility(0);
                            TextView textView9 = sVar.f46241o;
                            if (textView9 == null) {
                                p005kotlin.jvm.internal.s.m("mCharacterCount");
                                throw null;
                            }
                            textView9.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i36 = 2;
        C6().f46398a2.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167271b;

            {
                this.f167271b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i37 = i36;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = this.f167271b;
                switch (i37) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (g3Var != null) {
                            int i38 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.b.f46248a[g3Var.f35300a.ordinal()];
                            if (i38 == 1) {
                                g22.e.l(sVar);
                            } else if (i38 == 2) {
                                g22.e.f(sVar);
                                fg0.s sVar2 = (fg0.s) g3Var.f35301b;
                                if (sVar2 != null) {
                                    AddTIEventViewModel addTIEventViewModelC6 = sVar.C6();
                                    String strB = sVar2.b();
                                    if (strB == null) {
                                        strB = "";
                                    }
                                    addTIEventViewModelC6.A6(strB);
                                }
                                AppCompatButton appCompatButton2 = sVar.f46245t;
                                if (appCompatButton2 == null) {
                                    p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                    throw null;
                                }
                                appCompatButton2.setEnabled(true);
                                TextView textView3 = sVar.f46242p;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                    throw null;
                                }
                                textView3.setFocusable(false);
                                TextView textView4 = sVar.f46246v;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                                    throw null;
                                }
                                textView4.setVisibility(8);
                                ImageView imageView3 = sVar.f46247w;
                                if (imageView3 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                                    throw null;
                                }
                                imageView3.setVisibility(8);
                            } else {
                                if (i38 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                g22.e.f(sVar);
                                AppCompatButton appCompatButton3 = sVar.f46245t;
                                if (appCompatButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("mReviewEntriesButton");
                                    throw null;
                                }
                                appCompatButton3.setEnabled(false);
                                TextView textView5 = sVar.f46242p;
                                if (textView5 == null) {
                                    p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                    throw null;
                                }
                                textView5.setFocusable(false);
                                TextView textView6 = sVar.f46246v;
                                if (textView6 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlHelpTextView");
                                    throw null;
                                }
                                textView6.setVisibility(0);
                                ImageView imageView4 = sVar.f46247w;
                                if (imageView4 == null) {
                                    p005kotlin.jvm.internal.s.m("mUrlErrorIcon");
                                    throw null;
                                }
                                imageView4.setVisibility(0);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        String str = (String) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (str != null && str.length() > 0) {
                            EditText editText10 = sVar.f46233g;
                            if (editText10 == null) {
                                p005kotlin.jvm.internal.s.m("mWebsiteEditTextView");
                                throw null;
                            }
                            editText10.setText(str);
                            TextView textView7 = sVar.f46242p;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("mTextviewWebsite");
                                throw null;
                            }
                            textView7.setText(str);
                            View view7 = sVar.f46232f;
                            if (view7 == null) {
                                p005kotlin.jvm.internal.s.m("mAddWebsiteOption");
                                throw null;
                            }
                            view7.setVisibility(8);
                            LinearLayout linearLayout = sVar.f46236j;
                            if (linearLayout == null) {
                                p005kotlin.jvm.internal.s.m("mWebsiteLayout");
                                throw null;
                            }
                            linearLayout.setVisibility(8);
                            LinearLayout linearLayout2 = sVar.f46237k;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("mWebsitePreview");
                                throw null;
                            }
                            linearLayout2.setVisibility(0);
                        }
                        return Unit.INSTANCE;
                    default:
                        String str2 = (String) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                        if (str2 != null && str2.length() > 0) {
                            EditText editText11 = sVar.f46234h;
                            if (editText11 == null) {
                                p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                                throw null;
                            }
                            editText11.setText(str2);
                            TextView textView8 = sVar.f46243q;
                            if (textView8 == null) {
                                p005kotlin.jvm.internal.s.m("mTextviewNotes");
                                throw null;
                            }
                            textView8.setText(str2);
                            View view8 = sVar.f46231e;
                            if (view8 == null) {
                                p005kotlin.jvm.internal.s.m("mAddNotesOption");
                                throw null;
                            }
                            view8.setVisibility(8);
                            LinearLayout linearLayout3 = sVar.f46235i;
                            if (linearLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("mNotesLayout");
                                throw null;
                            }
                            linearLayout3.setVisibility(8);
                            LinearLayout linearLayout4 = sVar.f46238l;
                            if (linearLayout4 == null) {
                                p005kotlin.jvm.internal.s.m("mNotesPreview");
                                throw null;
                            }
                            linearLayout4.setVisibility(0);
                            TextView textView9 = sVar.f46241o;
                            if (textView9 == null) {
                                p005kotlin.jvm.internal.s.m("mCharacterCount");
                                throw null;
                            }
                            textView9.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/s$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
