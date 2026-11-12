package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.vitality.VitalityEntry;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class g1r extends j22<VitalityEntry, rtr> {
    public g1r(Context context, List<VitalityEntry> list, RecyclerView recyclerView, vqr vqrVar, r02 r02Var, onq onqVar) {
        super(context, list, recyclerView, vqrVar, r02Var, onqVar);
    }

    private void bindBarEntryToView(v02 v02Var, int i) {
        v02Var.f36337a.setTag((VitalityEntry) this.mEntries.get(i));
    }

    private void setLinearLayout(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = 1000;
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.j22, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(v02 v02Var, int i) {
        super.onBindViewHolder(v02Var, i);
        setLinearLayout(v02Var.f36337a, (int) (((this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight()) - this.mRecyclerView.getPaddingLeft()) / this.mXAxis.f37144a));
        bindBarEntryToView(v02Var, i);
    }
}
