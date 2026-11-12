package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.sport.bean.NormalSportBean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ivq extends ViewDataBinding {
    public final RecyclerView A;
    public NormalSportBean B;

    public ivq(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }
}
