package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class lk0 extends ViewDataBinding {
    public final Button A;
    public final TextView B;
    public final ImageView C;

    public lk0(Object obj, View view, int i, Button button, TextView textView, ImageView imageView) {
        super(obj, view, i);
        this.A = button;
        this.B = textView;
        this.C = imageView;
    }
}
