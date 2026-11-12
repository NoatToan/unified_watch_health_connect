package g62;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg62/e0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "Lm52/k;", "workoutSportsList", "Lkotlin/Function2;", "", "", "onSelectedCallback", "<init>", "(Ljava/util/List;Le23/p;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<m52.k> f76076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<m52.k, Integer, Unit> f76077b;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(List<? extends m52.k> list, e23.p<? super m52.k, ? super Integer, Unit> pVar) {
        list.getClass();
        pVar.getClass();
        this.f76076a = list;
        this.f76077b = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f76076a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        u4.d dVar;
        f0Var.getClass();
        if (f0Var instanceof c0) {
            m52.k kVar = this.f76076a.get(i14);
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zL0 = k1.f37122a.l0();
            if (!zL0 || (dVar = kVar.f116773i) == null) {
                dVar = kVar.f116772h;
            }
            c0 c0Var = (c0) f0Var;
            GCMCheckableRow gCMCheckableRow = c0Var.f76065a;
            String string = f0Var.itemView.getContext().getString(kVar.d(zL0));
            string.getClass();
            gCMCheckableRow.setDefaultText(string);
            dVar.getClass();
            c0Var.f76066b.setContent(new z3.e(906025644, true, new b82.k(dVar, 3)));
            gCMCheckableRow.setOnClickListener(new d0(this, i14, f0Var, 0));
            gCMCheckableRow.setChecked(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.sports_leg_item, viewGroup, false);
        viewE.getClass();
        return new c0(viewE);
    }
}
