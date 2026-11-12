package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dqg extends ViewDataBinding {
    public final TextView A;
    public final RelativeLayout B;
    public final InnerCardImageView C;
    public final TextView D;
    public final DeviceImageView E;
    public final TextView F;
    public final RelativeLayout G;
    public final CheckBox H;
    public final LinearLayout I;
    public final RelativeLayout J;
    public final ProgressBar K;
    public final TextView L;
    public final TextView M;
    public final FrameLayout N;

    public dqg(Object obj, View view, int i, TextView textView, RelativeLayout relativeLayout, InnerCardImageView innerCardImageView, TextView textView2, DeviceImageView deviceImageView, TextView textView3, RelativeLayout relativeLayout2, CheckBox checkBox, LinearLayout linearLayout, RelativeLayout relativeLayout3, ProgressBar progressBar, TextView textView4, TextView textView5, FrameLayout frameLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = relativeLayout;
        this.C = innerCardImageView;
        this.D = textView2;
        this.E = deviceImageView;
        this.F = textView3;
        this.G = relativeLayout2;
        this.H = checkBox;
        this.I = linearLayout;
        this.J = relativeLayout3;
        this.K = progressBar;
        this.L = textView4;
        this.M = textView5;
        this.N = frameLayout;
    }
}
