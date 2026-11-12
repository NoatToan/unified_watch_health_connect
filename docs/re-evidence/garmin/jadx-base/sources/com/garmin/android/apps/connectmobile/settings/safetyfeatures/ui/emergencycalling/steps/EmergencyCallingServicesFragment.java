package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import h32.h;
import l20.p;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import vg1.z0;
import vj1.i;
import xa2.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/steps/EmergencyCallingServicesFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmergencyCallingServicesFragment extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f43825f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f43826a = new w1(s0.f105811a.b(i.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MenuItem f43827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f43828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f43829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f43830e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/steps/EmergencyCallingServicesFragment$b", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.emergency_calling_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_done);
            EmergencyCallingServicesFragment emergencyCallingServicesFragment = EmergencyCallingServicesFragment.this;
            if (menuItemFindItem != null) {
                int i14 = EmergencyCallingServicesFragment.f43825f;
                menuItemFindItem.setEnabled(emergencyCallingServicesFragment.v6().f178473w != null);
            } else {
                menuItemFindItem = null;
            }
            emergencyCallingServicesFragment.f43827b = menuItemFindItem;
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_done) {
                return false;
            }
            int i14 = EmergencyCallingServicesFragment.f43825f;
            EmergencyCallingServicesFragment.this.u6();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/extensions/TextViewExtensionsKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int i14 = EmergencyCallingServicesFragment.f43825f;
            EmergencyCallingServicesFragment emergencyCallingServicesFragment = EmergencyCallingServicesFragment.this;
            emergencyCallingServicesFragment.v6();
            boolean zJ4 = i.J4(String.valueOf(editable));
            MenuItem menuItem = emergencyCallingServicesFragment.f43827b;
            if (menuItem != null) {
                menuItem.setEnabled(zJ4);
            }
            Button button = emergencyCallingServicesFragment.f43828c;
            if (button != null) {
                button.setEnabled(zJ4);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43833a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43833a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43833a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43835b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43834a = aVar;
            this.f43835b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43834a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43835b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f43836a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43836a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v6().f178470r = vj1.c.SERVICES;
        if (v6().A) {
            return;
        }
        m mVarRequireActivity = requireActivity();
        f0.k(mVarRequireActivity.getOnBackPressedDispatcher(), this, new x9.b(3, this, mVarRequireActivity), 2).f(v6().f178476z.isEmpty() && v6().f178473w == null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(v6().A ? R.layout.emergency_calling_services_wizard : R.layout.emergency_calling_services, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String str;
        l20.c cVarB;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new b(), b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.emergency_calling_validation_message);
        TextView textView = (TextView) viewFindViewById;
        textView.setText(getString(R.string.msg_digits_count_validation_message, "2", "15"));
        textView.setVisibility(4);
        viewFindViewById.getClass();
        this.f43830e = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.emergency_service_phone);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = (StyledInlineTextFieldViewDark) viewFindViewById2;
        l20.a aVar = v6().f178473w;
        if (aVar == null || (cVarB = vj1.f.b(aVar)) == null || (str = cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()) == null) {
            str = "";
        }
        styledInlineTextFieldViewDark.i(new h.c(str, null, 15, null, new wz1.c(26, styledInlineTextFieldViewDark, this), new g(this, 9), null, null, 2, true, "0123456789", null, 2250, null));
        EditText editText = styledInlineTextFieldViewDark.editText;
        editText.getClass();
        editText.addTextChangedListener(new c());
        Unit unit = Unit.INSTANCE;
        viewFindViewById2.getClass();
        this.f43829d = (StyledInlineTextFieldViewDark) viewFindViewById2;
        Button button = (Button) view2.findViewById(R.id.emergency_calling_next);
        if (button != null) {
            button.setEnabled(v6().f178473w != null);
            button.setOnClickListener(new z0(this, 24));
        } else {
            button = null;
        }
        this.f43828c = button;
    }

    public final void u6() {
        l20.c cVarB;
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43829d;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("phoneTextField");
            throw null;
        }
        if (styledInlineTextFieldViewDark.hasFocus()) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f43829d;
            if (styledInlineTextFieldViewDark2 == null) {
                p005kotlin.jvm.internal.s.m("phoneTextField");
                throw null;
            }
            styledInlineTextFieldViewDark2.clearFocus();
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f43829d;
        if (styledInlineTextFieldViewDark3 == null) {
            p005kotlin.jvm.internal.s.m("phoneTextField");
            throw null;
        }
        String text = styledInlineTextFieldViewDark3.getText();
        if (text == null) {
            text = "";
        }
        String str = text;
        v6();
        boolean zJ4 = i.J4(str);
        w6(!zJ4);
        if (zJ4) {
            i iVarV6 = v6();
            l20.a aVar = iVarV6.f178473w;
            String str2 = (aVar == null || (cVarB = vj1.f.b(aVar)) == null) ? null : cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
            if (str2 == null || str2.length() == 0 || !str2.equals(str)) {
                Integer numValueOf = Integer.valueOf(p.OTHER.f109040a);
                Boolean bool = Boolean.TRUE;
                iVarV6.f178473w = new l20.a(null, null, null, null, null, null, null, p13.w.c(new l20.c(null, str, null, null, numValueOf, null, bool, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048493, null)), null, null, null, bool, null, 6015, null);
            }
            NavHostFragment.f10124e.getClass();
            NavHostFragment.a.a(this).g(R.id.action_emergency_calling_details, null);
        }
    }

    public final i v6() {
        return (i) this.f43826a.getValue();
    }

    public final void w6(boolean z14) {
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f43829d;
        if (z14) {
            if (styledInlineTextFieldViewDark == null) {
                p005kotlin.jvm.internal.s.m("phoneTextField");
                throw null;
            }
            styledInlineTextFieldViewDark.setHasError(true);
            TextView textView = this.f43830e;
            if (textView != null) {
                v22.e.q(textView);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("validationMessage");
                throw null;
            }
        }
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("phoneTextField");
            throw null;
        }
        styledInlineTextFieldViewDark.setHasError(false);
        TextView textView2 = this.f43830e;
        if (textView2 != null) {
            v22.e.l(textView2);
        } else {
            p005kotlin.jvm.internal.s.m("validationMessage");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/steps/EmergencyCallingServicesFragment$a;", "", "<init>", "()V", "", "PHONE_NUMBER_DIGITS_MIN", "I", "PHONE_NUMBER_DIGITS_MAX", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
