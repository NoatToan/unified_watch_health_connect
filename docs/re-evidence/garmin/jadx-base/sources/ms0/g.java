package ms0;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import java.util.ArrayList;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yr0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lms0/g;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lms0/f;", "Lkotlin/Function1;", "Lyr0/n;", "", "onItemClick", "<init>", "(Le23/l;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends RecyclerView.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<n, Unit> f120475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f120476b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(l<? super n, Unit> lVar) {
        lVar.getClass();
        this.f120475a = lVar;
        this.f120476b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f120476b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f fVar = (f) f0Var;
        fVar.getClass();
        n nVar = (n) this.f120476b.get(i14);
        fVar.f120474a.setText(nVar.f199033a);
        fVar.itemView.setOnClickListener(new lq.g(6, this, nVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new f(j.b(viewGroup, R.layout.gcm_simple_list_item_3_0, viewGroup, false));
    }
}
