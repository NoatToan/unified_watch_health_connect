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
public abstract class png extends ViewDataBinding {
    public final RelativeLayout A;
    public final ImageView B;
    public final TextView C;
    public final DeviceImageView D;
    public final TextView E;
    public final RelativeLayout F;
    public final ProgressBar G;
    public final TextView H;
    public final RelativeLayout I;
    public final FrameLayout J;

    public png(Object obj, View view, int i, RelativeLayout relativeLayout, ImageView imageView, TextView textView, DeviceImageView deviceImageView, TextView textView2, RelativeLayout relativeLayout2, ProgressBar progressBar, TextView textView3, RelativeLayout relativeLayout3, FrameLayout frameLayout) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = imageView;
        this.C = textView;
        this.D = deviceImageView;
        this.E = textView2;
        this.F = relativeLayout2;
        this.G = progressBar;
        this.H = textView3;
        this.I = relativeLayout3;
        this.J = frameLayout;
    }
}
