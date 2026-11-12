package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.sliding.BodyIndexSlidingView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h68 extends ViewDataBinding {
    public final ImageView A;
    public final RelativeLayout B;
    public final TextView C;
    public final TextView D;
    public final BodyIndexSlidingView E;

    public h68(Object obj, View view, int i, ImageView imageView, RelativeLayout relativeLayout, TextView textView, TextView textView2, BodyIndexSlidingView bodyIndexSlidingView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = relativeLayout;
        this.C = textView;
        this.D = textView2;
        this.E = bodyIndexSlidingView;
    }
}
