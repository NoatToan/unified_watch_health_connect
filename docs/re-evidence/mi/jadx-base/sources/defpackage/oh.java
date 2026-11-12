package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class oh extends ViewDataBinding {
    public final ImageView A;
    public final FrameLayout B;
    public final TextView C;
    public final ImageView D;
    public final View E;
    public final TextView F;
    public final LinearLayout G;
    public final LinearLayout H;
    public final ProgressBar I;
    public final ProgressBar J;
    public final ProgressBar K;
    public final ImageView L;
    public final View M;
    public final TextView N;

    public oh(Object obj, View view, int i, ImageView imageView, FrameLayout frameLayout, TextView textView, ImageView imageView2, View view2, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ImageView imageView3, View view3, TextView textView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = frameLayout;
        this.C = textView;
        this.D = imageView2;
        this.E = view2;
        this.F = textView2;
        this.G = linearLayout;
        this.H = linearLayout2;
        this.I = progressBar;
        this.J = progressBar2;
        this.K = progressBar3;
        this.L = imageView3;
        this.M = view3;
        this.N = textView3;
    }

    public static oh A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static oh B0(LayoutInflater layoutInflater, Object obj) {
        return (oh) ViewDataBinding.G(layoutInflater, jvi.f, null, false, obj);
    }
}
