package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class avp extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ConstraintLayout B;
    public final RoundImageView C;
    public final TextView D;
    public final TextView E;
    public final FrameLayout F;
    public final TextView G;
    public final TextView H;
    public final ProgressBar I;
    public final TextView J;
    public final TextView K;
    public final RecyclerView L;
    public final RoundImageView M;
    public final TextView N;

    public avp(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RoundImageView roundImageView, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, TextView textView4, ProgressBar progressBar, TextView textView5, TextView textView6, RecyclerView recyclerView, RoundImageView roundImageView2, TextView textView7) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = constraintLayout2;
        this.C = roundImageView;
        this.D = textView;
        this.E = textView2;
        this.F = frameLayout;
        this.G = textView3;
        this.H = textView4;
        this.I = progressBar;
        this.J = textView5;
        this.K = textView6;
        this.L = recyclerView;
        this.M = roundImageView2;
        this.N = textView7;
    }

    public static avp A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static avp B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (avp) ViewDataBinding.G(layoutInflater, jvi.c0, viewGroup, z, obj);
    }
}
