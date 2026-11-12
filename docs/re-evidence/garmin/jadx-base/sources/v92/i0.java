package v92;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv92/i0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f176404b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f176405a = new w1(s0.f105811a.b(r.class), new c(this), new v10.a(9), new d(null, this));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f176406a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f176406a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f176406a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f176406a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176407a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f176407a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f176407a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f176408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f176409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f176408a = aVar;
            this.f176409b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f176408a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f176409b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.consent_feature_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((r) this.f176405a.getValue()).f176474i.m(l.DEVICE_UPLOAD);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(childFragmentManager, childFragmentManager);
        k0.f176419c.getClass();
        aVarB.l(R.id.consent_feature_fragment_container, new k0(), "DeviceUploadViewFragment");
        aVarB.e();
        w1 w1Var = this.f176405a;
        final int i14 = 0;
        ((r) w1Var.getValue()).f176472g.f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: v92.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f176378b;

            {
                this.f176378b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                final i0 i0Var = this.f176378b;
                switch (i15) {
                    case 0:
                        d0 d0Var = (d0) obj;
                        i0.a aVar = i0.f176404b;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("DeviceUploadConsentFragment", "consentViewState = " + d0Var);
                        if (d0Var instanceof d0.j) {
                            final int i16 = 0;
                            final int i17 = 1;
                            new androidx.appcompat.app.e.a(i0Var.requireContext()).setCancelable(false).setTitle(R.string.consent_lib_data_storage_required_alert_title).setMessage(i0Var.getString(R.string.consent_lib_data_storage_required_alert_msg)).setNegativeButton(i0Var.getString(R.string.consent_lib_lbl_cancel), new DialogInterface.OnClickListener() { // from class: v92.h0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                    int i19 = i16;
                                    i0 i0Var2 = i0Var;
                                    switch (i19) {
                                        case 0:
                                            i0.a aVar2 = i0.f176404b;
                                            k0 k0Var = (k0) i0Var2.getChildFragmentManager().G("DeviceUploadViewFragment");
                                            if (k0Var != null) {
                                                k0Var.u6();
                                            }
                                            dialogInterface.dismiss();
                                            break;
                                        default:
                                            i0.a aVar3 = i0.f176404b;
                                            h.a aVar4 = h.f176379f;
                                            e0 e0Var = e0.UPDATE_DEVICE_UPLOAD_AUTOMATICALLY;
                                            aVar4.getClass();
                                            h hVarA = h.a.a(null, null, e0Var);
                                            androidx.fragment.app.v childFragmentManager2 = i0Var2.getChildFragmentManager();
                                            childFragmentManager2.getClass();
                                            androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(childFragmentManager2);
                                            aVar5.l(R.id.consent_feature_fragment_container, hVarA, null);
                                            aVar5.d("ConsentFeatureFragment");
                                            aVar5.e();
                                            break;
                                    }
                                }
                            }).setPositiveButton(i0Var.getString(R.string.consent_lib_lbl_continue), new DialogInterface.OnClickListener() { // from class: v92.h0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                    int i19 = i17;
                                    i0 i0Var2 = i0Var;
                                    switch (i19) {
                                        case 0:
                                            i0.a aVar2 = i0.f176404b;
                                            k0 k0Var = (k0) i0Var2.getChildFragmentManager().G("DeviceUploadViewFragment");
                                            if (k0Var != null) {
                                                k0Var.u6();
                                            }
                                            dialogInterface.dismiss();
                                            break;
                                        default:
                                            i0.a aVar3 = i0.f176404b;
                                            h.a aVar4 = h.f176379f;
                                            e0 e0Var = e0.UPDATE_DEVICE_UPLOAD_AUTOMATICALLY;
                                            aVar4.getClass();
                                            h hVarA = h.a.a(null, null, e0Var);
                                            androidx.fragment.app.v childFragmentManager2 = i0Var2.getChildFragmentManager();
                                            childFragmentManager2.getClass();
                                            androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(childFragmentManager2);
                                            aVar5.l(R.id.consent_feature_fragment_container, hVarA, null);
                                            aVar5.d("ConsentFeatureFragment");
                                            aVar5.e();
                                            break;
                                    }
                                }
                            }).create().show();
                        } else if (d0Var instanceof d0.b) {
                            i0Var.getChildFragmentManager().Z();
                        }
                        break;
                    default:
                        a aVar2 = (a) obj;
                        i0.a aVar3 = i0.f176404b;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("DeviceUploadConsentFragment", "consentAction = " + aVar2);
                        if (aVar2 instanceof a.c) {
                            ((r) i0Var.f176405a.getValue()).J4(((a.c) aVar2).f176295a);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        ((r) w1Var.getValue()).f176473h.f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: v92.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f176378b;

            {
                this.f176378b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                final i0 i0Var = this.f176378b;
                switch (i16) {
                    case 0:
                        d0 d0Var = (d0) obj;
                        i0.a aVar = i0.f176404b;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("DeviceUploadConsentFragment", "consentViewState = " + d0Var);
                        if (d0Var instanceof d0.j) {
                            final int i17 = 0;
                            final int i18 = 1;
                            new androidx.appcompat.app.e.a(i0Var.requireContext()).setCancelable(false).setTitle(R.string.consent_lib_data_storage_required_alert_title).setMessage(i0Var.getString(R.string.consent_lib_data_storage_required_alert_msg)).setNegativeButton(i0Var.getString(R.string.consent_lib_lbl_cancel), new DialogInterface.OnClickListener() { // from class: v92.h0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i19) {
                                    int i110 = i17;
                                    i0 i0Var2 = i0Var;
                                    switch (i110) {
                                        case 0:
                                            i0.a aVar2 = i0.f176404b;
                                            k0 k0Var = (k0) i0Var2.getChildFragmentManager().G("DeviceUploadViewFragment");
                                            if (k0Var != null) {
                                                k0Var.u6();
                                            }
                                            dialogInterface.dismiss();
                                            break;
                                        default:
                                            i0.a aVar3 = i0.f176404b;
                                            h.a aVar4 = h.f176379f;
                                            e0 e0Var = e0.UPDATE_DEVICE_UPLOAD_AUTOMATICALLY;
                                            aVar4.getClass();
                                            h hVarA = h.a.a(null, null, e0Var);
                                            androidx.fragment.app.v childFragmentManager2 = i0Var2.getChildFragmentManager();
                                            childFragmentManager2.getClass();
                                            androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(childFragmentManager2);
                                            aVar5.l(R.id.consent_feature_fragment_container, hVarA, null);
                                            aVar5.d("ConsentFeatureFragment");
                                            aVar5.e();
                                            break;
                                    }
                                }
                            }).setPositiveButton(i0Var.getString(R.string.consent_lib_lbl_continue), new DialogInterface.OnClickListener() { // from class: v92.h0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i19) {
                                    int i110 = i18;
                                    i0 i0Var2 = i0Var;
                                    switch (i110) {
                                        case 0:
                                            i0.a aVar2 = i0.f176404b;
                                            k0 k0Var = (k0) i0Var2.getChildFragmentManager().G("DeviceUploadViewFragment");
                                            if (k0Var != null) {
                                                k0Var.u6();
                                            }
                                            dialogInterface.dismiss();
                                            break;
                                        default:
                                            i0.a aVar3 = i0.f176404b;
                                            h.a aVar4 = h.f176379f;
                                            e0 e0Var = e0.UPDATE_DEVICE_UPLOAD_AUTOMATICALLY;
                                            aVar4.getClass();
                                            h hVarA = h.a.a(null, null, e0Var);
                                            androidx.fragment.app.v childFragmentManager2 = i0Var2.getChildFragmentManager();
                                            childFragmentManager2.getClass();
                                            androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(childFragmentManager2);
                                            aVar5.l(R.id.consent_feature_fragment_container, hVarA, null);
                                            aVar5.d("ConsentFeatureFragment");
                                            aVar5.e();
                                            break;
                                    }
                                }
                            }).create().show();
                        } else if (d0Var instanceof d0.b) {
                            i0Var.getChildFragmentManager().Z();
                        }
                        break;
                    default:
                        a aVar2 = (a) obj;
                        i0.a aVar3 = i0.f176404b;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("DeviceUploadConsentFragment", "consentAction = " + aVar2);
                        if (aVar2 instanceof a.c) {
                            ((r) i0Var.f176405a.getValue()).J4(((a.c) aVar2).f176295a);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        r rVar = (r) w1Var.getValue();
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", "fetchDeviceUploadConsent()");
        ge1.b.T(v1.a(rVar), null, null, new x(rVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv92/i0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
