package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g7e extends ViewDataBinding {
    public final RelativeLayout A;
    public final DividerView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final RelativeLayout F;
    public final TextView G;
    public final TextView H;

    public g7e(Object obj, View view, int i, RelativeLayout relativeLayout, DividerView dividerView, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout2, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = dividerView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = relativeLayout2;
        this.G = textView4;
        this.H = textView5;
    }
}
