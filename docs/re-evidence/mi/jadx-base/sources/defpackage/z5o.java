package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class z5o extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final ConstraintLayout D;
    public final ImageView E;
    public final TextView F;
    public final DividerView G;
    public String H;

    public z5o(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, ConstraintLayout constraintLayout, ImageView imageView2, TextView textView3, DividerView dividerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
        this.D = constraintLayout;
        this.E = imageView2;
        this.F = textView3;
        this.G = dividerView;
    }
}
