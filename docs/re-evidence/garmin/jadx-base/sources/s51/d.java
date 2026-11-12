package s51;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t13.g;
import yc.a1;
import yc.x2;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls51/d;", "", "Item", "Lyc/x2;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroidx/recyclerview/widget/o$f;", "itemCallback", "<init>", "(Landroidx/recyclerview/widget/o$f;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d<Item> extends x2<Item, RecyclerView.f0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f157383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f157384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f157385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2966d f157386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f157387h;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"s51/d$a", "Lyc/a1;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends a1<RecyclerView.f0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d<Item> f157388b;

        public a(d<Item> dVar) {
            this.f157388b = dVar;
        }

        @Override // yc.a1
        public final boolean r(z0 z0Var) {
            z0Var.getClass();
            return (z0Var instanceof z0.c) && z0Var.f196662a;
        }

        @Override // yc.a1
        public final void t(RecyclerView.f0 f0Var, z0 z0Var) {
            z0Var.getClass();
            this.f157388b.A(f0Var);
        }

        @Override // yc.a1
        public final RecyclerView.f0 u(ViewGroup viewGroup, z0 z0Var) {
            z0Var.getClass();
            return this.f157388b.D(viewGroup);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s51/d$b", "Landroidx/recyclerview/widget/RecyclerView$f0;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {
        public b(View view2) {
            super(view2);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"s51/d$c", "Lyc/a1;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a1<RecyclerView.f0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d<Item> f157389b;

        public c(d<Item> dVar) {
            this.f157389b = dVar;
        }

        @Override // yc.a1
        public final boolean r(z0 z0Var) {
            z0Var.getClass();
            return z0Var instanceof z0.c;
        }

        @Override // yc.a1
        public final void t(RecyclerView.f0 f0Var, z0 z0Var) {
            z0Var.getClass();
            this.f157389b.B(f0Var);
        }

        @Override // yc.a1
        public final RecyclerView.f0 u(ViewGroup viewGroup, z0 z0Var) {
            z0Var.getClass();
            return this.f157389b.E(viewGroup);
        }
    }

    /* JADX INFO: renamed from: s51.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"s51/d$d", "Lyc/a1;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2966d extends a1<RecyclerView.f0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d<Item> f157390b;

        public C2966d(d<Item> dVar) {
            this.f157390b = dVar;
        }

        @Override // yc.a1
        public final void t(RecyclerView.f0 f0Var, z0 z0Var) {
            z0Var.getClass();
            this.f157390b.C(f0Var);
        }

        @Override // yc.a1
        public final RecyclerView.f0 u(ViewGroup viewGroup, z0 z0Var) {
            z0Var.getClass();
            return this.f157390b.F(viewGroup);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o.f<Item> fVar) {
        super(fVar, (g) null, (g) null, 6, (j) null);
        fVar.getClass();
        this.f157385f = new c(this);
        this.f157386g = new C2966d(this);
        this.f157387h = new a(this);
    }

    public void A(RecyclerView.f0 f0Var) {
    }

    public void B(RecyclerView.f0 f0Var) {
    }

    public void C(RecyclerView.f0 f0Var) {
    }

    public RecyclerView.f0 D(ViewGroup viewGroup) {
        h12.a.f80820a.getClass();
        return h12.a.C1612a.a(viewGroup);
    }

    public RecyclerView.f0 E(ViewGroup viewGroup) {
        return new b(new View(viewGroup.getContext()));
    }

    public RecyclerView.f0 F(ViewGroup viewGroup) {
        h12.a.f80820a.getClass();
        return h12.a.C1612a.a(viewGroup);
    }

    public abstract void G(int i14, RecyclerView.f0 f0Var);

    public abstract RecyclerView.f0 H(ViewGroup viewGroup, int i14);

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        G(i14, f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return H(viewGroup, i14);
    }
}
