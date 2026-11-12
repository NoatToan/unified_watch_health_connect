package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class of6 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final ConstraintLayout D;
    public final RecyclerView E;
    public final ConstraintLayout F;
    public final ImageView G;
    public final SeekBar H;
    public final TextView I;
    public final TextView J;

    public of6(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, ImageView imageView2, SeekBar seekBar, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
        this.D = constraintLayout;
        this.E = recyclerView;
        this.F = constraintLayout2;
        this.G = imageView2;
        this.H = seekBar;
        this.I = textView3;
        this.J = textView4;
    }
}
