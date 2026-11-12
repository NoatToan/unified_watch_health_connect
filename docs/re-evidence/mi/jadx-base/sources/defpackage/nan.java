package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.dialog.CustomCircleProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nan extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final TextView C;
    public final ProgressBar D;
    public final CustomCircleProgressBar E;
    public final ProgressBar F;
    public final TextView G;

    public nan(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, TextView textView2, ProgressBar progressBar, CustomCircleProgressBar customCircleProgressBar, ProgressBar progressBar2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = textView2;
        this.D = progressBar;
        this.E = customCircleProgressBar;
        this.F = progressBar2;
        this.G = textView3;
    }
}
