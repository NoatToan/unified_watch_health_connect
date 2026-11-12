package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.view.SleepAnimalShadowLayout;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class iyb extends ViewDataBinding {
    public final Barrier A;
    public final RoundImageView B;
    public final AppCompatImageView C;
    public final SleepAnimalShadowLayout D;
    public final RelativeLayout E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final AppCompatTextView L;

    public iyb(Object obj, View view, int i, Barrier barrier, RoundImageView roundImageView, AppCompatImageView appCompatImageView, SleepAnimalShadowLayout sleepAnimalShadowLayout, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = barrier;
        this.B = roundImageView;
        this.C = appCompatImageView;
        this.D = sleepAnimalShadowLayout;
        this.E = relativeLayout;
        this.F = textView;
        this.G = textView2;
        this.H = textView3;
        this.I = textView4;
        this.J = textView5;
        this.K = textView6;
        this.L = appCompatTextView;
    }
}
