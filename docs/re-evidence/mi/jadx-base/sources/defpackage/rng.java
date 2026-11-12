package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.nfc.widget.MarqueeTextView;
import com.xiaomi.fitness.nfc.widget.RechargeItemView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class rng extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final ConstraintLayout C;
    public final RechargeItemView D;
    public final View E;
    public final TextView F;
    public final MarqueeTextView G;

    public rng(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout, RechargeItemView rechargeItemView, View view2, TextView textView2, MarqueeTextView marqueeTextView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = constraintLayout;
        this.D = rechargeItemView;
        this.E = view2;
        this.F = textView2;
        this.G = marqueeTextView;
    }
}
