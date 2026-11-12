package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ufe<T extends MaxMinEntry> extends j22<T, sf2> {
    float errorCount;

    public ufe(Context context, List<T> list, RecyclerView recyclerView, vqr vqrVar, a52 a52Var, onq onqVar) {
        super(context, list, recyclerView, vqrVar, a52Var, onqVar);
        this.errorCount = 0.0f;
    }

    private void bindBarEntryToView(v02 v02Var, int i) {
        v02Var.f36337a.setTag((MaxMinEntry) this.mEntries.get(i));
    }

    public void setLinearLayout(View view, int i) {
        view.setAlpha(0.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    public void setValueFormatter(onq onqVar) {
        this.valueFormatter = onqVar;
    }

    @Override // defpackage.j22, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(v02 v02Var, int i) {
        super.onBindViewHolder(v02Var, i);
        float width = (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight()) - this.mRecyclerView.getPaddingLeft();
        int i2 = this.mXAxis.f37144a;
        int i3 = (int) (width / i2);
        float f = this.errorCount + ((width / i2) - i3);
        this.errorCount = f;
        if (f > 1.0f) {
            this.errorCount = f - 1.0f;
            i3++;
        }
        setLinearLayout(v02Var.f36337a, i3);
        bindBarEntryToView(v02Var, i);
    }
}
