package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ind extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    public ind(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
    }
}
