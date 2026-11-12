package v92;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.consent.network.GdprRevokeException406;
import com.garmin.android.consent.ui.view.ConsentScreenView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv92/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f176318n = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s92.g f176320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s92.g f176321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f176322d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f176324f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f176326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f176327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f176328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<s92.e> f176329k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f176319a = new w1(s0.f105811a.b(r.class), new c(this), new v10.a(6), new C3292d(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView.ScaleType f176323e = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f176325g = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f176330l = m.CONFIRM_DELETE_DATA;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f176331m = m.CONFIRM_DELETE_DATA_CANCEL;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f176332a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f176332a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f176332a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f176332a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176333a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f176333a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f176333a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: v92.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class C3292d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f176334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f176335b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3292d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f176334a = aVar;
            this.f176335b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f176334a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f176335b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        s92.j jVar;
        List<s92.b> listB;
        Object next;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f176320b = (s92.g) arguments.getParcelable("extra_confirm_revoke_text_dto");
            this.f176321c = (s92.g) arguments.getParcelable("extra_consent_text_dto");
            this.f176322d = (Uri) arguments.getParcelable("extra_top_image_uri");
            this.f176323e = ImageView.ScaleType.values()[arguments.getInt("extra_top_image_scale_type", ImageView.ScaleType.CENTER_CROP.ordinal())];
            this.f176326h = arguments.getString("extra_email_address");
        }
        s92.g gVar = this.f176320b;
        if (gVar != null) {
            this.f176324f = gVar.getHeadline();
            r rVarU6 = u6();
            if (rVarU6.f176470e) {
                jVar = s92.j.CHILD;
            } else {
                jVar = rVarU6.f176469d != null ? s92.j.PARENT : s92.j.INDIVIDUAL;
            }
            List<s92.f> listF = gVar.f();
            if (listF != null) {
                Iterator<T> it = listF.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((s92.f) next).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() != jVar);
                s92.f fVar = (s92.f) next;
                if (fVar == null || (listB = fVar.b()) == null) {
                    listB = gVar.b();
                }
            } else {
                listB = gVar.b();
            }
            if (listB != null && (!listB.isEmpty())) {
                Iterator<s92.b> it3 = listB.iterator();
                while (it3.hasNext()) {
                    this.f176325g.add(it3.next());
                }
            }
            this.f176327i = gVar.getGrantButton();
            this.f176328j = gVar.getRejectButton();
            this.f176329k = gVar.d();
        }
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.consent_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        u6().f176474i.m(l.DELETE_DATA_CONFIRMATION);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"StringFormatInvalid"})
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        final ConsentScreenView consentScreenView = (ConsentScreenView) view2.findViewById(R.id.consent_screen_view);
        consentScreenView.setTopImageScaleType(this.f176323e);
        consentScreenView.e(this.f176322d);
        consentScreenView.setHeadlineText(this.f176324f);
        ArrayList<s92.b> arrayList = this.f176325g;
        if (!arrayList.isEmpty()) {
            for (s92.b bVar : arrayList) {
                String copy = bVar.getCopy();
                if (copy != null) {
                    boolean zF = bVar.f();
                    s92.g gVar = this.f176320b;
                    consentScreenView.a(copy, gVar != null ? gVar.getConsentTypeId() : null, zF);
                }
            }
        }
        final int i14 = 0;
        u6().f176473h.f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: v92.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f176308b;

            {
                this.f176308b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                ConsentScreenView consentScreenView2 = consentScreenView;
                d dVar = this.f176308b;
                switch (i15) {
                    case 0:
                        a aVar = (a) obj;
                        d.a aVar2 = d.f176318n;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentDeleteDataConfirmFragment", "consentAction = " + aVar);
                        if ((aVar instanceof a.C3291a) && ((a.C3291a) aVar).f176290a == m.CONFIRM_DELETE_DATA) {
                            String confirmationInput = consentScreenView2.getConfirmationInput();
                            if (confirmationInput == null || confirmationInput.length() <= 0) {
                                String string = dVar.getString(R.string.consent_lib_delete_data_confirmation_input_required_msg);
                                string.getClass();
                                consentScreenView2.setConfirmationError(string);
                            } else {
                                s92.g gVar2 = dVar.f176321c;
                                if (gVar2 != null) {
                                    r rVarU6 = dVar.u6();
                                    q92.x xVar = q92.x.DI_CONNECT_UPLOAD;
                                    xVar.getClass();
                                    p92.y.a.a("ConsentFeatureViewModel", "confirmDataDeletion(" + xVar + ")");
                                    rVarU6.f176472g.m(d0.k.f176352a);
                                    ge1.b.T(v1.a(rVarU6), null, null, new v(rVarU6, confirmationInput, xVar, gVar2, null), 3);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        d0 d0Var = (d0) obj;
                        d.a aVar3 = d.f176318n;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentDeleteDataConfirmFragment", "consentViewState = " + d0Var);
                        if (d0Var instanceof d0.m) {
                            String string2 = dVar.getString(R.string.consent_lib_delete_data_confirmation_error_msg);
                            string2.getClass();
                            consentScreenView2.setConfirmationError(string2);
                        } else if (d0Var instanceof d0.a) {
                            e eVar = ((d0.a) d0Var).f176336a;
                            if ((eVar instanceof e.b) && (((e.b) eVar).f176358b instanceof GdprRevokeException406)) {
                                TextInputLayout textInputLayout = consentScreenView2.f49814g;
                                if (textInputLayout == null) {
                                    p005kotlin.jvm.internal.s.m("confirmationInputView");
                                    throw null;
                                }
                                EditText editText = textInputLayout.getEditText();
                                if (editText != null) {
                                    editText.setText((CharSequence) null);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        u6().f176472g.f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: v92.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f176308b;

            {
                this.f176308b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                ConsentScreenView consentScreenView2 = consentScreenView;
                d dVar = this.f176308b;
                switch (i16) {
                    case 0:
                        a aVar = (a) obj;
                        d.a aVar2 = d.f176318n;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentDeleteDataConfirmFragment", "consentAction = " + aVar);
                        if ((aVar instanceof a.C3291a) && ((a.C3291a) aVar).f176290a == m.CONFIRM_DELETE_DATA) {
                            String confirmationInput = consentScreenView2.getConfirmationInput();
                            if (confirmationInput == null || confirmationInput.length() <= 0) {
                                String string = dVar.getString(R.string.consent_lib_delete_data_confirmation_input_required_msg);
                                string.getClass();
                                consentScreenView2.setConfirmationError(string);
                            } else {
                                s92.g gVar2 = dVar.f176321c;
                                if (gVar2 != null) {
                                    r rVarU6 = dVar.u6();
                                    q92.x xVar = q92.x.DI_CONNECT_UPLOAD;
                                    xVar.getClass();
                                    p92.y.a.a("ConsentFeatureViewModel", "confirmDataDeletion(" + xVar + ")");
                                    rVarU6.f176472g.m(d0.k.f176352a);
                                    ge1.b.T(v1.a(rVarU6), null, null, new v(rVarU6, confirmationInput, xVar, gVar2, null), 3);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        d0 d0Var = (d0) obj;
                        d.a aVar3 = d.f176318n;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentDeleteDataConfirmFragment", "consentViewState = " + d0Var);
                        if (d0Var instanceof d0.m) {
                            String string2 = dVar.getString(R.string.consent_lib_delete_data_confirmation_error_msg);
                            string2.getClass();
                            consentScreenView2.setConfirmationError(string2);
                        } else if (d0Var instanceof d0.a) {
                            e eVar = ((d0.a) d0Var).f176336a;
                            if ((eVar instanceof e.b) && (((e.b) eVar).f176358b instanceof GdprRevokeException406)) {
                                TextInputLayout textInputLayout = consentScreenView2.f49814g;
                                if (textInputLayout == null) {
                                    p005kotlin.jvm.internal.s.m("confirmationInputView");
                                    throw null;
                                }
                                EditText editText = textInputLayout.getEditText();
                                if (editText != null) {
                                    editText.setText((CharSequence) null);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        String string = getString(R.string.consent_lib_delete_data_confirmation_msg, this.f176326h);
        TextInputLayout textInputLayout = consentScreenView.f49814g;
        if (textInputLayout == null) {
            p005kotlin.jvm.internal.s.m("confirmationInputView");
            throw null;
        }
        textInputLayout.setVisibility(0);
        TextView textView = consentScreenView.f49813f;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("confirmationTextView");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = consentScreenView.f49813f;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("confirmationTextView");
            throw null;
        }
        textView2.setText(string);
        TextView textView3 = consentScreenView.f49813f;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("confirmationTextView");
            throw null;
        }
        int i16 = consentScreenView.f49828w;
        if (i16 >= 0) {
            textView3.setLineHeight(i16);
        }
        final int i17 = 0;
        consentScreenView.f(this.f176330l, this.f176327i, new View.OnClickListener(this) { // from class: v92.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f176314b;

            {
                this.f176314b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        d dVar = this.f176314b;
                        s92.g gVar2 = dVar.f176321c;
                        if (gVar2 != null) {
                            dVar.u6().f176473h.m(new a.C3291a(dVar.f176330l, gVar2));
                        }
                        break;
                    default:
                        d dVar2 = this.f176314b;
                        s92.g gVar3 = dVar2.f176321c;
                        if (gVar3 != null) {
                            dVar2.u6().f176473h.m(new a.C3291a(dVar2.f176331m, gVar3));
                        }
                        break;
                }
            }
        });
        final int i18 = 1;
        consentScreenView.g(this.f176331m, this.f176328j, new View.OnClickListener(this) { // from class: v92.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f176314b;

            {
                this.f176314b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        d dVar = this.f176314b;
                        s92.g gVar2 = dVar.f176321c;
                        if (gVar2 != null) {
                            dVar.u6().f176473h.m(new a.C3291a(dVar.f176330l, gVar2));
                        }
                        break;
                    default:
                        d dVar2 = this.f176314b;
                        s92.g gVar3 = dVar2.f176321c;
                        if (gVar3 != null) {
                            dVar2.u6().f176473h.m(new a.C3291a(dVar2.f176331m, gVar3));
                        }
                        break;
                }
            }
        });
        List<s92.e> list = this.f176329k;
        if (list != null) {
            for (s92.e eVar : list) {
                if (eVar != null) {
                    String text = eVar.getText();
                    String url = eVar.getUrl();
                    if (text != null && url != null) {
                        consentScreenView.b(text, new ty0.a(this, text, url, 8));
                    }
                }
            }
        }
    }

    public final r u6() {
        return (r) this.f176319a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lv92/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONFIRM_RREVOKE_TEXT_DTO", "EXTRA_CONSENT_OPT_OUT_TEXT_DTO", "EXTRA_TOP_IMAGE_URI", "EXTRA_TOP_IMAGE_SCALE_TYPE", "EXTRA_EMAIL_ADDRESS", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
