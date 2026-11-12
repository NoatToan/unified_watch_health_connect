package androidx.recyclerview.widget;

import android.view.ViewGroup;
import defpackage.g6i;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.c f2954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.d f2955b;
    public final RecyclerView.Adapter<RecyclerView.d0> c;
    public final b d;
    public int e;
    public RecyclerView.i f = new a();

    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            q qVar = q.this;
            qVar.e = qVar.c.getItemCount();
            q qVar2 = q.this;
            qVar2.d.f(qVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i, int i2) {
            q qVar = q.this;
            qVar.d.a(qVar, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i, int i2) {
            q qVar = q.this;
            qVar.e += i2;
            qVar.d.e(qVar, i, i2);
            q qVar2 = q.this;
            if (qVar2.e <= 0 || qVar2.c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            q qVar3 = q.this;
            qVar3.d.c(qVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i, int i2, int i3) {
            g6i.b(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            q qVar = q.this;
            qVar.d.b(qVar, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i, int i2) {
            q qVar = q.this;
            qVar.e -= i2;
            qVar.d.d(qVar, i, i2);
            q qVar2 = q.this;
            if (qVar2.e >= 1 || qVar2.c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            q qVar3 = q.this;
            qVar3.d.c(qVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onStateRestorationPolicyChanged() {
            q qVar = q.this;
            qVar.d.c(qVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i, int i2, Object obj) {
            q qVar = q.this;
            qVar.d.a(qVar, i, i2, obj);
        }
    }

    public interface b {
        void a(q qVar, int i, int i2, Object obj);

        void b(q qVar, int i, int i2);

        void c(q qVar);

        void d(q qVar, int i, int i2);

        void e(q qVar, int i, int i2);

        void f(q qVar);
    }

    public q(RecyclerView.Adapter<RecyclerView.d0> adapter, b bVar, b0 b0Var, y.d dVar) {
        this.c = adapter;
        this.d = bVar;
        this.f2954a = b0Var.b(this);
        this.f2955b = dVar;
        this.e = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.f);
    }

    public int a() {
        return this.e;
    }

    public long b(int i) {
        return this.f2955b.a(this.c.getItemId(i));
    }

    public int c(int i) {
        return this.f2954a.a(this.c.getItemViewType(i));
    }

    public void d(RecyclerView.d0 d0Var, int i) {
        this.c.bindViewHolder(d0Var, i);
    }

    public RecyclerView.d0 e(ViewGroup viewGroup, int i) {
        return this.c.onCreateViewHolder(viewGroup, this.f2954a.b(i));
    }
}
