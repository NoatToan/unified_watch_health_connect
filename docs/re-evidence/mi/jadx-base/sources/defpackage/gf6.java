package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.DeviceImageView;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class gf6 extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final RelativeLayout C;
    public final DeviceImageView D;
    public final VibrateModeProgressBar E;
    public final NestedScrollView F;
    public final TextView G;
    public final Button H;
    public final RelativeLayout I;
    public final ImageView J;
    public final Button K;

    public gf6(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, RelativeLayout relativeLayout, DeviceImageView deviceImageView, VibrateModeProgressBar vibrateModeProgressBar, NestedScrollView nestedScrollView, TextView textView2, Button button, RelativeLayout relativeLayout2, ImageView imageView, Button button2) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = relativeLayout;
        this.D = deviceImageView;
        this.E = vibrateModeProgressBar;
        this.F = nestedScrollView;
        this.G = textView2;
        this.H = button;
        this.I = relativeLayout2;
        this.J = imageView;
        this.K = button2;
    }
}
