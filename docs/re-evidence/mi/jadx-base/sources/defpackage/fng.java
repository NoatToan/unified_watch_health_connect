package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fng extends ViewDataBinding {
    public final InnerCardImageView A;
    public final DeviceImageView B;
    public final TextView C;
    public final RelativeLayout D;
    public final TextView E;
    public final TextView F;
    public final RelativeLayout G;
    public final RelativeLayout H;
    public final RelativeLayout I;
    public final TextView J;
    public final TextView K;
    public final View L;

    public fng(Object obj, View view, int i, InnerCardImageView innerCardImageView, DeviceImageView deviceImageView, TextView textView, RelativeLayout relativeLayout, TextView textView2, TextView textView3, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextView textView4, TextView textView5, View view2) {
        super(obj, view, i);
        this.A = innerCardImageView;
        this.B = deviceImageView;
        this.C = textView;
        this.D = relativeLayout;
        this.E = textView2;
        this.F = textView3;
        this.G = relativeLayout2;
        this.H = relativeLayout3;
        this.I = relativeLayout4;
        this.J = textView4;
        this.K = textView5;
        this.L = view2;
    }
}
