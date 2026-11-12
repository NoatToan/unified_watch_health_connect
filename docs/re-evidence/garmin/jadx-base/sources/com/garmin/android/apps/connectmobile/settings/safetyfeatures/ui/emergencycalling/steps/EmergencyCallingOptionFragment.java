package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.p;
import l20.r;
import lc.h0;
import lc.y;
import o13.h;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import vj1.i;
import xj1.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/steps/EmergencyCallingOptionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmergencyCallingOptionFragment extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f43815d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f43816a = new w1(s0.f105811a.b(i.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckedTextView f43817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckedTextView f43818c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43819a;

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
            f43819a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43820a;

        public c(l lVar) {
            lVar.getClass();
            this.f43820a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43820a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43820a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43821a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43821a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43821a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43822a = aVar;
            this.f43823b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43822a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43823b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43824a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f43824a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43824a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (u6().A) {
            return;
        }
        m mVarRequireActivity = requireActivity();
        f0.k(mVarRequireActivity.getOnBackPressedDispatcher(), this, new x9.b(2, this, mVarRequireActivity), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(u6().A ? R.layout.emergency_calling_option_wizard : R.layout.emergency_calling_option, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        w6();
        if (u6().A || !u6().f178476z.isEmpty()) {
            return;
        }
        v6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.emergency_contact);
        viewFindViewById.getClass();
        this.f43817b = (CheckedTextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.emergency_services);
        viewFindViewById2.getClass();
        this.f43818c = (CheckedTextView) viewFindViewById2;
        CheckedTextView checkedTextView = this.f43817b;
        if (checkedTextView == null) {
            s.m("emergencyContactOption");
            throw null;
        }
        checkedTextView.setOnClickListener(new g(this, 0));
        CheckedTextView checkedTextView2 = this.f43818c;
        if (checkedTextView2 == null) {
            s.m("emergencyServicesOption");
            throw null;
        }
        checkedTextView2.setOnClickListener(new g(this, 1));
        TextView textView = (TextView) view2.findViewById(R.id.emergency_calling_skip_setup);
        if (textView != null) {
            textView.setOnClickListener(new g(this, 2));
        }
    }

    public final i u6() {
        return (i) this.f43816a.getValue();
    }

    public final void v6() {
        NavHostFragment.f10124e.getClass();
        y yVarA = NavHostFragment.a.a(this);
        h0 h0VarB = yVarA.f111904b.k().f111791g.b(R.id.emergencyCallingServicesFragment);
        if (h0VarB != null) {
            h0VarB.f111775d = getString(R.string.lbl_add_emergency_services);
        }
        yVarA.g(R.id.action_add_emergency_services, null);
    }

    public final void w6() {
        r userContactsDTO;
        if (u6().f178470r != null) {
            i iVarU6 = u6();
            iVarU6.f178472v = vj1.f.a(iVarU6.f178476z);
            tj1.e eVar = iVarU6.f178468p.f185783a;
            l20.a emergencyServiceContact = (eVar == null || (userContactsDTO = eVar.getUserContactsDTO()) == null) ? null : userContactsDTO.getEmergencyServiceContact();
            if (emergencyServiceContact == null || !vj1.f.d(emergencyServiceContact)) {
                emergencyServiceContact = null;
            }
            iVarU6.f178473w = emergencyServiceContact;
            u6().f178470r = null;
            CheckedTextView checkedTextView = this.f43817b;
            if (checkedTextView == null) {
                s.m("emergencyContactOption");
                throw null;
            }
            checkedTextView.setEnabled(true);
            checkedTextView.setChecked(false);
            checkedTextView.invalidate();
            CheckedTextView checkedTextView2 = this.f43818c;
            if (checkedTextView2 == null) {
                s.m("emergencyServicesOption");
                throw null;
            }
            checkedTextView2.setEnabled(true);
            checkedTextView2.setChecked(false);
            checkedTextView2.invalidate();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/steps/EmergencyCallingOptionFragment$a;", "", "<init>", "()V", "", "OPEN_OPTION_DELAY", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
