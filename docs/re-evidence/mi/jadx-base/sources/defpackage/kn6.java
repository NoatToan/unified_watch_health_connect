package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class kn6 extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final TextView C;
    public final ImageView D;

    public kn6(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, ImageView imageView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = textView;
        this.D = imageView3;
    }
}
