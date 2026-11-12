package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class j9f extends j22<MaxMinEntry, vnq> {
    public j9f(Context context, List<MaxMinEntry> list, RecyclerView recyclerView, vqr vqrVar, a52 a52Var, onq onqVar) {
        super(context, list, recyclerView, vqrVar, a52Var, onqVar);
    }

    private void bindBarEntryToView(v02 v02Var, int i) {
        v02Var.f36337a.setTag((MaxMinEntry) this.mEntries.get(i));
    }

    private void setLinearLayout(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.j22, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(v02 v02Var, int i) {
        int iCeil;
        super.onBindViewHolder(v02Var, i);
        float width = (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight()) - this.mRecyclerView.getPaddingLeft();
        if (this.mBarChartAttrs.A0) {
            iCeil = (int) Math.ceil(width / this.mXAxis.f37144a);
            int i2 = (int) ((width - ((this.mXAxis.f37144a - 2) * iCeil)) / 2.0f);
            if (i2 < 0) {
                i2 = 1;
            }
            if (i == 0 || i == this.mEntries.size() - 1) {
                iCeil = i2;
            } else if (((i - 1) * iCeil) + i2 > width) {
                iCeil = 0;
            }
        } else {
            iCeil = (int) (width / this.mXAxis.f37144a);
        }
        setLinearLayout(v02Var.f36337a, iCeil);
        bindBarEntryToView(v02Var, i);
    }
}
