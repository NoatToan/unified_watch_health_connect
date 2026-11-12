package androidx.recyclerview.widget;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2782a;

    public static final class Config {
        public static final Config c = new Config(true, StableIdMode.NO_STABLE_IDS);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StableIdMode f2784b;

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public Config(boolean z, StableIdMode stableIdMode) {
            this.f2783a = z;
            this.f2784b = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter(RecyclerView.Adapter<? extends RecyclerView.d0>... adapterArr) {
        this(Config.c, adapterArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int findRelativeAdapterPositionIn(RecyclerView.Adapter<? extends RecyclerView.d0> adapter, RecyclerView.d0 d0Var, int i) {
        return this.f2782a.p(adapter, d0Var, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f2782a.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f2782a.n(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f2782a.o(i);
    }

    public boolean i(RecyclerView.Adapter<? extends RecyclerView.d0> adapter) {
        return this.f2782a.h(adapter);
    }

    public void j(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f2782a.v(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        this.f2782a.w(d0Var, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f2782a.x(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f2782a.y(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.d0 d0Var) {
        return this.f2782a.z(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.d0 d0Var) {
        this.f2782a.A(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.d0 d0Var) {
        this.f2782a.B(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.d0 d0Var) {
        this.f2782a.C(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public ConcatAdapter(Config config, RecyclerView.Adapter<? extends RecyclerView.d0>... adapterArr) {
        this(config, (List<? extends RecyclerView.Adapter<? extends RecyclerView.d0>>) Arrays.asList(adapterArr));
    }

    public ConcatAdapter(Config config, List<? extends RecyclerView.Adapter<? extends RecyclerView.d0>> list) {
        this.f2782a = new f(this, config);
        Iterator<? extends RecyclerView.Adapter<? extends RecyclerView.d0>> it = list.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
        super.setHasStableIds(this.f2782a.s());
    }
}
