package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class w6c extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;

    public w6c(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = textView2;
    }
}
