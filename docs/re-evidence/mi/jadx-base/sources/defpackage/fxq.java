package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.share.view.TraceAMapDistanceView;
import com.xiaomi.fitness.share.view.TrackLineView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fxq extends ViewDataBinding {
    public final TextView A;
    public final TraceAMapDistanceView B;
    public final ImageView C;
    public final ConstraintLayout D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final ConstraintLayout H;
    public final TextView I;
    public final ConstraintLayout J;
    public final nxq K;
    public final TrackLineView L;

    public fxq(Object obj, View view, int i, TextView textView, TraceAMapDistanceView traceAMapDistanceView, ImageView imageView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout2, TextView textView5, ConstraintLayout constraintLayout3, nxq nxqVar, TrackLineView trackLineView) {
        super(obj, view, i);
        this.A = textView;
        this.B = traceAMapDistanceView;
        this.C = imageView;
        this.D = constraintLayout;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
        this.H = constraintLayout2;
        this.I = textView5;
        this.J = constraintLayout3;
        this.K = nxqVar;
        this.L = trackLineView;
    }

    public static fxq A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static fxq B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (fxq) ViewDataBinding.G(layoutInflater, ivi.R2, viewGroup, z, obj);
    }
}
