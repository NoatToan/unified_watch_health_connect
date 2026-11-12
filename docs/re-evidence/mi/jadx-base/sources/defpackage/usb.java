package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class usb extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;

    public usb(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
    }
}
