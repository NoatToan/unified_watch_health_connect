package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.CardImageView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lpg extends ViewDataBinding {
    public final CardImageView A;
    public final DeviceImageView B;
    public final ProgressBar C;
    public final TextView D;
    public final RelativeLayout E;

    public lpg(Object obj, View view, int i, CardImageView cardImageView, DeviceImageView deviceImageView, ProgressBar progressBar, TextView textView, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.A = cardImageView;
        this.B = deviceImageView;
        this.C = progressBar;
        this.D = textView;
        this.E = relativeLayout;
    }
}
