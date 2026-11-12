package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.NoScrollRecyclerView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public abstract class xj0 extends ViewDataBinding {
    public final NoScrollRecyclerView A;
    public final Button B;
    public final RelativeLayout C;
    public final LinearLayout D;
    public final SpringBackLayout E;
    public final NestedScrollView F;
    public final TextView G;

    public xj0(Object obj, View view, int i, NoScrollRecyclerView noScrollRecyclerView, Button button, RelativeLayout relativeLayout, LinearLayout linearLayout, SpringBackLayout springBackLayout, NestedScrollView nestedScrollView, TextView textView) {
        super(obj, view, i);
        this.A = noScrollRecyclerView;
        this.B = button;
        this.C = relativeLayout;
        this.D = linearLayout;
        this.E = springBackLayout;
        this.F = nestedScrollView;
        this.G = textView;
    }
}
