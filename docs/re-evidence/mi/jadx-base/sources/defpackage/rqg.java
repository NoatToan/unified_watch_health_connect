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
public abstract class rqg extends ViewDataBinding {
    public final ImageView A;
    public final RelativeLayout B;
    public final DeviceImageView C;
    public final RelativeLayout D;
    public final TextView E;
    public final ProgressBar F;
    public final TextView G;
    public final TextView H;
    public final FrameLayout I;

    public rqg(Object obj, View view, int i, ImageView imageView, RelativeLayout relativeLayout, DeviceImageView deviceImageView, RelativeLayout relativeLayout2, TextView textView, ProgressBar progressBar, TextView textView2, TextView textView3, FrameLayout frameLayout) {
        super(obj, view, i);
        this.A = imageView;
        this.B = relativeLayout;
        this.C = deviceImageView;
        this.D = relativeLayout2;
        this.E = textView;
        this.F = progressBar;
        this.G = textView2;
        this.H = textView3;
        this.I = frameLayout;
    }
}
