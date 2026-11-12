package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xqp extends ViewDataBinding {
    public final ImageView A;
    public final ProgressBar B;
    public final ImageView C;
    public final ImageView D;
    public final TextView E;

    public xqp(Object obj, View view, int i, ImageView imageView, ProgressBar progressBar, ImageView imageView2, ImageView imageView3, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = progressBar;
        this.C = imageView2;
        this.D = imageView3;
        this.E = textView;
    }
}
