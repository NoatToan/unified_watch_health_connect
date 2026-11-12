package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class aub extends ViewDataBinding {
    public final TextView A;
    public final RelativeLayout B;
    public final MoreRecyclerView C;
    public final TextView D;
    public final TextView E;

    public aub(Object obj, View view, int i, TextView textView, RelativeLayout relativeLayout, MoreRecyclerView moreRecyclerView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = relativeLayout;
        this.C = moreRecyclerView;
        this.D = textView2;
        this.E = textView3;
    }
}
