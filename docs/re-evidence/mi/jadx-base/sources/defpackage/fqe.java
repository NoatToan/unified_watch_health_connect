package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fqe extends ViewDataBinding {
    public final DividerView A;
    public final DividerView B;
    public final TextView C;
    public final CheckBox D;
    public final TextView E;
    public final TextView F;
    public final LinearLayout G;
    public final TextView H;
    public final LinearLayout I;

    public fqe(Object obj, View view, int i, DividerView dividerView, DividerView dividerView2, TextView textView, CheckBox checkBox, TextView textView2, TextView textView3, LinearLayout linearLayout, TextView textView4, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.A = dividerView;
        this.B = dividerView2;
        this.C = textView;
        this.D = checkBox;
        this.E = textView2;
        this.F = textView3;
        this.G = linearLayout;
        this.H = textView4;
        this.I = linearLayout2;
    }
}
