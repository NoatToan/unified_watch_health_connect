package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jpg extends ViewDataBinding {
    public final InnerCardImageView A;
    public final DeviceImageView B;
    public final RelativeLayout C;
    public final TextView D;

    public jpg(Object obj, View view, int i, InnerCardImageView innerCardImageView, DeviceImageView deviceImageView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.A = innerCardImageView;
        this.B = deviceImageView;
        this.C = relativeLayout;
        this.D = textView;
    }
}
