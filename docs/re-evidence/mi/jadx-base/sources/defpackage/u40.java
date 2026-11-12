package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes7.dex */
public abstract class u40 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final DividerView D;
    public final ImageView E;
    public final TextView F;
    public final ProgressBar G;
    public final ConstraintLayout H;
    public final ConstraintLayout I;

    public u40(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, DividerView dividerView, ImageView imageView, TextView textView4, ProgressBar progressBar, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = dividerView;
        this.E = imageView;
        this.F = textView4;
        this.G = progressBar;
        this.H = constraintLayout;
        this.I = constraintLayout2;
    }
}
