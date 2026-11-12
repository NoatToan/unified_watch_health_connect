package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.sport.bean.LocalSportBean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xuq extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public LocalSportBean C;

    public xuq(Object obj, View view, int i, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
    }

    public abstract void A0(LocalSportBean localSportBean);
}
