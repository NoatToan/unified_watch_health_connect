package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yk6 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final ProgressBar E;

    public yk6(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ProgressBar progressBar) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = textView;
        this.D = textView2;
        this.E = progressBar;
    }
}
