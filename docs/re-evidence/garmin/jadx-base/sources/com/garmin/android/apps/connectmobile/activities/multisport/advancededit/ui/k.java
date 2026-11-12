package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import aq.u2;
import aq.v2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.z1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import po.f0;
import ro0.l;
import zo.u;
import zo.v;
import zo.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/k;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends Fragment {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f29371j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ap.d f29372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u2 f29373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f29374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConstraintLayout f29375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0 f29376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f29377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public uo.b f29378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f29379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f29380i = new w(this, 1);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29381a;

        static {
            int[] iArr = new int[yo.a.values().length];
            try {
                iArr[yo.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yo.a.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yo.a.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yo.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[yo.a.TRIM_IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[yo.a.TRIM_LONG_RUNNING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[yo.a.TRIM_SUCCESSFUL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f29381a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/k$c", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.help_3_0, menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_help) {
                return false;
            }
            HelpActivity.a aVar = HelpActivity.f36653a;
            k kVar = k.this;
            HelpActivity.a.e(aVar, kVar.requireActivity(), l.MULTISPORT_EDIT_LEGS, null, null, 12);
            ap.d dVar = kVar.f29372a;
            if (dVar != null) {
                dVar.f11598j.m(Boolean.FALSE);
                return false;
            }
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f29383a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f29383a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f29383a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29383a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public static void u6(k kVar, int i14, int i15, int i16) {
        boolean z14 = (i16 & 4) == 0;
        g22.e.f(kVar);
        u20.e eVarU6 = u20.e.u6(i14, i15);
        eVarU6.f167882a = new dz1.g(2, kVar, z14);
        eVarU6.g(kVar.requireActivity().getSupportFragmentManager());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_view_multisport_legs, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.setTitle(R.string.edit_legs_title);
        }
        View viewFindViewById = view2.findViewById(R.id.legs_container);
        viewFindViewById.getClass();
        this.f29374c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.content_container);
        viewFindViewById2.getClass();
        this.f29375d = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.btn_save_leg_updates);
        viewFindViewById3.getClass();
        Button button = (Button) viewFindViewById3;
        this.f29377f = button;
        button.setOnClickListener(new u(this, 0));
        Button button2 = this.f29377f;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("saveButton");
            throw null;
        }
        button2.setEnabled(false);
        View viewFindViewById4 = view2.findViewById(R.id.multisport_map_preview_container);
        viewFindViewById4.getClass();
        this.f29379h = viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.btn_cancel_leg_updates);
        viewFindViewById5.getClass();
        ((Button) viewFindViewById5).setOnClickListener(new u(this, 1));
        m activity2 = getActivity();
        if (activity2 != null) {
            x1 x1Var = new x1(activity2);
            t0 t0Var = s0.f105811a;
            this.f29372a = (ap.d) x1Var.b(t0Var.b(ap.d.class));
            this.f29373b = (u2) new x1(this, new v2()).b(t0Var.b(u2.class));
            m activity3 = getActivity();
            z1 z1Var2 = activity3 instanceof z1 ? (z1) activity3 : null;
            if (z1Var2 != null) {
                z1Var2.showProgressOverlay();
            }
            ap.d dVar = this.f29372a;
            if (dVar == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            dVar.f11600l.f(getViewLifecycleOwner(), new d(new v(this, 2)));
            ap.d dVar2 = this.f29372a;
            if (dVar2 == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            dVar2.f11601m.f(getViewLifecycleOwner(), new d(new v(this, 3)));
            ap.d dVar3 = this.f29372a;
            if (dVar3 == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            dVar3.x4().f(getViewLifecycleOwner(), new d(new v(this, 4)));
            ap.d dVar4 = this.f29372a;
            if (dVar4 != null) {
                dVar4.f11593e.f198237g.f198319i.f(getViewLifecycleOwner(), new d(new v(this, 5)));
            } else {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/k$a;", "", "<init>", "()V", "", "RESTORE_SNACKBAR_DURATION", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
