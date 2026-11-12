package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class gtb extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final ImageView C;
    public final TextView D;

    public gtb(Object obj, View view, int i, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = imageView2;
        this.D = textView2;
    }
}
