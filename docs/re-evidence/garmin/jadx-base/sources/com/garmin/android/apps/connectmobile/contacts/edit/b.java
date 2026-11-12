package com.garmin.android.apps.connectmobile.contacts.edit;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import f20.c0;
import h62.j;
import i20.l;
import i20.q;
import i20.r;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32541c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f32542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f32543b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.edit.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/contacts/edit/b$b", "Landroid/view/View$AccessibilityDelegate;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0531b extends View.AccessibilityDelegate {
        public C0531b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfo accessibilityNodeInfo) {
            view2.getClass();
            accessibilityNodeInfo.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
            a aVar = b.f32541c;
            b bVar = b.this;
            if (bVar.u6().f87193j) {
                EditText editText = bVar.f32543b;
                if (editText == null) {
                    s.m("contactMethodEditText");
                    throw null;
                }
                String string = editText.getText().toString();
                EditText editText2 = bVar.f32543b;
                if (editText2 != null) {
                    accessibilityNodeInfo.setText(PhoneNumberUtils.formatNumber(string, hb2.h.a(editText2.getContext()).getCountry()));
                } else {
                    s.m("contactMethodEditText");
                    throw null;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/contacts/edit/b$c", "Landroid/text/TextWatcher;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f32546b;

        public c(View view2) {
            this.f32546b = view2;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a aVar = b.f32541c;
            b bVar = b.this;
            if (bVar.u6().f87192i && !String.valueOf(editable).equals(bVar.u6().f87191h) && com.garmin.android.apps.connectmobile.contacts.b.e()) {
                bVar.u6().f87192i = false;
                View view2 = this.f32546b;
                ((ImageView) view2.findViewById(R.id.inline_text_field_error_icon)).setVisibility(8);
                ((TextView) view2.findViewById(R.id.number_edit_message)).setText(bVar.getString(R.string.phone_number_validation_range_message, 7, 15));
            }
            r rVarU6 = bVar.u6();
            String strValueOf = String.valueOf(editable);
            rVarU6.f87191h = strValueOf;
            rVarU6.f87187d.m(strValueOf);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/contacts/edit/b$d", "Lb/s;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = b.f32541c;
            b bVar = b.this;
            bVar.u6().f87185b.m(l.d.f87172a);
            EditText editText = bVar.f32543b;
            if (editText != null) {
                v22.e.b(editText);
            } else {
                s.m("contactMethodEditText");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32548a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar) {
            super(0);
            this.f32548a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f32548a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f32549a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o13.l lVar) {
            super(0);
            this.f32549a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f32549a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f32551b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, o13.l lVar) {
            super(0);
            this.f32550a = aVar;
            this.f32551b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32550a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f32551b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f32553b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment, o13.l lVar) {
            super(0);
            this.f32552a = fragment;
            this.f32553b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f32553b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f32552a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public b() {
        super(R.layout.fragment_edit_contact_method);
        o13.l lVarA = m.a(n.NONE, new e(new j(this, 25)));
        this.f32542a = new w1(s0.f105811a.b(r.class), new f(lVarA), new h(this, lVarA), new g(null, lVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        String string2;
        String string3;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        d dVar = new d();
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(dVar, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.row_select_label);
        ((TextView) viewFindViewById.findViewById(R.id.text_view_primary)).setText(getString(R.string.lbl_label));
        ((TextView) viewFindViewById.findViewById(R.id.text_view_secondary)).setText(getString(u6().f87184a.getF109041b()));
        final int i14 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: i20.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.edit.b f87181b;

            {
                this.f87181b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.contacts.edit.b bVar = this.f87181b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.contacts.edit.b.a aVar = com.garmin.android.apps.connectmobile.contacts.edit.b.f32541c;
                        bVar.u6().f87185b.j(l.b.f87170a);
                        EditText editText = bVar.f32543b;
                        if (editText != null) {
                            v22.e.b(editText);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("contactMethodEditText");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.contacts.edit.b.a aVar2 = com.garmin.android.apps.connectmobile.contacts.edit.b.f32541c;
                        bVar.u6().f87185b.m(l.c.f87171a);
                        EditText editText2 = bVar.f32543b;
                        if (editText2 != null) {
                            v22.e.b(editText2);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("contactMethodEditText");
                            throw null;
                        }
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.row_select_country);
        TextView textView = (TextView) view2.findViewById(R.id.number_prefix);
        if (u6().f87193j) {
            ((TextView) viewFindViewById2.findViewById(R.id.text_view_primary)).setText(getString(R.string.lbl_country_region));
            TextView textView2 = (TextView) viewFindViewById2.findViewById(R.id.text_view_secondary);
            c0 c0Var = u6().f87190g;
            if (c0Var == null || (string2 = c0Var.f68361b) == null) {
                string2 = getString(R.string.lbl_select_a_country_region);
                string2.getClass();
            }
            textView2.setText(string2);
            c0 c0Var2 = u6().f87190g;
            if (c0Var2 == null || (string3 = c0Var2.f68362c) == null) {
                string3 = getString(R.string.symbol_double_dash);
                string3.getClass();
            }
            textView.setText(string3);
            final int i15 = 1;
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: i20.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.edit.b f87181b;

                {
                    this.f87181b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.contacts.edit.b bVar = this.f87181b;
                    switch (i16) {
                        case 0:
                            com.garmin.android.apps.connectmobile.contacts.edit.b.a aVar = com.garmin.android.apps.connectmobile.contacts.edit.b.f32541c;
                            bVar.u6().f87185b.j(l.b.f87170a);
                            EditText editText = bVar.f32543b;
                            if (editText != null) {
                                v22.e.b(editText);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("contactMethodEditText");
                                throw null;
                            }
                        default:
                            com.garmin.android.apps.connectmobile.contacts.edit.b.a aVar2 = com.garmin.android.apps.connectmobile.contacts.edit.b.f32541c;
                            bVar.u6().f87185b.m(l.c.f87171a);
                            EditText editText2 = bVar.f32543b;
                            if (editText2 != null) {
                                v22.e.b(editText2);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("contactMethodEditText");
                                throw null;
                            }
                    }
                }
            });
        } else {
            viewFindViewById2.getClass();
            viewFindViewById2.setVisibility(8);
            textView.getClass();
            textView.setVisibility(8);
        }
        View viewFindViewById3 = view2.findViewById(R.id.edit_text_contact_method);
        viewFindViewById3.getClass();
        EditText editText = (EditText) viewFindViewById3;
        this.f32543b = editText;
        editText.setHint(getString(u6().f87193j ? R.string.contact_management_label_phone : R.string.lbl_email_address));
        editText.setInputType(u6().f87193j ? 3 : 208);
        editText.setAutofillHints(u6().f87193j ? "phone" : "emailAddress");
        view2.findViewById(R.id.button_clear_content).setOnClickListener(new q(editText, 0));
        editText.addTextChangedListener(new c(view2));
        editText.setAccessibilityDelegate(new C0531b());
        editText.requestFocus();
        androidx.fragment.app.m activity = getActivity();
        Object systemService = activity != null ? activity.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(2, 1);
        }
        editText.getText().insert(0, u6().f87191h);
        editText.setTransformationMethod(null);
        editText.setSelection(editText.getText().length());
        TextView textView3 = (TextView) view2.findViewById(R.id.number_edit_message);
        if (u6().f87193j) {
            string = (u6().f87192i && com.garmin.android.apps.connectmobile.contacts.b.e()) ? getString(R.string.contacts_validation_verify_phone_prompt) : getString(R.string.phone_number_validation_range_message, 7, 15);
        } else {
            string = u6().f87192i ? getString(R.string.email_validation_message) : "";
        }
        textView3.setText(string);
    }

    public final r u6() {
        return (r) this.f32542a.getValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/b$a;", "", "<init>", "()V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
