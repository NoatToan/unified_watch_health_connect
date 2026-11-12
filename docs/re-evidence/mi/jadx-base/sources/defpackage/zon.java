package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.SportRecordLandEntry;
import defpackage.sf2;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class zon<T extends sf2> extends j22<SportRecordLandEntry, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f41527a;

    public zon(Context context, List<SportRecordLandEntry> list, RecyclerView recyclerView, vqr vqrVar, a52 a52Var, onq onqVar) {
        super(context, list, recyclerView, vqrVar, a52Var, onqVar);
        this.f41527a = 0.0f;
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
        super.onBindViewHolder(v02Var, i);
        float width = (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight()) - this.mRecyclerView.getPaddingLeft();
        int i2 = this.mXAxis.f37144a;
        int i3 = (int) (width / i2);
        float f = this.f41527a + ((width / i2) - i3);
        this.f41527a = f;
        if (f > 1.0f) {
            i3++;
            this.f41527a = f - 1.0f;
        }
        setLinearLayout(v02Var.f36337a, i3);
        bindBarEntryToView(v02Var, i);
    }
}
