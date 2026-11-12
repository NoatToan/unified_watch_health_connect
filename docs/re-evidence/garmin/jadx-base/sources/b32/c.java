package b32;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.i2;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public class c extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f15668a;

    public c() {
        f fVar = new f();
        this.f15668a = fVar;
        fVar.h(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f15668a.f15673f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return this.f15668a.getItemViewType(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        this.f15668a.k(f0Var, i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        return this.f15668a.a(viewGroup, i14);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x001a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0029, please report this as an issue */
    public final void r(d dVar, int i14) {
        boolean z14;
        f fVar = this.f15668a;
        if (i14 >= 0) {
            z14 = i14 < fVar.f15672e.get(dVar).intValue();
            if (z14) {
                c cVar = fVar.f15667a;
                int iJ = fVar.j(dVar);
                cVar.notifyItemChanged(iJ != -1 ? iJ + i14 : -1);
            } else {
                i2.n("NestedRecyclerViewGroup", "Invalid position: " + i14);
            }
        }
        fVar.getClass();
        if (z14) {
            c cVar2 = fVar.f15667a;
            int iJ2 = fVar.j(dVar);
            cVar2.notifyItemChanged(iJ2 != -1 ? iJ2 + i14 : -1);
        } else {
            i2.n("NestedRecyclerViewGroup", "Invalid position: " + i14);
        }
    }

    public final void t(d dVar) {
        f fVar = this.f15668a;
        if (!(fVar.f15672e.get(dVar).intValue() >= 0)) {
            i2.n("NestedRecyclerViewGroup", "Invalid position: 0");
            return;
        }
        c cVar = fVar.f15667a;
        int iJ = fVar.j(dVar);
        if (iJ == -1) {
            iJ = -1;
        }
        cVar.notifyItemInserted(iJ);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x001a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0029, please report this as an issue */
    public final void u(d dVar, int i14, int i15) {
        boolean z14;
        f fVar = this.f15668a;
        if (i14 >= 0) {
            z14 = i14 <= fVar.f15672e.get(dVar).intValue();
            if (z14) {
                c cVar = fVar.f15667a;
                int iJ = fVar.j(dVar);
                cVar.notifyItemRangeInserted(iJ != -1 ? iJ + i14 : -1, i15);
            } else {
                i2.n("NestedRecyclerViewGroup", "Invalid position: start = " + i14 + ", limit = " + i15);
            }
        }
        fVar.getClass();
        if (z14) {
            c cVar2 = fVar.f15667a;
            int iJ2 = fVar.j(dVar);
            cVar2.notifyItemRangeInserted(iJ2 != -1 ? iJ2 + i14 : -1, i15);
        } else {
            i2.n("NestedRecyclerViewGroup", "Invalid position: start = " + i14 + ", limit = " + i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x001a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0029, please report this as an issue */
    public final void x(d dVar, int i14) {
        boolean z14;
        f fVar = this.f15668a;
        if (i14 >= 0) {
            z14 = i14 < fVar.f15672e.get(dVar).intValue();
            if (z14) {
                c cVar = fVar.f15667a;
                int iJ = fVar.j(dVar);
                cVar.notifyItemRemoved(iJ != -1 ? iJ + i14 : -1);
            } else {
                i2.n("NestedRecyclerViewGroup", "Invalid position: " + i14);
            }
        }
        fVar.getClass();
        if (z14) {
            c cVar2 = fVar.f15667a;
            int iJ2 = fVar.j(dVar);
            cVar2.notifyItemRemoved(iJ2 != -1 ? iJ2 + i14 : -1);
        } else {
            i2.n("NestedRecyclerViewGroup", "Invalid position: " + i14);
        }
    }

    public final void z(a aVar) {
        aVar.h(this);
        f fVar = this.f15668a;
        fVar.f15669b.add(aVar);
        int i14 = fVar.f15674g;
        fVar.f15670c.put(aVar, Integer.valueOf(i14));
        int iB = aVar.b();
        if (iB <= 0) {
            h.s("View type count should not less than 1.");
            return;
        }
        for (int i15 = 0; i15 < iB; i15++) {
            e eVarC = aVar.c(fVar.f(), i15);
            if (eVarC != null) {
                fVar.f15671d.put(i14 + i15, eVarC);
            }
        }
        fVar.f15672e.put(aVar, Integer.valueOf(aVar.getItemCount()));
        fVar.f15674g += iB;
    }
}
