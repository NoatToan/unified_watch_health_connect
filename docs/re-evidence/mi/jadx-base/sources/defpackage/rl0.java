package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class rl0 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final RatioImageView C;
    public final LinearLayout D;
    public final TextView E;
    public final ImageView F;

    public rl0(Object obj, View view, int i, ImageView imageView, TextView textView, RatioImageView ratioImageView, LinearLayout linearLayout, TextView textView2, ImageView imageView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = ratioImageView;
        this.D = linearLayout;
        this.E = textView2;
        this.F = imageView2;
    }
}
