package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fog extends ViewDataBinding {
    public final InnerCardImageView A;
    public final DeviceImageView B;
    public final TextView C;
    public final RelativeLayout D;
    public final TextView E;

    public fog(Object obj, View view, int i, InnerCardImageView innerCardImageView, DeviceImageView deviceImageView, TextView textView, RelativeLayout relativeLayout, TextView textView2) {
        super(obj, view, i);
        this.A = innerCardImageView;
        this.B = deviceImageView;
        this.C = textView;
        this.D = relativeLayout;
        this.E = textView2;
    }
}
