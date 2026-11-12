package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class dj0 extends ViewDataBinding {
    public final ImageView A;
    public final LinearLayout B;
    public final NestedScrollView C;
    public final RightArrowBindingSingleLineTextView D;
    public final TextView E;
    public final RightArrowBindingSingleLineTextView F;
    public final RightArrowBindingSingleLineTextView G;
    public final RightArrowBindingSingleLineTextView H;
    public final RightArrowBindingSingleLineTextView I;
    public final RightArrowBindingSingleLineTextView J;
    public View.OnClickListener K;

    public dj0(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, NestedScrollView nestedScrollView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, TextView textView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView2, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView3, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView4, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView5, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView6) {
        super(obj, view, i);
        this.A = imageView;
        this.B = linearLayout;
        this.C = nestedScrollView;
        this.D = rightArrowBindingSingleLineTextView;
        this.E = textView;
        this.F = rightArrowBindingSingleLineTextView2;
        this.G = rightArrowBindingSingleLineTextView3;
        this.H = rightArrowBindingSingleLineTextView4;
        this.I = rightArrowBindingSingleLineTextView5;
        this.J = rightArrowBindingSingleLineTextView6;
    }

    public abstract void setOnClick(View.OnClickListener onClickListener);
}
