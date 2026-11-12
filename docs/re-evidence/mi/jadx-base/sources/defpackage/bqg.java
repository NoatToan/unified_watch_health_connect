package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bqg extends ViewDataBinding {
    public final InnerCardImageView A;
    public final CheckBox B;
    public final DeviceImageView C;
    public final RelativeLayout D;
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;

    public bqg(Object obj, View view, int i, InnerCardImageView innerCardImageView, CheckBox checkBox, DeviceImageView deviceImageView, RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = innerCardImageView;
        this.B = checkBox;
        this.C = deviceImageView;
        this.D = relativeLayout;
        this.E = linearLayout;
        this.F = textView;
        this.G = textView2;
    }
}
