package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.ClaimRecordsWeekRecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nj0 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ClaimRecordsWeekRecyclerView C;

    public nj0(Object obj, View view, int i, TextView textView, TextView textView2, ClaimRecordsWeekRecyclerView claimRecordsWeekRecyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = claimRecordsWeekRecyclerView;
    }
}
