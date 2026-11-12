package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mpn extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;

    public mpn(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
        this.D = textView3;
    }
}
