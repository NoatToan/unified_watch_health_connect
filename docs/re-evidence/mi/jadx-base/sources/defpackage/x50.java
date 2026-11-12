package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes7.dex */
public abstract class x50 extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final TextView C;
    public final ImageView D;
    public final LinearLayout E;

    public x50(Object obj, View view, int i, TextView textView, View view2, TextView textView2, ImageView imageView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
        this.C = textView2;
        this.D = imageView;
        this.E = linearLayout;
    }
}
