package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h76 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final LottieAnimationView C;
    public Boolean D;

    public h76(Object obj, View view, int i, TextView textView, TextView textView2, LottieAnimationView lottieAnimationView) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = lottieAnimationView;
    }
}
