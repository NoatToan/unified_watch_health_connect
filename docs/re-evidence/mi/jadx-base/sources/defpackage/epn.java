package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel;
import com.xiaomi.fitness.widget.button.SwitchButton;

/* JADX INFO: loaded from: classes10.dex */
public abstract class epn extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final CheckBox D;
    public final SwitchButton E;
    public final SwitchButton F;
    public final CheckBox G;
    public final TextView H;
    public JustDanceControlViewModel I;

    public epn(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, CheckBox checkBox, SwitchButton switchButton, SwitchButton switchButton2, CheckBox checkBox2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
        this.D = checkBox;
        this.E = switchButton;
        this.F = switchButton2;
        this.G = checkBox2;
        this.H = textView3;
    }

    public static epn A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static epn B0(LayoutInflater layoutInflater, Object obj) {
        return (epn) ViewDataBinding.G(layoutInflater, dvi.x0, null, false, obj);
    }
}
