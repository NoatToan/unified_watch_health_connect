package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p70 extends ViewDataBinding {
    public final RelativeLayout A;
    public final DividerView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final Button H;

    public p70(Object obj, View view, int i, RelativeLayout relativeLayout, DividerView dividerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, Button button) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = dividerView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
        this.H = button;
    }
}
