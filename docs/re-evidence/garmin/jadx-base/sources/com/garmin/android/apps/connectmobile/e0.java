package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yc.h3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004:\u0002\t\nB\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/e0;", "", "Key", "Item", "Lcom/garmin/android/apps/connectmobile/m0;", "", "isEnableHeaderOrFooter", "<init>", "(Z)V", "b", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e0<Key, Item> extends m0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f34745q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f34746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b<Key, Item> f34747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s51.d<Item> f34748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f34749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public yc.t2<Key, Item> f34750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public yc.s f34751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public yc.s f34752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f34753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f34754p;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/e0$b;", "", "Key", "Item", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b<Key, Item> extends androidx.lifecycle.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f34755a;

        public interface a {
            void a(boolean z14);
        }

        public abstract h3<Key, Item> x4(Context context);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.BasePagingRecyclerViewFragment$observeLivePagedList$1", f = "BasePagingRecyclerViewFragment.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.i<yc.v2<Item>> f34757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0<Key, Item> f34758c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e0<Key, Item> f34759a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.e0$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.BasePagingRecyclerViewFragment$observeLivePagedList$1$1$1", f = "BasePagingRecyclerViewFragment.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0589a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e0<Key, Item> f34760a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0589a(e0<Key, Item> e0Var, t13.d<? super C0589a> dVar) {
                    super(2, dVar);
                    this.f34760a = e0Var;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C0589a(this.f34760a, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C0589a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    o13.r.b(obj);
                    e0<Key, Item> e0Var = this.f34760a;
                    if (!e0Var.f34753o) {
                        RecyclerView recyclerView = e0Var.f34749k;
                        if (recyclerView == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView.smoothScrollToPosition(0);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.BasePagingRecyclerViewFragment$observeLivePagedList$1$1", f = "BasePagingRecyclerViewFragment.kt", l = {92, 93}, m = "emit", v = 2)
            public static final class b extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f34761a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f34762b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f34763c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(a<? super T> aVar, t13.d<? super b> dVar) {
                    super(dVar);
                    this.f34762b = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f34761a = obj;
                    this.f34763c |= Integer.MIN_VALUE;
                    return this.f34762b.emit(null, this);
                }
            }

            public a(e0<Key, Item> e0Var) {
                this.f34759a = e0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
            
                if (ge1.b.e0(r8, r9, r0) == r1) goto L23;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(yc.v2<Item> v2Var, t13.d<? super Unit> dVar) {
                b bVar;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i14 = bVar.f34763c;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        bVar.f34763c = i14 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, dVar);
                    }
                } else {
                    bVar = new b(this, dVar);
                }
                Object obj = bVar.f34761a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = bVar.f34763c;
                e0<Key, Item> e0Var = this.f34759a;
                if (i15 != 0) {
                    if (i15 == 1) {
                        o13.r.b(obj);
                    } else {
                        if (i15 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                s51.d<Item> dVar2 = e0Var.f34748j;
                if (dVar2 == null) {
                    p005kotlin.jvm.internal.s.m("pagedListAdapter");
                    throw null;
                }
                bVar.f34763c = 1;
                if (dVar2.x(v2Var, bVar) != aVar) {
                }
                return aVar;
                x53.c cVar = o53.s0.f129406a;
                o53.t1 t1Var = u53.o.f168762a;
                C0589a c0589a = new C0589a(e0Var, null);
                bVar.f34763c = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r53.i<yc.v2<Item>> iVar, e0<Key, Item> e0Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f34757b = iVar;
            this.f34758c = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f34757b, this.f34758c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34756a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(this.f34758c);
                this.f34756a = 1;
                if (this.f34757b.collect(aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/e0$d", "Lcom/garmin/android/apps/connectmobile/e0$b$a;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0<Key, Item> f34764a;

        public d(e0<Key, Item> e0Var) {
            this.f34764a = e0Var;
        }

        @Override // com.garmin.android.apps.connectmobile.e0.b.a
        public final void a(boolean z14) {
            e0<Key, Item> e0Var = this.f34764a;
            e0Var.f34753o = z14;
            s51.d<Item> dVar = e0Var.f34748j;
            if (dVar == null) {
                p005kotlin.jvm.internal.s.m("pagedListAdapter");
                throw null;
            }
            yc.f.e eVar = dVar.f196614b.f195910h;
            eVar.getClass();
            yc.g3.f195987a.getClass();
            yc.g3.a(3);
            eVar.f195738c.a();
        }
    }

    static {
        new a(null);
    }

    public e0(boolean z14) {
        this.f34746h = z14;
        this.f34754p = new d(this);
    }

    public final void I6(e23.l<? super yc.s, Unit> lVar) {
        s51.d<Item> dVar = this.f34748j;
        if (dVar != null) {
            dVar.r(new cn1.d(2, this, lVar));
        } else {
            p005kotlin.jvm.internal.s.m("pagedListAdapter");
            throw null;
        }
    }

    public abstract s51.d<Item> J6();

    public RecyclerView.p K6(Context context) {
        return new LinearLayoutManager(context);
    }

    public yc.u2 M6() {
        return new yc.u2(S6(), 0, false, 0, 0, 0, 62, null);
    }

    @Override // com.garmin.android.apps.connectmobile.m0, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void M7() {
        this.f34753o = false;
        E6();
    }

    public int S6() {
        return 10;
    }

    public final RecyclerView T6() {
        RecyclerView recyclerView = this.f34749k;
        if (recyclerView != null) {
            return recyclerView;
        }
        p005kotlin.jvm.internal.s.m("recyclerView");
        throw null;
    }

    public abstract b<Key, Item> U6();

    public final boolean V6() {
        yc.s sVar = this.f34751m;
        if (!((sVar != null ? sVar.f196385a : null) instanceof yc.z0.b)) {
            return false;
        }
        yc.s sVar2 = this.f34752n;
        return ((sVar2 != null ? sVar2.f196385a : null) instanceof yc.z0.c) && !this.f34753o;
    }

    public final void X6(Context context) {
        r53.a2 a2VarA;
        yc.t2<Key, Item> t2Var = this.f34750l;
        if (t2Var != null) {
            r53.i<yc.v2<Item>> iVar = t2Var.f196485a;
            b<Key, Item> bVar = this.f34747i;
            if (bVar == null) {
                p005kotlin.jvm.internal.s.m("pageKeyedViewModel");
                throw null;
            }
            a2VarA = yc.o.a(iVar, androidx.lifecycle.v1.a(bVar));
        } else {
            yc.t2<Key, Item> t2Var2 = new yc.t2<>(M6(), null, new ca0.j1(6, this, context), 2, null);
            this.f34750l = t2Var2;
            b<Key, Item> bVar2 = this.f34747i;
            if (bVar2 == null) {
                p005kotlin.jvm.internal.s.m("pageKeyedViewModel");
                throw null;
            }
            a2VarA = yc.o.a(t2Var2.f196485a, androidx.lifecycle.v1.a(bVar2));
        }
        androidx.lifecycle.i0 i0VarW = o53.f0.w(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new c(a2VarA, this, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b<Key, Item> bVarU6 = U6();
        this.f34747i = bVarU6;
        if (bVarU6 == null) {
            p005kotlin.jvm.internal.s.m("pageKeyedViewModel");
            throw null;
        }
        d dVar = this.f34754p;
        dVar.getClass();
        bVarU6.f34755a = dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.endless_scroll_recycler_view_fragment);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f34748j = J6();
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f34749k = recyclerView;
        Context context = view2.getContext();
        context.getClass();
        recyclerView.setLayoutManager(K6(context));
        RecyclerView recyclerView2 = this.f34749k;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        s51.d<Item> dVar = this.f34748j;
        if (this.f34746h) {
            if (dVar == null) {
                p005kotlin.jvm.internal.s.m("pagedListAdapter");
                throw null;
            }
            s51.d.a aVar = dVar.f157387h;
            s51.d.C2966d c2966d = dVar.f157386g;
            boolean z14 = dVar.f157383d;
            if (z14 && dVar.f157384e) {
                dVar.r(new rk0.g(17, c2966d, aVar));
                dVar = (s51.d<Item>) new androidx.recyclerview.widget.g((RecyclerView.h<? extends RecyclerView.f0>[]) new RecyclerView.h[]{dVar, c2966d, aVar});
            } else if (z14) {
                dVar = (s51.d<Item>) dVar.z(aVar);
            } else {
                dVar = dVar.f157384e ? (s51.d<Item>) dVar.z(c2966d) : (s51.d<Item>) null;
            }
        } else if (dVar == null) {
            p005kotlin.jvm.internal.s.m("pagedListAdapter");
            throw null;
        }
        recyclerView2.setAdapter(dVar);
        RecyclerView recyclerView3 = this.f34749k;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        RecyclerView.m itemAnimator = recyclerView3.getItemAnimator();
        androidx.recyclerview.widget.h0 h0Var = itemAnimator instanceof androidx.recyclerview.widget.h0 ? (androidx.recyclerview.widget.h0) itemAnimator : null;
        if (h0Var != null) {
            h0Var.f10476g = false;
        }
        RecyclerView recyclerView4 = this.f34749k;
        if (recyclerView4 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        s51.d<Item> dVar2 = this.f34748j;
        if (dVar2 != null) {
            g22.p.a(recyclerView4, dVar2);
        } else {
            p005kotlin.jvm.internal.s.m("pagedListAdapter");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/e0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_PAGE_SIZE", "I", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public e0() {
        this(false, 1, null);
    }

    public /* synthetic */ e0(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }
}
