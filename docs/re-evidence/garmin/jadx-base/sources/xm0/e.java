package xm0;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o53.b0;
import o53.f0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lxm0/e;", "Landroidx/fragment/app/Fragment;", "Lk32/d;", "Lxm0/d;", "<init>", "()V", "c", "b", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment implements k32.d<xm0.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f191353i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f191354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f191355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f191356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f191357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f191358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f191359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k32.c<xm0.d> f191360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewPager2 f191361h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxm0/e$b;", "Landroidx/recyclerview/widget/o$b;", "", "Lj10/d;", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.recyclerview.widget.o.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<j10.d> f191362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<j10.d> f191363b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends j10.d> list, List<? extends j10.d> list2) {
            list.getClass();
            list2.getClass();
            this.f191362a = list;
            this.f191363b = list2;
        }

        @Override // androidx.recyclerview.widget.o.b
        public final boolean a(int i14, int i15) {
            return b(i14, i15);
        }

        @Override // androidx.recyclerview.widget.o.b
        public final boolean b(int i14, int i15) {
            return this.f191362a.get(i14).ordinal() == this.f191363b.get(i15).ordinal();
        }

        @Override // androidx.recyclerview.widget.o.b
        /* JADX INFO: renamed from: d */
        public final int getF196150e() {
            return this.f191363b.size();
        }

        @Override // androidx.recyclerview.widget.o.b
        /* JADX INFO: renamed from: e */
        public final int getF196149d() {
            return this.f191362a.size();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxm0/e$c;", "Lhe/a;", "Landroidx/fragment/app/Fragment;", "fragment", "", "groupId", "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "<init>", "(Landroidx/fragment/app/Fragment;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends he.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f191364j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final DateTime f191365k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final DateTime f191366l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ArrayList f191367m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public v f191368n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final LinkedHashMap f191369o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, long j8, DateTime dateTime, DateTime dateTime2) {
            super(fragment);
            fragment.getClass();
            dateTime.getClass();
            dateTime2.getClass();
            this.f191364j = j8;
            this.f191365k = dateTime;
            this.f191366l = dateTime2;
            this.f191367m = new ArrayList();
            this.f191368n = v.ALL;
            this.f191369o = new LinkedHashMap();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f191367m.size();
        }

        @Override // he.a
        public final Fragment u(int i14) {
            xm0.i.a aVar = xm0.i.f191395n;
            j10.d dVar = (j10.d) this.f191367m.get(i14);
            v vVar = this.f191368n;
            aVar.getClass();
            dVar.getClass();
            DateTime dateTime = this.f191365k;
            dateTime.getClass();
            DateTime dateTime2 = this.f191366l;
            dateTime2.getClass();
            xm0.i iVar = new xm0.i();
            Bundle bundle = new Bundle();
            bundle.putLong("GCM_extra_connection_group_id", this.f191364j);
            bundle.putSerializable("GCM_extra_connection_group_leaderboard_type", dVar);
            bundle.putSerializable("GCM_extra_start_date", dateTime);
            bundle.putSerializable("GCM_extra_end_date", dateTime2);
            bundle.putSerializable("selected_leaderboard_relationship_type", vVar);
            iVar.setArguments(bundle);
            this.f191369o.put(Integer.valueOf(i14), iVar);
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupDetailLeaderboardListFragment$onViewCreated$1", f = "GroupDetailLeaderboardListFragment.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f191370a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupDetailLeaderboardListFragment$onViewCreated$1$1", f = "GroupDetailLeaderboardListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f191372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191373b;

            /* JADX INFO: renamed from: xm0.e$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupDetailLeaderboardListFragment$onViewCreated$1$1$1", f = "GroupDetailLeaderboardListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C3562a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e f191374a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3562a(e eVar, t13.d<? super C3562a> dVar) {
                    super(2, dVar);
                    this.f191374a = eVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C3562a(this.f191374a, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C3562a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    o13.r.b(obj);
                    e eVar = this.f191374a;
                    ViewPager2 viewPager2 = eVar.f191361h;
                    if (viewPager2 == null) {
                        p005kotlin.jvm.internal.s.m("viewPager");
                        throw null;
                    }
                    if (viewPager2.getAdapter() == null) {
                        ViewPager2 viewPager3 = eVar.f191361h;
                        if (viewPager3 == null) {
                            p005kotlin.jvm.internal.s.m("viewPager");
                            throw null;
                        }
                        c cVar = eVar.f191356c;
                        if (cVar == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        viewPager3.setAdapter(cVar);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupDetailLeaderboardListFragment$onViewCreated$1$1$2", f = "GroupDetailLeaderboardListFragment.kt", l = {64}, m = "invokeSuspend", v = 2)
            public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f191375a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f191376b;

                /* JADX INFO: renamed from: xm0.e$d$a$b$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                public static final class C3563a<T> implements r53.j {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ e f191377a;

                    public C3563a(e eVar) {
                        this.f191377a = eVar;
                    }

                    @Override // r53.j
                    public final Object emit(Object obj, t13.d dVar) {
                        v vVar = (v) obj;
                        c cVar = this.f191377a.f191356c;
                        if (cVar == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        vVar.getClass();
                        cVar.f191368n = vVar;
                        for (xm0.i iVar : h0.b1(cVar.f191369o.values())) {
                            p2 p2Var = iVar.I6().f191452e;
                            if (p2Var.getValue() != vVar) {
                                p2Var.k(null, vVar);
                            }
                            iVar.E6();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(e eVar, t13.d<? super b> dVar) {
                    super(2, dVar);
                    this.f191376b = eVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new b(this.f191376b, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to xm0.e$d$a$b for r5v1 'this'  t13.d
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // v13.a
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        u13.a r0 = u13.a.COROUTINE_SUSPENDED
                        int r1 = r5.f191375a
                        r2 = 0
                        r3 = 1
                        if (r1 == 0) goto L14
                        if (r1 == r3) goto L10
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        vb.h.z(r6)
                        return r2
                    L10:
                        o13.r.b(r6)
                        goto L35
                    L14:
                        o13.r.b(r6)
                        xm0.e$a r6 = xm0.e.f191353i
                        xm0.e r6 = r5.f191376b
                        androidx.lifecycle.w1 r1 = r6.f191355b
                        java.lang.Object r1 = r1.getValue()
                        xm0.z r1 = (xm0.z) r1
                        r53.b2 r1 = r1.f191489b
                        xm0.e$d$a$b$a r4 = new xm0.e$d$a$b$a
                        r4.<init>(r6)
                        r5.f191375a = r3
                        r53.o2<T> r6 = r1.f150540a
                        java.lang.Object r6 = r6.collect(r4, r5)
                        if (r6 != r0) goto L35
                        return r0
                    L35:
                        o2.c.f()
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: xm0.e.d.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f191373b = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f191373b, dVar);
                aVar.f191372a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b0 b0Var = (b0) this.f191372a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                e eVar = this.f191373b;
                ge1.b.T(b0Var, null, null, new C3562a(eVar, null), 3);
                ge1.b.T(b0Var, null, null, new b(eVar, null), 3);
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f191370a;
            if (i14 == 0) {
                o13.r.b(obj);
                e eVar = e.this;
                n0 viewLifecycleOwner = eVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.CREATED;
                a aVar2 = new a(eVar, null);
                this.f191370a = 1;
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

    /* JADX INFO: renamed from: xm0.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3564e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f191378a;

        public C3564e(e23.l lVar) {
            lVar.getClass();
            this.f191378a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f191378a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f191378a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191379a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f191379a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f191379a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f191380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f191381b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f191380a = aVar;
            this.f191381b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f191380a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f191381b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191382a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f191382a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f191382a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f191383a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar) {
            super(0);
            this.f191383a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f191383a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f191384a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(o13.l lVar) {
            super(0);
            this.f191384a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f191384a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f191385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f191386b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e23.a aVar, o13.l lVar) {
            super(0);
            this.f191385a = aVar;
            this.f191386b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f191385a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f191386b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class l extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f191387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f191388b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment, o13.l lVar) {
            super(0);
            this.f191387a = fragment;
            this.f191388b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f191388b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f191387a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public e() {
        super(R.layout.fragment_group_detail_leaderboard_list);
        t0 t0Var = s0.f105811a;
        this.f191354a = new w1(t0Var.b(mm0.e.class), new f(this), new h(this), new g(null, this));
        o13.l lVarA = o13.m.a(o13.n.NONE, new i(new wd.c(this, 29)));
        this.f191355b = new w1(t0Var.b(z.class), new j(lVarA), new l(this, lVarA), new k(null, lVarA));
    }

    @Override // k32.d
    public final void C(xm0.d dVar) {
        xm0.d dVar2 = dVar;
        dVar2.getClass();
        z zVar = (z) this.f191355b.getValue();
        j10.d dVar3 = dVar2.f191352b;
        dVar3.getClass();
        zVar.f191490c.j(dVar3);
    }

    @Override // k32.d
    public final void Z3(xm0.d dVar) {
        dVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        DateTime dateTimeNow;
        DateTime dateTimeNow2;
        Object serializable;
        Object serializable2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.chip_group_layout);
        viewFindViewById.getClass();
        View viewFindViewById2 = ((ViewGroup) viewFindViewById).findViewById(R.id.chip_container_layout);
        viewFindViewById2.getClass();
        this.f191357d = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.leaderboard_list_sub_view_pager);
        viewFindViewById3.getClass();
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById3;
        this.f191361h = viewPager2;
        viewPager2.setUserInputEnabled(false);
        Bundle arguments = getArguments();
        long j8 = arguments != null ? arguments.getLong("GCM_extra_connection_group_id") : -1L;
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            dateTimeNow = DateTime.now();
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = arguments2.getSerializable("GCM_extra_start_date", DateTime.class);
            } else {
                Object serializable3 = arguments2.getSerializable("GCM_extra_start_date");
                if (!(serializable3 instanceof DateTime)) {
                    serializable3 = null;
                }
                serializable2 = (DateTime) serializable3;
            }
            dateTimeNow = (DateTime) serializable2;
            if (dateTimeNow == null) {
                dateTimeNow = DateTime.now();
            }
        }
        DateTime dateTime = dateTimeNow;
        dateTime.getClass();
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            dateTimeNow2 = DateTime.now();
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments3.getSerializable("GCM_extra_end_date", DateTime.class);
            } else {
                Object serializable4 = arguments3.getSerializable("GCM_extra_end_date");
                if (!(serializable4 instanceof DateTime)) {
                    serializable4 = null;
                }
                serializable = (DateTime) serializable4;
            }
            dateTimeNow2 = (DateTime) serializable;
            if (dateTimeNow2 == null) {
                dateTimeNow2 = DateTime.now();
            }
        }
        DateTime dateTime2 = dateTimeNow2;
        dateTime2.getClass();
        this.f191356c = new c(this, j8, dateTime, dateTime2);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new d(null), 3);
        w1 w1Var = this.f191354a;
        l2<GroupDetailsDTO> l2Var = ((mm0.e) w1Var.getValue()).f119514j;
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        dh.b.L(l2Var, viewLifecycleOwner2, new C3564e(new xa2.g(this, 11)));
        GroupDetailsDTO groupDetailsDTO = ((mm0.e) w1Var.getValue()).f119507c;
        if (groupDetailsDTO != null) {
            v6(groupDetailsDTO);
            u6();
        }
        z zVar = (z) this.f191355b.getValue();
        n0 viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        dh.b.L(zVar.f191490c, viewLifecycleOwner3, new xm0.f(this));
    }

    public final void u6() {
        Button button;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.spacing_normal);
        LinearLayout linearLayout = this.f191357d;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("chipContainerLayout");
            throw null;
        }
        linearLayout.removeAllViews();
        ArrayList arrayList = this.f191358e;
        if (arrayList == null) {
            p005kotlin.jvm.internal.s.m("allChipTypes");
            throw null;
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            xm0.d dVar = (xm0.d) obj;
            boolean z14 = i14 == 0;
            LayoutInflater layoutInflater = getLayoutInflater();
            LinearLayout linearLayout2 = this.f191357d;
            if (linearLayout2 == null) {
                p005kotlin.jvm.internal.s.m("chipContainerLayout");
                throw null;
            }
            View viewInflate = layoutInflater.inflate(R.layout.view_display_chip, (ViewGroup) linearLayout2, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.getClass();
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(z14 ? 0 : dimensionPixelSize);
            LinearLayout linearLayout3 = this.f191357d;
            if (linearLayout3 == null) {
                p005kotlin.jvm.internal.s.m("chipContainerLayout");
                throw null;
            }
            linearLayout3.addView(viewInflate);
            k32.e eVar = new k32.e(viewInflate, dVar, false, 4, null);
            eVar.d(dVar.f191351a);
            arrayList2.add(eVar);
            i14 = i15;
        }
        k32.c<xm0.d> cVar = new k32.c<>(arrayList2, this, new l32.d());
        k32.e eVar2 = (k32.e) h0.e0(0, cVar.f102673a);
        if (eVar2 != null && (button = eVar2.f102679d) != null) {
            button.performClick();
        }
        this.f191360g = cVar;
    }

    public final void v6(GroupDetailsDTO groupDetailsDTO) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = groupDetailsDTO.f31575r;
        arrayList3.getClass();
        Iterator it = arrayList3.iterator();
        while (true) {
            xm0.d dVar = null;
            if (!it.hasNext()) {
                break;
            }
            j10.d dVar2 = (j10.d) it.next();
            xm0.d.a aVar = xm0.d.f191349c;
            dVar2.getClass();
            aVar.getClass();
            for (xm0.d dVar3 : xm0.d.values()) {
                if (dVar2 == dVar3.f191352b) {
                    dVar = dVar3;
                    break;
                }
            }
            if (dVar != null) {
                arrayList.add(dVar);
                arrayList2.add(dVar2);
            }
        }
        this.f191358e = arrayList;
        this.f191359f = arrayList2;
        c cVar = this.f191356c;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        ArrayList arrayList4 = cVar.f191367m;
        androidx.recyclerview.widget.o.e eVarA = androidx.recyclerview.widget.o.a(new b(arrayList4, arrayList2));
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        eVarA.b(new androidx.recyclerview.widget.b(cVar));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxm0/e$a;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
