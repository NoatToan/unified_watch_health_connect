package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.route.track.ext.Report;

/* JADX INFO: loaded from: classes8.dex */
public abstract class o2g extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;
    public final ImageView G;
    public final TextView H;
    public final TextView I;
    public final ImageView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final TextView N;
    public final TextView O;
    public Report P;

    public o2g(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, ImageView imageView2, TextView textView5, TextView textView6, ImageView imageView3, TextView textView7, TextView textView8, ImageView imageView4, TextView textView9, TextView textView10) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = textView2;
        this.D = imageView;
        this.E = textView3;
        this.F = textView4;
        this.G = imageView2;
        this.H = textView5;
        this.I = textView6;
        this.J = imageView3;
        this.K = textView7;
        this.L = textView8;
        this.M = imageView4;
        this.N = textView9;
        this.O = textView10;
    }

    public abstract void A0(Report report);
}
