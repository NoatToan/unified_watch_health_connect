package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.p;
import lc.u0;
import o13.h;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import vj1.g;
import vj1.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/steps/EmergencyCallingDetailsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmergencyCallingDetailsFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f43806a = new w1(s0.f105811a.b(i.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43807b = s3.b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43809b;

        static {
            int[] iArr = new int[vj1.c.values().length];
            try {
                iArr[vj1.c.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vj1.c.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43808a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f43809b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43810a;

        public b(l lVar) {
            lVar.getClass();
            this.f43810a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43810a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43810a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43811a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f43811a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43811a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43813b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43812a = aVar;
            this.f43813b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43812a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43813b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43814a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f43814a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43814a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (u6().A) {
            return;
        }
        m mVarRequireActivity = requireActivity();
        f0.k(mVarRequireActivity.getOnBackPressedDispatcher(), this, new x9.b(1, this, mVarRequireActivity), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(u6().A ? R.layout.emergency_calling_details_wizard : R.layout.emergency_calling_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.emergency_calling_details_view);
        viewFindViewById.getClass();
        View viewFindViewById2 = view2.findViewById(R.id.emergency_calling_contact_type);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.emergency_calling_contact_details);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.emergency_calling_remove_contact);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        Button button = (Button) view2.findViewById(R.id.emergency_calling_finish_setup);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        g gVar = new g(new l22.a(contextRequireContext));
        vj1.c cVar = u6().f178470r;
        if (cVar != null) {
            int i14 = g.a.f178467a[cVar.ordinal()];
            l22.b bVar = gVar.f178466a;
            if (i14 == 1) {
                string = bVar.getString(R.string.incident_detection_assistance_contact);
            } else {
                if (i14 != 2) {
                    u0.r();
                    return;
                }
                string = bVar.getString(R.string.lbl_emergency_services);
            }
            textView.setText(string);
            l20.a aVarI4 = u6().I4();
            if (aVarI4 != null) {
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                textView2.setText(gVar.c(contextRequireContext2, cVar, aVarI4));
            }
        }
        if (!u6().A) {
            viewFindViewById.setOnClickListener(new xj1.d(this, 1));
            imageView.setOnClickListener(new xj1.d(this, 2));
        } else {
            imageView.setVisibility(8);
            if (button != null) {
                button.setOnClickListener(new xj1.d(this, 0));
            }
        }
    }

    public final i u6() {
        return (i) this.f43806a.getValue();
    }
}
