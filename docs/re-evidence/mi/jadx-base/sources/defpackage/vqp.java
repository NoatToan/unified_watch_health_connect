package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vqp extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final TextView C;

    public vqp(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = textView;
    }
}
