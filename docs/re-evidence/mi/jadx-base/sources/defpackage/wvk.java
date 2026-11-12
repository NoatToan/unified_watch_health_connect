package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wvk extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;

    public wvk(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
    }
}
