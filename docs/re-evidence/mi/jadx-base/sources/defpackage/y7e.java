package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class y7e extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final LinearLayout B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;

    public y7e(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = linearLayout;
        this.C = textView;
        this.D = imageView;
        this.E = textView2;
        this.F = textView3;
    }
}
