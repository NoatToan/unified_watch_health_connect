package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vog extends ViewDataBinding {
    public final View A;
    public final TextView B;
    public final TextView C;
    public final DeviceImageView D;
    public final LinearLayout E;
    public final TextView F;
    public final RelativeLayout G;
    public final RelativeLayout H;
    public final ImageView I;

    public vog(Object obj, View view, int i, View view2, TextView textView, TextView textView2, DeviceImageView deviceImageView, LinearLayout linearLayout, TextView textView3, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView) {
        super(obj, view, i);
        this.A = view2;
        this.B = textView;
        this.C = textView2;
        this.D = deviceImageView;
        this.E = linearLayout;
        this.F = textView3;
        this.G = relativeLayout;
        this.H = relativeLayout2;
        this.I = imageView;
    }
}
