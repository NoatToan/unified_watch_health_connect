package sw0;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsw0/i;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lsw0/a;", "", "Lsw0/k;", "legendItems", "<init>", "(Ljava/util/List;)V", "a", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends RecyclerView.h<sw0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k> f161083a;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends k> list) {
        list.getClass();
        this.f161083a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f161083a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        List<k> list = this.f161083a;
        k kVar = list.get(i14);
        if (kVar instanceof f) {
            return 1;
        }
        if (kVar instanceof d) {
            return 2;
        }
        if (kVar instanceof b) {
            return 3;
        }
        vb.h.s(org.apache.commons.lang3.e.f("Error! Developer, add an ItemViewType for ", ".", list.get(i14)));
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        sw0.a aVar = (sw0.a) f0Var;
        aVar.getClass();
        aVar.d(this.f161083a.get(i14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 1) {
            return new h(n23.j.b(viewGroup, R.layout.map_details_legend_item, viewGroup, false));
        }
        if (i14 == 2) {
            return new e(n23.j.b(viewGroup, R.layout.map_data_overlay_item, viewGroup, false));
        }
        if (i14 == 3) {
            return new c(n23.j.b(viewGroup, R.layout.climb_difficulty_legend_item, viewGroup, false));
        }
        vb.h.s("Invalid view in the map legend bottom sheet");
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lsw0/i$a;", "", "<init>", "()V", "", "MAP_DETAILS_ITEM", "I", "MAP_DATA_OVERLAY_ITEM", "MAP_CLIMB_DIFFICULTY_ITEM", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
