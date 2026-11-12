package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hxh extends ViewDataBinding {
    public final CheckBox A;
    public final RelativeLayout B;
    public final TextView C;
    public final AppCompatImageView D;
    public final ryh E;
    public final LinearLayout F;
    public final LinearLayout G;
    public final ConstraintLayout H;
    public final ThreeTargetView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;

    public hxh(Object obj, View view, int i, CheckBox checkBox, RelativeLayout relativeLayout, TextView textView, AppCompatImageView appCompatImageView, ryh ryhVar, LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout, ThreeTargetView threeTargetView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = checkBox;
        this.B = relativeLayout;
        this.C = textView;
        this.D = appCompatImageView;
        this.E = ryhVar;
        this.F = linearLayout;
        this.G = linearLayout2;
        this.H = constraintLayout;
        this.I = threeTargetView;
        this.J = textView2;
        this.K = textView3;
        this.L = textView4;
        this.M = textView5;
        this.N = textView6;
    }
}
