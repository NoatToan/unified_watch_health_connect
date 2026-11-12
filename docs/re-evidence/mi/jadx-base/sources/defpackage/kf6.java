package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class kf6 extends ViewDataBinding {
    public final LinearLayout A;
    public final SwitchButtonTwoLineTextView B;
    public final RecyclerView C;
    public final rd6 D;
    public final TextView E;
    public final View F;

    public kf6(Object obj, View view, int i, LinearLayout linearLayout, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, RecyclerView recyclerView, rd6 rd6Var, TextView textView, View view2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = switchButtonTwoLineTextView;
        this.C = recyclerView;
        this.D = rd6Var;
        this.E = textView;
        this.F = view2;
    }
}
