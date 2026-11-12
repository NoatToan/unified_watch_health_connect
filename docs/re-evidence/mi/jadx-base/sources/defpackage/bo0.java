package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bo0 extends ViewDataBinding {
    public final LinearLayout A;
    public final LottieAnimationView B;
    public final ProgressBar C;
    public final TextView D;

    public bo0(Object obj, View view, int i, LinearLayout linearLayout, LottieAnimationView lottieAnimationView, ProgressBar progressBar, TextView textView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = lottieAnimationView;
        this.C = progressBar;
        this.D = textView;
    }
}
