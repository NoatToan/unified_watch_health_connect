package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jng extends ViewDataBinding {
    public final ImageView A;
    public final FrameLayout B;
    public final RelativeLayout C;
    public final DeviceImageView D;
    public final RelativeLayout E;
    public final TextView F;
    public final ProgressBar G;
    public final TextView H;
    public final TextView I;
    public final FrameLayout J;

    public jng(Object obj, View view, int i, ImageView imageView, FrameLayout frameLayout, RelativeLayout relativeLayout, DeviceImageView deviceImageView, RelativeLayout relativeLayout2, TextView textView, ProgressBar progressBar, TextView textView2, TextView textView3, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = frameLayout;
        this.C = relativeLayout;
        this.D = deviceImageView;
        this.E = relativeLayout2;
        this.F = textView;
        this.G = progressBar;
        this.H = textView2;
        this.I = textView3;
        this.J = frameLayout2;
    }
}
