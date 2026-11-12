package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class q02<T extends RecyclerBarEntry> extends j22<T, sf2> {
    public q02(Context context, List<T> list, RecyclerView recyclerView, vqr vqrVar, a52 a52Var, onq onqVar) {
        super(context, list, recyclerView, vqrVar, a52Var, onqVar);
    }

    private void setLinearLayout(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    public final void bindBarEntryToView(v02 v02Var, int i) {
        v02Var.f36337a.setTag(this.mEntries.get(i));
    }

    @Override // defpackage.j22, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(v02 v02Var, int i) {
        int i2;
        super.onBindViewHolder(v02Var, i);
        float width = (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingEnd()) - this.mRecyclerView.getPaddingStart();
        if (this.mBarChartAttrs.A0) {
            int iCeil = (int) Math.ceil(width / this.mXAxis.f37144a);
            int i3 = (int) ((width - ((this.mXAxis.f37144a - 2) * iCeil)) / 2.0f);
            if (i3 < 0) {
                i3 = 1;
            }
            i2 = (i == 0 || i == this.mEntries.size() - 1) ? i3 : iCeil;
            if (((i - 1) * iCeil) + i3 > width) {
                i2 = 0;
            }
        } else {
            i2 = (int) (width / this.mXAxis.f37144a);
        }
        setLinearLayout(v02Var.f36337a, i2);
        bindBarEntryToView(v02Var, i);
    }
}
