package rm0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.e0;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import e23.l;
import java.util.ArrayList;
import lc.u0;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import qm0.a0;
import qm0.p;
import qm0.x;
import r22.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lrm0/d;", "Lqm0/d;", "Lxg0/o;", "Lxg0/n;", "Lxg0/a;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends qm0.d {
    public static final /* synthetic */ int X = 0;
    public final w1 I;
    public final t P;
    public q0 T;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153517a;

        static {
            int[] iArr = new int[s51.e.values().length];
            try {
                iArr[s51.e.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s51.e.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s51.e.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f153517a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f153518a;

        public c(l lVar) {
            lVar.getClass();
            this.f153518a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f153518a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f153518a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: rm0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C2906d extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f153519a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2906d(Fragment fragment) {
            super(0);
            this.f153519a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f153519a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f153520a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar) {
            super(0);
            this.f153520a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f153520a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f153521a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o13.l lVar) {
            super(0);
            this.f153521a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f153521a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f153522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f153523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, o13.l lVar) {
            super(0);
            this.f153522a = aVar;
            this.f153523b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f153522a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f153523b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f153524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f153525b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment, o13.l lVar) {
            super(0);
            this.f153524a = fragment;
            this.f153525b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f153525b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f153524a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static {
        new a(null);
    }

    public d() {
        o13.l lVarA = m.a(o13.n.NONE, new e(new C2906d(this)));
        this.I = new w1(s0.f105811a.b(rm0.g.class), new f(lVarA), new h(this, lVarA), new g(null, lVarA));
        this.P = m.b(new rm0.a(this, 0));
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        p7().E4();
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final s51.d<wg0.a> J6() {
        return (a0) this.P.getValue();
    }

    @Override // xg0.o
    public final void Q1(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final e0.b<String, wg0.a> U6() {
        return p7();
    }

    @Override // qm0.d
    public final p d7() {
        return p7();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    @Override // qm0.d
    public final void h7(View view2) {
        GroupDTO.c cVar;
        ArrayList arrayList;
        super.h7(view2);
        View viewFindViewById = view2.findViewById(R.id.empty_view);
        viewFindViewById.getClass();
        this.f145495z = (ComposeView) viewFindViewById;
        mm0.e eVarC7 = c7();
        jm0.e eVar = jm0.e.f99565a;
        GroupDetailsDTO groupDetailsDTO = eVarC7.f119507c;
        if (groupDetailsDTO == null || (cVar = groupDetailsDTO.f31578w) == null) {
            cVar = GroupDTO.c.NOT_DEFINED;
        }
        eVar.getClass();
        if (jm0.e.d(cVar)) {
            GroupDetailsDTO groupDetailsDTO2 = c7().f119507c;
            if ((groupDetailsDTO2 == null || (arrayList = groupDetailsDTO2.f31577v) == null) ? true : arrayList.isEmpty()) {
                e7().setContent(new z3.e(-1491345216, true, new rm0.b(this, 0)));
            } else {
                e7().setContent(new z3.e(-140590391, true, new rm0.b(this, 1)));
            }
        } else {
            e7().setContent(new z3.e(-140590391, true, new rm0.b(this, 1)));
        }
        e7().setVisibility(8);
    }

    @Override // qm0.d
    public final void j7() {
        final int i14 = 0;
        I6(new l(this) { // from class: rm0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f153516b;

            {
                this.f153516b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                yc.z0 z0Var = null;
                d dVar = this.f153516b;
                switch (i15) {
                    case 0:
                        yc.s sVar = (yc.s) obj;
                        int i16 = d.X;
                        sVar.getClass();
                        dVar.w6();
                        yc.z0 z0Var2 = sVar.f196385a;
                        if (!(z0Var2 instanceof yc.z0.b) || dVar.f34753o) {
                            uo1.d dVar2 = dVar.f145493x;
                            if (dVar2 == null) {
                                s.m("loadingView");
                                throw null;
                            }
                            dVar2.a();
                            dVar.w6();
                            ((a0) dVar.P.getValue()).f145476m = dVar.p7().f145529e.f171992c;
                            if (dVar.p7().f145529e.f171990a.isEmpty()) {
                                dVar.o7();
                            }
                            if (dVar.V6()) {
                                dVar.n7();
                            }
                            yc.z0 z0Var3 = sVar.f196386b;
                            if (z0Var3 instanceof yc.z0.a) {
                                z0Var = z0Var3;
                            } else if (z0Var2 instanceof yc.z0.a) {
                                z0Var = z0Var2;
                            } else {
                                yc.z0 z0Var4 = sVar.f196387c;
                                if (z0Var4 instanceof yc.z0.a) {
                                    z0Var = z0Var4;
                                }
                            }
                            if (z0Var != null) {
                                g22.e.c(dVar);
                            }
                        } else {
                            uo1.d dVar3 = dVar.f145493x;
                            if (dVar3 == null) {
                                s.m("loadingView");
                                throw null;
                            }
                            dVar3.animatorSet.start();
                            dVar3.setVisibility(0);
                            dVar.g7();
                        }
                        return Unit.INSTANCE;
                    default:
                        s51.e eVar = (s51.e) obj;
                        int i17 = d.X;
                        eVar.getClass();
                        int i18 = d.b.f153517a[eVar.ordinal()];
                        if (i18 != -1) {
                            if (i18 == 1) {
                                dVar.f7().setVisibility(0);
                            } else {
                                if (i18 != 2 && i18 != 3) {
                                    u0.r();
                                    return null;
                                }
                                dVar.f7().setVisibility(8);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        y0<s51.e> y0Var = p7().f145531g;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        final int i15 = 1;
        dh.b.L(y0Var, viewLifecycleOwner, new c(new l(this) { // from class: rm0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f153516b;

            {
                this.f153516b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                yc.z0 z0Var = null;
                d dVar = this.f153516b;
                switch (i16) {
                    case 0:
                        yc.s sVar = (yc.s) obj;
                        int i17 = d.X;
                        sVar.getClass();
                        dVar.w6();
                        yc.z0 z0Var2 = sVar.f196385a;
                        if (!(z0Var2 instanceof yc.z0.b) || dVar.f34753o) {
                            uo1.d dVar2 = dVar.f145493x;
                            if (dVar2 == null) {
                                s.m("loadingView");
                                throw null;
                            }
                            dVar2.a();
                            dVar.w6();
                            ((a0) dVar.P.getValue()).f145476m = dVar.p7().f145529e.f171992c;
                            if (dVar.p7().f145529e.f171990a.isEmpty()) {
                                dVar.o7();
                            }
                            if (dVar.V6()) {
                                dVar.n7();
                            }
                            yc.z0 z0Var3 = sVar.f196386b;
                            if (z0Var3 instanceof yc.z0.a) {
                                z0Var = z0Var3;
                            } else if (z0Var2 instanceof yc.z0.a) {
                                z0Var = z0Var2;
                            } else {
                                yc.z0 z0Var4 = sVar.f196387c;
                                if (z0Var4 instanceof yc.z0.a) {
                                    z0Var = z0Var4;
                                }
                            }
                            if (z0Var != null) {
                                g22.e.c(dVar);
                            }
                        } else {
                            uo1.d dVar3 = dVar.f145493x;
                            if (dVar3 == null) {
                                s.m("loadingView");
                                throw null;
                            }
                            dVar3.animatorSet.start();
                            dVar3.setVisibility(0);
                            dVar.g7();
                        }
                        return Unit.INSTANCE;
                    default:
                        s51.e eVar = (s51.e) obj;
                        int i18 = d.X;
                        eVar.getClass();
                        int i19 = d.b.f153517a[eVar.ordinal()];
                        if (i19 != -1) {
                            if (i19 == 1) {
                                dVar.f7().setVisibility(0);
                            } else {
                                if (i19 != 2 && i19 != 3) {
                                    u0.r();
                                    return null;
                                }
                                dVar.f7().setVisibility(8);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // qm0.d
    public final void m7(x.b bVar) {
        bVar.getClass();
        if (bVar != x.b.ACTIVITY_FEED) {
            return;
        }
        q0 q0Var = this.T;
        if (q0Var == null || !q0Var.isShown()) {
            this.T = null;
            q0.b bVar2 = q0.f149800b;
            View viewRequireView = requireView();
            viewRequireView.getClass();
            String string = getString(R.string.social_group_post_published);
            string.getClass();
            q0 q0VarC = q0.b.c(bVar2, viewRequireView, string, null, 12);
            this.T = q0VarC;
            String string2 = getString(R.string.social_group_view_post);
            string2.getClass();
            q0VarC.c(string2, new oq.a(this, 18));
            q0 q0Var2 = this.T;
            if (q0Var2 != null) {
                q0Var2.show();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.fragment_group_detail_activity_feed);
    }

    public final rm0.g p7() {
        return (rm0.g) this.I.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrm0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
