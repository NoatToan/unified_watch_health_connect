package com.garmin.android.apps.connectmobile.connections.groups.details;

import am.x0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.gncs.NotificationConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import j02.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "d", "b", "c", JWKParameterNames.RSA_EXPONENT, "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupActivityFeedTypeSubTypeSelectionFragment extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31397f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f31398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f31399b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f31401d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f31400c = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.connections.groups.details.a.class), new i(this), new k(this), new j(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f31402e = new f();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$b;", "", "Lam/x0;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "isSelected", "<init>", "(Lam/x0;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f31403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31404b;

        public b(x0 x0Var, boolean z14) {
            x0Var.getClass();
            this.f31403a = x0Var;
            this.f31404b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f31403a == bVar.f31403a && this.f31404b == bVar.f31404b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f31404b) + (this.f31403a.hashCode() * 31);
        }

        public final String toString() {
            return "SubTypeData(type=" + this.f31403a + ", isSelected=" + this.f31404b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$c;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends o.f<b> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return bVar3.f31404b == bVar4.f31404b;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return bVar3.f31403a == bVar4.f31403a;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(b bVar, b bVar2) {
            b bVar3 = bVar2;
            bVar.getClass();
            bVar3.getClass();
            return bVar3;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$e;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$b;", "activityFeedTypes", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b f31408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y0<List<b>> f31409b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$e$a;", "Landroidx/lifecycle/x1$c;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$b;", "activityFeedTypes", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements x1.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b f31410a;

            public a(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVar) {
                bVar.getClass();
                this.f31410a = bVar;
            }

            @Override // androidx.lifecycle.x1.c
            public final <T extends u1> T create(Class<T> cls) {
                cls.getClass();
                return new e(this.f31410a);
            }
        }

        public e(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVar) {
            bVar.getClass();
            this.f31408a = bVar;
            this.f31409b = new y0<>(j0.f134944a);
            List<x0> list = bVar.f31475c;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (x0 x0Var : list) {
                arrayList.add(new b(x0Var, this.f31408a.f31476d.contains(x0Var)));
            }
            this.f31409b.j(arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$f", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends s {
        public f() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            f(false);
            GroupActivityFeedTypeSubTypeSelectionFragment groupActivityFeedTypeSubTypeSelectionFragment = GroupActivityFeedTypeSubTypeSelectionFragment.this;
            e eVar = groupActivityFeedTypeSubTypeSelectionFragment.f31401d;
            if (eVar != null) {
                t1.a(eVar.f31409b, new r(1)).f(groupActivityFeedTypeSubTypeSelectionFragment.getViewLifecycleOwner(), new h(new j10.c(groupActivityFeedTypeSubTypeSelectionFragment, 1)));
            } else {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends q implements l<b, Unit> {
        public g(Object obj) {
            super(1, obj, e.class, "onSubTypeClicked", "onSubTypeClicked(Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$SubTypeData;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(b bVar) {
            Object next;
            b bVar2 = bVar;
            bVar2.getClass();
            e eVar = (e) this.receiver;
            eVar.getClass();
            x0 x0Var = bVar2.f31403a;
            y0<List<b>> y0Var = eVar.f31409b;
            List<b> listD = y0Var.d();
            if (listD == null) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "GroupActivityFeedTypeSubTypeSelectionFragment", "SubTypeData list should not be null!!");
            } else {
                Iterator<T> it = listD.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((b) next).f31403a != x0Var);
                b bVar3 = (b) next;
                if (bVar3 == null) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var2, "GroupActivityFeedTypeSubTypeSelectionFragment", "Did not find SubTypeData with type: " + x0Var);
                } else {
                    int iIndexOf = listD.indexOf(bVar3);
                    b bVar4 = new b(bVar3.f31403a, !bVar3.f31404b);
                    ArrayList arrayList = new ArrayList(listD);
                    arrayList.set(iIndexOf, bVar4);
                    y0Var.j(arrayList);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f31412a;

        public h(l lVar) {
            lVar.getClass();
            this.f31412a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f31412a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31412a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f31413a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f31413a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31413a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f31415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e23.a aVar, Fragment fragment) {
            super(0);
            this.f31414a = aVar;
            this.f31415b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31414a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31415b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f31416a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f31416a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f31416a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setHasFixedSize(true);
        this.f31398a = recyclerView;
        return recyclerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        f fVar = this.f31402e;
        onBackPressedDispatcher.b(fVar, viewLifecycleOwner);
        com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVarU6 = u6();
        if (bVarU6 == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "GroupActivityFeedTypeSubTypeSelectionFragment", "ActivityFeedType should not be null");
            fVar.b();
            return;
        }
        this.f31401d = (e) new x1(this, new e.a(bVarU6)).b(s0.f105811a.b(e.class));
        c cVar = new c();
        e eVar = this.f31401d;
        if (eVar == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        d dVar = new d(cVar, new g(eVar));
        this.f31399b = dVar;
        RecyclerView recyclerView = this.f31398a;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setAdapter(dVar);
        e eVar2 = this.f31401d;
        if (eVar2 == null) {
            p005kotlin.jvm.internal.s.m("viewModel");
            throw null;
        }
        y0<List<b>> y0Var = eVar2.f31409b;
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        dh.b.L(y0Var, viewLifecycleOwner2, new h(new j10.c(this, 0)));
    }

    public final com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b u6() {
        Parcelable parcelable;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) arguments.getParcelable("param_sub_type", com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b.class);
        } else {
            Parcelable parcelable2 = arguments.getParcelable("param_sub_type");
            parcelable = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) (parcelable2 instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b ? parcelable2 : null);
        }
        return (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) parcelable;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$d;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$b;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$d$a;", "Landroidx/recyclerview/widget/o$f;", "callback", "Lkotlin/Function1;", "", "onTypeClicked", "<init>", "(Landroidx/recyclerview/widget/o$f;Le23/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends x<b, a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<b, Unit> f31405b;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$d$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton;", "button", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeSubTypeSelectionFragment$b;", "", "onTypeClicked", "<init>", "(Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton;Le23/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends RecyclerView.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GCMComplexOneLineButton f31406a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l<b, Unit> f31407b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(GCMComplexOneLineButton gCMComplexOneLineButton, l<? super b, Unit> lVar) {
                super(gCMComplexOneLineButton);
                gCMComplexOneLineButton.getClass();
                lVar.getClass();
                this.f31406a = gCMComplexOneLineButton;
                this.f31407b = lVar;
            }

            public final void d(b bVar) {
                GCMComplexOneLineButton gCMComplexOneLineButton = this.f31406a;
                Context context = gCMComplexOneLineButton.getContext();
                context.getClass();
                String strA = dh.b.A(context, bVar.f31403a.f4360c);
                TextView textView = gCMComplexOneLineButton.f47762b;
                textView.setText(strA);
                textView.setContentDescription(strA);
                gCMComplexOneLineButton.f(bVar.f31404b);
                gCMComplexOneLineButton.setOnClickListener(new hx0.k(20, this, bVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(o.f<b> fVar, l<? super b, Unit> lVar) {
            super(fVar);
            fVar.getClass();
            lVar.getClass();
            this.f31405b = lVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List list) {
            a aVar = (a) f0Var;
            aVar.getClass();
            list.getClass();
            if (list.isEmpty()) {
                super.onBindViewHolder(aVar, i14, list);
                return;
            }
            b bVarR = r(i14);
            bVarR.getClass();
            aVar.d(bVarR);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            Drawable drawableMutate;
            viewGroup.getClass();
            Context context = viewGroup.getContext();
            context.getClass();
            GCMComplexOneLineButton gCMComplexOneLineButton = new GCMComplexOneLineButton(context, null, 0, 6, null);
            gCMComplexOneLineButton.setLayoutParams(new RecyclerView.q(-1, -2));
            gCMComplexOneLineButton.setRightElement(GCMComplexOneLineButton.a.NONE);
            Drawable drawableA = j.a.a(gCMComplexOneLineButton.getContext(), R.drawable.check);
            if (drawableA != null) {
                drawableMutate = drawableA.mutate();
                drawableMutate.setTint(gCMComplexOneLineButton.getContext().getColor(R.color.gcm_system_primary_action));
            } else {
                drawableMutate = null;
            }
            gCMComplexOneLineButton.c(drawableMutate, Float.valueOf(16.0f));
            return new a(gCMComplexOneLineButton, this.f31405b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            a aVar = (a) f0Var;
            aVar.getClass();
            b bVarR = r(i14);
            bVarR.getClass();
            aVar.d(bVarR);
        }
    }
}
