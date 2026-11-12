package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.CommonTitleBar;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class cca extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final View D;
    public final TextView E;
    public final CommonTitleBar F;
    public final RoundImageView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;

    public cca(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, View view2, TextView textView4, CommonTitleBar commonTitleBar, RoundImageView roundImageView, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = view2;
        this.E = textView4;
        this.F = commonTitleBar;
        this.G = roundImageView;
        this.H = textView5;
        this.I = textView6;
        this.J = textView7;
    }
}
