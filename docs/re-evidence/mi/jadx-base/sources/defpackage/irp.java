package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.trail.widget.TimePercentView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class irp extends ViewDataBinding {
    public final TextView A;
    public final Group B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TimePercentView G;

    public irp(Object obj, View view, int i, TextView textView, Group group, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TimePercentView timePercentView) {
        super(obj, view, i);
        this.A = textView;
        this.B = group;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = textView5;
        this.G = timePercentView;
    }

    public static irp A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static irp B0(View view, Object obj) {
        return (irp) ViewDataBinding.k(obj, view, ivi.G2);
    }
}
