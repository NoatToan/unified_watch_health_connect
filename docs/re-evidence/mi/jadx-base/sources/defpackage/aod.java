package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.interfere.widget.ProgressCircle;

/* JADX INFO: loaded from: classes9.dex */
public abstract class aod extends ViewDataBinding {
    public final ImageView A;
    public final View B;
    public final TextView C;
    public final ProgressCircle D;
    public final TextView E;
    public final View F;

    public aod(Object obj, View view, int i, ImageView imageView, View view2, TextView textView, ProgressCircle progressCircle, TextView textView2, View view3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = view2;
        this.C = textView;
        this.D = progressCircle;
        this.E = textView2;
        this.F = view3;
    }

    public static aod A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static aod B0(LayoutInflater layoutInflater, Object obj) {
        return (aod) ViewDataBinding.G(layoutInflater, jui.l6, null, false, obj);
    }
}
