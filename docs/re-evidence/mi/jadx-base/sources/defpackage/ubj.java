package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import defpackage.sf2;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ubj<T extends sf2> extends j22<SegmentBarEntry, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public onq f35600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35601b;

    public ubj(Context context, List<SegmentBarEntry> list, RecyclerView recyclerView, vqr vqrVar, a52 a52Var) {
        super(context, list, recyclerView, vqrVar, a52Var);
        this.f35601b = 0.0f;
    }

    private void bindBarEntryToView(v02 v02Var, int i) {
        v02Var.f36337a.setTag((SegmentBarEntry) this.mEntries.get(i));
    }

    private void setLinearLayout(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.j22, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(v02 v02Var, int i) {
        super.onBindViewHolder(v02Var, i);
        float width = (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight()) - this.mRecyclerView.getPaddingLeft();
        int i2 = this.mXAxis.f37144a;
        int i3 = (int) (width / i2);
        if (this.mBarChartAttrs.A0) {
            float f = this.f35601b + ((width / i2) - i3);
            this.f35601b = f;
            if (f > 1.0f) {
                this.f35601b = f - 1.0f;
                i3++;
            }
        } else {
            i3 = (int) (width / i2);
        }
        setLinearLayout(v02Var.f36337a, i3);
        bindBarEntryToView(v02Var, i);
    }

    public ubj(Context context, List<SegmentBarEntry> list, RecyclerView recyclerView, vqr vqrVar, a52 a52Var, onq onqVar) {
        super(context, list, recyclerView, vqrVar, a52Var);
        this.f35601b = 0.0f;
        this.f35600a = onqVar;
    }
}
