package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.stand.StandManualSetView;
import com.xiaomi.fitness.view.CardUnderstandView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class hde extends ViewDataBinding {
    public final RecyclerView A;
    public final StandManualSetView B;
    public final CardUnderstandView C;

    public hde(Object obj, View view, int i, RecyclerView recyclerView, StandManualSetView standManualSetView, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = standManualSetView;
        this.C = cardUnderstandView;
    }
}
