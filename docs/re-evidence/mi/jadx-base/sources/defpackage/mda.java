package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.SportFeedbackView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mda extends ViewDataBinding {
    public final FrameLayout A;
    public final FrameLayout B;
    public final FrameLayout C;
    public final FrameLayout D;
    public final FrameLayout E;
    public final FrameLayout F;
    public final SportFeedbackView G;
    public final LinearLayout H;
    public final FrameLayout I;
    public final TextView J;

    public mda(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, FrameLayout frameLayout6, SportFeedbackView sportFeedbackView, LinearLayout linearLayout, FrameLayout frameLayout7, TextView textView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = frameLayout2;
        this.C = frameLayout3;
        this.D = frameLayout4;
        this.E = frameLayout5;
        this.F = frameLayout6;
        this.G = sportFeedbackView;
        this.H = linearLayout;
        this.I = frameLayout7;
        this.J = textView;
    }
}
