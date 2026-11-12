package com.garmin.android.apps.connectmobile.group.details.invite;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.model.ConnectionDTO;
import com.garmin.android.apps.connectmobile.d0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import fw.p;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import r22.i0;
import ty1.o;
import vc0.v;
import vm0.k;
import vm0.q;
import vm0.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/invite/b;", "Lcom/garmin/android/apps/connectmobile/d0;", "Lcom/garmin/android/apps/connectmobile/group/details/invite/d$a;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends d0 implements com.garmin.android.apps.connectmobile.group.details.invite.d.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f36368o = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w1 f36369m = new w1(s0.f105811a.b(k.class), new f(this), new h(this), new g(null, this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f36370n = m.b(new v(this, 10));

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.invite.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0643b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36371a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36371a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/group/details/invite/b$c", "Lr22/i0;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends i0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f36372f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.p pVar, int i14, b bVar) {
            super(pVar, i14);
            this.f36372f = bVar;
        }

        @Override // r22.i0
        public final void a(int i14) {
            this.f36372f.T6(false);
        }

        @Override // r22.i0
        public final void b(int i14, int i15) {
            b bVar = this.f36372f;
            bVar.c7();
            bVar.f7(i14, i15);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/group/details/invite/b$d", "", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f36374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vm0.e f36375c;

        public d(int i14, vm0.e eVar) {
            this.f36374b = i14;
            this.f36375c = eVar;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36376a;

        public e(l lVar) {
            lVar.getClass();
            this.f36376a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f36376a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36376a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36377a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f36377a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36377a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f36379b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f36378a = aVar;
            this.f36379b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36378a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36379b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36380a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f36380a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36380a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        V6();
        f7(1, this.f33123k.f149678c);
    }

    @Override // com.garmin.android.apps.connectmobile.group.details.invite.d.a
    public final void F3(int i14, vm0.e eVar) {
        String string;
        wm0.a aVar;
        if (((eVar == null || (aVar = eVar.f178751g) == null) ? null : aVar.getInviteStatus()) != wm0.b.DECLINED) {
            if ((eVar != null ? eVar.f178754j : null) != null) {
                Long l14 = eVar.f178754j;
                k kVarE7 = e7();
                long jLongValue = l14.longValue();
                x53.c cVar = o53.s0.f129406a;
                j jVarA = androidx.lifecycle.m.a(x53.b.f189152a, new r(kVarE7, jLongValue, null), 2);
                n0 viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                dh.b.L(jVarA, viewLifecycleOwner, new e(new vm0.g(this, i14, eVar, 0)));
                return;
            }
            return;
        }
        DateTime dateTimeG = eVar.f178751g.getUpdateDate();
        int iA = 30;
        if (dateTimeG != null) {
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            iA = 30 - g22.k.a(dateTimeNow, dateTimeG);
            String strH = am.j.h(iA, "Passed days from invitation: ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.k(a2Var, "GroupInviteSearchListFragment", strH);
        }
        if (iA != 0) {
            string = iA != 1 ? getString(R.string.lbl_invitation_declined_message_2, Integer.valueOf(iA)) : getString(R.string.lbl_invitation_declined_message_tomorrow);
        } else {
            string = getString(R.string.lbl_invitation_declined_message_less_than_1_day);
        }
        string.getClass();
        new androidx.appcompat.app.e.a(requireContext()).setTitle(R.string.lbl_invitation_declined_title).setMessage(string).setPositiveButton(R.string.lbl_ok, new o(25)).show();
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final d0.a I6() {
        return d7();
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final i0 J6(RecyclerView.p pVar, int i14) {
        return new c(pVar, i14, this);
    }

    @Override // com.garmin.android.apps.connectmobile.group.details.invite.d.a
    public final void K0(int i14, vm0.e eVar) {
        vm0.b bVar = new vm0.b();
        bVar.f178737a = new d(i14, eVar);
        bVar.show(getParentFragmentManager(), "GroupInviteSearchListFragment");
    }

    @Override // com.garmin.android.apps.connectmobile.group.details.invite.d.a
    public final void L2(int i14, vm0.e eVar) {
        wm0.c cVar = eVar.f178752h;
        if (cVar == null) {
            return;
        }
        k kVarE7 = e7();
        ConnectionDTO connectionDTO = eVar.f178749e;
        x53.c cVar2 = o53.s0.f129406a;
        j jVarA = androidx.lifecycle.m.a(x53.b.f189152a, new vm0.l(kVarE7, connectionDTO, cVar, null), 2);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new e(new vm0.g(this, i14, eVar, 1)));
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final CharSequence M6() {
        String str = e7().f178776c;
        if (str == null || str.length() < 2) {
            String string = getString(R.string.search_keyword_too_short_with_chars_count_limitation, 2);
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.social_group_search_empty_message);
        string2.getClass();
        return string2;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final int S6() {
        return 15;
    }

    public final com.garmin.android.apps.connectmobile.group.details.invite.a d7() {
        return (com.garmin.android.apps.connectmobile.group.details.invite.a) this.f36370n.getValue();
    }

    public final k e7() {
        return (k) this.f36369m.getValue();
    }

    public final void f7(int i14, int i15) {
        k kVarE7 = e7();
        x53.c cVar = o53.s0.f129406a;
        j jVarA = androidx.lifecycle.m.a(x53.b.f189152a, new vm0.s(kVarE7, i14, i15, null), 2);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new e(new ap.b(i14, this, 17)));
    }

    @Override // com.garmin.android.apps.connectmobile.group.details.invite.d.a
    public final void n2(vm0.e eVar) {
        if (eVar == null) {
            g22.e.a(this, null);
            return;
        }
        jm0.b bVar = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String str = eVar.f178755k;
        if (str == null) {
            return;
        }
        startActivity(bVar.d(contextRequireContext, str, eVar.f178746b, eVar.f178745a));
    }

    @Override // com.garmin.android.apps.connectmobile.d0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.fragment_group_invite);
    }

    @Override // com.garmin.android.apps.connectmobile.d0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        final int i14 = 0;
        F6(false);
        final k kVarE7 = e7();
        final w0 w0Var = new w0();
        x53.c cVar = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        final int i15 = 2;
        w0Var.n(androidx.lifecycle.m.a(bVar, new vm0.n(kVarE7, null), 2), new k.b(new l() { // from class: vm0.j
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i14;
                k kVar = kVarE7;
                w0 w0Var2 = w0Var;
                g3 g3Var = (g3) obj;
                switch (i16) {
                    case 0:
                        int i17 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    case 1:
                        int i18 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    case 2:
                        int i19 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    default:
                        int i24 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i16 = 1;
        w0Var.n(androidx.lifecycle.m.a(bVar, new vm0.o(kVarE7, null), 2), new k.b(new l() { // from class: vm0.j
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                k kVar = kVarE7;
                w0 w0Var2 = w0Var;
                g3 g3Var = (g3) obj;
                switch (i17) {
                    case 0:
                        int i18 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    case 1:
                        int i19 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    case 2:
                        int i110 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    default:
                        int i24 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        w0Var.n(androidx.lifecycle.m.a(bVar, new q(kVarE7, null), 2), new k.b(new l() { // from class: vm0.j
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i15;
                k kVar = kVarE7;
                w0 w0Var2 = w0Var;
                g3 g3Var = (g3) obj;
                switch (i17) {
                    case 0:
                        int i18 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    case 1:
                        int i19 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    case 2:
                        int i110 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    default:
                        int i24 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i17 = 3;
        w0Var.n(androidx.lifecycle.m.a(bVar, new vm0.p(kVarE7, null), 2), new k.b(new l() { // from class: vm0.j
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                k kVar = kVarE7;
                w0 w0Var2 = w0Var;
                g3 g3Var = (g3) obj;
                switch (i18) {
                    case 0:
                        int i19 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    case 1:
                        int i110 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    case 2:
                        int i111 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                    default:
                        int i24 = k.f178773i;
                        if (g3Var.f35300a == fw.p.LOADING) {
                            w0Var2.j(g3.a.c(g3.f35298f));
                        } else if (kVar.x4()) {
                            w0Var2.j(g3.a.e(g3.f35298f));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        w0Var.f(getViewLifecycleOwner(), new e(new l(this) { // from class: vm0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.invite.b f178757b;

            {
                this.f178757b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i16;
                com.garmin.android.apps.connectmobile.group.details.invite.b bVar2 = this.f178757b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                        bVar2.M7();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar2 = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                        if (com.garmin.android.apps.connectmobile.group.details.invite.b.C0643b.f36371a[((g3) obj).f35300a.ordinal()] == 3) {
                            g22.e.l(bVar2);
                        } else {
                            g22.e.f(bVar2);
                            bVar2.Y6(false);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        y0<Unit> y0Var = e7().f178774a;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new e(new l(this) { // from class: vm0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.invite.b f178757b;

            {
                this.f178757b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i14;
                com.garmin.android.apps.connectmobile.group.details.invite.b bVar2 = this.f178757b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                        bVar2.M7();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar2 = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                        if (com.garmin.android.apps.connectmobile.group.details.invite.b.C0643b.f36371a[((g3) obj).f35300a.ordinal()] == 3) {
                            g22.e.l(bVar2);
                        } else {
                            g22.e.f(bVar2);
                            bVar2.Y6(false);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/invite/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_SEARCH_KEYWORD", "", "DEFAULT_WAITING_DAYS", "I", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
