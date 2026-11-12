package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class udk extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final RoundImageView D;
    public final TextView E;
    public final TextView F;

    public udk(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, TextView textView2, RoundImageView roundImageView, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = textView2;
        this.D = roundImageView;
        this.E = textView3;
        this.F = textView4;
    }
}
