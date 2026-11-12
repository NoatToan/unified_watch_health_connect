package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.threetarget.view.ShareAccountInfoView;
import com.xiaomi.fitness.widget.SingleLineMarqueeableTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vnb extends ViewDataBinding {
    public final ShareAccountInfoView A;
    public final FrameLayout B;
    public final ConstraintLayout C;
    public final View D;
    public final LinearLayout E;
    public final TextView F;
    public final ImageView G;
    public final ImageView H;
    public final TextView I;
    public final ImageView J;
    public final ConstraintLayout K;
    public final View L;
    public final SingleLineMarqueeableTextView M;
    public final View N;
    public final TextView O;
    public final TextView P;

    public vnb(Object obj, View view, int i, ShareAccountInfoView shareAccountInfoView, FrameLayout frameLayout, ConstraintLayout constraintLayout, View view2, LinearLayout linearLayout, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, ImageView imageView3, ConstraintLayout constraintLayout2, View view3, SingleLineMarqueeableTextView singleLineMarqueeableTextView, View view4, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = shareAccountInfoView;
        this.B = frameLayout;
        this.C = constraintLayout;
        this.D = view2;
        this.E = linearLayout;
        this.F = textView;
        this.G = imageView;
        this.H = imageView2;
        this.I = textView2;
        this.J = imageView3;
        this.K = constraintLayout2;
        this.L = view3;
        this.M = singleLineMarqueeableTextView;
        this.N = view4;
        this.O = textView3;
        this.P = textView4;
    }
}
