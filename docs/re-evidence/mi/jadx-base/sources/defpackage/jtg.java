package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jtg extends ViewDataBinding {
    public final Button A;
    public final Button B;
    public final ProgressBar C;
    public final Button D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final DeviceImageView H;
    public final FrameLayout I;

    public jtg(Object obj, View view, int i, Button button, Button button2, ProgressBar progressBar, Button button3, TextView textView, ImageView imageView, TextView textView2, DeviceImageView deviceImageView, FrameLayout frameLayout) {
        super(obj, view, i);
        this.A = button;
        this.B = button2;
        this.C = progressBar;
        this.D = button3;
        this.E = textView;
        this.F = imageView;
        this.G = textView2;
        this.H = deviceImageView;
        this.I = frameLayout;
    }
}
