package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ik6 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final View D;
    public final TextView E;

    public ik6(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, View view2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
        this.D = view2;
        this.E = textView3;
    }
}
