package yv1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import fg0.k;
import fw.p;
import kotlin.w3;
import o13.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.o0;
import p3.p1;
import p3.p2;
import uu1.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002"}, d2 = {"Lyv1/b;", "Landroidx/fragment/app/Fragment;", "Lxv1/a;", "", TtmlNode.TAG_LAYOUT, "<init>", "(Ljava/lang/Integer;)V", "a", "Lfg0/k;", "eventDTO", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment implements xv1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f199840d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f199841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f199842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f199843c;

    /* JADX INFO: renamed from: yv1.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C3741b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199844a;

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
            f199844a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yv1/b$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            b bVar = b.this;
            bVar.f199843c.f(false);
            m activity = bVar.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f199846a;

        public d(l lVar) {
            lVar.getClass();
            this.f199846a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f199846a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f199846a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f199847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f199847a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f199847a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f199848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f199849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f199848a = aVar;
            this.f199849b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f199848a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f199849b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f199850a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f199850a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f199850a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b(Integer num) {
        super(num != null ? num.intValue() : R.layout.fbt_compose_fragment);
        this.f199841a = new w1(s0.f105811a.b(xv1.d.class), new e(this), new g(this), new f(null, this));
        this.f199843c = new c();
    }

    @Override // xv1.a
    public final void b0(k kVar, m52.c cVar) {
        zf0.c cVar2 = (zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        cVar2.h(mVarRequireActivity, kVar, cVar);
    }

    @Override // xv1.a
    public final void b6(k kVar) {
        zf0.c cVar = (zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        cVar.g(mVarRequireActivity, kVar, false, null, null, true);
    }

    @Override // xv1.a
    public final void d2(k kVar) {
        zf0.c cVar = (zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        cVar.i(mVarRequireActivity, kVar, false, null, null, true, false, null);
    }

    @Override // xv1.a
    public final void i5(String str, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar) {
        str.getClass();
        cVar.getClass();
        og0.a aVar = og0.a.f131967a;
        v parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        yt.f fVar = new yt.f(1, cVar, this);
        aVar.getClass();
        og0.a.E(parentFragmentManager, contextRequireContext, str, cVar, fVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.lbl_edit_goals));
        }
        m activity2 = getActivity();
        z1 z1Var = activity2 instanceof z1 ? (z1) activity2 : null;
        if (z1Var != null) {
            z1Var.updateActionBarNavigation(3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m mVarRequireActivity = requireActivity();
        yv1.c cVar = new yv1.c(this);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        mVarRequireActivity.addMenuProvider(cVar, viewLifecycleOwner);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        onBackPressedDispatcher.b(this.f199843c, viewLifecycleOwner2);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.compose_view);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-273668391, true, new yv1.a(this, 0, (byte) 0)));
        ((xv1.d) this.f199841a.getValue()).M4().f(getViewLifecycleOwner(), new d(new xa2.g(this, 29)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1279901203);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            w1 w1Var = this.f199841a;
            p1 p1VarC = s9.c.c(((xv1.d) w1Var.getValue()).P, o0VarE);
            k kVar = (k) p1VarC.getF182175a();
            if (!p005kotlin.jvm.internal.s.g(kVar != null ? kVar.getEventCustomization() : null, ((xv1.d) w1Var.getValue()).T)) {
                this.f199842b = true;
                m activity = getActivity();
                if (activity != null) {
                    activity.invalidateOptionsMenu();
                }
            }
            k kVar2 = (k) p1VarC.getF182175a();
            if (kVar2 == null) {
                o0VarE.C(1183230586);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1183230587);
                j.d(kVar2, this, o0VarE, ((i15 << 3) & 112) | k.X);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yv1.a(this, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyv1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
