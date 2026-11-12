package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class cwk extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public cwk(Object obj, View view, int i, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = imageView2;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
    }
}
