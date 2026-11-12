package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class yvb extends ViewDataBinding {
    public final Button A;
    public final AppCompatImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public yvb(Object obj, View view, int i, Button button, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = button;
        this.B = appCompatImageView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
        this.H = textView6;
    }
}
