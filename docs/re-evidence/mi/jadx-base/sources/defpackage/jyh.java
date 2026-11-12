package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jyh extends ViewDataBinding {
    public final Button A;
    public final AppCompatImageView B;
    public final DividerView C;
    public final RecyclerView D;
    public final TextView E;
    public final View F;
    public final TextView G;
    public final RelativeLayout H;
    public final TextView I;
    public final ThreeTargetView J;
    public final TextView K;

    public jyh(Object obj, View view, int i, Button button, AppCompatImageView appCompatImageView, DividerView dividerView, RecyclerView recyclerView, TextView textView, View view2, TextView textView2, RelativeLayout relativeLayout, TextView textView3, ThreeTargetView threeTargetView, TextView textView4) {
        super(obj, view, i);
        this.A = button;
        this.B = appCompatImageView;
        this.C = dividerView;
        this.D = recyclerView;
        this.E = textView;
        this.F = view2;
        this.G = textView2;
        this.H = relativeLayout;
        this.I = textView3;
        this.J = threeTargetView;
        this.K = textView4;
    }
}
