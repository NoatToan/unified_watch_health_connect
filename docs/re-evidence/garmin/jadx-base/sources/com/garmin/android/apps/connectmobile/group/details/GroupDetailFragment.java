package com.garmin.android.apps.connectmobile.group.details;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.viewpager2.widget.ViewPager2;
import c22.l2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.google.android.material.tabs.TabLayout;
import e23.l;
import mh1.x;
import mm0.e;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/GroupDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupDetailFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.group.details.b f36158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager2 f36159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TabLayout f36160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f36161d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36162a;

        public a(l lVar) {
            lVar.getClass();
            this.f36162a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36162a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36162a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36163a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f36163a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36163a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f36165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f36164a = aVar;
            this.f36165b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36164a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36165b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36166a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f36166a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36166a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public GroupDetailFragment() {
        super(R.layout.fragment_group_detail);
        this.f36161d = new w1(s0.f105811a.b(e.class), new b(this), new d(this), new c(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.view_pager);
        viewFindViewById.getClass();
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById;
        this.f36159b = viewPager2;
        viewPager2.setUserInputEnabled(false);
        View viewFindViewById2 = view2.findViewById(R.id.tabs);
        viewFindViewById2.getClass();
        this.f36160c = (TabLayout) viewFindViewById2;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        int iC = (int) c22.b.c(contextRequireContext, getResources().getDimensionPixelSize(R.dimen.group_detail_tab_layout_height), 1.5f);
        TabLayout tabLayout = this.f36160c;
        if (tabLayout == null) {
            s.m("tabLayout");
            throw null;
        }
        tabLayout.getLayoutParams().height = iC;
        TabLayout tabLayout2 = this.f36160c;
        if (tabLayout2 == null) {
            s.m("tabLayout");
            throw null;
        }
        tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new com.garmin.android.apps.connectmobile.group.details.a(this));
        w1 w1Var = this.f36161d;
        GroupDetailsDTO groupDetailsDTO = ((e) w1Var.getValue()).f119507c;
        View view3 = getView();
        if (view3 != null) {
            view3.post(new l0.e(7, this, groupDetailsDTO));
        }
        l2<GroupDetailsDTO> l2Var = ((e) w1Var.getValue()).f119512h;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(l2Var, viewLifecycleOwner, new a(new x(this, 2)));
    }
}
