package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.view.SleepAnimalShadowLayout;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jbe extends ViewDataBinding {
    public final CardView A;
    public final CardView B;
    public final CardView C;
    public final ConstraintLayout D;
    public final ConstraintLayout E;
    public final SleepAnimalShadowLayout F;
    public final AppCompatImageView G;
    public final AppCompatImageView H;
    public final RoundImageView I;
    public final LinearLayout J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;

    public jbe(Object obj, View view, int i, CardView cardView, CardView cardView2, CardView cardView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, SleepAnimalShadowLayout sleepAnimalShadowLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RoundImageView roundImageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = cardView;
        this.B = cardView2;
        this.C = cardView3;
        this.D = constraintLayout;
        this.E = constraintLayout2;
        this.F = sleepAnimalShadowLayout;
        this.G = appCompatImageView;
        this.H = appCompatImageView2;
        this.I = roundImageView;
        this.J = linearLayout;
        this.K = textView;
        this.L = textView2;
        this.M = textView3;
        this.N = textView4;
        this.O = textView5;
        this.P = textView6;
    }
}
