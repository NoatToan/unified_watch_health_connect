package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n30 extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final LinearLayout D;
    public final TextView E;
    public final DividerView F;
    public final LinearLayout G;

    public n30(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, LinearLayout linearLayout, TextView textView3, DividerView dividerView, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
        this.D = linearLayout;
        this.E = textView3;
        this.F = dividerView;
        this.G = linearLayout2;
    }
}
