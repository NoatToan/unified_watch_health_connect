package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class oy extends ViewDataBinding {
    public final View A;
    public final SwitchButtonBindingSingleLineTextView B;
    public final ImageView C;
    public final LinearLayout D;
    public final RelativeLayout E;
    public final NestedScrollView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;

    public oy(Object obj, View view, int i, View view2, SwitchButtonBindingSingleLineTextView switchButtonBindingSingleLineTextView, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = view2;
        this.B = switchButtonBindingSingleLineTextView;
        this.C = imageView;
        this.D = linearLayout;
        this.E = relativeLayout;
        this.F = nestedScrollView;
        this.G = textView;
        this.H = textView2;
        this.I = textView3;
    }
}
