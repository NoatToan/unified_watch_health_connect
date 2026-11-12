package zu1;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import fw.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import vu1.o;
import wd2.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzu1/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f207093e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f207094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f207095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wu1.f f207096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f207097d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207098a;

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
            f207098a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f207099a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f207099a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f207099a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f207100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f207101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f207100a = aVar;
            this.f207101b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f207100a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f207101b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: zu1.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C3862e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f207102a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3862e(Fragment fragment) {
            super(0);
            this.f207102a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f207102a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public e() {
        super(R.layout.fbt_plan_overview_frag);
        this.f207094a = new w1(s0.f105811a.b(o.class), new c(this), new C3862e(this), new d(null, this));
        this.f207097d = new h0(this, 22);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.simple_recycler_view);
        viewFindViewById.getClass();
        this.f207095b = (RecyclerView) viewFindViewById;
        m activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView = this.f207095b;
            if (recyclerView == null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(activity));
            wu1.f fVar = new wu1.f(activity);
            this.f207096c = fVar;
            RecyclerView recyclerView2 = this.f207095b;
            if (recyclerView2 == null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView2.setAdapter(fVar);
            wu1.f fVar2 = this.f207096c;
            if (fVar2 != null) {
                fVar2.A(null);
            }
        }
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(new f(), getViewLifecycleOwner(), b0.b.RESUMED);
        ((o) this.f207094a.getValue()).P0.f(getViewLifecycleOwner(), this.f207097d);
        m activity2 = getActivity();
        activity2.getClass();
        FBTDashBoardActivity fBTDashBoardActivity = (FBTDashBoardActivity) activity2;
        fBTDashBoardActivity.setTitle(R.string.lbl_plan_overview);
        fBTDashBoardActivity.focusTitle();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzu1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
