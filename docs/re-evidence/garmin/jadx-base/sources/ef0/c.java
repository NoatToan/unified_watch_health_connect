package ef0;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lef0/c;", "Landroidx/recyclerview/widget/s$d;", "Landroidx/recyclerview/widget/RecyclerView;", "targetRecyclerView", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends s.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f63943d;

    public c(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.f63943d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        List listB1;
        recyclerView.getClass();
        f0Var.getClass();
        super.b(recyclerView, f0Var);
        com.garmin.android.apps.connectmobile.draggableimagepreviewer.a aVarP = p();
        if (aVarP == null || (listB1 = h0.b1(aVarP.f34731b)) == null) {
            return;
        }
        int i14 = 0;
        for (Object obj : listB1) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            b bVar = (b) obj;
            com.garmin.android.apps.connectmobile.draggableimagepreviewer.a aVarP2 = p();
            if (aVarP2 != null) {
                bVar.f63942d = false;
                Unit unit = Unit.INSTANCE;
                aVarP2.notifyItemChanged(i14, bVar);
            }
            i14 = i15;
        }
    }

    @Override // androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        return s.d.k(15, 0);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        recyclerView.getClass();
        f0Var.getClass();
        RecyclerView.h adapter = recyclerView.getAdapter();
        com.garmin.android.apps.connectmobile.draggableimagepreviewer.a aVar = adapter instanceof com.garmin.android.apps.connectmobile.draggableimagepreviewer.a ? (com.garmin.android.apps.connectmobile.draggableimagepreviewer.a) adapter : null;
        if (aVar != null) {
            int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
            int bindingAdapterPosition2 = f0Var2.getBindingAdapterPosition();
            ArrayList arrayList = aVar.f34731b;
            if (bindingAdapterPosition >= 0 && bindingAdapterPosition <= x.j(arrayList) && bindingAdapterPosition2 >= 0 && bindingAdapterPosition2 <= arrayList.size() - 1) {
                Collections.swap(arrayList, bindingAdapterPosition, bindingAdapterPosition2);
                aVar.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                d dVar = aVar.f34733d;
                if (dVar != null) {
                    dVar.a(h0.b1(arrayList));
                }
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void n(int i14, RecyclerView.f0 f0Var) {
        com.garmin.android.apps.connectmobile.draggableimagepreviewer.a aVarP;
        List listB1;
        super.n(i14, f0Var);
        if (i14 != 2 || (aVarP = p()) == null || (listB1 = h0.b1(aVarP.f34731b)) == null) {
            return;
        }
        int i15 = 0;
        for (Object obj : listB1) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            b bVar = (b) obj;
            com.garmin.android.apps.connectmobile.draggableimagepreviewer.a aVarP2 = p();
            if (aVarP2 != null) {
                bVar.f63942d = true;
                Unit unit = Unit.INSTANCE;
                aVarP2.notifyItemChanged(i15, bVar);
            }
            i15 = i16;
        }
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        f0Var.getClass();
    }

    public final com.garmin.android.apps.connectmobile.draggableimagepreviewer.a p() {
        RecyclerView.h adapter = this.f63943d.getAdapter();
        if (adapter instanceof com.garmin.android.apps.connectmobile.draggableimagepreviewer.a) {
            return (com.garmin.android.apps.connectmobile.draggableimagepreviewer.a) adapter;
        }
        return null;
    }
}
