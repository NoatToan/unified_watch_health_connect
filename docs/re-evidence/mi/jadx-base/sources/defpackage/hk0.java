package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class hk0 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final Button C;

    public hk0(Object obj, View view, int i, ImageView imageView, TextView textView, Button button) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = button;
    }
}
