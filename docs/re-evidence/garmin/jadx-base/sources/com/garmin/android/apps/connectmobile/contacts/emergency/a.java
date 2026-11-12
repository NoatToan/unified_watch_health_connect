package com.garmin.android.apps.connectmobile.contacts.emergency;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.p;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0534a f32601m = new C0534a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f32602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f32603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f32604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f32605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f32606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConstraintLayout f32607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f32608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f32609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f32610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f32611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f32612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f32613l;

    public interface b {
        void L4(l20.a aVar, l20.c cVar);

        void j4(l20.a aVar, l20.c cVar);
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32614a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32614a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32615a;

        public d(l lVar) {
            lVar.getClass();
            this.f32615a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32615a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32615a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32616a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f32616a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32616a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f32618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f32617a = aVar;
            this.f32618b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32617a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32618b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f32619a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f32619a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.fragment_confirm_contact_method);
        this.f32611j = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.contacts.emergency.d.class), new e(this), new g(this), new f(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a7.e activity = getActivity();
        activity.getClass();
        this.f32612k = (b) activity;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u6().f32665z.f(this, new d(new j20.c(this, 1)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        int i14;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.g(this, u6().f32646e.j());
        Bundle arguments = getArguments();
        boolean z14 = false;
        if (arguments != null && arguments.getBoolean("HAS_SMS_PERMISSION")) {
            z14 = true;
        }
        this.f32613l = z14;
        View viewFindViewById = view2.findViewById(R.id.text_view_title);
        viewFindViewById.getClass();
        this.f32602a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text_view_description);
        viewFindViewById2.getClass();
        this.f32603b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.layout_contact_information);
        viewFindViewById3.getClass();
        final int i15 = 0;
        ((ConstraintLayout) viewFindViewById3).setOnClickListener(new View.OnClickListener(this) { // from class: j20.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.a f96557b;

            {
                this.f96557b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.contacts.emergency.a aVar = this.f96557b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a c0534a = com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m;
                        boolean z15 = aVar.u6().f32658q;
                        com.garmin.android.apps.connectmobile.contacts.emergency.a.b bVar = aVar.f32612k;
                        if (!z15) {
                            if (bVar != null) {
                                bVar.L4(aVar.u6().f32646e, aVar.u6().f32647f);
                            }
                        } else if (bVar != null) {
                            bVar.j4(aVar.u6().f32646e, aVar.u6().f32647f);
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a c0534a2 = com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m;
                        if (!aVar.v6()) {
                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarU6 = aVar.u6();
                            dVarU6.H4(false, dVarU6.f32659r);
                            g22.e.l(aVar);
                        } else {
                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarU7 = aVar.u6();
                            dVarU7.f32649h = true;
                            dVarU7.E.j("SendFeatureSMSRequestFragment");
                        }
                        break;
                }
            }
        });
        View viewFindViewById4 = view2.findViewById(R.id.text_view_primary);
        viewFindViewById4.getClass();
        this.f32604c = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.text_view_secondary);
        viewFindViewById5.getClass();
        this.f32605d = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.image_view_warning);
        viewFindViewById6.getClass();
        this.f32606e = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.layout_text_message);
        viewFindViewById7.getClass();
        this.f32607f = (ConstraintLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.text_view_bubble);
        viewFindViewById8.getClass();
        this.f32608g = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.text_view_bottom_note);
        viewFindViewById9.getClass();
        TextView textView = (TextView) viewFindViewById9;
        this.f32609h = textView;
        if (u6().f32659r == l20.l.LIVETRACK) {
            i14 = R.string.msg_livetrack_receive_text_message;
        } else {
            i14 = this.f32613l ? R.string.msg_send_request_automatically_sends_text_message : R.string.assistance_contact_must_accept_request_to_receive_emergency_messages;
        }
        textView.setText(getString(i14));
        View viewFindViewById10 = view2.findViewById(R.id.button_send_request);
        viewFindViewById10.getClass();
        this.f32610i = (Button) viewFindViewById10;
        boolean zV6 = v6();
        Button button = this.f32610i;
        if (zV6) {
            if (button == null) {
                s.m("sendRequestButton");
                throw null;
            }
            button.setText(getString(R.string.lbl_common_continue));
        } else {
            if (button == null) {
                s.m("sendRequestButton");
                throw null;
            }
            button.setText(getString(R.string.common_send_request));
        }
        Button button2 = this.f32610i;
        if (button2 == null) {
            s.m("sendRequestButton");
            throw null;
        }
        final int i16 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: j20.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.a f96557b;

            {
                this.f96557b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.contacts.emergency.a aVar = this.f96557b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a c0534a = com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m;
                        boolean z15 = aVar.u6().f32658q;
                        com.garmin.android.apps.connectmobile.contacts.emergency.a.b bVar = aVar.f32612k;
                        if (!z15) {
                            if (bVar != null) {
                                bVar.L4(aVar.u6().f32646e, aVar.u6().f32647f);
                            }
                        } else if (bVar != null) {
                            bVar.j4(aVar.u6().f32646e, aVar.u6().f32647f);
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a c0534a2 = com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m;
                        if (!aVar.v6()) {
                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarU6 = aVar.u6();
                            dVarU6.H4(false, dVarU6.f32659r);
                            g22.e.l(aVar);
                        } else {
                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarU7 = aVar.u6();
                            dVarU7.f32649h = true;
                            dVarU7.E.j("SendFeatureSMSRequestFragment");
                        }
                        break;
                }
            }
        });
        w6();
        g22.e.f(this);
        u6().f32653l.f(getViewLifecycleOwner(), new d(new j20.c(this, 0)));
    }

    public final com.garmin.android.apps.connectmobile.contacts.emergency.d u6() {
        return (com.garmin.android.apps.connectmobile.contacts.emergency.d) this.f32611j.getValue();
    }

    public final boolean v6() {
        if (!u6().f32644c) {
            return false;
        }
        l20.c cVar = u6().f32647f;
        return (cVar != null && cVar.F()) || u6().f32650i;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0155  */
    public final void w6() {
        int i14;
        int i15;
        boolean z14 = u6().f32658q;
        boolean z15 = false;
        boolean z16 = u6().f32659r == l20.l.LIVETRACK;
        boolean zV6 = v6();
        if (zV6) {
            Button button = this.f32610i;
            if (button == null) {
                s.m("sendRequestButton");
                throw null;
            }
            button.setText(getString(R.string.lbl_common_continue));
            TextView textView = this.f32609h;
            if (textView == null) {
                s.m("bottomNoteTextView");
                throw null;
            }
            textView.setText(getString(R.string.lbl_contact_send_request_footer_text));
            TextView textView2 = this.f32609h;
            if (textView2 == null) {
                s.m("bottomNoteTextView");
                throw null;
            }
            v22.e.v(textView2, !u6().f32658q);
            ConstraintLayout constraintLayout = this.f32607f;
            if (constraintLayout == null) {
                s.m("textMessageLayout");
                throw null;
            }
            constraintLayout.setVisibility(8);
        } else {
            u6().Q4();
        }
        TextView textView3 = this.f32602a;
        if (textView3 == null) {
            s.m("titleTextView");
            throw null;
        }
        if (z14) {
            i14 = R.string.confirm_email_address;
        } else {
            i14 = z16 ? R.string.livetrack_verify_phone_number : R.string.confirm_phone_number;
        }
        textView3.setText(getString(i14));
        TextView textView4 = this.f32603b;
        if (textView4 == null) {
            s.m("descriptionTextView");
            throw null;
        }
        if (z14) {
            i15 = R.string.assistance_contact_confirm_email_address_description;
        } else if (zV6) {
            i15 = R.string.lbl_confirm_phone_header;
        } else {
            i15 = z16 ? R.string.msg_verify_phone_number : R.string.assistance_contact_confirm_phone_number_description;
        }
        textView4.setText(getString(i15));
        l20.c cVar = u6().f32647f;
        if (cVar != null) {
            TextView textView5 = this.f32604c;
            if (textView5 == null) {
                s.m("contactInfoValue");
                throw null;
            }
            String strV = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
            if (!z14) {
                if (strV != null) {
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    strV = jg.b.v(contextRequireContext, strV);
                } else {
                    strV = null;
                }
            }
            textView5.setText(strV);
            TextView textView6 = this.f32605d;
            if (textView6 == null) {
                s.m("contactInfoLabel");
                throw null;
            }
            textView6.setText(z14 ? getString(cVar.m().f109013b) : getString(cVar.u().f109041b));
            ImageView imageView = this.f32606e;
            if (imageView == null) {
                s.m("contactInfoWarning");
                throw null;
            }
            Boolean isValid = cVar.getIsValid();
            Boolean bool = Boolean.FALSE;
            v22.e.v(imageView, s.g(isValid, bool));
            ConstraintLayout constraintLayout2 = this.f32607f;
            if (constraintLayout2 == null) {
                s.m("textMessageLayout");
                throw null;
            }
            v22.e.v(constraintLayout2, (!this.f32613l || s.g(cVar.getIsValid(), bool) || zV6) ? false : true);
        }
        Button button2 = this.f32610i;
        if (button2 == null) {
            s.m("sendRequestButton");
            throw null;
        }
        if (zV6) {
            z15 = true;
        } else {
            if (!(cVar != null ? s.g(cVar.getIsValid(), Boolean.FALSE) : false)) {
                if (z14) {
                    z15 = true;
                } else {
                    if (u6().f32657p.length() > 0) {
                        z15 = true;
                    }
                }
            }
        }
        button2.setEnabled(z15);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.emergency.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "HAS_SMS_PERMISSION", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0534a {
        public /* synthetic */ C0534a(j jVar) {
            this();
        }

        public static a a(boolean z14) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putBoolean("HAS_SMS_PERMISSION", z14);
            aVar.setArguments(bundle);
            return aVar;
        }

        private C0534a() {
        }
    }
}
