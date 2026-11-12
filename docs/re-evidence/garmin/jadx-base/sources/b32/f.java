package b32;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class f extends b32.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15674g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15669b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<d, Integer> f15670c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<e> f15671d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<d, Integer> f15672e = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f15675h = new a();

    public class a extends RecyclerView.j {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onChanged() {
            f fVar = f.this;
            fVar.e(fVar.f15667a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i14, int i15) {
            f fVar = f.this;
            fVar.e(fVar.f15667a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i14, int i15) {
            f fVar = f.this;
            fVar.e(fVar.f15667a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i14, int i15, int i16) {
            f fVar = f.this;
            fVar.e(fVar.f15667a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i14, int i15) {
            f fVar = f.this;
            fVar.e(fVar.f15667a);
        }
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        int i15 = 0;
        int iB = 0;
        while (true) {
            ArrayList arrayList = this.f15669b;
            if (i15 >= arrayList.size()) {
                i2.i("NestedRecyclerViewGroup", "Cannot instantiate view holder : " + i14 + ". Using empty view holder to return non-null value.");
                return new b(viewGroup);
            }
            d dVar = (d) arrayList.get(i15);
            if (i14 < dVar.b() + iB) {
                return dVar.a(viewGroup, i14 - iB);
            }
            iB += dVar.b();
            i15++;
        }
    }

    @Override // b32.d
    public final int b() {
        return this.f15674g;
    }

    @Override // b32.d
    public final e c(c cVar, int i14) {
        return null;
    }

    @Override // b32.a, b32.d
    public final void e(c cVar) {
        int i14 = 0;
        int itemCount = 0;
        while (true) {
            ArrayList arrayList = this.f15669b;
            if (i14 >= arrayList.size()) {
                this.f15673f = itemCount;
                return;
            }
            d dVar = (d) arrayList.get(i14);
            dVar.e(cVar);
            boolean zIsVisible = dVar.getF120672c();
            HashMap<d, Integer> map = this.f15672e;
            if (zIsVisible) {
                map.put(dVar, Integer.valueOf(dVar.getItemCount()));
                itemCount += dVar.getItemCount();
            } else {
                map.put(dVar, 0);
            }
            i14++;
        }
    }

    @Override // b32.d
    public final int getItemCount() {
        return this.f15673f;
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        int i15;
        int i16 = 0;
        int itemCount = 0;
        while (true) {
            ArrayList arrayList = this.f15669b;
            if (i16 >= arrayList.size()) {
                i2.i("NestedRecyclerViewGroup", "Item view type not found: " + i14);
                return -1;
            }
            d dVar = (d) arrayList.get(i16);
            if (dVar.getF120672c()) {
                if (i14 < dVar.getItemCount() + itemCount && (i15 = i(dVar, i14 - itemCount)) != -1) {
                    return i15;
                }
                itemCount = dVar.getItemCount() + itemCount;
            }
            i16++;
        }
    }

    @Override // b32.a
    public final void h(c cVar) {
        this.f15667a = cVar;
        cVar.registerAdapterDataObserver(this.f15675h);
    }

    public final int i(d dVar, int i14) {
        int itemViewType = dVar.getItemViewType(i14);
        if (itemViewType < 0 || itemViewType >= dVar.b()) {
            return -1;
        }
        return this.f15670c.get(dVar).intValue() + itemViewType;
    }

    public final int j(d dVar) {
        int iJ;
        int i14 = 0;
        int itemCount = 0;
        while (true) {
            ArrayList arrayList = this.f15669b;
            if (i14 >= arrayList.size()) {
                return -1;
            }
            d dVar2 = (d) arrayList.get(i14);
            if (dVar2 == dVar) {
                return itemCount;
            }
            if (dVar2.getF120672c()) {
                if ((dVar2 instanceof f) && (iJ = ((f) dVar2).j(dVar)) != -1) {
                    return itemCount + iJ;
                }
                itemCount = dVar2.getItemCount() + itemCount;
            }
            i14++;
        }
    }

    public final void k(RecyclerView.f0 f0Var, int i14) {
        int i15 = 0;
        int itemCount = 0;
        while (true) {
            ArrayList arrayList = this.f15669b;
            if (i15 >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i15);
            if (dVar.getF120672c()) {
                if (i14 < dVar.getItemCount() + itemCount) {
                    int i16 = i14 - itemCount;
                    e eVar = this.f15671d.get(i(dVar, i16));
                    if (eVar != null) {
                        eVar.d(f0Var, i16);
                        return;
                    } else {
                        if (dVar instanceof f) {
                            ((f) dVar).k(f0Var, i16);
                            return;
                        }
                        return;
                    }
                }
                itemCount = dVar.getItemCount() + itemCount;
            }
            i15++;
        }
    }
}
