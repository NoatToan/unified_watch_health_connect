package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class hog extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;

    public hog(Object obj, View view, int i, TextView textView, ImageView imageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
    }
}
