package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class log extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final DeviceImageView D;
    public final TextView E;
    public final ProgressBar F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final FrameLayout J;

    public log(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, DeviceImageView deviceImageView, TextView textView4, ProgressBar progressBar, TextView textView5, TextView textView6, TextView textView7, FrameLayout frameLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = deviceImageView;
        this.E = textView4;
        this.F = progressBar;
        this.G = textView5;
        this.H = textView6;
        this.I = textView7;
        this.J = frameLayout;
    }
}
