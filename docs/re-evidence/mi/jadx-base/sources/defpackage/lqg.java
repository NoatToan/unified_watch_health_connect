package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lqg extends ViewDataBinding {
    public final TextView A;
    public final RelativeLayout B;
    public final DeviceImageView C;
    public final Button D;
    public final TextView E;
    public final ImageView F;

    public lqg(Object obj, View view, int i, TextView textView, RelativeLayout relativeLayout, DeviceImageView deviceImageView, Button button, TextView textView2, ImageView imageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = relativeLayout;
        this.C = deviceImageView;
        this.D = button;
        this.E = textView2;
        this.F = imageView;
    }
}
