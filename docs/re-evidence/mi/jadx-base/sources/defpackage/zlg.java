package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zlg extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final DeviceImageView C;
    public final ProgressBar D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final FrameLayout H;

    public zlg(Object obj, View view, int i, TextView textView, TextView textView2, DeviceImageView deviceImageView, ProgressBar progressBar, TextView textView3, ImageView imageView, TextView textView4, FrameLayout frameLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = deviceImageView;
        this.D = progressBar;
        this.E = textView3;
        this.F = imageView;
        this.G = textView4;
        this.H = frameLayout;
    }
}
