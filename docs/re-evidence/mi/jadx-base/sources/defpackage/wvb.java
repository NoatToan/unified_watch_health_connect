package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wvb extends ViewDataBinding {
    public final Button A;
    public final Button B;
    public final DividerView C;
    public final AppCompatImageView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;

    public wvb(Object obj, View view, int i, Button button, Button button2, DividerView dividerView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = button;
        this.B = button2;
        this.C = dividerView;
        this.D = appCompatImageView;
        this.E = textView;
        this.F = textView2;
        this.G = textView3;
        this.H = textView4;
        this.I = textView5;
    }
}
