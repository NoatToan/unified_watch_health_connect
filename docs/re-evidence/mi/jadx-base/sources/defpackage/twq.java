package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.sport.bean.RecommendSportBean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class twq extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public RecommendSportBean C;

    public twq(Object obj, View view, int i, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
    }
}
