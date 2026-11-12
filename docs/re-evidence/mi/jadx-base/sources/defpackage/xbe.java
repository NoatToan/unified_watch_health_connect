package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.interfere.widget.ProgressCircle;

/* JADX INFO: loaded from: classes9.dex */
public abstract class xbe extends ViewDataBinding {
    public final ImageView A;
    public final ProgressCircle B;
    public final FrameLayout C;
    public final TextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final LinearLayout G;

    public xbe(Object obj, View view, int i, ImageView imageView, ProgressCircle progressCircle, FrameLayout frameLayout, TextView textView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = imageView;
        this.B = progressCircle;
        this.C = frameLayout;
        this.D = textView;
        this.E = appCompatTextView;
        this.F = appCompatTextView2;
        this.G = linearLayout;
    }
}
