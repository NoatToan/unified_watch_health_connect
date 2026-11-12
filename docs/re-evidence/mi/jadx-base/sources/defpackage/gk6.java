package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class gk6 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final View E;
    public final TextView F;
    public final TextView G;
    public final ImageView H;
    public final SeekBar I;
    public final ImageView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final ImageView N;

    public gk6(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, View view2, TextView textView3, TextView textView4, ImageView imageView2, SeekBar seekBar, ImageView imageView3, TextView textView5, TextView textView6, TextView textView7, ImageView imageView4) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = textView2;
        this.D = imageView;
        this.E = view2;
        this.F = textView3;
        this.G = textView4;
        this.H = imageView2;
        this.I = seekBar;
        this.J = imageView3;
        this.K = textView5;
        this.L = textView6;
        this.M = textView7;
        this.N = imageView4;
    }

    public static gk6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static gk6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (gk6) ViewDataBinding.G(layoutInflater, eui.W0, viewGroup, z, obj);
    }
}
