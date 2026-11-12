package xm0;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupLeaderboardLoadingView;
import com.garmin.android.apps.connectmobile.m0;
import o53.b0;
import o53.f0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import yc.a1;
import yc.g3;
import yc.v2;
import yc.x2;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002"}, d2 = {"Lxm0/i;", "Lcom/garmin/android/apps/connectmobile/m0;", "Lxm0/y$a;", "<init>", "()V", "b", "c", "a", "Lxm0/v;", "selectedRelationshipType", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends m0 implements y.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f191395n = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f191396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f191397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o13.t f191398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ComposeView f191399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GroupLeaderboardLoadingView f191400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f191401m;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxm0/i$b;", "Lyc/x2;", "Lxm0/k;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lxm0/y$a;", "callback", "<init>", "(Lxm0/y$a;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends x2<k, RecyclerView.f0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y.a f191402d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y.a aVar) {
            super(new k.b(), (t13.g) null, (t13.g) null, 6, (p005kotlin.jvm.internal.j) null);
            aVar.getClass();
            this.f191402d = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            k kVarT;
            f0Var.getClass();
            if (!(f0Var instanceof y) || (kVarT = t(i14)) == null) {
                return;
            }
            y yVar = (y) f0Var;
            yVar.f191486b.setVisibility(8);
            ComposeView composeView = yVar.f191487c;
            composeView.setVisibility(0);
            composeView.setContent(new z3.e(1523130420, true, new x(kVarT, yVar, 0)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            y.f191484d.getClass();
            y.a aVar = this.f191402d;
            aVar.getClass();
            return new y(n23.j.b(viewGroup, R.layout.item_leaderboard, viewGroup, false), aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxm0/i$c;", "Lyc/a1;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a1<RecyclerView.f0> {
        @Override // yc.a1
        public final void t(RecyclerView.f0 f0Var, z0 z0Var) {
            z0Var.getClass();
        }

        @Override // yc.a1
        public final RecyclerView.f0 u(ViewGroup viewGroup, z0 z0Var) {
            z0Var.getClass();
            t.f191466a.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_leaderboard_placeholder_list_item, viewGroup, false);
            viewInflate.getClass();
            return new t(viewInflate);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupDetailLeaderboardListSubFragment$onViewCreated$2", f = "GroupDetailLeaderboardListSubFragment.kt", l = {109}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f191403a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupDetailLeaderboardListSubFragment$onViewCreated$2$1", f = "GroupDetailLeaderboardListSubFragment.kt", l = {111}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f191405a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f191406b;

            /* JADX INFO: renamed from: xm0.i$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3565a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f191407a;

                public C3565a(i iVar) {
                    this.f191407a = iVar;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    a aVar = i.f191395n;
                    Object objX = ((b) this.f191407a.f191398j.getValue()).x((v2) obj, dVar);
                    return objX == u13.a.COROUTINE_SUSPENDED ? objX : Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f191406b = iVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f191406b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f191405a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    a aVar2 = i.f191395n;
                    i iVar = this.f191406b;
                    iVar.I6().f191454g.clear();
                    p pVarI6 = iVar.I6();
                    s53.k kVarN = r53.s.N(pVarI6.f191452e, new q(null, pVarI6));
                    C3565a c3565a = new C3565a(iVar);
                    this.f191405a = 1;
                    if (kVarN.collect(c3565a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f191403a;
            if (i14 == 0) {
                o13.r.b(obj);
                i iVar = i.this;
                n0 viewLifecycleOwner = iVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.CREATED;
                a aVar2 = new a(iVar, null);
                this.f191403a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191408a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f191408a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f191408a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f191409a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar) {
            super(0);
            this.f191409a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f191409a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f191410a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o13.l lVar) {
            super(0);
            this.f191410a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f191410a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f191411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f191412b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, o13.l lVar) {
            super(0);
            this.f191411a = aVar;
            this.f191412b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f191411a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f191412b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    public i() {
        final int i14 = 0;
        e23.a aVar = new e23.a(this) { // from class: xm0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f191391b;

            {
                this.f191391b = this;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0045  */
            /* JADX WARN: Code duplicated, block: B:33:0x006c  */
            /* JADX WARN: Code duplicated, block: B:45:0x0093  */
            @Override // e23.a
            public final Object invoke() {
                DateTime dateTimeNow;
                DateTime dateTimeNow2;
                j10.d dVar;
                v vVar;
                Object serializable;
                Object serializable2;
                Object serializable3;
                Object serializable4;
                int i15 = i14;
                i iVar = this.f191391b;
                switch (i15) {
                    case 0:
                        i.a aVar2 = i.f191395n;
                        Bundle arguments = iVar.getArguments();
                        long j8 = arguments != null ? arguments.getLong("GCM_extra_connection_group_id") : -1L;
                        Bundle arguments2 = iVar.getArguments();
                        if (arguments2 == null) {
                            dateTimeNow = DateTime.now();
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable4 = arguments2.getSerializable("GCM_extra_start_date", DateTime.class);
                            } else {
                                Object serializable5 = arguments2.getSerializable("GCM_extra_start_date");
                                if (!(serializable5 instanceof DateTime)) {
                                    serializable5 = null;
                                }
                                serializable4 = (DateTime) serializable5;
                            }
                            dateTimeNow = (DateTime) serializable4;
                            if (dateTimeNow == null) {
                                dateTimeNow = DateTime.now();
                            }
                        }
                        dateTimeNow.getClass();
                        Bundle arguments3 = iVar.getArguments();
                        if (arguments3 == null) {
                            dateTimeNow2 = DateTime.now();
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = arguments3.getSerializable("GCM_extra_end_date", DateTime.class);
                            } else {
                                Object serializable6 = arguments3.getSerializable("GCM_extra_end_date");
                                if (!(serializable6 instanceof DateTime)) {
                                    serializable6 = null;
                                }
                                serializable3 = (DateTime) serializable6;
                            }
                            dateTimeNow2 = (DateTime) serializable3;
                            if (dateTimeNow2 == null) {
                                dateTimeNow2 = DateTime.now();
                            }
                        }
                        dateTimeNow2.getClass();
                        Bundle arguments4 = iVar.getArguments();
                        if (arguments4 == null) {
                            dVar = j10.d.TOTAL_STEPS;
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = arguments4.getSerializable("GCM_extra_connection_group_leaderboard_type", j10.d.class);
                            } else {
                                Object serializable7 = arguments4.getSerializable("GCM_extra_connection_group_leaderboard_type");
                                if (!(serializable7 instanceof j10.d)) {
                                    serializable7 = null;
                                }
                                serializable2 = (j10.d) serializable7;
                            }
                            dVar = (j10.d) serializable2;
                            if (dVar == null) {
                                dVar = j10.d.TOTAL_STEPS;
                            }
                        }
                        Bundle arguments5 = iVar.getArguments();
                        if (arguments5 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = arguments5.getSerializable("selected_leaderboard_relationship_type", v.class);
                            } else {
                                Object serializable8 = arguments5.getSerializable("selected_leaderboard_relationship_type");
                                if (!(serializable8 instanceof v)) {
                                    serializable8 = null;
                                }
                                serializable = (v) serializable8;
                            }
                            vVar = (v) serializable;
                        } else {
                            vVar = null;
                        }
                        return new s(j8, dateTimeNow, dateTimeNow2, dVar, vVar != null ? vVar : null);
                    default:
                        i.a aVar3 = i.f191395n;
                        return new i.b(iVar);
                }
            }
        };
        o13.l lVarA = o13.m.a(o13.n.NONE, new f(new e(this)));
        this.f191396h = new w1(s0.f105811a.b(p.class), new g(lVarA), aVar, new h(null, lVarA));
        final int i15 = 1;
        this.f191398j = o13.m.b(new e23.a(this) { // from class: xm0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f191391b;

            {
                this.f191391b = this;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0045  */
            /* JADX WARN: Code duplicated, block: B:33:0x006c  */
            /* JADX WARN: Code duplicated, block: B:45:0x0093  */
            @Override // e23.a
            public final Object invoke() {
                DateTime dateTimeNow;
                DateTime dateTimeNow2;
                j10.d dVar;
                v vVar;
                Object serializable;
                Object serializable2;
                Object serializable3;
                Object serializable4;
                int i16 = i15;
                i iVar = this.f191391b;
                switch (i16) {
                    case 0:
                        i.a aVar2 = i.f191395n;
                        Bundle arguments = iVar.getArguments();
                        long j8 = arguments != null ? arguments.getLong("GCM_extra_connection_group_id") : -1L;
                        Bundle arguments2 = iVar.getArguments();
                        if (arguments2 == null) {
                            dateTimeNow = DateTime.now();
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable4 = arguments2.getSerializable("GCM_extra_start_date", DateTime.class);
                            } else {
                                Object serializable5 = arguments2.getSerializable("GCM_extra_start_date");
                                if (!(serializable5 instanceof DateTime)) {
                                    serializable5 = null;
                                }
                                serializable4 = (DateTime) serializable5;
                            }
                            dateTimeNow = (DateTime) serializable4;
                            if (dateTimeNow == null) {
                                dateTimeNow = DateTime.now();
                            }
                        }
                        dateTimeNow.getClass();
                        Bundle arguments3 = iVar.getArguments();
                        if (arguments3 == null) {
                            dateTimeNow2 = DateTime.now();
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable3 = arguments3.getSerializable("GCM_extra_end_date", DateTime.class);
                            } else {
                                Object serializable6 = arguments3.getSerializable("GCM_extra_end_date");
                                if (!(serializable6 instanceof DateTime)) {
                                    serializable6 = null;
                                }
                                serializable3 = (DateTime) serializable6;
                            }
                            dateTimeNow2 = (DateTime) serializable3;
                            if (dateTimeNow2 == null) {
                                dateTimeNow2 = DateTime.now();
                            }
                        }
                        dateTimeNow2.getClass();
                        Bundle arguments4 = iVar.getArguments();
                        if (arguments4 == null) {
                            dVar = j10.d.TOTAL_STEPS;
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = arguments4.getSerializable("GCM_extra_connection_group_leaderboard_type", j10.d.class);
                            } else {
                                Object serializable7 = arguments4.getSerializable("GCM_extra_connection_group_leaderboard_type");
                                if (!(serializable7 instanceof j10.d)) {
                                    serializable7 = null;
                                }
                                serializable2 = (j10.d) serializable7;
                            }
                            dVar = (j10.d) serializable2;
                            if (dVar == null) {
                                dVar = j10.d.TOTAL_STEPS;
                            }
                        }
                        Bundle arguments5 = iVar.getArguments();
                        if (arguments5 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = arguments5.getSerializable("selected_leaderboard_relationship_type", v.class);
                            } else {
                                Object serializable8 = arguments5.getSerializable("selected_leaderboard_relationship_type");
                                if (!(serializable8 instanceof v)) {
                                    serializable8 = null;
                                }
                                serializable = (v) serializable8;
                            }
                            vVar = (v) serializable;
                        } else {
                            vVar = null;
                        }
                        return new s(j8, dateTimeNow, dateTimeNow2, dVar, vVar != null ? vVar : null);
                    default:
                        i.a aVar3 = i.f191395n;
                        return new i.b(iVar);
                }
            }
        });
        this.f191401m = true;
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        this.f191401m = true;
        I6().f191454g.clear();
        yc.f.e eVar = ((b) this.f191398j.getValue()).f196614b.f195910h;
        eVar.getClass();
        g3.f195987a.getClass();
        g3.a(3);
        eVar.f195738c.a();
    }

    public final p I6() {
        return (p) this.f191396h.getValue();
    }

    @Override // xm0.y.a
    public final void Q2(k kVar) {
        jm0.b bVar = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        startActivity(bVar.d(contextRequireContext, kVar.f191420d, kVar.f191418b, kVar.f191428l.f14387a));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.fragment_group_detail_leaderboard_list_sub);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.leaderboard_list_recycler_view);
        viewFindViewById.getClass();
        this.f191397i = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.leaderboard_empty_view);
        viewFindViewById2.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById2;
        this.f191399k = composeView;
        composeView.setContent(new z3.e(-1086663865, true, new vy0.e(this, 19)));
        ComposeView composeView2 = this.f191399k;
        if (composeView2 == null) {
            p005kotlin.jvm.internal.s.m("emptyView");
            throw null;
        }
        composeView2.setVisibility(8);
        View viewFindViewById3 = view2.findViewById(R.id.leaderboard_loading_view);
        viewFindViewById3.getClass();
        this.f191400l = (GroupLeaderboardLoadingView) viewFindViewById3;
        RecyclerView recyclerView = this.f191397i;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        o13.t tVar = this.f191398j;
        recyclerView.setAdapter(((b) tVar.getValue()).z(new c()));
        ((b) tVar.getValue()).r(new xa2.g(this, 12));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new d(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxm0/i$a;", "", "<init>", "()V", "", "GROUP_SELECTED_LEADERBOARD_RELATIONSHIP_TYPE", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
