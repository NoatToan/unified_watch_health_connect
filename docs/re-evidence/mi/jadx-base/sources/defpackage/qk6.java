package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qk6 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;

    public qk6(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
    }
}
