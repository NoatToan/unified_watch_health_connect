package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.model.EnergyEntry;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ma8 extends j22<EnergyEntry, sf2> {
    public ma8(Context context, List<EnergyEntry> list, RecyclerView recyclerView, vqr vqrVar, r02 r02Var) {
        super(context, list, recyclerView, vqrVar, r02Var);
    }

    private void bindBarEntryToView(v02 v02Var, int i) {
        v02Var.f36337a.setTag((EnergyEntry) this.mEntries.get(i));
    }

    private void setLinearLayout(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.j22, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(v02 v02Var, int i) {
        float f;
        int iCeil;
        super.onBindViewHolder(v02Var, i);
        float width = (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight()) - this.mRecyclerView.getPaddingLeft();
        if (this.mBarChartAttrs.A0) {
            iCeil = (int) Math.ceil(width / this.mXAxis.f37144a);
            int i2 = this.mXAxis.f37144a - 2;
            if (i == 0 || i == this.mEntries.size() - 1) {
                width -= iCeil * i2;
                f = 2.0f;
            }
            setLinearLayout(v02Var.f36337a, iCeil);
            bindBarEntryToView(v02Var, i);
        }
        f = this.mXAxis.f37144a;
        iCeil = (int) (width / f);
        setLinearLayout(v02Var.f36337a, iCeil);
        bindBarEntryToView(v02Var, i);
    }
}
