package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pqg extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final ConstraintLayout C;
    public final TextView D;
    public final InnerCardImageView E;
    public final TextView F;
    public final TextView G;
    public final DeviceImageView H;
    public final FrameLayout I;
    public final LinearLayout J;
    public final View K;
    public final ConstraintLayout L;
    public final TextView M;
    public final TextView N;

    public pqg(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout, TextView textView2, InnerCardImageView innerCardImageView, TextView textView3, TextView textView4, DeviceImageView deviceImageView, FrameLayout frameLayout, LinearLayout linearLayout2, View view2, ConstraintLayout constraintLayout2, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = constraintLayout;
        this.D = textView2;
        this.E = innerCardImageView;
        this.F = textView3;
        this.G = textView4;
        this.H = deviceImageView;
        this.I = frameLayout;
        this.J = linearLayout2;
        this.K = view2;
        this.L = constraintLayout2;
        this.M = textView5;
        this.N = textView6;
    }
}
