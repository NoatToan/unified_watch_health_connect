package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kra extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;

    public kra(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = textView2;
        this.D = imageView2;
        this.E = textView3;
    }
}
