package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import defpackage.sf2;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j22<T extends RecyclerBarEntry, V extends sf2> extends RecyclerView.Adapter<v02> {
    protected a52 mBarChartAttrs;
    protected Context mContext;
    protected List<T> mEntries;
    protected RecyclerView mRecyclerView;
    protected vqr mXAxis;
    protected V mYAxis;
    protected onq valueFormatter;

    public j22(Context context, List<T> list, RecyclerView recyclerView, vqr vqrVar, a52 a52Var) {
        this.mContext = context;
        this.mEntries = list;
        this.mRecyclerView = recyclerView;
        this.mXAxis = vqrVar;
        this.mBarChartAttrs = a52Var;
    }

    private void setItemContentDescription(v02 v02Var, int i) {
        T t = this.mEntries.get(i);
        onq onqVar = this.valueFormatter;
        String barLabel = onqVar != null ? onqVar.getBarLabel(t) : "";
        if (barLabel.isEmpty()) {
            v02Var.f36337a.setFocusable(false);
        } else {
            v02Var.f36337a.setContentDescription(barLabel);
            v02Var.f36337a.setFocusable(true);
        }
    }

    public List<T> getEntries() {
        return this.mEntries;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mEntries.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        T t;
        List<T> list = this.mEntries;
        return (list == null || list.size() <= i || (t = this.mEntries.get(i)) == null) ? super.getItemViewType(i) : t.type;
    }

    public void setEntries(List<T> list) {
        this.mEntries = list;
        notifyDataSetChanged();
    }

    public void setXAxis(vqr vqrVar) {
        this.mXAxis = vqrVar;
        notifyDataSetChanged();
    }

    public void setYAxis(V v) {
        this.mYAxis = v;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(v02 v02Var, int i) {
        setItemContentDescription(v02Var, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public v02 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new v02(LayoutInflater.from(this.mContext).inflate(cui.f14727a, viewGroup, false));
    }

    public j22(Context context, List<T> list, RecyclerView recyclerView, vqr vqrVar, a52 a52Var, onq onqVar) {
        this(context, list, recyclerView, vqrVar, a52Var);
        this.valueFormatter = onqVar;
    }
}
