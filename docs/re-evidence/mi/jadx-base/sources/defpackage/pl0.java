package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pl0 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final RatioImageView D;
    public final TextView E;
    public final ImageView F;

    public pl0(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, RatioImageView ratioImageView, TextView textView3, ImageView imageView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = textView2;
        this.D = ratioImageView;
        this.E = textView3;
        this.F = imageView2;
    }
}
